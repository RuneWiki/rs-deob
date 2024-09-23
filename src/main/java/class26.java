import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GTOTZKQF")
public class class26 {

    @OriginalMember(owner = "GTOTZKQF", name = "c", descriptor = "[C")
    public static char[] field835 = new char[100];

    @OriginalMember(owner = "GTOTZKQF", name = "a", descriptor = "I")
    private static int field833;

    @OriginalMember(owner = "GTOTZKQF", name = "d", descriptor = "LLDILQFVA;")
    private static class34 field836 = new class34(new byte[100], field833);

    @OriginalMember(owner = "GTOTZKQF", name = "e", descriptor = "[C")
    private static char[] field837 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "GTOTZKQF", name = "b", descriptor = "Z")
    private static boolean field834;

    @OriginalMember(owner = "GTOTZKQF", name = "a", descriptor = "(ILLDILQFVA;B)Ljava/lang/String;")
    public static String method315(int arg0, class34 arg1, byte arg2) {
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg0; var5++) {
            int var10 = arg1.method402();
            int var11 = var10 >> 4 & 0xF;
            if (var4 != -1) {
                field835[var3++] = field837[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field835[var3++] = field837[var11];
            } else {
                var4 = var11;
            }
            int var12 = var10 & 0xF;
            if (var4 != -1) {
                field835[var3++] = field837[(var4 << 4) + var12 - 195];
                var4 = -1;
            } else if (var12 < 13) {
                field835[var3++] = field837[var12];
            } else {
                var4 = var12;
            }
        }
        boolean var6 = true;
        if (arg2 != 8) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        for (int var8 = 0; var8 < var3; var8++) {
            char var9 = field835[var8];
            if (var6 && var9 >= 'a' && var9 <= 'z') {
                field835[var8] = (char) (field835[var8] - 32);
                var6 = false;
            }
            if (var9 == '.' || var9 == '!' || var9 == '?') {
                var6 = true;
            }
        }
        return new String(field835, 0, var3);
    }

    @OriginalMember(owner = "GTOTZKQF", name = "a", descriptor = "(ZLLDILQFVA;Ljava/lang/String;)V")
    public static void method316(boolean arg0, class34 arg1, String arg2) {
        if (arg2.length() > 80) {
            arg2 = arg2.substring(0, 80);
        }
        String var3 = arg2.toLowerCase();
        int var4 = -1;
        if (arg0) {
            return;
        }
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field837.length; var8++) {
                if (field837[var8] == var6) {
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
                    arg1.method392(var7);
                }
            } else if (var7 < 13) {
                arg1.method392((var4 << 4) + var7);
                var4 = -1;
            } else {
                arg1.method392((var4 << 4) + (var7 >> 4));
                var4 = var7 & 0xF;
            }
        }
        if (var4 != -1) {
            arg1.method392(var4 << 4);
        }
    }

    @OriginalMember(owner = "GTOTZKQF", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static String method317(String arg0, byte arg1) {
        field836.field1073 = 0;
        method316(false, field836, arg0);
        if (arg1 != 73) {
            field834 = !field834;
        }
        int var2 = field836.field1073;
        field836.field1073 = 0;
        return method315(var2, field836, (byte) 8);
    }
}
