import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class14 {

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "Ljava/lang/String;")
    public static String field146 = "glow1:";

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public static int field148 = 0;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "Z")
    public static boolean field150 = false;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "Lrk;")
    public static class252 field145;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "Lwf;")
    public static class306 field149;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "[[Lne;")
    public static class117[][] field144;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V", line = 4)
    public static void method114(int arg0) {
        field144 = (class117[][]) null;
        if (arg0 == 0) {
            field146 = null;
            field145 = null;
            field149 = null;
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)Luc;", line = 18)
    public static final class130 method115(int arg0) {
        field143++;
        if (arg0 > -11) {
            field144 = (class117[][]) ((class117[][]) null);
        }
        return class266.field4108.length > class192.field2906 ? class266.field4108[class192.field2906++] : null;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Ljava/lang/Object;ZI)[B", line = 54)
    public static final byte[] method116(Object arg0, boolean arg1, int arg2) {
        field147++;
        if (arg0 == null) {
            return null;
        } else if ((arg0 instanceof byte[])) {
            byte[] var4 = (byte[]) ((byte[]) arg0);
            return arg1 ? class297.method1948(0, var4) : var4;
        } else if (arg2 != -14046) {
            return (byte[]) null;
        } else if (arg0 instanceof class318) {
            class318 var3 = (class318) arg0;
            return var3.method1308(75);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
