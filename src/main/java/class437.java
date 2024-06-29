import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class437 extends class751 {

    @OriginalMember(owner = "client!mf", name = "A", descriptor = "[I")
    public static int[] field6246 = new int[4];

    @OriginalMember(owner = "client!mf", name = "I", descriptor = "Z")
    public static boolean field6253 = false;

    @OriginalMember(owner = "client!mf", name = "B", descriptor = "I")
    public static int field6247;

    @OriginalMember(owner = "client!mf", name = "C", descriptor = "I")
    public static int field6248;

    @OriginalMember(owner = "client!mf", name = "D", descriptor = "I")
    public static int field6249;

    @OriginalMember(owner = "client!mf", name = "E", descriptor = "I")
    public static int field6250;

    @OriginalMember(owner = "client!mf", name = "G", descriptor = "I")
    public static int field6251;

    @OriginalMember(owner = "client!mf", name = "H", descriptor = "I")
    public static int field6252;

    @OriginalMember(owner = "client!mf", name = "J", descriptor = "I")
    public static int field6254;

    @OriginalMember(owner = "client!mf", name = "K", descriptor = "I")
    public static int field6255;

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V", line = 3)
    public class437() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILrv;I)V", line = 10)
    public final void method309(int arg0, class120 arg1, int arg2) {
        int var4 = 39 / ((25 - arg0) / 63);
        ++field6251;
        if (arg2 == 0) {
            super.field10415 = arg1.method842(2384) == 1;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IB)[[I", line = 23)
    public final int[][] method147(int arg0, byte arg1) {
        ++field6250;
        if (arg1 != 57) {
            return null;
        } else {
            int[][] var3 = super.field10409.method3474(2132, arg0);
            if (super.field10409.field8481) {
                int[][] var4 = this.method4172(0, arg0, 1);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; var11 < class673.field9452; ++var11) {
                    var8[var11] = -var5[var11] + 4096;
                    var9[var11] = -var6[var11] + 4096;
                    var10[var11] = 4096 - var7[var11];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IBIIIIIII)V", line = 70)
    public static final void method2633(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg1 != 69) {
            method2637(8, (class590) null, (String) null, 8);
        }
        ++field6255;
        if (arg4 >= 1 && ~arg5 <= -2 && ~(class109.field1314 - 2) <= ~arg4 && arg5 <= class760.field10479 + -2) {
            int var9 = arg6;
            if (~arg6 > -4 && class627.method3593(arg4, (byte) 50, arg5)) {
                var9 = arg6 + 1;
            }
            if (~class145.field1852.field9018.method2757((byte) -107) == -1 && !class177.method1343(var9, arg4, arg5, (byte) 72, class573.field8111)) {
                return;
            }
            if (class378.field5427 == null) {
                return;
            }
            class663.field9301.method2846(arg7, class234.field3394[arg6], class638.field8979, arg4, arg6, 1, arg5);
            if (arg8 >= 0) {
                int var10 = class145.field1852.field8993.method1387((byte) -37);
                class145.field1852.method3632(class145.field1852.field8993, true, 1);
                class663.field9301.method2847(127, arg5, arg0, arg2, arg6, class234.field3394[arg6], var9, arg3, arg8, class638.field8979, arg4);
                class145.field1852.method3632(class145.field1852.field8993, true, var10);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)V", line = 118)
    public static final void method2634(int arg0, int arg1) {
        class192 var2 = null;
        for (int var3 = arg0; var3 < arg1; ++var3) {
            class292 var4 = class750.field10395[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class12.field249; ++var5) {
                    for (int var6 = 0; var6 < class151.field2074; ++var6) {
                        var2 = var4.method1249(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class310.field4616;
                            int var8 = var5 << class310.field4616;
                            for (int var9 = var3 - 1; var9 >= 0; --var9) {
                                class292 var10 = class750.field10395[var9];
                                if (var10 != null) {
                                    int var11 = var4.method1976(var6, -1, var5) - var10.method1976(var6, -1, var5);
                                    int var12 = var4.method1976(var6 + 1, -1, var5) - var10.method1976(var6 + 1, -1, var5);
                                    int var13 = var4.method1976(var6 + 1, -1, var5 + 1) - var10.method1976(var6 + 1, -1, var5 + 1);
                                    int var14 = var4.method1976(var6, -1, var5 + 1) - var10.method1976(var6, -1, var5 + 1);
                                    var10.method1247(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)V", line = 182)
    public static void method2635(int arg0) {
        field6246 = null;
        if (arg0 != 0) {
            method2638(45, 104);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)[I", line = 195)
    public final int[] method365(int arg0, int arg1) {
        if (arg1 != 4095) {
            field6253 = true;
        }
        ++field6249;
        int[] var3 = super.field10405.method3601(true, arg0);
        if (super.field10405.field8923) {
            int[] var4 = this.method4173(arg0, (byte) -121, 0);
            for (int var5 = 0; var5 < class673.field9452; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "(I)V", line = 228)
    public static final void method2636(int arg0) {
        ++field6252;
        if (~class645.field9087 != 0 && class141.field1822 != -1) {
            int var1 = ((class713.field10066 - class770.field10622) * class430.field6113 >> 16) + class770.field10622;
            class430.field6113 += var1;
            if (~class430.field6113 <= -65536) {
                if (!class305.field4569) {
                    class631.field8917 = true;
                } else {
                    class631.field8917 = false;
                }
                class430.field6113 = 65535;
                class305.field4569 = true;
            } else {
                class305.field4569 = false;
                class631.field8917 = false;
            }
            float var2 = (float) class430.field6113 / 65535.0F;
            float[] var3 = new float[3];
            int var4 = class599.field8448 * 2;
            for (int var5 = 0; ~var5 > -4; ++var5) {
                int var21 = class772.field10648[class645.field9087][var4][var5] * 3;
                int var22 = class772.field10648[class645.field9087][var4 + 1][var5] * 3;
                int var23 = (class772.field10648[class645.field9087][var4 + 2][var5] + -class772.field10648[class645.field9087][var4 + 3][var5] - -class772.field10648[class645.field9087][var4 + 2][var5]) * 3;
                int var24 = class772.field10648[class645.field9087][var4][var5];
                int var25 = -var21 + var22;
                int var26 = -(var22 * 2) + var21 + var23;
                int var27 = class772.field10648[class645.field9087][var4 + 2][var5] + var22 - (var24 - -var23);
                var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
            }
            class277.field3866 = (int) var3[0] - class103.field1295 * 512;
            class359.field5216 = (int) var3[2] + -(class175.field2496 * 512);
            class655.field9241 = (int) var3[arg0] * -1;
            float[] var6 = new float[3];
            int var7 = class113.field1423 * 2;
            for (int var8 = 0; var8 < 3; ++var8) {
                int var14 = class772.field10648[class141.field1822][var7][var8] * 3;
                int var15 = class772.field10648[class141.field1822][var7 + 1][var8] * 3;
                int var16 = (class772.field10648[class141.field1822][var7 - -2][var8] + -class772.field10648[class141.field1822][var7 + 3][var8] + class772.field10648[class141.field1822][var7 + 2][var8]) * 3;
                int var17 = class772.field10648[class141.field1822][var7][var8];
                int var18 = var15 - var14;
                int var19 = var14 - var15 * 2 + var16;
                int var20 = class772.field10648[class141.field1822][var7 + 2][var8] + -var16 + -var17 + var15;
                var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
            }
            float var9 = var6[0] - var3[0];
            float var10 = (var6[1] + -var3[1]) * -1.0F;
            float var11 = var6[2] - var3[2];
            double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
            class689.field9757 = 16383 & (int) (2607.5945876176133D * Math.atan2((double) var10, var12));
            class118.field1478 = 16383 & (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D);
            class666.field9380 = ((class772.field10648[class645.field9087][var4 + 2][3] + -class772.field10648[class645.field9087][var4][3]) * class430.field6113 >> 16) + class772.field10648[class645.field9087][var4][3];
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILkj;Ljava/lang/String;I)Lrb;", line = 328)
    public static final class370 method2637(int arg0, class590 arg1, String arg2, int arg3) {
        ++field6254;
        if (~arg0 == -1) {
            return arg1.method3415(4, arg2);
        } else if (arg0 == 1) {
            try {
                class150.method1034("openjs", new Object[] { (new URL(class535.field7544.getCodeBase(), arg2)).toString() }, class535.field7544, (byte) 80);
                class370 var4 = new class370();
                var4.field5314 = 1;
                return var4;
            } catch (Throwable var10) {
                class370 var5 = new class370();
                var5.field5314 = 2;
                return var5;
            }
        } else if (arg0 == 2) {
            try {
                class535.field7544.getAppletContext().showDocument(new URL(class535.field7544.getCodeBase(), arg2), "_blank");
                class370 var6 = new class370();
                var6.field5314 = 1;
                return var6;
            } catch (Exception var11) {
                class370 var7 = new class370();
                var7.field5314 = 2;
                return var7;
            }
        } else {
            if (arg3 != 26027) {
                method2637(-108, (class590) null, (String) null, 53);
            }
            if (arg0 == 3) {
                try {
                    class150.method1035(-19253, "loggedout", class535.field7544);
                } catch (Throwable var13) {
                }
                try {
                    class535.field7544.getAppletContext().showDocument(new URL(class535.field7544.getCodeBase(), arg2), "_top");
                    class370 var8 = new class370();
                    var8.field5314 = 1;
                    return var8;
                } catch (Exception var12) {
                    class370 var9 = new class370();
                    var9.field5314 = 2;
                    return var9;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(II)Llh;", line = 409)
    public static final class550 method2638(int arg0, int arg1) {
        ++field6248;
        class550 var2 = (class550) class181.field2741.method2373((long) arg0, 103);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class680.field9659.method3150(arg0, 61, 0);
            class550 var4 = new class550();
            if (arg1 > -30) {
                field6253 = true;
            }
            if (var3 != null) {
                var4.method3193(new class120(var3), (byte) 11);
            }
            var4.method3191(false);
            class181.field2741.method2362(var4, 0, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lli;BI)V", line = 439)
    public static final void method2639(class449 arg0, byte arg1, int arg2) {
        ++field6247;
        int var3 = -1;
        int var4 = 0;
        if (arg1 > -105) {
            field6253 = true;
        }
        if (~arg0.field6391 < ~class673.field9441) {
            class722.method4070((byte) 54, arg0);
        } else if (~class673.field9441 >= ~arg0.field6346) {
            class534.method3094(arg0, (byte) 118);
        } else {
            class701.method3975(103, arg0, false);
            var4 = class663.field9305;
            var3 = class498.field7079;
        }
        if (~arg0.field7718 > -513 || arg0.field7719 < 512 || arg0.field7718 >= class109.field1314 * 512 + -512 || ~(class760.field10479 * 512 - 512) >= ~arg0.field7719) {
            arg0.field6393 = null;
            var3 = -1;
            var4 = 0;
            arg0.field6404 = -1;
            arg0.field6346 = 0;
            arg0.field6391 = 0;
            arg0.field7718 = arg0.field6448[0] * 512 + arg0.method2692((byte) -8) * 256;
            arg0.field7719 = arg0.field6445[0] * 512 + arg0.method2692((byte) -5) * 256;
            arg0.method2698(103);
            for (int var5 = 0; ~arg0.field6434.length < ~var5; ++var5) {
                arg0.field6434[var5].field5987 = -1;
            }
        }
        if (class251.field3549 == arg0 && (arg0.field7718 < 6144 || ~arg0.field7719 > -6145 || arg0.field7718 >= class109.field1314 * 512 + -6144 || ~(class760.field10479 * 512 + -6144) >= ~arg0.field7719)) {
            var3 = -1;
            arg0.field6393 = null;
            arg0.field6346 = 0;
            var4 = 0;
            arg0.field6404 = -1;
            arg0.field6391 = 0;
            arg0.field7718 = arg0.field6448[0] * 512 + 256 * arg0.method2692((byte) -128);
            arg0.field7719 = arg0.field6445[0] * 512 + arg0.method2692((byte) -126) * 256;
            arg0.method2698(53);
            for (int var6 = 0; ~arg0.field6434.length < ~var6; ++var6) {
                arg0.field6434[var6].field5987 = -1;
            }
        }
        int var7 = class48.method315(-86, arg0);
        class73.method575(arg0, (byte) 105);
        class403.method2435(var4, false, var3, var7, arg0);
        class271.method1768(arg0, var3, false);
        class301.method2001(arg0, (byte) -119);
    }
}
