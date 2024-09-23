import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("zb")
public class WordPack {

    @OriginalMember(owner = "zb", name = "a", descriptor = "[C")
    public static char[] field872 = new char[100];

    @OriginalMember(owner = "zb", name = "b", descriptor = "[C")
    private static char[] field873 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "zb", name = "a", descriptor = "(ILlb;B)Ljava/lang/String;")
    public static String method302(int arg0, Packet arg1, byte arg2) {
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg0; var5++) {
            int var10 = arg1.method224();
            int var11 = var10 >> 4 & 0xF;
            if (var4 != -1) {
                field872[var3++] = field873[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field872[var3++] = field873[var11];
            } else {
                var4 = var11;
            }
            int var12 = var10 & 0xF;
            if (var4 != -1) {
                field872[var3++] = field873[(var4 << 4) + var12 - 195];
                var4 = -1;
            } else if (var12 < 13) {
                field872[var3++] = field873[var12];
            } else {
                var4 = var12;
            }
        }
        if (arg2 != 6) {
            throw new NullPointerException();
        }
        boolean var6 = false;
        boolean var7 = true;
        for (int var8 = 0; var8 < var3; var8++) {
            char var9 = field872[var8];
            if (var7 && var9 >= 'a' && var9 <= 'z') {
                field872[var8] = (char) (field872[var8] - 32);
                var7 = false;
            }
            if (var9 == '.' || var9 == '!') {
                var7 = true;
            }
        }
        return new String(field872, 0, var3);
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(ILlb;Ljava/lang/String;)V")
    public static void method303(int arg0, Packet arg1, String arg2) {
        if (arg2.length() > 80) {
            arg2 = arg2.substring(0, 80);
        }
        String var3 = arg2.toLowerCase();
        if (arg0 <= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = -1;
        for (int var6 = 0; var6 < var3.length(); var6++) {
            char var7 = var3.charAt(var6);
            int var8 = 0;
            for (int var9 = 0; var9 < field873.length; var9++) {
                if (field873[var9] == var7) {
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
                    arg1.method214(var8);
                }
            } else if (var8 < 13) {
                arg1.method214((var5 << 4) + var8);
                var5 = -1;
            } else {
                arg1.method214((var5 << 4) + (var8 >> 4));
                var5 = var8 & 0xF;
            }
        }
        if (var5 != -1) {
            arg1.method214(var5 << 4);
        }
    }
}
