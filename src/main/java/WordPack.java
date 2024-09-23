import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ac")
public class WordPack {

    @OriginalMember(owner = "ac", name = "a", descriptor = "Z")
    private static boolean field861 = true;

    @OriginalMember(owner = "ac", name = "b", descriptor = "[C")
    public static char[] field862 = new char[100];

    @OriginalMember(owner = "ac", name = "c", descriptor = "[C")
    private static char[] field863 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "ac", name = "a", descriptor = "(IILmb;)Ljava/lang/String;")
    public static String method307(int arg0, int arg1, Packet arg2) {
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg0; var5++) {
            int var10 = arg2.method231();
            int var11 = var10 >> 4 & 0xF;
            if (var4 != -1) {
                field862[var3++] = field863[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field862[var3++] = field863[var11];
            } else {
                var4 = var11;
            }
            int var12 = var10 & 0xF;
            if (var4 != -1) {
                field862[var3++] = field863[(var4 << 4) + var12 - 195];
                var4 = -1;
            } else if (var12 < 13) {
                field862[var3++] = field863[var12];
            } else {
                var4 = var12;
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < var3; var7++) {
            char var9 = field862[var7];
            if (var6 && var9 >= 'a' && var9 <= 'z') {
                field862[var7] = (char) (field862[var7] - 32);
                var6 = false;
            }
            if (var9 == '.' || var9 == '!') {
                var6 = true;
            }
        }
        int var8 = 15 / arg1;
        return new String(field862, 0, var3);
    }

    @OriginalMember(owner = "ac", name = "a", descriptor = "(BLjava/lang/String;Lmb;)V")
    public static void method308(byte arg0, String arg1, Packet arg2) {
        if (arg0 != 50) {
            field861 = !field861;
        }
        if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        String var3 = arg1.toLowerCase();
        int var4 = -1;
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field863.length; var8++) {
                if (field863[var8] == var6) {
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
                    arg2.method221(var7);
                }
            } else if (var7 < 13) {
                arg2.method221((var4 << 4) + var7);
                var4 = -1;
            } else {
                arg2.method221((var4 << 4) + (var7 >> 4));
                var4 = var7 & 0xF;
            }
        }
        if (var4 != -1) {
            arg2.method221(var4 << 4);
        }
    }
}
