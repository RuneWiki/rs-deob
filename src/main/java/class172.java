import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class172 {

    @OriginalMember(owner = "client!tw", name = "f", descriptor = "I")
    private int field2482 = class433.method2573(16);

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "I")
    private int field2477 = class433.method2573(24);

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "I")
    private int field2479 = class433.method2573(24);

    @OriginalMember(owner = "client!tw", name = "d", descriptor = "I")
    private int field2480 = class433.method2573(24) + 1;

    @OriginalMember(owner = "client!tw", name = "g", descriptor = "I")
    private int field2483 = class433.method2573(6) + 1;

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "I")
    private int field2478 = class433.method2573(8);

    @OriginalMember(owner = "client!tw", name = "e", descriptor = "[I")
    private int[] field2481;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "([FIZ)V")
    public final void method1090(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class433.field6173[this.field2478].field6792;
        int var6 = this.field2479 - this.field2477;
        int var7 = var6 / this.field2480;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class433.field6173[this.field2478].method2805();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field2483;
                        }
                        var11 /= this.field2483;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field2481[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2480 * var10 + this.field2477;
                        class482 var17 = class433.field6173[var15];
                        if (this.field2482 == 0) {
                            int var18 = this.field2480 / var17.field6792;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2806();
                                for (int var21 = 0; var21 < var17.field6792; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2480) {
                                float[] var23 = var17.method2806();
                                for (int var24 = 0; var24 < var17.field6792; var24++) {
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

    @OriginalMember(owner = "client!tw", name = "<init>", descriptor = "()V")
    public class172() {
        int[] var1 = new int[this.field2483];
        for (int var2 = 0; var2 < this.field2483; var2++) {
            int var4 = 0;
            int var5 = class433.method2573(3);
            boolean var6 = class433.method2577() != 0;
            if (var6) {
                var4 = class433.method2573(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field2481 = new int[this.field2483 * 8];
        for (int var3 = 0; var3 < this.field2483 * 8; var3++) {
            this.field2481[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class433.method2573(8);
        }
    }
}
