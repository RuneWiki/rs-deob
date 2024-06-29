import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class705 {

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    private int field9944 = class759.method4226(16);

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    private int field9941 = class759.method4226(24);

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    private int field9942 = class759.method4226(24);

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    private int field9938 = class759.method4226(24) + 1;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    private int field9939 = class759.method4226(6) + 1;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    private int field9940 = class759.method4226(8);

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "[I")
    private int[] field9943;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([FIZ)V")
    public final void method3907(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class759.field10575[this.field9940].field4056;
        int var6 = this.field9942 - this.field9941;
        int var7 = var6 / this.field9938;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class759.field10575[this.field9940].method1853();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field9939;
                        }
                        var11 /= this.field9939;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field9943[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field9938 * var10 + this.field9941;
                        class316 var17 = class759.field10575[var15];
                        if (this.field9944 == 0) {
                            int var18 = this.field9938 / var17.field4056;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1852();
                                for (int var21 = 0; var21 < var17.field4056; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field9938) {
                                float[] var23 = var17.method1852();
                                for (int var24 = 0; var24 < var17.field4056; var24++) {
                                    arg0[var16 + var22] += var23[var24];
                                    var22++;
                                }
                            }
                        }
                    }
                    var10++;
                    if (var10 >= var7) {
                        break;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
    public class705() {
        int[] var1 = new int[this.field9939];
        for (int var2 = 0; var2 < this.field9939; var2++) {
            int var4 = 0;
            int var5 = class759.method4226(3);
            boolean var6 = class759.method4220() != 0;
            if (var6) {
                var4 = class759.method4226(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field9943 = new int[this.field9939 * 8];
        for (int var3 = 0; var3 < this.field9939 * 8; var3++) {
            this.field9943[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class759.method4226(8);
        }
    }
}
