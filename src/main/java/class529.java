import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class529 extends class475 {

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "S")
    public static short field7802 = 32767;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "[I")
    public static int[] field7803 = new int[2];

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field7801;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    public static int field7804;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
    public static int field7805;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public static int field7806;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    public static int field7807;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    public static int field7808;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method3137(int arg0, int arg1, int arg2) {
        field7805++;
        if (!class450.field6267) {
            return false;
        }
        int var3 = arg1 >> 16;
        int var4 = arg1 & 0xFFFF;
        if (arg0 > -118) {
            return false;
        } else if (class296.field3842[var3] == null || class296.field3842[var3][var4] == null) {
            return false;
        } else {
            class423 var5 = class296.field3842[var3][var4];
            if (arg2 == -1 && var5.field5741 == 0) {
                for (class502 var6 = (class502) class103.field1421.method49(-122); var6 != null; var6 = (class502) class103.field1421.method46((byte) 21)) {
                    if (var6.field7390 == 46 || var6.field7390 == 1008 || var6.field7390 == 45 || var6.field7390 == 18 || var6.field7390 == 3) {
                        for (class423 var7 = class497.method2965(0, var6.field7389); var7 != null; var7 = class426.method2520((byte) -95, var7)) {
                            if (var5.field5734 == var7.field5734) {
                                return true;
                            }
                        }
                    }
                }
            } else {
                for (class502 var8 = (class502) class103.field1421.method49(-108); var8 != null; var8 = (class502) class103.field1421.method46((byte) 78)) {
                    if (var8.field7377 == arg2 && var5.field5734 == var8.field7389 && (var8.field7390 == 46 || var8.field7390 == 1008 || var8.field7390 == 45 || var8.field7390 == 18 || var8.field7390 == 3)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lgp;I)V", line = 74)
    public static final void method3138(class459 arg0, int arg1) {
        field7804++;
        if (class90.field1257 == arg0) {
            int var2 = class109.field1514.method577(arg1 ^ 0xFE);
            int var3 = var2 >> 2;
            int var4 = var2 & 0x3;
            int var5 = class20.field335[var3];
            int var6 = class109.field1514.method561(1110991096);
            int var7 = ((var6 & 0x72) >> 4) + class36.field548;
            int var8 = (var6 & 0x7) + class310.field4002;
            if (class83.method470(arg1 - 77, class377.field4896) || var7 >= 0 && var8 >= 0 && var7 < class200.field2594 && var8 < class118.field1647) {
                class372.method2168(var3, var4, class448.field6240, -1, 0, var5, var8, -1, 0, var7);
            }
        } else if (class174.field2244 == arg0) {
            int var9 = class109.field1514.method617(2);
            int var10 = class36.field548 + ((var9 & 0x79) >> 4);
            int var11 = (var9 & 0x7) + class310.field4002;
            int var12 = class109.field1514.method568((byte) 110);
            if (var12 == 65535) {
                var12 = -1;
            }
            int var13 = class109.field1514.method617(2);
            int var14 = var13 >> 4 & 0xF;
            int var15 = var13 & 0x7;
            int var16 = class109.field1514.method617(arg1 + 1);
            int var17 = class109.field1514.method617(2);
            if (var10 >= 0 && var11 >= 0 && var10 < class200.field2594 && class118.field1647 > var11) {
                int var18 = var14 + 1;
                if ((var10 - var18) <= class37.field573.field5246[0] && class37.field573.field5246[0] <= var10 + var18 && (var11 - var18) <= class37.field573.field5251[0] && class37.field573.field5251[0] <= (var11 + var18)) {
                    class419.method2461(var12, (byte) -16, var17, var16, (var11 << 8) + ((class448.field6240 << 24) + (var10 << 16)) + var14, var15);
                }
            }
        } else if (class254.field3205 == arg0) {
            int var19 = class109.field1514.method568((byte) 110);
            int var20 = class109.field1514.method570(true);
            int var21 = class109.field1514.method617(2);
            int var22 = class36.field548 + ((var21 & 0x7E) >> 4);
            int var23 = class310.field4002 + (var21 & 0x7);
            if (var22 >= 0 && var23 >= 0 && class200.field2594 > var22 && var23 < class118.field1647) {
                class234.method1484((byte) 65, var23, var22, new class9(var20, var19), class448.field6240);
                class94.method640(var23, -21, var22, class448.field6240);
            }
        } else if (class113.field1549 == arg0) {
            int var24 = class109.field1514.method561(1110991096);
            int var25 = class36.field548 + ((var24 & 0x7E) >> 4);
            int var26 = (var24 & 0x7) + class310.field4002;
            int var27 = class109.field1514.method567((byte) 112);
            if (var27 == 65535) {
                var27 = -1;
            }
            int var28 = class109.field1514.method577(255);
            int var29 = var28 >> 2;
            int var30 = var28 & 0x3;
            int var31 = class20.field335[var29];
            class267.method1654(var31, var29, var26, var30, var27, var25, class448.field6240, -66);
        } else if (class488.field7114 == arg0) {
            class109.field1514.method617(arg1 ^ 0x3);
            int var32 = class109.field1514.method617(2);
            int var33 = (var32 >> 4 & 0x7) + class36.field548;
            int var34 = (var32 & 0x7) + class310.field4002;
            int var35 = class109.field1514.method568((byte) 110);
            int var36 = class109.field1514.method617(2);
            int var37 = class109.field1514.method584(255);
            String var38 = class109.field1514.method591(20557);
            class371.method2161(-28, var34, var35, var37, var33, var36, class448.field6240, var38);
        } else if (class415.field5514 == arg0) {
            int var39 = class109.field1514.method561(1110991096);
            int var40 = (var39 >> 4 & 0x7) + class36.field548;
            int var41 = (var39 & 0x7) + class310.field4002;
            byte var42 = class109.field1514.method575(arg1 - 124);
            byte var43 = class109.field1514.method613(128);
            byte var44 = class109.field1514.method613(128);
            int var45 = class109.field1514.method603((byte) -31);
            int var46 = class109.field1514.method568((byte) 110);
            int var47 = class109.field1514.method568((byte) 110);
            byte var48 = class109.field1514.method614(arg1 ^ 0x81);
            int var49 = class109.field1514.method608((byte) 51);
            int var50 = var49 >> 2;
            int var51 = var49 & 0x3;
            int var52 = class109.field1514.method605(31981);
            if (!class512.field7538.method890()) {
                class445.method2637(var45, var47, var46, (byte) -127, var51, var44, class448.field6240, var41, var48, var42, var52, var40, var50, var43);
            }
        } else if (class164.field2127 == arg0) {
            int var53 = class109.field1514.method617(arg1 + 1);
            int var54 = class36.field548 * 2 + ((var53 & 0xF8) >> 4);
            int var55 = (var53 & 0xF) + class310.field4002 * 2;
            boolean var56 = class109.field1514.method617(2) != 0;
            int var57 = class109.field1514.method575(-43) + var54;
            int var58 = var55 + class109.field1514.method575(-119);
            int var59 = class109.field1514.method603((byte) 108);
            int var60 = class109.field1514.method568((byte) 110);
            int var61 = class109.field1514.method617(2) * 4;
            int var62 = class109.field1514.method617(2) * 4;
            int var63 = class109.field1514.method568((byte) 110);
            int var64 = class109.field1514.method568((byte) 110);
            int var65 = class109.field1514.method617(2);
            int var66 = class109.field1514.method617(arg1 ^ 0x3);
            if (var65 == 255) {
                var65 = -1;
            }
            if (var54 >= 0 && var55 >= 0 && class200.field2594 * 2 > var54 && (class200.field2594 * 2) > var55 && var57 >= 0 && var58 >= 0 && var57 < class118.field1647 * 2 && var58 < (class118.field1647 * 2) && var60 != 65535) {
                int var67 = var54 * 64;
                int var68 = var62 << 0;
                int var69 = var58 * 64;
                int var70 = var61 << 0;
                int var71 = var55 * 64;
                int var72 = var57 * 64;
                class224 var73 = new class224(var60, class448.field6240, var67, var71, var70, var63 + class264.field3353, class264.field3353 + var64, var65, var66, var59, var68, var56);
                var73.method1425(var72, class366.method2145(class448.field6240, (byte) 105, var72, var69) - var68, var63 - -class264.field3353, var69, -32768);
                class235.field3065.method42(new class352(var73), 0);
            }
        } else if (class196.field2541 == arg0) {
            int var74 = class109.field1514.method605(arg1 + 31980);
            int var75 = class109.field1514.method577(255);
            int var76 = var75 >> 2;
            int var77 = var75 & 0x3;
            int var78 = class20.field335[var76];
            int var79 = class109.field1514.method608((byte) -110);
            int var80 = (var79 >> 4 & 0x7) + class36.field548;
            int var81 = (var79 & 0x7) + class310.field4002;
            if (class83.method470(-126, class377.field4896) || var80 >= 0 && var81 >= 0 && class200.field2594 > var80 && var81 < class118.field1647) {
                class372.method2168(var76, var77, class448.field6240, var74, 0, var78, var81, -1, arg1 ^ 0x1, var80);
            }
        } else if (class271.field3439 == arg0) {
            int var82 = class109.field1514.method568((byte) 110);
            int var83 = class109.field1514.method617(2);
            class52.field715.method1164(var82, 0).method2388(var83, (byte) -120);
        } else if (class329.field4226 == arg0) {
            int var84 = class109.field1514.method617(arg1 ^ 0x3);
            boolean var85 = (var84 & 0x80) != 0;
            int var86 = (var84 >> 3 & 0x7) + class36.field548;
            int var87 = (var84 & 0x7) + class310.field4002;
            int var88 = class109.field1514.method575(-124) + var86;
            int var89 = var87 + class109.field1514.method575(-19);
            int var90 = class109.field1514.method603((byte) 111);
            int var91 = class109.field1514.method568((byte) 110);
            int var92 = class109.field1514.method617(arg1 + 1) * 4;
            int var93 = class109.field1514.method617(arg1 + 1) * 4;
            int var94 = class109.field1514.method568((byte) 110);
            int var95 = class109.field1514.method568((byte) 110);
            int var96 = class109.field1514.method617(2);
            int var97 = class109.field1514.method617(2);
            if (var96 == 255) {
                var96 = -1;
            }
            if (var86 >= 0 && var87 >= 0 && class200.field2594 > var86 && var87 < class118.field1647 && var88 >= 0 && var89 >= 0 && class200.field2594 > var88 && class118.field1647 > var89 && var91 != 65535) {
                int var98 = var89 * 128 + 64;
                int var99 = var92 << 0;
                int var100 = var88 * 128 + 64;
                int var101 = var93 << 0;
                int var102 = var86 * 128 + 64;
                int var103 = var87 * 128 + 64;
                class224 var104 = new class224(var91, class448.field6240, var102, var103, var99, class264.field3353 + var94, class264.field3353 + var95, var96, var97, var90, var101, var85);
                var104.method1425(var100, class366.method2145(class448.field6240, (byte) 27, var100, var98) - var101, class264.field3353 + var94, var98, -32768);
                class235.field3065.method42(new class352(var104), 0);
            }
        } else if (class491.field7168 == arg0) {
            int var105 = class109.field1514.method561(1110991096);
            int var106 = (var105 >> 4 & 0x7) + class36.field548;
            int var107 = (var105 & 0x7) + class310.field4002;
            int var108 = class109.field1514.method570(true);
            if (var106 >= 0 && var107 >= 0 && var106 < class200.field2594 && var107 < class118.field1647) {
                class237 var109 = (class237) class376.field4885.method2085((long) (class448.field6240 << 28 | var107 << 14 | var106), -5423);
                if (var109 != null) {
                    for (class9 var110 = (class9) var109.field3082.method49(97); var110 != null; var110 = (class9) var109.field3082.method46((byte) 112)) {
                        if ((var108 & 0x7FFF) == var110.field92) {
                            var110.method3021(arg1 ^ 0x14);
                            break;
                        }
                    }
                    if (var109.field3082.method38((byte) 63)) {
                        var109.method3021(83);
                    }
                    class94.method640(var107, arg1 ^ 0xFFFFFFBE, var106, class448.field6240);
                }
            }
        } else if (class98.field1366 == arg0) {
            int var111 = class109.field1514.method567((byte) 112);
            int var112 = class109.field1514.method577(255);
            int var113 = class36.field548 + ((var112 & 0x7E) >> 4);
            int var114 = (var112 & 0x7) + class310.field4002;
            int var115 = class109.field1514.method605(31981);
            int var116 = class109.field1514.method570(true);
            if (var113 >= 0 && var114 >= 0 && class200.field2594 > var113 && var114 < class118.field1647 && class166.field2149 != var116) {
                class234.method1484((byte) 59, var114, var113, new class9(var111, var115), class448.field6240);
                class94.method640(var114, arg1 - 105, var113, class448.field6240);
            }
        } else if (class92.field1284 == arg0) {
            int var117 = class109.field1514.method617(2);
            int var118 = (var117 >> 4 & 0x7) + class36.field548;
            int var119 = (var117 & 0x7) + class310.field4002;
            int var120 = class109.field1514.method568((byte) 110);
            int var121 = class109.field1514.method617(2);
            int var122 = class109.field1514.method568((byte) 110);
            int var123 = class109.field1514.method617(2);
            if (var118 >= 0 && var119 >= 0 && var118 < class200.field2594 && var119 < class118.field1647) {
                int var124 = var118 * 128 + 64;
                int var125 = var119 * 128 + 64;
                int var126 = class448.field6240;
                if (var126 < 3 && class402.method2389((byte) 64, var119, var118)) {
                    var126++;
                }
                class26 var127 = new class26(var120, var122, class264.field3353, class448.field6240, var126, var124, class366.method2145(class448.field6240, (byte) -122, var124, var125) - var121, var125, var118, var118, var119, var119, var123);
                class385.field5063.method42(new class394(var127), 0);
            }
        } else if (class316.field4071 == arg0) {
            int var128 = class109.field1514.method617(arg1 + 1);
            int var129 = ((var128 & 0x7F) >> 4) + class36.field548;
            int var130 = (var128 & 0x7) + class310.field4002;
            int var131 = class109.field1514.method568((byte) 110);
            int var132 = class109.field1514.method568((byte) 110);
            int var133 = class109.field1514.method568((byte) 110);
            if (class376.field4885 != null && var129 >= 0 && var130 >= 0 && var129 < class200.field2594 && var130 < class118.field1647) {
                class237 var134 = (class237) class376.field4885.method2085((long) (var129 | var130 << 14 | class448.field6240 << 28), -5423);
                if (var134 != null) {
                    for (class9 var135 = (class9) var134.field3082.method49(arg1 - 121); var135 != null; var135 = (class9) var134.field3082.method46((byte) 93)) {
                        if ((var131 & 0x7FFF) == var135.field92 && var135.field88 == var132) {
                            var135.method3021(69);
                            var135.field88 = var133;
                            class234.method1484((byte) 110, var130, var129, var135, class448.field6240);
                            break;
                        }
                    }
                    class94.method640(var130, -62, var129, class448.field6240);
                }
            }
        } else if (class90.field1255 == arg0) {
            int var136 = class109.field1514.method617(arg1 ^ 0x3);
            int var137 = ((var136 & 0xFF) >> 4) + class36.field548 * 2;
            int var138 = (var136 & 0xF) + class310.field4002 * 2;
            boolean var139 = class109.field1514.method617(2) != 0;
            int var140 = class109.field1514.method575(-45) + var137;
            int var141 = class109.field1514.method575(-46) + var138;
            int var142 = class109.field1514.method603((byte) 117);
            int var143 = class109.field1514.method603((byte) -67);
            int var144 = class109.field1514.method568((byte) 110);
            byte var145 = class109.field1514.method575(arg1 ^ 0xFFFFFFD6);
            int var146 = class109.field1514.method617(2) * 4;
            int var147 = class109.field1514.method568((byte) 110);
            int var148 = class109.field1514.method568((byte) 110);
            int var149 = class109.field1514.method617(2);
            if (var149 == 255) {
                var149 = -1;
            }
            int var150 = class109.field1514.method617(2);
            if (var137 >= 0 && var138 >= 0 && var137 < (class200.field2594 * 2) && (class200.field2594 * 2) > var138 && var140 >= 0 && var141 >= 0 && (class118.field1647 * 2) > var140 && (class118.field1647 * 2) > var141 && var144 != 65535) {
                int var151 = var137 * 64;
                int var152 = var138 * 64;
                int var153 = var140 * 64;
                int var154 = var145 << 0;
                int var155 = var146 << 0;
                int var156 = var141 * 64;
                if (var142 != 0) {
                    int var158;
                    class395 var160;
                    if (var142 >= 0) {
                        int var157 = var142 - 1;
                        var158 = (var157 & 0x7997) >> 11;
                        int var159 = var157 & 0x7FF;
                        var160 = class527.field7791[var159];
                    } else {
                        int var161 = -var142 - 1;
                        int var162 = var161 & 0x7FF;
                        var158 = var161 >> 11 & 0xF;
                        if (class166.field2149 == var162) {
                            var160 = class37.field573;
                        } else {
                            var160 = class76.field952[var162];
                        }
                    }
                    if (var160 != null) {
                        class371 var163 = var160.method2347((byte) -121);
                        if (var163.field4804 != null && var163.field4804[var158] != null) {
                            int var164 = var163.field4804[var158][0];
                            int var165 = var163.field4804[var158][2];
                            int var166 = var160.field5209.method336(false);
                            int var167 = class21.field385[var166];
                            int var168 = class21.field397[var166];
                            int var169 = var164 * var168 + var165 * var167 >> 15;
                            int var170 = var165 * var168 - var164 * var167 >> 15;
                            var154 -= var163.field4804[var158][1];
                            var152 += var170;
                            var151 += var169;
                        }
                    }
                }
                class224 var172 = new class224(var144, class448.field6240, var151, var152, var154, class264.field3353 + var147, class264.field3353 + var148, var149, var150, var143, var155, var139);
                var172.method1425(var153, class366.method2145(class448.field6240, (byte) -124, var153, var156) - var155, var147 - -class264.field3353, var156, arg1 ^ 0xFFFF8001);
                class235.field3065.method42(new class352(var172), arg1 ^ 0x1);
            }
        } else {
            class375.method2192((byte) 119, null, "T3 - " + arg0);
            class450.method2667((byte) -120);
            if (arg1 != 1) {
                field7803 = null;
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V", line = 701)
    public static void method3139(int arg0) {
        if (arg0 < -44) {
            field7803 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIBZ)V", line = 712)
    public static final void method3140(int arg0, int arg1, byte arg2, boolean arg3) {
        if (arg2 != -66) {
            field7801 = 107;
        }
        field7808++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class414.field5502 = arg3;
        class426.field5847 = arg1;
        class243.field3122 = arg0;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V", line = 731)
    public static final void method3141(int arg0) {
        field7807++;
        if (class352.field4498) {
            return;
        }
        if (class421.field5647.field7707) {
            class244.field3138 = ((int) class244.field3138 + 191 & 0xFFFFFF80);
        } else {
            class36.field553 += (24.0F - class36.field553) / 2.0F;
        }
        class352.field4498 = true;
        if (arg0 == 19078) {
            class267.field3387 = true;
        }
    }
}
