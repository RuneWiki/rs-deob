import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class670 {

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
    private int field9520 = class513.method2903(16);

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    private int field9521 = class513.method2903(24);

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    private int field9517 = class513.method2903(24);

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    private int field9516 = class513.method2903(24) + 1;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    private int field9515 = class513.method2903(6) + 1;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    private int field9519 = class513.method2903(8);

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "[I")
    private int[] field9518;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "([FIZ)V")
    public final void method3715(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class513.field6923[this.field9519].field2225;
        int var6 = this.field9517 - this.field9521;
        int var7 = var6 / this.field9516;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class513.field6923[this.field9519].method1172();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field9515;
                        }
                        var11 /= this.field9515;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field9518[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field9516 * var10 + this.field9521;
                        class178 var17 = class513.field6923[var15];
                        if (this.field9520 == 0) {
                            int var18 = this.field9516 / var17.field2225;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1169();
                                for (int var21 = 0; var21 < var17.field2225; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field9516) {
                                float[] var23 = var17.method1169();
                                for (int var24 = 0; var24 < var17.field2225; var24++) {
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

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V")
    public class670() {
        int[] var1 = new int[this.field9515];
        for (int var2 = 0; var2 < this.field9515; var2++) {
            int var4 = 0;
            int var5 = class513.method2903(3);
            boolean var6 = class513.method2908() != 0;
            if (var6) {
                var4 = class513.method2903(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field9518 = new int[this.field9515 * 8];
        for (int var3 = 0; var3 < this.field9515 * 8; var3++) {
            this.field9518[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class513.method2903(8);
        }
    }
}
