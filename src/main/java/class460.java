import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class460 {

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    private int field6663 = class299.method1850(16);

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    private int field6658 = class299.method1850(24);

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    private int field6662 = class299.method1850(24);

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    private int field6661 = class299.method1850(24) + 1;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    private int field6660 = class299.method1850(6) + 1;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    private int field6659 = class299.method1850(8);

    @OriginalMember(owner = "client!td", name = "g", descriptor = "[I")
    private int[] field6664;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([FIZ)V", line = 9)
    public final void method2740(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class299.field4375[this.field6659].field7516;
        int var6 = this.field6662 - this.field6658;
        int var7 = var6 / this.field6661;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class299.field4375[this.field6659].method3026();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field6660;
                        }
                        var11 /= this.field6660;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field6664[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field6661 * var10 + this.field6658;
                        class503 var17 = class299.field4375[var15];
                        if (this.field6663 == 0) {
                            int var18 = this.field6661 / var17.field7516;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method3023();
                                for (int var21 = 0; var21 < var17.field7516; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field6661) {
                                float[] var23 = var17.method3023();
                                for (int var24 = 0; var24 < var17.field7516; var24++) {
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

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V", line = 133)
    public class460() {
        int[] var1 = new int[this.field6660];
        for (int var2 = 0; var2 < this.field6660; var2++) {
            int var4 = 0;
            int var5 = class299.method1850(3);
            boolean var6 = class299.method1844() != 0;
            if (var6) {
                var4 = class299.method1850(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field6664 = new int[this.field6660 * 8];
        for (int var3 = 0; var3 < this.field6660 * 8; var3++) {
            this.field6664[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class299.method1850(8);
        }
    }
}
