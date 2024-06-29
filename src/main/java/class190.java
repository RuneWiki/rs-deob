import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class190 extends class197 {

    @OriginalMember(owner = "client!ud", name = "wb", descriptor = "Z")
    private boolean field3703 = false;

    @OriginalMember(owner = "client!ud", name = "Cb", descriptor = "Z")
    private volatile boolean field3709 = false;

    @OriginalMember(owner = "client!ud", name = "zb", descriptor = "I")
    private int field3706 = -1;

    @OriginalMember(owner = "client!ud", name = "hb", descriptor = "Lpb;")
    private class143 field3688;

    @OriginalMember(owner = "client!ud", name = "kb", descriptor = "I")
    private int field3691;

    @OriginalMember(owner = "client!ud", name = "Ab", descriptor = "Lpb;")
    private class143 field3707;

    @OriginalMember(owner = "client!ud", name = "db", descriptor = "Ltg;")
    private static class184 field3684 = class135.method812("Invalid username or password)3", 3);

    @OriginalMember(owner = "client!ud", name = "fb", descriptor = "Ltg;")
    public static class184 field3686 = class135.method812(")3runescape)3com", 3);

    @OriginalMember(owner = "client!ud", name = "pb", descriptor = "Ltg;")
    public static class184 field3696 = class135.method812("scape main", 3);

    @OriginalMember(owner = "client!ud", name = "gb", descriptor = "Ltg;")
    public static class184 field3687 = field3684;

    @OriginalMember(owner = "client!ud", name = "yb", descriptor = "Ltg;")
    public static class184 field3705 = class135.method812("Untersuchen", 3);

    @OriginalMember(owner = "client!ud", name = "Z", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!ud", name = "ab", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!ud", name = "bb", descriptor = "I")
    private int field3682;

    @OriginalMember(owner = "client!ud", name = "cb", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!ud", name = "eb", descriptor = "I")
    private int field3685;

    @OriginalMember(owner = "client!ud", name = "ib", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!ud", name = "jb", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!ud", name = "lb", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!ud", name = "mb", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!ud", name = "nb", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!ud", name = "ob", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!ud", name = "rb", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!ud", name = "sb", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!ud", name = "tb", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!ud", name = "ub", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!ud", name = "vb", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!ud", name = "Bb", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!ud", name = "qb", descriptor = "[Z")
    private volatile boolean[] field3697;

    @OriginalMember(owner = "client!ud", name = "xb", descriptor = "[[[Ljc;")
    public static class90[][][] field3704;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V")
    public static final void method1205(boolean arg0) {
        ++field3699;
        if (~class105.field1909 == -26) {
            int var1 = class21.field394.method588((byte) -120);
            int var2 = (var1 >> 4 & 7) + class26.field469;
            int var3 = (7 & var1) + class59.field1100;
            int var4 = class21.field394.method611(false);
            int var5 = class21.field394.method611(false);
            int var6 = class21.field394.method611(false);
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class69 var7 = class157.field2813[class47.field892][var2][var3];
                if (var7 != null) {
                    for (class3 var8 = (class3) var7.method404(false); var8 != null; var8 = (class3) var7.method414(-126)) {
                        if ((var4 & 32767) == var8.field59 && var8.field60 == var5) {
                            var8.field60 = var6;
                            break;
                        }
                    }
                    class136.method820(var2, var3, 0);
                }
            }
        } else if (class105.field1909 == 145) {
            int var9 = class21.field394.method611(false);
            int var10 = class21.field394.method572(false);
            int var11 = class21.field394.method590(true);
            int var12 = class21.field394.method605(-127);
            int var13 = class59.field1100 - -(7 & var12);
            int var14 = ((var12 & 121) >> 4) + class26.field469;
            if (var14 >= 0 && var13 >= 0 && var14 < 104 && var13 < 104 && class125.field2260 != var10) {
                class3 var15 = new class3();
                var15.field60 = var9;
                var15.field59 = var11;
                if (class157.field2813[class47.field892][var14][var13] == null) {
                    class157.field2813[class47.field892][var14][var13] = new class69();
                }
                class157.field2813[class47.field892][var14][var13].method402(16777215, var15);
                class136.method820(var14, var13, 0);
            }
        } else if (class105.field1909 == 193) {
            int var16 = class21.field394.method588((byte) -76);
            int var17 = (7 & var16 >> 4) + class26.field469;
            int var18 = class59.field1100 - -(7 & var16);
            int var19 = class21.field394.method611(false);
            int var20 = class21.field394.method588((byte) -64);
            int var21 = class21.field394.method611(false);
            if (var17 >= 0 && var18 >= 0 && var17 < 104 && var18 < 104) {
                int var22 = var18 * 128 + 64;
                int var23 = var17 * 128 - -64;
                class182 var24 = new class182(var19, class47.field892, var23, var22, class115.method706(var23, class47.field892, 127, var22) + -var20, var21, class161.field2903);
                class51.field936.method402(16777215, var24);
            }
        } else if (~class105.field1909 == -160) {
            int var25 = class21.field394.method588((byte) -63);
            int var26 = (var25 & 7) + class59.field1100;
            int var27 = (7 & var25 >> 4) + class26.field469;
            int var28 = var27 + class21.field394.method591(65280);
            int var29 = class21.field394.method591(65280) + var26;
            int var30 = class21.field394.method584((byte) -84);
            int var31 = class21.field394.method611(false);
            int var32 = 4 * class21.field394.method588((byte) -87);
            int var33 = class21.field394.method588((byte) -125) * 4;
            int var34 = class21.field394.method611(false);
            int var35 = class21.field394.method611(!arg0);
            int var36 = class21.field394.method588((byte) -112);
            int var37 = class21.field394.method588((byte) -47);
            if (var27 >= 0 && var26 >= 0 && var27 < 104 && var26 < 104 && ~var28 <= -1 && var29 >= 0 && ~var28 > -105 && ~var29 > -105 && var31 != 65535) {
                int var38 = var28 * 128 - -64;
                int var39 = var29 * 128 + 64;
                int var40 = var27 * 128 + 64;
                int var41 = var26 * 128 + 64;
                class114 var42 = new class114(var31, class47.field892, var40, var41, -var32 + class115.method706(var40, class47.field892, 127, var41), class161.field2903 + var34, class161.field2903 + var35, var36, var37, var30, var33);
                var42.method702(var38, class161.field2903 + var34, -10253, class115.method706(var38, class47.field892, 127, var39) + -var33, var39);
                class6.field110.method402(16777215, var42);
            }
        } else {
            if (~class105.field1909 == -201) {
                byte var43 = class21.field394.method574((byte) 106);
                int var44 = class21.field394.method611(false);
                int var45 = class21.field394.method611(!arg0);
                byte var46 = class21.field394.method586(19876);
                int var47 = class21.field394.method605(-127);
                int var48 = class59.field1100 - -(var47 & 7);
                int var49 = ((var47 & 124) >> 4) + class26.field469;
                int var50 = class21.field394.method588((byte) -60);
                int var51 = 3 & var50;
                int var52 = var50 >> 2;
                int var53 = class19.field374[var52];
                int var54 = class21.field394.method590(true);
                byte var55 = class21.field394.method577(-77);
                int var56 = class21.field394.method572(false);
                byte var57 = class21.field394.method591(65280);
                class67 var58;
                if (class125.field2260 == var54) {
                    var58 = class46.field872;
                } else {
                    var58 = class57.field1024[var54];
                }
                if (var58 != null) {
                    class58 var59 = class14.method88(-83, var45);
                    int var60;
                    int var61;
                    if (var51 != 1 && var51 != 3) {
                        var60 = var59.field1084;
                        var61 = var59.field1027;
                    } else {
                        var60 = var59.field1027;
                        var61 = var59.field1084;
                    }
                    int var62 = var49 - -(var61 >> 1);
                    int var63 = var49 - -(var61 - -1 >> 1);
                    int var64 = (var60 >> 1) + var48;
                    int var65 = (var60 + 1 >> 1) + var48;
                    int[][] var66 = class179.field3418[class47.field892];
                    int var67 = var66[var63][var64] - (-var66[var62][var65] - var66[var63][var65]) + var66[var62][var64] >> 2;
                    int var68 = (var49 << 7) - -(var61 << 6);
                    int var69 = (var48 << 7) + (var60 << 6);
                    class140 var70 = var59.method322(-126, var67, var52, var51, var69, var66, var68);
                    if (var70 != null) {
                        if (~var55 < ~var43) {
                            byte var71 = var55;
                            var55 = var43;
                            var43 = var71;
                        }
                        class126.method761(var44 + 1, var49, -1, var48, class47.field892, -5783, var56 + 1, var53, 0, 0);
                        var58.field1297 = var49 + var55;
                        var58.field1303 = var49 * 128 + var61 * 64;
                        var58.field1279 = class161.field2903 + var44;
                        var58.field1294 = class161.field2903 + var56;
                        if (var46 < var57) {
                            byte var72 = var57;
                            var57 = var46;
                            var46 = var72;
                        }
                        var58.field1280 = var48 + var57;
                        var58.field1295 = var70;
                        var58.field1296 = var43 + var49;
                        var58.field1293 = var67;
                        var58.field1277 = var48 * 128 + var60 * 64;
                        var58.field1274 = var46 + var48;
                    }
                }
            }
            if (class105.field1909 == 175) {
                int var73 = class21.field394.method614(0);
                int var74 = var73 >> 2;
                int var75 = 3 & var73;
                int var76 = class19.field374[var74];
                int var77 = class21.field394.method605(-128);
                int var78 = (var77 & 7) + class59.field1100;
                int var79 = (var77 >> 4 & 7) + class26.field469;
                if (var79 >= 0 && ~var78 <= -1 && ~var79 > -105 && var78 < 104) {
                    class126.method761(0, var79, -1, var78, class47.field892, -5783, -1, var76, var74, var75);
                }
            } else if (~class105.field1909 == -210) {
                int var80 = class21.field394.method588((byte) -99);
                int var81 = ((var80 & 127) >> 4) + class26.field469;
                int var82 = class59.field1100 - -(7 & var80);
                int var83 = class21.field394.method590(true);
                int var84 = class21.field394.method564(116);
                if (var81 >= 0 && ~var82 <= -1 && ~var81 > -105 && var82 < 104) {
                    class3 var85 = new class3();
                    var85.field60 = var84;
                    var85.field59 = var83;
                    if (class157.field2813[class47.field892][var81][var82] == null) {
                        class157.field2813[class47.field892][var81][var82] = new class69();
                    }
                    class157.field2813[class47.field892][var81][var82].method402(16777215, var85);
                    class136.method820(var81, var82, 0);
                }
            } else if (class105.field1909 == 87) {
                int var86 = class21.field394.method588((byte) -35);
                int var87 = (var86 >> 4 & 7) + class26.field469;
                int var88 = (7 & var86) + class59.field1100;
                int var89 = class21.field394.method588((byte) -74);
                int var90 = var89 >> 2;
                int var91 = 3 & var89;
                int var92 = class19.field374[var90];
                int var93 = class21.field394.method564(96);
                if (var87 >= 0 && var88 >= 0 && ~var87 > -104 && var88 < 103) {
                    if (var92 == 0) {
                        class50 var94 = class71.method422(class47.field892, var87, var88);
                        if (var94 != null) {
                            int var95 = Integer.MAX_VALUE & (int) (var94.field923 >>> 32);
                            if (var90 == 2) {
                                var94.field918 = new class13(var95, 2, var91 + 4, class47.field892, var87, var88, var93, false, var94.field918);
                                var94.field930 = new class13(var95, 2, 3 & var91 - -1, class47.field892, var87, var88, var93, false, var94.field930);
                            } else {
                                var94.field918 = new class13(var95, var90, var91, class47.field892, var87, var88, var93, false, var94.field918);
                            }
                        }
                    }
                    if (var92 == 1) {
                        class134 var96 = class132.method802(class47.field892, var87, var88);
                        if (var96 != null) {
                            int var97 = (int) (var96.field2435 >>> 32) & Integer.MAX_VALUE;
                            if (~var90 != -5 && var90 != 5) {
                                if (var90 == 6) {
                                    var96.field2426 = new class13(var97, 4, var91 + 4, class47.field892, var87, var88, var93, false, var96.field2426);
                                } else if (var90 != 7) {
                                    if (var90 == 8) {
                                        var96.field2426 = new class13(var97, 4, var91 + 4, class47.field892, var87, var88, var93, false, var96.field2426);
                                        var96.field2438 = new class13(var97, 4, (3 & var91 + 2) + 4, class47.field892, var87, var88, var93, false, var96.field2438);
                                    }
                                } else {
                                    var96.field2426 = new class13(var97, 4, (3 & var91 - -2) + 4, class47.field892, var87, var88, var93, false, var96.field2426);
                                }
                            } else {
                                var96.field2426 = new class13(var97, 4, var91, class47.field892, var87, var88, var93, false, var96.field2426);
                            }
                        }
                    }
                    if (var92 == 2) {
                        class164 var98 = class13.method85(class47.field892, var87, var88);
                        if (var90 == 11) {
                            var90 = 10;
                        }
                        if (var98 != null) {
                            var98.field2951 = new class13(Integer.MAX_VALUE & (int) (var98.field2934 >>> 32), var90, var91, class47.field892, var87, var88, var93, false, var98.field2951);
                        }
                    }
                    if (~var92 == -4) {
                        class88 var99 = class130.method789(class47.field892, var87, var88);
                        if (var99 != null) {
                            var99.field1658 = new class13((int) (var99.field1652 >>> 32) & Integer.MAX_VALUE, 22, var91, class47.field892, var87, var88, var93, false, var99.field1658);
                        }
                    }
                }
            } else {
                if (~class105.field1909 == -28) {
                    int var100 = class21.field394.method588((byte) -45);
                    int var101 = (7 & var100) + class59.field1100;
                    int var102 = (7 & var100 >> 4) + class26.field469;
                    int var103 = class21.field394.method611(false);
                    if (~var103 == -65536) {
                        var103 = -1;
                    }
                    int var104 = class21.field394.method588((byte) -90);
                    int var105 = var104 & 7;
                    int var106 = (var104 & 248) >> 4;
                    int var107 = class21.field394.method588((byte) -35);
                    if (~var102 <= -1 && var101 >= 0 && var102 < 104 && ~var101 > -105) {
                        int var108 = var106 + 1;
                        if (class46.field872.field644[0] >= var102 - var108 && ~class46.field872.field644[0] >= ~(var102 - -var108) && -var108 + var101 <= class46.field872.field615[0] && ~class46.field872.field615[0] >= ~(var101 + var108) && class170.field3230 != 0 && ~var105 < -1 && ~class91.field1700 > -51 && var103 != -1) {
                            class189.field3663[class91.field1700] = var103;
                            class131.field2383[class91.field1700] = var105;
                            class198.field3867[class91.field1700] = var107;
                            class179.field3421[class91.field1700] = null;
                            class57.field1025[class91.field1700] = (var101 << 8) + (var102 << 16) + var106;
                            ++class91.field1700;
                        }
                    }
                }
                if (~class105.field1909 == -213) {
                    int var109 = class21.field394.method588((byte) -30);
                    int var110 = (var109 >> 4 & 7) + class26.field469;
                    int var111 = class59.field1100 - -(7 & var109);
                    int var112 = class21.field394.method605(20);
                    int var113 = var112 >> 2;
                    int var114 = class19.field374[var113];
                    int var115 = var112 & 3;
                    int var116 = class21.field394.method590(true);
                    if (~var110 <= -1 && ~var111 <= -1 && ~var110 > -105 && var111 < 104) {
                        class126.method761(0, var110, var116, var111, class47.field892, -5783, -1, var114, var113, var115);
                    }
                } else if (arg0) {
                    if (~class105.field1909 == -204) {
                        int var117 = class21.field394.method605(-126);
                        int var118 = class26.field469 - -(7 & var117 >> 4);
                        int var119 = (7 & var117) + class59.field1100;
                        int var120 = class21.field394.method611(false);
                        if (var118 >= 0 && ~var119 <= -1 && var118 < 104 && ~var119 > -105) {
                            class69 var121 = class157.field2813[class47.field892][var118][var119];
                            if (var121 != null) {
                                for (class3 var122 = (class3) var121.method404(false); var122 != null; var122 = (class3) var121.method414(-127)) {
                                    if ((32767 & var120) == var122.field59) {
                                        var122.method797((byte) -93);
                                        break;
                                    }
                                }
                                if (var121.method404(false) == null) {
                                    class157.field2813[class47.field892][var118][var119] = null;
                                }
                                class136.method820(var118, var119, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(BI)I")
    private final int method1206(byte arg0, int arg1) {
        ++field3694;
        if (!this.method1268((byte) 81, arg1)) {
            return 0;
        } else {
            if (arg0 > -70) {
                this.field3709 = false;
            }
            if (super.field3832[arg1] != null) {
                return 100;
            } else {
                return this.field3697[arg1] ? 100 : class82.method457((byte) -95, this.field3691, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lpb;Lpb;IZZZ)V")
    public class190(class143 arg0, class143 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field3688 = arg0;
        this.field3691 = arg2;
        this.field3703 = arg5;
        this.field3707 = arg1;
        class122.method742(this, false, this.field3691);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)V")
    public final void method1207(int arg0, byte arg1) {
        if (arg1 <= 85) {
            this.method1211((byte) -128, 116, (byte[]) null, false, true);
        }
        ++field3698;
        if (this.method1268((byte) 81, arg0)) {
            class169.method1052(this.field3691, arg0, (byte) 57);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V")
    public final void method1208(int arg0, int arg1) {
        ++field3701;
        if (arg1 == 9803) {
            if (this.method1268((byte) 81, arg0)) {
                if (this.field3688 != null && this.field3697 != null && this.field3697[arg0]) {
                    class178.method1092(this, arg0, this.field3688, -113);
                } else {
                    class125.method759(super.field3826[arg0], this, (byte) -77, (byte) 2, arg0, true, this.field3691);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1209(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3700;
        if (class164.method982(22401, arg2)) {
            class52.method288(arg7, arg0, arg4, class149.field2670[arg2], arg3, arg5, arg6, true, -1);
            if (arg1 <= 101) {
                field3687 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "(II)Ltc;")
    public static final class180 method1210(int arg0, int arg1) {
        ++field3695;
        class180 var2 = (class180) class197.field3812.method773((long) arg0, 1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class21.field398.method1249((byte) -112, arg0, arg1);
            class180 var4 = new class180();
            if (var3 != null) {
                var4.method1098(new class97(var3), (byte) -38);
            }
            class197.field3812.method776(var4, (long) arg0, (byte) -65);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BI[BZZ)V")
    public final void method1211(byte arg0, int arg1, byte[] arg2, boolean arg3, boolean arg4) {
        int var6 = 32 % ((arg0 - -60) / 52);
        ++field3702;
        if (arg4) {
            if (this.field3709) {
                throw new RuntimeException();
            } else {
                if (this.field3707 != null) {
                    class113.method696(arg2, this.field3707, 0, this.field3691);
                }
                this.method1270(-1, arg2);
                this.method1215(-55);
            }
        } else {
            arg2[arg2.length - 2] = (byte) (super.field3841[arg1] >> 8);
            arg2[arg2.length + -1] = (byte) super.field3841[arg1];
            if (this.field3688 != null) {
                class113.method696(arg2, this.field3688, 0, arg1);
                this.field3697[arg1] = true;
            }
            if (arg3) {
                super.field3832[arg1] = class141.method873(arg2, false, false);
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(III)V")
    public final void method1212(int arg0, int arg1, int arg2) {
        this.field3682 = arg1;
        ++field3681;
        this.field3685 = arg0;
        if (arg2 != -12711) {
            this.method1211((byte) -98, -5, (byte[]) null, true, true);
        }
        if (this.field3707 == null) {
            class125.method759(this.field3682, this, (byte) -77, (byte) 0, this.field3691, true, 255);
        } else {
            class178.method1092(this, this.field3691, this.field3707, -107);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I[BLpb;ZB)V")
    public final void method1213(int arg0, byte[] arg1, class143 arg2, boolean arg3, byte arg4) {
        ++field3683;
        if (this.field3707 == arg2) {
            if (this.field3709) {
                throw new RuntimeException();
            }
            if (arg1 == null) {
                class125.method759(this.field3682, this, (byte) -77, (byte) 0, this.field3691, true, 255);
                return;
            }
            class49.field913.reset();
            class49.field913.update(arg1, 0, arg1.length);
            int var6 = (int) class49.field913.getValue();
            if (~this.field3682 != ~var6) {
                class125.method759(this.field3682, this, (byte) -77, (byte) 0, this.field3691, true, 255);
                return;
            }
            class97 var7;
            try {
                var7 = new class97(class83.method466(arg1, -1));
            } catch (RuntimeException var12) {
                class125.method759(this.field3682, this, (byte) -77, (byte) 0, this.field3691, true, 255);
                return;
            }
            int var8 = var7.method588((byte) -54);
            if (~var8 != -6 && ~var8 != -7) {
                class125.method759(this.field3682, this, (byte) -77, (byte) 0, this.field3691, true, 255);
                return;
            }
            int var9 = 0;
            if (var8 >= 6) {
                var9 = var7.method599(-16003);
            }
            if (~this.field3685 != ~var9) {
                class125.method759(this.field3682, this, (byte) -77, (byte) 0, this.field3691, true, 255);
                return;
            }
            this.method1270(-1, arg1);
            this.method1215(-61);
        } else {
            if (!arg3 && ~this.field3706 == ~arg0) {
                this.field3709 = true;
            }
            if (arg1 == null || arg1.length <= 2) {
                this.field3697[arg0] = false;
                if (this.field3703 || arg3) {
                    class125.method759(super.field3826[arg0], this, (byte) -77, (byte) 2, arg0, arg3, this.field3691);
                }
                return;
            }
            class49.field913.reset();
            class49.field913.update(arg1, 0, arg1.length - 2);
            int var10 = (int) class49.field913.getValue();
            int var11 = (65280 & arg1[arg1.length + -2] << 8) + (255 & arg1[arg1.length + -1]);
            if (~super.field3826[arg0] != ~var10 || ~super.field3841[arg0] != ~var11) {
                this.field3697[arg0] = false;
                if (this.field3703 || arg3) {
                    class125.method759(super.field3826[arg0], this, (byte) -77, (byte) 2, arg0, arg3, this.field3691);
                }
                return;
            }
            this.field3697[arg0] = true;
            if (arg3) {
                super.field3832[arg0] = class141.method873(arg1, false, false);
            }
        }
        if (arg4 <= 3) {
            this.method1208(-60, 8);
        }
    }

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "(I)I")
    public final int method1214(int arg0) {
        ++field3693;
        int var2 = 0;
        int var3 = arg0;
        for (int var4 = 0; var4 < super.field3832.length; ++var4) {
            if (~super.field3822[var4] < -1) {
                var2 += 100;
                var3 += this.method1206((byte) -93, var4);
            }
        }
        if (~var2 == -1) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "(I)V")
    private final void method1215(int arg0) {
        this.field3697 = new boolean[super.field3832.length];
        ++field3708;
        int var2 = -24 % ((28 - arg0) / 61);
        for (int var3 = 0; ~var3 > ~this.field3697.length; ++var3) {
            this.field3697[var3] = false;
        }
        if (this.field3688 == null) {
            this.field3709 = true;
        } else {
            this.field3706 = -1;
            for (int var4 = 0; ~this.field3697.length < ~var4; ++var4) {
                if (super.field3822[var4] > 0) {
                    class91.method532(1, this, this.field3688, var4);
                    this.field3706 = var4;
                }
            }
            if (this.field3706 == -1) {
                this.field3709 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "(II)V")
    public static final void method1216(int arg0, int arg1) {
        ++field3690;
        if (~arg1 != 0) {
            if (class164.method982(22401, arg1)) {
                class167[] var2 = class149.field2670[arg1];
                int var3 = 40 / ((21 - arg0) / 52);
                for (int var4 = 0; var4 < var2.length; ++var4) {
                    class167 var5 = var2[var4];
                    if (var5.field3129 != null) {
                        class5 var6 = new class5();
                        var6.field96 = var5.field3129;
                        var6.field101 = var5;
                        class155.method940(122, 2000000, var6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "(I)I")
    public final int method1217(int arg0) {
        ++field3689;
        if (arg0 != 0) {
            this.method1212(-82, -99, -78);
        }
        if (this.field3709) {
            return 100;
        } else if (super.field3832 != null) {
            return 99;
        } else {
            int var2 = class82.method457((byte) -69, 255, this.field3691);
            if (~var2 <= -101) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
    public static final void method1218(byte arg0) {
        class130.field2362.method486(true);
        if (arg0 != 106) {
            field3684 = null;
        }
        ++field3692;
        class101.field1875 = 1;
        class122.field2177 = null;
    }

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "(I)V")
    public static void method1219(int arg0) {
        field3705 = null;
        field3684 = null;
        field3687 = null;
        field3686 = null;
        field3696 = null;
        if (arg0 == -1) {
            field3704 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ltg;IIIZ)V")
    public static final void method1220(class184 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field3680;
        if (arg4) {
            method1216(29, 79);
        }
        class167 var5 = class189.method1199(arg3, true, arg1);
        if (var5 != null) {
            if (var5.field2990 != null) {
                class5 var6 = new class5();
                var6.field96 = var5.field2990;
                var6.field77 = arg0;
                var6.field93 = arg2;
                var6.field101 = var5;
                class54.method293(var6, -108);
            }
            boolean var7 = true;
            if (var5.field3101 > 0) {
                var7 = class128.method784(var5, (byte) -115);
            }
            if (var7) {
                if (class209.method1327(class188.method1191((byte) -69, var5), 102, arg2 + -1)) {
                    if (~arg2 == -2) {
                        class117.field2122.method106(177, -9);
                        class117.field2122.method580(arg3, false);
                        ++class180.field3437;
                        class117.field2122.method589((byte) -55, arg1);
                    }
                    if (~arg2 == -3) {
                        class117.field2122.method106(87, 78);
                        ++class88.field1653;
                        class117.field2122.method580(arg3, false);
                        class117.field2122.method589((byte) -48, arg1);
                    }
                    if (arg2 == 3) {
                        ++class182.field3515;
                        class117.field2122.method106(69, 84);
                        class117.field2122.method580(arg3, false);
                        class117.field2122.method589((byte) -120, arg1);
                    }
                    if (arg2 == 4) {
                        ++class60.field1123;
                        class117.field2122.method106(147, 2);
                        class117.field2122.method580(arg3, arg4);
                        class117.field2122.method589((byte) -117, arg1);
                    }
                    if (arg2 == 5) {
                        class117.field2122.method106(72, 13);
                        class117.field2122.method580(arg3, false);
                        class117.field2122.method589((byte) -72, arg1);
                        ++class145.field2623;
                    }
                    if (arg2 == 6) {
                        class117.field2122.method106(115, 0);
                        ++class161.field2896;
                        class117.field2122.method580(arg3, arg4);
                        class117.field2122.method589((byte) -54, arg1);
                    }
                    if (~arg2 == -8) {
                        ++class3.field63;
                        class117.field2122.method106(202, 60);
                        class117.field2122.method580(arg3, false);
                        class117.field2122.method589((byte) -94, arg1);
                    }
                    if (~arg2 == -9) {
                        class117.field2122.method106(116, -117);
                        ++class115.field2081;
                        class117.field2122.method580(arg3, false);
                        class117.field2122.method589((byte) -51, arg1);
                    }
                    if (~arg2 == -10) {
                        ++class50.field920;
                        class117.field2122.method106(159, -114);
                        class117.field2122.method580(arg3, false);
                        class117.field2122.method589((byte) -106, arg1);
                    }
                    if (~arg2 == -11) {
                        ++class130.field2355;
                        class117.field2122.method106(155, -123);
                        class117.field2122.method580(arg3, false);
                        class117.field2122.method589((byte) -102, arg1);
                    }
                }
            }
        }
    }
}
