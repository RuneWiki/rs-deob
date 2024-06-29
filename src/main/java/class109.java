import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class109 extends class128 {

    @OriginalMember(owner = "client!th", name = "Qb", descriptor = "I")
    public static volatile int field1957 = 0;

    @OriginalMember(owner = "client!th", name = "cc", descriptor = "Leb;")
    private static class230 field1969 = class68.method589(0, "Checking for updates )2 ");

    @OriginalMember(owner = "client!th", name = "bc", descriptor = "Leb;")
    public static class230 field1968 = class68.method589(0, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!th", name = "Rb", descriptor = "Leb;")
    public static class230 field1958 = field1969;

    @OriginalMember(owner = "client!th", name = "Ub", descriptor = "I")
    public static int field1961 = 2;

    @OriginalMember(owner = "client!th", name = "Tb", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!th", name = "Vb", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!th", name = "Wb", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!th", name = "Xb", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!th", name = "Yb", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!th", name = "Zb", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!th", name = "dc", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!th", name = "ac", descriptor = "Lef;")
    public static class205 field1967;

    @OriginalMember(owner = "client!th", name = "Ob", descriptor = "Lkk;")
    public static class223 field1955;

    @OriginalMember(owner = "client!th", name = "Pb", descriptor = "Loa;")
    public class97 field1956;

    @OriginalMember(owner = "client!th", name = "Sb", descriptor = "[Leh;")
    public static class80[] field1959;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(B)V")
    public static void method889(byte arg0) {
        field1967 = null;
        field1955 = null;
        if (arg0 >= -13) {
            field1955 = null;
        }
        field1958 = null;
        field1959 = null;
        field1969 = null;
        field1968 = null;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)Z")
    public final boolean method890(int arg0) {
        if (arg0 != 2) {
            method889((byte) 123);
        }
        ++field1963;
        return this.field1956 != null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "()I")
    public final int method496() {
        ++field1970;
        return super.field2308;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I[Lge;[Lge;Lkk;[Lge;[Lmf;[Lge;)V")
    public static final void method891(int arg0, class69[] arg1, class69[] arg2, class223 arg3, class69[] arg4, class10[] arg5, class69[] arg6) {
        class103.field1890 = arg4;
        class97.field1740 = arg2;
        class130.field2343 = arg6;
        class101.field1857 = arg1;
        ++field1965;
        class95.field1712 = arg5;
        class111.field1984 = arg3;
        class124.field2189.method837(arg0 + -26215);
        int var7 = class111.field1984.method1521(8994, class261.field4651);
        int[] var8 = class111.field1984.method1535(var7, (byte) 84);
        for (int var9 = arg0; var8.length > var9; ++var9) {
            class124.field2189.method843(-5, class173.method1266(new class14(class111.field1984.method1546(var8[var9], (byte) -100, var7)), arg0 + -16810));
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(JB)V")
    public static final void method892(long arg0, byte arg1) {
        ++field1960;
        if (~arg0 != -1L) {
            for (int var3 = 0; var3 < class273.field4805; ++var3) {
                if (class140.field2508[var3] == arg0) {
                    ++class200.field3553;
                    --class273.field4805;
                    for (int var4 = var3; class273.field4805 > var4; ++var4) {
                        class12.field239[var4] = class12.field239[var4 + 1];
                        class268.field4750[var4] = class268.field4750[var4 - -1];
                        class180.field3153[var4] = class180.field3153[var4 - -1];
                        class140.field2508[var4] = class140.field2508[var4 + 1];
                        class59.field1130[var4] = class59.field1130[var4 + 1];
                        class114.field2040[var4] = class114.field2040[var4 + 1];
                    }
                    class67.field1265 = class54.field935;
                    class153.field2747.method978(12, 185);
                    class153.field2747.method148(arg0, (byte) 124);
                    break;
                }
            }
            if (arg1 < 126) {
                method893((class14) null, -25);
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field1964;
        if (this.field1956 != null) {
            class249 var11 = super.field2303 != -1 && ~super.field2246 == -1 ? class237.method1667(super.field2303, -128) : null;
            class249 var12 = ~super.field2282 == 0 || ~super.field2305 == ~super.field2282 && var11 != null ? null : class237.method1667(super.field2282, 32);
            class257 var13 = this.field1956.method829(super.field2259, var12, super.field2273, 64, var11);
            if (var13 != null) {
                super.field2308 = var13.method496();
                class97 var14 = this.field1956;
                if (var14.field1787 != null) {
                    var14 = var14.method825((byte) -82);
                }
                if (class263.field4672 && var14.field1771) {
                    class257 var15 = class216.method1487(arg0, this.field1956.field1769, var12 != null ? super.field2259 : super.field2273, var13, super.field2274, super.field2300, (byte) 73, super.field2307, this.field1956.field1782, this.field1956.field1779, this.field1956.field1763, this.field1956.field1800, var12 != null ? var12 : var11, super.field2267);
                    var15.method500(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
                }
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                if (~this.field1956.field1749 != -1 || ~this.field1956.field1767 != -1) {
                    int var19 = class3.field21[arg0];
                    int var20 = class3.field24[arg0];
                    short var21 = this.field1956.field1749;
                    short var22 = this.field1956.field1767;
                    int var23 = -var21 / 2;
                    int var24 = -var22 / 2;
                    int var25 = var20 * var24 + -(var19 * var23) >> 16;
                    int var26 = var19 * var24 - -(var20 * var23) >> 16;
                    int var27 = var21 / 2;
                    int var28 = -var22 / 2;
                    int var29 = var19 * var28 + var20 * var27 >> 16;
                    int var30 = -var21 / 2;
                    int var31 = var22 / 2;
                    int var32 = var19 * var31 - -(var20 * var30) >> 16;
                    int var33 = var20 * var28 - var19 * var27 >> 16;
                    int var34 = class37.method333(super.field2300 + var25, 1637367879, class124.field2174, super.field2274 + var26);
                    int var35 = var20 * var31 + -(var19 * var30) >> 16;
                    int var36 = class37.method333(super.field2300 - -var33, 1637367879, class124.field2174, super.field2274 - -var29);
                    int var37 = class37.method333(super.field2300 + var35, 1637367879, class124.field2174, super.field2274 + var32);
                    int var38 = var21 / 2;
                    int var39 = var22 / 2;
                    int var40 = var20 * var39 - var19 * var38 >> 16;
                    int var41 = var19 * var39 + var20 * var38 >> 16;
                    int var42 = class37.method333(super.field2300 + var40, 1637367879, class124.field2174, super.field2274 - -var41);
                    int var43 = var34 + var42;
                    int var44 = var37 >= var42 ? var42 : var37;
                    int var45 = var34 < var36 ? var34 : var36;
                    int var46 = var36 >= var42 ? var42 : var36;
                    if (~var22 != -1) {
                        var16 = 2047 & (int) (Math.atan2((double) (-var44 + var45), (double) var22) * 325.95D);
                        if (var16 != 0) {
                            var13.method739(var16);
                        }
                    }
                    if (var43 > var36 + var37) {
                        var43 = var36 + var37;
                    }
                    int var47 = var37 <= var34 ? var37 : var34;
                    if (var21 != 0) {
                        var17 = 2047 & (int) (Math.atan2((double) (-var46 + var47), (double) var21) * 325.95D);
                        if (~var17 != -1) {
                            var13.method747(var17);
                        }
                    }
                    var18 = (var43 >> 1) - super.field2307;
                    if (~var18 != -1) {
                        var13.method761(0, var18, 0);
                    }
                }
                class257 var48 = null;
                if (~super.field2279 != 0 && super.field2281 != -1) {
                    class8 var49 = class162.method1217((byte) 91, super.field2279);
                    var48 = var49.method77(0, super.field2281);
                    if (var48 != null) {
                        var48.method761(0, -super.field2266, 0);
                        if (var49.field141) {
                            if (~var16 != -1) {
                                var48.method739(var16);
                            }
                            if (~var17 != -1) {
                                var48.method747(var17);
                            }
                            if (~var18 != -1) {
                                var48.method761(0, var18, 0);
                            }
                        }
                    }
                }
                if (var48 != null) {
                    var13 = ((class90) var13).method749(var48);
                }
                if (~this.field1956.field1769 == -2) {
                    var13.field4552 = true;
                }
                var13.method500(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lfk;I)V")
    public static final void method893(class14 arg0, int arg1) {
        int var2 = 101 % ((arg1 - 51) / 60);
        while (true) {
            while (arg0.field269.length > arg0.field318) {
                boolean var3 = false;
                int var4 = 0;
                int var5 = 0;
                if (~arg0.method200(255) == -2) {
                    var3 = true;
                    var5 = arg0.method200(255);
                    var4 = arg0.method200(255);
                }
                int var6 = arg0.method200(255);
                int var7 = arg0.method200(255);
                int var8 = var6 * 64 - class72.field1319;
                int var9 = class249.field4417 + -1 - (var7 * 64 + -class178.field3119);
                if (var8 >= 0 && var9 + -63 >= 0 && ~(var8 + 63) > ~class237.field4094 && ~var9 > ~class249.field4417) {
                    int var10 = var8 >> 6;
                    int var11 = var9 >> 6;
                    for (int var12 = 0; var12 < 64; ++var12) {
                        for (int var13 = 0; var13 < 64; ++var13) {
                            if (!var3 || ~var12 <= ~(var5 * 8) && var5 * 8 + 8 > var12 && ~var13 <= ~(var4 * 8) && var13 < var4 * 8 + 8) {
                                byte var14 = arg0.method198(false);
                                if (~var14 != -1) {
                                    if (class54.field940[var10][var11] == null) {
                                        class54.field940[var10][var11] = new byte[4096];
                                    }
                                    class54.field940[var10][var11][(63 - var13 << 6) + var12] = var14;
                                    byte var15 = arg0.method198(false);
                                    if (class169.field2990[var10][var11] == null) {
                                        class169.field2990[var10][var11] = new byte[4096];
                                    }
                                    class169.field2990[var10][var11][(-var13 + 63 << 6) + var12] = var15;
                                }
                            }
                        }
                    }
                } else {
                    for (int var16 = 0; ~var16 > ~(!var3 ? 4096 : 64); ++var16) {
                        byte var17 = arg0.method198(false);
                        if (var17 != 0) {
                            ++arg0.field318;
                        }
                    }
                }
            }
            ++field1966;
            return;
        }
    }
}
