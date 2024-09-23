import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("wb")
public class WordPack {

    @OriginalMember(owner = "wb", name = "a", descriptor = "[C")
    public static char[] field751 = new char[100];

    @OriginalMember(owner = "wb", name = "b", descriptor = "[C")
    private static char[] field752 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "wb", name = "a", descriptor = "(Lkb;II)Ljava/lang/String;")
    public static String method265(Packet arg0, int arg1, int arg2) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 43 / arg1;
        for (int var6 = 0; var6 < arg2; var6++) {
            int var10 = arg0.method216();
            int var11 = var10 >> 4 & 0xF;
            if (var4 != -1) {
                field751[var3++] = field752[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field751[var3++] = field752[var11];
            } else {
                var4 = var11;
            }
            int var12 = var10 & 0xF;
            if (var4 != -1) {
                field751[var3++] = field752[(var4 << 4) + var12 - 195];
                var4 = -1;
            } else if (var12 < 13) {
                field751[var3++] = field752[var12];
            } else {
                var4 = var12;
            }
        }
        boolean var7 = true;
        for (int var8 = 0; var8 < var3; var8++) {
            char var9 = field751[var8];
            if (var7 && var9 >= 'a' && var9 <= 'z') {
                field751[var8] = (char) (field751[var8] - 32);
                var7 = false;
            }
            if (var9 == '.' || var9 == '!') {
                var7 = true;
            }
        }
        return new String(field751, 0, var3);
    }

    @OriginalMember(owner = "wb", name = "a", descriptor = "(Lkb;ZLjava/lang/String;)V")
    public static void method266(Packet arg0, boolean arg1, String arg2) {
        if (arg2.length() > 80) {
            arg2 = arg2.substring(0, 80);
        }
        String var3 = arg2.toLowerCase();
        int var4 = -1;
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field752.length; var8++) {
                if (field752[var8] == var6) {
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
                    arg0.method206(var7);
                }
            } else if (var7 < 13) {
                arg0.method206((var4 << 4) + var7);
                var4 = -1;
            } else {
                arg0.method206((var4 << 4) + (var7 >> 4));
                var4 = var7 & 0xF;
            }
        }
        if (arg1 && var4 != -1) {
            arg0.method206(var4 << 4);
        }
    }
}
