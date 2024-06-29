import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class169 {

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "Z")
    public boolean field2947 = true;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    public int field2955;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public int field2949;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public int field2944;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public int field2946;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public int field2945;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public int field2948;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "S")
    public static short field2952 = 32767;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "Lp;")
    public static class280 field2956 = null;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "[I")
    public static int[] field2958 = new int[100];

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "Lp;")
    private static class280 field2953 = class18.method140((byte) -122, "You can(Wt add yourself to your own ignore list)3");

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "Lp;")
    public static class280 field2954 = field2953;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "Lp;")
    public static class280 field2961 = class18.method140((byte) -119, "(Y<)4col>");

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "Lp;")
    public static class280 field2962 = class18.method140((byte) -119, "S-Blectionner");

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "Lp;")
    public static class280 field2959 = class18.method140((byte) -119, "Sprites charg-Bs");

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)Z")
    public static final boolean method1173(int arg0, int arg1) {
        field2964++;
        if (arg1 != -1945502020) {
            method1176((byte) -75);
        }
        return ((arg0 & 0x17BBFBCD) >> 28) != 0;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public static void method1174(int arg0) {
        if (arg0 < 60) {
            field2953 = null;
        }
        field2954 = null;
        field2956 = null;
        field2958 = null;
        field2962 = null;
        field2953 = null;
        field2959 = null;
        field2961 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lp;Z)I")
    public static final int method1175(class280 arg0, boolean arg1) {
        if (arg1) {
            field2953 = null;
        }
        field2963++;
        return arg0.method1889(-1) + 1;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
    public static final void method1176(byte arg0) {
        if (class60.field969 == 2) {
            if (class30.field573 == class225.field3887 && class58.field936 == class23.field416) {
                class60.field969 = 0;
                if (class73.field1206 && class88.field1431[81] && class157.field2745 > 2) {
                    class3.method52(2, class157.field2745 - 2);
                } else {
                    class3.method52(2, class157.field2745 - 1);
                }
            }
        } else if (class98.field1572 == class30.field573 && class23.field416 == class187.field3268) {
            class60.field969 = 0;
            if (class73.field1206 && class88.field1431[81] && class157.field2745 > 2) {
                class3.method52(2, class157.field2745 - 2);
            } else {
                class3.method52(2, class157.field2745 - 1);
            }
        } else {
            class58.field936 = class187.field3268;
            class60.field969 = 2;
            class225.field3887 = class98.field1572;
        }
        if (arg0 <= 32) {
            field2958 = null;
        }
        field2957++;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZII)I")
    public static final int method1177(boolean arg0, int arg1, int arg2) {
        field2950++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var3 = (arg2 & 0x7F) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            if (!arg0) {
                field2954 = null;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZIIIZIZ)Lde;")
    public static final class108 method1178(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, boolean arg7) {
        field2951++;
        class220 var8 = class23.method177((byte) -108, arg2);
        if (arg3 > 1 && var8.field3773 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg3 >= var8.field3823[var10] && var8.field3823[var10] != 0) {
                    var9 = var8.field3773[var10];
                }
            }
            if (var9 != -1) {
                var8 = class23.method177((byte) -91, var9);
            }
        }
        class239 var11 = var8.method1470((byte) -103);
        if (var11 == null) {
            return null;
        }
        class223 var12 = null;
        if (var8.field3801 != -1) {
            var12 = (class223) method1178(1, true, var8.field3768, 10, -5154, true, 0, false);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field3802 != -1) {
            var12 = (class223) method1178(arg0, false, var8.field3819, arg3, -5154, true, arg6, false);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = class151.field2616;
        int var14 = class151.field2615;
        int var15 = class151.field2617;
        int[] var16 = new int[4];
        class151.method1062(var16);
        class223 var17 = new class223(36, 32);
        class151.method1052(var17.field3858, 36, 32);
        class146.method1022();
        class146.method1017(16, 16);
        class146.field2543 = false;
        int var18 = var8.field3807;
        if (arg1) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg0 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class146.field2541[var8.field3816] * var18 >> 16;
        int var20 = class146.field2545[var8.field3816] * var18 >> 16;
        var11.method1610(0, var8.field3762, var8.field3785, var8.field3816, var8.field3810, (var20 + var8.field3777) - (var11.method426() / 2), var8.field3777 + var19, -1L);
        if (arg0 >= 1) {
            var17.method1505(1);
            if (arg0 >= 2) {
                var17.method1505(16777215);
            }
            class151.method1052(var17.field3858, 36, 32);
        }
        if (arg6 != 0) {
            var17.method1494(arg6);
        }
        if (var8.field3801 != -1) {
            var12.method758(0, 0);
        } else if (var8.field3802 != -1) {
            class151.method1052(var12.field3858, 36, 32);
            var17.method758(0, 0);
            var17 = var12;
        }
        if (arg4 != -5154) {
            field2958 = null;
        }
        if (arg7 && (var8.field3805 == 1 || arg3 != 1) && arg3 != -1) {
            class125.field2178.method515(class244.method1661((byte) 64, arg3), 0, 9, 16776960, 1);
        }
        class151.method1052(var13, var14, var15);
        class151.method1048(var16);
        class146.method1022();
        class146.field2543 = true;
        return var17;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)Z")
    public static final boolean method1179(byte arg0) {
        field2960++;
        if (arg0 >= -14) {
            field2962 = null;
        }
        if (class255.field4481) {
            try {
                class205.field3557.method1875(class118.field2117.field3473, true);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class169(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field2955 = arg1;
        this.field2949 = arg4;
        this.field2944 = arg5;
        this.field2946 = arg0;
        this.field2947 = arg6;
        this.field2945 = arg3;
        this.field2948 = arg2;
    }
}
