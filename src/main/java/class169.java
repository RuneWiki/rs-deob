import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class169 {

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    private int field2531 = class527.method3121(16);

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    private int field2528 = class527.method3121(24);

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    private int field2529 = class527.method3121(24);

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    private int field2526 = class527.method3121(24) + 1;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    private int field2527 = class527.method3121(6) + 1;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    private int field2530 = class527.method3121(8);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "[I")
    private int[] field2525;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([FIZ)V")
    public final void method1205(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class527.field7688[this.field2530].field4091;
        int var6 = this.field2529 - this.field2528;
        int var7 = var6 / this.field2526;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class527.field7688[this.field2530].method1760();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field2527;
                        }
                        var11 /= this.field2527;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field2525[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2526 * var10 + this.field2528;
                        class273 var17 = class527.field7688[var15];
                        if (this.field2531 == 0) {
                            int var18 = this.field2526 / var17.field4091;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1759();
                                for (int var21 = 0; var21 < var17.field4091; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2526) {
                                float[] var23 = var17.method1759();
                                for (int var24 = 0; var24 < var17.field4091; var24++) {
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

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
    public class169() {
        int[] var1 = new int[this.field2527];
        for (int var2 = 0; var2 < this.field2527; var2++) {
            int var4 = 0;
            int var5 = class527.method3121(3);
            boolean var6 = class527.method3130() != 0;
            if (var6) {
                var4 = class527.method3121(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field2525 = new int[this.field2527 * 8];
        for (int var3 = 0; var3 < this.field2527 * 8; var3++) {
            this.field2525[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class527.method3121(8);
        }
    }
}
