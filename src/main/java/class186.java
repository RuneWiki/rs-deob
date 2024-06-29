import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class186 extends RuntimeException {

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "Ljava/lang/String;")
    public String field3705;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "Ljava/lang/Throwable;")
    public Throwable field3704;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field3709 = 0;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "Lfc;")
    public static class54 field3706 = new class54(64);

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "[I")
    public static int[] field3711 = new int[25];

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "[Z")
    public static boolean[] field3712 = new boolean[100];

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "[[S")
    public static short[][] field3714 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "Z")
    public static boolean field3715 = false;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    public static int field3716 = 0;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    public static int field3713 = 0;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
    public static int field3717 = 0;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "Lu;")
    public static class184 field3710;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    public static void method1258(int arg0) {
        field3711 = null;
        if (arg0 != 18205) {
            method1261(-21, 6);
        }
        field3706 = null;
        field3710 = null;
        field3712 = null;
        field3714 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lu;B)V")
    public static final void method1259(class184 arg0, byte arg1) {
        field3708++;
        class61.field1280 = arg0;
        class177.field3576 = class61.field1280.method1225(16, true);
        if (arg1 != 126) {
            method1259(null, (byte) -5);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1260(int arg0, int arg1, int arg2, int arg3) {
        if (!class158.method1002(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class99.field2086[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class154.field3198) {
                    if (!class3.method30(var4, var6, var5)) {
                        return false;
                    }
                    if (!class3.method30(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class3.method30(var4, var7, var5)) {
                        return false;
                    }
                    if (!class3.method30(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class3.method30(var4, var8, var5)) {
                    return false;
                }
                if (!class3.method30(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class116.field2466) {
                    if (!class3.method30(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class3.method30(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class3.method30(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class3.method30(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class3.method30(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class3.method30(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class154.field3198) {
                    if (!class3.method30(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class3.method30(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class3.method30(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class3.method30(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class3.method30(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class3.method30(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class116.field2466) {
                    if (!class3.method30(var4, var6, var5)) {
                        return false;
                    }
                    if (!class3.method30(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class3.method30(var4, var7, var5)) {
                        return false;
                    }
                    if (!class3.method30(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class3.method30(var4, var8, var5)) {
                    return false;
                }
                if (!class3.method30(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class3.method30(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class3.method30(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class3.method30(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class3.method30(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class3.method30(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class186(Throwable arg0, String arg1) {
        this.field3705 = arg1;
        this.field3704 = arg0;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)Z")
    public static final boolean method1261(int arg0, int arg1) {
        field3707++;
        if (arg1 >= -108) {
            return false;
        } else {
            return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)Lah;")
    public static final class9 method1262(int arg0, int arg1, int arg2) {
        class111 var3 = class97.field2054[arg0][arg1][arg2];
        return var3 == null || var3.field2357 == null ? null : var3.field2357;
    }
}
