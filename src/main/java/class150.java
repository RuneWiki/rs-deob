import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class150 extends class61 {

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "I")
    public static int field2676 = 0;

    @OriginalMember(owner = "client!ni", name = "A", descriptor = "S")
    public static short field2679 = 32767;

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "I")
    public int field2678;

    @OriginalMember(owner = "client!ni", name = "B", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!ni", name = "C", descriptor = "I")
    public int field2681;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(II)Z")
    public static final boolean method1133(int arg0, int arg1) {
        field2680++;
        class23 var2 = class261.method1812(119, arg0);
        if (var2 == null) {
            return false;
        } else if (class129.field2314 == 1 || class129.field2314 == 2 || class269.field4768 == 2) {
            byte[] var3 = var2.field436.method1622(-6274);
            class112.field2014 = new String(var3, 0, var3.length);
            class7.field92 = var2.field442;
            if (class269.field4768 != 0) {
                class104.field1894 = class7.field92 + 40000;
                class249.field4427 = class7.field92 + 50000;
                class166.field2932 = class104.field1894;
            }
            return true;
        } else {
            class230 var4 = class226.field3906;
            if (class269.field4768 != 0) {
                var4 = class173.method1267((byte) 59, new class230[] { class251.field4504, class37.method340(var2.field442 + 7000, (byte) -26) });
            }
            if (arg1 != 30621) {
                method1134(-30, -34, -56, -49, -75, 73, -115, -89, (class70) null, -40, false, -57L);
            }
            class230 var5 = class226.field3906;
            if (class237.field4100 != null) {
                var5 = class173.method1267((byte) 59, new class230[] { class38.field713, class237.field4100 });
            }
            class230 var6 = class173.method1267((byte) 59, new class230[] { class184.field3240, var2.field436, var4, class133.field2405, class37.method340(class226.field3896, (byte) -26), class190.field3360, class37.method340(class56.field1035, (byte) -26), var5, class194.field3474, class261.field4660 ? class251.field4496 : client.field2705, class176.field3092, class53.field914 ? class251.field4496 : client.field2705, class205.field3624, class24.field460 ? class251.field4496 : client.field2705 });
            try {
                class29.field536.getAppletContext().showDocument(var6.method1595(0), "_self");
                return true;
            } catch (Exception var7) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIIIIILhj;IZJ)Z")
    public static final boolean method1134(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class70 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class168.field2976 == class106.field1912;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var24 = arg2; var24 < arg2 + arg4; var24++) {
                if (var15 < 0 || var24 < 0 || var15 >= class30.field553 || var24 >= class117.field2102) {
                    return false;
                }
                class233 var25 = class53.field916[arg0][var15][var24];
                if (var25 != null && var25.field4058 >= 5) {
                    return false;
                }
            }
        }
        class111 var16 = new class111();
        var16.field2001 = arg11;
        var16.field1998 = arg0;
        var16.field2003 = arg5;
        var16.field1992 = arg6;
        var16.field1999 = arg7;
        var16.field1993 = arg8;
        var16.field1996 = arg9;
        var16.field1988 = arg1;
        var16.field1994 = arg2;
        var16.field1989 = arg1 + arg3 - 1;
        var16.field2002 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; var17++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var17 > arg1) {
                    var21++;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class53.field916[var22][var17][var20] == null) {
                        class53.field916[var22][var17][var20] = new class233(var22, var17, var20);
                    }
                }
                class233 var23 = class53.field916[arg0][var17][var20];
                var23.field4050[var23.field4058] = var16;
                var23.field4064[var23.field4058] = var21;
                var23.field4062 |= var21;
                var23.field4058++;
                if (var13 && class247.field4392[var17][var20] != 0) {
                    var14 = class247.field4392[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; var18++) {
                for (int var19 = arg2; var19 < arg2 + arg4; var19++) {
                    if (class247.field4392[var18][var19] == 0) {
                        class247.field4392[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class61.field1175[class166.field2933++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "([BB)V")
    public static final void method1135(byte[] arg0, byte arg1) {
        field2677++;
        class14 var2 = new class14(arg0);
        var2.field318 = arg0.length - 2;
        class194.field3434 = var2.method161(4);
        class113.field2034 = new int[class194.field3434];
        class273.field4806 = new int[class194.field3434];
        class7.field124 = new int[class194.field3434];
        class254.field4527 = new byte[class194.field3434][];
        class215.field3725 = new byte[class194.field3434][];
        class271.field4794 = new boolean[class194.field3434];
        class96.field1735 = new int[class194.field3434];
        var2.field318 = arg0.length - (class194.field3434 * 8) - 7;
        class47.field839 = var2.method161(4);
        if (arg1 <= 82) {
            return;
        }
        class15.field346 = var2.method161(4);
        int var3 = (var2.method200(255) & 0xFF) + 1;
        for (int var4 = 0; var4 < class194.field3434; var4++) {
            class96.field1735[var4] = var2.method161(4);
        }
        for (int var5 = 0; var5 < class194.field3434; var5++) {
            class113.field2034[var5] = var2.method161(4);
        }
        for (int var6 = 0; var6 < class194.field3434; var6++) {
            class7.field124[var6] = var2.method161(4);
        }
        for (int var7 = 0; var7 < class194.field3434; var7++) {
            class273.field4806[var7] = var2.method161(4);
        }
        var2.field318 = arg0.length - ((var3 + -1) * 3 + class194.field3434 * 8) - 7;
        class263.field4676 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class263.field4676[var8] = var2.method190(-25267);
            if (class263.field4676[var8] == 0) {
                class263.field4676[var8] = 1;
            }
        }
        var2.field318 = 0;
        for (int var9 = 0; var9 < class194.field3434; var9++) {
            int var10 = class7.field124[var9];
            int var11 = class273.field4806[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            boolean var14 = false;
            byte[] var15 = new byte[var12];
            class215.field3725[var9] = var15;
            class254.field4527[var9] = var13;
            int var16 = var2.method200(255);
            if ((var16 & 0x1) == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var15[var17] = var2.method198(false);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var18 = 0; var18 < var12; var18++) {
                        byte var19 = var13[var18] = var2.method198(false);
                        var14 |= var19 != -1;
                    }
                }
            } else {
                int var20 = 0;
                label101: while (true) {
                    if (var10 <= var20) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var21 = 0;
                        while (true) {
                            if (var10 <= var21) {
                                break label101;
                            }
                            for (int var22 = 0; var22 < var11; var22++) {
                                byte var23 = var13[var10 * var22 + var21] = var2.method198(false);
                                var14 |= var23 != -1;
                            }
                            var21++;
                        }
                    }
                    for (int var24 = 0; var24 < var11; var24++) {
                        var15[var10 * var24 + var20] = var2.method198(false);
                    }
                    var20++;
                }
            }
            class271.field4794[var9] = var14;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class142.field2562 = 0;
        if (arg5 != 255) {
            return;
        }
        for (int var7 = -1; var7 < class169.field2984 + class18.field393; var7++) {
            class128 var23;
            if (var7 == -1) {
                var23 = class56.field1033;
            } else if (var7 >= class169.field2984) {
                var23 = class168.field2963[class167.field2956[var7 - class169.field2984]];
            } else {
                var23 = class230.field4011[class233.field4042[var7]];
            }
            if (var23 != null && var23.method890(2)) {
                if (var23 instanceof class109) {
                    class97 var24 = ((class109) var23).field1956;
                    if (var24.field1787 != null) {
                        var24 = var24.method825((byte) -27);
                    }
                    if (var24 == null) {
                        continue;
                    }
                }
                if (var7 >= class169.field2984) {
                    class97 var30 = ((class109) var23).field1956;
                    if (var30.field1787 != null) {
                        var30 = var30.method825((byte) -68);
                    }
                    if (var30.field1795 >= 0 && class61.field1173.length > var30.field1795) {
                        int var31;
                        if (var30.field1748 == -1) {
                            var31 = var23.method1008((byte) 12) + 15;
                        } else {
                            var31 = var30.field1748 + 15;
                        }
                        class144.method1097(var23, arg3, var31, (byte) 126, arg6 >> 1, arg2, arg4 >> 1);
                        if (class47.field840 > -1) {
                            class61.field1173[var30.field1795].method106(class47.field840 + arg1 - 12, arg0 + -30 - -class106.field1924);
                        }
                    }
                    class177[] var32 = class45.field793;
                    for (int var33 = 0; var33 < var32.length; var33++) {
                        class177 var48 = var32[var33];
                        if (var48 != null && var48.field3107 == 1 && class167.field2956[var7 - class169.field2984] == var48.field3110 && (class259.field4584 % 20) < 10) {
                            int var49;
                            if (var30.field1748 == -1) {
                                var49 = var23.method1008((byte) 12) + 15;
                            } else {
                                var49 = var30.field1748 + 15;
                            }
                            class144.method1097(var23, arg3, var49, (byte) 126, arg6 >> 1, arg2, arg4 >> 1);
                            if (class47.field840 > -1) {
                                class162.field2894[var48.field3108].method106(arg1 + class47.field840 - 12, class106.field1924 + arg0 - 28);
                            }
                        }
                    }
                } else {
                    class260 var25 = (class260) var23;
                    int var26 = 30;
                    if (var25.field4618 != -1 || var25.field4608 != -1) {
                        class144.method1097(var23, arg3, var23.method1008((byte) 12) + 15, (byte) 124, arg6 >> 1, arg2, arg4 >> 1);
                        if (class47.field840 > -1) {
                            if (var25.field4618 != -1) {
                                class99.field1825[var25.field4618].method106(class47.field840 + arg1 - 12, arg0 - -class106.field1924 + -var26);
                                var26 += 25;
                            }
                            if (var25.field4608 != -1) {
                                class61.field1173[var25.field4608].method106(class47.field840 + arg1 - 12, -var26 + class106.field1924 + arg0);
                                var26 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        int var27 = 0;
                        class177[] var28 = class45.field793;
                        while (var28.length > var27) {
                            class177 var29 = var28[var27];
                            if (var29 != null && var29.field3107 == 10 && class233.field4042[var7] == var29.field3110) {
                                class144.method1097(var23, arg3, var23.method1008((byte) 12) + 15, (byte) 125, arg6 >> 1, arg2, arg4 >> 1);
                                if (class47.field840 > -1) {
                                    class162.field2894[var29.field3108].method106(arg1 - (12 - class47.field840), arg0 - -class106.field1924 + -var26);
                                }
                            }
                            var27++;
                        }
                    }
                }
                if (var23.field2269 != null && (var7 >= class169.field2984 || class102.field1867 == 0 || class102.field1867 == 3 || class102.field1867 == 1 && class39.method349(113, ((class260) var23).field4620))) {
                    class144.method1097(var23, arg3, var23.method1008((byte) 12), (byte) 126, arg6 >> 1, arg2, arg4 >> 1);
                    if (class47.field840 > -1 && class140.field2501 > class142.field2562) {
                        class140.field2513[class142.field2562] = class76.field1382.method783(var23.field2269) / 2;
                        class140.field2515[class142.field2562] = class76.field1382.field1667;
                        class140.field2499[class142.field2562] = class47.field840;
                        class140.field2518[class142.field2562] = class106.field1924;
                        class140.field2489[class142.field2562] = var23.field2290;
                        class140.field2512[class142.field2562] = var23.field2260;
                        class140.field2503[class142.field2562] = var23.field2240;
                        class140.field2492[class142.field2562] = var23.field2269;
                        class142.field2562++;
                    }
                }
                if (class259.field4584 < var23.field2288) {
                    class80 var34 = class124.field2187[0];
                    class80 var35 = class124.field2187[1];
                    int var36;
                    if ((var23 instanceof class109)) {
                        class109 var37 = (class109) var23;
                        class80[] var38 = (class80[]) class260.field4613.method1125((long) var37.field1956.field1793, true);
                        if (var38 == null) {
                            var38 = class178.method1298((byte) -84, class97.field1781, 0, var37.field1956.field1793);
                            if (var38 != null) {
                                class260.field4613.method1129((long) var37.field1956.field1793, true, var38);
                            }
                        }
                        if (var38 != null && var38.length == 2) {
                            var35 = var38[1];
                            var34 = var38[0];
                        }
                        class97 var39 = var37.field1956;
                        if (var39.field1748 == -1) {
                            var36 = var23.method1008((byte) 12);
                        } else {
                            var36 = var39.field1748;
                        }
                    } else {
                        var36 = var23.method1008((byte) 12);
                    }
                    class144.method1097(var23, arg3, var36 + var34.field1463 + 10, (byte) 126, arg6 >> 1, arg2, arg4 >> 1);
                    if (class47.field840 > -1) {
                        int var40 = arg1 + class47.field840 - (var34.field1458 >> 1);
                        int var41 = arg0 + class106.field1924 - 3;
                        var34.method106(var40, var41);
                        int var42 = var23.field2258 * var34.field1458 / 255;
                        int var43 = var34.field1463;
                        class87.method694(var40, var41, var40 + var42, var41 + var43);
                        var35.method106(var40, var41);
                        class87.method698(arg1, arg0, arg1 + arg6, arg0 + arg4);
                    }
                }
                for (int var44 = 0; var44 < 4; var44++) {
                    if (var23.field2294[var44] > class259.field4584) {
                        int var45;
                        if ((var23 instanceof class109)) {
                            class109 var46 = (class109) var23;
                            class97 var47 = var46.field1956;
                            if (var47.field1748 == -1) {
                                var45 = var23.method1008((byte) 12) / 2;
                            } else {
                                var45 = var47.field1748 / 2;
                            }
                        } else {
                            var45 = var23.method1008((byte) 12) / 2;
                        }
                        class144.method1097(var23, arg3, var45, (byte) 126, arg6 >> 1, arg2, arg4 >> 1);
                        if (class47.field840 > -1) {
                            if (var44 == 1) {
                                class106.field1924 -= 20;
                            }
                            if (var44 == 2) {
                                class106.field1924 -= 10;
                                class47.field840 -= 15;
                            }
                            if (var44 == 3) {
                                class47.field840 += 15;
                                class106.field1924 -= 10;
                            }
                            class265.field4712[var23.field2309[var44]].method106(class47.field840 + arg1 - 12, arg0 + -12 + class106.field1924);
                            class104.field1904.method784(class37.method340(var23.field2255[var44], (byte) -26), class47.field840 + arg1 - 1, class106.field1924 + 3 + arg0, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var8 = 0; var8 < class142.field2562; var8++) {
            int var9 = class140.field2499[var8];
            int var10 = class140.field2518[var8];
            int var11 = class140.field2513[var8];
            int var12 = class140.field2515[var8];
            boolean var13 = true;
            while (var13) {
                var13 = false;
                for (int var22 = 0; var22 < var8; var22++) {
                    if ((var10 + 2) > (class140.field2518[var22] - class140.field2515[var22]) && (class140.field2518[var22] + 2) > (var10 - var12) && (var9 - var11) < (class140.field2513[var22] + class140.field2499[var22]) && var9 + var11 > class140.field2499[var22] - class140.field2513[var22] && var10 > class140.field2518[var22] - class140.field2515[var22]) {
                        var10 = class140.field2518[var22] - class140.field2515[var22];
                        var13 = true;
                    }
                }
            }
            class47.field840 = class140.field2499[var8];
            class106.field1924 = class140.field2518[var8] = var10;
            class230 var14 = class140.field2492[var8];
            if (class200.field3557 == 0) {
                int var15 = 16776960;
                if (class140.field2489[var8] < 6) {
                    var15 = class18.field392[class140.field2489[var8]];
                }
                if (class140.field2489[var8] == 6) {
                    var15 = (field2676 % 20) < 10 ? 16711680 : 16776960;
                }
                if (class140.field2489[var8] == 7) {
                    var15 = (field2676 % 20) < 10 ? 255 : 65535;
                }
                if (class140.field2489[var8] == 8) {
                    var15 = (field2676 % 20) >= 10 ? 8454016 : 45056;
                }
                if (class140.field2489[var8] == 9) {
                    int var16 = 150 - class140.field2503[var8];
                    if (var16 < 50) {
                        var15 = var16 * 1280 + 16711680;
                    } else if (var16 < 100) {
                        var15 = 33160960 - (var16 * 327680);
                    } else if (var16 < 150) {
                        var15 = var16 * 5 + 65280 - 500;
                    }
                }
                if (class140.field2489[var8] == 10) {
                    int var17 = 150 - class140.field2503[var8];
                    if (var17 < 50) {
                        var15 = (var17 * 5) + 16711680;
                    } else if (var17 < 100) {
                        var15 = 33095935 - (var17 * 327680);
                    } else if (var17 < 150) {
                        var15 = var17 * 327680 + 255 - ((var17 + -100) * 5) - 32768000;
                    }
                }
                if (class140.field2489[var8] == 11) {
                    int var18 = 150 - class140.field2503[var8];
                    if (var18 < 50) {
                        var15 = 16777215 - (var18 * 327685);
                    } else if (var18 < 100) {
                        var15 = 65280 - (16384250 - (var18 * 327685));
                    } else if (var18 < 150) {
                        var15 = 16777215 - (var18 - 100) * 327680;
                    }
                }
                if (class140.field2512[var8] == 0) {
                    class76.field1382.method784(var14, arg1 + class47.field840, class106.field1924 + arg0, var15, 0);
                }
                if (class140.field2512[var8] == 1) {
                    class76.field1382.method794(var14, class47.field840 + arg1, class106.field1924 + arg0, var15, 0, field2676);
                }
                if (class140.field2512[var8] == 2) {
                    class76.field1382.method787(var14, class47.field840 + arg1, class106.field1924 + arg0, var15, 0, field2676);
                }
                if (class140.field2512[var8] == 3) {
                    class76.field1382.method789(var14, class47.field840 + arg1, arg0 - -class106.field1924, var15, 0, field2676, 150 - class140.field2503[var8]);
                }
                if (class140.field2512[var8] == 4) {
                    int var19 = (150 - class140.field2503[var8]) * (class76.field1382.method783(var14) + 100) / 150;
                    class87.method694(arg1 + class47.field840 - 50, arg0, class47.field840 + arg1 + 50, arg0 + arg4);
                    class76.field1382.method800(var14, class47.field840 + arg1 + 50 - var19, class106.field1924 + arg0, var15, 0);
                    class87.method698(arg1, arg0, arg1 + arg6, arg0 + arg4);
                }
                if (class140.field2512[var8] == 5) {
                    int var20 = 150 - class140.field2503[var8];
                    int var21 = 0;
                    class87.method694(arg1, arg0 + class106.field1924 - class76.field1382.field1667 - 1, arg1 - -arg6, arg0 + class106.field1924 + 5);
                    if (var20 < 25) {
                        var21 = var20 - 25;
                    } else if (var20 > 125) {
                        var21 = var20 - 125;
                    }
                    class76.field1382.method784(var14, class47.field840 + arg1, class106.field1924 + arg0 - -var21, var15, 0);
                    class87.method698(arg1, arg0, arg1 + arg6, arg0 + arg4);
                }
            } else {
                class76.field1382.method784(var14, class47.field840 + arg1, class106.field1924 + arg0, 16776960, 0);
            }
        }
        field2675++;
    }
}
