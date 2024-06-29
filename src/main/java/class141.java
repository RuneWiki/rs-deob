import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class141 {

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field2144 = -50;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "Lpm;")
    public static class349 field2143 = new class349("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V", line = 5)
    public static void method1064(int arg0) {
        int var1 = 12 / ((42 - arg0) / 51);
        field2143 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BJ)Ljava/lang/String;", line = 26)
    public static final String method1065(byte arg0, long arg1) {
        field2142++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        }
        int var3 = 19 / ((arg0 + 21) / 58);
        if (arg1 % 37L == 0L) {
            return null;
        }
        int var4 = 0;
        for (long var5 = arg1; var5 != 0L; var5 /= 37L) {
            var4++;
        }
        StringBuffer var7 = new StringBuffer(var4);
        while (arg1 != 0L) {
            long var8 = arg1;
            arg1 /= 37L;
            char var10 = class434.field6205[(int) (var8 - (arg1 * 37L))];
            if (var10 == '_') {
                int var11 = var7.length() - 1;
                var10 = ' ';
                var7.setCharAt(var11, Character.toUpperCase(var7.charAt(var11)));
            }
            var7.append(var10);
        }
        var7.reverse();
        var7.setCharAt(0, Character.toUpperCase(var7.charAt(0)));
        return var7.toString();
    }
}
