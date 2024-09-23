import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ac")
public class WordPack {

    @OriginalMember(owner = "ac", name = "a", descriptor = "I")
    private static int field876 = 40639;

    @OriginalMember(owner = "ac", name = "b", descriptor = "[C")
    public static char[] field877 = new char[100];

    @OriginalMember(owner = "ac", name = "c", descriptor = "[C")
    private static char[] field878 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "ac", name = "a", descriptor = "(Lmb;II)Ljava/lang/String;")
    public static String method317(Packet arg0, int arg1, int arg2) {
        int var3 = 26 / arg2;
        int var4 = 0;
        int var5 = -1;
        for (int var6 = 0; var6 < arg1; var6++) {
            int var10 = arg0.method239();
            int var11 = var10 >> 4 & 0xF;
            if (var5 != -1) {
                field877[var4++] = field878[(var5 << 4) + var11 - 195];
                var5 = -1;
            } else if (var11 < 13) {
                field877[var4++] = field878[var11];
            } else {
                var5 = var11;
            }
            int var12 = var10 & 0xF;
            if (var5 != -1) {
                field877[var4++] = field878[(var5 << 4) + var12 - 195];
                var5 = -1;
            } else if (var12 < 13) {
                field877[var4++] = field878[var12];
            } else {
                var5 = var12;
            }
        }
        boolean var7 = true;
        for (int var8 = 0; var8 < var4; var8++) {
            char var9 = field877[var8];
            if (var7 && var9 >= 'a' && var9 <= 'z') {
                field877[var8] = (char) (field877[var8] - 32);
                var7 = false;
            }
            if (var9 == '.' || var9 == '!') {
                var7 = true;
            }
        }
        return new String(field877, 0, var4);
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(Ljava/lang/String;Lmb;B)V")
    public static void method318(String arg0, Packet arg1, byte arg2) {
        if (arg2 != 8) {
            field876 = 53;
        }
        if (arg0.length() > 80) {
            arg0 = arg0.substring(0, 80);
        }
        String var3 = arg0.toLowerCase();
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
                    arg1.method229(var7);
                }
            } else if (var7 < 13) {
                arg1.method229((var4 << 4) + var7);
                var4 = -1;
            } else {
                arg1.method229((var4 << 4) + (var7 >> 4));
                var4 = var7 & 0xF;
            }
        }
        if (var4 != -1) {
            arg1.method229(var4 << 4);
        }
    }
}
