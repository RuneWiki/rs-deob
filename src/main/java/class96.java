import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class96 {

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "[I")
    public static int[] field1650 = new int[14];

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "Lrc;")
    public static class9 field1651 = new class9(32);

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1655 = "Take";

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "Z")
    public static boolean field1653 = false;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V")
    public static void method608(byte arg0) {
        if (arg0 != 67) {
            field1651 = null;
        }
        field1650 = null;
        field1651 = null;
        field1655 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method609(String arg0, int arg1, int arg2) {
        field1649++;
        class225.field3778++;
        class168.field2778.method199(arg2, -10);
        class168.field2778.method682(arg1, arg2 ^ 0x58F4);
        class168.field2778.method668(class103.method702(true, arg0), false);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)Z")
    public static final boolean method610(int arg0) {
        if (arg0 != 0) {
            method608((byte) 71);
        }
        field1652++;
        return class277.field4434;
    }
}
