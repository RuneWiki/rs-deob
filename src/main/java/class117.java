import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class117 {

    @OriginalMember(owner = "client!re", name = "h", descriptor = "Lmb;")
    private static class84 field2791 = class79.method672(true, "Loading ignore list");

    @OriginalMember(owner = "client!re", name = "l", descriptor = "Lmb;")
    public static class84 field2795 = class79.method672(true, "Die Adresse dieses Computers wurde gesperrt)1");

    @OriginalMember(owner = "client!re", name = "r", descriptor = "Lmb;")
    public static class84 field2801 = class79.method672(true, "hitmarks");

    @OriginalMember(owner = "client!re", name = "s", descriptor = "Lmb;")
    public static class84 field2802 = class79.method672(true, "(U5");

    @OriginalMember(owner = "client!re", name = "o", descriptor = "Lmb;")
    private static class84 field2798 = class79.method672(true, "Bad session id)3");

    @OriginalMember(owner = "client!re", name = "m", descriptor = "Lmb;")
    public static class84 field2796 = field2798;

    @OriginalMember(owner = "client!re", name = "v", descriptor = "I")
    public static int field2805 = 0;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "Lmb;")
    public static class84 field2797 = class79.method672(true, "Die Verbindung konnte");

    @OriginalMember(owner = "client!re", name = "k", descriptor = "Lmb;")
    public static class84 field2794 = class79.method672(true, "Einloggen");

    @OriginalMember(owner = "client!re", name = "j", descriptor = "Lmb;")
    public static class84 field2793 = field2791;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "[I")
    public static int[] field2786;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "[I")
    public static int[] field2790;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "[Lr;")
    public static class112[] field2788;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "[Lsc;")
    public static class121[] field2804;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILf;IIIB)V")
    public static final void method948(int arg0, class36 arg1, int arg2, int arg3, int arg4, byte arg5) {
        class59 var6 = new class59();
        var6.field1467 = arg1.field760;
        if (arg5 != 93) {
            method953(false);
        }
        var6.field1477 = arg0 * 128;
        var6.field1479 = arg1.field768;
        var6.field1469 = arg1.field783;
        field2803++;
        var6.field1465 = arg4 * 128;
        var6.field1457 = arg1.field792;
        var6.field1459 = arg3;
        var6.field1460 = arg1.field800 * 128;
        int var7 = arg1.field767;
        int var8 = arg1.field756;
        if (arg2 == 1 || arg2 == 3) {
            var8 = arg1.field767;
            var7 = arg1.field756;
        }
        var6.field1456 = (arg4 + var7) * 128;
        var6.field1481 = (arg0 + var8) * 128;
        if (arg1.field802 != null) {
            var6.field1461 = arg1;
            var6.method519(true);
        }
        class62.field1536.method108(var6, -46);
        if (var6.field1479 != null) {
            var6.field1455 = (int) ((double) (var6.field1469 - var6.field1467) * Math.random()) + var6.field1467;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
    public static void method949(byte arg0) {
        field2796 = null;
        field2804 = null;
        field2791 = null;
        field2801 = null;
        field2802 = null;
        field2794 = null;
        field2797 = null;
        field2786 = null;
        field2788 = null;
        field2790 = null;
        field2793 = null;
        field2795 = null;
        int var1 = -75 / ((-arg0 - 3) / 61);
        field2798 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZLb;B)V")
    public static final void method950(boolean arg0, class8 arg1, byte arg2) {
        if (arg2 != 46) {
            method952(-45, false);
        }
        if (class1.field3 != null) {
            try {
                class1.field3.method38((byte) 61);
            } catch (Exception var8) {
            }
            class1.field3 = null;
        }
        class1.field3 = arg1;
        class5.method28(arg0, 0);
        class128.field3093 = null;
        class19.field395 = 0;
        class125.field3034 = null;
        field2800++;
        class72.field1764.field1128 = 0;
        while (true) {
            class96 var3 = (class96) class58.field1448.method962(true);
            if (var3 == null) {
                while (true) {
                    class96 var4 = (class96) class44.field974.method962(true);
                    if (var4 == null) {
                        if (class119.field2861 != 0) {
                            try {
                                class51 var5 = new class51(4);
                                var5.method393(4, -17343);
                                var5.method393(class119.field2861, -17343);
                                var5.method420(0, arg2 - 868202822);
                                class1.field3.method45(0, 4, (byte) 87, var5.field1084);
                            } catch (IOException var7) {
                                try {
                                    class1.field3.method38((byte) 61);
                                } catch (Exception var6) {
                                }
                                class1.field3 = null;
                                class58.field1450++;
                            }
                        }
                        class24.field565 = 0;
                        class95.field2341 = class77.method657(3745);
                        return;
                    }
                    class122.field2928.method782(var4, (byte) -15);
                    class108.field2603.method958(var4.field370, var4, 119);
                    class66.field1627++;
                    class11.field190--;
                }
            }
            class36.field793.method958(var3.field370, var3, -124);
            class102.field2488--;
            class92.field2285++;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public static final void method951(int arg0) {
        field2785++;
        if (arg0 != 1) {
            field2794 = null;
        }
        if (class115.field2745 != 0 || class125.field3019 != null) {
            return;
        }
        int var1 = class37.field831;
        if (class19.field409 && class83.field2034 >= 516 && class47.field1035 >= 160 && class83.field2034 <= 765 && class47.field1035 <= 205) {
            var1 = 0;
        }
        if (!class2.field42) {
            if (var1 == 1 && class20.field429 > 0) {
                int var12 = class2.field38[class20.field429 - 1];
                if (var12 == 35 || var12 == 31 || var12 == 26 || var12 == 44 || var12 == 25 || var12 == 53 || var12 == 49 || var12 == 22 || var12 == 50 || var12 == 24 || var12 == 37 || var12 == 1004) {
                    int var13 = client.field462[class20.field429 - 1];
                    int var14 = class46.field998[class20.field429 - 1];
                    class57 var15 = class97.method805(arg0 ^ 0xCAAE3E11, var14);
                    if (class98.method810(-114, class91.method780(arg0 ^ -150310623, var15)) || class91.method779(class91.method780(-150310624, var15), arg0 ^ 0x6F6B)) {
                        class120.field2869 = class83.field2034;
                        class143.field3431 = class47.field1035;
                        class64.field1576 = var14;
                        class49.field1049 = false;
                        class115.field2745 = 2;
                        if (var14 >> 16 == class79.field1958) {
                            class115.field2745 = 1;
                        }
                        class87.field2174 = var13;
                        if (var14 >> 16 == class83.field2038) {
                            class115.field2745 = 3;
                        }
                        class120.field2896 = 0;
                        return;
                    }
                }
            }
            if (var1 == 1 && (class92.field2293 == 1 || class8.method42(-19047, class20.field429 - 1)) && class20.field429 > 2) {
                var1 = 2;
            }
            if (var1 == 1 && class20.field429 > 0) {
                class44.method322(class20.field429 - 1, true);
            }
            if (var1 != 2 || class20.field429 <= 0) {
                return;
            }
            method954(96);
            return;
        }
        if (var1 != 1) {
            int var2 = class60.field1498;
            int var3 = class20.field427;
            if (field2784 == 0) {
                var2 -= 4;
                var3 -= 4;
            }
            if (field2784 == 1) {
                var2 -= 205;
                var3 -= 553;
            }
            if (field2784 == 2) {
                var3 -= 17;
                var2 -= 357;
            }
            if (var3 < class108.field2611 - 10 || class123.field2960 + class108.field2611 + 10 < var3 || var2 < class52.field1184 - 10 || var2 > class91.field2276 + class52.field1184 + 10) {
                if (field2784 == 1) {
                    class89.field2220 = true;
                }
                class2.field42 = false;
                if (field2784 == 2) {
                    class65.field1615 = true;
                }
            }
        }
        if (var1 != 1) {
            return;
        }
        int var4 = class108.field2611;
        int var5 = class52.field1184;
        int var6 = class123.field2960;
        int var7 = -1;
        int var8 = class83.field2034;
        int var9 = class47.field1035;
        if (field2784 == 0) {
            var9 -= 4;
            var8 -= 4;
        }
        if (field2784 == 1) {
            var9 -= 205;
            var8 -= 553;
        }
        if (field2784 == 2) {
            var8 -= 17;
            var9 -= 357;
        }
        for (int var10 = 0; var10 < class20.field429; var10++) {
            int var11 = (class20.field429 - var10 - 1) * 15 + var5 + 31;
            if (var8 > var4 && var8 < var4 + var6 && var11 - 13 < var9 && var11 + 3 > var9) {
                var7 = var10;
            }
        }
        if (var7 != -1) {
            class44.method322(var7, true);
        }
        if (field2784 == 2) {
            class65.field1615 = true;
        }
        class2.field42 = false;
        if (field2784 == 1) {
            class89.field2220 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IZ)V")
    public static final void method952(int arg0, boolean arg1) {
        field2787++;
        class2.field43 = arg1;
        if (class2.field43) {
            int var2 = class87.field2148.method409((byte) 27);
            int var3 = class87.field2148.method400((byte) 101);
            class87.field2148.method765(8);
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var22 = 0; var22 < 13; var22++) {
                    for (int var23 = 0; var23 < 13; var23++) {
                        int var24 = class87.field2148.method759(26024, 1);
                        if (var24 == 1) {
                            class90.field2258[var4][var22][var23] = class87.field2148.method759(26024, 26);
                        } else {
                            class90.field2258[var4][var22][var23] = -1;
                        }
                    }
                }
            }
            class87.field2148.method767(7);
            int var5 = (class86.field2128 - class87.field2148.field1128) / 16;
            class88.field2202 = new int[var5][4];
            for (int var6 = 0; var6 < var5; var6++) {
                for (int var21 = 0; var21 < 4; var21++) {
                    class88.field2202[var6][var21] = class87.field2148.method407(-75);
                }
            }
            int var7 = class87.field2148.method383(-2056200760);
            int var8 = class87.field2148.method383(-2056200760);
            int var9 = class87.field2148.method373(25094);
            class96.field2391 = new byte[var5][];
            class79.field1964 = new int[var5];
            class93.field2319 = new int[var5];
            class43.field955 = new int[var5];
            class40.field917 = new byte[var5][];
            int var10 = 0;
            for (int var11 = 0; var11 < 4; var11++) {
                for (int var12 = 0; var12 < 13; var12++) {
                    for (int var13 = 0; var13 < 13; var13++) {
                        int var14 = class90.field2258[var11][var12][var13];
                        if (var14 != -1) {
                            int var15 = var14 >> 14 & 0x3FF;
                            int var16 = var14 >> 3 & 0x7FF;
                            int var17 = (var15 / 8 << 8) + var16 / 8;
                            for (int var18 = 0; var18 < var10; var18++) {
                                if (class43.field955[var18] == var17) {
                                    var17 = -1;
                                    break;
                                }
                            }
                            if (var17 != -1) {
                                class43.field955[var10] = var17;
                                int var19 = var17 & 0xFF;
                                int var20 = var17 >> 8 & 0xFF;
                                class93.field2319[var10] = class59.field1462.method997(class13.method86(arg0, 13820), class51.method408(new class84[] { class15.field326, class93.method787(22245, var20), class98.field2417, class93.method787(arg0 + 8472, var19) }, -20));
                                class79.field1964[var10] = class59.field1462.method997(class13.method86(arg0, 13820), class51.method408(new class84[] { class115.field2751, class93.method787(22245, var20), class98.field2417, class93.method787(22245, var19) }, 124));
                                var10++;
                            }
                        }
                    }
                }
            }
            class57.method507(var2, var7, var8, var9, var3, true);
        } else {
            int var25 = class87.field2148.method417(65280);
            int var26 = class87.field2148.method417(arg0 + 51507);
            int var27 = (class86.field2128 - class87.field2148.field1128) / 16;
            class88.field2202 = new int[var27][4];
            for (int var28 = 0; var28 < var27; var28++) {
                for (int var37 = 0; var37 < 4; var37++) {
                    class88.field2202[var28][var37] = class87.field2148.method407(class13.method86(arg0, -13729));
                }
            }
            int var29 = class87.field2148.method400((byte) 122);
            boolean var30 = false;
            int var31 = class87.field2148.method373(arg0 + 11321);
            int var32 = class87.field2148.method383(-2056200760);
            class93.field2319 = new int[var27];
            class40.field917 = new byte[var27][];
            class79.field1964 = new int[var27];
            class43.field955 = new int[var27];
            if ((var25 / 8 == 48 || var25 / 8 == 49) && (var32 / 8) == 48) {
                var30 = true;
            }
            if (var25 / 8 == 48 && var32 / 8 == 148) {
                var30 = true;
            }
            class96.field2391 = new byte[var27][];
            int var33 = 0;
            for (int var34 = (var25 - 6) / 8; var34 <= (var25 + 6) / 8; var34++) {
                for (int var35 = (var32 - 6) / 8; var35 <= (var32 + 6) / 8; var35++) {
                    int var36 = (var34 << 8) + var35;
                    if (!var30 || var35 != 49 && var35 != 149 && var35 != 147 && var34 != 50 && (var34 != 49 || var35 != 47)) {
                        class43.field955[var33] = var36;
                        class93.field2319[var33] = class59.field1462.method997(49, class51.method408(new class84[] { class15.field326, class93.method787(22245, var34), class98.field2417, class93.method787(22245, var35) }, -33));
                        class79.field1964[var33] = class59.field1462.method997(49, class51.method408(new class84[] { class115.field2751, class93.method787(22245, var34), class98.field2417, class93.method787(22245, var35) }, -111));
                        var33++;
                    }
                }
            }
            class57.method507(var32, var26, var29, var31, var25, true);
        }
        if (arg0 != 13773) {
            method950(false, null, (byte) -17);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)V")
    public static final void method953(boolean arg0) {
        field2799++;
        class87.field2148.method765(8);
        int var1 = class87.field2148.method759(26024, 8);
        if (var1 < class77.field1940) {
            for (int var2 = var1; var2 < class77.field1940; var2++) {
                class96.field2379[class6.field119++] = class87.field2146[var2];
            }
        }
        if (var1 > class77.field1940) {
            throw new RuntimeException("gnpov1");
        }
        class77.field1940 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class87.field2146[var3];
            class103 var5 = class69.field1673[var4];
            int var6 = class87.field2148.method759(26024, 1);
            if (var6 == 0) {
                class87.field2146[class77.field1940++] = var4;
                var5.field3519 = class5.field100;
            } else {
                int var7 = class87.field2148.method759(26024, 2);
                if (var7 == 0) {
                    class87.field2146[class77.field1940++] = var4;
                    var5.field3519 = class5.field100;
                    class125.field3033[class96.field2385++] = var4;
                } else if (var7 == 1) {
                    class87.field2146[class77.field1940++] = var4;
                    var5.field3519 = class5.field100;
                    int var8 = class87.field2148.method759(26024, 3);
                    var5.method1181(false, 20789, var8);
                    int var9 = class87.field2148.method759(26024, 1);
                    if (var9 == 1) {
                        class125.field3033[class96.field2385++] = var4;
                    }
                } else if (var7 == 2) {
                    class87.field2146[class77.field1940++] = var4;
                    var5.field3519 = class5.field100;
                    int var10 = class87.field2148.method759(26024, 3);
                    var5.method1181(true, 20789, var10);
                    int var11 = class87.field2148.method759(26024, 3);
                    var5.method1181(true, 20789, var11);
                    int var12 = class87.field2148.method759(26024, 1);
                    if (var12 == 1) {
                        class125.field3033[class96.field2385++] = var4;
                    }
                } else if (var7 == 3) {
                    class96.field2379[class6.field119++] = var4;
                }
            }
        }
        if (arg0) {
            field2796 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
    public static final void method954(int arg0) {
        field2789++;
        if (arg0 != 96) {
            method953(false);
        }
        int var1 = class13.field239.method219(class2.field41);
        for (int var2 = 0; var2 < class20.field429; var2++) {
            int var12 = class13.field239.method200(class46.field994[var2]);
            if (var1 < var12) {
                var1 = var12;
            }
        }
        var1 += 8;
        int var3 = class20.field429 * 15 + 21;
        if (class122.field2948 != -1) {
            class123.field2960 = var1;
            class91.field2276 = class20.field429 * 15 + 22;
            field2784 = 0;
            class2.field42 = true;
            int var4 = class83.field2034 - var1 / 2;
            if (var1 + var4 > 765) {
                var4 = 765 - var1;
            }
            int var5 = class47.field1035;
            if (var3 + var5 > 503) {
                var5 = 503 - var3;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            class52.field1184 = var5;
            if (var4 < 0) {
                var4 = 0;
            }
            class108.field2611 = var4;
        } else if (class83.field2034 > 4 && class47.field1035 > 4 && class83.field2034 < 516 && class47.field1035 < 338) {
            class123.field2960 = var1;
            field2784 = 0;
            class91.field2276 = class20.field429 * 15 + 22;
            int var6 = class83.field2034 - var1 / 2 - 4;
            if (var1 + var6 > 512) {
                var6 = 512 - var1;
            }
            class2.field42 = true;
            if (var6 < 0) {
                var6 = 0;
            }
            class108.field2611 = var6;
            int var7 = class47.field1035 - 4;
            if (var3 + var7 > 334) {
                var7 = 334 - var3;
            }
            if (var7 < 0) {
                var7 = 0;
            }
            class52.field1184 = var7;
        } else if (class83.field2034 > 553 && class47.field1035 > 205 && class83.field2034 < 743 && class47.field1035 < 466) {
            class123.field2960 = var1;
            class2.field42 = true;
            int var8 = class83.field2034 - var1 / 2 - 553;
            class91.field2276 = class20.field429 * 15 + 22;
            field2784 = 1;
            int var9 = class47.field1035 - 205;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 + var1 > 190) {
                var8 = 190 - var1;
            }
            if (var9 < 0) {
                var9 = 0;
            } else if (var3 + var9 > 261) {
                var9 = 261 - var3;
            }
            class52.field1184 = var9;
            class108.field2611 = var8;
        } else if (class83.field2034 > 17 && class47.field1035 > 357 && class83.field2034 < 496 && class47.field1035 < 453) {
            class2.field42 = true;
            class91.field2276 = class20.field429 * 15 + 22;
            field2784 = 2;
            int var10 = class47.field1035 - 357;
            class123.field2960 = var1;
            if (var10 < 0) {
                var10 = 0;
            } else if (var3 + var10 > 96) {
                var10 = 96 - var3;
            }
            class52.field1184 = var10;
            int var11 = class83.field2034 - var1 / 2 - 17;
            if (var11 < 0) {
                var11 = 0;
            } else if (var1 + var11 > 479) {
                var11 = 479 - var1;
            }
            class108.field2611 = var11;
        }
    }
}
