import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class275 extends class34 {

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "Lcc;")
    public class209 field4864;

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "Lcc;")
    public static class209 field4866 = class95.method669(114, "Chargement des interfaces )2 ");

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "Lcc;")
    public static class209 field4862 = class95.method669(127, "Monde de jeu cr-B-B");

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "S")
    public static short field4867 = 320;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "Lcc;")
    public static class209 field4861 = class95.method669(81, "<br>");

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!vh", name = "v", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "Lsj;")
    public static class49 field4860;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)J")
    public static final long method1870(int arg0, int arg1, int arg2) {
        class109 var3 = class106.field2089[arg0][arg1][arg2];
        return var3 == null || var3.field2198 == null ? 0L : var3.field2198.field4171;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V")
    public static final void method1871(byte arg0) {
        field4868++;
        if (class254.field4590 == 109) {
            int var1 = client.field2818.method774((byte) 110);
            int var2 = class10.field203 + (var1 >> 4 & 0x7);
            int var3 = (var1 & 0x7) + class129.field2483;
            int var4 = var2 + client.field2818.method777(120);
            int var5 = client.field2818.method777(109) + var3;
            int var6 = client.field2818.method738(255);
            int var7 = client.field2818.method736(123);
            int var8 = client.field2818.method774((byte) 85) * 4;
            int var9 = client.field2818.method774((byte) 116) * 4;
            int var10 = client.field2818.method736(124);
            int var11 = client.field2818.method736(122);
            int var12 = client.field2818.method774((byte) 92);
            int var13 = client.field2818.method774((byte) 116);
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104 && var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && var7 != 65535) {
                int var14 = var3 * 128 + 64;
                int var15 = var5 * 128 + 64;
                int var16 = var2 * 128 + 64;
                class25 var17 = new class25(var7, class99.field1937, var16, var14, class94.method661(var14, 19452, class99.field1937, var16) - var8, class163.field2968 + var10, class163.field2968 + var11, var12, var13, var6, var9);
                int var18 = var4 * 128 + 64;
                var17.method215((byte) 5, var15, class163.field2968 + var10, class94.method661(var15, 19452, class99.field1937, var18) - var9, var18);
                class261.field4693.method1123(new class19(var17), (byte) -128);
            }
        } else if (class254.field4590 == 147) {
            int var19 = client.field2818.method769(false);
            int var20 = class129.field2483 + (var19 & 0x7);
            int var21 = (var19 >> 4 & 0x7) + class10.field203;
            int var22 = client.field2818.method741(-253);
            if (var21 >= 0 && var20 >= 0 && var21 < 104 && var20 < 104) {
                class162 var23 = class280.field4931[class99.field1937][var21][var20];
                if (var23 != null) {
                    for (class164 var24 = (class164) var23.method1119(20896); var24 != null; var24 = (class164) var23.method1120(116)) {
                        if ((var22 & 0x7FFF) == var24.field2977.field3174) {
                            var24.method269(-214950896);
                            break;
                        }
                    }
                    if (var23.method1119(20896) == null) {
                        class280.field4931[class99.field1937][var21][var20] = null;
                    }
                    class18.method175(var20, (byte) -119, var21);
                }
            }
        } else if (class254.field4590 == 36) {
            int var25 = client.field2818.method766(-99);
            int var26 = client.field2818.method774((byte) 113);
            int var27 = ((var26 & 0x76) >> 4) + class10.field203;
            int var28 = (var26 & 0x7) + class129.field2483;
            int var29 = client.field2818.method724((byte) 79);
            int var30 = client.field2818.method736(125);
            if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104 && class174.field3179 != var30) {
                class174 var31 = new class174();
                var31.field3174 = var29;
                var31.field3166 = var25;
                if (class280.field4931[class99.field1937][var27][var28] == null) {
                    class280.field4931[class99.field1937][var27][var28] = new class162();
                }
                class280.field4931[class99.field1937][var27][var28].method1123(new class164(var31), (byte) -128);
                class18.method175(var28, (byte) -119, var27);
            }
        } else if (class254.field4590 == 23) {
            int var32 = client.field2818.method774((byte) 124);
            int var33 = ((var32 & 0xFF) >> 4) + class10.field203 * 2;
            int var34 = (var32 & 0xF) + class129.field2483 * 2;
            int var35 = client.field2818.method777(94) + var33;
            int var36 = client.field2818.method777(63) + var34;
            int var37 = client.field2818.method738(255);
            int var38 = client.field2818.method736(125);
            int var39 = client.field2818.method774((byte) 117) * 4;
            int var40 = client.field2818.method774((byte) 120) * 4;
            int var41 = client.field2818.method736(124);
            int var42 = client.field2818.method736(123);
            int var43 = client.field2818.method774((byte) 86);
            int var44 = client.field2818.method774((byte) 88);
            if (var33 >= 0 && var34 >= 0 && var33 < 208 && var34 < 208 && var35 >= 0 && var36 >= 0 && var35 < 208 && var36 < 208 && var38 != 65535) {
                int var45 = var33 * 64;
                int var46 = var35 * 64;
                int var47 = var34 * 64;
                int var48 = var36 * 64;
                class25 var49 = new class25(var38, class99.field1937, var45, var47, class94.method661(var47, 19452, class99.field1937, var45) - var39, var41 - -class163.field2968, class163.field2968 + var42, var43, var44, var37, var40);
                var49.method215((byte) 5, var48, var41 + class163.field2968, -var40 + class94.method661(var48, 19452, class99.field1937, var46), var46);
                class261.field4693.method1123(new class19(var49), (byte) -128);
            }
        } else if (class254.field4590 == 212) {
            int var50 = client.field2818.method757(-1);
            int var51 = var50 >> 2;
            int var52 = var50 & 0x3;
            int var53 = class111.field2233[var51];
            int var54 = client.field2818.method761(-120);
            int var55 = (var54 & 0x7) + class129.field2483;
            int var56 = (var54 >> 4 & 0x7) + class10.field203;
            if (var56 >= 0 && var55 >= 0 && var56 < 104 && var55 < 104) {
                class122.method897(0, -1, -1, var56, class99.field1937, var52, 54, var51, var55, var53);
            }
        } else if (class254.field4590 == 134) {
            int var57 = client.field2818.method774((byte) 102);
            int var58 = (var57 & 0x7) + class129.field2483;
            int var59 = ((var57 & 0x77) >> 4) + class10.field203;
            int var60 = client.field2818.method736(122);
            int var61 = client.field2818.method736(124);
            int var62 = client.field2818.method736(121);
            if (var59 >= 0 && var58 >= 0 && var59 < 104 && var58 < 104) {
                class162 var63 = class280.field4931[class99.field1937][var59][var58];
                if (var63 != null) {
                    for (class164 var64 = (class164) var63.method1119(20896); var64 != null; var64 = (class164) var63.method1120(72)) {
                        class174 var65 = var64.field2977;
                        if ((var60 & 0x7FFF) == var65.field3174 && var65.field3166 == var61) {
                            var65.field3166 = var62;
                            break;
                        }
                    }
                    class18.method175(var58, (byte) -119, var59);
                }
            }
        } else if (class254.field4590 == 68) {
            int var66 = client.field2818.method766(-88);
            if (var66 == 65535) {
                var66 = -1;
            }
            int var67 = client.field2818.method761(-125);
            int var68 = var67 >> 2;
            int var69 = class111.field2233[var68];
            int var70 = var67 & 0x3;
            int var71 = client.field2818.method774((byte) 106);
            int var72 = class129.field2483 + (var71 & 0x7);
            int var73 = ((var71 & 0x74) >> 4) + class10.field203;
            class288.method1933(var73, var68, var66, class99.field1937, var69, var72, (byte) 95, var70);
        } else {
            if (arg0 < 33) {
                method1873((byte) -96);
            }
            if (class254.field4590 == 176) {
                int var74 = client.field2818.method741(-253);
                int var75 = client.field2818.method741(-253);
                int var76 = client.field2818.method761(-113);
                int var77 = (var76 & 0x7) + class129.field2483;
                int var78 = ((var76 & 0x79) >> 4) + class10.field203;
                if (var78 >= 0 && var77 >= 0 && var78 < 104 && var77 < 104) {
                    class174 var79 = new class174();
                    var79.field3174 = var75;
                    var79.field3166 = var74;
                    if (class280.field4931[class99.field1937][var78][var77] == null) {
                        class280.field4931[class99.field1937][var78][var77] = new class162();
                    }
                    class280.field4931[class99.field1937][var78][var77].method1123(new class164(var79), (byte) -128);
                    class18.method175(var77, (byte) -119, var78);
                }
            } else if (class254.field4590 == 10) {
                int var80 = client.field2818.method774((byte) 112);
                int var81 = (var80 >> 4 & 0x7) + class10.field203;
                int var82 = (var80 & 0x7) + class129.field2483;
                int var83 = client.field2818.method736(127);
                int var84 = client.field2818.method774((byte) 73);
                if (var83 == 65535) {
                    var83 = -1;
                }
                int var85 = (var84 & 0xF9) >> 4;
                int var86 = var84 & 0x7;
                int var87 = client.field2818.method774((byte) 96);
                if (var81 >= 0 && var82 >= 0 && var81 < 104 && var82 < 104) {
                    int var88 = var85 + 1;
                    if ((var81 - var88) <= class223.field4069.field1548[0] && var81 + var88 >= class223.field4069.field1548[0] && class223.field4069.field1567[0] >= var82 - var88 && class223.field4069.field1567[0] <= var82 + var88 && class176.field3202 != 0 && var86 > 0 && class88.field1748 < 50 && var83 != -1) {
                        class153.field2790[class88.field1748] = var83;
                        class126.field2439[class88.field1748] = var86;
                        class238.field4313[class88.field1748] = var87;
                        class165.field2988[class88.field1748] = null;
                        class132.field2527[class88.field1748] = (var81 << 16) + (var82 << 8) + var85;
                        class88.field1748++;
                    }
                }
            } else if (class254.field4590 == 94) {
                int var89 = client.field2818.method774((byte) 125);
                int var90 = (var89 >> 4 & 0x7) + class10.field203;
                int var91 = (var89 & 0x7) + class129.field2483;
                int var92 = client.field2818.method736(127);
                int var93 = client.field2818.method774((byte) 123);
                int var94 = client.field2818.method736(127);
                if (var90 >= 0 && var91 >= 0 && var90 < 104 && var91 < 104) {
                    int var95 = var90 * 128 + 64;
                    int var96 = var91 * 128 + 64;
                    class281 var97 = new class281(var92, class99.field1937, var95, var96, class94.method661(var96, 19452, class99.field1937, var95) - var93, var94, class163.field2968);
                    class201.field3606.method1123(new class118(var97), (byte) -128);
                }
            } else if (class254.field4590 == 125) {
                int var98 = client.field2818.method769(false);
                int var99 = var98 >> 2;
                int var100 = class111.field2233[var99];
                int var101 = var98 & 0x3;
                int var102 = client.field2818.method741(-253);
                int var103 = client.field2818.method757(-1);
                int var104 = (var103 >> 4 & 0x7) + class10.field203;
                int var105 = (var103 & 0x7) + class129.field2483;
                if (var104 >= 0 && var105 >= 0 && var104 < 104 && var105 < 104) {
                    class122.method897(0, -1, var102, var104, class99.field1937, var101, -99, var99, var105, var100);
                }
            } else if (class254.field4590 == 126) {
                int var106 = client.field2818.method724((byte) 79);
                byte var107 = client.field2818.method777(65);
                int var108 = client.field2818.method774((byte) 78);
                int var109 = var108 >> 2;
                int var110 = class111.field2233[var109];
                int var111 = var108 & 0x3;
                int var112 = client.field2818.method741(-253);
                byte var113 = client.field2818.method777(123);
                byte var114 = client.field2818.method771((byte) 83);
                int var115 = client.field2818.method724((byte) 79);
                byte var116 = client.field2818.method777(111);
                int var117 = client.field2818.method769(false);
                int var118 = (var117 & 0x7) + class129.field2483;
                int var119 = (var117 >> 4 & 0x7) + class10.field203;
                int var120 = client.field2818.method741(-253);
                class108 var121;
                if (class174.field3179 == var106) {
                    var121 = class223.field4069;
                } else {
                    var121 = class103.field1993[var106];
                }
                if (var121 != null) {
                    class218 var122 = class245.method1711(27093, var120);
                    int var123;
                    int var124;
                    if (var111 == 1 || var111 == 3) {
                        var124 = var122.field3916;
                        var123 = var122.field3912;
                    } else {
                        var123 = var122.field3916;
                        var124 = var122.field3912;
                    }
                    int var125 = (var124 + 1 >> 1) + var118;
                    int var126 = (var123 >> 1) + var119;
                    int var127 = var118 + (var124 >> 1);
                    int var128 = var119 + (var123 + 1 >> 1);
                    int[][] var129 = class271.field4803[class99.field1937];
                    int[][] var130 = null;
                    if (class99.field1937 < 3) {
                        var130 = class271.field4803[class99.field1937 + 1];
                    }
                    int var131 = var129[var126][var127] + var129[var126][var125] - (-var129[var128][var127] - var129[var128][var125]) >> 2;
                    int var132 = (var119 << 7) + (var123 << 6);
                    int var133 = (var118 << 7) + (var124 << 6);
                    class104 var134 = var122.method1537(false, -23584, var111, var133, var122.field3941, var132, (class194) null, var130, var129, var131, var109);
                    if (var134 != null) {
                        if (var107 > var113) {
                            byte var135 = var107;
                            var107 = var113;
                            var113 = var135;
                        }
                        if (var116 > var114) {
                            byte var136 = var116;
                            var116 = var114;
                            var114 = var136;
                        }
                        class122.method897(var115 + 1, var112 - -1, -1, var119, class99.field1937, 0, 121, 0, var118, var110);
                        var121.field2145 = var119 * 128 + var123 * 64;
                        var121.field2155 = var118 * 128 + var124 * 64;
                        var121.field2174 = (class189) var134.field2012;
                        var121.field2181 = class163.field2968 + var112;
                        var121.field2166 = var107 + var119;
                        var121.field2180 = class163.field2968 + var115;
                        var121.field2163 = var131;
                        var121.field2170 = var116 + var118;
                        var121.field2143 = var113 + var119;
                        var121.field2144 = var114 + var118;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V")
    public class275() {
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(B)V")
    public static void method1872(byte arg0) {
        field4866 = null;
        field4862 = null;
        field4861 = null;
        if (arg0 > -5) {
            method1871((byte) 126);
        }
        field4860 = null;
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(B)V")
    public static final void method1873(byte arg0) {
        field4863++;
        class131.field2503.method665(1);
        if (arg0 > -11) {
            field4861 = null;
        }
        class235.field4224.method665(1);
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lcc;)V")
    public class275(class209 arg0) {
        this.field4864 = arg0;
    }
}
