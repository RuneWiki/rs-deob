import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class427 {

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    private int field6354 = class170.method1145(16);

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    private int field6358 = class170.method1145(24);

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    private int field6356 = class170.method1145(24);

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    private int field6359 = class170.method1145(24) + 1;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    private int field6357 = class170.method1145(6) + 1;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    private int field6355 = class170.method1145(8);

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "[I")
    private int[] field6360;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "([FIZ)V")
    public final void method2666(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class170.field2519[this.field6355].field5741;
        int var6 = this.field6356 - this.field6358;
        int var7 = var6 / this.field6359;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class170.field2519[this.field6355].method2387();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field6357;
                        }
                        var11 /= this.field6357;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field6360[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field6359 * var10 + this.field6358;
                        class381 var17 = class170.field2519[var15];
                        if (this.field6354 == 0) {
                            int var18 = this.field6359 / var17.field5741;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2389();
                                for (int var21 = 0; var21 < var17.field5741; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field6359) {
                                float[] var23 = var17.method2389();
                                for (int var24 = 0; var24 < var17.field5741; var24++) {
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

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
    public class427() {
        int[] var1 = new int[this.field6357];
        for (int var2 = 0; var2 < this.field6357; var2++) {
            int var4 = 0;
            int var5 = class170.method1145(3);
            boolean var6 = class170.method1141() != 0;
            if (var6) {
                var4 = class170.method1145(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field6360 = new int[this.field6357 * 8];
        for (int var3 = 0; var3 < this.field6357 * 8; var3++) {
            this.field6360[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class170.method1145(8);
        }
    }
}
