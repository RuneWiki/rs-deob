import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class424 {

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "Z")
    public static boolean field6325 = false;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "[[I")
    public static int[][] field6324 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "F")
    public static float field6323;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field6326;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    public static int field6327;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIILqa;[[[BIIBIIII)V", line = 9)
    public static final void method2552(int arg0, int arg1, int arg2, int arg3, class162 arg4, byte[][][] arg5, int arg6, int arg7, byte arg8, int arg9, int arg10, int arg11, int arg12) {
        field6327++;
        if (arg6 == 0 || arg1 == 0) {
            return;
        }
        if (arg6 == 9) {
            arg6 = 1;
            arg0 = arg0 + 1 & 0x3;
        }
        if (arg6 == 10) {
            arg0 = arg0 + 3 & 0x3;
            arg6 = 1;
        }
        if (arg8 >= -47) {
            field6324 = null;
        }
        if (arg6 == 11) {
            arg0 = arg0 + 3 & 0x3;
            arg6 = 8;
        }
        arg4.method209(arg2, arg11, arg12, arg10, arg9, arg3, arg5[arg6 - 1][arg0], arg1, arg7);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V", line = 45)
    public static final void method2553(byte arg0) {
        int var1 = -119 / ((arg0 - 58) / 59);
        for (int var2 = 0; var2 < 5; var2++) {
            class153.field2429[var2] = false;
        }
        field6326++;
        class412.field6156 = -1;
        class85.field1473 = 5;
        class134.field2159 = class122.field1982;
        class234.field3411 = class222.field3184;
        class255.field3660 = 0;
        class217.field3127 = class405.field6075;
        class162.field2499 = class40.field732;
        class236.field3423 = 0;
        class190.field2834 = -1;
        class62.field1082 = class291.field4148;
        class524.field7772 = class531.field7821;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)V", line = 85)
    public static void method2554(byte arg0) {
        field6324 = null;
        if (arg0 != -57) {
            field6323 = 0.05002483F;
        }
    }
}
