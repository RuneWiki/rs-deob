import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("zb")
public class WordPack {

    @OriginalMember(owner = "zb", name = "a", descriptor = "B")
    private static byte field883 = 92;

    @OriginalMember(owner = "zb", name = "b", descriptor = "I")
    private static int field884 = 8573;

    @OriginalMember(owner = "zb", name = "c", descriptor = "[C")
    public static char[] field885 = new char[100];

    @OriginalMember(owner = "zb", name = "d", descriptor = "Llb;")
    private static Packet field886 = new Packet(-49365, new byte[100]);

    @OriginalMember(owner = "zb", name = "e", descriptor = "[C")
    private static char[] field887 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "zb", name = "a", descriptor = "(ILlb;I)Ljava/lang/String;")
    public static String method306(int arg0, Packet arg1, int arg2) {
        if (arg2 <= 0) {
            field884 = 482;
        }
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg0; var5++) {
            int var9 = arg1.method229();
            int var10 = var9 >> 4 & 0xF;
            if (var4 != -1) {
                field885[var3++] = field887[(var4 << 4) + var10 - 195];
                var4 = -1;
            } else if (var10 < 13) {
                field885[var3++] = field887[var10];
            } else {
                var4 = var10;
            }
            int var11 = var9 & 0xF;
            if (var4 != -1) {
                field885[var3++] = field887[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field885[var3++] = field887[var11];
            } else {
                var4 = var11;
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < var3; var7++) {
            char var8 = field885[var7];
            if (var6 && var8 >= 'a' && var8 <= 'z') {
                field885[var7] = (char) (field885[var7] - 32);
                var6 = false;
            }
            if (var8 == '.' || var8 == '!' || var8 == '?') {
                var6 = true;
            }
        }
        return new String(field885, 0, var3);
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(Ljava/lang/String;BLlb;)V")
    public static void method307(String arg0, byte arg1, Packet arg2) {
        if (field883 != arg1) {
            return;
        }
        if (arg0.length() > 80) {
            arg0 = arg0.substring(0, 80);
        }
        String var3 = arg0.toLowerCase();
        int var4 = -1;
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field887.length; var8++) {
                if (field887[var8] == var6) {
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
                    arg2.method219(var7);
                }
            } else if (var7 < 13) {
                arg2.method219((var4 << 4) + var7);
                var4 = -1;
            } else {
                arg2.method219((var4 << 4) + (var7 >> 4));
                var4 = var7 & 0xF;
            }
        }
        if (var4 != -1) {
            arg2.method219(var4 << 4);
        }
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method308(int arg0, String arg1) {
        if (arg0 >= 0) {
            field884 = -152;
        }
        field886.field722 = 0;
        method307(arg1, (byte) 92, field886);
        int var2 = field886.field722;
        field886.field722 = 0;
        return method306(var2, field886, 964);
    }
}
