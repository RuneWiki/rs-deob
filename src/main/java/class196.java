import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class196 extends class215 {

    @OriginalMember(owner = "client!dk", name = "O", descriptor = "[S")
    private short[] field3118 = new short[512];

    @OriginalMember(owner = "client!dk", name = "R", descriptor = "I")
    private int field3120 = 5;

    @OriginalMember(owner = "client!dk", name = "X", descriptor = "[B")
    private byte[] field3126 = new byte[512];

    @OriginalMember(owner = "client!dk", name = "Z", descriptor = "I")
    private int field3128 = 1;

    @OriginalMember(owner = "client!dk", name = "Y", descriptor = "I")
    private int field3127 = 5;

    @OriginalMember(owner = "client!dk", name = "db", descriptor = "I")
    private int field3132 = 2;

    @OriginalMember(owner = "client!dk", name = "U", descriptor = "I")
    private int field3123 = 2048;

    @OriginalMember(owner = "client!dk", name = "V", descriptor = "I")
    private int field3124 = 0;

    @OriginalMember(owner = "client!dk", name = "T", descriptor = "Lab;")
    public static class269 field3122 = new class269();

    @OriginalMember(owner = "client!dk", name = "bb", descriptor = "Ljava/lang/String;")
    public static String field3130 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!dk", name = "cb", descriptor = "Z")
    public static boolean field3131 = true;

    @OriginalMember(owner = "client!dk", name = "ab", descriptor = "I")
    public static int field3129 = 0;

    @OriginalMember(owner = "client!dk", name = "N", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!dk", name = "Q", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!dk", name = "W", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!dk", name = "eb", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!dk", name = "fb", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!dk", name = "gb", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!dk", name = "S", descriptor = "Leh;")
    public static class137 field3121;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "(I)V")
    private final void method1375(int arg0) {
        if (arg0 != 512) {
            this.field3124 = 28;
        }
        ++field3117;
        Random var2 = new Random((long) this.field3124);
        this.field3118 = new short[512];
        if (this.field3123 > 0) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field3118[var3] = (short) class40.method222(this.field3123, -124, var2);
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IILpd;)V")
    public final void method45(int arg0, int arg1, class96 arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (~arg1 == -7) {
                                    this.field3127 = arg2.method584(255);
                                }
                            } else {
                                this.field3120 = arg2.method584(255);
                            }
                        } else {
                            this.field3128 = arg2.method584(255);
                        }
                    } else {
                        this.field3132 = arg2.method584(arg0 ^ 1521146131);
                    }
                } else {
                    this.field3123 = arg2.method549(255);
                }
            } else {
                this.field3124 = arg2.method584(255);
            }
        } else {
            this.field3120 = this.field3127 = arg2.method584(255);
        }
        ++field3119;
        if (arg0 != 1521146348) {
            this.method45(-36, 91, (class96) null);
        }
    }

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "(I)V")
    public static void method1376(int arg0) {
        field3121 = null;
        if (arg0 != -22714) {
            method1380(false, (class144[]) null, (int[][][]) null, 46);
        }
        field3130 = null;
        field3122 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "()V")
    public static final void method1377() {
        if (class84.field1044 != null) {
            for (int var0 = 0; var0 < class84.field1044.length; ++var0) {
                for (int var1 = 0; var1 < class88.field1076; ++var1) {
                    for (int var2 = 0; var2 < class59.field752; ++var2) {
                        class84.field1044[var0][var1][var2] = null;
                    }
                }
            }
        }
        if (class75.field943 != null) {
            for (int var3 = 0; var3 < class75.field943.length; ++var3) {
                for (int var4 = 0; var4 < class88.field1076; ++var4) {
                    for (int var5 = 0; var5 < class59.field752; ++var5) {
                        class75.field943[var3][var4][var5] = null;
                    }
                }
            }
        }
        class286.field4564 = 0;
        if (class120.field1704 != null) {
            for (int var6 = 0; var6 < class286.field4564; ++var6) {
                class120.field1704[var6] = null;
            }
        }
        if (class247.field4069 != null) {
            for (int var7 = 0; var7 < class152.field2362; ++var7) {
                class247.field4069[var7] = null;
            }
            class152.field2362 = 0;
        }
        if (class209.field3329 != null) {
            for (int var8 = 0; var8 < class209.field3329.length; ++var8) {
                class209.field3329[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1378(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3125;
        int var8 = arg4 - arg7;
        if (~var8 <= -1) {
            if (~var8 < -101) {
                var8 = 100;
            }
        } else {
            var8 = 0;
        }
        int var9 = 2048 - arg0 & 2047;
        int var10 = (-class191.field3075 + class101.field1359) * var8 / 100 + class191.field3075;
        int var11 = 0;
        int var12 = -arg3 + 2048 & 2047;
        int var13 = arg5 * var10 >> 8;
        int var14 = var13;
        int var15 = 0;
        if (~var9 != -1) {
            int var16 = class174.field2759[var9];
            int var17 = class174.field2753[var9];
            var15 = -var13 * var17 >> 16;
            var14 = var13 * var16 >> 16;
        }
        if (var12 != 0) {
            int var18 = class174.field2753[var12];
            var11 = var14 * var18 >> 16;
            int var19 = class174.field2759[var12];
            var14 = var14 * var19 >> 16;
        }
        class23.field311 = arg3;
        class252.field4114 = -var15 + arg1;
        class74.field932 = -var11 + arg2;
        class36.field465 = -var14 + arg6;
        class242.field3986 = arg0;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1379(int arg0, int arg1, int arg2, int arg3) {
        if (!class222.method1567(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class186.method1299(var4 + 1, class17.field209[arg0][arg1][arg2] + arg3, var5 + 1) && class186.method1299(var4 + 128 - 1, class17.field209[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class186.method1299(var4 + 128 - 1, class17.field209[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class186.method1299(var4 + 1, class17.field209[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z[Loj;[[[II)V")
    public static final void method1380(boolean arg0, class144[] arg1, int[][][] arg2, int arg3) {
        ++field3135;
        if (!arg0) {
            for (int var4 = 0; var4 < 4; ++var4) {
                for (int var5 = 0; ~var5 > -105; ++var5) {
                    for (int var6 = 0; var6 < 104; ++var6) {
                        if (~(class117.field1664[var4][var5][var6] & 1) == -2) {
                            int var7 = var4;
                            if ((class117.field1664[1][var5][var6] & 2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (~var7 <= -1) {
                                arg1[var7].method1002(var6, var5, arg3 ^ 21126);
                            }
                        }
                    }
                }
            }
            class101.field1344 += -2 + (int) (Math.random() * 5.0D);
            if (~class101.field1344 > 7) {
                class101.field1344 = -8;
            }
            class271.field4338 += (int) (5.0D * Math.random()) - 2;
            if (~class271.field4338 > 15) {
                class271.field4338 = -16;
            }
            if (~class101.field1344 < -9) {
                class101.field1344 = 8;
            }
            if (class271.field4338 > 16) {
                class271.field4338 = 16;
            }
        }
        byte var8;
        if (!arg0) {
            var8 = 4;
        } else {
            var8 = 1;
        }
        int var9 = class101.field1344 >> 2 << 10;
        if (arg3 != -21217) {
            field3122 = null;
        }
        int var10 = class271.field4338 >> 1;
        int[][] var11 = new int[104][104];
        int[][] var12 = new int[104][104];
        for (int var13 = 0; var13 < var8; ++var13) {
            byte[][] var52 = class230.field3747[var13];
            int var53 = (int) Math.sqrt(5100.0D);
            int var54 = var53 * 768 >> 8;
            for (int var55 = 1; ~var55 > -104; ++var55) {
                for (int var101 = 1; ~var101 > -104; ++var101) {
                    int var102 = class17.field209[var13][var101 - -1][var55] + -class17.field209[var13][var101 - 1][var55];
                    int var103 = class17.field209[var13][var101][var55 + 1] - class17.field209[var13][var101][var55 + -1];
                    byte var104 = 74;
                    int var105 = (int) Math.sqrt((double) (var102 * var102 + var103 * var103 + 65536));
                    int var106 = (var102 << 8) / var105;
                    int var107 = -65536 / var105;
                    int var108 = (var103 << 8) / var105;
                    int var109 = (var52[var101 + -1][var55] >> 2) - -(var52[var101][var55] >> 1) + (var52[var101][var55 - -1] >> 3) + (var52[var101][var55 + -1] >> 2) + (var52[var101 + 1][var55] >> 3);
                    int var110 = (var107 * -10 + var106 * -50 + var108 * -50) / var54 + var104;
                    var12[var101][var55] = -var109 + var110;
                }
            }
            for (int var56 = 0; var56 < 104; ++var56) {
                class128.field2060[var56] = 0;
                class271.field4336[var56] = 0;
                class186.field2967[var56] = 0;
                class34.field434[var56] = 0;
                class35.field449[var56] = 0;
            }
            for (int var57 = -5; ~var57 > -105; ++var57) {
                for (int var86 = 0; ~var86 > -105; ++var86) {
                    int var95 = var57 + 5;
                    int var10002;
                    if (var95 < 104) {
                        int var96 = class107.field1441[var13][var95][var86] & 255;
                        if (var96 > 0) {
                            class5 var97 = class54.method307(var96 + -1, 4728);
                            class128.field2060[var86] += var97.field82;
                            class271.field4336[var86] += var97.field73;
                            class186.field2967[var86] += var97.field78;
                            class34.field434[var86] += var97.field76;
                            var10002 = class35.field449[var86]++;
                        }
                    }
                    int var98 = var57 + -5;
                    if (var98 >= 0) {
                        int var99 = class107.field1441[var13][var98][var86] & 255;
                        if (~var99 < -1) {
                            class5 var100 = class54.method307(var99 + -1, 4728);
                            class128.field2060[var86] -= var100.field82;
                            class271.field4336[var86] -= var100.field73;
                            class186.field2967[var86] -= var100.field78;
                            class34.field434[var86] -= var100.field76;
                            var10002 = class35.field449[var86]--;
                        }
                    }
                }
                if (~var57 <= -1) {
                    int var87 = 0;
                    int var88 = 0;
                    int var89 = 0;
                    int var90 = 0;
                    int var91 = 0;
                    for (int var92 = -5; var92 < 104; ++var92) {
                        int var93 = var92 + 5;
                        if (~var93 > -105) {
                            var88 += class271.field4336[var93];
                            var90 += class186.field2967[var93];
                            var87 += class128.field2060[var93];
                            var89 += class35.field449[var93];
                            var91 += class34.field434[var93];
                        }
                        int var94 = var92 - 5;
                        if (~var94 <= -1) {
                            var90 -= class186.field2967[var94];
                            var87 -= class128.field2060[var94];
                            var89 -= class35.field449[var94];
                            var88 -= class271.field4336[var94];
                            var91 -= class34.field434[var94];
                        }
                        if (~var92 <= -1 && ~var89 < -1) {
                            var11[var57][var92] = class269.method1813(var90 / var89, var88 / var89, var87 * 256 / var91, 15242);
                        }
                    }
                }
            }
            for (int var58 = 1; var58 < 103; ++var58) {
                for (int var59 = 1; ~var59 > -104; ++var59) {
                    if (arg0 || class226.method1599((byte) 95) || ~(class117.field1664[0][var58][var59] & 2) != -1 || (class117.field1664[var13][var58][var59] & 16) == 0 && class192.method1330(-4745, var59, var58, var13) == class126.field2025) {
                        if (class294.field4656 > var13) {
                            class294.field4656 = var13;
                        }
                        int var60 = class107.field1441[var13][var58][var59] & 255;
                        int var61 = class50.field646[var13][var58][var59] & 255;
                        if (var60 > 0 || ~var61 < -1) {
                            int var62 = class17.field209[var13][var58][var59];
                            int var63 = class17.field209[var13][var58 - -1][var59];
                            int var64 = class17.field209[var13][var58 - -1][var59 + 1];
                            int var65 = class17.field209[var13][var58][var59 + 1];
                            if (var13 > 0) {
                                boolean var66 = true;
                                if (var60 == 0 && class161.field2569[var13][var58][var59] != 0) {
                                    var66 = false;
                                }
                                if (var61 > 0 && !class224.method1585(var61 + -1, (byte) 123).field3623) {
                                    var66 = false;
                                }
                                if (var66 && ~var62 == ~var63 && var62 == var64 && ~var62 == ~var65) {
                                    class289.field4604[var13][var58][var59] = class154.method1048(class289.field4604[var13][var58][var59], 4);
                                }
                            }
                            int var67;
                            int var68;
                            if (~var60 >= -1) {
                                var67 = 0;
                                var68 = -1;
                            } else {
                                var68 = var11[var58][var59];
                                int var69 = (var68 & 127) + var10;
                                if (~var69 <= -1) {
                                    if (var69 > 127) {
                                        var69 = 127;
                                    }
                                } else {
                                    var69 = 0;
                                }
                                int var70 = (var9 + var68 & 64512) + (896 & var68) + var69;
                                var67 = class174.field2764[class293.method1970(96, var70, (byte) -107)];
                            }
                            int var71 = var12[var58][var59];
                            int var72 = var12[var58 - -1][var59];
                            int var73 = var12[var58 - -1][var59 + 1];
                            int var74 = var12[var58][var59 + 1];
                            if (var61 != 0) {
                                int var75 = class161.field2569[var13][var58][var59] + 1;
                                byte var76 = class143.field2260[var13][var58][var59];
                                class225 var77 = class224.method1585(var61 + -1, (byte) 112);
                                int var78 = var77.field3619;
                                if (~var78 <= -1 && !class174.field2756.method781(19146, var78)) {
                                    var78 = -1;
                                }
                                int var79;
                                int var82;
                                if (var78 < 0) {
                                    if (~var77.field3614 != 0) {
                                        var79 = var77.field3614;
                                        int var80 = (127 & var79) + var10;
                                        if (var80 >= 0) {
                                            if (~var80 < -128) {
                                                var80 = 127;
                                            }
                                        } else {
                                            var80 = 0;
                                        }
                                        int var81 = (var9 + var79 & 64512) + (var79 & 896) + var80;
                                        var82 = class174.field2764[class111.method718((byte) -108, var81, 96)];
                                    } else {
                                        var82 = 0;
                                        var79 = -2;
                                    }
                                } else {
                                    var82 = class174.field2764[class111.method718((byte) -108, class174.field2756.method779(-7078, var78), 96)];
                                    var79 = -1;
                                }
                                if (var77.field3625 >= 0) {
                                    int var83 = var77.field3625;
                                    int var84 = (var83 & 127) + var10;
                                    if (~var84 > -1) {
                                        var84 = 0;
                                    } else if (~var84 < -128) {
                                        var84 = 127;
                                    }
                                    int var85 = (896 & var83) + ((64512 & var9 + var83) - -var84);
                                    var82 = class174.field2764[class111.method718((byte) -108, var85, 96)];
                                }
                                class59.method344(var13, var58, var59, var75, var76, var78, var62, var63, var64, var65, class293.method1970(var71, var68, (byte) -119), class293.method1970(var72, var68, (byte) -107), class293.method1970(var73, var68, (byte) -118), class293.method1970(var74, var68, (byte) -99), class111.method718((byte) -108, var79, var71), class111.method718((byte) -108, var79, var72), class111.method718((byte) -108, var79, var73), class111.method718((byte) -108, var79, var74), var67, var82);
                            } else {
                                class59.method344(var13, var58, var59, 0, 0, -1, var62, var63, var64, var65, class293.method1970(var71, var68, (byte) -127), class293.method1970(var72, var68, (byte) -106), class293.method1970(var73, var68, (byte) -124), class293.method1970(var74, var68, (byte) -128), 0, 0, 0, 0, var67, 0);
                            }
                        }
                    }
                }
            }
            class107.field1441[var13] = null;
            class50.field646[var13] = null;
            class161.field2569[var13] = null;
            class143.field2260[var13] = null;
            class230.field3747[var13] = null;
        }
        class218.method1541(-50, -10, -50);
        if (!arg0) {
            for (int var14 = 0; var14 < 104; ++var14) {
                for (int var51 = 0; ~var51 > -105; ++var51) {
                    if (~(2 & class117.field1664[1][var14][var51]) == -3) {
                        class295.method1977(var14, var51);
                    }
                }
            }
            for (int var15 = 0; ~var15 > -5; ++var15) {
                for (int var16 = 0; var16 <= 104; ++var16) {
                    for (int var17 = 0; ~var17 >= -105; ++var17) {
                        if (~(1 & class289.field4604[var15][var17][var16]) != -1) {
                            int var18 = var16;
                            int var19 = var16;
                            int var20 = var15;
                            while (~var18 > -105 && (class289.field4604[var15][var17][var18 + 1] & 1) != 0) {
                                ++var18;
                            }
                            int var21 = var15;
                            while (var19 > 0 && (1 & class289.field4604[var15][var17][var19 + -1]) != 0) {
                                --var19;
                            }
                            label352: while (~var20 < -1) {
                                for (int var22 = var19; var22 <= var18; ++var22) {
                                    if (~(class289.field4604[var20 + -1][var17][var22] & 1) == -1) {
                                        break label352;
                                    }
                                }
                                --var20;
                            }
                            label341: while (var21 < 3) {
                                for (int var23 = var19; ~var23 >= ~var18; ++var23) {
                                    if (~(1 & class289.field4604[var21 - -1][var17][var23]) == -1) {
                                        break label341;
                                    }
                                }
                                ++var21;
                            }
                            int var24 = (-var19 + 1 + var18) * (var21 + 1 + -var20);
                            if (var24 >= 8) {
                                int var25 = class17.field209[var20][var17][var19];
                                short var26 = 240;
                                int var27 = class17.field209[var21][var17][var19] + -var26;
                                class272.method1822(1, var17 * 128, var17 * 128, var19 * 128, var18 * 128 + 128, var27, var25);
                                for (int var28 = var20; ~var28 >= ~var21; ++var28) {
                                    for (int var29 = var19; ~var18 <= ~var29; ++var29) {
                                        class289.field4604[var28][var17][var29] = class173.method1186(class289.field4604[var28][var17][var29], -2);
                                    }
                                }
                            }
                        }
                        if (~(class289.field4604[var15][var17][var16] & 2) != -1) {
                            int var30 = var17;
                            int var31 = var15;
                            int var32;
                            for (var32 = var17; ~var32 < -1 && ~(class289.field4604[var15][var32 - 1][var16] & 2) != -1; --var32) {
                            }
                            int var33 = var15;
                            while (~var30 > -105 && (2 & class289.field4604[var15][var30 + 1][var16]) != 0) {
                                ++var30;
                            }
                            label406: while (var31 > 0) {
                                for (int var34 = var32; var34 <= var30; ++var34) {
                                    if ((class289.field4604[var31 + -1][var34][var16] & 2) == 0) {
                                        break label406;
                                    }
                                }
                                --var31;
                            }
                            label395: while (var33 < 3) {
                                for (int var35 = var32; var35 <= var30; ++var35) {
                                    if (~(2 & class289.field4604[var33 - -1][var35][var16]) == -1) {
                                        break label395;
                                    }
                                }
                                ++var33;
                            }
                            int var36 = (var33 - -1 + -var31) * (var30 + 1 + -var32);
                            if (~var36 <= -9) {
                                int var37 = class17.field209[var31][var32][var16];
                                short var38 = 240;
                                int var39 = class17.field209[var33][var32][var16] + -var38;
                                class272.method1822(2, var32 * 128, var30 * 128 + 128, var16 * 128, var16 * 128, var39, var37);
                                for (int var40 = var31; ~var40 >= ~var33; ++var40) {
                                    for (int var41 = var32; ~var41 >= ~var30; ++var41) {
                                        class289.field4604[var40][var41][var16] = class173.method1186(class289.field4604[var40][var41][var16], -3);
                                    }
                                }
                            }
                        }
                        if (~(class289.field4604[var15][var17][var16] & 4) != -1) {
                            int var42 = var17;
                            int var43 = var17;
                            int var44;
                            for (var44 = var16; var44 > 0 && (class289.field4604[var15][var17][var44 + -1] & 4) != 0; --var44) {
                            }
                            int var45;
                            for (var45 = var16; var45 < 104 && ~(class289.field4604[var15][var17][var45 - -1] & 4) != -1; ++var45) {
                            }
                            label460: while (var42 > 0) {
                                for (int var46 = var44; ~var46 >= ~var45; ++var46) {
                                    if (~(4 & class289.field4604[var15][var42 + -1][var46]) == -1) {
                                        break label460;
                                    }
                                }
                                --var42;
                            }
                            label449: while (~var43 > -105) {
                                for (int var47 = var44; var45 >= var47; ++var47) {
                                    if ((4 & class289.field4604[var15][var43 + 1][var47]) == 0) {
                                        break label449;
                                    }
                                }
                                ++var43;
                            }
                            if ((-var42 + var43 + 1) * (-var44 + 1 + var45) >= 4) {
                                int var48 = class17.field209[var15][var42][var44];
                                class272.method1822(4, var42 * 128, var43 * 128 + 128, var44 * 128, var45 * 128 + 128, var48, var48);
                                for (int var49 = var42; var49 <= var43; ++var49) {
                                    for (int var50 = var44; ~var50 >= ~var45; ++var50) {
                                        class289.field4604[var15][var49][var50] = class173.method1186(class289.field4604[var15][var49][var50], -5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(II)[I")
    public final int[] method47(int arg0, int arg1) {
        int[] var3 = super.field3445.method1755(arg0, (byte) 105);
        if (super.field3445.field4163) {
            int var4 = 2048 - -(class76.field956[arg0] * this.field3127);
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; ~class244.field4015 < ~var7; ++var7) {
                class213.field3419 = Integer.MAX_VALUE;
                class44.field548 = Integer.MAX_VALUE;
                class208.field3324 = Integer.MAX_VALUE;
                class25.field350 = Integer.MAX_VALUE;
                int var8 = class166.field2657[var7] * this.field3120 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; ~var6 <= ~var11; ++var11) {
                    int var13 = this.field3126[(var11 < this.field3127 ? var11 : var11 - this.field3127) & 255] & 255;
                    for (int var14 = var9 + -1; var14 <= var10; ++var14) {
                        int var15 = 2 * (this.field3126[255 & (~this.field3120 < ~var14 ? var14 : -this.field3120 + var14) + var13] & 255);
                        int var10000 = -(var14 << 12);
                        int var27 = var15 + 1;
                        int var16 = var10000 - this.field3118[var15] + var8;
                        int var17 = -this.field3118[var27] + var4 + -(var11 << 12);
                        int var18 = this.field3128;
                        int var19;
                        if (~var18 != -2) {
                            if (~var18 != -4) {
                                if (~var18 != -5) {
                                    if (~var18 != -6) {
                                        if (var18 == 2) {
                                            var19 = (~var16 <= -1 ? var16 : -var16) + (~var17 <= -1 ? var17 : -var17);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (~var16 <= -1 ? var16 : -var16) / 4096.0F)));
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var16 <= -1 ? var16 : -var16;
                                int var26 = ~var17 > -1 ? -var17 : var17;
                                var19 = var25 > var26 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (var19 < class25.field350) {
                            class213.field3419 = class44.field548;
                            class44.field548 = class208.field3324;
                            class208.field3324 = class25.field350;
                            class25.field350 = var19;
                        } else if (var19 < class208.field3324) {
                            class213.field3419 = class44.field548;
                            class44.field548 = class208.field3324;
                            class208.field3324 = var19;
                        } else if (~class44.field548 < ~var19) {
                            class213.field3419 = class44.field548;
                            class44.field548 = var19;
                        } else if (~var19 > ~class213.field3419) {
                            class213.field3419 = var19;
                        }
                    }
                }
                int var12 = this.field3132;
                if (var12 != 0) {
                    if (var12 != 1) {
                        if (var12 != 3) {
                            if (~var12 != -5) {
                                if (var12 == 2) {
                                    var3[var7] = -class25.field350 + class208.field3324;
                                }
                            } else {
                                var3[var7] = class213.field3419;
                            }
                        } else {
                            var3[var7] = class44.field548;
                        }
                    } else {
                        var3[var7] = class208.field3324;
                    }
                } else {
                    var3[var7] = class25.field350;
                }
            }
        }
        if (arg1 != 255) {
            method1377();
        }
        ++field3133;
        return var3;
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V")
    public class196() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)V")
    public final void method331(byte arg0) {
        if (arg0 != -49) {
            method1376(-55);
        }
        this.field3126 = class292.method1962((byte) -24, this.field3124);
        this.method1375(512);
        ++field3134;
    }
}
