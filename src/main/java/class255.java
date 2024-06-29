import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class255 extends class228 {

    @OriginalMember(owner = "client!fe", name = "S", descriptor = "I")
    private int field4401 = 4096;

    @OriginalMember(owner = "client!fe", name = "ab", descriptor = "I")
    private int field4409 = 0;

    @OriginalMember(owner = "client!fe", name = "db", descriptor = "Loa;")
    public static class99 field4412 = class221.method1463(2844, "Null");

    @OriginalMember(owner = "client!fe", name = "Z", descriptor = "I")
    public static int field4408 = 99;

    @OriginalMember(owner = "client!fe", name = "T", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!fe", name = "U", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!fe", name = "V", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!fe", name = "X", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!fe", name = "Y", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!fe", name = "bb", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!fe", name = "cb", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!fe", name = "eb", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!fe", name = "fb", descriptor = "Ltg;")
    public static class182 field4414;

    @OriginalMember(owner = "client!fe", name = "W", descriptor = "[Lpd;")
    public static class57[] field4405;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "(B)V")
    public static final void method1649(byte arg0) {
        ++field4404;
        if (arg0 != 43) {
            field4405 = null;
        }
        if (~class212.field3669 == -44) {
            int var1 = class129.field2252.method1713((byte) 28);
            int var2 = class129.field2252.method1692(arg0 + -54);
            int var3 = class129.field2252.method1694(0);
            int var4 = class242.field4189 - -(var3 & 7);
            int var5 = (7 & var3 >> 4) + class58.field978;
            byte var6 = class129.field2252.method1710(-3);
            int var7 = class129.field2252.method1694(arg0 + -43);
            int var8 = var7 & 3;
            int var9 = var7 >> 2;
            int var10 = class237.field4105[var9];
            byte var11 = class129.field2252.method1710(-3);
            byte var12 = class129.field2252.method1706(arg0 + 10776);
            byte var13 = class129.field2252.method1706(arg0 + 10776);
            int var14 = class129.field2252.method1740((byte) 61);
            int var15 = class129.field2252.method1729((byte) 124);
            class183 var16;
            if (class167.field2980 == var1) {
                var16 = class168.field3006;
            } else {
                var16 = class259.field4515[var1];
            }
            if (var16 != null) {
                class153 var17 = class247.method1601(arg0 ^ 26039, var14);
                int var18;
                int var19;
                if (var8 != 1 && var8 != 3) {
                    var18 = var17.field2704;
                    var19 = var17.field2717;
                } else {
                    var18 = var17.field2717;
                    var19 = var17.field2704;
                }
                int var20 = (var19 >> 1) + var5;
                int var21 = (var19 - -1 >> 1) + var5;
                int var22 = (var18 >> 1) + var4;
                int var23 = var4 - -(var18 + 1 >> 1);
                int[][] var24 = class189.field3337[field4407];
                int var25 = var24[var21][var22] - (-var24[var20][var23] - var24[var21][var23]) + var24[var20][var22] >> 2;
                int[][] var26 = null;
                if (field4407 < 3) {
                    var26 = class189.field3337[field4407 - -1];
                }
                int var27 = (var5 << 7) + (var19 << 6);
                int var28 = (var4 << 7) + (var18 << 6);
                class268 var29 = var17.method1025(3202, var26, var24, (class109) null, var8, var17.field2743, var27, var28, var25, var9, false);
                if (var29 != null) {
                    class50.method353(0, -1, var2 + 1, field4407, var5, (byte) -89, var15 + 1, 0, var4, var10);
                    var16.field3215 = (class195) var29.field4718;
                    var16.field3213 = class56.field926 + var15;
                    var16.field3251 = class56.field926 + var2;
                    var16.field3225 = var4 * 128 - -(var18 * 64);
                    if (var6 > var12) {
                        byte var30 = var6;
                        var6 = var12;
                        var12 = var30;
                    }
                    var16.field3216 = var5 * 128 + var19 * 64;
                    if (var13 > var11) {
                        byte var31 = var13;
                        var13 = var11;
                        var11 = var31;
                    }
                    var16.field3240 = var4 + var11;
                    var16.field3233 = var4 + var13;
                    var16.field3232 = var25;
                    var16.field3219 = var5 + var6;
                    var16.field3256 = var5 + var12;
                }
            }
        }
        if (~class212.field3669 == -68) {
            int var32 = class129.field2252.method1693((byte) -89);
            int var33 = ((124 & var32) >> 4) + class58.field978;
            int var34 = (7 & var32) + class242.field4189;
            int var35 = class129.field2252.method1740((byte) 53);
            int var36 = class129.field2252.method1693((byte) 41);
            int var37 = class129.field2252.method1740((byte) 112);
            if (~var33 <= -1 && ~var34 <= -1 && var33 < 104 && ~var34 > -105) {
                int var38 = var34 * 128 + 64;
                int var39 = var33 * 128 + 64;
                class263 var40 = new class263(var35, field4407, var39, var38, class115.method777(-1, var38, field4407, var39) - var36, var37, class56.field926);
                class168.field2998.method536(new class215(var40), (byte) 102);
            }
        } else if (class212.field3669 == 124) {
            int var41 = class129.field2252.method1740((byte) 123);
            if (var41 == 65535) {
                var41 = -1;
            }
            int var42 = class129.field2252.method1694(0);
            int var43 = class242.field4189 - -(7 & var42);
            int var44 = (7 & var42 >> 4) + class58.field978;
            int var45 = class129.field2252.method1748(16711680);
            int var46 = var45 >> 2;
            int var47 = 3 & var45;
            int var48 = class237.field4105[var46];
            class105.method724(var46, -76, var47, var43, field4407, var44, var41, var48);
        } else if (class212.field3669 == 68) {
            int var49 = class129.field2252.method1693((byte) -97);
            int var50 = (var49 >> 4 & 7) + class58.field978;
            int var51 = class242.field4189 - -(7 & var49);
            int var52 = class129.field2252.method1740((byte) 85);
            if (var50 >= 0 && ~var51 <= -1 && ~var50 > -105 && var51 < 104) {
                class76 var53 = class32.field579[field4407][var50][var51];
                if (var53 != null) {
                    for (class280 var54 = (class280) var53.method529(10); var54 != null; var54 = (class280) var53.method533(106)) {
                        if ((var52 & 32767) == var54.field4902.field1125) {
                            var54.method828((byte) 126);
                            break;
                        }
                    }
                    if (var53.method529(arg0 ^ 33) == null) {
                        class32.field579[field4407][var50][var51] = null;
                    }
                    class77.method542(var51, var50, (byte) -44);
                }
            }
        } else if (class212.field3669 == 230) {
            int var55 = class129.field2252.method1693((byte) -107);
            int var56 = ((var55 & 117) >> 4) + class58.field978;
            int var57 = (7 & var55) + class242.field4189;
            int var58 = class129.field2252.method1706(arg0 + 10776) + var56;
            int var59 = var57 - -class129.field2252.method1706(10819);
            int var60 = class129.field2252.method1751(128);
            int var61 = class129.field2252.method1740((byte) 76);
            int var62 = class129.field2252.method1693((byte) -112) * 4;
            int var63 = 4 * class129.field2252.method1693((byte) 16);
            int var64 = class129.field2252.method1740((byte) 81);
            int var65 = class129.field2252.method1740((byte) 64);
            int var66 = class129.field2252.method1693((byte) 82);
            int var67 = class129.field2252.method1693((byte) -79);
            if (var56 >= 0 && ~var57 <= -1 && ~var56 > -105 && ~var57 > -105 && ~var58 <= -1 && var59 >= 0 && var58 < 104 && ~var59 > -105 && var61 != 65535) {
                int var68 = var56 * 128 + 64;
                int var69 = var57 * 128 - -64;
                class43 var70 = new class43(var61, field4407, var68, var69, class115.method777(arg0 ^ -44, var69, field4407, var68) + -var62, class56.field926 + var64, class56.field926 + var65, var66, var67, var60, var63);
                int var71 = var58 * 128 + 64;
                int var72 = var59 * 128 + 64;
                var70.method327(class56.field926 + var64, var72, class115.method777(-1, var72, field4407, var71) + -var63, var71, (byte) -3);
                class121.field2126.method536(new class210(var70), (byte) -29);
            }
        } else if (~class212.field3669 == -190) {
            int var73 = class129.field2252.method1693((byte) -104);
            int var74 = (15 & var73 >> 4) + class58.field978 * 2;
            int var75 = (15 & var73) + class242.field4189 * 2;
            int var76 = class129.field2252.method1706(arg0 + 10776) + var74;
            int var77 = class129.field2252.method1706(10819) + var75;
            int var78 = class129.field2252.method1751(128);
            int var79 = class129.field2252.method1740((byte) 109);
            int var80 = 4 * class129.field2252.method1693((byte) 97);
            int var81 = 4 * class129.field2252.method1693((byte) -104);
            int var82 = class129.field2252.method1740((byte) 54);
            int var83 = class129.field2252.method1740((byte) 123);
            int var84 = class129.field2252.method1693((byte) -90);
            int var85 = class129.field2252.method1693((byte) 117);
            if (~var74 <= -1 && var75 >= 0 && ~var74 > -209 && ~var75 > -209 && ~var76 <= -1 && var77 >= 0 && var76 < 208 && var77 < 208 && var79 != 65535) {
                int var86 = var76 * 64;
                int var87 = var74 * 64;
                int var88 = var75 * 64;
                int var89 = var77 * 64;
                class43 var90 = new class43(var79, field4407, var87, var88, -var80 + class115.method777(arg0 + -44, var88, field4407, var87), var82 - -class56.field926, class56.field926 + var83, var84, var85, var78, var81);
                var90.method327(class56.field926 + var82, var89, -var81 + class115.method777(-1, var89, field4407, var86), var86, (byte) 108);
                class121.field2126.method536(new class210(var90), (byte) -103);
            }
        } else if (class212.field3669 == 233) {
            int var91 = class129.field2252.method1694(0);
            int var92 = (7 & var91) + class242.field4189;
            int var93 = ((124 & var91) >> 4) + class58.field978;
            int var94 = class129.field2252.method1748(16711680);
            int var95 = var94 >> 2;
            int var96 = 3 & var94;
            int var97 = class237.field4105[var95];
            if (~var93 <= -1 && var92 >= 0 && ~var93 > -105 && ~var92 > -105) {
                class50.method353(var96, -1, 0, field4407, var93, (byte) -89, -1, var95, var92, var97);
            }
        } else if (~class212.field3669 == -115) {
            int var98 = class129.field2252.method1714(-1640531527);
            int var99 = (var98 & 7) + class242.field4189;
            int var100 = (7 & var98 >> 4) + class58.field978;
            int var101 = class129.field2252.method1729((byte) 117);
            int var102 = class129.field2252.method1740((byte) 51);
            int var103 = class129.field2252.method1740((byte) 51);
            if (~var100 <= -1 && var99 >= 0 && var100 < 104 && var99 < 104 && class167.field2980 != var102) {
                class67 var104 = new class67();
                var104.field1129 = var101;
                var104.field1125 = var103;
                if (class32.field579[field4407][var100][var99] == null) {
                    class32.field579[field4407][var100][var99] = new class76();
                }
                class32.field579[field4407][var100][var99].method536(new class280(var104), (byte) 71);
                class77.method542(var99, var100, (byte) -81);
            }
        } else if (~class212.field3669 == -103) {
            int var105 = class129.field2252.method1714(-1640531527);
            int var106 = ((127 & var105) >> 4) + class58.field978;
            int var107 = (var105 & 7) + class242.field4189;
            int var108 = class129.field2252.method1713((byte) 28);
            int var109 = class129.field2252.method1713((byte) 28);
            if (var106 >= 0 && ~var107 <= -1 && var106 < 104 && ~var107 > -105) {
                class67 var110 = new class67();
                var110.field1125 = var108;
                var110.field1129 = var109;
                if (class32.field579[field4407][var106][var107] == null) {
                    class32.field579[field4407][var106][var107] = new class76();
                }
                class32.field579[field4407][var106][var107].method536(new class280(var110), (byte) -124);
                class77.method542(var107, var106, (byte) -73);
            }
        } else if (class212.field3669 == 209) {
            int var111 = class129.field2252.method1693((byte) -115);
            int var112 = var111 >> 2;
            int var113 = var111 & 3;
            int var114 = class237.field4105[var112];
            int var115 = class129.field2252.method1714(-1640531527);
            int var116 = (7 & var115 >> 4) + class58.field978;
            int var117 = (var115 & 7) + class242.field4189;
            int var118 = class129.field2252.method1692(117);
            if (var116 >= 0 && ~var117 <= -1 && var116 < 104 && ~var117 > -105) {
                class50.method353(var113, var118, 0, field4407, var116, (byte) -89, -1, var112, var117, var114);
            }
        } else if (class212.field3669 == 18) {
            int var119 = class129.field2252.method1693((byte) 92);
            int var120 = class58.field978 - -((118 & var119) >> 4);
            int var121 = (var119 & 7) + class242.field4189;
            int var122 = class129.field2252.method1740((byte) 101);
            if (var122 == 65535) {
                var122 = -1;
            }
            int var123 = class129.field2252.method1693((byte) -120);
            int var124 = 15 & var123 >> 4;
            int var125 = class129.field2252.method1693((byte) -90);
            int var126 = 7 & var123;
            if (var120 >= 0 && var121 >= 0 && ~var120 > -105 && var121 < 104) {
                int var127 = var124 + 1;
                if (~class168.field3006.field1317[0] <= ~(-var127 + var120) && var120 + var127 >= class168.field3006.field1317[0] && ~(var121 - var127) >= ~class168.field3006.field1259[0] && ~class168.field3006.field1259[0] >= ~(var121 - -var127) && ~class92.field1550 != -1 && var126 > 0 && ~class179.field3110 > -51 && var122 != -1) {
                    class267.field4711[class179.field3110] = var122;
                    class166.field2960[class179.field3110] = var126;
                    class171.field3044[class179.field3110] = var125;
                    class118.field2083[class179.field3110] = null;
                    class227.field3926[class179.field3110] = (var120 << 16) + (var121 << 8) + var124;
                    ++class179.field3110;
                }
            }
        } else if (~class212.field3669 == -62) {
            int var128 = class129.field2252.method1693((byte) 32);
            int var129 = (var128 & 7) + class242.field4189;
            int var130 = ((var128 & 114) >> 4) + class58.field978;
            int var131 = class129.field2252.method1740((byte) 56);
            int var132 = class129.field2252.method1740((byte) 120);
            int var133 = class129.field2252.method1740((byte) 110);
            if (~var130 <= -1 && ~var129 <= -1 && var130 < 104 && var129 < 104) {
                class76 var134 = class32.field579[field4407][var130][var129];
                if (var134 != null) {
                    for (class280 var135 = (class280) var134.method529(10); var135 != null; var135 = (class280) var134.method533(arg0 + 18)) {
                        class67 var136 = var135.field4902;
                        if ((var131 & 32767) == var136.field1125 && var136.field1129 == var132) {
                            var136.field1129 = var133;
                            break;
                        }
                    }
                    class77.method542(var129, var130, (byte) -40);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(II)Loa;")
    public static final class99 method1650(int arg0, int arg1) {
        ++field4411;
        if (arg0 != 0) {
            method1649((byte) 27);
        }
        return class198.method1332(56, new class99[] { class198.method1333(arg0 + -95, 255 & arg1 >> 24), class160.field2842, class198.method1333(arg0 + -96, (arg1 & 16737073) >> 16), class160.field2842, class198.method1333(-121, (arg1 & 65396) >> 8), class160.field2842, class198.method1333(-87, arg1 & 255) });
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
    public class255() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI)[[I")
    public final int[][] method19(byte arg0, int arg1) {
        ++field4413;
        if (arg0 != -27) {
            field4412 = null;
        }
        int[][] var3 = super.field3948.method1797(arg1, (byte) -124);
        if (super.field3948.field4791) {
            int[][] var4 = this.method1502(255, arg1, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; ~class234.field4046 < ~var11; ++var11) {
                int var12 = var6[var11];
                int var13 = var5[var11];
                int var14 = var8[var11];
                if (~this.field4409 >= ~var12) {
                    if (this.field4401 < var12) {
                        var7[var11] = this.field4401;
                    } else {
                        var7[var11] = var12;
                    }
                } else {
                    var7[var11] = this.field4409;
                }
                if (~var13 <= ~this.field4409) {
                    if (this.field4401 >= var13) {
                        var10[var11] = var13;
                    } else {
                        var10[var11] = this.field4401;
                    }
                } else {
                    var10[var11] = this.field4409;
                }
                if (~this.field4409 >= ~var14) {
                    if (this.field4401 < var14) {
                        var9[var11] = this.field4401;
                    } else {
                        var9[var11] = var14;
                    }
                } else {
                    var9[var11] = this.field4409;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(I)V")
    public static void method1651(int arg0) {
        field4412 = null;
        field4414 = null;
        field4405 = null;
        if (arg0 > -1) {
            field4414 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)[I")
    public final int[] method106(int arg0, int arg1) {
        if (arg1 != -3) {
            this.method18(38, (class261) null, 46);
        }
        int[] var3 = super.field3952.method1262(arg0, 7492);
        ++field4403;
        if (super.field3952.field3276) {
            int[] var4 = this.method1500(arg0, 0, (byte) 120);
            for (int var5 = 0; var5 < class234.field4046; ++var5) {
                int var6 = var4[var5];
                if (var6 < this.field4409) {
                    var3[var5] = this.field4409;
                } else if (this.field4401 >= var6) {
                    var3[var5] = var6;
                } else {
                    var3[var5] = this.field4401;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILik;I)V")
    public final void method18(int arg0, class261 arg1, int arg2) {
        if (arg2 == -7618) {
            if (arg0 != 0) {
                if (~arg0 != -2) {
                    if (~arg0 == -3) {
                        super.field3943 = ~arg1.method1693((byte) -104) == -2;
                    }
                } else {
                    this.field4401 = arg1.method1740((byte) 95);
                }
            } else {
                this.field4409 = arg1.method1740((byte) 96);
            }
            ++field4410;
        }
    }
}
