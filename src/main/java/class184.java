import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class184 extends class93 implements class453 {

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
    private int field2612;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "[I")
    public static int[] field2614 = new int[32];

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "F")
    public static float field2621;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "[Ljava/lang/String;")
    public static String[] field2622;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "Lpc;")
    public static class473 field2619;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)I")
    public final int method734(int arg0) {
        if (arg0 < 69) {
            method1202((class166) null, true);
        }
        ++field2616;
        return super.field1406;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(B)V")
    public static void method1201(byte arg0) {
        field2619 = null;
        field2622 = null;
        field2614 = null;
        int var1 = 93 % ((arg0 - 25) / 46);
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)V")
    public final void method670(byte arg0) {
        ++field2620;
        super.field1402.method2956(this, (byte) -16);
        if (arg0 >= -46) {
            field2621 = -0.6310717F;
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lbo;ILjaggl/memory/NativeBuffer;IZ)V")
    public class184(class511 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field2612 = arg1;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)I")
    public final int method736(byte arg0) {
        ++field2618;
        if (arg0 != -19) {
            field2622 = null;
        }
        return this.field2612;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)J")
    public final long method732(int arg0) {
        if (arg0 != -7561) {
            field2617 = 30;
        }
        ++field2611;
        return 0L;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lbo;I[BIZ)V")
    public class184(class511 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field2612 = arg1;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lok;Z)V")
    public static final void method1202(class166 arg0, boolean arg1) {
        ++field2613;
        if (class392.field5310 == arg0) {
            int var2 = class481.field6632.method2238(255);
            int var3 = var2 >> 2;
            int var4 = 3 & var2;
            int var5 = class333.field4373[var3];
            int var6 = class481.field6632.method2238(255);
            int var7 = class67.field1031 - -(var6 >> 4 & 7);
            int var8 = class444.field6090 - -(var6 & 7);
            if (class53.method390(class55.field872, (byte) -38) || ~var7 <= -1 && ~var8 <= -1 && var7 < class12.field251 && ~var8 > ~class289.field3782) {
                class249.method1508(-1, class208.field2858, var4, var5, var8, -1, 0, (byte) 37, var7, var3);
            }
        } else if (class165.field2407 == arg0) {
            class481.field6632.method2238(255);
            int var9 = class481.field6632.method2238(255);
            int var10 = (var9 >> 4 & 7) + class67.field1031;
            int var11 = (7 & var9) + class444.field6090;
            int var12 = class481.field6632.method2212((byte) 83);
            int var13 = class481.field6632.method2238(255);
            int var14 = class481.field6632.method2249((byte) 96);
            String var15 = class481.field6632.method2218(119);
            class383.method2270(var15, var11, var10, var13, (byte) -119, var14, class208.field2858, var12);
        } else if (class191.field2684 == arg0) {
            int var16 = class481.field6632.method2238(255);
            int var17 = ((119 & var16) >> 4) + class67.field1031;
            int var18 = (7 & var16) + class444.field6090;
            int var19 = class481.field6632.method2212((byte) 83);
            if (~var19 == -65536) {
                var19 = -1;
            }
            int var20 = class481.field6632.method2238(255);
            int var21 = (var20 & 243) >> 4;
            int var22 = var20 & 7;
            int var23 = class481.field6632.method2238(255);
            int var24 = class481.field6632.method2238(255);
            if (var17 >= 0 && var18 >= 0 && var17 < class12.field251 && var18 < class289.field3782) {
                int var25 = var21 + 1;
                if (class385.field5232.field6261[0] >= -var25 + var17 && var17 + var25 >= class385.field5232.field6261[0] && ~class385.field5232.field6266[0] <= ~(var18 - var25) && ~class385.field5232.field6266[0] >= ~(var18 - -var25)) {
                    class397.method2319(var23, var19, var24, (class208.field2858 << 24) + (var17 << 16) + (var18 << 8) + var21, 23839, var22);
                }
            }
        } else if (class339.field4422 == arg0) {
            int var26 = class481.field6632.method2238(255);
            int var27 = (15 & var26 >> 4) + class67.field1031 * 2;
            int var28 = class444.field6090 * 2 - -(15 & var26);
            boolean var29 = class481.field6632.method2238(255) != 0;
            int var30 = class481.field6632.method2194(-1) + var27;
            int var31 = var28 - -class481.field6632.method2194(-1);
            int var32 = class481.field6632.method2202(-26372);
            int var33 = class481.field6632.method2212((byte) 83);
            int var34 = 4 * class481.field6632.method2238(255);
            int var35 = class481.field6632.method2238(255) * 4;
            int var36 = class481.field6632.method2212((byte) 83);
            int var37 = class481.field6632.method2212((byte) 83);
            int var38 = class481.field6632.method2238(255);
            if (~var38 == -256) {
                var38 = -1;
            }
            int var39 = class481.field6632.method2238(255);
            if (~var27 <= -1 && var28 >= 0 && ~(class12.field251 * 2) < ~var27 && var28 < class12.field251 * 2 && ~var30 <= -1 && var31 >= 0 && ~var30 > ~(class289.field3782 * 2) && class289.field3782 * 2 > var31 && var33 != 65535) {
                int var40 = var28 * 64;
                int var41 = var30 * 64;
                int var42 = var27 * 64;
                int var43 = var35 << 0;
                int var44 = var31 * 64;
                int var45 = var34 << 0;
                class139 var46 = new class139(var33, class208.field2858, var42, var40, var45, class31.field516 + var36, class31.field516 + var37, var38, var39, var32, var43, var29);
                var46.method988(class31.field516 + var36, -var43 + class210.method1330(class208.field2858, (byte) -105, var41, var44), 0, var44, var41);
                class373.field5031.method1666((byte) 118, new class376(var46));
            }
        } else if (class92.field1398 == arg0) {
            int var47 = class481.field6632.method2238(255);
            int var48 = (var47 >> 4 & 7) + class67.field1031;
            int var49 = class444.field6090 - -(var47 & 7);
            int var50 = class481.field6632.method2212((byte) 83);
            int var51 = class481.field6632.method2212((byte) 83);
            int var52 = class481.field6632.method2212((byte) 83);
            if (class436.field5982 != null && var48 >= 0 && ~var49 <= -1 && ~var48 > ~class12.field251 && var49 < class289.field3782) {
                class289 var53 = (class289) class436.field5982.method182((long) (class208.field2858 << 28 | var49 << 14 | var48), (byte) 93);
                if (var53 != null) {
                    for (class238 var54 = (class238) var53.field3780.method1672((byte) -105); var54 != null; var54 = (class238) var53.field3780.method1668(-1)) {
                        if (~(var50 & 32767) == ~var54.field3179 && ~var54.field3180 == ~var51) {
                            var54.method300(false);
                            var54.field3180 = var52;
                            class250.method1510(var54, var48, var49, class208.field2858, -882487236);
                            break;
                        }
                    }
                    class97.method692(class208.field2858, var48, (byte) -94, var49);
                }
            }
        } else if (!arg1) {
            if (class466.field6428 == arg0) {
                int var55 = class481.field6632.method2238(255);
                int var56 = (7 & var55 >> 4) + class67.field1031;
                int var57 = (7 & var55) + class444.field6090;
                int var58 = class481.field6632.method2212((byte) 83);
                int var59 = class481.field6632.method2238(255);
                int var60 = class481.field6632.method2212((byte) 83);
                int var61 = class481.field6632.method2238(255);
                if (~var56 <= -1 && var57 >= 0 && ~var56 > ~class12.field251 && ~class289.field3782 < ~var57) {
                    int var62 = var56 * 128 + 64;
                    int var63 = var57 * 128 + 64;
                    int var64 = class208.field2858;
                    if (~var64 > -4 && class401.method2330(var57, var56, 2)) {
                        ++var64;
                    }
                    class373 var65 = new class373(var58, var60, class31.field516, class208.field2858, var64, var62, class210.method1330(class208.field2858, (byte) -53, var62, var63) - var59, var63, var56, var56, var57, var57, var61);
                    class375.field5093.method1666((byte) -32, new class283(var65));
                }
            } else if (class389.field5276 == arg0) {
                int var66 = class481.field6632.method2240(255);
                int var67 = class67.field1031 - -(7 & var66 >> 4);
                int var68 = class444.field6090 - -(7 & var66);
                int var69 = class481.field6632.method2240(255);
                int var70 = var69 >> 2;
                int var71 = 3 & var69;
                int var72 = class333.field4373[var70];
                int var73 = class481.field6632.method2212((byte) 83);
                if (~var73 == -65536) {
                    var73 = -1;
                }
                class110.method761((byte) 1, var73, var70, var68, var67, class208.field2858, var71, var72);
            } else if (class91.field1378 == arg0) {
                int var74 = class481.field6632.method2202(-26372);
                int var75 = class481.field6632.method2207(66);
                int var76 = class481.field6632.method2212((byte) 83);
                byte var77 = class481.field6632.method2194(-1);
                byte var78 = class481.field6632.method2194(-1);
                int var79 = class481.field6632.method2240(255);
                int var80 = var79 >> 2;
                int var81 = var79 & 3;
                int var82 = class481.field6632.method2245(255);
                byte var83 = class481.field6632.method2194(-1);
                int var84 = class481.field6632.method2240(255);
                int var85 = (7 & var84 >> 4) + class67.field1031;
                int var86 = (7 & var84) + class444.field6090;
                byte var87 = class481.field6632.method2231((byte) 85);
                if (!class370.field4984.method627()) {
                    class20.method194(var81, var74, var85, var82, 794825894, var80, var83, var76, var78, var75, var86, var77, class208.field2858, var87);
                }
            } else if (class250.field3317 == arg0) {
                int var88 = class481.field6632.method2233((byte) -117);
                int var89 = class481.field6632.method2222(-128);
                int var90 = ((var89 & 112) >> 4) + class67.field1031;
                int var91 = (7 & var89) + class444.field6090;
                if (~var90 <= -1 && ~var91 <= -1 && ~class12.field251 < ~var90 && ~class289.field3782 < ~var91) {
                    class289 var92 = (class289) class436.field5982.method182((long) (class208.field2858 << 28 | var91 << 14 | var90), (byte) 108);
                    if (var92 != null) {
                        for (class238 var93 = (class238) var92.field3780.method1672((byte) -86); var93 != null; var93 = (class238) var92.field3780.method1668(-1)) {
                            if ((32767 & var88) == var93.field3179) {
                                var93.method300(false);
                                break;
                            }
                        }
                        if (var92.field3780.method1664((byte) -79)) {
                            var92.method300(false);
                        }
                        class97.method692(class208.field2858, var90, (byte) -108, var91);
                    }
                }
            } else if (class209.field2864 == arg0) {
                int var94 = class481.field6632.method2238(255);
                boolean var95 = ~(128 & var94) != -1;
                int var96 = ((var94 & 59) >> 3) + class67.field1031;
                int var97 = class444.field6090 - -(var94 & 7);
                int var98 = class481.field6632.method2194(-1) + var96;
                int var99 = var97 + class481.field6632.method2194(-1);
                int var100 = class481.field6632.method2202(-26372);
                int var101 = class481.field6632.method2212((byte) 83);
                int var102 = class481.field6632.method2238(255) * 4;
                int var103 = class481.field6632.method2238(255) * 4;
                int var104 = class481.field6632.method2212((byte) 83);
                int var105 = class481.field6632.method2212((byte) 83);
                int var106 = class481.field6632.method2238(255);
                int var107 = class481.field6632.method2238(255);
                if (~var106 == -256) {
                    var106 = -1;
                }
                if (~var96 <= -1 && var97 >= 0 && var96 < class12.field251 && class289.field3782 > var97 && ~var98 <= -1 && ~var99 <= -1 && var98 < class12.field251 && ~var99 > ~class289.field3782 && ~var101 != -65536) {
                    int var108 = var98 * 128 + 64;
                    int var109 = var103 << 0;
                    int var110 = var96 * 128 + 64;
                    int var111 = var99 * 128 + 64;
                    int var112 = var97 * 128 + 64;
                    int var113 = var102 << 0;
                    class139 var114 = new class139(var101, class208.field2858, var110, var112, var113, class31.field516 + var104, var105 - -class31.field516, var106, var107, var100, var109, var95);
                    var114.method988(class31.field516 + var104, -var109 + class210.method1330(class208.field2858, (byte) -113, var108, var111), 0, var111, var108);
                    class373.field5031.method1666((byte) -118, new class376(var114));
                }
            } else if (class29.field489 == arg0) {
                int var115 = class481.field6632.method2207(39);
                int var116 = class481.field6632.method2245(255);
                int var117 = class481.field6632.method2222(-128);
                int var118 = (var117 >> 4 & 7) + class67.field1031;
                int var119 = (7 & var117) + class444.field6090;
                if (var118 >= 0 && var119 >= 0 && ~var118 > ~class12.field251 && class289.field3782 > var119) {
                    class250.method1510(new class238(var115, var116), var118, var119, class208.field2858, -882487236);
                    class97.method692(class208.field2858, var118, (byte) 103, var119);
                }
            } else if (class280.field3685 == arg0) {
                int var120 = class481.field6632.method2238(255);
                int var121 = (var120 >> 4 & 15) + class67.field1031 * 2;
                int var122 = class444.field6090 * 2 - -(15 & var120);
                boolean var123 = ~class481.field6632.method2238(255) != -1;
                int var124 = class481.field6632.method2194(-1) + var121;
                int var125 = class481.field6632.method2194(-1) + var122;
                int var126 = class481.field6632.method2202(-26372);
                int var127 = class481.field6632.method2202(-26372);
                int var128 = class481.field6632.method2212((byte) 83);
                byte var129 = class481.field6632.method2194(-1);
                int var130 = 4 * class481.field6632.method2238(255);
                int var131 = class481.field6632.method2212((byte) 83);
                int var132 = class481.field6632.method2212((byte) 83);
                int var133 = class481.field6632.method2238(255);
                if (var133 == 255) {
                    var133 = -1;
                }
                int var134 = class481.field6632.method2238(255);
                if (var121 >= 0 && var122 >= 0 && ~(class12.field251 * 2) < ~var121 && var122 < class12.field251 * 2 && ~var124 <= -1 && ~var125 <= -1 && ~var124 > ~(class289.field3782 * 2) && ~var125 > ~(class289.field3782 * 2) && ~var128 != -65536) {
                    int var135 = var125 * 64;
                    int var136 = var122 * 64;
                    int var137 = var130 << 0;
                    int var138 = var121 * 64;
                    int var139 = var129 << 0;
                    int var140 = var124 * 64;
                    if (var126 != 0) {
                        int var142;
                        class455 var144;
                        if (var126 < 0) {
                            int var141 = -var126 + -1;
                            var142 = (var141 & 31667) >> 11;
                            int var143 = var141 & 2047;
                            if (~class391.field5305 != ~var143) {
                                var144 = class499.field6901[var143];
                            } else {
                                var144 = class385.field5232;
                            }
                        } else {
                            int var145 = var126 - 1;
                            int var146 = var145 & 2047;
                            var142 = var145 >> 11 & 15;
                            var144 = class291.field3822[var146];
                        }
                        if (var144 != null) {
                            class20 var147 = var144.method2600(116);
                            if (var147.field349 != null && var147.field349[var142] != null) {
                                int var148 = var147.field349[var142][0];
                                int var149 = var147.field349[var142][2];
                                int var150 = var144.field6233.method1692(true);
                                int var151 = class305.field4019[var150];
                                int var152 = class305.field4022[var150];
                                int var153 = var148 * var152 + var149 * var151 >> 15;
                                int var154 = var149 * var152 + -(var148 * var151) >> 15;
                                var136 += var154;
                                var139 -= var147.field349[var142][1];
                                var138 += var153;
                            }
                        }
                    }
                    class139 var156 = new class139(var128, class208.field2858, var138, var136, var139, var131 - -class31.field516, class31.field516 + var132, var133, var134, var127, var137, var123);
                    var156.method988(class31.field516 + var131, class210.method1330(class208.field2858, (byte) -63, var140, var135) + -var137, 0, var135, var140);
                    class373.field5031.method1666((byte) -33, new class376(var156));
                }
            } else if (class526.field7783 == arg0) {
                int var157 = class481.field6632.method2212((byte) 83);
                int var158 = class481.field6632.method2238(255);
                class402.field5388.method1994(-17294, var157).method12(0, var158);
            } else if (class199.field2757 != arg0) {
                if (class201.field2787 == arg0) {
                    int var167 = class481.field6632.method2240(255);
                    int var168 = ((113 & var167) >> 4) + class67.field1031;
                    int var169 = (7 & var167) + class444.field6090;
                    int var170 = class481.field6632.method2233((byte) -121);
                    int var171 = class481.field6632.method2233((byte) -128);
                    int var172 = class481.field6632.method2207(-128);
                    if (var168 >= 0 && var169 >= 0 && ~class12.field251 < ~var168 && ~var169 > ~class289.field3782 && class391.field5305 != var170) {
                        class250.method1510(new class238(var171, var172), var168, var169, class208.field2858, -882487236);
                        class97.method692(class208.field2858, var168, (byte) 113, var169);
                    }
                } else {
                    class504.method2879((Throwable) null, "T3 - " + arg0, -19638);
                    class476.method2735(255);
                }
            } else {
                int var159 = class481.field6632.method2240(255);
                int var160 = (var159 >> 4 & 7) + class67.field1031;
                int var161 = (var159 & 7) + class444.field6090;
                int var162 = class481.field6632.method2222(-128);
                int var163 = var162 >> 2;
                int var164 = 3 & var162;
                int var165 = class333.field4373[var163];
                int var166 = class481.field6632.method2245(255);
                if (class53.method390(class55.field872, (byte) -38) || ~var160 <= -1 && var161 >= 0 && ~class12.field251 < ~var160 && ~class289.field3782 < ~var161) {
                    class249.method1508(var166, class208.field2858, var164, var165, var161, -1, 0, (byte) 37, var160, var163);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B[BII)V")
    public final void method730(byte arg0, byte[] arg1, int arg2, int arg3) {
        this.method671(35044, arg1, arg3);
        ++field2615;
        this.field2612 = arg2;
        if (arg0 <= 28) {
            field2617 = -23;
        }
    }

    static {
        new class304("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
        field2621 = 0.0F;
        field2622 = new String[100];
    }
}
