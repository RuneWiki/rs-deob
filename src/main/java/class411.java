import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class411 {

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    private int field6149 = class375.method2339(16);

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
    private int field6148 = class375.method2339(24);

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
    private int field6147 = class375.method2339(24);

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    private int field6152 = class375.method2339(24) + 1;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
    private int field6153 = class375.method2339(6) + 1;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    private int field6151 = class375.method2339(8);

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "[I")
    private int[] field6150;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "([FIZ)V")
    public final void method2494(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class375.field5701[this.field6151].field7479;
        int var6 = this.field6147 - this.field6148;
        int var7 = var6 / this.field6152;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class375.field5701[this.field6151].method3029();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field6153;
                        }
                        var11 /= this.field6153;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field6150[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field6152 * var10 + this.field6148;
                        class508 var17 = class375.field5701[var15];
                        if (this.field6149 == 0) {
                            int var18 = this.field6152 / var17.field7479;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method3031();
                                for (int var21 = 0; var21 < var17.field7479; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field6152) {
                                float[] var23 = var17.method3031();
                                for (int var24 = 0; var24 < var17.field7479; var24++) {
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

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V")
    public class411() {
        int[] var1 = new int[this.field6153];
        for (int var2 = 0; var2 < this.field6153; var2++) {
            int var4 = 0;
            int var5 = class375.method2339(3);
            boolean var6 = class375.method2331() != 0;
            if (var6) {
                var4 = class375.method2339(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field6150 = new int[this.field6153 * 8];
        for (int var3 = 0; var3 < this.field6153 * 8; var3++) {
            this.field6150[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class375.method2339(8);
        }
    }
}
