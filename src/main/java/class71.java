import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ZRHRGDTH")
public class class71 {

    @OriginalMember(owner = "client!ZRHRGDTH", name = "a", descriptor = "Z")
    private static boolean field1752 = true;

    @OriginalMember(owner = "client!ZRHRGDTH", name = "c", descriptor = "I")
    private static int field1754 = 8378;

    @OriginalMember(owner = "client!ZRHRGDTH", name = "d", descriptor = "[C")
    public static char[] field1755 = new char[100];

    @OriginalMember(owner = "client!ZRHRGDTH", name = "e", descriptor = "LRGCGKKUR;")
    private static class53 field1756 = new class53(new byte[100], (byte) -17);

    @OriginalMember(owner = "client!ZRHRGDTH", name = "f", descriptor = "[C")
    private static char[] field1757 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "client!ZRHRGDTH", name = "b", descriptor = "Z")
    private static boolean field1753;

    @OriginalMember(owner = "client!ZRHRGDTH", name = "a", descriptor = "(LRGCGKKUR;II)Ljava/lang/String;")
    public static String method588(class53 arg0, int arg1, int arg2) {
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg1; var5++) {
            int var9 = arg0.method455();
            int var10 = var9 >> 4 & 0xF;
            if (var4 != -1) {
                field1755[var3++] = field1757[(var4 << 4) + var10 - 195];
                var4 = -1;
            } else if (var10 < 13) {
                field1755[var3++] = field1757[var10];
            } else {
                var4 = var10;
            }
            int var11 = var9 & 0xF;
            if (var4 != -1) {
                field1755[var3++] = field1757[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field1755[var3++] = field1757[var11];
            } else {
                var4 = var11;
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < var3; var7++) {
            char var8 = field1755[var7];
            if (var6 && var8 >= 'a' && var8 <= 'z') {
                field1755[var7] = (char) (field1755[var7] - 32);
                var6 = false;
            }
            if (var8 == '.' || var8 == '!' || var8 == '?') {
                var6 = true;
            }
        }
        if (arg2 != 0) {
            field1753 = !field1753;
        }
        return new String(field1755, 0, var3);
    }

    @OriginalMember(owner = "client!ZRHRGDTH", name = "a", descriptor = "(LRGCGKKUR;ILjava/lang/String;)V")
    public static void method589(class53 arg0, int arg1, String arg2) {
        if (arg2.length() > 80) {
            arg2 = arg2.substring(0, 80);
        }
        String var3 = arg2.toLowerCase();
        if (field1754 != arg1) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = -1;
        for (int var6 = 0; var6 < var3.length(); var6++) {
            char var7 = var3.charAt(var6);
            int var8 = 0;
            for (int var9 = 0; var9 < field1757.length; var9++) {
                if (field1757[var9] == var7) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 > 12) {
                var8 += 195;
            }
            if (var5 == -1) {
                if (var8 < 13) {
                    var5 = var8;
                } else {
                    arg0.method445(var8);
                }
            } else if (var8 < 13) {
                arg0.method445((var5 << 4) + var8);
                var5 = -1;
            } else {
                arg0.method445((var5 << 4) + (var8 >> 4));
                var5 = var8 & 0xF;
            }
        }
        if (var5 != -1) {
            arg0.method445(var5 << 4);
        }
    }

    @OriginalMember(owner = "client!ZRHRGDTH", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
    public static String method590(String arg0, boolean arg1) {
        field1756.field1539 = 0;
        method589(field1756, 8378, arg0);
        if (!arg1) {
            field1752 = !field1752;
        }
        int var2 = field1756.field1539;
        field1756.field1539 = 0;
        return method588(field1756, var2, 0);
    }
}
