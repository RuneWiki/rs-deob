import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class3 {

    @OriginalMember(owner = "client!dp", name = "p", descriptor = "Ljava/lang/String;")
    private String field39 = "null";

    @OriginalMember(owner = "client!dp", name = "r", descriptor = "Ljo;")
    public static class351 field41 = new class351(35, -1);

    @OriginalMember(owner = "client!dp", name = "t", descriptor = "Lke;")
    public static class622 field43 = new class622(95, 6);

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "C")
    public char field25;

    @OriginalMember(owner = "client!dp", name = "m", descriptor = "C")
    public char field36;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
    private int field26;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!dp", name = "i", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!dp", name = "j", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!dp", name = "k", descriptor = "I")
    private int field34;

    @OriginalMember(owner = "client!dp", name = "n", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!dp", name = "o", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!dp", name = "q", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!dp", name = "s", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!dp", name = "u", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "Ltga;")
    private class64 field28;

    @OriginalMember(owner = "client!dp", name = "l", descriptor = "Ltga;")
    public class64 field35;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IB)Ljava/lang/String;", line = 4)
    public final String method13(int arg0, byte arg1) {
        field29++;
        if (arg1 <= 42) {
            return null;
        } else if (this.field35 == null) {
            return this.field39;
        } else {
            class533 var3 = (class533) this.field35.method380((byte) -3, (long) arg0);
            return var3 == null ? this.field39 : var3.field7530;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V", line = 27)
    private final void method14(int arg0) {
        field33++;
        this.field28 = new class64(this.field35.method389(-19609));
        class633 var2 = (class633) this.field35.method382(0);
        if (arg0 != -16777216) {
            this.method21(null, 38);
        }
        while (var2 != null) {
            class633 var3 = new class633((int) var2.field7577);
            this.field28.method384((long) var2.field8932, var3, false);
            var2 = (class633) this.field35.method391(37);
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IILrv;)V", line = 51)
    private final void method15(int arg0, int arg1, class120 arg2) {
        if (arg1 == 1) {
            this.field25 = class262.method1721(arg2.method877(-252), -92);
        } else if (arg1 == 2) {
            this.field36 = class262.method1721(arg2.method877(-252), -78);
        } else if (arg1 == 3) {
            this.field39 = arg2.method861(true);
        } else if (arg1 == 4) {
            this.field34 = arg2.method871(23995);
        } else if (arg1 == 5 || arg1 == 6) {
            this.field26 = arg2.method898((byte) -103);
            this.field35 = new class64(class89.method631((byte) -98, this.field26));
            for (int var4 = 0; var4 < this.field26; var4++) {
                int var5 = arg2.method871(23995);
                class540 var6;
                if (arg1 == 5) {
                    var6 = new class533(arg2.method861(true));
                } else {
                    var6 = new class633(arg2.method871(23995));
                }
                this.field35.method384((long) var5, var6, false);
            }
        }
        int var7 = -122 % ((62 - arg0) / 33);
        field24++;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIIIII)V", line = 106)
    public static final void method16(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field38++;
        int var7 = class147.field1873;
        class595.field8379 = 0;
        int[] var8 = class568.field8045;
        for (int var9 = 0; var9 < class26.field379 + var7; var9++) {
            class279 var37 = null;
            class449 var38;
            if (var7 > var9) {
                var38 = class581.field8250[var8[var9]];
            } else {
                var38 = ((class14) class543.field7606.method380((byte) -3, (long) class790.field10846[var9 - var7])).field262;
                var37 = ((class645) var38).field9071;
                if (var37.field3943 != null) {
                    var37 = var37.method1810((byte) -102, class271.field3796);
                    if (var37 == null) {
                        continue;
                    }
                }
            }
            if (var38.field6369 >= 0 && (class327.field4890 == var38.field6419 || class251.field3549.field7710 == var38.field7710)) {
                class365.method2279(arg6 >> 1, arg3 >> 1, var38, arg0, arg1, var38.method2706(-1), 0);
                if (class632.field8926[0] >= 0) {
                    if (var38.field6362 != null && (var9 >= var7 || class417.field5880 == 0 || class417.field5880 == 3 || class417.field5880 == 1 && class29.method211(1, ((class559) var38).field7955)) && class595.field8379 < class297.field4475) {
                        class297.field4479[class595.field8379] = class33.field439.method1728(var38.field6362, 117) / 2;
                        class297.field4480[class595.field8379] = class632.field8926[0];
                        class297.field4482[class595.field8379] = class632.field8926[1];
                        class297.field4476[class595.field8379] = var38.field6386;
                        class297.field4481[class595.field8379] = var38.field6396;
                        class297.field4478[class595.field8379] = var38.field6359;
                        class297.field4477[class595.field8379] = var38.field6362;
                        class595.field8379++;
                    }
                    int var39 = arg5 + class632.field8926[1];
                    int var50;
                    if (var38.field6430 || var38.field6436 <= class673.field9441) {
                        var50 = var39 - Math.max(class33.field439.field3723, class644.field9064[0].method789());
                    } else {
                        boolean var40 = true;
                        byte var41 = 1;
                        int var42;
                        if (var7 <= var9) {
                            var42 = var37.field3927;
                            if (var42 == -1) {
                                var42 = var38.method2708(arg2 - 25755).field8575;
                            }
                        } else {
                            class559 var43 = class581.field8250[var8[var9]];
                            var42 = var38.method2708(arg2 - 25756).field8575;
                            if (var43.field7950) {
                                var41 = 2;
                            }
                        }
                        class112[] var44 = class644.field9064;
                        if (var42 != -1) {
                            class112[] var45 = (class112[]) class421.field5920.method2373((long) var42, arg2 ^ 0x6576);
                            if (var45 == null) {
                                class625[] var46 = class625.method3579(class491.field6972, var42, 0);
                                if (var46 != null) {
                                    var45 = new class112[var46.length];
                                    for (int var47 = 0; var47 < var46.length; var47++) {
                                        var45[var47] = class638.field8979.method482(var46[var47], true);
                                    }
                                    class421.field5920.method2362(var45, 0, (long) var42);
                                }
                            }
                            if (var45 != null && var45.length >= 2) {
                                var44 = var45;
                            }
                        }
                        if (var41 >= var44.length) {
                            var41 = 1;
                        }
                        class112 var48 = var44[0];
                        class112 var49 = var44[var41];
                        var50 = var39 - Math.max(class33.field439.field3723, var48.method789());
                        int var51 = class632.field8926[0] + arg4 - (var48.method777() >> 1);
                        int var52 = var48.method777() * var38.field6392 / 255;
                        int var53 = var48.method789();
                        if (var38.field6392 > 0 && var52 < 2) {
                            var52 = 2;
                        }
                        var48.method785(var51, var50);
                        class638.field8979.method453(var51, var50, var51 + var52, var50 + var53);
                        var49.method785(var51, var50);
                        class638.field8979.method455(arg4, arg5, arg4 + arg3, arg5 + arg6);
                        class651.method3726(var50, 68, var50 + var53, var51, var48.method781() + var51);
                    }
                    var50 -= 2;
                    if (!var38.field6430) {
                        if (var38.field6349 > class673.field9441) {
                            class112 var54 = class711.field10007[var38.field6428 ? 2 : 0];
                            class112 var55 = class711.field10007[var38.field6428 ? 3 : 1];
                            boolean var56 = true;
                            int var57;
                            if ((var38 instanceof class645)) {
                                var57 = var37.field3884;
                                if (var57 == -1) {
                                    var57 = var38.method2708(113).field8539;
                                }
                            } else {
                                var57 = var38.method2708(117).field8539;
                            }
                            if (var57 != -1) {
                                class112[] var58 = (class112[]) class338.field5013.method2373((long) var57, 103);
                                if (var58 == null) {
                                    class625[] var59 = class625.method3579(class491.field6972, var57, 0);
                                    if (var59 != null) {
                                        var58 = new class112[var59.length];
                                        for (int var60 = 0; var60 < var59.length; var60++) {
                                            var58[var60] = class638.field8979.method482(var59[var60], true);
                                        }
                                        class338.field5013.method2362(var58, 0, (long) var57);
                                    }
                                }
                                if (var58 != null && var58.length == 4) {
                                    var54 = var58[var38.field6428 ? 2 : 0];
                                    var55 = var58[var38.field6428 ? 3 : 1];
                                }
                            }
                            int var61 = var38.field6349 - class673.field9441;
                            int var62;
                            if (var38.field6394 >= var61) {
                                var62 = var54.method777();
                            } else {
                                int var63 = var61 - var38.field6394;
                                int var64 = var38.field6398 == 0 ? 0 : (var38.field6413 - var63) / var38.field6398 * var38.field6398;
                                var62 = var54.method777() * var64 / var38.field6413;
                            }
                            int var65 = var54.method789();
                            var50 -= var65;
                            int var66 = class632.field8926[0] + (arg4 - (var54.method777() >> 1));
                            var54.method785(var66, var50);
                            class638.field8979.method453(var66, var50, var62 + var66, var50 + var65);
                            var55.method785(var66, var50);
                            class638.field8979.method455(arg4, arg5, arg3 + arg4, arg5 + arg6);
                            class651.method3726(var50, 7, var50 + var65, var66, var66 + var54.method781());
                            var50 -= 2;
                        }
                        if (var7 > var9) {
                            class559 var67 = (class559) var38;
                            if (var67.field7968 != -1) {
                                var50 -= 25;
                                class112 var68 = class223.field3206[var67.field7968];
                                var68.method785(class632.field8926[0] + arg4 - 12, var50);
                                class651.method3726(var50, 96, var68.method792() + var50, arg4 + -12 + class632.field8926[0], class632.field8926[0] + arg4 + var68.method781() - 12);
                                var50 -= 2;
                            }
                            if (var67.field7941 != -1) {
                                var50 -= 25;
                                class112 var69 = class485.field6880[var67.field7941];
                                var69.method785(arg4 - (12 - class632.field8926[0]), var50);
                                class651.method3726(var50, 107, var50 + var69.method792(), arg4 - 12 + class632.field8926[0], arg4 + class632.field8926[0] + (-12 - -var69.method781()));
                                var50 -= 2;
                            }
                        } else if (var37.field3890 >= 0 && var37.field3890 < class485.field6880.length) {
                            var50 -= 25;
                            class112 var70 = class485.field6880[var37.field3890];
                            var70.method785(class632.field8926[0] + arg4 - (var70.method777() >> 1), var50);
                            class651.method3726(var50, arg2 ^ 0x6579, var50 + var70.method792(), arg4 - (-class632.field8926[0] + (var70.method777() >> 1)), arg4 - ((var70.method777() >> 1) - class632.field8926[0] - var70.method781()));
                            var50 -= 2;
                        }
                    }
                    int var10000;
                    if (!(var38 instanceof class559)) {
                        int var71 = 0;
                        class253[] var72 = class443.field6310;
                        for (int var73 = 0; var73 < var72.length; var73++) {
                            class253 var75 = var72[var73];
                            if (var75 != null && var75.field3558 == 1 && class790.field10846[var9 - var7] == var75.field3565) {
                                class112 var76 = class351.field5119[var75.field3560];
                                if (var76.method789() > var71) {
                                    var71 = var76.method789();
                                }
                                if ((class673.field9441 % 20) < 10) {
                                    var76.method785(arg4 + class632.field8926[0] - 12, var50 - var76.method789());
                                    class651.method3726(var50 - var76.method789(), 19, var50 - var76.method789() + var76.method792(), arg4 - -class632.field8926[0] - 12, class632.field8926[0] + arg4 + var76.method781() - 12);
                                }
                            }
                        }
                        if (var71 > 0) {
                            var10000 = var50 - (var71 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var77 = 0;
                        class253[] var78 = class443.field6310;
                        for (int var79 = 0; var79 < var78.length; var79++) {
                            class253 var81 = var78[var79];
                            if (var81 != null && var81.field3558 == 10 && var8[var9] == var81.field3565) {
                                class112 var82 = class351.field5119[var81.field3560];
                                if (var77 < var82.method789()) {
                                    var77 = var82.method789();
                                }
                                var82.method785(class632.field8926[0] + arg4 - 12, -var82.method789() + var50);
                                class651.method3726(var50 - var82.method789(), 118, var50 - var82.method789() + var82.method792(), class632.field8926[0] + arg4 - 12, class632.field8926[0] + (arg4 - (12 - var82.method781())));
                            }
                        }
                        if (var77 > 0) {
                            var10000 = var50 - (var77 + 2);
                        }
                    }
                    for (int var83 = 0; var83 < class233.field3378; var83++) {
                        int var84 = var38.field6412[var83];
                        int var85 = var38.field6421[var83];
                        class356 var86 = null;
                        int var87 = 0;
                        if (var85 >= 0) {
                            if (var84 <= class673.field9441) {
                                continue;
                            }
                            var86 = class162.field2384.method1420(arg2 ^ 0xFFFF9A90, var38.field6421[var83]);
                            var87 = var86.field5166;
                        } else if (var84 < 0) {
                            continue;
                        }
                        int var88 = var38.field6408[var83];
                        class356 var89 = null;
                        if (var88 >= 0) {
                            var89 = class162.field2384.method1420(arg2 - 25989, var88);
                        }
                        if (class673.field9441 >= (var84 - var87)) {
                            int var90 = var38.field6425[var83];
                            if (var90 >= 0) {
                                var38.field6436 = class673.field9441 + 300;
                                var38.field6392 = var90;
                                var38.field6425[var83] = -1;
                            }
                            if (var86 == null) {
                                var38.field6412[var83] = -1;
                            } else {
                                int var91 = var38.method2706(-1) / 2;
                                class365.method2279(arg6 >> 1, arg3 >> 1, var38, arg0, arg1, var91, 0);
                                if (class632.field8926[0] > -1) {
                                    class632.field8926[0] += class667.field9391[var83];
                                    class632.field8926[1] += class182.field2764[var83];
                                    Object var92 = null;
                                    Object var93 = null;
                                    Object var94 = null;
                                    Object var95 = null;
                                    int var96 = 0;
                                    int var97 = 0;
                                    int var98 = 0;
                                    int var99 = 0;
                                    int var100 = 0;
                                    int var101 = 0;
                                    int var102 = 0;
                                    int var103 = 0;
                                    class112 var104 = null;
                                    class112 var105 = null;
                                    class112 var106 = null;
                                    class112 var107 = null;
                                    int var108 = 0;
                                    int var109 = 0;
                                    int var110 = 0;
                                    int var111 = 0;
                                    int var112 = 0;
                                    int var113 = 0;
                                    int var114 = 0;
                                    int var115 = 0;
                                    int var116 = 0;
                                    class112 var117 = var86.method2237(class638.field8979, -8);
                                    if (var117 != null) {
                                        var96 = var117.method777();
                                        int var118 = var117.method789();
                                        var117.method787(class437.field6246);
                                        if (var118 > var116) {
                                            var116 = var118;
                                        }
                                        var100 = class437.field6246[0];
                                    }
                                    class112 var119 = var86.method2243(class638.field8979, arg2 ^ 0x6562);
                                    if (var119 != null) {
                                        var97 = var119.method777();
                                        int var120 = var119.method789();
                                        if (var116 < var120) {
                                            var116 = var120;
                                        }
                                        var119.method787(class437.field6246);
                                        var101 = class437.field6246[0];
                                    }
                                    class112 var121 = var86.method2240(arg2 ^ 0xFFFF9AEE, class638.field8979);
                                    if (var121 != null) {
                                        var98 = var121.method777();
                                        int var122 = var121.method789();
                                        var121.method787(class437.field6246);
                                        if (var122 > var116) {
                                            var116 = var122;
                                        }
                                        var102 = class437.field6246[0];
                                    }
                                    class112 var123 = var86.method2242(class638.field8979, 7681);
                                    if (var123 != null) {
                                        var99 = var123.method777();
                                        int var124 = var123.method789();
                                        var123.method787(class437.field6246);
                                        if (var124 > var116) {
                                            var116 = var124;
                                        }
                                        var103 = class437.field6246[0];
                                    }
                                    if (var89 != null) {
                                        var104 = var89.method2237(class638.field8979, -8);
                                        if (var104 != null) {
                                            var108 = var104.method777();
                                            int var125 = var104.method789();
                                            var104.method787(class437.field6246);
                                            if (var125 > var116) {
                                                var116 = var125;
                                            }
                                            var112 = class437.field6246[0];
                                        }
                                        var105 = var89.method2243(class638.field8979, 35);
                                        if (var105 != null) {
                                            var109 = var105.method777();
                                            int var126 = var105.method789();
                                            var105.method787(class437.field6246);
                                            if (var126 > var116) {
                                                var116 = var126;
                                            }
                                            var113 = class437.field6246[0];
                                        }
                                        var106 = var89.method2240(-1, class638.field8979);
                                        if (var106 != null) {
                                            var110 = var106.method777();
                                            int var127 = var106.method789();
                                            if (var116 < var127) {
                                                var116 = var127;
                                            }
                                            var106.method787(class437.field6246);
                                            var114 = class437.field6246[0];
                                        }
                                        var107 = var89.method2242(class638.field8979, 7681);
                                        if (var107 != null) {
                                            var111 = var107.method777();
                                            int var128 = var107.method789();
                                            var107.method787(class437.field6246);
                                            if (var116 < var128) {
                                                var116 = var128;
                                            }
                                            var115 = class437.field6246[0];
                                        }
                                    }
                                    class67 var129 = class79.field1047;
                                    class67 var130 = class79.field1047;
                                    class263 var131 = class408.field5763;
                                    int var132 = var86.field5175;
                                    class263 var133 = class408.field5763;
                                    if (var132 >= 0) {
                                        class67 var134 = class441.method2663(1, var132, class638.field8979, true);
                                        class263 var135 = class514.method2995(arg2 ^ 0x6511, class638.field8979, var132);
                                        if (var134 != null && var135 != null) {
                                            var131 = var135;
                                            var129 = var134;
                                        }
                                    }
                                    if (var89 != null) {
                                        int var136 = var89.field5175;
                                        if (var136 >= 0) {
                                            class67 var137 = class441.method2663(1, var136, class638.field8979, true);
                                            class263 var138 = class514.method2995(0, class638.field8979, var136);
                                            if (var137 != null && var138 != null) {
                                                var130 = var137;
                                                var133 = var138;
                                            }
                                        }
                                    }
                                    Object var139 = null;
                                    String var140 = null;
                                    boolean var141 = false;
                                    int var142 = 0;
                                    String var143 = var86.method2245((byte) 81, var38.field6367[var83]);
                                    int var144 = var131.method1728(var143, -76);
                                    if (var89 != null) {
                                        var140 = var89.method2245((byte) 106, var38.field6376[var83]);
                                        var142 = var133.method1728(var140, 117);
                                    }
                                    int var145 = 0;
                                    if (var97 > 0) {
                                        var145 = var144 / var97 + 1;
                                    }
                                    int var146 = 0;
                                    if (var89 != null && var109 > 0) {
                                        var146 = var142 / var109 + 1;
                                    }
                                    int var147 = 0;
                                    int var148 = var147;
                                    if (var96 > 0) {
                                        var147 += var96;
                                    }
                                    var147 += 2;
                                    int var149 = var147;
                                    if (var98 > 0) {
                                        var147 += var98;
                                    }
                                    int var150 = var147;
                                    int var151 = var147;
                                    int var152;
                                    if (var97 <= 0) {
                                        var152 = var144 + var147;
                                    } else {
                                        int var153 = var97 * var145;
                                        var151 = (var153 - var144) / 2 + var147;
                                        var152 = var147 + var153;
                                    }
                                    int var154 = var152;
                                    if (var99 > 0) {
                                        var152 += var99;
                                    }
                                    int var155 = 0;
                                    int var156 = 0;
                                    int var157 = 0;
                                    int var158 = 0;
                                    int var159 = 0;
                                    if (var89 != null) {
                                        var152 += 2;
                                        var155 = var152;
                                        if (var108 > 0) {
                                            var152 += var108;
                                        }
                                        var152 += 2;
                                        var156 = var152;
                                        if (var110 > 0) {
                                            var152 += var110;
                                        }
                                        var157 = var152;
                                        var159 = var152;
                                        if (var109 <= 0) {
                                            var152 += var142;
                                        } else {
                                            int var160 = var109 * var146;
                                            var159 = (var160 - var142) / 2 + var152;
                                            var152 += var160;
                                        }
                                        var158 = var152;
                                        if (var111 > 0) {
                                            var152 += var111;
                                        }
                                    }
                                    int var161 = var38.field6412[var83] - class673.field9441;
                                    int var162 = var86.field5184 - (var86.field5184 * var161 / var86.field5166);
                                    int var163 = var86.field5187 * var161 / var86.field5166 - var86.field5187;
                                    int var164 = class632.field8926[0] + arg4 + var162 - (var152 >> 1);
                                    int var165 = arg5 - (-class632.field8926[1] - var163) - 12;
                                    int var166 = var165;
                                    int var167 = var116 + var165;
                                    int var168 = var86.field5172 + var165 + 15;
                                    int var169 = var168 - var131.field3723;
                                    if (var169 < var165) {
                                        var166 = var169;
                                    }
                                    int var170 = var131.field3724 + var168;
                                    if (var167 < var170) {
                                        var167 = var170;
                                    }
                                    int var171 = 0;
                                    if (var89 != null) {
                                        var171 = var165 + var89.field5172 + 15;
                                        int var172 = var171 - var133.field3723;
                                        if (var172 < var166) {
                                            var166 = var172;
                                        }
                                        int var173 = var171 + var133.field3724;
                                        if (var167 < var173) {
                                            var167 = var173;
                                        }
                                    }
                                    int var174 = 255;
                                    if (var86.field5180 >= 0) {
                                        var174 = (var161 << 8) / (var86.field5166 - var86.field5180);
                                    }
                                    if (var174 >= 0 && var174 < 255) {
                                        int var175 = var174 << 24;
                                        int var176 = var175 | 0xFFFFFF;
                                        if (var117 != null) {
                                            var117.method795(var164 + var148 - var100, var165, 0, var176, 1);
                                        }
                                        if (var121 != null) {
                                            var121.method795(var164 - (var102 - var149), var165, 0, var176, 1);
                                        }
                                        if (var119 != null) {
                                            for (int var177 = 0; var177 < var145; var177++) {
                                                var119.method795(var97 * var177 + var150 + var164 - var101, var165, 0, var176, 1);
                                            }
                                        }
                                        if (var123 != null) {
                                            var123.method795(var154 + var164 - var103, var165, 0, var176, 1);
                                        }
                                        var129.method529(var168, var143, (byte) -91, var151 + var164, 0, var86.field5188 | var175);
                                        if (var89 != null) {
                                            if (var104 != null) {
                                                var104.method795(var164 + var155 - var112, var165, 0, var176, 1);
                                            }
                                            if (var106 != null) {
                                                var106.method795(var164 + var156 - var114, var165, 0, var176, 1);
                                            }
                                            if (var105 != null) {
                                                for (int var178 = 0; var178 < var146; var178++) {
                                                    var105.method795(var109 * var178 + (var157 + var164 - var113), var165, 0, var176, 1);
                                                }
                                            }
                                            if (var107 != null) {
                                                var107.method795(var158 + var164 - var115, var165, 0, var176, 1);
                                            }
                                            var130.method529(var171, var140, (byte) -61, var159 + var164, 0, var175 | var89.field5188);
                                        }
                                    } else {
                                        if (var117 != null) {
                                            var117.method785(var148 + var164 - var100, var165);
                                        }
                                        if (var121 != null) {
                                            var121.method785(var149 + var164 - var102, var165);
                                        }
                                        if (var119 != null) {
                                            for (int var179 = 0; var179 < var145; var179++) {
                                                var119.method785(var97 * var179 + var164 + var150 - var101, var165);
                                            }
                                        }
                                        if (var123 != null) {
                                            var123.method785(var164 + var154 - var103, var165);
                                        }
                                        var129.method529(var168, var143, (byte) -124, var151 + var164, 0, var86.field5188 | 0xFF000000);
                                        if (var89 != null) {
                                            if (var104 != null) {
                                                var104.method785(var155 + var164 - var112, var165);
                                            }
                                            if (var106 != null) {
                                                var106.method785(var164 + var156 - var114, var165);
                                            }
                                            if (var105 != null) {
                                                for (int var180 = 0; var180 < var146; var180++) {
                                                    var105.method785(var109 * var180 + var164 + var157 - var113, var165);
                                                }
                                            }
                                            if (var107 != null) {
                                                var107.method785(var164 + var158 - var115, var165);
                                            }
                                            var130.method529(var171, var140, (byte) -86, var159 + var164, 0, var89.field5188 | 0xFF000000);
                                        }
                                    }
                                    class651.method3726(var166, arg2 - 25773, var167 - -1, var164, var164 + var152);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < class218.field3119; var10++) {
            int var33 = class685.field9722[var10];
            class449 var34;
            if (var33 >= 2048) {
                var34 = ((class14) class543.field7606.method380((byte) -3, (long) (var33 - 2048))).field262;
            } else {
                var34 = class581.field8250[var33];
            }
            int var35 = class464.field6625[var10];
            class449 var36;
            if (var35 < 2048) {
                var36 = class581.field8250[var35];
            } else {
                var36 = ((class14) class543.field7606.method380((byte) -3, (long) (var35 - 2048))).field262;
            }
            class162.method1276(arg0, var34, arg4, -126, arg6, arg5, var36, arg3, --var34.field6407, arg1);
        }
        int var11 = class33.field439.field3723 + class33.field439.field3724 + 2;
        if (arg2 != 25873) {
            field41 = null;
        }
        for (int var12 = 0; var12 < class595.field8379; var12++) {
            int var13 = class297.field4480[var12];
            int var14 = class297.field4482[var12];
            int var15 = class297.field4479[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var32 = 0; var32 < var12; var32++) {
                    if ((var14 + 2) > (class297.field4482[var32] - var11) && (class297.field4482[var32] + 2) > (var14 - var11) && (class297.field4480[var32] + class297.field4479[var32]) > (var13 - var15) && class297.field4480[var32] - class297.field4479[var32] < var13 + var15 && (class297.field4482[var32] - var11) < var14) {
                        var16 = true;
                        var14 = class297.field4482[var32] - var11;
                    }
                }
            }
            class297.field4482[var12] = var14;
            String var17 = class297.field4477[var12];
            int var18 = class33.field439.method1728(var17, 125);
            int var19 = arg4 + var13;
            int var20 = arg5 + var14 - class33.field439.field3723;
            int var21 = var18 + var19;
            int var22 = arg5 + var14 + class33.field439.field3724;
            if (class101.field1276 == 0) {
                int var23 = 16776960;
                if (class297.field4476[var12] < 6) {
                    var23 = class519.field7424[class297.field4476[var12]];
                }
                if (class297.field4476[var12] == 6) {
                    var23 = class327.field4890 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class297.field4476[var12] == 7) {
                    var23 = class327.field4890 % 20 >= 10 ? 65535 : 255;
                }
                if (class297.field4476[var12] == 8) {
                    var23 = class327.field4890 % 20 < 10 ? 45056 : 8454016;
                }
                if (class297.field4476[var12] == 9) {
                    int var24 = 150 - class297.field4478[var12];
                    if (var24 < 50) {
                        var23 = (var24 * 1280) + 16711680;
                    } else if (var24 < 100) {
                        var23 = 33160960 - var24 * 327680;
                    } else if (var24 < 150) {
                        var23 = var24 * 5 + 65280 - 500;
                    }
                }
                if (class297.field4476[var12] == 10) {
                    int var25 = 150 - class297.field4478[var12];
                    if (var25 < 50) {
                        var23 = var25 * 5 + 16711680;
                    } else if (var25 < 100) {
                        var23 = 16711935 - (var25 - 50) * 327680;
                    } else if (var25 < 150) {
                        var23 = (var25 - 100) * 327680 + 255 - (var25 + -100) * 5;
                    }
                }
                if (class297.field4476[var12] == 11) {
                    int var26 = 150 - class297.field4478[var12];
                    if (var26 < 50) {
                        var23 = 16777215 - (var26 * 327685);
                    } else if (var26 < 100) {
                        var23 = var26 * 327685 + 65280 - 16384250;
                    } else if (var26 < 150) {
                        var23 = 16777215 - (var26 - 100) * 327680;
                    }
                }
                int var27 = var23 | 0xFF000000;
                if (class297.field4481[var12] == 0) {
                    class546.field7704.method523(var27, arg4 + var13, var17, arg5 + var14, true, -16777216);
                    var21 -= var18 >> 1;
                    var19 -= var18 >> 1;
                }
                if (class297.field4481[var12] == 1) {
                    var21 -= var18 >> 1;
                    var19 -= var18 >> 1;
                    var22 += 5;
                    var20 -= 5;
                    class546.field7704.method525(class327.field4890, arg5 + var14, var27, arg4 + var13, var17, -16777216, 0);
                }
                if (class297.field4481[var12] == 2) {
                    var20 -= 5;
                    var21 -= (var18 >> 1) - 5;
                    var19 -= (var18 >> 1) + 5;
                    class546.field7704.method518(var27, 7596, -16777216, arg5 + var14, var17, class327.field4890, arg4 + var13);
                    var22 += 5;
                }
                if (class297.field4481[var12] == 3) {
                    class546.field7704.method514(var17, arg5 + var14, var27, -16777216, class327.field4890, 150 - class297.field4478[var12], arg4 + var13, (byte) 54);
                    var22 += 7;
                    var21 -= var18 >> 1;
                    var20 -= 7;
                    var19 -= var18 >> 1;
                }
                if (class297.field4481[var12] == 4) {
                    int var28 = (150 - class297.field4478[var12]) * (class33.field439.method1728(var17, -96) + 100) / 150;
                    class638.field8979.method453(var13 + arg4 - 50, arg5, arg4 + var13 + 50, arg5 + arg6);
                    class546.field7704.method529(arg5 + var14, var17, (byte) -44, arg4 + var13 + 50 - var28, -16777216, var27);
                    var19 += 50 - var28;
                    var21 += 50 - var28;
                    class638.field8979.method455(arg4, arg5, arg3 + arg4, arg5 - -arg6);
                }
                if (class297.field4481[var12] == 5) {
                    int var29 = 150 - class297.field4478[var12];
                    int var30 = 0;
                    if (var29 < 25) {
                        var30 = var29 - 25;
                    } else if (var29 > 125) {
                        var30 = var29 - 125;
                    }
                    int var31 = class33.field439.field3724 + class33.field439.field3723;
                    class638.field8979.method453(arg4, arg5 + var14 - var31 - 1, arg3 + arg4, arg5 + var14 + 5);
                    var22 += var30;
                    class546.field7704.method523(var27, arg4 + var13, var17, arg5 - (-var14 - var30), true, -16777216);
                    var19 -= var18 >> 1;
                    var20 += var30;
                    var21 -= var18 >> 1;
                    class638.field8979.method455(arg4, arg5, arg3 + arg4, arg5 + arg6);
                }
            } else {
                class546.field7704.method523(-256, arg4 + var13, var17, arg5 + var14, true, -16777216);
                var21 -= var18 >> 1;
                var19 -= var18 >> 1;
            }
            class651.method3726(var20, 96, var22 + 1, var19, var21 + 1);
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(BI)I", line = 1257)
    public final int method17(byte arg0, int arg1) {
        field32++;
        if (this.field35 == null) {
            return this.field34;
        }
        class633 var3 = (class633) this.field35.method380((byte) -3, (long) arg1);
        if (var3 == null) {
            return this.field34;
        } else if (arg0 >= -51) {
            return -106;
        } else {
            return var3.field8932;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZLjava/lang/String;)Z", line = 1280)
    public final boolean method18(boolean arg0, String arg1) {
        field40++;
        if (this.field35 == null) {
            return false;
        }
        if (this.field28 == null) {
            this.method19(5);
        }
        if (!arg0) {
            this.field26 = 73;
        }
        for (class637 var3 = (class637) this.field28.method380((byte) -3, class66.method491(arg1, false)); var3 != null; var3 = (class637) this.field28.method383(-1)) {
            if (var3.field8964.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)V", line = 1310)
    private final void method19(int arg0) {
        if (arg0 != 5) {
            return;
        }
        this.field28 = new class64(this.field35.method389(arg0 - 19614));
        field31++;
        for (class533 var2 = (class533) this.field35.method382(arg0 - 5); var2 != null; var2 = (class533) this.field35.method391(37)) {
            class637 var3 = new class637(var2.field7530, (int) var2.field7577);
            this.field28.method384(class66.method491(var2.field7530, false), var3, false);
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Z)V", line = 1333)
    public static final void method20(boolean arg0) {
        field27++;
        int var1 = 0;
        if (!arg0) {
            method20(true);
        }
        for (int var2 = 0; var2 < class109.field1314; var2++) {
            for (int var3 = 0; var3 < class760.field10479; var3++) {
                if (class231.method1604(var1, var3, true, -19739, class378.field5427, var2)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lrv;I)V", line = 1368)
    public final void method21(class120 arg0, int arg1) {
        field37++;
        while (true) {
            int var3 = arg0.method842(arg1 + 2385);
            if (var3 == 0) {
                if (arg1 == -1) {
                    return;
                } else {
                    this.method19(-115);
                    return;
                }
            }
            this.method15(-1, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "(I)V", line = 1394)
    public static void method22(int arg0) {
        if (arg0 >= -4) {
            field43 = null;
        }
        field43 = null;
        field41 = null;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IZ)Z", line = 1408)
    public final boolean method23(int arg0, boolean arg1) {
        field30++;
        if (this.field35 == null) {
            return false;
        }
        if (this.field28 == null) {
            this.method14(-16777216);
        }
        class633 var3 = (class633) this.field28.method380((byte) -3, (long) arg0);
        if (!arg1) {
            this.field34 = 5;
        }
        return var3 != null;
    }

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "(I)V", line = 1440)
    public static final void method24(int arg0) {
        field42++;
        int var1 = class147.field1873;
        int[] var2 = class568.field8045;
        if (arg0 != -13847) {
            field43 = null;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            class559 var9 = class581.field8250[var2[var3]];
            if (var9 != null && var9.field6359 > 0) {
                var9.field6359--;
                if (var9.field6359 == 0) {
                    var9.field6362 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class26.field379; var4++) {
            long var5 = (long) class790.field10846[var4];
            class14 var7 = (class14) class543.field7606.method380((byte) -3, var5);
            if (var7 != null) {
                class645 var8 = var7.field262;
                if (var8.field6359 > 0) {
                    var8.field6359--;
                    if (var8.field6359 == 0) {
                        var8.field6362 = null;
                    }
                }
            }
        }
    }
}
