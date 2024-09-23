import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("wb")
public class WordPack {

    @OriginalMember(owner = "wb", name = "a", descriptor = "[C")
    public static char[] field747 = new char[100];

    @OriginalMember(owner = "wb", name = "b", descriptor = "[C")
    private static char[] field748 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "wb", name = "a", descriptor = "(IILkb;)Ljava/lang/String;")
    public static String method257(int arg0, int arg1, Packet arg2) {
        if (arg1 != 2) {
            throw new NullPointerException();
        }
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg0; var5++) {
            int var9 = arg2.method208();
            int var10 = var9 >> 4 & 0xF;
            if (var4 != -1) {
                field747[var3++] = field748[(var4 << 4) + var10 - 195];
                var4 = -1;
            } else if (var10 < 13) {
                field747[var3++] = field748[var10];
            } else {
                var4 = var10;
            }
            int var11 = var9 & 0xF;
            if (var4 != -1) {
                field747[var3++] = field748[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field747[var3++] = field748[var11];
            } else {
                var4 = var11;
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < var3; var7++) {
            char var8 = field747[var7];
            if (var6 && var8 >= 'a' && var8 <= 'z') {
                field747[var7] = (char) (field747[var7] - 32);
                var6 = false;
            }
            if (var8 == '.' || var8 == '!') {
                var6 = true;
            }
        }
        return new String(field747, 0, var3);
    }

    @OriginalMember(owner = "wb", name = "a", descriptor = "(Lkb;Ljava/lang/String;B)V")
    public static void method258(Packet arg0, String arg1, byte arg2) {
        if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        String var3 = arg1.toLowerCase();
        if (arg2 == 3) {
            boolean var4 = false;
        } else {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        int var6 = -1;
        for (int var7 = 0; var7 < var3.length(); var7++) {
            char var8 = var3.charAt(var7);
            int var9 = 0;
            for (int var10 = 0; var10 < field748.length; var10++) {
                if (field748[var10] == var8) {
                    var9 = var10;
                    break;
                }
            }
            if (var9 > 12) {
                var9 += 195;
            }
            if (var6 == -1) {
                if (var9 < 13) {
                    var6 = var9;
                } else {
                    arg0.method198(var9);
                }
            } else if (var9 < 13) {
                arg0.method198((var6 << 4) + var9);
                var6 = -1;
            } else {
                arg0.method198((var6 << 4) + (var9 >> 4));
                var6 = var9 & 0xF;
            }
        }
        if (var6 != -1) {
            arg0.method198(var6 << 4);
        }
    }
}
