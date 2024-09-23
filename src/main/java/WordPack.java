import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("wb")
public class WordPack {

    @OriginalMember(owner = "wb", name = "a", descriptor = "[C")
    public static char[] field731 = new char[100];

    @OriginalMember(owner = "wb", name = "b", descriptor = "[C")
    private static char[] field732 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "wb", name = "a", descriptor = "(BILkb;)Ljava/lang/String;")
    public static String method258(byte arg0, int arg1, Packet arg2) {
        if (arg0 != 7) {
            throw new NullPointerException();
        }
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg1; var5++) {
            int var9 = arg2.method209();
            int var10 = var9 >> 4 & 0xF;
            if (var4 != -1) {
                field731[var3++] = field732[(var4 << 4) + var10 - 195];
                var4 = -1;
            } else if (var10 < 13) {
                field731[var3++] = field732[var10];
            } else {
                var4 = var10;
            }
            int var11 = var9 & 0xF;
            if (var4 != -1) {
                field731[var3++] = field732[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field731[var3++] = field732[var11];
            } else {
                var4 = var11;
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < var3; var7++) {
            char var8 = field731[var7];
            if (var6 && var8 >= 'a' && var8 <= 'z') {
                field731[var7] = (char) (field731[var7] - 32);
                var6 = false;
            }
            if (var8 == '.' || var8 == '!') {
                var6 = true;
            }
        }
        return new String(field731, 0, var3);
    }

    @OriginalMember(owner = "wb", name = "a", descriptor = "(ILkb;Ljava/lang/String;)V")
    public static void method259(int arg0, Packet arg1, String arg2) {
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (arg2.length() > 80) {
            arg2 = arg2.substring(0, 80);
        }
        String var4 = arg2.toLowerCase();
        int var5 = -1;
        for (int var6 = 0; var6 < var4.length(); var6++) {
            char var7 = var4.charAt(var6);
            int var8 = 0;
            for (int var9 = 0; var9 < field732.length; var9++) {
                if (field732[var9] == var7) {
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
                    arg1.method199(var8);
                }
            } else if (var8 < 13) {
                arg1.method199((var5 << 4) + var8);
                var5 = -1;
            } else {
                arg1.method199((var5 << 4) + (var8 >> 4));
                var5 = var8 & 0xF;
            }
        }
        if (var5 != -1) {
            arg1.method199(var5 << 4);
        }
    }
}
