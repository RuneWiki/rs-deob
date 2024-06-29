import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class172 extends class237 {

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "I")
    private final int field3112;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "I")
    private final int field3100;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
    private final int field3098;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
    private final int field3099;

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "Lge;")
    public static class71 field3103 = new class71(64);

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "Lkh;")
    public static class117 field3107 = class224.method1450((byte) 124, "sl_button");

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "Lkh;")
    public static class117 field3105 = class224.method1450((byte) 26, "p11_full");

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "I")
    public static int field3106 = 0;

    @OriginalMember(owner = "client!ph", name = "B", descriptor = "Lkh;")
    private static class117 field3109 = class224.method1450((byte) 113, "Loaded input handler");

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "Lkh;")
    public static class117 field3110 = class224.method1450((byte) -32, "::fpsoff");

    @OriginalMember(owner = "client!ph", name = "F", descriptor = "[I")
    public static int[] field3113 = new int[32];

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "Lkh;")
    public static class117 field3111 = field3109;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!ph", name = "A", descriptor = "Lvb;")
    public static class232 field3108;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BII)V")
    public final void method596(byte arg0, int arg1, int arg2) {
        ++field3104;
        int var4 = this.field3098 * arg1 >> 12;
        int var5 = this.field3099 * arg1 >> 12;
        int var6 = this.field3100 * arg2 >> 12;
        int var7 = 83 / ((39 - arg0) / 59);
        int var8 = this.field3112 * arg2 >> 12;
        class244.method1570(0, var6, var5, super.field4281, var4, var8);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIIIILdd;IZJ)Z")
    public static final boolean method1203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class38 arg8, int arg9, boolean arg10, long arg11) {
        for (int var13 = arg1; var13 < arg1 + arg3; ++var13) {
            for (int var20 = arg2; var20 < arg2 + arg4; ++var20) {
                if (var13 < 0 || var20 < 0 || var13 >= class92.field1698 || var20 >= class170.field3053) {
                    return false;
                }
                class170 var21 = class109.field2063[arg0][var13][var20];
                if (var21 != null && var21.field3065 >= 5) {
                    return false;
                }
            }
        }
        class57 var14 = new class57();
        var14.field1171 = arg11;
        var14.field1183 = arg0;
        var14.field1191 = arg5;
        var14.field1184 = arg6;
        var14.field1177 = arg7;
        var14.field1182 = arg8;
        var14.field1176 = arg9;
        var14.field1186 = arg1;
        var14.field1170 = arg2;
        var14.field1178 = arg1 + arg3 - 1;
        var14.field1179 = arg2 + arg4 - 1;
        for (int var15 = arg1; var15 < arg1 + arg3; ++var15) {
            for (int var16 = arg2; var16 < arg2 + arg4; ++var16) {
                int var17 = 0;
                if (var15 > arg1) {
                    ++var17;
                }
                if (var15 < arg1 + arg3 - 1) {
                    var17 += 4;
                }
                if (var16 > arg2) {
                    var17 += 8;
                }
                if (var16 < arg2 + arg4 - 1) {
                    var17 += 2;
                }
                for (int var18 = arg0; var18 >= 0; --var18) {
                    if (class109.field2063[var18][var15][var16] == null) {
                        class109.field2063[var18][var15][var16] = new class170(var18, var15, var16);
                    }
                }
                class170 var19 = class109.field2063[arg0][var15][var16];
                var19.field3063[var19.field3065] = var14;
                var19.field3079[var19.field3065] = var17;
                var19.field3059 |= var17;
                ++var19.field3065;
            }
        }
        if (arg10) {
            class159.field2912[class5.field76++] = var14;
        }
        return true;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BI)Loe;")
    public static final class158 method1204(byte arg0, int arg1) {
        ++field3094;
        class158 var2 = (class158) class30.field697.method506(1, (long) arg1);
        if (arg0 > -56) {
            field3103 = null;
        }
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3;
            if (~arg1 > -32769) {
                var3 = class51.field1049.method104(-121, 1, arg1);
            } else {
                var3 = class31.field740.method104(-24, 1, arg1 & 32767);
            }
            class158 var4 = new class158();
            if (var3 != null) {
                var4.method1128((byte) -29, new class145(var3));
            }
            if (arg1 >= 32768) {
                var4.method1118(32768);
            }
            class30.field697.method497((long) arg1, var4, -98);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(IIIIIII)V")
    public class172(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3112 = arg3;
        this.field3100 = arg1;
        this.field3098 = arg0;
        this.field3099 = arg2;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIII)V")
    public static final void method1205(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3097;
        class248 var5 = (class248) class136.field2457.method460((long) arg3, 1);
        if (var5 == null) {
            var5 = new class248();
            class136.field2457.method461((long) arg3, (byte) -13, var5);
        }
        if (~arg2 <= ~var5.field4552.length) {
            int[] var6 = new int[arg2 + 1];
            int[] var7 = new int[arg2 + 1];
            for (int var8 = 0; var8 < var5.field4552.length; ++var8) {
                var6[var8] = var5.field4552[var8];
                var7[var8] = var5.field4553[var8];
            }
            for (int var9 = var5.field4552.length; ~var9 > ~arg2; ++var9) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field4552 = var6;
            var5.field4553 = var7;
        }
        var5.field4552[arg2] = arg1;
        if (arg0 >= 86) {
            var5.field4553[arg2] = arg4;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
    public static void method1206(byte arg0) {
        field3105 = null;
        field3108 = null;
        field3110 = null;
        field3113 = null;
        field3111 = null;
        field3103 = null;
        if (arg0 <= 37) {
            field3106 = 36;
        }
        field3109 = null;
        field3107 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)V")
    public final void method598(int arg0, int arg1, int arg2) {
        ++field3102;
        int var4 = this.field3099 * arg1 >> 12;
        int var5 = this.field3098 * arg1 >> 12;
        if (arg2 == -18503) {
            int var6 = this.field3100 * arg0 >> 12;
            int var7 = this.field3112 * arg0 >> 12;
            class179.method1239(false, var7, var4, var5, super.field4291, var6, super.field4290);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BIIIII)V")
    public static final void method1207(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < -105) {
            int var6 = -arg1 + arg4;
            ++field3101;
            int var7 = -arg2 + arg3;
            if (~var6 == -1) {
                if (var7 != 0) {
                    class219.method1431(arg5, arg1, true, arg2, arg3);
                }
            } else if (var7 == 0) {
                client.method290(arg2, false, arg5, arg1, arg4);
            } else {
                int var8 = (var7 << 12) / var6;
                int var9 = -(arg1 * var8 >> 12) + arg2;
                int var10;
                int var11;
                if (arg1 >= class240.field4355) {
                    if (class146.field2678 >= arg1) {
                        var10 = arg1;
                        var11 = arg2;
                    } else {
                        var11 = (class146.field2678 * var8 >> 12) + var9;
                        var10 = class146.field2678;
                    }
                } else {
                    var11 = (class240.field4355 * var8 >> 12) + var9;
                    var10 = class240.field4355;
                }
                if (~class159.field2910 >= ~var11) {
                    if (class224.field4040 < var11) {
                        var10 = (-var9 + class224.field4040 << 12) / var8;
                        var11 = class224.field4040;
                    }
                } else {
                    var10 = (-var9 + class159.field2910 << 12) / var8;
                    var11 = class159.field2910;
                }
                int var12;
                int var13;
                if (class240.field4355 <= arg4) {
                    if (~class146.field2678 > ~arg4) {
                        var12 = class146.field2678;
                        var13 = (class146.field2678 * var8 >> 12) + var9;
                    } else {
                        var13 = arg3;
                        var12 = arg4;
                    }
                } else {
                    var13 = (class240.field4355 * var8 >> 12) + var9;
                    var12 = class240.field4355;
                }
                if (~class159.field2910 < ~var13) {
                    var13 = class159.field2910;
                    var12 = (-var9 + class159.field2910 << 12) / var8;
                } else if (var13 > class224.field4040) {
                    var13 = class224.field4040;
                    var12 = (class224.field4040 - var9 << 12) / var8;
                }
                class167.method1188(var11, var12, var13, var10, (byte) -94, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(BII)V")
    public final void method595(byte arg0, int arg1, int arg2) {
        ++field3095;
        int var4 = this.field3098 * arg1 >> 12;
        int var5 = this.field3099 * arg1 >> 12;
        int var6 = this.field3112 * arg2 >> 12;
        int var7 = this.field3100 * arg2 >> 12;
        if (arg0 < -13) {
            class173.method1210(super.field4281, 23, var6, super.field4290, var5, var7, var4, super.field4291);
        }
    }
}
