import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class22 {

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "Ljava/util/Calendar;")
    public static Calendar field237 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "I")
    public int field236;

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "I")
    public int field238;

    @OriginalMember(owner = "client!cv", name = "e", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!cv", name = "f", descriptor = "I")
    public int field240;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "Lfd;")
    public static class418 field235;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)Lrh;")
    public static final class642 method119(byte arg0) {
        field239++;
        try {
            if (arg0 >= -42) {
                field235 = null;
            }
            return new class170();
        } catch (Throwable var2) {
            try {
                return (class642) Class.forName("df").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class75();
            }
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)V")
    public static void method120(int arg0) {
        field235 = null;
        field237 = null;
        if (arg0 != 26125) {
            method120(-108);
        }
    }
}
