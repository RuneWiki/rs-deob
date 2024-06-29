import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class428 extends class311 {

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "I")
    private int field5948;

    @OriginalMember(owner = "client!rk", name = "G", descriptor = "I")
    private int field5962;

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "I")
    public int field5947;

    @OriginalMember(owner = "client!rk", name = "H", descriptor = "I")
    private int field5963;

    @OriginalMember(owner = "client!rk", name = "t", descriptor = "I")
    private int field5949;

    @OriginalMember(owner = "client!rk", name = "w", descriptor = "I")
    private int field5952;

    @OriginalMember(owner = "client!rk", name = "M", descriptor = "I")
    public int field5968;

    @OriginalMember(owner = "client!rk", name = "I", descriptor = "I")
    public int field5964;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
    public int field5945;

    @OriginalMember(owner = "client!rk", name = "v", descriptor = "[Lrd;")
    public static class419[] field5951 = new class419[32768];

    @OriginalMember(owner = "client!rk", name = "K", descriptor = "[I")
    public static int[] field5966 = new int[32];

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
    public static int field5946;

    @OriginalMember(owner = "client!rk", name = "u", descriptor = "I")
    public static int field5950;

    @OriginalMember(owner = "client!rk", name = "x", descriptor = "I")
    public static int field5953;

    @OriginalMember(owner = "client!rk", name = "y", descriptor = "I")
    public static int field5954;

    @OriginalMember(owner = "client!rk", name = "z", descriptor = "I")
    public static int field5955;

    @OriginalMember(owner = "client!rk", name = "A", descriptor = "I")
    public static int field5956;

    @OriginalMember(owner = "client!rk", name = "B", descriptor = "I")
    public static int field5957;

    @OriginalMember(owner = "client!rk", name = "D", descriptor = "I")
    public static int field5959;

    @OriginalMember(owner = "client!rk", name = "E", descriptor = "I")
    public static int field5960;

    @OriginalMember(owner = "client!rk", name = "F", descriptor = "I")
    public static int field5961;

    @OriginalMember(owner = "client!rk", name = "J", descriptor = "I")
    public static int field5965;

    @OriginalMember(owner = "client!rk", name = "L", descriptor = "I")
    public static int field5967;

    @OriginalMember(owner = "client!rk", name = "C", descriptor = "Z")
    public static boolean field5958;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZI)V")
    public static final void method2634(boolean arg0, int arg1) {
        if (arg1 != 11539) {
            return;
        }
        field5967++;
        if (arg0) {
            if (class350.field4712 != -1) {
                class91.method720(class350.field4712, (byte) -42);
            }
            for (class435 var2 = (class435) class171.field2415.method842((byte) -25); var2 != null; var2 = (class435) class171.field2415.method836(arg1 - 11487)) {
                if (!var2.method1887(arg1 - 11462)) {
                    var2 = (class435) class171.field2415.method842((byte) -25);
                    if (var2 == null) {
                        break;
                    }
                }
                class147.method1063((byte) 16, true, false, var2);
            }
            class350.field4712 = -1;
            class171.field2415 = new class109(8);
            class340.method2074(-109);
            class350.field4712 = class266.field3659;
            class183.method1277((byte) 83, false);
            class136.method1018((byte) 117);
            class172.method1232(class350.field4712);
        }
        class312.method1891(0);
        class156.field2225 = -1;
        class31.method285(class430.field6019, arg1 - 11540);
        class359.field4970 = new class423();
        class359.field4970.field44 = 6656;
        class359.field4970.field40 = 6656;
        class359.field4970.field2662[0] = 52;
        class359.field4970.field2659[0] = 52;
        class375.field5213 = 0;
        class63.field874 = 0;
        if (class26.field337 == 2) {
            class63.field874 = class41.field536 << 7;
            class375.field5213 = class447.field6263 << 7;
        } else {
            class196.method1363(2);
        }
        class453.method2823(arg1 - 11539);
        if (class63.field874 == 0 || class375.field5213 == 0) {
            class191.method1321(10, 40);
        } else {
            class332.method2011(arg1 - 11589);
            class191.method1321(28, arg1 ^ 0x2D3B);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIB)Z")
    public final boolean method2635(int arg0, int arg1, byte arg2) {
        field5960++;
        if (arg2 != 114) {
            method2643(false, 38);
        }
        return arg0 >= this.field5968 && arg0 <= this.field5945 && this.field5947 <= arg1 && arg1 <= this.field5964;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IZ)Loh;")
    public static final class432 method2636(int arg0, boolean arg1) {
        field5957++;
        class432 var2 = (class432) class107.field1516.method2529(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class432.field6123.method1926(0, arg0, 0);
        class432 var4 = new class432();
        if (var3 != null) {
            var4.method2667(new class366(var3), (byte) 108);
        }
        var4.method2666((byte) -74);
        class107.field1516.method2527(-121, (long) arg0, var4);
        if (arg1) {
            method2634(true, -81);
        }
        return var4;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "([IIII)V")
    public final void method2637(int[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 > 75) {
            field5965++;
            arg0[1] = this.field5962 + arg3 - this.field5968;
            arg0[0] = this.field5952;
            arg0[2] = this.field5949 + arg2 - this.field5947;
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(IIB)Z")
    public final boolean method2638(int arg0, int arg1, byte arg2) {
        field5946++;
        int var4 = 104 / ((42 - arg2) / 54);
        return this.field5962 <= arg0 && arg0 <= this.field5963 && this.field5949 <= arg1 && arg1 <= this.field5948;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lea;ZIIBII[Lbm;I[BII)[I")
    public static final int[] method2639(class58 arg0, boolean arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, class325[] arg7, int arg8, byte[] arg9, int arg10, int arg11) {
        field5954++;
        int var12 = (arg11 & 0x7) * 8;
        int var13 = (arg3 & 0x7) * 8;
        if (!arg1) {
            class325 var14 = arg7[arg8];
            for (int var15 = 0; var15 < 8; var15++) {
                for (int var16 = 0; var16 < 8; var16++) {
                    int var17 = class55.method438(128, arg10, var16 & 0x7, var15 & 0x7) + arg5;
                    int var18 = class42.method364(-10, var15 & 0x7, arg10, var16 & 0x7) + arg2;
                    if (var17 > 0 && var17 < class11.field107 - 1 && var18 > 0 && var18 < class264.field3620 - 1) {
                        var14.method1973(var17, var18, 0);
                    }
                }
            }
        }
        byte var19;
        if (arg1) {
            var19 = 1;
        } else {
            var19 = 4;
        }
        class366 var20 = new class366(arg9);
        int var21 = arg11 & 0x1FFFFFF8 << 3;
        int var22 = arg3 & 0x1FFFFFF8 << 3;
        byte var23 = 0;
        byte var24 = 0;
        if (arg10 == 1) {
            var24 = 1;
        } else if (arg10 == 2) {
            var23 = 1;
            var24 = 1;
        } else if (arg10 == 3) {
            var23 = 1;
        }
        for (int var25 = 0; var25 < var19; var25++) {
            for (int var59 = 0; var59 < 64; var59++) {
                for (int var60 = 0; var60 < 64; var60++) {
                    if (arg6 != var25 || var59 < var12 || (var12 + 8) < var59 || var60 < var13 || var60 > var13 + 8) {
                        class255.method1654(var20, false, 0, arg1, 0, 118, 0, 0, -1, 0, -1, 0);
                    } else if (var12 + 8 == var59 || var13 + 8 == var60) {
                        int var67;
                        int var68;
                        if (arg10 == 0) {
                            var67 = -var12 - (-var59 - arg5);
                            var68 = arg2 - (var13 - var60);
                        } else if (arg10 == 1) {
                            var67 = -var13 - (-var60 - arg5);
                            var68 = 8 - var59 - (-var12 - arg2);
                        } else if (arg10 == 2) {
                            var67 = arg5 + var12 + 8 - var59;
                            var68 = 8 - var60 - (-var13 - arg2);
                        } else {
                            var68 = arg2 - (var12 - var59);
                            var67 = arg5 + var13 - (var60 - 8);
                        }
                        class255.method1654(var20, true, var22 + var60, arg1, 0, 122, arg8, 0, var68, var21 + var59, var67, 0);
                    } else {
                        int var61 = arg5 + class55.method438(128, arg10, var60 & 0x7, var59 & 0x7);
                        int var62 = arg2 + class42.method364(-10, var59 & 0x7, arg10, var60 & 0x7);
                        class255.method1654(var20, false, var22 + var60, arg1, var23, 116, arg8, var24, var62, var21 + var59, var61, arg10);
                        if (var59 == 63 || var60 == 63) {
                            int var63 = var59 == 63 ? 64 : var59;
                            int var64 = var60 == 63 ? 64 : var60;
                            int var65;
                            int var66;
                            if (arg10 == 0) {
                                var66 = arg5 + var63 - var12;
                                var65 = arg2 + var64 - var13;
                            } else if (arg10 == 1) {
                                var65 = arg2 + var12 + 8 - var63;
                                var66 = arg5 - (var13 - var64);
                            } else if (arg10 == 2) {
                                var65 = arg2 + var13 + 8 - var64;
                                var66 = var12 - (var63 - arg5 - 8);
                            } else {
                                var65 = var63 + arg2 - var12;
                                var66 = var13 + arg5 + 8 - var64;
                            }
                            if (var66 >= 0 && class11.field107 > var66 && var65 >= 0 && var65 < class264.field3620) {
                                class278.field3794[arg8][var66][var65] = class278.field3794[arg8][var23 + var61][var24 + var62];
                            }
                        }
                    }
                }
            }
        }
        int var26 = -6 % ((arg4 + 4) / 61);
        boolean var27 = false;
        boolean var28 = false;
        while (var20.field5076.length > var20.field5048) {
            int var29 = var20.method2306((byte) 91);
            if (var29 == 128) {
                class80.field1104[0] = var20.method2297(13352);
                class80.field1104[1] = var20.method2257((byte) 110);
                class80.field1104[2] = var20.method2257((byte) 110);
                class80.field1104[3] = var20.method2257((byte) 110);
                var27 = true;
                class80.field1104[4] = var20.method2297(13352);
            } else {
                if (var29 != 129) {
                    var20.field5048--;
                    break;
                }
                if (class91.field1276 == null) {
                    class91.field1276 = new byte[4][][];
                }
                for (int var46 = 0; var46 < 4; var46++) {
                    byte var47 = var20.method2289((byte) -77);
                    if (var47 == 0 && class91.field1276[arg8] != null) {
                        if (arg6 >= var46) {
                            int var48 = arg5;
                            int var49 = arg5 + 7;
                            int var50 = arg2;
                            if (var49 < 0) {
                                var49 = 0;
                            } else if (class11.field107 <= var49) {
                                var49 = class11.field107;
                            }
                            if (arg5 < 0) {
                                var48 = 0;
                            } else if (class11.field107 <= arg5) {
                                var48 = class11.field107;
                            }
                            if (arg2 < 0) {
                                var50 = 0;
                            } else if (class264.field3620 <= arg2) {
                                var50 = class264.field3620;
                            }
                            int var51 = arg2 + 7;
                            if (var51 < 0) {
                                var51 = 0;
                            } else if (var51 >= class264.field3620) {
                                var51 = class264.field3620;
                            }
                            while (var49 > var48) {
                                while (var50 < var51) {
                                    class91.field1276[arg8][var48][var50] = 0;
                                    var50++;
                                }
                                var48++;
                            }
                        }
                    } else if (var47 == 1) {
                        if (class91.field1276[arg8] == null) {
                            class91.field1276[arg8] = new byte[class11.field107 + 1][class264.field3620 + 1];
                        }
                        for (int var52 = 0; var52 < 64; var52 += 4) {
                            for (int var53 = 0; var53 < 64; var53 += 4) {
                                byte var54 = var20.method2289((byte) -77);
                                if (var46 <= arg6) {
                                    for (int var55 = var52; var55 < var52 + 4; var55++) {
                                        for (int var56 = var53; var56 < (var53 + 4); var56++) {
                                            if (var12 <= var55 && var12 + 8 > var55 && var56 >= var13 && (var13 + 8) > var13) {
                                                int var57 = class55.method438(128, arg10, var56 & 0x7, var55 & 0x7) + arg5;
                                                int var58 = class42.method364(-10, var55 & 0x7, arg10, var56 & 0x7) + arg2;
                                                if (var57 >= 0 && class11.field107 > var57 && var58 >= 0 && var58 < class264.field3620) {
                                                    class91.field1276[arg8][var57][var58] = var54;
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
        }
        if (!arg1) {
            class141 var30 = null;
            while (true) {
                while (var20.field5048 < var20.field5076.length) {
                    int var31 = var20.method2306((byte) 55);
                    if (var31 == 0) {
                        var30 = new class141(var20);
                    } else if (var31 == 1) {
                        int var32 = var20.method2306((byte) 24);
                        if (var32 > 0) {
                            for (int var33 = 0; var33 < var32; var33++) {
                                class271 var34 = new class271(var20);
                                if (var34.field3704 == 31) {
                                    class244 var35 = class323.method1967((byte) 64, var20.method2297(13352));
                                    var34.method1724(var35.field3454, var35.field3445, var35.field3448, var35.field3452, 105);
                                }
                                int var36 = var34.field2204 >> 7;
                                int var37 = var34.field2212 >> 7;
                                if (var34.field3708 == arg6 && var12 <= var36 && var36 < var12 + 8 && var37 >= var13 && var37 < var13 + 8) {
                                    int var38 = (arg5 << 7) + class57.method447(var34.field2204 & 0x3FF, true, arg10, var34.field2212 & 0x3FF);
                                    int var39 = (arg2 << 7) + class388.method2417(arg10, var34.field2212 & 0x3FF, var34.field2204 & 0x3FF, 0);
                                    var34.field2204 = var38;
                                    var34.field2212 = var39;
                                    int var40 = var34.field2212 >> 7;
                                    int var41 = var34.field2204 >> 7;
                                    if (var41 >= 0 && var40 >= 0 && class11.field107 > var41 && var40 < class264.field3620) {
                                        var34.field2205 = class278.field3794[arg6][var41][var40] - var34.field2205;
                                        if (arg0.method264() > 0) {
                                            class136.method1016(var34);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var31 == 2) {
                        if (var30 == null) {
                            var30 = new class141();
                        }
                        var30.method1032(20537, var20);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var30 != null) {
                    class354.method2127(arg2 >> 3, var30, arg5 >> 3, false);
                }
                break;
            }
        }
        if (!var28 && class91.field1276 != null && class91.field1276[arg8] != null) {
            int var42 = arg5 + 7;
            int var43 = arg2 + 7;
            for (int var44 = arg5; var44 < var42; var44++) {
                for (int var45 = arg2; var45 < var43; var45++) {
                    class91.field1276[arg8][var44][var45] = 0;
                }
            }
        }
        if (var27) {
            return class80.field1104;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BIII)Z")
    public final boolean method2640(byte arg0, int arg1, int arg2, int arg3) {
        int var5 = -46 % ((arg0 - 86) / 35);
        field5956++;
        return this.field5952 == arg2 && arg3 >= this.field5962 && this.field5963 >= arg3 && this.field5949 <= arg1 && arg1 <= this.field5948;
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(I)V")
    public static void method2641(int arg0) {
        field5951 = null;
        int var1 = -72 / ((arg0 - 4) / 58);
        field5966 = null;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II[II)V")
    public final void method2642(int arg0, int arg1, int[] arg2, int arg3) {
        arg2[1] = arg3 - (this.field5962 - this.field5968);
        if (arg1 < 15) {
            field5958 = true;
        }
        field5961++;
        arg2[0] = 0;
        arg2[2] = arg0 + this.field5947 - this.field5949;
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(ZI)V")
    public static final void method2643(boolean arg0, int arg1) {
        field5950++;
        class408 var2 = class144.field2105;
        synchronized (class144.field2105) {
            class144.field2105.method2530((byte) -59);
            if (arg0) {
                method2636(-41, true);
            }
            class144.field2105 = new class408(arg1);
        }
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class428(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field5948 = arg4;
        this.field5962 = arg1;
        this.field5947 = arg6;
        this.field5963 = arg3;
        this.field5949 = arg2;
        this.field5952 = arg0;
        this.field5968 = arg5;
        this.field5964 = arg8;
        this.field5945 = arg7;
    }
}
