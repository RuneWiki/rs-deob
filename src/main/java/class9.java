import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class9 extends class252 {

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "J")
    public static long field99 = -1L;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "Lh;")
    public static class572 field100 = new class572("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "Llu;")
    public static class610 field101 = new class610(13, -1);

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "Lada;")
    public static class144 field102 = new class144(78, -1);

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "Ltq;")
    public static class537 field103;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IZ)I", line = 5)
    public static final int method42(int arg0, boolean arg1) {
        field98++;
        if (!arg1) {
            field102 = null;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V", line = 16)
    public static void method43(int arg0) {
        field100 = null;
        field101 = null;
        if (arg0 > -125) {
            field102 = null;
        }
        field103 = null;
        field102 = null;
    }
}
