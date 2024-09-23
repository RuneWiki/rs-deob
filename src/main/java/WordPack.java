import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("wb")
public class WordPack {

    @OriginalMember(owner = "wb", name = "b", descriptor = "[C")
    public static char[] field748 = new char[100];

    @OriginalMember(owner = "wb", name = "c", descriptor = "[C")
    private static char[] field749 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "wb", name = "a", descriptor = "I")
    private static int field747;

    @OriginalMember(owner = "wb", name = "a", descriptor = "(Lkb;BI)Ljava/lang/String;")
    public static String method265(Packet arg0, byte arg1, int arg2) {
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg2; var5++) {
            int var10 = arg0.method216();
            int var11 = var10 >> 4 & 0xF;
            if (var4 != -1) {
                field748[var3++] = field749[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field748[var3++] = field749[var11];
            } else {
                var4 = var11;
            }
            int var12 = var10 & 0xF;
            if (var4 != -1) {
                field748[var3++] = field749[(var4 << 4) + var12 - 195];
                var4 = -1;
            } else if (var12 < 13) {
                field748[var3++] = field749[var12];
            } else {
                var4 = var12;
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < var3; var7++) {
            char var9 = field748[var7];
            if (var6 && var9 >= 'a' && var9 <= 'z') {
                field748[var7] = (char) (field748[var7] - 32);
                var6 = false;
            }
            if (var9 == '.' || var9 == '!') {
                var6 = true;
            }
        }
        if (arg1 == 1) {
            boolean var8 = false;
        } else {
            field747 = -145;
        }
        return new String(field748, 0, var3);
    }

    @OriginalMember(owner = "wb", name = "a", descriptor = "(Lkb;Ljava/lang/String;B)V")
    public static void method266(Packet arg0, String arg1, byte arg2) {
        if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        String var3 = arg1.toLowerCase();
        if (arg2 != 109) {
            return;
        }
        int var4 = -1;
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field749.length; var8++) {
                if (field749[var8] == var6) {
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
        if (var4 != -1) {
            arg0.method206(var4 << 4);
        }
    }
}
