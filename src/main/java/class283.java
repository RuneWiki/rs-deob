import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class283 extends class416 {

    @OriginalMember(owner = "client!vca", name = "A", descriptor = "[B")
    public byte[] field4000;

    @OriginalMember(owner = "client!vca", name = "z", descriptor = "I")
    public static int field3999 = 0;

    @OriginalMember(owner = "client!vca", name = "B", descriptor = "Lhda;")
    public static class752 field4001 = new class752(111, 0);

    @OriginalMember(owner = "client!vca", name = "D", descriptor = "[I")
    public static int[] field4002 = new int[2];

    @OriginalMember(owner = "client!vca", name = "x", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!vca", name = "y", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!vca", name = "E", descriptor = "Ljava/lang/String;")
    public static String field4003;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(I)V", line = 6)
    public static void method1751(int arg0) {
        field4003 = null;
        field4002 = null;
        field4001 = null;
        if (arg0 != 31495) {
            method1751(-64);
        }
    }

    @OriginalMember(owner = "client!vca", name = "<init>", descriptor = "([B)V", line = 27)
    public class283(byte[] arg0) {
        this.field4000 = arg0;
    }
}
