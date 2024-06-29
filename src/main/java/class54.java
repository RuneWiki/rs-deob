import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class54 {

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "[I")
    public static int[] field1112 = new int[32];

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "Lkh;")
    public static class117 field1113 = class224.method1450((byte) 109, "Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "Z")
    public static volatile boolean field1110 = true;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "Lkh;")
    public static class117 field1109 = class224.method1450((byte) -86, "Abbrechen");

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "Lkh;")
    public static class117 field1115 = class224.method1450((byte) 108, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "Lkh;")
    public static class117 field1116 = class224.method1450((byte) 125, "logo");

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lsb;Z)V")
    public static final void method414(class199 arg0, boolean arg1) {
        field1108++;
        if (class45.field987) {
            class226.method1464(-1637, arg0);
            return;
        }
        if (!arg1) {
            method419(121);
        }
        if (class215.field3907 == 1 && class187.field3353 >= 715 && class41.field929 >= 453) {
            class61.field1228 = !class61.field1228;
            if (class61.field1228) {
                class248.method1622(true);
            } else {
                class93.method641(class76.field1453, 0, false, 255, class117.field2187, 16419);
            }
        }
        if (class150.field2736 == 5) {
            return;
        }
        class30.field721++;
        if (class150.field2736 != 10) {
            return;
        }
        if (class143.field2588 != 2) {
            if (class215.field3907 == 1) {
                byte var2 = 5;
                short var3 = 463;
                byte var4 = 100;
                byte var5 = 35;
                if (class187.field3353 >= var2 && class187.field3353 <= var2 + var4 && class41.field929 >= var3 && class41.field929 <= var3 + var5) {
                    class124.method865(1875);
                    return;
                }
            }
            if (class66.field1277 != null) {
                class124.method865(1875);
            }
        }
        int var6 = class215.field3907;
        int var7 = class41.field929;
        int var8 = class187.field3353;
        if (class103.field1876 == 0) {
            short var9 = 302;
            short var10 = 291;
            boolean var11 = false;
            if (var6 == 1 && var9 - 75 <= var8 && var8 <= var9 + 75 && var7 >= var10 - 20 && var7 <= var10 + 20) {
                class32.field746 = 0;
                class103.field1876 = 3;
            }
            if (class30.field723 != 0) {
                while (class119.method834(-118)) {
                    if (class223.field4024 == 84) {
                        var11 = true;
                        break;
                    }
                }
            }
            short var12 = 462;
            if (var11 || var6 == 1 && var12 - 75 <= var8 && var12 + 75 >= var8 && var10 - 20 <= var7 && var7 <= var10 + 20) {
                class32.field746 = 0;
                class13.field422 = class243.field4407;
                class13.field409 = class173.field3125;
                class103.field1876 = 2;
                class13.field413 = class243.field4478;
            }
        } else if (class103.field1876 == 2) {
            short var15 = 302;
            short var16 = 231;
            short var17 = 321;
            int var21 = var16 + 30;
            if (var6 == 1 && var21 - 15 <= var7 && var7 < var21) {
                class32.field746 = 0;
            }
            var21 += 15;
            if (var6 == 1 && var7 >= var21 - 15 && var21 > var7) {
                class32.field746 = 1;
            }
            var21 += 15;
            if (var6 == 1 && var8 >= var15 - 75 && var8 <= var15 + 75 && var17 - 20 <= var7 && var7 <= var17 + 20) {
                class13.field404 = class13.field404.method776(118).method796((byte) -40);
                if (class13.field404.method819((byte) -85) == 0) {
                    class159.method1133(class243.field4438, class38.field869, 121, class243.field4433);
                    return;
                }
                if (class13.field402.method819((byte) -105) == 0) {
                    class159.method1133(class243.field4444, class139.field2529, 110, class243.field4420);
                    return;
                }
                class159.method1133(class243.field4441, class195.field3486, -104, class243.field4403);
                class94.method647(20, (byte) -108);
                return;
            }
            short var18 = 462;
            if (var6 == 1 && var18 - 75 <= var8 && var8 <= var18 + 75 && var17 - 20 <= var7 && var17 + 20 >= var7) {
                class103.field1876 = 0;
                class13.field402 = class13.field414;
                class13.field404 = class13.field414;
            }
            while (true) {
                while (class119.method834(-127)) {
                    boolean var19 = false;
                    for (int var20 = 0; var20 < class110.field2067.method819((byte) -89); var20++) {
                        if (class143.field2590 == class110.field2067.method777(true, var20)) {
                            var19 = true;
                            break;
                        }
                    }
                    if (class32.field746 == 0) {
                        if (class223.field4024 == 85 && class13.field404.method819((byte) -119) > 0) {
                            class13.field404 = class13.field404.method781(true, 0, class13.field404.method819((byte) -92) - 1);
                        }
                        if (class223.field4024 == 84 || class223.field4024 == 80) {
                            class32.field746 = 1;
                        }
                        if (var19 && class13.field404.method819((byte) -106) < 12) {
                            class13.field404 = class13.field404.method783(65, class143.field2590);
                        }
                    } else if (class32.field746 == 1) {
                        if (class223.field4024 == 85 && class13.field402.method819((byte) -115) > 0) {
                            class13.field402 = class13.field402.method781(true, 0, class13.field402.method819((byte) -91) - 1);
                        }
                        if (class223.field4024 == 84 || class223.field4024 == 80) {
                            class32.field746 = 0;
                        }
                        if (class30.field723 != 0 && class223.field4024 == 84) {
                            class13.field404 = class13.field404.method776(92).method796((byte) -40);
                            if (class13.field404.method819((byte) -111) == 0) {
                                class159.method1133(class243.field4438, class38.field869, -102, class243.field4433);
                                return;
                            }
                            if (class13.field402.method819((byte) -116) == 0) {
                                class159.method1133(class243.field4444, class139.field2529, -77, class243.field4420);
                                return;
                            }
                            class159.method1133(class243.field4441, class195.field3486, 81, class243.field4403);
                            class94.method647(20, (byte) -123);
                            return;
                        }
                        if (var19 && class13.field402.method819((byte) -111) < 20) {
                            class13.field402 = class13.field402.method783(65, class143.field2590);
                        }
                    }
                }
                return;
            }
        } else if (class103.field1876 == 3) {
            short var13 = 382;
            short var14 = 321;
            if (var6 == 1 && var13 - 75 <= var8 && var8 <= var13 + 75 && var14 - 20 <= var7 && var14 + 20 >= var7) {
                class103.field1876 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
    public static void method415(int arg0) {
        field1116 = null;
        field1112 = null;
        field1113 = null;
        int var1 = -40 / ((arg0 - 61) / 41);
        field1109 = null;
        field1115 = null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIBII)V")
    public static final void method416(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class21.field564++;
        class79.method549(50, true);
        field1106++;
        class84.method592(true, -64);
        class79.method549(50, false);
        class84.method592(false, -64);
        class98.method669(-1);
        class106.method709((byte) -48);
        if (!class162.field2967) {
            int var5 = class139.field2532;
            int var6 = client.field776 + class80.field1505 & 0x7FF;
            if (var5 < class56.field1162 / 256) {
                var5 = class56.field1162 / 256;
            }
            if (class243.field4405[4] && class6.field96[4] + 128 > var5) {
                var5 = class6.field96[4] + 128;
            }
            class52.method394(class246.field4536, class48.field1010, (byte) 45, class186.method1265(true, class93.field1712.field4221, class203.field3675, class93.field1712.field4244) - 50, var5 * 3 + 600, var5, arg1, var6);
        }
        int var7;
        if (class162.field2967) {
            var7 = class186.method1267(-1547629337);
        } else {
            var7 = class23.method203(-1);
        }
        int var8 = class19.field535;
        int var9 = class31.field732;
        int var10 = class186.field3339;
        int var11 = class150.field2726;
        int var12 = class86.field1626;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class243.field4405[var13]) {
                int var22 = (int) ((double) -class225.field4063[var13] + (double) (class225.field4063[var13] * 2 + 1) * Math.random() + Math.sin((double) class230.field4142[var13] / 100.0D * (double) class75.field1427[var13]) * (double) class6.field96[var13]);
                if (var13 == 2) {
                    class186.field3339 += var22;
                }
                if (var13 == 1) {
                    class31.field732 += var22;
                }
                if (var13 == 4) {
                    class150.field2726 += var22;
                    if (class150.field2726 < 128) {
                        class150.field2726 = 128;
                    }
                    if (class150.field2726 > 383) {
                        class150.field2726 = 383;
                    }
                }
                if (var13 == 0) {
                    class19.field535 += var22;
                }
                if (var13 == 3) {
                    class86.field1626 = class86.field1626 + var22 & 0x7FF;
                }
            }
        }
        int var14 = 121 / ((-arg2 - 74) / 32);
        boolean var15 = false;
        class83.method575(arg4, arg0, arg4 + arg3, arg0 + arg1);
        class89.method614();
        int var16 = class137.field2479;
        int var17 = class199.field3571;
        if (var16 >= arg4 && var16 < arg3 + arg4 && var17 >= arg0 && arg0 + arg1 > var17) {
            class195.field3488 = true;
            class158.field2867 = 0;
            int var18 = class151.field2745;
            int var19 = class200.field3616;
            int var20 = class170.field3056;
            class127.field2351 = (var18 - var20) * (class137.field2479 - arg4) / arg3 + var20;
            int var21 = class205.field3695;
            class84.field1586 = (class199.field3571 - arg0) * (var21 - var19) / arg1 + var19;
        } else {
            class195.field3488 = false;
            class158.field2867 = 0;
        }
        class93.method637(10000);
        class83.method579(arg4, arg0, arg3, arg1, 0);
        if (!var15) {
            class130.method883(class19.field535, class31.field732, class186.field3339, class150.field2726, class86.field1626, var7, null, null, null, null, null, null, 0, (byte) 0, class93.field1712.field4244 >> 7, class93.field1712.field4221 >> 7);
        }
        class93.method637(10000);
        class115.method767();
        class38.method336(arg0, 256, arg1, arg4, arg3, (byte) -83, 256);
        class31.method269(arg0, 256, arg3, false, arg1, 256, arg4);
        ((class76) class89.field1657).method529(class28.field691, (byte) -17);
        class177.method1232(arg1, 15, arg3, arg4, arg0);
        class86.field1626 = var12;
        class31.field732 = var9;
        class150.field2726 = var11;
        class19.field535 = var8;
        class186.field3339 = var10;
        if (class224.field4044 && class217.method1424(true, (byte) 70, false) == 0) {
            class224.field4044 = false;
        }
        if (class224.field4044) {
            class83.method579(arg4, arg0, arg3, arg1, 0);
            class223.method1448(class61.field1220, 1, false);
        }
        if (!class224.field4044 && !class182.field3289 && var16 >= arg4 && arg3 + arg4 > var16 && arg0 <= var17 && var17 < arg0 + arg1) {
            class117.method801(arg0, arg4, var17, arg3, 71, arg1, var16);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lab;IIIZIIZIZII)V")
    public static final void method417(class3 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, boolean arg7, int arg8, boolean arg9, int arg10, int arg11) {
        field1105++;
        if (arg4 && (class233.field4200[0][arg6][arg11] & 0x2) == 0) {
            if ((class233.field4200[arg5][arg6][arg11] & 0x10) != 0) {
                return;
            }
            if (class40.method353(arg11, arg5, arg6, -126) != class228.field4104) {
                return;
            }
        }
        if (class33.field770 > arg5) {
            class33.field770 = arg5;
        }
        class211 var12 = class48.method379(arg1 + 27232, arg8);
        int var13;
        int var14;
        if (arg10 == 1 || arg10 == 3) {
            var13 = var12.field3804;
            var14 = var12.field3814;
        } else {
            var13 = var12.field3814;
            var14 = var12.field3804;
        }
        int var15;
        int var16;
        if (arg11 + var14 <= 104) {
            var15 = (var14 + 1 >> 1) + arg11;
            var16 = (var14 >> 1) + arg11;
        } else {
            var15 = arg11 + 1;
            var16 = arg11;
        }
        int var17;
        int var18;
        if (arg6 + var13 <= 104) {
            var17 = arg6 + (var13 >> 1);
            var18 = (var13 + 1 >> 1) + arg6;
        } else {
            var17 = arg6;
            var18 = arg6 + 1;
        }
        int[][] var19 = class156.field2839[arg2];
        int var20 = var19[var17][var15] + var19[var17][var16] + var19[var18][var15] + var19[var18][var16] >> 2;
        int var21 = (arg11 << 7) + (var14 << 6);
        int var22 = (arg6 << 7) + (var13 << 6);
        long var23 = (long) (arg11 << 7 | arg6 | arg3 << 14 | arg10 << 20 | 0x40000000);
        if (var12.field3821 == 0 || arg7) {
            var23 |= Long.MIN_VALUE;
        }
        int[][] var25 = null;
        if (arg7) {
            var25 = class146.field2684[0];
        } else if (arg2 < 3) {
            var25 = class156.field2839[arg2 + 1];
        }
        if (var12.field3775 == 1) {
            var23 |= 0x400000L;
        }
        if (arg9 && var12.method1381(128)) {
            class136.method911(arg6, arg1 ^ 0x6984, var12, arg5, arg11, arg10);
        }
        long var26 = var23 | (long) arg8 << 32;
        if (arg3 == 22) {
            if (!arg4 || var12.field3821 != 0 || var12.field3811 == 1 || var12.field3772) {
                class38 var29;
                if (var12.field3782 == -1 && var12.field3792 == null) {
                    class1 var28 = var12.method1383(var20, var19, var25, var22, 22, (byte) -109, var21, arg9, arg10);
                    var29 = var28.field17;
                } else {
                    var29 = new class45(arg8, 22, arg10, arg2, arg6, arg11, var12.field3782, var12.field3824, null);
                }
                class136.method906(arg5, arg6, arg11, var20, var29, var26, var12.field3770);
                if (var12.field3811 == 1 && arg0 != null) {
                    arg0.method16(arg11, arg6, 262144);
                }
            }
        } else if (arg3 == 10 || arg3 == 11) {
            class38 var69;
            if (var12.field3782 == -1 && var12.field3792 == null) {
                class1 var68 = var12.method1383(var20, var19, var25, var22, 10, (byte) -114, var21, arg9, arg10);
                var69 = var68.field17;
            } else {
                var69 = new class45(arg8, 10, arg10, arg2, arg6, arg11, var12.field3782, var12.field3824, null);
            }
            if (var69 != null) {
                boolean var70 = class240.method1523(arg5, arg6, arg11, var20, var13, var14, var69, arg3 == 11 ? 256 : 0, var26);
                if (var12.field3788 && var70 && arg9) {
                    int var71 = 15;
                    if (var69 instanceof class29) {
                        var71 = ((class29) var69).method258() / 4;
                        if (var71 > 30) {
                            var71 = 30;
                        }
                    }
                    for (int var72 = 0; var72 <= var13; var72++) {
                        for (int var73 = 0; var73 <= var14; var73++) {
                            if (class225.field4049[arg5][arg6 + var72][arg11 + var73] < var71) {
                                class225.field4049[arg5][arg6 + var72][arg11 + var73] = (byte) var71;
                            }
                        }
                    }
                }
            }
            if (var12.field3811 != 0 && arg0 != null) {
                arg0.method26(arg6, arg11, -1, var12.field3825, var14, var13);
            }
        } else {
            if (arg1 != -27121) {
                field1113 = null;
            }
            if (arg3 >= 12) {
                class38 var31;
                if (var12.field3782 == -1 && var12.field3792 == null) {
                    class1 var30 = var12.method1383(var20, var19, var25, var22, arg3, (byte) -111, var21, arg9, arg10);
                    var31 = var30.field17;
                } else {
                    var31 = new class45(arg8, arg3, arg10, arg2, arg6, arg11, var12.field3782, var12.field3824, null);
                }
                class240.method1523(arg5, arg6, arg11, var20, 1, 1, var31, 0, var26);
                if (arg9 && arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg5 > 0) {
                    class38.field873[arg5][arg6][arg11] = class40.method352(class38.field873[arg5][arg6][arg11], 2340);
                }
                if (var12.field3811 != 0 && arg0 != null) {
                    arg0.method26(arg6, arg11, arg1 + 27120, var12.field3825, var14, var13);
                }
            } else if (arg3 == 0) {
                class38 var33;
                if (var12.field3782 == -1 && var12.field3792 == null) {
                    class1 var32 = var12.method1383(var20, var19, var25, var22, 0, (byte) -121, var21, arg9, arg10);
                    var33 = var32.field17;
                } else {
                    var33 = new class45(arg8, 0, arg10, arg2, arg6, arg11, var12.field3782, var12.field3824, null);
                }
                class135.method901(arg5, arg6, arg11, var20, var33, null, class56.field1169[arg10], 0, var26);
                if (arg9) {
                    if (arg10 == 0) {
                        if (var12.field3788) {
                            class225.field4049[arg5][arg6][arg11] = 50;
                            class225.field4049[arg5][arg6][arg11 + 1] = 50;
                        }
                        if (var12.field3790) {
                            class38.field873[arg5][arg6][arg11] = class40.method352(class38.field873[arg5][arg6][arg11], 585);
                        }
                    } else if (arg10 == 1) {
                        if (var12.field3788) {
                            class225.field4049[arg5][arg6][arg11 + 1] = 50;
                            class225.field4049[arg5][arg6 + 1][arg11 + 1] = 50;
                        }
                        if (var12.field3790) {
                            class38.field873[arg5][arg6][arg11 + 1] = class40.method352(class38.field873[arg5][arg6][arg11 + 1], 1170);
                        }
                    } else if (arg10 == 2) {
                        if (var12.field3788) {
                            class225.field4049[arg5][arg6 + 1][arg11] = 50;
                            class225.field4049[arg5][arg6 + 1][arg11 + 1] = 50;
                        }
                        if (var12.field3790) {
                            class38.field873[arg5][arg6 + 1][arg11] = class40.method352(class38.field873[arg5][arg6 + 1][arg11], 585);
                        }
                    } else if (arg10 == 3) {
                        if (var12.field3788) {
                            class225.field4049[arg5][arg6][arg11] = 50;
                            class225.field4049[arg5][arg6 + 1][arg11] = 50;
                        }
                        if (var12.field3790) {
                            class38.field873[arg5][arg6][arg11] = class40.method352(class38.field873[arg5][arg6][arg11], 1170);
                        }
                    }
                }
                if (var12.field3811 != 0 && arg0 != null) {
                    arg0.method23(arg11, var12.field3825, arg10, arg3, (byte) 94, arg6);
                }
                if (var12.field3802 != 16) {
                    class221.method1439(arg5, arg6, arg11, var12.field3802);
                }
            } else if (arg3 == 1) {
                class38 var35;
                if (var12.field3782 == -1 && var12.field3792 == null) {
                    class1 var34 = var12.method1383(var20, var19, var25, var22, 1, (byte) -117, var21, arg9, arg10);
                    var35 = var34.field17;
                } else {
                    var35 = new class45(arg8, 1, arg10, arg2, arg6, arg11, var12.field3782, var12.field3824, null);
                }
                class135.method901(arg5, arg6, arg11, var20, var35, null, class37.field847[arg10], 0, var26);
                if (var12.field3788 && arg9) {
                    if (arg10 == 0) {
                        class225.field4049[arg5][arg6][arg11 + 1] = 50;
                    } else if (arg10 == 1) {
                        class225.field4049[arg5][arg6 + 1][arg11 + 1] = 50;
                    } else if (arg10 == 2) {
                        class225.field4049[arg5][arg6 + 1][arg11] = 50;
                    } else if (arg10 == 3) {
                        class225.field4049[arg5][arg6][arg11] = 50;
                    }
                }
                if (var12.field3811 != 0 && arg0 != null) {
                    arg0.method23(arg11, var12.field3825, arg10, arg3, (byte) 94, arg6);
                }
            } else if (arg3 == 2) {
                int var36 = arg10 + 1 & 0x3;
                class38 var38;
                class38 var40;
                if (var12.field3782 == -1 && var12.field3792 == null) {
                    class1 var37 = var12.method1383(var20, var19, var25, var22, 2, (byte) -111, var21, arg9, arg10 + 4);
                    var38 = var37.field17;
                    class1 var39 = var12.method1383(var20, var19, var25, var22, 2, (byte) -118, var21, arg9, var36);
                    var40 = var39.field17;
                } else {
                    var38 = new class45(arg8, 2, arg10 + 4, arg2, arg6, arg11, var12.field3782, var12.field3824, null);
                    var40 = new class45(arg8, 2, var36, arg2, arg6, arg11, var12.field3782, var12.field3824, null);
                }
                class135.method901(arg5, arg6, arg11, var20, var38, var40, class56.field1169[arg10], class56.field1169[var36], var26);
                if (var12.field3790 && arg9) {
                    if (arg10 == 0) {
                        class38.field873[arg5][arg6][arg11] = class40.method352(class38.field873[arg5][arg6][arg11], 585);
                        class38.field873[arg5][arg6][arg11 + 1] = class40.method352(class38.field873[arg5][arg6][arg11 + 1], 1170);
                    } else if (arg10 == 1) {
                        class38.field873[arg5][arg6][arg11 + 1] = class40.method352(class38.field873[arg5][arg6][arg11 + 1], 1170);
                        class38.field873[arg5][arg6 + 1][arg11] = class40.method352(class38.field873[arg5][arg6 + 1][arg11], 585);
                    } else if (arg10 == 2) {
                        class38.field873[arg5][arg6 + 1][arg11] = class40.method352(class38.field873[arg5][arg6 + 1][arg11], 585);
                        class38.field873[arg5][arg6][arg11] = class40.method352(class38.field873[arg5][arg6][arg11], 1170);
                    } else if (arg10 == 3) {
                        class38.field873[arg5][arg6][arg11] = class40.method352(class38.field873[arg5][arg6][arg11], 1170);
                        class38.field873[arg5][arg6][arg11] = class40.method352(class38.field873[arg5][arg6][arg11], 585);
                    }
                }
                if (var12.field3811 != 0 && arg0 != null) {
                    arg0.method23(arg11, var12.field3825, arg10, arg3, (byte) 94, arg6);
                }
                if (var12.field3802 != 16) {
                    class221.method1439(arg5, arg6, arg11, var12.field3802);
                }
            } else if (arg3 == 3) {
                class38 var42;
                if (var12.field3782 == -1 && var12.field3792 == null) {
                    class1 var41 = var12.method1383(var20, var19, var25, var22, 3, (byte) -112, var21, arg9, arg10);
                    var42 = var41.field17;
                } else {
                    var42 = new class45(arg8, 3, arg10, arg2, arg6, arg11, var12.field3782, var12.field3824, null);
                }
                class135.method901(arg5, arg6, arg11, var20, var42, null, class37.field847[arg10], 0, var26);
                if (var12.field3788 && arg9) {
                    if (arg10 == 0) {
                        class225.field4049[arg5][arg6][arg11 + 1] = 50;
                    } else if (arg10 == 1) {
                        class225.field4049[arg5][arg6 + 1][arg11 + 1] = 50;
                    } else if (arg10 == 2) {
                        class225.field4049[arg5][arg6 + 1][arg11] = 50;
                    } else if (arg10 == 3) {
                        class225.field4049[arg5][arg6][arg11] = 50;
                    }
                }
                if (var12.field3811 != 0 && arg0 != null) {
                    arg0.method23(arg11, var12.field3825, arg10, arg3, (byte) 94, arg6);
                }
            } else if (arg3 == 9) {
                class38 var44;
                if (var12.field3782 == -1 && var12.field3792 == null) {
                    class1 var43 = var12.method1383(var20, var19, var25, var22, arg3, (byte) -112, var21, arg9, arg10);
                    var44 = var43.field17;
                } else {
                    var44 = new class45(arg8, arg3, arg10, arg2, arg6, arg11, var12.field3782, var12.field3824, null);
                }
                class240.method1523(arg5, arg6, arg11, var20, 1, 1, var44, 0, var26);
                if (var12.field3811 != 0 && arg0 != null) {
                    arg0.method26(arg6, arg11, -1, var12.field3825, var14, var13);
                }
                if (var12.field3802 != 16) {
                    class221.method1439(arg5, arg6, arg11, var12.field3802);
                }
            } else if (arg3 == 4) {
                class38 var46;
                if (var12.field3782 == -1 && var12.field3792 == null) {
                    class1 var45 = var12.method1383(var20, var19, var25, var22, 4, (byte) -121, var21, arg9, arg10);
                    var46 = var45.field17;
                } else {
                    var46 = new class45(arg8, 4, arg10, arg2, arg6, arg11, var12.field3782, var12.field3824, null);
                }
                class34.method301(arg5, arg6, arg11, var20, var46, null, class56.field1169[arg10], 0, 0, 0, var26);
            } else if (arg3 == 5) {
                int var47 = 16;
                long var48 = class93.method640(arg5, arg6, arg11);
                if (var48 != 0L) {
                    var47 = class48.method379(50, (int) (var48 >>> 32) & Integer.MAX_VALUE).field3802;
                }
                class38 var51;
                if (var12.field3782 == -1 && var12.field3792 == null) {
                    class1 var50 = var12.method1383(var20, var19, var25, var22, 4, (byte) -115, var21, arg9, arg10);
                    var51 = var50.field17;
                } else {
                    var51 = new class45(arg8, 4, arg10, arg2, arg6, arg11, var12.field3782, var12.field3824, null);
                }
                class34.method301(arg5, arg6, arg11, var20, var51, null, class56.field1169[arg10], 0, class149.field2718[arg10] * var47, class218.field3963[arg10] * var47, var26);
            } else if (arg3 == 6) {
                long var52 = class93.method640(arg5, arg6, arg11);
                int var54 = 8;
                if (var52 != 0L) {
                    var54 = class48.method379(arg1 + 27202, (int) (var52 >>> 32) & Integer.MAX_VALUE).field3802 / 2;
                }
                class38 var56;
                if (var12.field3782 == -1 && var12.field3792 == null) {
                    class1 var55 = var12.method1383(var20, var19, var25, var22, 4, (byte) -118, var21, arg9, arg10 + 4);
                    var56 = var55.field17;
                } else {
                    var56 = new class45(arg8, 4, arg10 + 4, arg2, arg6, arg11, var12.field3782, var12.field3824, null);
                }
                class34.method301(arg5, arg6, arg11, var20, var56, null, 256, arg10, class149.field2715[arg10] * var54, class169.field3038[arg10] * var54, var26);
            } else if (arg3 == 7) {
                int var57 = arg10 + 2 & 0x3;
                class38 var59;
                if (var12.field3782 == -1 && var12.field3792 == null) {
                    class1 var58 = var12.method1383(var20, var19, var25, var22, 4, (byte) -109, var21, arg9, var57 + 4);
                    var59 = var58.field17;
                } else {
                    var59 = new class45(arg8, 4, var57 + 4, arg2, arg6, arg11, var12.field3782, var12.field3824, null);
                }
                class34.method301(arg5, arg6, arg11, var20, var59, null, 256, var57, 0, 0, var26);
            } else if (arg3 == 8) {
                int var60 = 8;
                long var61 = class93.method640(arg5, arg6, arg11);
                if (var61 != 0L) {
                    var60 = class48.method379(61, Integer.MAX_VALUE & (int) (var61 >>> 32)).field3802 / 2;
                }
                int var63 = arg10 + 2 & 0x3;
                class38 var65;
                class38 var67;
                if (var12.field3782 == -1 && var12.field3792 == null) {
                    class1 var64 = var12.method1383(var20, var19, var25, var22, 4, (byte) -117, var21, arg9, arg10 + 4);
                    var65 = var64.field17;
                    class1 var66 = var12.method1383(var20, var19, var25, var22, 4, (byte) -118, var21, arg9, var63 + 4);
                    var67 = var66.field17;
                } else {
                    var65 = new class45(arg8, 4, arg10 + 4, arg2, arg6, arg11, var12.field3782, var12.field3824, null);
                    var67 = new class45(arg8, 4, var63 + 4, arg2, arg6, arg11, var12.field3782, var12.field3824, null);
                }
                class34.method301(arg5, arg6, arg11, var20, var65, var67, 256, arg10, class149.field2715[arg10] * var60, class169.field3038[arg10] * var60, var26);
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BI)Lkh;")
    public static final class117 method418(byte arg0, int arg1) {
        if (arg0 > -121) {
            field1109 = null;
        }
        field1111++;
        return class36.method316((byte) -34, new class117[] { class42.method358(arg1 >> 24 & 0xFF, (byte) 34), class149.field2717, class42.method358(arg1 >> 16 & 0xFF, (byte) 34), class149.field2717, class42.method358(arg1 >> 8 & 0xFF, (byte) 34), class149.field2717, class42.method358(arg1 & 0xFF, (byte) 34) });
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)V")
    public static final void method419(int arg0) {
        field1107++;
        for (class124 var1 = (class124) class18.field523.method314((byte) -26); var1 != null; var1 = (class124) class18.field523.method320(0)) {
            if (var1.field2308 != null) {
                class187.field3351.method1528(var1.field2308);
                var1.field2308 = null;
            }
            if (var1.field2322 != null) {
                class187.field3351.method1528(var1.field2322);
                var1.field2322 = null;
            }
        }
        class18.field523.method324(-120);
        if (arg0 != -417) {
            field1109 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)V")
    public static final void method420(int arg0) {
        field1114++;
        if (arg0 != 1) {
            method420(92);
        }
        class225.field4052.method503(arg0 + 9);
        class136.field2443.method410((byte) 71);
    }
}
