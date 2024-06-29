import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class667 {

    @OriginalMember(owner = "client!av", name = "a", descriptor = "I")
    public static int field9214 = 0;

    @OriginalMember(owner = "client!av", name = "b", descriptor = "I")
    public static int field9215;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method3693(int arg0, long arg1) {
        field9215++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            if (arg0 != -14014) {
                field9214 = -21;
            }
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var6.append(class493.field6833[(int) (var7 - (arg1 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }
}
