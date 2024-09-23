import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("wb")
public class WordPack {

    @OriginalMember(owner = "wb", name = "a", descriptor = "I")
    private static int field749 = 410;

    @OriginalMember(owner = "wb", name = "b", descriptor = "[C")
    public static char[] field750 = new char[100];

    @OriginalMember(owner = "wb", name = "c", descriptor = "[C")
    private static char[] field751 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "wb", name = "a", descriptor = "(IILkb;)Ljava/lang/String;")
    public static String method258(int arg0, int arg1, Packet arg2) {
        while (arg0 >= 0) {
            field749 = -94;
        }
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg1; var5++) {
            int var9 = arg2.method209();
            int var10 = var9 >> 4 & 0xF;
            if (var4 != -1) {
                field750[var3++] = field751[(var4 << 4) + var10 - 195];
                var4 = -1;
            } else if (var10 < 13) {
                field750[var3++] = field751[var10];
            } else {
                var4 = var10;
            }
            int var11 = var9 & 0xF;
            if (var4 != -1) {
                field750[var3++] = field751[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field750[var3++] = field751[var11];
            } else {
                var4 = var11;
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < var3; var7++) {
            char var8 = field750[var7];
            if (var6 && var8 >= 'a' && var8 <= 'z') {
                field750[var7] = (char) (field750[var7] - 32);
                var6 = false;
            }
            if (var8 == '.' || var8 == '!') {
                var6 = true;
            }
        }
        return new String(field750, 0, var3);
    }

    @OriginalMember(owner = "wb", name = "a", descriptor = "(Ljava/lang/String;BLkb;)V")
    public static void method259(String arg0, byte arg1, Packet arg2) {
        if (arg0.length() > 80) {
            arg0 = arg0.substring(0, 80);
        }
        String var3 = arg0.toLowerCase();
        if (arg1 != -82) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = -1;
        for (int var6 = 0; var6 < var3.length(); var6++) {
            char var7 = var3.charAt(var6);
            int var8 = 0;
            for (int var9 = 0; var9 < field751.length; var9++) {
                if (field751[var9] == var7) {
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
                    arg2.method199(var8);
                }
            } else if (var8 < 13) {
                arg2.method199((var5 << 4) + var8);
                var5 = -1;
            } else {
                arg2.method199((var5 << 4) + (var8 >> 4));
                var5 = var8 & 0xF;
            }
        }
        if (var5 != -1) {
            arg2.method199(var5 << 4);
        }
    }
}
