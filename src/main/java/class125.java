import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class125 {

    @OriginalMember(owner = "client!dt", name = "e", descriptor = "J")
    public static long field1607 = -1L;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1603 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!dt", name = "g", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!dt", name = "f", descriptor = "Lpq;")
    public static class159 field1608;

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field1606;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)V")
    public static void method763(int arg0) {
        field1608 = null;
        field1606 = null;
        field1603 = null;
        if (arg0 >= -100) {
            method763(-92);
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIILul;)V")
    public static final void method764(int arg0, int arg1, int arg2, class331 arg3) {
        class651 var4 = class29.method180(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field9227 = arg3;
        }
    }
}
