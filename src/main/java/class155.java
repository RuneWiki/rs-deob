import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class155 extends class424 {

    @OriginalMember(owner = "client!nq", name = "n", descriptor = "I")
    public int field1957;

    @OriginalMember(owner = "client!nq", name = "o", descriptor = "I")
    public int field1958;

    @OriginalMember(owner = "client!nq", name = "p", descriptor = "I")
    public int field1959;

    @OriginalMember(owner = "client!nq", name = "r", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!nq", name = "u", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!nq", name = "v", descriptor = "I")
    public int field1965;

    @OriginalMember(owner = "client!nq", name = "z", descriptor = "I")
    public int field1969;

    @OriginalMember(owner = "client!nq", name = "A", descriptor = "I")
    public int field1970;

    @OriginalMember(owner = "client!nq", name = "x", descriptor = "Ltc;")
    public class477 field1967;

    @OriginalMember(owner = "client!nq", name = "y", descriptor = "Ltc;")
    public class477 field1968;

    @OriginalMember(owner = "client!nq", name = "w", descriptor = "Loda;")
    public static class657 field1966;

    @OriginalMember(owner = "client!nq", name = "t", descriptor = "Ljava/lang/String;")
    public String field1963;

    @OriginalMember(owner = "client!nq", name = "q", descriptor = "Z")
    public boolean field1960;

    @OriginalMember(owner = "client!nq", name = "s", descriptor = "[Ljava/lang/Object;")
    public Object[] field1962;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)V")
    public static void method1115(int arg0) {
        field1966 = null;
        if (arg0 != 10231) {
            method1116(null, true, 121);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lpe;ZI)Lsga;")
    public static final class547 method1116(class615 arg0, boolean arg1, int arg2) {
        field1964++;
        if (!arg1) {
            method1115(-126);
        }
        byte[] var3 = arg0.method3365(arg2, (byte) 92);
        return var3 == null ? null : new class547(var3);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Z)V")
    public static final void method1117(boolean arg0) {
        if (arg0) {
            method1115(29);
        }
        field1961++;
        if (class17.field189 != null) {
            class17.field189.method392((byte) -39);
            class17.field200 = null;
            class17.field189 = null;
        }
    }
}
