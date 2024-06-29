import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class557 {

    @OriginalMember(owner = "client!iba", name = "e", descriptor = "I")
    private int field8122 = class306.method2635(16);

    @OriginalMember(owner = "client!iba", name = "g", descriptor = "I")
    private int field8123 = class306.method2635(24);

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "I")
    private int field8120 = class306.method2635(24);

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "I")
    private int field8125 = class306.method2635(24) + 1;

    @OriginalMember(owner = "client!iba", name = "f", descriptor = "I")
    private int field8126 = class306.method2635(6) + 1;

    @OriginalMember(owner = "client!iba", name = "d", descriptor = "I")
    private int field8121 = class306.method2635(8);

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "[I")
    private int[] field8124;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "([FIZ)V")
    public final void method4111(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class306.field4954[this.field8121].field3882;
        int var6 = this.field8120 - this.field8123;
        int var7 = var6 / this.field8125;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class306.field4954[this.field8121].method2158();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field8126;
                        }
                        var11 /= this.field8126;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field8124[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field8125 * var10 + this.field8123;
                        class255 var17 = class306.field4954[var15];
                        if (this.field8122 == 0) {
                            int var18 = this.field8125 / var17.field3882;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2157();
                                for (int var21 = 0; var21 < var17.field3882; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field8125) {
                                float[] var23 = var17.method2157();
                                for (int var24 = 0; var24 < var17.field3882; var24++) {
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

    @OriginalMember(owner = "client!iba", name = "<init>", descriptor = "()V")
    public class557() {
        int[] var1 = new int[this.field8126];
        for (int var2 = 0; var2 < this.field8126; var2++) {
            int var4 = 0;
            int var5 = class306.method2635(3);
            boolean var6 = class306.method2634() != 0;
            if (var6) {
                var4 = class306.method2635(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field8124 = new int[this.field8126 * 8];
        for (int var3 = 0; var3 < this.field8126 * 8; var3++) {
            this.field8124[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class306.method2635(8);
        }
    }
}
