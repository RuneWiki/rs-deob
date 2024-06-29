import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class100 extends class117 {

    @OriginalMember(owner = "client!qb", name = "R", descriptor = "I")
    private int field1927 = 10;

    @OriginalMember(owner = "client!qb", name = "ab", descriptor = "I")
    private int field1936 = 2048;

    @OriginalMember(owner = "client!qb", name = "W", descriptor = "I")
    private int field1932 = 0;

    @OriginalMember(owner = "client!qb", name = "U", descriptor = "Loj;")
    public static class17 field1930 = new class17(64);

    @OriginalMember(owner = "client!qb", name = "Z", descriptor = "Lhh;")
    public static class163 field1935 = class137.method1065("Mem:", 17);

    @OriginalMember(owner = "client!qb", name = "T", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!qb", name = "V", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!qb", name = "X", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!qb", name = "Y", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!qb", name = "cb", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!qb", name = "db", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!qb", name = "eb", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!qb", name = "fb", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!qb", name = "S", descriptor = "[I")
    private int[] field1928;

    @OriginalMember(owner = "client!qb", name = "bb", descriptor = "[I")
    private int[] field1937;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(B)V")
    public final void method57(byte arg0) {
        ++field1934;
        this.method808(2048);
        if (arg0 >= -92) {
            this.field1928 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)I")
    public static final int method807(int arg0, int arg1) {
        if (arg0 != 4096) {
            method810((byte) -36);
        }
        ++field1933;
        return 63 & arg1 >> 11;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILpg;)V")
    public final void method60(int arg0, int arg1, class81 arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field1932 = arg2.method622(true);
                }
            } else {
                this.field1936 = arg2.method658(arg0 ^ -85);
            }
        } else {
            this.field1927 = arg2.method622(true);
        }
        ++field1939;
        if (arg0 != 0) {
            method811(-48, -80, (class126) null, -10);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        int[] var3 = super.field2218.method1044(arg1, 0);
        if (arg0 != -21393) {
            this.field1927 = 24;
        }
        ++field1931;
        if (super.field2218.field2587) {
            int var4 = class214.field3911[arg1];
            if (this.field1932 != 0) {
                for (int var5 = 0; class143.field2702 > var5; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class26.field402[var5];
                    int var9 = this.field1932;
                    if (var9 != 1) {
                        if (~var9 != -3) {
                            if (~var9 == -4) {
                                var6 = 2048 - -(var8 - var4 >> 1);
                            }
                        } else {
                            var6 = (var8 + -4096 + var4 >> 1) + 2048;
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; var10 < this.field1927; ++var10) {
                        if (var6 >= this.field1928[var10] && this.field1928[var10 + 1] > var6) {
                            if (this.field1937[var10] > var6) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; ~this.field1927 < ~var12; ++var12) {
                    if (var4 >= this.field1928[var12] && this.field1928[var12 + 1] > var4) {
                        if (~this.field1937[var12] < ~var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class241.method1665(var3, 0, class143.field2702, var11);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "(I)V")
    private final void method808(int arg0) {
        ++field1940;
        this.field1937 = new int[this.field1927 + 1];
        this.field1928 = new int[this.field1927 + 1];
        int var2 = 4096 / this.field1927;
        int var3 = 0;
        int var4 = this.field1936 * var2 >> 12;
        for (int var5 = 0; this.field1927 > var5; ++var5) {
            this.field1928[var5] = var3;
            this.field1937[var5] = var3 + var4;
            var3 += var2;
        }
        if (arg0 != 2048) {
            this.field1932 = -18;
        }
        this.field1928[this.field1927] = 4096;
        this.field1937[this.field1927] = this.field1937[0] + 4096;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
    public class100() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method809(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class29 var20 = new class29(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; --var21) {
                if (class259.field4542[var21][arg1][arg2] == null) {
                    class259.field4542[var21][arg1][arg2] = new class144(var21, arg1, arg2);
                }
            }
            class259.field4542[arg0][arg1][arg2].field2737 = var20;
        } else if (arg3 != 1) {
            class47 var24 = new class47(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; --var25) {
                if (class259.field4542[var25][arg1][arg2] == null) {
                    class259.field4542[var25][arg1][arg2] = new class144(var25, arg1, arg2);
                }
            }
            class259.field4542[arg0][arg1][arg2].field2733 = var24;
        } else {
            class29 var22 = new class29(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; --var23) {
                if (class259.field4542[var23][arg1][arg2] == null) {
                    class259.field4542[var23][arg1][arg2] = new class144(var23, arg1, arg2);
                }
            }
            class259.field4542[arg0][arg1][arg2].field2737 = var22;
        }
    }

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "(B)V")
    public static void method810(byte arg0) {
        field1930 = null;
        if (arg0 != 106) {
            field1930 = null;
        }
        field1935 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILgj;I)V")
    public static final void method811(int arg0, int arg1, class126 arg2, int arg3) {
        ++field1941;
        if (arg2.field3673 == arg1 && arg1 != -1) {
            class18 var4 = class212.method1511(arg1, -1);
            int var5 = var4.field277;
            if (~var5 == -2) {
                arg2.field3665 = 0;
                arg2.field3631 = 0;
                arg2.field3658 = 0;
                arg2.field3622 = arg3;
                class222.method1571(arg2.field3658, arg2.field3615, arg2.field3633, (byte) 55, class235.field4203 == arg2, var4);
            }
            if (~var5 == -3) {
                arg2.field3631 = 0;
            }
        } else if (~arg1 == 0 || ~arg2.field3673 == 0 || ~class212.method1511(arg1, -1).field273 <= ~class212.method1511(arg2.field3673, arg0).field273) {
            arg2.field3631 = 0;
            arg2.field3622 = arg3;
            arg2.field3665 = 0;
            arg2.field3673 = arg1;
            arg2.field3658 = 0;
            arg2.field3617 = arg2.field3653;
            if (arg2.field3673 != -1) {
                class222.method1571(arg2.field3658, arg2.field3615, arg2.field3633, (byte) 113, class235.field4203 == arg2, class212.method1511(arg2.field3673, -1));
            }
        }
        if (arg0 != -1) {
            method809(29, -33, -34, 35, -34, 103, 24, 89, -83, -76, -70, 71, -109, -94, 9, 19, -74, -108, 94, -38);
        }
    }
}
