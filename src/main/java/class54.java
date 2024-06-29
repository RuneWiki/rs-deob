import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class54 extends class152 {

    @OriginalMember(owner = "client!lf", name = "X", descriptor = "Z")
    public static boolean field901 = false;

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "I")
    public static int field886 = 2301979;

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "I")
    private int field882;

    @OriginalMember(owner = "client!lf", name = "E", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "I")
    public int field887;

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!lf", name = "R", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!lf", name = "S", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!lf", name = "U", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!lf", name = "V", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!lf", name = "W", descriptor = "Lpa;")
    public static class123 field900;

    @OriginalMember(owner = "client!lf", name = "T", descriptor = "Lhh;")
    public class163 field897;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lnk;I)V")
    public static final void method368(class2 arg0, int arg1) {
        field885++;
        if (arg1 != 30754) {
            method376((byte) -113, true);
        }
        for (class247 var2 = (class247) class57.field943.method1017(96); var2 != null; var2 = (class247) class57.field943.method1016((byte) -31)) {
            if (var2.field4374 == arg0) {
                if (var2.field4366 != null) {
                    class225.field4085.method594(var2.field4366);
                    var2.field4366 = null;
                }
                var2.method1063(arg1 - 30675);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIBIZ)V")
    public static final void method369(int arg0, int arg1, int arg2, byte arg3, int arg4, boolean arg5) {
        field898++;
        class114.field2145++;
        if (!arg5) {
            class250.method1708((byte) 125, true);
            class64.method452(true, -128);
            class250.method1708((byte) 116, false);
        }
        class64.method452(false, -63);
        if (!arg5) {
            class109.method879((byte) 79);
        }
        class252.method1714(false);
        if (class5.field99 == 1) {
            int var6 = class132.field2560;
            int var7 = class93.field1750 + class126.field2432 & 0x7FF;
            if ((class145.field2759 / 256) > var6) {
                var6 = class145.field2759 / 256;
            }
            if (class131.field2535[4] && var6 < class233.field4161[4] + 128) {
                var6 = class233.field4161[4] + 128;
            }
            class143.method1086(var6, class127.method1011(class235.field4203.field3615, class235.field4203.field3633, class20.field323, 29908) - 50, class24.field389, var7, var6 * 3 + 600, class29.field448, false, arg4);
        }
        int var8 = class88.field1636;
        int var9 = class13.field201;
        int var10 = class63.field1072;
        int var11 = class123.field2367;
        int var12 = class191.field3490;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class131.field2535[var13]) {
                int var21 = (int) ((double) (class39.field657[var13] * 2 + 1) * Math.random() + Math.sin((double) class96.field1811[var13] / 100.0D * (double) class114.field2148[var13]) * (double) class233.field4161[var13] - (double) class39.field657[var13]);
                if (var13 == 3) {
                    class63.field1072 = class63.field1072 + var21 & 0x7FF;
                }
                if (var13 == 2) {
                    class88.field1636 += var21;
                }
                if (var13 == 1) {
                    class191.field3490 += var21;
                }
                if (var13 == 0) {
                    class123.field2367 += var21;
                }
                if (var13 == 4) {
                    class13.field201 += var21;
                    if (class13.field201 < 128) {
                        class13.field201 = 128;
                    }
                    if (class13.field201 > 383) {
                        class13.field201 = 383;
                    }
                }
            }
        }
        if (arg3 < 60) {
            field884 = -64;
        }
        class265.method1786(true);
        class206.method1466(arg1, arg2, arg1 + arg0, arg2 - -arg4);
        class98.method775();
        int var14 = class240.field4281;
        int var15 = class36.field608;
        if (var15 >= arg1 && var15 < arg0 + arg1 && var14 >= arg2 && var14 < arg2 + arg4) {
            int var16 = class120.field2264;
            class49.field828 = true;
            int var17 = class89.field1644;
            int var18 = class97.field1820;
            class235.field4196 = (var17 - var16) * (class36.field608 - arg1) / arg0 + var16;
            int var19 = class164.field3035;
            class96.field1815 = (class240.field4281 - arg2) * (var18 - var19) / arg4 + var19;
            class143.field2707 = 0;
        } else {
            class49.field828 = false;
            class143.field2707 = 0;
        }
        class229.method1593(-114);
        byte var20 = class205.method1455(0) == 2 ? (byte) class114.field2145 : 1;
        class206.method1483(arg1, arg2, arg0, arg4, 0);
        class222.method1572(class123.field2367, class191.field3490, class88.field1636, class13.field201, class63.field1072, class125.field2411, class215.field3921, class106.field2013, class235.field4197, class258.field4510, class134.field2598, class20.field323 + 1, var20, class235.field4203.field3633 >> 7, class235.field4203.field3615 >> 7);
        class229.method1593(-116);
        class130.method1033();
        class127.method1003(-125, 256, arg0, 256, arg2, arg4, arg1);
        class161.method1180(arg4, 256, arg0, -27203, arg2, arg1, 256);
        ((class122) class98.field1852).method957(class52.field877, 65535);
        class127.method1009(arg4, arg2, -75, arg1, arg0);
        class88.field1636 = var8;
        class191.field3490 = var12;
        class123.field2367 = var11;
        class63.field1072 = var10;
        class13.field201 = var9;
        if (class2.field48 && class262.method1780(false, 39, true) == 0) {
            class2.field48 = false;
        }
        if (class2.field48) {
            class206.method1483(arg1, arg2, arg0, arg4, 0);
            class68.method473(false, class191.field3492, (byte) -99);
        }
        if (!arg5 && !class2.field48 && !class130.field2530 && var15 >= arg1 && (arg1 + arg0) > var15 && arg2 <= var14 && arg2 + arg4 > var14) {
            class93.method743(arg1, var14, arg0, true, var15, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lsh;I)V")
    public static final void method370(class202 arg0, int arg1) {
        field894++;
        if (arg0.field3648 == 0) {
            return;
        }
        if (arg0.field3618 != -1 && arg0.field3618 < 32768) {
            class2 var2 = class111.field2098[arg0.field3618];
            if (var2 != null) {
                int var3 = arg0.field3633 - var2.field3633;
                int var4 = arg0.field3615 - var2.field3615;
                if (var3 != 0 || var4 != 0) {
                    arg0.field3654 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field3618 >= 32768) {
            int var5 = arg0.field3618 - 32768;
            if (class129.field2513 == var5) {
                var5 = 2047;
            }
            class126 var6 = class106.field2029[var5];
            if (var6 != null) {
                int var7 = arg0.field3633 - var6.field3633;
                int var8 = arg0.field3615 - var6.field3615;
                if (var7 != 0 || var8 != 0) {
                    arg0.field3654 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field3634 != arg1 || arg0.field3680 != 0) && (arg0.field3653 == 0 || arg0.field3640 > 0)) {
            int var9 = -(-(arg0.field3645 * 64) - (arg0.field3633 - ((arg0.field3634 - class62.field1035 - class62.field1035) * 64))) - 64;
            int var10 = arg0.field3645 * 64 + arg0.field3615 - ((-class257.field4500 + -class257.field4500 + arg0.field3680) * 64) - 64;
            if (var9 != 0 || var10 != 0) {
                arg0.field3654 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg0.field3680 = 0;
            arg0.field3634 = 0;
        }
        int var11 = arg0.field3654 - arg0.field3667 & 0x7FF;
        if (var11 == 0) {
            arg0.field3626 = 0;
            return;
        }
        arg0.field3626++;
        if (var11 > 1024) {
            arg0.field3667 -= arg0.field3648;
            boolean var12 = true;
            if (var11 < arg0.field3648 || var11 > (2048 - arg0.field3648)) {
                arg0.field3667 = arg0.field3654;
                var12 = false;
            }
            if (arg0.field3670 == arg0.field3664 && (arg0.field3626 > 25 || var12)) {
                if (arg0.field3635 == -1) {
                    arg0.field3664 = arg0.field3652;
                } else {
                    arg0.field3664 = arg0.field3635;
                }
            }
        } else {
            boolean var13 = true;
            arg0.field3667 += arg0.field3648;
            if (var11 < arg0.field3648 || 2048 - arg0.field3648 < var11) {
                var13 = false;
                arg0.field3667 = arg0.field3654;
            }
            if (arg0.field3670 == arg0.field3664 && (arg0.field3626 > 25 || var13)) {
                if (arg0.field3679 == -1) {
                    arg0.field3664 = arg0.field3652;
                } else {
                    arg0.field3664 = arg0.field3679;
                }
            }
        }
        arg0.field3667 &= 0x7FF;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(Lsh;I)V")
    public static final void method371(class202 arg0, int arg1) {
        if (arg1 != 64) {
            method371((class202) null, 42);
        }
        field888++;
        if (class227.field4092 == arg0.field3641 || arg0.field3673 == -1 || arg0.field3622 != 0 || (arg0.field3665 + 1) > class212.method1511(arg0.field3673, arg1 ^ 0xFFFFFFBF).field268[arg0.field3658]) {
            int var2 = arg0.field3641 - arg0.field3639;
            int var3 = class227.field4092 - arg0.field3639;
            int var4 = arg0.field3662 * 128 + arg0.field3645 * 64;
            int var5 = arg0.field3672 * 128 + arg0.field3645 * 64;
            int var6 = arg0.field3678 * 128 + arg0.field3645 * 64;
            int var7 = arg0.field3645 * 64 + arg0.field3627 * 128;
            arg0.field3615 = ((var2 - var3) * var5 + var3 * var6) / var2;
            arg0.field3633 = ((var2 - var3) * var4 + var3 * var7) / var2;
        }
        if (arg0.field3642 == 0) {
            arg0.field3654 = 1024;
        }
        if (arg0.field3642 == 1) {
            arg0.field3654 = 1536;
        }
        arg0.field3640 = 0;
        if (arg0.field3642 == 2) {
            arg0.field3654 = 0;
        }
        if (arg0.field3642 == 3) {
            arg0.field3654 = 512;
        }
        arg0.field3667 = arg0.field3654;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lhh;I)I")
    public static final int method372(class163 arg0, int arg1) {
        if (arg1 != -1) {
            method371((class202) null, -105);
        }
        field893++;
        return arg0.method1221(arg1 - 23095) + 1;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lpg;II)V")
    private final void method373(class81 arg0, int arg1, int arg2) {
        field895++;
        if (arg1 >= -104) {
            return;
        }
        if (arg2 == 1) {
            this.field882 = arg0.method622(true);
        } else if (arg2 == 2) {
            this.field887 = arg0.method620((byte) -82);
        } else if (arg2 == 5) {
            this.field897 = arg0.method605(true);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)I")
    public static final int method374(int arg0, byte arg1) {
        if (arg1 != -6) {
            method372((class163) null, 74);
        }
        field889++;
        return (arg0 & 0xFF00B) >> 17;
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(B)V")
    public static final void method375(byte arg0) {
        class81.field1544 = class244.field4317;
        class82.field1585 = class13.field198;
        class122.field2333 = class72.field1352;
        class137.field2643 = class136.field2624;
        class143.field2704 = class142.field2697;
        class203.field3689 = class1.field5;
        class119.field2249 = class223.field4067;
        class36.field610 = class69.field1264;
        class73.field1383 = class125.field2410;
        class60.field1004 = class63.field1073;
        class132.field2562 = class26.field409;
        class135.field2615 = class259.field4535;
        class234.field4188 = class90.field1657;
        class27.field422 = class171.field3144;
        class247.field4372 = class240.field4289;
        class265.field4615 = class176.field3212;
        class92.field1732 = class37.field630;
        class152.field2848 = class22.field369;
        class132.field2553 = class131.field2536;
        class46.field773 = class69.field1159;
        class96.field1809 = class120.field2268;
        class12.field185 = class209.field3797;
        class231.field4150 = class149.field2801;
        class188.field3440 = class223.field4068;
        class155.field2885 = class253.field4441;
        class162.field2960 = class51.field858;
        class10.field169 = class144.field2718;
        field896++;
        class191.field3492 = class52.field871;
        class239.field4260 = class18.field284;
        class177.field3225 = class110.field2071;
        class69.field1282 = class225.field4080;
        class119.field2246 = class223.field4067;
        class33.field512 = class131.field2539;
        class36.field616 = class170.field3106;
        class265.field4614 = class170.field3110;
        class5.field96 = class125.field2408;
        class191.field3501 = class43.field730;
        class253.field4438 = class71.field1338;
        class140.field2682 = class57.field944;
        class146.field2781 = class2.field30;
        class109.field2066 = class142.field2698;
        class177.field3234 = class6.field112;
        class188.field3446 = class254.field4445;
        class77.field1454 = class264.field4589;
        class39.field655 = class97.field1830;
        class222.field4042 = class45.field756;
        class213.field3890 = class23.field379;
        class35.field599 = class119.field2240;
        class196.field3531 = class77.field1457;
        class91.field1670 = class169.field3095;
        class143.field2713 = class151.field2829;
        class66.field1113 = class146.field2786;
        class84.field1595 = class262.field4573;
        class258.field4524 = class234.field4194;
        class220.field3998 = class260.field4548;
        class136.field2626 = class37.field627;
        class21.field341 = class181.field3288;
        class31.field487 = class16.field229;
        class216.field3934 = class23.field373;
        class257.field4502 = class66.field1130;
        class164.field3036 = class37.field622;
        class29.field459 = class159.field2924;
        class141.field2692 = class59.field970;
        class69.field1207 = class72.field1355;
        class60.field1003 = class235.field4205;
        class239.field4256 = class236.field4215;
        class265.field4596 = class91.field1664;
        class110.field2082 = class62.field1040;
        class244.field4318 = class223.field4059;
        class122.field2332 = class221.field4019;
        class151.field2825 = class75.field1412;
        class233.field4157 = class96.field1805;
        class59.field979 = class74.field1392;
        class239.field4263 = class237.field4219;
        class39.field651 = class97.field1830;
        class18.field289 = class177.field3232;
        class111.field2109 = class161.field2957;
        class50.field845 = class102.field1961;
        class115.field2187 = class260.field4550;
        class63.field1075 = class161.field2948;
        int var1 = 70 / ((arg0 - 13) / 61);
        class223.field4057 = class176.field3220;
        class128.field2489 = class96.field1808;
        class35.field546 = class115.field2192;
        class177.field3227 = class6.field112;
        class157.field2913 = class171.field3143;
        class38.field643 = class228.field4114;
        class210.field3811 = class252.field4424;
        class187.field3435 = class197.field3546;
        class219.field3988 = class243.field4300;
        class97.field1827 = class259.field4538;
        class245.field4330 = class243.field4294;
        class64.field1091 = class205.field3710;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BZ)V")
    public static final void method376(byte arg0, boolean arg1) {
        field899++;
        class229.method1593(-118);
        if (class262.field4583 != 30 && class262.field4583 != 25) {
            return;
        }
        class197.field3553++;
        if (class197.field3553 < 50 && !arg1) {
            return;
        }
        if (arg0 != 126) {
            method380(-70);
        }
        class197.field3553 = 0;
        if (!class248.field4379 && class188.field3443 != null) {
            class91.field1663++;
            class191.field3499.method75(171, 66);
            try {
                class188.field3443.method1729(class191.field3499.field1562, class191.field3499.field1541, 0, 5000);
                class191.field3499.field1541 = 0;
            } catch (IOException var2) {
                class248.field4379 = true;
            }
        }
        class229.method1593(-127);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lpa;I)V")
    public static final void method377(class123 arg0, int arg1) {
        field891++;
        class59.field965 = arg0;
        if (arg1 != 2047) {
            method374(20, (byte) 9);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLpg;)V")
    public final void method378(byte arg0, class81 arg1) {
        int var3 = 31 % ((-arg0 - 62) / 41);
        while (true) {
            int var4 = arg1.method622(true);
            if (var4 == 0) {
                field883++;
                return;
            }
            this.method373(arg1, -127, var4);
        }
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)Z")
    public final boolean method379(int arg0) {
        field890++;
        if (arg0 != 115) {
            method375((byte) -9);
        }
        return this.field882 == 115;
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)V")
    public static void method380(int arg0) {
        int var1 = -16 / ((22 - arg0) / 55);
        field900 = null;
    }
}
