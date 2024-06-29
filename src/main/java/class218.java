import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class218 {

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public int field3984 = 0;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "Llc;")
    private static class143 field3980 = class66.method374("Allocated memory", -1);

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "Llc;")
    public static class143 field3987 = class66.method374("<)4col>", -1);

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "Llc;")
    public static class143 field3989 = field3980;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3981 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "Llc;")
    public static class143 field3990 = class66.method374("Moteur son pr-Bpar-B", -1);

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "Llc;")
    public static class143 field3991 = class66.method374("Clientscript error )2 check log for details", -1);

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)Lvj;")
    public static final class89 method1492(int arg0, int arg1) {
        field3988++;
        if (arg0 < 76) {
            return null;
        }
        class89 var2 = (class89) class124.field2185.method826((long) arg1, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class88.field1601.method41(-18328, 3, arg1);
        class89 var4 = new class89();
        if (var3 != null) {
            var4.method515(new class190(var3), (byte) 37);
        }
        class124.field2185.method827(-3, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V")
    public static void method1493(boolean arg0) {
        field3987 = null;
        field3991 = null;
        field3980 = null;
        field3981 = null;
        field3990 = null;
        if (!arg0) {
            field3989 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLh;)V")
    public final void method1494(byte arg0, class190 arg1) {
        if (arg0 != 108) {
            method1495(54L, -31);
        }
        field3983++;
        while (true) {
            int var3 = arg1.method1265(arg0 ^ 0x16);
            if (var3 == 0) {
                return;
            }
            this.method1496(arg1, -6, var3);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(JI)Llc;")
    public static final class143 method1495(long arg0, int arg1) {
        if (arg1 != 10) {
            field3985 = 108;
        }
        field3986++;
        return class277.method1830(19447, 10, false, arg0);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lh;II)V")
    private final void method1496(class190 arg0, int arg1, int arg2) {
        if (~arg2 == arg1) {
            this.field3984 = arg0.method1275(arg1 + 134);
        }
        field3982++;
    }
}
