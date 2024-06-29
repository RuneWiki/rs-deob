import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class221 {

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field3688 = new String[5];

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "Z")
    public static boolean field3690 = false;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "[I")
    public static int[] field3691 = new int[500];

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "[I")
    public static int[] field3694 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "[S")
    public static short[] field3693 = new short[256];

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
    public static int field3696 = 0;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "[Lli;")
    public static class241[] field3695;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V", line = 4)
    public static void method1619(int arg0) {
        field3695 = null;
        field3691 = null;
        field3688 = null;
        field3693 = null;
        field3694 = null;
        if (arg0 != 1) {
            field3695 = (class241[]) null;
        }
    }
}
