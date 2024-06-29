import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class249 extends class207 {

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "[I")
    public int[] field4434 = new int[5];

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "[Ls;")
    public class228[] field4429 = new class228[5];

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "I")
    public int field4425 = 0;

    @OriginalMember(owner = "client!sa", name = "J", descriptor = "I")
    public int field4438;

    @OriginalMember(owner = "client!sa", name = "A", descriptor = "I")
    public int field4430;

    @OriginalMember(owner = "client!sa", name = "M", descriptor = "I")
    public int field4441;

    @OriginalMember(owner = "client!sa", name = "H", descriptor = "I")
    public int field4436;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "Ljd;")
    public static class86 field4419 = class122.method868("headicons_prayer", true);

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "Ljd;")
    public static class86 field4421 = class122.method868("rot:", true);

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "I")
    public int field4426;

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "I")
    public int field4427;

    @OriginalMember(owner = "client!sa", name = "B", descriptor = "I")
    public int field4431;

    @OriginalMember(owner = "client!sa", name = "C", descriptor = "I")
    public int field4432;

    @OriginalMember(owner = "client!sa", name = "K", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "I")
    public int field4445;

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!sa", name = "I", descriptor = "Lde;")
    public class107 field4437;

    @OriginalMember(owner = "client!sa", name = "P", descriptor = "Lsk;")
    public class110 field4444;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "Lbj;")
    public static class151 field4417;

    @OriginalMember(owner = "client!sa", name = "G", descriptor = "Lal;")
    public class221 field4435;

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "Lpj;")
    public class236 field4442;

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "Lsa;")
    public class249 field4428;

    @OriginalMember(owner = "client!sa", name = "D", descriptor = "Lh;")
    public class258 field4433;

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "Loa;")
    public class97 field4443;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "Z")
    public boolean field4423;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "Z")
    public boolean field4424;

    @OriginalMember(owner = "client!sa", name = "L", descriptor = "Z")
    public boolean field4440;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "[[I")
    public static int[][] field4420;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1683(int arg0, String arg1) {
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        field4418++;
        System.exit(1);
        if (arg0 > -119) {
            method1685(14, (class6[]) null, -112, 37, (byte) -65, -62, -42, -112, 63, 37);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
    public static void method1684(byte arg0) {
        field4421 = null;
        field4417 = null;
        field4419 = null;
        if (arg0 < 90) {
            field4421 = null;
        }
        field4420 = null;
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(III)V")
    public class249(int arg0, int arg1, int arg2) {
        this.field4438 = arg1;
        this.field4441 = this.field4430 = arg0;
        this.field4436 = arg2;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I[Lwj;IIBIIIII)V")
    public static final void method1685(int arg0, class6[] arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4439++;
        class131.method936(arg9, arg0, arg3, arg5);
        class145.method1047();
        if (arg4 != -84) {
            field4419 = null;
        }
        for (int var10 = 0; var10 < arg1.length; var10++) {
            class6 var11 = arg1[var10];
            if (var11 != null && (var11.field221 == arg8 || arg8 == -1412584499 && class84.field1637 == var11)) {
                int var12;
                if (arg2 == -1) {
                    class127.field2439[class51.field1062] = var11.field117 + arg7;
                    class37.field842[class51.field1062] = var11.field158 + arg6;
                    class216.field3902[class51.field1062] = var11.field163;
                    class31.field665[class51.field1062] = var11.field131;
                    var12 = class51.field1062++;
                } else {
                    var12 = arg2;
                }
                var11.field125 = var12;
                var11.field124 = class236.field4265;
                if (!var11.field217 || !client.method1112(var11)) {
                    if (var11.field100 > 0) {
                        class217.method1534(var11, -5459);
                    }
                    int var13 = var11.field117 + arg7;
                    int var14 = var11.field158 + arg6;
                    int var15 = var11.field153;
                    if (class180.field3251 && (client.method1111(var11) != 0 || var11.field184 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class84.field1637 == var11) {
                        if (arg8 != -1412584499 && !var11.field96) {
                            class142.field2696 = arg6;
                            class209.field3788 = arg7;
                            class216.field3901 = arg1;
                            continue;
                        }
                        if (class136.field2601 && class20.field532) {
                            int var16 = class6.field207;
                            int var17 = class90.field1841;
                            int var18 = var16 - class260.field4653;
                            if (var18 < class208.field3769) {
                                var18 = class208.field3769;
                            }
                            if ((class208.field3769 + class198.field3517.field163) < (var11.field163 + var18)) {
                                var18 = class208.field3769 + class198.field3517.field163 - var11.field163;
                            }
                            var13 = var18;
                            int var19 = var17 - class273.field4790;
                            if (class247.field4387 > var19) {
                                var19 = class247.field4387;
                            }
                            if (var11.field131 + var19 > class247.field4387 + class198.field3517.field131) {
                                var19 = class247.field4387 + class198.field3517.field131 - var11.field131;
                            }
                            var14 = var19;
                        }
                        if (!var11.field96) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field184 == 2) {
                        var20 = arg3;
                        var21 = arg5;
                        var22 = arg0;
                        var23 = arg9;
                    } else {
                        var22 = var14 <= arg0 ? arg0 : var14;
                        int var24 = var11.field163 + var13;
                        var23 = var13 <= arg9 ? arg9 : var13;
                        int var25 = var14 + var11.field131;
                        if (var11.field184 == 9) {
                            var25++;
                            var24++;
                        }
                        var21 = var25 >= arg5 ? arg5 : var25;
                        var20 = arg3 <= var24 ? arg3 : var24;
                    }
                    if (!var11.field217 || var20 > var23 && var22 < var21) {
                        if (var11.field100 != 0) {
                            if (var11.field100 == 1337) {
                                class66.field1299 = var14;
                                class91.field1855 = var11;
                                class229.field4154 = var13;
                                class20.method153(var14, -19579, var11.field131, var11.field163, var13, var11.field100 == 1403);
                                class131.method936(arg9, arg0, arg3, arg5);
                                continue;
                            }
                            if (var11.field100 == 1338) {
                                if (var11.method49(0)) {
                                    class260.method1775(var13, 50, var12, var14, var11);
                                    class131.method936(arg9, arg0, arg3, arg5);
                                }
                                continue;
                            }
                            if (var11.field100 == 1339) {
                                if (var11.method49(0)) {
                                    class133.method955(var14, arg4 ^ 0xFFFFFFAC, var11, var12, var13);
                                    class131.method936(arg9, arg0, arg3, arg5);
                                }
                                continue;
                            }
                            if (var11.field100 == 1400) {
                                class70.method504(var11.field131, var14, 20287, var13, var11.field163);
                                class21.field540[var12] = true;
                                class204.field3686[var12] = true;
                                class131.method936(arg9, arg0, arg3, arg5);
                                continue;
                            }
                            if (var11.field100 == 1401) {
                                class177.method1247(-32769, var13, var11.field163, var11.field131, var14);
                                class21.field540[var12] = true;
                                class204.field3686[var12] = true;
                                class131.method936(arg9, arg0, arg3, arg5);
                                continue;
                            }
                            if (var11.field100 == 1402) {
                                class237.method1634(var14, -113, var13);
                                class21.field540[var12] = true;
                                class204.field3686[var12] = true;
                                continue;
                            }
                            if (var11.field100 == 1405) {
                                if (!class68.field1327) {
                                    continue;
                                }
                                int var26 = var11.field163 + var13;
                                int var27 = var14 + 15;
                                int var28 = 16776960;
                                class211.field3820.method1770(class109.method783(2, new class86[] { class168.field3113, class4.method26(false, class97.field1929) }), var26, var27, 16776960, -1);
                                int var115 = var27 + 15;
                                int var29 = 0;
                                int var30 = 0;
                                int var31 = 0;
                                Runtime var32 = Runtime.getRuntime();
                                int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                if (var33 > 65536) {
                                    var28 = 16711680;
                                }
                                class211.field3820.method1770(class109.method783(arg4 ^ 0xFFFFFFAE, new class86[] { class10.field317, class4.method26(false, var33), class113.field2149 }), var26, var115, var28, -1);
                                var27 = var115 + 15;
                                for (int var34 = 0; var34 < 27; var34++) {
                                    var31 += class53.field1084[var34].method138(arg4 ^ 0xCE9);
                                    var29 += class53.field1084[var34].method137((byte) 107);
                                    var30 += class53.field1084[var34].method132(arg4 ^ 0x6BD3);
                                }
                                int var35 = 16776960;
                                int var36 = var30 * 100 / var31;
                                int var37 = var29 * 10000 / var31;
                                class86 var38 = class109.method783(2, new class86[] { class214.field3862, class55.method407(0, (long) var37, true, -22194, 2), class105.field2004, class4.method26(false, var36), class220.field3954 });
                                class45.field1014.method1770(var38, var26, var27, var35, -1);
                                var27 += 12;
                                class21.field540[var12] = true;
                                class204.field3686[var12] = true;
                                continue;
                            }
                        }
                        if (!class195.field3506) {
                            if (var11.field184 == 0 && var11.field118 && var23 <= class200.field3576 && var22 <= class57.field1168 && var20 > class200.field3576 && class57.field1168 < var21 && !class180.field3251) {
                                class273.field4784[0] = 1003;
                                class46.field1022[0] = class205.field3708;
                                class188.field3332[0] = class56.field1155;
                                class16.field463 = 1;
                            }
                            if (var23 <= class200.field3576 && class57.field1168 >= var22 && class200.field3576 < var20 && class57.field1168 < var21) {
                                class69.method491(class200.field3576 - var13, class57.field1168 - var14, -7, var11);
                            }
                        }
                        if (var11.field184 == 0) {
                            if (!var11.field217 && client.method1112(var11) && class229.field4162 != var11) {
                                continue;
                            }
                            if (!var11.field217) {
                                if (var11.field102 > var11.field199 - var11.field131) {
                                    var11.field102 = var11.field199 - var11.field131;
                                }
                                if (var11.field102 < 0) {
                                    var11.field102 = 0;
                                }
                            }
                            method1685(var22, arg1, var12, var20, (byte) -84, var21, var14 - var11.field102, var13 - var11.field138, var11.field222, var23);
                            if (var11.field216 != null) {
                                method1685(var22, var11.field216, var12, var20, (byte) -84, var21, var14 - var11.field102, -var11.field138 + var13, var11.field222, var23);
                            }
                            class1 var39 = (class1) class1.field15.method1698((long) var11.field222, (byte) -53);
                            if (var39 != null) {
                                if (var39.field3 == 0 && !class195.field3506 && class200.field3576 >= var23 && class57.field1168 >= var22 && var20 > class200.field3576 && class57.field1168 < var21 && !class180.field3251) {
                                    class46.field1022[0] = class205.field3708;
                                    class188.field3332[0] = class56.field1155;
                                    class16.field463 = 1;
                                    class273.field4784[0] = 1003;
                                }
                                class91.method676(var22, true, var12, var21, var13, var39.field2, var23, var20, var14);
                            }
                            class131.method936(arg9, arg0, arg3, arg5);
                            class145.method1047();
                        }
                        if (class215.field3886[var12] || class195.field3501 > 1) {
                            if (var11.field184 == 0 && !var11.field217 && var11.field131 < var11.field199) {
                                class124.method883(var11.field131, var11.field163 + var13, var11.field199, (byte) 52, var11.field102, var14);
                            }
                            if (var11.field184 != 1) {
                                if (var11.field184 == 2) {
                                    int var40 = 0;
                                    for (int var41 = 0; var41 < var11.field225; var41++) {
                                        for (int var42 = 0; var42 < var11.field98; var42++) {
                                            int var43 = (var11.field210 + 32) * var42 + var13;
                                            int var44 = (var11.field111 + 32) * var41 + var14;
                                            if (var40 < 20) {
                                                var43 += var11.field159[var40];
                                                var44 += var11.field77[var40];
                                            }
                                            if (var11.field232[var40] > 0) {
                                                boolean var46 = false;
                                                boolean var47 = false;
                                                int var48 = var11.field232[var40] - 1;
                                                if (arg9 < (var43 + 32) && arg3 > var43 && var44 + 32 > arg0 && arg5 > var44 || class4.field64 == var11 && class265.field4683 == var40) {
                                                    class90 var49;
                                                    if (class51.field1078 == 1 && client.field2867 == var40 && class25.field599 == var11.field222) {
                                                        var49 = class239.method1642((byte) -121, var11.field201[var40], var11.field190, 0, var48, 2);
                                                    } else {
                                                        var49 = class239.method1642((byte) -121, var11.field201[var40], var11.field190, 3153952, var48, 1);
                                                    }
                                                    if (class145.field2754) {
                                                        class21.field540[var12] = true;
                                                    }
                                                    if (var49 == null) {
                                                        class62.method441(-29481, var11);
                                                    } else if (class4.field64 == var11 && class265.field4683 == var40) {
                                                        int var50 = class90.field1841 - class253.field4505;
                                                        if (var50 < 5 && var50 > -5) {
                                                            var50 = 0;
                                                        }
                                                        int var51 = class6.field207 - class274.field4810;
                                                        if (var51 < 5 && var51 > -5) {
                                                            var51 = 0;
                                                        }
                                                        if (class226.field4097 < 5) {
                                                            var50 = 0;
                                                            var51 = 0;
                                                        }
                                                        var49.method671(var43 + var51, var44 + var50, 128);
                                                        if (arg8 != -1) {
                                                            class6 var52 = arg1[arg8 & 0xFFFF];
                                                            int var53 = class131.field2492;
                                                            int var54 = class131.field2491;
                                                            if ((var44 + var50) < var54 && var52.field102 > 0) {
                                                                int var55 = (var54 - var44 - var50) * class194.field3474 / 3;
                                                                if (class194.field3474 * 10 < var55) {
                                                                    var55 = class194.field3474 * 10;
                                                                }
                                                                if (var55 > var52.field102) {
                                                                    var55 = var52.field102;
                                                                }
                                                                var52.field102 -= var55;
                                                                class253.field4505 += var55;
                                                                class62.method441(-29481, var52);
                                                            }
                                                            if ((var50 + var44 + 32) > var53 && (var52.field199 - var52.field131) > var52.field102) {
                                                                int var56 = (var50 + var44 - (var53 - 32)) * class194.field3474 / 3;
                                                                if (var56 > (class194.field3474 * 10)) {
                                                                    var56 = class194.field3474 * 10;
                                                                }
                                                                if ((var52.field199 - var52.field131 - var52.field102) < var56) {
                                                                    var56 = var52.field199 - var52.field131 - var52.field102;
                                                                }
                                                                class253.field4505 -= var56;
                                                                var52.field102 += var56;
                                                                class62.method441(-29481, var52);
                                                            }
                                                        }
                                                    } else if (client.field2855 == var11 && class35.field800 == var40) {
                                                        var49.method671(var43, var44, 128);
                                                    } else {
                                                        var49.method668(var43, var44);
                                                    }
                                                }
                                            } else if (var11.field176 != null && var40 < 20) {
                                                class90 var45 = var11.method44(102, var40);
                                                if (var45 != null) {
                                                    var45.method668(var43, var44);
                                                } else if (class202.field3659) {
                                                    class62.method441(-29481, var11);
                                                }
                                            }
                                            var40++;
                                        }
                                    }
                                } else if (var11.field184 == 3) {
                                    int var57;
                                    if (class118.method845(var11, -1)) {
                                        var57 = var11.field187;
                                        if (class229.field4162 == var11 && var11.field132 != 0) {
                                            var57 = var11.field132;
                                        }
                                    } else {
                                        var57 = var11.field104;
                                        if (class229.field4162 == var11 && var11.field156 != 0) {
                                            var57 = var11.field156;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field186) {
                                            class131.method927(var13, var14, var11.field163, var11.field131, var57);
                                        } else {
                                            class131.method932(var13, var14, var11.field163, var11.field131, var57);
                                        }
                                    } else if (var11.field186) {
                                        class131.method930(var13, var14, var11.field163, var11.field131, var57, 256 - (var15 & 0xFF));
                                    } else {
                                        class131.method921(var13, var14, var11.field163, var11.field131, var57, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field184 == 4) {
                                    class259 var58 = var11.method40(-116, class238.field4294);
                                    if (var58 != null) {
                                        class86 var59 = var11.field149;
                                        int var60;
                                        if (class118.method845(var11, -1)) {
                                            var60 = var11.field187;
                                            if (class229.field4162 == var11 && var11.field132 != 0) {
                                                var60 = var11.field132;
                                            }
                                            if (var11.field169.method612((byte) 105) > 0) {
                                                var59 = var11.field169;
                                            }
                                        } else {
                                            var60 = var11.field104;
                                            if (class229.field4162 == var11 && var11.field156 != 0) {
                                                var60 = var11.field156;
                                            }
                                        }
                                        if (var11.field217 && var11.field154 != -1) {
                                            class69 var61 = class272.method1853(arg4 + 84, var11.field154);
                                            var59 = var61.field1421;
                                            if (var59 == null) {
                                                var59 = class4.field55;
                                            }
                                            if ((var61.field1390 == 1 || var11.field127 != 1) && var11.field127 != -1) {
                                                var59 = class109.method783(2, new class86[] { class90.field1833, var59, class256.field4549, class65.method459(var11.field127, true) });
                                            }
                                        }
                                        if (class162.field3045 == var11) {
                                            var59 = class41.field928;
                                            var60 = var11.field104;
                                        }
                                        if (!var11.field217) {
                                            var59 = class33.method234(var59, 61, var11);
                                        }
                                        var58.method1762(var59, var13, var14, var11.field163, var11.field131, var60, var11.field224 ? 0 : -1, var11.field109, var11.field226, var11.field208);
                                    } else if (class202.field3659) {
                                        class62.method441(-29481, var11);
                                    }
                                } else if (var11.field184 == 5) {
                                    if (var11.field217) {
                                        class90 var62;
                                        if (var11.field154 == -1) {
                                            var62 = var11.method48(false, false);
                                        } else {
                                            var62 = class239.method1642((byte) -121, var11.field127, var11.field190, var11.field141, var11.field154, var11.field203);
                                        }
                                        if (var62 != null) {
                                            int var63 = var62.field1840;
                                            int var64 = var62.field1837;
                                            if (var11.field128) {
                                                int var66 = (var63 + var11.field163 - 1) / var63;
                                                int var67 = (var64 + var11.field131 - 1) / var64;
                                                class131.method939(var13, var14, var11.field163 + var13, var11.field131 + var14);
                                                for (int var68 = 0; var68 < var66; var68++) {
                                                    for (int var69 = 0; var69 < var67; var69++) {
                                                        if (var11.field107 != 0) {
                                                            var62.method666(var64 / 2 + var64 * var69 + var14, 4096, (byte) -19, var63 * var68 + (var13 + (var63 / 2)), var11.field107);
                                                        } else if (var15 == 0) {
                                                            var62.method668(var13 + (var63 * var68), var64 * var69 + var14);
                                                        } else {
                                                            var62.method671(var63 * var68 + var13, var64 * var69 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class131.method936(arg9, arg0, arg3, arg5);
                                            } else {
                                                int var65 = var11.field163 * 4096 / var63;
                                                if (var11.field107 != 0) {
                                                    var62.method666(var11.field131 / 2 + var14, var65, (byte) -19, var11.field163 / 2 + var13, var11.field107);
                                                } else if (var15 != 0) {
                                                    var62.method664(var13, var14, var11.field163, var11.field131, 256 - (var15 & 0xFF));
                                                } else if (var11.field163 == var63 && var11.field131 == var64) {
                                                    var62.method668(var13, var14);
                                                } else {
                                                    var62.method669(var13, var14, var11.field163, var11.field131);
                                                }
                                            }
                                        } else if (class202.field3659) {
                                            class62.method441(arg4 - 29397, var11);
                                        }
                                    } else {
                                        class90 var70 = var11.method48(false, class118.method845(var11, -1));
                                        if (var70 != null) {
                                            var70.method668(var13, var14);
                                        } else if (class202.field3659) {
                                            class62.method441(-29481, var11);
                                        }
                                    }
                                } else if (var11.field184 == 6) {
                                    boolean var71 = class118.method845(var11, -1);
                                    int var72;
                                    if (var71) {
                                        var72 = var11.field142;
                                    } else {
                                        var72 = var11.field79;
                                    }
                                    int var73 = 0;
                                    class32 var74 = null;
                                    if (var11.field154 != -1) {
                                        class69 var79 = class272.method1853(0, var11.field154);
                                        if (var79 != null) {
                                            class69 var80 = var79.method494(var11.field127, 0);
                                            class122 var81 = var72 == -1 ? null : class133.method952(var72, 127);
                                            var74 = var80.method485(1, (byte) 3, var11.field119, var81);
                                            if (var74 == null) {
                                                class62.method441(arg4 - 29397, var11);
                                            } else {
                                                var73 = -var74.method233() / 2;
                                            }
                                        }
                                    } else if (var11.field162 == 5) {
                                        if (var11.field195 == -1) {
                                            var74 = class267.field4708.method503((class122) null, true, (class122) null, -1, -1);
                                        } else {
                                            int var75 = var11.field195 & 0x7FF;
                                            if (class176.field3189 == var75) {
                                                var75 = 2047;
                                            }
                                            class224 var76 = class186.field3294[var75];
                                            class122 var77 = var72 == -1 ? null : class133.method952(var72, 127);
                                            if (var76 != null && ((int) var76.field4029.method622(-2) << 11) == (var11.field195 & 0xFFFFF800)) {
                                                var74 = var76.field4019.method503(var77, true, (class122) null, var11.field119, 0);
                                            }
                                        }
                                    } else if (var72 == -1) {
                                        var74 = var11.method47(var71, -1, true, (class122) null, class124.field2412.field4019);
                                        if (var74 == null && class202.field3659) {
                                            class62.method441(-29481, var11);
                                        }
                                    } else {
                                        class122 var78 = class133.method952(var72, 127);
                                        var74 = var11.method47(var71, var11.field119, true, var78, class124.field2412.field4019);
                                        if (var74 == null && class202.field3659) {
                                            class62.method441(-29481, var11);
                                        }
                                    }
                                    if (var74 != null) {
                                        int var82;
                                        if (var11.field214 > 0) {
                                            var82 = (var11.field163 << 8) / var11.field214;
                                        } else {
                                            var82 = 256;
                                        }
                                        int var83 = (var11.field90 * var82 >> 8) + var11.field163 / 2 + var13;
                                        int var84;
                                        if (var11.field140 > 0) {
                                            var84 = (var11.field131 << 8) / var11.field140;
                                        } else {
                                            var84 = 256;
                                        }
                                        int var85 = var11.field131 / 2 + (var14 + (var11.field178 * var84 >> 8));
                                        class145.method1038(var83, var85);
                                        int var86 = class145.field2742[var11.field192] * var11.field198 >> 16;
                                        int var87 = class145.field2746[var11.field192] * var11.field198 >> 16;
                                        if (!var11.field217) {
                                            var74.method216(0, var11.field110, 0, var11.field192, 0, var87, var86);
                                        } else if (var11.field230) {
                                            ((class89) var74).method653(0, var11.field110, var11.field126, var11.field192, var11.field136, var73 + var87 + var11.field108, var11.field108 + var86, var11.field198);
                                        } else {
                                            var74.method216(0, var11.field110, var11.field126, var11.field192, var11.field136, var87 + var11.field108 + var73, var11.field108 + var86);
                                        }
                                        class145.method1030();
                                    }
                                } else {
                                    if (var11.field184 == 7) {
                                        class259 var88 = var11.method40(119, class238.field4294);
                                        if (var88 == null) {
                                            if (class202.field3659) {
                                                class62.method441(-29481, var11);
                                            }
                                            continue;
                                        }
                                        int var89 = 0;
                                        for (int var90 = 0; var90 < var11.field225; var90++) {
                                            for (int var91 = 0; var91 < var11.field98; var91++) {
                                                if (var11.field232[var89] > 0) {
                                                    class69 var92 = class272.method1853(0, var11.field232[var89] - 1);
                                                    class86 var93;
                                                    if (var92.field1390 != 1 && var11.field201[var89] == 1) {
                                                        var93 = class109.method783(2, new class86[] { class90.field1833, var92.field1421, class87.field1732 });
                                                    } else {
                                                        var93 = class109.method783(2, new class86[] { class90.field1833, var92.field1421, class256.field4549, class65.method459(var11.field201[var89], true) });
                                                    }
                                                    int var94 = (var11.field111 + 12) * var90 + var14;
                                                    int var95 = (var11.field210 + 115) * var91 + var13;
                                                    if (var11.field109 == 0) {
                                                        var88.method1772(var93, var95, var94, var11.field104, var11.field224 ? 0 : -1);
                                                    } else if (var11.field109 == 1) {
                                                        var88.method1758(var93, var95 + 57, var94, var11.field104, var11.field224 ? 0 : -1);
                                                    } else {
                                                        var88.method1770(var93, var95 + 114, var94, var11.field104, var11.field224 ? 0 : -1);
                                                    }
                                                }
                                                var89++;
                                            }
                                        }
                                    }
                                    if (var11.field184 == 8 && class38.field901 == var11 && class238.field4290 == class214.field3872) {
                                        int var96 = 0;
                                        int var97 = 0;
                                        class259 var98 = class211.field3820;
                                        class86 var99 = var11.field149;
                                        class86 var100 = class33.method234(var99, 67, var11);
                                        while (var100.method612((byte) 79) > 0) {
                                            int var108 = var100.method604(class17.field496, true);
                                            class86 var109;
                                            if (var108 == -1) {
                                                var109 = var100;
                                                var100 = class56.field1155;
                                            } else {
                                                var109 = var100.method610(0, var108, (byte) -81);
                                                var100 = var100.method633(var108 + 4, (byte) 61);
                                            }
                                            int var110 = var98.method1767(var109);
                                            if (var97 < var110) {
                                                var97 = var110;
                                            }
                                            var96 += var98.field4612 + 1;
                                        }
                                        var96 += 7;
                                        var97 += 6;
                                        int var101 = var11.field131 + var14 + 5;
                                        int var102 = var11.field163 + var13 - var97 - 5;
                                        if (var96 + var101 > arg5) {
                                            var101 = arg5 - var96;
                                        }
                                        if (var13 + 5 > var102) {
                                            var102 = var13 + 5;
                                        }
                                        if ((var102 + var97) > arg3) {
                                            var102 = arg3 - var97;
                                        }
                                        class131.method927(var102, var101, var97, var96, 16777120);
                                        class131.method932(var102, var101, var97, var96, 0);
                                        int var103 = var98.field4612 + var101 + 2;
                                        class86 var104 = var11.field149;
                                        class86 var105 = class33.method234(var104, 109, var11);
                                        while (var105.method612((byte) 60) > 0) {
                                            int var106 = var105.method604(class17.field496, true);
                                            class86 var107;
                                            if (var106 == -1) {
                                                var107 = var105;
                                                var105 = class56.field1155;
                                            } else {
                                                var107 = var105.method610(0, var106, (byte) -81);
                                                var105 = var105.method633(var106 + 4, (byte) 61);
                                            }
                                            var98.method1772(var107, var102 + 3, var103, 0, -1);
                                            var103 += var98.field4612 + 1;
                                        }
                                    }
                                    if (var11.field184 == 9) {
                                        int var111;
                                        int var112;
                                        int var113;
                                        int var114;
                                        if (var11.field228) {
                                            var111 = var13;
                                            var112 = var14;
                                            var113 = var11.field163 + var13;
                                            var114 = var11.field131 + var14;
                                        } else {
                                            var112 = var11.field131 + var14;
                                            var111 = var13;
                                            var113 = var11.field163 + var13;
                                            var114 = var14;
                                        }
                                        if (var11.field234 == 1) {
                                            class131.method937(var111, var114, var113, var112, var11.field104);
                                        } else {
                                            class131.method918(var111, var114, var113, var112, var11.field104, var11.field234);
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

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIILwj;III)V")
    public static final void method1686(int arg0, int arg1, int arg2, class6 arg3, int arg4, int arg5, int arg6) {
        field4422++;
        int var7 = arg2 * arg2 + arg4 * arg4;
        if (var7 > 360000) {
            return;
        }
        int var8 = Math.min(arg3.field163 / 2, arg3.field131 / arg5);
        if (var8 * var8 >= var7) {
            class235.method1628(arg3, arg6, arg2, -182785264, class219.field3945[arg1], arg0, arg4);
            return;
        }
        int var9 = class86.field1664 + class56.field1145 & 0x7FF;
        var8 -= 10;
        int var10 = class145.field2746[var9];
        int var11 = class145.field2742[var9];
        int var12 = var10 * 256 / (class76.field1515 + 256);
        int var13 = var11 * 256 / (class76.field1515 + 256);
        int var14 = arg2 * var13 + arg4 * var12 >> 16;
        int var15 = arg4 * var13 - (arg2 * var12) >> 16;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) ((double) var8 * Math.sin(var16));
        int var19 = (int) (Math.cos(var16) * (double) var8);
        ((class167) class108.field2076[arg1]).method713(arg3.field163 / 2 + arg0 + var18 - 10, arg3.field131 / 2 + arg6 - (var19 + 10), 20, 20, 15, 15, var16, 256);
    }
}
