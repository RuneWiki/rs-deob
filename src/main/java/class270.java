import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class270 extends class35 {

    @OriginalMember(owner = "client!dm", name = "y", descriptor = "Lbe;")
    public static class283 field4556 = class153.method941(125, "n");

    @OriginalMember(owner = "client!dm", name = "z", descriptor = "Lbe;")
    public static class283 field4557 = class153.method941(125, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!dm", name = "G", descriptor = "I")
    public static int field4563 = 0;

    @OriginalMember(owner = "client!dm", name = "E", descriptor = "Lbe;")
    public static class283 field4562 = class153.method941(127, ")1");

    @OriginalMember(owner = "client!dm", name = "B", descriptor = "Lj;")
    public static class269 field4559 = new class269();

    @OriginalMember(owner = "client!dm", name = "H", descriptor = "Ltf;")
    public static class242 field4564 = new class242(200);

    @OriginalMember(owner = "client!dm", name = "x", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!dm", name = "A", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!dm", name = "C", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!dm", name = "w", descriptor = "Lrh;")
    public static class128 field4554;

    @OriginalMember(owner = "client!dm", name = "D", descriptor = "Ldj;")
    public static class310 field4561;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(B)V", line = 10)
    public static void method1821(byte arg0) {
        field4562 = null;
        int var1 = -125 / ((-arg0 - 20) / 42);
        field4557 = null;
        field4561 = null;
        field4556 = null;
        field4564 = null;
        field4554 = null;
        field4559 = null;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(III)Lal;", line = 25)
    public static final class305 method1822(int arg0, int arg1, int arg2) {
        class160 var3 = class86.field1459[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class305 var4 = var3.field2616;
            var3.field2616 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZI)V", line = 61)
    public static final void method1823(boolean arg0, int arg1) {
        field4560++;
        class72 var2 = class25.method174(arg1, (byte) 126, 9);
        if (!arg0) {
            var2.method479(125);
        }
    }
}
