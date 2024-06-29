import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class253 extends class227 {

    @OriginalMember(owner = "client!lj", name = "y", descriptor = "I")
    private int field3818;

    @OriginalMember(owner = "client!lj", name = "D", descriptor = "I")
    private int field3823;

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "I")
    private int field3816;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "I")
    private int field3804;

    @OriginalMember(owner = "client!lj", name = "G", descriptor = "I")
    private int field3826;

    @OriginalMember(owner = "client!lj", name = "C", descriptor = "I")
    private int field3822;

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "I")
    private int field3813;

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "I")
    private int field3811;

    @OriginalMember(owner = "client!lj", name = "A", descriptor = "I")
    public static int field3820 = 0;

    @OriginalMember(owner = "client!lj", name = "F", descriptor = "Z")
    public static boolean field3825 = true;

    @OriginalMember(owner = "client!lj", name = "B", descriptor = "Lpi;")
    public static class201 field3821 = new class201(64);

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!lj", name = "E", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "Llc;")
    public static class270 field3809;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lj", name = "H", descriptor = "Ljava/lang/Class;")
    public static Class field3827;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "[[[B")
    public static byte[][][] field3806;

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class253(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field3818 = arg2;
        this.field3823 = arg3;
        this.field3816 = arg4;
        this.field3804 = arg1;
        this.field3826 = arg6;
        this.field3822 = arg7;
        this.field3813 = arg5;
        this.field3811 = arg0;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(III[BZ[Lii;IZ)[I")
    public static final int[] method1739(int arg0, int arg1, int arg2, byte[] arg3, boolean arg4, class228[] arg5, int arg6, boolean arg7) {
        ++field3814;
        byte var8;
        if (!arg7) {
            var8 = 4;
        } else {
            var8 = 1;
        }
        if (!arg7) {
            for (int var9 = 0; var9 < 4; ++var9) {
                for (int var10 = 0; ~var10 > -65; ++var10) {
                    for (int var11 = 0; var11 < 64; ++var11) {
                        if (arg1 - -var10 > 0 && ~(arg1 + var10) > -104 && arg0 - -var11 > 0 && ~(arg0 + var11) > -104) {
                            arg5[var9].field3351[arg1 + var10][arg0 + var11] = class301.method2056(arg5[var9].field3351[arg1 + var10][arg0 + var11], -2097153);
                        }
                    }
                }
            }
        }
        int var12 = arg1 + arg2;
        class53 var13 = new class53(arg3);
        int var14 = arg0 + arg6;
        for (int var15 = 0; var15 < var8; ++var15) {
            for (int var39 = 0; var39 < 64; ++var39) {
                for (int var40 = 0; var40 < 64; ++var40) {
                    class277.method1922((byte) 105, var39 - -arg1, var14 - -var40, 0, var15, var40 - -arg0, arg7, 0, var12 - -var39, 0, var13, false);
                }
            }
        }
        boolean var16 = false;
        boolean var17 = false;
        while (~var13.field735 > ~var13.field758.length) {
            int var18 = var13.method366(-16505);
            if (~var18 == -129) {
                var16 = true;
                class123.field2042[0] = var13.method331(-86);
                class123.field2042[1] = var13.method337(101);
                class123.field2042[2] = var13.method337(77);
                class123.field2042[3] = var13.method337(114);
                class123.field2042[4] = var13.method331(-17);
            } else {
                if (var18 != 129) {
                    --var13.field735;
                    break;
                }
                for (int var19 = 0; ~var19 > -5; ++var19) {
                    byte var20 = var13.method335((byte) 26);
                    if (var20 != 0) {
                        if (var20 != 1) {
                            if (var20 == 2 && ~var19 < -1) {
                                int var21 = arg0;
                                int var22 = arg1 + 64;
                                if (arg0 < 0) {
                                    var21 = 0;
                                } else if (~arg0 <= -105) {
                                    var21 = 104;
                                }
                                int var23 = arg1;
                                if (~var22 > -1) {
                                    var22 = 0;
                                } else if (var22 >= 104) {
                                    var22 = 104;
                                }
                                int var24 = arg0 - -64;
                                if (~var24 > -1) {
                                    var24 = 0;
                                } else if (var24 >= 104) {
                                    var24 = 104;
                                }
                                if (~arg1 > -1) {
                                    var23 = 0;
                                } else if (arg1 >= 104) {
                                    var23 = 104;
                                }
                                while (var22 > var23) {
                                    while (var21 < var24) {
                                        class26.field286[var19][var23][var21] = class26.field286[var19 + -1][var23][var21];
                                        ++var21;
                                    }
                                    ++var23;
                                }
                            }
                        } else {
                            for (int var25 = 0; var25 < 64; var25 += 4) {
                                for (int var26 = 0; var26 < 64; var26 += 4) {
                                    byte var27 = var13.method335((byte) 26);
                                    for (int var28 = arg1 + var25; var28 < arg1 + var25 + 4; ++var28) {
                                        for (int var29 = arg0 + var26; ~var29 > ~(arg0 + var26 + 4); ++var29) {
                                            if (~var28 <= -1 && var28 < 104 && var29 >= 0 && ~var29 > -105) {
                                                class26.field286[var19][var28][var29] = var27;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        int var30 = arg1;
                        int var31 = arg0;
                        if (arg0 >= 0) {
                            if (arg0 >= 104) {
                                var31 = 104;
                            }
                        } else {
                            var31 = 0;
                        }
                        int var32 = arg1 + 64;
                        int var33 = arg0 + 64;
                        if (~var33 <= -1) {
                            if (var33 >= 104) {
                                var33 = 104;
                            }
                        } else {
                            var33 = 0;
                        }
                        if (~var32 > -1) {
                            var32 = 0;
                        } else if (var32 >= 104) {
                            var32 = 104;
                        }
                        if (arg1 >= 0) {
                            if (arg1 >= 104) {
                                var30 = 104;
                            }
                        } else {
                            var30 = 0;
                        }
                        while (var30 < var32) {
                            while (var33 > var31) {
                                class26.field286[var19][var30][var31] = 0;
                                ++var31;
                            }
                            ++var30;
                        }
                    }
                }
                var17 = true;
            }
        }
        if (!var17) {
            for (int var34 = 0; var34 < 4; ++var34) {
                for (int var35 = 0; var35 < 16; ++var35) {
                    for (int var36 = 0; var36 < 16; ++var36) {
                        int var37 = (arg0 >> 2) + var36;
                        int var38 = (arg1 >> 2) + var35;
                        if (~var38 <= -1 && ~var38 > -27 && ~var37 <= -1 && ~var37 > -27) {
                            class26.field286[var34][var38][var37] = 0;
                        }
                    }
                }
            }
        }
        if (!arg4) {
            return null;
        } else if (!var16) {
            return null;
        } else {
            return class123.field2042;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIB)V")
    public final void method485(int arg0, int arg1, byte arg2) {
        ++field3815;
        if (arg2 != 124) {
            method1744((byte) -117);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IB)V")
    public static final void method1740(int arg0, byte arg1) {
        if (arg1 == -2) {
            ++field3805;
            class17.field175.method1416(arg0, arg1 + 2);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(III)V")
    public final void method486(int arg0, int arg1, int arg2) {
        if (arg2 != 769) {
            method1743(-112, -71, 72, -77, -104);
        }
        ++field3812;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V")
    public static final void method1741(byte arg0) {
        try {
            Method var1 = (field3827 != null ? field3827 : (field3827 = method1746("java.lang.Runtime"))).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class246.field3634 = (int) (var3 / 1048576L) - -1;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        ++field3808;
        if (arg0 <= 39) {
            method1745((class207) null, 125);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Llc;Llc;BLlc;Llc;)V")
    public static final void method1742(class270 arg0, class270 arg1, byte arg2, class270 arg3, class270 arg4) {
        class98.field1674 = arg3;
        class121.field2009 = arg0;
        ++field3819;
        class263.field4185 = arg4;
        class53.field805 = arg1;
        class134.field2195 = new class263[class53.field805.method1880(-3333)][];
        int var5 = 28 % ((arg2 - -79) / 46);
        class44.field578 = new boolean[class53.field805.method1880(-3333)];
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIII)V")
    public static final void method1743(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == 2778) {
            if (arg1 >= class73.field1156 && class59.field859 >= arg1) {
                int var5 = class289.method1972(class264.field4230, (byte) 122, arg3, class273.field4418);
                int var6 = class289.method1972(class264.field4230, (byte) 122, arg2, class273.field4418);
                class99.method777(var5, -1, var6, arg1, arg4);
            }
            ++field3824;
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(III)V")
    public final void method487(int arg0, int arg1, int arg2) {
        ++field3807;
        int var4 = this.field3811 * arg0 >> 12;
        int var5 = this.field3823 * arg2 >> 12;
        int var6 = this.field3818 * arg0 >> 12;
        if (arg1 != 8199) {
            field3820 = -41;
        }
        int var7 = this.field3804 * arg2 >> 12;
        int var8 = this.field3816 * arg0 >> 12;
        int var9 = this.field3826 * arg0 >> 12;
        int var10 = this.field3813 * arg2 >> 12;
        int var11 = this.field3822 * arg2 >> 12;
        class228.method1585(var11, var7, var8, var10, var9, var6, var4, super.field3331, (byte) -18, var5);
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)V")
    public static void method1744(byte arg0) {
        if (arg0 == 0) {
            field3821 = null;
            field3809 = null;
            field3806 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ldk;I)I")
    public static final int method1745(class207 arg0, int arg1) {
        ++field3810;
        int var2 = arg0.field3064;
        class294 var3 = arg0.method1708(arg1 ^ arg1);
        if (~arg0.field3752 == ~var3.field4703) {
            var2 = arg0.field3043;
        } else if (~arg0.field3752 != ~var3.field4713 && ~arg0.field3752 != ~var3.field4680 && arg0.field3752 != var3.field4689 && ~arg0.field3752 != ~var3.field4681) {
            if (arg0.field3752 == var3.field4710 || ~arg0.field3752 == ~var3.field4674 || ~arg0.field3752 == ~var3.field4706 || ~arg0.field3752 == ~var3.field4679) {
                var2 = arg0.field3072;
            }
        } else {
            var2 = arg0.field3040;
        }
        return var2;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1746(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
