import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class225 {

    @OriginalMember(owner = "client!on", name = "a", descriptor = "Z")
    public static boolean field3115 = false;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "[C")
    public static char[] field3117 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!on", name = "d", descriptor = "[I")
    public static int[] field3118 = new int[500];

    @OriginalMember(owner = "client!on", name = "e", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!on", name = "b", descriptor = "Ltj;")
    public static class134 field3116;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V")
    public static void method1507(int arg0) {
        field3117 = null;
        if (arg0 < 104) {
            field3115 = true;
        }
        field3118 = null;
        field3116 = null;
    }
}
