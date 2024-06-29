import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class625 {

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "Ldaa;")
    public static class453 field8750 = new class453();

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "Lqk;")
    public static class1 field8756 = new class1(84, 1);

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field8748;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field8749;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field8751;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field8752;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field8753;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field8754;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field8755;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field8757;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V", line = 5)
    public static void method3597(int arg0) {
        if (arg0 != -6993) {
            method3602(17, true, -33, -7, -24);
        }
        field8750 = null;
        field8756 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)V", line = 19)
    public static final void method3598(int arg0, int arg1) {
        if (arg1 != 15) {
            method3600(-62, null);
        }
        field8748++;
        class607.field8550 = arg0;
        class39 var2 = class356.field5132;
        synchronized (class356.field5132) {
            class356.field5132.method314(-2);
        }
        class39 var3 = class129.field1672;
        synchronized (class129.field1672) {
            class129.field1672.method314(-2);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZ)Lac;", line = 36)
    public static final class743 method3599(int arg0, boolean arg1) {
        field8755++;
        if (!arg1) {
            field8750 = null;
        }
        class743 var2 = (class743) class213.field2931.method312(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class336.field4780.method1849(arg0, (byte) 47, 0);
        class743 var4 = new class743();
        if (var3 != null) {
            var4.method4116(arg0, new class511(var3), (byte) -124);
        }
        class213.field2931.method305(var4, (long) arg0, 18320);
        return var4;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILiga;)V", line = 63)
    public static final void method3600(int arg0, class91 arg1) {
        field8751++;
        if (class164.field2095 == arg1) {
            int var2 = class315.field4517.method3013(101);
            int var3 = (var2 >> 4 & 0x7) + class153.field2002;
            int var4 = (var2 & 0x7) + class701.field9770;
            int var5 = class315.field4517.method3002(-1);
            if (var5 == 65535) {
                var5 = -1;
            }
            int var6 = class315.field4517.method3013(108);
            int var7 = var6 >> 4 & 0xF;
            int var8 = var6 & 0x7;
            int var9 = class315.field4517.method3013(-116);
            int var10 = class315.field4517.method3013(-126);
            int var11 = class315.field4517.method3002(-1);
            if (var3 >= 0 && var4 >= 0 && class741.field10208 > var3 && class525.field7224 > var4) {
                int var12 = var7 + 1;
                if (class724.field10031.field9219[0] >= (var3 - var12) && (var3 + var12) >= class724.field10031.field9219[0] && class724.field10031.field9214[0] >= var4 - var12 && class724.field10031.field9214[0] <= var4 + var12) {
                    class14.method53((var4 << 8) + (class372.field5354 << 24) + (var3 << 16) + var7, var5, var8, var9, false, (byte) 111, var10, var11);
                }
            }
            return;
        }
        int var13 = -52 % ((arg0 + 90) / 36);
        if (class722.field9960 == arg1) {
            int var14 = class315.field4517.method3013(9);
            int var15 = var14 >> 2;
            int var16 = var14 & 0x3;
            int var17 = class775.field10668[var15];
            int var18 = class315.field4517.method3013(116);
            int var19 = (var18 >> 4 & 0x7) + class153.field2002;
            int var20 = (var18 & 0x7) + class701.field9770;
            if (class227.method1523(class683.field9565, -40) || var19 >= 0 && var20 >= 0 && class741.field10208 > var19 && class525.field7224 > var20) {
                class547.method3242(var20, -1, var17, var15, class372.field5354, var16, 76, var19);
            }
        } else if (class247.field3675 == arg1) {
            int var21 = class315.field4517.method3013(98);
            int var22 = class153.field2002 + (var21 >> 4 & 0x7);
            int var23 = (var21 & 0x7) + class701.field9770;
            int var24 = class315.field4517.method3002(-1);
            int var25 = class315.field4517.method3013(46);
            int var26 = class315.field4517.method3002(-1);
            int var27 = class315.field4517.method3013(-107);
            if (var22 >= 0 && var23 >= 0 && var22 < class741.field10208 && var23 < class525.field7224) {
                int var28 = var22 * 512 + 256;
                int var29 = var23 * 512 + 256;
                int var30 = class372.field5354;
                if (var30 < 3 && class123.method865(var22, var23, -114)) {
                    var30++;
                }
                class629 var31 = new class629(var24, var26, class533.field7336, class372.field5354, var30, var28, class373.method2316(var28, class372.field5354, var29, 92) - var25, var29, var22, var22, var23, var23, var27);
                class601.field8412.method1039(new class350(var31), 0);
            }
        } else if (class358.field5151 == arg1) {
            int var32 = class315.field4517.method3013(110);
            int var33 = (var32 >> 4 & 0xF) + class153.field2002 * 2;
            int var34 = class701.field9770 * 2 + (var32 & 0xF);
            int var35 = class315.field4517.method3013(-104);
            boolean var36 = (var35 & 0x1) != 0;
            boolean var37 = (var35 & 0x2) != 0;
            int var38 = var37 ? var35 >> 2 : -1;
            int var39 = var33 + class315.field4517.method3030(-25984);
            int var40 = class315.field4517.method3030(-25984) + var34;
            int var41 = class315.field4517.method3034(1);
            int var42 = class315.field4517.method3034(1);
            int var43 = class315.field4517.method3002(-1);
            int var44 = class315.field4517.method3013(-109);
            int var45;
            if (var37) {
                var45 = (byte) var44;
            } else {
                var45 = var44 * 4;
            }
            int var46 = class315.field4517.method3013(-91) * 4;
            int var47 = class315.field4517.method3002(-1);
            int var48 = class315.field4517.method3002(-1);
            int var49 = class315.field4517.method3013(-98);
            int var50 = class315.field4517.method3002(-1);
            if (var49 == 255) {
                var49 = -1;
            }
            if (var33 >= 0 && var34 >= 0 && (class741.field10208 * 2) > var33 && var34 < class741.field10208 * 2 && var39 >= 0 && var40 >= 0 && class525.field7224 * 2 > var39 && class525.field7224 * 2 > var40 && var43 != 65535) {
                int var51 = var33 * 256;
                int var52 = var45 << 2;
                int var53 = var46 << 2;
                int var54 = var50 << 2;
                int var55 = var39 * 256;
                int var56 = var40 * 256;
                int var57 = var34 * 256;
                if (var41 != 0 && var38 != -1) {
                    class654 var58 = null;
                    if (var41 < 0) {
                        int var59 = -var41 - 1;
                        if (class173.field2193 == var59) {
                            var58 = class724.field10031;
                        } else {
                            var58 = class413.field5787[var59];
                        }
                    } else {
                        int var60 = var41 - 1;
                        class685 var61 = (class685) class450.field6288.method3669(false, (long) var60);
                        if (var61 != null) {
                            var58 = var61.field9573;
                        }
                    }
                    if (var58 != null) {
                        class148 var62 = var58.method3736((byte) 113);
                        if (var62.field1899 != null && var62.field1899[var38] != null) {
                            var52 -= var62.field1899[var38][1];
                        }
                        if (var62.field1902 != null && var62.field1902[var38] != null) {
                            var52 -= var62.field1902[var38][1];
                        }
                    }
                }
                class20 var63 = new class20(var43, class372.field5354, class372.field5354, var51, var57, var52, class533.field7336 + var47, class533.field7336 + var48, var49, var54, var41, var42, var53, var36, var38);
                var63.method82(-108, var55, class373.method2316(var55, class372.field5354, var56, -113) - var53, var56, class533.field7336 + var47);
                class404.field5689.method1039(new class102(var63), 0);
            }
        } else if (class60.field692 == arg1) {
            int var64 = class315.field4517.method3013(62);
            int var65 = ((var64 & 0x79) >> 4) + class153.field2002;
            int var66 = (var64 & 0x7) + class701.field9770;
            int var67 = class315.field4517.method3002(-1);
            if (var67 == 65535) {
                var67 = -1;
            }
            int var68 = class315.field4517.method3013(-96);
            int var69 = (var68 & 0xF9) >> 4;
            int var70 = var68 & 0x7;
            int var71 = class315.field4517.method3013(-100);
            int var72 = class315.field4517.method3013(28);
            int var73 = class315.field4517.method3002(-1);
            if (var65 >= 0 && var66 >= 0 && class741.field10208 > var65 && var66 < class525.field7224) {
                int var74 = var69 + 1;
                if (class724.field10031.field9219[0] >= (var65 - var74) && var65 + var74 >= class724.field10031.field9219[0] && class724.field10031.field9214[0] >= (var66 - var74) && var66 + var74 >= class724.field10031.field9214[0]) {
                    class210.method1328(var67, false, var73, (class372.field5354 << 24) + (var65 << 16) + (var66 << 8) + var69, var72, var71, var70);
                }
            }
        } else if (class22.field201 == arg1) {
            int var75 = class315.field4517.method3013(-103);
            int var76 = class701.field9770 + (var75 & 0x7);
            int var77 = class236.field3535 + var76;
            int var78 = (var75 >> 4 & 0x7) + class153.field2002;
            int var79 = class444.field6151 + var78;
            int var80 = class315.field4517.method3002(-1);
            int var81 = class315.field4517.method3002(-1);
            int var82 = class315.field4517.method3002(-1);
            if (class752.field10377 != null) {
                class656 var83 = (class656) class752.field10377.method3669(false, (long) (var79 | class372.field5354 << 28 | var77 << 14));
                if (var83 != null) {
                    for (class728 var84 = (class728) var83.field9258.method1041(1048832); var84 != null; var84 = (class728) var83.field9258.method1033(-1)) {
                        if ((var80 & 0x7FFF) == var84.field10064 && var84.field10066 == var81) {
                            var84.method527(-11229);
                            var84.field10066 = var82;
                            class12.method36(-18149, var77, class372.field5354, var84, var79);
                            break;
                        }
                    }
                    if (var78 >= 0 && var76 >= 0 && class741.field10208 > var78 && class525.field7224 > var76) {
                        class251.method1689(class372.field5354, var78, var76, 1066420873);
                    }
                }
            }
        } else if (class31.field301 == arg1) {
            int var85 = class315.field4517.method2982((byte) -101);
            int var86 = var85 >> 2;
            int var87 = var85 & 0x3;
            int var88 = class775.field10668[var86];
            int var89 = class315.field4517.method3004((byte) -100);
            if (var89 == 65535) {
                var89 = -1;
            }
            int var90 = class315.field4517.method2976(90);
            int var91 = (var90 >> 4 & 0x7) + class153.field2002;
            int var92 = (var90 & 0x7) + class701.field9770;
            class208.method1323(var86, var91, var92, var89, (byte) -118, class372.field5354, var87, var88);
        } else if (class419.field5830 == arg1) {
            int var93 = class315.field4517.method2982((byte) -101);
            int var94 = var93 >> 2;
            int var95 = var93 & 0x3;
            int var96 = class775.field10668[var94];
            int var97 = class315.field4517.method3013(-128);
            int var98 = class153.field2002 + ((var97 & 0x7A) >> 4);
            int var99 = (var97 & 0x7) + class701.field9770;
            int var100 = class315.field4517.method3004((byte) -102);
            if (class227.method1523(class683.field9565, -28) || var98 >= 0 && var99 >= 0 && class741.field10208 > var98 && class525.field7224 > var99) {
                class547.method3242(var99, var100, var96, var94, class372.field5354, var95, -127, var98);
            }
        } else if (class212.field2926 == arg1) {
            int var101 = class315.field4517.method2976(99);
            int var102 = (var101 & 0x7) + class701.field9770;
            int var103 = class236.field3535 + var102;
            int var104 = ((var101 & 0x76) >> 4) + class153.field2002;
            int var105 = class444.field6151 + var104;
            int var106 = class315.field4517.method3042((byte) -100);
            class656 var107 = (class656) class752.field10377.method3669(false, (long) (var103 << 14 | class372.field5354 << 28 | var105));
            if (var107 != null) {
                for (class728 var108 = (class728) var107.field9258.method1041(1048832); var108 != null; var108 = (class728) var107.field9258.method1033(-1)) {
                    if ((var106 & 0x7FFF) == var108.field10064) {
                        var108.method527(-11229);
                        break;
                    }
                }
                if (var107.field9258.method1044(21972)) {
                    var107.method527(-11229);
                }
                if (var104 >= 0 && var102 >= 0 && var104 < class741.field10208 && var102 < class525.field7224) {
                    class251.method1689(class372.field5354, var104, var102, 1066420873);
                }
            }
        } else if (class554.field7678 == arg1) {
            int var109 = class315.field4517.method3002(-1);
            int var110 = class315.field4517.method3006(false);
            int var111 = class315.field4517.method3004((byte) -101);
            int var112 = class315.field4517.method3013(-99);
            int var113 = class701.field9770 + (var112 & 0x7);
            int var114 = class236.field3535 + var113;
            int var115 = (var112 >> 4 & 0x7) + class153.field2002;
            int var116 = class444.field6151 + var115;
            if (class173.field2193 != var109) {
                boolean var117 = var115 >= 0 && var113 >= 0 && class741.field10208 > var115 && class525.field7224 > var113;
                if (var117 || class227.method1523(class683.field9565, -116)) {
                    class12.method36(-18149, var114, class372.field5354, new class728(var110, var111), var116);
                    if (var117) {
                        class251.method1689(class372.field5354, var115, var113, 1066420873);
                    }
                }
            }
        } else if (class221.field3022 == arg1) {
            int var118 = class315.field4517.method3013(-119);
            boolean var119 = (var118 & 0x80) != 0;
            int var120 = (var118 >> 3 & 0x7) + class153.field2002;
            int var121 = class701.field9770 + (var118 & 0x7);
            int var122 = var120 + class315.field4517.method3030(-25984);
            int var123 = var121 + class315.field4517.method3030(-25984);
            int var124 = class315.field4517.method3034(1);
            int var125 = class315.field4517.method3002(-1);
            int var126 = class315.field4517.method3013(-93) * 4;
            int var127 = class315.field4517.method3013(97) * 4;
            int var128 = class315.field4517.method3002(-1);
            int var129 = class315.field4517.method3002(-1);
            int var130 = class315.field4517.method3013(109);
            if (var130 == 255) {
                var130 = -1;
            }
            int var131 = class315.field4517.method3002(-1);
            if (var120 >= 0 && var121 >= 0 && class741.field10208 > var120 && class525.field7224 > var121 && var122 >= 0 && var123 >= 0 && var122 < class741.field10208 && var123 < class525.field7224 && var125 != 65535) {
                int var132 = var121 * 512 + 256;
                int var133 = var120 * 512 + 256;
                int var134 = var127 << 2;
                int var135 = var123 * 512 + 256;
                int var136 = var122 * 512 + 256;
                int var137 = var126 << 2;
                int var138 = var131 << 2;
                class20 var139 = new class20(var125, class372.field5354, class372.field5354, var133, var132, var137, class533.field7336 + var128, class533.field7336 + var129, var130, var138, 0, var124, var134, var119, -1);
                var139.method82(-53, var136, class373.method2316(var136, class372.field5354, var135, -112) - var134, var135, class533.field7336 + var128);
                class404.field5689.method1039(new class102(var139), 0);
            }
        } else if (class138.field1764 == arg1) {
            class315.field4517.method3013(-91);
            int var140 = class315.field4517.method3013(50);
            int var141 = ((var140 & 0x72) >> 4) + class153.field2002;
            int var142 = (var140 & 0x7) + class701.field9770;
            int var143 = class315.field4517.method3002(-1);
            int var144 = class315.field4517.method3013(-116);
            int var145 = class315.field4517.method2983(true);
            String var146 = class315.field4517.method2993((byte) -128);
            class750.method4152(class372.field5354, var141, var146, 123, var143, var142, var145, var144);
        } else if (class349.field5071 == arg1) {
            int var147 = class315.field4517.method3013(63);
            int var148 = class153.field2002 + ((var147 & 0x7A) >> 4);
            int var149 = (var147 & 0x7) + class701.field9770;
            int var150 = class315.field4517.method3042((byte) -100);
            class286 var151 = class390.field5558.method3065(-121, var150);
            int var152 = class315.field4517.method2976(86);
            int var153 = var152 >> 2;
            int var154 = class775.field10668[var153];
            if (var153 == 11) {
                var153 = 10;
            }
            int var155 = class315.field4517.method2976(124);
            int var156 = 0;
            if (var151.field4162 != null) {
                int var157 = -1;
                for (int var158 = 0; var158 < var151.field4162.length; var158++) {
                    if (var151.field4162[var158] == var153) {
                        var157 = var158;
                        break;
                    }
                }
                var156 = var151.field4200[var157].length;
            }
            int var159 = 0;
            if (var151.field4208 != null) {
                var159 = var151.field4208.length;
            }
            int var160 = 0;
            if (var151.field4171 != null) {
                var160 = var151.field4171.length;
            }
            if ((var155 & 0x1) == 1) {
                class712.method3997(var148, class372.field5354, null, var154, (byte) -90, var149);
            } else {
                int[] var161 = null;
                if ((var155 & 0x2) == 2) {
                    var161 = new int[var156];
                    for (int var162 = 0; var162 < var156; var162++) {
                        var161[var162] = class315.field4517.method3002(-1);
                    }
                }
                short[] var163 = null;
                if ((var155 & 0x4) == 4) {
                    var163 = new short[var159];
                    for (int var164 = 0; var164 < var159; var164++) {
                        var163[var164] = (short) class315.field4517.method3002(-1);
                    }
                }
                short[] var165 = null;
                if ((var155 & 0x8) == 8) {
                    var165 = new short[var160];
                    for (int var166 = 0; var166 < var160; var166++) {
                        var165[var166] = (short) class315.field4517.method3002(-1);
                    }
                }
                class712.method3997(var148, class372.field5354, new class413((long) (class188.field2351++), var161, var163, var165), var154, (byte) -120, var149);
            }
        } else if (class76.field843 == arg1) {
            int var167 = class315.field4517.method3002(-1);
            int var168 = class315.field4517.method3002(-1);
            int var169 = class315.field4517.method2976(92);
            int var170 = (var169 & 0x7) + class701.field9770;
            int var171 = class236.field3535 + var170;
            int var172 = ((var169 & 0x78) >> 4) + class153.field2002;
            int var173 = class444.field6151 + var172;
            boolean var174 = var172 >= 0 && var170 >= 0 && class741.field10208 > var172 && class525.field7224 > var170;
            if (var174 || class227.method1523(class683.field9565, -68)) {
                class12.method36(-18149, var171, class372.field5354, new class728(var168, var167), var173);
                if (var174) {
                    class251.method1689(class372.field5354, var172, var170, 1066420873);
                }
            }
        } else if (class413.field5781 == arg1) {
            int var175 = class315.field4517.method3002(-1);
            int var176 = class315.field4517.method3013(-5);
            class390.field5558.method3065(-126, var175).method1892(var176, 8329);
        } else {
            class502.method2937(null, (byte) 54, "T3 - " + arg1);
            class570.method3355((byte) -60, false);
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V", line = 771)
    public static final void method3601(int arg0) {
        class39 var1 = class129.field1672;
        synchronized (class129.field1672) {
            class129.field1672.method319(-91);
        }
        field8754++;
        class39 var2 = class356.field5132;
        synchronized (class356.field5132) {
            class356.field5132.method319(-11);
        }
        if (arg0 <= 109) {
            method3601(18);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZIII)V", line = 792)
    public static final void method3602(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field8749++;
        if (!arg1 && class728.field10063 == arg0 && class372.field5352 == arg4 && class464.field6471 == class435.field6040 || class688.field9602.field8542.method1756((byte) -98) == 1) {
            return;
        }
        class728.field10063 = arg0;
        class464.field6471 = class435.field6040;
        class372.field5352 = arg4;
        if (class688.field9602.field8542.method1756((byte) -98) == 1) {
            class464.field6471 = 0;
        }
        class285.method1884(true, arg2);
        class323.method2046(class582.field8243, class111.field1332, true, false, class559.field7865, class712.field9865.method3999(class553.field7667, (byte) -64));
        int var5 = class444.field6151;
        int var6 = class236.field3535;
        class444.field6151 = (class728.field10063 - (class741.field10208 >> 4)) * 8;
        if (arg3 != 7) {
            method3600(-115, null);
        }
        class236.field3535 = (class372.field5352 - (class525.field7224 >> 4)) * 8;
        class212.field2927 = class46.method374(class728.field10063 * 8, class372.field5352 * 8);
        class787.field10808 = null;
        int var7 = class444.field6151 - var5;
        int var8 = class236.field3535 - var6;
        if (arg2 == 11) {
            for (int var9 = 0; var9 < class744.field10275; var9++) {
                class685 var10 = class669.field9376[var9];
                if (var10 != null) {
                    class359 var11 = var10.field9573;
                    for (int var12 = 0; var12 < 10; var12++) {
                        var11.field9219[var12] -= var7;
                        var11.field9214[var12] -= var8;
                    }
                    var11.field3460 -= var8 * 512;
                    var11.field3470 -= var7 * 512;
                }
            }
        } else {
            boolean var13 = false;
            class429.field5988 = 0;
            int var14 = (class741.field10208 - 1) * 512;
            int var15 = (class525.field7224 - 1) * 512;
            for (int var16 = 0; var16 < class744.field10275; var16++) {
                class685 var30 = class669.field9376[var16];
                if (var30 != null) {
                    class359 var31 = var30.field9573;
                    var31.field3470 -= var7 * 512;
                    var31.field3460 -= var8 * 512;
                    if (var31.field3470 >= 0 && var31.field3470 <= var14 && var31.field3460 >= 0 && var15 >= var31.field3460) {
                        boolean var32 = true;
                        for (int var33 = 0; var33 < 10; var33++) {
                            var31.field9219[var33] -= var7;
                            var31.field9214[var33] -= var8;
                            if (var31.field9219[var33] < 0 || class741.field10208 <= var31.field9219[var33] || var31.field9214[var33] < 0 || class525.field7224 <= var31.field9214[var33]) {
                                var32 = false;
                            }
                        }
                        if (var32) {
                            class425.field5934[class429.field5988++] = var31.field9186;
                        } else {
                            var31.method2258(arg3 ^ 0xFFFFFFD4, null);
                            var13 = true;
                            var30.method527(-11229);
                        }
                    } else {
                        var31.method2258(-88, null);
                        var13 = true;
                        var30.method527(-11229);
                    }
                }
            }
            if (var13) {
                class744.field10275 = class450.field6288.method3664(0);
                class450.field6288.method3663(class669.field9376, false);
            }
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class723 var28 = class413.field5787[var17];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field9219[var29] -= var7;
                    var28.field9214[var29] -= var8;
                }
                var28.field3460 -= var8 * 512;
                var28.field3470 -= var7 * 512;
            }
        }
        class657[] var18 = class115.field1569;
        for (int var19 = 0; var19 < var18.length; var19++) {
            class657 var27 = var18[var19];
            if (var27 != null) {
                var27.field9272 -= var8 * 512;
                var27.field9277 -= var7 * 512;
            }
        }
        for (class574 var20 = (class574) class189.field2356.method1041(1048832); var20 != null; var20 = (class574) class189.field2356.method1033(arg3 - 8)) {
            var20.field8081 -= var8;
            var20.field8080 -= var7;
            if (class683.field9565 != 4 && (var20.field8080 < 0 || var20.field8081 < 0 || var20.field8080 >= class741.field10208 || class525.field7224 <= var20.field8081)) {
                var20.method527(-11229);
            }
        }
        for (class574 var21 = (class574) class747.field10318.method1041(1048832); var21 != null; var21 = (class574) class747.field10318.method1033(-1)) {
            var21.field8081 -= var8;
            var21.field8080 -= var7;
            if (class683.field9565 != 4 && (var21.field8080 < 0 || var21.field8081 < 0 || class741.field10208 <= var21.field8080 || var21.field8081 >= class525.field7224)) {
                var21.method527(-11229);
            }
        }
        if (class683.field9565 != 4) {
            for (class656 var22 = (class656) class752.field10377.method3668(4); var22 != null; var22 = (class656) class752.field10377.method3667((byte) -82)) {
                int var23 = (int) (var22.field762 & 0x3FFFL);
                int var24 = var23 - class444.field6151;
                int var25 = (int) (var22.field762 >> 14 & 0x3FFFL);
                int var26 = var25 - class236.field3535;
                if (var24 < 0 || var26 < 0 || class741.field10208 <= var24 || var26 >= class525.field7224) {
                    var22.method527(-11229);
                }
            }
        }
        if (class683.field9568 != 0) {
            class461.field6447 -= var8;
            class683.field9568 -= var7;
        }
        class88.method654(false);
        if (arg2 != 11) {
            class412.field5779 -= var8 * 512;
            class350.field5094 -= var7;
            class123.field1630 -= var7;
            class497.field6818 -= var7 * 512;
            class754.field10395 -= var8;
            class383.field5490 -= var8;
            if (Math.abs(var7) > class741.field10208 || Math.abs(var8) > class525.field7224) {
                class271.method1768((byte) -70);
            }
        } else if (class695.field9691 == 4) {
            class568.field8011 -= var7 * 512;
            class693.field9671 -= var7 * 512;
            class548.field7650 -= var8 * 512;
            class177.field2234 -= var8 * 512;
        } else {
            class362.field5225 = -1;
            class5.field30 = -1;
            class695.field9691 = 1;
        }
        class692.method3922((byte) 28);
        class604.method3489((byte) 56);
        class601.field8412.method1046((byte) 127);
        class404.field5689.method1046((byte) 125);
        class190.field2376.method3105(-52);
        class617.method3558(false);
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)V", line = 1071)
    public static final void method3603(int arg0) {
        class454.method2737(false, true);
        field8752++;
        class616.field8645 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class175.field2217.length; var2++) {
            if (class476.field6609[var2] != -1 && class175.field2217[var2] == null) {
                class175.field2217[var2] = class604.field8480.method1849(0, (byte) -121, class476.field6609[var2]);
                if (class175.field2217[var2] == null) {
                    var1 = false;
                    class616.field8645++;
                }
            }
            if (class734.field10130[var2] != -1 && class380.field5444[var2] == null) {
                class380.field5444[var2] = class604.field8480.method1848(class734.field10130[var2], (byte) 101, class725.field10032[var2], 0);
                if (class380.field5444[var2] == null) {
                    class616.field8645++;
                    var1 = false;
                }
            }
            if (class372.field5355[var2] != -1 && class452.field6305[var2] == null) {
                class452.field6305[var2] = class604.field8480.method1849(0, (byte) -100, class372.field5355[var2]);
                if (class452.field6305[var2] == null) {
                    var1 = false;
                    class616.field8645++;
                }
            }
            if (class404.field5702[var2] != -1 && class448.field6279[var2] == null) {
                class448.field6279[var2] = class604.field8480.method1849(0, (byte) 39, class404.field5702[var2]);
                if (class448.field6279[var2] == null) {
                    var1 = false;
                    class616.field8645++;
                }
            }
            if (class86.field1038 != null && class370.field5341[var2] == null && class86.field1038[var2] != -1) {
                class370.field5341[var2] = class604.field8480.method1848(class86.field1038[var2], (byte) 115, class725.field10032[var2], 0);
                if (class370.field5341[var2] == null) {
                    var1 = false;
                    class616.field8645++;
                }
            }
        }
        if (class787.field10808 == null) {
            if (class212.field2927 == null || !class539.field7458.method1845((byte) -124, class212.field2927.field4438 + "_staticelements")) {
                class787.field10808 = new class762(0);
            } else if (class539.field7458.method1837((byte) -99, class212.field2927.field4438 + "_staticelements")) {
                class787.field10808 = class148.method986(class539.field7458, (byte) -44, class14.field78, class212.field2927.field4438 + "_staticelements");
            } else {
                class616.field8645++;
                var1 = false;
            }
        }
        if (!var1) {
            class511.field7009 = 1;
            return;
        }
        class483.field6687 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class175.field2217.length; var4++) {
            byte[] var21 = class380.field5444[var4];
            if (var21 != null) {
                int var22 = (class611.field8607[var4] >> 8) * 64 - class444.field6151;
                int var23 = (class611.field8607[var4] & 0xFF) * 64 - class236.field3535;
                if (class683.field9565 != 0) {
                    var22 = 10;
                    var23 = 10;
                }
                var3 &= class372.method2314(var22, class741.field10208, var23, class525.field7224, -105, var21);
            }
            byte[] var24 = class448.field6279[var4];
            if (var24 != null) {
                int var25 = (class611.field8607[var4] >> 8) * 64 - class444.field6151;
                int var26 = (class611.field8607[var4] & 0xFF) * 64 - class236.field3535;
                if (class683.field9565 != 0) {
                    var26 = 10;
                    var25 = 10;
                }
                var3 &= class372.method2314(var25, class741.field10208, var26, class525.field7224, arg0 ^ 0xA1C4603B, var24);
            }
        }
        if (!var3) {
            class511.field7009 = 2;
            return;
        }
        if (class511.field7009 != 0) {
            class323.method2046(class582.field8243, class111.field1332, true, false, class559.field7865, class712.field9865.method3999(class553.field7667, (byte) -70) + "<br>(100%)");
        }
        class482.method2865(23105);
        class106.method750(true);
        class607.method3500(false);
        boolean var5 = false;
        if (class111.field1332.method193() && class688.field9602.field8507.method1714((byte) -98) == 2) {
            for (int var6 = 0; var6 < class175.field2217.length; var6++) {
                if (class448.field6279[var6] != null || class452.field6305[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class688.field9602.field8499.method2227((byte) -98) == 1) {
            var7 = class253.field3750[class166.field2120];
        } else {
            var7 = class442.field6099[class166.field2120];
        }
        if (class111.field1332.method201()) {
            var7++;
        }
        class435.method2610(class111.field1332, class295.field4321, 9, 4, class741.field10208, class525.field7224, var7, var5, class111.field1332.method143() > 0);
        class654.method3748(class457.field6389);
        if (class457.field6389 == 0) {
            class505.method2947(null);
        } else {
            class505.method2947(class78.field878);
        }
        for (int var8 = 0; var8 < 4; var8++) {
            client.field1305[var8].method4089(-1);
        }
        class322.method2043(false);
        class350.method2208(false, arg0 ^ arg0);
        class497.method2920((byte) 118);
        class562.field7912 = false;
        class516.field7081 = null;
        class482.method2865(23105);
        System.gc();
        class454.method2737(true, true);
        class210.method1329((byte) -58);
        class715.field9931 = class688.field9602.field8538.method2315((byte) -98);
        class93.field1084 = class771.field10608 >= 96;
        class647.field9049 = class688.field9602.field8507.method1714((byte) -98) == 2;
        class713.field9926 = class688.field9602.field8528.method677((byte) -98) == 1;
        class151.field1983 = class688.field9602.field8542.method1756((byte) -98) == 1 ? -1 : class464.field6471;
        class452.field6301 = class688.field9602.field8551.method3429((byte) -98) == 1;
        class91.field1064 = class688.field9602.field8506.method1732((byte) -98) == 1;
        class617.field8656 = new class245(4, class741.field10208, class525.field7224, false);
        if (class683.field9565 == 0) {
            class653.method3733(class175.field2217, class617.field8656, (byte) 87);
        } else {
            class356.method2235(class175.field2217, class617.field8656, (byte) 67);
        }
        class159.method1021(class525.field7224 >> 4, class741.field10208 >> 4, 25279);
        class56.method470(11192);
        if (var5) {
            class111.method810(true);
            class562.field7919 = new class245(1, class741.field10208, class525.field7224, true);
            if (class683.field9565 == 0) {
                class653.method3733(class452.field6305, class562.field7919, (byte) 71);
                class454.method2737(true, true);
            } else {
                class356.method2235(class452.field6305, class562.field7919, (byte) 44);
                class454.method2737(true, true);
            }
            class562.field7919.method4054(false, class617.field8656.field10085[0], 0);
            class562.field7919.method4059(null, class111.field1332, (byte) 85, null);
            class111.method810(false);
        }
        class617.field8656.method4059(var5 ? class562.field7919.field10085 : null, class111.field1332, (byte) 85, client.field1305);
        if (class683.field9565 == 0) {
            class454.method2737(true, true);
            class2.method7(class380.field5444, class617.field8656, (byte) 33);
            if (class370.field5341 != null) {
                class319.method2036(-17094);
            }
        } else {
            class454.method2737(true, true);
            class135.method905(class380.field5444, class617.field8656, 8780);
        }
        class106.method750(true);
        if (class771.field10608 < 96) {
            class601.method3477(7);
        }
        class454.method2737(true, true);
        class617.field8656.method4062(var5 ? class594.field8355[0] : null, (byte) 16, null, class111.field1332);
        class617.field8656.method1644(class111.field1332, false, (byte) 55);
        class454.method2737(true, true);
        if (var5) {
            class111.method810(true);
            class454.method2737(true, true);
            if (class683.field9565 == 0) {
                class2.method7(class448.field6279, class562.field7919, (byte) 33);
            } else {
                class135.method905(class448.field6279, class562.field7919, 8780);
            }
            class106.method750(true);
            class454.method2737(true, true);
            class562.field7919.method4062(null, (byte) 16, class95.field1115[0], class111.field1332);
            class562.field7919.method1644(class111.field1332, true, (byte) -90);
            class454.method2737(true, true);
            class111.method810(false);
        }
        class103.method723(104);
        int var9 = class617.field8656.field3623;
        if (var9 > class435.field6040) {
            var9 = class435.field6040;
        }
        if (var9 < class435.field6040 - 1) {
            var9 = class435.field6040 - 1;
        }
        if (class688.field9602.field8542.method1756((byte) -98) == 0) {
            class413.method2518(var9);
        } else {
            class413.method2518(0);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var19 = 0; var19 < class741.field10208; var19++) {
                for (int var20 = 0; var20 < class525.field7224; var20++) {
                    class251.method1689(var10, var19, var20, 1066420873);
                }
            }
        }
        class421.method2540((byte) -67);
        class482.method2865(23105);
        class641.method3684((byte) -21);
        class106.method750(true);
        class436.method2615(arg0 - 1580965670);
        if (class43.field453 != null && class679.field9490 != null && class664.field9331 == 11) {
            class96.field1122++;
            class116 var11 = class248.method1672(class84.field1023, class123.field1629, -20647);
            var11.field1575.method3003(1057001181, -23061);
            class443.method2655(0, var11);
        }
        if (class683.field9565 == 0) {
            int var12 = (class728.field10063 - (class741.field10208 >> 4)) / 8;
            int var13 = ((class741.field10208 >> 4) + class728.field10063) / 8;
            int var14 = (class372.field5352 - (class525.field7224 >> 4)) / 8;
            int var15 = (class372.field5352 + (class525.field7224 >> 4)) / 8;
            for (int var16 = var12 - 1; var16 <= (var13 + 1); var16++) {
                for (int var17 = var14 - 1; var17 <= var15 + 1; var17++) {
                    if (var12 > var16 || var16 > var13 || var17 < var14 || var15 < var17) {
                        class604.field8480.method1858("m" + var16 + "_" + var17, 0);
                        class604.field8480.method1858("l" + var16 + "_" + var17, 0);
                    }
                }
            }
        }
        if (class664.field9331 == 4) {
            class285.method1884(true, 3);
        } else if (class664.field9331 == 8) {
            class285.method1884(true, 7);
        } else {
            class285.method1884(true, 10);
            if (class679.field9490 != null) {
                class116 var18 = class248.method1672(class84.field1023, class88.field1048, -20647);
                class443.method2655(0, var18);
            }
        }
        class85.method644(false);
        class482.method2865(23105);
        class54.method460(arg0 ^ 0xA1C4605C);
        class282.field4043 = true;
        if (class452.field6306) {
            class629.method3616(false, "Took: " + (class683.method3903((byte) 4) - class288.field4220) + "ms");
            class452.field6306 = false;
        }
    }
}
