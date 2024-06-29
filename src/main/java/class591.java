import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class591 extends class417 {

    @OriginalMember(owner = "client!bw", name = "k", descriptor = "I")
    public int field8748;

    @OriginalMember(owner = "client!bw", name = "j", descriptor = "I")
    public int field8747;

    @OriginalMember(owner = "client!bw", name = "l", descriptor = "Ljava/util/Calendar;")
    public static Calendar field8749 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!bw", name = "i", descriptor = "I")
    public static int field8746;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method3508(int arg0, int arg1, int arg2) {
        int var3 = -108 / ((26 - arg2) / 56);
        field8746++;
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V", line = 16)
    public static void method3509(int arg0) {
        field8749 = null;
        if (arg0 != 2048) {
            method3509(52);
        }
    }

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(II)V", line = 30)
    public class591(int arg0, int arg1) {
        this.field8748 = arg1;
        this.field8747 = arg0;
    }
}
