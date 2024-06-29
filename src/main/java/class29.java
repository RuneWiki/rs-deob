import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public class class29 {

    @OriginalMember(owner = "client!mga", name = "c", descriptor = "[Lsi;")
    private class689[] field277 = new class689[10];

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "I")
    private int field275;

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "I")
    private int field276;

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "()[B", line = 6)
    private final byte[] method144() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field277[var2] != null && this.field277[var2].field9770 + this.field277[var2].field9766 > var1) {
                var1 = this.field277[var2].field9770 + this.field277[var2].field9766;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field277[var5] != null) {
                int var6 = this.field277[var5].field9770 * 22050 / 1000;
                int var7 = this.field277[var5].field9766 * 22050 / 1000;
                int[] var8 = this.field277[var5].method3899(var6, this.field277[var5].field9770);
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

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "()I", line = 65)
    public final int method145() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field277[var2] != null && this.field277[var2].field9766 / 20 < var1) {
                var1 = this.field277[var2].field9766 / 20;
            }
        }
        if (this.field275 < this.field276 && this.field275 / 20 < var1) {
            var1 = this.field275 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field277[var3] != null) {
                this.field277[var3].field9766 -= var1 * 20;
            }
        }
        if (this.field275 < this.field276) {
            this.field275 -= var1 * 20;
            this.field276 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!mga", name = "c", descriptor = "()Ljda;", line = 112)
    public final class673 method146() {
        byte[] var1 = this.method144();
        return new class673(22050, var1, this.field275 * 22050 / 1000, this.field276 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(Lla;II)Lmga;", line = 118)
    public static final class29 method147(class423 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2600(0, arg1, arg2);
        return var3 == null ? null : new class29(new class479(var3));
    }

    @OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(Lsl;)V", line = 129)
    private class29(class479 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2886(true);
            if (var3 != 0) {
                arg0.field6864--;
                this.field277[var2] = new class689();
                this.field277[var2].method3898(arg0);
            }
        }
        this.field275 = arg0.method2882(-1);
        this.field276 = arg0.method2882(-1);
    }

    @OriginalMember(owner = "client!mga", name = "<init>", descriptor = "()V", line = 149)
    private class29() {
    }
}
