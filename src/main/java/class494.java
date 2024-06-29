import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class494 {

    @OriginalMember(owner = "client!mw", name = "d", descriptor = "[[I")
    public static int[][] field6670 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!mw", name = "g", descriptor = "D")
    public static double field6673;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "I")
    public static int field6667;

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "I")
    public static int field6668;

    @OriginalMember(owner = "client!mw", name = "c", descriptor = "I")
    public int field6669;

    @OriginalMember(owner = "client!mw", name = "e", descriptor = "I")
    public int field6671;

    @OriginalMember(owner = "client!mw", name = "f", descriptor = "I")
    public int field6672;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;I)V", line = 4)
    public static final void method2789(int arg0, String arg1, String arg2, byte arg3, String arg4, String arg5, int arg6) {
        if (arg3 != -15) {
            method2789(-118, null, null, (byte) -25, null, null, -83);
        }
        class31.method272(null, arg1, arg2, arg0, 79, arg6, arg5, arg4, -1);
        field6667++;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)V", line = 17)
    public static void method2790(int arg0) {
        if (arg0 != 15839) {
            method2791(-98, -117, 94, 21, -88, -114, 114, 46, (byte) -36);
        }
        field6670 = null;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIIIIIIIB)V", line = 27)
    public static final void method2791(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        field6668++;
        class180.method1245(arg5, arg1, arg7, arg0, arg3, arg6, arg4, arg2, 0, 0);
        int var9 = 59 % ((66 - arg8) / 55);
    }
}
