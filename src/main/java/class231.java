import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class231 {

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    private int field3107 = class56.method330(16);

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
    private int field3111 = class56.method330(24);

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    private int field3109 = class56.method330(24);

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    private int field3108 = class56.method330(24) + 1;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    private int field3105 = class56.method330(6) + 1;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    private int field3106 = class56.method330(8);

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "[I")
    private int[] field3110;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "([FIZ)V", line = 11)
    public final void method1469(float[] arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < arg1; var4++) {
            arg0[var4] = 0.0F;
        }
        if (arg2) {
            return;
        }
        int var5 = class56.field670[this.field3106].field3908;
        int var6 = this.field3109 - this.field3111;
        int var7 = var6 / this.field3108;
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < 8; var9++) {
            int var10 = 0;
            while (var10 < var7) {
                if (var9 == 0) {
                    int var11 = class56.field670[this.field3106].method1772();
                    for (int var12 = var5 - 1; var12 >= 0; var12--) {
                        if (var10 + var12 < var7) {
                            var8[var10 + var12] = var11 % this.field3105;
                        }
                        var11 /= this.field3105;
                    }
                }
                for (int var13 = 0; var13 < var5; var13++) {
                    int var14 = var8[var10];
                    int var15 = this.field3110[var14 * 8 + var9];
                    if (var15 >= 0) {
                        int var16 = this.field3108 * var10 + this.field3111;
                        class295 var17 = class56.field670[var15];
                        if (this.field3107 == 0) {
                            int var18 = this.field3108 / var17.field3908;
                            for (int var19 = 0; var19 < var18; var19++) {
                                float[] var20 = var17.method1773();
                                for (int var21 = 0; var21 < var17.field3908; var21++) {
                                    arg0[var18 * var21 + var16 + var19] += var20[var21];
                                }
                            }
                        } else {
                            int var22 = 0;
                            while (var22 < this.field3108) {
                                float[] var23 = var17.method1773();
                                for (int var24 = 0; var24 < var17.field3908; var24++) {
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

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V", line = 133)
    public class231() {
        int[] var1 = new int[this.field3105];
        for (int var2 = 0; var2 < this.field3105; var2++) {
            int var4 = 0;
            int var5 = class56.method330(3);
            boolean var6 = class56.method337() != 0;
            if (var6) {
                var4 = class56.method330(5);
            }
            var1[var2] = var4 << 3 | var5;
        }
        this.field3110 = new int[this.field3105 * 8];
        for (int var3 = 0; var3 < this.field3105 * 8; var3++) {
            this.field3110[var3] = (var1[var3 >> 3] & 0x1 << (var3 & 0x7)) == 0 ? -1 : class56.method330(8);
        }
    }
}
