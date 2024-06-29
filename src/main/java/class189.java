import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class189 extends class184 {

    @OriginalMember(owner = "client!ue", name = "jb", descriptor = "Z")
    private boolean field3763 = false;

    @OriginalMember(owner = "client!ue", name = "cb", descriptor = "I")
    private int field3756 = -1;

    @OriginalMember(owner = "client!ue", name = "ub", descriptor = "Z")
    private volatile boolean field3774 = false;

    @OriginalMember(owner = "client!ue", name = "tb", descriptor = "I")
    private int field3773;

    @OriginalMember(owner = "client!ue", name = "pb", descriptor = "Lbe;")
    private class16 field3769;

    @OriginalMember(owner = "client!ue", name = "qb", descriptor = "Lbe;")
    private class16 field3770;

    @OriginalMember(owner = "client!ue", name = "Y", descriptor = "I")
    public static int field3752 = -1;

    @OriginalMember(owner = "client!ue", name = "db", descriptor = "Lrf;")
    public static class163 field3757 = class53.method392(-80, "<col=ffff00>*V");

    @OriginalMember(owner = "client!ue", name = "ob", descriptor = "Lrf;")
    public static class163 field3768 = class53.method392(-63, " )2>");

    @OriginalMember(owner = "client!ue", name = "mb", descriptor = "Z")
    public static boolean field3766 = false;

    @OriginalMember(owner = "client!ue", name = "U", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!ue", name = "V", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!ue", name = "W", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!ue", name = "X", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!ue", name = "Z", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!ue", name = "ab", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!ue", name = "eb", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!ue", name = "fb", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!ue", name = "gb", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!ue", name = "hb", descriptor = "I")
    private int field3761;

    @OriginalMember(owner = "client!ue", name = "ib", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!ue", name = "kb", descriptor = "I")
    private int field3764;

    @OriginalMember(owner = "client!ue", name = "lb", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!ue", name = "nb", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!ue", name = "rb", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!ue", name = "bb", descriptor = "Z")
    public static boolean field3755;

    @OriginalMember(owner = "client!ue", name = "sb", descriptor = "[I")
    public static int[] field3772;

    @OriginalMember(owner = "client!ue", name = "S", descriptor = "[Z")
    private volatile boolean[] field3747;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(B)I")
    public final int method1270(byte arg0) {
        ++field3749;
        if (arg0 != 32) {
            method1281(126, 123, true, 69, -80, -17);
        }
        if (this.field3774) {
            return 100;
        } else if (super.field3650 != null) {
            return 99;
        } else {
            int var2 = class179.method1210(1, this.field3773, 255);
            if (var2 >= 100) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BI)I")
    private final int method1271(byte arg0, int arg1) {
        if (arg0 <= 81) {
            method1280(false);
        }
        ++field3750;
        if (super.field3650[arg1] != null) {
            return 100;
        } else {
            return this.field3747[arg1] ? 100 : class179.method1210(1, arg1, this.field3773);
        }
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(III)Lhc;")
    public static final class72 method1272(int arg0, int arg1, int arg2) {
        class111 var3 = class97.field2054[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2345;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BIZ[BZ)V")
    public final void method1273(byte arg0, int arg1, boolean arg2, byte[] arg3, boolean arg4) {
        if (arg0 != -100) {
            this.method1270((byte) 18);
        }
        ++field3753;
        if (arg4) {
            if (this.field3774) {
                throw new RuntimeException();
            } else {
                if (this.field3770 != null) {
                    class154.method987(this.field3773, this.field3770, arg3, (byte) 109);
                }
                this.method1227(1, arg3);
                this.method1279(false);
            }
        } else {
            arg3[arg3.length + -2] = (byte) (super.field3664[arg1] >> 8);
            arg3[arg3.length + -1] = (byte) super.field3664[arg1];
            if (this.field3769 != null) {
                class154.method987(arg1, this.field3769, arg3, (byte) 123);
                this.field3747[arg1] = true;
            }
            if (arg2) {
                super.field3650[arg1] = class22.method136(false, arg3, -66);
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lbe;[BIIZ)V")
    public final void method1274(class16 arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 != -3) {
            this.field3774 = false;
        }
        ++field3751;
        if (this.field3770 != arg0) {
            if (!arg4 && ~this.field3756 == ~arg3) {
                this.field3774 = true;
            }
            if (arg1 != null && ~arg1.length < -3) {
                class69.field1466.reset();
                class69.field1466.update(arg1, 0, arg1.length + -2);
                int var6 = (int) class69.field1466.getValue();
                int var7 = ((255 & arg1[arg1.length - 2]) << 8) - -(255 & arg1[arg1.length + -1]);
                if (~super.field3665[arg3] == ~var6 && super.field3664[arg3] == var7) {
                    this.field3747[arg3] = true;
                    if (arg4) {
                        super.field3650[arg3] = class22.method136(false, arg1, -93);
                    }
                } else {
                    this.field3747[arg3] = false;
                    if (this.field3763 || arg4) {
                        class92.method648(this.field3773, arg3, (byte) 2, 1203347792, arg4, this, super.field3665[arg3]);
                    }
                }
            } else {
                this.field3747[arg3] = false;
                if (this.field3763 || arg4) {
                    class92.method648(this.field3773, arg3, (byte) 2, 1203347792, arg4, this, super.field3665[arg3]);
                }
            }
        } else if (this.field3774) {
            throw new RuntimeException();
        } else if (arg1 == null) {
            class92.method648(255, this.field3773, (byte) 0, 1203347792, true, this, this.field3761);
        } else {
            class69.field1466.reset();
            class69.field1466.update(arg1, 0, arg1.length);
            int var8 = (int) class69.field1466.getValue();
            class52 var9 = new class52(class142.method925(arg1, arg2 ^ -3));
            int var10 = var9.method344(255);
            if (~var10 != -6 && ~var10 != -7) {
                throw new RuntimeException("Incorrect JS5 protocol number: " + var10);
            } else {
                int var11 = 0;
                if (~var10 <= -7) {
                    var11 = var9.method383(104);
                }
                if (this.field3761 != var8 || ~this.field3764 != ~var11) {
                    class92.method648(255, this.field3773, (byte) 0, arg2 ^ -1203347795, true, this, this.field3761);
                } else {
                    this.method1227(1, arg1);
                    this.method1279(false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BII)V")
    public final void method1275(byte arg0, int arg1, int arg2) {
        this.field3761 = arg2;
        ++field3754;
        this.field3764 = arg1;
        if (arg0 != -72) {
            field3755 = true;
        }
        if (this.field3770 == null) {
            class92.method648(255, this.field3773, (byte) 0, 1203347792, true, this, this.field3761);
        } else {
            class44.method268(this.field3770, this, this.field3773, (byte) 122);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "([Loa;I)V")
    public static final void method1276(class131[] arg0, int arg1) {
        ++field3748;
        for (int var2 = 0; var2 < 4; ++var2) {
            for (int var114 = 0; ~var114 > -105; ++var114) {
                for (int var115 = 0; var115 < 104; ++var115) {
                    if ((1 & class21.field372[var2][var114][var115]) == 1) {
                        int var116 = var2;
                        if ((class21.field372[1][var114][var115] & 2) == 2) {
                            var116 = var2 - 1;
                        }
                        if (~var116 <= -1) {
                            arg0[var116].method868(var114, 2097152, var115);
                        }
                    }
                }
            }
        }
        class116.field2468 += (int) (Math.random() * 5.0D) + -2;
        int[][] var3 = new int[104][104];
        if (class116.field2468 < -16) {
            class116.field2468 = -16;
        }
        if (~class116.field2468 < -17) {
            class116.field2468 = 16;
        }
        int[][] var4 = new int[104][104];
        class25.field458 += -2 + (int) (Math.random() * 5.0D);
        int var5 = class116.field2468 >> 1;
        if (~class25.field458 > 7) {
            class25.field458 = -8;
        }
        if (class25.field458 > 8) {
            class25.field458 = 8;
        }
        int var6 = class25.field458 >> 2 << 10;
        for (int var7 = 0; var7 < 4; ++var7) {
            byte var51 = 96;
            short var52 = 768;
            byte[][] var53 = class70.field1473[var7];
            int var54 = (int) Math.sqrt(5100.0D);
            int var55 = var52 * var54 >> 8;
            for (int var56 = 1; ~var56 > -104; ++var56) {
                for (int var104 = 1; var104 < 103; ++var104) {
                    int var106 = class154.field3199[var7][var104][var56 + 1] - class154.field3199[var7][var104][var56 + -1];
                    int var107 = class154.field3199[var7][var104 + 1][var56] + -class154.field3199[var7][var104 - 1][var56];
                    int var108 = (int) Math.sqrt((double) (var107 * var107 + var106 * var106 + 65536));
                    int var109 = 65536 / var108;
                    int var110 = (var107 << 8) / var108;
                    int var111 = (var106 << 8) / var108;
                    int var112 = (var110 * -50 + var109 * -10 + var111 * -50) / var55 + var51;
                    int var113 = (var53[var104][var56] >> 1) + (var53[var104 + -1][var56] >> 2) - -(var53[var104 + 1][var56] >> 3) + (var53[var104][var56 + 1] >> 3) + (var53[var104][var56 + -1] >> 2);
                    var4[var104][var56] = -var113 + var112;
                }
            }
            for (int var57 = 0; ~var57 > -105; ++var57) {
                class53.field1098[var57] = 0;
                class144.field2959[var57] = 0;
                class36.field701[var57] = 0;
                class103.field2168[var57] = 0;
                class38.field783[var57] = 0;
            }
            for (int var58 = -5; ~var58 > -105; ++var58) {
                for (int var89 = 0; ~var89 > -105; ++var89) {
                    int var98 = var58 + 5;
                    int var10002;
                    if (var98 < 104) {
                        int var99 = 255 & class102.field2138[var7][var98][var89];
                        if (var99 > 0) {
                            class71 var100 = class134.method890(var99 + -1, -22504);
                            class53.field1098[var89] += var100.field1485;
                            class144.field2959[var89] += var100.field1488;
                            class36.field701[var89] += var100.field1486;
                            class103.field2168[var89] += var100.field1490;
                            var10002 = class38.field783[var89]++;
                        }
                    }
                    int var101 = var58 + -5;
                    if (var101 >= 0) {
                        int var102 = 255 & class102.field2138[var7][var101][var89];
                        if (var102 > 0) {
                            class71 var103 = class134.method890(var102 + -1, -22504);
                            class53.field1098[var89] -= var103.field1485;
                            class144.field2959[var89] -= var103.field1488;
                            class36.field701[var89] -= var103.field1486;
                            class103.field2168[var89] -= var103.field1490;
                            var10002 = class38.field783[var89]--;
                        }
                    }
                }
                if (~var58 <= -1) {
                    int var90 = 0;
                    int var91 = 0;
                    int var92 = 0;
                    int var93 = 0;
                    int var94 = 0;
                    for (int var95 = -5; ~var95 > -105; ++var95) {
                        int var96 = var95 + 5;
                        if (~var96 > -105) {
                            var91 += class144.field2959[var96];
                            var94 += class38.field783[var96];
                            var90 += class53.field1098[var96];
                            var92 += class36.field701[var96];
                            var93 += class103.field2168[var96];
                        }
                        int var97 = var95 + -5;
                        if (~var97 <= -1) {
                            var94 -= class38.field783[var97];
                            var92 -= class36.field701[var97];
                            var90 -= class53.field1098[var97];
                            var91 -= class144.field2959[var97];
                            var93 -= class103.field2168[var97];
                        }
                        if (~var95 <= -1 && var94 > 0) {
                            var3[var58][var95] = class197.method1305(var90 * 256 / var93, -90, var91 / var94, var92 / var94);
                        }
                    }
                }
            }
            for (int var59 = 1; ~var59 > -104; ++var59) {
                for (int var62 = 1; var62 < 103; ++var62) {
                    if (!class86.field1880 || (2 & class21.field372[0][var59][var62]) != 0 || (16 & class21.field372[var7][var59][var62]) == 0 && ~class158.method1003(var59, false, var7, var62) == ~class186.field3713) {
                        if (class132.field2751 > var7) {
                            class132.field2751 = var7;
                        }
                        int var63 = 255 & class102.field2138[var7][var59][var62];
                        int var64 = class26.field488[var7][var59][var62] & 255;
                        if (var63 > 0 || var64 > 0) {
                            int var65 = class154.field3199[var7][var59][var62];
                            int var66 = class154.field3199[var7][var59][var62 + 1];
                            int var67 = class154.field3199[var7][var59 + 1][var62];
                            int var68 = class154.field3199[var7][var59 + 1][var62 + 1];
                            if (~var7 < -1) {
                                boolean var69 = true;
                                if (~var63 == -1 && class43.field884[var7][var59][var62] != 0) {
                                    var69 = false;
                                }
                                if (~var64 < -1 && !class31.method205(var64 + -1, 4081).field229) {
                                    var69 = false;
                                }
                                if (var69 && ~var65 == ~var67 && ~var65 == ~var68 && var65 == var66) {
                                    class40.field829[var7][var59][var62] = class150.method971(class40.field829[var7][var59][var62], 2340);
                                }
                            }
                            int var70;
                            int var71;
                            if (var63 <= 0) {
                                var70 = 0;
                                var71 = -1;
                            } else {
                                var71 = var3[var59][var62];
                                int var72 = (127 & var71) + var5;
                                if (~var72 > -1) {
                                    var72 = 0;
                                } else if (var72 > 127) {
                                    var72 = 127;
                                }
                                int var73 = (var71 & 896) + ((var6 + var71 & 64512) - -var72);
                                var70 = class1.field11[class154.method990((byte) 114, 96, var73)];
                            }
                            int var74 = var4[var59 + 1][var62];
                            int var75 = var4[var59 + 1][var62 - -1];
                            int var76 = var4[var59][var62];
                            int var77 = var4[var59][var62 - -1];
                            if (var64 != 0) {
                                int var78 = class43.field884[var7][var59][var62] + 1;
                                byte var79 = class64.field1362[var7][var59][var62];
                                class11 var80 = class31.method205(var64 + -1, 4081);
                                int var81 = var80.field216;
                                if (var81 >= 0 && !class1.field17.method1222(var81, (byte) -85)) {
                                    var81 = -1;
                                }
                                int var82;
                                int var83;
                                if (var81 >= 0) {
                                    var82 = class1.field11[class128.method845(96, class1.field17.method1218(var81, -125), 126)];
                                    var83 = -1;
                                } else if (var80.field222 != -1) {
                                    var83 = var80.field222;
                                    int var84 = (var83 & 127) + var5;
                                    if (~var84 <= -1) {
                                        if (var84 > 127) {
                                            var84 = 127;
                                        }
                                    } else {
                                        var84 = 0;
                                    }
                                    int var85 = (64512 & var6 + var83) + ((896 & var83) - -var84);
                                    var82 = class1.field11[class128.method845(96, var85, 117)];
                                } else {
                                    var82 = 0;
                                    var83 = -2;
                                }
                                if (var80.field218 >= 0) {
                                    int var86 = var80.field218;
                                    int var87 = (var86 & 127) - -var5;
                                    if (var87 < 0) {
                                        var87 = 0;
                                    } else if (~var87 < -128) {
                                        var87 = 127;
                                    }
                                    int var88 = (var86 - -var6 & 64512) - (-(var86 & 896) + -var87);
                                    var82 = class1.field11[class128.method845(96, var88, 118)];
                                }
                                class10.method81(var7, var59, var62, var78, var79, var81, var65, var67, var68, var66, class154.method990((byte) 125, var76, var71), class154.method990((byte) 123, var74, var71), class154.method990((byte) 102, var75, var71), class154.method990((byte) 102, var77, var71), class128.method845(var76, var83, 122), class128.method845(var74, var83, 115), class128.method845(var75, var83, 123), class128.method845(var77, var83, 117), var70, var82);
                            } else {
                                class10.method81(var7, var59, var62, 0, 0, -1, var65, var67, var68, var66, class154.method990((byte) 108, var76, var71), class154.method990((byte) 112, var74, var71), class154.method990((byte) 102, var75, var71), class154.method990((byte) 109, var77, var71), 0, 0, 0, 0, var70, 0);
                            }
                        }
                    }
                }
            }
            for (int var60 = 1; ~var60 > -104; ++var60) {
                for (int var61 = 1; ~var61 > -104; ++var61) {
                    class106.method723(var7, var61, var60, class158.method1003(var61, false, var7, var60));
                }
            }
            class102.field2138[var7] = null;
            class26.field488[var7] = null;
            class43.field884[var7] = null;
            class64.field1362[var7] = null;
            class70.field1473[var7] = null;
        }
        class184.method1234(-50, -10, -50);
        for (int var8 = 0; ~var8 > -105; ++var8) {
            for (int var50 = 0; ~var50 > -105; ++var50) {
                if ((2 & class21.field372[1][var8][var50]) == 2) {
                    class54.method396(var8, var50);
                }
            }
        }
        int var9 = 1;
        int var10 = 2;
        int var11 = 85 % ((arg1 - 39) / 51);
        int var12 = 4;
        for (int var13 = 0; var13 < 4; ++var13) {
            if (~var13 < -1) {
                var10 <<= 3;
                var12 <<= 3;
                var9 <<= 3;
            }
            for (int var14 = 0; ~var14 >= ~var13; ++var14) {
                for (int var15 = 0; var15 <= 104; ++var15) {
                    for (int var16 = 0; ~var16 >= -105; ++var16) {
                        if (~(class40.field829[var14][var16][var15] & var9) != -1) {
                            int var17 = var15;
                            int var18;
                            for (var18 = var15; var18 < 104 && (var9 & class40.field829[var14][var16][var18 + 1]) != 0; ++var18) {
                            }
                            while (~var17 < -1 && (class40.field829[var14][var16][var17 + -1] & var9) != 0) {
                                --var17;
                            }
                            int var19;
                            label356: for (var19 = var14; var19 > 0; --var19) {
                                for (int var20 = var17; var18 >= var20; ++var20) {
                                    if ((class40.field829[var19 + -1][var16][var20] & var9) == 0) {
                                        break label356;
                                    }
                                }
                            }
                            int var21;
                            label344: for (var21 = var14; var13 > var21; ++var21) {
                                for (int var22 = var17; ~var22 >= ~var18; ++var22) {
                                    if ((var9 & class40.field829[var21 + 1][var16][var22]) == 0) {
                                        break label344;
                                    }
                                }
                            }
                            int var23 = (var21 - var19 + 1) * (-var17 + var18 + 1);
                            if (~var23 <= -9) {
                                short var24 = 240;
                                int var25 = class154.field3199[var21][var16][var17] - var24;
                                int var26 = class154.field3199[var19][var16][var17];
                                class37.method234(var13, 1, var16 * 128, var16 * 128, var17 * 128, var18 * 128 + 128, var25, var26);
                                for (int var27 = var19; var27 <= var21; ++var27) {
                                    for (int var28 = var17; ~var28 >= ~var18; ++var28) {
                                        class40.field829[var27][var16][var28] = class133.method887(class40.field829[var27][var16][var28], ~var9);
                                    }
                                }
                            }
                        }
                        if ((var10 & class40.field829[var14][var16][var15]) != 0) {
                            int var29 = var16;
                            int var30 = var14;
                            int var31;
                            for (var31 = var16; ~var31 > -105 && ~(class40.field829[var14][var31 + 1][var15] & var10) != -1; ++var31) {
                            }
                            while (var29 > 0 && ~(var10 & class40.field829[var14][var29 + -1][var15]) != -1) {
                                --var29;
                            }
                            label411: while (~var30 < -1) {
                                for (int var32 = var29; var31 >= var32; ++var32) {
                                    if ((var10 & class40.field829[var30 - 1][var32][var15]) == 0) {
                                        break label411;
                                    }
                                }
                                --var30;
                            }
                            int var33;
                            label399: for (var33 = var14; var33 < var13; ++var33) {
                                for (int var34 = var29; ~var34 >= ~var31; ++var34) {
                                    if ((class40.field829[var33 - -1][var34][var15] & var10) == 0) {
                                        break label399;
                                    }
                                }
                            }
                            int var35 = (-var29 + var31 - -1) * (-var30 + 1 + var33);
                            if (~var35 <= -9) {
                                short var36 = 240;
                                int var37 = class154.field3199[var33][var29][var15] + -var36;
                                int var38 = class154.field3199[var30][var29][var15];
                                class37.method234(var13, 2, var29 * 128, var31 * 128 + 128, var15 * 128, var15 * 128, var37, var38);
                                for (int var39 = var30; ~var39 >= ~var33; ++var39) {
                                    for (int var40 = var29; var31 >= var40; ++var40) {
                                        class40.field829[var39][var40][var15] = class133.method887(class40.field829[var39][var40][var15], ~var10);
                                    }
                                }
                            }
                        }
                        if (~(var12 & class40.field829[var14][var16][var15]) != -1) {
                            int var41 = var16;
                            int var42 = var16;
                            int var43;
                            for (var43 = var15; ~var43 < -1 && ~(class40.field829[var14][var16][var43 - 1] & var12) != -1; --var43) {
                            }
                            int var44;
                            for (var44 = var15; var44 < 104 && (var12 & class40.field829[var14][var16][var44 + 1]) != 0; ++var44) {
                            }
                            label464: while (var42 > 0) {
                                for (int var45 = var43; var44 >= var45; ++var45) {
                                    if ((class40.field829[var14][var42 + -1][var45] & var12) == 0) {
                                        break label464;
                                    }
                                }
                                --var42;
                            }
                            label453: while (var41 < 104) {
                                for (int var46 = var43; var44 >= var46; ++var46) {
                                    if ((class40.field829[var14][var41 + 1][var46] & var12) == 0) {
                                        break label453;
                                    }
                                }
                                ++var41;
                            }
                            if ((var41 - -1 + -var42) * (-var43 + var44 + 1) >= 4) {
                                int var47 = class154.field3199[var14][var42][var43];
                                class37.method234(var13, 4, var42 * 128, var41 * 128 + 128, var43 * 128, var44 * 128 + 128, var47, var47);
                                for (int var48 = var42; var41 >= var48; ++var48) {
                                    for (int var49 = var43; ~var44 <= ~var49; ++var49) {
                                        class40.field829[var14][var48][var49] = class133.method887(class40.field829[var14][var48][var49], ~var12);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(II)V")
    public final void method1244(int arg0, int arg1) {
        ++field3760;
        class205.method1345(this.field3773, 2, arg0);
        if (arg1 != 8) {
            field3772 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)I")
    public final int method1277(int arg0) {
        int var2 = 0;
        ++field3759;
        int var3 = 0;
        if (arg0 != -16802) {
            return 32;
        } else {
            for (int var4 = 0; super.field3650.length > var4; ++var4) {
                if (super.field3682[var4] > 0) {
                    var2 += 100;
                    var3 += this.method1271((byte) 107, var4);
                }
            }
            if (var2 == 0) {
                return 100;
            } else {
                return var3 * 100 / var2;
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V")
    public static final void method1278(int arg0) {
        ++field3765;
        for (class64 var1 = (class64) class15.field266.method46(-100); var1 != null; var1 = (class64) class15.field266.method53(7759444)) {
            if (~var1.field1352 < -1) {
                --var1.field1352;
            }
            if (~var1.field1352 != -1) {
                if (var1.field1361 > 0) {
                    --var1.field1361;
                }
                if (~var1.field1361 == -1 && ~var1.field1356 <= -2 && var1.field1341 >= 1 && var1.field1356 <= 102 && var1.field1341 <= 102 && (~var1.field1345 > -1 || class143.method929(var1.field1351, var1.field1345, 0))) {
                    class65.method470(21107, var1.field1341, var1.field1344, var1.field1356, var1.field1364, var1.field1351, var1.field1355, var1.field1345);
                    var1.field1361 = -1;
                    if (var1.field1349 == var1.field1345 && var1.field1349 == -1) {
                        var1.method630(12);
                    } else if (var1.field1349 == var1.field1345 && var1.field1364 == var1.field1339 && ~var1.field1363 == ~var1.field1351) {
                        var1.method630(71);
                    }
                }
            } else if (var1.field1349 < 0 || class143.method929(var1.field1363, var1.field1349, 0)) {
                class65.method470(21107, var1.field1341, var1.field1344, var1.field1356, var1.field1339, var1.field1363, var1.field1355, var1.field1349);
                var1.method630(107);
            }
        }
        if (arg0 >= -2) {
            field3772 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V")
    private final void method1279(boolean arg0) {
        ++field3758;
        if (arg0) {
            this.field3761 = -15;
        }
        this.field3747 = new boolean[super.field3650.length];
        for (int var2 = 0; ~var2 > ~this.field3747.length; ++var2) {
            this.field3747[var2] = false;
        }
        if (this.field3769 == null) {
            this.field3774 = true;
        } else {
            this.field3756 = -1;
            for (int var3 = 0; this.field3747.length > var3; ++var3) {
                if (super.field3682[var3] > 0) {
                    class74.method523(this.field3769, this, (byte) 122, var3);
                    this.field3756 = var3;
                }
            }
            if (this.field3756 == -1) {
                this.field3774 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(Z)V")
    public static void method1280(boolean arg0) {
        field3768 = null;
        if (!arg0) {
            field3766 = true;
        }
        field3757 = null;
        field3772 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIZIII)V")
    public static final void method1281(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        ++field3762;
        if (class116.field2454 != arg5 || class23.field403 != arg1 || ~class186.field3713 != ~arg0 && class86.field1880) {
            class116.field2454 = arg5;
            class23.field403 = arg1;
            class186.field3713 = arg0;
            if (!class86.field1880) {
                class186.field3713 = 0;
            }
            class84.method589(25, -26);
            class48.method293(arg2, class95.field2034, true);
            int var6 = class172.field3493;
            int var7 = class69.field1470;
            class69.field1470 = arg1 * 8 + -48;
            int var8 = class69.field1470 - var7;
            int var9 = class69.field1470;
            class172.field3493 = (arg5 + -6) * 8;
            int var10 = class172.field3493 - var6;
            int var11 = class172.field3493;
            for (int var12 = 0; ~var12 > -32769; ++var12) {
                class70 var28 = class187.field3723[var12];
                if (var28 != null) {
                    for (int var29 = 0; var29 < 10; ++var29) {
                        var28.field692[var29] -= var10;
                        var28.field718[var29] -= var8;
                    }
                    var28.field679 -= var8 * 128;
                    var28.field716 -= var10 * 128;
                }
            }
            for (int var13 = 0; ~var13 > -2049; ++var13) {
                class38 var26 = class121.field2553[var13];
                if (var26 != null) {
                    for (int var27 = 0; ~var27 > -11; ++var27) {
                        var26.field692[var27] -= var10;
                        var26.field718[var27] -= var8;
                    }
                    var26.field679 -= var8 * 128;
                    var26.field716 -= var10 * 128;
                }
            }
            class60.field1227 = arg0;
            class56.field1136.method225(arg3, arg4, -31, false);
            byte var14 = 0;
            byte var15 = 1;
            byte var16 = 104;
            byte var17 = 0;
            byte var18 = 104;
            byte var19 = 1;
            if (var10 < 0) {
                var15 = -1;
                var14 = 103;
                var16 = -1;
            }
            if (var8 < 0) {
                var17 = 103;
                var19 = -1;
                var18 = -1;
            }
            for (int var20 = var14; var16 != var20; var20 += var15) {
                for (int var22 = var17; var18 != var22; var22 += var19) {
                    int var23 = var20 - -var10;
                    int var24 = var8 + var22;
                    for (int var25 = 0; ~var25 > -5; ++var25) {
                        if (~var23 <= -1 && var24 >= 0 && var23 < 104 && ~var24 > -105) {
                            class69.field1434[var25][var20][var22] = class69.field1434[var25][var23][var24];
                        } else {
                            class69.field1434[var25][var20][var22] = null;
                        }
                    }
                }
            }
            for (class64 var21 = (class64) class15.field266.method46(82); var21 != null; var21 = (class64) class15.field266.method53(7759444)) {
                var21.field1341 -= var8;
                var21.field1356 -= var10;
                if (var21.field1356 < 0 || var21.field1341 < 0 || ~var21.field1356 <= -105 || var21.field1341 >= 104) {
                    var21.method630(36);
                }
            }
            if (~class113.field2392 != -1) {
                class158.field3233 -= var8;
                class113.field2392 -= var10;
            }
            class95.field2033 = 0;
            class191.field3788 = -1;
            class199.field3941 = false;
            class79.field1602.method54((byte) 110);
            class158.field3228.method54((byte) 122);
        }
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lbe;Lbe;IZZZ)V")
    public class189(class16 arg0, class16 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3773 = arg2;
        this.field3769 = arg0;
        this.field3770 = arg1;
        this.field3763 = arg5;
        class112.method775(this, this.field3773, 113);
    }

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "(II)V")
    public final void method1250(int arg0, int arg1) {
        if (this.field3769 != null && this.field3747 != null && this.field3747[arg1]) {
            class44.method268(this.field3769, this, arg1, (byte) 126);
        } else {
            class92.method648(this.field3773, arg1, (byte) 2, arg0 ^ -1203352842, true, this, super.field3665[arg1]);
        }
        if (arg0 != -5210) {
            this.field3761 = 107;
        }
        ++field3771;
    }
}
