import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class519 {

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "Luv;")
    public static class2 field7605 = new class2(57, 2);

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "Ljava/util/Calendar;")
    public static Calendar field7606 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!cp", name = "h", descriptor = "I")
    public static int field7609 = 0;

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "Z")
    public static boolean field7607 = false;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "I")
    public static int field7602;

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "I")
    public static int field7604;

    @OriginalMember(owner = "client!cp", name = "g", descriptor = "I")
    public static int field7608;

    @OriginalMember(owner = "client!cp", name = "i", descriptor = "J")
    public static long field7610;

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "Loj;")
    public class416 field7603;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)Z")
    public static final boolean method3069(int arg0, int arg1) {
        field7602++;
        if (arg0 == 9) {
            return arg1 == 2 || arg1 == 6 || arg1 == 9;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)V")
    public static void method3070(byte arg0) {
        field7605 = null;
        int var1 = -65 % ((arg0 + 60) / 63);
        field7606 = null;
    }
}
