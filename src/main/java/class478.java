import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class478 {

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "I")
    public static int field7017 = 13156520;

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "I")
    public static int field7018;

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "I")
    public static int field7019;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(III)Z")
    public static final boolean method2860(int arg0, int arg1, int arg2) {
        field7019++;
        if (arg0 != 0) {
            method2861(-57, null);
        }
        return (arg2 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILdq;)V")
    public static final void method2861(int arg0, class489 arg1) {
        field7018++;
        if (class290.field4165 == arg1) {
            int var2 = class387.field5738.method1918((byte) -54);
            int var3 = ((var2 & 0xFB) >> 4) + class16.field248 * 2;
            int var4 = (var2 & 0xF) + class382.field5686 * 2;
            boolean var5 = class387.field5738.method1918((byte) -82) != 0;
            int var6 = var3 + class387.field5738.method1899((byte) -125);
            int var7 = class387.field5738.method1899((byte) 124) + var4;
            int var8 = class387.field5738.method1901(122);
            int var9 = class387.field5738.method1868(0);
            int var10 = class387.field5738.method1918((byte) 97) * 4;
            int var11 = class387.field5738.method1918((byte) -92) * 4;
            int var12 = class387.field5738.method1868(0);
            int var13 = class387.field5738.method1868(0);
            int var14 = class387.field5738.method1918((byte) -69);
            if (var14 == 255) {
                var14 = -1;
            }
            int var15 = class387.field5738.method1918((byte) -82);
            if (var3 >= 0 && var4 >= 0 && var3 < class237.field3436 * 2 && var4 < (class237.field3436 * 2) && var6 >= 0 && var7 >= 0 && var6 < class83.field1366 * 2 && (class83.field1366 * 2) > var7 && var9 != 65535) {
                int var16 = var11 << 0;
                int var17 = var7 * 64;
                int var18 = var6 * 64;
                int var19 = var4 * 64;
                int var20 = var3 * 64;
                int var21 = var10 << 0;
                class76 var22 = new class76(var9, class367.field5509, var20, var19, var21, class180.field2734 + var12, class180.field2734 + var13, var14, var15, var8, var16, var5);
                var22.method623(class259.method1646(var17, var18, 851701031, class367.field5509) - var16, class180.field2734 + var12, var18, true, var17);
                class214.field3087.method2270(arg0 ^ 0xFFFFDED0, new class185(var22));
            }
            return;
        }
        if (arg0 != -8496) {
            field7017 = 8;
        }
        if (class397.field5835 == arg1) {
            int var23 = class387.field5738.method1869((byte) 90);
            int var24 = class387.field5738.method1888((byte) 118);
            int var25 = class387.field5738.method1918((byte) 92);
            int var26 = class16.field248 + (var25 >> 4 & 0x7);
            int var27 = (var25 & 0x7) + class382.field5686;
            if (var26 >= 0 && var27 >= 0 && var26 < class237.field3436 && var27 < class83.field1366) {
                class233.method1511(new class394(var24, var23), (byte) -115, var27, class367.field5509, var26);
                class91.method737(var26, class367.field5509, (byte) -84, var27);
            }
        } else if (class353.field5342 == arg1) {
            int var28 = class387.field5738.method1918((byte) -35);
            int var29 = ((var28 & 0xFE) >> 4) + class16.field248 * 2;
            int var30 = (var28 & 0xF) + class382.field5686 * 2;
            boolean var31 = class387.field5738.method1918((byte) -101) != 0;
            int var32 = class387.field5738.method1899((byte) 56) + var29;
            int var33 = class387.field5738.method1899((byte) 85) + var30;
            int var34 = class387.field5738.method1901(126);
            int var35 = class387.field5738.method1901(121);
            int var36 = class387.field5738.method1868(arg0 ^ 0xFFFFDED0);
            byte var37 = class387.field5738.method1899((byte) -99);
            int var38 = class387.field5738.method1918((byte) -55) * 4;
            int var39 = class387.field5738.method1868(0);
            int var40 = class387.field5738.method1868(0);
            int var41 = class387.field5738.method1918((byte) 116);
            if (var41 == 255) {
                var41 = -1;
            }
            int var42 = class387.field5738.method1918((byte) 91);
            if (var29 >= 0 && var30 >= 0 && class237.field3436 * 2 > var29 && (class237.field3436 * 2) > var30 && var32 >= 0 && var33 >= 0 && (class83.field1366 * 2) > var32 && (class83.field1366 * 2) > var33 && var36 != 65535) {
                int var43 = var33 * 64;
                int var44 = var29 * 64;
                int var45 = var37 << 0;
                int var46 = var32 * 64;
                int var47 = var38 << 0;
                int var48 = var30 * 64;
                if (var34 != 0) {
                    int var51;
                    class22 var52;
                    if (var34 >= 0) {
                        int var49 = var34 - 1;
                        int var50 = var49 & 0x7FF;
                        var51 = (var49 & 0x7FDE) >> 11;
                        var52 = class132.field2030[var50];
                    } else {
                        int var53 = -var34 - 1;
                        var51 = var53 >> 11 & 0xF;
                        int var54 = var53 & 0x7FF;
                        if (class64.field1128 == var54) {
                            var52 = class95.field1558;
                        } else {
                            var52 = class390.field5783[var54];
                        }
                    }
                    if (var52 != null) {
                        class441 var55 = var52.method192(true);
                        if (var55.field6460 != null && var55.field6460[var51] != null) {
                            int var56 = var55.field6460[var51][0];
                            int var57 = var55.field6460[var51][2];
                            int var58 = var52.field338.method2890((byte) -9);
                            int var59 = class324.field4966[var58];
                            int var60 = class324.field4974[var58];
                            int var61 = var56 * var60 + var57 * var59 >> 15;
                            int var62 = var57 * var60 - (var56 * var59) >> 15;
                            var48 += var62;
                            var44 += var61;
                            var45 -= var55.field6460[var51][1];
                        }
                    }
                }
                class76 var64 = new class76(var36, class367.field5509, var44, var48, var45, var39 + class180.field2734, class180.field2734 + var40, var41, var42, var35, var47, var31);
                var64.method623(class259.method1646(var43, var46, 851701031, class367.field5509) - var47, class180.field2734 + var39, var46, true, var43);
                class214.field3087.method2270(0, new class185(var64));
            }
        } else if (class182.field2743 == arg1) {
            int var65 = class387.field5738.method1918((byte) 94);
            boolean var66 = (var65 & 0x80) != 0;
            int var67 = ((var65 & 0x3F) >> 3) + class16.field248;
            int var68 = (var65 & 0x7) + class382.field5686;
            int var69 = class387.field5738.method1899((byte) -108) + var67;
            int var70 = var68 + class387.field5738.method1899((byte) 69);
            int var71 = class387.field5738.method1901(arg0 + 8618);
            int var72 = class387.field5738.method1868(0);
            int var73 = class387.field5738.method1918((byte) -55) * 4;
            int var74 = class387.field5738.method1918((byte) -86) * 4;
            int var75 = class387.field5738.method1868(0);
            int var76 = class387.field5738.method1868(0);
            int var77 = class387.field5738.method1918((byte) 103);
            if (var77 == 255) {
                var77 = -1;
            }
            int var78 = class387.field5738.method1918((byte) -80);
            if (var67 >= 0 && var68 >= 0 && class237.field3436 > var67 && class83.field1366 > var68 && var69 >= 0 && var70 >= 0 && class237.field3436 > var69 && class83.field1366 > var70 && var72 != 65535) {
                int var79 = var73 << 0;
                int var80 = var69 * 128 + 64;
                int var81 = var74 << 0;
                int var82 = var67 * 128 + 64;
                int var83 = var70 * 128 + 64;
                int var84 = var68 * 128 + 64;
                class76 var85 = new class76(var72, class367.field5509, var82, var84, var79, var75 + class180.field2734, var76 - -class180.field2734, var77, var78, var71, var81, var66);
                var85.method623(class259.method1646(var83, var80, 851701031, class367.field5509) - var81, class180.field2734 + var75, var80, true, var83);
                class214.field3087.method2270(0, new class185(var85));
            }
        } else if (class455.field6734 == arg1) {
            int var86 = class387.field5738.method1918((byte) 122);
            int var87 = class16.field248 + ((var86 & 0x7B) >> 4);
            int var88 = class382.field5686 + (var86 & 0x7);
            int var89 = class387.field5738.method1868(0);
            int var90 = class387.field5738.method1918((byte) -109);
            int var91 = class387.field5738.method1868(0);
            int var92 = class387.field5738.method1918((byte) -98);
            if (var87 >= 0 && var88 >= 0 && class237.field3436 > var87 && class83.field1366 > var88) {
                int var93 = var87 * 128 + 64;
                int var94 = var88 * 128 + 64;
                int var95 = class367.field5509;
                if (var95 < 3 && class72.method606(var87, var88, (byte) -82)) {
                    var95++;
                }
                class37 var96 = new class37(var89, var91, class180.field2734, class367.field5509, var95, var93, class259.method1646(var94, var93, arg0 ^ 0xCD3C33F7, class367.field5509) - var90, var94, var87, var87, var88, var88, var92);
                class91.field1503.method2270(0, new class212(var96));
            }
        } else if (class94.field1537 == arg1) {
            int var97 = class387.field5738.method1918((byte) -41);
            int var98 = ((var97 & 0x72) >> 4) + class16.field248;
            int var99 = class382.field5686 + (var97 & 0x7);
            int var100 = class387.field5738.method1868(0);
            if (var100 == 65535) {
                var100 = -1;
            }
            int var101 = class387.field5738.method1918((byte) 103);
            int var102 = (var101 & 0xFA) >> 4;
            int var103 = var101 & 0x7;
            int var104 = class387.field5738.method1918((byte) 87);
            int var105 = class387.field5738.method1918((byte) -115);
            if (var98 >= 0 && var99 >= 0 && class237.field3436 > var98 && class83.field1366 > var99) {
                int var106 = var102 + 1;
                if ((var98 - var106) <= class95.field1558.field409[0] && var98 + var106 >= class95.field1558.field409[0] && class95.field1558.field416[0] >= (var99 - var106) && class95.field1558.field416[0] <= (var99 + var106)) {
                    class264.method1691((class367.field5509 << 24) + (var99 << 8) + var102 + (var98 << 16), var100, var104, var105, var103, -1);
                }
            }
        } else if (class18.field273 == arg1) {
            int var107 = class387.field5738.method1903((byte) -128);
            int var108 = class387.field5738.method1864(16698);
            int var109 = var108 >> 2;
            int var110 = var108 & 0x3;
            int var111 = class113.field1798[var109];
            int var112 = class387.field5738.method1918((byte) 124);
            int var113 = ((var112 & 0x76) >> 4) + class16.field248;
            int var114 = class382.field5686 + (var112 & 0x7);
            if (class41.method320((byte) 101, class445.field6534) || var113 >= 0 && var114 >= 0 && var113 < class237.field3436 && class83.field1366 > var114) {
                class222.method1470(0, false, class367.field5509, var107, -1, var111, var109, var113, var110, var114);
            }
        } else if (class127.field1934 == arg1) {
            int var115 = class387.field5738.method1868(0);
            int var116 = class387.field5738.method1918((byte) 114);
            class246.field3567.method609(115, var115).method3025(var116, -121);
        } else if (class92.field1518 == arg1) {
            int var117 = class387.field5738.method1894(255);
            int var118 = (var117 >> 4 & 0x7) + class16.field248;
            int var119 = class382.field5686 + (var117 & 0x7);
            int var120 = class387.field5738.method1869((byte) 116);
            int var121 = class387.field5738.method1888((byte) 107);
            int var122 = class387.field5738.method1868(arg0 + 8496);
            if (var118 >= 0 && var119 >= 0 && class237.field3436 > var118 && class83.field1366 > var119 && class64.field1128 != var122) {
                class233.method1511(new class394(var121, var120), (byte) -115, var119, class367.field5509, var118);
                class91.method737(var118, class367.field5509, (byte) 127, var119);
            }
        } else if (class406.field5974 == arg1) {
            int var123 = class387.field5738.method1894(255);
            int var124 = var123 >> 2;
            int var125 = var123 & 0x3;
            int var126 = class113.field1798[var124];
            int var127 = class387.field5738.method1918((byte) -125);
            int var128 = (var127 >> 4 & 0x7) + class16.field248;
            int var129 = class382.field5686 + (var127 & 0x7);
            if (class41.method320((byte) 101, class445.field6534) || var128 >= 0 && var129 >= 0 && class237.field3436 > var128 && var129 < class83.field1366) {
                class222.method1470(0, false, class367.field5509, -1, -1, var126, var124, var128, var125, var129);
            }
        } else if (class266.field3837 == arg1) {
            int var130 = class387.field5738.method1918((byte) 104);
            int var131 = ((var130 & 0x72) >> 4) + class16.field248;
            int var132 = (var130 & 0x7) + class382.field5686;
            int var133 = class387.field5738.method1868(0);
            int var134 = class387.field5738.method1868(0);
            int var135 = class387.field5738.method1868(0);
            if (class73.field1218 != null && var131 >= 0 && var132 >= 0 && class237.field3436 > var131 && var132 < class83.field1366) {
                class63 var136 = (class63) class73.field1218.method2485(arg0 ^ 0xFFFFDEFA, (long) (var132 << 14 | class367.field5509 << 28 | var131));
                if (var136 != null) {
                    for (class394 var137 = (class394) var136.field1120.method2257((byte) 114); var137 != null; var137 = (class394) var136.field1120.method2256(-71)) {
                        if ((var133 & 0x7FFF) == var137.field5819 && var137.field5818 == var134) {
                            var137.method2663(-117);
                            var137.field5818 = var135;
                            class233.method1511(var137, (byte) -115, var132, class367.field5509, var131);
                            break;
                        }
                    }
                    class91.method737(var131, class367.field5509, (byte) 33, var132);
                }
            }
        } else if (class222.field3222 == arg1) {
            int var138 = class387.field5738.method1903((byte) 2);
            byte var139 = class387.field5738.method1899((byte) 88);
            byte var140 = class387.field5738.method1922((byte) 120);
            int var141 = class387.field5738.method1864(16698);
            int var142 = ((var141 & 0x7E) >> 4) + class16.field248;
            int var143 = (var141 & 0x7) + class382.field5686;
            int var144 = class387.field5738.method1888((byte) 116);
            int var145 = class387.field5738.method1906((byte) 71);
            byte var146 = class387.field5738.method1884((byte) -127);
            int var147 = class387.field5738.method1861((byte) 111);
            int var148 = var147 >> 2;
            int var149 = var147 & 0x3;
            byte var150 = class387.field5738.method1922((byte) -51);
            int var151 = class387.field5738.method1888((byte) 97);
            if (!class394.field5821.method473()) {
                class44.method334(var148, var139, var138, var143, var140, var149, var145, 4, var144, var150, var142, class367.field5509, var146, var151);
            }
        } else if (class358.field5426 == arg1) {
            int var152 = class387.field5738.method1894(255);
            int var153 = (var152 >> 4 & 0x7) + class16.field248;
            int var154 = (var152 & 0x7) + class382.field5686;
            int var155 = class387.field5738.method1903((byte) -124);
            if (var155 == 65535) {
                var155 = -1;
            }
            int var156 = class387.field5738.method1918((byte) -105);
            int var157 = var156 >> 2;
            int var158 = var156 & 0x3;
            int var159 = class113.field1798[var157];
            class267.method1707(var154, false, var155, var159, var153, class367.field5509, var158, var157);
        } else if (class359.field5430 == arg1) {
            int var160 = class387.field5738.method1918((byte) -93);
            int var161 = ((var160 & 0x79) >> 4) + class16.field248;
            int var162 = (var160 & 0x7) + class382.field5686;
            int var163 = class387.field5738.method1868(0);
            if (var161 >= 0 && var162 >= 0 && var161 < class237.field3436 && class83.field1366 > var162) {
                class63 var164 = (class63) class73.field1218.method2485(37, (long) (var161 | var162 << 14 | class367.field5509 << 28));
                if (var164 != null) {
                    for (class394 var165 = (class394) var164.field1120.method2257((byte) 120); var165 != null; var165 = (class394) var164.field1120.method2256(arg0 + 8623)) {
                        if ((var163 & 0x7FFF) == var165.field5819) {
                            var165.method2663(-123);
                            break;
                        }
                    }
                    if (var164.field1120.method2268((byte) -103)) {
                        var164.method2663(-124);
                    }
                    class91.method737(var161, class367.field5509, (byte) -80, var162);
                }
            }
        } else if (class475.field6990 == arg1) {
            class387.field5738.method1918((byte) -112);
            int var166 = class387.field5738.method1918((byte) -64);
            int var167 = ((var166 & 0x7E) >> 4) + class16.field248;
            int var168 = (var166 & 0x7) + class382.field5686;
            int var169 = class387.field5738.method1868(0);
            int var170 = class387.field5738.method1918((byte) 95);
            int var171 = class387.field5738.method1866(false);
            String var172 = class387.field5738.method1879(arg0 + 39165);
            class249.method1585(var172, var169, var170, var167, var171, class367.field5509, var168, (byte) -121);
        } else {
            class169.method1200("T3 - " + arg1, null, (byte) -113);
            class196.method1359(0);
        }
    }

    static {
        new class180("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
        new class180(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
    }
}
