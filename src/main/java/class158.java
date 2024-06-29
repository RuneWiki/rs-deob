import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class158 {

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "Lbj;")
    public static class131 field2222 = new class131(30);

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "J")
    public static long field2223 = -1L;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Z)V", line = 8)
    public static void method1057(boolean arg0) {
        if (arg0) {
            field2222 = null;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ZJ)Ljava/lang/String;", line = 18)
    public static final String method1058(boolean arg0, long arg1) {
        field2221++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            if (arg0) {
                return null;
            }
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var6.append(class420.field5948[(int) (var7 - arg1 * 37L)]);
            }
            return var6.reverse().toString();
        }
    }
}
