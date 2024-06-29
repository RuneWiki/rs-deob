import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class242 {

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
    public static int field3987 = 0;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
    public static int field3985 = 0;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "[I")
    public static int[] field3988 = new int[2];

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "I")
    public static int field3989 = -1;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3990 = Calendar.getInstance();

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "Lwb;")
    public static class123 field3982;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
    public static void method1690(int arg0) {
        field3990 = null;
        field3988 = null;
        if (arg0 != 16270) {
            field3990 = null;
        }
        field3982 = null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)Lth;")
    public static final class234 method1691(int arg0, int arg1) {
        class234 var2 = (class234) class15.field196.method1693((long) arg1, arg0 - 30012);
        field3983++;
        if (var2 != null) {
            return var2;
        } else if (arg0 == 30099) {
            byte[] var3 = class152.field2358.method928(16, (byte) 118, arg1);
            class234 var4 = new class234();
            if (var3 != null) {
                var4.method1657(new class96(var3), arg0 - 30111);
            }
            class15.field196.method1694(true, (long) arg1, var4);
            return var4;
        } else {
            return null;
        }
    }
}
