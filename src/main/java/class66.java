import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XMKPAVXA")
public class class66 {

    @OriginalMember(owner = "XMKPAVXA", name = "a", descriptor = "Z")
    private static boolean field1644 = true;

    @OriginalMember(owner = "XMKPAVXA", name = "b", descriptor = "I")
    private static int field1645 = -90;

    @OriginalMember(owner = "XMKPAVXA", name = "c", descriptor = "[C")
    public static char[] field1646 = new char[100];

    @OriginalMember(owner = "XMKPAVXA", name = "d", descriptor = "LBJPWOXRJ;")
    private static class3 field1647 = new class3(false, new byte[100]);

    @OriginalMember(owner = "XMKPAVXA", name = "e", descriptor = "[C")
    private static char[] field1648 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "XMKPAVXA", name = "a", descriptor = "(LBJPWOXRJ;II)Ljava/lang/String;")
    public static String method542(class3 arg0, int arg1, int arg2) {
        if (arg1 < 7 || arg1 > 7) {
            field1645 = 332;
        }
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg2; var5++) {
            int var9 = arg0.method15();
            int var10 = var9 >> 4 & 0xF;
            if (var4 != -1) {
                field1646[var3++] = field1648[(var4 << 4) + var10 - 195];
                var4 = -1;
            } else if (var10 < 13) {
                field1646[var3++] = field1648[var10];
            } else {
                var4 = var10;
            }
            int var11 = var9 & 0xF;
            if (var4 != -1) {
                field1646[var3++] = field1648[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field1646[var3++] = field1648[var11];
            } else {
                var4 = var11;
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < var3; var7++) {
            char var8 = field1646[var7];
            if (var6 && var8 >= 'a' && var8 <= 'z') {
                field1646[var7] = (char) (field1646[var7] - 32);
                var6 = false;
            }
            if (var8 == '.' || var8 == '!' || var8 == '?') {
                var6 = true;
            }
        }
        return new String(field1646, 0, var3);
    }

    @OriginalMember(owner = "XMKPAVXA", name = "a", descriptor = "(BLBJPWOXRJ;Ljava/lang/String;)V")
    public static void method543(byte arg0, class3 arg1, String arg2) {
        if (arg2.length() > 80) {
            arg2 = arg2.substring(0, 80);
        }
        String var3 = arg2.toLowerCase();
        int var4 = -1;
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field1648.length; var8++) {
                if (field1648[var8] == var6) {
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
                    arg1.method5(var7);
                }
            } else if (var7 < 13) {
                arg1.method5((var4 << 4) + var7);
                var4 = -1;
            } else {
                arg1.method5((var4 << 4) + (var7 >> 4));
                var4 = var7 & 0xF;
            }
        }
        if (arg0 != 1) {
            field1644 = !field1644;
        }
        if (var4 != -1) {
            arg1.method5(var4 << 4);
        }
    }

    @OriginalMember(owner = "XMKPAVXA", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method544(int arg0, String arg1) {
        field1647.field20 = 0;
        method543((byte) 1, field1647, arg1);
        int var2 = field1647.field20;
        field1647.field20 = 0;
        String var3 = method542(field1647, 7, var2);
        if (arg0 != -42231) {
            field1644 = !field1644;
        }
        return var3;
    }
}
