import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class226 {

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "[I")
    public static int[] field3629 = new int[25];

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "Z")
    public static boolean field3630 = false;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field3627 = new String[5];

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "J")
    public static long field3628 = 0L;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V", line = 6)
    public static void method1583(byte arg0) {
        field3627 = null;
        field3629 = null;
        if (arg0 != -109) {
            method1583((byte) -32);
        }
    }
}
