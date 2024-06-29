import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class302 {

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "Z")
    public static boolean field4753 = true;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "Loe;")
    public static class128 field4752 = new class128();

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public static int field4757 = 1;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public int field4749;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public int field4751;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public int field4754;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
    public int field4755;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "[I")
    public static int[] field4756;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIIIII)Z", line = 6)
    public static final boolean method2101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IB)V", line = 33)
    public static final void method2102(int arg0, byte arg1) {
        field4750++;
        class68.field1092.method1828(arg0, (byte) 102);
        if (arg1 == -17) {
            class205.field3248.method1828(arg0, (byte) -92);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V", line = 49)
    public static void method2103(int arg0) {
        field4752 = null;
        if (arg0 == 14833) {
            field4756 = null;
        }
    }
}
