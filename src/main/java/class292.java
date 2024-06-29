import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class292 extends class259 {

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "J")
    public long field4645;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field4639 = new String[100];

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "Ljava/lang/String;")
    public static String field4641 = "Checking for updates - ";

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "[I")
    public static int[] field4637 = new int[200];

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4638 = "glow1:";

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "Llc;")
    public static class270 field4646;

    @OriginalMember(owner = "client!cj", name = "w", descriptor = "[Llf;")
    public static class94[] field4648;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZIZB)V")
    public static final void method1983(boolean arg0, int arg1, boolean arg2, byte arg3) {
        field4636++;
        int var4 = 0;
        if (arg3 != -60) {
            method1988(10, -5, 75);
        }
        int var10002;
        while (class12.field135 > var4) {
            class12 var21 = class255.field3856[class14.field159[var4]];
            if (var21 != null && var21.method91(45) && var21.field137.method796(arg3 ^ 0xFFFFB15B)) {
                label267: {
                    int var22 = var21.method1467(0);
                    if (arg2) {
                        if (!var21.field137.field1741) {
                            break label267;
                        }
                    } else if (arg0 != var21.field137.field1787 || arg1 != 0 && arg1 != var22) {
                        break label267;
                    }
                    if (var22 == 1) {
                        if ((var21.field3660 & 0x7F) == 64 && (var21.field3753 & 0x7F) == 64) {
                            int var29 = var21.field3753 >> 7;
                            int var30 = var21.field3660 >> 7;
                            if (var30 >= 0 && var30 < 104 && var29 >= 0 && var29 < 104) {
                                var10002 = class158.field2454[var30][var29]++;
                            }
                        }
                    } else if (((var22 & 0x1) != 0 || (var21.field3660 & 0x7F) == 0 && (var21.field3753 & 0x7F) == 0) && ((var22 & 0x1) != 1 || (var21.field3660 & 0x7F) == 64 && (var21.field3753 & 0x7F) == 64)) {
                        int var23 = var21.field3753 - (var22 * 64) >> 7;
                        int var24 = var21.field3660 - (var22 * 64) >> 7;
                        int var25 = var21.method1467(0) + var24;
                        if (var24 < 0) {
                            var24 = 0;
                        }
                        if (var25 > 104) {
                            var25 = 104;
                        }
                        int var26 = var23 + var21.method1467(0);
                        if (var23 < 0) {
                            var23 = 0;
                        }
                        if (var26 > 104) {
                            var26 = 104;
                        }
                        for (int var27 = var24; var27 < var25; var27++) {
                            for (int var28 = var23; var28 < var26; var28++) {
                                var10002 = class158.field2454[var27][var28]++;
                            }
                        }
                    }
                }
            }
            var4++;
        }
        label208: for (int var5 = 0; var5 < class12.field135; var5++) {
            long var6 = (long) class14.field159[var5] << 32 | 0x20000000L;
            class12 var8 = class255.field3856[class14.field159[var5]];
            if (var8 != null && var8.method91(arg3 ^ 0xFFFFFFF0) && var8.field137.method796(20127)) {
                int var9 = var8.method1467(0);
                if (arg2) {
                    if (!var8.field137.field1741) {
                        continue;
                    }
                } else if (var8.field137.field1787 != arg0 || arg1 != 0 && arg1 != var9) {
                    continue;
                }
                var8.field3736 = true;
                if (var9 == 1) {
                    if ((var8.field3660 & 0x7F) == 64 && (var8.field3753 & 0x7F) == 64) {
                        int var10 = var8.field3660 >> 7;
                        int var11 = var8.field3753 >> 7;
                        if (var10 < 0 || var10 >= 104 || var11 < 0 || var11 >= 104) {
                            continue;
                        }
                        if (class158.field2454[var10][var11] > 1) {
                            var10002 = class158.field2454[var10][var11]--;
                            continue;
                        }
                    }
                } else if ((var9 & 0x1) == 0 && (var8.field3660 & 0x7F) == 0 && (var8.field3753 & 0x7F) == 0 || (var9 & 0x1) == 1 && (var8.field3660 & 0x7F) == 64 && (var8.field3753 & 0x7F) == 64) {
                    int var12 = var8.field3753 - (var9 * 64) >> 7;
                    int var13 = var8.field3660 - var9 * 64 >> 7;
                    int var14 = var13 + var9;
                    if (var14 > 104) {
                        var14 = 104;
                    }
                    boolean var15 = true;
                    if (var13 < 0) {
                        var13 = 0;
                    }
                    int var16 = var9 + var12;
                    if (var16 > 104) {
                        var16 = 104;
                    }
                    if (var12 < 0) {
                        var12 = 0;
                    }
                    for (int var17 = var13; var17 < var14; var17++) {
                        for (int var20 = var12; var20 < var16; var20++) {
                            if (class158.field2454[var17][var20] <= 1) {
                                var15 = false;
                                break;
                            }
                        }
                    }
                    if (var15) {
                        int var18 = var13;
                        while (true) {
                            if (var14 <= var18) {
                                continue label208;
                            }
                            for (int var19 = var12; var19 < var16; var19++) {
                                var10002 = class158.field2454[var18][var19]--;
                            }
                            var18++;
                        }
                    }
                }
                var8.field3736 = false;
                if (!var8.field137.field1755) {
                    var6 |= Long.MIN_VALUE;
                }
                var8.field3759 = class113.method851(class37.field474, 97, var8.field3753, var8.field3660);
                class71.method540(class37.field474, var8.field3660, var8.field3753, var8.field3759, var9 * 64 - 4, var8, var8.field3668, var6, var8.field3739);
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)V")
    public static void method1984(int arg0) {
        if (arg0 != 7244) {
            return;
        }
        field4639 = null;
        field4646 = null;
        field4648 = null;
        field4637 = null;
        field4641 = null;
        field4638 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method1985(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var6 = arg1 - arg4;
        int var7 = arg2 - arg0;
        field4647++;
        if (var6 == 0) {
            if (var7 != 0) {
                class230.method1597(arg4, arg0, arg2, arg3, -3);
            }
        } else if (var7 == 0) {
            class253.method1743(2778, arg0, arg1, arg4, arg3);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg0 - (arg4 * var8 >> 12);
            int var10;
            int var11;
            if (arg4 < class264.field4230) {
                var10 = (class264.field4230 * var8 >> 12) + var9;
                var11 = class264.field4230;
            } else if (class273.field4418 >= arg4) {
                var10 = arg0;
                var11 = arg4;
            } else {
                var11 = class273.field4418;
                var10 = (class273.field4418 * var8 >> 12) + var9;
            }
            int var12;
            int var13;
            if (class264.field4230 > arg1) {
                var12 = class264.field4230;
                var13 = (class264.field4230 * var8 >> 12) + var9;
            } else if (class273.field4418 >= arg1) {
                var12 = arg1;
                var13 = arg2;
            } else {
                var12 = class273.field4418;
                var13 = (class273.field4418 * var8 >> 12) + var9;
            }
            if (var13 < class73.field1156) {
                var12 = (class73.field1156 - var9 << 12) / var8;
                var13 = class73.field1156;
            } else if (var13 > class59.field859) {
                var13 = class59.field859;
                var12 = (class59.field859 - var9 << 12) / var8;
            }
            if (var10 < class73.field1156) {
                var11 = (class73.field1156 - var9 << 12) / var8;
                var10 = class73.field1156;
            } else if (var10 > class59.field859) {
                var11 = (class59.field859 - var9 << 12) / var8;
                var10 = class59.field859;
            }
            class196.method1390(var10, var13, var12, arg3, false, var11);
            if (!arg5) {
                field4641 = null;
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "(I)V")
    public static final void method1986(int arg0) {
        if (arg0 != 0) {
            method1985(-107, -19, 35, -118, 68, false);
        }
        class308.field4968 = null;
        field4644++;
        class74.field1172 = -1;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
    public class292() {
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIILse;I)V")
    public static final void method1987(int arg0, int arg1, int arg2, class102 arg3, int arg4) {
        field4640++;
        if (class147.field2360 >= 400) {
            return;
        }
        if (arg3.field1752 != null) {
            arg3 = arg3.method795(65535);
        }
        if (arg3 == null || !arg3.field1755) {
            return;
        }
        if (arg1 <= 46) {
            field4641 = null;
        }
        String var5 = arg3.field1733;
        if (arg3.field1740 != 0) {
            String var6 = class121.field1986 == 1 ? class194.field2856 : class1.field21;
            var5 = var5 + class303.method2063(-12685, class213.field3139.field3068, arg3.field1740) + " (" + var6 + arg3.field1740 + ")";
        }
        if (class165.field2539 == 1) {
            class63.method481((long) arg4, arg0, class298.field4788, arg2, class260.field4026, (short) 19, -1, class221.field3221 + " -> <col=ffff00>" + var5);
            class250.field3776++;
        } else if (class6.field57) {
            class192 var14 = class243.field3580 == -1 ? null : class51.method308((byte) -73, class243.field3580);
            if ((class69.field1111 & 0x2) != 0) {
                if (var14 == null || arg3.method797(class243.field3580, var14.field2840, -128) != var14.field2840) {
                    class269.field4324++;
                    class63.method481((long) arg4, arg0, class87.field1380, arg2, class169.field2567, (short) 42, -1, class136.field2220 + " -> <col=ffff00>" + var5);
                }
                return;
            }
        } else {
            class1.field4++;
            String[] var7 = arg3.field1731;
            if (class92.field1489) {
                var7 = class135.method1020((byte) 0, var7);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (class121.field1986 != 0 || !var7[var8].equalsIgnoreCase(class167.field2553))) {
                        byte var9 = 0;
                        int var10 = -1;
                        if (var8 == 0) {
                            var9 = 4;
                        }
                        class35.field445++;
                        if (var8 == 1) {
                            var9 = 25;
                        }
                        if (var8 == 2) {
                            var9 = 60;
                        }
                        if (var8 == 3) {
                            var9 = 59;
                        }
                        if (arg3.field1763 == var8) {
                            var10 = arg3.field1757;
                        }
                        if (arg3.field1735 == var8) {
                            var10 = arg3.field1734;
                        }
                        if (var8 == 4) {
                            var9 = 39;
                        }
                        class63.method481((long) arg4, arg0, var10, arg2, var7[var8], var9, -1, "<col=ffff00>" + var5);
                    }
                }
            }
            if (class121.field1986 == 0 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].equalsIgnoreCase(class167.field2553)) {
                        short var12 = 0;
                        short var13 = 0;
                        if (var11 == 0) {
                            var13 = 4;
                        }
                        if (var11 == 1) {
                            var13 = 25;
                        }
                        class101.field1716++;
                        if (arg3.field1740 > class213.field3139.field3068) {
                            var12 = 2000;
                        }
                        if (var11 == 2) {
                            var13 = 60;
                        }
                        if (var11 == 3) {
                            var13 = 59;
                        }
                        if (var11 == 4) {
                            var13 = 39;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        class63.method481((long) arg4, arg0, arg3.field1721, arg2, var7[var11], var13, -1, "<col=ffff00>" + var5);
                    }
                }
            }
            class63.method481((long) arg4, arg0, class74.field1176, arg2, class35.field452, (short) 1012, -1, "<col=ffff00>" + var5);
            return;
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(III)I")
    public static final int method1988(int arg0, int arg1, int arg2) {
        if (arg2 != -127) {
            method1988(-2, -14, -60);
        }
        field4643++;
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(J)V")
    public class292(long arg0) {
        this.field4645 = arg0;
    }
}
