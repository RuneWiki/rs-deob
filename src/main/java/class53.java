import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class53 extends class1 {

    @OriginalMember(owner = "client!eh", name = "gb", descriptor = "I")
    private int field1063 = 0;

    @OriginalMember(owner = "client!eh", name = "jb", descriptor = "I")
    private int field1066 = 0;

    @OriginalMember(owner = "client!eh", name = "mb", descriptor = "I")
    private int field1069 = 1365;

    @OriginalMember(owner = "client!eh", name = "nb", descriptor = "I")
    private int field1070 = 20;

    @OriginalMember(owner = "client!eh", name = "kb", descriptor = "I")
    public static int field1067 = 99;

    @OriginalMember(owner = "client!eh", name = "hb", descriptor = "Luc;")
    public static class211 field1064 = new class211(64);

    @OriginalMember(owner = "client!eh", name = "rb", descriptor = "Luc;")
    public static class211 field1074 = new class211(64);

    @OriginalMember(owner = "client!eh", name = "sb", descriptor = "[I")
    public static int[] field1075 = new int[128];

    @OriginalMember(owner = "client!eh", name = "ub", descriptor = "Loc;")
    public static class151 field1077 = class137.method873(2, "und haben es deaktiviert)3 Klicken Sie auf der");

    @OriginalMember(owner = "client!eh", name = "xb", descriptor = "Loc;")
    private static class151 field1080 = class137.method873(2, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

    @OriginalMember(owner = "client!eh", name = "zb", descriptor = "I")
    public static int field1082 = 0;

    @OriginalMember(owner = "client!eh", name = "tb", descriptor = "Loc;")
    public static class151 field1076 = field1080;

    @OriginalMember(owner = "client!eh", name = "wb", descriptor = "Lea;")
    public static class46 field1079 = new class46();

    @OriginalMember(owner = "client!eh", name = "ib", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!eh", name = "lb", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!eh", name = "ob", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!eh", name = "pb", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!eh", name = "qb", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!eh", name = "vb", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!eh", name = "yb", descriptor = "[Lcg;")
    public static class30[] field1081;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "(I)V")
    public static void method363(int arg0) {
        field1079 = null;
        field1074 = null;
        field1064 = null;
        field1075 = null;
        field1076 = null;
        if (arg0 != -1) {
            method364(-82, 13, 42, (class232[]) null, 54);
        }
        field1081 = null;
        field1080 = null;
        field1077 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IILwa;)V")
    public final void method13(int arg0, int arg1, class229 arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 == -4) {
                        this.field1063 = arg2.method1490((byte) 73);
                    }
                } else {
                    this.field1066 = arg2.method1490((byte) 73);
                }
            } else {
                this.field1070 = arg2.method1490((byte) 73);
            }
        } else {
            this.field1069 = arg2.method1490((byte) 73);
        }
        if (arg0 != 0) {
            this.method11((byte) 75, -123);
        }
        ++field1073;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BI)[I")
    public final int[] method11(byte arg0, int arg1) {
        int[] var3 = super.field21.method1182(arg1, -31709);
        ++field1065;
        if (arg0 != 107) {
            field1067 = -125;
        }
        if (super.field21.field3388) {
            for (int var4 = 0; ~class202.field3603 < ~var4; ++var4) {
                int var5 = (class195.field3477[var4] << 12) / this.field1069 - -this.field1066;
                int var6 = (class23.field509[arg1] << 12) / this.field1069 + this.field1063;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (~(var11 - -var12) > -16385 && this.field1070 > var13) {
                    ++var13;
                    var10 = (var9 * var10 >> 12) * 2 - -var8;
                    var9 = -var12 + var11 + var7;
                    var12 = var10 * var10 >> 12;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = var13 >= this.field1070 - 1 ? 0 : (var13 << 12) / this.field1070;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(III[Lwd;I)V")
    public static final void method364(int arg0, int arg1, int arg2, class232[] arg3, int arg4) {
        ++field1068;
        for (int var5 = arg4; ~var5 > ~arg3.length; ++var5) {
            class232 var6 = arg3[var5];
            if (var6 != null && ~var6.field4156 == ~arg1) {
                if (var6.field4147 == 0) {
                    var6.field4215 = var6.field4252;
                } else if (var6.field4147 == 1) {
                    var6.field4215 = -var6.field4252 + arg2;
                } else if (var6.field4147 == 2) {
                    var6.field4215 = var6.field4252 * arg2 >> 14;
                } else if (var6.field4147 == 3) {
                    if (var6.field4173 != 2) {
                        if (~var6.field4173 == -8) {
                            var6.field4215 = (var6.field4252 + -1) * var6.field4219 + var6.field4252 * 115;
                        }
                    } else {
                        var6.field4215 = (var6.field4252 + -1) * var6.field4219 + var6.field4252 * 32;
                    }
                }
                if (var6.field4246 == 0) {
                    var6.field4191 = var6.field4210;
                } else if (~var6.field4246 == -2) {
                    var6.field4191 = (arg2 - var6.field4215) / 2 + var6.field4210;
                } else if (~var6.field4246 == -3) {
                    var6.field4191 = arg2 - (var6.field4215 - -var6.field4210);
                } else if (~var6.field4246 == -4) {
                    var6.field4191 = var6.field4210 * arg2 >> 14;
                } else if (~var6.field4246 != -5) {
                    var6.field4191 = -var6.field4215 + arg2 + -(var6.field4210 * arg2 >> 14);
                } else {
                    var6.field4191 = (var6.field4210 * arg2 >> 14) + (arg2 - var6.field4215) / 2;
                }
                if (~(-var6.field4215 + var6.field4244) > ~var6.field4137) {
                    var6.field4137 = -var6.field4215 + var6.field4244;
                }
                if (var6.field4137 < 0) {
                    var6.field4137 = 0;
                }
                if (var6.field4141 != 0) {
                    if (~var6.field4141 == -2) {
                        var6.field4216 = -var6.field4205 + arg0;
                    } else if (var6.field4141 == 2) {
                        var6.field4216 = var6.field4205 * arg0 >> 14;
                    } else if (var6.field4141 == 3) {
                        if (var6.field4173 != 2) {
                            if (var6.field4173 == 7) {
                                var6.field4216 = (var6.field4205 + -1) * var6.field4233 + var6.field4205 * 12;
                            }
                        } else {
                            var6.field4216 = (var6.field4205 + -1) * var6.field4233 + var6.field4205 * 32;
                        }
                    }
                } else {
                    var6.field4216 = var6.field4205;
                }
                if (~var6.field4136 == -1) {
                    var6.field4154 = var6.field4131;
                } else if (var6.field4136 != 1) {
                    if (~var6.field4136 == -3) {
                        var6.field4154 = -var6.field4216 + arg0 + -var6.field4131;
                    } else if (var6.field4136 != 3) {
                        if (~var6.field4136 == -5) {
                            var6.field4154 = (var6.field4131 * arg0 >> 14) + (arg0 - var6.field4216) / 2;
                        } else {
                            var6.field4154 = -(var6.field4131 * arg0 >> 14) + arg0 - var6.field4216;
                        }
                    } else {
                        var6.field4154 = var6.field4131 * arg0 >> 14;
                    }
                } else {
                    var6.field4154 = (-var6.field4216 + arg0) / 2 - -var6.field4131;
                }
                if (~(-var6.field4216 + var6.field4194) > ~var6.field4195) {
                    var6.field4195 = -var6.field4216 + var6.field4194;
                }
                if (~var6.field4195 > -1) {
                    var6.field4195 = 0;
                }
                if (~var6.field4173 == -1) {
                    class110.method665(var6, (byte) -117);
                }
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II[Lwd;IIIIIII)V")
    public static final void method365(int arg0, int arg1, class232[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class221.method1386(arg1, arg6, arg5, arg7);
        class61.method404();
        ++field1072;
        if (arg4 != 5315) {
            field1082 = -41;
        }
        for (int var10 = 0; ~arg2.length < ~var10; ++var10) {
            class232 var11 = arg2[var10];
            if (var11 != null && (~var11.field4156 == ~arg3 || ~arg3 == 1412584498 && class222.field3860 == var11)) {
                int var12;
                if (~arg0 != 0) {
                    var12 = arg0;
                } else {
                    class222.field3858[class147.field2628] = var11.field4191 + arg9;
                    class192.field3407[class147.field2628] = var11.field4154 + arg8;
                    class121.field2176[class147.field2628] = var11.field4215;
                    class210.field3679[class147.field2628] = var11.field4216;
                    var12 = class147.field2628++;
                }
                var11.field4175 = class200.field3541;
                var11.field4264 = var12;
                if (!var11.field4237 || !class16.method133(11804, var11)) {
                    if (~var11.field4148 < -1) {
                        class32.method235(false, var11);
                    }
                    int var13 = var11.field4191 - -arg9;
                    int var14 = var11.field4154 - -arg8;
                    int var15 = var11.field4271;
                    if (class8.field124 && (class174.method1110(true, var11) != 0 || var11.field4173 == 0) && ~var15 < -128) {
                        var15 = 127;
                    }
                    if (class222.field3860 == var11) {
                        if (arg3 != -1412584499 && !var11.field4280) {
                            class82.field1559 = arg9;
                            class39.field794 = arg2;
                            class191.field3378 = arg8;
                            continue;
                        }
                        if (!var11.field4280) {
                            var15 = 128;
                        }
                        if (class190.field3358 && class222.field3844) {
                            int var16 = class41.field857;
                            int var17 = class57.field1149;
                            int var18 = var16 - class31.field646;
                            int var19 = var17 - class2.field59;
                            if (~var18 > ~class215.field3761) {
                                var18 = class215.field3761;
                            }
                            if (~class144.field2601 < ~var19) {
                                var19 = class144.field2601;
                            }
                            if (var11.field4215 + var19 > class144.field2601 + class63.field1227.field4215) {
                                var19 = -var11.field4215 + class144.field2601 - -class63.field1227.field4215;
                            }
                            var13 = var19;
                            if (~(class215.field3761 - -class63.field1227.field4216) > ~(var11.field4216 + var18)) {
                                var18 = class215.field3761 + class63.field1227.field4216 + -var11.field4216;
                            }
                            var14 = var18;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (~var11.field4173 == -3) {
                        var20 = arg7;
                        var21 = arg6;
                        var22 = arg1;
                        var23 = arg5;
                    } else {
                        var21 = arg6 < var14 ? var14 : arg6;
                        int var24 = var14 - -var11.field4216;
                        var22 = arg1 >= var13 ? arg1 : var13;
                        int var25 = var11.field4215 + var13;
                        if (var11.field4173 == 9) {
                            ++var24;
                            ++var25;
                        }
                        var20 = ~arg7 < ~var24 ? var24 : arg7;
                        var23 = ~var25 <= ~arg5 ? arg5 : var25;
                    }
                    if (!var11.field4237 || ~var23 < ~var22 && var20 > var21) {
                        if (~var11.field4148 != -1) {
                            if (~var11.field4148 == -1338) {
                                class182.field3300 = var14;
                                class234.field4317 = var13;
                                class185.method1150(var11.field4216, var11.field4215, var14, false, var13);
                                class221.method1386(arg1, arg6, arg5, arg7);
                                continue;
                            }
                            if (var11.field4148 == 1338) {
                                if (var11.method1521((byte) 92)) {
                                    class2.method20(var12, (byte) -55, var13, var11, var14);
                                    class221.method1386(arg1, arg6, arg5, arg7);
                                }
                                continue;
                            }
                            if (~var11.field4148 == -1340) {
                                if (var11.method1521((byte) 92)) {
                                    class74.method486(var11, var12, false, var14, var13);
                                    class221.method1386(arg1, arg6, arg5, arg7);
                                }
                                continue;
                            }
                            if (var11.field4148 == 1400) {
                                class149.method949(var13, 28466, var14, var11.field4216, var11.field4215);
                                class224.field3911[var12] = true;
                                class63.field1234[var12] = true;
                                class221.method1386(arg1, arg6, arg5, arg7);
                            }
                            if (~var11.field4148 == -1402) {
                                class26.method205(var11.field4216, var11.field4215, var14, (byte) -106, var13);
                                class224.field3911[var12] = true;
                                class63.field1234[var12] = true;
                                class221.method1386(arg1, arg6, arg5, arg7);
                                continue;
                            }
                        }
                        int var26 = class57.field1149;
                        int var27 = class41.field857;
                        if (!class225.field3917 && var22 <= var26 && ~var21 >= ~var27 && ~var23 < ~var26 && var27 < var20) {
                            class179.method1134(-var13 + var26, var11, -56, -var14 + var27);
                        }
                        if (var11.field4173 == 0) {
                            if (!var11.field4237 && class16.method133(11804, var11) && class231.field4116 != var11) {
                                continue;
                            }
                            if (!var11.field4237) {
                                if (~var11.field4195 < ~(-var11.field4216 + var11.field4194)) {
                                    var11.field4195 = var11.field4194 - var11.field4216;
                                }
                                if (var11.field4195 < 0) {
                                    var11.field4195 = 0;
                                }
                            }
                            method365(var12, var22, arg2, var11.field4261, 5315, var23, var21, var20, var14 - var11.field4195, -var11.field4137 + var13);
                            if (var11.field4239 != null) {
                                method365(var12, var22, var11.field4239, var11.field4261, arg4, var23, var21, var20, -var11.field4195 + var14, -var11.field4137 + var13);
                            }
                            class147 var28 = (class147) class227.field3961.method1538((long) var11.field4261, (byte) 127);
                            if (var28 != null) {
                                if (~var28.field2630 == -1 && ~var22 >= ~class57.field1149 && ~var21 >= ~class41.field857 && var23 > class57.field1149 && ~var20 < ~class41.field857 && !class225.field3917 && !class8.field124) {
                                    class117.field2108 = 1;
                                    class185.field3316[0] = 1002;
                                    class182.field3305[0] = class205.field3634;
                                    class225.field3916[0] = class134.field2441;
                                }
                                class90.method575(var22, var28.field2631, var23, (byte) -91, var12, var14, var13, var20, var21);
                            }
                            class221.method1386(arg1, arg6, arg5, arg7);
                            class61.method404();
                        }
                        if (~var11.field4148 != -1401 && (class48.field989[var12] || class169.field3081 > 1)) {
                            if (var11.field4173 == 0 && !var11.field4237 && ~var11.field4194 < ~var11.field4216) {
                                class195.method1224(var11.field4216, var14, var11.field4195, var13 - -var11.field4215, -1885, var11.field4194);
                            }
                            if (var11.field4173 != 1) {
                                if (~var11.field4173 == -3) {
                                    int var29 = 0;
                                    for (int var30 = 0; ~var11.field4205 < ~var30; ++var30) {
                                        for (int var31 = 0; ~var31 > ~var11.field4252; ++var31) {
                                            int var32 = (var11.field4219 + 32) * var31 + var13;
                                            int var33 = var14 - -((var11.field4233 + 32) * var30);
                                            if (var29 < 20) {
                                                var33 += var11.field4155[var29];
                                                var32 += var11.field4274[var29];
                                            }
                                            if (~var11.field4248[var29] >= -1) {
                                                if (var11.field4279 != null && var29 < 20) {
                                                    class84 var34 = var11.method1518(var29, 0);
                                                    if (var34 == null) {
                                                        if (class110.field1947) {
                                                            class27.method208(true, var11);
                                                        }
                                                    } else {
                                                        var34.method545(var32, var33);
                                                    }
                                                }
                                            } else {
                                                boolean var35 = false;
                                                boolean var36 = false;
                                                int var37 = var11.field4248[var29] + -1;
                                                if (arg1 < var32 - -32 && arg5 > var32 && ~(var33 + 32) < ~arg6 && arg7 > var33 || class151.field2700 == var11 && class66.field1267 == var29) {
                                                    class84 var38;
                                                    if (~class166.field3017 == -2 && class4.field78 == var29 && class178.field3209 == var11.field4261) {
                                                        var38 = class99.method611((byte) -105, 0, var37, var11.field4179, false, false, 2, var11.field4199[var29]);
                                                    } else {
                                                        var38 = class99.method611((byte) -105, 3153952, var37, var11.field4179, false, false, 1, var11.field4199[var29]);
                                                    }
                                                    if (var38 == null) {
                                                        class27.method208(true, var11);
                                                    } else if (class151.field2700 == var11 && ~class66.field1267 == ~var29) {
                                                        int var39 = -class58.field1156 + class41.field857;
                                                        if (~var39 > -6 && ~var39 < 4) {
                                                            var39 = 0;
                                                        }
                                                        int var40 = -class8.field129 + class57.field1149;
                                                        if (~var40 > -6 && var40 > -5) {
                                                            var40 = 0;
                                                        }
                                                        if (~class21.field459 > -6) {
                                                            var39 = 0;
                                                            var40 = 0;
                                                        }
                                                        var38.method534(var32 - -var40, var33 - -var39, 128);
                                                        if (arg3 != -1) {
                                                            class232 var41 = arg2[65535 & arg3];
                                                            int var42 = class221.field3836;
                                                            int var43 = class221.field3835;
                                                            if (var43 > var33 + var39 && var41.field4195 > 0) {
                                                                int var44 = (var43 - var39 + -var33) * class181.field3273 / 3;
                                                                if (var44 > class181.field3273 * 10) {
                                                                    var44 = class181.field3273 * 10;
                                                                }
                                                                if (var44 > var41.field4195) {
                                                                    var44 = var41.field4195;
                                                                }
                                                                class58.field1156 += var44;
                                                                var41.field4195 -= var44;
                                                                class27.method208(true, var41);
                                                            }
                                                            if (var42 < var39 + 32 + var33 && ~var41.field4195 > ~(-var41.field4216 + var41.field4194)) {
                                                                int var45 = (var33 + 32 - -var39 + -var42) * class181.field3273 / 3;
                                                                if (var45 > class181.field3273 * 10) {
                                                                    var45 = class181.field3273 * 10;
                                                                }
                                                                if (~(-var41.field4216 + var41.field4194 + -var41.field4195) > ~var45) {
                                                                    var45 = -var41.field4216 - var41.field4195 + var41.field4194;
                                                                }
                                                                class58.field1156 -= var45;
                                                                var41.field4195 += var45;
                                                                class27.method208(true, var41);
                                                            }
                                                        }
                                                    } else if (class164.field2962 == var11 && ~class205.field3638 == ~var29) {
                                                        var38.method534(var32, var33, 128);
                                                    } else {
                                                        var38.method545(var32, var33);
                                                    }
                                                }
                                            }
                                            ++var29;
                                        }
                                    }
                                } else if (~var11.field4173 == -4) {
                                    int var46;
                                    if (!class219.method1368(2, var11)) {
                                        var46 = var11.field4243;
                                        if (class231.field4116 == var11 && ~var11.field4204 != -1) {
                                            var46 = var11.field4204;
                                        }
                                    } else {
                                        var46 = var11.field4162;
                                        if (class231.field4116 == var11 && var11.field4153 != 0) {
                                            var46 = var11.field4153;
                                        }
                                    }
                                    if (~var15 == -1) {
                                        if (var11.field4144) {
                                            class221.method1375(var13, var14, var11.field4215, var11.field4216, var46);
                                        } else {
                                            class221.method1374(var13, var14, var11.field4215, var11.field4216, var46);
                                        }
                                    } else if (!var11.field4144) {
                                        class221.method1372(var13, var14, var11.field4215, var11.field4216, var46, -(var15 & 255) + 256);
                                    } else {
                                        class221.method1384(var13, var14, var11.field4215, var11.field4216, var46, -(255 & var15) + 256);
                                    }
                                } else if (var11.field4173 == 4) {
                                    class105 var47 = var11.method1519(-1486, class160.field2882);
                                    if (var47 == null) {
                                        if (class110.field1947) {
                                            class27.method208(true, var11);
                                        }
                                    } else {
                                        class151 var48 = var11.field4182;
                                        int var49;
                                        if (class219.method1368(2, var11)) {
                                            var49 = var11.field4162;
                                            if (class231.field4116 == var11 && var11.field4153 != 0) {
                                                var49 = var11.field4153;
                                            }
                                            if (~var11.field4209.method988(-1) < -1) {
                                                var48 = var11.field4209;
                                            }
                                        } else {
                                            var49 = var11.field4243;
                                            if (class231.field4116 == var11 && ~var11.field4204 != -1) {
                                                var49 = var11.field4204;
                                            }
                                        }
                                        if (var11.field4237 && ~var11.field4129 != 0) {
                                            class12 var50 = class43.method311(var11.field4129, 0);
                                            var48 = var50.field241;
                                            if (var48 == null) {
                                                var48 = class179.field3226;
                                            }
                                            if ((~var50.field266 == -2 || var11.field4186 != 1) && ~var11.field4186 != 0) {
                                                var48 = class126.method761(new class151[] { class52.field1053, var48, class7.field116, class115.method699(-10, var11.field4186) }, 10260);
                                            }
                                        }
                                        if (class7.field113 == var11) {
                                            var49 = var11.field4243;
                                            var48 = class36.field754;
                                        }
                                        if (!var11.field4237) {
                                            var48 = class27.method209(var48, (byte) -124, var11);
                                        }
                                        var47.method1277(var48, var13, var14, var11.field4215, var11.field4216, var49, !var11.field4135 ? -1 : 0, var11.field4265, var11.field4140, var11.field4241);
                                    }
                                } else if (~var11.field4173 == -6) {
                                    if (!var11.field4237) {
                                        class84 var59 = var11.method1514(class219.method1368(2, var11), (byte) -106);
                                        if (var59 != null) {
                                            var59.method545(var13, var14);
                                        } else if (class110.field1947) {
                                            class27.method208(true, var11);
                                        }
                                    } else {
                                        class84 var51;
                                        if (~var11.field4129 == 0) {
                                            var51 = var11.method1514(false, (byte) 48);
                                        } else {
                                            var51 = class99.method611((byte) -105, var11.field4260, var11.field4129, var11.field4179, false, false, var11.field4231, var11.field4186);
                                        }
                                        if (var51 == null) {
                                            if (class110.field1947) {
                                                class27.method208(true, var11);
                                            }
                                        } else {
                                            int var52 = var51.field1588;
                                            int var53 = var51.field1592;
                                            if (!var11.field4257) {
                                                int var54 = var11.field4215 * 4096 / var52;
                                                if (var11.field4258 != 0) {
                                                    var51.method547(var11.field4215 / 2 + var13, var11.field4216 / 2 + var14, var11.field4258, var54);
                                                } else if (var15 == 0) {
                                                    if (~var11.field4215 == ~var52 && ~var11.field4216 == ~var53) {
                                                        var51.method545(var13, var14);
                                                    } else {
                                                        var51.method542(var13, var14, var11.field4215, var11.field4216);
                                                    }
                                                } else {
                                                    var51.method555(var13, var14, var11.field4215, var11.field4216, -(var15 & 255) + 256);
                                                }
                                            } else {
                                                int var55 = (var52 - 1 + var11.field4215) / var52;
                                                int var56 = (var11.field4216 - (-var53 + 1)) / var53;
                                                class221.method1379(var13, var14, var11.field4215 + var13, var14 - -var11.field4216);
                                                for (int var57 = 0; ~var55 < ~var57; ++var57) {
                                                    for (int var58 = 0; var58 < var56; ++var58) {
                                                        if (var11.field4258 != 0) {
                                                            var51.method547(var52 * var57 + var13 - -(var52 / 2), var53 / 2 + var14 - -(var53 * var58), var11.field4258, 4096);
                                                        } else if (~var15 != -1) {
                                                            var51.method534(var52 * var57 + var13, var14 - -(var53 * var58), -(var15 & 255) + 256);
                                                        } else {
                                                            var51.method545(var52 * var57 + var13, var53 * var58 + var14);
                                                        }
                                                    }
                                                }
                                                class221.method1386(arg1, arg6, arg5, arg7);
                                            }
                                        }
                                    }
                                } else if (var11.field4173 == 6) {
                                    boolean var60 = class219.method1368(2, var11);
                                    int var61;
                                    if (var60) {
                                        var61 = var11.field4212;
                                    } else {
                                        var61 = var11.field4270;
                                    }
                                    int var62 = 0;
                                    class18 var63 = null;
                                    if (~var11.field4129 == 0) {
                                        if (var11.field4149 != 5) {
                                            if (var61 == -1) {
                                                var63 = var11.method1523((class115) null, arg4 + -5188, class228.field3975.field439, var60, -1);
                                                if (var63 == null && class110.field1947) {
                                                    class27.method208(true, var11);
                                                }
                                            } else {
                                                class115 var64 = class197.method1233(-102, var61);
                                                var63 = var11.method1523(var64, 126, class228.field3975.field439, var60, var11.field4150);
                                                if (var63 == null && class110.field1947) {
                                                    class27.method208(true, var11);
                                                }
                                            }
                                        } else if (~var11.field4165 != 0) {
                                            int var65 = 2047 & var11.field4165;
                                            if (~class163.field2943 == ~var65) {
                                                var65 = 2047;
                                            }
                                            class20 var66 = class179.field3229[var65];
                                            class115 var67 = var61 == -1 ? null : class197.method1233(-101, var61);
                                            if (var66 != null && (int) var66.field416.method981(false) << 11 == (-2048 & var11.field4165)) {
                                                var63 = var66.field439.method309(var11.field4150, 0, (class115) null, var67, arg4 ^ -5294);
                                            }
                                        } else {
                                            var63 = class31.field638.method309(-1, -1, (class115) null, (class115) null, -122);
                                        }
                                    } else {
                                        class12 var68 = class43.method311(var11.field4129, 0);
                                        if (var68 != null) {
                                            class12 var69 = var68.method87(-120, var11.field4186);
                                            var63 = var69.method86((class115) null, (byte) -51, 0, 1);
                                            if (var63 == null) {
                                                class27.method208(true, var11);
                                            } else {
                                                var62 = -var63.method74() / 2;
                                            }
                                        }
                                    }
                                    if (var63 != null) {
                                        int var70;
                                        if (var11.field4178 <= 0) {
                                            var70 = 256;
                                        } else {
                                            var70 = (var11.field4216 << 8) / var11.field4178;
                                        }
                                        int var71 = (var11.field4273 * var70 >> 8) + (var14 - -(var11.field4216 / 2));
                                        int var72;
                                        if (~var11.field4225 < -1) {
                                            var72 = (var11.field4215 << 8) / var11.field4225;
                                        } else {
                                            var72 = 256;
                                        }
                                        int var73 = var11.field4215 / 2 + var13 - -(var11.field4208 * var72 >> 8);
                                        class61.method419(var73, var71);
                                        int var74 = class61.field1191[var11.field4251] * var11.field4249 >> 16;
                                        int var75 = class61.field1208[var11.field4251] * var11.field4249 >> 16;
                                        if (var11.field4237) {
                                            if (!var11.field4132) {
                                                var63.method162(0, var11.field4269, var11.field4230, var11.field4251, var11.field4213, var11.field4130 + var74 - -var62, var75 - -var11.field4130);
                                            } else {
                                                ((class76) var63).method492(0, var11.field4269, var11.field4230, var11.field4251, var11.field4213, var62 + var74 - -var11.field4130, var11.field4130 + var75, var11.field4249);
                                            }
                                        } else {
                                            var63.method162(0, var11.field4269, 0, var11.field4251, 0, var74, var75);
                                        }
                                        class61.method411();
                                    }
                                } else {
                                    if (var11.field4173 == 7) {
                                        class105 var76 = var11.method1519(-1486, class160.field2882);
                                        if (var76 == null) {
                                            if (class110.field1947) {
                                                class27.method208(true, var11);
                                            }
                                            continue;
                                        }
                                        int var77 = 0;
                                        for (int var78 = 0; var11.field4205 > var78; ++var78) {
                                            for (int var79 = 0; var11.field4252 > var79; ++var79) {
                                                if (var11.field4248[var77] > 0) {
                                                    class12 var80 = class43.method311(var11.field4248[var77] - 1, arg4 ^ 5315);
                                                    class151 var81;
                                                    if (~var80.field266 != -2 && var11.field4199[var77] == 1) {
                                                        var81 = class126.method761(new class151[] { class52.field1053, var80.field241, class8.field132 }, 10260);
                                                    } else {
                                                        var81 = class126.method761(new class151[] { class52.field1053, var80.field241, class7.field116, class115.method699(-10, var11.field4199[var77]) }, arg4 + 4945);
                                                    }
                                                    int var82 = (var11.field4219 + 115) * var79 + var13;
                                                    int var83 = (var11.field4233 + 12) * var78 + var14;
                                                    if (var11.field4265 != 0) {
                                                        if (var11.field4265 != 1) {
                                                            var76.method1261(var81, var82 + -1 + 115, var83, var11.field4243, !var11.field4135 ? -1 : 0);
                                                        } else {
                                                            var76.method1254(var81, var82 + 57, var83, var11.field4243, !var11.field4135 ? -1 : 0);
                                                        }
                                                    } else {
                                                        var76.method1256(var81, var82, var83, var11.field4243, !var11.field4135 ? -1 : 0);
                                                    }
                                                }
                                                ++var77;
                                            }
                                        }
                                    }
                                    if (~var11.field4173 == -9 && class79.field1524 == var11 && ~class114.field2033 == ~class101.field1838) {
                                        int var84 = 0;
                                        int var85 = 0;
                                        class151 var86 = var11.field4182;
                                        class105 var87 = class227.field3955;
                                        class151 var88 = class27.method209(var86, (byte) -127, var11);
                                        while (var88.method988(arg4 ^ -5316) > 0) {
                                            int var96 = var88.method990(class5.field99, (byte) 80);
                                            class151 var97;
                                            if (~var96 == 0) {
                                                var97 = var88;
                                                var88 = class134.field2441;
                                            } else {
                                                var97 = var88.method987((byte) 118, var96, 0);
                                                var88 = var88.method989(var96 + 4, (byte) -62);
                                            }
                                            int var98 = var87.method1259(var97);
                                            if (~var84 > ~var98) {
                                                var84 = var98;
                                            }
                                            var85 += var87.field3563 + 1;
                                        }
                                        var84 += 6;
                                        var85 += 7;
                                        int var89 = var13 + -5 - (-var11.field4215 - -var84);
                                        if (var13 + 5 > var89) {
                                            var89 = var13 + 5;
                                        }
                                        int var90 = var14 + 5 + var11.field4216;
                                        if (~(var90 - -var85) < ~arg7) {
                                            var90 = -var85 + arg7;
                                        }
                                        if (var84 + var89 > arg5) {
                                            var89 = arg5 - var84;
                                        }
                                        class221.method1375(var89, var90, var84, var85, 16777120);
                                        class221.method1374(var89, var90, var84, var85, 0);
                                        int var91 = var87.field3563 + 2 + var90;
                                        class151 var92 = var11.field4182;
                                        class151 var93 = class27.method209(var92, (byte) -125, var11);
                                        while (var93.method988(-1) > 0) {
                                            int var94 = var93.method990(class5.field99, (byte) 10);
                                            class151 var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = class134.field2441;
                                            } else {
                                                var95 = var93.method987((byte) 120, var94, 0);
                                                var93 = var93.method989(var94 + 4, (byte) -62);
                                            }
                                            var87.method1256(var95, var89 - -3, var91, 0, -1);
                                            var91 += var87.field3563 + 1;
                                        }
                                    }
                                    if (~var11.field4173 == -10) {
                                        int var99;
                                        int var100;
                                        int var101;
                                        int var102;
                                        if (var11.field4158) {
                                            var99 = var11.field4215 + var13;
                                            var100 = var11.field4216 + var14;
                                            var101 = var13;
                                            var102 = var14;
                                        } else {
                                            var101 = var13;
                                            var102 = var11.field4216 + var14;
                                            var99 = var11.field4215 + var13;
                                            var100 = var14;
                                        }
                                        if (var11.field4180 == 1) {
                                            class221.method1393(var101, var100, var99, var102, var11.field4243);
                                        } else {
                                            class221.method1378(var101, var100, var99, var102, var11.field4243, var11.field4180);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IZ)I")
    public static final int method366(int arg0, boolean arg1) {
        if (arg1) {
            field1064 = null;
        }
        ++field1071;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
    public class53() {
        super(0, true);
    }
}
