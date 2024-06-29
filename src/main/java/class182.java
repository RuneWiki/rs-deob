import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class182 {

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    private int field2704 = class104.method800(16);

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    private int field2706 = class104.method800(24);

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    private int field2701 = class104.method800(24);

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    private int field2705 = class104.method800(24) + 1;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    private int field2707 = class104.method800(6) + 1;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    private int field2703 = class104.method800(8);

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "[I")
    private int[] field2702;

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
    public class182() {
        int[] var1 = new int[this.field2707];
        for (int var2 = 0; var2 < this.field2707; var2++) {
            int var4 = 0;
            int var5 = class104.method800(3);
            boolean var6 = class104.method794() != 0;
            if (var6) {
                var4 = class104.method800(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field2702 = new int[this.field2707 * 8];
        for (int var3 = 0; var3 < this.field2707 * 8; var3++) {
            this.field2702[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class104.method800(8);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "([FIZ)V")
    public final void method1197(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class104.field1678[this.field2703].field303;
        int var6 = this.field2701 - this.field2706;
        int var7 = var6 / this.field2705;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class104.field1678[this.field2703].method175();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field2707;
                        }
                        var11 /= this.field2707;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field2702[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field2705 * var10 + this.field2706;
                        class20 var17 = class104.field1678[var15];
                        if (this.field2704 == 0) {
                            int var18 = this.field2705 / var17.field303;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method174();
                                for (int var21 = 0; var21 < var17.field303; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field2705) {
                                float[] var23 = var17.method174();
                                for (int var24 = 0; var24 < var17.field303; var24++) {
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
}
