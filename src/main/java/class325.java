import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class325 {

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    private int field4993 = class302.method2173(16);

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    private int field4990 = class302.method2173(24);

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    private int field4995 = class302.method2173(24);

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    private int field4994 = class302.method2173(24) + 1;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    private int field4991 = class302.method2173(6) + 1;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    private int field4992 = class302.method2173(8);

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "[I")
    private int[] field4996;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "([FIZ)V", line = 9)
    public final void method2299(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class302.field4696[this.field4992].field3942;
        int var6 = this.field4995 - this.field4990;
        int var7 = var6 / this.field4994;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class302.field4696[this.field4992].method1898();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field4991;
                        }
                        var11 /= this.field4991;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field4996[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field4994 * var10 + this.field4990;
                        class257 var17 = class302.field4696[var15];
                        if (this.field4993 == 0) {
                            int var18 = this.field4994 / var17.field3942;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1895();
                                for (int var21 = 0; var21 < var17.field3942; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field4994) {
                                float[] var23 = var17.method1895();
                                for (int var24 = 0; var24 < var17.field3942; var24++) {
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
    public class325() {
        int[] var1 = new int[this.field4991];
        for (int var2 = 0; var2 < this.field4991; var2++) {
            int var3 = 0;
            int var4 = class302.method2173(3);
            boolean var5 = class302.method2176() != 0;
            if (var5) {
                var3 = class302.method2173(5);
            }
            var1[var2] = var3 << 3 | var4;
        }
        this.field4996 = new int[this.field4991 * 8];
        for (int var6 = 0; var6 < this.field4991 * 8; var6++) {
            this.field4996[var6] = (var1[var6 >> 3] & 0x1 << (var6 & 0x7)) == 0 ? -1 : class302.method2173(8);
        }
    }
}
