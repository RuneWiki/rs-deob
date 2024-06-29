import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class66 extends class264 {

    @OriginalMember(owner = "client!ri", name = "N", descriptor = "I")
    private int field1208 = 585;

    @OriginalMember(owner = "client!ri", name = "L", descriptor = "Lcf;")
    public static class93 field1206 = null;

    @OriginalMember(owner = "client!ri", name = "R", descriptor = "Lkk;")
    public static class232 field1212 = class69.method471((byte) -121);

    @OriginalMember(owner = "client!ri", name = "T", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1214 = Calendar.getInstance();

    @OriginalMember(owner = "client!ri", name = "W", descriptor = "Lcf;")
    private static class93 field1217 = class147.method1066("Close", -48);

    @OriginalMember(owner = "client!ri", name = "X", descriptor = "Lcf;")
    public static class93 field1218 = field1217;

    @OriginalMember(owner = "client!ri", name = "V", descriptor = "I")
    public static int field1216 = 3;

    @OriginalMember(owner = "client!ri", name = "Y", descriptor = "I")
    public static int field1219 = 0;

    @OriginalMember(owner = "client!ri", name = "J", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!ri", name = "K", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!ri", name = "M", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!ri", name = "P", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!ri", name = "Q", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!ri", name = "U", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!ri", name = "O", descriptor = "Lhg;")
    public static class177 field1209;

    @OriginalMember(owner = "client!ri", name = "S", descriptor = "Lhg;")
    public static class177 field1213;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lhg;B)V")
    public static final void method453(class177 arg0, byte arg1) {
        ++field1210;
        if (arg1 >= 96) {
            class38.field572 = arg0;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILpa;Z)V")
    public static final void method454(int arg0, class214 arg1, boolean arg2) {
        int var3 = arg1.field3912;
        int var4 = (int) arg1.field4006;
        ++field1211;
        arg1.method1544((byte) -25);
        if (arg2) {
            class7.method29(true, var3);
        }
        class236.method1610(var3, (byte) 108);
        class181 var5 = client.method1114(-20985, var4);
        if (var5 != null) {
            class254.method1731(var5, (byte) 52);
        }
        int var6 = class253.field4549;
        for (int var7 = 0; var7 < var6; ++var7) {
            if (class108.method779(class216.field3942[var7], true)) {
                class199.method1427((byte) -81, var7);
            }
        }
        if (class253.field4549 != arg0) {
            class195.method1396(class266.field4739, class137.field2394, class61.field1040, class147.field2584, 0);
            int var8 = class183.field3383.method1820(class11.field154);
            for (int var9 = 0; ~var9 > ~class253.field4549; ++var9) {
                int var10 = class183.field3383.method1820(class3.method12(var9, -81));
                if (~var10 < ~var8) {
                    var8 = var10;
                }
            }
            class61.field1040 = var8 + 8;
            class266.field4739 = (!class4.field48 ? 22 : 26) + class253.field4549 * 15;
        } else {
            class58.field991 = false;
            class195.method1396(class266.field4739, class137.field2394, class61.field1040, class147.field2584, arg0 + -1);
        }
        if (~class69.field1262 != 0) {
            class61.method383(class69.field1262, 73, 1);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIIIZIIIIZI)Z")
    public static final boolean method455(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11, int arg12) {
        for (int var13 = 0; ~var13 > -105; ++var13) {
            for (int var40 = 0; var40 < 104; ++var40) {
                class74.field1372[var13][var40] = 0;
                class124.field2202[var13][var40] = 99999999;
            }
        }
        ++field1215;
        int var14 = arg2;
        class74.field1372[arg2][arg1] = 99;
        int var15 = arg1;
        class124.field2202[arg2][arg1] = 0;
        if (!arg6) {
            field1209 = null;
        }
        byte var16 = 0;
        class163.field2878[var16] = arg2;
        int var41 = var16 + 1;
        class101.field1759[var16] = arg1;
        boolean var17 = false;
        int var18 = 0;
        int[][] var19 = class148.field2605[class138.field2405].field1769;
        label372: while (var41 != var18) {
            var14 = class163.field2878[var18];
            var15 = class101.field1759[var18];
            var18 = 4095 & var18 - -1;
            if (arg5 == var14 && ~arg12 == ~var15) {
                var17 = true;
                break;
            }
            if (~arg9 != -1) {
                if ((arg9 < 5 || ~arg9 == -11) && class148.field2605[class138.field2405].method744(arg9 + -1, arg5, 124, arg4, arg12, var14, arg10, var15)) {
                    var17 = true;
                    break;
                }
                if (arg9 < 10 && class148.field2605[class138.field2405].method736(arg5, var14, arg9 + -1, arg4, arg10, arg12, (byte) 127, var15)) {
                    var17 = true;
                    break;
                }
            }
            if (~arg7 != -1 && ~arg8 != -1 && class148.field2605[class138.field2405].method737(arg4, arg5, 95, var14, arg7, arg8, arg3, arg12, var15)) {
                var17 = true;
                break;
            }
            int var31 = class124.field2202[var14][var15] + 1;
            if (var14 > 0 && class74.field1372[var14 + -1][var15] == 0 && (19661070 & var19[var14 + -1][var15]) == 0 && ~(var19[var14 + -1][var15 - -arg4 + -1] & 19661112) == -1) {
                int var32 = 1;
                while (true) {
                    if (arg4 - 1 <= var32) {
                        class163.field2878[var41] = var14 + -1;
                        class101.field1759[var41] = var15;
                        var41 = var41 + 1 & 4095;
                        class74.field1372[var14 + -1][var15] = 2;
                        class124.field2202[var14 + -1][var15] = var31;
                        break;
                    }
                    if (~(19661118 & var19[var14 + -1][var15 + var32]) != -1) {
                        break;
                    }
                    ++var32;
                }
            }
            if (var14 < 102 && class74.field1372[var14 - -1][var15] == 0 && (19661187 & var19[arg4 + var14][var15]) == 0 && (var19[arg4 + var14][var15 + -1 - -arg4] & 19661280) == 0) {
                int var33 = 1;
                while (true) {
                    if (arg4 + -1 <= var33) {
                        class163.field2878[var41] = var14 + 1;
                        class101.field1759[var41] = var15;
                        class74.field1372[var14 + 1][var15] = 8;
                        var41 = var41 - -1 & 4095;
                        class124.field2202[var14 + 1][var15] = var31;
                        break;
                    }
                    if (~(19661283 & var19[arg4 + var14][var15 - -var33]) != -1) {
                        break;
                    }
                    ++var33;
                }
            }
            if (var15 > 0 && class74.field1372[var14][var15 + -1] == 0 && ~(19661070 & var19[var14][var15 + -1]) == -1 && ~(19661187 & var19[arg4 + -1 + var14][var15 + -1]) == -1) {
                int var34 = 1;
                while (true) {
                    if (~var34 <= ~(arg4 - 1)) {
                        class163.field2878[var41] = var14;
                        class101.field1759[var41] = var15 + -1;
                        var41 = 4095 & var41 - -1;
                        class74.field1372[var14][var15 + -1] = 1;
                        class124.field2202[var14][var15 + -1] = var31;
                        break;
                    }
                    if (~(19661199 & var19[var14 - -var34][var15 + -1]) != -1) {
                        break;
                    }
                    ++var34;
                }
            }
            if (var15 < 102 && ~class74.field1372[var14][var15 + 1] == -1 && (var19[var14][var15 - -arg4] & 19661112) == 0 && (var19[var14 - -arg4 + -1][var15 - -arg4] & 19661280) == 0) {
                int var35 = 1;
                while (true) {
                    if (~var35 <= ~(arg4 - 1)) {
                        class163.field2878[var41] = var14;
                        class101.field1759[var41] = var15 + 1;
                        var41 = 4095 & var41 + 1;
                        class74.field1372[var14][var15 - -1] = 4;
                        class124.field2202[var14][var15 + 1] = var31;
                        break;
                    }
                    if ((19661304 & var19[var14 + var35][arg4 + var15]) != 0) {
                        break;
                    }
                    ++var35;
                }
            }
            if (var14 > 0 && ~var15 < -1 && ~class74.field1372[var14 + -1][var15 + -1] == -1 && (19661112 & var19[var14 + -1][var15 + -1 + arg4 + -1]) == 0 && (var19[var14 + -1][var15 + -1] & 19661070) == 0 && ~(19661187 & var19[var14 - 2 + arg4][var15 + -1]) == -1) {
                int var36 = 1;
                while (true) {
                    if (~(arg4 + -1) >= ~var36) {
                        class163.field2878[var41] = var14 + -1;
                        class101.field1759[var41] = var15 - 1;
                        class74.field1372[var14 + -1][var15 - 1] = 3;
                        class124.field2202[var14 + -1][var15 - 1] = var31;
                        var41 = var41 + 1 & 4095;
                        break;
                    }
                    if (~(var19[var14 + -1][var15 - 1 + var36] & 19661118) != -1 || ~(19661199 & var19[var14 + -1 - -var36][var15 + -1]) != -1) {
                        break;
                    }
                    ++var36;
                }
            }
            if (~var14 > -103 && ~var15 < -1 && ~class74.field1372[var14 - -1][var15 - 1] == -1 && ~(19661070 & var19[var14 - -1][var15 + -1]) == -1 && (var19[arg4 + var14][var15 + -1] & 19661187) == 0 && ~(19661280 & var19[arg4 + var14][var15 - 1 + -1 + arg4]) == -1) {
                int var37 = 1;
                while (true) {
                    if (arg4 - 1 <= var37) {
                        class163.field2878[var41] = var14 + 1;
                        class101.field1759[var41] = var15 - 1;
                        var41 = 4095 & var41 - -1;
                        class74.field1372[var14 + 1][var15 - 1] = 9;
                        class124.field2202[var14 + 1][var15 + -1] = var31;
                        break;
                    }
                    if ((var19[arg4 + var14][var37 + -1 + var15] & 19661283) != 0 || (19661199 & var19[var14 - -var37 + 1][var15 + -1]) != 0) {
                        break;
                    }
                    ++var37;
                }
            }
            if (~var14 < -1 && var15 < 102 && ~class74.field1372[var14 - 1][var15 + 1] == -1 && (var19[var14 - 1][var15 + 1] & 19661070) == 0 && (var19[var14 + -1][arg4 + var15] & 19661112) == 0 && ~(19661280 & var19[var14][arg4 + var15]) == -1) {
                int var38 = 1;
                while (true) {
                    if (~(arg4 + -1) >= ~var38) {
                        class163.field2878[var41] = var14 + -1;
                        class101.field1759[var41] = var15 + 1;
                        class74.field1372[var14 - 1][var15 - -1] = 6;
                        var41 = var41 + 1 & 4095;
                        class124.field2202[var14 + -1][var15 + 1] = var31;
                        break;
                    }
                    if (~(19661118 & var19[var14 + -1][var15 - -1 + var38]) != -1 || (19661304 & var19[var14 + -1 - -var38][arg4 + var15]) != 0) {
                        break;
                    }
                    ++var38;
                }
            }
            if (~var14 > -103 && ~var15 > -103 && ~class74.field1372[var14 + 1][var15 + 1] == -1 && (19661112 & var19[var14 - -1][arg4 + var15]) == 0 && ~(19661280 & var19[arg4 + var14][arg4 + var15]) == -1 && ~(var19[arg4 + var14][var15 + 1] & 19661187) == -1) {
                for (int var39 = 1; ~(arg4 + -1) < ~var39; ++var39) {
                    if (~(var19[var14 + 1 - -var39][arg4 + var15] & 19661304) != -1 || ~(19661283 & var19[arg4 + var14][var15 - -var39 + 1]) != -1) {
                        continue label372;
                    }
                }
                class163.field2878[var41] = var14 + 1;
                class101.field1759[var41] = var15 + 1;
                class74.field1372[var14 + 1][var15 + 1] = 12;
                class124.field2202[var14 + 1][var15 + 1] = var31;
                var41 = var41 + 1 & 4095;
            }
        }
        class147.field2587 = 0;
        if (!var17) {
            if (!arg11) {
                return false;
            }
            byte var20 = 10;
            int var21 = 100;
            int var22 = 1000;
            for (int var23 = -var20 + arg5; ~var23 >= ~(arg5 + var20); ++var23) {
                for (int var24 = -var20 + arg12; var24 <= arg12 + var20; ++var24) {
                    if (~var23 <= -1 && ~var24 <= -1 && ~var23 > -105 && var24 < 104 && class124.field2202[var23][var24] < 100) {
                        int var25 = 0;
                        int var26 = 0;
                        if (~var24 > ~arg12) {
                            var26 = arg12 - var24;
                        } else if (arg12 - -arg8 + -1 < var24) {
                            var26 = var24 + 1 + -arg8 + -arg12;
                        }
                        if (var23 < arg5) {
                            var25 = -var23 + arg5;
                        } else if (~(arg5 - -arg7 - 1) > ~var23) {
                            var25 = -arg5 - (arg7 - (var23 + 1));
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var27 < var22 || var22 == var27 && ~class124.field2202[var23][var24] > ~var21) {
                            var22 = var27;
                            var21 = class124.field2202[var23][var24];
                            var15 = var24;
                            var14 = var23;
                        }
                    }
                }
            }
            if (~var22 == -1001) {
                return false;
            }
            if (~arg2 == ~var14 && arg1 == var15) {
                return false;
            }
            class147.field2587 = 1;
        }
        byte var28 = 0;
        class163.field2878[var28] = var14;
        int var42 = var28 + 1;
        class101.field1759[var28] = var15;
        int var29;
        int var30 = var29 = class74.field1372[var14][var15];
        while (arg2 != var14 || ~arg1 != ~var15) {
            if (var29 != var30) {
                var29 = var30;
                class163.field2878[var42] = var14;
                class101.field1759[var42++] = var15;
            }
            if ((var30 & 1) != 0) {
                ++var15;
            } else if ((var30 & 4) != 0) {
                --var15;
            }
            if (~(2 & var30) != -1) {
                ++var14;
            } else if (~(8 & var30) != -1) {
                --var14;
            }
            var30 = class74.field1372[var14][var15];
        }
        if (var42 > 0) {
            class41.method232((byte) 63, var42, arg0);
            return true;
        } else if (arg0 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lcf;B)I")
    public static final int method456(class93 arg0, byte arg1) {
        ++field1207;
        if (arg1 != -54) {
            return 49;
        } else {
            for (int var2 = 0; ~var2 > ~class242.field4365.length; ++var2) {
                if (class242.field4365[var2].method649(arg0, arg1 ^ 4456)) {
                    return var2;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V")
    public class66() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IB)[I")
    public final int[] method22(int arg0, byte arg1) {
        ++field1205;
        int[] var3 = super.field4716.method532((byte) 126, arg0);
        if (arg1 >= -83) {
            return null;
        } else {
            if (super.field4716.field1424) {
                int var4 = class67.field1220[arg0];
                for (int var5 = 0; class176.field3060 > var5; ++var5) {
                    int var6 = class144.field2497[var5];
                    if (~var6 < ~this.field1208 && ~var6 > ~(4096 - this.field1208) && ~(-this.field1208 + 2048) > ~var4 && ~var4 > ~(2048 - -this.field1208)) {
                        int var7 = -var6 + 2048;
                        int var8 = var7 < 0 ? -var7 : var7;
                        int var9 = var8 << 12;
                        int var10 = var9 / (-this.field1208 + 2048);
                        var3[var5] = -var10 + 4096;
                    } else if (~(-this.field1208 + 2048) > ~var6 && var6 < 2048 - -this.field1208) {
                        int var11 = var4 + -2048;
                        int var12 = var11 >= 0 ? var11 : -var11;
                        int var13 = var12 - this.field1208;
                        int var14 = var13 << 12;
                        var3[var5] = var14 / (-this.field1208 + 2048);
                    } else if (this.field1208 <= var4 && var4 <= 4096 - this.field1208) {
                        if (~this.field1208 >= ~var6 && ~var6 >= ~(-this.field1208 + 4096)) {
                            var3[var5] = 0;
                        } else {
                            int var15 = -var4 + 2048;
                            int var16 = ~var15 <= -1 ? var15 : -var15;
                            int var17 = var16 << 12;
                            int var18 = var17 / (-this.field1208 + 2048);
                            var3[var5] = -var18 + 4096;
                        }
                    } else {
                        int var19 = var6 + -2048;
                        int var20 = var19 < 0 ? -var19 : var19;
                        int var21 = var20 - this.field1208;
                        int var22 = var21 << 12;
                        var3[var5] = var22 / (2048 - this.field1208);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IILee;)V")
    public final void method20(int arg0, int arg1, class280 arg2) {
        ++field1204;
        if (~arg1 == -1) {
            this.field1208 = arg2.method1891(-111);
        }
        if (arg0 <= 11) {
            method453((class177) null, (byte) 117);
        }
    }

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "(I)V")
    public static void method457(int arg0) {
        field1212 = null;
        field1218 = null;
        field1217 = null;
        field1213 = null;
        field1214 = null;
        field1206 = null;
        if (arg0 == 4095) {
            field1209 = null;
        }
    }
}
