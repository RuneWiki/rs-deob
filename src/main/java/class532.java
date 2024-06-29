import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class532 implements Runnable {

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "I")
    private int field7648 = 0;

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "I")
    private int field7657 = 0;

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "I")
    private int field7651;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "Ljava/io/InputStream;")
    private InputStream field7643;

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "[B")
    private byte[] field7652;

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "Ljava/lang/Thread;")
    private Thread field7649;

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "Ltm;")
    public static class334 field7654 = new class334(11, -2);

    @OriginalMember(owner = "client!mm", name = "q", descriptor = "Lib;")
    public static class1 field7658;

    @OriginalMember(owner = "client!mm", name = "r", descriptor = "Lib;")
    public static class1 field7659 = field7658 = new class1(false);

    @OriginalMember(owner = "client!mm", name = "t", descriptor = "[[I")
    public static int[][] field7661 = new int[128][128];

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public static int field7642;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    public static int field7644;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public static int field7645;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    public static int field7646;

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "I")
    public static int field7650;

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "I")
    public static int field7653;

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "I")
    public static int field7655;

    @OriginalMember(owner = "client!mm", name = "o", descriptor = "I")
    public static int field7656;

    @OriginalMember(owner = "client!mm", name = "u", descriptor = "Lla;")
    public static class422 field7662;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "Ljava/io/IOException;")
    private IOException field7647;

    @OriginalMember(owner = "client!mm", name = "s", descriptor = "Z")
    public static boolean field7660;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V", line = 3)
    public final void method3144(int arg0) {
        if (arg0 != 7) {
            this.method3148(-91);
        }
        synchronized (this) {
            if (this.field7647 == null) {
                this.field7647 = new IOException("");
            }
            this.notifyAll();
        }
        field7642++;
        try {
            this.field7649.join();
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIIIIZ)V", line = 26)
    public static final void method3145(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field7655++;
        if (arg6) {
            method3149(-127, 64, true, false, -5);
        }
        int var7 = class472.field6857;
        class343.field5076 = 0;
        int[] var8 = class96.field1419;
        for (int var9 = 0; var9 < (class356.field5394 + var7); var9++) {
            class504 var37 = null;
            class109 var38;
            if (var9 < var7) {
                var38 = class279.field4271[var8[var9]];
            } else {
                var38 = ((class53) class332.field4881.method3512(true, (long) class45.field758[var9 - var7])).field847;
                var37 = ((class461) var38).field6688;
                if (var37.field7308 != null) {
                    var37 = var37.method3046(99, class422.field6216);
                    if (var37 == null) {
                        continue;
                    }
                }
            }
            if (var38.field1676 >= 0 && (class475.field6901 == var38.field1631 || class145.field2251.field9470 == var38.field9470)) {
                class259.method1737(arg4, arg3 >> 1, var38.method883((byte) -100), var38, arg2 >> 1, 24906, arg1);
                if (class457.field6635[0] >= 0) {
                    if (var38.field1633 != null && (var9 >= var7 || class732.field10290 == 0 || class732.field10290 == 3 || class732.field10290 == 1 && class113.method912(34166, ((class573) var38).field8146)) && class85.field1260 > class343.field5076) {
                        class85.field1256[class343.field5076] = class632.field8881.method510(var38.field1633, 174) / 2;
                        class85.field1254[class343.field5076] = class457.field6635[0];
                        class85.field1259[class343.field5076] = class457.field6635[1];
                        class85.field1257[class343.field5076] = var38.field1646;
                        class85.field1248[class343.field5076] = var38.field1643;
                        class85.field1250[class343.field5076] = var38.field1665;
                        class85.field1249[class343.field5076] = var38.field1633;
                        class343.field5076++;
                    }
                    int var39 = class457.field6635[1] + arg5;
                    int var50;
                    if (var38.field1630 || var38.field1691 <= class199.field3403) {
                        var50 = var39 - Math.max(class632.field8881.field858, class460.field6671[0].method179());
                    } else {
                        boolean var40 = true;
                        byte var41 = 1;
                        int var43;
                        if (var7 > var9) {
                            class573 var42 = class279.field4271[var8[var9]];
                            var43 = var38.method885(99).field3673;
                            if (var42.field8133) {
                                var41 = 2;
                            }
                        } else {
                            var43 = var37.field7349;
                            if (var43 == -1) {
                                var43 = var38.method885(126).field3673;
                            }
                        }
                        class34[] var44 = class460.field6671;
                        if (var43 != -1) {
                            class34[] var45 = (class34[]) class453.field6589.method80((byte) -62, (long) var43);
                            if (var45 == null) {
                                class726[] var46 = class726.method4006(class101.field1494, var43, 0);
                                if (var46 != null) {
                                    var45 = new class34[var46.length];
                                    for (int var47 = 0; var47 < var46.length; var47++) {
                                        var45[var47] = class364.field5573.method310(var46[var47], true);
                                    }
                                    class453.field6589.method67((long) var43, var45, -6772);
                                }
                            }
                            if (var45 != null && var45.length >= 2) {
                                var44 = var45;
                            }
                        }
                        if (var41 >= var44.length) {
                            var41 = 1;
                        }
                        class34 var48 = var44[0];
                        class34 var49 = var44[var41];
                        var50 = var39 - Math.max(class632.field8881.field858, var48.method179());
                        int var51 = arg0 + (class457.field6635[0] - (var48.method175() >> 1));
                        int var52 = var48.method175() * var38.field1613 / 255;
                        int var53 = var48.method179();
                        if (var38.field1613 > 0 && var52 < 2) {
                            var52 = 2;
                        }
                        var48.method182(var51, var50);
                        class364.field5573.method298(var51, var50, var51 + var52, var50 - -var53);
                        var49.method182(var51, var50);
                        class364.field5573.method240(arg0, arg5, arg0 + arg2, arg3 + arg5);
                        class438.method2696(var50, var50 + var53, var48.method177() + var51, (byte) 76, var51);
                    }
                    var50 -= 2;
                    if (!var38.field1630) {
                        if (var38.field1621 > class199.field3403) {
                            class34 var54 = class140.field2197[var38.field1675 ? 2 : 0];
                            class34 var55 = class140.field2197[var38.field1675 ? 3 : 1];
                            boolean var56 = true;
                            int var57;
                            if ((var38 instanceof class461)) {
                                var57 = var37.field7316;
                                if (var57 == -1) {
                                    var57 = var38.method885(98).field3677;
                                }
                            } else {
                                var57 = var38.method885(121).field3677;
                            }
                            if (var57 != -1) {
                                class34[] var58 = (class34[]) class341.field5052.method80((byte) -26, (long) var57);
                                if (var58 == null) {
                                    class726[] var59 = class726.method4006(class101.field1494, var57, 0);
                                    if (var59 != null) {
                                        var58 = new class34[var59.length];
                                        for (int var60 = 0; var60 < var59.length; var60++) {
                                            var58[var60] = class364.field5573.method310(var59[var60], true);
                                        }
                                        class341.field5052.method67((long) var57, var58, -6772);
                                    }
                                }
                                if (var58 != null && var58.length == 4) {
                                    var55 = var58[var38.field1675 ? 3 : 1];
                                    var54 = var58[var38.field1675 ? 2 : 0];
                                }
                            }
                            int var61 = var38.field1621 - class199.field3403;
                            int var62;
                            if (var61 <= var38.field1622) {
                                var62 = var54.method175();
                            } else {
                                int var63 = var61 - var38.field1622;
                                int var64 = var38.field1602 == 0 ? 0 : (var38.field1590 - var63) / var38.field1602 * var38.field1602;
                                var62 = var64 * var54.method175() / var38.field1590;
                            }
                            int var65 = var54.method179();
                            var50 -= var65;
                            int var66 = class457.field6635[0] + arg0 - (var54.method175() >> 1);
                            var54.method182(var66, var50);
                            class364.field5573.method298(var66, var50, var62 + var66, var50 + var65);
                            var55.method182(var66, var50);
                            class364.field5573.method240(arg0, arg5, arg0 + arg2, arg3 + arg5);
                            class438.method2696(var50, var50 + var65, var66 + var54.method177(), (byte) 91, var66);
                            var50 -= 2;
                        }
                        if (var7 > var9) {
                            class573 var67 = (class573) var38;
                            if (var67.field8131 != -1) {
                                var50 -= 25;
                                class34 var68 = class567.field8049[var67.field8131];
                                var68.method182(arg0 + class457.field6635[0] - 12, var50);
                                class438.method2696(var50, var50 + var68.method184(), class457.field6635[0] + arg0 - (12 - var68.method177()), (byte) 120, arg0 + class457.field6635[0] - 12);
                                var50 -= 2;
                            }
                            if (var67.field8110 != -1) {
                                var50 -= 25;
                                class34 var69 = class577.field8171[var67.field8110];
                                var69.method182(class457.field6635[0] + arg0 - 12, var50);
                                class438.method2696(var50, var69.method184() + var50, class457.field6635[0] + -12 + arg0 + var69.method177(), (byte) 98, class457.field6635[0] + arg0 - 12);
                                var50 -= 2;
                            }
                        } else if (var37.field7304 >= 0 && var37.field7304 < class577.field8171.length) {
                            class34 var70 = class577.field8171[var37.field7304];
                            var50 -= 25;
                            var70.method182(arg0 - ((var70.method175() >> 1) - class457.field6635[0]), var50);
                            class438.method2696(var50, var50 + var70.method184(), arg0 - (-class457.field6635[0] + (var70.method175() >> 1) + -var70.method177()), (byte) 119, class457.field6635[0] + (arg0 - (var70.method175() >> 1)));
                            var50 -= 2;
                        }
                    }
                    int var10000;
                    if (!(var38 instanceof class573)) {
                        int var71 = 0;
                        class251[] var72 = class541.field7732;
                        for (int var73 = 0; var73 < var72.length; var73++) {
                            class251 var75 = var72[var73];
                            if (var75 != null && var75.field3993 == 1 && class45.field758[var9 - var7] == var75.field3990) {
                                class34 var76 = class466.field6800[var75.field3991];
                                if (var71 < var76.method179()) {
                                    var71 = var76.method179();
                                }
                                if ((class199.field3403 % 20) < 10) {
                                    var76.method182(class457.field6635[0] + arg0 - 12, var50 + -var76.method179());
                                    class438.method2696(var50 - var76.method179(), -var76.method179() + var50 - -var76.method184(), class457.field6635[0] + (arg0 + var76.method177()) - 12, (byte) 125, class457.field6635[0] + arg0 - 12);
                                }
                            }
                        }
                        if (var71 > 0) {
                            var10000 = var50 - (var71 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var77 = 0;
                        class251[] var78 = class541.field7732;
                        for (int var79 = 0; var79 < var78.length; var79++) {
                            class251 var81 = var78[var79];
                            if (var81 != null && var81.field3993 == 10 && var8[var9] == var81.field3990) {
                                class34 var82 = class466.field6800[var81.field3991];
                                if (var77 < var82.method179()) {
                                    var77 = var82.method179();
                                }
                                var82.method182(class457.field6635[0] + arg0 - 12, -var82.method179() + var50);
                                class438.method2696(var50 - var82.method179(), var50 + -var82.method179() + var82.method184(), class457.field6635[0] + (arg0 - (12 - var82.method177())), (byte) 83, class457.field6635[0] + arg0 - 12);
                            }
                        }
                        if (var77 > 0) {
                            var10000 = var50 - (var77 + 2);
                        }
                    }
                    for (int var83 = 0; var83 < class54.field852; var83++) {
                        int var84 = var38.field1667[var83];
                        int var85 = var38.field1668[var83];
                        class160 var86 = null;
                        int var87 = 0;
                        if (var85 >= 0) {
                            if (var84 <= class199.field3403) {
                                continue;
                            }
                            var86 = class430.field6290.method3994((byte) -9, var38.field1668[var83]);
                            var87 = var86.field2483;
                        } else if (var84 < 0) {
                            continue;
                        }
                        int var88 = var38.field1610[var83];
                        class160 var89 = null;
                        if (var88 >= 0) {
                            var89 = class430.field6290.method3994((byte) -9, var88);
                        }
                        if (class199.field3403 >= (var84 - var87)) {
                            int var90 = var38.field1696[var83];
                            if (var90 >= 0) {
                                var38.field1691 = class199.field3403 + 300;
                                var38.field1613 = var90;
                                var38.field1696[var83] = -1;
                            }
                            if (var86 == null) {
                                var38.field1667[var83] = -1;
                            } else {
                                int var91 = var38.method883((byte) 103) / 2;
                                class259.method1737(arg4, arg3 >> 1, var91, var38, arg2 >> 1, 24906, arg1);
                                if (class457.field6635[0] > -1) {
                                    class457.field6635[0] += class75.field1109[var83];
                                    class457.field6635[1] += class455.field6628[var83];
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
                                    class34 var104 = null;
                                    class34 var105 = null;
                                    class34 var106 = null;
                                    class34 var107 = null;
                                    int var108 = 0;
                                    int var109 = 0;
                                    int var110 = 0;
                                    int var111 = 0;
                                    int var112 = 0;
                                    int var113 = 0;
                                    int var114 = 0;
                                    int var115 = 0;
                                    class34 var116 = var86.method1193(class364.field5573, -114);
                                    int var117 = 0;
                                    if (var116 != null) {
                                        var96 = var116.method175();
                                        int var118 = var116.method179();
                                        if (var117 < var118) {
                                            var117 = var118;
                                        }
                                        var116.method186(class222.field3615);
                                        var100 = class222.field3615[0];
                                    }
                                    class34 var119 = var86.method1190(class364.field5573, (byte) 46);
                                    if (var119 != null) {
                                        var97 = var119.method175();
                                        int var120 = var119.method179();
                                        var119.method186(class222.field3615);
                                        if (var117 < var120) {
                                            var117 = var120;
                                        }
                                        var101 = class222.field3615[0];
                                    }
                                    class34 var121 = var86.method1192(class364.field5573, (byte) 116);
                                    if (var121 != null) {
                                        var98 = var121.method175();
                                        int var122 = var121.method179();
                                        var121.method186(class222.field3615);
                                        if (var117 < var122) {
                                            var117 = var122;
                                        }
                                        var102 = class222.field3615[0];
                                    }
                                    class34 var123 = var86.method1191(class364.field5573, (byte) -114);
                                    if (var123 != null) {
                                        var99 = var123.method175();
                                        int var124 = var123.method179();
                                        var123.method186(class222.field3615);
                                        if (var124 > var117) {
                                            var117 = var124;
                                        }
                                        var103 = class222.field3615[0];
                                    }
                                    if (var89 != null) {
                                        var104 = var89.method1193(class364.field5573, -68);
                                        if (var104 != null) {
                                            var108 = var104.method175();
                                            int var125 = var104.method179();
                                            var104.method186(class222.field3615);
                                            if (var117 < var125) {
                                                var117 = var125;
                                            }
                                            var112 = class222.field3615[0];
                                        }
                                        var105 = var89.method1190(class364.field5573, (byte) 83);
                                        if (var105 != null) {
                                            var109 = var105.method175();
                                            int var126 = var105.method179();
                                            var105.method186(class222.field3615);
                                            if (var126 > var117) {
                                                var117 = var126;
                                            }
                                            var113 = class222.field3615[0];
                                        }
                                        var106 = var89.method1192(class364.field5573, (byte) 116);
                                        if (var106 != null) {
                                            var110 = var106.method175();
                                            int var127 = var106.method179();
                                            var106.method186(class222.field3615);
                                            if (var127 > var117) {
                                                var117 = var127;
                                            }
                                            var114 = class222.field3615[0];
                                        }
                                        var107 = var89.method1191(class364.field5573, (byte) -114);
                                        if (var107 != null) {
                                            var111 = var107.method175();
                                            int var128 = var107.method179();
                                            var107.method186(class222.field3615);
                                            if (var117 < var128) {
                                                var117 = var128;
                                            }
                                            var115 = class222.field3615[0];
                                        }
                                    }
                                    class400 var129 = class236.field3788;
                                    class400 var130 = class236.field3788;
                                    class54 var131 = class570.field8090;
                                    int var132 = var86.field2494;
                                    class54 var133 = class570.field8090;
                                    if (var132 >= 0) {
                                        class400 var134 = class702.method3896(-86, var132, class364.field5573, true);
                                        class54 var135 = class723.method3988(-29123, class364.field5573, var132);
                                        if (var134 != null && var135 != null) {
                                            var129 = var134;
                                            var131 = var135;
                                        }
                                    }
                                    if (var89 != null) {
                                        int var136 = var89.field2494;
                                        if (var136 >= 0) {
                                            class400 var137 = class702.method3896(-77, var136, class364.field5573, true);
                                            class54 var138 = class723.method3988(-29123, class364.field5573, var136);
                                            if (var137 != null && var138 != null) {
                                                var133 = var138;
                                                var130 = var137;
                                            }
                                        }
                                    }
                                    Object var139 = null;
                                    String var140 = null;
                                    boolean var141 = false;
                                    String var142 = var86.method1196(var38.field1692[var83], -115);
                                    int var143 = 0;
                                    int var144 = var131.method510(var142, 174);
                                    if (var89 != null) {
                                        var140 = var89.method1196(var38.field1657[var83], 114);
                                        var143 = var133.method510(var140, 174);
                                    }
                                    int var145 = 0;
                                    int var146 = 0;
                                    if (var97 > 0) {
                                        var145 = var144 / var97 + 1;
                                    }
                                    if (var89 != null && var109 > 0) {
                                        var146 = var143 / var109 + 1;
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
                                        var159 = var152;
                                        var157 = var152;
                                        if (var109 > 0) {
                                            int var160 = var109 * var146;
                                            var152 += var160;
                                            var159 += (var160 - var143) / 2;
                                        } else {
                                            var152 += var143;
                                        }
                                        var158 = var152;
                                        if (var111 > 0) {
                                            var152 += var111;
                                        }
                                    }
                                    int var161 = var38.field1667[var83] - class199.field3403;
                                    int var162 = var86.field2502 - (var86.field2502 * var161 / var86.field2483);
                                    int var163 = (var86.field2492 * var161 / var86.field2483) - var86.field2492;
                                    int var164 = arg0 + class457.field6635[0] + var162 - (var152 >> 1);
                                    int var165 = class457.field6635[1] + arg5 + var163 - 12;
                                    int var166 = var165;
                                    int var167 = var117 + var165;
                                    int var168 = var165 + var86.field2504 + 15;
                                    int var169 = var168 - var131.field858;
                                    if (var165 > var169) {
                                        var166 = var169;
                                    }
                                    int var170 = var131.field861 + var168;
                                    if (var170 > var167) {
                                        var167 = var170;
                                    }
                                    int var171 = 0;
                                    if (var89 != null) {
                                        var171 = var165 + var89.field2504 + 15;
                                        int var172 = var171 - var133.field858;
                                        if (var166 > var172) {
                                            var166 = var172;
                                        }
                                        int var173 = var171 + var133.field861;
                                        if (var173 > var167) {
                                            var167 = var173;
                                        }
                                    }
                                    int var174 = 255;
                                    if (var86.field2495 >= 0) {
                                        var174 = (var161 << 8) / (var86.field2483 - var86.field2495);
                                    }
                                    if (var174 >= 0 && var174 < 255) {
                                        int var175 = var174 << 24;
                                        int var176 = var175 | 0xFFFFFF;
                                        if (var116 != null) {
                                            var116.method48(var164 + var148 - var100, var165, 0, var176, 1);
                                        }
                                        if (var121 != null) {
                                            var121.method48(var164 + var149 - var102, var165, 0, var176, 1);
                                        }
                                        if (var119 != null) {
                                            for (int var177 = 0; var177 < var145; var177++) {
                                                var119.method48(var164 - (var101 - var150 - (var97 * var177)), var165, 0, var176, 1);
                                            }
                                        }
                                        if (var123 != null) {
                                            var123.method48(var154 + var164 - var103, var165, 0, var176, 1);
                                        }
                                        var129.method2483(var175 | var86.field2491, var164 + var151, var142, var168, -113, 0);
                                        if (var89 != null) {
                                            if (var104 != null) {
                                                var104.method48(var164 + var155 - var112, var165, 0, var176, 1);
                                            }
                                            if (var106 != null) {
                                                var106.method48(var156 + var164 - var114, var165, 0, var176, 1);
                                            }
                                            if (var105 != null) {
                                                for (int var178 = 0; var178 < var146; var178++) {
                                                    var105.method48(var109 * var178 + var157 + var164 - var113, var165, 0, var176, 1);
                                                }
                                            }
                                            if (var107 != null) {
                                                var107.method48(var164 + var158 - var115, var165, 0, var176, 1);
                                            }
                                            var130.method2483(var89.field2491 | var175, var159 + var164, var140, var171, -102, 0);
                                        }
                                    } else {
                                        if (var116 != null) {
                                            var116.method182(var148 + var164 - var100, var165);
                                        }
                                        if (var121 != null) {
                                            var121.method182(var149 + var164 - var102, var165);
                                        }
                                        if (var119 != null) {
                                            for (int var179 = 0; var179 < var145; var179++) {
                                                var119.method182(var164 - var101 - (-(var97 * var179) + -var150), var165);
                                            }
                                        }
                                        if (var123 != null) {
                                            var123.method182(var164 + var154 - var103, var165);
                                        }
                                        var129.method2483(var86.field2491 | 0xFF000000, var151 + var164, var142, var168, -39, 0);
                                        if (var89 != null) {
                                            if (var104 != null) {
                                                var104.method182(var155 + var164 - var112, var165);
                                            }
                                            if (var106 != null) {
                                                var106.method182(var164 + var156 - var114, var165);
                                            }
                                            if (var105 != null) {
                                                for (int var180 = 0; var180 < var146; var180++) {
                                                    var105.method182(var157 + var164 + (var109 * var180) - var113, var165);
                                                }
                                            }
                                            if (var107 != null) {
                                                var107.method182(var158 + var164 - var115, var165);
                                            }
                                            var130.method2483(var89.field2491 | 0xFF000000, var164 + var159, var140, var171, -126, 0);
                                        }
                                    }
                                    class438.method2696(var166, var167 + 1, var152 + var164, (byte) 114, var164);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < class125.field1940; var10++) {
            int var33 = class141.field2210[var10];
            class109 var34;
            if (var33 >= 2048) {
                var34 = ((class53) class332.field4881.method3512(true, (long) (var33 - 2048))).field847;
            } else {
                var34 = class279.field4271[var33];
            }
            int var35 = class228.field3648[var10];
            class109 var36;
            if (var35 < 2048) {
                var36 = class279.field4271[var35];
            } else {
                var36 = ((class53) class332.field4881.method3512(true, (long) (var35 - 2048))).field847;
            }
            class273.method1797(arg1, arg4, arg3, var34, (byte) -16, arg5, arg0, var36, --var34.field1653, arg2);
        }
        int var11 = class632.field8881.field861 + class632.field8881.field858 + 2;
        for (int var12 = 0; var12 < class343.field5076; var12++) {
            int var13 = class85.field1254[var12];
            int var14 = class85.field1259[var12];
            int var15 = class85.field1256[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var32 = 0; var32 < var12; var32++) {
                    if (var14 + 2 > class85.field1259[var32] + -var11 && (var14 - var11) < (class85.field1259[var32] + 2) && (var13 - var15) < (class85.field1254[var32] + class85.field1256[var32]) && (var13 + var15) > (class85.field1254[var32] - class85.field1256[var32]) && var14 > class85.field1259[var32] - var11) {
                        var14 = class85.field1259[var32] - var11;
                        var16 = true;
                    }
                }
            }
            class85.field1259[var12] = var14;
            String var17 = class85.field1249[var12];
            int var18 = class632.field8881.method510(var17, 174);
            int var19 = arg0 + var13;
            int var20 = arg5 + var14 - class632.field8881.field858;
            int var21 = var18 + var19;
            int var22 = class632.field8881.field861 + arg5 + var14;
            if (class342.field5055 == 0) {
                int var23 = 16776960;
                if (class85.field1257[var12] < 6) {
                    var23 = class524.field7550[class85.field1257[var12]];
                }
                if (class85.field1257[var12] == 6) {
                    var23 = (class475.field6901 % 20) >= 10 ? 16776960 : 16711680;
                }
                if (class85.field1257[var12] == 7) {
                    var23 = class475.field6901 % 20 >= 10 ? 65535 : 255;
                }
                if (class85.field1257[var12] == 8) {
                    var23 = class475.field6901 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class85.field1257[var12] == 9) {
                    int var24 = 150 - class85.field1250[var12];
                    if (var24 < 50) {
                        var23 = var24 * 1280 + 16711680;
                    } else if (var24 < 100) {
                        var23 = 16384000 + 16776960 - var24 * 327680;
                    } else if (var24 < 150) {
                        var23 = var24 * 5 + 64780;
                    }
                }
                if (class85.field1257[var12] == 10) {
                    int var25 = 150 - class85.field1250[var12];
                    if (var25 < 50) {
                        var23 = var25 * 5 + 16711680;
                    } else if (var25 < 100) {
                        var23 = 16384000 + 16711935 - (var25 * 327680);
                    } else if (var25 < 150) {
                        var23 = 500 + 255 - (var25 * 5) - (-(var25 * 327680) + 32768000);
                    }
                }
                if (class85.field1257[var12] == 11) {
                    int var26 = 150 - class85.field1250[var12];
                    if (var26 < 50) {
                        var23 = 16777215 - (var26 * 327685);
                    } else if (var26 < 100) {
                        var23 = var26 * 327685 + 65280 - 16384250;
                    } else if (var26 < 150) {
                        var23 = 16777215 - (var26 - 100) * 327680;
                    }
                }
                int var27 = var23 | 0xFF000000;
                if (class85.field1248[var12] == 0) {
                    class257.field4034.method2473(false, -16777216, var17, arg5 + var14, var27, arg0 + var13);
                    var19 -= var18 >> 1;
                    var21 -= var18 >> 1;
                }
                if (class85.field1248[var12] == 1) {
                    var19 -= var18 >> 1;
                    var22 += 5;
                    var21 -= var18 >> 1;
                    var20 -= 5;
                    class257.field4034.method2486(class475.field6901, var27, arg5 + var14, -124, arg0 + var13, var17, -16777216);
                }
                if (class85.field1248[var12] == 2) {
                    var22 += 5;
                    var21 -= (var18 >> 1) - 5;
                    var19 -= (var18 >> 1) + 5;
                    class257.field4034.method2477(class475.field6901, -16777216, arg5 + var14, var27, -1513, arg0 + var13, var17);
                    var20 -= 5;
                }
                if (class85.field1248[var12] == 3) {
                    var21 -= var18 >> 1;
                    var19 -= var18 >> 1;
                    var20 -= 7;
                    var22 += 7;
                    class257.field4034.method2479(-16777216, var27, var17, arg0 + var13, -class85.field1250[var12] + 150, class475.field6901, arg5 + var14, arg6);
                }
                if (class85.field1248[var12] == 4) {
                    int var28 = (150 - class85.field1250[var12]) * (class632.field8881.method510(var17, 174) + 100) / 150;
                    class364.field5573.method298(var13 + arg0 - 50, arg5, arg0 + var13 + 50, arg5 - -arg3);
                    var21 += 50 - var28;
                    class257.field4034.method2483(var27, var13 + arg0 + 50 - var28, var17, arg5 + var14, -39, -16777216);
                    var19 += 50 - var28;
                    class364.field5573.method240(arg0, arg5, arg0 + arg2, arg5 - -arg3);
                }
                if (class85.field1248[var12] == 5) {
                    int var29 = 150 - class85.field1250[var12];
                    int var30 = 0;
                    if (var29 < 25) {
                        var30 = var29 - 25;
                    } else if (var29 > 125) {
                        var30 = var29 - 125;
                    }
                    int var31 = class632.field8881.field858 + class632.field8881.field861;
                    class364.field5573.method298(arg0, arg5 + var14 - var31 - 1, arg0 + arg2, arg5 - (-var14 - 5));
                    class257.field4034.method2473(false, -16777216, var17, arg5 - (-var14 - var30), var27, arg0 + var13);
                    var22 += var30;
                    var21 -= var18 >> 1;
                    var19 -= var18 >> 1;
                    var20 += var30;
                    class364.field5573.method240(arg0, arg5, arg0 + arg2, arg5 - -arg3);
                }
            } else {
                var19 -= var18 >> 1;
                var21 -= var18 >> 1;
                class257.field4034.method2473(arg6, -16777216, var17, arg5 + var14, -256, arg0 + var13);
            }
            class438.method2696(var20, var22 + 1, var21 - -1, (byte) 113, var19);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IB)Z", line = 1185)
    public final boolean method3146(int arg0, byte arg1) throws IOException {
        int var3 = -120 % ((30 - arg1) / 43);
        field7650++;
        if (arg0 <= 0 || arg0 >= this.field7651) {
            throw new IOException();
        }
        synchronized (this) {
            int var5;
            if (this.field7648 < this.field7657) {
                var5 = this.field7651 + this.field7648 - this.field7657;
            } else {
                var5 = this.field7648 - this.field7657;
            }
            if (arg0 <= var5) {
                return true;
            } else if (this.field7647 == null) {
                return false;
            } else {
                throw new IOException(this.field7647.toString());
            }
        }
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V", line = 1406)
    public class532(InputStream arg0, int arg1) {
        this.field7651 = arg1 + 1;
        this.field7643 = arg0;
        this.field7652 = new byte[this.field7651];
        this.field7649 = new Thread(this);
        this.field7649.setDaemon(true);
        this.field7649.start();
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(BLofa;)Lir;", line = 1228)
    public static final class181 method3147(byte arg0, class301 arg1) {
        field7656++;
        if (arg0 != -17) {
            field7658 = null;
        }
        class70 var2 = class425.method2652(arg1, (byte) -54);
        int var3 = arg1.method1934(-2);
        int var4 = arg1.method1934(-2);
        return new class181(var2.field1081, var2.field1075, var2.field1082, var2.field1079, var2.field1076, var2.field1078, var2.field1071, var2.field1074, var2.field1073, var3, var4);
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)V", line = 1247)
    public final void method3148(int arg0) {
        this.field7643 = new class86();
        field7646++;
        if (arg0 != 3665) {
            method3151(14);
        }
    }

    @OriginalMember(owner = "client!mm", name = "run", descriptor = "()V", line = 1260)
    public final void run() {
        field7644++;
        while (true) {
            int var2;
            synchronized (this) {
                while (true) {
                    if (this.field7647 != null) {
                        return;
                    }
                    if (this.field7657 == 0) {
                        var2 = this.field7651 - this.field7648 - 1;
                    } else if (this.field7648 <= this.field7657) {
                        var2 = this.field7657 - this.field7648 - 1;
                    } else {
                        var2 = this.field7651 - this.field7648;
                    }
                    if (var2 > 0) {
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException var12) {
                    }
                }
            }
            int var3;
            try {
                var3 = this.field7643.read(this.field7652, this.field7648, var2);
                if (var3 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var14) {
                IOException var4 = var14;
                synchronized (this) {
                    this.field7647 = var4;
                    return;
                }
            }
            synchronized (this) {
                this.field7648 = (this.field7648 + var3) % this.field7651;
            }
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIZZI)V", line = 1317)
    public static final void method3149(int arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        field7653++;
        client.method2743(class94.field1406.length - 1, arg2, arg3, arg0, -14474, 0, arg4);
        class372.field5640 = null;
        class501.field7276 = 0;
        int var5 = -94 % ((arg1 - 70) / 32);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II[BI)I", line = 1331)
    public final int method3150(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field7645++;
        if (arg3 < 0 || arg1 < 0 || arg1 + arg3 > arg2.length) {
            throw new IOException();
        }
        synchronized (this) {
            int var6;
            if (this.field7657 <= this.field7648) {
                var6 = this.field7648 - this.field7657;
            } else {
                var6 = this.field7651 + this.field7648 - this.field7657;
            }
            if (var6 < arg3) {
                arg3 = var6;
            }
            if (arg3 == 0 && this.field7647 != null) {
                throw new IOException(this.field7647.toString());
            }
            if (this.field7657 + arg3 <= this.field7651) {
                class571.method3313(this.field7652, this.field7657, arg2, arg1, arg3);
            } else {
                int var7 = this.field7651 - this.field7657;
                class571.method3313(this.field7652, this.field7657, arg2, arg1, var7);
                class571.method3313(this.field7652, 0, arg2, arg1 + var7, -var7 + arg3);
            }
            this.field7657 = (this.field7657 + arg3) % this.field7651;
            this.notifyAll();
            return arg0 == -5 ? arg3 : -68;
        }
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(I)V", line = 1379)
    public static void method3151(int arg0) {
        field7661 = null;
        field7659 = null;
        field7662 = null;
        field7654 = null;
        if (arg0 == 0) {
            field7658 = null;
        }
    }
}
