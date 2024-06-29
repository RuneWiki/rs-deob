import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class140 {

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "J")
    public static long field2263 = 0L;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "[F")
    public static float[] field2271 = new float[4];

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "Z")
    public static boolean field2267 = true;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "Lpk;")
    public static class120 field2258;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "Lpk;")
    public static class120 field2262;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "[I")
    public static int[] field2261;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V", line = 5)
    public static void method1071(byte arg0) {
        if (arg0 > -123) {
            field2267 = true;
        }
        field2271 = null;
        field2262 = null;
        field2258 = null;
        field2261 = null;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)V", line = 18)
    public static final void method1072(byte arg0) {
        if (arg0 != -27) {
            field2271 = (float[]) null;
        }
        field2269++;
        if (class85.method678(-30) != 2) {
            return;
        }
        int var1 = class208.field3284 % 104;
        byte var2 = (byte) (class208.field3284 - 4 & 0xFF);
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                class242.field3621[var3][var1][var4] = var2;
            }
        }
        if (class75.field1153 == 3) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class225.field3492[var5] = -1000000;
            class32.field500[var5] = 1000000;
            class93.field1517[var5] = 0;
            class73.field1108[var5] = 1000000;
            class142.field2304[var5] = 0;
        }
        if (class73.field1112 != 1) {
            int var6 = class170.method1265(class152.field2498, class137.field2239, class75.field1153, 1);
            if (var6 - class332.field5180 < 800 && (class332.field5184[class75.field1153][class152.field2498 >> 7][class137.field2239 >> 7] & 0x4) != 0) {
                class281.method1980(false, arg0 + 1892, 1, class137.field2239 >> 7, class34.field521, class152.field2498 >> 7);
            }
            return;
        }
        if ((class332.field5184[class75.field1153][class345.field5363.field4671 >> 7][class345.field5363.field4672 >> 7] & 0x4) != 0) {
            class281.method1980(false, 1865, 0, class345.field5363.field4672 >> 7, class34.field521, class345.field5363.field4671 >> 7);
        }
        if (class43.field683 >= 310) {
            return;
        }
        int var7 = class345.field5363.field4671 >> 7;
        int var8 = class152.field2498 >> 7;
        int var9 = class137.field2239 >> 7;
        int var10 = class345.field5363.field4672 >> 7;
        int var11;
        if (var8 >= var7) {
            var11 = var8 - var7;
        } else {
            var11 = var7 - var8;
        }
        int var12;
        if (var10 > var9) {
            var12 = var10 - var9;
        } else {
            var12 = var9 - var10;
        }
        if (var11 == 0 && var12 == 0 || var11 <= -104 || var11 >= 104 || var12 <= -104 || var12 >= 104) {
            class79.method622("RC: " + var8 + "," + var9 + " " + var7 + "," + var10 + " " + class117.field1902 + "," + class133.field2118, (Throwable) null, -652852820);
            return;
        }
        if (var12 >= var11) {
            int var15 = var11 * 65536 / var12;
            int var16 = 32768;
            while (var9 != var10) {
                if (var10 > var9) {
                    var9++;
                } else if (var9 > var10) {
                    var9--;
                }
                if ((class332.field5184[class75.field1153][var8][var9] & 0x4) != 0) {
                    class281.method1980(false, 1865, 1, var9, class34.field521, var8);
                    break;
                }
                var16 += var15;
                if (var16 >= 65536) {
                    var16 -= 65536;
                    if (var8 < var7) {
                        var8++;
                    } else if (var8 > var7) {
                        var8--;
                    }
                    if ((class332.field5184[class75.field1153][var8][var9] & 0x4) != 0) {
                        class281.method1980(false, 1865, 1, var9, class34.field521, var8);
                        break;
                    }
                }
            }
            return;
        }
        int var13 = var12 * 65536 / var11;
        int var14 = 32768;
        while (var7 != var8) {
            if (var8 < var7) {
                var8++;
            } else if (var7 < var8) {
                var8--;
            }
            if ((class332.field5184[class75.field1153][var8][var9] & 0x4) != 0) {
                class281.method1980(false, 1865, 1, var9, class34.field521, var8);
                break;
            }
            var14 += var13;
            if (var14 >= 65536) {
                var14 -= 65536;
                if (var9 < var10) {
                    var9++;
                } else if (var10 < var9) {
                    var9--;
                }
                if ((class332.field5184[class75.field1153][var8][var9] & 0x4) != 0) {
                    class281.method1980(false, 1865, 1, var9, class34.field521, var8);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IILtk;I)V", line = 213)
    public static final void method1073(int arg0, int arg1, class266 arg2, int arg3) {
        field2259++;
        if (arg2.field4025 == 1) {
            class8.field202++;
            class147.method1121(0, arg2.field4102, arg2.field4088, "", -1, -32, 0L, (short) 24);
        }
        if (arg2.field4025 == 2 && !class315.field4977) {
            String var4 = class204.method1462(-1, arg2);
            if (var4 != null) {
                class147.method1121(-1, var4, arg2.field4088, "<col=00ff00>" + arg2.field4078, -1, arg0 ^ 0x7C, 0L, (short) 9);
                class188.field2949++;
            }
        }
        if (arg2.field4025 == 3) {
            class147.method1121(0, class281.field4411, arg2.field4088, "", -1, -78, 0L, (short) 26);
            class154.field2509++;
        }
        if (arg2.field4025 == 4) {
            class147.method1121(0, arg2.field4102, arg2.field4088, "", -1, -51, 0L, (short) 32);
            class60.field887++;
        }
        if (arg2.field4025 == 5) {
            class150.field2448++;
            class147.method1121(0, arg2.field4102, arg2.field4088, "", -1, 119, 0L, (short) 8);
        }
        if (arg2.field4025 == 6 && class49.field757 == null) {
            class22.field390++;
            class147.method1121(-1, arg2.field4102, arg2.field4088, "", -1, -33, 0L, (short) 25);
        }
        if (arg2.field4084 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg2.field4009; var6++) {
                for (int var7 = 0; var7 < arg2.field3987; var7++) {
                    int var8 = (arg2.field3999 + 32) * var7;
                    int var9 = (arg2.field4049 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg2.field3970[var5];
                        var9 += arg2.field3978[var5];
                    }
                    if (arg3 >= var8 && var9 <= arg1 && (var8 + 32) > arg3 && (var9 + 32) > arg1) {
                        class179.field2846 = var5;
                        class14.field305 = arg2;
                        if (arg2.field3928[var5] > 0) {
                            class257 var10 = client.method1867(arg2);
                            class135 var11 = class188.method1361(true, arg2.field3928[var5] - 1);
                            if (class25.field428 == 1 && var10.method1784((byte) 47)) {
                                if (class15.field311 != arg2.field4088 || class333.field5191 != var5) {
                                    class17.field337++;
                                    class147.method1121(var5, class93.field1522, arg2.field4088, class141.field2283 + " -> <col=ff9040>" + var11.field2200, -1, -4, (long) var11.field2156, (short) 29);
                                }
                            } else if (class315.field4977 && var10.method1784((byte) 47)) {
                                class139 var12 = class299.field4785 == -1 ? null : class331.method2317((byte) -30, class299.field4785);
                                if ((class36.field549 & 0x10) != 0 && (var12 == null || var11.method1032(class299.field4785, (byte) -48, var12.field2255) != var12.field2255)) {
                                    class147.method1121(var5, class129.field2067, arg2.field4088, class55.field848 + " -> <col=ff9040>" + var11.field2200, class301.field4797, -96, (long) var11.field2156, (short) 14);
                                    class296.field4742++;
                                }
                            } else {
                                class43.field681++;
                                String[] var13 = var11.field2188;
                                if (class106.field1748) {
                                    var13 = class180.method1319((byte) 79, var13);
                                }
                                if (var10.method1784((byte) 47)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 37;
                                            } else {
                                                var15 = 36;
                                            }
                                            class293.field4599++;
                                            class147.method1121(var5, var13[var14], arg2.field4088, "<col=ff9040>" + var11.field2200, -1, arg0 ^ -34, (long) var11.field2156, var15);
                                        }
                                    }
                                }
                                if (var10.method1785((byte) 58)) {
                                    class209.field3294++;
                                    class147.method1121(var5, class93.field1522, arg2.field4088, "<col=ff9040>" + var11.field2200, class116.field1880, 123, (long) var11.field2156, (short) 1);
                                }
                                if (var10.method1784((byte) 47) && var13 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var13[var16] != null) {
                                            byte var17 = 0;
                                            class179.field2853++;
                                            if (var16 == 0) {
                                                var17 = 35;
                                            }
                                            if (var16 == 1) {
                                                var17 = 15;
                                            }
                                            if (var16 == 2) {
                                                var17 = 2;
                                            }
                                            class147.method1121(var5, var13[var16], arg2.field4088, "<col=ff9040>" + var11.field2200, -1, -33, (long) var11.field2156, var17);
                                        }
                                    }
                                }
                                String[] var18 = arg2.field4044;
                                if (class106.field1748) {
                                    var18 = class180.method1319((byte) 87, var18);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; var19 >= 0; var19--) {
                                        if (var18[var19] != null) {
                                            class214.field3344++;
                                            byte var20 = 0;
                                            if (var19 == 0) {
                                                var20 = 51;
                                            }
                                            if (var19 == 1) {
                                                var20 = 28;
                                            }
                                            if (var19 == 2) {
                                                var20 = 13;
                                            }
                                            if (var19 == 3) {
                                                var20 = 43;
                                            }
                                            if (var19 == 4) {
                                                var20 = 33;
                                            }
                                            class147.method1121(var5, var18[var19], arg2.field4088, "<col=ff9040>" + var11.field2200, -1, arg0 - 41, (long) var11.field2156, var20);
                                        }
                                    }
                                }
                                class147.method1121(var5, class18.field342, arg2.field4088, "<col=ff9040>" + var11.field2200, class217.field3372, arg0 - 37, (long) var11.field2156, (short) 1006);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (arg2.field4043) {
            if (!class315.field4977) {
                for (int var21 = 9; var21 >= 5; var21--) {
                    String var22 = class181.method1327(arg2, 0, var21);
                    if (var22 != null) {
                        class147.method1121(arg2.field3958, var22, arg2.field4088, arg2.field3935, class242.method1708(var21, arg2, (byte) 127), arg0 - 75, (long) (var21 - -1), (short) 1004);
                        class253.field3726++;
                    }
                }
                String var23 = class204.method1462(arg0 - 1, arg2);
                if (var23 != null) {
                    class147.method1121(arg2.field3958, var23, arg2.field4088, arg2.field3935, -1, 118, 0L, (short) 9);
                    class188.field2949++;
                }
                for (int var24 = 4; var24 >= 0; var24--) {
                    String var25 = class181.method1327(arg2, 0, var24);
                    if (var25 != null) {
                        class147.method1121(arg2.field3958, var25, arg2.field4088, arg2.field3935, class242.method1708(var24, arg2, (byte) 124), arg0 - 25, (long) (var24 - -1), (short) 42);
                        class253.field3726++;
                    }
                }
                if (client.method1867(arg2).method1787(-32397)) {
                    if (arg2.field4085 == null) {
                        class147.method1121(arg2.field3958, class195.field3020, arg2.field4088, "", -1, arg0 + 126, 0L, (short) 25);
                    } else {
                        class147.method1121(arg2.field3958, arg2.field4085, arg2.field4088, "", -1, -4, 0L, (short) 25);
                    }
                    class22.field390++;
                }
            } else if (client.method1867(arg2).method1776((byte) 55) && (class36.field549 & 0x20) != 0) {
                class147.method1121(arg2.field3958, class129.field2067, arg2.field4088, class55.field848 + " -> " + arg2.field3935, class301.field4797, 124, 0L, (short) 19);
                class85.field1372++;
            }
        }
        if (arg0 != 0) {
            field2271 = (float[]) null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(B)V", line = 527)
    public static final void method1074(byte arg0) {
        if (arg0 != 99) {
            field2262 = (class120) null;
        }
        class110.field1786.method83(-108);
        class96.field1546.method1454(-31175);
        class181.field2874.method1454(-31175);
        field2270++;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BI)Z", line = 547)
    public static final boolean method1075(byte arg0, int arg1) {
        field2266++;
        if (arg0 >= -109) {
            field2267 = true;
        }
        return (-arg1 & arg1) == arg1;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)Lnn;", line = 562)
    public static final class44 method1076(int arg0) {
        field2264++;
        if (arg0 != 26) {
            method1071((byte) 28);
        }
        return class117.field1892 < class175.field2802.length ? class175.field2802[class117.field1892++] : null;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V", line = 579)
    public static final void method1077(int arg0) {
        if (arg0 != -13) {
            return;
        }
        field2268++;
        int var1 = class37.field554;
        int var2 = class315.field4968;
        int var3 = class99.field1591;
        int var4 = class326.field5096 - 3;
        byte var5 = 20;
        if (class244.field3656 == null || class74.field1141 == null) {
            if (class176.field2815.method939((byte) 122, class185.field2935) && class176.field2815.method939((byte) 82, class68.field1034)) {
                class244.field3656 = class288.method2023(0, class185.field2935, (byte) -101, class176.field2815);
                class74.field1141 = class288.method2023(0, class68.field1034, (byte) -98, class176.field2815);
                if (class162.field2623) {
                    if ((class244.field3656 instanceof class224)) {
                        class244.field3656 = new class153((class317) class244.field3656);
                    } else {
                        class244.field3656 = new class196((class317) class244.field3656);
                    }
                    if ((class74.field1141 instanceof class224)) {
                        class74.field1141 = new class153((class317) class74.field1141);
                    } else {
                        class74.field1141 = new class196((class317) class74.field1141);
                    }
                }
            } else if (class162.field2623) {
                class114.method893(var1, var2, var3, var5, class184.field2921, 256 - class30.field461);
            } else {
                class33.method302(var1, var2, var3, var5, class184.field2921, 256 - class30.field461);
            }
        }
        if (class244.field3656 != null && class74.field1141 != null) {
            int var6 = (var3 - (class74.field1141.field1412 * 2)) / class244.field3656.field1412;
            for (int var7 = 0; var7 < var6; var7++) {
                class244.field3656.method698(var1 + (class244.field3656.field1412 * var7) + class74.field1141.field1412, var2);
            }
            class74.field1141.method698(var1, var2);
            class74.field1141.method699(var1 + var3 - class74.field1141.field1412, var2);
        }
        class146.field2392.method1480(class307.field4872, var1 + 3, var2 - -14, class216.field3359, -1);
        if (class162.field2623) {
            class114.method893(var1, var2 + var5, var3, var4 - var5, class184.field2921, 256 - class30.field461);
        } else {
            class33.method302(var1, var2 + var5, var3, var4 - var5, class184.field2921, 256 - class30.field461);
        }
        int var8 = class22.field389;
        int var9 = class303.field4832;
        for (int var10 = 0; var10 < class137.field2225; var10++) {
            int var11 = (class137.field2225 - var10 - 1) * 15 + var2 + var5 + 13;
            if (var1 < var9 && var1 + var3 > var9 && var8 > (var11 - 13) && var11 + 3 > var8) {
                if (class162.field2623) {
                    class114.method893(var1, var11 - 12, var3, 15, class288.field4531, 256 - class61.field897);
                } else {
                    class33.method302(var1, var11 - 12, var3, 15, class288.field4531, 256 - class61.field897);
                }
            }
        }
        if ((class4.field107 == null || class26.field441 == null || class152.field2496 == null) && class176.field2815.method939((byte) 105, class214.field3341) && class176.field2815.method939((byte) 75, class313.field4932) && class176.field2815.method939((byte) 57, class291.field4570)) {
            class4.field107 = class288.method2023(0, class214.field3341, (byte) -115, class176.field2815);
            class26.field441 = class288.method2023(0, class313.field4932, (byte) -56, class176.field2815);
            class152.field2496 = class288.method2023(0, class291.field4570, (byte) -87, class176.field2815);
            if (class162.field2623) {
                if (class4.field107 instanceof class224) {
                    class4.field107 = new class153((class317) class4.field107);
                } else {
                    class4.field107 = new class196((class317) class4.field107);
                }
                if ((class26.field441 instanceof class224)) {
                    class26.field441 = new class153((class317) class26.field441);
                } else {
                    class26.field441 = new class196((class317) class26.field441);
                }
                if (class152.field2496 instanceof class224) {
                    class152.field2496 = new class153((class317) class152.field2496);
                } else {
                    class152.field2496 = new class196((class317) class152.field2496);
                }
            }
        }
        if (class4.field107 != null && class26.field441 != null && class152.field2496 != null) {
            int var12 = (var3 - class152.field2496.field1412 * 2) / class4.field107.field1412;
            for (int var13 = 0; var13 < var12; var13++) {
                class4.field107.method698(class4.field107.field1412 * var13 + var1 + class152.field2496.field1412, -class4.field107.field1413 + var2 - -var4);
            }
            int var14 = (var4 - class152.field2496.field1413 - var5) / class26.field441.field1413;
            for (int var15 = 0; var15 < var14; var15++) {
                class26.field441.method698(var1, class26.field441.field1413 * var15 + (var2 + var5));
                class26.field441.method699(var1 + var3 - class26.field441.field1412, class26.field441.field1413 * var15 + (var2 - -var5));
            }
            class152.field2496.method698(var1, var2 + var4 - class152.field2496.field1413);
            class152.field2496.method699(var1 + var3 - class152.field2496.field1412, var2 + var4 + -class152.field2496.field1413);
        }
        for (int var16 = 0; var16 < class137.field2225; var16++) {
            int var17 = (class137.field2225 - var16 - 1) * 15 + var5 + var2 + 13;
            int var18 = class216.field3359;
            if (var9 > var1 && var9 < (var1 + var3) && (var17 - 13) < var8 && var8 < var17 + 3) {
                var18 = class30.field477;
            }
            class146.field2392.method1480(class71.method574(78, var16), var1 + 3, var17, var18, 0);
        }
        class280.method1972(class37.field554, class315.field4968, (byte) 107, class326.field5096, class99.field1591);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIZIIIIII)V", line = 753)
    public static final void method1078(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field2260++;
        int var12 = arg10 - arg6;
        int var13 = arg2 - arg3;
        int var14 = -1;
        if (class160.field2603 > 0) {
            if (class157.field2569 > 10) {
                var14 = (10 + 10 - class157.field2569) * 5;
            } else {
                var14 = class157.field2569 * 5;
            }
        }
        if (arg9 != 1701673542) {
            return;
        }
        int var15 = 983040 / arg1;
        int var16 = 983040 / arg8;
        for (int var17 = -var15; var17 < (var12 + var15); var17++) {
            int var18 = arg1 * var17 + arg4 >> 16;
            int var19 = (var17 + 1) * arg1 + arg4 >> 16;
            int var20 = var19 - var18;
            if (var20 > 0) {
                int var10000 = arg0 + var19;
                int var22 = arg0 + var18;
                int var23 = arg6 + var17 >> 6;
                if (var23 >= 0 && var23 <= (class191.field2989.length - 1)) {
                    int[][] var24 = class191.field2989[var23];
                    for (int var25 = -var16; var25 < (var13 + var16); var25++) {
                        int var26 = arg8 * var25 + arg7 >> 16;
                        int var27 = (var25 + 1) * arg8 + arg7 >> 16;
                        int var28 = var27 - var26;
                        if (var28 > 0) {
                            int var29 = arg11 + var26;
                            var10000 = arg11 + var27;
                            int var31 = arg3 + var25 >> 6;
                            if (var31 >= 0 && var31 <= (var24.length - 1) && var24[var31] != null) {
                                int var32 = (arg3 + var25 & 0x3F << 6) + (arg6 + var17 & 0x3F);
                                int var33 = var24[var31][var32];
                                if (var33 != 0) {
                                    class101 var34 = class288.method2025(var33 - 1, -1);
                                    if (!class122.field1988[var34.field1613]) {
                                        if (var14 != -1 && class244.field3657 == var34.field1613) {
                                            class172 var35 = new class172();
                                            var35.field2760 = var22;
                                            var35.field2765 = var34.field1613;
                                            var35.field2764 = var29;
                                            class180.field2865.method277(var35, (byte) -119);
                                        } else {
                                            class71.field1092[var34.field1613].method698(var22 - 7, var29 - 7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class172 var36 = (class172) class180.field2865.method268(arg9 - 1701673543); var36 != null; var36 = (class172) class180.field2865.method278(1)) {
            class33.method303(var36.field2760, var36.field2764, 15, 16776960, var14);
            class33.method303(var36.field2760, var36.field2764, 13, 16776960, var14);
            class33.method303(var36.field2760, var36.field2764, 11, 16776960, var14);
            class33.method303(var36.field2760, var36.field2764, 9, 16776960, var14);
            class71.field1092[var36.field2765].method698(var36.field2760 - 7, var36.field2764 + -7);
        }
        class180.field2865.method266(-20840);
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)V", line = 878)
    public static final void method1079(int arg0) {
        if (arg0 != -1) {
            method1079(-88);
        }
        field2265++;
        class311.field4915.method2282((byte) -125);
    }
}
