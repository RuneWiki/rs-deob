import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class119 {

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    private int field2742 = class156.method1196(16);

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    private int field2744 = class156.method1196(24);

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    private int field2745 = class156.method1196(24);

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    private int field2747 = class156.method1196(24) + 1;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    private int field2746 = class156.method1196(6) + 1;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    private int field2743 = class156.method1196(8);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "[I")
    private int[] field2741;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([FIZ)V")
    public final void method932(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class156.field3559[this.field2743].field2642;
        int var6 = this.field2745 - this.field2744;
        int var7 = var6 / this.field2747;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class156.field3559[this.field2743].method889();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field2746;
                        }
                        var11 /= this.field2746;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field2741[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2747 * var10 + this.field2744;
                        class108 var17 = class156.field3559[var15];
                        if (this.field2742 == 0) {
                            int var18 = this.field2747 / var17.field2642;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method888();
                                for (int var21 = 0; var21 < var17.field2642; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2747) {
                                float[] var23 = var17.method888();
                                for (int var24 = 0; var24 < var17.field2642; var24++) {
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

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
    public class119() {
        int[] var1 = new int[this.field2746];
        for (int var2 = 0; var2 < this.field2746; var2++) {
            int var4 = 0;
            int var5 = class156.method1196(3);
            boolean var6 = class156.method1197() != 0;
            if (var6) {
                var4 = class156.method1196(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field2741 = new int[this.field2746 * 8];
        for (int var3 = 0; var3 < this.field2746 * 8; var3++) {
            this.field2741[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class156.method1196(8);
        }
    }
}
