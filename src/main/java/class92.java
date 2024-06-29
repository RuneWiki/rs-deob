import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public abstract class class92 {

    @OriginalMember(owner = "client!kba", name = "d", descriptor = "[I")
    public static int[] field1045 = new int[1];

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "[[I")
    public static int[][] field1042 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!kba", name = "g", descriptor = "Lkfa;")
    public static class549 field1048 = new class549(52, 4);

    @OriginalMember(owner = "client!kba", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field1049 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!kba", name = "c", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!kba", name = "e", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!kba", name = "f", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(IFIFZLwba;III[BFFF)V")
    public static final void method583(int arg0, float arg1, int arg2, float arg3, boolean arg4, class46 arg5, int arg6, int arg7, int arg8, byte[] arg9, float arg10, float arg11, float arg12) {
        for (int var13 = 0; var13 < arg8; var13++) {
            class241.method1397(arg11, arg3, var13, 16383, arg6, arg2, arg12, arg7, arg0, arg8, arg1, arg9, arg10, arg5);
            arg2 += arg0 * arg6;
        }
        if (!arg4) {
            field1042 = null;
        }
        field1047++;
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(III)Z")
    public static final boolean method584(int arg0, int arg1, int arg2) {
        field1043++;
        if (((arg0 & 0x10000) != 0 | class529.method3020(false, arg1, arg0)) || class151.method828(arg1, arg0, (byte) -128)) {
            return true;
        } else {
            if (arg2 != 55) {
                method583(4, 1.0958315F, 33, 0.5332903F, false, null, -20, 51, -33, null, 0.6475619F, 0.82301503F, 0.9351288F);
            }
            return (arg1 & 0x37) == 0 && class407.method2209(arg1, 45056, arg0);
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(ILlw;)Llw;")
    public abstract class603 method585(int arg0, class603 arg1);

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(I)V")
    public static void method586(int arg0) {
        field1042 = null;
        field1048 = null;
        field1045 = null;
        field1049 = null;
        int var1 = 82 % ((arg0 + 14) / 53);
    }
}
