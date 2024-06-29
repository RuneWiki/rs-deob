import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class235 extends class102 {

    @OriginalMember(owner = "client!wa", name = "O", descriptor = "Lqe;")
    public static class179 field4326 = class206.method1380("labels)3dat", (byte) 46);

    @OriginalMember(owner = "client!wa", name = "Y", descriptor = "I")
    public static int field4336 = 0;

    @OriginalMember(owner = "client!wa", name = "R", descriptor = "I")
    public static int field4329 = 0;

    @OriginalMember(owner = "client!wa", name = "N", descriptor = "I")
    private int field4325;

    @OriginalMember(owner = "client!wa", name = "P", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!wa", name = "S", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!wa", name = "U", descriptor = "I")
    private int field4332;

    @OriginalMember(owner = "client!wa", name = "V", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!wa", name = "W", descriptor = "I")
    private int field4334;

    @OriginalMember(owner = "client!wa", name = "X", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!wa", name = "Z", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!wa", name = "T", descriptor = "Z")
    public static boolean field4331;

    @OriginalMember(owner = "client!wa", name = "Q", descriptor = "[[B")
    public static byte[][] field4328;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)Lqe;")
    public static final class179 method1527(int arg0, int arg1) {
        ++field4330;
        class179 var2 = class148.method949((byte) -14, arg1);
        for (int var3 = var2.method1168(true) + -3; ~var3 < -1; var3 -= 3) {
            var2 = class78.method502((byte) -87, new class179[] { var2.method1156(-5684, var3, 0), class55.field1205, var2.method1162((byte) 121, var3) });
        }
        if (~var2.method1168(true) < -10) {
            return class78.method502((byte) -80, new class179[] { class149.field2691, var2.method1156(arg0 ^ 1659625486, -8 + var2.method1168(true), 0), class164.field2965, class62.field1316, var2, class207.field3860 });
        } else if (var2.method1168(true) > 6) {
            return class78.method502((byte) -102, new class179[] { class9.field268, var2.method1156(-5684, var2.method1168(true) + -4, 0), class194.field3609, class62.field1316, var2, class207.field3860 });
        } else {
            if (arg0 != -1659631166) {
                method1527(-21, 97);
            }
            return class78.method502((byte) -109, new class179[] { class110.field2061, var2, class84.field1626 });
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        ++field4333;
        int[][] var3 = super.field1950.method598((byte) -88, arg0);
        if (arg1 != 64) {
            field4331 = true;
        }
        if (super.field1950.field1724) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            for (int var7 = 0; ~class155.field2796 < ~var7; ++var7) {
                var5[var7] = this.field4332;
                var4[var7] = this.field4334;
                var6[var7] = this.field4325;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V")
    public class235() {
        this(0);
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(B)V")
    public static final void method1528(byte arg0) {
        ++field4335;
        if (class169.field3043 == 8) {
            int var1 = class36.field789.method1243(3);
            int var2 = ((var1 & 120) >> 4) + class96.field1811;
            int var3 = class143.field2591 - -(var1 & 7);
            int var4 = class36.field789.method1252(2);
            int var5 = class36.field789.method1245(-68);
            if (~var2 <= -1 && ~var3 <= -1 && var2 < 104 && ~var3 > -105) {
                class172 var6 = new class172();
                var6.field3080 = var5;
                var6.field3075 = var4;
                if (class108.field2021[class49.field1038][var2][var3] == null) {
                    class108.field2021[class49.field1038][var2][var3] = new class36();
                }
                class108.field2021[class49.field1038][var2][var3].method235(-97, new class133(var6));
                class58.method398(var3, var2, (byte) -60);
            }
        } else if (class169.field3043 == 71) {
            int var7 = class36.field789.method1243(3);
            int var8 = (var7 >> 4 & 7) + class96.field1811;
            int var9 = (7 & var7) + class143.field2591;
            int var10 = class36.field789.method1204(false) + var8;
            int var11 = class36.field789.method1204(false) + var9;
            int var12 = class36.field789.method1225((byte) -77);
            int var13 = class36.field789.method1252(2);
            int var14 = 4 * class36.field789.method1243(3);
            int var15 = class36.field789.method1243(3) * 4;
            int var16 = class36.field789.method1252(2);
            int var17 = class36.field789.method1252(2);
            int var18 = class36.field789.method1243(3);
            int var19 = class36.field789.method1243(3);
            if (var8 >= 0 && var9 >= 0 && ~var8 > -105 && ~var9 > -105 && ~var10 <= -1 && ~var11 <= -1 && var10 < 104 && ~var11 > -105 && ~var13 != -65536) {
                int var20 = var9 * 128 + 64;
                int var21 = var11 * 128 - -64;
                int var22 = var10 * 128 + 64;
                int var23 = var8 * 128 + 64;
                class44 var24 = new class44(var13, class49.field1038, var23, var20, class202.method1341(-73, var23, class49.field1038, var20) + -var14, class13.field322 + var16, var17 - -class13.field322, var18, var19, var12, var15);
                var24.method293(class13.field322 + var16, var22, 1, var21, -var15 + class202.method1341(82, var22, class49.field1038, var21));
                class94.field1767.method235(-86, new class32(var24));
            }
        } else if (~class169.field3043 == -44) {
            int var25 = class36.field789.method1243(3);
            int var26 = class96.field1811 - -(7 & var25 >> 4);
            int var27 = (7 & var25) + class143.field2591;
            int var28 = class36.field789.method1252(2);
            int var29 = class36.field789.method1243(3);
            int var30 = class36.field789.method1252(2);
            if (~var26 <= -1 && var27 >= 0 && var26 < 104 && ~var27 > -105) {
                int var31 = var26 * 128 + 64;
                int var32 = var27 * 128 + 64;
                class219 var33 = new class219(var28, class49.field1038, var31, var32, class202.method1341(124, var31, class49.field1038, var32) + -var29, var30, class13.field322);
                class78.field1509.method235(-58, new class70(var33));
            }
        } else if (~class169.field3043 == -163) {
            int var34 = class36.field789.method1245(-93);
            int var35 = class36.field789.method1243(3);
            int var36 = (var35 & 7) + class143.field2591;
            int var37 = ((116 & var35) >> 4) + class96.field1811;
            if (~var37 <= -1 && var36 >= 0 && var37 < 104 && ~var36 > -105) {
                class36 var38 = class108.field2021[class49.field1038][var37][var36];
                if (var38 != null) {
                    for (class133 var39 = (class133) var38.method242(16711680); var39 != null; var39 = (class133) var38.method237(10)) {
                        if (~(var34 & 32767) == ~var39.field2410.field3075) {
                            var39.method592((byte) -128);
                            break;
                        }
                    }
                    if (var38.method242(16711680) == null) {
                        class108.field2021[class49.field1038][var37][var36] = null;
                    }
                    class58.method398(var36, var37, (byte) -60);
                }
            }
        } else if (~class169.field3043 == -75) {
            int var40 = class36.field789.method1243(3);
            int var41 = (7 & var40) + class143.field2591;
            int var42 = class96.field1811 - -(var40 >> 4 & 7);
            int var43 = class36.field789.method1252(2);
            int var44 = class36.field789.method1252(2);
            int var45 = class36.field789.method1252(2);
            if (var42 >= 0 && ~var41 <= -1 && var42 < 104 && var41 < 104) {
                class36 var46 = class108.field2021[class49.field1038][var42][var41];
                if (var46 != null) {
                    for (class133 var47 = (class133) var46.method242(16711680); var47 != null; var47 = (class133) var46.method237(10)) {
                        class172 var48 = var47.field2410;
                        if ((32767 & var43) == var48.field3075 && ~var48.field3080 == ~var44) {
                            var48.field3080 = var45;
                            break;
                        }
                    }
                    class58.method398(var41, var42, (byte) -60);
                }
            }
        } else if (class169.field3043 == 28) {
            int var49 = class36.field789.method1203(255);
            int var50 = var49 >> 2;
            int var51 = 3 & var49;
            int var52 = class33.field713[var50];
            int var53 = class36.field789.method1243(3);
            int var54 = (var53 >> 4 & 7) + class96.field1811;
            int var55 = (7 & var53) + class143.field2591;
            if (var54 >= 0 && ~var55 <= -1 && var54 < 104 && var55 < 104) {
                class87.method581(var52, var55, 98, class49.field1038, var50, -1, 0, var51, var54, -1);
            }
        } else if (~class169.field3043 == -118) {
            int var56 = class36.field789.method1202(true);
            int var57 = (var56 >> 4 & 7) + class96.field1811;
            int var58 = (7 & var56) + class143.field2591;
            int var59 = class36.field789.method1202(true);
            int var60 = var59 & 3;
            int var61 = var59 >> 2;
            int var62 = class33.field713[var61];
            int var63 = class36.field789.method1252(2);
            if (var57 >= 0 && var58 >= 0 && ~var57 > -105 && ~var58 > -105) {
                class87.method581(var62, var58, 68, class49.field1038, var61, -1, 0, var60, var57, var63);
            }
        } else {
            if (class169.field3043 == 109) {
                byte var64 = class36.field789.method1207((byte) -45);
                byte var65 = class36.field789.method1204(false);
                byte var66 = class36.field789.method1207((byte) -104);
                byte var67 = class36.field789.method1234((byte) 124);
                int var68 = class36.field789.method1245(-82);
                int var69 = class36.field789.method1250(2);
                int var70 = class36.field789.method1245(-60);
                int var71 = class36.field789.method1223(116);
                int var72 = var71 >> 2;
                int var73 = var71 & 3;
                int var74 = class33.field713[var72];
                int var75 = class36.field789.method1245(-95);
                int var76 = class36.field789.method1203(255);
                int var77 = class143.field2591 - -(var76 & 7);
                int var78 = (var76 >> 4 & 7) + class96.field1811;
                class115 var79;
                if (class159.field2871 == var69) {
                    var79 = class61.field1298;
                } else {
                    var79 = class23.field554[var69];
                }
                if (var79 != null) {
                    class134 var80 = class114.method735((byte) -77, var75);
                    int var81;
                    int var82;
                    if (~var73 != -2 && ~var73 != -4) {
                        var81 = var80.field2442;
                        var82 = var80.field2430;
                    } else {
                        var82 = var80.field2442;
                        var81 = var80.field2430;
                    }
                    int var83 = (var81 >> 1) + var78;
                    int var84 = (var81 + 1 >> 1) + var78;
                    int var85 = (var82 >> 1) + var77;
                    int[][] var86 = class194.field3619[class49.field1038];
                    int var87 = (var78 << 7) - -(var81 << 6);
                    int var88 = (var77 << 7) + (var82 << 6);
                    int var89 = var77 - -(var82 + 1 >> 1);
                    int var90 = var86[var83][var85] + var86[var84][var89] - -var86[var84][var85] - -var86[var83][var89] >> 2;
                    class92 var91 = var80.method855(var88, var72, var90, var87, 28167, false, var73, var86);
                    if (var91 != null) {
                        class87.method581(var74, var77, 91, class49.field1038, 0, var68 + 1, var70 + 1, 0, var78, -1);
                        var79.field2156 = class13.field322 + var68;
                        var79.field2163 = var78 * 128 + var81 * 64;
                        if (~var67 < ~var65) {
                            byte var92 = var67;
                            var67 = var65;
                            var65 = var92;
                        }
                        var79.field2155 = class13.field322 + var70;
                        var79.field2171 = (class75) var91.field1743;
                        var79.field2154 = var65 + var78;
                        var79.field2166 = var90;
                        var79.field2176 = var67 + var78;
                        var79.field2148 = var77 * 128 + var82 * 64;
                        if (var64 < var66) {
                            byte var93 = var66;
                            var66 = var64;
                            var64 = var93;
                        }
                        var79.field2159 = var64 + var77;
                        var79.field2170 = var66 + var77;
                    }
                }
            }
            if (class169.field3043 == 223) {
                int var94 = class36.field789.method1243(3);
                int var95 = ((var94 & 124) >> 4) + class96.field1811;
                int var96 = (var94 & 7) + class143.field2591;
                int var97 = class36.field789.method1202(true);
                int var98 = var97 >> 2;
                int var99 = 3 & var97;
                int var100 = class33.field713[var98];
                int var101 = class36.field789.method1252(2);
                if (~var101 == -65536) {
                    var101 = -1;
                }
                if (~var95 <= -1 && var96 >= 0 && ~var95 > -104 && var96 < 103) {
                    if (~var100 == -1) {
                        class237 var102 = class114.method734(class49.field1038, var95, var96);
                        if (var102 != null) {
                            int var103 = (int) (var102.field4379 >>> 32) & Integer.MAX_VALUE;
                            if (var98 != 2) {
                                var102.field4382 = new class55(var103, var98, var99, class49.field1038, var95, var96, var101, false, var102.field4382);
                            } else {
                                var102.field4382 = new class55(var103, 2, var99 + 4, class49.field1038, var95, var96, var101, false, var102.field4382);
                                var102.field4362 = new class55(var103, 2, 3 & var99 - -1, class49.field1038, var95, var96, var101, false, var102.field4362);
                            }
                        }
                    }
                    if (var100 == 1) {
                        class169 var104 = class5.method32(class49.field1038, var95, var96);
                        if (var104 != null) {
                            int var105 = Integer.MAX_VALUE & (int) (var104.field3049 >>> 32);
                            if (~var98 != -5 && var98 != 5) {
                                if (~var98 == -7) {
                                    var104.field3051 = new class55(var105, 4, var99 + 4, class49.field1038, var95, var96, var101, false, var104.field3051);
                                } else if (~var98 == -8) {
                                    var104.field3051 = new class55(var105, 4, (var99 + 2 & 3) + 4, class49.field1038, var95, var96, var101, false, var104.field3051);
                                } else if (var98 == 8) {
                                    var104.field3051 = new class55(var105, 4, var99 - -4, class49.field1038, var95, var96, var101, false, var104.field3051);
                                    var104.field3038 = new class55(var105, 4, (3 & var99 + 2) + 4, class49.field1038, var95, var96, var101, false, var104.field3038);
                                }
                            } else {
                                var104.field3051 = new class55(var105, 4, var99, class49.field1038, var95, var96, var101, false, var104.field3051);
                            }
                        }
                    }
                    if (var100 == 2) {
                        class167 var106 = class149.method953(class49.field1038, var95, var96);
                        if (~var98 == -12) {
                            var98 = 10;
                        }
                        if (var106 != null) {
                            var106.field3010 = new class55(Integer.MAX_VALUE & (int) (var106.field3014 >>> 32), var98, var99, class49.field1038, var95, var96, var101, false, var106.field3010);
                        }
                    }
                    if (var100 == 3) {
                        class47 var107 = class187.method1268(class49.field1038, var95, var96);
                        if (var107 != null) {
                            var107.field1028 = new class55((int) (var107.field1026 >>> 32) & Integer.MAX_VALUE, 22, var99, class49.field1038, var95, var96, var101, false, var107.field1028);
                        }
                    }
                }
            } else if (~class169.field3043 == -132) {
                int var108 = class36.field789.method1252(2);
                int var109 = class36.field789.method1203(255);
                int var110 = (var109 & 7) + class143.field2591;
                int var111 = (7 & var109 >> 4) + class96.field1811;
                int var112 = class36.field789.method1245(-63);
                int var113 = class36.field789.method1252(2);
                if (~var111 <= -1 && var110 >= 0 && var111 < 104 && var110 < 104 && class159.field2871 != var113) {
                    class172 var114 = new class172();
                    var114.field3075 = var108;
                    var114.field3080 = var112;
                    if (class108.field2021[class49.field1038][var111][var110] == null) {
                        class108.field2021[class49.field1038][var111][var110] = new class36();
                    }
                    class108.field2021[class49.field1038][var111][var110].method235(-93, new class133(var114));
                    class58.method398(var110, var111, (byte) -60);
                }
            } else if (arg0 <= -39) {
                if (class169.field3043 == 211) {
                    int var115 = class36.field789.method1243(3);
                    int var116 = class96.field1811 - -((var115 & 118) >> 4);
                    int var117 = class143.field2591 - -(7 & var115);
                    int var118 = class36.field789.method1252(2);
                    if (~var118 == -65536) {
                        var118 = -1;
                    }
                    int var119 = class36.field789.method1243(3);
                    int var120 = var119 >> 4 & 15;
                    int var121 = var119 & 7;
                    int var122 = class36.field789.method1243(3);
                    if (var116 >= 0 && var117 >= 0 && ~var116 > -105 && ~var117 > -105) {
                        int var123 = var120 + 1;
                        if (~(-var123 + var116) >= ~class61.field1298.field3200[0] && ~class61.field1298.field3200[0] >= ~(var116 + var123) && ~(-var123 + var117) >= ~class61.field1298.field3160[0] && class61.field1298.field3160[0] <= var117 + var123 && ~class102.field1963 != -1 && var121 > 0 && ~class220.field4072 > -51 && ~var118 != 0) {
                            class148.field2669[class220.field4072] = var118;
                            class161.field2914[class220.field4072] = var121;
                            class92.field1739[class220.field4072] = var122;
                            class99.field1847[class220.field4072] = null;
                            class227.field4199[class220.field4072] = (var117 << 8) + (var116 << 16) + var120;
                            ++class220.field4072;
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(I)V")
    private class235(int arg0) {
        super(0, false);
        this.method1530(arg0, -123);
    }

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "(I)V")
    public static void method1529(int arg0) {
        field4326 = null;
        field4328 = null;
        if (arg0 < 29) {
            method1529(-120);
        }
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(II)V")
    private final void method1530(int arg0, int arg1) {
        this.field4325 = (255 & arg0) << 4;
        ++field4337;
        this.field4334 = arg0 >> 4 & 4080;
        this.field4332 = (16711680 & arg0) >> 12;
        if (arg1 > -118) {
            this.method1530(58, -90);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lra;IZ)V")
    public final void method13(class185 arg0, int arg1, boolean arg2) {
        ++field4327;
        if (arg1 == 0) {
            this.method1530(arg0.method1244(-27523), -128);
        }
        if (arg2) {
            this.method13((class185) null, -1, true);
        }
    }
}
