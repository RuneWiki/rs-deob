import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class49 {

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    private int field802 = class531.method3222(16);

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    private int field803 = class531.method3222(24);

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    private int field804 = class531.method3222(24);

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    private int field801 = class531.method3222(24) + 1;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    private int field805 = class531.method3222(6) + 1;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    private int field806 = class531.method3222(8);

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "[I")
    private int[] field800;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "([FIZ)V", line = 9)
    public final void method464(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class531.field7747[this.field806].field10160;
        int var6 = this.field804 - this.field803;
        int var7 = var6 / this.field801;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class531.field7747[this.field806].method4043();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field805;
                        }
                        var11 /= this.field805;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field800[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field801 * var10 + this.field803;
                        class723 var17 = class531.field7747[var15];
                        if (this.field802 == 0) {
                            int var18 = this.field801 / var17.field10160;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method4046();
                                for (int var21 = 0; var21 < var17.field10160; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field801) {
                                float[] var23 = var17.method4046();
                                for (int var24 = 0; var24 < var17.field10160; var24++) {
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

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V", line = 133)
    public class49() {
        int[] var1 = new int[this.field805];
        for (int var2 = 0; var2 < this.field805; var2++) {
            int var4 = 0;
            int var5 = class531.method3222(3);
            boolean var6 = class531.method3224() != 0;
            if (var6) {
                var4 = class531.method3222(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field800 = new int[this.field805 * 8];
        for (int var3 = 0; var3 < this.field805 * 8; var3++) {
            this.field800[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class531.method3222(8);
        }
    }
}
