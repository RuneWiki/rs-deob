import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class216 {

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int field3348 = 0;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3349 = "Loading world list data";

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "Z")
    public static boolean field3351 = true;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3350 = "flash1:";

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "Lhc;")
    public static class235 field3346;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1454(String arg0, int arg1) {
        field3347++;
        int var2 = arg0.length();
        char[] var3 = new char[var2];
        byte var4 = 2;
        for (int var5 = arg1; var5 < var2; var5++) {
            char var6 = arg0.charAt(var5);
            if (var4 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var4 == 2 || Character.isUpperCase(var6)) {
                var6 = class218.method1467(true, var6);
            }
            if (Character.isLetter(var6)) {
                var4 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var4 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var4 = 1;
            } else if (var4 != 2) {
                var4 = 1;
            }
            var3[var5] = var6;
        }
        return new String(var3);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
    public static void method1455(int arg0) {
        field3349 = null;
        field3350 = null;
        if (arg0 == 0) {
            field3346 = null;
        }
    }
}
