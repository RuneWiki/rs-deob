import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cka")
public class class185 {

    @OriginalMember(owner = "client!cka", name = "b", descriptor = "I")
    private int field2834 = class175.method1268(16);

    @OriginalMember(owner = "client!cka", name = "f", descriptor = "I")
    private int field2838 = class175.method1268(24);

    @OriginalMember(owner = "client!cka", name = "g", descriptor = "I")
    private int field2839 = class175.method1268(24);

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "I")
    private int field2833 = class175.method1268(24) + 1;

    @OriginalMember(owner = "client!cka", name = "d", descriptor = "I")
    private int field2836 = class175.method1268(6) + 1;

    @OriginalMember(owner = "client!cka", name = "c", descriptor = "I")
    private int field2835 = class175.method1268(8);

    @OriginalMember(owner = "client!cka", name = "e", descriptor = "[I")
    private int[] field2837;

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "([FIZ)V")
    public final void method1304(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class175.field2699[this.field2835].field632;
        int var6 = this.field2839 - this.field2838;
        int var7 = var6 / this.field2833;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class175.field2699[this.field2835].method355();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field2836;
                        }
                        var11 /= this.field2836;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field2837[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2833 * var10 + this.field2838;
                        class50 var17 = class175.field2699[var15];
                        if (this.field2834 == 0) {
                            int var18 = this.field2833 / var17.field632;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method354();
                                for (int var21 = 0; var21 < var17.field632; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2833) {
                                float[] var23 = var17.method354();
                                for (int var24 = 0; var24 < var17.field632; var24++) {
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

    @OriginalMember(owner = "client!cka", name = "<init>", descriptor = "()V")
    public class185() {
        int[] var1 = new int[this.field2836];
        for (int var2 = 0; var2 < this.field2836; var2++) {
            int var4 = 0;
            int var5 = class175.method1268(3);
            boolean var6 = class175.method1274() != 0;
            if (var6) {
                var4 = class175.method1268(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field2837 = new int[this.field2836 * 8];
        for (int var3 = 0; var3 < this.field2836 * 8; var3++) {
            this.field2837[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class175.method1268(8);
        }
    }
}
