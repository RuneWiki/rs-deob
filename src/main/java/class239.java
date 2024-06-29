import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class239 extends class152 {

    @OriginalMember(owner = "client!wi", name = "P", descriptor = "Lhh;")
    private static class163 field4257 = class137.method1065("Loading config )2 ", 17);

    @OriginalMember(owner = "client!wi", name = "K", descriptor = "[I")
    private static int[] field4252 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!wi", name = "H", descriptor = "Lhh;")
    private static class163 field4249 = class137.method1065("flash3:", 17);

    @OriginalMember(owner = "client!wi", name = "X", descriptor = "Lhh;")
    public static class163 field4265 = field4249;

    @OriginalMember(owner = "client!wi", name = "V", descriptor = "Lhh;")
    public static class163 field4263 = field4257;

    @OriginalMember(owner = "client!wi", name = "S", descriptor = "Lhh;")
    public static class163 field4260 = field4249;

    @OriginalMember(owner = "client!wi", name = "J", descriptor = "Lhh;")
    private static class163 field4251 = class137.method1065("Loaded config", 17);

    @OriginalMember(owner = "client!wi", name = "O", descriptor = "Lhh;")
    public static class163 field4256 = field4251;

    @OriginalMember(owner = "client!wi", name = "eb", descriptor = "I")
    public static int field4272 = 0;

    @OriginalMember(owner = "client!wi", name = "M", descriptor = "[Lqj;")
    public static class201[] field4254 = new class201[500];

    @OriginalMember(owner = "client!wi", name = "F", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!wi", name = "I", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!wi", name = "Q", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!wi", name = "T", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!wi", name = "W", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!wi", name = "Y", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!wi", name = "Z", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!wi", name = "ab", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!wi", name = "bb", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!wi", name = "cb", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!wi", name = "db", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!wi", name = "fb", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!wi", name = "gb", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!wi", name = "R", descriptor = "Lhh;")
    public class163 field4259;

    @OriginalMember(owner = "client!wi", name = "D", descriptor = "Lvf;")
    public static class71 field4245;

    @OriginalMember(owner = "client!wi", name = "E", descriptor = "[I")
    public int[] field4246;

    @OriginalMember(owner = "client!wi", name = "L", descriptor = "[I")
    public int[] field4253;

    @OriginalMember(owner = "client!wi", name = "N", descriptor = "[I")
    public int[] field4255;

    @OriginalMember(owner = "client!wi", name = "U", descriptor = "[I")
    public int[] field4262;

    @OriginalMember(owner = "client!wi", name = "G", descriptor = "[Lrh;")
    public static class242[] field4248;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BLpg;)V")
    public final void method1651(byte arg0, class81 arg1) {
        if (arg0 >= -13) {
            this.method1653(88, (byte) 12);
        }
        field4269++;
        while (true) {
            int var3 = arg1.method622(true);
            if (var3 == 0) {
                return;
            }
            this.method1660(var3, arg1, -91);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIIIZIIII)Z")
    public static final boolean method1652(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        field4271++;
        int var12 = -36 / ((arg5 - 75) / 35);
        if (class235.field4203.field3645 == 2) {
            return class37.method266(4800, arg10, arg7, arg9, arg11, arg4, arg0, arg1, arg8, arg3, arg2, arg6);
        } else if (class235.field4203.field3645 > 2) {
            return class250.method1709(arg2, 103, arg7, arg0, arg4, arg8, class235.field4203.field3645, arg10, arg1, arg11, arg3, arg6, arg9);
        } else {
            return class151.method1122(arg0, arg11, arg1, arg6, 111, arg3, arg9, arg10, arg2, arg4, arg8, arg7);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IB)I")
    public final int method1653(int arg0, byte arg1) {
        field4270++;
        if (this.field4262 == null) {
            return -1;
        }
        if (arg1 != 110) {
            this.field4262 = null;
        }
        for (int var3 = 0; var3 < this.field4262.length; var3++) {
            if (this.field4253[var3] == arg0) {
                return this.field4262[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Leg;Z)V")
    public static final void method1654(class144 arg0, boolean arg1) {
        class65.field1101.method1018((byte) 103, arg0);
        while (true) {
            class144 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class144[][] var7;
            class144 var66;
            do {
                class144 var65;
                do {
                    class144 var64;
                    do {
                        class144 var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class144) class65.field1101.method1019((byte) -5);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field2732);
                                            var3 = var2.field2726;
                                            var4 = var2.field2743;
                                            var5 = var2.field2727;
                                            var6 = var2.field2744;
                                            var7 = class259.field4542[var5];
                                            if (!var2.field2724) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class144 var8 = class259.field4542[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field2732) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class110.field2072 && var3 > class2.field42) {
                                                    class144 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field2732 && (var9.field2724 || (var2.field2747 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class110.field2072 && var3 < class220.field4009 - 1) {
                                                    class144 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field2732 && (var10.field2724 || (var2.field2747 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= client.field1990 && var4 > class136.field2628) {
                                                    class144 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field2732 && (var11.field2724 || (var2.field2747 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= client.field1990 && var4 < class87.field1622 - 1) {
                                                    class144 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field2732 && (var12.field2724 || (var2.field2747 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field2724 = false;
                                            if (var2.field2740 != null) {
                                                class144 var13 = var2.field2740;
                                                if (var13.field2737 == null) {
                                                    if (var13.field2733 != null) {
                                                        if (class52.method366(0, var3, var4)) {
                                                            class149.method1109(var13.field2733, class168.field3084, class29.field445, class231.field4135, class94.field1771, var3, var4, true);
                                                        } else {
                                                            class149.method1109(var13.field2733, class168.field3084, class29.field445, class231.field4135, class94.field1771, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class52.method366(0, var3, var4)) {
                                                    class234.method1622(var13.field2737, 0, class168.field3084, class29.field445, class231.field4135, class94.field1771, var3, var4, true);
                                                } else {
                                                    class234.method1622(var13.field2737, 0, class168.field3084, class29.field445, class231.field4135, class94.field1771, var3, var4, false);
                                                }
                                                class159 var14 = var13.field2731;
                                                if (var14 != null) {
                                                    var14.field2930.method20(0, class168.field3084, class29.field445, class231.field4135, class94.field1771, var14.field2927 - class134.field2601, var14.field2936 - class127.field2472, var14.field2929 - class30.field476, var14.field2920);
                                                }
                                                for (int var15 = 0; var15 < var13.field2741; var15++) {
                                                    class132 var16 = var13.field2746[var15];
                                                    if (var16 != null) {
                                                        var16.field2558.method20(var16.field2556, class168.field3084, class29.field445, class231.field4135, class94.field1771, var16.field2557 - class134.field2601, var16.field2549 - class127.field2472, var16.field2545 - class30.field476, var16.field2568);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field2737 == null) {
                                                if (var2.field2733 != null) {
                                                    if (class52.method366(var6, var3, var4)) {
                                                        class149.method1109(var2.field2733, class168.field3084, class29.field445, class231.field4135, class94.field1771, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class149.method1109(var2.field2733, class168.field3084, class29.field445, class231.field4135, class94.field1771, var3, var4, false);
                                                    }
                                                }
                                            } else if (class52.method366(var6, var3, var4)) {
                                                class234.method1622(var2.field2737, var6, class168.field3084, class29.field445, class231.field4135, class94.field1771, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field2737.field457 != 12345678 || class55.field908 && var5 <= class135.field2604) {
                                                    class234.method1622(var2.field2737, var6, class168.field3084, class29.field445, class231.field4135, class94.field1771, var3, var4, false);
                                                }
                                            }
                                            if (var17) {
                                                class211 var18 = var2.field2736;
                                                if (var18 != null && (var18.field3817 & 0x80000000L) != 0L) {
                                                    var18.field3828.method20(0, class168.field3084, class29.field445, class231.field4135, class94.field1771, var18.field3826 - class134.field2601, var18.field3822 - class127.field2472, var18.field3820 - class30.field476, var18.field3817);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class159 var21 = var2.field2731;
                                            class93 var22 = var2.field2742;
                                            if (var21 != null || var22 != null) {
                                                if (class110.field2072 == var3) {
                                                    var19++;
                                                } else if (class110.field2072 < var3) {
                                                    var19 += 2;
                                                }
                                                if (client.field1990 == var4) {
                                                    var19 += 3;
                                                } else if (client.field1990 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class46.field765[var19];
                                                var2.field2745 = class102.field1968[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field2935 & class183.field3367[var19]) == 0) {
                                                    var2.field2738 = 0;
                                                } else if (var21.field2935 == 16) {
                                                    var2.field2738 = 3;
                                                    var2.field2728 = class209.field3790[var19];
                                                    var2.field2735 = 3 - var2.field2728;
                                                } else if (var21.field2935 == 32) {
                                                    var2.field2738 = 6;
                                                    var2.field2728 = field4252[var19];
                                                    var2.field2735 = 6 - var2.field2728;
                                                } else if (var21.field2935 == 64) {
                                                    var2.field2738 = 12;
                                                    var2.field2728 = class205.field3709[var19];
                                                    var2.field2735 = 12 - var2.field2728;
                                                } else {
                                                    var2.field2738 = 9;
                                                    var2.field2728 = class159.field2934[var19];
                                                    var2.field2735 = 9 - var2.field2728;
                                                }
                                                if ((var21.field2935 & var20) != 0 && !class90.method698(var6, var3, var4, var21.field2935)) {
                                                    var21.field2930.method20(0, class168.field3084, class29.field445, class231.field4135, class94.field1771, var21.field2927 - class134.field2601, var21.field2936 - class127.field2472, var21.field2929 - class30.field476, var21.field2920);
                                                }
                                                if ((var21.field2928 & var20) != 0 && !class90.method698(var6, var3, var4, var21.field2928)) {
                                                    var21.field2932.method20(0, class168.field3084, class29.field445, class231.field4135, class94.field1771, var21.field2927 - class134.field2601, var21.field2936 - class127.field2472, var21.field2929 - class30.field476, var21.field2920);
                                                }
                                            }
                                            if (var22 != null && !class63.method444(var6, var3, var4, var22.field1748.method21())) {
                                                if ((var22.field1766 & var20) != 0) {
                                                    var22.field1748.method20(0, class168.field3084, class29.field445, class231.field4135, class94.field1771, var22.field1758 + var22.field1756 - class134.field2601, var22.field1753 - class127.field2472, var22.field1759 + var22.field1769 - class30.field476, var22.field1755);
                                                } else if (var22.field1766 == 256) {
                                                    int var23 = var22.field1758 - class134.field2601;
                                                    int var24 = var22.field1753 - class127.field2472;
                                                    int var25 = var22.field1759 - class30.field476;
                                                    int var26 = var22.field1752;
                                                    int var27;
                                                    if (var26 == 1 || var26 == 2) {
                                                        var27 = -var23;
                                                    } else {
                                                        var27 = var23;
                                                    }
                                                    int var28;
                                                    if (var26 == 2 || var26 == 3) {
                                                        var28 = -var25;
                                                    } else {
                                                        var28 = var25;
                                                    }
                                                    if (var28 < var27) {
                                                        var22.field1748.method20(0, class168.field3084, class29.field445, class231.field4135, class94.field1771, var22.field1756 + var23, var24, var22.field1769 + var25, var22.field1755);
                                                    } else if (var22.field1749 != null) {
                                                        var22.field1749.method20(0, class168.field3084, class29.field445, class231.field4135, class94.field1771, var23, var24, var25, var22.field1755);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class211 var29 = var2.field2736;
                                                if (var29 != null && (var29.field3817 & 0x80000000L) == 0L) {
                                                    var29.field3828.method20(0, class168.field3084, class29.field445, class231.field4135, class94.field1771, var29.field3826 - class134.field2601, var29.field3822 - class127.field2472, var29.field3820 - class30.field476, var29.field3817);
                                                }
                                                class125 var30 = var2.field2729;
                                                if (var30 != null && var30.field2420 == 0) {
                                                    if (var30.field2413 != null) {
                                                        var30.field2413.method20(0, class168.field3084, class29.field445, class231.field4135, class94.field1771, var30.field2405 - class134.field2601, var30.field2407 - class127.field2472, var30.field2409 - class30.field476, var30.field2417);
                                                    }
                                                    if (var30.field2418 != null) {
                                                        var30.field2418.method20(0, class168.field3084, class29.field445, class231.field4135, class94.field1771, var30.field2405 - class134.field2601, var30.field2407 - class127.field2472, var30.field2409 - class30.field476, var30.field2417);
                                                    }
                                                    if (var30.field2421 != null) {
                                                        var30.field2421.method20(0, class168.field3084, class29.field445, class231.field4135, class94.field1771, var30.field2405 - class134.field2601, var30.field2407 - class127.field2472, var30.field2409 - class30.field476, var30.field2417);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field2747;
                                            if (var31 != 0) {
                                                if (var3 < class110.field2072 && (var31 & 0x4) != 0) {
                                                    class144 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field2732) {
                                                        class65.field1101.method1018((byte) 62, var32);
                                                    }
                                                }
                                                if (var4 < client.field1990 && (var31 & 0x2) != 0) {
                                                    class144 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field2732) {
                                                        class65.field1101.method1018((byte) 105, var33);
                                                    }
                                                }
                                                if (var3 > class110.field2072 && (var31 & 0x1) != 0) {
                                                    class144 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field2732) {
                                                        class65.field1101.method1018((byte) 100, var34);
                                                    }
                                                }
                                                if (var4 > client.field1990 && (var31 & 0x8) != 0) {
                                                    class144 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field2732) {
                                                        class65.field1101.method1018((byte) 90, var35);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field2738 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field2741; var37++) {
                                                if (class114.field2147 != var2.field2746[var37].field2559 && (var2.field2725[var37] & var2.field2738) == var2.field2728) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class159 var38 = var2.field2731;
                                                if (!class90.method698(var6, var3, var4, var38.field2935)) {
                                                    var38.field2930.method20(0, class168.field3084, class29.field445, class231.field4135, class94.field1771, var38.field2927 - class134.field2601, var38.field2936 - class127.field2472, var38.field2929 - class30.field476, var38.field2920);
                                                }
                                                var2.field2738 = 0;
                                            }
                                        }
                                        if (!var2.field2739) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field2741;
                                            var2.field2739 = false;
                                            int var40 = 0;
                                            label572: for (int var41 = 0; var41 < var39; var41++) {
                                                class132 var42 = var2.field2746[var41];
                                                if (class114.field2147 != var42.field2559) {
                                                    for (int var43 = var42.field2555; var43 <= var42.field2565; var43++) {
                                                        for (int var44 = var42.field2550; var44 <= var42.field2551; var44++) {
                                                            class144 var45 = var7[var43][var44];
                                                            if (var45.field2724) {
                                                                var2.field2739 = true;
                                                                continue label572;
                                                            }
                                                            if (var45.field2738 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field2555) {
                                                                    var46++;
                                                                }
                                                                if (var43 < var42.field2565) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field2550) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field2551) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field2738) == var2.field2735) {
                                                                    var2.field2739 = true;
                                                                    continue label572;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class139.field2662[var40++] = var42;
                                                    int var47 = class110.field2072 - var42.field2555;
                                                    int var48 = var42.field2565 - class110.field2072;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = client.field1990 - var42.field2550;
                                                    int var50 = var42.field2551 - client.field1990;
                                                    if (var50 > var49) {
                                                        var42.field2548 = var47 + var50;
                                                    } else {
                                                        var42.field2548 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; var53++) {
                                                    class132 var54 = class139.field2662[var53];
                                                    if (class114.field2147 != var54.field2559) {
                                                        if (var54.field2548 > var51) {
                                                            var51 = var54.field2548;
                                                            var52 = var53;
                                                        } else if (var54.field2548 == var51) {
                                                            int var55 = var54.field2557 - class134.field2601;
                                                            int var56 = var54.field2545 - class30.field476;
                                                            int var57 = class139.field2662[var52].field2557 - class134.field2601;
                                                            int var58 = class139.field2662[var52].field2545 - class30.field476;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class132 var59 = class139.field2662[var52];
                                                var59.field2559 = class114.field2147;
                                                if (!class52.method365(var6, var59.field2555, var59.field2565, var59.field2550, var59.field2551, var59.field2558.method21())) {
                                                    var59.field2558.method20(var59.field2556, class168.field3084, class29.field445, class231.field4135, class94.field1771, var59.field2557 - class134.field2601, var59.field2549 - class127.field2472, var59.field2545 - class30.field476, var59.field2568);
                                                }
                                                for (int var60 = var59.field2555; var60 <= var59.field2565; var60++) {
                                                    for (int var61 = var59.field2550; var61 <= var59.field2551; var61++) {
                                                        class144 var62 = var7[var60][var61];
                                                        if (var62.field2738 != 0) {
                                                            class65.field1101.method1018((byte) 119, var62);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field2732) {
                                                            class65.field1101.method1018((byte) 97, var62);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field2739) {
                                                break;
                                            }
                                        } catch (Exception var81) {
                                            var2.field2739 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field2732);
                            } while (var2.field2738 != 0);
                            if (var3 > class110.field2072 || var3 <= class2.field42) {
                                break;
                            }
                            var63 = var7[var3 - 1][var4];
                        } while (var63 != null && var63.field2732);
                        if (var3 < class110.field2072 || var3 >= class220.field4009 - 1) {
                            break;
                        }
                        var64 = var7[var3 + 1][var4];
                    } while (var64 != null && var64.field2732);
                    if (var4 > client.field1990 || var4 <= class136.field2628) {
                        break;
                    }
                    var65 = var7[var3][var4 - 1];
                } while (var65 != null && var65.field2732);
                if (var4 < client.field1990 || var4 >= class87.field1622 - 1) {
                    break;
                }
                var66 = var7[var3][var4 + 1];
            } while (var66 != null && var66.field2732);
            var2.field2732 = false;
            class8.field145--;
            class125 var67 = var2.field2729;
            if (var67 != null && var67.field2420 != 0) {
                if (var67.field2413 != null) {
                    var67.field2413.method20(0, class168.field3084, class29.field445, class231.field4135, class94.field1771, var67.field2405 - class134.field2601, var67.field2407 - class127.field2472 - var67.field2420, var67.field2409 - class30.field476, var67.field2417);
                }
                if (var67.field2418 != null) {
                    var67.field2418.method20(0, class168.field3084, class29.field445, class231.field4135, class94.field1771, var67.field2405 - class134.field2601, var67.field2407 - class127.field2472 - var67.field2420, var67.field2409 - class30.field476, var67.field2417);
                }
                if (var67.field2421 != null) {
                    var67.field2421.method20(0, class168.field3084, class29.field445, class231.field4135, class94.field1771, var67.field2405 - class134.field2601, var67.field2407 - class127.field2472 - var67.field2420, var67.field2409 - class30.field476, var67.field2417);
                }
            }
            if (var2.field2745 != 0) {
                class93 var68 = var2.field2742;
                if (var68 != null && !class63.method444(var6, var3, var4, var68.field1748.method21())) {
                    if ((var68.field1766 & var2.field2745) != 0) {
                        var68.field1748.method20(0, class168.field3084, class29.field445, class231.field4135, class94.field1771, var68.field1758 + var68.field1756 - class134.field2601, var68.field1753 - class127.field2472, var68.field1759 + var68.field1769 - class30.field476, var68.field1755);
                    } else if (var68.field1766 == 256) {
                        int var69 = var68.field1758 - class134.field2601;
                        int var70 = var68.field1753 - class127.field2472;
                        int var71 = var68.field1759 - class30.field476;
                        int var72 = var68.field1752;
                        int var73;
                        if (var72 == 1 || var72 == 2) {
                            var73 = -var69;
                        } else {
                            var73 = var69;
                        }
                        int var74;
                        if (var72 == 2 || var72 == 3) {
                            var74 = -var71;
                        } else {
                            var74 = var71;
                        }
                        if (var74 >= var73) {
                            var68.field1748.method20(0, class168.field3084, class29.field445, class231.field4135, class94.field1771, var68.field1756 + var69, var70, var68.field1769 + var71, var68.field1755);
                        } else if (var68.field1749 != null) {
                            var68.field1749.method20(0, class168.field3084, class29.field445, class231.field4135, class94.field1771, var69, var70, var71, var68.field1755);
                        }
                    }
                }
                class159 var75 = var2.field2731;
                if (var75 != null) {
                    if ((var75.field2928 & var2.field2745) != 0 && !class90.method698(var6, var3, var4, var75.field2928)) {
                        var75.field2932.method20(0, class168.field3084, class29.field445, class231.field4135, class94.field1771, var75.field2927 - class134.field2601, var75.field2936 - class127.field2472, var75.field2929 - class30.field476, var75.field2920);
                    }
                    if ((var75.field2935 & var2.field2745) != 0 && !class90.method698(var6, var3, var4, var75.field2935)) {
                        var75.field2930.method20(0, class168.field3084, class29.field445, class231.field4135, class94.field1771, var75.field2927 - class134.field2601, var75.field2936 - class127.field2472, var75.field2929 - class30.field476, var75.field2920);
                    }
                }
            }
            if (var5 < class7.field126 - 1) {
                class144 var76 = class259.field4542[var5 + 1][var3][var4];
                if (var76 != null && var76.field2732) {
                    class65.field1101.method1018((byte) 98, var76);
                }
            }
            if (var3 < class110.field2072) {
                class144 var77 = var7[var3 + 1][var4];
                if (var77 != null && var77.field2732) {
                    class65.field1101.method1018((byte) 77, var77);
                }
            }
            if (var4 < client.field1990) {
                class144 var78 = var7[var3][var4 + 1];
                if (var78 != null && var78.field2732) {
                    class65.field1101.method1018((byte) 70, var78);
                }
            }
            if (var3 > class110.field2072) {
                class144 var79 = var7[var3 - 1][var4];
                if (var79 != null && var79.field2732) {
                    class65.field1101.method1018((byte) 85, var79);
                }
            }
            if (var4 > client.field1990) {
                class144 var80 = var7[var3][var4 - 1];
                if (var80 != null && var80.field2732) {
                    class65.field1101.method1018((byte) 113, var80);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(I)V")
    public static void method1655(int arg0) {
        field4251 = null;
        field4263 = null;
        field4265 = null;
        if (arg0 != 1) {
            field4251 = null;
        }
        field4245 = null;
        field4257 = null;
        field4260 = null;
        field4249 = null;
        field4248 = null;
        field4254 = null;
        field4256 = null;
        field4252 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILqh;I)I")
    public static final int method1656(int arg0, class69 arg1, int arg2) {
        field4266++;
        if (arg1.field1289 == null || arg2 >= arg1.field1289.length) {
            return -2;
        }
        try {
            int[] var3 = arg1.field1289[arg2];
            if (arg0 != -23835) {
                return 23;
            }
            int var4 = 0;
            byte var5 = 0;
            int var6 = 0;
            while (true) {
                int var7 = var3[var4++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var6;
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 1) {
                    var8 = class190.field3480[var3[var4++]];
                }
                if (var7 == 2) {
                    var8 = class13.field210[var3[var4++]];
                }
                if (var7 == 3) {
                    var8 = class50.field841[var3[var4++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var4++] << 16;
                    int var11 = var10 + var3[var4++];
                    class69 var12 = class124.method989((byte) 124, var11);
                    int var13 = var3[var4++];
                    if (var13 != -1 && (!class120.method939(22952, var13).field1866 || class161.field2956)) {
                        for (int var14 = 0; var14 < var12.field1219.length; var14++) {
                            if ((var13 + 1) == var12.field1219[var14]) {
                                var8 += var12.field1332[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class119.field2252[var3[var4++]];
                }
                if (var7 == 6) {
                    var8 = class264.field4588[class13.field210[var3[var4++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class119.field2252[var3[var4++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class235.field4203.field2437;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class123.field2386[var15]) {
                            var8 += class13.field210[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var4++] << 16;
                    int var17 = var16 + var3[var4++];
                    class69 var18 = class124.method989((byte) 120, var17);
                    int var19 = var3[var4++];
                    if (var19 != -1 && (!class120.method939(22952, var19).field1866 || class161.field2956)) {
                        for (int var20 = 0; var20 < var18.field1219.length; var20++) {
                            if ((var19 + 1) == var18.field1219[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class102.field1962;
                }
                if (var7 == 12) {
                    var8 = class262.field4587;
                }
                if (var7 == 13) {
                    int var21 = class119.field2252[var3[var4++]];
                    int var22 = var3[var4++];
                    var8 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var4++];
                    var8 = class144.method1095(var23, (byte) 104);
                }
                if (var7 == 18) {
                    var8 = (class235.field4203.field3633 >> 7) + class62.field1035;
                }
                if (var7 == 19) {
                    var8 = (class235.field4203.field3615 >> 7) + class257.field4500;
                }
                if (var7 == 20) {
                    var8 = var3[var4++];
                }
                if (var9 == 0) {
                    if (var5 == 0) {
                        var6 += var8;
                    }
                    if (var5 == 1) {
                        var6 -= var8;
                    }
                    if (var5 == 2 && var8 != 0) {
                        var6 /= var8;
                    }
                    if (var5 == 3) {
                        var6 *= var8;
                    }
                    var5 = 0;
                } else {
                    var5 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "(I)V")
    public final void method1657(int arg0) {
        if (arg0 < 84) {
            this.field4262 = null;
        }
        if (this.field4262 != null) {
            for (int var2 = 0; var2 < this.field4262.length; var2++) {
                this.field4262[var2] = class3.method27(this.field4262[var2], 32768);
            }
        }
        field4267++;
        if (this.field4246 != null) {
            for (int var3 = 0; var3 < this.field4246.length; var3++) {
                this.field4246[var3] = class3.method27(this.field4246[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)I")
    public final int method1658(int arg0, int arg1) {
        if (arg0 != -11507) {
            return -85;
        }
        field4264++;
        if (this.field4246 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field4246.length; var3++) {
            if (this.field4255[var3] == arg1) {
                return this.field4246[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIILqh;IIZ)V")
    public static final void method1659(int arg0, int arg1, int arg2, class69 arg3, int arg4, int arg5, boolean arg6) {
        int var7 = arg1 * arg1 + (arg2 * arg2);
        if (arg6) {
            return;
        }
        field4258++;
        if (var7 > 360000) {
            return;
        }
        int var8 = Math.min(arg3.field1183 / 2, arg3.field1220 / 2);
        if (var7 <= (var8 * var8)) {
            class52.method362(arg1, arg4, class110.field2073[arg5], arg0, arg3, arg2, !arg6);
            return;
        }
        var8 -= 10;
        int var9 = class93.field1750 + class40.field667 & 0x7FF;
        int var10 = class98.field1843[var9];
        int var11 = var10 * 256 / (class26.field410 + 256);
        int var12 = class98.field1839[var9];
        int var13 = var12 * 256 / (class26.field410 + 256);
        int var14 = arg2 * var11 - (arg1 * var13) >> 16;
        int var15 = arg1 * var11 + arg2 * var13 >> 16;
        double var16 = Math.atan2((double) var15, (double) var14);
        int var18 = (int) ((double) var8 * Math.sin(var16));
        int var19 = (int) ((double) var8 * Math.cos(var16));
        ((class105) class192.field3515[arg5]).method99(arg0 + (arg3.field1183 / 2) + var18 - 10, arg3.field1220 / 2 + arg4 - 10 + -var19, 20, 20, 15, 15, var16, 256);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILpg;I)V")
    private final void method1660(int arg0, class81 arg1, int arg2) {
        if (arg0 == 1) {
            this.field4259 = arg1.method605(true);
        } else if (arg0 == 2) {
            int var4 = arg1.method622(true);
            this.field4246 = new int[var4];
            this.field4255 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4246[var5] = arg1.method658(-106);
                int var6 = arg1.method622(true);
                if (var6 == 0) {
                    this.field4255[var5] = -1;
                } else {
                    this.field4255[var5] = var6;
                }
            }
        } else if (arg0 == 3) {
            int var7 = arg1.method622(true);
            this.field4262 = new int[var7];
            this.field4253 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field4262[var8] = arg1.method658(-83);
                int var9 = arg1.method622(true);
                if (var9 == 0) {
                    this.field4253[var8] = -1;
                } else {
                    this.field4253[var8] = var9;
                }
            }
        }
        field4268++;
        int var10 = -73 / ((arg2 - 52) / 62);
    }
}
