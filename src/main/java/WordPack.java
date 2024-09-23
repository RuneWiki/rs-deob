import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("zb")
public class WordPack {

    @OriginalMember(owner = "zb", name = "a", descriptor = "I")
    private static int field867 = 1000;

    @OriginalMember(owner = "zb", name = "b", descriptor = "Z")
    private static boolean field868 = true;

    @OriginalMember(owner = "zb", name = "d", descriptor = "[C")
    public static char[] field870 = new char[100];

    @OriginalMember(owner = "zb", name = "e", descriptor = "Llb;")
    private static Packet field871 = new Packet(field867, new byte[100]);

    @OriginalMember(owner = "zb", name = "f", descriptor = "[C")
    private static char[] field872 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "zb", name = "c", descriptor = "I")
    private static int field869;

    @OriginalMember(owner = "zb", name = "a", descriptor = "(BILlb;)Ljava/lang/String;")
    public static String method306(byte arg0, int arg1, Packet arg2) {
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg1; var5++) {
            int var9 = arg2.method229();
            int var10 = var9 >> 4 & 0xF;
            if (var4 != -1) {
                field870[var3++] = field872[(var4 << 4) + var10 - 195];
                var4 = -1;
            } else if (var10 < 13) {
                field870[var3++] = field872[var10];
            } else {
                var4 = var10;
            }
            int var11 = var9 & 0xF;
            if (var4 != -1) {
                field870[var3++] = field872[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field870[var3++] = field872[var11];
            } else {
                var4 = var11;
            }
        }
        boolean var6 = true;
        if (arg0 != -66) {
            throw new NullPointerException();
        }
        for (int var7 = 0; var7 < var3; var7++) {
            char var8 = field870[var7];
            if (var6 && var8 >= 'a' && var8 <= 'z') {
                field870[var7] = (char) (field870[var7] - 32);
                var6 = false;
            }
            if (var8 == '.' || var8 == '!' || var8 == '?') {
                var6 = true;
            }
        }
        return new String(field870, 0, var3);
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(Llb;ZLjava/lang/String;)V")
    public static void method307(Packet arg0, boolean arg1, String arg2) {
        if (arg2.length() > 80) {
            arg2 = arg2.substring(0, 80);
        }
        String var3 = arg2.toLowerCase();
        int var4 = -1;
        if (!arg1) {
            return;
        }
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field872.length; var8++) {
                if (field872[var8] == var6) {
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
                    arg0.method219(var7);
                }
            } else if (var7 < 13) {
                arg0.method219((var4 << 4) + var7);
                var4 = -1;
            } else {
                arg0.method219((var4 << 4) + (var7 >> 4));
                var4 = var7 & 0xF;
            }
        }
        if (var4 != -1) {
            arg0.method219(var4 << 4);
        }
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static String method308(byte arg0, String arg1) {
        field871.field703 = 0;
        if (arg0 == 1) {
            boolean var2 = false;
        } else {
            field869 = 456;
        }
        method307(field871, true, arg1);
        int var3 = field871.field703;
        field871.field703 = 0;
        return method306((byte) -66, var3, field871);
    }
}
