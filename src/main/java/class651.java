import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class651 {

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "Lho;")
    public class463 field9143 = null;

    @OriginalMember(owner = "client!dda", name = "d", descriptor = "Lla;")
    public class413 field9146 = null;

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "I")
    public static int field9144 = 0;

    @OriginalMember(owner = "client!dda", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field9148 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "I")
    public static int field9145;

    @OriginalMember(owner = "client!dda", name = "e", descriptor = "[Lsf;")
    public static class603[] field9147;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Z)V", line = 4)
    public static void method3630(boolean arg0) {
        field9147 = null;
        field9148 = null;
        if (!arg0) {
            field9148 = null;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(B)Lwl;", line = 17)
    public static final class679 method3631(byte arg0) {
        field9145++;
        if (arg0 != -89) {
            field9148 = null;
        }
        if (class482.field6939 == null || class234.field2868 == null) {
            return null;
        }
        for (class679 var1 = (class679) class234.field2868.method1268(-15212); var1 != null; var1 = (class679) class234.field2868.method1268(-15212)) {
            class655 var2 = class482.field6927.method705(var1.field9562, arg0 ^ 0x27);
            if (var2 != null && var2.field9224 && var2.method3644(-13401, class482.field6931)) {
                return var1;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lla;)V", line = 58)
    public class651(class413 arg0) {
        this.field9146 = arg0;
    }

    @OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lla;Lho;)V", line = 65)
    public class651(class413 arg0, class463 arg1) {
        this.field9143 = arg1;
        this.field9146 = arg0;
    }
}
