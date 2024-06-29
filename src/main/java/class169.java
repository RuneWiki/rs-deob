import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class169 {

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    private int field3018 = class74.method524(16);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    private int field3012 = class74.method524(24);

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    private int field3016 = class74.method524(24);

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    private int field3015 = class74.method524(24) + 1;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    private int field3017 = class74.method524(6) + 1;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    private int field3013 = class74.method524(8);

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "[I")
    private int[] field3014;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([FIZ)V")
    public final void method1158(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class74.field1479[this.field3013].field300;
        int var6 = this.field3016 - this.field3012;
        int var7 = var6 / this.field3015;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class74.field1479[this.field3013].method102();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field3017;
                        }
                        var11 /= this.field3017;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field3014[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field3015 * var10 + this.field3012;
                        class22 var17 = class74.field1479[var15];
                        if (this.field3018 == 0) {
                            int var18 = this.field3015 / var17.field300;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method99();
                                for (int var21 = 0; var21 < var17.field300; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field3015) {
                                float[] var23 = var17.method99();
                                for (int var24 = 0; var24 < var17.field300; var24++) {
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

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V")
    public class169() {
        int[] var1 = new int[this.field3017];
        for (int var2 = 0; var2 < this.field3017; var2++) {
            int var4 = 0;
            int var5 = class74.method524(3);
            boolean var6 = class74.method530() != 0;
            if (var6) {
                var4 = class74.method524(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field3014 = new int[this.field3017 * 8];
        for (int var3 = 0; var3 < this.field3017 * 8; var3++) {
            this.field3014[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class74.method524(8);
        }
    }
}
