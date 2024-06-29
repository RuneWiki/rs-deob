import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class27 extends class16 {

    @OriginalMember(owner = "client!ln", name = "Q", descriptor = "I")
    private int field384 = 0;

    @OriginalMember(owner = "client!ln", name = "T", descriptor = "I")
    private int field387 = 1365;

    @OriginalMember(owner = "client!ln", name = "V", descriptor = "I")
    private int field389 = 20;

    @OriginalMember(owner = "client!ln", name = "ab", descriptor = "I")
    private int field394 = 0;

    @OriginalMember(owner = "client!ln", name = "R", descriptor = "Ljava/lang/String;")
    public static String field385 = "wave2:";

    @OriginalMember(owner = "client!ln", name = "W", descriptor = "Z")
    public static boolean field390 = false;

    @OriginalMember(owner = "client!ln", name = "X", descriptor = "[[I")
    public static int[][] field391 = new int[5][5000];

    @OriginalMember(owner = "client!ln", name = "bb", descriptor = "Lnf;")
    public static class73 field395 = null;

    @OriginalMember(owner = "client!ln", name = "db", descriptor = "Lok;")
    public static class160 field397 = null;

    @OriginalMember(owner = "client!ln", name = "S", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!ln", name = "U", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!ln", name = "Y", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!ln", name = "Z", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!ln", name = "cb", descriptor = "[I")
    public static int[] field396;

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "()V", line = 5)
    public class27() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "(I)V", line = 10)
    public static void method184(int arg0) {
        field391 = (int[][]) null;
        if (arg0 == 104) {
            field385 = null;
            field396 = null;
            field397 = null;
            field395 = null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(ZI)[I", line = 24)
    public final int[] method8(boolean arg0, int arg1) {
        field386++;
        int[] var3 = this.field207.method1784(arg1, (byte) 102);
        if (!arg0) {
            return (int[]) null;
        }
        if (this.field207.field4024) {
            for (int var4 = 0; var4 < class276.field4376; var4++) {
                int var5 = (field396[var4] << 12) / this.field387 + this.field384;
                int var6 = (class130.field1921[arg1] << 12) / this.field387 + this.field394;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while ((var11 + var12) < 16384 && var13 < this.field389) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = var11 + var7 - var12;
                    var13++;
                    var11 = var9 * var9 >> 12;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = var13 < (this.field389 - 1) ? (var13 << 12) / this.field389 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(BLim;I)V", line = 88)
    public final void method52(byte arg0, class192 arg1, int arg2) {
        field392++;
        if (arg0 != -7) {
            method185((byte) -15);
        }
        if (arg2 == 0) {
            this.field387 = arg1.method1396(-82);
        } else if (arg2 == 1) {
            this.field389 = arg1.method1396(-125);
        } else if (arg2 == 2) {
            this.field384 = arg1.method1396(-95);
        } else if (arg2 == 3) {
            this.field394 = arg1.method1396(-63);
        }
    }

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "(B)V", line = 171)
    public static final void method185(byte arg0) {
        field393++;
        if (class35.field459 == 40) {
            int var1 = class336.field5213.method1399(arg0 ^ 0xBA1EC06A);
            int var2 = ((var1 & 0x70) >> 4) + class291.field4580;
            int var3 = (var1 & 0x7) + class97.field1480;
            int var4 = class336.field5213.method1396(-66);
            int var5 = class336.field5213.method1396(-31);
            int var6 = class336.field5213.method1396(-89);
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class256 var7 = class116.field1745[class148.field2209][var2][var3];
                if (var7 != null) {
                    for (class209 var8 = (class209) var7.method1807((byte) 71); var8 != null; var8 = (class209) var7.method1808(18051)) {
                        class24 var9 = var8.field3414;
                        if ((var4 & 0x7FFF) == var9.field342 && var9.field338 == var5) {
                            var9.field338 = var6;
                            break;
                        }
                    }
                    class90.method651(var3, var2, 13);
                }
            }
            return;
        }
        if (class35.field459 == 104) {
            int var10 = class336.field5213.method1394(false);
            int var11 = class336.field5213.method1399(-1172389784);
            int var12 = var11 >> 2;
            int var13 = var11 & 0x3;
            byte var14 = class336.field5213.method1398(-2886);
            byte var15 = class336.field5213.method1377(true);
            int var16 = class336.field5213.method1407(true);
            int var17 = (var16 & 0x7) + class97.field1480;
            int var18 = (var16 >> 4 & 0x7) + class291.field4580;
            byte var19 = class336.field5213.method1385(true);
            int var20 = class336.field5213.method1389(arg0 + 114);
            int var21 = class336.field5213.method1394(false);
            int var22 = class336.field5213.method1384(2104932360);
            byte var23 = class336.field5213.method1385(true);
            if (!class186.field2991) {
                class249.method1764(var13, var20, var18, var19, var10, var22, -98, var15, var21, var12, var17, var23, var14);
            }
        }
        if (class35.field459 == 60) {
            int var24 = class336.field5213.method1357(true);
            int var25 = class336.field5213.method1397((byte) -118);
            int var26 = (var25 >> 4 & 0x7) + class291.field4580;
            int var27 = (var25 & 0x7) + class97.field1480;
            int var28 = class336.field5213.method1394(false);
            if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104) {
                class24 var29 = new class24();
                var29.field338 = var24;
                var29.field342 = var28;
                if (class116.field1745[class148.field2209][var26][var27] == null) {
                    class116.field1745[class148.field2209][var26][var27] = new class256();
                }
                class116.field1745[class148.field2209][var26][var27].method1815((byte) 46, new class209(var29));
                class90.method651(var27, var26, 123);
            }
        } else if (class35.field459 == 201) {
            int var154 = class336.field5213.method1396(-53);
            int var155 = class336.field5213.method1399(arg0 ^ 0xBA1EC06A);
            class291.method2043(var154, 23006).method1040(var155, (byte) 40);
        } else if (class35.field459 == 75) {
            int var30 = class336.field5213.method1396(arg0 - 121);
            int var31 = class336.field5213.method1396(-119);
            int var32 = class336.field5213.method1394(false);
            int var33 = class336.field5213.method1407(true);
            int var34 = ((var33 & 0x72) >> 4) + class291.field4580;
            int var35 = (var33 & 0x7) + class97.field1480;
            if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104 && class254.field4032 != var30) {
                class24 var36 = new class24();
                var36.field338 = var32;
                var36.field342 = var31;
                if (class116.field1745[class148.field2209][var34][var35] == null) {
                    class116.field1745[class148.field2209][var34][var35] = new class256();
                }
                class116.field1745[class148.field2209][var34][var35].method1815((byte) -26, new class209(var36));
                class90.method651(var35, var34, arg0 ^ 0xFFFFFF86);
            }
        } else {
            if (arg0 != 2) {
                method184(-49);
            }
            if (class35.field459 == 239) {
                int var136 = class336.field5213.method1399(-1172389784);
                int var137 = (var136 >> 4 & 0x7) + class291.field4580;
                int var138 = (var136 & 0x7) + class97.field1480;
                int var139 = var137 + class336.field5213.method1377(true);
                int var140 = class336.field5213.method1377(true) + var138;
                int var141 = class336.field5213.method1389(110);
                int var142 = class336.field5213.method1396(arg0 ^ 0xFFFFFF85);
                int var143 = class336.field5213.method1399(-1172389784) * 4;
                int var144 = class336.field5213.method1399(-1172389784) * 4;
                int var145 = class336.field5213.method1396(-45);
                int var146 = class336.field5213.method1396(-72);
                int var147 = class336.field5213.method1399(-1172389784);
                if (var147 == 255) {
                    var147 = -1;
                }
                int var148 = class336.field5213.method1399(-1172389784);
                if (var137 >= 0 && var138 >= 0 && var137 < 104 && var138 < 104 && var139 >= 0 && var140 >= 0 && var139 < 104 && var140 < 104 && var142 != 65535) {
                    int var149 = var140 * 128 + 64;
                    int var150 = var138 * 128 + 64;
                    int var151 = var137 * 128 + 64;
                    class88 var152 = new class88(var142, class148.field2209, var151, var150, class227.method1653(var151, var150, -12282, class148.field2209) - var143, class48.field648 + var145, class48.field648 + var146, var147, var148, var141, var144);
                    int var153 = var139 * 128 + 64;
                    var152.method637(class227.method1653(var153, var149, arg0 - 12284, class148.field2209) - var144, class48.field648 + var145, (byte) -97, var149, var153);
                    class64.field835.method1815((byte) 28, new class119(var152));
                }
            } else if (class35.field459 == 168) {
                int var128 = class336.field5213.method1384(2104932360);
                if (var128 == 65535) {
                    var128 = -1;
                }
                int var129 = class336.field5213.method1399(-1172389784);
                int var130 = ((var129 & 0x74) >> 4) + class291.field4580;
                int var131 = (var129 & 0x7) + class97.field1480;
                int var132 = class336.field5213.method1393(arg0 ^ 0x1);
                int var133 = var132 >> 2;
                int var134 = class208.field3411[var133];
                int var135 = var132 & 0x3;
                class224.method1634(var131, var135, var128, class148.field2209, (byte) -98, var134, var133, var130);
            } else if (class35.field459 == 53) {
                int var110 = class336.field5213.method1399(-1172389784);
                int var111 = ((var110 & 0xFE) >> 4) + class291.field4580 * 2;
                int var112 = (var110 & 0xF) + class97.field1480 * 2;
                int var113 = class336.field5213.method1377(true) + var111;
                int var114 = class336.field5213.method1377(true) + var112;
                int var115 = class336.field5213.method1389(arg0 + 107);
                int var116 = class336.field5213.method1396(-94);
                int var117 = class336.field5213.method1399(-1172389784) * 4;
                int var118 = class336.field5213.method1399(arg0 ^ 0xBA1EC06A) * 4;
                int var119 = class336.field5213.method1396(-22);
                int var120 = class336.field5213.method1396(-123);
                int var121 = class336.field5213.method1399(-1172389784);
                int var122 = class336.field5213.method1399(-1172389784);
                if (var121 == 255) {
                    var121 = -1;
                }
                if (var111 >= 0 && var112 >= 0 && var111 < 208 && var112 < 208 && var113 >= 0 && var114 >= 0 && var113 < 208 && var114 < 208 && var116 != 65535) {
                    int var123 = var114 * 64;
                    int var124 = var112 * 64;
                    int var125 = var111 * 64;
                    class88 var126 = new class88(var116, class148.field2209, var125, var124, class227.method1653(var125, var124, -12282, class148.field2209) - var117, var119 - -class48.field648, class48.field648 + var120, var121, var122, var115, var118);
                    int var127 = var113 * 64;
                    var126.method637(class227.method1653(var127, var123, -12282, class148.field2209) - var118, class48.field648 + var119, (byte) -104, var123, var127);
                    class64.field835.method1815((byte) -124, new class119(var126));
                }
            } else if (class35.field459 == 99) {
                int var103 = class336.field5213.method1397((byte) -120);
                int var104 = var103 & 0x3;
                int var105 = var103 >> 2;
                int var106 = class208.field3411[var105];
                int var107 = class336.field5213.method1407(true);
                int var108 = ((var107 & 0x75) >> 4) + class291.field4580;
                int var109 = class97.field1480 + (var107 & 0x7);
                if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104) {
                    class290.method2038(0, var108, var109, (byte) -45, var105, class148.field2209, -1, -1, var104, var106);
                }
            } else if (class35.field459 == 229) {
                int var37 = class336.field5213.method1396(-115);
                int var38 = class336.field5213.method1397((byte) -119);
                int var39 = (var38 & 0x7) + class97.field1480;
                int var40 = ((var38 & 0x7B) >> 4) + class291.field4580;
                if (var40 >= 0 && var39 >= 0 && var40 < 104 && var39 < 104) {
                    class256 var41 = class116.field1745[class148.field2209][var40][var39];
                    if (var41 != null) {
                        for (class209 var42 = (class209) var41.method1807((byte) 19); var42 != null; var42 = (class209) var41.method1808(18051)) {
                            if ((var37 & 0x7FFF) == var42.field3414.field342) {
                                var42.method465((byte) -122);
                                break;
                            }
                        }
                        if (var41.method1807((byte) 83) == null) {
                            class116.field1745[class148.field2209][var40][var39] = null;
                        }
                        class90.method651(var39, var40, -110);
                    }
                }
            } else if (class35.field459 == 165) {
                int var43 = class336.field5213.method1399(arg0 - 1172389786);
                int var44 = ((var43 & 0x77) >> 4) + class291.field4580;
                int var45 = (var43 & 0x7) + class97.field1480;
                int var46 = class336.field5213.method1396(-117);
                int var47 = class336.field5213.method1399(-1172389784);
                int var48 = class336.field5213.method1396(-64);
                if (var44 >= 0 && var45 >= 0 && var44 < 104 && var45 < 104) {
                    int var49 = var45 * 128 + 64;
                    int var50 = var44 * 128 + 64;
                    class282 var51 = new class282(var46, class148.field2209, var50, var49, class227.method1653(var50, var49, arg0 ^ 0xFFFFD004, class148.field2209) - var47, var48, class48.field648);
                    class136.field2049.method1815((byte) -27, new class323(var51));
                }
            } else if (class35.field459 == 220) {
                int var52 = class336.field5213.method1399(-1172389784);
                int var53 = (var52 & 0x7) + class97.field1480;
                int var54 = ((var52 & 0x7B) >> 4) + class291.field4580;
                int var55 = class336.field5213.method1396(-66);
                if (var55 == 65535) {
                    var55 = -1;
                }
                int var56 = class336.field5213.method1399(arg0 ^ 0xBA1EC06A);
                int var57 = (var56 & 0xF2) >> 4;
                int var58 = class336.field5213.method1399(-1172389784);
                int var59 = var56 & 0x7;
                int var60 = class336.field5213.method1399(arg0 ^ 0xBA1EC06A);
                if (var54 >= 0 && var53 >= 0 && var54 < 104 && var53 < 104) {
                    int var61 = var57 + 1;
                    if (var54 - var61 <= class13.field159.field1969[0] && class13.field159.field1969[0] <= var54 + var61 && class13.field159.field2006[0] >= var53 - var61 && class13.field159.field2006[0] <= (var53 + var61) && class139.field2076 != 0 && var59 > 0 && class126.field1879 < 50 && var55 != -1) {
                        class315.field4900[class126.field1879] = var55;
                        class66.field855[class126.field1879] = var59;
                        class228.field3618[class126.field1879] = var58;
                        class343.field5353[class126.field1879] = null;
                        class336.field5218[class126.field1879] = (var53 << 8) + (var54 << 16) + var57;
                        class152.field2328[class126.field1879] = var60;
                        class126.field1879++;
                    }
                }
            } else if (class35.field459 == 134) {
                int var70 = class336.field5213.method1399(-1172389784);
                int var71 = ((var70 & 0xF8) >> 4) + class291.field4580 * 2;
                int var72 = (var70 & 0xF) + class97.field1480 * 2;
                int var73 = class336.field5213.method1377(true) + var71;
                int var74 = class336.field5213.method1377(true) + var72;
                int var75 = class336.field5213.method1389(arg0 ^ 0x61);
                int var76 = class336.field5213.method1389(99);
                int var77 = class336.field5213.method1396(arg0 - 107);
                int var78 = class336.field5213.method1377(true);
                int var79 = class336.field5213.method1399(arg0 ^ 0xBA1EC06A) * 4;
                int var80 = class336.field5213.method1396(-43);
                int var81 = class336.field5213.method1396(-60);
                int var82 = class336.field5213.method1399(-1172389784);
                int var83 = class336.field5213.method1399(arg0 - 1172389786);
                if (var82 == 255) {
                    var82 = -1;
                }
                if (var71 >= 0 && var72 >= 0 && var71 < 208 && var72 < 208 && var73 >= 0 && var74 >= 0 && var73 < 208 && var74 < 208 && var77 != 65535) {
                    int var84 = var71 * 64;
                    int var85 = var73 * 64;
                    int var86 = var72 * 64;
                    if (var75 != 0) {
                        class132 var89;
                        int var90;
                        if (var75 >= 0) {
                            int var87 = var75 - 1;
                            int var88 = var87 & 0x7FF;
                            var89 = class297.field4657[var88];
                            var90 = (var87 & 0x79A1) >> 11;
                        } else {
                            int var91 = -var75 - 1;
                            int var92 = var91 & 0x7FF;
                            var90 = (var91 & 0x7FE3) >> 11;
                            if (class254.field4032 == var92) {
                                var89 = class13.field159;
                            } else {
                                var89 = class100.field1523[var92];
                            }
                        }
                        if (var89 != null) {
                            class206 var93 = var89.method899(true);
                            if (var93.field3370 != null && var93.field3370[var90] != null) {
                                var78 -= var93.field3370[var90][1];
                                int var94 = var93.field3370[var90][0];
                                int var95 = var93.field3370[var90][2];
                                int var96 = class25.field359[var89.field2037];
                                int var97 = class25.field355[var89.field2037];
                                int var98 = var94 * var96 + var95 * var97 >> 16;
                                int var99 = var95 * var96 - (var94 * var97) >> 16;
                                var86 += var99;
                                var84 += var98;
                            }
                        }
                    }
                    int var101 = var74 * 64;
                    class88 var102 = new class88(var77, class148.field2209, var84, var86, class227.method1653(var84, var86, arg0 ^ 0xFFFFD004, class148.field2209) - var78, var80 - -class48.field648, var81 + class48.field648, var82, var83, var76, var79);
                    var102.method637(class227.method1653(var85, var101, -12282, class148.field2209) - var79, class48.field648 + var80, (byte) -98, var101, var85);
                    class64.field835.method1815((byte) 82, new class119(var102));
                }
            } else if (class35.field459 == 153) {
                int var62 = class336.field5213.method1399(-1172389784);
                int var63 = class97.field1480 + (var62 & 0x7);
                int var64 = ((var62 & 0x77) >> 4) + class291.field4580;
                int var65 = class336.field5213.method1393(3);
                int var66 = var65 & 0x3;
                int var67 = var65 >> 2;
                int var68 = class208.field3411[var67];
                int var69 = class336.field5213.method1396(-62);
                if (var64 >= 0 && var63 >= 0 && var64 < 104 && var63 < 104) {
                    class290.method2038(0, var64, var63, (byte) -125, var67, class148.field2209, -1, var69, var66, var68);
                }
            }
        }
    }
}
