import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class66 {

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    private int field1657 = class14.method71(16);

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    private int field1658 = class14.method71(24);

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    private int field1656 = class14.method71(24);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    private int field1655 = class14.method71(24) + 1;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    private int field1660 = class14.method71(6) + 1;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    private int field1661 = class14.method71(8);

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "[I")
    private int[] field1659;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "([FIZ)V")
    public final void method534(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class14.field263[this.field1661].field1836;
        int var6 = this.field1656 - this.field1658;
        int var7 = var6 / this.field1655;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class14.field263[this.field1661].method624();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field1660;
                        }
                        var11 /= this.field1660;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field1659[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field1655 * var10 + this.field1658;
                        class74 var17 = class14.field263[var15];
                        if (this.field1657 == 0) {
                            int var18 = this.field1655 / var17.field1836;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method621();
                                for (int var21 = 0; var21 < var17.field1836; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field1655) {
                                float[] var23 = var17.method621();
                                for (int var24 = 0; var24 < var17.field1836; var24++) {
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

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
    public class66() {
        int[] var1 = new int[this.field1660];
        for (int var2 = 0; var2 < this.field1660; var2++) {
            int var4 = 0;
            int var5 = class14.method71(3);
            boolean var6 = class14.method72() != 0;
            if (var6) {
                var4 = class14.method71(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field1659 = new int[this.field1660 * 8];
        for (int var3 = 0; var3 < this.field1660 * 8; var3++) {
            this.field1659[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class14.method71(8);
        }
    }
}
