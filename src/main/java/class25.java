import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class25 {

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    private int field438 = class132.method983(16);

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    private int field433 = class132.method983(24);

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    private int field437 = class132.method983(24);

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    private int field432 = class132.method983(24) + 1;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    private int field435 = class132.method983(6) + 1;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    private int field434 = class132.method983(8);

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "[I")
    private int[] field436;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "([FIZ)V")
    public final void method217(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class132.field1981[this.field434].field238;
        int var6 = this.field437 - this.field433;
        int var7 = var6 / this.field432;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class132.field1981[this.field434].method129();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field435;
                        }
                        var11 /= this.field435;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field436[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field432 * var10 + this.field433;
                        class17 var17 = class132.field1981[var15];
                        if (this.field438 == 0) {
                            int var18 = this.field432 / var17.field238;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method131();
                                for (int var21 = 0; var21 < var17.field238; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field432) {
                                float[] var23 = var17.method131();
                                for (int var24 = 0; var24 < var17.field238; var24++) {
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

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V")
    public class25() {
        int[] var1 = new int[this.field435];
        for (int var2 = 0; var2 < this.field435; var2++) {
            int var4 = 0;
            int var5 = class132.method983(3);
            boolean var6 = class132.method984() != 0;
            if (var6) {
                var4 = class132.method983(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field436 = new int[this.field435 * 8];
        for (int var3 = 0; var3 < this.field435 * 8; var3++) {
            this.field436[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class132.method983(8);
        }
    }
}
