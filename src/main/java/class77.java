import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class77 extends class689 {

    @OriginalMember(owner = "client!jp", name = "C", descriptor = "I")
    public int field911;

    @OriginalMember(owner = "client!jp", name = "x", descriptor = "I")
    public int field906;

    @OriginalMember(owner = "client!jp", name = "y", descriptor = "I")
    public int field907;

    @OriginalMember(owner = "client!jp", name = "A", descriptor = "I")
    public int field909;

    @OriginalMember(owner = "client!jp", name = "B", descriptor = "I")
    public int field910;

    @OriginalMember(owner = "client!jp", name = "t", descriptor = "I")
    public int field902;

    @OriginalMember(owner = "client!jp", name = "D", descriptor = "[[B")
    public static byte[][] field912 = new byte[50][];

    @OriginalMember(owner = "client!jp", name = "w", descriptor = "Lht;")
    public static class606 field905 = new class606();

    @OriginalMember(owner = "client!jp", name = "E", descriptor = "[[I")
    public static int[][] field913 = new int[128][128];

    @OriginalMember(owner = "client!jp", name = "u", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!jp", name = "v", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!jp", name = "z", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!jp", name = "F", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I[BI)I")
    public static final int method420(int arg0, byte[] arg1, int arg2) {
        if (arg0 == -3282) {
            field903++;
            return class426.method2414(arg1, arg2, (byte) -79, 0);
        } else {
            return -11;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)Ltca;")
    public class141 method421(int arg0) {
        field904++;
        if (arg0 != 4) {
            this.method421(-6);
        }
        return class315.field4228;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lga;IB)Laga;")
    public static final class658 method422(class332 arg0, int arg1, byte arg2) {
        field908++;
        byte[] var3 = arg0.method1946(0, arg1);
        if (arg2 >= -108) {
            method422(null, -116, (byte) 23);
        }
        return var3 == null ? null : new class658(var3);
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Ltl;Lfn;IIIIIIIIIIIII)V")
    public class77(class566 arg0, class286 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field911 = arg13;
        this.field906 = arg14;
        this.field907 = arg9;
        this.field909 = arg11;
        this.field910 = arg10;
        this.field902 = arg12;
    }

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "(I)V")
    public static void method423(int arg0) {
        if (arg0 != 50) {
            field914 = -41;
        }
        field913 = null;
        field905 = null;
        field912 = null;
    }
}
