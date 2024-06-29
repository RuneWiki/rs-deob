import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class332 extends class145 {

    @OriginalMember(owner = "client!lp", name = "G", descriptor = "I")
    private int field4769 = 0;

    @OriginalMember(owner = "client!lp", name = "S", descriptor = "I")
    private int field4780 = 0;

    @OriginalMember(owner = "client!lp", name = "K", descriptor = "I")
    private int field4772 = 0;

    @OriginalMember(owner = "client!lp", name = "Q", descriptor = "Lea;")
    public static class474 field4778 = new class474("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

    @OriginalMember(owner = "client!lp", name = "U", descriptor = "I")
    public static int field4782 = -1;

    @OriginalMember(owner = "client!lp", name = "V", descriptor = "I")
    public static int field4783 = -1;

    @OriginalMember(owner = "client!lp", name = "E", descriptor = "I")
    private int field4768;

    @OriginalMember(owner = "client!lp", name = "H", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!lp", name = "J", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!lp", name = "L", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!lp", name = "M", descriptor = "I")
    private int field4774;

    @OriginalMember(owner = "client!lp", name = "N", descriptor = "I")
    private int field4775;

    @OriginalMember(owner = "client!lp", name = "O", descriptor = "I")
    private int field4776;

    @OriginalMember(owner = "client!lp", name = "P", descriptor = "I")
    private int field4777;

    @OriginalMember(owner = "client!lp", name = "R", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!lp", name = "T", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!lp", name = "W", descriptor = "I")
    private int field4784;

    @OriginalMember(owner = "client!lp", name = "X", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "()V", line = 164)
    public class332() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lp", name = "i", descriptor = "(I)V", line = 12)
    public static void method2159(int arg0) {
        field4778 = null;
        int var1 = -66 % ((arg0 - 63) / 47);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIILoa;II)V", line = 22)
    public static final void method2160(int arg0, int arg1, int arg2, class605 arg3, int arg4, int arg5) {
        ++field4771;
        arg3.method368(arg5, arg2, arg4 + arg5, arg1 + arg2);
        arg3.method3524(arg4, arg2, (byte) 92, -16777216, arg1, arg5);
        if (class123.field1537 >= 100) {
            float var6 = (float) class182.field2279 / (float) class182.field2261;
            int var7 = arg4;
            int var8 = arg1;
            if (!(var6 < 1.0F)) {
                var7 = (int) ((float) arg1 / var6);
            } else {
                var8 = (int) ((float) arg4 * var6);
            }
            int var9 = (-var8 + arg1) / 2 + arg2;
            int var10 = (-var7 + arg4) / 2 + arg5;
            if (class181.field2229 == null || ~class181.field2229.method1570() != ~arg4 || arg1 != class181.field2229.method1576()) {
                class182.method1051(class182.field2273, class182.field2279 + class182.field2267, class182.field2273 + class182.field2261, class182.field2267, var10, var9, var7 + var10, var8 + var9);
                class182.method1066(arg3);
                class181.field2229 = arg3.method389(var10, var9, var7, var8, false);
            }
            class181.field2229.method2706(var10, var9);
            int var11 = class547.field7834 * var7 / class182.field2261;
            int var12 = class425.field6326 * var8 / class182.field2279;
            int var13 = var10 - -(class533.field7698 * var7 / class182.field2261);
            int var14 = -(class356.field5063 * var8 / class182.field2279) + var8 + -var12 + var9;
            int var15 = -1996554240;
            if (class408.field6151 == class184.field2291) {
                var15 = -1996488705;
            }
            if (arg0 != -26213) {
                field4778 = null;
            }
            arg3.method394(var13, var14, var11, var12, var15, 1);
            arg3.method299(var13, var14, var11, var12, var15, 0);
            if (~class647.field9361 < -1) {
                int var16;
                if (class590.field8474 <= 50) {
                    var16 = class590.field8474 * 5;
                } else {
                    var16 = (-class590.field8474 + 100) * 5;
                }
                for (class480 var17 = (class480) class182.field2258.method719(false); var17 != null; var17 = (class480) class182.field2258.method716(arg0 + 26227)) {
                    class431 var18 = class182.field2242.method1014(var17.field7060, 5187);
                    if (class599.method3481(var18, 10)) {
                        if (~class330.field4756 != ~var17.field7060) {
                            if (class83.field945 != -1 && class83.field945 == var18.field6403) {
                                int var19 = var10 - -(var17.field7059 * var7 / class182.field2261);
                                int var20 = (-var17.field7057 + class182.field2279) * var8 / class182.field2279 + var9;
                                arg3.method3524(4, var20 - 2, (byte) 92, var16 << 24 | 16776960, 4, var19 + -2);
                            }
                        } else {
                            int var21 = var17.field7059 * var7 / class182.field2261 + var10;
                            int var22 = var9 - -((-var17.field7057 + class182.field2279) * var8 / class182.field2279);
                            arg3.method3524(4, var22 + -2, (byte) 92, 16776960 | var16 << 24, 4, var21 + -2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IILrt;)V", line = 120)
    public final void method28(int arg0, int arg1, class194 arg2) {
        ++field4770;
        if (arg1 >= -67) {
            field4782 = -71;
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field4780 = (arg2.method1213((byte) 93) << 12) / 100;
                }
            } else {
                this.field4772 = (arg2.method1213((byte) 117) << 12) / 100;
            }
        } else {
            this.field4769 = arg2.method1233(65280);
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIII)V", line = 170)
    private final void method2161(int arg0, int arg1, int arg2, int arg3) {
        ++field4785;
        int var5 = ~arg1 >= -2049 ? (arg0 + 4096) * arg1 >> 12 : arg0 + arg1 - (arg0 * arg1 >> 12);
        if (arg2 == -541457716) {
            if (var5 > 0) {
                int var6 = arg3 * 6;
                int var7 = -var5 + arg1 + arg1;
                int var8 = (-var7 + var5 << 12) / var5;
                int var9 = var6 >> 12;
                int var10 = -(var9 << 12) + var6;
                int var12 = var8 * var5 >> 12;
                int var13 = var10 * var12 >> 12;
                int var14 = var7 + var13;
                int var15 = -var13 + var5;
                if (~var9 == -1) {
                    this.field4784 = var5;
                    this.field4777 = var7;
                    this.field4774 = var14;
                    return;
                }
                if (var9 == 1) {
                    this.field4784 = var15;
                    this.field4774 = var5;
                    this.field4777 = var7;
                    return;
                }
                if (var9 == 2) {
                    this.field4777 = var14;
                    this.field4784 = var7;
                    this.field4774 = var5;
                    return;
                }
                if (var9 == 3) {
                    this.field4784 = var7;
                    this.field4774 = var15;
                    this.field4777 = var5;
                    return;
                }
                if (~var9 == -5) {
                    this.field4784 = var14;
                    this.field4774 = var7;
                    this.field4777 = var5;
                    return;
                }
                if (var9 == 5) {
                    this.field4777 = var15;
                    this.field4774 = var7;
                    this.field4784 = var5;
                    return;
                }
            } else {
                this.field4784 = this.field4774 = this.field4777 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(BI)[[I", line = 277)
    public final int[][] method75(byte arg0, int arg1) {
        ++field4781;
        int[][] var3 = super.field1792.method1826(arg1, -16486);
        if (arg0 >= -28) {
            method2160(-70, 41, 86, (class605) null, -37, 96);
        }
        if (super.field1792.field3917) {
            int[][] var4 = this.method866(0, arg1, (byte) -99);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class647.field9368; ++var11) {
                this.method2162(var7[var11], var6[var11], 1558751180, var5[var11]);
                this.field4776 += this.field4772;
                this.field4768 += this.field4780;
                for (this.field4775 += this.field4769; ~this.field4775 > -1; this.field4775 += 4096) {
                }
                if (this.field4776 < 0) {
                    this.field4776 = 0;
                }
                while (this.field4775 > 4096) {
                    this.field4775 -= 4096;
                }
                if (this.field4768 < 0) {
                    this.field4768 = 0;
                }
                if (this.field4776 > 4096) {
                    this.field4776 = 4096;
                }
                if (this.field4768 > 4096) {
                    this.field4768 = 4096;
                }
                this.method2161(this.field4776, this.field4768, -541457716, this.field4775);
                var8[var11] = this.field4784;
                var9[var11] = this.field4774;
                var10[var11] = this.field4777;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(IIII)V", line = 360)
    private final void method2162(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 1558751180) {
            ++field4773;
            int var5 = arg3 <= arg1 ? arg1 : arg3;
            int var6 = arg1 > arg3 ? arg3 : arg1;
            int var7 = arg0 > var5 ? arg0 : var5;
            int var8 = ~arg0 <= ~var6 ? var6 : arg0;
            this.field4768 = (var7 + var8) / 2;
            int var9 = -var8 + var7;
            if (var9 <= 0) {
                this.field4775 = 0;
            } else {
                int var10 = (-arg3 + var7 << 12) / var9;
                int var11 = (-arg1 + var7 << 12) / var9;
                int var12 = (-arg0 + var7 << 12) / var9;
                if (~arg3 != ~var7) {
                    if (~arg1 == ~var7) {
                        this.field4775 = ~arg0 == ~var8 ? 4096 - -var10 : 12288 - var12;
                    } else {
                        this.field4775 = ~arg3 != ~var8 ? 20480 - var10 : var11 + 12288;
                    }
                } else {
                    this.field4775 = arg1 != var8 ? 4096 - var11 : var12 + 20480;
                }
                this.field4775 /= 6;
            }
            if (this.field4768 > 0 && this.field4768 < 4096) {
                this.field4776 = (var9 << 12) / (this.field4768 > 2048 ? 8192 - this.field4768 * 2 : this.field4768 * 2);
            } else {
                this.field4776 = 0;
            }
        }
    }
}
