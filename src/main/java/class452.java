import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class452 {

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "Z")
    public static boolean field6301 = false;

    @OriginalMember(owner = "client!uaa", name = "f", descriptor = "Z")
    public static boolean field6306 = false;

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "Ljn;")
    public static class134 field6303 = new class134(7, 1);

    @OriginalMember(owner = "client!uaa", name = "g", descriptor = "I")
    public static int field6307;

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "Lr;")
    public class113 field6302;

    @OriginalMember(owner = "client!uaa", name = "d", descriptor = "Lka;")
    public class231 field6304;

    @OriginalMember(owner = "client!uaa", name = "e", descriptor = "[[B")
    public static byte[][] field6305;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(II)Z")
    public static final boolean method2727(int arg0, int arg1) {
        field6307++;
        if (arg1 == 1) {
            return arg0 != 1 && arg0 != 7;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(B)V")
    public static void method2728(byte arg0) {
        field6305 = null;
        field6303 = null;
        if (arg0 != -98) {
            method2728((byte) 82);
        }
    }
}
