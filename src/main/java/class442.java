import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class442 {

    @OriginalMember(owner = "client!wda", name = "e", descriptor = "I")
    private int field6398 = class459.method2662(16);

    @OriginalMember(owner = "client!wda", name = "c", descriptor = "I")
    private int field6396 = class459.method2662(24);

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "I")
    private int field6394 = class459.method2662(24);

    @OriginalMember(owner = "client!wda", name = "d", descriptor = "I")
    private int field6397 = class459.method2662(24) + 1;

    @OriginalMember(owner = "client!wda", name = "g", descriptor = "I")
    private int field6400 = class459.method2662(6) + 1;

    @OriginalMember(owner = "client!wda", name = "f", descriptor = "I")
    private int field6399 = class459.method2662(8);

    @OriginalMember(owner = "client!wda", name = "b", descriptor = "[I")
    private int[] field6395;

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "([FIZ)V")
    public final void method2583(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class459.field6605[this.field6399].field1274;
        int var6 = this.field6394 - this.field6396;
        int var7 = var6 / this.field6397;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class459.field6605[this.field6399].method644();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field6400;
                        }
                        var11 /= this.field6400;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field6395[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field6397 * var10 + this.field6396;
                        class85 var17 = class459.field6605[var15];
                        if (this.field6398 == 0) {
                            int var18 = this.field6397 / var17.field1274;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method643();
                                for (int var21 = 0; var21 < var17.field1274; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field6397) {
                                float[] var23 = var17.method643();
                                for (int var24 = 0; var24 < var17.field1274; var24++) {
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

    @OriginalMember(owner = "client!wda", name = "<init>", descriptor = "()V")
    public class442() {
        int[] var1 = new int[this.field6400];
        for (int var2 = 0; var2 < this.field6400; var2++) {
            int var4 = 0;
            int var5 = class459.method2662(3);
            boolean var6 = class459.method2672() != 0;
            if (var6) {
                var4 = class459.method2662(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field6395 = new int[this.field6400 * 8];
        for (int var3 = 0; var3 < this.field6400 * 8; var3++) {
            this.field6395[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class459.method2662(8);
        }
    }
}
