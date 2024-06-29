import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class8 {

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "Z")
    public static boolean field147 = false;

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "[Ltc;")
    public static class248[] field148 = new class248[14];

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "[I")
    public static int[] field150 = new int[5];

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "[[I")
    public static int[][] field152;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Z)V", line = 6)
    public static final void method49(boolean arg0) {
        field149++;
        class236.field3545.method458((byte) -123);
        class248.field3688.method458((byte) -88);
        if (arg0) {
            method49(true);
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIIIIILh;IJ)Z", line = 20)
    public static final boolean method50(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class111 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class165.method1180(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)V", line = 33)
    public static void method51(byte arg0) {
        field152 = (int[][]) null;
        field148 = null;
        field150 = null;
        if (arg0 > -116) {
            field150 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(BI)V", line = 50)
    public static final void method52(byte arg0, int arg1) {
        if (arg0 != 59) {
            method52((byte) 28, 60);
        }
        field153++;
        class95 var2 = class227.method1699(11, -1855723168, arg1);
        var2.method743(0);
    }
}
