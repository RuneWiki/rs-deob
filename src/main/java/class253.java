import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class253 {

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    private int field3892 = class167.method1220(16);

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    private int field3895 = class167.method1220(24);

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    private int field3889 = class167.method1220(24);

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    private int field3891 = class167.method1220(24) + 1;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    private int field3894 = class167.method1220(6) + 1;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    private int field3890 = class167.method1220(8);

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "[I")
    private int[] field3893;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "([FIZ)V", line = 5)
    public final void method1783(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class167.field2580[this.field3890].field3606;
        int var6 = this.field3889 - this.field3895;
        int var7 = var6 / this.field3891;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class167.field2580[this.field3890].method1628();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field3894;
                        }
                        var11 /= this.field3894;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field3893[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field3891 * var10 + this.field3895;
                        class225 var17 = class167.field2580[var15];
                        if (this.field3892 == 0) {
                            int var18 = this.field3891 / var17.field3606;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1630();
                                for (int var21 = 0; var21 < var17.field3606; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field3891) {
                                float[] var23 = var17.method1630();
                                for (int var24 = 0; var24 < var17.field3606; var24++) {
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

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V", line = 133)
    public class253() {
        int[] var1 = new int[this.field3894];
        for (int var2 = 0; var2 < this.field3894; var2++) {
            int var3 = 0;
            int var4 = class167.method1220(3);
            boolean var5 = class167.method1218() != 0;
            if (var5) {
                var3 = class167.method1220(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field3893 = new int[this.field3894 * 8];
        for (int var6 = 0; var6 < this.field3894 * 8; var6++) {
            this.field3893[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class167.method1220(8);
        }
    }
}
