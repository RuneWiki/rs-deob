import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class774 {

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "Z")
    public static boolean field10707 = true;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field10708 = new String[8];

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field10706;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method4257(int arg0, long arg1) {
        field10706++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % (long) arg0 == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class27.field511[(int) (var7 - (arg1 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                    var9 = ' ';
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public static void method4258(int arg0) {
        field10708 = null;
        if (arg0 != -2) {
            field10707 = false;
        }
    }
}
