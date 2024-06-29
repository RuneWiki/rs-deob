import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class387 {

    @OriginalMember(owner = "client!bp", name = "f", descriptor = "[S")
    private static short[] field5843 = new short[] { 952, 20413, -21592, 11204, -10305 };

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "[S")
    private static short[] field5838 = new short[] { 957, 20418, -21587, 11209, -10300 };

    @OriginalMember(owner = "client!bp", name = "g", descriptor = "[S")
    private static short[] field5844 = new short[] { 962, 20423, -21582, 11214, -10295 };

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "[S")
    private static short[] field5842 = new short[] { 967, 20428, -21577, 11219, -10290 };

    @OriginalMember(owner = "client!bp", name = "h", descriptor = "[[S")
    public static short[][] field5845 = new short[][] { field5842, field5844, field5838, field5843 };

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "F")
    public static float field5840;

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "I")
    public static int field5839;

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "I")
    public static int field5841;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V", line = 4)
    public static void method2492(byte arg0) {
        field5842 = null;
        field5843 = null;
        field5845 = null;
        field5838 = null;
        field5844 = null;
        if (arg0 != 51) {
            method2494(85, null);
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIIIIIIII)Z", line = 34)
    public static final boolean method2493(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -1 / ((58 - arg5) / 48);
        field5839++;
        if ((arg0 + arg2) > arg4 && (arg4 + arg7) > arg0) {
            return (arg6 + arg3) > arg8 && arg6 < arg1 + arg8;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ILc;)V", line = 51)
    public static final void method2494(int arg0, class187 arg1) {
        arg1.field2848 = null;
        field5841++;
        int var2 = arg1.field2851.length;
        if (arg0 != 2780) {
            return;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            arg1.field2851[var3].field1430 = false;
        }
        class243[] var4 = class373.field5546;
        synchronized (class373.field5546) {
            if (var2 < class373.field5546.length && class430.field6436[var2] < 200) {
                class373.field5546[var2].method1616(22437, arg1);
                int var10002 = class430.field6436[var2]++;
            }
        }
    }
}
