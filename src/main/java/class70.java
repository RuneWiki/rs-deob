import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ZIBXIXQC")
public class class70 {

    @OriginalMember(owner = "client!ZIBXIXQC", name = "c", descriptor = "[C")
    public static char[] field1716 = new char[100];

    @OriginalMember(owner = "client!ZIBXIXQC", name = "d", descriptor = "LNQUAUMDT;")
    private static class36 field1717 = new class36(-587, new byte[100]);

    @OriginalMember(owner = "client!ZIBXIXQC", name = "e", descriptor = "[C")
    private static char[] field1718 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "client!ZIBXIXQC", name = "a", descriptor = "Z")
    private static boolean field1714;

    @OriginalMember(owner = "client!ZIBXIXQC", name = "b", descriptor = "Z")
    private static boolean field1715;

    @OriginalMember(owner = "client!ZIBXIXQC", name = "a", descriptor = "(IZLNQUAUMDT;)Ljava/lang/String;")
    public static String method580(int arg0, boolean arg1, class36 arg2) {
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg0; var5++) {
            int var9 = arg2.method339();
            int var10 = var9 >> 4 & 0xF;
            if (var4 != -1) {
                field1716[var3++] = field1718[(var4 << 4) + var10 - 195];
                var4 = -1;
            } else if (var10 < 13) {
                field1716[var3++] = field1718[var10];
            } else {
                var4 = var10;
            }
            int var11 = var9 & 0xF;
            if (var4 != -1) {
                field1716[var3++] = field1718[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field1716[var3++] = field1718[var11];
            } else {
                var4 = var11;
            }
        }
        if (arg1) {
            throw new NullPointerException();
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < var3; var7++) {
            char var8 = field1716[var7];
            if (var6 && var8 >= 'a' && var8 <= 'z') {
                field1716[var7] = (char) (field1716[var7] - 32);
                var6 = false;
            }
            if (var8 == '.' || var8 == '!' || var8 == '?') {
                var6 = true;
            }
        }
        return new String(field1716, 0, var3);
    }

    @OriginalMember(owner = "client!ZIBXIXQC", name = "a", descriptor = "(Ljava/lang/String;LNQUAUMDT;I)V")
    public static void method581(String arg0, class36 arg1, int arg2) {
        if (arg0.length() > 80) {
            arg0 = arg0.substring(0, 80);
        }
        String var3 = arg0.toLowerCase();
        int var4 = -1;
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field1718.length; var8++) {
                if (field1718[var8] == var6) {
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
                    arg1.method329(var7);
                }
            } else if (var7 < 13) {
                arg1.method329((var4 << 4) + var7);
                var4 = -1;
            } else {
                arg1.method329((var4 << 4) + (var7 >> 4));
                var4 = var7 & 0xF;
            }
        }
        while (arg2 >= 0) {
            field1714 = !field1714;
        }
        if (var4 != -1) {
            arg1.method329(var4 << 4);
        }
    }

    @OriginalMember(owner = "client!ZIBXIXQC", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static String method582(byte arg0, String arg1) {
        field1717.field1072 = 0;
        method581(arg1, field1717, -113);
        int var2 = field1717.field1072;
        if (arg0 != 21) {
            field1715 = !field1715;
        }
        field1717.field1072 = 0;
        return method580(var2, false, field1717);
    }
}
