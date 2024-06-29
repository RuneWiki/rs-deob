import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class406 extends class614 {

    @OriginalMember(owner = "client!dea", name = "H", descriptor = "Lqu;")
    public static class364 field5827 = new class364(15, 3);

    @OriginalMember(owner = "client!dea", name = "C", descriptor = "I")
    public int field5822;

    @OriginalMember(owner = "client!dea", name = "F", descriptor = "I")
    public static int field5825;

    @OriginalMember(owner = "client!dea", name = "G", descriptor = "I")
    public static int field5826;

    @OriginalMember(owner = "client!dea", name = "I", descriptor = "I")
    public static int field5828;

    @OriginalMember(owner = "client!dea", name = "J", descriptor = "I")
    public static int field5829;

    @OriginalMember(owner = "client!dea", name = "D", descriptor = "Lvp;")
    public static class110 field5823;

    @OriginalMember(owner = "client!dea", name = "K", descriptor = "Lsaa;")
    public class18 field5830;

    @OriginalMember(owner = "client!dea", name = "E", descriptor = "[B")
    public byte[] field5824;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(IIII)I")
    public static final int method2430(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 64) {
            method2430(-79, -45, -60, 84);
        }
        ++field5829;
        if (arg0 <= arg1) {
            return arg1 > arg2 ? arg2 : arg1;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(B)I")
    public final int method1997(byte arg0) {
        ++field5828;
        if (super.field9003) {
            return 0;
        } else {
            int var2 = 94 % ((arg0 - 32) / 53);
            return 100;
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Z)V")
    public static void method2431(boolean arg0) {
        field5827 = null;
        if (arg0) {
            method2430(25, 94, -40, 81);
        }
        field5823 = null;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(ILfo;)V")
    public static final void method2432(int arg0, class22 arg1) {
        ++field5826;
        if (class202.field3017 == arg1) {
            int var2 = class271.field4010.method2561((byte) -121);
            int var3 = var2 >> 2;
            int var4 = var2 & 3;
            int var5 = class604.field8894[var3];
            int var6 = class271.field4010.method2574((byte) 100);
            int var7 = (var6 >> 4 & 7) + class367.field5318;
            int var8 = (var6 & 7) + class283.field4190;
            int var9 = class271.field4010.method2620(arg0 + 34);
            if (var9 == 65535) {
                var9 = -1;
            }
            class105.method614(var8, var9, var5, var7, var3, true, var4, class140.field1844);
        } else if (class105.field1318 == arg1) {
            int var10 = class271.field4010.method2561((byte) -28);
            int var11 = class367.field5318 * 2 - -(var10 >> 4 & 15);
            int var12 = (var10 & 15) + class283.field4190 * 2;
            boolean var13 = class271.field4010.method2561((byte) -112) != 0;
            int var14 = var11 + class271.field4010.method2570((byte) 57);
            int var15 = class271.field4010.method2570((byte) 57) + var12;
            int var16 = class271.field4010.method2622((byte) 125);
            int var17 = class271.field4010.method2620(18);
            int var18 = class271.field4010.method2561((byte) 119) * 4;
            int var19 = 4 * class271.field4010.method2561((byte) 114);
            int var20 = class271.field4010.method2620(arg0 + 39);
            int var21 = class271.field4010.method2620(57);
            int var22 = class271.field4010.method2561((byte) -46);
            int var23 = class271.field4010.method2620(arg0 + 74);
            if (~var22 == -256) {
                var22 = -1;
            }
            if (~var11 <= -1 && var12 >= 0 && class35.field399 * 2 > var11 && ~(class35.field399 * 2) < ~var12 && var14 >= 0 && var15 >= 0 && var14 < class382.field5586 * 2 && ~var15 > ~(class382.field5586 * 2) && var17 != 65535) {
                int var24 = var19 << 0;
                int var25 = var18 << 0;
                int var26 = var11 * 64;
                int var27 = var23 << 0;
                int var28 = var14 * 64;
                int var29 = var15 * 64;
                int var30 = var12 * 64;
                class267 var31 = new class267(var17, class140.field1844, var26, var30, var25, class576.field8505 + var20, class576.field8505 + var21, var22, var27, var16, var24, var13);
                var31.method1706(var28, var29, (byte) 99, -var24 + class226.method1477(class140.field1844, true, var28, var29), class576.field8505 + var20);
                class537.field7943.method2492(new class274(var31), (byte) 100);
            }
        } else if (class238.field3476 == arg1) {
            int var32 = class271.field4010.method2561((byte) 116);
            int var33 = (15 & var32 >> 4) + class367.field5318 * 2;
            int var34 = (15 & var32) + class283.field4190 * 2;
            boolean var35 = class271.field4010.method2561((byte) 116) != 0;
            int var36 = var33 - -class271.field4010.method2570((byte) 57);
            int var37 = class271.field4010.method2570((byte) 57) + var34;
            int var38 = class271.field4010.method2622((byte) 125);
            int var39 = class271.field4010.method2622((byte) 124);
            int var40 = class271.field4010.method2620(34);
            byte var41 = class271.field4010.method2570((byte) 57);
            int var42 = 4 * class271.field4010.method2561((byte) -93);
            int var43 = class271.field4010.method2620(58);
            int var44 = class271.field4010.method2620(103);
            int var45 = class271.field4010.method2561((byte) 119);
            int var46 = class271.field4010.method2620(114);
            if (var45 == 255) {
                var45 = -1;
            }
            if (~var33 <= -1 && var34 >= 0 && var33 < class35.field399 * 2 && ~(class35.field399 * 2) < ~var34 && var36 >= 0 && var37 >= 0 && class382.field5586 * 2 > var36 && ~(class382.field5586 * 2) < ~var37 && var40 != 65535) {
                int var47 = var41 << 0;
                int var48 = var34 * 64;
                int var49 = var36 * 64;
                int var50 = var37 * 64;
                int var51 = var46 << 0;
                int var52 = var42 << 0;
                int var53 = var33 * 64;
                if (~var38 != -1) {
                    class86 var54 = null;
                    int var56;
                    if (~var38 > -1) {
                        int var55 = -var38 + -1;
                        var56 = var55 >> 11 & 15;
                        int var57 = 2047 & var55;
                        if (class404.field5807 != var57) {
                            var54 = class383.field5604[var57];
                        } else {
                            var54 = class239.field3493;
                        }
                    } else {
                        int var58 = var38 + -1;
                        int var59 = 2047 & var58;
                        var56 = var58 >> 11 & 15;
                        class234 var60 = (class234) class627.field9185.method1333((long) var59, false);
                        if (var60 != null) {
                            var54 = var60.field3443;
                        }
                    }
                    if (var54 != null) {
                        class229 var61 = var54.method513(0);
                        if (var61.field3381 != null && var61.field3381[var56] != null) {
                            int var62 = var61.field3381[var56][0];
                            int var63 = var61.field3381[var56][2];
                            int var64 = var54.field1067.method1378(-94);
                            int var65 = class14.field129[var64];
                            int var66 = class14.field130[var64];
                            int var67 = var62 * var66 + var63 * var65 >> 15;
                            int var68 = var63 * var66 + -(var62 * var65) >> 15;
                            var53 += var67;
                            var47 -= var61.field3381[var56][1];
                            var48 += var68;
                        }
                    }
                }
                class267 var70 = new class267(var40, class140.field1844, var53, var48, var47, class576.field8505 + var43, class576.field8505 + var44, var45, var51, var39, var52, var35);
                var70.method1706(var49, var50, (byte) 112, class226.method1477(class140.field1844, true, var49, var50) - var52, class576.field8505 + var43);
                class537.field7943.method2492(new class274(var70), (byte) 40);
            }
        } else if (class159.field2123 == arg1) {
            int var71 = class271.field4010.method2561((byte) 118);
            int var72 = ((var71 & 120) >> 4) + class367.field5318;
            int var73 = class283.field4190 - -(7 & var71);
            int var74 = class271.field4010.method2620(92);
            if (var74 == 65535) {
                var74 = -1;
            }
            int var75 = class271.field4010.method2561((byte) -59);
            int var76 = (var75 & 243) >> 4;
            int var77 = var75 & 7;
            int var78 = class271.field4010.method2561((byte) 117);
            int var79 = class271.field4010.method2561((byte) -39);
            if (~var72 <= -1 && var73 >= 0 && var72 < class35.field399 && class382.field5586 > var73) {
                int var80 = var76 + 1;
                if (class239.field3493.field1090[0] >= var72 - var80 && ~(var72 + var80) <= ~class239.field3493.field1090[0] && ~(var73 - var80) >= ~class239.field3493.field1089[0] && var73 - -var80 >= class239.field3493.field1089[0]) {
                    class280.method1763(var78, var79, var77, var74, -47, (var73 << 8) + ((class140.field1844 << 24) - -(var72 << 16)) - -var76);
                }
            }
        } else if (class287.field4228 == arg1) {
            int var81 = class271.field4010.method2600(124);
            int var82 = var81 >> 2;
            int var83 = var81 & 3;
            int var84 = class604.field8894[var82];
            int var85 = class271.field4010.method2574((byte) 123);
            int var86 = (var85 >> 4 & 7) + class367.field5318;
            int var87 = class283.field4190 - -(var85 & 7);
            if (class126.method776((byte) -51, class277.field4064) || ~var86 <= -1 && var87 >= 0 && ~class35.field399 < ~var86 && ~class382.field5586 < ~var87) {
                class497.method2999(class140.field1844, var84, -1, 0, var82, -1, (byte) 127, var87, var86, var83);
            }
        } else if (class228.field3355 == arg1) {
            class271.field4010.method2561((byte) -120);
            int var88 = class271.field4010.method2561((byte) -87);
            int var89 = ((var88 & 113) >> 4) + class367.field5318;
            int var90 = (var88 & 7) + class283.field4190;
            int var91 = class271.field4010.method2620(93);
            int var92 = class271.field4010.method2561((byte) 116);
            int var93 = class271.field4010.method2601(50);
            String var94 = class271.field4010.method2585(113);
            class218.method1446(var92, var91, class140.field1844, var90, arg0 ^ -64, var93, var89, var94);
        } else if (class93.field1153 == arg1) {
            int var95 = class271.field4010.method2615(255);
            int var96 = (7 & var95 >> 4) + class367.field5318;
            int var97 = class283.field4190 - -(var95 & 7);
            int var98 = class271.field4010.method2615(255);
            int var99 = var98 >> 2;
            int var100 = 3 & var98;
            int var101 = class604.field8894[var99];
            int var102 = class271.field4010.method2587(arg0 + 11608);
            if (class126.method776((byte) -71, class277.field4064) || ~var96 <= -1 && var97 >= 0 && class35.field399 > var96 && class382.field5586 > var97) {
                class497.method2999(class140.field1844, var101, var102, 0, var99, -1, (byte) 126, var97, var96, var100);
            }
        } else if (class200.field2995 == arg1) {
            int var103 = class271.field4010.method2621(arg0 + -18764);
            int var104 = class271.field4010.method2620(93);
            int var105 = class271.field4010.method2615(255);
            int var106 = (7 & var105) + class283.field4190;
            int var107 = class424.field6061 + var106;
            int var108 = ((var105 & 113) >> 4) + class367.field5318;
            int var109 = class584.field8677 + var108;
            int var110 = class271.field4010.method2620(arg0 ^ 63);
            if (~class404.field5807 != ~var104) {
                boolean var111 = ~var108 <= -1 && ~var106 <= -1 && var108 < class35.field399 && var106 < class382.field5586;
                if (var111 || class126.method776((byte) -113, class277.field4064)) {
                    class49.method250(new class539(var110, var103), var107, class140.field1844, -843093938, var109);
                    if (var111) {
                        class229.method1496(-19, var108, class140.field1844, var106);
                    }
                }
            }
        } else if (arg0 == 7) {
            if (class19.field169 == arg1) {
                byte var112 = class271.field4010.method2604(arg0 ^ 27699);
                int var113 = class271.field4010.method2574((byte) -69);
                int var114 = ((123 & var113) >> 4) + class367.field5318;
                int var115 = (var113 & 7) + class283.field4190;
                int var116 = class271.field4010.method2622((byte) 125);
                int var117 = class271.field4010.method2616(79);
                byte var118 = class271.field4010.method2598(true);
                int var119 = class271.field4010.method2620(101);
                int var120 = class271.field4010.method2561((byte) 120);
                int var121 = var120 >> 2;
                int var122 = var120 & 3;
                int var123 = class271.field4010.method2621(-18757);
                byte var124 = class271.field4010.method2598(true);
                byte var125 = class271.field4010.method2604(arg0 + 27693);
                if (!class379.field5558.method976()) {
                    class475.method2890(var114, var119, var125, var122, var112, var116, false, var121, class140.field1844, var117, var118, var123, var124, var115);
                }
            } else if (class178.field2700 == arg1) {
                int var126 = class271.field4010.method2574((byte) 119);
                int var127 = (7 & var126) + class283.field4190;
                int var128 = class424.field6061 + var127;
                int var129 = ((119 & var126) >> 4) + class367.field5318;
                int var130 = class584.field8677 + var129;
                int var131 = class271.field4010.method2620(arg0 ^ 108);
                class368 var132 = (class368) class546.field8147.method1333((long) (var128 << 14 | class140.field1844 << 28 | var130), false);
                if (var132 != null) {
                    for (class539 var133 = (class539) var132.field5322.method2496((byte) -106); var133 != null; var133 = (class539) var132.field5322.method2494(112)) {
                        if (~(var131 & 32767) == ~var133.field7977) {
                            var133.method2997(1);
                            break;
                        }
                    }
                    if (var132.field5322.method2488((byte) 125)) {
                        var132.method2997(1);
                    }
                    if (var129 >= 0 && var127 >= 0 && ~var129 > ~class35.field399 && class382.field5586 > var127) {
                        class229.method1496(-57, var129, class140.field1844, var127);
                    }
                }
            } else if (class238.field3482 == arg1) {
                int var134 = class271.field4010.method2561((byte) 125);
                int var135 = class367.field5318 - -(var134 >> 4 & 7);
                int var136 = (var134 & 7) + class283.field4190;
                int var137 = class271.field4010.method2620(72);
                int var138 = class271.field4010.method2561((byte) -54);
                int var139 = class271.field4010.method2620(arg0 ^ 123);
                int var140 = class271.field4010.method2561((byte) 119);
                if (var135 >= 0 && var136 >= 0 && var135 < class35.field399 && var136 < class382.field5586) {
                    int var141 = var135 * 128 - -64;
                    int var142 = var136 * 128 + 64;
                    int var143 = class140.field1844;
                    if (~var143 > -4 && class300.method1855(var135, var136, 22753)) {
                        ++var143;
                    }
                    class243 var144 = new class243(var137, var139, class576.field8505, class140.field1844, var143, var141, -var138 + class226.method1477(class140.field1844, true, var141, var142), var142, var135, var135, var136, var136, var140);
                    class603.field8887.method2492(new class143(var144), (byte) -98);
                }
            } else if (class110.field1396 == arg1) {
                int var145 = class271.field4010.method2561((byte) -89);
                int var146 = (var145 & 7) + class283.field4190;
                int var147 = class424.field6061 + var146;
                int var148 = class367.field5318 - -((var145 & 126) >> 4);
                int var149 = class584.field8677 + var148;
                int var150 = class271.field4010.method2620(40);
                int var151 = class271.field4010.method2620(124);
                int var152 = class271.field4010.method2620(78);
                if (class546.field8147 != null) {
                    class368 var153 = (class368) class546.field8147.method1333((long) (var147 << 14 | class140.field1844 << 28 | var149), false);
                    if (var153 != null) {
                        for (class539 var154 = (class539) var153.field5322.method2496((byte) -123); var154 != null; var154 = (class539) var153.field5322.method2494(120)) {
                            if ((var150 & 32767) == var154.field7977 && var154.field7975 == var151) {
                                var154.method2997(1);
                                var154.field7975 = var152;
                                class49.method250(var154, var147, class140.field1844, arg0 ^ -843093943, var149);
                                break;
                            }
                        }
                        if (var148 >= 0 && ~var146 <= -1 && class35.field399 > var148 && var146 < class382.field5586) {
                            class229.method1496(-94, var148, class140.field1844, var146);
                        }
                    }
                }
            } else if (class277.field4104 == arg1) {
                int var155 = class271.field4010.method2561((byte) 118);
                boolean var156 = (var155 & 128) != 0;
                int var157 = ((56 & var155) >> 3) + class367.field5318;
                int var158 = class283.field4190 - -(7 & var155);
                int var159 = var157 - -class271.field4010.method2570((byte) 57);
                int var160 = class271.field4010.method2570((byte) 57) + var158;
                int var161 = class271.field4010.method2622((byte) 126);
                int var162 = class271.field4010.method2620(98);
                int var163 = class271.field4010.method2561((byte) 121) * 4;
                int var164 = 4 * class271.field4010.method2561((byte) 117);
                int var165 = class271.field4010.method2620(66);
                int var166 = class271.field4010.method2620(91);
                int var167 = class271.field4010.method2561((byte) -126);
                int var168 = class271.field4010.method2620(47);
                if (var167 == 255) {
                    var167 = -1;
                }
                if (var157 >= 0 && var158 >= 0 && var157 < class35.field399 && ~class382.field5586 < ~var158 && ~var159 <= -1 && ~var160 <= -1 && var159 < class35.field399 && ~class382.field5586 < ~var160 && var162 != 65535) {
                    int var169 = var164 << 0;
                    int var170 = var168 << 0;
                    int var171 = var160 * 128 + 64;
                    int var172 = var163 << 0;
                    int var173 = var159 * 128 + 64;
                    int var174 = var158 * 128 + 64;
                    int var175 = var157 * 128 + 64;
                    class267 var176 = new class267(var162, class140.field1844, var175, var174, var172, var165 - -class576.field8505, class576.field8505 + var166, var167, var170, var161, var169, var156);
                    var176.method1706(var173, var171, (byte) -115, -var169 + class226.method1477(class140.field1844, true, var173, var171), class576.field8505 + var165);
                    class537.field7943.method2492(new class274(var176), (byte) -124);
                }
            } else if (class21.field188 != arg1) {
                if (class152.field1945 == arg1) {
                    int var185 = class271.field4010.method2620(arg0 + 25);
                    int var186 = class271.field4010.method2561((byte) -54);
                    class312.field4690.method2004(false, var185).method921(-20318, var186);
                } else {
                    class31.method140("T3 - " + arg1, arg0 + -112, (Throwable) null);
                    class550.method3221(0, false);
                }
            } else {
                int var177 = class271.field4010.method2620(41);
                int var178 = class271.field4010.method2615(255);
                int var179 = class283.field4190 - -(var178 & 7);
                int var180 = class424.field6061 + var179;
                int var181 = class367.field5318 - -(7 & var178 >> 4);
                int var182 = class584.field8677 + var181;
                int var183 = class271.field4010.method2620(51);
                boolean var184 = var181 >= 0 && ~var179 <= -1 && ~class35.field399 < ~var181 && ~var179 > ~class382.field5586;
                if (var184 || class126.method776((byte) -69, class277.field4064)) {
                    class49.method250(new class539(var177, var183), var180, class140.field1844, -843093938, var182);
                    if (var184) {
                        class229.method1496(-84, var181, class140.field1844, var179);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dea", name = "g", descriptor = "(I)[B")
    public final byte[] method1999(int arg0) {
        ++field5825;
        if (arg0 != -8820) {
            method2431(true);
        }
        if (super.field9003) {
            throw new RuntimeException();
        } else {
            return this.field5824;
        }
    }
}
