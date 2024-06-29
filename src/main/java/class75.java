import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class75 {

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "Lvm;")
    public static class75 field1030 = new class75();

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "Lvm;")
    public static class75 field1031 = new class75();

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "Lvm;")
    public static class75 field1033 = new class75();

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "Lvm;")
    public static class75 field1034 = new class75();

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "Z")
    public static boolean field1035 = false;

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "I")
    public static int field1036 = 0;

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "Lwj;")
    public static class121 field1037 = new class121("runescape", 0);

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(BJ)Ljava/lang/String;")
    public static final String method465(byte arg0, long arg1) {
        if (arg0 < 49) {
            field1035 = true;
        }
        field1029++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class523.field7342[(int) (var7 - (arg1 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var9 = ' ';
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V")
    public static void method466(byte arg0) {
        if (arg0 != -119) {
            return;
        }
        field1031 = null;
        field1033 = null;
        field1030 = null;
        field1037 = null;
        field1034 = null;
    }

    @OriginalMember(owner = "client!vm", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1032++;
        throw new IllegalStateException();
    }
}
