import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class102 {

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field1416 = -2;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1413 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field1417 = 0;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "Laf;")
    public class102 field1412;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "Laf;")
    public class102 field1415;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V", line = 8)
    public final void method686(int arg0) {
        field1414++;
        if (this.field1412 == null) {
            return;
        }
        int var2 = 96 % ((57 - arg0) / 52);
        this.field1412.field1415 = this.field1415;
        this.field1415.field1412 = this.field1412;
        this.field1412 = null;
        this.field1415 = null;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V", line = 26)
    public static void method687(int arg0) {
        if (arg0 <= -75) {
            field1413 = null;
        }
    }
}
