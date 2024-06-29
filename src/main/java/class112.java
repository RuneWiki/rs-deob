import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class112 {

    @OriginalMember(owner = "client!md", name = "b", descriptor = "[Lac;")
    private class4[] field2302 = new class4[10];

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    private int field2301;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    private int field2303;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "()[B")
    private final byte[] method889() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2302[var2] != null && this.field2302[var2].field57 + this.field2302[var2].field54 > var1) {
                var1 = this.field2302[var2].field57 + this.field2302[var2].field54;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2302[var5] != null) {
                int var6 = this.field2302[var5].field54 * 22050 / 1000;
                int var7 = this.field2302[var5].field57 * 22050 / 1000;
                int[] var8 = this.field2302[var5].method21(var6, this.field2302[var5].field54);
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

    @OriginalMember(owner = "client!md", name = "b", descriptor = "()I")
    public final int method890() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2302[var2] != null && this.field2302[var2].field57 / 20 < var1) {
                var1 = this.field2302[var2].field57 / 20;
            }
        }
        if (this.field2301 < this.field2303 && this.field2301 / 20 < var1) {
            var1 = this.field2301 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2302[var3] != null) {
                this.field2302[var3].field57 -= var1 * 20;
            }
        }
        if (this.field2301 < this.field2303) {
            this.field2301 -= var1 * 20;
            this.field2303 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lah;II)Lmd;")
    public static final class112 method891(class9 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method67(arg1, -1, arg2);
        return var3 == null ? null : new class112(new class68(var3));
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lhd;)V")
    private class112(class68 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method604((byte) -127);
            if (var3 != 0) {
                arg0.field1454--;
                this.field2302[var2] = new class4();
                this.field2302[var2].method20(arg0);
            }
        }
        this.field2301 = arg0.method569(26496);
        this.field2303 = arg0.method569(26496);
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "()Lle;")
    public final class104 method892() {
        byte[] var1 = this.method889();
        return new class104(22050, var1, this.field2301 * 22050 / 1000, this.field2303 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V")
    private class112() {
    }
}
