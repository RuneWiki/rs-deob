import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class156 {

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field2453 = new Hashtable();

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "[S")
    public static short[] field2454 = new short[256];

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public static void method1208(int arg0) {
        field2454 = null;
        field2453 = null;
        if (arg0 <= 104) {
            method1210(null, 123, null);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)Lbc;")
    public static final class11 method1209(int arg0, int arg1, int arg2) {
        class172 var3 = class514.field7096[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2594;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "([II[Ljava/lang/Object;)V")
    public static final void method1210(int[] arg0, int arg1, Object[] arg2) {
        field2452++;
        class413.method2433(arg0.length - arg1, 2, 0, arg0, arg2);
    }
}
