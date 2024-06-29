import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public class class698 extends class450 {

    @OriginalMember(owner = "client!sea", name = "f", descriptor = "I")
    public static int field9704;

    @OriginalMember(owner = "client!sea", name = "g", descriptor = "I")
    public static int field9705;

    @OriginalMember(owner = "client!sea", name = "h", descriptor = "I")
    public static int field9706;

    @OriginalMember(owner = "client!sea", name = "i", descriptor = "I")
    public static int field9707;

    @OriginalMember(owner = "client!sea", name = "j", descriptor = "I")
    public static int field9708;

    @OriginalMember(owner = "client!sea", name = "k", descriptor = "I")
    public static int field9709;

    @OriginalMember(owner = "client!sea", name = "l", descriptor = "I")
    public static int field9710;

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(ZI)V", line = 7)
    public final void method67(boolean arg0, int arg1) {
        super.field6170 = arg1;
        if (arg0) {
            ++field9706;
        }
    }

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "(Z)I", line = 19)
    public final int method3931(boolean arg0) {
        ++field9708;
        if (!arg0) {
            this.method68(false);
        }
        return super.field6170;
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(Lht;B)V", line = 30)
    public static final void method3932(class582 arg0, byte arg1) {
        ++field9707;
        if (class99.field1267 == arg0) {
            int var2 = class3.field63.method3821((byte) 80);
            int var3 = ((254 & var2) >> 4) + class324.field4606 * 2;
            int var4 = (15 & var2) + class53.field655 * 2;
            int var5 = class3.field63.method3821((byte) 104);
            boolean var6 = ~(1 & var5) != -1;
            boolean var7 = (2 & var5) != 0;
            int var8 = !var7 ? -1 : var5 >> 2;
            int var9 = class3.field63.method3811(118) + var3;
            int var10 = class3.field63.method3811(68) + var4;
            int var11 = class3.field63.method3771((byte) -10);
            int var12 = class3.field63.method3771((byte) -10);
            int var13 = class3.field63.method3807(-1);
            int var14 = class3.field63.method3821((byte) -38);
            int var15;
            if (!var7) {
                var15 = var14 * 4;
            } else {
                var15 = (byte) var14;
            }
            int var16 = 4 * class3.field63.method3821((byte) -16);
            int var17 = class3.field63.method3807(-1);
            int var18 = class3.field63.method3807(-1);
            int var19 = class3.field63.method3821((byte) 122);
            int var20 = class3.field63.method3807(-1);
            if (var19 == 255) {
                var19 = -1;
            }
            if (var3 >= 0 && var4 >= 0 && ~(class719.field10004 * 2) < ~var3 && class719.field10004 * 2 > var4 && ~var9 <= -1 && var10 >= 0 && ~(class107.field1453 * 2) < ~var9 && ~var10 > ~(class107.field1453 * 2) && ~var13 != -65536) {
                int var21 = var15 << 2;
                int var22 = var9 * 256;
                int var23 = var3 * 256;
                int var24 = var20 << 2;
                int var25 = var4 * 256;
                int var26 = var10 * 256;
                int var27 = var16 << 2;
                if (~var11 != -1 && ~var8 != 0) {
                    class742 var28 = null;
                    if (var11 >= 0) {
                        int var29 = var11 + -1;
                        class134 var30 = (class134) class390.field5470.method2135((long) var29, (byte) 31);
                        if (var30 != null) {
                            var28 = var30.field2154;
                        }
                    } else {
                        int var31 = -var11 + -1;
                        if (class303.field4293 != var31) {
                            var28 = class248.field3438[var31];
                        } else {
                            var28 = class472.field6475;
                        }
                    }
                    if (var28 != null) {
                        class98 var32 = var28.method4141(0);
                        if (var32.field1238 != null && var32.field1238[var8] != null) {
                            var21 -= var32.field1238[var8][1];
                        }
                        if (var32.field1255 != null && var32.field1255[var8] != null) {
                            var21 -= var32.field1255[var8][1];
                        }
                    }
                }
                class109 var33 = new class109(var13, class257.field3520, class257.field3520, var23, var25, var21, class29.field474 + var17, class29.field474 + var18, var19, var24, var11, var12, var27, var6, var8);
                var33.method796(var22, var26, 0, -var27 + class153.method1118(var26, var22, 126, class257.field3520), class29.field474 + var17);
                class64.field776.method11(new class132(var33), -119);
            }
        } else if (class432.field5946 == arg0) {
            int var34 = class3.field63.method3821((byte) -127);
            int var35 = (7 & var34 >> 4) + class324.field4606;
            int var36 = (var34 & 7) + class53.field655;
            int var37 = class3.field63.method3807(-1);
            if (var37 == 65535) {
                var37 = -1;
            }
            int var38 = class3.field63.method3821((byte) 78);
            int var39 = (var38 & 244) >> 4;
            int var40 = 7 & var38;
            int var41 = class3.field63.method3821((byte) 117);
            int var42 = class3.field63.method3821((byte) -116);
            int var43 = class3.field63.method3807(-1);
            if (~var35 <= -1 && ~var36 <= -1 && class719.field10004 > var35 && ~var36 > ~class107.field1453) {
                int var44 = var39 + 1;
                if (~(var35 - var44) >= ~class472.field6475.field10322[0] && class472.field6475.field10322[0] <= var35 + var44 && class472.field6475.field10321[0] >= -var44 + var36 && var36 + var44 >= class472.field6475.field10321[0]) {
                    class34.method281(var40, var37, (class257.field3520 << 24) + (var36 << 8) + var39 - -(var35 << 16), var42, var43, var41, false, 0);
                }
            }
        } else if (class599.field7851 == arg0) {
            int var45 = class3.field63.method3816(-110);
            int var46 = class3.field63.method3782(128);
            int var47 = class3.field63.method3783((byte) -45);
            int var48 = (var47 & 7) + class53.field655;
            int var49 = class334.field4757 + var48;
            int var50 = class324.field4606 - -(var47 >> 4 & 7);
            int var51 = class503.field6752 + var50;
            int var52 = class3.field63.method3807(-1);
            if (class303.field4293 != var45) {
                boolean var53 = var50 >= 0 && ~var48 <= -1 && ~var50 > ~class719.field10004 && ~class107.field1453 < ~var48;
                if (var53 || class491.method2784((byte) 114, class568.field7464)) {
                    class749.method4199(var49, 0, new class11(var52, var46), class257.field3520, var51);
                    if (var53) {
                        class709.method3985(var50, class257.field3520, var48, (byte) 28);
                    }
                }
            }
        } else if (class470.field6437 == arg0) {
            int var54 = class3.field63.method3809(true);
            if (var54 == 65535) {
                var54 = -1;
            }
            int var55 = class3.field63.method3783((byte) -45);
            int var56 = var55 >> 2;
            int var57 = var55 & 3;
            int var58 = class48.field605[var56];
            int var59 = class3.field63.method3791(true);
            int var60 = class324.field4606 - -(var59 >> 4 & 7);
            int var61 = class53.field655 - -(7 & var59);
            class686.method3864(-24938, var58, var61, var54, var60, var57, class257.field3520, var56);
        } else if (class172.field2633 == arg0) {
            int var62 = class3.field63.method3821((byte) 120);
            boolean var63 = (var62 & 128) != 0;
            int var64 = ((56 & var62) >> 3) + class324.field4606;
            int var65 = (var62 & 7) + class53.field655;
            int var66 = var64 + class3.field63.method3811(51);
            int var67 = class3.field63.method3811(117) + var65;
            int var68 = class3.field63.method3771((byte) -10);
            int var69 = class3.field63.method3807(-1);
            int var70 = 4 * class3.field63.method3821((byte) -46);
            int var71 = class3.field63.method3821((byte) 98) * 4;
            int var72 = class3.field63.method3807(-1);
            int var73 = class3.field63.method3807(-1);
            int var74 = class3.field63.method3821((byte) -20);
            int var75 = class3.field63.method3807(-1);
            if (~var74 == -256) {
                var74 = -1;
            }
            if (~var64 <= -1 && ~var65 <= -1 && var64 < class719.field10004 && ~var65 > ~class107.field1453 && var66 >= 0 && var67 >= 0 && ~class719.field10004 < ~var66 && ~class107.field1453 < ~var67 && var69 != 65535) {
                int var76 = var66 * 512 + 256;
                int var77 = var70 << 2;
                int var78 = var67 * 512 - -256;
                int var79 = var64 * 512 - -256;
                int var80 = var71 << 2;
                int var81 = var75 << 2;
                int var82 = var65 * 512 + 256;
                class109 var83 = new class109(var69, class257.field3520, class257.field3520, var79, var82, var77, var72 - -class29.field474, class29.field474 + var73, var74, var81, 0, var68, var80, var63, -1);
                var83.method796(var76, var78, 0, -var80 + class153.method1118(var78, var76, -20, class257.field3520), var72 - -class29.field474);
                class64.field776.method11(new class132(var83), -105);
            }
        } else if (class422.field5816 == arg0) {
            int var84 = class3.field63.method3821((byte) -79);
            int var85 = (var84 >> 4 & 7) + class324.field4606;
            int var86 = class53.field655 - -(var84 & 7);
            int var87 = class3.field63.method3807(-1);
            int var88 = class3.field63.method3821((byte) 120);
            int var89 = class3.field63.method3807(-1);
            int var90 = class3.field63.method3821((byte) -51);
            if (~var85 <= -1 && ~var86 <= -1 && ~var85 > ~class719.field10004 && ~class107.field1453 < ~var86) {
                int var91 = var85 * 512 + 256;
                int var92 = var86 * 512 + 256;
                int var93 = class257.field3520;
                if (var93 < 3 && class498.method2810(-10387, var85, var86)) {
                    ++var93;
                }
                class628 var94 = new class628(var87, var89, class29.field474, class257.field3520, var93, var91, -var88 + class153.method1118(var92, var91, -24, class257.field3520), var92, var85, var85, var86, var86, var90);
                class141.field2256.method11(new class9(var94), -120);
            }
        } else if (class719.field10015 == arg0) {
            class3.field63.method3821((byte) -34);
            int var95 = class3.field63.method3821((byte) -112);
            int var96 = class324.field4606 - -(7 & var95 >> 4);
            int var97 = (var95 & 7) + class53.field655;
            int var98 = class3.field63.method3807(-1);
            int var99 = class3.field63.method3821((byte) -91);
            int var100 = class3.field63.method3833(255);
            String var101 = class3.field63.method3793(15598);
            class427.method2468(var99, var98, var100, var96, -90, var101, var97, class257.field3520);
        } else if (class9.field164 == arg0) {
            int var102 = class3.field63.method3807(-1);
            int var103 = class3.field63.method3821((byte) 95);
            class462.field6333.method2008((byte) -77, var102).method739((byte) 85, var103);
        } else if (class375.field5198 == arg0) {
            int var104 = class3.field63.method3791(true);
            int var105 = var104 >> 2;
            int var106 = 3 & var104;
            int var107 = class48.field605[var105];
            int var108 = class3.field63.method3815((byte) 110);
            int var109 = ((114 & var108) >> 4) + class324.field4606;
            int var110 = (var108 & 7) + class53.field655;
            if (class491.method2784((byte) 114, class568.field7464) || var109 >= 0 && ~var110 <= -1 && ~var109 > ~class719.field10004 && class107.field1453 > var110) {
                class729.method4088(var109, var107, -1, var105, class257.field3520, var106, var110, 106);
            }
        } else {
            if (arg1 >= -12) {
                method3932((class582) null, (byte) 100);
            }
            if (class436.field6012 == arg0) {
                int var111 = class3.field63.method3821((byte) -107);
                int var112 = (var111 & 7) + class53.field655;
                int var113 = class334.field4757 + var112;
                int var114 = (var111 >> 4 & 7) + class324.field4606;
                int var115 = class503.field6752 + var114;
                int var116 = class3.field63.method3809(true);
                class635 var117 = (class635) class649.field8627.method2135((long) (var113 << 14 | class257.field3520 << 28 | var115), (byte) 31);
                if (var117 != null) {
                    for (class11 var118 = (class11) var117.field8446.method21(2); var118 != null; var118 = (class11) var117.field8446.method9(-127)) {
                        if (~(var116 & 32767) == ~var118.field179) {
                            var118.method3564(true);
                            break;
                        }
                    }
                    if (var117.field8446.method17(false)) {
                        var117.method3564(true);
                    }
                    if (var114 >= 0 && ~var112 <= -1 && class719.field10004 > var114 && class107.field1453 > var112) {
                        class709.method3985(var114, class257.field3520, var112, (byte) 28);
                    }
                }
            } else if (class348.field4887 == arg0) {
                int var119 = class3.field63.method3809(true);
                int var120 = class3.field63.method3791(true);
                int var121 = var120 >> 2;
                int var122 = var120 & 3;
                int var123 = class48.field605[var121];
                int var124 = class3.field63.method3821((byte) -87);
                int var125 = ((var124 & 119) >> 4) + class324.field4606;
                int var126 = class53.field655 - -(7 & var124);
                if (class491.method2784((byte) 114, class568.field7464) || ~var125 <= -1 && ~var126 <= -1 && class719.field10004 > var125 && var126 < class107.field1453) {
                    class729.method4088(var125, var123, var119, var121, class257.field3520, var122, var126, 71);
                }
            } else if (class256.field3516 == arg0) {
                int var127 = class3.field63.method3821((byte) -102);
                int var128 = class53.field655 - -(7 & var127);
                int var129 = class334.field4757 + var128;
                int var130 = class324.field4606 - -((var127 & 127) >> 4);
                int var131 = class503.field6752 + var130;
                int var132 = class3.field63.method3807(-1);
                int var133 = class3.field63.method3807(-1);
                int var134 = class3.field63.method3807(-1);
                if (class649.field8627 != null) {
                    class635 var135 = (class635) class649.field8627.method2135((long) (class257.field3520 << 28 | var129 << 14 | var131), (byte) 31);
                    if (var135 != null) {
                        for (class11 var136 = (class11) var135.field8446.method21(2); var136 != null; var136 = (class11) var135.field8446.method9(-128)) {
                            if ((32767 & var132) == var136.field179 && var136.field176 == var133) {
                                var136.method3564(true);
                                var136.field176 = var134;
                                class749.method4199(var129, 0, var136, class257.field3520, var131);
                                break;
                            }
                        }
                        if (~var130 <= -1 && ~var128 <= -1 && ~class719.field10004 < ~var130 && var128 < class107.field1453) {
                            class709.method3985(var130, class257.field3520, var128, (byte) 28);
                        }
                    }
                }
            } else if (class631.field8409 == arg0) {
                int var137 = class3.field63.method3821((byte) -108);
                int var138 = ((122 & var137) >> 4) + class324.field4606;
                int var139 = (var137 & 7) + class53.field655;
                int var140 = class3.field63.method3807(-1);
                if (~var140 == -65536) {
                    var140 = -1;
                }
                int var141 = class3.field63.method3821((byte) 104);
                int var142 = (var141 & 247) >> 4;
                int var143 = var141 & 7;
                int var144 = class3.field63.method3821((byte) 78);
                int var145 = class3.field63.method3821((byte) 106);
                int var146 = class3.field63.method3807(-1);
                if (var138 >= 0 && var139 >= 0 && var138 < class719.field10004 && var139 < class107.field1453) {
                    int var147 = var142 + 1;
                    if (~class472.field6475.field10322[0] <= ~(-var147 + var138) && ~(var138 - -var147) <= ~class472.field6475.field10322[0] && ~(-var147 + var139) >= ~class472.field6475.field10321[0] && class472.field6475.field10321[0] <= var139 - -var147) {
                        class514.method2868(0, var146, var144, (class257.field3520 << 24) - -(var138 << 16) - (-(var139 << 8) - var142), var143, var140, var145);
                    }
                }
            } else if (class306.field4405 == arg0) {
                int var148 = class3.field63.method3809(true);
                int var149 = class3.field63.method3816(-120);
                int var150 = class3.field63.method3791(true);
                int var151 = (7 & var150) + class53.field655;
                int var152 = class334.field4757 + var151;
                int var153 = ((var150 & 113) >> 4) + class324.field4606;
                int var154 = class503.field6752 + var153;
                boolean var155 = var153 >= 0 && ~var151 <= -1 && var153 < class719.field10004 && ~class107.field1453 < ~var151;
                if (var155 || class491.method2784((byte) 114, class568.field7464)) {
                    class749.method4199(var152, 0, new class11(var148, var149), class257.field3520, var154);
                    if (var155) {
                        class709.method3985(var153, class257.field3520, var151, (byte) 28);
                    }
                }
            } else if (class307.field4424 == arg0) {
                int var156 = class3.field63.method3815((byte) -117);
                int var157 = var156 >> 2;
                int var158 = class48.field605[var157];
                int var159 = class3.field63.method3807(-1);
                class100 var160 = class462.field6333.method2008((byte) -103, var159);
                int var161 = class3.field63.method3791(true);
                int var162 = ((117 & var161) >> 4) + class324.field4606;
                int var163 = class53.field655 - -(var161 & 7);
                if (~var157 == -12) {
                    var157 = 10;
                }
                int var164 = class3.field63.method3791(true);
                int var165 = 0;
                if (var160.field1327 != null) {
                    int var166 = -1;
                    for (int var167 = 0; ~var167 > ~var160.field1327.length; ++var167) {
                        if (~var160.field1327[var167] == ~var157) {
                            var166 = var167;
                            break;
                        }
                    }
                    var165 = var160.field1357[var166].length;
                }
                int var168 = 0;
                if (var160.field1331 != null) {
                    var168 = var160.field1331.length;
                }
                int var169 = 0;
                if (var160.field1342 != null) {
                    var169 = var160.field1342.length;
                }
                if (~(var164 & 1) == -2) {
                    class205.method1372(class257.field3520, var162, 0, var158, var163, (class379) null);
                } else {
                    int[] var170 = null;
                    if (~(2 & var164) == -3) {
                        var170 = new int[var165];
                        for (int var171 = 0; ~var171 > ~var165; ++var171) {
                            var170[var171] = class3.field63.method3807(-1);
                        }
                    }
                    short[] var172 = null;
                    if (~(var164 & 4) == -5) {
                        var172 = new short[var168];
                        for (int var173 = 0; var173 < var168; ++var173) {
                            var172[var173] = (short) class3.field63.method3807(-1);
                        }
                    }
                    short[] var174 = null;
                    if ((8 & var164) == 8) {
                        var174 = new short[var169];
                        for (int var175 = 0; var169 > var175; ++var175) {
                            var174[var175] = (short) class3.field63.method3807(-1);
                        }
                    }
                    class205.method1372(class257.field3520, var162, 0, var158, var163, new class379((long) (class577.field7565++), var170, var172, var174));
                }
            } else {
                class135.method1056("T3 - " + arg0, (Throwable) null, 1);
                class339.method2036(31, false);
            }
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(B)V", line = 739)
    public final void method73(byte arg0) {
        if (arg0 == 98) {
            ++field9704;
            if (~super.field6170 != -2 && ~super.field6170 != -1) {
                super.field6170 = this.method68(false);
            }
        }
    }

    @OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(ILup;)V", line = 755)
    public class698(int arg0, class278 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(II)I", line = 758)
    public final int method75(int arg0, int arg1) {
        ++field9705;
        return arg0 != 0 ? 69 : 1;
    }

    @OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(Lup;)V", line = 770)
    public class698(class278 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(Z)I", line = 773)
    public final int method68(boolean arg0) {
        if (arg0) {
            return 27;
        } else {
            ++field9710;
            return 1;
        }
    }
}
