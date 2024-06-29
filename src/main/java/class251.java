import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class251 {

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    private int field3934 = class57.method441(16);

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    private int field3936 = class57.method441(24);

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    private int field3935 = class57.method441(24);

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    private int field3937 = class57.method441(24) + 1;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    private int field3933 = class57.method441(6) + 1;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    private int field3938 = class57.method441(8);

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "[I")
    private int[] field3939;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([FIZ)V", line = 5)
    public final void method1693(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class57.field1139[this.field3938].field4105;
        int var6 = this.field3935 - this.field3936;
        int var7 = var6 / this.field3937;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class57.field1139[this.field3938].method1766();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field3933;
                        }
                        var11 /= this.field3933;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field3939[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field3937 * var10 + this.field3936;
                        class265 var17 = class57.field1139[var15];
                        if (this.field3934 == 0) {
                            int var18 = this.field3937 / var17.field4105;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1764();
                                for (int var21 = 0; var21 < var17.field4105; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field3937) {
                                float[] var23 = var17.method1764();
                                for (int var24 = 0; var24 < var17.field4105; var24++) {
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

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V", line = 133)
    public class251() {
        int[] var1 = new int[this.field3933];
        for (int var2 = 0; var2 < this.field3933; var2++) {
            int var3 = 0;
            int var4 = class57.method441(3);
            boolean var5 = class57.method443() != 0;
            if (var5) {
                var3 = class57.method441(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field3939 = new int[this.field3933 * 8];
        for (int var6 = 0; var6 < this.field3933 * 8; var6++) {
            this.field3939[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class57.method441(8);
        }
    }
}
