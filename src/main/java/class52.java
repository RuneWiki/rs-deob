import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public class class52 {

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "[Lga;")
    private class335[] field517 = new class335[10];

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "I")
    private int field515;

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "I")
    private int field516;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "()I", line = 6)
    public final int method267() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field517[var2] != null && this.field517[var2].field4215 / 20 < var1) {
                var1 = this.field517[var2].field4215 / 20;
            }
        }
        if (this.field515 < this.field516 && this.field515 / 20 < var1) {
            var1 = this.field515 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field517[var3] != null) {
                this.field517[var3].field4215 -= var1 * 20;
            }
        }
        if (this.field515 < this.field516) {
            this.field515 -= var1 * 20;
            this.field516 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(Ltf;II)Lcaa;", line = 54)
    public static final class52 method268(class701 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3854((byte) 41, arg1, arg2);
        return var3 == null ? null : new class52(new class115(var3));
    }

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "()[B", line = 62)
    private final byte[] method269() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field517[var2] != null && this.field517[var2].field4215 + this.field517[var2].field4205 > var1) {
                var1 = this.field517[var2].field4215 + this.field517[var2].field4205;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field517[var5] != null) {
                int var6 = this.field517[var5].field4205 * 22050 / 1000;
                int var7 = this.field517[var5].field4215 * 22050 / 1000;
                int[] var8 = this.field517[var5].method1930(var6, this.field517[var5].field4205);
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

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "()Lug;", line = 123)
    public final class450 method270() {
        byte[] var1 = this.method269();
        return new class450(22050, var1, this.field515 * 22050 / 1000, this.field516 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(Lnp;)V", line = 129)
    private class52(class115 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method620((byte) 28);
            if (var3 != 0) {
                arg0.field1218--;
                this.field517[var2] = new class335();
                this.field517[var2].method1932(arg0);
            }
        }
        this.field515 = arg0.method643((byte) -77);
        this.field516 = arg0.method643((byte) -77);
    }

    @OriginalMember(owner = "client!caa", name = "<init>", descriptor = "()V", line = 149)
    private class52() {
    }
}
