import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bia")
public class class496 {

    @OriginalMember(owner = "client!bia", name = "c", descriptor = "B")
    private byte field7067;

    @OriginalMember(owner = "client!bia", name = "k", descriptor = "I")
    public int field7075;

    @OriginalMember(owner = "client!bia", name = "g", descriptor = "I")
    public int field7071;

    @OriginalMember(owner = "client!bia", name = "d", descriptor = "I")
    public int field7068;

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "I")
    public int field7065;

    @OriginalMember(owner = "client!bia", name = "e", descriptor = "I")
    public int field7069;

    @OriginalMember(owner = "client!bia", name = "b", descriptor = "Lnga;")
    public static class510 field7066 = new class510(260);

    @OriginalMember(owner = "client!bia", name = "f", descriptor = "[[I")
    public static int[][] field7070 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!bia", name = "h", descriptor = "Lqe;")
    public static class465 field7072 = new class465(45, -2);

    @OriginalMember(owner = "client!bia", name = "m", descriptor = "[I")
    public static int[] field7077 = new int[4];

    @OriginalMember(owner = "client!bia", name = "i", descriptor = "I")
    public static int field7073;

    @OriginalMember(owner = "client!bia", name = "j", descriptor = "I")
    public static int field7074;

    @OriginalMember(owner = "client!bia", name = "l", descriptor = "I")
    public static int field7076;

    @OriginalMember(owner = "client!bia", name = "n", descriptor = "I")
    public static int field7078;

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(B)I", line = 4)
    public final int method2982(byte arg0) {
        field7074++;
        if (arg0 >= -20) {
            this.method2983((byte) -43);
        }
        return this.field7067 & 0x7;
    }

    @OriginalMember(owner = "client!bia", name = "b", descriptor = "(B)I", line = 15)
    public final int method2983(byte arg0) {
        if (arg0 != -14) {
            this.method2982((byte) -43);
        }
        field7073++;
        return (this.field7067 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(Lpu;B)V", line = 30)
    public static final void method2984(class559 arg0, byte arg1) {
        field7078++;
        if (class697.field9801 == arg0) {
            int var2 = class644.field9146.method273(255);
            int var3 = class152.field2294 * 2 + (var2 >> 4 & 0xF);
            int var4 = (var2 & 0xF) + class456.field6590 * 2;
            int var5 = class644.field9146.method273(255);
            boolean var6 = (var5 & 0x1) != 0;
            boolean var7 = (var5 & 0x2) != 0;
            int var8 = var7 ? var5 >> 2 : -1;
            int var9 = class644.field9146.method277((byte) 12) + var3;
            int var10 = class644.field9146.method277((byte) -117) + var4;
            int var11 = class644.field9146.method225((byte) 66);
            int var12 = class644.field9146.method225((byte) 102);
            int var13 = class644.field9146.method253(-13900);
            int var14 = class644.field9146.method273(255);
            int var15;
            if (var7) {
                var15 = (byte) var14;
            } else {
                var15 = var14 * 4;
            }
            int var16 = class644.field9146.method273(255) * 4;
            int var17 = class644.field9146.method253(-13900);
            int var18 = class644.field9146.method253(-13900);
            int var19 = class644.field9146.method273(255);
            int var20 = class644.field9146.method253(-13900);
            if (var19 == 255) {
                var19 = -1;
            }
            if (var3 >= 0 && var4 >= 0 && var3 < class174.field2540 * 2 && (class174.field2540 * 2) > var4 && var9 >= 0 && var10 >= 0 && (class716.field9999 * 2) > var9 && (class716.field9999 * 2) > var10 && var13 != 65535) {
                int var21 = var16 << 2;
                int var22 = var3 * 256;
                int var23 = var10 * 256;
                int var24 = var15 << 2;
                int var25 = var4 * 256;
                int var26 = var9 * 256;
                int var27 = var20 << 2;
                if (var11 != 0 && var8 != -1) {
                    class52 var28 = null;
                    if (var11 >= 0) {
                        int var29 = var11 - 1;
                        class272 var30 = (class272) class758.field10539.method4203(true, (long) var29);
                        if (var30 != null) {
                            var28 = var30.field3885;
                        }
                    } else {
                        int var31 = -var11 - 1;
                        if (class675.field9486 == var31) {
                            var28 = class468.field6748;
                        } else {
                            var28 = class165.field2442[var31];
                        }
                    }
                    if (var28 != null) {
                        class500 var32 = var28.method464((byte) 126);
                        if (var32.field7113 != null && var32.field7113[var8] != null) {
                            var24 -= var32.field7113[var8][1];
                        }
                        if (var32.field7160 != null && var32.field7160[var8] != null) {
                            var24 -= var32.field7160[var8][1];
                        }
                    }
                }
                class676 var33 = new class676(var13, class24.field313, class24.field313, var22, var25, var24, class605.field8787 + var17, class605.field8787 + var18, var19, var27, var11, var12, var21, var6, var8);
                var33.method3825(var26, class534.method3136(1, class24.field313, var26, var23) - var21, 117, var23, class605.field8787 + var17);
                class562.field7965.method1526(new class726(var33), 108);
            }
        } else if (class343.field4824 == arg0) {
            class644.field9146.method273(255);
            int var34 = class644.field9146.method273(255);
            int var35 = (var34 >> 4 & 0x7) + class152.field2294;
            int var36 = class456.field6590 + (var34 & 0x7);
            int var37 = class644.field9146.method253(-13900);
            int var38 = class644.field9146.method273(255);
            int var39 = class644.field9146.method239(-30);
            String var40 = class644.field9146.method272(2);
            class337.method2145(var40, var38, var37, var39, class24.field313, var36, -24463, var35);
        } else if (class252.field3597 == arg0) {
            int var41 = class644.field9146.method273(255);
            int var42 = ((var41 & 0x74) >> 4) + class152.field2294;
            int var43 = (var41 & 0x7) + class456.field6590;
            int var44 = class644.field9146.method253(-13900);
            if (var44 == 65535) {
                var44 = -1;
            }
            int var45 = class644.field9146.method273(255);
            int var46 = var45 >> 4 & 0xF;
            int var47 = var45 & 0x7;
            int var48 = class644.field9146.method273(255);
            int var49 = class644.field9146.method273(255);
            int var50 = class644.field9146.method253(-13900);
            if (var42 >= 0 && var43 >= 0 && class174.field2540 > var42 && var43 < class716.field9999) {
                int var51 = var46 + 1;
                if (var42 - var51 <= class468.field6748.field991[0] && var42 + var51 >= class468.field6748.field991[0] && class468.field6748.field995[0] >= var43 - var51 && class468.field6748.field995[0] <= (var43 + var51)) {
                    class54.method494((var42 << 16) + ((class24.field313 << 24) + (var43 << 8)) + var46, var50, false, var49, var47, var44, var48, -1);
                }
            }
        } else if (class531.field7524 == arg0) {
            int var52 = class644.field9146.method273(255);
            int var53 = (var52 >> 4 & 0x7) + class152.field2294;
            int var54 = (var52 & 0x7) + class456.field6590;
            int var55 = class644.field9146.method253(-13900);
            int var56 = class644.field9146.method273(255);
            int var57 = class644.field9146.method253(-13900);
            int var58 = class644.field9146.method273(255);
            if (var53 >= 0 && var54 >= 0 && class174.field2540 > var53 && class716.field9999 > var54) {
                int var59 = var53 * 512 + 256;
                int var60 = var54 * 512 + 256;
                int var61 = class24.field313;
                if (var61 < 3 && class634.method3647(-43, var54, var53)) {
                    var61++;
                }
                class53 var62 = new class53(var55, var57, class605.field8787, class24.field313, var61, var59, class534.method3136(1, class24.field313, var59, var60) - var56, var60, var53, var53, var54, var54, var58);
                class567.field8051.method1526(new class679(var62), 86);
            }
        } else if (class611.field8836 == arg0) {
            int var63 = class644.field9146.method253(-13900);
            int var64 = class644.field9146.method273(255);
            class66.field1181.method131(2, var63).method2520((byte) 111, var64);
        } else if (class640.field9112 == arg0) {
            int var65 = class644.field9146.method228((byte) 67);
            int var66 = class644.field9146.method248((byte) -92);
            int var67 = class644.field9146.method236(120);
            int var68 = (var67 & 0x7) + class456.field6590;
            int var69 = class64.field1160 + var68;
            int var70 = ((var67 & 0x7A) >> 4) + class152.field2294;
            int var71 = class115.field1845 + var70;
            boolean var72 = var70 >= 0 && var68 >= 0 && var70 < class174.field2540 && var68 < class716.field9999;
            if (var72 || class590.method3386(-69, class564.field7978)) {
                class166.method1229(class24.field313, var69, new class332(var65, var66), var71, -2);
                if (var72) {
                    class152.method1168(class24.field313, 256, var70, var68);
                }
            }
        } else {
            if (arg1 >= -24) {
                method2986((byte) 88, null, null, -9, -15);
            }
            if (class18.field235 == arg0) {
                int var73 = class644.field9146.method288((byte) -127);
                int var74 = ((var73 & 0x78) >> 4) + class152.field2294;
                int var75 = (var73 & 0x7) + class456.field6590;
                int var76 = class644.field9146.method273(255);
                int var77 = var76 >> 2;
                int var78 = var76 & 0x3;
                int var79 = class443.field6164[var77];
                if (class590.method3386(-94, class564.field7978) || var74 >= 0 && var75 >= 0 && var74 < class174.field2540 && class716.field9999 > var75) {
                    class732.method4075(class24.field313, -1, 0, var78, var75, -1, (byte) -125, var77, var74, var79);
                }
            } else if (class532.field7533 == arg0) {
                int var80 = class644.field9146.method273(255);
                int var81 = class456.field6590 + (var80 & 0x7);
                int var82 = class64.field1160 + var81;
                int var83 = ((var80 & 0x7E) >> 4) + class152.field2294;
                int var84 = class115.field1845 + var83;
                int var85 = class644.field9146.method253(-13900);
                int var86 = class644.field9146.method253(-13900);
                int var87 = class644.field9146.method253(-13900);
                if (class136.field2123 != null) {
                    class694 var88 = (class694) class136.field2123.method4203(true, (long) (class24.field313 << 28 | var82 << 14 | var84));
                    if (var88 != null) {
                        for (class332 var89 = (class332) var88.field9759.method1522(true); var89 != null; var89 = (class332) var88.field9759.method1527((byte) 53)) {
                            if ((var85 & 0x7FFF) == var89.field4685 && var89.field4683 == var86) {
                                var89.method3617(1);
                                var89.field4683 = var87;
                                class166.method1229(class24.field313, var82, var89, var84, -2);
                                break;
                            }
                        }
                        if (var83 >= 0 && var81 >= 0 && class174.field2540 > var83 && class716.field9999 > var81) {
                            class152.method1168(class24.field313, 256, var83, var81);
                        }
                    }
                }
            } else if (class368.field5150 == arg0) {
                int var90 = class644.field9146.method236(116);
                int var91 = (var90 & 0x7) + class456.field6590;
                int var92 = class64.field1160 + var91;
                int var93 = ((var90 & 0x7B) >> 4) + class152.field2294;
                int var94 = class115.field1845 + var93;
                int var95 = class644.field9146.method248((byte) -107);
                class694 var96 = (class694) class136.field2123.method4203(true, (long) (var94 | var92 << 14 | class24.field313 << 28));
                if (var96 != null) {
                    for (class332 var97 = (class332) var96.field9759.method1522(true); var97 != null; var97 = (class332) var96.field9759.method1527((byte) 119)) {
                        if ((var95 & 0x7FFF) == var97.field4685) {
                            var97.method3617(1);
                            break;
                        }
                    }
                    if (var96.field9759.method1528(65)) {
                        var96.method3617(1);
                    }
                    if (var93 >= 0 && var91 >= 0 && class174.field2540 > var93 && var91 < class716.field9999) {
                        class152.method1168(class24.field313, 256, var93, var91);
                    }
                }
            } else if (class86.field1556 == arg0) {
                int var98 = class644.field9146.method248((byte) -108);
                int var99 = class644.field9146.method288((byte) -127);
                int var100 = (var99 >> 4 & 0x7) + class152.field2294;
                int var101 = (var99 & 0x7) + class456.field6590;
                int var102 = class644.field9146.method273(255);
                int var103 = var102 >> 2;
                int var104 = var102 & 0x3;
                int var105 = class443.field6164[var103];
                if (class590.method3386(-98, class564.field7978) || var100 >= 0 && var101 >= 0 && var100 < class174.field2540 && class716.field9999 > var101) {
                    class732.method4075(class24.field313, var98, 0, var104, var101, -1, (byte) -119, var103, var100, var105);
                }
            } else if (class686.field9676 == arg0) {
                int var106 = class644.field9146.method288((byte) -127);
                int var107 = var106 >> 2;
                int var108 = var106 & 0x3;
                int var109 = class443.field6164[var107];
                int var110 = class644.field9146.method236(112);
                int var111 = ((var110 & 0x77) >> 4) + class152.field2294;
                int var112 = (var110 & 0x7) + class456.field6590;
                int var113 = class644.field9146.method248((byte) -100);
                if (var113 == 65535) {
                    var113 = -1;
                }
                class625.method3610(1466, var113, var108, var111, var112, var107, class24.field313, var109);
            } else if (class63.field1143 == arg0) {
                int var114 = class644.field9146.method273(255);
                boolean var115 = (var114 & 0x80) != 0;
                int var116 = ((var114 & 0x39) >> 3) + class152.field2294;
                int var117 = class456.field6590 + (var114 & 0x7);
                int var118 = var116 + class644.field9146.method277((byte) -114);
                int var119 = var117 + class644.field9146.method277((byte) -119);
                int var120 = class644.field9146.method225((byte) 94);
                int var121 = class644.field9146.method253(-13900);
                int var122 = class644.field9146.method273(255) * 4;
                int var123 = class644.field9146.method273(255) * 4;
                int var124 = class644.field9146.method253(-13900);
                int var125 = class644.field9146.method253(-13900);
                int var126 = class644.field9146.method273(255);
                if (var126 == 255) {
                    var126 = -1;
                }
                int var127 = class644.field9146.method253(-13900);
                if (var116 >= 0 && var117 >= 0 && var116 < class174.field2540 && var117 < class716.field9999 && var118 >= 0 && var119 >= 0 && var118 < class174.field2540 && var119 < class716.field9999 && var121 != 65535) {
                    int var128 = var116 * 512 + 256;
                    int var129 = var123 << 2;
                    int var130 = var122 << 2;
                    int var131 = var119 * 512 + 256;
                    int var132 = var118 * 512 + 256;
                    int var133 = var117 * 512 + 256;
                    int var134 = var127 << 2;
                    class676 var135 = new class676(var121, class24.field313, class24.field313, var128, var133, var130, class605.field8787 + var124, var125 - -class605.field8787, var126, var134, 0, var120, var129, var115, -1);
                    var135.method3825(var132, class534.method3136(1, class24.field313, var132, var131) - var129, 114, var131, class605.field8787 + var124);
                    class562.field7965.method1526(new class726(var135), -77);
                }
            } else if (class193.field2780 == arg0) {
                int var136 = class644.field9146.method273(255);
                int var137 = (var136 >> 4 & 0x7) + class152.field2294;
                int var138 = class456.field6590 + (var136 & 0x7);
                int var139 = class644.field9146.method253(-13900);
                if (var139 == 65535) {
                    var139 = -1;
                }
                int var140 = class644.field9146.method273(255);
                int var141 = var140 >> 4 & 0xF;
                int var142 = var140 & 0x7;
                int var143 = class644.field9146.method273(255);
                int var144 = class644.field9146.method273(255);
                int var145 = class644.field9146.method253(-13900);
                if (var137 >= 0 && var138 >= 0 && class174.field2540 > var137 && class716.field9999 > var138) {
                    int var146 = var141 + 1;
                    if ((var137 - var146) <= class468.field6748.field991[0] && var137 + var146 >= class468.field6748.field991[0] && class468.field6748.field995[0] >= (var138 - var146) && var138 + var146 >= class468.field6748.field995[0]) {
                        class390.method2434(var144, var139, var143, -1, var142, var145, (var138 << 8) + (var137 << 16) + ((class24.field313 << 24) - -var141));
                    }
                }
            } else if (class742.field10407 == arg0) {
                int var147 = class644.field9146.method248((byte) -111);
                int var148 = class644.field9146.method248((byte) -128);
                int var149 = class644.field9146.method288((byte) -127);
                int var150 = (var149 & 0x7) + class456.field6590;
                int var151 = class64.field1160 + var150;
                int var152 = (var149 >> 4 & 0x7) + class152.field2294;
                int var153 = class115.field1845 + var152;
                int var154 = class644.field9146.method253(-13900);
                if (class675.field9486 != var147) {
                    boolean var155 = var152 >= 0 && var150 >= 0 && class174.field2540 > var152 && class716.field9999 > var150;
                    if (var155 || class590.method3386(-90, class564.field7978)) {
                        class166.method1229(class24.field313, var151, new class332(var154, var148), var153, -2);
                        if (var155) {
                            class152.method1168(class24.field313, 256, var152, var150);
                        }
                    }
                }
            } else {
                class621.method3591("T3 - " + arg0, null, (byte) -78);
                class144.method1123(false, (byte) -38);
            }
        }
    }

    @OriginalMember(owner = "client!bia", name = "c", descriptor = "(B)V", line = 638)
    public static void method2985(byte arg0) {
        field7070 = null;
        field7077 = null;
        field7072 = null;
        field7066 = null;
        int var1 = 51 % ((arg0 + 40) / 46);
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(BLdm;Lha;II)V", line = 651)
    public static final void method2986(byte arg0, class50 arg1, class58 arg2, int arg3, int arg4) {
        if (arg0 > -7) {
            field7070 = null;
        }
        field7076++;
        class484 var5 = arg1.method445((byte) -76, arg2);
        if (var5 == null) {
            return;
        }
        arg2.method584(arg4, arg3, arg1.field783 + arg4, arg3 - -arg1.field830);
        if (class255.field3697 == 2 || class255.field3697 == 5 || class459.field6628 == null) {
            arg2.method523(-16777216, var5, arg4, arg3);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class666.field9338 == 4) {
            var6 = class211.field3044;
            var7 = class218.field3100;
            var8 = (int) (-class321.field4568) & 0x3FFF;
            var9 = 4096;
        } else {
            var8 = (int) (-class321.field4568) + class440.field6138 & 0x3FFF;
            var6 = class468.field6748.field648;
            var7 = class468.field6748.field644;
            var9 = 4096 - (class113.field1812 * 16);
        }
        int var10 = var7 / 128 + 48 + 208 - (class174.field2540 * 2);
        int var11 = class716.field9999 * 4 + (-(class716.field9999 * 2) - -208) + 48 - var6 / 128;
        class459.field6628.method4140((float) arg1.field783 / 2.0F + (float) arg4, (float) arg1.field830 / 2.0F + (float) arg3, (float) var10, (float) var11, var9, var8 << 2, var5, arg4, arg3);
        for (class528 var12 = (class528) class175.field2544.method1522(true); var12 != null; var12 = (class528) class175.field2544.method1527((byte) 91)) {
            int var58 = var12.field7502;
            int var59 = ((class609.field8826.field10479[var58] & 0xFFFECEB) >> 14) - class115.field1845;
            int var60 = (class609.field8826.field10479[var58] & 0x3FFF) - class64.field1160;
            int var61 = var59 * 4 + 2 - (var7 / 128);
            int var62 = var60 * 4 + 2 - (var6 / 128);
            class96.method871(var5, -2, class609.field8826.field10480[var58], var61, arg3, arg1, var62, arg4, arg2);
        }
        for (int var13 = 0; var13 < class569.field8092; var13++) {
            int var55 = class78.field1463[var13] * 4 + 2 - var7 / 128;
            int var56 = class561.field7960[var13] * 4 + 2 - (var6 / 128);
            class414 var57 = class66.field1181.method131(2, class262.field3834[var13]);
            if (var57.field5720 != null) {
                var57 = var57.method2513(class742.field10408, true);
                if (var57 == null || var57.field5712 == -1) {
                    continue;
                }
            }
            class96.method871(var5, -2, var57.field5712, var55, arg3, arg1, var56, arg4, arg2);
        }
        for (class694 var14 = (class694) class136.field2123.method4209(false); var14 != null; var14 = (class694) class136.field2123.method4207(9356)) {
            int var50 = (int) (var14.field8991 >> 28 & 0x3L);
            if (class510.field7279 == var50) {
                int var51 = (int) (var14.field8991 & 0x3FFFL) - class115.field1845;
                int var52 = (int) (var14.field8991 >> 14 & 0x3FFFL) - class64.field1160;
                int var53 = var51 * 4 + 2 - (var7 / 128);
                int var54 = var52 * 4 + 2 - (var6 / 128);
                class43.method392(arg4, arg3, arg1, class212.field3047[0], (byte) 119, var53, var54, var5);
            }
        }
        for (int var15 = 0; var15 < class152.field2290; var15++) {
            class272 var45 = (class272) class758.field10539.method4203(true, (long) class323.field4590[var15]);
            if (var45 != null) {
                class84 var46 = var45.field3885;
                if (var46.method804((byte) -116) && class468.field6748.field649 == var46.field649) {
                    class488 var47 = var46.field1523;
                    if (var47 != null && var47.field6923 != null) {
                        var47 = var47.method2926(8730, class742.field10408);
                    }
                    if (var47 != null && var47.field6907 && var47.field6920) {
                        int var48 = var46.field644 / 128 - var7 / 128;
                        int var49 = var46.field648 / 128 - (var6 / 128);
                        if (var47.field6904 == -1) {
                            class43.method392(arg4, arg3, arg1, class212.field3047[1], (byte) 127, var48, var49, var5);
                        } else {
                            class96.method871(var5, -2, var47.field6904, var48, arg3, arg1, var49, arg4, arg2);
                        }
                    }
                }
            }
        }
        int var16 = class206.field2950;
        int[] var17 = class209.field3013;
        for (int var18 = 0; var18 < var16; var18++) {
            class349 var37 = class165.field2442[var17[var18]];
            if (var37 != null && var37.method2191((byte) -108) && !var37.field4929 && class468.field6748 != var37 && class468.field6748.field649 == var37.field649) {
                int var38 = var37.field644 / 128 - var7 / 128;
                int var39 = var37.field648 / 128 - var6 / 128;
                boolean var40 = false;
                for (int var41 = 0; var41 < class425.field5945; var41++) {
                    if (var37.field4939.equals(class583.field8236[var41]) && class170.field2486[var41] != 0) {
                        var40 = true;
                        break;
                    }
                }
                boolean var42 = false;
                for (int var43 = 0; var43 < class208.field2982; var43++) {
                    if (var37.field4939.equals(class20.field259[var43].field8123)) {
                        var42 = true;
                        break;
                    }
                }
                boolean var44 = false;
                if (class468.field6748.field4895 != 0 && var37.field4895 != 0 && class468.field6748.field4895 == var37.field4895) {
                    var44 = true;
                }
                if (var37.field4926) {
                    class43.method392(arg4, arg3, arg1, class212.field3047[6], (byte) 91, var38, var39, var5);
                } else if (var40) {
                    class43.method392(arg4, arg3, arg1, class212.field3047[3], (byte) 105, var38, var39, var5);
                } else if (var42) {
                    class43.method392(arg4, arg3, arg1, class212.field3047[5], (byte) 93, var38, var39, var5);
                } else if (var44) {
                    class43.method392(arg4, arg3, arg1, class212.field3047[4], (byte) 104, var38, var39, var5);
                } else {
                    class43.method392(arg4, arg3, arg1, class212.field3047[2], (byte) 117, var38, var39, var5);
                }
            }
        }
        class340[] var19 = class220.field3146;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class340 var23 = var19[var20];
            if (var23 != null && var23.field4782 != 0 && (class605.field8787 % 20) < 10) {
                if (var23.field4782 == 1) {
                    class272 var24 = (class272) class758.field10539.method4203(true, (long) var23.field4789);
                    if (var24 != null) {
                        class84 var25 = var24.field3885;
                        int var26 = var25.field644 / 128 - (var7 / 128);
                        int var27 = var25.field648 / 128 - (var6 / 128);
                        class147.method1141(arg3, var26, var5, var27, arg1, -1, arg4, var23.field4788, 360000L);
                    }
                }
                if (var23.field4782 == 2) {
                    int var28 = var23.field4785 / 128 - (var7 / 128);
                    int var29 = var23.field4783 / 128 - var6 / 128;
                    long var30 = (long) (var23.field4786 << 7);
                    long var32 = var30 * var30;
                    class147.method1141(arg3, var28, var5, var29, arg1, -1, arg4, var23.field4788, var32);
                }
                if (var23.field4782 == 10 && var23.field4789 >= 0 && var23.field4789 < class165.field2442.length) {
                    class349 var34 = class165.field2442[var23.field4789];
                    if (var34 != null) {
                        int var35 = var34.field644 / 128 - (var7 / 128);
                        int var36 = var34.field648 / 128 - var6 / 128;
                        class147.method1141(arg3, var35, var5, var36, arg1, -1, arg4, var23.field4788, 360000L);
                    }
                }
            }
        }
        if (class666.field9338 == 4) {
            return;
        }
        if (class318.field4513 != 0) {
            int var21 = (class318.field4513 * 4 + (class468.field6748.method482(false) * 2)) + 2 - (var7 / 128) - 2;
            int var22 = (class334.field4722 * 4 - (-((class468.field6748.method482(false) - 1) * 2) - 2)) - (var6 / 128);
            class43.method392(arg4, arg3, arg1, class2.field18[class726.field10161 ? 1 : 0], (byte) 119, var21, var22, var5);
        }
        if (!class468.field6748.field4929) {
            arg2.method542(3, 3, 3854, -1, arg1.field830 / 2 + arg3 - 1, arg1.field783 / 2 + arg4 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!bia", name = "<init>", descriptor = "()V", line = 966)
    public class496() {
    }

    @OriginalMember(owner = "client!bia", name = "<init>", descriptor = "(Lud;)V", line = 972)
    public class496(class35 arg0) {
        this.field7067 = arg0.method277((byte) -116);
        this.field7075 = arg0.method253(-13900);
        this.field7071 = arg0.method234((byte) -95);
        this.field7068 = arg0.method234((byte) -101);
        this.field7065 = arg0.method234((byte) -122);
        this.field7069 = arg0.method234((byte) -127);
    }
}
