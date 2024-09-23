import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ac")
public class WordPack {

    @OriginalMember(owner = "ac", name = "a", descriptor = "[C")
    public static char[] field853 = new char[100];

    @OriginalMember(owner = "ac", name = "b", descriptor = "[C")
    private static char[] field854 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "ac", name = "a", descriptor = "(ILmb;I)Ljava/lang/String;")
    public static String method303(int arg0, Packet arg1, int arg2) {
        int var3 = 0;
        int var4 = -1;
        if (arg2 != -19777) {
            throw new NullPointerException();
        }
        for (int var5 = 0; var5 < arg0; var5++) {
            int var9 = arg1.method231();
            int var10 = var9 >> 4 & 0xF;
            if (var4 != -1) {
                field853[var3++] = field854[(var4 << 4) + var10 - 195];
                var4 = -1;
            } else if (var10 < 13) {
                field853[var3++] = field854[var10];
            } else {
                var4 = var10;
            }
            int var11 = var9 & 0xF;
            if (var4 != -1) {
                field853[var3++] = field854[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field853[var3++] = field854[var11];
            } else {
                var4 = var11;
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < var3; var7++) {
            char var8 = field853[var7];
            if (var6 && var8 >= 'a' && var8 <= 'z') {
                field853[var7] = (char) (field853[var7] - 32);
                var6 = false;
            }
            if (var8 == '.' || var8 == '!') {
                var6 = true;
            }
        }
        return new String(field853, 0, var3);
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(ZLjava/lang/String;Lmb;)V")
    public static void method304(boolean arg0, String arg1, Packet arg2) {
        if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        String var3 = arg1.toLowerCase();
        int var4 = -1;
        if (arg0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = 0; var6 < var3.length(); var6++) {
            char var7 = var3.charAt(var6);
            int var8 = 0;
            for (int var9 = 0; var9 < field854.length; var9++) {
                if (field854[var9] == var7) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 > 12) {
                var8 += 195;
            }
            if (var4 == -1) {
                if (var8 < 13) {
                    var4 = var8;
                } else {
                    arg2.method221(var8);
                }
            } else if (var8 < 13) {
                arg2.method221((var4 << 4) + var8);
                var4 = -1;
            } else {
                arg2.method221((var4 << 4) + (var8 >> 4));
                var4 = var8 & 0xF;
            }
        }
        if (var4 != -1) {
            arg2.method221(var4 << 4);
        }
    }
}
