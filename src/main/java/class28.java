import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class28 extends class134 {

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "I")
    public int field477;

    @OriginalMember(owner = "client!cd", name = "G", descriptor = "I")
    public int field487;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "Z")
    public static boolean field469 = true;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "[Lij;")
    public static class204[] field475 = new class204[6];

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public static int field468 = -1;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!cd", name = "D", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!cd", name = "E", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!cd", name = "F", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!cd", name = "H", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)Z")
    public final boolean method225(int arg0) {
        if (arg0 != 0) {
            field475 = null;
        }
        field476++;
        return (this.field477 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(B)V")
    public static final void method226(byte arg0) {
        class120.method907(false);
        class276.method1887((byte) 60);
        field481++;
        class268.method1817(124);
        class153.method1106(-100);
        class208.method1459((byte) 51);
        class164.method1184(0);
        class18.method138(false);
        class72.method568(true);
        class27.method220((byte) 63);
        class166.method1205(0);
        class301.method2020(-115);
        class45.method381(115);
        class133.method991(-119);
        class304.method2037((byte) -57);
        class175.method1249(-1);
        class183.method1311(16495);
        class241.method1647((byte) -115);
        class229.method1579(true);
        int var1 = -13 / ((-arg0 - 45) / 32);
        class230.method1583(0);
        class69.method558(false);
        class192.field3009.method1169(true);
        class213.field3271.method1169(true);
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(B)Z")
    public final boolean method227(byte arg0) {
        int var2 = -88 / ((arg0 + 20) / 45);
        field472++;
        return (this.field477 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)V")
    public static void method228(int arg0) {
        int var1 = 126 % ((arg0 + 56) / 50);
        field475 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)Z")
    public final boolean method229(int arg0, int arg1) {
        if (arg0 != 1) {
            this.field477 = -77;
        }
        field483++;
        return (this.field477 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(I)Z")
    public final boolean method230(int arg0) {
        if (arg0 != 31141) {
            this.method239(true);
        }
        field479++;
        return (this.field477 & 0x7243CF) >> 22 != 0;
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(B)Z")
    public final boolean method231(byte arg0) {
        field471++;
        if (arg0 != 126) {
            this.method233((byte) -10);
        }
        return (this.field477 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "(I)I")
    public final int method232(int arg0) {
        if (arg0 < 105) {
            this.method232(-83);
        }
        field485++;
        return class50.method414(this.field477, (byte) 40);
    }

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "(B)Z")
    public final boolean method233(byte arg0) {
        field480++;
        if (arg0 != 16) {
            this.field477 = 66;
        }
        return (this.field477 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)V")
    public static final void method234(int arg0, int arg1) {
        if (arg1 != 13281) {
            field486 = 95;
        }
        if (arg0 == 37) {
            class238.field3757 = 3.0F;
        } else if (arg0 == 50) {
            class238.field3757 = 4.0F;
        } else if (arg0 == 75) {
            class238.field3757 = 6.0F;
        } else if (arg0 == 100) {
            class238.field3757 = 8.0F;
        } else if (arg0 == 200) {
            class238.field3757 = 16.0F;
        }
        class254.field4063 = -1;
        class254.field4063 = -1;
        field478++;
    }

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "(I)V")
    public static final void method235(int arg0) {
        field488++;
        if (arg0 < class219.field3340) {
            class252.method1710(0);
        } else {
            class248.field3938 = class301.field4848;
            class301.field4848 = null;
            class248.method1679(40, 2);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZC)Z")
    public static final boolean method236(boolean arg0, char arg1) {
        field470++;
        if (arg0) {
            method238((class89[]) null, 81, false, (int[][][]) null);
        }
        return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "(I)Z")
    public final boolean method237(int arg0) {
        field484++;
        if (arg0 >= -71) {
            return false;
        } else {
            return (this.field477 >> 29 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([Lai;IZ[[[I)V")
    public static final void method238(class89[] arg0, int arg1, boolean arg2, int[][][] arg3) {
        field473++;
        if (!arg2) {
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    for (int var6 = 0; var6 < 104; var6++) {
                        if ((client.field2390[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((client.field2390[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg0[var7].method680((byte) 107, var5, var6);
                            }
                        }
                    }
                }
            }
            class136.field2059 += (int) (Math.random() * 5.0D) - 2;
            if (class136.field2059 < -16) {
                class136.field2059 = -16;
            }
            if (class136.field2059 > 16) {
                class136.field2059 = 16;
            }
            class56.field889 += (int) (Math.random() * 5.0D) - 2;
            if (class56.field889 < -8) {
                class56.field889 = -8;
            }
            if (class56.field889 > 8) {
                class56.field889 = 8;
            }
        }
        byte var8;
        if (arg2) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        int var9 = class56.field889 >> 2 << 10;
        int var10 = class136.field2059 >> 1;
        if (arg1 != 96) {
            field468 = -104;
        }
        int[][] var11 = new int[104][104];
        int[][] var12 = new int[104][104];
        for (int var13 = 0; var13 < var8; var13++) {
            byte[][] var52 = class247.field3927[var13];
            int var53 = (int) Math.sqrt(5100.0D);
            int var54 = var53 * 768 >> 8;
            for (int var55 = 1; var55 < 103; var55++) {
                for (int var101 = 1; var101 < 103; var101++) {
                    byte var102 = 74;
                    int var103 = class233.field3684[var13][var101][var55 + 1] - class233.field3684[var13][var101][var55 - 1];
                    int var104 = class233.field3684[var13][var101 + 1][var55] - class233.field3684[var13][var101 - 1][var55];
                    int var105 = (int) Math.sqrt((double) (var104 * var104 + (var103 * var103) + 65536));
                    int var106 = (var104 << 8) / var105;
                    int var107 = -65536 / var105;
                    int var108 = (var52[var101 + 1][var55] >> 3) + (var52[var101][var55 - 1] >> 2) + (var52[var101 - 1][var55] >> 2) - (-(var52[var101][var55 + 1] >> 3) - (var52[var101][var55] >> 1));
                    int var109 = (var103 << 8) / var105;
                    int var110 = (var106 * -50 + var107 * -10 + (var109 * -50)) / var54 + var102;
                    var12[var101][var55] = var110 - var108;
                }
            }
            for (int var56 = 0; var56 < 104; var56++) {
                class191.field2995[var56] = 0;
                class255.field4080[var56] = 0;
                class200.field3100[var56] = 0;
                class184.field2913[var56] = 0;
                class15.field191[var56] = 0;
            }
            for (int var57 = -5; var57 < 104; var57++) {
                for (int var86 = 0; var86 < 104; var86++) {
                    int var95 = var57 + 5;
                    int var10002;
                    if (var95 < 104) {
                        int var96 = class82.field1242[var13][var95][var86] & 0xFF;
                        if (var96 > 0) {
                            class194 var97 = class145.method1049(var96 - 1, 1);
                            class191.field2995[var86] += var97.field3032;
                            class255.field4080[var86] += var97.field3047;
                            class200.field3100[var86] += var97.field3042;
                            class184.field2913[var86] += var97.field3043;
                            var10002 = class15.field191[var86]++;
                        }
                    }
                    int var98 = var57 - 5;
                    if (var98 >= 0) {
                        int var99 = class82.field1242[var13][var98][var86] & 0xFF;
                        if (var99 > 0) {
                            class194 var100 = class145.method1049(var99 - 1, arg1 + -95);
                            class191.field2995[var86] -= var100.field3032;
                            class255.field4080[var86] -= var100.field3047;
                            class200.field3100[var86] -= var100.field3042;
                            class184.field2913[var86] -= var100.field3043;
                            var10002 = class15.field191[var86]--;
                        }
                    }
                }
                if (var57 >= 0) {
                    int var87 = 0;
                    int var88 = 0;
                    int var89 = 0;
                    int var90 = 0;
                    int var91 = 0;
                    for (int var92 = -5; var92 < 104; var92++) {
                        int var93 = var92 + 5;
                        if (var93 < 104) {
                            var87 += class191.field2995[var93];
                            var89 += class15.field191[var93];
                            var88 += class255.field4080[var93];
                            var90 += class184.field2913[var93];
                            var91 += class200.field3100[var93];
                        }
                        int var94 = var92 - 5;
                        if (var94 >= 0) {
                            var91 -= class200.field3100[var94];
                            var88 -= class255.field4080[var94];
                            var90 -= class184.field2913[var94];
                            var89 -= class15.field191[var94];
                            var87 -= class191.field2995[var94];
                        }
                        if (var92 >= 0 && var89 > 0) {
                            var11[var57][var92] = client.method1156(var87 * 256 / var90, (byte) -121, var88 / var89, var91 / var89);
                        }
                    }
                }
            }
            for (int var58 = 1; var58 < 103; var58++) {
                for (int var59 = 1; var59 < 103; var59++) {
                    if (arg2 || class110.method819(false) || (client.field2390[0][var58][var59] & 0x2) != 0 || (client.field2390[var13][var58][var59] & 0x10) == 0 && class145.method1050(var13, var59, true, var58) == class230.field3649) {
                        if (class138.field2077 > var13) {
                            class138.field2077 = var13;
                        }
                        int var60 = class82.field1242[var13][var58][var59] & 0xFF;
                        int var61 = class188.field2951[var13][var58][var59] & 0xFF;
                        if (var60 > 0 || var61 > 0) {
                            int var62 = class233.field3684[var13][var58][var59];
                            int var63 = class233.field3684[var13][var58 + 1][var59];
                            int var64 = class233.field3684[var13][var58][var59 + 1];
                            int var65 = class233.field3684[var13][var58 + 1][var59 + 1];
                            if (var13 > 0) {
                                boolean var66 = true;
                                if (var60 == 0 && class195.field3063[var13][var58][var59] != 0) {
                                    var66 = false;
                                }
                                if (var61 > 0 && !class222.method1524(var61 - 1, arg1 + -92).field3623) {
                                    var66 = false;
                                }
                                if (var66 && var62 == var63 && var62 == var65 && var62 == var64) {
                                    class156.field2328[var13][var58][var59] = class44.method377(class156.field2328[var13][var58][var59], 4);
                                }
                            }
                            int var67;
                            int var68;
                            if (var60 <= 0) {
                                var67 = 0;
                                var68 = -1;
                            } else {
                                var68 = var11[var58][var59];
                                int var69 = (var68 & 0x7F) + var10;
                                if (var69 < 0) {
                                    var69 = 0;
                                } else if (var69 > 127) {
                                    var69 = 127;
                                }
                                int var70 = (var68 & 0x380) + ((var9 + var68 & 0xFC00) + var69);
                                var67 = class224.field3602[class270.method1827((byte) -20, var70, 96)];
                            }
                            int var71 = var12[var58][var59];
                            int var72 = var12[var58 + 1][var59];
                            int var73 = var12[var58][var59 + 1];
                            int var74 = var12[var58 + 1][var59 + 1];
                            if (var61 == 0) {
                                class198.method1405(var13, var58, var59, 0, 0, -1, var62, var63, var65, var64, class270.method1827((byte) -20, var68, var71), class270.method1827((byte) -20, var68, var72), class270.method1827((byte) -20, var68, var74), class270.method1827((byte) -20, var68, var73), 0, 0, 0, 0, var67, 0);
                            } else {
                                byte var75 = class292.field4526[var13][var58][var59];
                                int var76 = class195.field3063[var13][var58][var59] + 1;
                                class226 var77 = class222.method1524(var61 - 1, 4);
                                int var78 = var77.field3618;
                                if (var78 >= 0 && !class224.field3596.method729(0, var78)) {
                                    var78 = -1;
                                }
                                int var79;
                                int var80;
                                if (var78 >= 0) {
                                    var79 = -1;
                                    var80 = class224.field3602[class35.method335(96, (byte) 15, class224.field3596.method732(true, var78))];
                                } else if (var77.field3624 == -1) {
                                    var79 = -2;
                                    var80 = 0;
                                } else {
                                    var79 = var77.field3624;
                                    int var81 = (var79 & 0x7F) + var10;
                                    if (var81 < 0) {
                                        var81 = 0;
                                    } else if (var81 > 127) {
                                        var81 = 127;
                                    }
                                    int var82 = (var79 + var9 & 0xFC00) + (var79 & 0x380) + var81;
                                    var80 = class224.field3602[class35.method335(96, (byte) 15, var82)];
                                }
                                if (var77.field3619 >= 0) {
                                    int var83 = var77.field3619;
                                    int var84 = (var83 & 0x7F) + var10;
                                    if (var84 < 0) {
                                        var84 = 0;
                                    } else if (var84 > 127) {
                                        var84 = 127;
                                    }
                                    int var85 = (var9 + var83 & 0xFC00) + (var83 & 0x380) + var84;
                                    var80 = class224.field3602[class35.method335(96, (byte) 15, var85)];
                                }
                                class198.method1405(var13, var58, var59, var76, var75, var78, var62, var63, var65, var64, class270.method1827((byte) -20, var68, var71), class270.method1827((byte) -20, var68, var72), class270.method1827((byte) -20, var68, var74), class270.method1827((byte) -20, var68, var73), class35.method335(var71, (byte) 15, var79), class35.method335(var72, (byte) 15, var79), class35.method335(var74, (byte) 15, var79), class35.method335(var73, (byte) 15, var79), var67, var80);
                            }
                        }
                    }
                }
            }
            class82.field1242[var13] = null;
            class188.field2951[var13] = null;
            class195.field3063[var13] = null;
            class292.field4526[var13] = null;
            class247.field3927[var13] = null;
        }
        class300.method2009(-50, -10, -50);
        if (arg2) {
            return;
        }
        for (int var14 = 0; var14 < 104; var14++) {
            for (int var51 = 0; var51 < 104; var51++) {
                if ((client.field2390[1][var14][var51] & 0x2) == 2) {
                    class57.method474(var14, var51);
                }
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 <= 104; var16++) {
                for (int var17 = 0; var17 <= 104; var17++) {
                    if ((class156.field2328[var15][var17][var16] & 0x1) != 0) {
                        int var18;
                        for (var18 = var16; var18 > 0 && (class156.field2328[var15][var17][var18 - 1] & 0x1) != 0; var18--) {
                        }
                        int var19 = var16;
                        int var20 = var15;
                        while (var19 < 104 && (class156.field2328[var15][var17][var19 + 1] & 0x1) != 0) {
                            var19++;
                        }
                        int var21 = var15;
                        label352: while (var20 > 0) {
                            for (int var22 = var18; var22 <= var19; var22++) {
                                if ((class156.field2328[var20 - 1][var17][var22] & 0x1) == 0) {
                                    break label352;
                                }
                            }
                            var20--;
                        }
                        label341: while (var21 < 3) {
                            for (int var23 = var18; var23 <= var19; var23++) {
                                if ((class156.field2328[var21 + 1][var17][var23] & 0x1) == 0) {
                                    break label341;
                                }
                            }
                            var21++;
                        }
                        int var24 = (var21 - (var20 - 1)) * (var19 + 1 - var18);
                        if (var24 >= 8) {
                            short var25 = 240;
                            int var26 = class233.field3684[var20][var17][var18];
                            int var27 = class233.field3684[var21][var17][var18] - var25;
                            class107.method810(1, var17 * 128, var17 * 128, var18 * 128, var19 * 128 + 128, var27, var26);
                            for (int var28 = var20; var28 <= var21; var28++) {
                                for (int var29 = var18; var29 <= var19; var29++) {
                                    class156.field2328[var28][var17][var29] = class118.method863(class156.field2328[var28][var17][var29], -2);
                                }
                            }
                        }
                    }
                    if ((class156.field2328[var15][var17][var16] & 0x2) != 0) {
                        int var30;
                        for (var30 = var17; var30 > 0 && (class156.field2328[var15][var30 - 1][var16] & 0x2) != 0; var30--) {
                        }
                        int var31 = var15;
                        int var32 = var17;
                        int var33 = var15;
                        while (var32 < 104 && (class156.field2328[var15][var32 + 1][var16] & 0x2) != 0) {
                            var32++;
                        }
                        label407: while (var31 > 0) {
                            for (int var34 = var30; var34 <= var32; var34++) {
                                if ((class156.field2328[var31 - 1][var34][var16] & 0x2) == 0) {
                                    break label407;
                                }
                            }
                            var31--;
                        }
                        label396: while (var33 < 3) {
                            for (int var35 = var30; var35 <= var32; var35++) {
                                if ((class156.field2328[var33 + 1][var35][var16] & 0x2) == 0) {
                                    break label396;
                                }
                            }
                            var33++;
                        }
                        int var36 = (var32 + 1 - var30) * (var33 + 1 - var31);
                        if (var36 >= 8) {
                            short var37 = 240;
                            int var38 = class233.field3684[var33][var30][var16] - var37;
                            int var39 = class233.field3684[var31][var30][var16];
                            class107.method810(2, var30 * 128, var32 * 128 + 128, var16 * 128, var16 * 128, var38, var39);
                            for (int var40 = var31; var40 <= var33; var40++) {
                                for (int var41 = var30; var41 <= var32; var41++) {
                                    class156.field2328[var40][var41][var16] = class118.method863(class156.field2328[var40][var41][var16], -3);
                                }
                            }
                        }
                    }
                    if ((class156.field2328[var15][var17][var16] & 0x4) != 0) {
                        int var42 = var17;
                        int var43 = var17;
                        int var44 = var16;
                        int var45;
                        for (var45 = var16; var45 < 104 && (class156.field2328[var15][var17][var45 + 1] & 0x4) != 0; var45++) {
                        }
                        while (var44 > 0 && (class156.field2328[var15][var17][var44 - 1] & 0x4) != 0) {
                            var44--;
                        }
                        label461: while (var43 > 0) {
                            for (int var46 = var44; var46 <= var45; var46++) {
                                if ((class156.field2328[var15][var43 - 1][var46] & 0x4) == 0) {
                                    break label461;
                                }
                            }
                            var43--;
                        }
                        label450: while (var42 < 104) {
                            for (int var47 = var44; var47 <= var45; var47++) {
                                if ((class156.field2328[var15][var42 + 1][var47] & 0x4) == 0) {
                                    break label450;
                                }
                            }
                            var42++;
                        }
                        if ((var42 + 1 - var43) * (var45 + 1 - var44) >= 4) {
                            int var48 = class233.field3684[var15][var43][var44];
                            class107.method810(4, var43 * 128, var42 * 128 + 128, var44 * 128, var45 * 128 + 128, var48, var48);
                            for (int var49 = var43; var49 <= var42; var49++) {
                                for (int var50 = var44; var50 <= var45; var50++) {
                                    class156.field2328[var15][var49][var50] = class118.method863(class156.field2328[var15][var49][var50], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)I")
    public final int method239(boolean arg0) {
        field482++;
        return arg0 ? 19 : (this.field477 & 0x1CE4AE) >> 18;
    }

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "(I)Z")
    public final boolean method240(int arg0) {
        if (arg0 > -55) {
            return false;
        } else {
            field474++;
            return (this.field477 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(II)V")
    public class28(int arg0, int arg1) {
        this.field477 = arg0;
        this.field487 = arg1;
    }
}
