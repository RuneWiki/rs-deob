import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class342 extends class223 {

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    public volatile int field4733 = -1;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "Ljava/lang/String;")
    public volatile String field4734;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "Lsl;")
    public static class318 field4732 = new class318(24, -1);

    @OriginalMember(owner = "client!va", name = "p", descriptor = "[Z")
    public static boolean[] field4736 = new boolean[100];

    @OriginalMember(owner = "client!va", name = "q", descriptor = "[I")
    public static int[] field4737 = new int[4096];

    @OriginalMember(owner = "client!va", name = "o", descriptor = "Lng;")
    public static class227 field4735;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(B)V", line = 5)
    public static void method2077(byte arg0) {
        if (arg0 >= -25) {
            field4737 = null;
        }
        field4736 = null;
        field4735 = null;
        field4737 = null;
        field4732 = null;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 22)
    public class342(String arg0) {
        this.field4734 = arg0;
    }
}
