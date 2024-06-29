import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class141 {

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    private int field2450 = class170.method1182(16);

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    private int field2446 = class170.method1182(24);

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    private int field2452 = class170.method1182(24);

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    private int field2451 = class170.method1182(24) + 1;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    private int field2448 = class170.method1182(6) + 1;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    private int field2447 = class170.method1182(8);

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "[I")
    private int[] field2449;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "([FIZ)V")
    public final void method976(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class170.field2985[this.field2447].field3734;
        int var6 = this.field2452 - this.field2446;
        int var7 = var6 / this.field2451;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class170.field2985[this.field2447].method1457();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field2448;
                        }
                        var11 /= this.field2448;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field2449[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2451 * var10 + this.field2446;
                        class218 var17 = class170.field2985[var15];
                        if (this.field2450 == 0) {
                            int var18 = this.field2451 / var17.field3734;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1459();
                                for (int var21 = 0; var21 < var17.field3734; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2451) {
                                float[] var23 = var17.method1459();
                                for (int var24 = 0; var24 < var17.field3734; var24++) {
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

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V")
    public class141() {
        int[] var1 = new int[this.field2448];
        for (int var2 = 0; var2 < this.field2448; var2++) {
            int var4 = 0;
            int var5 = class170.method1182(3);
            boolean var6 = class170.method1190() != 0;
            if (var6) {
                var4 = class170.method1182(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field2449 = new int[this.field2448 * 8];
        for (int var3 = 0; var3 < this.field2448 * 8; var3++) {
            this.field2449[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class170.method1182(8);
        }
    }
}
