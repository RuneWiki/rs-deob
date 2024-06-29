import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class222 extends class212 {

    @OriginalMember(owner = "client!oc", name = "fb", descriptor = "I")
    private int field3838 = -1;

    @OriginalMember(owner = "client!oc", name = "W", descriptor = "Lsc;")
    public static class181 field3829 = class149.method967(255, "mapfunction");

    @OriginalMember(owner = "client!oc", name = "X", descriptor = "[I")
    public static int[] field3830 = new int[500];

    @OriginalMember(owner = "client!oc", name = "V", descriptor = "Z")
    public static boolean field3828 = false;

    @OriginalMember(owner = "client!oc", name = "Z", descriptor = "I")
    public static int field3832 = 0;

    @OriginalMember(owner = "client!oc", name = "nb", descriptor = "[I")
    public static int[] field3846 = new int[128];

    @OriginalMember(owner = "client!oc", name = "kb", descriptor = "Lsc;")
    private static class181 field3843 = class149.method967(255, "flash2:");

    @OriginalMember(owner = "client!oc", name = "Y", descriptor = "Lsc;")
    public static class181 field3831 = field3843;

    @OriginalMember(owner = "client!oc", name = "jb", descriptor = "Lsc;")
    public static class181 field3842 = field3843;

    @OriginalMember(owner = "client!oc", name = "ab", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!oc", name = "bb", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!oc", name = "cb", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!oc", name = "db", descriptor = "I")
    private int field3836;

    @OriginalMember(owner = "client!oc", name = "eb", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!oc", name = "gb", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!oc", name = "hb", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!oc", name = "ib", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!oc", name = "lb", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!oc", name = "pb", descriptor = "I")
    private int field3848;

    @OriginalMember(owner = "client!oc", name = "qb", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!oc", name = "rb", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!oc", name = "sb", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!oc", name = "mb", descriptor = "[I")
    private int[] field3845;

    @OriginalMember(owner = "client!oc", name = "ob", descriptor = "[I")
    public static int[] field3847;

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
    public class222() {
        super(0, false);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1470(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3841;
        if (arg2 <= 119) {
            method1473(104, 38, 87);
        }
        int var7 = -arg1 + arg3;
        int var8 = arg1 + arg5;
        int var9 = -arg1 + arg0;
        int var10 = arg1 + arg6;
        for (int var11 = arg6; ~var11 > ~var10; ++var11) {
            class171.method1133(class149.field2507[var11], arg5, arg4, arg0, (byte) 125);
        }
        for (int var12 = arg3; ~var12 < ~var7; --var12) {
            class171.method1133(class149.field2507[var12], arg5, arg4, arg0, (byte) 125);
        }
        for (int var13 = var10; ~var7 <= ~var13; ++var13) {
            int[] var14 = class149.field2507[var13];
            class171.method1133(var14, arg5, arg4, var8, (byte) 125);
            class171.method1133(var14, var9, arg4, arg0, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(JB)Lsc;")
    public static final class181 method1471(long arg0, byte arg1) {
        if (arg1 >= -46) {
            field3844 = 19;
        }
        ++field3839;
        return class27.method229(arg0, false, 10, -32);
    }

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)I")
    public final int method1411(int arg0) {
        if (arg0 != -1) {
            this.method26((class230) null, -94, 60);
        }
        ++field3850;
        return this.field3838;
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(III)V")
    public static final void method1472(int arg0, int arg1, int arg2) {
        class149.field2499 = true;
        class98.field1588 = arg0;
        class12.field249 = arg1;
        class38.field585 = arg2;
        class194.field3389 = -1;
        class123.field2024 = -1;
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)V")
    public final void method1042(int arg0) {
        ++field3835;
        super.method1042(arg0);
        this.field3845 = null;
    }

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "(III)Z")
    public static final boolean method1473(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class215.field3701; ++var3) {
            class60 var4 = class11.field195[var3];
            if (var4.field918 == 1) {
                int var5 = var4.field912 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field910 * var5 >> 8) + var4.field905;
                    int var7 = (var4.field911 * var5 >> 8) + var4.field913;
                    int var8 = (var4.field897 * var5 >> 8) + var4.field904;
                    int var9 = (var4.field900 * var5 >> 8) + var4.field914;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field918 == 2) {
                int var10 = arg0 - var4.field912;
                if (var10 > 0) {
                    int var11 = (var4.field910 * var10 >> 8) + var4.field905;
                    int var12 = (var4.field911 * var10 >> 8) + var4.field913;
                    int var13 = (var4.field897 * var10 >> 8) + var4.field904;
                    int var14 = (var4.field900 * var10 >> 8) + var4.field914;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field918 == 3) {
                int var15 = var4.field905 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field919 * var15 >> 8) + var4.field912;
                    int var17 = (var4.field906 * var15 >> 8) + var4.field922;
                    int var18 = (var4.field897 * var15 >> 8) + var4.field904;
                    int var19 = (var4.field900 * var15 >> 8) + var4.field914;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field918 == 4) {
                int var20 = arg2 - var4.field905;
                if (var20 > 0) {
                    int var21 = (var4.field919 * var20 >> 8) + var4.field912;
                    int var22 = (var4.field906 * var20 >> 8) + var4.field922;
                    int var23 = (var4.field897 * var20 >> 8) + var4.field904;
                    int var24 = (var4.field900 * var20 >> 8) + var4.field914;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field918 == 5) {
                int var25 = arg1 - var4.field904;
                if (var25 > 0) {
                    int var26 = (var4.field919 * var25 >> 8) + var4.field912;
                    int var27 = (var4.field906 * var25 >> 8) + var4.field922;
                    int var28 = (var4.field910 * var25 >> 8) + var4.field905;
                    int var29 = (var4.field911 * var25 >> 8) + var4.field913;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(IB)Z")
    public static final boolean method1474(int arg0, byte arg1) {
        ++field3834;
        if (~arg0 <= -98 && arg0 <= 122) {
            return true;
        } else if (arg0 >= 65 && arg0 <= 90) {
            return true;
        } else if (~arg0 <= -49 && ~arg0 >= -58) {
            return true;
        } else {
            if (arg1 != 64) {
                field3842 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(II)[[I")
    public final int[][] method260(int arg0, int arg1) {
        if (arg1 != 16383) {
            this.method260(-93, -42);
        }
        ++field3849;
        int[][] var3 = super.field3645.method1352(arg0, -123);
        if (super.field3645.field3477 && this.method1475(128)) {
            int var4 = this.field3836 * (class97.field1577 == this.field3848 ? arg0 : this.field3848 * arg0 / class97.field1577);
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            if (~class26.field452 != ~this.field3836) {
                for (int var8 = 0; class26.field452 > var8; ++var8) {
                    int var9 = this.field3836 * var8 / class26.field452;
                    int var10 = this.field3845[var4 + var9];
                    var6[var8] = class5.method43(255, var10) << 4;
                    var7[var8] = class5.method43(var10 >> 4, 4080);
                    var5[var8] = class5.method43(4080, var10 >> 12);
                }
            } else {
                for (int var11 = 0; ~var11 > ~class26.field452; ++var11) {
                    int var12 = this.field3845[var4++];
                    var6[var11] = class5.method43(4080, var12 << 4);
                    var7[var11] = class5.method43(var12, 65280) >> 4;
                    var5[var11] = class5.method43(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "(I)Z")
    private final boolean method1475(int arg0) {
        ++field3833;
        if (this.field3845 != null) {
            return true;
        } else if (this.field3838 >= 0) {
            int var2 = class26.field452;
            int var3 = class97.field1577;
            int var4 = class126.field2085.method933(this.field3838, (byte) 106) ? 64 : 128;
            this.field3845 = class126.field2085.method946(-1, this.field3838);
            this.field3836 = var4;
            this.field3848 = var4;
            class52.method389(var2, var3, (byte) -4);
            return this.field3845 != null;
        } else {
            return arg0 != 128 ? false : false;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lvf;II)V")
    public final void method26(class230 arg0, int arg1, int arg2) {
        if (arg2 != -3) {
            field3843 = null;
        }
        ++field3837;
        if (arg1 == 0) {
            this.field3838 = arg0.method1535(arg2 + 5);
        }
    }

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "(I)V")
    public static void method1476(int arg0) {
        field3843 = null;
        field3846 = null;
        field3829 = null;
        field3842 = null;
        field3831 = null;
        field3847 = null;
        int var1 = 47 / ((arg0 - 36) / 47);
        field3830 = null;
    }
}
