import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!HPMMYBXT")
public class class26 {

    @OriginalMember(owner = "client!HPMMYBXT", name = "b", descriptor = "I")
    private static int field970 = 313;

    @OriginalMember(owner = "client!HPMMYBXT", name = "c", descriptor = "I")
    private static int field971 = -391;

    @OriginalMember(owner = "client!HPMMYBXT", name = "d", descriptor = "[C")
    public static char[] field972 = new char[100];

    @OriginalMember(owner = "client!HPMMYBXT", name = "e", descriptor = "LEYMNCFMK;")
    private static class18 field973 = new class18(new byte[100], 0);

    @OriginalMember(owner = "client!HPMMYBXT", name = "f", descriptor = "[C")
    private static char[] field974 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "client!HPMMYBXT", name = "a", descriptor = "Z")
    private static boolean field969;

    @OriginalMember(owner = "client!HPMMYBXT", name = "a", descriptor = "(ILEYMNCFMK;I)Ljava/lang/String;")
    public static String method353(int arg0, class18 arg1, int arg2) {
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg2; var5++) {
            int var9 = arg1.method239();
            int var10 = var9 >> 4 & 0xF;
            if (var4 != -1) {
                field972[var3++] = field974[(var4 << 4) + var10 - 195];
                var4 = -1;
            } else if (var10 < 13) {
                field972[var3++] = field974[var10];
            } else {
                var4 = var10;
            }
            int var11 = var9 & 0xF;
            if (var4 != -1) {
                field972[var3++] = field974[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field972[var3++] = field974[var11];
            } else {
                var4 = var11;
            }
        }
        boolean var6 = true;
        if (arg0 <= 0) {
            field971 = 460;
        }
        for (int var7 = 0; var7 < var3; var7++) {
            char var8 = field972[var7];
            if (var6 && var8 >= 'a' && var8 <= 'z') {
                field972[var7] = (char) (field972[var7] - 32);
                var6 = false;
            }
            if (var8 == '.' || var8 == '!' || var8 == '?') {
                var6 = true;
            }
        }
        return new String(field972, 0, var3);
    }

    @OriginalMember(owner = "client!HPMMYBXT", name = "a", descriptor = "(ILEYMNCFMK;Ljava/lang/String;)V")
    public static void method354(int arg0, class18 arg1, String arg2) {
        if (arg2.length() > 80) {
            arg2 = arg2.substring(0, 80);
        }
        String var3 = arg2.toLowerCase();
        if (arg0 != 0) {
            field969 = !field969;
        }
        int var4 = -1;
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field974.length; var8++) {
                if (field974[var8] == var6) {
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
                    arg1.method229(var7);
                }
            } else if (var7 < 13) {
                arg1.method229((var4 << 4) + var7);
                var4 = -1;
            } else {
                arg1.method229((var4 << 4) + (var7 >> 4));
                var4 = var7 & 0xF;
            }
        }
        if (var4 != -1) {
            arg1.method229(var4 << 4);
        }
    }

    @OriginalMember(owner = "client!HPMMYBXT", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static String method355(boolean arg0, String arg1) {
        field973.field794 = 0;
        if (arg0) {
            throw new NullPointerException();
        }
        method354(0, field973, arg1);
        int var2 = field973.field794;
        field973.field794 = 0;
        return method353(field970, field973, var2);
    }
}
