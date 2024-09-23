import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("zb")
public class WordPack {

    @OriginalMember(owner = "zb", name = "a", descriptor = "Z")
    private static boolean field887 = true;

    @OriginalMember(owner = "zb", name = "b", descriptor = "I")
    private static int field888 = -31809;

    @OriginalMember(owner = "zb", name = "c", descriptor = "[C")
    public static char[] field889 = new char[100];

    @OriginalMember(owner = "zb", name = "d", descriptor = "Llb;")
    private static Packet field890 = new Packet(new byte[100], -26728);

    @OriginalMember(owner = "zb", name = "e", descriptor = "[C")
    private static char[] field891 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "zb", name = "a", descriptor = "(ILlb;I)Ljava/lang/String;")
    public static String method306(int arg0, Packet arg1, int arg2) {
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg0; var5++) {
            int var9 = arg1.method229();
            int var10 = var9 >> 4 & 0xF;
            if (var4 != -1) {
                field889[var3++] = field891[(var4 << 4) + var10 - 195];
                var4 = -1;
            } else if (var10 < 13) {
                field889[var3++] = field891[var10];
            } else {
                var4 = var10;
            }
            int var11 = var9 & 0xF;
            if (var4 != -1) {
                field889[var3++] = field891[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field889[var3++] = field891[var11];
            } else {
                var4 = var11;
            }
        }
        if (arg2 < 9 || arg2 > 9) {
            field887 = !field887;
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < var3; var7++) {
            char var8 = field889[var7];
            if (var6 && var8 >= 'a' && var8 <= 'z') {
                field889[var7] = (char) (field889[var7] - 32);
                var6 = false;
            }
            if (var8 == '.' || var8 == '!' || var8 == '?') {
                var6 = true;
            }
        }
        return new String(field889, 0, var3);
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(Llb;Ljava/lang/String;Z)V")
    public static void method307(Packet arg0, String arg1, boolean arg2) {
        if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        String var3 = arg1.toLowerCase();
        int var4 = -1;
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field891.length; var8++) {
                if (field891[var8] == var6) {
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
        if (arg2) {
            field888 = -320;
        }
        if (var4 != -1) {
            arg0.method219(var4 << 4);
        }
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method308(int arg0, String arg1) {
        field890.field717 = 0;
        method307(field890, arg1, false);
        int var2 = field890.field717;
        while (arg0 >= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        field890.field717 = 0;
        return method306(var2, field890, 9);
    }
}
