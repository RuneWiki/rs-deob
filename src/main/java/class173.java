import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class173 {

    @OriginalMember(owner = "client!af", name = "f", descriptor = "[Lsh;")
    public static class282[] field2906 = new class282[32768];

    @OriginalMember(owner = "client!af", name = "g", descriptor = "[I")
    public static int[] field2907 = new int[] { 0, 0, 0, 0, 3, 0, 0, -2, 6, 0, 8, -2, 0, 0, 0, 4, 0, 1, 0, 0, 5, 8, 0, 0, 0, 0, 12, 6, 0, 0, -1, 5, 0, 7, 0, 0, 0, 0, -1, 0, 0, 0, -2, 0, 0, 0, 0, -2, 20, 0, 0, 9, 0, 0, 0, 14, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 7, -1, -1, -2, 0, 0, 0, 0, 6, 0, 0, 9, 0, 2, 0, -1, 6, -2, -1, -2, 0, 0, 0, 1, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, -2, -1, 0, -1, 0, 6, 0, 8, 0, 8, 0, 0, 0, 0, 0, -2, 0, 0, 0, 10, 3, 0, 2, 0, 0, 3, 0, 0, 6, 0, 0, 4, 0, 10, 0, 0, 0, 5, 0, 6, 1, 0, 15, 0, 0, 0, 0, 0, -1, 0, 6, 0, 0, 0, 0, 0, 0, 1, 0, 12, 0, 2, 0, 0, 0, 5, 0, 6, 0, 0, -2, 8, 0, 0, 5, 6, 0, 0, -2, 0, 0, 0, 0, 0, 5, -2, -1, 5, 0, 0, 4, 2, 0, 4, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 14, 0, 0, 0, 0, -1, 2, 0, 0, 0, 0, 0, 0, 0, 0, -1, 10, -1, 8, 0, 0, 10, 0, 0, 0, 24, 0, 0, -2, 15, -1, -1, 2, 7, 10, 0, 0, 0, 0, 0, 0, 2 };

    @OriginalMember(owner = "client!af", name = "i", descriptor = "Lok;")
    public static class146 field2909 = class235.method1724(-12908, "Chargement de la liste des serveurs");

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1336(int arg0) {
        class280.field4797.method791(8);
        if (arg0 != 0) {
            field2907 = (int[]) null;
        }
        field2901++;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIII)V", line = 19)
    public static final void method1337(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2904++;
        if (arg3 >= arg1) {
            class40.method281(arg0, arg1, class81.field1297[arg4], arg3, 7);
        } else {
            class40.method281(arg0, arg3, class81.field1297[arg4], arg1, 7);
        }
        if (arg2 != -27551) {
            method1339(-70);
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V", line = 38)
    public static void method1338(int arg0) {
        field2907 = null;
        if (arg0 != 14892) {
            field2909 = (class146) null;
        }
        field2906 = null;
        field2909 = null;
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(I)V", line = 50)
    public static final void method1339(int arg0) {
        field2905++;
        if (arg0 > -116) {
            field2906 = (class282[]) null;
        }
        class175 var1 = new class175();
        for (int var2 = 0; var2 < 13; var2++) {
            for (int var3 = 0; var3 < 13; var3++) {
                class95.field1529[var2][var3] = var1;
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)Lri;", line = 79)
    public static final class64 method1340(byte arg0) {
        field2908++;
        if (arg0 != -13) {
            return (class64) null;
        }
        try {
            return (class64) Class.forName("l").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class212();
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIII)V", line = 118)
    public static final void method1341(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg2 - arg4) >= class151.field2564 && class126.field2058 >= arg2 + arg4 && class123.field2008 <= (arg3 - arg4) && arg3 + arg4 <= class318.field5394) {
            class225.method1664(arg3, arg4, arg5, 0, arg1, arg2, arg6);
        } else {
            class210.method1581(arg2, arg0 - 1, arg3, arg5, arg6, arg4, arg1);
        }
        field2902++;
        if (arg0 != 0) {
            method1340((byte) 35);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B[I)[I", line = 140)
    public static final int[] method1342(byte arg0, int[] arg1) {
        field2903++;
        if (arg1 == null) {
            return null;
        } else {
            int[] var2 = new int[arg1.length];
            class244.method1765(arg1, 0, var2, 0, arg1.length);
            return arg0 > -26 ? (int[]) null : var2;
        }
    }
}
