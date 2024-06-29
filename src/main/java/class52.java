import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!RJLRTDJR")
public class class52 {

    @OriginalMember(owner = "client!RJLRTDJR", name = "a", descriptor = "Z")
    private static boolean field1455 = true;

    @OriginalMember(owner = "client!RJLRTDJR", name = "b", descriptor = "[C")
    public static char[] field1456 = new char[100];

    @OriginalMember(owner = "client!RJLRTDJR", name = "c", descriptor = "LMVHXDWGI;")
    private static class38 field1457 = new class38(0, new byte[100]);

    @OriginalMember(owner = "client!RJLRTDJR", name = "d", descriptor = "[C")
    private static char[] field1458 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "client!RJLRTDJR", name = "a", descriptor = "(IILMVHXDWGI;)Ljava/lang/String;")
    public static String method495(int arg0, int arg1, class38 arg2) {
        while (arg0 >= 0) {
            field1455 = !field1455;
        }
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg1; var5++) {
            int var9 = arg2.method357();
            int var10 = var9 >> 4 & 0xF;
            if (var4 != -1) {
                field1456[var3++] = field1458[(var4 << 4) + var10 - 195];
                var4 = -1;
            } else if (var10 < 13) {
                field1456[var3++] = field1458[var10];
            } else {
                var4 = var10;
            }
            int var11 = var9 & 0xF;
            if (var4 != -1) {
                field1456[var3++] = field1458[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field1456[var3++] = field1458[var11];
            } else {
                var4 = var11;
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < var3; var7++) {
            char var8 = field1456[var7];
            if (var6 && var8 >= 'a' && var8 <= 'z') {
                field1456[var7] = (char) (field1456[var7] - 32);
                var6 = false;
            }
            if (var8 == '.' || var8 == '!' || var8 == '?') {
                var6 = true;
            }
        }
        return new String(field1456, 0, var3);
    }

    @OriginalMember(owner = "client!RJLRTDJR", name = "a", descriptor = "(LMVHXDWGI;Ljava/lang/String;I)V")
    public static void method496(class38 arg0, String arg1, int arg2) {
        if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        String var3 = arg1.toLowerCase();
        int var4 = -1;
        while (arg2 >= 0) {
            field1455 = !field1455;
        }
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field1458.length; var8++) {
                if (field1458[var8] == var6) {
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
                    arg0.method347(var7);
                }
            } else if (var7 < 13) {
                arg0.method347((var4 << 4) + var7);
                var4 = -1;
            } else {
                arg0.method347((var4 << 4) + (var7 >> 4));
                var4 = var7 & 0xF;
            }
        }
        if (var4 != -1) {
            arg0.method347(var4 << 4);
        }
    }

    @OriginalMember(owner = "client!RJLRTDJR", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static String method497(String arg0, byte arg1) {
        field1457.field1161 = 0;
        method496(field1457, arg0, -699);
        int var2 = field1457.field1161;
        field1457.field1161 = 0;
        String var3 = method495(-73, var2, field1457);
        if (arg1 != 8) {
            throw new NullPointerException();
        }
        return var3;
    }
}
