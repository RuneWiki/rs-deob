import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vha")
public class class24 {

    @OriginalMember(owner = "client!vha", name = "b", descriptor = "Ljava/util/Calendar;")
    public static Calendar field269 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!vha", name = "d", descriptor = "J")
    public static long field271 = 0L;

    @OriginalMember(owner = "client!vha", name = "c", descriptor = "Lin;")
    public static class380 field270 = new class380(31, -1);

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(I)V")
    public static final void method218(int arg0) {
        field268++;
        if (class239.field3450) {
            return;
        }
        class438.field6083 = true;
        class322.field4582 += (-12.0F - class322.field4582) / 2.0F;
        if (arg0 != 27309) {
            field269 = null;
        }
        class239.field3450 = true;
    }

    @OriginalMember(owner = "client!vha", name = "b", descriptor = "(I)V")
    public static void method219(int arg0) {
        field269 = null;
        if (arg0 >= -78) {
            field269 = null;
        }
        field270 = null;
    }
}
