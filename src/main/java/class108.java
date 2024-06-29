import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class108 extends class539 {

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
    public int field1479;

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "Luc;")
    public static class27 field1478 = new class27(57, -1);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V", line = 4)
    public static void method814(int arg0) {
        int var1 = -125 % ((arg0 - 26) / 48);
        field1478 = null;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(III)Lal;", line = 15)
    public static final class86 method815(int arg0, int arg1, int arg2) {
        class486 var3 = class658.field9266[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6741;
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V", line = 26)
    public class108() {
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(I)V", line = 28)
    public class108(int arg0) {
        this.field1479 = arg0;
    }
}
