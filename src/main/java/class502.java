import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class502 extends class82 {

    @OriginalMember(owner = "client!vi", name = "K", descriptor = "I")
    private int field7134 = 0;

    @OriginalMember(owner = "client!vi", name = "N", descriptor = "Z")
    private boolean field7137 = false;

    @OriginalMember(owner = "client!vi", name = "L", descriptor = "I")
    public int field7135 = -1;

    @OriginalMember(owner = "client!vi", name = "Z", descriptor = "I")
    public int field7149 = -1;

    @OriginalMember(owner = "client!vi", name = "M", descriptor = "I")
    private int field7136 = 0;

    @OriginalMember(owner = "client!vi", name = "U", descriptor = "Lkj;")
    public static class527 field7144 = new class527(10, 17);

    @OriginalMember(owner = "client!vi", name = "I", descriptor = "I")
    public static int field7132;

    @OriginalMember(owner = "client!vi", name = "J", descriptor = "I")
    public static int field7133;

    @OriginalMember(owner = "client!vi", name = "O", descriptor = "I")
    public static int field7138;

    @OriginalMember(owner = "client!vi", name = "P", descriptor = "I")
    public int field7139;

    @OriginalMember(owner = "client!vi", name = "Q", descriptor = "I")
    public int field7140;

    @OriginalMember(owner = "client!vi", name = "R", descriptor = "I")
    public static int field7141;

    @OriginalMember(owner = "client!vi", name = "S", descriptor = "I")
    public static int field7142;

    @OriginalMember(owner = "client!vi", name = "T", descriptor = "I")
    public static int field7143;

    @OriginalMember(owner = "client!vi", name = "V", descriptor = "I")
    public static int field7145;

    @OriginalMember(owner = "client!vi", name = "W", descriptor = "I")
    public int field7146;

    @OriginalMember(owner = "client!vi", name = "X", descriptor = "I")
    public static int field7147;

    @OriginalMember(owner = "client!vi", name = "Y", descriptor = "I")
    public static int field7148;

    @OriginalMember(owner = "client!vi", name = "ab", descriptor = "I")
    public int field7150;

    @OriginalMember(owner = "client!vi", name = "bb", descriptor = "I")
    public static int field7151;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(ILr;)Lfe;")
    public final class531 method449(int arg0, class167 arg1) {
        ++field7141;
        class636 var3 = class432.method2628(super.field9814, super.field9806 >> class30.field940, super.field9815 >> class30.field940);
        if (var3 != null && var3.field9172.field2224) {
            int var4 = var3.field9172.method530(-40);
            if (this.field7136 != var4) {
                super.field9809 -= this.field7136;
                this.field7136 = var4;
                super.field9809 += var4;
            }
        }
        class396 var5 = arg1.method53();
        var5.method895();
        if (var3 == null || !var3.field9172.field2224) {
            boolean var6 = false;
            boolean var7 = false;
            boolean var8 = false;
            class37 var9 = class485.field6947[super.field9804];
            int var10 = this.field7134 << 1;
            int var12 = -var10 / 2;
            int var13 = -var10 / 2;
            int var14 = var9.method552(arg0 + -92159999, super.field9806 + var12, super.field9815 + var13);
            int var15 = var10 / 2;
            int var16 = -var10 / 2;
            int var17 = var9.method552(1, super.field9806 + var15, super.field9815 + var16);
            int var18 = -var10 / 2;
            int var19 = var10 / 2;
            int var20 = var9.method552(1, super.field9806 - -var18, super.field9815 + var19);
            int var21 = var10 / 2;
            int var22 = var10 / 2;
            int var23 = var9.method552(arg0 + -92159999, super.field9806 - -var21, super.field9815 + var22);
            int var24 = ~var14 <= ~var17 ? var17 : var14;
            int var25 = var23 <= var20 ? var23 : var20;
            int var26 = var17 >= var23 ? var23 : var17;
            int var27 = ~var14 > ~var20 ? var14 : var20;
            if (~var10 != -1) {
                int var28 = 16383 & (int) (Math.atan2((double) (-var25 + var24), (double) var10) * 2607.5945876176133D);
                if (~var28 != -1) {
                    var5.method894(var28);
                }
            }
            int var29 = var14 - -var23;
            if (~var10 != -1) {
                int var30 = (int) (Math.atan2((double) (-var26 + var27), (double) var10) * 2607.5945876176133D) & 16383;
                if (~var30 != -1) {
                    var5.method897(-var30);
                }
            }
            if (var29 > var17 + var20) {
                var29 = var17 + var20;
            }
            int var31 = (var29 >> 1) + -super.field9809;
            if (~var31 != -1) {
                var5.method891(0, var31, 0);
            }
        }
        var5.method891(super.field9806, super.field9809 - 10, super.field9815);
        class531 var32 = class370.method2347(3, (byte) -121);
        this.field7137 = false;
        this.field7134 = 0;
        if (~this.field7135 != 0) {
            class55 var33 = class268.field3985.method258(this.field7135, (byte) -67).method997((class138) null, 2048, -1, 0, arg1, true, 0, this.field7146, (class168) null);
            if (var33 != null) {
                if (class7.field521) {
                    var33.method317(var5, var32.field7451[2], class477.field6857, 0);
                } else {
                    var33.method334(var5, var32.field7451[2], 0);
                }
                this.field7137 |= var33.method363();
                this.field7134 = var33.method368();
            }
        }
        if (~this.field7149 != 0) {
            class55 var34 = class268.field3985.method258(this.field7149, (byte) -67).method997((class138) null, 2048, -1, 0, arg1, true, 0, this.field7139, (class168) null);
            if (var34 != null) {
                if (class7.field521) {
                    var34.method317(var5, var32.field7451[1], class477.field6857, 0);
                } else {
                    var34.method334(var5, var32.field7451[1], 0);
                }
                this.field7137 |= var34.method363();
                if (var34.method368() > this.field7134) {
                    this.field7134 = var34.method368();
                }
            }
        }
        if (arg0 != 92160000) {
            this.method463(true, (class167) null);
        }
        class55 var35 = class268.field3985.method258(this.field7150, (byte) -67).method997((class138) null, 2048, -1, 0, arg1, true, 0, this.field7140, (class168) null);
        if (var35 != null) {
            if (class7.field521) {
                var35.method317(var5, var32.field7451[0], class477.field6857, 0);
            } else {
                var35.method334(var5, var32.field7451[0], 0);
            }
            this.field7137 |= var35.method363();
            if (~var35.method368() < ~this.field7134) {
                this.field7134 = var35.method368();
            }
        }
        return var32;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lkj;I)V")
    public static final void method2992(class527 arg0, int arg1) {
        ++field7133;
        if (class103.field1837 == arg0) {
            int var2 = class126.field2299.method732(-559537960);
            int var3 = var2 >> 2;
            int var4 = var2 & 3;
            int var5 = class572.field8312[var3];
            int var6 = class126.field2299.method734((byte) -23);
            int var7 = (var6 >> 4 & 7) + class639.field9195;
            int var8 = (var6 & 7) + class362.field5376;
            if (class485.method2925((byte) -128, class470.field6673) || ~var7 <= -1 && ~var8 <= -1 && ~class675.field9604 < ~var7 && class218.field3316 > var8) {
                class633.method3609(var8, var7, class326.field4777, 0, 101, -1, -1, var5, var3, var4);
            }
        } else if (class5.field475 == arg0) {
            int var9 = class126.field2299.method732(-559537960);
            int var10 = ((var9 & 127) >> 4) + class639.field9195;
            int var11 = (7 & var9) + class362.field5376;
            int var12 = class126.field2299.method723((byte) -25);
            int var13 = class126.field2299.method732(-559537960);
            int var14 = class126.field2299.method723((byte) -25);
            int var15 = class126.field2299.method732(-559537960);
            if (var10 >= 0 && ~var11 <= -1 && var10 < class675.field9604 && class218.field3316 > var11) {
                int var16 = var10 * 512 + 256;
                int var17 = var11 * 512 + 256;
                int var18 = class326.field4777;
                if (var18 < 3 && class89.method868(5125, var10, var11)) {
                    ++var18;
                }
                class515 var19 = new class515(var12, var14, class336.field5031, class326.field4777, var18, var16, class460.method2757(0, var17, class326.field4777, var16) + -var13, var17, var10, var10, var11, var11, var15);
                class140.field2467.method1229(new class434(var19), (byte) 120);
            }
        } else if (class373.field5550 == arg0) {
            int var20 = class126.field2299.method724(122);
            int var21 = (7 & var20 >> 4) + class639.field9195;
            int var22 = class362.field5376 - -(var20 & 7);
            int var23 = class126.field2299.method753(true);
            int var24 = class126.field2299.method724(58);
            int var25 = var24 >> 2;
            int var26 = 3 & var24;
            int var27 = class572.field8312[var25];
            if (class485.method2925((byte) -127, class470.field6673) || var21 >= 0 && var22 >= 0 && class675.field9604 > var21 && ~class218.field3316 < ~var22) {
                class633.method3609(var22, var21, class326.field4777, 0, 117, -1, var23, var27, var25, var26);
            }
        } else if (class35.field1006 == arg0) {
            int var28 = class126.field2299.method729((byte) -34);
            int var29 = class126.field2299.method724(80);
            int var30 = (7 & var29) + class362.field5376;
            int var31 = var30 - -class323.field4749;
            int var32 = (7 & var29 >> 4) + class639.field9195;
            int var33 = class33.field967 + var32;
            class38 var34 = (class38) class409.field5924.method2596((long) (var33 | var31 << 14 | class326.field4777 << 28), 94);
            if (var34 != null) {
                for (class315 var35 = (class315) var34.field1053.method1224(-2); var35 != null; var35 = (class315) var34.field1053.method1232(-2)) {
                    if (~(32767 & var28) == ~var35.field4652) {
                        var35.method2588(300);
                        break;
                    }
                }
                if (var34.field1053.method1223(-2)) {
                    var34.method2588(300);
                }
                if (~var32 <= -1 && ~var30 <= -1 && ~var32 > ~class675.field9604 && class218.field3316 > var30) {
                    class631.method3606(var30, (byte) 0, var32, class326.field4777);
                }
            }
        } else if (class305.field4520 == arg0) {
            int var36 = class126.field2299.method732(-559537960);
            int var37 = ((114 & var36) >> 4) + class639.field9195;
            int var38 = (var36 & 7) + class362.field5376;
            int var39 = class126.field2299.method723((byte) -25);
            if (~var39 == -65536) {
                var39 = -1;
            }
            int var40 = class126.field2299.method732(-559537960);
            int var41 = (249 & var40) >> 4;
            int var42 = var40 & 7;
            int var43 = class126.field2299.method732(-559537960);
            int var44 = class126.field2299.method732(-559537960);
            if (~var37 <= -1 && ~var38 <= -1 && ~class675.field9604 < ~var37 && class218.field3316 > var38) {
                int var45 = var41 - -1;
                if (var37 - var45 <= class532.field7456.field8787[0] && ~(var37 + var45) <= ~class532.field7456.field8787[0] && class532.field7456.field8785[0] >= -var45 + var38 && var38 + var45 >= class532.field7456.field8785[0]) {
                    class110.method987(false, var42, var44, var43, var39, (var38 << 8) + (class326.field4777 << 24) + ((var37 << 16) - -var41), (byte) 2);
                }
            }
        } else if (class43.field1089 == arg0) {
            int var46 = class126.field2299.method753(true);
            int var47 = class126.field2299.method734((byte) -23);
            int var48 = class362.field5376 - -(7 & var47);
            int var49 = class323.field4749 - -var48;
            int var50 = (7 & var47 >> 4) + class639.field9195;
            int var51 = class33.field967 - -var50;
            int var52 = class126.field2299.method731(26585);
            boolean var53 = var50 >= 0 && var48 >= 0 && ~var50 > ~class675.field9604 && ~var48 > ~class218.field3316;
            if (var53 || class485.method2925((byte) -127, class470.field6673)) {
                class221.method1526(var49, (byte) 55, class326.field4777, new class315(var52, var46), var51);
                if (var53) {
                    class631.method3606(var48, (byte) 0, var50, class326.field4777);
                }
            }
        } else if (class393.field5753 == arg0) {
            int var54 = class126.field2299.method729((byte) -94);
            int var55 = class126.field2299.method731(26585);
            int var56 = class126.field2299.method723((byte) -25);
            int var57 = class126.field2299.method724(109);
            int var58 = (7 & var57) + class362.field5376;
            int var59 = class323.field4749 + var58;
            int var60 = class639.field9195 - -((var57 & 118) >> 4);
            int var61 = var60 - -class33.field967;
            if (~class422.field6096 != ~var56) {
                boolean var62 = var60 >= 0 && var58 >= 0 && class675.field9604 > var60 && ~var58 > ~class218.field3316;
                if (var62 || class485.method2925((byte) -127, class470.field6673)) {
                    class221.method1526(var59, (byte) 121, class326.field4777, new class315(var54, var55), var61);
                    if (var62) {
                        class631.method3606(var58, (byte) 0, var60, class326.field4777);
                    }
                }
            }
        } else if (arg1 > 3) {
            if (class666.field9548 == arg0) {
                int var63 = class126.field2299.method723((byte) -25);
                int var64 = class126.field2299.method732(-559537960);
                class237.field3521.method3515(var63, 50).method661(var64, 0);
            } else if (class532.field7457 != arg0) {
                if (class5.field482 == arg0) {
                    int var75 = class126.field2299.method732(-559537960);
                    int var76 = (var75 >> 4 & 15) + class639.field9195 * 2;
                    int var77 = (15 & var75) + class362.field5376 * 2;
                    int var78 = class126.field2299.method732(-559537960);
                    boolean var79 = ~(var78 & 1) != -1;
                    int var80 = var78 >> 1;
                    int var81 = class126.field2299.method710((byte) 43) + var76;
                    int var82 = var77 - -class126.field2299.method710((byte) 43);
                    int var83 = class126.field2299.method721(-461515024);
                    int var84 = class126.field2299.method721(-461515024);
                    int var85 = class126.field2299.method723((byte) -25);
                    byte var86 = class126.field2299.method710((byte) 43);
                    int var87 = class126.field2299.method732(-559537960) * 4;
                    int var88 = class126.field2299.method723((byte) -25);
                    int var89 = class126.field2299.method723((byte) -25);
                    int var90 = class126.field2299.method732(-559537960);
                    if (var90 == 255) {
                        var90 = -1;
                    }
                    int var91 = class126.field2299.method723((byte) -25);
                    if (~var76 <= -1 && var77 >= 0 && class675.field9604 * 2 > var76 && ~(class675.field9604 * 2) < ~var77 && var81 >= 0 && var82 >= 0 && ~var81 > ~(class218.field3316 * 2) && var82 < class218.field3316 * 2 && ~var85 != -65536) {
                        int var92 = var81 * 256;
                        int var93 = var77 * 256;
                        int var94 = var82 * 256;
                        int var95 = var76 * 256;
                        int var96 = var91 << 2;
                        int var97 = var86 << 2;
                        int var98 = var87 << 2;
                        if (var83 != 0) {
                            class604 var99 = null;
                            if (var83 >= 0) {
                                int var100 = var83 + -1;
                                class436 var101 = (class436) class208.field3179.method2596((long) var100, 101);
                                if (var101 != null) {
                                    var99 = var101.field6298;
                                }
                            } else {
                                int var102 = -var83 - 1;
                                if (~class422.field6096 == ~var102) {
                                    var99 = class532.field7456;
                                } else {
                                    var99 = class59.field1341[var102];
                                }
                            }
                            if (var99 != null) {
                                class658 var103 = var99.method3465(0);
                                if (var103.field9460 != null && var103.field9460[var80] != null) {
                                    int var104 = var103.field9460[var80][0];
                                    int var105 = var103.field9460[var80][2];
                                    int var106 = var99.field8737.method2434(128);
                                    int var107 = class509.field7210[var106];
                                    int var108 = class509.field7220[var106];
                                    int var109 = var105 * var107 - -(var104 * var108) >> 14;
                                    int var110 = var105 * var108 + -(var104 * var107) >> 14;
                                    var97 -= var103.field9460[var80][1];
                                    var93 += var110;
                                    var95 += var109;
                                }
                            }
                        }
                        class35 var112 = new class35(var85, class326.field4777, class326.field4777, var95, var93, var97, class336.field5031 + var88, var89 - -class336.field5031, var90, var96, var84, var98, var79);
                        var112.method520(-49, -var98 + class460.method2757(0, var94, class326.field4777, var92), class336.field5031 + var88, var92, var94);
                        class408.field5908.method1229(new class251(var112), (byte) 120);
                    }
                } else if (field7144 == arg0) {
                    int var113 = class126.field2299.method732(-559537960);
                    int var114 = (var113 >> 4 & 15) + class639.field9195 * 2;
                    int var115 = (var113 & 15) + class362.field5376 * 2;
                    boolean var116 = ~class126.field2299.method732(-559537960) != -1;
                    int var117 = class126.field2299.method710((byte) 43) + var114;
                    int var118 = var115 - -class126.field2299.method710((byte) 43);
                    int var119 = class126.field2299.method721(-461515024);
                    int var120 = class126.field2299.method723((byte) -25);
                    int var121 = 4 * class126.field2299.method732(-559537960);
                    int var122 = class126.field2299.method732(-559537960) * 4;
                    int var123 = class126.field2299.method723((byte) -25);
                    int var124 = class126.field2299.method723((byte) -25);
                    int var125 = class126.field2299.method732(-559537960);
                    int var126 = class126.field2299.method723((byte) -25);
                    if (var125 == 255) {
                        var125 = -1;
                    }
                    if (~var114 <= -1 && var115 >= 0 && var114 < class675.field9604 * 2 && ~(class675.field9604 * 2) < ~var115 && ~var117 <= -1 && var118 >= 0 && ~(class218.field3316 * 2) < ~var117 && ~var118 > ~(class218.field3316 * 2) && ~var120 != -65536) {
                        int var127 = var126 << 2;
                        int var128 = var122 << 2;
                        int var129 = var121 << 2;
                        int var130 = var118 * 256;
                        int var131 = var117 * 256;
                        int var132 = var115 * 256;
                        int var133 = var114 * 256;
                        class35 var134 = new class35(var120, class326.field4777, class326.field4777, var133, var132, var129, class336.field5031 + var123, class336.field5031 + var124, var125, var127, var119, var128, var116);
                        var134.method520(-89, class460.method2757(0, var130, class326.field4777, var131) - var128, class336.field5031 + var123, var131, var130);
                        class408.field5908.method1229(new class251(var134), (byte) 120);
                    }
                } else if (class70.field1473 == arg0) {
                    int var135 = class126.field2299.method732(-559537960);
                    boolean var136 = (128 & var135) != 0;
                    int var137 = (var135 >> 3 & 7) + class639.field9195;
                    int var138 = class362.field5376 - -(var135 & 7);
                    int var139 = class126.field2299.method710((byte) 43) + var137;
                    int var140 = class126.field2299.method710((byte) 43) + var138;
                    int var141 = class126.field2299.method721(-461515024);
                    int var142 = class126.field2299.method723((byte) -25);
                    int var143 = 4 * class126.field2299.method732(-559537960);
                    int var144 = class126.field2299.method732(-559537960) * 4;
                    int var145 = class126.field2299.method723((byte) -25);
                    int var146 = class126.field2299.method723((byte) -25);
                    int var147 = class126.field2299.method732(-559537960);
                    if (~var147 == -256) {
                        var147 = -1;
                    }
                    int var148 = class126.field2299.method723((byte) -25);
                    if (~var137 <= -1 && ~var138 <= -1 && ~var137 > ~class675.field9604 && class218.field3316 > var138 && ~var139 <= -1 && var140 >= 0 && ~class675.field9604 < ~var139 && ~class218.field3316 < ~var140 && ~var142 != -65536) {
                        int var149 = var138 * 512 + 256;
                        int var150 = var144 << 2;
                        int var151 = var140 * 512 + 256;
                        int var152 = var148 << 2;
                        int var153 = var137 * 512 - -256;
                        int var154 = var139 * 512 + 256;
                        int var155 = var143 << 2;
                        class35 var156 = new class35(var142, class326.field4777, class326.field4777, var153, var149, var155, class336.field5031 + var145, var146 - -class336.field5031, var147, var152, var141, var150, var136);
                        var156.method520(-65, -var150 + class460.method2757(0, var151, class326.field4777, var154), var145 - -class336.field5031, var154, var151);
                        class408.field5908.method1229(new class251(var156), (byte) 120);
                    }
                } else if (class519.field7341 == arg0) {
                    int var157 = class126.field2299.method729((byte) -88);
                    if (var157 == 65535) {
                        var157 = -1;
                    }
                    int var158 = class126.field2299.method724(117);
                    int var159 = var158 >> 2;
                    int var160 = 3 & var158;
                    int var161 = class572.field8312[var159];
                    int var162 = class126.field2299.method724(114);
                    int var163 = class639.field9195 - -((124 & var162) >> 4);
                    int var164 = (7 & var162) + class362.field5376;
                    class660.method3756(var161, var164, var157, var163, class326.field4777, (byte) -81, var159, var160);
                } else if (class14.field740 == arg0) {
                    int var165 = class126.field2299.method732(-559537960);
                    int var166 = ((124 & var165) >> 4) + class639.field9195;
                    int var167 = class362.field5376 - -(var165 & 7);
                    int var168 = class126.field2299.method723((byte) -25);
                    if (var168 == 65535) {
                        var168 = -1;
                    }
                    int var169 = class126.field2299.method732(-559537960);
                    int var170 = (var169 & 251) >> 4;
                    int var171 = var169 & 7;
                    int var172 = class126.field2299.method732(-559537960);
                    int var173 = class126.field2299.method732(-559537960);
                    if (~var166 <= -1 && var167 >= 0 && var166 < class675.field9604 && var167 < class218.field3316) {
                        int var174 = var170 + 1;
                        if (class532.field7456.field8787[0] >= -var174 + var166 && var166 - -var174 >= class532.field7456.field8787[0] && ~(var167 - var174) >= ~class532.field7456.field8785[0] && class532.field7456.field8785[0] <= var167 + var174) {
                            class121.method1054(var172, var168, true, var171, var173, (class326.field4777 << 24) + (var167 << 8) + var170 - -(var166 << 16));
                        }
                    }
                } else if (class11.field577 == arg0) {
                    class126.field2299.method732(-559537960);
                    int var175 = class126.field2299.method732(-559537960);
                    int var176 = ((var175 & 112) >> 4) + class639.field9195;
                    int var177 = class362.field5376 - -(7 & var175);
                    int var178 = class126.field2299.method723((byte) -25);
                    int var179 = class126.field2299.method732(-559537960);
                    int var180 = class126.field2299.method740((byte) 76);
                    String var181 = class126.field2299.method747(14598);
                    class518.method3043(class326.field4777, var178, var179, var177, var176, var180, 16, var181);
                } else {
                    class374.method2357("T3 - " + arg0, 113, (Throwable) null);
                    class85.method852(-116, false);
                }
            } else {
                int var65 = class126.field2299.method732(-559537960);
                int var66 = (7 & var65) + class362.field5376;
                int var67 = class323.field4749 + var66;
                int var68 = class639.field9195 - -(var65 >> 4 & 7);
                int var69 = class33.field967 + var68;
                int var70 = class126.field2299.method723((byte) -25);
                int var71 = class126.field2299.method723((byte) -25);
                int var72 = class126.field2299.method723((byte) -25);
                if (class409.field5924 != null) {
                    class38 var73 = (class38) class409.field5924.method2596((long) (var67 << 14 | class326.field4777 << 28 | var69), 49);
                    if (var73 != null) {
                        for (class315 var74 = (class315) var73.field1053.method1224(-2); var74 != null; var74 = (class315) var73.field1053.method1232(-2)) {
                            if ((var70 & 32767) == var74.field4652 && ~var74.field4649 == ~var71) {
                                var74.method2588(300);
                                var74.field4649 = var72;
                                class221.method1526(var67, (byte) 89, class326.field4777, var74, var69);
                                break;
                            }
                        }
                        if (~var68 <= -1 && var66 >= 0 && var68 < class675.field9604 && ~class218.field3316 < ~var66) {
                            class631.method3606(var66, (byte) 0, var68, class326.field4777);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILr;)Lbm;")
    public final class98 method450(int arg0, class167 arg1) {
        if (arg0 != -29645) {
            this.field7136 = 72;
        }
        ++field7151;
        return null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lr;BII)Z")
    public final boolean method444(class167 arg0, byte arg1, int arg2, int arg3) {
        ++field7143;
        class396 var5 = arg0.method53();
        var5.method905(super.field9806, super.field9809 + -10, super.field9815);
        class55 var6 = class268.field3985.method258(this.field7150, (byte) -67).method997((class138) null, 131072, -1, 0, arg0, true, 0, this.field7140, (class168) null);
        int var7 = -32 / ((-30 - arg1) / 36);
        if (var6 != null && (class7.field521 ? var6.method318(arg2, arg3, var5, true, class477.field6857) : var6.method358(arg2, arg3, var5, true))) {
            return true;
        } else {
            if (~this.field7149 != 0) {
                class55 var8 = class268.field3985.method258(this.field7149, (byte) -67).method997((class138) null, 131072, -1, 0, arg0, true, 0, this.field7139, (class168) null);
                if (var8 != null && (class7.field521 ? var8.method318(arg2, arg3, var5, true, class477.field6857) : var8.method358(arg2, arg3, var5, true))) {
                    return true;
                }
            }
            if (~this.field7135 != 0) {
                class55 var9 = class268.field3985.method258(this.field7135, (byte) -67).method997((class138) null, 131072, -1, 0, arg0, true, 0, this.field7146, (class168) null);
                if (var9 != null && (class7.field521 ? var9.method318(arg2, arg3, var5, true, class477.field6857) : var9.method358(arg2, arg3, var5, true))) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "(I)I")
    public final int method530(int arg0) {
        if (arg0 >= -38) {
            return 41;
        } else {
            ++field7132;
            return -10;
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(IIIII)V")
    public class502(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "(I)V")
    public static void method2993(int arg0) {
        field7144 = null;
        if (arg0 != 253646145) {
            field7144 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "(I)Z")
    public final boolean method524(int arg0) {
        int var2 = 111 % ((-36 - arg0) / 53);
        ++field7145;
        return this.field7137;
    }

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "(B)Z")
    public final boolean method522(byte arg0) {
        if (arg0 != -36) {
            return true;
        } else {
            ++field7148;
            return false;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)I")
    public static final int method2994(int arg0, int arg1) {
        ++field7142;
        if (~arg1 != -6408 && ~arg1 != -34844 && arg1 != 34837) {
            if (~arg1 != -6409 && ~arg1 != -34843 && arg1 != 34836) {
                if (~arg1 != -6407 && arg1 != 34844) {
                    if (~arg1 != -6410 && arg1 != 34846) {
                        int var2 = -103 % ((-58 - arg0) / 40);
                        if (~arg1 != -6411 && arg1 != 34847) {
                            if (~arg1 == -6403) {
                                return 6402;
                            } else {
                                throw new IllegalArgumentException("");
                            }
                        } else {
                            return 6410;
                        }
                    } else {
                        return 6409;
                    }
                } else {
                    return 6406;
                }
            } else {
                return 6408;
            }
        } else {
            return 6407;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZLr;)V")
    public final void method463(boolean arg0, class167 arg1) {
        ++field7147;
        if (arg0) {
            this.method523(false);
        }
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(Z)I")
    public final int method523(boolean arg0) {
        ++field7138;
        return !arg0 ? -69 : this.field7134;
    }
}
