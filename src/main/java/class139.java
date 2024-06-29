import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class139 {

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    private int field2334 = class108.method690(16);

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    private int field2335 = class108.method690(24);

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    private int field2338 = class108.method690(24);

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    private int field2336 = class108.method690(24) + 1;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
    private int field2337 = class108.method690(6) + 1;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
    private int field2332 = class108.method690(8);

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "[I")
    private int[] field2333;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "([FIZ)V")
    public final void method923(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class108.field1792[this.field2332].field2714;
        int var6 = this.field2338 - this.field2335;
        int var7 = var6 / this.field2336;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class108.field1792[this.field2332].method1084();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field2337;
                        }
                        var11 /= this.field2337;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field2333[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2336 * var10 + this.field2335;
                        class160 var17 = class108.field1792[var15];
                        if (this.field2334 == 0) {
                            int var18 = this.field2336 / var17.field2714;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1081();
                                for (int var21 = 0; var21 < var17.field2714; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2336) {
                                float[] var23 = var17.method1081();
                                for (int var24 = 0; var24 < var17.field2714; var24++) {
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

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
    public class139() {
        int[] var1 = new int[this.field2337];
        for (int var2 = 0; var2 < this.field2337; var2++) {
            int var4 = 0;
            int var5 = class108.method690(3);
            boolean var6 = class108.method696() != 0;
            if (var6) {
                var4 = class108.method690(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field2333 = new int[this.field2337 * 8];
        for (int var3 = 0; var3 < this.field2337 * 8; var3++) {
            this.field2333[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class108.method690(8);
        }
    }
}
