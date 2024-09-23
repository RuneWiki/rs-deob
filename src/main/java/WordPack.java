import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("wb")
public class WordPack {

    @OriginalMember(owner = "wb", name = "b", descriptor = "[C")
    public static char[] field728 = new char[100];

    @OriginalMember(owner = "wb", name = "c", descriptor = "[C")
    private static char[] field729 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "wb", name = "a", descriptor = "Z")
    private static boolean field727;

    @OriginalMember(owner = "wb", name = "a", descriptor = "(IILkb;)Ljava/lang/String;")
    public static String method249(int arg0, int arg1, Packet arg2) {
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg1; var5++) {
            int var9 = arg2.method201();
            int var10 = var9 >> 4 & 0xF;
            if (var4 != -1) {
                field728[var3++] = field729[(var4 << 4) + var10 - 195];
                var4 = -1;
            } else if (var10 < 13) {
                field728[var3++] = field729[var10];
            } else {
                var4 = var10;
            }
            int var11 = var9 & 0xF;
            if (var4 != -1) {
                field728[var3++] = field729[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field728[var3++] = field729[var11];
            } else {
                var4 = var11;
            }
        }
        boolean var6 = true;
        if (arg0 != -17950) {
            throw new NullPointerException();
        }
        for (int var7 = 0; var7 < var3; var7++) {
            char var8 = field728[var7];
            if (var6 && var8 >= 'a' && var8 <= 'z') {
                field728[var7] = (char) (field728[var7] - 32);
                var6 = false;
            }
            if (var8 == '.' || var8 == '!') {
                var6 = true;
            }
        }
        return new String(field728, 0, var3);
    }

    @OriginalMember(owner = "wb", name = "a", descriptor = "(Ljava/lang/String;ZLkb;)V")
    public static void method250(String arg0, boolean arg1, Packet arg2) {
        if (arg0.length() > 80) {
            arg0 = arg0.substring(0, 80);
        }
        String var3 = arg0.toLowerCase();
        if (!arg1) {
            field727 = !field727;
        }
        int var4 = -1;
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field729.length; var8++) {
                if (field729[var8] == var6) {
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
                    arg2.method193(var7);
                }
            } else if (var7 < 13) {
                arg2.method193((var4 << 4) + var7);
                var4 = -1;
            } else {
                arg2.method193((var4 << 4) + (var7 >> 4));
                var4 = var7 & 0xF;
            }
        }
        if (var4 != -1) {
            arg2.method193(var4 << 4);
        }
    }
}
