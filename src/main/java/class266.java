import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class266 {

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    private int field4548 = class151.method1136(16);

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    private int field4554 = class151.method1136(24);

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    private int field4551 = class151.method1136(24);

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    private int field4550 = class151.method1136(24) + 1;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    private int field4553 = class151.method1136(6) + 1;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    private int field4549 = class151.method1136(8);

    @OriginalMember(owner = "client!a", name = "e", descriptor = "[I")
    private int[] field4552;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([FIZ)V", line = 11)
    public final void method1850(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class151.field2699[this.field4549].field5337;
        int var6 = this.field4551 - this.field4554;
        int var7 = var6 / this.field4550;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class151.field2699[this.field4549].method2149();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field4553;
                        }
                        var11 /= this.field4553;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field4552[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field4550 * var10 + this.field4554;
                        class309 var17 = class151.field2699[var15];
                        if (this.field4548 == 0) {
                            int var18 = this.field4550 / var17.field5337;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method2148();
                                for (int var21 = 0; var21 < var17.field5337; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field4550) {
                                float[] var23 = var17.method2148();
                                for (int var24 = 0; var24 < var17.field5337; var24++) {
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

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V", line = 133)
    public class266() {
        int[] var1 = new int[this.field4553];
        for (int var2 = 0; var2 < this.field4553; var2++) {
            int var3 = 0;
            int var4 = class151.method1136(3);
            boolean var5 = class151.method1130() != 0;
            if (var5) {
                var3 = class151.method1136(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field4552 = new int[this.field4553 * 8];
        for (int var6 = 0; var6 < this.field4553 * 8; var6++) {
            this.field4552[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class151.method1136(8);
        }
    }
}
