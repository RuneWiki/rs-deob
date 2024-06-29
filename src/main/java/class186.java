import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class186 extends class82 {

    @OriginalMember(owner = "client!bd", name = "yc", descriptor = "I")
    public int field2917 = 0;

    @OriginalMember(owner = "client!bd", name = "Hc", descriptor = "I")
    public int field2926 = 0;

    @OriginalMember(owner = "client!bd", name = "Gc", descriptor = "I")
    public int field2925 = 0;

    @OriginalMember(owner = "client!bd", name = "Bc", descriptor = "I")
    public int field2920 = -1;

    @OriginalMember(owner = "client!bd", name = "vc", descriptor = "I")
    public int field2914 = -1;

    @OriginalMember(owner = "client!bd", name = "Lc", descriptor = "I")
    public int field2930 = 0;

    @OriginalMember(owner = "client!bd", name = "Qc", descriptor = "I")
    public int field2935 = -1;

    @OriginalMember(owner = "client!bd", name = "Ec", descriptor = "Z")
    public boolean field2923 = false;

    @OriginalMember(owner = "client!bd", name = "Pc", descriptor = "I")
    public int field2934 = -1;

    @OriginalMember(owner = "client!bd", name = "rc", descriptor = "I")
    private int field2910 = 0;

    @OriginalMember(owner = "client!bd", name = "uc", descriptor = "I")
    public int field2913 = -1;

    @OriginalMember(owner = "client!bd", name = "Rc", descriptor = "I")
    public int field2936 = 0;

    @OriginalMember(owner = "client!bd", name = "Vc", descriptor = "I")
    public int field2940 = -1;

    @OriginalMember(owner = "client!bd", name = "Xc", descriptor = "I")
    public int field2942 = -1;

    @OriginalMember(owner = "client!bd", name = "pc", descriptor = "Ljava/lang/String;")
    public static String field2908 = "Prepared sound engine";

    @OriginalMember(owner = "client!bd", name = "oc", descriptor = "[S")
    public static short[] field2907 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!bd", name = "Ac", descriptor = "[Lid;")
    public static class149[] field2919 = new class149[28];

    @OriginalMember(owner = "client!bd", name = "Ic", descriptor = "Z")
    public static boolean field2927 = false;

    @OriginalMember(owner = "client!bd", name = "Oc", descriptor = "I")
    public static int field2933 = 0;

    @OriginalMember(owner = "client!bd", name = "Kc", descriptor = "I")
    public static int field2929 = 0;

    @OriginalMember(owner = "client!bd", name = "nc", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!bd", name = "qc", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!bd", name = "sc", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!bd", name = "wc", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!bd", name = "xc", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!bd", name = "zc", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!bd", name = "Cc", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!bd", name = "Dc", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!bd", name = "Jc", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!bd", name = "Mc", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!bd", name = "Nc", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!bd", name = "Sc", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!bd", name = "Tc", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!bd", name = "Uc", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!bd", name = "Wc", descriptor = "Lsc;")
    public class249 field2941;

    @OriginalMember(owner = "client!bd", name = "tc", descriptor = "Ljava/lang/String;")
    public String field2912;

    @OriginalMember(owner = "client!bd", name = "Fc", descriptor = "[Ljh;")
    public static class284[] field2924;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "(I)[Lhc;")
    public static final class229[] method1290(int arg0) {
        ++field2938;
        class229[] var1 = new class229[class35.field454];
        for (int var2 = 0; class35.field454 > var2; ++var2) {
            int var3 = class236.field3777[var2] * class228.field3696[var2];
            byte[] var4 = class101.field1574[var2];
            if (!class80.field1148[var2]) {
                int[] var5 = new int[var3];
                for (int var6 = 0; ~var6 > ~var3; ++var6) {
                    var5[var6] = class72.field1023[class224.method1526(255, var4[var6])];
                }
                var1[var2] = new class12(class46.field583, class209.field3253, class206.field3221[var2], class226.field3653[var2], class236.field3777[var2], class228.field3696[var2], var5);
            } else {
                int[] var7 = new int[var3];
                byte[] var8 = class37.field496[var2];
                for (int var9 = 0; ~var3 < ~var9; ++var9) {
                    var7[var9] = class120.method787(class72.field1023[class224.method1526(255, var4[var9])], class224.method1526(var8[var9] << 24, -16777216));
                }
                var1[var2] = new class183(class46.field583, class209.field3253, class206.field3221[var2], class226.field3653[var2], class236.field3777[var2], class228.field3696[var2], var7);
            }
        }
        if (arg0 != 255) {
            field2919 = null;
        }
        class222.method1506((byte) -58);
        return var1;
    }

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "(I)Ljava/lang/String;")
    public final String method1291(int arg0) {
        ++field2928;
        if (arg0 != 16) {
            this.field2934 = 42;
        }
        String var2 = this.field2912;
        if (class82.field1205 != null) {
            var2 = class82.field1205[this.field2910] + var2;
        }
        if (class50.field653 != null) {
            var2 = var2 + class50.field653[this.field2910];
        }
        return var2;
    }

    @OriginalMember(owner = "client!bd", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field2909;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "()I")
    public final int method363() {
        ++field2937;
        return super.field1228;
    }

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)Z")
    public final boolean method409(int arg0) {
        ++field2906;
        if (arg0 != 0) {
            this.field2936 = 92;
        }
        return this.field2941 != null;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)I")
    public final int method565(byte arg0) {
        ++field2939;
        if (arg0 != 0) {
            this.field2923 = false;
        }
        return this.field2941 != null && ~this.field2941.field3993 != 0 ? class252.method1691(this.field2941.field3993, (byte) 101).field2012 : super.method565((byte) 0);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIIIIIJILql;)V")
    public final void method373(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class217 arg10) {
        ++field2932;
        if (this.field2941 != null) {
            class198 var13 = ~super.field1252 != 0 && super.field1287 == 0 ? class104.method688(super.field1252, 30091) : null;
            class198 var14 = super.field1196 == -1 || this.field2923 || super.field1196 == this.method564(-87).field1319 && var13 != null ? null : class104.method688(super.field1196, 30091);
            class114 var15 = this.field2941.method1673(super.field1244, -121, var14, super.field1214, super.field1236, super.field1288, super.field1291, super.field1215, super.field1249, true, var13);
            int var16 = class258.method1772(1400618188);
            if (class165.field2562 != 0 && ~var16 > -51) {
                int var17 = -var16 + 50;
                while (var17 > class172.field2692) {
                    class40.field551[class172.field2692] = new byte[102400];
                    ++class172.field2692;
                }
                while (~var17 > ~class172.field2692) {
                    --class172.field2692;
                    class40.field551[class172.field2692] = null;
                }
            }
            if (var15 != null) {
                super.field1228 = var15.method363();
                if (class50.field693 && (~this.field2941.field3993 == 0 || class252.method1691(this.field2941.field3993, (byte) 110).field1971)) {
                    class114 var18 = method1292(240, arg0, 0, 160, super.field1226, 0, super.field1273, super.field1198, var14 != null ? var14 : var13, var15, var14 != null ? super.field1291 : super.field1288, 1063, super.field1207, 1);
                    var18.method373(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class217) null);
                }
                if (class149.field2227 == this) {
                    for (int var19 = class144.field2129.length + -1; ~var19 <= -1; --var19) {
                        class194 var20 = class144.field2129[var19];
                        if (var20 != null && ~var20.field3052 != 0) {
                            if (var20.field3050 == 1 && ~var20.field3045 <= -1 && ~var20.field3045 > ~class100.field1566.length) {
                                class56 var21 = class100.field1566[var20.field3045];
                                if (var21 != null) {
                                    int var22 = var21.field1226 / 32 + -(class149.field2227.field1226 / 32);
                                    int var23 = var21.field1273 / 32 + -(class149.field2227.field1273 / 32);
                                    this.method1296(arg1, arg6, var22, var23, arg3, (byte) -67, arg2, arg7, var20.field3052, var15, arg0, arg5, arg4, arg9, (class217) null);
                                }
                            }
                            if (~var20.field3050 == -3) {
                                int var24 = (-class246.field3943 + var20.field3047) * 4 + 2 + -(class149.field2227.field1273 / 32);
                                int var25 = (-class126.field1869 + var20.field3054) * 4 + -(class149.field2227.field1226 / 32) + 2;
                                this.method1296(arg1, arg6, var25, var24, arg3, (byte) -71, arg2, arg7, var20.field3052, var15, arg0, arg5, arg4, arg9, (class217) null);
                            }
                            if (var20.field3050 == 10 && var20.field3045 >= 0 && ~class153.field2277.length < ~var20.field3045) {
                                class186 var26 = class153.field2277[var20.field3045];
                                if (var26 != null) {
                                    int var27 = var26.field1226 / 32 + -(class149.field2227.field1226 / 32);
                                    int var28 = var26.field1273 / 32 + -(class149.field2227.field1273 / 32);
                                    this.method1296(arg1, arg6, var27, var28, arg3, (byte) -123, arg2, arg7, var20.field3052, var15, arg0, arg5, arg4, arg9, (class217) null);
                                }
                            }
                        }
                    }
                }
                this.method563((byte) 119, var15);
                this.method572(-74, arg0, var15);
                class114 var29 = null;
                if (!this.field2923 && ~super.field1280 != 0 && super.field1292 != -1) {
                    class70 var30 = class77.method521(super.field1280, (byte) -42);
                    var29 = var30.method473(super.field1292, (byte) -128, super.field1195, super.field1191);
                    if (var29 != null) {
                        var29.method753(0, -super.field1190, 0);
                        if (var30.field979) {
                            if (~class257.field4156 != -1) {
                                var29.method739(class257.field4156);
                            }
                            if (~field2933 != -1) {
                                var29.method733(field2933);
                            }
                            if (class123.field1830 != 0) {
                                var29.method753(0, class123.field1830, 0);
                            }
                        }
                    }
                }
                class114 var31 = null;
                if (!this.field2923 && super.field1269 != null) {
                    if (~super.field1259 >= ~class111.field1684) {
                        super.field1269 = null;
                    }
                    if (~super.field1251 >= ~class111.field1684 && super.field1259 > class111.field1684) {
                        if (super.field1269 instanceof class63) {
                            var31 = (class114) ((class63) super.field1269).method441((byte) -91);
                        } else {
                            var31 = (class114) super.field1269;
                        }
                        var31.method753(-super.field1226 + super.field1238, -super.field1198 + super.field1209, super.field1282 - super.field1273);
                        if (~super.field1211 != -513) {
                            if (~super.field1211 != -1025) {
                                if (~super.field1211 == -1537) {
                                    var31.method752();
                                }
                            } else {
                                var31.method746();
                            }
                        } else {
                            var31.method751();
                        }
                    }
                }
                if (var29 != null) {
                    var15 = ((class156) var15).method1053(var29);
                }
                if (var31 != null) {
                    var15 = ((class156) var15).method1053(var31);
                }
                var15.field1693 = true;
                var15.method373(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field1230);
                if (var31 != null) {
                    if (super.field1211 == 512) {
                        var31.method752();
                    } else if (super.field1211 != 1024) {
                        if (~super.field1211 == -1537) {
                            var31.method751();
                        }
                    } else {
                        var31.method746();
                    }
                    var31.method753(-super.field1238 + super.field1226, -super.field1209 + super.field1198, -super.field1282 + super.field1273);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIIIIILsi;Lua;IIZI)Lua;")
    public static final class114 method1292(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class198 arg8, class114 arg9, int arg10, int arg11, boolean arg12, int arg13) {
        ++field2922;
        long var14 = ((long) arg5 << 32) + ((long) ((arg0 << 24) + (arg13 - -(arg3 << 16))) - -((long) arg2 << 48));
        class114 var16 = (class114) class120.field1747.method1428(var14, (byte) -78);
        if (var16 == null) {
            byte var17;
            if (~arg13 == -2) {
                var17 = 9;
            } else if (arg13 != 2) {
                if (arg13 == 3) {
                    var17 = 15;
                } else if (arg13 != 4) {
                    var17 = 21;
                } else {
                    var17 = 18;
                }
            } else {
                var17 = 12;
            }
            int[] var18 = new int[] { 64, 96, 128 };
            byte var19 = 3;
            class160 var20 = new class160(var17 * var19 + 1, var17 * 2 * var19 + -var17, 0);
            int[][] var21 = new int[var19][var17];
            int var22 = var20.method1086(0, 0, 0);
            for (int var23 = 0; var23 < var19; ++var23) {
                int var30 = var18[var23];
                int var31 = var18[var23];
                for (int var32 = 0; var32 < var17; ++var32) {
                    int var33 = (var32 << 11) / var17;
                    int var34 = class171.field2675[var33] * var30 + arg4 >> 16;
                    int var35 = class171.field2680[var33] * var31 + arg6 >> 16;
                    var21[var23][var32] = var20.method1086(var34, 0, var35);
                }
            }
            for (int var24 = 0; ~var19 < ~var24; ++var24) {
                int var25 = (var24 * 256 + 128) / var19;
                int var26 = -var25 + 256;
                byte var27 = (byte) (arg0 * var25 + arg3 * var26 >> 8);
                short var28 = (short) (((127 & arg2) * var25 + (arg5 & 127) * var26 & 32512) + ((arg2 & 896) * var25 + (arg5 & 896) * var26 & 229376) + ((64512 & arg2) * var25 + (64512 & arg5) * var26 & 16515072) >> 8);
                for (int var29 = 0; var29 < var17; ++var29) {
                    if (~var24 != -1) {
                        var20.method1096(var21[var24 + -1][var29], var21[var24 + -1][(var29 + 1) % var17], var21[var24][(var29 - -1) % var17], (byte) 1, var28, var27);
                        var20.method1096(var21[var24 - 1][var29], var21[var24][(var29 + 1) % var17], var21[var24][var29], (byte) 1, var28, var27);
                    } else {
                        var20.method1096(var22, var21[0][(var29 + 1) % var17], var21[0][var29], (byte) 1, var28, var27);
                    }
                }
            }
            var16 = var20.method1076(64, 768, -50, -10, -50);
            class120.field1747.method1424(var14, var16, arg11 + -2003649350);
        }
        int var36 = arg13 * 64 + -1;
        int var37 = -var36;
        int var38 = var36;
        if (arg11 != 1063) {
            method1292(-68, -105, 125, -93, 4, -29, 51, 17, (class198) null, (class114) null, -90, 111, false, 32);
        }
        int var39 = arg9.method755();
        int var40 = arg9.method749();
        int var41 = -var36;
        int var42 = var36;
        int var43 = arg9.method736();
        if (arg12) {
            if (arg1 > 1664 || ~arg1 > -385) {
                var41 -= 128;
            }
            if (~arg1 < -641 && ~arg1 > -1409) {
                var42 = var36 + 128;
            }
            if (~arg1 < -1153 && arg1 < 1920) {
                var38 = var36 + 128;
            }
            if (arg1 > 128 && ~arg1 > -897) {
                var37 -= 128;
            }
        }
        if (~var40 < ~var38) {
            var40 = var38;
        }
        class218 var44 = null;
        int var45 = arg9.method748();
        if (~var39 > ~var37) {
            var39 = var37;
        }
        if (~var41 < ~var43) {
            var43 = var41;
        }
        if (arg8 != null) {
            int var46 = arg8.field3107[arg10];
            var44 = class262.method1800(var46 >> 16, -51);
            arg10 = var46 & 65535;
        }
        if (var45 > var42) {
            var45 = var42;
        }
        class114 var47;
        if (var44 == null) {
            var47 = var16.method743(true, true, true);
            var47.method747((-var39 + var40) / 2, 128, (-var43 + var45) / 2);
            var47.method753((var39 + var40) / 2, 0, (var43 + var45) / 2);
        } else {
            var47 = var16.method743(!var44.method1474(-107, arg10), !var44.method1471(arg10, 0), true);
            var47.method747((var40 - var39) / 2, 128, (var45 - var43) / 2);
            var47.method753((var39 + var40) / 2, 0, (var43 + var45) / 2);
            var47.method740(var44, arg10);
        }
        if (~arg1 != -1) {
            var47.method734(arg1);
        }
        class156 var48 = (class156) var47;
        if (arg7 != class99.method658(arg6 - -var43, class276.field4398, arg4 + var39, -7185) || class99.method658(arg6 + var45, class276.field4398, arg4 + var40, -7185) != arg7) {
            for (int var49 = 0; ~var48.field2346 < ~var49; ++var49) {
                var48.field2350[var49] += -arg7 + class99.method658(var48.field2360[var49] + arg6, class276.field4398, var48.field2363[var49] + arg4, -7185);
            }
            var48.field2371 = false;
        }
        return var47;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIII)V")
    public final void method370(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2916;
    }

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "(I)I")
    public final int method410(int arg0) {
        if (arg0 > -121) {
            field2907 = null;
        }
        ++field2911;
        return super.field1203;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(Llj;I)V")
    public final void method1293(class25 arg0, int arg1) {
        arg0.field349 = 0;
        int var3 = arg0.method201(255);
        int var4 = var3 & 1;
        ++field2931;
        int var5 = super.method565((byte) 0);
        this.method576(((62 & var3) >> 3) + 1, arg1 + -124);
        this.field2910 = (204 & var3) >> 6;
        boolean var6 = ~(4 & var3) != -1;
        super.field1226 += 64 * (-var5 + this.method565((byte) 0));
        int var7 = -1;
        super.field1273 += (-var5 + this.method565((byte) 0)) * 64;
        this.field2935 = arg0.method188(-116);
        this.field2942 = arg0.method188(arg1 + -99);
        this.field2936 = arg1;
        int[] var8 = new int[12];
        for (int var9 = 0; var9 < 12; ++var9) {
            int var10 = arg0.method201(255);
            if (var10 == 0) {
                var8[var9] = 0;
            } else {
                int var11 = arg0.method201(arg1 ^ 255);
                int var12 = (var10 << 8) + var11;
                if (~var9 == -1 && ~var12 == -65536) {
                    var7 = arg0.method190(-3);
                    this.field2936 = arg0.method201(255);
                    break;
                }
                if (~var12 <= -32769) {
                    int var24 = class126.field1867[var12 + -32768];
                    var8[var9] = class120.method787(var24, 1073741824);
                    int var25 = class162.method1112(var24, (byte) 106).field4053;
                    if (~var25 != -1) {
                        this.field2936 = var25;
                    }
                } else {
                    var8[var9] = class120.method787(var12 - 256, Integer.MIN_VALUE);
                }
            }
        }
        int[] var13 = new int[5];
        for (int var14 = 0; ~var14 > -6; ++var14) {
            int var23 = arg0.method201(255);
            if (var23 < 0 || ~class227.field3654[var14].length >= ~var23) {
                var23 = 0;
            }
            var13[var14] = var23;
        }
        super.field1203 = arg0.method190(-3);
        long var15 = arg0.method218(1728901472);
        this.field2912 = class75.method510(-8950, var15);
        this.field2917 = arg0.method201(255);
        if (var6) {
            this.field2926 = arg0.method190(-3);
            this.field2930 = this.field2917;
            this.field2940 = -1;
        } else {
            this.field2926 = 0;
            this.field2930 = arg0.method201(255);
            this.field2940 = arg0.method201(arg1 ^ 255);
            if (this.field2940 == 255) {
                this.field2940 = -1;
            }
        }
        int var17 = this.field2925;
        this.field2925 = arg0.method201(255);
        if (~this.field2925 == -1) {
            class172.method1215(arg1 ^ 126, this);
        } else {
            int var18 = this.field2920;
            int var19 = this.field2934;
            int var20 = this.field2914;
            int var21 = this.field2913;
            this.field2920 = arg0.method190(-3);
            this.field2934 = arg0.method190(arg1 ^ -3);
            this.field2914 = arg0.method190(-3);
            this.field2913 = arg0.method190(-3);
            if (this.field2925 != var17 || ~this.field2920 != ~var18 || ~this.field2934 != ~var19 || this.field2914 != var20 || this.field2913 != var21) {
                class250.method1685(this, -29387);
            }
        }
        if (this.field2941 == null) {
            this.field2941 = new class249();
        }
        int var22 = this.field2941.field3993;
        this.field2941.method1679(var13, arg1, var8, super.field1203, var7, ~var4 == -2);
        if (~var7 != ~var22) {
            super.field1226 = super.field1257[0] * 128 + this.method565((byte) 0) * 64;
            super.field1273 = super.field1272[0] * 128 - -(this.method565((byte) 0) * 64);
        }
        if (super.field1230 != null) {
            super.field1230.method1468();
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(III)Ljava/lang/String;")
    public static final String method1294(int arg0, int arg1, int arg2) {
        ++field2918;
        int var3 = -arg1 + arg0;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else {
            if (arg2 != 3930) {
                method1297(-121);
            }
            if (var3 > 9) {
                return "<col=00ff00>";
            } else if (~var3 < -7) {
                return "<col=40ff00>";
            } else if (var3 > 3) {
                return "<col=80ff00>";
            } else {
                return ~var3 < -1 ? "<col=c0ff00>" : "<col=ffff00>";
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIZ)V")
    public final void method1295(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg1 == 768) {
            ++field2915;
            super.method566(true, arg0, arg2, this.method565((byte) 0), arg3);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIIBIIILua;IIIILql;)V")
    private final void method1296(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, class114 arg9, int arg10, int arg11, int arg12, int arg13, class217 arg14) {
        if (arg5 < -56) {
            ++field2921;
            int var16 = arg2 * arg2 + arg3 * arg3;
            if (var16 >= 16 && ~var16 >= -360001) {
                int var17 = (int) (Math.atan2((double) arg2, (double) arg3) * 325.949D) & 2047;
                class114 var18 = class286.method1907(arg9, super.field1273, 121, var17, arg8, super.field1226, super.field1198);
                if (var18 != null) {
                    var18.method373(0, arg0, arg6, arg4, arg12, arg11, arg1, arg7, -1L, arg13, arg14);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "(I)V")
    public static void method1297(int arg0) {
        field2907 = null;
        field2924 = null;
        field2919 = null;
        if (arg0 != 1) {
            field2924 = null;
        }
        field2908 = null;
    }
}
