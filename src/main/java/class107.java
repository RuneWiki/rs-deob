import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public abstract class class107 {

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field1912 = 0;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "Lsb;")
    private static class98 field1914 = class47.method368("Fri", 0);

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "Lsb;")
    private static class98 field1919 = class47.method368("Thu", 0);

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "[Z")
    public static boolean[] field1915 = new boolean[112];

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "Lsb;")
    private static class98 field1913 = class47.method368("Sun", 0);

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "Lsb;")
    private static class98 field1921 = class47.method368("Mon", 0);

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "Lsb;")
    private static class98 field1916 = class47.method368("Wed", 0);

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "[I")
    public static int[] field1923 = new int[200];

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "Lsb;")
    private static class98 field1924 = class47.method368("Sat", 0);

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "Lsb;")
    private static class98 field1925 = class47.method368("Tue", 0);

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "[Lsb;")
    public static class98[] field1917 = new class98[] { field1913, field1921, field1925, field1916, field1919, field1914, field1924 };

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILq;IZIII)V")
    public static final void method817(int arg0, int arg1, class148 arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        if (!arg4) {
            field1913 = null;
        }
        if (class37.field621) {
            class48.field796 = 32;
        } else {
            class48.field796 = 0;
        }
        class37.field621 = false;
        if (class81.field1433 != 0) {
            if (arg7 >= arg1 && arg1 + 16 > arg7 && arg6 <= arg0 && arg0 < arg6 + 16) {
                arg2.field2615 -= 4;
                class72.method512(arg2, 2);
            } else if (arg1 <= arg7 && arg7 < (arg1 + 16) && arg5 + arg6 - 16 <= arg0 && arg0 < arg5 + arg6) {
                arg2.field2615 += 4;
                class72.method512(arg2, 2);
            } else if (arg1 - class48.field796 <= arg7 && class48.field796 + arg1 + 16 > arg7 && arg0 >= arg6 + 16 && arg0 < (arg6 + arg5 - 16)) {
                int var8 = (arg5 - 32) * arg5 / arg3;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg5 - var8 - 32;
                int var10 = arg0 - (var8 / 2) - arg6 - 16;
                arg2.field2615 = (arg3 - arg5) * var10 / var9;
                class72.method512(arg2, 2);
                class37.field621 = true;
            }
        }
        field1926++;
        if (field1912 == 0) {
            return;
        }
        int var11 = arg2.field2694;
        if (arg7 >= (arg1 - var11) && arg0 >= arg6 && arg7 < arg1 + 16 && arg5 + arg6 >= arg0) {
            arg2.field2615 += field1912 * 45;
            class72.method512(arg2, 2);
            return;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)V")
    public static final void method818(int arg0, int arg1) {
        field1911++;
        class53.field849.method1561(-78, arg1);
        if (arg0 >= -45) {
            field1914 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIII)Z")
    public static final boolean method819(int arg0, int arg1, int arg2, int arg3) {
        if (class229.method1578(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class16.method143(var4 + 1, class78.field1393[arg0][arg1][arg2] + arg3, var5 + 1) && class16.method143(var4 + 128 - 1, class78.field1393[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class16.method143(var4 + 128 - 1, class78.field1393[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class16.method143(var4 + 1, class78.field1393[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public static void method820(int arg0) {
        field1923 = null;
        field1917 = null;
        if (arg0 != 128) {
            return;
        }
        field1925 = null;
        field1919 = null;
        field1916 = null;
        field1914 = null;
        field1913 = null;
        field1921 = null;
        field1924 = null;
        field1915 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)V")
    public static final void method821(int arg0, byte arg1) {
        if (class205.field3493 == null) {
            class205.field3493 = new byte[4][104][104];
        }
        field1920++;
        if (arg0 != 104) {
            field1925 = null;
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class205.field3493[var2][var3][var4] = arg1;
                }
            }
        }
    }
}
