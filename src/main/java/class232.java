import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class232 {

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
    public static int field3801 = 0;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3800 = "K";

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
    public static int field3805 = 0;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "Len;")
    public static class49 field3798 = new class49();

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "I")
    public static int field3809 = 0;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "Lek;")
    public static class206 field3806;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "Lek;")
    public static class206 field3808;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "Lne;")
    public static class262 field3796;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "[I")
    public static int[] field3804;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "[Z")
    public static boolean[] field3797;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "[[I")
    public static int[][] field3799;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V", line = 10)
    public static void method1617(int arg0) {
        field3806 = null;
        field3804 = null;
        field3808 = null;
        field3796 = null;
        field3797 = null;
        field3800 = null;
        field3798 = null;
        if (arg0 == 0) {
            field3799 = (int[][]) null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ldj;ILek;Lek;Z)V", line = 28)
    public static final void method1618(class361 arg0, int arg1, class206 arg2, class206 arg3, boolean arg4) {
        field3807++;
        class117.field2088 = arg2;
        field3806 = arg3;
        class201.field3365 = arg4;
        int var5 = field3806.method1423((byte) -98) - 1;
        class108.field1989 = field3806.method1417(true, var5) + arg1 * var5;
        class234.field3836 = new String[] { null, null, null, null, class331.field5287 };
        class51.field1043 = new String[] { null, null, class16.field463, null, null };
        class51.field1041 = arg0;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BILek;)Lbn;", line = 54)
    public static final class75 method1619(byte arg0, int arg1, class206 arg2) {
        field3803++;
        if (arg0 >= -32) {
            return (class75) null;
        } else if (class207.method1434(arg2, (byte) 42, arg1)) {
            return class68.method531(29121);
        } else {
            return null;
        }
    }
}
