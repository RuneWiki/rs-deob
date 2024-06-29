import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class307 {

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)Loga;")
    public static final class497 method2017(byte arg0) {
        if (arg0 != 117) {
            method2018(-109, 126, 2);
        }
        field4579++;
        if (class436.field6223 == null || class376.field5412 == null) {
            return null;
        }
        for (class497 var1 = (class497) class376.field5412.method1525(arg0 + 6947); var1 != null; var1 = (class497) class376.field5412.method1525(7064)) {
            class665 var2 = class436.field6213.method3711((byte) 55, var1.field7063);
            if (var2 != null && var2.field9331 && var2.method3789(class436.field6212, 0)) {
                return var1;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(III)Z")
    public static final boolean method2018(int arg0, int arg1, int arg2) {
        field4580++;
        if (arg0 < 42) {
            return false;
        } else if (arg1 >= 1000 && arg2 < 1000) {
            return true;
        } else if (arg1 >= 1000 || arg2 >= 1000) {
            return arg1 >= 1000 && arg2 >= 1000;
        } else if (class49.method328((byte) -90, arg2)) {
            return true;
        } else {
            return !class49.method328((byte) -70, arg1);
        }
    }
}
