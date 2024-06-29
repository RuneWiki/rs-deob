import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class328 {

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public int field4528;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "Ljava/lang/String;")
    public String field4527;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "Lfn;")
    public static class52 field4530 = new class52(25, 8);

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "[I")
    public static int[] field4532;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "Lss;")
    public static class76 field4531;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "[I")
    public static int[] field4534;

    static {
        new class112((String) null, "bevor du die Option 'Regelverstoß melden' benutzt.", (String) null, (String) null);
        field4533 = 1;
        field4532 = new int[] { 0, -1, 0, 1 };
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V", line = 3)
    public static void method1967(int arg0) {
        if (arg0 >= -58) {
            field4533 = -6;
        }
        field4534 = null;
        field4531 = null;
        field4530 = null;
        field4532 = null;
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 24)
    public class328(String arg0, int arg1) {
        this.field4528 = arg1;
        this.field4527 = arg0;
    }

    @OriginalMember(owner = "client!dk", name = "toString", descriptor = "()Ljava/lang/String;", line = 33)
    public final String toString() {
        field4529++;
        throw new IllegalStateException();
    }
}
