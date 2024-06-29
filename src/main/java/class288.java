import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class288 {

    @OriginalMember(owner = "client!am", name = "a", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4175 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!am", name = "b", descriptor = "[[I")
    public static int[][] field4176 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!am", name = "c", descriptor = "Lvg;")
    public static class622 field4177 = new class622(23, 8);

    @OriginalMember(owner = "client!am", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4179 = null;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "Lmv;")
    public static class295 field4178;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V", line = 6)
    public static void method1772(byte arg0) {
        if (arg0 != -72) {
            return;
        }
        field4178 = null;
        field4175 = null;
        field4176 = null;
        field4177 = null;
        field4179 = null;
    }
}
