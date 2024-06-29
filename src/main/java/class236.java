import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class236 {

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "I")
    public static int field3333 = -1;

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "[I")
    public static int[] field3334 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "[I")
    public static int[] field3332 = new int[13];

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "F")
    public static float field3330;

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(B)V")
    public static void method1480(byte arg0) {
        field3332 = null;
        field3334 = null;
        if (arg0 >= -5) {
            field3333 = 32;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(III)Lwe;")
    public static final class87 method1481(int arg0, int arg1, int arg2) {
        class406 var3 = class455.field6293[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5608;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lkm;BII)V")
    public static final void method1482(class487 arg0, byte arg1, int arg2, int arg3) {
        class231.field3256 = new class38[arg2][arg3];
        field3331++;
        class2.field18 = arg0;
        if (arg1 != 57) {
            method1481(118, 72, 52);
        }
        if (class148.field2096 != null) {
            class166.field2446 = class286.method1765(class148.field2096[2], (byte) 125, class148.field2096[4], class148.field2096[1], class148.field2096[0], class148.field2096[3], class148.field2096[5]);
        }
        class335.field4590 = new class38();
        class183.method1199(arg1 + 1687);
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIIIIZIII)Z")
    public static final boolean method1483(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        field3335++;
        if (!arg5) {
            return false;
        } else if (arg4 < arg6 + arg8 && (arg0 + arg4) > arg6) {
            return arg7 < arg3 + arg2 && arg3 < arg1 + arg7;
        } else {
            return false;
        }
    }
}
