import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("KDXWZDUJ")
public class class27 {

    @OriginalMember(owner = "KDXWZDUJ", name = "a", descriptor = "I")
    private static int field934 = 954;

    @OriginalMember(owner = "KDXWZDUJ", name = "b", descriptor = "[C")
    public static char[] field935 = new char[100];

    @OriginalMember(owner = "KDXWZDUJ", name = "c", descriptor = "LPGNBHFUF;")
    private static class42 field936 = new class42(5, new byte[100]);

    @OriginalMember(owner = "KDXWZDUJ", name = "d", descriptor = "[C")
    private static char[] field937 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "KDXWZDUJ", name = "a", descriptor = "(BILPGNBHFUF;)Ljava/lang/String;")
    public static String method308(byte arg0, int arg1, class42 arg2) {
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg1; var5++) {
            int var9 = arg2.method420();
            int var10 = var9 >> 4 & 0xF;
            if (var4 != -1) {
                field935[var3++] = field937[(var4 << 4) + var10 - 195];
                var4 = -1;
            } else if (var10 < 13) {
                field935[var3++] = field937[var10];
            } else {
                var4 = var10;
            }
            int var11 = var9 & 0xF;
            if (var4 != -1) {
                field935[var3++] = field937[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field935[var3++] = field937[var11];
            } else {
                var4 = var11;
            }
        }
        if (arg0 != 5) {
            throw new NullPointerException();
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < var3; var7++) {
            char var8 = field935[var7];
            if (var6 && var8 >= 'a' && var8 <= 'z') {
                field935[var7] = (char) (field935[var7] - 32);
                var6 = false;
            }
            if (var8 == '.' || var8 == '!' || var8 == '?') {
                var6 = true;
            }
        }
        return new String(field935, 0, var3);
    }

    @OriginalMember(owner = "KDXWZDUJ", name = "a", descriptor = "(LPGNBHFUF;Ljava/lang/String;Z)V")
    public static void method309(class42 arg0, String arg1, boolean arg2) {
        if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        String var3 = arg1.toLowerCase();
        int var4 = -1;
        if (!arg2) {
            field934 = 66;
        }
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field937.length; var8++) {
                if (field937[var8] == var6) {
                    var7 = var8;
                    break;
                }
            }
            if (var7 > 12) {
                var7 += 195;
            }
            if (var4 == -1) {
                if (var7 < 13) {
                    var4 = var7;
                } else {
                    arg0.method410(var7);
                }
            } else if (var7 < 13) {
                arg0.method410((var4 << 4) + var7);
                var4 = -1;
            } else {
                arg0.method410((var4 << 4) + (var7 >> 4));
                var4 = var7 & 0xF;
            }
        }
        if (var4 != -1) {
            arg0.method410(var4 << 4);
        }
    }

    @OriginalMember(owner = "KDXWZDUJ", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method310(String arg0, int arg1) {
        field936.field1250 = 0;
        method309(field936, arg0, true);
        int var2 = field936.field1250;
        field936.field1250 = 0;
        int var3 = 36 / arg1;
        return method308((byte) 5, var2, field936);
    }
}
