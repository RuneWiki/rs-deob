import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class289 extends class432 {

    @OriginalMember(owner = "client!pj", name = "C", descriptor = "I")
    private int field3977;

    @OriginalMember(owner = "client!pj", name = "D", descriptor = "I")
    private int field3978;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
    private int field3959;

    @OriginalMember(owner = "client!pj", name = "y", descriptor = "I")
    private int field3973;

    @OriginalMember(owner = "client!pj", name = "B", descriptor = "I")
    private int field3976;

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "I")
    private int field3967;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
    private int field3961;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
    private int field3962;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "Llt;")
    public static class172 field3958 = new class172();

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "I")
    public static int field3968 = 0;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "[Z")
    public static boolean[] field3960 = new boolean[100];

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "Z")
    public static boolean field3974 = false;

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "Lfn;")
    public static class52 field3972 = new class52(43, 5);

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!pj", name = "A", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!pj", name = "E", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!pj", name = "F", descriptor = "I")
    public static int field3980;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pj", name = "G", descriptor = "Ljava/lang/Class;")
    public static Class field3981;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "[I")
    public static int[] field3964;

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "[Laq;")
    public static class385[] field3971;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)V")
    public final void method1597(int arg0, int arg1, int arg2) {
        ++field3970;
        if (arg2 != -20714) {
            method1778(-29, -12, -69, -47, 48, 62, 114);
        }
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class289(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field3977 = arg4;
        this.field3978 = arg0;
        this.field3959 = arg5;
        this.field3973 = arg7;
        this.field3976 = arg3;
        this.field3967 = arg1;
        this.field3961 = arg2;
        this.field3962 = arg6;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1778(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3969;
        int var7 = class229.method1443(class53.field874, arg5, class8.field174, (byte) -68);
        int var8 = class229.method1443(class53.field874, arg2, class8.field174, (byte) -68);
        int var9 = class229.method1443(class299.field4121, arg6, class248.field3487, (byte) -68);
        int var10 = class229.method1443(class299.field4121, arg3, class248.field3487, (byte) -68);
        int var11 = class229.method1443(class53.field874, arg5 - -arg4, class8.field174, (byte) -68);
        int var12 = class229.method1443(class53.field874, -arg4 + arg2, class8.field174, (byte) -68);
        for (int var13 = var7; var11 > var13; ++var13) {
            class80.method554(class2.field16[var13], 100, arg1, var10, var9);
        }
        int var14 = var8;
        if (arg0 < 95) {
            field3972 = null;
        }
        while (var14 > var12) {
            class80.method554(class2.field16[var14], 124, arg1, var10, var9);
            --var14;
        }
        int var15 = class229.method1443(class299.field4121, arg4 + arg6, class248.field3487, (byte) -68);
        int var16 = class229.method1443(class299.field4121, -arg4 + arg3, class248.field3487, (byte) -68);
        for (int var17 = var11; var17 <= var12; ++var17) {
            int[] var18 = class2.field16[var17];
            class80.method554(var18, 111, arg1, var15, var9);
            class80.method554(var18, 111, arg1, var10, var16);
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(III)V")
    public static final void method1779(int arg0, int arg1, int arg2) {
        ++field3975;
        class265 var3 = class440.method2554(arg1, 2, 1);
        if (arg2 >= -86) {
            method1778(48, -19, -57, 109, 114, -112, 104);
        }
        var3.method1675(false);
        var3.field3698 = arg0;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BII)V")
    public final void method1601(byte arg0, int arg1, int arg2) {
        if (arg0 >= -60) {
            this.field3959 = 54;
        }
        ++field3965;
        int var4 = this.field3978 * arg2 >> 12;
        int var5 = this.field3967 * arg1 >> 12;
        int var6 = this.field3961 * arg2 >> 12;
        int var7 = this.field3976 * arg1 >> 12;
        int var8 = this.field3977 * arg2 >> 12;
        int var9 = this.field3959 * arg1 >> 12;
        int var10 = this.field3962 * arg2 >> 12;
        int var11 = this.field3973 * arg1 >> 12;
        class318.method1918(var8, var9, (byte) 14, var5, var7, var6, var4, var11, super.field5950, var10);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZII)V")
    public final void method1598(boolean arg0, int arg1, int arg2) {
        ++field3963;
        if (!arg0) {
            method1782((byte) -48);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IB)I")
    public static final int method1780(int arg0, byte arg1) {
        int var2 = 123 % ((-52 - arg1) / 50);
        ++field3979;
        return arg0 == 16711935 ? -1 : class477.method2805(arg0, (byte) -68);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIILkm;IIIII)V")
    public static final void method1781(int arg0, int arg1, int arg2, class487 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field3966;
        class278 var9 = (class278) class37.method309(arg2, arg1, arg4);
        if (var9 != null) {
            class475 var10 = class304.field4160.method2075(var9.method211(true), false);
            int var11 = 3 & var9.method215(-11524);
            int var12 = var9.method219(-17942);
            if (~var10.field6702 == 0) {
                int var13 = arg8;
                if (~var10.field6681 < -1) {
                    var13 = arg5;
                }
                if (~var12 == -1 || ~var12 == -3) {
                    if (var11 != 0) {
                        if (var11 == 1) {
                            arg3.method2859(4, (byte) -6, arg0, var13, arg6);
                        } else if (~var11 == -3) {
                            arg3.method2864(0, var13, arg0 + 3, 4, arg6);
                        } else if (var11 == 3) {
                            arg3.method2859(4, (byte) -6, arg0, var13, arg6 - -3);
                        }
                    } else {
                        arg3.method2864(0, var13, arg0, 4, arg6);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg3.method2860(1, 1, arg0, var13, arg6, 1);
                    } else if (~var11 != -2) {
                        if (~var11 == -3) {
                            arg3.method2860(1, 1, arg0 + 3, var13, arg6 - -3, 1);
                        } else if (~var11 == -4) {
                            arg3.method2860(1, 1, arg0, var13, arg6 + 3, 1);
                        }
                    } else {
                        arg3.method2860(1, 1, arg0 + 3, var13, arg6, 1);
                    }
                }
                if (var12 == 2) {
                    if (~var11 == -1) {
                        arg3.method2859(4, (byte) -6, arg0, var13, arg6);
                    } else if (var11 != 1) {
                        if (var11 == 2) {
                            arg3.method2859(4, (byte) -6, arg0, var13, arg6 + 3);
                        } else if (var11 == 3) {
                            arg3.method2864(0, var13, arg0, 4, arg6);
                        }
                    } else {
                        arg3.method2864(0, var13, arg0 + 3, 4, arg6);
                    }
                }
            } else {
                class184.method1205(arg3, var10, var11, arg6, arg0, 4);
            }
        }
        class278 var14 = (class278) class75.method518(arg2, arg1, arg4, field3981 != null ? field3981 : (field3981 = method1783("wk")));
        if (var14 != null) {
            class475 var15 = class304.field4160.method2075(var14.method211(true), false);
            int var16 = var14.method215(-11524) & 3;
            int var17 = var14.method219(-17942);
            if (var15.field6702 != -1) {
                class184.method1205(arg3, var15, var16, arg6, arg0, 4);
            } else if (~var17 == -10) {
                int var18 = -1118482;
                if (~var15.field6681 < -1) {
                    var18 = -1179648;
                }
                if (var16 != 0 && ~var16 != -3) {
                    arg3.method2863(arg0, var18, arg6 + 3, arg6, arg0 + 3, true);
                } else {
                    arg3.method2863(arg0, var18, arg6, arg6 + 3, arg0 + 3, true);
                }
            }
        }
        class278 var19 = (class278) class292.method1807(arg2, arg1, arg4);
        if (var19 != null) {
            class475 var20 = class304.field4160.method2075(var19.method211(true), false);
            int var21 = 3 & var19.method215(-11524);
            if (~var20.field6702 != 0) {
                class184.method1205(arg3, var20, var21, arg6, arg0, 4);
            }
        }
        if (arg7 <= 12) {
            field3971 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(B)V")
    public static void method1782(byte arg0) {
        field3972 = null;
        field3971 = null;
        field3958 = null;
        if (arg0 >= -91) {
            method1782((byte) -58);
        }
        field3960 = null;
        field3964 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1783(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
