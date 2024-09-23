import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("KFRNHLYS")
public class class28 {

    @OriginalMember(owner = "KFRNHLYS", name = "b", descriptor = "Z")
    private static boolean field1021 = true;

    @OriginalMember(owner = "KFRNHLYS", name = "c", descriptor = "I")
    private static int field1022 = 162;

    @OriginalMember(owner = "KFRNHLYS", name = "d", descriptor = "[C")
    public static char[] field1023 = new char[100];

    @OriginalMember(owner = "KFRNHLYS", name = "e", descriptor = "LKHOMSBHW;")
    private static class30 field1024 = new class30(new byte[100], -982);

    @OriginalMember(owner = "KFRNHLYS", name = "f", descriptor = "[C")
    private static char[] field1025 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "KFRNHLYS", name = "a", descriptor = "Z")
    private static boolean field1020;

    @OriginalMember(owner = "KFRNHLYS", name = "a", descriptor = "(ILKHOMSBHW;I)Ljava/lang/String;")
    public static String method334(int arg0, class30 arg1, int arg2) {
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg2; var5++) {
            int var9 = arg1.method349();
            int var10 = var9 >> 4 & 0xF;
            if (var4 != -1) {
                field1023[var3++] = field1025[(var4 << 4) + var10 - 195];
                var4 = -1;
            } else if (var10 < 13) {
                field1023[var3++] = field1025[var10];
            } else {
                var4 = var10;
            }
            int var11 = var9 & 0xF;
            if (var4 != -1) {
                field1023[var3++] = field1025[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field1023[var3++] = field1025[var11];
            } else {
                var4 = var11;
            }
        }
        if (arg0 != -25339) {
            field1022 = 296;
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < var3; var7++) {
            char var8 = field1023[var7];
            if (var6 && var8 >= 'a' && var8 <= 'z') {
                field1023[var7] = (char) (field1023[var7] - 32);
                var6 = false;
            }
            if (var8 == '.' || var8 == '!' || var8 == '?') {
                var6 = true;
            }
        }
        return new String(field1023, 0, var3);
    }

    @OriginalMember(owner = "KFRNHLYS", name = "a", descriptor = "(Ljava/lang/String;LKHOMSBHW;Z)V")
    public static void method335(String arg0, class30 arg1, boolean arg2) {
        if (arg0.length() > 80) {
            arg0 = arg0.substring(0, 80);
        }
        String var3 = arg0.toLowerCase();
        int var4 = -1;
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field1025.length; var8++) {
                if (field1025[var8] == var6) {
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
                    arg1.method339(var7);
                }
            } else if (var7 < 13) {
                arg1.method339((var4 << 4) + var7);
                var4 = -1;
            } else {
                arg1.method339((var4 << 4) + (var7 >> 4));
                var4 = var7 & 0xF;
            }
        }
        if (!arg2 && var4 != -1) {
            arg1.method339(var4 << 4);
        }
    }

    @OriginalMember(owner = "KFRNHLYS", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static String method336(boolean arg0, String arg1) {
        field1024.field1065 = 0;
        if (!arg0) {
            throw new NullPointerException();
        }
        method335(arg1, field1024, field1020);
        int var2 = field1024.field1065;
        field1024.field1065 = 0;
        return method334(-25339, field1024, var2);
    }
}
