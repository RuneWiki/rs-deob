import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class19 extends class155 {

    @OriginalMember(owner = "client!vd", name = "T", descriptor = "[I")
    private int[] field209;

    @OriginalMember(owner = "client!vd", name = "K", descriptor = "[I")
    private int[] field200;

    @OriginalMember(owner = "client!vd", name = "L", descriptor = "Lem;")
    private class87 field201;

    @OriginalMember(owner = "client!vd", name = "Q", descriptor = "Lem;")
    private class87 field206;

    @OriginalMember(owner = "client!vd", name = "I", descriptor = "Lem;")
    private class87 field198;

    @OriginalMember(owner = "client!vd", name = "P", descriptor = "[Lem;")
    private class87[] field205;

    @OriginalMember(owner = "client!vd", name = "N", descriptor = "Ljava/lang/String;")
    public static String field203 = "Loading...";

    @OriginalMember(owner = "client!vd", name = "D", descriptor = "I")
    public static int field194 = 500;

    @OriginalMember(owner = "client!vd", name = "E", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!vd", name = "F", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!vd", name = "H", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!vd", name = "J", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!vd", name = "M", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!vd", name = "O", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!vd", name = "R", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!vd", name = "S", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!vd", name = "U", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILlc;Lib;IZDI)Lkd;")
    public final class116 method128(int arg0, class270 arg1, class61 arg2, int arg3, boolean arg4, double arg5, int arg6) {
        field196++;
        class52.method322(arg5, false);
        class143.field2314 = arg2;
        class179.field2671 = arg1;
        class92.method700(arg0, arg3, false);
        class116 var9 = new class116(arg0, arg3);
        for (int var10 = 0; var10 < this.field205.length; var10++) {
            this.field205[var10].method643(255, arg3, arg0);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg3; var12++) {
            if (arg4) {
                var11 = var12 << 2;
            }
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field206.field1381) {
                int[] var18 = this.field206.method37(var12, false);
                var15 = var18;
                var17 = var18;
                var16 = var18;
            } else {
                int[][] var14 = this.field206.method143(var12, 6);
                var15 = var14[2];
                var16 = var14[1];
                var17 = var14[0];
            }
            int[] var19;
            if (this.field198.field1381) {
                var19 = this.field198.method37(var12, false);
            } else {
                var19 = this.field198.method143(var12, 6)[0];
            }
            for (int var20 = arg0 - 1; var20 >= 0; var20--) {
                int var21 = var17[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                int var22 = var15[var20] >> 4;
                if (var21 < 0) {
                    var21 = 0;
                }
                int var23 = var16[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var24 = class39.field523[var21];
                int var25 = class39.field523[var22];
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class39.field523[var23];
                int var27;
                if (var24 == 0 && var26 == 0 && var25 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var9.field2375[var11++] = (var26 << 8) + (var24 << 16) + (var27 << 24) + var25;
                if (arg4) {
                    var11 += (arg0 << 2) - 4;
                }
            }
        }
        if (arg6 != 23755) {
            this.method133(0.14570303058469675D, false, 6, 4, (class61) null, (class270) null, 4, true);
        }
        for (int var13 = 0; var13 < this.field205.length; var13++) {
            this.field205[var13].method645((byte) -51);
        }
        return var9;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BJ)V")
    public static final void method129(byte arg0, long arg1) {
        if (class119.field1931 == 1 || class119.field1931 == 5) {
            class76.method566((byte) 93, arg1);
        } else if (class119.field1931 == 2) {
            class247.method1700(-1024);
        } else {
            class293.method1992(true);
        }
        field208++;
        if (!class191.field2823) {
            class147.field2360 = 1;
            if (class79.field1275 != 0) {
                class299.field4833 = class57.field842;
                class121.field1991 = class211.field3113;
            } else if (class56.field818 == 0) {
                class121.field1991 = class204.field3017;
                class299.field4833 = class44.field584;
            } else {
                class299.field4833 = class13.field153;
                class121.field1991 = class17.field187;
            }
            class204.field3009[0] = 1008;
            class121.field1988[0] = class171.field2589;
            class149.field2385[0] = class212.field3119;
            class221.field3219[0] = "";
        }
        class88.method659((long) class199.field2930);
        if (class1.field17 != -1) {
            class56.method396(class1.field17, 5947);
        }
        if (arg0 <= 122) {
            return;
        }
        for (int var3 = 0; var3 < class64.field968; var3++) {
            if (class91.field1452[var3]) {
                class91.field1468[var3] = true;
            }
            class267.field4263[var3] = class91.field1452[var3];
            class91.field1452[var3] = false;
        }
        class134.field2194 = null;
        class141.field2280 = -1;
        class225.field3311 = -1;
        class12.field139 = class199.field2930;
        class48.field669 = null;
        if (class1.field17 != -1) {
            class64.field968 = 0;
            class138.method1045(-8510);
        }
        class130.method984();
        class11.method86(1);
        if (class191.field2823) {
            if (class247.field3655) {
                class159.method1158((byte) -34);
            } else {
                class11.method87(0);
            }
        } else if (class134.field2194 != null) {
            class69.method525((byte) 100, class218.field3184, class161.field2499, class134.field2194);
        } else if (class225.field3311 != -1) {
            class69.method525((byte) 100, class225.field3311, class141.field2280, (class263) null);
        }
        int var4 = class191.field2823 ? -1 : class172.method1219((byte) -105);
        if (var4 == -1) {
            var4 = class298.field4792;
        }
        class287.method1963((byte) -41, var4);
        if (class267.field4277 == 1) {
            class267.field4277 = 2;
        }
        if (class293.field4669 == 1) {
            class293.field4669 = 2;
        }
        if (class281.field4530 == 3) {
            for (int var5 = 0; var5 < class64.field968; var5++) {
                if (class267.field4263[var5]) {
                    class130.method1003(class59.field873[var5], class76.field1188[var5], class267.field4276[var5], class186.field2772[var5], 16711935, 128);
                } else if (class91.field1468[var5]) {
                    class130.method1003(class59.field873[var5], class76.field1188[var5], class267.field4276[var5], class186.field2772[var5], 16711680, 128);
                }
            }
        }
        class226.method1567(class213.field3139.field3660, class126.field2126, 64, class37.field474, class213.field3139.field3753);
        class126.field2126 = 0;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Llc;ZDIIILib;)Lbc;")
    public final class148 method130(class270 arg0, boolean arg1, double arg2, int arg3, int arg4, int arg5, class61 arg6) {
        field204++;
        class52.method322(arg2, false);
        class143.field2314 = arg6;
        class179.field2671 = arg0;
        class92.method700(arg3, arg4, false);
        if (arg5 != 31949) {
            return null;
        }
        class148 var9 = new class148(arg3, arg4);
        for (int var10 = 0; var10 < this.field205.length; var10++) {
            this.field205[var10].method643(arg5 - 31694, arg4, arg3);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg4; var12++) {
            if (arg1) {
                var11 = var12;
            }
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field206.field1381) {
                int[] var18 = this.field206.method37(var12, false);
                var17 = var18;
                var15 = var18;
                var16 = var18;
            } else {
                int[][] var14 = this.field206.method143(var12, 6);
                var15 = var14[1];
                var16 = var14[0];
                var17 = var14[2];
            }
            for (int var19 = arg3 - 1; var19 >= 0; var19--) {
                int var20 = var15[var19] >> 4;
                int var21 = var16[var19] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var22 = class39.field523[var20];
                if (var21 < 0) {
                    var21 = 0;
                }
                int var23 = var17[var19] >> 4;
                int var24 = class39.field523[var21];
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = class39.field523[var23];
                var9.field2375[var11++] = (var24 << 16) + (var22 << 8) + var25;
                if (arg1) {
                    var11 += arg3 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field205.length; var13++) {
            this.field205[var13].method645((byte) -91);
        }
        return var9;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Llc;ILib;)Z")
    public final boolean method131(class270 arg0, int arg1, class61 arg2) {
        field199++;
        int var4 = 114 / ((-arg1 - 56) / 57);
        if (class212.field3118 > 0) {
            for (int var5 = 0; var5 < this.field209.length; var5++) {
                if (!arg0.method1890(10, class212.field3118, this.field209[var5])) {
                    return false;
                }
            }
        } else {
            for (int var6 = 0; var6 < this.field209.length; var6++) {
                if (!arg0.method1885(2, this.field209[var6])) {
                    return false;
                }
            }
        }
        for (int var7 = 0; var7 < this.field200.length; var7++) {
            if (!arg2.method241((byte) -102, this.field200[var7])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(Z)V")
    public static final void method132(boolean arg0) {
        if (!arg0) {
            method135((byte) 61);
        }
        class301.field4878.method1420((byte) -26);
        field197++;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(DZIILib;Llc;IZ)[I")
    public final int[] method133(double arg0, boolean arg1, int arg2, int arg3, class61 arg4, class270 arg5, int arg6, boolean arg7) {
        field207++;
        class52.method322(arg0, false);
        class179.field2671 = arg5;
        int[] var10 = new int[arg3 * arg6];
        class143.field2314 = arg4;
        class92.method700(arg3, arg6, false);
        for (int var11 = 0; var11 < this.field205.length; var11++) {
            this.field205[var11].method643(255, arg6, arg3);
        }
        int var12;
        int var13;
        byte var14;
        if (arg1) {
            var12 = arg3 - 1;
            var13 = -1;
            var14 = -1;
        } else {
            var13 = arg3;
            var12 = 0;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg6; var16++) {
            if (arg7) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field206.field1381) {
                int[] var22 = this.field206.method37(var16, false);
                var20 = var22;
                var19 = var22;
                var21 = var22;
            } else {
                int[][] var18 = this.field206.method143(var16, 6);
                var19 = var18[1];
                var20 = var18[0];
                var21 = var18[2];
            }
            for (int var23 = var12; var23 != var13; var23 += var14) {
                int var24 = var19[var23] >> 4;
                int var25 = var20[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var26 = var21[var23] >> 4;
                int var27 = class39.field523[var25];
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class39.field523[var24];
                int var29 = class39.field523[var26];
                var10[var15++] = (var27 << 16) + (var28 << 8) + var29;
                if (arg7) {
                    var15 += arg3 - 1;
                }
            }
        }
        if (arg2 != 1) {
            this.method133(0.8132260837741008D, true, -15, 64, (class61) null, (class270) null, -14, false);
        }
        for (int var17 = 0; var17 < this.field205.length; var17++) {
            this.field205[var17].method645((byte) -124);
        }
        return var10;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V")
    public static final void method134(int arg0, int arg1, String arg2, String arg3) {
        class269.field4325 = arg2;
        if (arg0 != 255) {
            return;
        }
        field195++;
        class263.field4141 = arg1;
        class161.field2491 = arg3;
        if (class161.field2491.equals("") || class269.field4325.equals("")) {
            class256.field3878 = 3;
        } else if (class114.field1884 == -1) {
            class98.field1673 = 0;
            class256.field3878 = -3;
            class32.field403 = 1;
            class101.field1709 = 0;
            class53 var4 = new class53(128);
            var4.method360(10, 25759);
            var4.method385((int) (Math.random() * 9.9999999E7D), 455748840);
            var4.method382(902642416, class143.method1064((byte) -128, class161.field2491));
            var4.method385((int) (Math.random() * 9.9999999E7D), 455748840);
            var4.method338(class269.field4325, arg0 ^ 0x74D);
            var4.method385((int) (Math.random() * 9.9999999E7D), 455748840);
            var4.method345(2713, class254.field3832, class283.field4554);
            class144.field2338.field735 = 0;
            class144.field2338.method360(24, arg0 ^ 0x6460);
            class144.field2338.method360(var4.field735 + 2, 25759);
            class144.field2338.method376(550, false);
            class144.field2338.method384(var4.field735, 0, var4.field758, 23037);
        } else {
            class78.method585(123);
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
    public class19() {
        this.field209 = new int[0];
        this.field200 = new int[0];
        this.field201 = new class166(0);
        this.field201.field1392 = 1;
        this.field206 = new class166();
        this.field206.field1392 = 1;
        this.field198 = new class166();
        this.field198.field1392 = 1;
        this.field205 = new class87[] { this.field206, this.field198, this.field201 };
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lhc;)V")
    public class19(class53 arg0) {
        int var2 = arg0.method366(-16505);
        this.field205 = new class87[var2];
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class87 var16 = class296.method2013(4, arg0);
            if (var16.method640(88) >= 0) {
                var3++;
            }
            if (var16.method644((byte) 110) >= 0) {
                var4++;
            }
            int var17 = var16.field1387.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method366(-16505);
            }
            this.field205[var6] = var16;
        }
        this.field200 = new int[var4];
        this.field209 = new int[var3];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class87 var11 = this.field205[var9];
            int var12 = var11.field1387.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field1387[var13] = this.field205[var5[var9][var13]];
            }
            int var14 = var11.method640(74);
            int var15 = var11.method644((byte) -123);
            if (var14 > 0) {
                this.field209[var7++] = var14;
            }
            if (var15 > 0) {
                this.field200[var8++] = var15;
            }
            var5[var9] = null;
        }
        Object var10 = null;
        this.field206 = this.field205[arg0.method366(-16505)];
        this.field198 = this.field205[arg0.method366(-16505)];
        this.field201 = this.field205[arg0.method366(-16505)];
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)V")
    public static void method135(byte arg0) {
        field203 = null;
        if (arg0 < 69) {
            method135((byte) -93);
        }
    }
}
