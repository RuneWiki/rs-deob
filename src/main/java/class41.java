import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class41 extends class23 {

    @OriginalMember(owner = "client!dg", name = "Q", descriptor = "I")
    private int field833 = 8192;

    @OriginalMember(owner = "client!dg", name = "N", descriptor = "I")
    private int field830 = 12288;

    @OriginalMember(owner = "client!dg", name = "bb", descriptor = "I")
    private int field844 = 4096;

    @OriginalMember(owner = "client!dg", name = "fb", descriptor = "I")
    private int field848 = 0;

    @OriginalMember(owner = "client!dg", name = "eb", descriptor = "I")
    private int field847 = 2048;

    @OriginalMember(owner = "client!dg", name = "kb", descriptor = "I")
    private int field853 = 2048;

    @OriginalMember(owner = "client!dg", name = "Z", descriptor = "I")
    private int field842 = 0;

    @OriginalMember(owner = "client!dg", name = "cb", descriptor = "I")
    public static int field845 = 0;

    @OriginalMember(owner = "client!dg", name = "hb", descriptor = "Ldc;")
    public static class37 field850 = class185.method1233((byte) 86, "Zu viele Anmelde)2Versuche von Ihrer Adresse");

    @OriginalMember(owner = "client!dg", name = "Y", descriptor = "Ldc;")
    public static class37 field841 = null;

    @OriginalMember(owner = "client!dg", name = "lb", descriptor = "Ldc;")
    public static class37 field854 = class185.method1233((byte) 86, "Weiter");

    @OriginalMember(owner = "client!dg", name = "db", descriptor = "Z")
    public static boolean field846 = false;

    @OriginalMember(owner = "client!dg", name = "gb", descriptor = "Ldc;")
    private static class37 field849 = class185.method1233((byte) 86, "Please use a different world)3");

    @OriginalMember(owner = "client!dg", name = "mb", descriptor = "Ldc;")
    public static class37 field855 = field849;

    @OriginalMember(owner = "client!dg", name = "ab", descriptor = "Ldc;")
    public static class37 field843 = field849;

    @OriginalMember(owner = "client!dg", name = "O", descriptor = "Loa;")
    public static class153 field831 = new class153(32);

    @OriginalMember(owner = "client!dg", name = "qb", descriptor = "I")
    public static int field859 = 0;

    @OriginalMember(owner = "client!dg", name = "sb", descriptor = "I")
    public static int field861 = -1;

    @OriginalMember(owner = "client!dg", name = "L", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!dg", name = "M", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!dg", name = "P", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!dg", name = "R", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!dg", name = "S", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!dg", name = "T", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!dg", name = "U", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!dg", name = "V", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!dg", name = "W", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!dg", name = "X", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!dg", name = "ib", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!dg", name = "ob", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!dg", name = "rb", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!dg", name = "nb", descriptor = "Ldc;")
    public static class37 field856;

    @OriginalMember(owner = "client!dg", name = "pb", descriptor = "Ldj;")
    public static class44 field858;

    @OriginalMember(owner = "client!dg", name = "jb", descriptor = "Z")
    public static boolean field852;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(III)Z")
    private final boolean method358(int arg0, int arg1, int arg2) {
        int var4 = (arg2 - arg1) * this.field830 >> 12;
        ++field839;
        if (arg0 < 86) {
            field852 = false;
        }
        int var5 = class120.field2144[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field830;
        int var7 = (var6 << 12) / this.field833;
        int var8 = this.field844 * var7 >> 12;
        return ~var8 < ~(arg1 - -arg2) && ~(arg1 + arg2) < ~(-var8);
    }

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "(I)V")
    public final void method53(int arg0) {
        class74.method521(2);
        if (arg0 != -21746) {
            this.field833 = -46;
        }
        ++field832;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method358(24, 115, 66);
        }
        ++field837;
        int[] var3 = super.field405.method1461(arg1, (byte) -116);
        if (super.field405.field4114) {
            int var4 = class167.field3196[arg1] - 2048;
            for (int var5 = 0; class199.field3705 > var5; ++var5) {
                int var6 = class133.field2477[var5] + -2048;
                int var7 = this.field847 + var6;
                int var8 = this.field848 + var4;
                int var9 = ~var7 <= 2047 ? var7 : var7 + 4096;
                int var10 = this.field842 + var6;
                int var11 = var10 >= -2048 ? var10 : var10 + 4096;
                int var12 = ~var9 < -2049 ? var9 + -4096 : var9;
                int var13 = ~var8 <= 2047 ? var8 : var8 + 4096;
                int var14 = var13 > 2048 ? var13 + -4096 : var13;
                int var15 = ~var11 < -2049 ? var11 + -4096 : var11;
                int var16 = this.field853 + var4;
                int var17 = var16 >= -2048 ? var16 : var16 + 4096;
                int var18 = var17 > 2048 ? var17 + -4096 : var17;
                var3[var5] = !this.method358(114, var12, var14) && !this.method364(var15, var18, 109) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "(I)V")
    public static void method359(int arg0) {
        field855 = null;
        field843 = null;
        field856 = null;
        field854 = null;
        field841 = null;
        field850 = null;
        field858 = null;
        field849 = null;
        if (arg0 != 6094) {
            method360((class37) null, (class238) null, (class37) null, true);
        }
        field831 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ldc;Lwa;Ldc;Z)[Ljc;")
    public static final class100[] method360(class37 arg0, class238 arg1, class37 arg2, boolean arg3) {
        int var4 = arg1.method1543(85, arg0);
        ++field828;
        int var5 = arg1.method1546(arg2, -81, var4);
        return !arg3 ? null : class147.method1012(arg1, var5, var4, 0);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BIZ)Ldc;")
    public static final class37 method361(byte arg0, int arg1, boolean arg2) {
        ++field834;
        if (arg0 > 0) {
            method360((class37) null, (class238) null, (class37) null, true);
        }
        return class180.method1198(arg2, 10, -23328, arg1);
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(B)V")
    public static final void method362(byte arg0) {
        if (class31.field632 > class244.field4471) {
            class244.field4471 += class244.field4471 / 30.0D;
            if (class244.field4471 > class31.field632) {
                class244.field4471 = class31.field632;
            }
            class133.method924(15);
        } else if (class31.field632 < class244.field4471) {
            class244.field4471 -= class244.field4471 / 30.0D;
            if (class244.field4471 < class31.field632) {
                class244.field4471 = class31.field632;
            }
            class133.method924(15);
        }
        if (arg0 >= -97) {
            field831 = null;
        }
        ++field836;
        if (~class147.field2811 != 0 && class168.field3206 != -1) {
            int var1 = class147.field2811 - class240.field4412;
            int var2 = -class20.field338 + class168.field3206;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 4;
            }
            if (~var2 > -3 || ~var2 < -3) {
                var2 >>= 4;
            }
            class240.field4412 += var1;
            if (~var1 == -1 && var2 == 0) {
                class168.field3206 = -1;
                class147.field2811 = -1;
            }
            class20.field338 += var2;
            class133.method924(15);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (~arg1 <= ~class29.field536 && arg3 <= class82.field1458 && ~arg6 <= ~class198.field3697 && arg7 <= class199.field3712) {
            class245.method1593(arg6, arg4, arg2, arg0, arg1, (byte) 88, arg3, arg7);
        } else {
            class140.method982(arg4, arg3, arg5 ^ 2049, arg1, arg7, arg2, arg0, arg6);
        }
        ++field851;
        if (arg5 != 2048) {
            field859 = 9;
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
    public class41() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lce;II)V")
    public final void method40(class28 arg0, int arg1, int arg2) {
        if (arg2 == 1000) {
            ++field829;
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (~arg1 != -3) {
                        if (arg1 != 3) {
                            if (arg1 != 4) {
                                if (arg1 != 5) {
                                    if (~arg1 == -7) {
                                        this.field833 = arg0.method230((byte) -114);
                                    }
                                } else {
                                    this.field844 = arg0.method230((byte) -127);
                                }
                            } else {
                                this.field830 = arg0.method230((byte) -114);
                            }
                        } else {
                            this.field853 = arg0.method230((byte) -123);
                        }
                    } else {
                        this.field842 = arg0.method230((byte) -120);
                    }
                } else {
                    this.field848 = arg0.method230((byte) -122);
                }
            } else {
                this.field847 = arg0.method230((byte) -119);
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(III)Z")
    private final boolean method364(int arg0, int arg1, int arg2) {
        int var4 = (arg0 + arg1) * this.field830 >> 12;
        ++field835;
        int var5 = class120.field2144[(var4 * 255 & 1047895) >> 12];
        int var6 = (var5 << 12) / this.field830;
        if (arg2 <= 98) {
            return true;
        } else {
            int var7 = (var6 << 12) / this.field833;
            int var8 = this.field844 * var7 >> 12;
            return var8 > -arg0 + arg1 && ~(-var8) > ~(arg1 - arg0);
        }
    }
}
