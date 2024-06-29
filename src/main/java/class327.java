import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class327 {

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field4133 = 1;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "La;")
    public static class438 field4134;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "[I")
    public static int[] field4132;

    static {
        new class335("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V", line = 3)
    public static void method1907(byte arg0) {
        if (arg0 != 64) {
            method1908(79, null, -126, 23, -88, 124);
        }
        field4134 = null;
        field4132 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILlj;IIII)V", line = 18)
    public static final void method1908(int arg0, class433 arg1, int arg2, int arg3, int arg4, int arg5) {
        field4131++;
        if (arg1.field6140 == -1 && arg1.field6142 == null) {
            return;
        }
        int var6 = 0;
        int var7 = class407.field5817.field3630 * arg1.field6137 >> 8;
        if (arg0 > arg1.field6157) {
            var6 += arg0 - arg1.field6157;
        } else if (arg1.field6141 > arg0) {
            var6 += arg1.field6141 - arg0;
        }
        if (arg1.field6155 < arg4) {
            var6 += arg4 - arg1.field6155;
        } else if (arg4 < arg1.field6144) {
            var6 += arg1.field6144 - arg4;
        }
        if (arg1.field6143 == 0 || var6 - 64 > arg1.field6143 || class407.field5817.field3630 == 0 || arg1.field6145 != arg2) {
            if (arg1.field6148 != null) {
                class113.field1506.method2532(arg1.field6148);
                arg1.field6148 = null;
            }
            if (arg1.field6150 != null) {
                class113.field1506.method2532(arg1.field6150);
                arg1.field6150 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg1.field6143 - var6) * var7 / arg1.field6143;
        if (arg3 >= -14) {
            field4135 = 36;
        }
        if (arg1.field6148 != null) {
            arg1.field6148.method2253(var8);
        } else if (arg1.field6140 >= 0) {
            class207 var9 = class207.method1286(class492.field7163, arg1.field6140, 0);
            if (var9 != null) {
                class305 var10 = var9.method1287().method1793(class294.field3759);
                class393 var11 = class393.method2248(var10, 100, var8);
                var11.method2246(-1);
                class113.field1506.method2530(var11);
                arg1.field6148 = var11;
            }
        }
        if (arg1.field6150 != null) {
            arg1.field6150.method2253(var8);
            if (arg1.field6150.method2166(0)) {
                return;
            }
            arg1.field6150 = null;
        } else if (arg1.field6142 != null && (arg1.field6130 -= arg5) <= 0) {
            int var12 = (int) (Math.random() * (double) arg1.field6142.length);
            class207 var13 = class207.method1286(class492.field7163, arg1.field6142[var12], 0);
            if (var13 != null) {
                class305 var14 = var13.method1287().method1793(class294.field3759);
                class393 var15 = class393.method2248(var14, 100, var8);
                var15.method2246(0);
                class113.field1506.method2530(var15);
                arg1.field6150 = var15;
                arg1.field6130 = (int) (Math.random() * (double) (arg1.field6149 - arg1.field6146)) + arg1.field6146;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(III[BIB)V", line = 147)
    public static final void method1909(int arg0, int arg1, int arg2, byte[] arg3, int arg4, byte arg5) {
        field4130++;
        if (arg0 >= arg2) {
            return;
        }
        int var6 = arg0 + arg1;
        int var7 = arg2 - arg0 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg2 - arg0 & 0x3;
                if (arg5 != -53) {
                    return;
                }
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg3[var6++] = 1;
                }
            }
            arg3[var6++] = 1;
            arg3[var6++] = 1;
            arg3[var6++] = 1;
            arg3[var6++] = 1;
        }
    }
}
