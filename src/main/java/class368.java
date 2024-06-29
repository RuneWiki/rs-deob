import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class368 {

    @OriginalMember(owner = "client!r", name = "c", descriptor = "J")
    public static long field5015 = -1L;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field5016 = 0;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "[I")
    public static int[] field5017 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field5019 = 0;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "Ltm;")
    public static class349 field5013 = new class349(512);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "[[B")
    public static byte[][] field5018;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILbr;)Lbr;")
    public abstract class129 method354(int arg0, class129 arg1);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
    public static void method2322(boolean arg0) {
        field5017 = null;
        field5018 = null;
        field5013 = null;
        if (arg0) {
            method2323(-77);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public static final void method2323(int arg0) {
        class138.field1573.method2298(0);
        field5014++;
        class325.field4342.method2298(arg0);
    }
}
