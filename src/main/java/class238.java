import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class238 {

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    private int field3916 = class214.method1429(16);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    private int field3912 = class214.method1429(24);

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    private int field3917 = class214.method1429(24);

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    private int field3913 = class214.method1429(24) + 1;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    private int field3911 = class214.method1429(6) + 1;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    private int field3915 = class214.method1429(8);

    @OriginalMember(owner = "client!r", name = "d", descriptor = "[I")
    private int[] field3914;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([FIZ)V")
    public final void method1574(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class214.field3590[this.field3915].field3875;
        int var6 = this.field3917 - this.field3912;
        int var7 = var6 / this.field3913;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class214.field3590[this.field3915].method1545();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field3911;
                        }
                        var11 /= this.field3911;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field3914[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field3913 * var10 + this.field3912;
                        class233 var17 = class214.field3590[var15];
                        if (this.field3916 == 0) {
                            int var18 = this.field3913 / var17.field3875;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1548();
                                for (int var21 = 0; var21 < var17.field3875; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field3913) {
                                float[] var23 = var17.method1548();
                                for (int var24 = 0; var24 < var17.field3875; var24++) {
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

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
    public class238() {
        int[] var1 = new int[this.field3911];
        for (int var2 = 0; var2 < this.field3911; var2++) {
            int var4 = 0;
            int var5 = class214.method1429(3);
            boolean var6 = class214.method1434() != 0;
            if (var6) {
                var4 = class214.method1429(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field3914 = new int[this.field3911 * 8];
        for (int var3 = 0; var3 < this.field3911 * 8; var3++) {
            this.field3914[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class214.method1429(8);
        }
    }
}
