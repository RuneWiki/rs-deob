import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class197 {

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "[Lvg;")
    private class34[] field3286 = new class34[10];

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    private int field3285;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    private int field3284;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "()Lqd;", line = 4)
    public final class182 method1385() {
        byte[] var1 = this.method1387();
        return new class182(22050, var1, this.field3285 * 22050 / 1000, this.field3284 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "()I", line = 15)
    public final int method1386() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3286[var2] != null && this.field3286[var2].field561 / 20 < var1) {
                var1 = this.field3286[var2].field561 / 20;
            }
        }
        if (this.field3285 < this.field3284 && this.field3285 / 20 < var1) {
            var1 = this.field3285 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field3286[var3] != null) {
                this.field3286[var3].field561 -= var1 * 20;
            }
        }
        if (this.field3285 < this.field3284) {
            this.field3285 -= var1 * 20;
            this.field3284 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "()[B", line = 58)
    private final byte[] method1387() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3286[var2] != null && this.field3286[var2].field561 + this.field3286[var2].field558 > var1) {
                var1 = this.field3286[var2].field561 + this.field3286[var2].field558;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field3286[var5] != null) {
                int var6 = this.field3286[var5].field558 * 22050 / 1000;
                int var7 = this.field3286[var5].field561 * 22050 / 1000;
                int[] var8 = this.field3286[var5].method283(var6, this.field3286[var5].field558);
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

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lsi;II)Lbb;", line = 118)
    public static final class197 method1388(class66 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method523(-58, arg2, arg1);
        return var3 == null ? null : new class197(new class164(var3));
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lhb;)V", line = 128)
    private class197(class164 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1178(8);
            if (var3 != 0) {
                arg0.field2670--;
                this.field3286[var2] = new class34();
                this.field3286[var2].method281(arg0);
            }
        }
        this.field3285 = arg0.method1161(true);
        this.field3284 = arg0.method1161(true);
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V", line = 149)
    private class197() {
    }
}
