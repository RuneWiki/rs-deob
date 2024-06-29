import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class49 extends class51 {

    @OriginalMember(owner = "client!fa", name = "mb", descriptor = "I")
    private int field994 = 3072;

    @OriginalMember(owner = "client!fa", name = "kb", descriptor = "I")
    private int field992 = 2048;

    @OriginalMember(owner = "client!fa", name = "hb", descriptor = "I")
    private int field989 = 1024;

    @OriginalMember(owner = "client!fa", name = "bb", descriptor = "[I")
    public static int[] field983 = new int[] { 33, 6, 45, 28, 41, 7, 19, 14 };

    @OriginalMember(owner = "client!fa", name = "lb", descriptor = "I")
    public static int field993 = 0;

    @OriginalMember(owner = "client!fa", name = "qb", descriptor = "Led;")
    private static class43 field998 = class191.method1219("Could not complete login)3", false);

    @OriginalMember(owner = "client!fa", name = "gb", descriptor = "Led;")
    public static class43 field988 = class191.method1219("Lade Konfiguration )2 ", false);

    @OriginalMember(owner = "client!fa", name = "rb", descriptor = "Led;")
    private static class43 field999 = class191.method1219("Your account has been disabled)3", false);

    @OriginalMember(owner = "client!fa", name = "sb", descriptor = "Led;")
    public static class43 field1000 = field998;

    @OriginalMember(owner = "client!fa", name = "ab", descriptor = "Led;")
    public static class43 field982 = field999;

    @OriginalMember(owner = "client!fa", name = "nb", descriptor = "[Lag;")
    public static class8[] field995 = new class8[50];

    @OriginalMember(owner = "client!fa", name = "cb", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!fa", name = "db", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!fa", name = "eb", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!fa", name = "ib", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!fa", name = "jb", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!fa", name = "pb", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!fa", name = "tb", descriptor = "Lnb;")
    public static class120 field1001;

    @OriginalMember(owner = "client!fa", name = "ob", descriptor = "Lea;")
    public static class40 field996;

    @OriginalMember(owner = "client!fa", name = "Z", descriptor = "[I")
    public static int[] field981;

    @OriginalMember(owner = "client!fa", name = "fb", descriptor = "[I")
    public static int[] field987;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)V")
    public final void method64(int arg0) {
        ++field990;
        if (arg0 >= -83) {
            this.method99(38, (byte) 114);
        }
        this.field992 = -this.field989 + this.field994;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljg;II)V")
    public final void method24(class89 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.field992 = 100;
        }
        ++field997;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    super.field1029 = arg0.method538((byte) 99) == 1;
                }
            } else {
                this.field994 = arg0.method555(-1113627096);
            }
        } else {
            this.field989 = arg0.method555(-1113627096);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        ++field985;
        if (arg0 != 16) {
            this.field989 = 89;
        }
        int[] var3 = super.field1025.method39(arg1, (byte) 39);
        if (super.field1025.field154) {
            int[] var4 = this.method314(0, (byte) -118, arg1);
            for (int var5 = 0; class122.field2442 > var5; ++var5) {
                var3[var5] = (var4[var5] * this.field992 >> 12) + this.field989;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(B)V")
    public static void method302(byte arg0) {
        field988 = null;
        if (arg0 > -11) {
            field998 = null;
        }
        field981 = null;
        field998 = null;
        field983 = null;
        field995 = null;
        field982 = null;
        field1001 = null;
        field1000 = null;
        field999 = null;
        field987 = null;
        field996 = null;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
    public class49() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "([Lqh;ZLte;)V")
    public static final void method303(class153[] arg0, boolean arg1, class177 arg2) {
        for (int var3 = 0; var3 < 4; ++var3) {
            for (int var112 = 0; ~var112 > -105; ++var112) {
                for (int var113 = 0; var113 < 104; ++var113) {
                    if ((1 & class15.field232[var3][var112][var113]) == 1) {
                        int var114 = var3;
                        if (~(class15.field232[1][var112][var113] & 2) == -3) {
                            var114 = var3 - 1;
                        }
                        if (~var114 <= -1) {
                            arg0[var114].method969(var113, var112, 65536);
                        }
                    }
                }
            }
        }
        class75.field1485 += (int) (Math.random() * 5.0D) + -2;
        ++field984;
        class200.field3932 += (int) (5.0D * Math.random()) + -2;
        if (~class75.field1485 > 7) {
            class75.field1485 = -8;
        }
        if (~class200.field3932 > 15) {
            class200.field3932 = -16;
        }
        if (class200.field3932 > 16) {
            class200.field3932 = 16;
        }
        if (~class75.field1485 < -9) {
            class75.field1485 = 8;
        }
        int var4 = class75.field1485 >> 2 << 10;
        if (arg1) {
            int var5 = class200.field3932 >> 1;
            int[][] var6 = new int[104][104];
            int[][] var7 = new int[104][104];
            for (int var8 = 0; ~var8 > -5; ++var8) {
                byte[][] var51 = class67.field1351[var8];
                int var52 = (int) Math.sqrt(5100.0D);
                int var53 = var52 * 768 >> 8;
                for (int var54 = 1; ~var54 > -104; ++var54) {
                    for (int var102 = 1; var102 < 103; ++var102) {
                        byte var103 = 96;
                        int var104 = class158.field3203[var8][var102 + 1][var54] - class158.field3203[var8][var102 + -1][var54];
                        int var105 = class158.field3203[var8][var102][var54 + 1] + -class158.field3203[var8][var102][var54 + -1];
                        int var106 = (int) Math.sqrt((double) (var104 * var104 + var105 * var105 - -65536));
                        int var107 = (var104 << 8) / var106;
                        int var108 = 65536 / var106;
                        int var109 = (var105 << 8) / var106;
                        int var110 = (var108 * -10 + var107 * -50 + var109 * -50) / var53 + var103;
                        int var111 = (var51[var102][var54 + -1] >> 2) + (var51[var102 + 1][var54] >> 3) + (var51[var102 + -1][var54] >> 2) + (var51[var102][var54] >> 1) - -(var51[var102][var54 + 1] >> 3);
                        var6[var102][var54] = var110 - var111;
                    }
                }
                for (int var55 = 0; ~var55 > -105; ++var55) {
                    class26.field473[var55] = 0;
                    class12.field182[var55] = 0;
                    class159.field3213[var55] = 0;
                    class175.field3477[var55] = 0;
                    field987[var55] = 0;
                }
                for (int var56 = -5; ~var56 > -105; ++var56) {
                    for (int var87 = 0; var87 < 104; ++var87) {
                        int var96 = var56 + 5;
                        int var10002;
                        if (~var96 > -105) {
                            int var97 = class172.field3435[var8][var96][var87] & 255;
                            if (var97 > 0) {
                                class29 var98 = class106.method660(var97 + -1, -31992);
                                class26.field473[var87] += var98.field529;
                                class12.field182[var87] += var98.field536;
                                class159.field3213[var87] += var98.field516;
                                class175.field3477[var87] += var98.field520;
                                var10002 = field987[var87]++;
                            }
                        }
                        int var99 = var56 + -5;
                        if (~var99 <= -1) {
                            int var100 = 255 & class172.field3435[var8][var99][var87];
                            if (var100 > 0) {
                                class29 var101 = class106.method660(var100 - 1, -31992);
                                class26.field473[var87] -= var101.field529;
                                class12.field182[var87] -= var101.field536;
                                class159.field3213[var87] -= var101.field516;
                                class175.field3477[var87] -= var101.field520;
                                var10002 = field987[var87]--;
                            }
                        }
                    }
                    if (~var56 <= -1) {
                        int var88 = 0;
                        int var89 = 0;
                        int var90 = 0;
                        int var91 = 0;
                        int var92 = 0;
                        for (int var93 = -5; ~var93 > -105; ++var93) {
                            int var94 = var93 + 5;
                            if (var94 < 104) {
                                var88 += class26.field473[var94];
                                var90 += class175.field3477[var94];
                                var91 += field987[var94];
                                var89 += class12.field182[var94];
                                var92 += class159.field3213[var94];
                            }
                            int var95 = var93 + -5;
                            if (~var95 <= -1) {
                                var89 -= class12.field182[var95];
                                var92 -= class159.field3213[var95];
                                var90 -= class175.field3477[var95];
                                var88 -= class26.field473[var95];
                                var91 -= field987[var95];
                            }
                            if (var93 >= 0 && var91 > 0) {
                                var7[var56][var93] = class167.method1037(27824, var92 / var91, var89 / var91, var88 * 256 / var90);
                            }
                        }
                    }
                }
                for (int var57 = 1; ~var57 > -104; ++var57) {
                    for (int var60 = 1; ~var60 > -104; ++var60) {
                        if (!class9.field163 || ~(2 & class15.field232[0][var57][var60]) != -1 || (class15.field232[var8][var57][var60] & 16) == 0 && class32.method181(var60, var8, var57, false) == class109.field2114) {
                            if (~class7.field145 < ~var8) {
                                class7.field145 = var8;
                            }
                            int var61 = class172.field3435[var8][var57][var60] & 255;
                            int var62 = 255 & class82.field1615[var8][var57][var60];
                            if (~var61 < -1 || var62 > 0) {
                                int var63 = class158.field3203[var8][var57 - -1][var60];
                                int var64 = class158.field3203[var8][var57][var60];
                                int var65 = class158.field3203[var8][var57][var60 + 1];
                                int var66 = class158.field3203[var8][var57 + 1][var60 + 1];
                                if (var8 > 0) {
                                    boolean var67 = true;
                                    if (var61 == 0 && ~class201.field3955[var8][var57][var60] != -1) {
                                        var67 = false;
                                    }
                                    if (var62 > 0 && !class125.method807(var62 - 1, 4).field1404) {
                                        var67 = false;
                                    }
                                    if (var67 && var63 == var64 && ~var64 == ~var66 && var64 == var65) {
                                        class161.field3256[var8][var57][var60] = class33.method189(class161.field3256[var8][var57][var60], 2340);
                                    }
                                }
                                int var68;
                                int var69;
                                if (var61 <= 0) {
                                    var68 = -1;
                                    var69 = 0;
                                } else {
                                    var68 = var7[var57][var60];
                                    int var70 = (var68 & 127) - -var5;
                                    if (var70 >= 0) {
                                        if (~var70 < -128) {
                                            var70 = 127;
                                        }
                                    } else {
                                        var70 = 0;
                                    }
                                    int var71 = (896 & var68) + (var4 + var68 & 64512) + var70;
                                    var69 = class135.field2807[class187.method1195(96, var71, -127)];
                                }
                                int var72 = var6[var57][var60];
                                int var73 = var6[var57 + 1][var60 + 1];
                                int var74 = var6[var57][var60 - -1];
                                int var75 = var6[var57 + 1][var60];
                                if (~var62 == -1) {
                                    arg2.method1135(var8, var57, var60, 0, 0, -1, var64, var63, var66, var65, class187.method1195(var72, var68, 116), class187.method1195(var75, var68, -113), class187.method1195(var73, var68, 56), class187.method1195(var74, var68, -122), 0, 0, 0, 0, var69, 0);
                                } else {
                                    int var76 = class201.field3955[var8][var57][var60] + 1;
                                    byte var77 = class39.field749[var8][var57][var60];
                                    class71 var78 = class125.method807(var62 + -1, 4);
                                    int var79 = var78.field1398;
                                    if (var79 >= 0 && !class135.field2802.method10(var79, true)) {
                                        var79 = -1;
                                    }
                                    int var80;
                                    int var81;
                                    if (var79 >= 0) {
                                        var80 = -1;
                                        var81 = class135.field2807[class18.method86(96, 15753, class135.field2802.method21(var79, 124))];
                                    } else if (~var78.field1402 != 0) {
                                        var80 = var78.field1402;
                                        int var82 = (var80 & 127) + var5;
                                        if (~var82 > -1) {
                                            var82 = 0;
                                        } else if (~var82 < -128) {
                                            var82 = 127;
                                        }
                                        int var83 = (var4 + var80 & 64512) + var82 - -(896 & var80);
                                        var81 = class135.field2807[class18.method86(96, 15753, var83)];
                                    } else {
                                        var81 = 0;
                                        var80 = -2;
                                    }
                                    if (var78.field1397 >= 0) {
                                        int var84 = var78.field1397;
                                        int var85 = (127 & var84) + var5;
                                        if (var85 >= 0) {
                                            if (var85 > 127) {
                                                var85 = 127;
                                            }
                                        } else {
                                            var85 = 0;
                                        }
                                        int var86 = (64512 & var4 + var84) + ((896 & var84) - -var85);
                                        var81 = class135.field2807[class18.method86(96, 15753, var86)];
                                    }
                                    arg2.method1135(var8, var57, var60, var76, var77, var79, var64, var63, var66, var65, class187.method1195(var72, var68, 123), class187.method1195(var75, var68, -72), class187.method1195(var73, var68, 74), class187.method1195(var74, var68, -117), class18.method86(var72, 15753, var80), class18.method86(var75, 15753, var80), class18.method86(var73, 15753, var80), class18.method86(var74, 15753, var80), var69, var81);
                                }
                            }
                        }
                    }
                }
                for (int var58 = 1; var58 < 103; ++var58) {
                    for (int var59 = 1; var59 < 103; ++var59) {
                        arg2.method1116(var8, var59, var58, class32.method181(var58, var8, var59, false));
                    }
                }
                class172.field3435[var8] = null;
                class82.field1615[var8] = null;
                class201.field3955[var8] = null;
                class39.field749[var8] = null;
                class67.field1351[var8] = null;
            }
            arg2.method1126(-50, -10, -50);
            for (int var9 = 0; var9 < 104; ++var9) {
                for (int var50 = 0; var50 < 104; ++var50) {
                    if ((class15.field232[1][var9][var50] & 2) == 2) {
                        arg2.method1152(var9, var50);
                    }
                }
            }
            int var10 = 1;
            int var11 = 4;
            int var12 = 2;
            for (int var13 = 0; var13 < 4; ++var13) {
                if (var13 > 0) {
                    var10 <<= 3;
                    var11 <<= 3;
                    var12 <<= 3;
                }
                for (int var14 = 0; ~var14 >= ~var13; ++var14) {
                    for (int var15 = 0; var15 <= 104; ++var15) {
                        for (int var16 = 0; var16 <= 104; ++var16) {
                            if (~(class161.field3256[var14][var16][var15] & var10) != -1) {
                                int var17 = var15;
                                int var18;
                                for (var18 = var15; var18 < 104 && (class161.field3256[var14][var16][var18 - -1] & var10) != 0; ++var18) {
                                }
                                int var19 = var14;
                                while (var17 > 0 && (var10 & class161.field3256[var14][var16][var17 + -1]) != 0) {
                                    --var17;
                                }
                                int var20 = var14;
                                label360: while (var19 > 0) {
                                    for (int var21 = var17; ~var21 >= ~var18; ++var21) {
                                        if (~(var10 & class161.field3256[var19 + -1][var16][var21]) == -1) {
                                            break label360;
                                        }
                                    }
                                    --var19;
                                }
                                label349: while (var13 > var20) {
                                    for (int var22 = var17; var18 >= var22; ++var22) {
                                        if (~(class161.field3256[var20 - -1][var16][var22] & var10) == -1) {
                                            break label349;
                                        }
                                    }
                                    ++var20;
                                }
                                int var23 = (var18 - var17 - -1) * (-var19 + var20 - -1);
                                if (~var23 <= -9) {
                                    short var24 = 240;
                                    int var25 = class158.field3203[var20][var16][var17] - var24;
                                    int var26 = class158.field3203[var19][var16][var17];
                                    class177.method1120(var13, 1, var16 * 128, var16 * 128, var17 * 128, var18 * 128 + 128, var25, var26);
                                    for (int var27 = var19; ~var20 <= ~var27; ++var27) {
                                        for (int var28 = var17; ~var18 <= ~var28; ++var28) {
                                            class161.field3256[var27][var16][var28] = class7.method38(class161.field3256[var27][var16][var28], ~var10);
                                        }
                                    }
                                }
                            }
                            if ((var12 & class161.field3256[var14][var16][var15]) != 0) {
                                int var29;
                                for (var29 = var16; ~var29 < -1 && (class161.field3256[var14][var29 + -1][var15] & var12) != 0; --var29) {
                                }
                                int var30;
                                for (var30 = var16; var30 < 104 && ~(var12 & class161.field3256[var14][var30 + 1][var15]) != -1; ++var30) {
                                }
                                int var31 = var14;
                                int var32;
                                label415: for (var32 = var14; ~var32 < -1; --var32) {
                                    for (int var33 = var29; var33 <= var30; ++var33) {
                                        if ((var12 & class161.field3256[var32 + -1][var33][var15]) == 0) {
                                            break label415;
                                        }
                                    }
                                }
                                label404: while (var31 < var13) {
                                    for (int var34 = var29; ~var34 >= ~var30; ++var34) {
                                        if (~(var12 & class161.field3256[var31 + 1][var34][var15]) == -1) {
                                            break label404;
                                        }
                                    }
                                    ++var31;
                                }
                                int var35 = (-var32 + var31 - -1) * (var30 - -1 + -var29);
                                if (var35 >= 8) {
                                    int var36 = class158.field3203[var32][var29][var15];
                                    short var37 = 240;
                                    int var38 = class158.field3203[var31][var29][var15] - var37;
                                    class177.method1120(var13, 2, var29 * 128, var30 * 128 + 128, var15 * 128, var15 * 128, var38, var36);
                                    for (int var39 = var32; ~var31 <= ~var39; ++var39) {
                                        for (int var40 = var29; var40 <= var30; ++var40) {
                                            class161.field3256[var39][var40][var15] = class7.method38(class161.field3256[var39][var40][var15], ~var12);
                                        }
                                    }
                                }
                            }
                            if ((class161.field3256[var14][var16][var15] & var11) != 0) {
                                int var41 = var15;
                                int var42 = var15;
                                int var43 = var16;
                                while (~var42 < -1 && ~(var11 & class161.field3256[var14][var16][var42 + -1]) != -1) {
                                    --var42;
                                }
                                while (var41 < 104 && (var11 & class161.field3256[var14][var16][var41 - -1]) != 0) {
                                    ++var41;
                                }
                                int var44;
                                label470: for (var44 = var16; ~var44 < -1; --var44) {
                                    for (int var45 = var42; ~var45 >= ~var41; ++var45) {
                                        if (~(class161.field3256[var14][var44 + -1][var45] & var11) == -1) {
                                            break label470;
                                        }
                                    }
                                }
                                label459: while (var43 < 104) {
                                    for (int var46 = var42; ~var41 <= ~var46; ++var46) {
                                        if (~(class161.field3256[var14][var43 - -1][var46] & var11) == -1) {
                                            break label459;
                                        }
                                    }
                                    ++var43;
                                }
                                if (~((var41 - var42 - -1) * (-var44 + var43 - -1)) <= -5) {
                                    int var47 = class158.field3203[var14][var44][var42];
                                    class177.method1120(var13, 4, var44 * 128, var43 * 128 + 128, var42 * 128, var41 * 128 - -128, var47, var47);
                                    for (int var48 = var44; ~var43 <= ~var48; ++var48) {
                                        for (int var49 = var42; ~var49 >= ~var41; ++var49) {
                                            class161.field3256[var14][var48][var49] = class7.method38(class161.field3256[var14][var48][var49], ~var11);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)[[I")
    public final int[][] method99(int arg0, byte arg1) {
        if (arg1 != -94) {
            field998 = null;
        }
        int[][] var3 = super.field1027.method1087(arg0, -2);
        if (super.field1027.field3428) {
            int[][] var4 = this.method306(0, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class122.field2442; ++var11) {
                var8[var11] = (var5[var11] * this.field992 >> 12) + this.field989;
                var9[var11] = (var6[var11] * this.field992 >> 12) + this.field989;
                var10[var11] = (var7[var11] * this.field992 >> 12) + this.field989;
            }
        }
        ++field986;
        return var3;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZLed;ILed;Lga;I)V")
    public static final void method304(boolean arg0, class43 arg1, int arg2, class43 arg3, class58 arg4, int arg5) {
        int var6 = arg4.method347(arg1, (byte) 84);
        ++field991;
        if (arg2 != -23394) {
            method303((class153[]) null, false, (class177) null);
        }
        int var7 = arg4.method362(arg3, (byte) -47, var6);
        class206.method1334(var6, true, arg5, arg4, arg0, var7);
    }
}
