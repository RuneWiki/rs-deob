import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class473 {

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "Ljava/util/Random;")
    public static Random field6592 = new Random();

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "J")
    public static long field6593 = 0L;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public static int field6590;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field6591;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(III)Z", line = 6)
    public static final boolean method2728(int arg0, int arg1, int arg2) {
        if (arg1 != 32) {
            field6593 = 75L;
        }
        field6591++;
        return (arg2 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)V", line = 30)
    public static void method2729(byte arg0) {
        field6592 = null;
        if (arg0 != 53) {
            method2728(55, 105, 69);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 40)
    public static final boolean method2730(byte arg0, String arg1) {
        field6590++;
        if (arg0 < 76) {
            field6592 = null;
        }
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class427.field5757; var2++) {
            if (arg1.equalsIgnoreCase(class82.field948[var2])) {
                return true;
            }
        }
        return arg1.equalsIgnoreCase(class408.field5369.field7791);
    }
}
