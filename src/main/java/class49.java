import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class49 {

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
    private int field685 = class4.method26(16);

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
    private int field684 = class4.method26(24);

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "I")
    private int field688 = class4.method26(24);

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
    private int field687 = class4.method26(24) + 1;

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
    private int field686 = class4.method26(6) + 1;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "I")
    private int field689 = class4.method26(8);

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "[I")
    private int[] field690;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "([FIZ)V", line = 7)
    public final void method420(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class4.field59[this.field689].field5944;
        int var6 = this.field688 - this.field684;
        int var7 = var6 / this.field687;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class4.field59[this.field689].method2630();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field686;
                        }
                        var11 /= this.field686;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field690[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field687 * var10 + this.field684;
                        class419 var17 = class4.field59[var15];
                        if (this.field685 == 0) {
                            int var18 = this.field687 / var17.field5944;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2627();
                                for (int var21 = 0; var21 < var17.field5944; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field687) {
                                float[] var23 = var17.method2627();
                                for (int var24 = 0; var24 < var17.field5944; var24++) {
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

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "()V", line = 133)
    public class49() {
        int[] var1 = new int[this.field686];
        for (int var2 = 0; var2 < this.field686; var2++) {
            int var4 = 0;
            int var5 = class4.method26(3);
            boolean var6 = class4.method27() != 0;
            if (var6) {
                var4 = class4.method26(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field690 = new int[this.field686 * 8];
        for (int var3 = 0; var3 < this.field686 * 8; var3++) {
            this.field690[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class4.method26(8);
        }
    }
}
