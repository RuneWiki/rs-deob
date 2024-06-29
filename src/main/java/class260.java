import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public abstract class class260 {

    @OriginalMember(owner = "client!dea", name = "c", descriptor = "Lfca;")
    public class92 field3867;

    @OriginalMember(owner = "client!dea", name = "d", descriptor = "I")
    public int field3868;

    @OriginalMember(owner = "client!dea", name = "e", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3869 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!dea", name = "f", descriptor = "Ljw;")
    public static class581 field3870 = new class581(7, 1);

    @OriginalMember(owner = "client!dea", name = "g", descriptor = "Z")
    public static boolean field3871 = false;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)V", line = 13)
    public static void method1720(int arg0) {
        if (arg0 != 7863) {
            field3871 = false;
        }
        field3869 = null;
        field3870 = null;
    }

    @OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Lfca;)V", line = 26)
    public class260(class92 arg0) {
        this.field3867 = arg0;
        this.field3868 = this.method8((byte) 4);
    }

    @OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(ILfca;)V", line = 35)
    public class260(int arg0, class92 arg1) {
        this.field3868 = arg0;
        this.field3867 = arg1;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(II)V", line = 45)
    public final void method1721(int arg0, int arg1) {
        if (arg0 != ~this.method4(arg1, (byte) -119)) {
            this.method9(arg1, (byte) -107);
        }
        field3866++;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(IB)I")
    public abstract int method4(int arg0, byte arg1);

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "(IB)V")
    public abstract void method9(int arg0, byte arg1);

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(B)I")
    public abstract int method8(byte arg0);

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Z)V")
    public abstract void method2(boolean arg0);
}
