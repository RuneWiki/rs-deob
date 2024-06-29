import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class24 {

    @OriginalMember(owner = "client!db", name = "e", descriptor = "Laf;")
    public static class7 field642 = class48.method406(40, ": ");

    @OriginalMember(owner = "client!db", name = "b", descriptor = "Laf;")
    private static class7 field639 = class48.method406(40, "scroll:");

    @OriginalMember(owner = "client!db", name = "f", descriptor = "Laf;")
    public static class7 field643 = field639;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "Laf;")
    public static class7 field656 = class48.method406(40, "scape main");

    @OriginalMember(owner = "client!db", name = "h", descriptor = "Laf;")
    public static class7 field645 = class48.method406(40, "m");

    @OriginalMember(owner = "client!db", name = "j", descriptor = "Laf;")
    public static class7 field647 = class48.method406(40, "T");

    @OriginalMember(owner = "client!db", name = "m", descriptor = "Laf;")
    public static class7 field650 = field639;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "[I")
    public static int[] field654 = new int[50];

    @OriginalMember(owner = "client!db", name = "r", descriptor = "Laf;")
    public static class7 field655 = class48.method406(40, "Bitte warten Sie eine Minute");

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public int field646;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public int field648;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public int field649;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "Lkb;")
    public static class71 field657;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lkb;Lkb;I)V")
    public static final void method225(class71 arg0, class71 arg1, int arg2) {
        class142.field3360 = arg1;
        if (arg2 <= -35) {
            class142.field3352 = arg0;
            field653++;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILmd;IIZIILrf;II)V")
    public static final void method226(int arg0, class87 arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, class124 arg7, int arg8, int arg9) {
        int var10 = class108.field2636[arg5][arg2][arg3];
        field638++;
        int var11 = class108.field2636[arg5][arg2 + 1][arg3];
        int var12 = class108.field2636[arg5][arg2 + 1][arg3 + 1];
        int var13 = class108.field2636[arg5][arg2][arg3 + 1];
        int var14 = var11 + var12 + var10 + var13 >> 2;
        class82 var15 = class155.method1214((byte) -123, arg9);
        int var16 = (arg9 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var15.field1929 == 0) {
            var16 += Integer.MIN_VALUE;
        }
        int var17 = (arg8 << 6) + arg6;
        if (var15.field1878 == 1) {
            var17 += 256;
        }
        if (arg6 == 22) {
            class101 var18;
            if (var15.field1933 == -1 && var15.field1926 == null) {
                var18 = var15.method696(arg8, var13, var11, 0, var12, 22, var10);
            } else {
                var18 = new class52(arg9, 22, arg8, var10, var11, var12, var13, var15.field1933, true, null);
            }
            arg7.method1020(arg0, arg2, arg3, var14, var18, var16, var17);
            if (var15.field1897 == 1) {
                arg1.method712(arg2, arg3, 262144);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class101 var38;
            if (var15.field1933 == -1 && var15.field1926 == null) {
                var38 = var15.method696(arg8, var13, var11, 0, var12, 10, var10);
            } else {
                var38 = new class52(arg9, 10, arg8, var10, var11, var12, var13, var15.field1933, true, null);
            }
            if (var38 != null) {
                int var39;
                int var40;
                if (arg8 == 1 || arg8 == 3) {
                    var40 = var15.field1914;
                    var39 = var15.field1917;
                } else {
                    var39 = var15.field1914;
                    var40 = var15.field1917;
                }
                int var41 = 0;
                if (arg6 == 11) {
                    var41 += 256;
                }
                arg7.method1010(arg0, arg2, arg3, var14, var40, var39, var38, var41, var16, var17);
            }
            if (var15.field1897 != 0) {
                arg1.method711(arg2, arg8, arg3, var15.field1914, var15.field1917, (byte) -128, var15.field1928);
            }
        } else if (arg6 >= 12) {
            class101 var19;
            if (var15.field1933 == -1 && var15.field1926 == null) {
                var19 = var15.method696(arg8, var13, var11, 0, var12, arg6, var10);
            } else {
                var19 = new class52(arg9, arg6, arg8, var10, var11, var12, var13, var15.field1933, true, null);
            }
            arg7.method1010(arg0, arg2, arg3, var14, 1, 1, var19, 0, var16, var17);
            if (var15.field1897 != 0) {
                arg1.method711(arg2, arg8, arg3, var15.field1914, var15.field1917, (byte) -128, var15.field1928);
            }
        } else if (arg6 == 0) {
            class101 var20;
            if (var15.field1933 == -1 && var15.field1926 == null) {
                var20 = var15.method696(arg8, var13, var11, 0, var12, 0, var10);
            } else {
                var20 = new class52(arg9, 0, arg8, var10, var11, var12, var13, var15.field1933, true, null);
            }
            arg7.method1005(arg0, arg2, arg3, var14, var20, null, class109.field2659[arg8], 0, var16, var17);
            if (var15.field1897 != 0) {
                arg1.method719(arg3, arg6, arg8, var15.field1928, arg2, 66);
            }
        } else if (arg6 == 1) {
            class101 var21;
            if (var15.field1933 == -1 && var15.field1926 == null) {
                var21 = var15.method696(arg8, var13, var11, 0, var12, 1, var10);
            } else {
                var21 = new class52(arg9, 1, arg8, var10, var11, var12, var13, var15.field1933, true, null);
            }
            arg7.method1005(arg0, arg2, arg3, var14, var21, null, class43.field1035[arg8], 0, var16, var17);
            if (var15.field1897 != 0) {
                arg1.method719(arg3, arg6, arg8, var15.field1928, arg2, 40);
            }
        } else if (arg6 == 2) {
            int var22 = arg8 + 1 & 0x3;
            class101 var23;
            class101 var24;
            if (var15.field1933 == -1 && var15.field1926 == null) {
                var23 = var15.method696(arg8 + 4, var13, var11, 0, var12, 2, var10);
                var24 = var15.method696(var22, var13, var11, 0, var12, 2, var10);
            } else {
                var23 = new class52(arg9, 2, arg8 + 4, var10, var11, var12, var13, var15.field1933, true, null);
                var24 = new class52(arg9, 2, var22, var10, var11, var12, var13, var15.field1933, true, null);
            }
            arg7.method1005(arg0, arg2, arg3, var14, var23, var24, class109.field2659[arg8], class109.field2659[var22], var16, var17);
            if (var15.field1897 != 0) {
                arg1.method719(arg3, arg6, arg8, var15.field1928, arg2, 117);
            }
        } else {
            if (arg4) {
                method226(-63, null, 16, -20, false, -41, -30, null, 41, 103);
            }
            if (arg6 == 3) {
                class101 var25;
                if (var15.field1933 == -1 && var15.field1926 == null) {
                    var25 = var15.method696(arg8, var13, var11, 0, var12, 3, var10);
                } else {
                    var25 = new class52(arg9, 3, arg8, var10, var11, var12, var13, var15.field1933, true, null);
                }
                arg7.method1005(arg0, arg2, arg3, var14, var25, null, class43.field1035[arg8], 0, var16, var17);
                if (var15.field1897 != 0) {
                    arg1.method719(arg3, arg6, arg8, var15.field1928, arg2, 71);
                }
            } else if (arg6 == 9) {
                class101 var26;
                if (var15.field1933 == -1 && var15.field1926 == null) {
                    var26 = var15.method696(arg8, var13, var11, 0, var12, arg6, var10);
                } else {
                    var26 = new class52(arg9, arg6, arg8, var10, var11, var12, var13, var15.field1933, true, null);
                }
                arg7.method1010(arg0, arg2, arg3, var14, 1, 1, var26, 0, var16, var17);
                if (var15.field1897 != 0) {
                    arg1.method711(arg2, arg8, arg3, var15.field1914, var15.field1917, (byte) -128, var15.field1928);
                }
            } else {
                if (var15.field1906) {
                    if (arg8 == 1) {
                        int var30 = var13;
                        var13 = var12;
                        var12 = var11;
                        var11 = var10;
                        var10 = var30;
                    } else if (arg8 == 2) {
                        int var27 = var13;
                        var13 = var11;
                        var11 = var27;
                        int var28 = var12;
                        var12 = var10;
                        var10 = var28;
                    } else if (arg8 == 3) {
                        int var29 = var13;
                        var13 = var10;
                        var10 = var11;
                        var11 = var12;
                        var12 = var29;
                    }
                }
                if (arg6 == 4) {
                    class101 var31;
                    if (var15.field1933 == -1 && var15.field1926 == null) {
                        var31 = var15.method696(0, var13, var11, 0, var12, 4, var10);
                    } else {
                        var31 = new class52(arg9, 4, 0, var10, var11, var12, var13, var15.field1933, true, null);
                    }
                    arg7.method1006(arg0, arg2, arg3, var14, var31, class109.field2659[arg8], arg8 * 512, 0, 0, var16, var17);
                } else if (arg6 == 5) {
                    int var32 = 16;
                    int var33 = arg7.method1036(arg0, arg2, arg3);
                    if (var33 != 0) {
                        var32 = class155.method1214((byte) -126, var33 >> 14 & 0x7FFF).field1911;
                    }
                    class101 var34;
                    if (var15.field1933 == -1 && var15.field1926 == null) {
                        var34 = var15.method696(0, var13, var11, 0, var12, 4, var10);
                    } else {
                        var34 = new class52(arg9, 4, 0, var10, var11, var12, var13, var15.field1933, true, null);
                    }
                    arg7.method1006(arg0, arg2, arg3, var14, var34, class109.field2659[arg8], arg8 * 512, class81.field1866[arg8] * var32, class52.field1245[arg8] * var32, var16, var17);
                } else if (arg6 == 6) {
                    class101 var35;
                    if (var15.field1933 == -1 && var15.field1926 == null) {
                        var35 = var15.method696(0, var13, var11, 0, var12, 4, var10);
                    } else {
                        var35 = new class52(arg9, 4, 0, var10, var11, var12, var13, var15.field1933, true, null);
                    }
                    arg7.method1006(arg0, arg2, arg3, var14, var35, 256, arg8, 0, 0, var16, var17);
                } else if (arg6 == 7) {
                    class101 var36;
                    if (var15.field1933 == -1 && var15.field1926 == null) {
                        var36 = var15.method696(0, var13, var11, 0, var12, 4, var10);
                    } else {
                        var36 = new class52(arg9, 4, 0, var10, var11, var12, var13, var15.field1933, true, null);
                    }
                    arg7.method1006(arg0, arg2, arg3, var14, var36, 512, arg8, 0, 0, var16, var17);
                } else if (arg6 == 8) {
                    class101 var37;
                    if (var15.field1933 == -1 && var15.field1926 == null) {
                        var37 = var15.method696(0, var13, var11, 0, var12, 4, var10);
                    } else {
                        var37 = new class52(arg9, 4, 0, var10, var11, var12, var13, var15.field1933, true, null);
                    }
                    arg7.method1006(arg0, arg2, arg3, var14, var37, 768, arg8, 0, 0, var16, var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V")
    public static final void method227(boolean arg0) {
        if (class106.field2589 != null) {
            class32 var1 = class106.field2589;
            synchronized (class106.field2589) {
                class106.field2589 = null;
            }
        }
        if (arg0) {
            field650 = null;
        }
        field644++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
    public static void method228(byte arg0) {
        field642 = null;
        field639 = null;
        field647 = null;
        field645 = null;
        field655 = null;
        if (arg0 > -54) {
            return;
        }
        field643 = null;
        field654 = null;
        field650 = null;
        field657 = null;
        field656 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZLof;)Z")
    public static final boolean method229(boolean arg0, class103 arg1) {
        if (arg0) {
            return false;
        }
        field651++;
        if (class106.field2609) {
            if (class7.method98(26454, arg1) != 0) {
                return false;
            }
            if (arg1.field2483 == 0) {
                return false;
            }
        }
        return arg1.field2543;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Laf;ILaf;Lkb;)[Lqc;")
    public static final class114[] method230(class7 arg0, int arg1, class7 arg2, class71 arg3) {
        field652++;
        int var4 = arg3.method586(arg2, -4795);
        if (arg1 != -16125) {
            field657 = null;
        }
        int var5 = arg3.method560(arg0, var4, -98);
        return class78.method665(arg3, var4, (byte) -51, var5);
    }
}
