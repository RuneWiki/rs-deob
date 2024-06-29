import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class227 {

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    private int field3815 = class278.method1874(16);

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    private int field3820 = class278.method1874(24);

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    private int field3816 = class278.method1874(24);

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    private int field3818 = class278.method1874(24) + 1;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    private int field3817 = class278.method1874(6) + 1;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    private int field3814 = class278.method1874(8);

    @OriginalMember(owner = "client!df", name = "f", descriptor = "[I")
    private int[] field3819;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([FIZ)V", line = 11)
    public final void method1625(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class278.field4428[this.field3814].field5195;
        int var6 = this.field3816 - this.field3820;
        int var7 = var6 / this.field3818;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class278.field4428[this.field3814].method2200();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field3817;
                        }
                        var11 /= this.field3817;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field3819[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field3818 * var10 + this.field3820;
                        class332 var17 = class278.field4428[var15];
                        if (this.field3815 == 0) {
                            int var18 = this.field3818 / var17.field5195;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2203();
                                for (int var21 = 0; var21 < var17.field5195; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field3818) {
                                float[] var23 = var17.method2203();
                                for (int var24 = 0; var24 < var17.field5195; var24++) {
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

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V", line = 133)
    public class227() {
        int[] var1 = new int[this.field3817];
        for (int var2 = 0; var2 < this.field3817; var2++) {
            int var4 = 0;
            int var5 = class278.method1874(3);
            boolean var6 = class278.method1878() != 0;
            if (var6) {
                var4 = class278.method1874(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field3819 = new int[this.field3817 * 8];
        for (int var3 = 0; var3 < this.field3817 * 8; var3++) {
            this.field3819[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class278.method1874(8);
        }
    }
}
