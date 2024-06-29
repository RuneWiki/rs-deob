import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class44 extends class232 {

    @OriginalMember(owner = "client!m", name = "F", descriptor = "Lsa;")
    public class106 field755;

    @OriginalMember(owner = "client!m", name = "M", descriptor = "Lok;")
    public static class146 field762 = class235.method1724(-12908, "");

    @OriginalMember(owner = "client!m", name = "K", descriptor = "Lok;")
    public static class146 field760 = class235.method1724(-12908, "(U0a )2 via: ");

    @OriginalMember(owner = "client!m", name = "G", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!m", name = "H", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!m", name = "I", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!m", name = "J", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!m", name = "L", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lsa;)V", line = 9)
    public class44(class106 arg0) {
        this.field755 = arg0;
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(B)V", line = 19)
    public static final void method308(byte arg0) {
        class13.field244.method791(8);
        field757++;
        int var1 = -51 / ((arg0 + 38) / 56);
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(I)V", line = 35)
    public static void method309(int arg0) {
        field760 = null;
        if (arg0 != -8362) {
            field760 = (class146) null;
        }
        field762 = null;
    }

    @OriginalMember(owner = "client!m", name = "f", descriptor = "(I)V", line = 54)
    public static final void method310(int arg0) {
        class13.field250.method791(8);
        if (arg0 > 51) {
            field756++;
        }
    }
}
