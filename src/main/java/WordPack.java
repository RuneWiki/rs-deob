import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("zb")
public class WordPack {

    @OriginalMember(owner = "zb", name = "a", descriptor = "I")
    private static int field878 = 257;

    @OriginalMember(owner = "zb", name = "b", descriptor = "[C")
    public static char[] field879 = new char[100];

    @OriginalMember(owner = "zb", name = "c", descriptor = "Llb;")
    private static Packet field880 = new Packet(new byte[100], 58);

    @OriginalMember(owner = "zb", name = "d", descriptor = "[C")
    private static char[] field881 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "zb", name = "a", descriptor = "(Llb;II)Ljava/lang/String;")
    public static String method306(Packet arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = 0;
        int var5 = -1;
        for (int var6 = 0; var6 < arg1; var6++) {
            int var10 = arg0.method229();
            int var11 = var10 >> 4 & 0xF;
            if (var5 != -1) {
                field879[var4++] = field881[(var5 << 4) + var11 - 195];
                var5 = -1;
            } else if (var11 < 13) {
                field879[var4++] = field881[var11];
            } else {
                var5 = var11;
            }
            int var12 = var10 & 0xF;
            if (var5 != -1) {
                field879[var4++] = field881[(var5 << 4) + var12 - 195];
                var5 = -1;
            } else if (var12 < 13) {
                field879[var4++] = field881[var12];
            } else {
                var5 = var12;
            }
        }
        boolean var7 = true;
        for (int var8 = 0; var8 < var4; var8++) {
            char var9 = field879[var8];
            if (var7 && var9 >= 'a' && var9 <= 'z') {
                field879[var8] = (char) (field879[var8] - 32);
                var7 = false;
            }
            if (var9 == '.' || var9 == '!' || var9 == '?') {
                var7 = true;
            }
        }
        return new String(field879, 0, var4);
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(BLlb;Ljava/lang/String;)V")
    public static void method307(byte arg0, Packet arg1, String arg2) {
        if (arg0 != 7) {
            return;
        }
        if (arg2.length() > 80) {
            arg2 = arg2.substring(0, 80);
        }
        String var3 = arg2.toLowerCase();
        int var4 = -1;
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field881.length; var8++) {
                if (field881[var8] == var6) {
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
                    arg1.method219(var7);
                }
            } else if (var7 < 13) {
                arg1.method219((var4 << 4) + var7);
                var4 = -1;
            } else {
                arg1.method219((var4 << 4) + (var7 >> 4));
                var4 = var7 & 0xF;
            }
        }
        if (var4 != -1) {
            arg1.method219(var4 << 4);
        }
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static String method308(byte arg0, String arg1) {
        field880.field711 = 0;
        method307((byte) 7, field880, arg1);
        int var2 = field880.field711;
        field880.field711 = 0;
        if (arg0 != 59) {
            field878 = 134;
        }
        return method306(field880, var2, 0);
    }
}
