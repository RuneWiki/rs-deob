import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class49 {

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "[Lg;")
    private class254[] field756 = new class254[10];

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    private int field755;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    private int field757;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lmh;II)Ldl;", line = 7)
    public static final class49 method347(class65 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method454(arg1, 0, arg2);
        return var3 == null ? null : new class49(new class112(var3));
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "()I", line = 17)
    public final int method348() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field756[var2] != null && this.field756[var2].field4083 / 20 < var1) {
                var1 = this.field756[var2].field4083 / 20;
            }
        }
        if (this.field755 < this.field757 && this.field755 / 20 < var1) {
            var1 = this.field755 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field756[var3] != null) {
                this.field756[var3].field4083 -= var1 * 20;
            }
        }
        if (this.field755 < this.field757) {
            this.field755 -= var1 * 20;
            this.field757 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Llb;)V", line = 69)
    private class49(class112 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method792(2);
            if (var3 != 0) {
                arg0.field1640--;
                this.field756[var2] = new class254();
                this.field756[var2].method1808(arg0);
            }
        }
        this.field755 = arg0.method759((byte) -103);
        this.field757 = arg0.method759((byte) -74);
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V", line = 148)
    private class49() {
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "()Lgi;", line = 66)
    public final class291 method349() {
        byte[] var1 = this.method350();
        return new class291(22050, var1, this.field755 * 22050 / 1000, this.field757 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "()[B", line = 91)
    private final byte[] method350() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field756[var2] != null && this.field756[var2].field4083 + this.field756[var2].field4070 > var1) {
                var1 = this.field756[var2].field4083 + this.field756[var2].field4070;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field756[var5] != null) {
                int var6 = this.field756[var5].field4070 * 22050 / 1000;
                int var7 = this.field756[var5].field4083 * 22050 / 1000;
                int[] var8 = this.field756[var5].method1810(var6, this.field756[var5].field4070);
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = (var8[var9] >> 8) + var4[var7 + var9];
                    if ((var10 + 128 & 0xFFFFFF00) != 0) {
                        var10 = var10 >> 31 ^ 0x7F;
                    }
                    var4[var7 + var9] = (byte) var10;
                }
            }
        }
        return var4;
    }
}
