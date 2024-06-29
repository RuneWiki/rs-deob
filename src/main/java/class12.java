import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class12 extends class47 {

    @OriginalMember(owner = "client!be", name = "fb", descriptor = "Z")
    private boolean field200 = false;

    @OriginalMember(owner = "client!be", name = "zb", descriptor = "I")
    private int field220 = -1;

    @OriginalMember(owner = "client!be", name = "Eb", descriptor = "Z")
    private volatile boolean field225 = false;

    @OriginalMember(owner = "client!be", name = "pb", descriptor = "Lle;")
    private class71 field210;

    @OriginalMember(owner = "client!be", name = "yb", descriptor = "Lle;")
    private class71 field219;

    @OriginalMember(owner = "client!be", name = "Db", descriptor = "I")
    private int field224;

    @OriginalMember(owner = "client!be", name = "bb", descriptor = "J")
    public static long field196 = 0L;

    @OriginalMember(owner = "client!be", name = "mb", descriptor = "I")
    public static int field207 = 0;

    @OriginalMember(owner = "client!be", name = "db", descriptor = "Lva;")
    public static class121 field198 = class107.method797("null", -10983);

    @OriginalMember(owner = "client!be", name = "rb", descriptor = "I")
    public static int field212 = 1;

    @OriginalMember(owner = "client!be", name = "Bb", descriptor = "Lva;")
    private static class121 field222 = class107.method797("On", -10983);

    @OriginalMember(owner = "client!be", name = "nb", descriptor = "I")
    public static int field208 = 99;

    @OriginalMember(owner = "client!be", name = "ub", descriptor = "Lva;")
    public static class121 field215 = field222;

    @OriginalMember(owner = "client!be", name = "sb", descriptor = "Lqa;")
    public static class96 field213 = new class96(4096);

    @OriginalMember(owner = "client!be", name = "Ib", descriptor = "I")
    public static int field229 = 0;

    @OriginalMember(owner = "client!be", name = "Gb", descriptor = "I")
    public static int field227 = 1;

    @OriginalMember(owner = "client!be", name = "Jb", descriptor = "I")
    public static int field230 = 0;

    @OriginalMember(owner = "client!be", name = "cb", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!be", name = "gb", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!be", name = "hb", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!be", name = "jb", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!be", name = "lb", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!be", name = "ob", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!be", name = "qb", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!be", name = "vb", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!be", name = "wb", descriptor = "I")
    private int field217;

    @OriginalMember(owner = "client!be", name = "xb", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!be", name = "Ab", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!be", name = "Cb", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!be", name = "Fb", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!be", name = "kb", descriptor = "Lw;")
    public static class125 field205;

    @OriginalMember(owner = "client!be", name = "eb", descriptor = "Lbe;")
    public static class12 field199;

    @OriginalMember(owner = "client!be", name = "ib", descriptor = "Lhe;")
    public static class47 field203;

    @OriginalMember(owner = "client!be", name = "Hb", descriptor = "Lic;")
    public static class51 field228;

    @OriginalMember(owner = "client!be", name = "tb", descriptor = "[Z")
    private volatile boolean[] field214;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(I)V", line = 5)
    private final void method93(int arg0) {
        ++field197;
        this.field214 = new boolean[super.field1127.length];
        if (arg0 == 20440) {
            for (int var2 = 0; var2 < this.field214.length; ++var2) {
                this.field214[var2] = false;
            }
            if (this.field210 == null) {
                this.field225 = true;
            } else {
                this.field220 = -1;
                for (int var3 = 0; var3 < this.field214.length; ++var3) {
                    if (~super.field1106[var3] < -1) {
                        class42.method284(var3, this.field210, this, 1);
                        this.field220 = var3;
                    }
                }
                if (this.field220 == -1) {
                    this.field225 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "f", descriptor = "(II)I", line = 56)
    private final int method94(int arg0, int arg1) {
        ++field202;
        if (super.field1127[arg1] != null) {
            return 100;
        } else {
            if (arg0 != 103) {
                this.field224 = -125;
            }
            return this.field214[arg1] ? 100 : class56.method407(-10601, this.field224, arg1);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZI)V", line = 82)
    public final void method95(boolean arg0, int arg1) {
        ++field216;
        if (arg0) {
            this.method93(-38);
        }
        class25.method199(arg1, this.field224, 1);
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lle;Lle;IZZZ)V", line = 215)
    public class12(class71 arg0, class71 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field210 = arg0;
        this.field200 = arg5;
        this.field219 = arg1;
        this.field224 = arg2;
        class80.method548(this, (byte) 0, this.field224);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([BZIILle;)V", line = 103)
    public final void method96(byte[] arg0, boolean arg1, int arg2, int arg3, class71 arg4) {
        if (arg2 != -3) {
            field229 = 84;
        }
        ++field209;
        if (this.field219 == arg4) {
            if (this.field225) {
                throw new RuntimeException();
            } else if (arg0 == null) {
                class128.method999(2119418128, true, this, this.field217, (byte) 0, 255, this.field224);
            } else {
                class60.field1425.reset();
                class60.field1425.update(arg0, 0, arg0.length);
                int var6 = (int) class60.field1425.getValue();
                if (~this.field217 != ~var6) {
                    class128.method999(2119418128, true, this, this.field217, (byte) 0, 255, this.field224);
                } else {
                    this.method323(false, arg0);
                    this.method93(20440);
                }
            }
        } else {
            if (!arg1 && ~this.field220 == ~arg3) {
                this.field225 = true;
            }
            if (arg0 != null && ~arg0.length < -3) {
                class60.field1425.reset();
                class60.field1425.update(arg0, 0, arg0.length - 2);
                int var7 = (int) class60.field1425.getValue();
                int var8 = ((arg0[arg0.length + -2] & 255) << 8) + (255 & arg0[arg0.length + -1]);
                if (super.field1089[arg3] == var7 && super.field1096[arg3] == var8) {
                    this.field214[arg3] = true;
                    if (arg1) {
                        super.field1127[arg3] = arg0;
                    }
                } else {
                    this.field214[arg3] = false;
                    if (this.field200 || arg1) {
                        class128.method999(2119418128, arg1, this, super.field1089[arg3], (byte) 2, this.field224, arg3);
                    }
                }
            } else {
                this.field214[arg3] = false;
                if (this.field200 || arg1) {
                    class128.method999(2119418128, arg1, this, super.field1089[arg3], (byte) 2, this.field224, arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "(I)V", line = 197)
    public static void method97(int arg0) {
        field215 = null;
        field213 = null;
        field222 = null;
        field203 = null;
        field198 = null;
        if (arg0 == 1) {
            field199 = null;
            field228 = null;
            field205 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "g", descriptor = "(II)V", line = 236)
    public final void method98(int arg0, int arg1) {
        ++field218;
        this.field217 = arg1;
        if (this.field219 != null) {
            class120.method930(this.field224, 106, this, this.field219);
        } else {
            class128.method999(2119418128, true, this, this.field217, (byte) 0, 255, this.field224);
        }
        if (arg0 != 255) {
            field207 = -118;
        }
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(II)V", line = 255)
    public final void method99(int arg0, int arg1) {
        ++field206;
        if (this.field210 != null && this.field214 != null && this.field214[arg1]) {
            class120.method930(arg1, 127, this, this.field210);
        } else {
            class128.method999(2119418128, true, this, super.field1089[arg1], (byte) 2, this.field224, arg1);
        }
        if (arg0 != 255) {
            this.field214 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([Lcb;Lrc;I)V", line = 280)
    public static final void method100(class15[] arg0, class103 arg1, int arg2) {
        for (int var3 = 0; ~var3 > -5; ++var3) {
            for (int var110 = 0; var110 < 104; ++var110) {
                for (int var111 = 0; var111 < 104; ++var111) {
                    if ((class23.field613[var3][var110][var111] & 1) == 1) {
                        int var112 = var3;
                        if ((2 & class23.field613[1][var110][var111]) == 2) {
                            var112 = var3 - 1;
                        }
                        if (~var112 <= -1) {
                            arg0[var112].method125(var110, arg2 + 15331, var111);
                        }
                    }
                }
            }
        }
        ++field226;
        class118.field2682 += (int) (5.0D * Math.random()) - 2;
        class35.field845 += -2 + (int) (5.0D * Math.random());
        if (class35.field845 < -8) {
            class35.field845 = -8;
        }
        if (class35.field845 > 8) {
            class35.field845 = 8;
        }
        if (~class118.field2682 > 15) {
            class118.field2682 = -16;
        }
        if (class118.field2682 > 16) {
            class118.field2682 = 16;
        }
        for (int var4 = 0; var4 < 4; ++var4) {
            byte[][] var47 = class20.field525[var4];
            int var48 = (int) Math.sqrt(5100.0D);
            int var49 = var48 * 768 >> 8;
            for (int var50 = 1; ~var50 > -104; ++var50) {
                for (int var101 = 1; var101 < 103; ++var101) {
                    int var102 = class45.field1058[var4][var101 + 1][var50] + -class45.field1058[var4][var101 + -1][var50];
                    int var103 = class45.field1058[var4][var101][var50 + 1] + -class45.field1058[var4][var101][var50 + -1];
                    int var104 = (int) Math.sqrt((double) (var102 * var102 - -(var103 * var103) + 65536));
                    int var105 = 65536 / var104;
                    int var106 = (var102 << 8) / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = 96 - -((var106 * -50 + var105 * -10 + var107 * -50) / var49);
                    int var109 = (var47[var101][var50 + 1] >> 3) + (var47[var101 + -1][var50] >> 2) - -(var47[var101][var50 + -1] >> 2) + (var47[var101 - -1][var50] >> 3) + (var47[var101][var50] >> 1);
                    class14.field245[var101][var50] = -var109 + var108;
                }
            }
            for (int var51 = 0; var51 < 104; ++var51) {
                class115.field2630[var51] = 0;
                class100.field2228[var51] = 0;
                class25.field632[var51] = 0;
                class34.field829[var51] = 0;
                class80.field1860[var51] = 0;
            }
            for (int var52 = -5; var52 < 109; ++var52) {
                for (int var55 = 0; ~var55 > -105; ++var55) {
                    int var95 = var52 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < 104) {
                        int var96 = class41.field928[var4][var95][var55] & 255;
                        if (~var96 < -1) {
                            class95 var97 = class59.method423(var96 + -1, false);
                            class115.field2630[var55] += var97.field2114;
                            class100.field2228[var55] += var97.field2113;
                            class25.field632[var55] += var97.field2109;
                            class34.field829[var55] += var97.field2132;
                            var10002 = class80.field1860[var55]++;
                        }
                    }
                    int var98 = var52 + -5;
                    if (var98 >= 0 && var98 < 104) {
                        int var99 = class41.field928[var4][var98][var55] & 255;
                        if (~var99 < -1) {
                            class95 var100 = class59.method423(var99 + -1, false);
                            class115.field2630[var55] -= var100.field2114;
                            class100.field2228[var55] -= var100.field2113;
                            class25.field632[var55] -= var100.field2109;
                            class34.field829[var55] -= var100.field2132;
                            var10002 = class80.field1860[var55]--;
                        }
                    }
                }
                if (~var52 <= -2 && var52 < 103) {
                    int var56 = 0;
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    for (int var61 = -5; var61 < 109; ++var61) {
                        int var62 = var61 + 5;
                        if (var62 >= 0 && ~var62 > -105) {
                            var58 += class25.field632[var62];
                            var56 += class115.field2630[var62];
                            var59 += class34.field829[var62];
                            var60 += class80.field1860[var62];
                            var57 += class100.field2228[var62];
                        }
                        int var63 = var61 + -5;
                        if (var63 >= 0 && var63 < 104) {
                            var60 -= class80.field1860[var63];
                            var59 -= class34.field829[var63];
                            var58 -= class25.field632[var63];
                            var56 -= class115.field2630[var63];
                            var57 -= class100.field2228[var63];
                        }
                        if (var61 >= 1 && var61 < 103 && (!class38.field879 || (class23.field613[0][var52][var61] & 2) != 0 || ~(16 & class23.field613[var4][var52][var61]) == -1 && ~class37.method254(var52, (byte) 47, var4, var61) == ~class76.field1743)) {
                            if (~var4 > ~field208) {
                                field208 = var4;
                            }
                            int var64 = 255 & class41.field928[var4][var52][var61];
                            int var65 = 255 & class48.field1161[var4][var52][var61];
                            if (~var64 < -1 || var65 > 0) {
                                int var66 = class45.field1058[var4][var52 - -1][var61];
                                int var67 = class45.field1058[var4][var52 + 1][var61 + 1];
                                int var68 = class45.field1058[var4][var52][var61 + 1];
                                int var69 = class14.field245[var52][var61];
                                int var70 = class45.field1058[var4][var52][var61];
                                int var71 = class14.field245[var52][var61 + 1];
                                int var72 = class14.field245[var52 + 1][var61 + 1];
                                int var73 = -1;
                                int var74 = -1;
                                int var75 = class14.field245[var52 - -1][var61];
                                if (var64 > 0) {
                                    int var76 = var56 * 256 / var59;
                                    int var77 = var57 / var60;
                                    int var78 = var58 / var60;
                                    var74 = class67.method476(var77, var76, (byte) 108, var78);
                                    int var79 = 255 & class35.field845 + var76;
                                    int var80 = class118.field2682 + var78;
                                    if (var80 < 0) {
                                        var80 = 0;
                                    } else if (var80 > 255) {
                                        var80 = 255;
                                    }
                                    var73 = class67.method476(var77, var79, (byte) 112, var80);
                                }
                                if (~var4 < -1) {
                                    boolean var81 = true;
                                    if (var64 == 0 && class115.field2621[var4][var52][var61] != 0) {
                                        var81 = false;
                                    }
                                    if (~var65 < -1 && !class9.method61(var65 + -1, arg2 + 15460).field182) {
                                        var81 = false;
                                    }
                                    if (var81 && var66 == var70 && ~var67 == ~var70 && var68 == var70) {
                                        class61.field1465[var4][var52][var61] = class59.method430(class61.field1465[var4][var52][var61], 2340);
                                    }
                                }
                                int var82 = 0;
                                if (~var73 != 0) {
                                    var82 = class83.field1937[class16.method130(31920, 96, var73)];
                                }
                                if (~var65 != -1) {
                                    byte var83 = class33.field813[var4][var52][var61];
                                    int var84 = class115.field2621[var4][var52][var61] + 1;
                                    class11 var85 = class9.method61(var65 - 1, arg2 + 15460);
                                    int var86 = var85.field189;
                                    int var87;
                                    int var88;
                                    if (var86 >= 0) {
                                        var87 = -1;
                                        var88 = class83.field1935.method51(var86, (byte) -126);
                                    } else if (var85.field179 != 16711935) {
                                        var87 = class67.method476(var85.field185, var85.field177, (byte) 119, var85.field193);
                                        int var89 = 255 & var85.field177 - -class35.field845;
                                        int var90 = var85.field193 - -class118.field2682;
                                        if (var90 < 0) {
                                            var90 = 0;
                                        } else if (var90 > 255) {
                                            var90 = 255;
                                        }
                                        var88 = class67.method476(var85.field185, var89, (byte) 121, var90);
                                    } else {
                                        var87 = -2;
                                        var88 = -2;
                                        var86 = -1;
                                    }
                                    int var91 = 0;
                                    if (var88 != -2) {
                                        var91 = class83.field1937[class11.method84(96, 123, var88)];
                                    }
                                    if (~var85.field169 != 0) {
                                        int var92 = 255 & class35.field845 + var85.field175;
                                        int var93 = var85.field172 - -class118.field2682;
                                        if (var93 < 0) {
                                            var93 = 0;
                                        } else if (var93 > 255) {
                                            var93 = 255;
                                        }
                                        int var94 = class67.method476(var85.field190, var92, (byte) 105, var93);
                                        var91 = class83.field1937[class11.method84(96, 124, var94)];
                                    }
                                    arg1.method756(var4, var52, var61, var84, var83, var86, var70, var66, var67, var68, class16.method130(31920, var69, var74), class16.method130(31920, var75, var74), class16.method130(31920, var72, var74), class16.method130(31920, var71, var74), class11.method84(var69, 124, var87), class11.method84(var75, 125, var87), class11.method84(var72, 125, var87), class11.method84(var71, 126, var87), var82, var91);
                                } else {
                                    arg1.method756(var4, var52, var61, 0, 0, -1, var70, var66, var67, var68, class16.method130(arg2 + 47376, var69, var74), class16.method130(arg2 ^ -16624, var75, var74), class16.method130(31920, var72, var74), class16.method130(31920, var71, var74), 0, 0, 0, 0, var82, 0);
                                }
                            }
                        }
                    }
                }
            }
            for (int var53 = 1; var53 < 103; ++var53) {
                for (int var54 = 1; ~var54 > -104; ++var54) {
                    arg1.method717(var4, var54, var53, class37.method254(var54, (byte) 47, var4, var53));
                }
            }
            class41.field928[var4] = null;
            class48.field1161[var4] = null;
            class115.field2621[var4] = null;
            class33.field813[var4] = null;
            class20.field525[var4] = null;
        }
        arg1.method753(-50, -10, -50);
        int var5 = 0;
        if (arg2 != -15456) {
            method100((class15[]) null, (class103) null, 45);
        }
        while (~var5 > -105) {
            for (int var46 = 0; ~var46 > -105; ++var46) {
                if (~(class23.field613[1][var5][var46] & 2) == -3) {
                    arg1.method746(var5, var46);
                }
            }
            ++var5;
        }
        int var6 = 1;
        int var7 = 2;
        int var8 = 4;
        for (int var9 = 0; var9 < 4; ++var9) {
            if (var9 > 0) {
                var7 <<= 3;
                var6 <<= 3;
                var8 <<= 3;
            }
            for (int var10 = 0; var9 >= var10; ++var10) {
                for (int var11 = 0; ~var11 >= -105; ++var11) {
                    for (int var12 = 0; ~var12 >= -105; ++var12) {
                        if ((var6 & class61.field1465[var10][var12][var11]) != 0) {
                            int var13 = var11;
                            int var14 = var11;
                            while (var13 > 0 && (class61.field1465[var10][var12][var13 + -1] & var6) != 0) {
                                --var13;
                            }
                            int var15 = var10;
                            while (var14 < 104 && ~(class61.field1465[var10][var12][var14 + 1] & var6) != -1) {
                                ++var14;
                            }
                            int var16 = var10;
                            label355: while (var15 > 0) {
                                for (int var17 = var13; ~var17 >= ~var14; ++var17) {
                                    if ((class61.field1465[var15 + -1][var12][var17] & var6) == 0) {
                                        break label355;
                                    }
                                }
                                --var15;
                            }
                            label344: while (~var9 < ~var16) {
                                for (int var18 = var13; ~var14 <= ~var18; ++var18) {
                                    if ((var6 & class61.field1465[var16 - -1][var12][var18]) == 0) {
                                        break label344;
                                    }
                                }
                                ++var16;
                            }
                            int var19 = (-var13 + var14 + 1) * (var16 + 1 + -var15);
                            if (var19 >= 8) {
                                short var20 = 240;
                                int var21 = class45.field1058[var15][var12][var13];
                                int var22 = class45.field1058[var16][var12][var13] + -var20;
                                class103.method732(var9, 1, var12 * 128, var12 * 128, var13 * 128, var14 * 128 + 128, var22, var21);
                                for (int var23 = var15; var16 >= var23; ++var23) {
                                    for (int var24 = var13; var14 >= var24; ++var24) {
                                        class61.field1465[var23][var12][var24] = class90.method614(class61.field1465[var23][var12][var24], ~var6);
                                    }
                                }
                            }
                        }
                        if (~(class61.field1465[var10][var12][var11] & var7) != -1) {
                            int var25;
                            for (var25 = var12; var25 > 0 && ~(var7 & class61.field1465[var10][var25 + -1][var11]) != -1; --var25) {
                            }
                            int var26 = var12;
                            int var27 = var10;
                            while (var26 < 104 && ~(var7 & class61.field1465[var10][var26 - -1][var11]) != -1) {
                                ++var26;
                            }
                            int var28 = var10;
                            label410: while (~var27 < -1) {
                                for (int var29 = var25; ~var29 >= ~var26; ++var29) {
                                    if ((var7 & class61.field1465[var27 - 1][var29][var11]) == 0) {
                                        break label410;
                                    }
                                }
                                --var27;
                            }
                            label399: while (~var28 > ~var9) {
                                for (int var30 = var25; var30 <= var26; ++var30) {
                                    if (~(var7 & class61.field1465[var28 + 1][var30][var11]) == -1) {
                                        break label399;
                                    }
                                }
                                ++var28;
                            }
                            int var31 = (1 - var27 + var28) * (-var25 + var26 + 1);
                            if (var31 >= 8) {
                                short var32 = 240;
                                int var33 = class45.field1058[var28][var25][var11] - var32;
                                int var34 = class45.field1058[var27][var25][var11];
                                class103.method732(var9, 2, var25 * 128, var26 * 128 + 128, var11 * 128, var11 * 128, var33, var34);
                                for (int var35 = var27; var28 >= var35; ++var35) {
                                    for (int var36 = var25; ~var26 <= ~var36; ++var36) {
                                        class61.field1465[var35][var36][var11] = class90.method614(class61.field1465[var35][var36][var11], ~var7);
                                    }
                                }
                            }
                        }
                        if ((class61.field1465[var10][var12][var11] & var8) != 0) {
                            int var37 = var12;
                            int var38;
                            for (var38 = var11; ~var38 < -1 && (class61.field1465[var10][var12][var38 - 1] & var8) != 0; --var38) {
                            }
                            int var39 = var12;
                            int var40;
                            for (var40 = var11; ~var40 > -105 && (var8 & class61.field1465[var10][var12][var40 + 1]) != 0; ++var40) {
                            }
                            label465: while (var39 > 0) {
                                for (int var41 = var38; var40 >= var41; ++var41) {
                                    if (~(class61.field1465[var10][var39 - 1][var41] & var8) == -1) {
                                        break label465;
                                    }
                                }
                                --var39;
                            }
                            label454: while (~var37 > -105) {
                                for (int var42 = var38; var40 >= var42; ++var42) {
                                    if (~(class61.field1465[var10][var37 - -1][var42] & var8) == -1) {
                                        break label454;
                                    }
                                }
                                ++var37;
                            }
                            if ((-var39 + var37 - -1) * (var40 + 1 - var38) >= 4) {
                                int var43 = class45.field1058[var10][var39][var38];
                                class103.method732(var9, 4, var39 * 128, var37 * 128 + 128, var38 * 128, var40 * 128 + 128, var43, var43);
                                for (int var44 = var39; var44 <= var37; ++var44) {
                                    for (int var45 = var38; var45 <= var40; ++var45) {
                                        class61.field1465[var10][var44][var45] = class90.method614(class61.field1465[var10][var44][var45], ~var8);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(B)I", line = 1015)
    public final int method101(byte arg0) {
        ++field201;
        if (this.field225) {
            return 100;
        } else if (super.field1127 != null) {
            return 99;
        } else {
            if (arg0 != -35) {
                this.method96((byte[]) null, false, -67, -62, (class71) null);
            }
            int var2 = class56.method407(arg0 + -10566, 255, this.field224);
            if (~var2 <= -101) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(B)I", line = 1039)
    public final int method102(byte arg0) {
        ++field204;
        int var2 = 0;
        if (arg0 < 109) {
            field205 = null;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < super.field1127.length; ++var4) {
            if (~super.field1106[var4] < -1) {
                var2 += 100;
                var3 += this.method94(103, var4);
            }
        }
        if (~var2 == -1) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([BIZZI)V", line = 1082)
    public final void method103(byte[] arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        int var6 = 59 / ((arg4 - 62) / 43);
        ++field211;
        if (arg2) {
            if (this.field225) {
                throw new RuntimeException();
            } else {
                if (this.field219 != null) {
                    client.method165(arg0, this.field224, (byte) 90, this.field219);
                }
                this.method323(false, arg0);
                this.method93(20440);
            }
        } else {
            arg0[arg0.length + -2] = (byte) (super.field1096[arg1] >> 8);
            arg0[arg0.length + -1] = (byte) super.field1096[arg1];
            if (this.field210 != null) {
                client.method165(arg0, arg1, (byte) 105, this.field210);
                this.field214[arg1] = true;
            }
            if (arg3) {
                super.field1127[arg1] = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lhe;I)V", line = 1131)
    public static final void method104(class47 arg0, int arg1) {
        class34.field828 = arg0;
        class81.field1882 = class34.field828.method328(16, false);
        ++field223;
        int var2 = 55 % ((arg1 - -46) / 51);
    }
}
