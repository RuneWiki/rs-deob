import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ac")
public class WordPack {

    @OriginalMember(owner = "ac", name = "a", descriptor = "[C")
    public static char[] field884 = new char[100];

    @OriginalMember(owner = "ac", name = "b", descriptor = "[C")
    private static char[] field885 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "ac", name = "a", descriptor = "(ILmb;I)Ljava/lang/String;")
    public static String method317(int arg0, Packet arg1, int arg2) {
        if (arg2 != 2) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = 0;
        int var5 = -1;
        for (int var6 = 0; var6 < arg0; var6++) {
            int var10 = arg1.method239();
            int var11 = var10 >> 4 & 0xF;
            if (var5 != -1) {
                field884[var4++] = field885[(var5 << 4) + var11 - 195];
                var5 = -1;
            } else if (var11 < 13) {
                field884[var4++] = field885[var11];
            } else {
                var5 = var11;
            }
            int var12 = var10 & 0xF;
            if (var5 != -1) {
                field884[var4++] = field885[(var5 << 4) + var12 - 195];
                var5 = -1;
            } else if (var12 < 13) {
                field884[var4++] = field885[var12];
            } else {
                var5 = var12;
            }
        }
        boolean var7 = true;
        for (int var8 = 0; var8 < var4; var8++) {
            char var9 = field884[var8];
            if (var7 && var9 >= 'a' && var9 <= 'z') {
                field884[var8] = (char) (field884[var8] - 32);
                var7 = false;
            }
            if (var9 == '.' || var9 == '!') {
                var7 = true;
            }
        }
        return new String(field884, 0, var4);
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(Ljava/lang/String;Lmb;I)V")
    public static void method318(String arg0, Packet arg1, int arg2) {
        if (arg0.length() > 80) {
            arg0 = arg0.substring(0, 80);
        }
        String var3 = arg0.toLowerCase();
        if (arg2 != 8) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = -1;
        for (int var6 = 0; var6 < var3.length(); var6++) {
            char var7 = var3.charAt(var6);
            int var8 = 0;
            for (int var9 = 0; var9 < field885.length; var9++) {
                if (field885[var9] == var7) {
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
                    arg1.method229(var8);
                }
            } else if (var8 < 13) {
                arg1.method229((var5 << 4) + var8);
                var5 = -1;
            } else {
                arg1.method229((var5 << 4) + (var8 >> 4));
                var5 = var8 & 0xF;
            }
        }
        if (var5 != -1) {
            arg1.method229(var5 << 4);
        }
    }
}
