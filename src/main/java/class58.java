import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class58 extends class436 {

    @OriginalMember(owner = "client!jr", name = "G", descriptor = "I")
    private int field823;

    @OriginalMember(owner = "client!jr", name = "O", descriptor = "I")
    public static int field831 = 0;

    @OriginalMember(owner = "client!jr", name = "H", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!jr", name = "I", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!jr", name = "K", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!jr", name = "L", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!jr", name = "M", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!jr", name = "P", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!jr", name = "Q", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!jr", name = "R", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!jr", name = "J", descriptor = "Llf;")
    public static class130 field826;

    @OriginalMember(owner = "client!jr", name = "N", descriptor = "[I")
    public static int[] field830;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IILeb;)V", line = 5)
    public final void method18(int arg0, int arg1, class371 arg2) {
        ++field828;
        if (arg1 == 0) {
            this.field823 = (arg2.method2429(0) << 12) / 255;
        }
        if (arg0 != 34) {
            this.field823 = -76;
        }
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(I)V", line = 32)
    public class58(int arg0) {
        super(0, true);
        this.field823 = 4096;
        this.field823 = arg0;
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "()V", line = 41)
    public class58() {
        this(4096);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(BLjj;)V", line = 44)
    public static final void method385(byte arg0, class61 arg1) {
        arg1.field905 = false;
        ++field824;
        if (arg1.field928 != -1) {
            class449 var2 = class86.method599(false, arg1.field928);
            if (var2 != null && var2.field6521 != null) {
                label303: {
                    ++arg1.field900;
                    if (arg1.field885 < var2.field6521.length && var2.field6506[arg1.field885] < arg1.field900) {
                        ++arg1.field885;
                        ++arg1.field925;
                        arg1.field900 = 1;
                        class27.method218(class307.field4211 == arg1, (byte) -90, var2, arg1.field885, arg1.field6192, arg1.field6197);
                    }
                    if (~var2.field6521.length >= ~arg1.field885) {
                        arg1.field900 = 0;
                        arg1.field885 = 0;
                        if (arg1.field861) {
                            arg1.field928 = arg1.method402(0).method1979((byte) -23);
                            if (~arg1.field928 == 0) {
                                arg1.field861 = false;
                                break label303;
                            }
                            var2 = class86.method599(false, arg1.field928);
                        }
                        class27.method218(class307.field4211 == arg1, (byte) -108, var2, arg1.field885, arg1.field6192, arg1.field6197);
                    }
                    arg1.field925 = arg1.field885 - -1;
                    if (~arg1.field925 <= ~var2.field6521.length) {
                        arg1.field925 = 0;
                    }
                }
            } else {
                arg1.field928 = -1;
                arg1.field861 = false;
            }
        }
        if (arg1.field877 != -1 && ~arg1.field897 >= ~class35.field541) {
            class69 var3 = class221.method1405(arg1.field877, -76);
            int var4 = var3.field1076;
            if (~var4 != 0) {
                label305: {
                    class449 var5 = class86.method599(false, var4);
                    if (var3.field1086) {
                        if (~var5.field6511 != -4) {
                            if (var5.field6511 == 1 && ~arg1.field947 < -1 && ~class35.field541 <= ~arg1.field912 && ~class35.field541 < ~arg1.field922) {
                                arg1.field897 = class35.field541 + 1;
                                break label305;
                            }
                        } else if (~arg1.field947 < -1 && ~class35.field541 <= ~arg1.field912 && class35.field541 > arg1.field922) {
                            arg1.field877 = -1;
                            break label305;
                        }
                    }
                    if (var5 != null && var5.field6521 != null) {
                        if (~arg1.field934 > -1) {
                            arg1.field934 = 0;
                            class27.method218(class307.field4211 == arg1, (byte) -100, var5, 0, arg1.field6192, arg1.field6197);
                        }
                        ++arg1.field930;
                        if (arg1.field934 < var5.field6521.length && var5.field6506[arg1.field934] < arg1.field930) {
                            ++arg1.field934;
                            arg1.field930 = 1;
                            class27.method218(class307.field4211 == arg1, (byte) -116, var5, arg1.field934, arg1.field6192, arg1.field6197);
                        }
                        if (~var5.field6521.length >= ~arg1.field934) {
                            if (!var3.field1086) {
                                arg1.field877 = -1;
                            } else {
                                arg1.field934 -= var5.field6501;
                                ++arg1.field883;
                                if (var5.field6505 <= arg1.field883) {
                                    arg1.field877 = -1;
                                } else if (arg1.field934 >= 0 && var5.field6521.length > arg1.field934) {
                                    class27.method218(class307.field4211 == arg1, (byte) -105, var5, arg1.field934, arg1.field6192, arg1.field6197);
                                } else {
                                    arg1.field877 = -1;
                                }
                            }
                        }
                        arg1.field924 = arg1.field934 + 1;
                        if (~arg1.field924 <= ~var5.field6521.length) {
                            if (var3.field1086) {
                                arg1.field924 -= var5.field6501;
                                if (arg1.field883 - -1 >= var5.field6505) {
                                    arg1.field924 = -1;
                                } else if (~arg1.field924 > -1 || arg1.field924 >= var5.field6521.length) {
                                    arg1.field924 = -1;
                                }
                            } else {
                                arg1.field924 = -1;
                            }
                        }
                    } else {
                        arg1.field877 = -1;
                    }
                }
            } else {
                arg1.field877 = -1;
            }
        }
        if (~arg1.field931 != 0 && ~arg1.field880 >= -2) {
            class449 var6 = class86.method599(false, arg1.field931);
            if (var6.field6511 == 3) {
                if (arg1.field947 > 0 && class35.field541 >= arg1.field912 && ~arg1.field922 > ~class35.field541) {
                    arg1.field931 = -1;
                }
            } else if (var6.field6511 == 1 && arg1.field947 > 0 && arg1.field912 <= class35.field541 && arg1.field922 < class35.field541) {
                arg1.field880 = 2;
            }
        }
        if (~arg1.field931 != 0 && ~arg1.field880 == -1) {
            class449 var7 = class86.method599(false, arg1.field931);
            if (var7 != null && var7.field6521 != null) {
                ++arg1.field904;
                if (~var7.field6521.length < ~arg1.field896 && arg1.field904 > var7.field6506[arg1.field896]) {
                    arg1.field904 = 1;
                    ++arg1.field896;
                    class27.method218(class307.field4211 == arg1, (byte) -89, var7, arg1.field896, arg1.field6192, arg1.field6197);
                }
                if (~var7.field6521.length >= ~arg1.field896) {
                    arg1.field896 -= var7.field6501;
                    ++arg1.field864;
                    if (arg1.field864 < var7.field6505) {
                        if (arg1.field896 >= 0 && var7.field6521.length > arg1.field896) {
                            class27.method218(class307.field4211 == arg1, (byte) -106, var7, arg1.field896, arg1.field6192, arg1.field6197);
                        } else {
                            arg1.field931 = -1;
                        }
                    } else {
                        arg1.field931 = -1;
                    }
                }
                arg1.field916 = arg1.field896 - -1;
                if (~arg1.field916 <= ~var7.field6521.length) {
                    arg1.field916 -= var7.field6501;
                    if (~var7.field6505 >= ~(arg1.field864 + 1)) {
                        arg1.field916 = -1;
                    } else if (~arg1.field916 > -1 || ~var7.field6521.length >= ~arg1.field916) {
                        arg1.field916 = -1;
                    }
                }
                arg1.field905 = var7.field6499;
            } else {
                arg1.field931 = -1;
            }
        }
        if (arg1.field880 > 0) {
            --arg1.field880;
        }
        for (int var8 = 0; ~var8 > ~arg1.field887.length; ++var8) {
            class7 var9 = arg1.field887[var8];
            if (var9 != null) {
                if (var9.field109 > 0) {
                    --var9.field109;
                } else {
                    class449 var10 = class86.method599(false, var9.field116);
                    if (var10 != null && var10.field6521 != null) {
                        ++var9.field113;
                        if (~var10.field6521.length < ~var9.field114 && var9.field113 > var10.field6506[var9.field114]) {
                            var9.field113 = 1;
                            ++var9.field114;
                            class27.method218(class307.field4211 == arg1, (byte) -99, var10, var9.field114, arg1.field6192, arg1.field6197);
                        }
                        if (~var10.field6521.length >= ~var9.field114) {
                            var9.field114 -= var10.field6501;
                            ++var9.field112;
                            if (~var10.field6505 >= ~var9.field112) {
                                arg1.field887[var8] = null;
                            } else if (~var9.field114 <= -1 && ~var10.field6521.length < ~var9.field114) {
                                class27.method218(class307.field4211 == arg1, (byte) -127, var10, var9.field114, arg1.field6192, arg1.field6197);
                            } else {
                                arg1.field887[var8] = null;
                            }
                        }
                        var9.field108 = var9.field114 + 1;
                        if (var10.field6521.length <= var9.field108) {
                            var9.field108 -= var10.field6501;
                            if (var9.field112 + 1 < var10.field6505) {
                                if (var9.field108 < 0 || var10.field6521.length <= var9.field108) {
                                    var9.field108 = -1;
                                }
                            } else {
                                var9.field108 = -1;
                            }
                        }
                    } else {
                        arg1.field887[var8] = null;
                    }
                }
            }
        }
        if (arg0 >= -74) {
            field826 = null;
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(III[Ljava/lang/String;[S)V", line = 360)
    public static final void method386(int arg0, int arg1, int arg2, String[] arg3, short[] arg4) {
        if (arg2 < arg0) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg2;
            String var7 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var7;
            short var8 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var8;
            for (int var9 = arg2; ~arg0 < ~var9; ++var9) {
                if (var7 == null || arg3[var9] != null && arg3[var9].compareTo(var7) < (1 & var9)) {
                    String var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    short var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg3[arg0] = arg3[var6];
            arg3[var6] = var7;
            arg4[arg0] = arg4[var6];
            arg4[var6] = var8;
            method386(var6 + -1, -16901, arg2, arg3, arg4);
            method386(arg0, -16901, var6 - -1, arg3, arg4);
        }
        ++field829;
        if (arg1 != -16901) {
            method388(true, 101);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(BIIIII)V", line = 416)
    public static final void method387(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 >= -12) {
            field826 = null;
        }
        for (int var6 = arg3; ~var6 >= ~arg2; ++var6) {
            class73.method486(arg4, class84.field1286[var6], arg5, -3, arg1);
        }
        ++field834;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZI)Z", line = 439)
    public static final boolean method388(boolean arg0, int arg1) {
        ++field832;
        if (arg1 >= -76) {
            field831 = 66;
        }
        boolean var2 = class408.field5920.method1780();
        if (arg0 == !var2) {
            if (!arg0) {
                class408.field5920.method1804();
            } else if (!class408.field5920.method1774()) {
                arg0 = false;
            }
            if (arg0 == var2) {
                return false;
            } else {
                class233.field3156 = arg0;
                class29.method228(-74, class204.field2772);
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "(B)V", line = 475)
    public static void method389(byte arg0) {
        int var1 = -73 / ((65 - arg0) / 44);
        field826 = null;
        field830 = null;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)[I", line = 485)
    public final int[] method14(int arg0, int arg1) {
        ++field827;
        if (arg1 != 18338) {
            field826 = null;
        }
        int[] var3 = super.field6258.method2688((byte) -78, arg0);
        if (super.field6258.field6138) {
            class150.method1021(var3, 0, class43.field653, this.field823);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "(I)V", line = 521)
    public static final void method390(int arg0) {
        class208.method1356(class408.field5920, (long) class35.field541, (byte) -104);
        ++field825;
        if (~class230.field3089 != 0) {
            class21.method144(class230.field3089, (byte) 122);
        }
        for (int var1 = 0; var1 < class75.field1161; ++var1) {
            if (class259.field3553[var1]) {
                class296.field4100[var1] = true;
            }
            class257.field3512[var1] = class259.field3553[var1];
            class259.field3553[var1] = false;
        }
        class217.field2874 = class35.field541;
        if (class408.field5920.method1790()) {
            class237.field3230 = true;
        }
        class286.field3947 = null;
        if (class230.field3089 != -1) {
            class75.field1161 = 0;
            class181.method1201(31383);
        }
        class408.field5920.method1812();
        class179.method1190(class89.field1363, 3163);
        class63.field980 = arg0;
    }
}
