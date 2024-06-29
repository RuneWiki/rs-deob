import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YPBNZDGQ")
public class class69 {

    @OriginalMember(owner = "client!YPBNZDGQ", name = "a", descriptor = "[C")
    public static char[] field1702 = new char[100];

    @OriginalMember(owner = "client!YPBNZDGQ", name = "b", descriptor = "LBSNPYLEV;")
    private static class7 field1703 = new class7(new byte[100], (byte) 3);

    @OriginalMember(owner = "client!YPBNZDGQ", name = "c", descriptor = "[C")
    private static char[] field1704 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "client!YPBNZDGQ", name = "a", descriptor = "(ILBSNPYLEV;I)Ljava/lang/String;")
    public static String method590(int arg0, class7 arg1, int arg2) {
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg2; var5++) {
            int var10 = arg1.method47();
            int var11 = var10 >> 4 & 0xF;
            if (var4 != -1) {
                field1702[var3++] = field1704[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field1702[var3++] = field1704[var11];
            } else {
                var4 = var11;
            }
            int var12 = var10 & 0xF;
            if (var4 != -1) {
                field1702[var3++] = field1704[(var4 << 4) + var12 - 195];
                var4 = -1;
            } else if (var12 < 13) {
                field1702[var3++] = field1704[var12];
            } else {
                var4 = var12;
            }
        }
        if (arg0 != 3) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        boolean var7 = true;
        for (int var8 = 0; var8 < var3; var8++) {
            char var9 = field1702[var8];
            if (var7 && var9 >= 'a' && var9 <= 'z') {
                field1702[var8] = (char) (field1702[var8] - 32);
                var7 = false;
            }
            if (var9 == '.' || var9 == '!' || var9 == '?') {
                var7 = true;
            }
        }
        return new String(field1702, 0, var3);
    }

    @OriginalMember(owner = "client!YPBNZDGQ", name = "a", descriptor = "(Ljava/lang/String;LBSNPYLEV;B)V")
    public static void method591(String arg0, class7 arg1, byte arg2) {
        if (arg0.length() > 80) {
            arg0 = arg0.substring(0, 80);
        }
        String var3 = arg0.toLowerCase();
        if (arg2 != -4) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = -1;
        for (int var6 = 0; var6 < var3.length(); var6++) {
            char var7 = var3.charAt(var6);
            int var8 = 0;
            for (int var9 = 0; var9 < field1704.length; var9++) {
                if (field1704[var9] == var7) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 > 12) {
                var8 += 195;
            }
            if (var5 == -1) {
                if (var8 < 13) {
                    var5 = var8;
                } else {
                    arg1.method37(var8);
                }
            } else if (var8 < 13) {
                arg1.method37((var5 << 4) + var8);
                var5 = -1;
            } else {
                arg1.method37((var5 << 4) + (var8 >> 4));
                var5 = var8 & 0xF;
            }
        }
        if (var5 != -1) {
            arg1.method37(var5 << 4);
        }
    }

    @OriginalMember(owner = "client!YPBNZDGQ", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method592(int arg0, String arg1) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        field1703.field91 = 0;
        method591(arg1, field1703, (byte) -4);
        int var2 = field1703.field91;
        field1703.field91 = 0;
        return method590(3, field1703, var2);
    }
}
