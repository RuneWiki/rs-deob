import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class23 {

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public int field562;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "[I")
    public int[] field566;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "[Lsb;")
    public class127[] field564;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "Lsf;")
    public static class124 field565 = new class124(16);

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "[I")
    public static int[] field570 = new int[1024];

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "Lsf;")
    public static class124 field573 = new class124(8);

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "[Lrm;")
    public static class273[] field576 = new class273[4];

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "Lsf;")
    public static class124 field575 = new class124(16);

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "Ljava/lang/String;")
    public static String field577 = "Allocating memory";

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
    public static int field579 = -1;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "F")
    public static float field571;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "Ljj;")
    public static class168 field580;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "Ldk;")
    public static class237 field578;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "Lbn;")
    public static class75 field574;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "[[Lwl;")
    public static class102[][] field572;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIII)V", line = 6)
    public static final void method195(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field567++;
        if (class8.field268 != 0 && arg2 != 0 && class271.field4414 < 50 && arg1 != -1) {
            class1.field9[class271.field4414] = arg1;
            class36.field794[class271.field4414] = arg2;
            class25.field649[class271.field4414] = arg4;
            class222.field3672[class271.field4414] = null;
            class22.field554[class271.field4414] = 0;
            class338.field5353[class271.field4414] = arg3;
            class271.field4414++;
        }
        if (arg0 <= 10) {
            field573 = (class124) null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V", line = 31)
    public static void method196(byte arg0) {
        field574 = null;
        field578 = null;
        field576 = null;
        field570 = null;
        if (arg0 > -60) {
            field571 = 1.0967453F;
        }
        field580 = null;
        field573 = null;
        field572 = (class102[][]) null;
        field565 = null;
        field577 = null;
        field575 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lqk;Lqk;B)V", line = 50)
    public static final void method197(class70 arg0, class70 arg1, byte arg2) {
        if (arg2 != 58) {
            method199((byte) -3, 1);
        }
        if (arg1.field1292 != null) {
            arg1.method535(-2801);
        }
        arg1.field1292 = arg0.field1292;
        arg1.field1290 = arg0;
        arg1.field1292.field1290 = arg1;
        field561++;
        arg1.field1290.field1292 = arg1;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Loe;B)Luf;", line = 71)
    public static final class26 method198(class146 arg0, byte arg1) {
        field563++;
        int var2 = -18 / ((arg1 - 63) / 37);
        return new class26(arg0.method1050(3), arg0.method1050(3), arg0.method1050(3), arg0.method1050(3), arg0.method1050(3), arg0.method1050(3), arg0.method1050(3), arg0.method1050(3), arg0.method1025((byte) -32), arg0.method1005((byte) 122));
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BI)Lnj;", line = 89)
    public static final class252 method199(byte arg0, int arg1) {
        field568++;
        class252 var2 = (class252) class255.field4175.method893((long) arg1, 79);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class269.field4391.method1404(1, arg1, (byte) -87);
        class252 var4 = new class252();
        var4.field4153 = arg1;
        if (var3 != null) {
            var4.method1774(new class146(var3), 113);
        }
        var4.method1778(-863);
        if (var4.field4135 == 2 && class346.field5527.method2344(-1, (long) arg1) == null) {
            class346.field5527.method2337(new class111(class37.field804), 709, (long) arg1);
            class41.field894[class37.field804++] = var4;
        }
        int var5 = -85 % ((arg0 + 8) / 51);
        class255.field4175.method888((long) arg1, var4, 101);
        return var4;
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(I)V", line = 122)
    public class23(int arg0) {
        this.field562 = arg0;
        this.field566 = new int[this.field562];
        this.field564 = new class127[this.field562];
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)V", line = 134)
    public static final void method200(int arg0, int arg1) {
        field560++;
        if (arg1 != 120) {
            field570 = (int[]) null;
        }
        field565.method896(arg0, (byte) -114);
        class125.field2200.method896(arg0, (byte) -94);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V", line = 146)
    public static final void method201(int arg0) {
        field569++;
        if (class65.field1240 == 107) {
            int var149 = class342.field5413.method1034(0);
            int var150 = (var149 & 0x7) + class97.field1772;
            int var151 = ((var149 & 0x7F) >> 4) + class310.field5059;
            int var152 = class342.field5413.method1054(arg0 ^ 0xFFFFFFFD);
            int var153 = class342.field5413.method1011(-32768);
            int var154 = class342.field5413.method1011(-32768);
            if (var151 >= 0 && var150 >= 0 && var151 < 104 && var150 < 104 && class96.field1752 != var153) {
                class363 var155 = new class363();
                var155.field5749 = var152;
                var155.field5750 = var154;
                if (class99.field1810[class276.field4506][var151][var150] == null) {
                    class99.field1810[class276.field4506][var151][var150] = new class49();
                }
                class99.field1810[class276.field4506][var151][var150].method437(new class167(var155), (byte) 51);
                class8.method88(20000, var151, var150);
            }
        } else if (class65.field1240 == 124) {
            int var139 = class342.field5413.method1005((byte) 122);
            int var140 = (var139 >> 4 & 0x7) + class310.field5059;
            int var141 = class97.field1772 + (var139 & 0x7);
            int var142 = class342.field5413.method989(68);
            int var143 = class342.field5413.method1005((byte) 122);
            if (var142 == 65535) {
                var142 = -1;
            }
            int var144 = var143 & 0x7;
            int var145 = (var143 & 0xFD) >> 4;
            int var146 = class342.field5413.method1005((byte) 122);
            int var147 = class342.field5413.method1005((byte) 122);
            if (var140 >= 0 && var141 >= 0 && var140 < 104 && var141 < 104) {
                int var148 = var145 + 1;
                if (var140 - var148 <= class96.field1750.field139[0] && class96.field1750.field139[0] <= var140 + var148 && class96.field1750.field170[0] >= (var141 - var148) && (var141 + var148) >= class96.field1750.field170[0] && class30.field706 != 0 && var144 > 0 && class271.field4414 < 50 && var142 != -1) {
                    class1.field9[class271.field4414] = var142;
                    class36.field794[class271.field4414] = var144;
                    class25.field649[class271.field4414] = var146;
                    class222.field3672[class271.field4414] = null;
                    class22.field554[class271.field4414] = (var141 << 8) + ((var140 << 16) + var145);
                    class338.field5353[class271.field4414] = var147;
                    class271.field4414++;
                }
            }
        } else if (class65.field1240 == 77) {
            int var137 = class342.field5413.method989(96);
            int var138 = class342.field5413.method1005((byte) 122);
            class1.method7(var137, 25).method1649(false, var138);
        } else if (class65.field1240 == 59) {
            int var128 = class342.field5413.method1005((byte) 122);
            int var129 = (var128 & 0x7) + class97.field1772;
            int var130 = (var128 >> 4 & 0x7) + class310.field5059;
            int var131 = class342.field5413.method989(66);
            int var132 = class342.field5413.method1005((byte) 122);
            int var133 = class342.field5413.method989(109);
            if (var130 >= 0 && var129 >= 0 && var130 < 104 && var129 < 104) {
                int var134 = var129 * 128 + 64;
                int var135 = var130 * 128 + 64;
                class176 var136 = new class176(var131, class276.field4506, var135, var134, class21.method189((byte) 108, var134, var135, class276.field4506) - var132, var133, class267.field4371);
                class181.field3121.method437(new class90(var136), (byte) 51);
            }
        } else if (class65.field1240 == 228) {
            int var110 = class342.field5413.method1005((byte) 122);
            int var111 = ((var110 & 0x78) >> 4) + class310.field5059;
            int var112 = class97.field1772 + (var110 & 0x7);
            int var113 = class342.field5413.method1029(-2) + var111;
            int var114 = var112 + class342.field5413.method1029(-2);
            int var115 = class342.field5413.method1050(arg0 + 4);
            int var116 = class342.field5413.method989(120);
            int var117 = class342.field5413.method1005((byte) 122) * 4;
            int var118 = class342.field5413.method1005((byte) 122) * 4;
            int var119 = class342.field5413.method989(67);
            int var120 = class342.field5413.method989(65);
            int var121 = class342.field5413.method1005((byte) 122);
            int var122 = class342.field5413.method1005((byte) 122);
            if (var121 == 255) {
                var121 = -1;
            }
            if (var111 >= 0 && var112 >= 0 && var111 < 104 && var112 < 104 && var113 >= 0 && var114 >= 0 && var113 < 104 && var114 < 104 && var116 != 65535) {
                int var123 = var112 * 128 + 64;
                int var124 = var114 * 128 + 64;
                int var125 = var111 * 128 + 64;
                int var126 = var113 * 128 + 64;
                class151 var127 = new class151(var116, class276.field4506, var125, var123, class21.method189((byte) -112, var123, var125, class276.field4506) - var117, var119 - -class267.field4371, class267.field4371 + var120, var121, var122, var115, var118);
                var127.method1082(71, class267.field4371 + var119, var124, class21.method189((byte) 62, var124, var126, class276.field4506) - var118, var126);
                class275.field4486.method437(new class177(var127), (byte) 51);
            }
        } else if (class65.field1240 == 12) {
            int var1 = class342.field5413.method1005((byte) 122);
            int var2 = (var1 >> 4 & 0x7) + class310.field5059;
            int var3 = (var1 & 0x7) + class97.field1772;
            int var4 = class342.field5413.method1054(2);
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class49 var5 = class99.field1810[class276.field4506][var2][var3];
                if (var5 != null) {
                    for (class167 var6 = (class167) var5.method431(~arg0); var6 != null; var6 = (class167) var5.method439(arg0 ^ 0x6F5F)) {
                        if ((var4 & 0x7FFF) == var6.field2787.field5749) {
                            var6.method535(-2801);
                            break;
                        }
                    }
                    if (var5.method431(0) == null) {
                        class99.field1810[class276.field4506][var2][var3] = null;
                    }
                    class8.method88(20000, var2, var3);
                }
            }
        } else if (class65.field1240 == 115) {
            int var103 = class342.field5413.method1034(0);
            int var104 = var103 >> 2;
            int var105 = class47.field952[var104];
            int var106 = class342.field5413.method1005((byte) 122);
            int var107 = (var106 >> 4 & 0x7) + class310.field5059;
            int var108 = (var106 & 0x7) + class97.field1772;
            int var109 = var103 & 0x3;
            if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104) {
                class142.method973(var104, var107, class276.field4506, var105, -1, var108, -1, 6, var109, 0);
            }
        } else {
            if (arg0 != -1) {
                method198((class146) null, (byte) -40);
            }
            if (class65.field1240 == 19) {
                int var97 = class342.field5413.method996(6107);
                int var98 = class342.field5413.method1011(arg0 - 32767);
                int var99 = class342.field5413.method1005((byte) 122);
                int var100 = (var99 & 0x7) + class97.field1772;
                int var101 = (var99 >> 4 & 0x7) + class310.field5059;
                if (var101 >= 0 && var100 >= 0 && var101 < 104 && var100 < 104) {
                    class363 var102 = new class363();
                    var102.field5750 = var97;
                    var102.field5749 = var98;
                    if (class99.field1810[class276.field4506][var101][var100] == null) {
                        class99.field1810[class276.field4506][var101][var100] = new class49();
                    }
                    class99.field1810[class276.field4506][var101][var100].method437(new class167(var102), (byte) 51);
                    class8.method88(arg0 ^ 0xFFFFB1DF, var101, var100);
                }
            } else {
                if (class65.field1240 == 171) {
                    int var7 = class342.field5413.method996(arg0 ^ 0xFFFFE824);
                    byte var8 = class342.field5413.method1046((byte) 70);
                    byte var9 = class342.field5413.method1046((byte) 70);
                    int var10 = class342.field5413.method1054(arg0 + 3);
                    byte var11 = class342.field5413.method998((byte) -1);
                    int var12 = class342.field5413.method1021((byte) 45);
                    int var13 = class342.field5413.method1007(-2);
                    int var14 = var13 >> 2;
                    int var15 = var13 & 0x3;
                    int var16 = class342.field5413.method989(118);
                    int var17 = class342.field5413.method1034(0);
                    int var18 = (var17 >> 4 & 0x7) + class310.field5059;
                    int var19 = (var17 & 0x7) + class97.field1772;
                    byte var20 = class342.field5413.method1044(97);
                    if (!class241.field4016) {
                        class47.method395(var7, var16, var8, var10, var20, arg0 ^ 0x76, var14, var9, var12, var18, var11, var19, var15);
                    }
                }
                if (class65.field1240 == 145) {
                    int var88 = class342.field5413.method1005((byte) 122);
                    int var89 = (var88 >> 4 & 0x7) + class310.field5059;
                    int var90 = (var88 & 0x7) + class97.field1772;
                    int var91 = class342.field5413.method989(arg0 ^ 0xFFFFFF9A);
                    int var92 = class342.field5413.method989(arg0 + 90);
                    int var93 = class342.field5413.method989(61);
                    if (var89 >= 0 && var90 >= 0 && var89 < 104 && var90 < 104) {
                        class49 var94 = class99.field1810[class276.field4506][var89][var90];
                        if (var94 != null) {
                            for (class167 var95 = (class167) var94.method431(0); var95 != null; var95 = (class167) var94.method439(arg0 - 28511)) {
                                class363 var96 = var95.field2787;
                                if ((var91 & 0x7FFF) == var96.field5749 && var96.field5750 == var92) {
                                    var96.field5750 = var93;
                                    break;
                                }
                            }
                            class8.method88(20000, var89, var90);
                        }
                    }
                } else if (class65.field1240 == 32) {
                    int var21 = class342.field5413.method1005((byte) 122);
                    int var22 = ((var21 & 0xFE) >> 4) + class310.field5059 * 2;
                    int var23 = (var21 & 0xF) + class97.field1772 * 2;
                    int var24 = class342.field5413.method1029(-2) + var22;
                    int var25 = class342.field5413.method1029(arg0 ^ 0x1) + var23;
                    int var26 = class342.field5413.method1050(3);
                    int var27 = class342.field5413.method989(67);
                    int var28 = class342.field5413.method1005((byte) 122) * 4;
                    int var29 = class342.field5413.method1005((byte) 122) * 4;
                    int var30 = class342.field5413.method989(99);
                    int var31 = class342.field5413.method989(118);
                    int var32 = class342.field5413.method1005((byte) 122);
                    int var33 = class342.field5413.method1005((byte) 122);
                    if (var32 == 255) {
                        var32 = -1;
                    }
                    if (var22 >= 0 && var23 >= 0 && var22 < 208 && var23 < 208 && var24 >= 0 && var25 >= 0 && var24 < 208 && var25 < 208 && var27 != 65535) {
                        int var34 = var24 * 64;
                        int var35 = var23 * 64;
                        int var36 = var25 * 64;
                        int var37 = var22 * 64;
                        class151 var38 = new class151(var27, class276.field4506, var37, var35, class21.method189((byte) -126, var35, var37, class276.field4506) - var28, var30 - -class267.field4371, var31 + class267.field4371, var32, var33, var26, var29);
                        var38.method1082(-108, class267.field4371 + var30, var36, class21.method189((byte) -50, var36, var34, class276.field4506) - var29, var34);
                        class275.field4486.method437(new class177(var38), (byte) 51);
                    }
                } else if (class65.field1240 == 109) {
                    int var55 = class342.field5413.method1005((byte) 122);
                    int var56 = class310.field5059 * 2 + (var55 >> 4 & 0xF);
                    int var57 = (var55 & 0xF) + class97.field1772 * 2;
                    int var58 = var56 + class342.field5413.method1029(-2);
                    int var59 = class342.field5413.method1029(-2) + var57;
                    int var60 = class342.field5413.method1050(3);
                    int var61 = class342.field5413.method1050(3);
                    int var62 = class342.field5413.method989(101);
                    int var63 = class342.field5413.method1029(-2);
                    int var64 = class342.field5413.method1005((byte) 122) * 4;
                    int var65 = class342.field5413.method989(arg0 + 112);
                    int var66 = class342.field5413.method989(arg0 ^ 0xFFFFFF9E);
                    int var67 = class342.field5413.method1005((byte) 122);
                    if (var67 == 255) {
                        var67 = -1;
                    }
                    int var68 = class342.field5413.method1005((byte) 122);
                    if (var56 >= 0 && var57 >= 0 && var56 < 208 && var57 < 208 && var58 >= 0 && var59 >= 0 && var58 < 208 && var59 < 208 && var62 != 65535) {
                        int var69 = var56 * 64;
                        int var70 = var58 * 64;
                        int var71 = var59 * 64;
                        int var72 = var57 * 64;
                        if (var60 != 0) {
                            int var74;
                            class6 var76;
                            if (var60 < 0) {
                                int var73 = -var60 - 1;
                                var74 = (var73 & 0x7DB8) >> 11;
                                int var75 = var73 & 0x7FF;
                                if (class96.field1752 == var75) {
                                    var76 = class96.field1750;
                                } else {
                                    var76 = class182.field3151[var75];
                                }
                            } else {
                                int var77 = var60 - 1;
                                int var78 = var77 & 0x7FF;
                                var76 = class149.field2533[var78];
                                var74 = (var77 & 0x7A8C) >> 11;
                            }
                            if (var76 != null) {
                                class5 var79 = var76.method60(true);
                                if (var79.field77 != null && var79.field77[var74] != null) {
                                    int var80 = var79.field77[var74][0];
                                    var63 -= var79.field77[var74][1];
                                    int var81 = var79.field77[var74][2];
                                    int var82 = class305.field4959[var76.field216];
                                    int var83 = class305.field4957[var76.field216];
                                    int var84 = var80 * var83 + var81 * var82 >> 16;
                                    int var85 = var81 * var83 - (var80 * var82) >> 16;
                                    var72 += var85;
                                    var69 += var84;
                                }
                            }
                        }
                        class151 var87 = new class151(var62, class276.field4506, var69, var72, class21.method189((byte) -128, var72, var69, class276.field4506) - var63, class267.field4371 + var65, class267.field4371 + var66, var67, var68, var61, var64);
                        var87.method1082(-71, class267.field4371 + var65, var71, class21.method189((byte) -67, var71, var70, class276.field4506) - var64, var70);
                        class275.field4486.method437(new class177(var87), (byte) 51);
                    }
                } else if (class65.field1240 == 179) {
                    int var39 = class342.field5413.method1011(-32768);
                    int var40 = class342.field5413.method1034(0);
                    int var41 = (var40 & 0x7) + class97.field1772;
                    int var42 = ((var40 & 0x71) >> 4) + class310.field5059;
                    int var43 = class342.field5413.method1007(arg0 - 1);
                    int var44 = var43 & 0x3;
                    int var45 = var43 >> 2;
                    int var46 = class47.field952[var45];
                    if (var42 >= 0 && var41 >= 0 && var42 < 104 && var41 < 104) {
                        class142.method973(var45, var42, class276.field4506, var46, -1, var41, var39, 6, var44, 0);
                    }
                } else if (class65.field1240 == 22) {
                    int var47 = class342.field5413.method992((byte) 115);
                    int var48 = (var47 & 0x7) + class97.field1772;
                    int var49 = ((var47 & 0x74) >> 4) + class310.field5059;
                    int var50 = class342.field5413.method992((byte) 91);
                    int var51 = var50 >> 2;
                    int var52 = var50 & 0x3;
                    int var53 = class47.field952[var51];
                    int var54 = class342.field5413.method996(6107);
                    if (var54 == 65535) {
                        var54 = -1;
                    }
                    class174.method1236(var53, arg0 ^ 0xFFFFFFA8, var54, class276.field4506, var52, var49, var48, var51);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)J", line = 752)
    public static final long method202(int arg0, int arg1, int arg2) {
        class312 var3 = class353.field5644[arg0][arg1][arg2];
        return var3 == null || var3.field5082 == null ? 0L : var3.field5082.field5299;
    }
}
