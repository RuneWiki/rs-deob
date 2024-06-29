import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class97 {

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1075 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1076;

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "[[[Lne;")
    public static class287[][][] field1074;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V", line = 4)
    public static void method604(int arg0) {
        if (arg0 != -6496) {
            method605(62, -37, -49, -76, -19, (byte) 95);
        }
        field1074 = null;
        field1075 = null;
        field1076 = null;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIIIB)Z", line = 20)
    public static final boolean method605(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field1073++;
        int var6 = arg3;
        if (arg5 <= 100) {
            field1076 = null;
        }
        while (arg4 >= var6) {
            for (int var7 = arg2; var7 <= arg1; var7++) {
                if (class451.field6202[var6][var7] == arg0 && class115.field1339[var6][var7] <= 1) {
                    return true;
                }
            }
            var6++;
        }
        return false;
    }
}
