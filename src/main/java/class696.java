import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public class class696 extends InputStream {

    @OriginalMember(owner = "client!sfa", name = "c", descriptor = "Lmu;")
    public static class303 field9401 = new class303(71, 7);

    @OriginalMember(owner = "client!sfa", name = "d", descriptor = "Ltca;")
    public static class174 field9402 = new class174();

    @OriginalMember(owner = "client!sfa", name = "e", descriptor = "[F")
    public static float[] field9403 = new float[4];

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "I")
    public static int field9399;

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "I")
    public static int field9400;

    @OriginalMember(owner = "client!sfa", name = "f", descriptor = "I")
    public static int field9404;

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(B)V", line = 5)
    public static void method3895(byte arg0) {
        if (arg0 != 118) {
            method3896(null, (byte) -48);
        }
        field9403 = null;
        field9402 = null;
        field9401 = null;
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Lkn;B)V", line = 18)
    public static final void method3896(class737 arg0, byte arg1) {
        field9400++;
        if (class655.field8997 == arg0) {
            int var2 = class149.field2477.method1490((byte) -124);
            int var3 = var2 >> 2;
            int var4 = var2 & 0x3;
            int var5 = class585.field7990[var3];
            int var6 = class149.field2477.method1478(842397944);
            int var7 = class149.field2477.method1541((byte) 65);
            int var8 = (var7 >> 4 & 0x7) + class183.field2766;
            int var9 = class192.field2854 + (var7 & 0x7);
            if (class86.method824(126, class482.field6727) || var8 >= 0 && var9 >= 0 && var8 < class376.field5325 && class175.field2711 > var9) {
                class682.method3825(class76.field1371, 0, var9, -1, var3, var5, var4, var6, (byte) 121, var8);
            }
        } else if (class556.field7680 == arg0) {
            int var10 = class149.field2477.method1535(arg1 + 247);
            int var11 = ((var10 & 0x7A) >> 4) + class183.field2766;
            int var12 = class192.field2854 + (var10 & 0x7);
            int var13 = class149.field2477.method1478(842397944);
            int var14 = class149.field2477.method1535(255);
            int var15 = class149.field2477.method1478(842397944);
            int var16 = class149.field2477.method1535(arg1 ^ 0xF7);
            if (var11 >= 0 && var12 >= 0 && class376.field5325 > var11 && class175.field2711 > var12) {
                int var17 = var11 * 512 + 256;
                int var18 = var12 * 512 + 256;
                int var19 = class76.field1371;
                if (var19 < 3 && class334.method2118(var12, var11, true)) {
                    var19++;
                }
                class238 var20 = new class238(var13, var15, class641.field8810, class76.field1371, var19, var17, class197.method1403(var17, class76.field1371, 11219, var18) - var14, var18, var11, var11, var12, var12, var16);
                class28.field757.method1273(new class715(var20), -20180);
            }
        } else if (class430.field6156 == arg0) {
            int var21 = class149.field2477.method1535(255);
            int var22 = class183.field2766 + (var21 >> 4 & 0x7);
            int var23 = (var21 & 0x7) + class192.field2854;
            int var24 = class149.field2477.method1478(842397944);
            if (var24 == 65535) {
                var24 = -1;
            }
            int var25 = class149.field2477.method1535(arg1 + 247);
            int var26 = var25 >> 4 & 0xF;
            int var27 = var25 & 0x7;
            int var28 = class149.field2477.method1535(255);
            int var29 = class149.field2477.method1535(255);
            int var30 = class149.field2477.method1478(arg1 + 842397936);
            if (var22 >= 0 && var23 >= 0 && var22 < class376.field5325 && class175.field2711 > var23) {
                int var31 = var26 + 1;
                if ((var22 - var31) <= class58.field1147.field5746[0] && class58.field1147.field5746[0] <= (var22 + var31) && (var23 - var31) <= class58.field1147.field5743[0] && class58.field1147.field5743[0] <= (var23 + var31)) {
                    class507.method2976(var24, var29, false, (var23 << 8) + (class76.field1371 << 24) + ((var22 << 16) - -var26), (byte) -98, var27, var30, var28);
                }
            }
        } else if (class113.field1946 == arg0) {
            int var32 = class149.field2477.method1478(842397944);
            int var33 = class149.field2477.method1535(255);
            class76.field1366.method1680(0, var32).method923(var33, -31076);
        } else if (class225.field3208 == arg0) {
            int var34 = class149.field2477.method1535(arg1 + 247);
            int var35 = ((var34 & 0x7B) >> 4) + class183.field2766;
            int var36 = (var34 & 0x7) + class192.field2854;
            int var37 = class149.field2477.method1478(842397944);
            if (var37 == 65535) {
                var37 = -1;
            }
            int var38 = class149.field2477.method1535(arg1 + 247);
            int var39 = var38 >> 4 & 0xF;
            int var40 = var38 & 0x7;
            int var41 = class149.field2477.method1535(255);
            int var42 = class149.field2477.method1535(arg1 ^ 0xF7);
            int var43 = class149.field2477.method1478(842397944);
            if (var35 >= 0 && var36 >= 0 && var35 < class376.field5325 && var36 < class175.field2711) {
                int var44 = var39 + 1;
                if (class58.field1147.field5746[0] >= var35 - var44 && class58.field1147.field5746[0] <= var35 + var44 && (var36 - var44) <= class58.field1147.field5743[0] && var36 + var44 >= class58.field1147.field5743[0]) {
                    class237.method1649(var40, (class76.field1371 << 24) + (var35 << 16) + (var36 << 8) + var39, var41, var42, var43, var37, -29494);
                }
            }
        } else if (class262.field3749 == arg0) {
            int var45 = class149.field2477.method1521(false);
            if (var45 == 65535) {
                var45 = -1;
            }
            int var46 = class149.field2477.method1490((byte) 65);
            int var47 = ((var46 & 0x71) >> 4) + class183.field2766;
            int var48 = (var46 & 0x7) + class192.field2854;
            int var49 = class149.field2477.method1477((byte) 21);
            int var50 = var49 >> 2;
            int var51 = var49 & 0x3;
            int var52 = class585.field7990[var50];
            class745.method4080(var48, var45, var50, var47, var51, 115, class76.field1371, var52);
        } else if (class23.field724 == arg0) {
            int var53 = class149.field2477.method1535(255);
            int var54 = (var53 >> 4 & 0xF) + class183.field2766 * 2;
            int var55 = (var53 & 0xF) + class192.field2854 * 2;
            int var56 = class149.field2477.method1535(255);
            boolean var57 = (var56 & 0x1) != 0;
            boolean var58 = (var56 & 0x2) != 0;
            int var59 = var58 ? var56 >> 2 : -1;
            int var60 = class149.field2477.method1536(-77) + var54;
            int var61 = class149.field2477.method1536(-88) + var55;
            int var62 = class149.field2477.method1520(13638);
            int var63 = class149.field2477.method1520(13638);
            int var64 = class149.field2477.method1478(arg1 + 842397936);
            int var65 = class149.field2477.method1535(255);
            int var66;
            if (var58) {
                var66 = (byte) var65;
            } else {
                var66 = var65 * 4;
            }
            int var67 = class149.field2477.method1535(arg1 ^ 0xF7) * 4;
            int var68 = class149.field2477.method1478(arg1 + 842397936);
            int var69 = class149.field2477.method1478(842397944);
            int var70 = class149.field2477.method1535(255);
            int var71 = class149.field2477.method1478(842397944);
            if (var70 == 255) {
                var70 = -1;
            }
            if (var54 >= 0 && var55 >= 0 && (class376.field5325 * 2) > var54 && (class376.field5325 * 2) > var55 && var60 >= 0 && var61 >= 0 && (class175.field2711 * 2) > var60 && class175.field2711 * 2 > var61 && var64 != 65535) {
                int var72 = var61 * 256;
                int var73 = var60 * 256;
                int var74 = var67 << 2;
                int var75 = var54 * 256;
                int var76 = var71 << 2;
                int var77 = var66 << 2;
                int var78 = var55 * 256;
                if (var62 != 0 && var59 != -1) {
                    class390 var79 = null;
                    if (var62 < 0) {
                        int var80 = -var62 - 1;
                        if (class561.field7752 == var80) {
                            var79 = class58.field1147;
                        } else {
                            var79 = class49.field1040[var80];
                        }
                    } else {
                        int var81 = var62 - 1;
                        class751 var82 = (class751) class86.field1546.method1465((long) var81, -6008);
                        if (var82 != null) {
                            var79 = var82.field10510;
                        }
                    }
                    if (var79 != null) {
                        class399 var83 = var79.method2445((byte) 72);
                        if (var83.field5883 != null && var83.field5883[var59] != null) {
                            var77 -= var83.field5883[var59][1];
                        }
                        if (var83.field5854 != null && var83.field5854[var59] != null) {
                            var77 -= var83.field5854[var59][1];
                        }
                    }
                }
                class8 var84 = new class8(var64, class76.field1371, class76.field1371, var75, var78, var77, var68 + class641.field8810, class641.field8810 + var69, var70, var76, var62, var63, var74, var57, var59);
                var84.method32((byte) -103, class197.method1403(var73, class76.field1371, 11219, var72) - var74, var72, class641.field8810 + var68, var73);
                class148.field2472.method1273(new class161(var84), -20180);
            }
        } else if (class582.field7973 == arg0) {
            int var85 = class149.field2477.method1506(-128);
            int var86 = class149.field2477.method1490((byte) 31);
            int var87 = (var86 & 0x7) + class192.field2854;
            int var88 = class367.field5236 + var87;
            int var89 = (var86 >> 4 & 0x7) + class183.field2766;
            int var90 = class221.field3177 + var89;
            class206 var91 = (class206) class491.field6801.method1465((long) (var88 << 14 | class76.field1371 << 28 | var90), -6008);
            if (var91 != null) {
                for (class38 var92 = (class38) var91.field2961.method1269(4); var92 != null; var92 = (class38) var91.field2961.method1264((byte) 49)) {
                    if ((var85 & 0x7FFF) == var92.field942) {
                        var92.method2314((byte) 127);
                        break;
                    }
                }
                if (var91.field2961.method1276((byte) 18)) {
                    var91.method2314((byte) 62);
                }
                if (var89 >= 0 && var87 >= 0 && class376.field5325 > var89 && class175.field2711 > var87) {
                    class209.method1439(var87, (byte) -125, var89, class76.field1371);
                }
            }
        } else if (class659.field9026 == arg0) {
            int var93 = class149.field2477.method1521(false);
            int var94 = class149.field2477.method1521(false);
            int var95 = class149.field2477.method1535(255);
            int var96 = class192.field2854 + (var95 & 0x7);
            int var97 = class367.field5236 + var96;
            int var98 = class183.field2766 + ((var95 & 0x79) >> 4);
            int var99 = class221.field3177 + var98;
            boolean var100 = var98 >= 0 && var96 >= 0 && class376.field5325 > var98 && class175.field2711 > var96;
            if (var100 || class86.method824(124, class482.field6727)) {
                class547.method3154(new class38(var94, var93), class76.field1371, var97, var99, -2);
                if (var100) {
                    class209.method1439(var96, (byte) -124, var98, class76.field1371);
                }
            }
        } else if (class252.field3637 == arg0) {
            int var101 = class149.field2477.method1541((byte) 83);
            int var102 = var101 >> 2;
            int var103 = var101 & 0x3;
            int var104 = class585.field7990[var102];
            int var105 = class149.field2477.method1535(arg1 ^ 0xF7);
            int var106 = (var105 >> 4 & 0x7) + class183.field2766;
            int var107 = class192.field2854 + (var105 & 0x7);
            if (class86.method824(arg1 ^ 0x73, class482.field6727) || var106 >= 0 && var107 >= 0 && var106 < class376.field5325 && class175.field2711 > var107) {
                class682.method3825(class76.field1371, 0, var107, -1, var102, var104, var103, -1, (byte) 125, var106);
            }
        } else {
            if (arg1 != 8) {
                field9401 = null;
            }
            if (class428.field6140 == arg0) {
                int var108 = class149.field2477.method1535(255);
                int var109 = (var108 & 0x7) + class192.field2854;
                int var110 = class367.field5236 + var109;
                int var111 = class183.field2766 + ((var108 & 0x7A) >> 4);
                int var112 = class221.field3177 + var111;
                int var113 = class149.field2477.method1478(842397944);
                int var114 = class149.field2477.method1478(arg1 + 842397936);
                int var115 = class149.field2477.method1478(842397944);
                if (class491.field6801 != null) {
                    class206 var116 = (class206) class491.field6801.method1465((long) (var112 | class76.field1371 << 28 | var110 << 14), -6008);
                    if (var116 != null) {
                        for (class38 var117 = (class38) var116.field2961.method1269(4); var117 != null; var117 = (class38) var116.field2961.method1264((byte) 34)) {
                            if ((var113 & 0x7FFF) == var117.field942 && var117.field940 == var114) {
                                var117.method2314((byte) 32);
                                var117.field940 = var115;
                                class547.method3154(var117, class76.field1371, var110, var112, arg1 ^ 0xFFFFFFF6);
                                break;
                            }
                        }
                        if (var111 >= 0 && var109 >= 0 && class376.field5325 > var111 && var109 < class175.field2711) {
                            class209.method1439(var109, (byte) -125, var111, class76.field1371);
                        }
                    }
                }
            } else if (class531.field7325 == arg0) {
                int var118 = class149.field2477.method1521(false);
                int var119 = class149.field2477.method1535(255);
                int var120 = (var119 & 0x7) + class192.field2854;
                int var121 = class367.field5236 + var120;
                int var122 = class183.field2766 + ((var119 & 0x7B) >> 4);
                int var123 = class221.field3177 + var122;
                int var124 = class149.field2477.method1503(-25);
                int var125 = class149.field2477.method1503(123);
                if (class561.field7752 != var125) {
                    boolean var126 = var122 >= 0 && var120 >= 0 && class376.field5325 > var122 && class175.field2711 > var120;
                    if (var126 || class86.method824(122, class482.field6727)) {
                        class547.method3154(new class38(var124, var118), class76.field1371, var121, var123, arg1 - 10);
                        if (var126) {
                            class209.method1439(var120, (byte) -120, var122, class76.field1371);
                        }
                    }
                }
            } else if (class259.field3721 == arg0) {
                int var127 = class149.field2477.method1535(arg1 + 247);
                boolean var128 = (var127 & 0x80) != 0;
                int var129 = class183.field2766 + (var127 >> 3 & 0x7);
                int var130 = (var127 & 0x7) + class192.field2854;
                int var131 = var129 + class149.field2477.method1536(-94);
                int var132 = class149.field2477.method1536(-87) + var130;
                int var133 = class149.field2477.method1520(13638);
                int var134 = class149.field2477.method1478(arg1 + 842397936);
                int var135 = class149.field2477.method1535(255) * 4;
                int var136 = class149.field2477.method1535(255) * 4;
                int var137 = class149.field2477.method1478(arg1 + 842397936);
                int var138 = class149.field2477.method1478(arg1 + 842397936);
                int var139 = class149.field2477.method1535(255);
                if (var139 == 255) {
                    var139 = -1;
                }
                int var140 = class149.field2477.method1478(842397944);
                if (var129 >= 0 && var130 >= 0 && class376.field5325 > var129 && var130 < class175.field2711 && var131 >= 0 && var132 >= 0 && class376.field5325 > var131 && var132 < class175.field2711 && var134 != 65535) {
                    int var141 = var140 << 2;
                    int var142 = var132 * 512 + 256;
                    int var143 = var136 << 2;
                    int var144 = var131 * 512 + 256;
                    int var145 = var130 * 512 + 256;
                    int var146 = var129 * 512 + 256;
                    int var147 = var135 << 2;
                    class8 var148 = new class8(var134, class76.field1371, class76.field1371, var146, var145, var147, class641.field8810 + var137, class641.field8810 + var138, var139, var141, 0, var133, var143, var128, -1);
                    var148.method32((byte) -103, class197.method1403(var144, class76.field1371, 11219, var142) - var143, var142, class641.field8810 + var137, var144);
                    class148.field2472.method1273(new class161(var148), -20180);
                }
            } else if (class463.field6505 == arg0) {
                class149.field2477.method1535(255);
                int var149 = class149.field2477.method1535(arg1 + 247);
                int var150 = (var149 >> 4 & 0x7) + class183.field2766;
                int var151 = (var149 & 0x7) + class192.field2854;
                int var152 = class149.field2477.method1478(arg1 ^ 0x3235F8F0);
                int var153 = class149.field2477.method1535(255);
                int var154 = class149.field2477.method1499(-1);
                String var155 = class149.field2477.method1525((byte) -126);
                class628.method3591(var152, var150, var154, var155, var153, -109, var151, class76.field1371);
            } else {
                class444.method2672("T3 - " + arg0, null, 15004);
                class170.method1282(false, (byte) 11);
            }
        }
    }

    @OriginalMember(owner = "client!sfa", name = "read", descriptor = "()I", line = 624)
    public final int read() {
        class700.method3916((byte) -118, 30000L);
        field9399++;
        return -1;
    }
}
