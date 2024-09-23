import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("zb")
public class WordPack {

    @OriginalMember(owner = "zb", name = "a", descriptor = "[C")
    public static char[] field878 = new char[100];

    @OriginalMember(owner = "zb", name = "b", descriptor = "[C")
    private static char[] field879 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "zb", name = "a", descriptor = "(BILlb;)Ljava/lang/String;")
    public static String method302(byte arg0, int arg1, Packet arg2) {
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg1; var5++) {
            int var10 = arg2.method224();
            int var11 = var10 >> 4 & 0xF;
            if (var4 != -1) {
                field878[var3++] = field879[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field878[var3++] = field879[var11];
            } else {
                var4 = var11;
            }
            int var12 = var10 & 0xF;
            if (var4 != -1) {
                field878[var3++] = field879[(var4 << 4) + var12 - 195];
                var4 = -1;
            } else if (var12 < 13) {
                field878[var3++] = field879[var12];
            } else {
                var4 = var12;
            }
        }
        if (arg0 != 8) {
            throw new NullPointerException();
        }
        boolean var6 = false;
        boolean var7 = true;
        for (int var8 = 0; var8 < var3; var8++) {
            char var9 = field878[var8];
            if (var7 && var9 >= 'a' && var9 <= 'z') {
                field878[var8] = (char) (field878[var8] - 32);
                var7 = false;
            }
            if (var9 == '.' || var9 == '!') {
                var7 = true;
            }
        }
        return new String(field878, 0, var3);
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(Ljava/lang/String;BLlb;)V")
    public static void method303(String arg0, byte arg1, Packet arg2) {
        if (arg0.length() > 80) {
            arg0 = arg0.substring(0, 80);
        }
        String var3 = arg0.toLowerCase();
        if (arg1 != 126) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = -1;
        for (int var6 = 0; var6 < var3.length(); var6++) {
            char var7 = var3.charAt(var6);
            int var8 = 0;
            for (int var9 = 0; var9 < field879.length; var9++) {
                if (field879[var9] == var7) {
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
                    arg2.method214(var8);
                }
            } else if (var8 < 13) {
                arg2.method214((var5 << 4) + var8);
                var5 = -1;
            } else {
                arg2.method214((var5 << 4) + (var8 >> 4));
                var5 = var8 & 0xF;
            }
        }
        if (var5 != -1) {
            arg2.method214(var5 << 4);
        }
    }
}
