import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class289 {

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    private int field4663 = class269.method1869(16);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    private int field4662 = class269.method1869(24);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    private int field4659 = class269.method1869(24);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    private int field4661 = class269.method1869(24) + 1;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    private int field4660 = class269.method1869(6) + 1;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    private int field4664 = class269.method1869(8);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "[I")
    private int[] field4658;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([FIZ)V")
    public final void method1967(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class269.field4383[this.field4664].field2918;
        int var6 = this.field4659 - this.field4662;
        int var7 = var6 / this.field4661;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class269.field4383[this.field4664].method1306();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field4660;
                        }
                        var11 /= this.field4660;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field4658[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field4661 * var10 + this.field4662;
                        class185 var17 = class269.field4383[var15];
                        if (this.field4663 == 0) {
                            int var18 = this.field4661 / var17.field2918;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1307();
                                for (int var21 = 0; var21 < var17.field2918; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field4661) {
                                float[] var23 = var17.method1307();
                                for (int var24 = 0; var24 < var17.field2918; var24++) {
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

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V")
    public class289() {
        int[] var1 = new int[this.field4660];
        for (int var2 = 0; var2 < this.field4660; var2++) {
            int var4 = 0;
            int var5 = class269.method1869(3);
            boolean var6 = class269.method1874() != 0;
            if (var6) {
                var4 = class269.method1869(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field4658 = new int[this.field4660 * 8];
        for (int var3 = 0; var3 < this.field4660 * 8; var3++) {
            this.field4658[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class269.method1869(8);
        }
    }
}
