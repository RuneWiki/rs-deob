import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class235 {

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
    private int field3690 = class20.method156(16);

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
    private int field3689 = class20.method156(24);

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "I")
    private int field3691 = class20.method156(24);

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    private int field3685 = class20.method156(24) + 1;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    private int field3686 = class20.method156(6) + 1;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
    private int field3688 = class20.method156(8);

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "[I")
    private int[] field3687;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "([FIZ)V")
    public final void method1620(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class20.field367[this.field3688].field3567;
        int var6 = this.field3691 - this.field3689;
        int var7 = var6 / this.field3685;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class20.field367[this.field3688].method1567();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field3686;
                        }
                        var11 /= this.field3686;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field3687[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field3685 * var10 + this.field3689;
                        class227 var17 = class20.field367[var15];
                        if (this.field3690 == 0) {
                            int var18 = this.field3685 / var17.field3567;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1568();
                                for (int var21 = 0; var21 < var17.field3567; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field3685) {
                                float[] var23 = var17.method1568();
                                for (int var24 = 0; var24 < var17.field3567; var24++) {
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

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "()V")
    public class235() {
        int[] var1 = new int[this.field3686];
        for (int var2 = 0; var2 < this.field3686; var2++) {
            int var4 = 0;
            int var5 = class20.method156(3);
            boolean var6 = class20.method160() != 0;
            if (var6) {
                var4 = class20.method156(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field3687 = new int[this.field3686 * 8];
        for (int var3 = 0; var3 < this.field3686 * 8; var3++) {
            this.field3687[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class20.method156(8);
        }
    }
}
