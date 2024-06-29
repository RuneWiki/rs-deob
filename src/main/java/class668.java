import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class668 extends class599 {

    @OriginalMember(owner = "client!ph", name = "B", descriptor = "I")
    private int field9393;

    @OriginalMember(owner = "client!ph", name = "G", descriptor = "I")
    public static int field9397 = 0;

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "I")
    public static int field9392;

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "I")
    public static int field9394;

    @OriginalMember(owner = "client!ph", name = "F", descriptor = "I")
    public static int field9396;

    @OriginalMember(owner = "client!ph", name = "H", descriptor = "I")
    public static int field9398;

    @OriginalMember(owner = "client!ph", name = "I", descriptor = "J")
    public static long field9399;

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "[I")
    public static int[] field9395;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)V", line = 6)
    public static void method3795(byte arg0) {
        field9395 = null;
        int var1 = -72 % ((arg0 - 38) / 60);
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lkv;II[BI)V", line = 17)
    public class668(class280 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field9393 = arg2;
        super.field8449.method1840(this, 2205);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field8452, 0, super.field8444, this.field9393, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method3468(0, true);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V", line = 30)
    public final void method1255(byte arg0) {
        ++field9394;
        int var2 = 71 / ((arg0 - -34) / 63);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZI)V", line = 42)
    public final void method3796(boolean arg0, int arg1) {
        ++field9396;
        super.field8449.method1840(this, 2205);
        if (arg1 != 10497) {
            method3797(89, (class101) null);
        }
        OpenGL.glTexParameteri(super.field8452, 10242, arg0 ? 10497 : 33071);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILdba;)V", line = 61)
    public static final void method3797(int arg0, class101 arg1) {
        ++field9398;
        if (arg0 != 0) {
            method3795((byte) 4);
        }
        if (class549.field7748 == arg1) {
            class26.field371.method842(2384);
            int var2 = class26.field371.method842(2384);
            int var3 = (var2 >> 4 & 7) + class578.field8178;
            int var4 = (var2 & 7) + class633.field8935;
            int var5 = class26.field371.method898((byte) -113);
            int var6 = class26.field371.method842(2384);
            int var7 = class26.field371.method833(-3);
            String var8 = class26.field371.method861(true);
            class546.method3180(var7, var6, var3, class469.field6702, (byte) 102, var4, var8, var5);
        } else if (class174.field2462 == arg1) {
            int var9 = class26.field371.method846(arg0 ^ 15319);
            int var10 = ((var9 & 120) >> 4) + class578.field8178;
            int var11 = class633.field8935 - -(7 & var9);
            int var12 = class26.field371.method855(0);
            int var13 = var12 >> 2;
            int var14 = var12 & 3;
            int var15 = class428.field6018[var13];
            int var16 = class26.field371.method862(arg0 ^ -25118);
            if (class183.method1365(class64.field867, 116) || var10 >= 0 && ~var11 <= -1 && ~class109.field1314 < ~var10 && class760.field10479 > var11) {
                class23.method170(var10, var16, var14, class469.field6702, var15, (byte) -82, var11, var13);
            }
        } else if (class710.field9999 == arg1) {
            int var17 = class26.field371.method883((byte) 107);
            if (var17 == 65535) {
                var17 = -1;
            }
            int var18 = class26.field371.method867(true);
            int var19 = var18 >> 2;
            int var20 = var18 & 3;
            int var21 = class428.field6018[var19];
            int var22 = class26.field371.method846(15319);
            int var23 = class578.field8178 - -(7 & var22 >> 4);
            int var24 = (7 & var22) + class633.field8935;
            class563.method3270(var24, var20, var17, var23, -82, var21, class469.field6702, var19);
        } else if (class586.field8292 == arg1) {
            int var25 = class26.field371.method898((byte) -84);
            int var26 = class26.field371.method842(arg0 ^ 2384);
            class496.field7061.method319(arg0 + -127, var25).method2101(125, var26);
        } else if (class328.field4893 == arg1) {
            int var27 = class26.field371.method842(arg0 ^ 2384);
            int var28 = ((var27 & 126) >> 4) + class578.field8178;
            int var29 = (var27 & 7) + class633.field8935;
            int var30 = class26.field371.method898((byte) -82);
            if (~var30 == -65536) {
                var30 = -1;
            }
            int var31 = class26.field371.method842(2384);
            int var32 = (var31 & 254) >> 4;
            int var33 = var31 & 7;
            int var34 = class26.field371.method842(2384);
            int var35 = class26.field371.method842(2384);
            int var36 = class26.field371.method898((byte) -113);
            if (var28 >= 0 && ~var29 <= -1 && ~class109.field1314 < ~var28 && class760.field10479 > var29) {
                int var37 = var32 - -1;
                if (~class251.field3549.field6448[0] <= ~(-var37 + var28) && ~(var28 + var37) <= ~class251.field3549.field6448[0] && -var37 + var29 <= class251.field3549.field6445[0] && class251.field3549.field6445[0] <= var29 + var37) {
                    class276.method1790(var36, var30, (byte) -94, var34, (var29 << 8) + ((class469.field6702 << 24) - -(var28 << 16)) + var32, var33, var35);
                }
            }
        } else if (class703.field9908 == arg1) {
            int var38 = class26.field371.method846(15319);
            int var39 = (var38 & 7) + class633.field8935;
            int var40 = class175.field2496 + var39;
            int var41 = class578.field8178 - -(var38 >> 4 & 7);
            int var42 = class103.field1295 + var41;
            int var43 = class26.field371.method837(arg0 ^ 29806);
            class541 var44 = (class541) class70.field959.method380((byte) -3, (long) (var42 | class469.field6702 << 28 | var40 << 14));
            if (var44 != null) {
                for (class6 var45 = (class6) var44.field7586.method2508((byte) 108); var45 != null; var45 = (class6) var44.field7586.method2505((byte) -55)) {
                    if (~(32767 & var43) == ~var45.field62) {
                        var45.method3117((byte) -91);
                        break;
                    }
                }
                if (var44.field7586.method2513((byte) 88)) {
                    var44.method3117((byte) 97);
                }
                if (~var41 <= -1 && var39 >= 0 && ~var41 > ~class109.field1314 && var39 < class760.field10479) {
                    class48.method312(var41, var39, true, class469.field6702);
                }
            }
        } else if (class701.field9893 == arg1) {
            int var46 = class26.field371.method842(arg0 + 2384);
            int var47 = ((var46 & 252) >> 4) + class578.field8178 * 2;
            int var48 = (15 & var46) + class633.field8935 * 2;
            int var49 = class26.field371.method842(2384);
            boolean var50 = (1 & var49) != 0;
            boolean var51 = (var49 & 2) != 0;
            int var52 = var51 ? var49 >> 2 : -1;
            int var53 = var47 - -class26.field371.method877(-252);
            int var54 = var48 + class26.field371.method877(-252);
            int var55 = class26.field371.method838(true);
            int var56 = class26.field371.method838(true);
            int var57 = class26.field371.method898((byte) -122);
            int var58 = class26.field371.method842(2384);
            int var59;
            if (var51) {
                var59 = (byte) var58;
            } else {
                var59 = var58 * 4;
            }
            int var60 = 4 * class26.field371.method842(2384);
            int var61 = class26.field371.method898((byte) -125);
            int var62 = class26.field371.method898((byte) -120);
            int var63 = class26.field371.method842(arg0 ^ 2384);
            if (var63 == 255) {
                var63 = -1;
            }
            int var64 = class26.field371.method898((byte) -81);
            if (~var47 <= -1 && ~var48 <= -1 && class109.field1314 * 2 > var47 && ~(class109.field1314 * 2) < ~var48 && ~var53 <= -1 && ~var54 <= -1 && var53 < class760.field10479 * 2 && ~(class760.field10479 * 2) < ~var54 && ~var57 != -65536) {
                int var65 = var53 * 256;
                int var66 = var48 * 256;
                int var67 = var54 * 256;
                int var68 = var60 << 2;
                int var69 = var64 << 2;
                int var70 = var59 << 2;
                int var71 = var47 * 256;
                if (var55 != 0 && ~var52 != 0) {
                    class449 var72 = null;
                    if (~var55 <= -1) {
                        int var73 = var55 + -1;
                        class14 var74 = (class14) class543.field7606.method380((byte) -3, (long) var73);
                        if (var74 != null) {
                            var72 = var74.field262;
                        }
                    } else {
                        int var75 = -var55 + -1;
                        if (class223.field3199 != var75) {
                            var72 = class581.field8250[var75];
                        } else {
                            var72 = class251.field3549;
                        }
                    }
                    if (var72 != null) {
                        class607 var76 = var72.method2708(arg0 ^ 121);
                        if (var76.field8572 != null && var76.field8572[var52] != null) {
                            var70 -= var76.field8572[var52][1];
                        }
                        if (var76.field8540 != null && var76.field8540[var52] != null) {
                            var70 -= var76.field8540[var52][1];
                        }
                    }
                }
                class36 var77 = new class36(var57, class469.field6702, class469.field6702, var71, var66, var70, class673.field9441 + var61, class673.field9441 + var62, var63, var69, var55, var56, var68, var50, var52);
                var77.method256(var65, var61 - -class673.field9441, false, var67, class580.method3366(class469.field6702, (byte) -95, var67, var65) - var68);
                class399.field5668.method2510(new class768(var77), false);
            }
        } else if (class456.field6541 == arg1) {
            int var78 = class26.field371.method855(0);
            int var79 = var78 >> 2;
            int var80 = 3 & var78;
            int var81 = class428.field6018[var79];
            int var82 = class26.field371.method855(0);
            int var83 = (var82 >> 4 & 7) + class578.field8178;
            int var84 = class633.field8935 - -(7 & var82);
            if (class183.method1365(class64.field867, arg0 ^ 97) || var83 >= 0 && var84 >= 0 && ~class109.field1314 < ~var83 && ~class760.field10479 < ~var84) {
                class23.method170(var83, -1, var80, class469.field6702, var81, (byte) 43, var84, var79);
            }
        } else if (class577.field8158 == arg1) {
            int var85 = class26.field371.method842(2384);
            int var86 = (7 & var85 >> 4) + class578.field8178;
            int var87 = (7 & var85) + class633.field8935;
            int var88 = class26.field371.method898((byte) -117);
            if (~var88 == -65536) {
                var88 = -1;
            }
            int var89 = class26.field371.method842(2384);
            int var90 = 15 & var89 >> 4;
            int var91 = 7 & var89;
            int var92 = class26.field371.method842(2384);
            int var93 = class26.field371.method842(2384);
            int var94 = class26.field371.method898((byte) -114);
            if (~var86 <= -1 && ~var87 <= -1 && ~var86 > ~class109.field1314 && ~var87 > ~class760.field10479) {
                int var95 = var90 + 1;
                if (-var95 + var86 <= class251.field3549.field6448[0] && class251.field3549.field6448[0] <= var86 + var95 && ~class251.field3549.field6445[0] <= ~(-var95 + var87) && var87 + var95 >= class251.field3549.field6445[0]) {
                    class585.method3393(arg0 + 80, false, var93, var91, (var87 << 8) + (class469.field6702 << 24) + (var86 << 16) + var90, var88, var92, var94);
                }
            }
        } else if (class390.field5547 == arg1) {
            int var96 = class26.field371.method837(29806);
            int var97 = class26.field371.method837(29806);
            int var98 = class26.field371.method867(true);
            int var99 = (7 & var98) + class633.field8935;
            int var100 = class175.field2496 - -var99;
            int var101 = (var98 >> 4 & 7) + class578.field8178;
            int var102 = class103.field1295 + var101;
            boolean var103 = ~var101 <= -1 && var99 >= 0 && ~class109.field1314 < ~var101 && var99 < class760.field10479;
            if (var103 || class183.method1365(class64.field867, -92)) {
                class411.method2471((byte) -35, var102, var100, class469.field6702, new class6(var96, var97));
                if (var103) {
                    class48.method312(var101, var99, true, class469.field6702);
                }
            }
        } else if (class262.field3708 == arg1) {
            int var104 = class26.field371.method842(2384);
            boolean var105 = ~(var104 & 128) != -1;
            int var106 = (7 & var104 >> 3) + class578.field8178;
            int var107 = (var104 & 7) + class633.field8935;
            int var108 = var106 - -class26.field371.method877(-252);
            int var109 = var107 + class26.field371.method877(-252);
            int var110 = class26.field371.method838(true);
            int var111 = class26.field371.method898((byte) -79);
            int var112 = class26.field371.method842(2384) * 4;
            int var113 = class26.field371.method842(2384) * 4;
            int var114 = class26.field371.method898((byte) -101);
            int var115 = class26.field371.method898((byte) -121);
            int var116 = class26.field371.method842(2384);
            if (var116 == 255) {
                var116 = -1;
            }
            int var117 = class26.field371.method898((byte) -97);
            if (~var106 <= -1 && var107 >= 0 && class109.field1314 > var106 && ~var107 > ~class760.field10479 && ~var108 <= -1 && ~var109 <= -1 && ~class109.field1314 < ~var108 && ~var109 > ~class760.field10479 && var111 != 65535) {
                int var118 = var113 << 2;
                int var119 = var109 * 512 + 256;
                int var120 = var117 << 2;
                int var121 = var108 * 512 + 256;
                int var122 = var106 * 512 + 256;
                int var123 = var112 << 2;
                int var124 = var107 * 512 + 256;
                class36 var125 = new class36(var111, class469.field6702, class469.field6702, var122, var124, var123, class673.field9441 + var114, var115 - -class673.field9441, var116, var120, 0, var110, var118, var105, -1);
                var125.method256(var121, class673.field9441 + var114, false, var119, -var118 + class580.method3366(class469.field6702, (byte) -95, var119, var121));
                class399.field5668.method2510(new class768(var125), false);
            }
        } else if (class527.field7497 == arg1) {
            int var126 = class26.field371.method842(2384);
            int var127 = ((116 & var126) >> 4) + class578.field8178;
            int var128 = (var126 & 7) + class633.field8935;
            int var129 = class26.field371.method898((byte) -118);
            int var130 = class26.field371.method842(2384);
            int var131 = class26.field371.method898((byte) -84);
            int var132 = class26.field371.method842(2384);
            if (~var127 <= -1 && var128 >= 0 && ~class109.field1314 < ~var127 && ~var128 > ~class760.field10479) {
                int var133 = var127 * 512 - -256;
                int var134 = var128 * 512 - -256;
                int var135 = class469.field6702;
                if (~var135 > -4 && class627.method3593(var127, (byte) 56, var128)) {
                    ++var135;
                }
                class505 var136 = new class505(var129, var131, class673.field9441, class469.field6702, var135, var133, class580.method3366(class469.field6702, (byte) -95, var134, var133) + -var130, var134, var127, var127, var128, var128, var132);
                class299.field4496.method2510(new class33(var136), false);
            }
        } else if (class768.field10603 == arg1) {
            int var137 = class26.field371.method842(2384);
            int var138 = (7 & var137) + class633.field8935;
            int var139 = class175.field2496 + var138;
            int var140 = (var137 >> 4 & 7) + class578.field8178;
            int var141 = class103.field1295 + var140;
            int var142 = class26.field371.method898((byte) -128);
            int var143 = class26.field371.method898((byte) -119);
            int var144 = class26.field371.method898((byte) -103);
            if (class70.field959 != null) {
                class541 var145 = (class541) class70.field959.method380((byte) -3, (long) (var141 | class469.field6702 << 28 | var139 << 14));
                if (var145 != null) {
                    for (class6 var146 = (class6) var145.field7586.method2508((byte) 126); var146 != null; var146 = (class6) var145.field7586.method2505((byte) -55)) {
                        if (~(32767 & var142) == ~var146.field62 && ~var146.field64 == ~var143) {
                            var146.method3117((byte) -114);
                            var146.field64 = var144;
                            class411.method2471((byte) -35, var141, var139, class469.field6702, var146);
                            break;
                        }
                    }
                    if (var140 >= 0 && ~var138 <= -1 && var140 < class109.field1314 && var138 < class760.field10479) {
                        class48.method312(var140, var138, true, class469.field6702);
                    }
                }
            }
        } else if (class633.field8934 == arg1) {
            int var147 = class26.field371.method862(arg0 + -25118);
            class322 var148 = class496.field7061.method319(-123, var147);
            int var149 = class26.field371.method867(true);
            int var150 = (7 & var149 >> 4) + class578.field8178;
            int var151 = (var149 & 7) + class633.field8935;
            int var152 = class26.field371.method855(arg0);
            int var153 = var152 >> 2;
            int var154 = class428.field6018[var153];
            if (~var153 == -12) {
                var153 = 10;
            }
            int var155 = class26.field371.method842(2384);
            int var156 = 0;
            if (var148.field4841 != null) {
                int var157 = -1;
                for (int var158 = 0; ~var158 > ~var148.field4841.length; ++var158) {
                    if (~var148.field4841[var158] == ~var153) {
                        var157 = var158;
                        break;
                    }
                }
                var156 = var148.field4768[var157].length;
            }
            int var159 = 0;
            if (var148.field4789 != null) {
                var159 = var148.field4789.length;
            }
            int var160 = 0;
            if (var148.field4787 != null) {
                var160 = var148.field4787.length;
            }
            if ((var155 & 1) == 1) {
                class277.method1795((class521) null, class469.field6702, var154, var151, var150, true);
            } else {
                int[] var161 = null;
                if ((2 & var155) == 2) {
                    var161 = new int[var156];
                    for (int var162 = 0; var162 < var156; ++var162) {
                        var161[var162] = class26.field371.method898((byte) -78);
                    }
                }
                short[] var163 = null;
                if (~(4 & var155) == -5) {
                    var163 = new short[var159];
                    for (int var164 = 0; var164 < var159; ++var164) {
                        var163[var164] = (short) class26.field371.method898((byte) -104);
                    }
                }
                short[] var165 = null;
                if ((8 & var155) == 8) {
                    var165 = new short[var160];
                    for (int var166 = 0; ~var160 < ~var166; ++var166) {
                        var165[var166] = (short) class26.field371.method898((byte) -98);
                    }
                }
                class277.method1795(new class521((long) (class477.field6783++), var161, var163, var165), class469.field6702, var154, var151, var150, true);
            }
        } else if (class155.field2300 != arg1) {
            class329.method2129("T3 - " + arg1, false, (Throwable) null);
            class599.method3460(true, false);
        } else {
            int var167 = class26.field371.method842(arg0 + 2384);
            int var168 = (7 & var167) + class633.field8935;
            int var169 = class175.field2496 + var168;
            int var170 = ((var167 & 123) >> 4) + class578.field8178;
            int var171 = class103.field1295 + var170;
            int var172 = class26.field371.method883((byte) 99);
            int var173 = class26.field371.method898((byte) -121);
            int var174 = class26.field371.method837(29806);
            if (class223.field3199 != var173) {
                boolean var175 = var170 >= 0 && var168 >= 0 && class109.field1314 > var170 && class760.field10479 > var168;
                if (var175 || class183.method1365(class64.field867, arg0 ^ -117)) {
                    class411.method2471((byte) -35, var171, var169, class469.field6702, new class6(var172, var174));
                    if (var175) {
                        class48.method312(var170, var168, true, class469.field6702);
                    }
                }
            }
        }
    }
}
