import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class370 {

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "I")
    public static int field5132;

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "Ljava/lang/String;")
    public static String field5131;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)I")
    public static final int method2305(byte arg0) {
        field5132++;
        class652 var1 = class670.field9316;
        synchronized (class670.field9316) {
            return arg0 == -105 ? class670.field9316.method3733((byte) -117) : 67;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IILwia;IBZ)V")
    public static final void method2306(int arg0, int arg1, class791 arg2, int arg3, byte arg4, boolean arg5) {
        class235.method1578(-122, arg1, arg2, arg5, 0L, arg0, arg3);
        field5130++;
        if (arg4 != -84) {
            method2306(-37, -72, null, -103, (byte) 19, false);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V")
    public static void method2307(int arg0) {
        if (arg0 != -3549) {
            field5131 = null;
        }
        field5131 = null;
    }
}
