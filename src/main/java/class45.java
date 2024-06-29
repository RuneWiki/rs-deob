import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class45 extends class138 {

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "I")
    private final int field985;

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "I")
    private final int field993;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    private final int field981;

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "I")
    private final int field992;

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "Lnd;")
    public static class272 field994 = new class272(5000);

    @OriginalMember(owner = "client!sj", name = "E", descriptor = "Lvf;")
    private static class265 field1004 = class87.method582(-46, "Thu");

    @OriginalMember(owner = "client!sj", name = "H", descriptor = "Lvf;")
    private static class265 field1007 = class87.method582(-46, "Sun");

    @OriginalMember(owner = "client!sj", name = "I", descriptor = "[I")
    public static int[] field1008 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!sj", name = "A", descriptor = "I")
    public static int field1000 = -1;

    @OriginalMember(owner = "client!sj", name = "x", descriptor = "Lvf;")
    private static class265 field997 = class87.method582(-46, "flash3:");

    @OriginalMember(owner = "client!sj", name = "C", descriptor = "Lvf;")
    private static class265 field1002 = class87.method582(-46, "Tue");

    @OriginalMember(owner = "client!sj", name = "K", descriptor = "Lvf;")
    private static class265 field1010 = class87.method582(-46, " from your friend list first)3");

    @OriginalMember(owner = "client!sj", name = "B", descriptor = "Lvf;")
    public static class265 field1001 = field997;

    @OriginalMember(owner = "client!sj", name = "L", descriptor = "Lvf;")
    private static class265 field1011 = class87.method582(-46, "Mon");

    @OriginalMember(owner = "client!sj", name = "F", descriptor = "Lvf;")
    private static class265 field1005 = class87.method582(-46, "Fri");

    @OriginalMember(owner = "client!sj", name = "P", descriptor = "Lvf;")
    public static class265 field1014 = null;

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "Lvf;")
    private static class265 field999 = class87.method582(-46, "Wed");

    @OriginalMember(owner = "client!sj", name = "M", descriptor = "I")
    public static int field1012 = -1;

    @OriginalMember(owner = "client!sj", name = "N", descriptor = "Lvf;")
    public static class265 field1013 = field1010;

    @OriginalMember(owner = "client!sj", name = "J", descriptor = "Lvf;")
    public static class265 field1009 = field997;

    @OriginalMember(owner = "client!sj", name = "Q", descriptor = "Lvf;")
    private static class265 field1015 = class87.method582(-46, "Sat");

    @OriginalMember(owner = "client!sj", name = "w", descriptor = "[Lvf;")
    public static class265[] field996 = new class265[] { field1007, field1011, field1002, field999, field1004, field1005, field1015 };

    @OriginalMember(owner = "client!sj", name = "D", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!sj", name = "G", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!sj", name = "v", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!sj", name = "y", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIIBI)V")
    public static final void method370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        ++field986;
        int var8 = arg4 + arg5;
        int var9 = -arg5 + arg7;
        int var10 = -arg5 + arg1;
        if (arg6 <= 76) {
            method372(-106, 124);
        }
        for (int var11 = arg4; ~var8 < ~var11; ++var11) {
            class203.method1394(class44.field973[var11], arg0, arg7, -7249, arg2);
        }
        for (int var12 = arg1; ~var10 > ~var12; --var12) {
            class203.method1394(class44.field973[var12], arg0, arg7, -7249, arg2);
        }
        int var13 = arg0 + arg5;
        for (int var14 = var8; var10 >= var14; ++var14) {
            int[] var15 = class44.field973[var14];
            class203.method1394(var15, arg0, var13, -7249, arg2);
            class203.method1394(var15, var13, var9, -7249, arg3);
            class203.method1394(var15, var9, arg7, -7249, arg2);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lr;Lr;BZI)I")
    public static final int method371(class229 arg0, class229 arg1, byte arg2, boolean arg3, int arg4) {
        ++field998;
        if (~arg4 == -2) {
            int var5 = arg1.field1824;
            int var6 = arg0.field1824;
            if (!arg3) {
                if (~var6 == 0) {
                    var6 = 2001;
                }
                if (~var5 == 0) {
                    var5 = 2001;
                }
            }
            return -var6 + var5;
        } else if (~arg4 == -3) {
            return arg1.method1550(100).field4063.method1802(false, arg0.method1550(100).field4063);
        } else if (arg4 == 3) {
            if (!arg1.field4054.method1776((byte) -125, class242.field4226)) {
                if (arg0.field4054.method1776((byte) -120, class242.field4226)) {
                    return arg3 ? 1 : -1;
                } else {
                    return arg1.field4054.method1802(false, arg0.field4054);
                }
            } else if (arg0.field4054.method1776((byte) -125, class242.field4226)) {
                return 0;
            } else {
                return arg3 ? -1 : 1;
            }
        } else {
            int var7 = 63 % ((-3 - arg2) / 48);
            if (~arg4 == -5) {
                if (arg1.method693((byte) -69)) {
                    return !arg0.method693((byte) -54) ? 1 : 0;
                } else {
                    return !arg0.method693((byte) -66) ? 0 : -1;
                }
            } else if (~arg4 == -6) {
                if (!arg1.method694(true)) {
                    return !arg0.method694(true) ? 0 : -1;
                } else {
                    return !arg0.method694(true) ? 1 : 0;
                }
            } else if (arg4 == 6) {
                if (arg1.method692(-71)) {
                    return arg0.method692(104) ? 0 : 1;
                } else {
                    return arg0.method692(86) ? -1 : 0;
                }
            } else if (arg4 == 7) {
                if (arg1.method689(-124)) {
                    return !arg0.method689(-126) ? 1 : 0;
                } else {
                    return !arg0.method689(-128) ? 0 : -1;
                }
            } else {
                return -arg0.field4055 + arg1.field4055;
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)V")
    public static final void method372(int arg0, int arg1) {
        ++field995;
        if (~arg1 != arg0) {
            if (~arg1 == -2) {
                class104.method699(arg0 + -117);
            } else if (arg1 != 2) {
                throw new RuntimeException();
            } else {
                class51.method405(115);
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(III)V")
    public static final void method373(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class64.field1244; ++var3) {
            for (int var4 = 0; var4 < class2.field40; ++var4) {
                for (int var5 = 0; var5 < class263.field4588; ++var5) {
                    class137 var6 = class200.field3577[var3][var4][var5];
                    if (var6 != null) {
                        class144 var7 = var6.field2518;
                        if (var7 != null && var7.field2682.method165()) {
                            class9.method67(var7.field2682, var3, var4, var5, 1, 1);
                            if (var7.field2694 != null && var7.field2694.method165()) {
                                class9.method67(var7.field2694, var3, var4, var5, 1, 1);
                                var7.field2682.method151(var7.field2694, 0, 0, 0, false);
                                var7.field2694 = var7.field2694.method169(arg0, arg1, arg2);
                            }
                            var7.field2682 = var7.field2682.method169(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field2502; ++var8) {
                            class146 var10 = var6.field2506[var8];
                            if (var10 != null && var10.field2737.method165()) {
                                class9.method67(var10.field2737, var3, var4, var5, var10.field2733 - var10.field2728 + 1, var10.field2721 - var10.field2719 + 1);
                                var10.field2737 = var10.field2737.method169(arg0, arg1, arg2);
                            }
                        }
                        class8 var9 = var6.field2501;
                        if (var9 != null && var9.field270.method165()) {
                            class268.method1831(var9.field270, var3, var4, var5);
                            var9.field270 = var9.field270.method169(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(II)V")
    public static final void method374(int arg0, int arg1) {
        class163.field2958.method1891(-23549, arg0);
        ++field984;
        if (arg1 < 43) {
            field1014 = null;
        }
        class231.field4086.method1891(-23549, arg0);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IBI)V")
    public final void method375(int arg0, byte arg1, int arg2) {
        ++field990;
        if (arg1 < -21) {
            int var4 = this.field993 * arg0 >> 12;
            int var5 = this.field992 * arg2 >> 12;
            int var6 = this.field981 * arg0 >> 12;
            int var7 = this.field985 * arg2 >> 12;
            class170.method1122(var4, var6, super.field2527, var7, var5, super.field2526, (byte) 125, super.field2522);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method376(int arg0, byte[] arg1) {
        ++field991;
        if (arg0 >= -35) {
            method370(61, -112, -59, 42, -77, -25, (byte) -69, 65);
        }
        class135 var2 = new class135(arg1);
        int var3 = var2.method920((byte) 117);
        int var4 = var2.method949(3933);
        if (~var4 <= -1 && (~class96.field1699 == -1 || var4 <= class96.field1699)) {
            if (~var3 == -1) {
                byte[] var7 = new byte[var4];
                var2.method917(var7, var4, -20730, 0);
                return var7;
            } else {
                int var5 = var2.method949(3933);
                if (~var5 <= -1 && (~class96.field1699 == -1 || var5 <= class96.field1699)) {
                    byte[] var6 = new byte[var5];
                    if (~var3 == -2) {
                        class90.method616(var6, var5, arg1, var4, 9);
                    } else {
                        class97.field1710.method1018((byte) 124, var6, var2);
                    }
                    return var6;
                } else {
                    throw new RuntimeException();
                }
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILcg;)V")
    public static final void method377(int arg0, class34 arg1) {
        ++field988;
        for (int var2 = 0; class199.field3553.length > var2; ++var2) {
            class199.field3553[var2] = 0;
        }
        short var3 = 256;
        for (int var4 = 0; var4 < 5000; ++var4) {
            int var16 = (int) (Math.random() * 128.0D * (double) var3);
            class199.field3553[var16] = (int) (284.0D * Math.random());
        }
        if (arg0 != 1) {
            field996 = null;
        }
        for (int var5 = 0; var5 < 20; ++var5) {
            for (int var12 = 1; ~var12 > ~(var3 - 1); ++var12) {
                for (int var14 = 1; var14 < 127; ++var14) {
                    int var15 = (var12 << 7) + var14;
                    class242.field4224[var15] = (class199.field3553[var15 + 128] + class199.field3553[var15 + -128] + class199.field3553[var15 + 1] + class199.field3553[var15 + -1]) / 4;
                }
            }
            int[] var13 = class199.field3553;
            class199.field3553 = class242.field4224;
            class242.field4224 = var13;
        }
        if (arg1 != null) {
            int var6 = 0;
            for (int var7 = 0; ~arg1.field2935 < ~var7; ++var7) {
                for (int var8 = 0; ~var8 > ~arg1.field2925; ++var8) {
                    if (arg1.field819[var6++] != 0) {
                        int var9 = var8 - -arg1.field2931 + 16;
                        int var10 = arg1.field2923 + var7 + 16;
                        int var11 = var9 - -(var10 << 7);
                        class199.field3553[var11] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIZ)V")
    public final void method378(int arg0, int arg1, boolean arg2) {
        int var4 = this.field993 * arg1 >> 12;
        if (arg2) {
            method377(-96, (class34) null);
        }
        ++field983;
        int var5 = this.field992 * arg0 >> 12;
        int var6 = this.field985 * arg0 >> 12;
        int var7 = this.field981 * arg1 >> 12;
        class121.method810(var4, true, var6, var7, var5, super.field2526);
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(III)Lvf;")
    public static final class265 method379(int arg0, int arg1, int arg2) {
        int var3 = -arg0 + arg1;
        ++field982;
        if (~var3 > 8) {
            return class7.field261;
        } else {
            if (arg2 != 16777215) {
                method376(65, (byte[]) null);
            }
            if (var3 < -6) {
                return class178.field3176;
            } else if (var3 < -3) {
                return class108.field1901;
            } else if (~var3 > -1) {
                return class30.field767;
            } else if (var3 > 9) {
                return class21.field621;
            } else if (~var3 < -7) {
                return class177.field3149;
            } else if (var3 > 3) {
                return class5.field72;
            } else {
                return ~var3 < -1 ? class142.field2629 : class147.field2753;
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(III)V")
    public final void method380(int arg0, int arg1, int arg2) {
        if (arg1 == 10) {
            ++field1003;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V")
    public static void method381(boolean arg0) {
        field1009 = null;
        field1010 = null;
        if (arg0) {
            field1002 = null;
            field1014 = null;
            field997 = null;
            field1007 = null;
            field994 = null;
            field1005 = null;
            field1008 = null;
            field1011 = null;
            field1013 = null;
            field996 = null;
            field1004 = null;
            field999 = null;
            field1015 = null;
            field1001 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(IIIIIII)V")
    public class45(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field985 = arg3;
        this.field993 = arg0;
        this.field981 = arg2;
        this.field992 = arg1;
    }
}
