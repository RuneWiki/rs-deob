import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class602 {

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "Lbu;")
    public static class21 field8434 = new class21(10, 12);

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field8437 = 0;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "Ljava/util/Calendar;")
    public static Calendar field8435 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "Lbu;")
    public static class21 field8440 = new class21(27, 1);

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public static int field8438;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "Lwia;")
    public static class791 field8436;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "Lwia;")
    public static class791 field8439;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
    public static void method3498(int arg0) {
        field8440 = null;
        field8435 = null;
        if (arg0 != 0) {
            method3498(86);
        }
        field8439 = null;
        field8436 = null;
        field8434 = null;
    }
}
