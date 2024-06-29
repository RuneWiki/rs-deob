import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class368 {

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "Z")
    public static boolean field5419 = true;

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "Lnv;")
    public static class44 field5420 = new class44();

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "B")
    public static byte field5422;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
    public static int field5418;

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "Lum;")
    public static class83 field5421;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILfh;)Lni;")
    public static final class527 method2338(int arg0, class194 arg1) {
        field5418++;
        if (arg0 != -14484) {
            field5420 = null;
        }
        return new class527(arg1.method1384(true), arg1.method1384(true), arg1.method1384(true), arg1.method1384(true), arg1.method1339(-32768), arg1.method1337((byte) 18));
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V")
    public static void method2339(int arg0) {
        if (arg0 != 8195) {
            method2338(97, null);
        }
        field5421 = null;
        field5420 = null;
    }
}
