import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jia")
public class class642 {

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "[Lma;")
    public static class14[] field9044 = new class14[1024];

    @OriginalMember(owner = "client!jia", name = "b", descriptor = "[C")
    public static char[] field9045 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!jia", name = "c", descriptor = "I")
    public static int field9046;

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(B)V")
    public static void method3647(byte arg0) {
        field9044 = null;
        if (arg0 >= -26) {
            field9044 = null;
        }
        field9045 = null;
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(III)Z")
    public static final boolean method3648(int arg0, int arg1, int arg2) {
        if (arg2 == -27464) {
            field9046++;
            return (arg0 & 0x34) != 0;
        } else {
            return true;
        }
    }
}
