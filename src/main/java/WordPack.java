import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("zb")
public class WordPack {

    @OriginalMember(owner = "zb", name = "c", descriptor = "[C")
    public static char[] field883 = new char[100];

    @OriginalMember(owner = "zb", name = "a", descriptor = "Z")
    private static boolean field881;

    @OriginalMember(owner = "zb", name = "d", descriptor = "Llb;")
    private static Packet field884 = new Packet(new byte[100], field881);

    @OriginalMember(owner = "zb", name = "e", descriptor = "[C")
    private static char[] field885 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "zb", name = "b", descriptor = "Z")
    private static boolean field882;

    @OriginalMember(owner = "zb", name = "a", descriptor = "(Llb;II)Ljava/lang/String;")
    public static String method306(Packet arg0, int arg1, int arg2) {
        int var3 = 0;
        int var4 = -1;
        if (arg2 != 0) {
            throw new NullPointerException();
        }
        for (int var5 = 0; var5 < arg1; var5++) {
            int var9 = arg0.method229();
            int var10 = var9 >> 4 & 0xF;
            if (var4 != -1) {
                field883[var3++] = field885[(var4 << 4) + var10 - 195];
                var4 = -1;
            } else if (var10 < 13) {
                field883[var3++] = field885[var10];
            } else {
                var4 = var10;
            }
            int var11 = var9 & 0xF;
            if (var4 != -1) {
                field883[var3++] = field885[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field883[var3++] = field885[var11];
            } else {
                var4 = var11;
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < var3; var7++) {
            char var8 = field883[var7];
            if (var6 && var8 >= 'a' && var8 <= 'z') {
                field883[var7] = (char) (field883[var7] - 32);
                var6 = false;
            }
            if (var8 == '.' || var8 == '!' || var8 == '?') {
                var6 = true;
            }
        }
        return new String(field883, 0, var3);
    }

    @OriginalMember(owner = "zb", name = "a", descriptor = "(Llb;ILjava/lang/String;)V")
    public static void method307(Packet arg0, int arg1, String arg2) {
        if (arg1 != -41401) {
            field882 = !field882;
        }
        if (arg2.length() > 80) {
            arg2 = arg2.substring(0, 80);
        }
        String var3 = arg2.toLowerCase();
        int var4 = -1;
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field885.length; var8++) {
                if (field885[var8] == var6) {
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

    @OriginalMember(owner = "zb", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method308(int arg0, String arg1) {
        field884.field712 = 0;
        method307(field884, -41401, arg1);
        int var2 = field884.field712;
        field884.field712 = 0;
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        return method306(field884, var2, 0);
    }
}
