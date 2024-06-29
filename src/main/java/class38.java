import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class38 {

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "I")
    public int field460;

    @OriginalMember(owner = "client!jt", name = "l", descriptor = "Ljt;")
    public static class38 field469 = new class38(1);

    @OriginalMember(owner = "client!jt", name = "m", descriptor = "Ljt;")
    public static class38 field470 = new class38(2);

    @OriginalMember(owner = "client!jt", name = "n", descriptor = "Ljt;")
    public static class38 field471 = new class38(4);

    @OriginalMember(owner = "client!jt", name = "o", descriptor = "Ljt;")
    public static class38 field472 = new class38(1);

    @OriginalMember(owner = "client!jt", name = "p", descriptor = "Ljt;")
    public static class38 field473 = new class38(2);

    @OriginalMember(owner = "client!jt", name = "q", descriptor = "Ljt;")
    public static class38 field474 = new class38(4);

    @OriginalMember(owner = "client!jt", name = "r", descriptor = "Ljt;")
    public static class38 field475 = new class38(2);

    @OriginalMember(owner = "client!jt", name = "s", descriptor = "Ljt;")
    public static class38 field476 = new class38(4);

    @OriginalMember(owner = "client!jt", name = "u", descriptor = "I")
    public static int field478 = 1400;

    @OriginalMember(owner = "client!jt", name = "t", descriptor = "Lkr;")
    public static class602 field477 = new class602(30, -2);

    @OriginalMember(owner = "client!jt", name = "v", descriptor = "Z")
    public static boolean field479 = false;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!jt", name = "e", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!jt", name = "f", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!jt", name = "g", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!jt", name = "h", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!jt", name = "i", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!jt", name = "j", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!jt", name = "k", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(ILaea;)Laea;", line = 4)
    public static final class261 method203(int arg0, class261 arg1) {
        field464++;
        if (arg0 < 100) {
            return null;
        } else {
            class261 var2 = arg1 == null ? new class261() : new class261(arg1);
            var2.method1762(20668, 128, 9);
            return var2;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lcea;ILwq;IIILts;I)V", line = 18)
    public static final void method204(class96 arg0, int arg1, class679 arg2, int arg3, int arg4, int arg5, class220 arg6, int arg7) {
        field468++;
        class457 var8 = new class457();
        if (arg5 != -27170) {
            method208(null, -1, 33, 0, -81, 57, -94, 24, null, -31, 100, 44);
        }
        var8.field6344 = arg3 << 9;
        var8.field6338 = arg7 << 9;
        var8.field6342 = arg4;
        if (arg6 != null) {
            var8.field6330 = arg6;
            int var10 = arg6.field2938;
            int var11 = arg6.field2887;
            if (arg1 == 1 || arg1 == 3) {
                var11 = arg6.field2938;
                var10 = arg6.field2887;
            }
            var8.field6337 = arg6.field2923;
            var8.field6332 = arg6.field2944;
            var8.field6331 = arg7 + var11 << 9;
            var8.field6325 = arg6.field2905;
            var8.field6355 = arg6.field2886;
            var8.field6341 = arg6.field2910;
            var8.field6357 = arg6.field2929 << 9;
            var8.field6346 = arg6.field2914;
            var8.field6336 = arg6.field2898;
            var8.field6352 = arg3 + var10 << 9;
            var8.field6335 = arg6.field2941 << 9;
            var8.field6327 = arg6.field2881;
            var8.field6339 = arg6.field2879;
            if (arg6.field2966 != null) {
                var8.field6334 = true;
                var8.method2793((byte) 53);
            }
            if (var8.field6337 != null) {
                var8.field6351 = var8.field6346 + ((int) ((double) (var8.field6341 - var8.field6346) * Math.random()));
            }
            class303.field4285.method3610(9289, var8);
        } else if (arg2 != null) {
            var8.field6333 = arg2;
            class123 var9 = arg2.field9436;
            if (var9.field1700 != null) {
                var8.field6334 = true;
                var9 = var9.method773(class124.field1712, false);
            }
            if (var9 != null) {
                var8.field6331 = var9.field1656 + arg7 << 9;
                var8.field6352 = var9.field1656 + arg3 << 9;
                var8.field6327 = class260.method1759(arg2, arg5 + 27169);
                var8.field6325 = var9.field1692;
                var8.field6335 = var9.field1687 << 9;
                var8.field6357 = var9.field1679 << 9;
                var8.field6332 = var9.field1659;
                var8.field6339 = var9.field1701;
                var8.field6355 = var9.field1644;
            }
            class649.field8701.method3610(arg5 ^ 0xFFFFB197, var8);
        } else if (arg0 != null) {
            var8.field6343 = arg0;
            var8.field6352 = arg3 + arg0.method662((byte) 15) << 9;
            var8.field6331 = arg7 + arg0.method662((byte) 15) << 9;
            var8.field6327 = class720.method4035(arg0, false);
            var8.field6332 = 256;
            var8.field6335 = arg0.field1367 << 9;
            var8.field6339 = 256;
            var8.field6355 = arg0.field1330;
            var8.field6357 = 0;
            var8.field6325 = arg0.field1339;
            class516.field7206.method820((long) arg0.field7148, (byte) -42, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIZLha;)Loh;", line = 121)
    public static final class685 method205(int arg0, int arg1, boolean arg2, class548 arg3) {
        field458++;
        if (arg0 == -1) {
            return null;
        }
        if (class96.field1322 != null) {
            for (int var4 = 0; var4 < class96.field1322.length; var4++) {
                if (class96.field1322[var4] == arg0) {
                    return class601.field8141[var4];
                }
            }
        }
        class685 var5 = (class685) class432.field6030.method3898((byte) -42, (long) arg0);
        if (var5 != null) {
            if (arg2 && var5.field9523 == null) {
                class179 var6 = class363.method2306(arg0, class171.field2375, (byte) 117);
                if (var6 == null) {
                    return null;
                }
                var5.field9523 = var6;
            }
            return var5;
        }
        class52[] var7 = class52.method384(class676.field9378, arg0);
        if (var7 == null) {
            return null;
        }
        class179 var8 = class363.method2306(arg0, class171.field2375, (byte) 112);
        if (var8 == null) {
            return null;
        }
        class685 var9;
        if (arg2) {
            var9 = new class685(arg3.method1392(var8, var7, true), var8);
        } else {
            var9 = new class685(arg3.method1392(var8, var7, true));
        }
        if (arg1 != 0) {
            field478 = -58;
        }
        class432.field6030.method3899(-92, var9, (long) arg0);
        return var9;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)I", line = 190)
    public static final int method206(int arg0) {
        field463++;
        if (arg0 != 4) {
            method210(12);
        }
        return class757.field10566;
    }

    @OriginalMember(owner = "client!jt", name = "toString", descriptor = "()Ljava/lang/String;", line = 202)
    public final String toString() {
        field459++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(I)V", line = 210)
    private class38(int arg0) {
        this.field460 = arg0;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Z[B)Lfi;", line = 221)
    public static final class12 method207(boolean arg0, byte[] arg1) {
        field461++;
        class12 var2 = new class12();
        class63 var3 = new class63(arg1);
        var3.field956 = var3.field954.length - 2;
        int var4 = var3.method482(-772591672);
        int var5 = var3.field954.length - var4 - 2 - 12;
        var3.field956 = var5;
        int var6 = var3.method457(-14532);
        var2.field103 = var3.method482(-772591672);
        var2.field117 = var3.method482(-772591672);
        var2.field112 = var3.method482(-772591672);
        var2.field111 = var3.method482(-772591672);
        int var7 = var3.method505((byte) -119);
        if (var7 > 0) {
            var2.field113 = new class130[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method482(-772591672);
                class130 var10 = new class130(class606.method3450(var9, (byte) -25));
                var2.field113[var8] = var10;
                while ((var9--) > 0) {
                    int var11 = var3.method457(-14532);
                    int var12 = var3.method457(-14532);
                    var10.method820((long) var11, (byte) -42, new class27(var12));
                }
            }
        }
        var3.field956 = 0;
        var2.field110 = var3.method456(2);
        var2.field114 = new int[var6];
        if (!arg0) {
            method208(null, 81, -57, 3, 37, -67, 88, 4, null, 51, -56, 55);
        }
        var2.field107 = new int[var6];
        var2.field105 = new String[var6];
        int var13 = 0;
        while (var3.field956 < var5) {
            int var14 = var3.method482(-772591672);
            if (var14 == 3) {
                var2.field105[var13] = var3.method479((byte) -72).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field114[var13] = var3.method505((byte) -119);
            } else {
                var2.field114[var13] = var3.method457(-14532);
            }
            var2.field107[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lida;IIIIIIILha;III)V", line = 300)
    public static final void method208(class272 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class548 arg8, int arg9, int arg10, int arg11) {
        field467++;
        if (arg4 < arg6 && arg1 + arg4 > arg6 && arg5 > (arg10 - 13) && arg10 + 3 > arg5) {
            arg7 = arg11;
        }
        if (arg9 == -22872) {
            String var12 = class521.method3109(arg0, arg9 + 22872);
            class758.field10575.method2510(arg4 + 3, class719.field10005, (byte) -92, arg10, class11.field91, var12, 0, arg7);
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(ILjm;Z)V", line = 322)
    public static final void method209(int arg0, class6 arg1, boolean arg2) {
        if (arg0 != -2800) {
            field479 = true;
        }
        if (arg1.field56) {
            if (arg1.field52 < 0 || class656.method3661((byte) 97, arg1.field52, arg1.field48)) {
                if (arg2) {
                    class481.method2932(arg1.field41, arg1.field50, -65, arg1.field47, null, arg1.field53);
                } else {
                    class193.method1201(-1, arg1.field52, arg1.field50, arg1.field57, arg1.field53, arg1.field41, arg1.field47, (byte) -125, arg1.field48);
                }
                arg1.method549(6410);
            }
        } else if (arg1.field42 && arg1.field53 >= 1 && arg1.field41 >= 1 && arg1.field53 <= class277.field4036 - 2 && arg1.field41 <= (class667.field9202 - 2) && (arg1.field51 < 0 || class656.method3661((byte) 97, arg1.field51, arg1.field46))) {
            if (arg2) {
                class481.method2932(arg1.field41, arg1.field50, -34, arg1.field47, arg1.field43, arg1.field53);
            } else {
                class193.method1201(-1, arg1.field51, arg1.field50, arg1.field49, arg1.field53, arg1.field41, arg1.field47, (byte) 112, arg1.field46);
            }
            arg1.field42 = false;
            if (!arg2 && arg1.field52 == arg1.field51 && arg1.field52 == -1) {
                arg1.method549(6410);
            } else if (!arg2 && arg1.field52 == arg1.field51 && arg1.field57 == arg1.field49 && arg1.field48 == arg1.field46) {
                arg1.method549(6410);
            }
        }
        field465++;
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(I)V", line = 375)
    public static void method210(int arg0) {
        field470 = null;
        field475 = null;
        field471 = null;
        field472 = null;
        field469 = null;
        field476 = null;
        field473 = null;
        field474 = null;
        if (arg0 != 0) {
            method206(-4);
        }
        field477 = null;
    }
}
