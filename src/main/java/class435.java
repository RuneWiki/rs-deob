import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class435 {

    @OriginalMember(owner = "client!mq", name = "g", descriptor = "Lada;")
    public static class144 field5822 = new class144(67, 8);

    @OriginalMember(owner = "client!mq", name = "h", descriptor = "Llu;")
    public static class610 field5823 = new class610(78, 4);

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "I")
    public int field5816;

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "I")
    public int field5817;

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "I")
    public static int field5818;

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "I")
    public static int field5819;

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "I")
    public static int field5820;

    @OriginalMember(owner = "client!mq", name = "f", descriptor = "I")
    public static int field5821;

    @OriginalMember(owner = "client!mq", name = "i", descriptor = "I")
    public int field5824;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(BLfaa;)V")
    public static final void method2536(byte arg0, class136 arg1) {
        if (arg0 >= -43) {
            field5822 = null;
        }
        field5820++;
        int var2 = arg1.field1874 - class617.field9123;
        int var3 = arg1.field1889 * 128 + (arg1.method940(-1) * 64);
        int var4 = arg1.field1915 * 128 + arg1.method940(-1) * 64;
        arg1.field8500 += (var4 - arg1.field8500) / var2;
        arg1.field1952 = 0;
        arg1.field8496 += (var3 - arg1.field8496) / var2;
        if (arg1.field1932 == 0) {
            arg1.method955(8192, 51);
        }
        if (arg1.field1932 == 1) {
            arg1.method955(12288, -95);
        }
        if (arg1.field1932 == 2) {
            arg1.method955(0, -71);
        }
        if (arg1.field1932 == 3) {
            arg1.method955(4096, -120);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILgw;)V")
    public final void method2537(int arg0, class148 arg1) {
        while (true) {
            int var3 = arg1.method1032((byte) -33);
            if (var3 == 0) {
                if (arg0 != -1) {
                    this.field5824 = -123;
                }
                field5819++;
                return;
            }
            this.method2539(arg1, -2, var3);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(III)V")
    public static final void method2538(int arg0, int arg1, int arg2) {
        class205 var3 = class420.field5697[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field3040 != null) {
            var3.field3040 = null;
        }
        if (var3.field3050 != null) {
            var3.field3050 = null;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lgw;II)V")
    private final void method2539(class148 arg0, int arg1, int arg2) {
        field5821++;
        if (~arg2 == arg1) {
            this.field5824 = arg0.method1045(true);
            this.field5816 = arg0.method1032((byte) -33);
            this.field5817 = arg0.method1032((byte) -33);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(BLbn;)V")
    public static final void method2540(byte arg0, class378 arg1) {
        field5818++;
        if (class319.field4405 == arg1) {
            int var2 = class632.field9278.method1016(126);
            int var3 = class632.field9278.method1061(-127);
            int var4 = class427.field5749 + (var3 & 0x7);
            int var5 = class38.field463 + var4;
            int var6 = class354.field4816 + (var3 >> 4 & 0x7);
            int var7 = class473.field6687 + var6;
            class85 var8 = (class85) class45.field544.method2799((long) (var7 | var5 << 14 | class616.field9113 << 28), true);
            if (var8 != null) {
                for (class515 var9 = (class515) var8.field1212.method124((byte) 42); var9 != null; var9 = (class515) var8.field1212.method120(-83)) {
                    if ((var2 & 0x7FFF) == var9.field7347) {
                        var9.method2457(-8422);
                        break;
                    }
                }
                if (var8.field1212.method119(true)) {
                    var8.method2457(-8422);
                }
                if (var6 >= 0 && var4 >= 0 && class146.field2125 > var6 && class410.field5609 > var4) {
                    class464.method2793(class616.field9113, (byte) 27, var6, var4);
                }
            }
        } else if (class384.field5285 == arg1) {
            int var10 = class632.field9278.method1046((byte) -43);
            int var11 = (var10 >> 4 & 0x7) + class354.field4816;
            int var12 = (var10 & 0x7) + class427.field5749;
            int var13 = class632.field9278.method1005(11022);
            int var14 = var13 >> 2;
            int var15 = var13 & 0x3;
            int var16 = class480.field6819[var14];
            int var17 = class632.field9278.method1045(true);
            if (class184.method1283(3, class599.field8841) || var11 >= 0 && var12 >= 0 && class146.field2125 > var11 && class410.field5609 > var12) {
                class606.method3567(var12, -1, 0, var17, var14, class616.field9113, var11, var16, var15, -1);
            }
        } else {
            if (arg0 > -30) {
                field5823 = null;
            }
            if (class605.field8999 == arg1) {
                int var18 = class632.field9278.method1032((byte) -33);
                int var19 = (var18 >> 4 & 0x7) + class354.field4816;
                int var20 = (var18 & 0x7) + class427.field5749;
                int var21 = class632.field9278.method1045(true);
                int var22 = class632.field9278.method1032((byte) -33);
                int var23 = class632.field9278.method1045(true);
                int var24 = class632.field9278.method1032((byte) -33);
                if (var19 >= 0 && var20 >= 0 && var19 < class146.field2125 && class410.field5609 > var20) {
                    int var25 = var19 * 128 + 64;
                    int var26 = var20 * 128 + 64;
                    int var27 = class616.field9113;
                    if (var27 < 3 && class111.method815(var19, (byte) 82, var20)) {
                        var27++;
                    }
                    class488 var28 = new class488(var21, var23, class617.field9123, class616.field9113, var27, var25, class132.method919(class616.field9113, var26, var25, (byte) -82) - var22, var26, var19, var19, var20, var20, var24);
                    class33.field397.method131(new class580(var28), 0);
                }
            } else if (class469.field6624 == arg1) {
                int var29 = class632.field9278.method1032((byte) -33);
                int var30 = class354.field4816 + (var29 >> 4 & 0x7);
                int var31 = class427.field5749 + (var29 & 0x7);
                int var32 = class632.field9278.method1045(true);
                if (var32 == 65535) {
                    var32 = -1;
                }
                int var33 = class632.field9278.method1032((byte) -33);
                int var34 = (var33 & 0xF7) >> 4;
                int var35 = var33 & 0x7;
                int var36 = class632.field9278.method1032((byte) -33);
                int var37 = class632.field9278.method1032((byte) -33);
                if (var30 >= 0 && var31 >= 0 && class146.field2125 > var30 && class410.field5609 > var31) {
                    int var38 = var34 + 1;
                    if ((var30 - var38) <= class541.field8119.field1957[0] && (var30 + var38) >= class541.field8119.field1957[0] && (var31 - var38) <= class541.field8119.field1955[0] && class541.field8119.field1955[0] <= var31 + var38) {
                        class192.method1307(var32, var37, var35, var36, (byte) 88, (class616.field9113 << 24) + (var30 << 16) + (var31 << 8) + var34);
                    }
                }
            } else if (class185.field2771 == arg1) {
                class632.field9278.method1032((byte) -33);
                int var39 = class632.field9278.method1032((byte) -33);
                int var40 = class354.field4816 + ((var39 & 0x7A) >> 4);
                int var41 = (var39 & 0x7) + class427.field5749;
                int var42 = class632.field9278.method1045(true);
                int var43 = class632.field9278.method1032((byte) -33);
                int var44 = class632.field9278.method1028((byte) 123);
                String var45 = class632.field9278.method1023(-29153);
                class436.method2542(var44, 8509, class616.field9113, var40, var42, var41, var43, var45);
            } else if (class216.field3171 == arg1) {
                int var46 = class632.field9278.method1032((byte) -33);
                boolean var47 = (var46 & 0x80) != 0;
                int var48 = ((var46 & 0x38) >> 3) + class354.field4816;
                int var49 = class427.field5749 + (var46 & 0x7);
                int var50 = class632.field9278.method1062(-21188) + var48;
                int var51 = class632.field9278.method1062(-21188) + var49;
                int var52 = class632.field9278.method1047(0);
                int var53 = class632.field9278.method1045(true);
                int var54 = class632.field9278.method1032((byte) -33) * 4;
                int var55 = class632.field9278.method1032((byte) -33) * 4;
                int var56 = class632.field9278.method1045(true);
                int var57 = class632.field9278.method1045(true);
                int var58 = class632.field9278.method1032((byte) -33);
                int var59 = class632.field9278.method1045(true);
                if (var58 == 255) {
                    var58 = -1;
                }
                if (var48 >= 0 && var49 >= 0 && var48 < class146.field2125 && var49 < class410.field5609 && var50 >= 0 && var51 >= 0 && var50 < class146.field2125 && class410.field5609 > var51 && var53 != 65535) {
                    int var60 = var55 << 0;
                    int var61 = var51 * 128 + 64;
                    int var62 = var49 * 128 + 64;
                    int var63 = var48 * 128 + 64;
                    int var64 = var54 << 0;
                    int var65 = var50 * 128 + 64;
                    int var66 = var59 << 0;
                    class319 var67 = new class319(var53, class616.field9113, var63, var62, var64, var56 + class617.field9123, class617.field9123 + var57, var58, var66, var52, var60, var47);
                    var67.method1930(0, var65, class132.method919(class616.field9113, var61, var65, (byte) -82) - var60, class617.field9123 + var56, var61);
                    class525.field7519.method131(new class210(var67), 0);
                }
            } else if (class61.field765 == arg1) {
                int var68 = class632.field9278.method1032((byte) -33);
                int var69 = class427.field5749 + (var68 & 0x7);
                int var70 = var69 + class38.field463;
                int var71 = (var68 >> 4 & 0x7) + class354.field4816;
                int var72 = var71 + class473.field6687;
                int var73 = class632.field9278.method1045(true);
                int var74 = class632.field9278.method1045(true);
                int var75 = class632.field9278.method1045(true);
                if (class45.field544 != null) {
                    class85 var76 = (class85) class45.field544.method2799((long) (class616.field9113 << 28 | var70 << 14 | var72), true);
                    if (var76 != null) {
                        for (class515 var77 = (class515) var76.field1212.method124((byte) 42); var77 != null; var77 = (class515) var76.field1212.method120(75)) {
                            if ((var73 & 0x7FFF) == var77.field7347 && var77.field7344 == var74) {
                                var77.method2457(-8422);
                                var77.field7344 = var75;
                                class386.method2301(var77, var70, class616.field9113, var72, -654509970);
                                break;
                            }
                        }
                        if (var71 >= 0 && var69 >= 0 && class146.field2125 > var71 && var69 < class410.field5609) {
                            class464.method2793(class616.field9113, (byte) 27, var71, var69);
                        }
                    }
                }
            } else if (class166.field2613 == arg1) {
                int var78 = class632.field9278.method1032((byte) -33);
                int var79 = ((var78 & 0xF5) >> 4) + class354.field4816 * 2;
                int var80 = (var78 & 0xF) + class427.field5749 * 2;
                boolean var81 = class632.field9278.method1032((byte) -33) != 0;
                int var82 = var79 + class632.field9278.method1062(-21188);
                int var83 = class632.field9278.method1062(-21188) + var80;
                int var84 = class632.field9278.method1047(0);
                int var85 = class632.field9278.method1047(0);
                int var86 = class632.field9278.method1045(true);
                byte var87 = class632.field9278.method1062(-21188);
                int var88 = class632.field9278.method1032((byte) -33) * 4;
                int var89 = class632.field9278.method1045(true);
                int var90 = class632.field9278.method1045(true);
                int var91 = class632.field9278.method1032((byte) -33);
                int var92 = class632.field9278.method1045(true);
                if (var91 == 255) {
                    var91 = -1;
                }
                if (var79 >= 0 && var80 >= 0 && (class146.field2125 * 2) > var79 && var80 < class146.field2125 * 2 && var82 >= 0 && var83 >= 0 && (class410.field5609 * 2) > var82 && (class410.field5609 * 2) > var83 && var86 != 65535) {
                    int var93 = var79 * 64;
                    int var94 = var87 << 0;
                    int var95 = var83 * 64;
                    int var96 = var92 << 0;
                    int var97 = var80 * 64;
                    int var98 = var82 * 64;
                    int var99 = var88 << 0;
                    if (var84 != 0) {
                        class136 var100 = null;
                        int var103;
                        if (var84 < 0) {
                            int var101 = -var84 - 1;
                            int var102 = var101 & 0x7FF;
                            var103 = (var101 & 0x78E5) >> 11;
                            if (class183.field2758 == var102) {
                                var100 = class541.field8119;
                            } else {
                                var100 = class293.field4036[var102];
                            }
                        } else {
                            int var104 = var84 - 1;
                            int var105 = var104 & 0x7FF;
                            var103 = (var104 & 0x7AAE) >> 11;
                            class505 var106 = (class505) class510.field7260.method2799((long) var105, true);
                            if (var106 != null) {
                                var100 = var106.field7148;
                            }
                        }
                        if (var100 != null) {
                            class226 var107 = var100.method947(false);
                            if (var107.field3306 != null && var107.field3306[var103] != null) {
                                int var108 = var107.field3306[var103][0];
                                int var109 = var107.field3306[var103][2];
                                int var110 = var100.field1927.method1318(16383);
                                int var111 = class589.field8742[var110];
                                int var112 = class589.field8735[var110];
                                int var113 = var108 * var112 + var109 * var111 >> 15;
                                int var114 = var109 * var112 - (var108 * var111) >> 15;
                                var93 += var113;
                                var97 += var114;
                                var94 -= var107.field3306[var103][1];
                            }
                        }
                    }
                    class319 var116 = new class319(var86, class616.field9113, var93, var97, var94, var89 + class617.field9123, class617.field9123 + var90, var91, var96, var85, var99, var81);
                    var116.method1930(0, var98, class132.method919(class616.field9113, var95, var98, (byte) -82) - var99, class617.field9123 + var89, var95);
                    class525.field7519.method131(new class210(var116), 0);
                }
            } else if (class54.field637 == arg1) {
                int var117 = class632.field9278.method1016(121);
                int var118 = class632.field9278.method1005(11022);
                int var119 = (var118 & 0x7) + class427.field5749;
                int var120 = class38.field463 + var119;
                int var121 = ((var118 & 0x7D) >> 4) + class354.field4816;
                int var122 = class473.field6687 + var121;
                int var123 = class632.field9278.method1016(-5);
                boolean var124 = var121 >= 0 && var119 >= 0 && var121 < class146.field2125 && var119 < class410.field5609;
                if (var124 || class184.method1283(3, class599.field8841)) {
                    class386.method2301(new class515(var117, var123), var120, class616.field9113, var122, -654509970);
                    if (var124) {
                        class464.method2793(class616.field9113, (byte) 27, var121, var119);
                    }
                }
            } else if (class164.field2599 == arg1) {
                int var125 = class632.field9278.method1032((byte) -33);
                int var126 = ((var125 & 0x71) >> 4) + class354.field4816;
                int var127 = class427.field5749 + (var125 & 0x7);
                int var128 = class632.field9278.method1042((byte) 110);
                if (var128 == 65535) {
                    var128 = -1;
                }
                int var129 = class632.field9278.method1005(11022);
                int var130 = var129 >> 2;
                int var131 = var129 & 0x3;
                int var132 = class480.field6819[var130];
                class237.method1517(var128, var127, var132, class616.field9113, var130, var131, 4, var126);
            } else if (class605.field9000 == arg1) {
                int var133 = class632.field9278.method1045(true);
                int var134 = class632.field9278.method1045(true);
                int var135 = class632.field9278.method1061(-127);
                int var136 = (var135 & 0x7) + class427.field5749;
                int var137 = var136 + class38.field463;
                int var138 = (var135 >> 4 & 0x7) + class354.field4816;
                int var139 = class473.field6687 + var138;
                int var140 = class632.field9278.method1016(125);
                if (class183.field2758 != var134) {
                    boolean var141 = var138 >= 0 && var136 >= 0 && var138 < class146.field2125 && var136 < class410.field5609;
                    if (var141 || class184.method1283(3, class599.field8841)) {
                        class386.method2301(new class515(var133, var140), var137, class616.field9113, var139, -654509970);
                        if (var141) {
                            class464.method2793(class616.field9113, (byte) 27, var138, var136);
                        }
                    }
                }
            } else if (class68.field863 == arg1) {
                int var142 = class632.field9278.method1032((byte) -33);
                int var143 = (var142 >> 4 & 0xF) + class354.field4816 * 2;
                int var144 = (var142 & 0xF) + class427.field5749 * 2;
                boolean var145 = class632.field9278.method1032((byte) -33) != 0;
                int var146 = var143 + class632.field9278.method1062(-21188);
                int var147 = class632.field9278.method1062(-21188) + var144;
                int var148 = class632.field9278.method1047(0);
                int var149 = class632.field9278.method1045(true);
                int var150 = class632.field9278.method1032((byte) -33) * 4;
                int var151 = class632.field9278.method1032((byte) -33) * 4;
                int var152 = class632.field9278.method1045(true);
                int var153 = class632.field9278.method1045(true);
                int var154 = class632.field9278.method1032((byte) -33);
                int var155 = class632.field9278.method1045(true);
                if (var154 == 255) {
                    var154 = -1;
                }
                if (var143 >= 0 && var144 >= 0 && class146.field2125 * 2 > var143 && class146.field2125 * 2 > var144 && var146 >= 0 && var147 >= 0 && (class410.field5609 * 2) > var146 && class410.field5609 * 2 > var147 && var149 != 65535) {
                    int var156 = var146 * 64;
                    int var157 = var150 << 0;
                    int var158 = var155 << 0;
                    int var159 = var144 * 64;
                    int var160 = var143 * 64;
                    int var161 = var147 * 64;
                    int var162 = var151 << 0;
                    class319 var163 = new class319(var149, class616.field9113, var160, var159, var157, class617.field9123 + var152, class617.field9123 + var153, var154, var158, var148, var162, var145);
                    var163.method1930(0, var156, class132.method919(class616.field9113, var161, var156, (byte) -82) - var162, class617.field9123 + var152, var161);
                    class525.field7519.method131(new class210(var163), 0);
                }
            } else if (class358.field4870 == arg1) {
                int var164 = class632.field9278.method1045(true);
                int var165 = class632.field9278.method1032((byte) -33);
                class216.field3172.method1505(-24044, var164).method994((byte) -104, var165);
            } else if (class405.field5535 == arg1) {
                byte var166 = class632.field9278.method1062(-21188);
                int var167 = class632.field9278.method1042((byte) 119);
                int var168 = class632.field9278.method1046((byte) -43);
                int var169 = class354.field4816 + (var168 >> 4 & 0x7);
                int var170 = (var168 & 0x7) + class427.field5749;
                int var171 = class632.field9278.method1042((byte) 98);
                byte var172 = class632.field9278.method1052((byte) -111);
                int var173 = class632.field9278.method1048(24436);
                byte var174 = class632.field9278.method1068((byte) -127);
                int var175 = class632.field9278.method1061(-124);
                int var176 = var175 >> 2;
                int var177 = var175 & 0x3;
                byte var178 = class632.field9278.method1068((byte) -128);
                int var179 = class632.field9278.method1042((byte) 120);
                if (!class99.field1445.method499()) {
                    class389.method2321(var173, (byte) -6, var174, var179, var169, var178, class616.field9113, var170, var172, var176, var177, var171, var167, var166);
                }
            } else if (class513.field7308 == arg1) {
                int var180 = class632.field9278.method1005(11022);
                int var181 = var180 >> 2;
                int var182 = var180 & 0x3;
                int var183 = class480.field6819[var181];
                int var184 = class632.field9278.method1005(11022);
                int var185 = (var184 >> 4 & 0x7) + class354.field4816;
                int var186 = (var184 & 0x7) + class427.field5749;
                if (class184.method1283(3, class599.field8841) || var185 >= 0 && var186 >= 0 && var185 < class146.field2125 && class410.field5609 > var186) {
                    class606.method3567(var186, -1, 0, -1, var181, class616.field9113, var185, var183, var182, -1);
                }
            } else {
                class378.method2255(null, "T3 - " + arg1, 105);
                class120.method861(false, -19);
            }
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)V")
    public static void method2541(byte arg0) {
        field5823 = null;
        field5822 = null;
        int var1 = 49 % ((-arg0 - 37) / 44);
    }
}
