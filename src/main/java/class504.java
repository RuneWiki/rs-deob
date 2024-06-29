import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public class class504 extends class719 {

    @OriginalMember(owner = "client!iea", name = "t", descriptor = "Lmw;")
    public static class517 field7086 = new class517(42, 6);

    @OriginalMember(owner = "client!iea", name = "w", descriptor = "Ljb;")
    public static class519 field7089 = new class519(120, -1);

    @OriginalMember(owner = "client!iea", name = "o", descriptor = "I")
    public static int field7081;

    @OriginalMember(owner = "client!iea", name = "p", descriptor = "I")
    public static int field7082;

    @OriginalMember(owner = "client!iea", name = "q", descriptor = "I")
    public static int field7083;

    @OriginalMember(owner = "client!iea", name = "r", descriptor = "I")
    public static int field7084;

    @OriginalMember(owner = "client!iea", name = "s", descriptor = "I")
    public static int field7085;

    @OriginalMember(owner = "client!iea", name = "u", descriptor = "I")
    public static int field7087;

    @OriginalMember(owner = "client!iea", name = "v", descriptor = "I")
    public static int field7088;

    @OriginalMember(owner = "client!iea", name = "x", descriptor = "I")
    public static int field7090;

    @OriginalMember(owner = "client!iea", name = "g", descriptor = "(I)V", line = 4)
    public final void method220(int arg0) {
        if (arg0 != 23363) {
            field7086 = null;
        }
        ++field7082;
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(ZZ)V", line = 16)
    public final void method225(boolean arg0, boolean arg1) {
        ++field7083;
        if (!arg0) {
            this.method219(104, 116, 105);
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(III)V", line = 26)
    public final void method219(int arg0, int arg1, int arg2) {
        ++field7081;
        if (arg1 != 0) {
            field7090 = -63;
        }
    }

    @OriginalMember(owner = "client!iea", name = "h", descriptor = "(I)V", line = 36)
    public static void method2943(int arg0) {
        field7089 = null;
        if (arg0 == 6) {
            field7086 = null;
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(IZ)V", line = 48)
    public final void method222(int arg0, boolean arg1) {
        ++field7085;
        if (arg0 > -126) {
            method2943(-89);
        }
    }

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "(B)Z", line = 60)
    public final boolean method218(byte arg0) {
        ++field7088;
        if (arg0 <= 16) {
            this.method218((byte) -35);
        }
        return false;
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(ZLb;I)V", line = 71)
    public final void method221(boolean arg0, class352 arg1, int arg2) {
        super.field9776.method3882(0, arg1);
        if (arg0) {
            ++field7087;
            super.field9776.method3871(0, arg2);
        }
    }

    @OriginalMember(owner = "client!iea", name = "<init>", descriptor = "(Lee;)V", line = 85)
    public class504(class703 arg0) {
        super(arg0);
    }
}
