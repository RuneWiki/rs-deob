import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class392 {

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field5309 = -1;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "Z")
    public static boolean field5313 = false;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "Lok;")
    public static class166 field5310 = new class166(8, 2);

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "Ljava/util/Calendar;")
    public static Calendar field5314 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field5312;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "[S")
    public static short[] field5308;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V", line = 19)
    public static void method2303(int arg0) {
        if (arg0 == 1609) {
            field5310 = null;
            field5314 = null;
            field5308 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B[S)[S", line = 31)
    public static final short[] method2304(byte arg0, short[] arg1) {
        field5312++;
        if (arg1 == null) {
            return null;
        }
        short[] var2 = new short[arg1.length];
        if (arg0 != 92) {
            method2303(-2);
        }
        class254.method1528(arg1, 0, var2, 0, arg1.length);
        return var2;
    }
}
