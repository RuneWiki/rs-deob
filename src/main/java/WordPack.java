import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("zb")
public class WordPack {

    @OriginalMember(owner = "zb", name = "b", descriptor = "I")
    private static int field887 = 3109;

    @OriginalMember(owner = "zb", name = "c", descriptor = "I")
    private static int field888 = 9384;

    @OriginalMember(owner = "zb", name = "d", descriptor = "[C")
    public static char[] field889 = new char[100];

    @OriginalMember(owner = "zb", name = "e", descriptor = "Llb;")
    private static Packet field890 = new Packet(new byte[100], (byte) -93);

    @OriginalMember(owner = "zb", name = "f", descriptor = "[C")
    private static char[] field891 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "zb", name = "a", descriptor = "I")
    private static int field886;

    @OriginalMember(owner = "zb", name = "a", descriptor = "(IILlb;)Ljava/lang/String;")
    public static String method306(int arg0, int arg1, Packet arg2) {
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg0; var5++) {
            int var10 = arg2.method229();
            int var11 = var10 >> 4 & 0xF;
            if (var4 != -1) {
                field889[var3++] = field891[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field889[var3++] = field891[var11];
            } else {
                var4 = var11;
            }
            int var12 = var10 & 0xF;
            if (var4 != -1) {
                field889[var3++] = field891[(var4 << 4) + var12 - 195];
                var4 = -1;
            } else if (var12 < 13) {
                field889[var3++] = field891[var12];
            } else {
                var4 = var12;
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < var3; var7++) {
            char var9 = field889[var7];
            if (var6 && var9 >= 'a' && var9 <= 'z') {
                field889[var7] = (char) (field889[var7] - 32);
                var6 = false;
            }
            if (var9 == '.' || var9 == '!' || var9 == '?') {
                var6 = true;
            }
        }
        if (arg1 != 0) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        return new String(field889, 0, var3);
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(Ljava/lang/String;Llb;I)V")
    public static void method307(String arg0, Packet arg1, int arg2) {
        if (arg0.length() > 80) {
            arg0 = arg0.substring(0, 80);
        }
        String var3 = arg0.toLowerCase();
        int var4 = -1;
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var7 = var3.charAt(var5);
            int var8 = 0;
            for (int var9 = 0; var9 < field891.length; var9++) {
                if (field891[var9] == var7) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 > 12) {
                var8 += 195;
            }
            if (var4 == -1) {
                if (var8 < 13) {
                    var4 = var8;
                } else {
                    arg1.method219(var8);
                }
            } else if (var8 < 13) {
                arg1.method219((var4 << 4) + var8);
                var4 = -1;
            } else {
                arg1.method219((var4 << 4) + (var8 >> 4));
                var4 = var8 & 0xF;
            }
        }
        if (arg2 != 3109) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (var4 != -1) {
            arg1.method219(var4 << 4);
        }
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method308(int arg0, String arg1) {
        field890.field713 = 0;
        method307(arg1, field890, field887);
        int var2 = field890.field713;
        if (field888 != arg0) {
            throw new NullPointerException();
        }
        field890.field713 = 0;
        return method306(var2, field886, field890);
    }
}
