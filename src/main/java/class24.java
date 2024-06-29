import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class24 implements class233 {

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public int field440;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public int field433;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public int field443;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public int field439;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public int field436;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public int field435;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public int field438;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
    public int field447;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public int field434;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "Loea;")
    public class599 field444;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "Ljava/lang/String;")
    public String field445;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    public int field446;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "Leha;")
    public class91 field442;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "J")
    public static long field441 = -1L;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "Lkg;")
    public static class275 field448 = new class275(117, 6);

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "Z")
    public static boolean field449 = false;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V", line = 14)
    public static void method167(byte arg0) {
        field448 = null;
        int var1 = 41 % ((-arg0 - 69) / 53);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lcha;B)V", line = 25)
    public static final void method168(class220 arg0, byte arg1) {
        field432++;
        if (class643.field8919 == arg0) {
            int var2 = class609.field8448.method2600((byte) -126);
            int var3 = (var2 & 0x7) + class118.field1732;
            int var4 = var3 + class447.field5936;
            int var5 = ((var2 & 0x7B) >> 4) + class90.field1245;
            int var6 = class332.field4232 + var5;
            int var7 = class609.field8448.method2617((byte) 97);
            class133 var8 = (class133) class342.field4322.method1160((long) (var6 | var4 << 14 | class35.field556 << 28), 121);
            if (var8 != null) {
                for (class182 var9 = (class182) var8.field1923.method3672(-1); var9 != null; var9 = (class182) var8.field1923.method3662(arg1 + 84)) {
                    if ((var7 & 0x7FFF) == var9.field2543) {
                        var9.method1175(-2);
                        break;
                    }
                }
                if (var8.field1923.method3667((byte) -45)) {
                    var8.method1175(-2);
                }
                if (var5 >= 0 && var3 >= 0 && var5 < class409.field5183 && class543.field7597 > var3) {
                    class220.method1429(var3, class35.field556, var5, (byte) -16);
                }
            }
        } else if (class262.field3313 == arg0) {
            int var10 = class609.field8448.method2600((byte) -128);
            int var11 = (var10 >> 4 & 0x7) + class90.field1245;
            int var12 = (var10 & 0x7) + class118.field1732;
            int var13 = class609.field8448.method2566(-2);
            if (var13 == 65535) {
                var13 = -1;
            }
            int var14 = class609.field8448.method2600((byte) -126);
            int var15 = var14 >> 4 & 0xF;
            int var16 = var14 & 0x7;
            int var17 = class609.field8448.method2600((byte) -126);
            int var18 = class609.field8448.method2600((byte) -125);
            int var19 = class609.field8448.method2566(-2);
            if (var11 >= 0 && var12 >= 0 && var11 < class409.field5183 && class543.field7597 > var12) {
                int var20 = var15 + 1;
                if (class380.field4847.field264[0] >= var11 - var20 && (var11 + var20) >= class380.field4847.field264[0] && class380.field4847.field260[0] >= var12 - var20 && var12 + var20 >= class380.field4847.field260[0]) {
                    class104.method824(var13, var19, (byte) 1, var18, var16, (class35.field556 << 24) + var15 - (-(var11 << 16) - (var12 << 8)), var17);
                }
            }
        } else if (class83.field1135 == arg0) {
            int var21 = class609.field8448.method2600((byte) -123);
            boolean var22 = (var21 & 0x80) != 0;
            int var23 = (var21 >> 3 & 0x7) + class90.field1245;
            int var24 = class118.field1732 + (var21 & 0x7);
            int var25 = class609.field8448.method2601(arg1 ^ 0xFFFFFFAB) + var23;
            int var26 = var24 + class609.field8448.method2601(arg1 ^ 0xFFFFFFAB);
            int var27 = class609.field8448.method2577(2);
            int var28 = class609.field8448.method2566(-2);
            int var29 = class609.field8448.method2600((byte) -124) * 4;
            int var30 = class609.field8448.method2600((byte) -126) * 4;
            int var31 = class609.field8448.method2566(arg1 ^ 0x55);
            int var32 = class609.field8448.method2566(-2);
            int var33 = class609.field8448.method2600((byte) -123);
            if (var33 == 255) {
                var33 = -1;
            }
            int var34 = class609.field8448.method2566(-2);
            if (var23 >= 0 && var24 >= 0 && class409.field5183 > var23 && class543.field7597 > var24 && var25 >= 0 && var26 >= 0 && class409.field5183 > var25 && class543.field7597 > var26 && var28 != 65535) {
                int var35 = var29 << 2;
                int var36 = var30 << 2;
                int var37 = var23 * 512 + 256;
                int var38 = var24 * 512 + 256;
                int var39 = var25 * 512 + 256;
                int var40 = var34 << 2;
                int var41 = var26 * 512 + 256;
                class459 var42 = new class459(var28, class35.field556, class35.field556, var37, var38, var35, class463.field6224 + var31, class463.field6224 + var32, var33, var40, 0, var27, var36, var22, -1);
                var42.method2557(var39, var41, (byte) -93, class463.field6224 + var31, -var36 + class225.method1448(class35.field556, var39, var41, (byte) 28));
                class207.field2744.method3671(new class196(var42), false);
            }
        } else if (class104.field1426 == arg0) {
            int var43 = class609.field8448.method2617((byte) 105);
            class543 var44 = client.field3995.method3384(var43, false);
            int var45 = class609.field8448.method2629(-108);
            int var46 = class609.field8448.method2629(-119);
            int var47 = ((var46 & 0x7F) >> 4) + class90.field1245;
            int var48 = (var46 & 0x7) + class118.field1732;
            int var49 = class609.field8448.method2600((byte) -126);
            int var50 = var49 >> 2;
            int var51 = class119.field1742[var50];
            if (var50 == 11) {
                var50 = 10;
            }
            int var52 = 0;
            if (var44.field7518 != null) {
                int var53 = -1;
                for (int var54 = 0; var54 < var44.field7518.length; var54++) {
                    if (var44.field7518[var54] == var50) {
                        var53 = var54;
                        break;
                    }
                }
                var52 = var44.field7528[var53].length;
            }
            int var55 = 0;
            if (var44.field7527 != null) {
                var55 = var44.field7527.length;
            }
            int var56 = 0;
            if (var44.field7571 != null) {
                var56 = var44.field7571.length;
            }
            if ((var45 & 0x1) == 1) {
                class154.method1073(var47, var51, null, var48, 2, class35.field556);
            } else {
                int[] var57 = null;
                if ((var45 & 0x2) == 2) {
                    var57 = new int[var52];
                    for (int var58 = 0; var58 < var52; var58++) {
                        var57[var58] = class609.field8448.method2566(class386.method2198(arg1, 85));
                    }
                }
                short[] var59 = null;
                if ((var45 & 0x4) == 4) {
                    var59 = new short[var55];
                    for (int var60 = 0; var60 < var55; var60++) {
                        var59[var60] = (short) class609.field8448.method2566(-2);
                    }
                }
                short[] var61 = null;
                if ((var45 & 0x8) == 8) {
                    var61 = new short[var56];
                    for (int var62 = 0; var62 < var56; var62++) {
                        var61[var62] = (short) class609.field8448.method2566(-2);
                    }
                }
                class154.method1073(var47, var51, new class456((long) (class216.field2923++), var57, var59, var61), var48, 2, class35.field556);
            }
        } else if (class299.field3932 == arg0) {
            int var63 = class609.field8448.method2600((byte) -128);
            int var64 = var63 >> 2;
            int var65 = var63 & 0x3;
            int var66 = class119.field1742[var64];
            int var67 = class609.field8448.method2606((byte) -103);
            int var68 = ((var67 & 0x75) >> 4) + class90.field1245;
            int var69 = class118.field1732 + (var67 & 0x7);
            if (class303.method1807(13904, class547.field7642) || var68 >= 0 && var69 >= 0 && var68 < class409.field5183 && var69 < class543.field7597) {
                class320.method1882(-1, var65, var68, var69, (byte) -41, var66, class35.field556, var64);
            }
        } else if (class428.field5734 == arg0) {
            int var70 = class609.field8448.method2629(-77);
            int var71 = var70 >> 2;
            int var72 = var70 & 0x3;
            int var73 = class119.field1742[var71];
            int var74 = class609.field8448.method2617((byte) 69);
            int var75 = class609.field8448.method2629(-121);
            int var76 = (var75 >> 4 & 0x7) + class90.field1245;
            int var77 = (var75 & 0x7) + class118.field1732;
            if (class303.method1807(13904, class547.field7642) || var76 >= 0 && var77 >= 0 && var76 < class409.field5183 && var77 < class543.field7597) {
                class320.method1882(var74, var72, var76, var77, (byte) -41, var73, class35.field556, var71);
            }
        } else if (class732.field10184 == arg0) {
            class609.field8448.method2600((byte) -125);
            int var78 = class609.field8448.method2600((byte) -127);
            int var79 = (var78 >> 4 & 0x7) + class90.field1245;
            int var80 = (var78 & 0x7) + class118.field1732;
            int var81 = class609.field8448.method2566(-2);
            int var82 = class609.field8448.method2600((byte) -127);
            int var83 = class609.field8448.method2576((byte) 41);
            String var84 = class609.field8448.method2574(-1);
            class573.method3283(var80, var83, var82, var81, var79, class35.field556, var84, (byte) -120);
        } else if (class232.field3049 == arg0) {
            int var85 = class609.field8448.method2566(-2);
            int var86 = class609.field8448.method2600((byte) -127);
            client.field3995.method3384(var85, false).method3124(var86, (byte) 67);
        } else if (class106.field1529 == arg0) {
            int var87 = class609.field8448.method2600((byte) -128);
            int var88 = ((var87 & 0x7B) >> 4) + class90.field1245;
            int var89 = class118.field1732 + (var87 & 0x7);
            int var90 = class609.field8448.method2566(-2);
            if (var90 == 65535) {
                var90 = -1;
            }
            int var91 = class609.field8448.method2600((byte) -126);
            int var92 = var91 >> 4 & 0xF;
            int var93 = var91 & 0x7;
            int var94 = class609.field8448.method2600((byte) -124);
            int var95 = class609.field8448.method2600((byte) -123);
            int var96 = class609.field8448.method2566(-2);
            if (var88 >= 0 && var89 >= 0 && var88 < class409.field5183 && class543.field7597 > var89) {
                int var97 = var92 + 1;
                if (class380.field4847.field264[0] >= var88 - var97 && class380.field4847.field264[0] <= (var88 + var97) && (var89 - var97) <= class380.field4847.field260[0] && (var89 + var97) >= class380.field4847.field260[0]) {
                    class286.method1700(false, var96, false, var95, var94, var93, var90, (var89 << 8) + (class35.field556 << 24) + (var88 << 16) + var92);
                }
            }
        } else if (class602.field8366 == arg0) {
            int var98 = class609.field8448.method2600((byte) -128);
            int var99 = ((var98 & 0x7A) >> 4) + class90.field1245;
            int var100 = (var98 & 0x7) + class118.field1732;
            int var101 = class609.field8448.method2566(arg1 ^ 0x55);
            if (var101 == 65535) {
                var101 = -1;
            }
            int var102 = class609.field8448.method2629(-94);
            int var103 = var102 >> 2;
            int var104 = var102 & 0x3;
            int var105 = class119.field1742[var103];
            class293.method1758(var100, var104, var101, -54, var105, class35.field556, var103, var99);
        } else if (class182.field2546 == arg0) {
            int var106 = class609.field8448.method2600((byte) -127);
            int var107 = (var106 >> 4 & 0xF) + class90.field1245 * 2;
            int var108 = (var106 & 0xF) + class118.field1732 * 2;
            int var109 = class609.field8448.method2600((byte) -125);
            boolean var110 = (var109 & 0x1) != 0;
            boolean var111 = (var109 & 0x2) != 0;
            int var112 = var111 ? var109 >> 2 : -1;
            int var113 = class609.field8448.method2601(0) + var107;
            int var114 = class609.field8448.method2601(arg1 + 85) + var108;
            int var115 = class609.field8448.method2577(arg1 + 87);
            int var116 = class609.field8448.method2577(2);
            int var117 = class609.field8448.method2566(-2);
            int var118 = class609.field8448.method2600((byte) -124);
            int var119;
            if (var111) {
                var119 = (byte) var118;
            } else {
                var119 = var118 * 4;
            }
            int var120 = class609.field8448.method2600((byte) -127) * 4;
            int var121 = class609.field8448.method2566(-2);
            int var122 = class609.field8448.method2566(-2);
            int var123 = class609.field8448.method2600((byte) -124);
            int var124 = class609.field8448.method2566(-2);
            if (var123 == 255) {
                var123 = -1;
            }
            if (var107 >= 0 && var108 >= 0 && var107 < (class409.field5183 * 2) && var108 < (class409.field5183 * 2) && var113 >= 0 && var114 >= 0 && class543.field7597 * 2 > var113 && (class543.field7597 * 2) > var114 && var117 != 65535) {
                int var125 = var113 * 256;
                int var126 = var119 << 2;
                int var127 = var120 << 2;
                int var128 = var124 << 2;
                int var129 = var108 * 256;
                int var130 = var107 * 256;
                int var131 = var114 * 256;
                if (var115 != 0 && var112 != -1) {
                    class13 var132 = null;
                    if (var115 >= 0) {
                        int var133 = var115 - 1;
                        class592 var134 = (class592) class207.field2745.method1160((long) var133, 120);
                        if (var134 != null) {
                            var132 = var134.field8280;
                        }
                    } else {
                        int var135 = -var115 - 1;
                        if (class54.field755 == var135) {
                            var132 = class380.field4847;
                        } else {
                            var132 = class5.field49[var135];
                        }
                    }
                    if (var132 != null) {
                        class738 var136 = var132.method94((byte) 95);
                        if (var136.field10290 != null && var136.field10290[var112] != null) {
                            var126 -= var136.field10290[var112][1];
                        }
                        if (var136.field10240 != null && var136.field10240[var112] != null) {
                            var126 -= var136.field10240[var112][1];
                        }
                    }
                }
                class459 var137 = new class459(var117, class35.field556, class35.field556, var130, var129, var126, class463.field6224 + var121, class463.field6224 + var122, var123, var128, var115, var116, var127, var110, var112);
                var137.method2557(var125, var131, (byte) -66, class463.field6224 + var121, -var127 + class225.method1448(class35.field556, var125, var131, (byte) 28));
                class207.field2744.method3671(new class196(var137), false);
            }
        } else if (class391.field4977 == arg0) {
            int var138 = class609.field8448.method2600((byte) -125);
            int var139 = ((var138 & 0x70) >> 4) + class90.field1245;
            int var140 = (var138 & 0x7) + class118.field1732;
            int var141 = class609.field8448.method2566(-2);
            int var142 = class609.field8448.method2600((byte) -128);
            int var143 = class609.field8448.method2566(-2);
            int var144 = class609.field8448.method2600((byte) -128);
            if (var139 >= 0 && var140 >= 0 && class409.field5183 > var139 && class543.field7597 > var140) {
                int var145 = var139 * 512 + 256;
                int var146 = var140 * 512 + 256;
                int var147 = class35.field556;
                if (var147 < 3 && class99.method797(var140, 1, var139)) {
                    var147++;
                }
                class163 var148 = new class163(var141, var143, class463.field6224, class35.field556, var147, var145, class225.method1448(class35.field556, var145, var146, (byte) 28) - var142, var146, var139, var139, var140, var140, var144);
                class368.field4759.method3671(new class360(var148), false);
            }
        } else if (arg1 == -85) {
            if (class379.field4837 == arg0) {
                int var149 = class609.field8448.method2566(-2);
                int var150 = class609.field8448.method2600((byte) -128);
                int var151 = (var150 & 0x7) + class118.field1732;
                int var152 = class447.field5936 + var151;
                int var153 = ((var150 & 0x78) >> 4) + class90.field1245;
                int var154 = class332.field4232 + var153;
                int var155 = class609.field8448.method2595((byte) 99);
                boolean var156 = var153 >= 0 && var151 >= 0 && class409.field5183 > var153 && var151 < class543.field7597;
                if (var156 || class303.method1807(arg1 ^ 0xFFFFC9FB, class547.field7642)) {
                    class426.method2447(var154, class35.field556, new class182(var155, var149), false, var152);
                    if (var156) {
                        class220.method1429(var151, class35.field556, var153, (byte) -16);
                    }
                }
            } else if (class349.field4498 == arg0) {
                int var157 = class609.field8448.method2600((byte) -128);
                int var158 = (var157 & 0x7) + class118.field1732;
                int var159 = class447.field5936 + var158;
                int var160 = (var157 >> 4 & 0x7) + class90.field1245;
                int var161 = class332.field4232 + var160;
                int var162 = class609.field8448.method2566(-2);
                int var163 = class609.field8448.method2566(-2);
                int var164 = class609.field8448.method2566(-2);
                if (class342.field4322 != null) {
                    class133 var165 = (class133) class342.field4322.method1160((long) (var161 | class35.field556 << 28 | var159 << 14), 119);
                    if (var165 != null) {
                        for (class182 var166 = (class182) var165.field1923.method3672(-1); var166 != null; var166 = (class182) var165.field1923.method3662(-1)) {
                            if ((var162 & 0x7FFF) == var166.field2543 && var166.field2544 == var163) {
                                var166.method1175(-2);
                                var166.field2544 = var164;
                                class426.method2447(var161, class35.field556, var166, false, var159);
                                break;
                            }
                        }
                        if (var160 >= 0 && var158 >= 0 && var160 < class409.field5183 && class543.field7597 > var158) {
                            class220.method1429(var158, class35.field556, var160, (byte) -16);
                        }
                    }
                }
            } else if (class543.field7503 == arg0) {
                int var167 = class609.field8448.method2617((byte) 93);
                int var168 = class609.field8448.method2566(-2);
                int var169 = class609.field8448.method2606((byte) -103);
                int var170 = (var169 & 0x7) + class118.field1732;
                int var171 = class447.field5936 + var170;
                int var172 = (var169 >> 4 & 0x7) + class90.field1245;
                int var173 = var172 + class332.field4232;
                int var174 = class609.field8448.method2566(-2);
                if (class54.field755 != var174) {
                    boolean var175 = var172 >= 0 && var170 >= 0 && var172 < class409.field5183 && var170 < class543.field7597;
                    if (var175 || class303.method1807(arg1 + 13989, class547.field7642)) {
                        class426.method2447(var173, class35.field556, new class182(var168, var167), false, var171);
                        if (var175) {
                            class220.method1429(var170, class35.field556, var172, (byte) -16);
                        }
                    }
                }
            } else {
                class684.method3842(1, null, "T3 - " + arg0);
                class98.method785((byte) -123, false);
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)Lhm;", line = 743)
    public final class223 method29(int arg0) {
        field437++;
        if (arg0 != -200) {
            this.field435 = -96;
        }
        return class521.field7308;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Ljava/lang/String;Leha;Loea;IIIIIIIIII)V", line = 758)
    public class24(String arg0, class91 arg1, class599 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.field440 = arg9;
        this.field433 = arg3;
        this.field443 = arg5;
        this.field439 = arg10;
        this.field436 = arg6;
        this.field435 = arg8;
        this.field438 = arg12;
        this.field447 = arg7;
        this.field434 = arg4;
        this.field444 = arg2;
        this.field445 = arg0;
        this.field446 = arg11;
        this.field442 = arg1;
    }
}
