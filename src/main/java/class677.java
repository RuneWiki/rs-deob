import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public class class677 {

    @OriginalMember(owner = "client!sga", name = "c", descriptor = "I")
    private int field8748 = class74.method438(16);

    @OriginalMember(owner = "client!sga", name = "f", descriptor = "I")
    private int field8751 = class74.method438(24);

    @OriginalMember(owner = "client!sga", name = "g", descriptor = "I")
    private int field8752 = class74.method438(24);

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "I")
    private int field8747 = class74.method438(24) + 1;

    @OriginalMember(owner = "client!sga", name = "e", descriptor = "I")
    private int field8750 = class74.method438(6) + 1;

    @OriginalMember(owner = "client!sga", name = "d", descriptor = "I")
    private int field8749 = class74.method438(8);

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "[I")
    private int[] field8746;

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "([FIZ)V")
    public final void method3640(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class74.field1007[this.field8749].field3535;
        int var6 = this.field8752 - this.field8751;
        int var7 = var6 / this.field8747;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class74.field1007[this.field8749].method1679();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field8750;
                        }
                        var11 /= this.field8750;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field8746[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field8747 * var10 + this.field8751;
                        class267 var17 = class74.field1007[var15];
                        if (this.field8748 == 0) {
                            int var18 = this.field8747 / var17.field3535;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1682();
                                for (int var21 = 0; var21 < var17.field3535; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field8747) {
                                float[] var23 = var17.method1682();
                                for (int var24 = 0; var24 < var17.field3535; var24++) {
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

    @OriginalMember(owner = "client!sga", name = "<init>", descriptor = "()V")
    public class677() {
        int[] var1 = new int[this.field8750];
        for (int var2 = 0; var2 < this.field8750; var2++) {
            int var4 = 0;
            int var5 = class74.method438(3);
            boolean var6 = class74.method437() != 0;
            if (var6) {
                var4 = class74.method438(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field8746 = new int[this.field8750 * 8];
        for (int var3 = 0; var3 < this.field8750 * 8; var3++) {
            this.field8746[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class74.method438(8);
        }
    }
}
