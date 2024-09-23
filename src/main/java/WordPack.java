import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ac")
public class WordPack {

    @OriginalMember(owner = "ac", name = "a", descriptor = "[C")
    public static char[] field877 = new char[100];

    @OriginalMember(owner = "ac", name = "b", descriptor = "[C")
    private static char[] field878 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "ac", name = "a", descriptor = "(Lmb;II)Ljava/lang/String;")
    public static String method317(Packet arg0, int arg1, int arg2) {
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg1; var5++) {
            int var10 = arg0.method239();
            int var11 = var10 >> 4 & 0xF;
            if (var4 != -1) {
                field877[var3++] = field878[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field877[var3++] = field878[var11];
            } else {
                var4 = var11;
            }
            int var12 = var10 & 0xF;
            if (var4 != -1) {
                field877[var3++] = field878[(var4 << 4) + var12 - 195];
                var4 = -1;
            } else if (var12 < 13) {
                field877[var3++] = field878[var12];
            } else {
                var4 = var12;
            }
        }
        boolean var6 = true;
        while (arg2 >= 0) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        for (int var7 = 0; var7 < var3; var7++) {
            char var8 = field877[var7];
            if (var6 && var8 >= 'a' && var8 <= 'z') {
                field877[var7] = (char) (field877[var7] - 32);
                var6 = false;
            }
            if (var8 == '.' || var8 == '!') {
                var6 = true;
            }
        }
        return new String(field877, 0, var3);
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(Lmb;ILjava/lang/String;)V")
    public static void method318(Packet arg0, int arg1, String arg2) {
        if (arg2.length() > 80) {
            arg2 = arg2.substring(0, 80);
        }
        String var3 = arg2.toLowerCase();
        if (arg1 != 7) {
            return;
        }
        int var4 = -1;
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field878.length; var8++) {
                if (field878[var8] == var6) {
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
                    arg0.method229(var7);
                }
            } else if (var7 < 13) {
                arg0.method229((var4 << 4) + var7);
                var4 = -1;
            } else {
                arg0.method229((var4 << 4) + (var7 >> 4));
                var4 = var7 & 0xF;
            }
        }
        if (var4 != -1) {
            arg0.method229(var4 << 4);
        }
    }
}
