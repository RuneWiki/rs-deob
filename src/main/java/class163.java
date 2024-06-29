import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class163 extends class233 {

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "Ljava/lang/String;")
    public static String field2313 = "yellow:";

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "Lld;")
    public static class207 field2312;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V", line = 9)
    public static void method1232(byte arg0) {
        field2312 = null;
        field2313 = null;
        if (arg0 >= -55) {
            field2314 = -41;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)Z", line = 21)
    public static final boolean method1233(int arg0, int arg1, int arg2) {
        int var3 = class71.field935[arg0][arg1][arg2];
        if (-class130.field1770 == var3) {
            return false;
        } else if (class130.field1770 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class218.method1582(var4 + 1, class74.field978[arg0][arg1][arg2], var5 + 1) && class218.method1582(var4 + 128 - 1, class74.field978[arg0][arg1 + 1][arg2], var5 + 1) && class218.method1582(var4 + 128 - 1, class74.field978[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class218.method1582(var4 + 1, class74.field978[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class71.field935[arg0][arg1][arg2] = class130.field1770;
                return true;
            } else {
                class71.field935[arg0][arg1][arg2] = -class130.field1770;
                return false;
            }
        }
    }
}
