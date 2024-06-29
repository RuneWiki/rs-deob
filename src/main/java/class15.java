import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!EXGZUGXN")
public class class15 {

    @OriginalMember(owner = "client!EXGZUGXN", name = "a", descriptor = "[C")
    public static char[] field720 = new char[100];

    @OriginalMember(owner = "client!EXGZUGXN", name = "b", descriptor = "LEMWAMCXW;")
    private static class14 field721 = new class14(new byte[100], true);

    @OriginalMember(owner = "client!EXGZUGXN", name = "c", descriptor = "[C")
    private static char[] field722 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "client!EXGZUGXN", name = "a", descriptor = "(LEMWAMCXW;II)Ljava/lang/String;")
    public static String method256(class14 arg0, int arg1, int arg2) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 62 / arg2;
        for (int var6 = 0; var6 < arg1; var6++) {
            int var10 = arg0.method217();
            int var11 = var10 >> 4 & 0xF;
            if (var4 != -1) {
                field720[var3++] = field722[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field720[var3++] = field722[var11];
            } else {
                var4 = var11;
            }
            int var12 = var10 & 0xF;
            if (var4 != -1) {
                field720[var3++] = field722[(var4 << 4) + var12 - 195];
                var4 = -1;
            } else if (var12 < 13) {
                field720[var3++] = field722[var12];
            } else {
                var4 = var12;
            }
        }
        boolean var7 = true;
        for (int var8 = 0; var8 < var3; var8++) {
            char var9 = field720[var8];
            if (var7 && var9 >= 'a' && var9 <= 'z') {
                field720[var8] = (char) (field720[var8] - 32);
                var7 = false;
            }
            if (var9 == '.' || var9 == '!' || var9 == '?') {
                var7 = true;
            }
        }
        return new String(field720, 0, var3);
    }

    @OriginalMember(owner = "client!EXGZUGXN", name = "a", descriptor = "(ILjava/lang/String;LEMWAMCXW;)V")
    public static void method257(int arg0, String arg1, class14 arg2) {
        if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        String var3 = arg1.toLowerCase();
        int var4 = -1;
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field722.length; var8++) {
                if (field722[var8] == var6) {
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
                    arg2.method207(var7);
                }
            } else if (var7 < 13) {
                arg2.method207((var4 << 4) + var7);
                var4 = -1;
            } else {
                arg2.method207((var4 << 4) + (var7 >> 4));
                var4 = var7 & 0xF;
            }
        }
        if (arg0 > 0 && var4 != -1) {
            arg2.method207(var4 << 4);
        }
    }

    @OriginalMember(owner = "client!EXGZUGXN", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static String method258(boolean arg0, String arg1) {
        field721.field707 = 0;
        method257(921, arg1, field721);
        int var2 = field721.field707;
        field721.field707 = 0;
        String var3 = method256(field721, var2, 905);
        if (arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        return var3;
    }
}
