import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class70 extends class7 {

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "I")
    private int field1082;

    @OriginalMember(owner = "client!vf", name = "F", descriptor = "I")
    private int field1090;

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "I")
    private int field1084;

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
    private int field1076;

    @OriginalMember(owner = "client!vf", name = "J", descriptor = "I")
    public static int field1094 = 0;

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "I")
    private int field1081;

    @OriginalMember(owner = "client!vf", name = "y", descriptor = "I")
    private int field1083;

    @OriginalMember(owner = "client!vf", name = "A", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!vf", name = "B", descriptor = "I")
    private int field1086;

    @OriginalMember(owner = "client!vf", name = "C", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!vf", name = "D", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!vf", name = "E", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!vf", name = "G", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!vf", name = "H", descriptor = "I")
    private int field1092;

    @OriginalMember(owner = "client!vf", name = "I", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "[B")
    private byte[] field1077;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)V", line = 4)
    public static final void method485(int arg0) {
        if (arg0 != -6) {
            field1094 = -54;
        }
        field1087++;
        for (int var1 = 0; var1 < 5; var1++) {
            class217.field3346[var1] = false;
        }
        class206.field3132 = 0;
        class269.field4427 = 1;
        class39.field602 = 0;
        class270.field4456 = -1;
        class250.field3998 = -1;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIB)V", line = 29)
    public final void method55(int arg0, int arg1, byte arg2) {
        if (arg1 == 0) {
            this.field1086 = 4096;
            this.field1081 = this.field1082 - (arg0 < 0 ? -arg0 : arg0);
            this.field1081 = this.field1081 * this.field1081 >> 12;
            this.field1083 = this.field1081;
        } else {
            this.field1086 = this.field1090 * this.field1081 >> 12;
            if (this.field1086 < 0) {
                this.field1086 = 0;
            } else if (this.field1086 > 4096) {
                this.field1086 = 4096;
            }
            this.field1081 = this.field1082 - (arg0 < 0 ? -arg0 : arg0);
            this.field1081 = this.field1081 * this.field1081 >> 12;
            this.field1081 = this.field1086 * this.field1081 >> 12;
            this.field1083 += this.field1081 * this.field1076 >> 12;
            this.field1076 = this.field1084 * this.field1076 >> 12;
        }
        field1089++;
        if (arg2 > -25) {
            method489(false, (class167) null, -64);
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(IIIIIFFF)V", line = 66)
    public class70(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field1082 = (int) (arg6 * 4096.0F);
        this.field1090 = (int) (arg7 * 4096.0F);
        this.field1076 = this.field1084 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIIB[Lsi;II)V", line = 78)
    public static final void method486(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, class264[] arg7, int arg8, int arg9) {
        if (class245.field3886) {
            class335.method2375(arg2, arg5, arg8, arg1);
        } else {
            class317.method2273(arg2, arg5, arg8, arg1);
            class272.method1915();
        }
        for (int var10 = 0; var10 < arg7.length; var10++) {
            class264 var11 = arg7[var10];
            if (var11 != null && (var11.field4201 == arg3 || arg3 == -1412584499 && class52.field788 == var11)) {
                int var12;
                if (arg9 == -1) {
                    class21.field263[class60.field916] = var11.field4310 + arg4;
                    class265.field4360[class60.field916] = var11.field4286 + arg0;
                    class138.field2179[class60.field916] = var11.field4223;
                    class189.field2926[class60.field916] = var11.field4236;
                    var12 = class60.field916++;
                } else {
                    var12 = arg9;
                }
                var11.field4357 = var12;
                var11.field4298 = class58.field875;
                if (!var11.field4276 || !client.method891(var11)) {
                    if (var11.field4233 > 0) {
                        class197.method1347(-70, var11);
                    }
                    int var13 = var11.field4310 + arg4;
                    int var14 = var11.field4286 + arg0;
                    int var15 = var11.field4282;
                    if (class172.field2693 && (client.method898(var11).field1155 != 0 || var11.field4350 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class52.field788 == var11) {
                        if (arg3 != -1412584499 && !var11.field4316) {
                            class299.field4937 = arg4;
                            class111.field1650 = arg7;
                            class11.field117 = arg0;
                            continue;
                        }
                        if (!var11.field4316) {
                            var15 = 128;
                        }
                        if (class326.field5344 && class9.field108) {
                            int var16 = class305.field4988;
                            int var17 = class130.field1982;
                            int var18 = var17 - class267.field4389;
                            if (class217.field3345 > var18) {
                                var18 = class217.field3345;
                            }
                            int var19 = var16 - class171.field2666;
                            if (var11.field4236 + var18 > class217.field3345 - -class242.field3813.field4236) {
                                var18 = class217.field3345 + class242.field3813.field4236 - var11.field4236;
                            }
                            if (class30.field462 > var19) {
                                var19 = class30.field462;
                            }
                            var14 = var18;
                            if ((class30.field462 + class242.field3813.field4223) < (var11.field4223 + var19)) {
                                var19 = class30.field462 + class242.field3813.field4223 - var11.field4223;
                            }
                            var13 = var19;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field4350 == 2) {
                        var20 = arg8;
                        var21 = arg5;
                        var22 = arg2;
                        var23 = arg1;
                    } else {
                        var21 = var14 > arg5 ? var14 : arg5;
                        var22 = var13 > arg2 ? var13 : arg2;
                        int var24 = var14 + var11.field4236;
                        int var25 = var11.field4223 + var13;
                        if (var11.field4350 == 9) {
                            var24++;
                            var25++;
                        }
                        var20 = arg8 <= var25 ? arg8 : var25;
                        var23 = arg1 > var24 ? var24 : arg1;
                    }
                    if (!var11.field4276 || var20 > var22 && var21 < var23) {
                        if (var11.field4233 != 0) {
                            if (var11.field4233 == 1337 || var11.field4233 == 1403) {
                                class25.field383 = var13;
                                class291.field4836 = var14;
                                class41.field633 = var11;
                                class29.method254(var14, var11.field4233 == 1403, var11.field4223, var13, var11.field4236, -129);
                                class116.field1694[var12] = true;
                                if (class245.field3886) {
                                    class335.method2375(arg2, arg5, arg8, arg1);
                                } else {
                                    class317.method2273(arg2, arg5, arg8, arg1);
                                }
                                continue;
                            }
                            if (var11.field4233 == 1338) {
                                if (!var11.method1860(false)) {
                                    continue;
                                }
                                class249.method1772(1680, var12, var14, var13, var11);
                                if (class245.field3886) {
                                    class335.method2375(arg2, arg5, arg8, arg1);
                                } else {
                                    class317.method2273(arg2, arg5, arg8, arg1);
                                }
                                if (class203.field3112 != 0 && class203.field3112 != 3 || class286.field4681 || class138.field2181 < var22 || class39.field595 < var21 || var20 <= class138.field2181 || var23 <= class39.field595) {
                                    continue;
                                }
                                int var127 = class39.field595 - var14;
                                int var128 = class138.field2181 - var13;
                                int var129 = var11.field4260[var127];
                                if (var128 < var129 || var128 > (var11.field4338[var127] + var129)) {
                                    continue;
                                }
                                int var130 = (int) class355.field5628 + class322.field5284 & 0x7FF;
                                int var131 = var127 - var11.field4236 / 2;
                                int var132 = var128 - var11.field4223 / 2;
                                int var133 = class272.field4470[var130];
                                int var134 = (class196.field3008 + 256) * var133 >> 8;
                                int var135 = class272.field4480[var130];
                                int var136 = (class196.field3008 + 256) * var135 >> 8;
                                int var137 = var131 * var136 - (var132 * var134) >> 11;
                                int var138 = var131 * var134 + (var132 * var136) >> 11;
                                int var139 = class329.field5388.field4796 - ((class329.field5388.method312(90) - 1) * 64 - var138) >> 7;
                                int var140 = class329.field5388.field4783 - var137 - ((class329.field5388.method312(105) + -1) * 64) >> 7;
                                if (class107.field1532 && (class29.field447 & 0x40) != 0) {
                                    class264 var141 = class113.method741(class345.field5530, (byte) 127, class313.field5108);
                                    if (var141 == null) {
                                        class352.method2459(-1);
                                    } else {
                                        class322.method2309(" ->", var139, (short) 40, false, class339.field5457, class120.field1776, var140, 1L);
                                    }
                                    continue;
                                }
                                if (class179.field2789 == 1) {
                                    class322.method2309("", var139, (short) 14, false, -1, class5.field63, var140, 1L);
                                }
                                class322.method2309("", var139, (short) 38, false, -1, class340.field5477, var140, 1L);
                                continue;
                            }
                            if (var11.field4233 == 1339) {
                                if (var11.method1860(false)) {
                                    class104.method693(var11, var12, var14, var13, false);
                                    if (class245.field3886) {
                                        class335.method2375(arg2, arg5, arg8, arg1);
                                    } else {
                                        class317.method2273(arg2, arg5, arg8, arg1);
                                    }
                                }
                                continue;
                            }
                            if (var11.field4233 == 1400) {
                                class280.method1989(var13, var11.field4236, var11.field4223, -18, var14);
                                class116.field1694[var12] = true;
                                class324.field5309[var12] = true;
                                if (class245.field3886) {
                                    class335.method2375(arg2, arg5, arg8, arg1);
                                } else {
                                    class317.method2273(arg2, arg5, arg8, arg1);
                                }
                                continue;
                            }
                            if (var11.field4233 == 1401) {
                                class248.method1759(var14, var11.field4236, var11.field4223, var13, 113);
                                class116.field1694[var12] = true;
                                class324.field5309[var12] = true;
                                if (class245.field3886) {
                                    class335.method2375(arg2, arg5, arg8, arg1);
                                } else {
                                    class317.method2273(arg2, arg5, arg8, arg1);
                                }
                                continue;
                            }
                            if (var11.field4233 == 1402) {
                                if (!class245.field3886) {
                                    class91.method604(-129, var13, var14);
                                    class116.field1694[var12] = true;
                                    class324.field5309[var12] = true;
                                }
                                continue;
                            }
                            if (var11.field4233 == 1405) {
                                if (!class126.field1902) {
                                    continue;
                                }
                                int var26 = var11.field4223 + var13;
                                int var27 = 16776960;
                                int var28 = var14 + 15;
                                class287.field4740.method1211("Fps:" + class352.field5612, var26, var28, 16776960, -1);
                                Runtime var29 = Runtime.getRuntime();
                                int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                int var142 = var28 + 15;
                                if (var30 > 65536) {
                                    var27 = 16711680;
                                }
                                class287.field4740.method1211("Mem:" + var30 + "k", var26, var142, var27, -1);
                                var28 = var142 + 15;
                                if (class245.field3886) {
                                    int var31 = (class173.field2705 + class173.field2704 + class173.field2701) / 1024;
                                    int var32 = 16776960;
                                    if (var31 > 65536) {
                                        var32 = 16711680;
                                    }
                                    class287.field4740.method1211("Card:" + var31 + "k", var26, var28, var32, -1);
                                    var28 += 15;
                                }
                                int var33 = 16776960;
                                int var34 = 0;
                                int var35 = 0;
                                int var36 = 0;
                                for (int var37 = 0; var37 < 29; var37++) {
                                    var34 += class291.field4830[var37].method1451((byte) 123);
                                    var35 += class291.field4830[var37].method1447(60);
                                    var36 += class291.field4830[var37].method1446(61);
                                }
                                int var38 = var36 * 100 / var34;
                                int var39 = var35 * 10000 / var34;
                                String var40 = "Cache:" + class302.method2118((long) var39, 2, true, 0, 30149) + "% (" + var38 + "%)";
                                class302.field4967.method1211(var40, var26, var28, var33, -1);
                                var28 += 12;
                                if (class145.field2316 > 0) {
                                    class302.field4967.method1211("Particles: " + class145.field2318 + " / " + class145.field2316, var26, var28, var33, -1);
                                }
                                var28 += 12;
                                class116.field1694[var12] = true;
                                class324.field5309[var12] = true;
                                continue;
                            }
                            if (var11.field4233 == 1406) {
                                class355.field5639 = var13;
                                class177.field2775 = var14;
                                class259.field4100 = var11;
                                continue;
                            }
                        }
                        if (!class286.field4681) {
                            if (var11.field4350 == 0 && var11.field4318 && class138.field2181 >= var22 && class39.field595 >= var21 && var20 > class138.field2181 && class39.field595 < var23 && !class172.field2693) {
                                class117.field1701 = 1;
                                class39.field570[0] = class214.field3275;
                                class190.field2938[0] = "";
                                class109.field1622[0] = class83.field1199;
                                class300.field4949[0] = 1011;
                            }
                            if (class138.field2181 >= var22 && class39.field595 >= var21 && class138.field2181 < var20 && var23 > class39.field595) {
                                class123.method798((byte) 103, class138.field2181 - var13, -var14 + class39.field595, var11);
                            }
                        }
                        if (var11.field4350 == 0) {
                            if (!var11.field4276 && client.method891(var11) && class295.field4899 != var11) {
                                continue;
                            }
                            if (!var11.field4276) {
                                if (var11.field4242 > (var11.field4228 - var11.field4236)) {
                                    var11.field4242 = var11.field4228 - var11.field4236;
                                }
                                if (var11.field4242 < 0) {
                                    var11.field4242 = 0;
                                }
                            }
                            if (class245.field3886 && var11.field4233 == 1407) {
                                class309.method2163(var13, var14, var11.field4223, var11.field4236);
                            }
                            method486(var14 - var11.field4242, var23, var22, var11.field4204, var13 - var11.field4220, var21, (byte) -44, arg7, var20, var12);
                            if (var11.field4314 != null) {
                                method486(var14 - var11.field4242, var23, var22, var11.field4204, var13 - var11.field4220, var21, (byte) -76, var11.field4314, var20, var12);
                            }
                            class167 var41 = (class167) class218.field3363.method29((long) var11.field4204, 103);
                            if (var41 != null) {
                                if (var41.field2629 == 0 && !class286.field4681 && var22 <= class138.field2181 && var21 <= class39.field595 && class138.field2181 < var20 && class39.field595 < var23 && !class172.field2693) {
                                    class300.field4949[0] = 1011;
                                    class109.field1622[0] = class83.field1199;
                                    class39.field570[0] = class214.field3275;
                                    class117.field1701 = 1;
                                    class190.field2938[0] = "";
                                }
                                class291.method2059(true, var23, var12, var21, var20, var14, var41.field2631, var13, var22);
                            }
                            if (class245.field3886 && var11.field4233 == 1407) {
                                class309.method2160();
                                class315.field5198 = true;
                            }
                            if (class245.field3886) {
                                class335.method2375(arg2, arg5, arg8, arg1);
                            } else {
                                class317.method2273(arg2, arg5, arg8, arg1);
                                class272.method1915();
                            }
                        }
                        if (class319.field5267[var12] || class166.field2616 > 1) {
                            if (var11.field4350 == 0 && !var11.field4276 && var11.field4236 < var11.field4228) {
                                class243.method1695(var11.field4223 + var13, (byte) -24, var11.field4242, var11.field4236, var11.field4228, var14);
                            }
                            if (var11.field4350 != 1) {
                                if (var11.field4350 == 2) {
                                    int var110 = 0;
                                    for (int var111 = 0; var111 < var11.field4262; var111++) {
                                        for (int var112 = 0; var112 < var11.field4188; var112++) {
                                            int var113 = (var11.field4322 + 32) * var112 + var13;
                                            int var114 = (var11.field4342 + 32) * var111 + var14;
                                            if (var110 < 20) {
                                                var114 += var11.field4216[var110];
                                                var113 += var11.field4199[var110];
                                            }
                                            if (var11.field4330[var110] > 0) {
                                                boolean var116 = false;
                                                boolean var117 = false;
                                                int var118 = var11.field4330[var110] - 1;
                                                if (arg2 < var113 + 32 && arg8 > var113 && var114 + 32 > arg5 && arg1 > var114 || class185.field2876 == var11 && class169.field2648 == var110) {
                                                    class289 var119;
                                                    if (class56.field856 == 1 && class264.field4353 == var110 && class104.field1511 == var11.field4204) {
                                                        var119 = class2.method8(2, (class340) null, var11.field4334, var11.field4321[var110], (byte) 62, var118, 0);
                                                    } else {
                                                        var119 = class2.method8(1, (class340) null, var11.field4334, var11.field4321[var110], (byte) 111, var118, 3153952);
                                                    }
                                                    if (class272.field4465) {
                                                        class116.field1694[var12] = true;
                                                    }
                                                    if (var119 == null) {
                                                        class218.method1472((byte) 109, var11);
                                                    } else if (class185.field2876 == var11 && class169.field2648 == var110) {
                                                        int var120 = class130.field1982 - class248.field3924;
                                                        if (var120 < 5 && var120 > -5) {
                                                            var120 = 0;
                                                        }
                                                        int var121 = class305.field4988 - class305.field4995;
                                                        if (var121 < 5 && var121 > -5) {
                                                            var121 = 0;
                                                        }
                                                        if (class325.field5325 < 5) {
                                                            var121 = 0;
                                                            var120 = 0;
                                                        }
                                                        var119.method946(var113 + var121, var114 + var120, 128);
                                                        if (arg3 != -1) {
                                                            class264 var122 = arg7[arg3 & 0xFFFF];
                                                            int var123;
                                                            int var124;
                                                            if (class245.field3886) {
                                                                var124 = class335.field5429;
                                                                var123 = class335.field5427;
                                                            } else {
                                                                var123 = class317.field5235;
                                                                var124 = class317.field5232;
                                                            }
                                                            if (var123 > (var114 + var120) && var122.field4242 > 0) {
                                                                int var125 = (var123 - var114 - var120) * class215.field3322 / 3;
                                                                if (var125 > class215.field3322 * 10) {
                                                                    var125 = class215.field3322 * 10;
                                                                }
                                                                if (var122.field4242 < var125) {
                                                                    var125 = var122.field4242;
                                                                }
                                                                class248.field3924 += var125;
                                                                var122.field4242 -= var125;
                                                                class218.method1472((byte) 97, var122);
                                                            }
                                                            if (var124 < var114 + var120 + 32 && var122.field4242 < var122.field4228 - var122.field4236) {
                                                                int var126 = (var114 + var120 - (-32 - -var124)) * class215.field3322 / 3;
                                                                if (var126 > class215.field3322 * 10) {
                                                                    var126 = class215.field3322 * 10;
                                                                }
                                                                if ((var122.field4228 - var122.field4236 - var122.field4242) < var126) {
                                                                    var126 = var122.field4228 - var122.field4242 - var122.field4236;
                                                                }
                                                                var122.field4242 += var126;
                                                                class248.field3924 -= var126;
                                                                class218.method1472((byte) 106, var122);
                                                            }
                                                        }
                                                    } else if (class165.field2594 == var11 && class355.field5632 == var110) {
                                                        var119.method946(var113, var114, 128);
                                                    } else {
                                                        var119.method945(var113, var114);
                                                    }
                                                }
                                            } else if (var11.field4202 != null && var110 < 20) {
                                                class289 var115 = var11.method1857(-8824, var110);
                                                if (var115 != null) {
                                                    var115.method945(var113, var114);
                                                } else if (class92.field1359) {
                                                    class218.method1472((byte) 123, var11);
                                                }
                                            }
                                            var110++;
                                        }
                                    }
                                } else if (var11.field4350 == 3) {
                                    int var109;
                                    if (class169.method1172(var11, -1633)) {
                                        var109 = var11.field4178;
                                        if (class295.field4899 == var11 && var11.field4249 != 0) {
                                            var109 = var11.field4249;
                                        }
                                    } else {
                                        var109 = var11.field4261;
                                        if (class295.field4899 == var11 && var11.field4348 != 0) {
                                            var109 = var11.field4348;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field4263) {
                                            if (class245.field3886) {
                                                class335.method2380(var13, var14, var11.field4223, var11.field4236, var109);
                                            } else {
                                                class317.method2282(var13, var14, var11.field4223, var11.field4236, var109);
                                            }
                                        } else if (class245.field3886) {
                                            class335.method2376(var13, var14, var11.field4223, var11.field4236, var109);
                                        } else {
                                            class317.method2266(var13, var14, var11.field4223, var11.field4236, var109);
                                        }
                                    } else if (var11.field4263) {
                                        if (class245.field3886) {
                                            class335.method2365(var13, var14, var11.field4223, var11.field4236, var109, 256 - (var15 & 0xFF));
                                        } else {
                                            class317.method2270(var13, var14, var11.field4223, var11.field4236, var109, 256 - (var15 & 0xFF));
                                        }
                                    } else if (class245.field3886) {
                                        class335.method2378(var13, var14, var11.field4223, var11.field4236, var109, 256 - (var15 & 0xFF));
                                    } else {
                                        class317.method2286(var13, var14, var11.field4223, var11.field4236, var109, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field4350 == 4) {
                                    class175 var42 = var11.method1855(class13.field175, (byte) 104);
                                    if (var42 != null) {
                                        String var43 = var11.field4192;
                                        int var44;
                                        if (class169.method1172(var11, -1633)) {
                                            var44 = var11.field4178;
                                            if (class295.field4899 == var11 && var11.field4249 != 0) {
                                                var44 = var11.field4249;
                                            }
                                            if (var11.field4347.length() > 0) {
                                                var43 = var11.field4347;
                                            }
                                        } else {
                                            var44 = var11.field4261;
                                            if (class295.field4899 == var11 && var11.field4348 != 0) {
                                                var44 = var11.field4348;
                                            }
                                        }
                                        if (var11.field4276 && var11.field4293 != -1) {
                                            class109 var45 = class322.method2311(var11.field4293, -100);
                                            var43 = var45.field1596;
                                            if (var43 == null) {
                                                var43 = "null";
                                            }
                                            if ((var45.field1565 == 1 || var11.field4323 != 1) && var11.field4323 != -1) {
                                                var43 = "<col=ff9040>" + var43 + "</col> x" + class286.method2018(-3, var11.field4323);
                                            }
                                        }
                                        if (class172.field2695 == var11) {
                                            var43 = class60.field907;
                                            var44 = var11.field4261;
                                        }
                                        if (!var11.field4276) {
                                            var43 = class253.method1794((byte) -128, var43, var11);
                                        }
                                        var42.method1208(var43, var13, var14, var11.field4223, var11.field4236, var44, var11.field4250 ? 0 : -1, var11.field4234, var11.field4213, var11.field4308);
                                    } else if (class92.field1359) {
                                        class218.method1472((byte) 115, var11);
                                    }
                                } else if (var11.field4350 == 5) {
                                    if (!var11.field4276) {
                                        class289 var62 = var11.method1859(-1, class169.method1172(var11, -1633));
                                        if (var62 != null) {
                                            var62.method945(var13, var14);
                                        } else if (class92.field1359) {
                                            class218.method1472((byte) 125, var11);
                                        }
                                    } else if (var11.field4287 >= 0) {
                                        class174 var46 = var11.method1864(false);
                                        if (class245.field3886) {
                                            var46.method1205(0, var13, var14, var11.field4223, var11.field4236, var11.field4209, var11.field4231, 0);
                                        } else {
                                            var46.method1201(0, var13, var14, var11.field4223, var11.field4236, var11.field4209, var11.field4231, 0);
                                        }
                                    } else {
                                        class289 var47;
                                        if (var11.field4293 == -1) {
                                            var47 = var11.method1859(-1, false);
                                        } else if (var11.field4265 && class329.field5388.field600 != null) {
                                            var47 = class2.method8(var11.field4254, class329.field5388.field600, var11.field4334, var11.field4323, (byte) 97, var11.field4293, var11.field4207);
                                        } else {
                                            var47 = class2.method8(var11.field4254, (class340) null, var11.field4334, var11.field4323, (byte) 85, var11.field4293, var11.field4207);
                                        }
                                        if (var47 != null) {
                                            int var48 = var47.field4805;
                                            int var49 = var47.field4812;
                                            if (var11.field4222) {
                                                int var51 = (var11.field4223 + var48 - 1) / var48;
                                                int var52 = (var49 + var11.field4236 - 1) / var49;
                                                if (class245.field3886) {
                                                    class335.method2370(var13, var14, var11.field4223 + var13, var11.field4236 + var14);
                                                    boolean var53 = class238.method1667(1, var47.field4802);
                                                    boolean var54 = class238.method1667(1, var47.field4811);
                                                    class232 var55 = (class232) var47;
                                                    if (var53 && var54) {
                                                        if (var15 == 0) {
                                                            var55.method1604(var13, var14, var51, var52);
                                                        } else {
                                                            var55.method1603(var13, var14, 256 - (var15 & 0xFF), var51, var52);
                                                        }
                                                    } else if (var53) {
                                                        for (int var59 = 0; var59 < var52; var59++) {
                                                            if (var15 == 0) {
                                                                var55.method1604(var13, var14 + (var49 * var59), var51, 1);
                                                            } else {
                                                                var55.method1603(var13, var49 * var59 + var14, 256 - (var15 & 0xFF), var51, 1);
                                                            }
                                                        }
                                                    } else if (var54) {
                                                        for (int var56 = 0; var56 < var51; var56++) {
                                                            if (var15 == 0) {
                                                                var55.method1604(var13 + (var48 * var56), var14, 1, var52);
                                                            } else {
                                                                var55.method1603(var48 * var56 + var13, var14, 256 - (var15 & 0xFF), 1, var52);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var57 = 0; var57 < var51; var57++) {
                                                            for (int var58 = 0; var58 < var52; var58++) {
                                                                if (var15 == 0) {
                                                                    var47.method945(var48 * var57 + var13, var14 - -(var49 * var58));
                                                                } else {
                                                                    var47.method946(var48 * var57 + var13, var14 - -(var49 * var58), 256 - (var15 & 0xFF));
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class335.method2375(arg2, arg5, arg8, arg1);
                                                } else {
                                                    class317.method2277(var13, var14, var13 + var11.field4223, var11.field4236 + var14);
                                                    for (int var60 = 0; var60 < var51; var60++) {
                                                        for (int var61 = 0; var61 < var52; var61++) {
                                                            if (var11.field4186 != 0) {
                                                                var47.method2046((byte) 86, var49 * var61 + (var14 + (var49 / 2)), var11.field4186, var48 / 2 + (var13 + (var48 * var60)), 4096);
                                                            } else if (var15 == 0) {
                                                                var47.method945(var13 + (var48 * var60), var49 * var61 + var14);
                                                            } else {
                                                                var47.method946(var48 * var60 + var13, var49 * var61 + var14, 256 - (var15 & 0xFF));
                                                            }
                                                        }
                                                    }
                                                    class317.method2273(arg2, arg5, arg8, arg1);
                                                }
                                            } else {
                                                int var50 = var11.field4223 * 4096 / var48;
                                                if (var11.field4186 != 0) {
                                                    var47.method2046((byte) 73, var14 + (var11.field4236 / 2), var11.field4186, var11.field4223 / 2 + var13, var50);
                                                } else if (var15 != 0) {
                                                    var47.method961(var13, var14, var11.field4223, var11.field4236, 256 - (var15 & 0xFF));
                                                } else if (var11.field4223 == var48 && var11.field4236 == var49) {
                                                    var47.method945(var13, var14);
                                                } else {
                                                    var47.method959(var13, var14, var11.field4223, var11.field4236);
                                                }
                                            }
                                        } else if (class92.field1359) {
                                            class218.method1472((byte) 115, var11);
                                        }
                                    }
                                } else if (var11.field4350 == 6) {
                                    boolean var90 = class169.method1172(var11, -1633);
                                    int var91;
                                    if (var90) {
                                        var91 = var11.field4278;
                                    } else {
                                        var91 = var11.field4296;
                                    }
                                    class128 var92 = null;
                                    int var93 = 0;
                                    if (var11.field4293 != -1) {
                                        class109 var98 = class322.method2311(var11.field4293, -109);
                                        if (var98 != null) {
                                            class109 var99 = var98.method730(17551, var11.field4323);
                                            class131 var100 = var91 == -1 ? null : class68.method476((byte) 71, var91);
                                            if (var11.field4265 && class329.field5388.field600 != null) {
                                                var92 = var99.method725(1, var11.field4301, class329.field5388.field600, var11.field4313, var11.field4285, var100, 70);
                                            } else {
                                                var92 = var99.method725(1, var11.field4301, (class340) null, var11.field4313, var11.field4285, var100, -116);
                                            }
                                            if (var92 == null) {
                                                class218.method1472((byte) 124, var11);
                                            } else {
                                                var93 = -var92.method192() / 2;
                                            }
                                        }
                                    } else if (var11.field4198 == 5) {
                                        if (var11.field4194 == -1) {
                                            var92 = class150.field2409.method2397((class131) null, -1, -1, false, (class131) null, 0, true, 0, 0, -1, (class223[]) null, -1);
                                        } else {
                                            int var94 = var11.field4194 & 0x7FF;
                                            if (class102.field1490 == var94) {
                                                var94 = 2047;
                                            }
                                            class39 var95 = class130.field1984[var94];
                                            class131 var96 = var91 == -1 ? null : class68.method476((byte) 96, var91);
                                            if (var95 != null && ((int) class265.method1872(var95.field597, 67) << 11) == (var11.field4194 & 0xFFFFF800)) {
                                                var92 = var95.field600.method2397(var96, 0, var11.field4285, false, (class131) null, 0, true, 0, 0, -1, (class223[]) null, -1);
                                            }
                                        }
                                    } else if (var91 == -1) {
                                        var92 = var11.method1868(-88, 0, var90, -1, (class131) null, -1, class329.field5388.field600);
                                        if (var92 == null && class92.field1359) {
                                            class218.method1472((byte) 110, var11);
                                        }
                                    } else {
                                        class131 var97 = class68.method476((byte) 73, var91);
                                        var92 = var11.method1868(-102, var11.field4313, var90, var11.field4301, var97, var11.field4285, class329.field5388.field600);
                                        if (var92 == null && class92.field1359) {
                                            class218.method1472((byte) 113, var11);
                                        }
                                    }
                                    if (var92 != null) {
                                        int var101;
                                        if (var11.field4291 <= 0) {
                                            var101 = 256;
                                        } else {
                                            var101 = (var11.field4223 << 8) / var11.field4291;
                                        }
                                        int var102;
                                        if (var11.field4349 > 0) {
                                            var102 = (var11.field4236 << 8) / var11.field4349;
                                        } else {
                                            var102 = 256;
                                        }
                                        int var103 = var11.field4223 / 2 + var13 + (var11.field4175 * var101 >> 8);
                                        int var104 = (var11.field4340 * var102 >> 8) + var11.field4236 / 2 + var14;
                                        if (class245.field3886) {
                                            if (var11.field4290) {
                                                class245.method1705(var103, var104, var11.field4271, var11.field4190, var101, var102);
                                            } else {
                                                class245.method1733(var103, var104, var101, var102);
                                                class245.method1727((float) var11.field4326, (float) var11.field4190 * 1.5F);
                                            }
                                            class245.method1723();
                                            class245.method1742(true);
                                            class245.method1743(false);
                                            class140.method992(class75.field1138, 1);
                                            if (class315.field5198) {
                                                class335.method2379();
                                                class245.method1736();
                                                class335.method2375(arg2, arg5, arg8, arg1);
                                                class315.field5198 = false;
                                            }
                                            if (var11.field4195) {
                                                class245.method1713();
                                            }
                                            int var105 = class272.field4470[var11.field4191] * var11.field4271 >> 16;
                                            int var106 = class272.field4480[var11.field4191] * var11.field4271 >> 16;
                                            if (var11.field4276) {
                                                var92.method182(0, var11.field4346, var11.field4297, var11.field4191, var11.field4248, var11.field4327 + var93 + var105, var11.field4327 + var106, -1L);
                                            } else {
                                                var92.method182(0, var11.field4346, 0, var11.field4191, 0, var105, var106, -1L);
                                            }
                                            if (var11.field4195) {
                                                class245.method1724();
                                            }
                                        } else {
                                            class272.method1924(var103, var104);
                                            int var107 = class272.field4470[var11.field4191] * var11.field4271 >> 16;
                                            int var108 = class272.field4480[var11.field4191] * var11.field4271 >> 16;
                                            if (!var11.field4276) {
                                                var92.method182(0, var11.field4346, 0, var11.field4191, 0, var107, var108, -1L);
                                            } else if (var11.field4290) {
                                                ((class67) var92).method464(0, var11.field4346, var11.field4297, var11.field4191, var11.field4248, var93 + var107 + var11.field4327, var108 - -var11.field4327, var11.field4271);
                                            } else {
                                                var92.method182(0, var11.field4346, var11.field4297, var11.field4191, var11.field4248, var107 - (-var11.field4327 - var93), var11.field4327 + var108, -1L);
                                            }
                                            class272.method1933();
                                        }
                                    }
                                } else {
                                    if (var11.field4350 == 7) {
                                        class175 var63 = var11.method1855(class13.field175, (byte) 96);
                                        if (var63 == null) {
                                            if (class92.field1359) {
                                                class218.method1472((byte) 121, var11);
                                            }
                                            continue;
                                        }
                                        int var64 = 0;
                                        for (int var65 = 0; var65 < var11.field4262; var65++) {
                                            for (int var66 = 0; var66 < var11.field4188; var66++) {
                                                if (var11.field4330[var64] > 0) {
                                                    class109 var67 = class322.method2311(var11.field4330[var64] - 1, -98);
                                                    String var68;
                                                    if (var67.field1565 != 1 && var11.field4321[var64] == 1) {
                                                        var68 = "<col=ff9040>" + var67.field1596 + "</col>";
                                                    } else {
                                                        var68 = "<col=ff9040>" + var67.field1596 + "</col> x" + class286.method2018(-3, var11.field4321[var64]);
                                                    }
                                                    int var69 = var13 + ((var11.field4322 + 115) * var66);
                                                    int var70 = (var11.field4342 + 12) * var65 + var14;
                                                    if (var11.field4234 == 0) {
                                                        var63.method1232(var68, var69, var70, var11.field4261, var11.field4250 ? 0 : -1);
                                                    } else if (var11.field4234 == 1) {
                                                        var63.method1222(var68, var69 + 57, var70, var11.field4261, var11.field4250 ? 0 : -1);
                                                    } else {
                                                        var63.method1211(var68, var69 + 115 - 1, var70, var11.field4261, var11.field4250 ? 0 : -1);
                                                    }
                                                }
                                                var64++;
                                            }
                                        }
                                    }
                                    if (var11.field4350 == 8 && class261.field4110 == var11 && class326.field5340 == class182.field2832) {
                                        int var71 = 0;
                                        int var72 = 0;
                                        String var73 = var11.field4192;
                                        class175 var74 = class287.field4740;
                                        String var75 = class253.method1794((byte) -126, var73, var11);
                                        while (var75.length() > 0) {
                                            int var76 = var75.indexOf("<br>");
                                            String var77;
                                            if (var76 == -1) {
                                                var77 = var75;
                                                var75 = "";
                                            } else {
                                                var77 = var75.substring(0, var76);
                                                var75 = var75.substring(var76 + 4);
                                            }
                                            int var78 = var74.method1216(var77);
                                            if (var71 < var78) {
                                                var71 = var78;
                                            }
                                            var72 += var74.field2724 + 1;
                                        }
                                        var72 += 7;
                                        int var79 = var11.field4236 + var14 + 5;
                                        if ((var72 + var79) > arg1) {
                                            var79 = arg1 - var72;
                                        }
                                        var71 += 6;
                                        int var80 = var11.field4223 + var13 - var71 - 5;
                                        if ((var13 + 5) > var80) {
                                            var80 = var13 + 5;
                                        }
                                        if (arg8 < (var71 + var80)) {
                                            var80 = arg8 - var71;
                                        }
                                        if (class245.field3886) {
                                            class335.method2380(var80, var79, var71, var72, 16777120);
                                            class335.method2376(var80, var79, var71, var72, 0);
                                        } else {
                                            class317.method2282(var80, var79, var71, var72, 16777120);
                                            class317.method2266(var80, var79, var71, var72, 0);
                                        }
                                        int var81 = var79 + var74.field2724 + 2;
                                        String var82 = var11.field4192;
                                        String var83 = class253.method1794((byte) -127, var82, var11);
                                        while (var83.length() > 0) {
                                            int var84 = var83.indexOf("<br>");
                                            String var85;
                                            if (var84 == -1) {
                                                var85 = var83;
                                                var83 = "";
                                            } else {
                                                var85 = var83.substring(0, var84);
                                                var83 = var83.substring(var84 + 4);
                                            }
                                            var74.method1232(var85, var80 + 3, var81, 0, -1);
                                            var81 += var74.field2724 + 1;
                                        }
                                    }
                                    if (var11.field4350 == 9) {
                                        int var86;
                                        int var87;
                                        int var88;
                                        int var89;
                                        if (var11.field4203) {
                                            var86 = var11.field4223 + var13;
                                            var87 = var13;
                                            var88 = var14;
                                            var89 = var11.field4236 + var14;
                                        } else {
                                            var89 = var14;
                                            var87 = var13;
                                            var86 = var11.field4223 + var13;
                                            var88 = var11.field4236 + var14;
                                        }
                                        if (var11.field4280 == 1) {
                                            if (class245.field3886) {
                                                class335.method2371(var87, var89, var86, var88, var11.field4261);
                                            } else {
                                                class317.method2287(var87, var89, var86, var88, var11.field4261);
                                            }
                                        } else if (class245.field3886) {
                                            class335.method2381(var87, var89, var86, var88, var11.field4261, var11.field4280);
                                        } else {
                                            class317.method2274(var87, var89, var86, var88, var11.field4261, var11.field4280);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg6 > -36) {
            method485(9);
        }
        field1078++;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(IB)V", line = 1408)
    public void method487(int arg0, byte arg1) {
        this.field1077[arg0] = arg1;
        field1075++;
    }

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "(I)V", line = 1420)
    public static final void method488(int arg0) {
        if (arg0 != 10000) {
            method486(-77, -10, -105, -50, -114, -128, (byte) -25, (class264[]) null, -61, -102);
        }
        for (int var1 = 0; var1 < class294.field4892; var1++) {
            int var2 = class243.field3843[var1];
            class233 var3 = class329.field5377[var2];
            if (var3 != null) {
                class148.method1056(true, var3.field3702.field2220, var3);
            }
        }
        field1088++;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZLmn;I)V", line = 1453)
    public static final void method489(boolean arg0, class167 arg1, int arg2) {
        field1079++;
        int var3 = (int) arg1.field2549;
        int var4 = arg1.field2631;
        arg1.method1131(8);
        if (arg0) {
            class347.method2443(-1, var4);
        }
        class344.method2426(var4, false);
        class264 var5 = class94.method629(5386, var3);
        if (var5 != null) {
            class218.method1472((byte) 102, var5);
        }
        if (arg2 < 57) {
            return;
        }
        int var6 = class117.field1701;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class165.method1149(class300.field4949[var7], true)) {
                class39.method311((byte) -65, var7);
            }
        }
        if (class117.field1701 == 1) {
            class286.field4681 = false;
            class279.method1986(class2.field7, class265.field4362, class53.field800, class235.field3732, 27960);
        } else {
            class279.method1986(class2.field7, class265.field4362, class53.field800, class235.field3732, 27960);
            int var8 = class31.field471.method1216(class242.field3821);
            for (int var9 = 0; var9 < class117.field1701; var9++) {
                int var10 = class31.field471.method1216(client.method895(var9, 27003));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class235.field3732 = var8 + 8;
            class265.field4362 = (class98.field1408 ? 26 : 22) + class117.field1701 * 15;
        }
        if (class345.field5538 != -1) {
            class160.method1134(1, (byte) -70, class345.field5538);
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)V", line = 1524)
    public final void method57(int arg0) {
        field1091++;
        this.field1083 >>= arg0;
        this.field1076 = this.field1084;
        if (this.field1083 < 0) {
            this.field1083 = 0;
        } else if (this.field1083 > 255) {
            this.field1083 = 255;
        }
        this.method487(this.field1092++, (byte) this.field1083);
        this.field1083 = 0;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V", line = 1544)
    public final void method52(int arg0) {
        field1085++;
        this.field1092 = 0;
        if (arg0 <= 54) {
            this.field1082 = -115;
        }
        this.field1083 = 0;
    }
}
