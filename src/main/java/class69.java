import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YOLZIXCN")
public class class69 {

    @OriginalMember(owner = "client!YOLZIXCN", name = "a", descriptor = "Z")
    private static boolean field1728 = true;

    @OriginalMember(owner = "client!YOLZIXCN", name = "b", descriptor = "I")
    private static int field1729 = 21302;

    @OriginalMember(owner = "client!YOLZIXCN", name = "c", descriptor = "[C")
    public static char[] field1730 = new char[100];

    @OriginalMember(owner = "client!YOLZIXCN", name = "d", descriptor = "LMNKDCXXG;")
    private static class37 field1731 = new class37(new byte[100], -670);

    @OriginalMember(owner = "client!YOLZIXCN", name = "e", descriptor = "[C")
    private static char[] field1732 = new char[] { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', '\'', '@', '#', '+', '=', '£', '$', '%', '"', '[', ']' };

    @OriginalMember(owner = "client!YOLZIXCN", name = "a", descriptor = "(IZLMNKDCXXG;)Ljava/lang/String;")
    public static String method600(int arg0, boolean arg1, class37 arg2) {
        int var3 = 0;
        int var4 = -1;
        for (int var5 = 0; var5 < arg0; var5++) {
            int var9 = arg2.method386();
            int var10 = var9 >> 4 & 0xF;
            if (var4 != -1) {
                field1730[var3++] = field1732[(var4 << 4) + var10 - 195];
                var4 = -1;
            } else if (var10 < 13) {
                field1730[var3++] = field1732[var10];
            } else {
                var4 = var10;
            }
            int var11 = var9 & 0xF;
            if (var4 != -1) {
                field1730[var3++] = field1732[(var4 << 4) + var11 - 195];
                var4 = -1;
            } else if (var11 < 13) {
                field1730[var3++] = field1732[var11];
            } else {
                var4 = var11;
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < var3; var7++) {
            char var8 = field1730[var7];
            if (var6 && var8 >= 'a' && var8 <= 'z') {
                field1730[var7] = (char) (field1730[var7] - 32);
                var6 = false;
            }
            if (var8 == '.' || var8 == '!' || var8 == '?') {
                var6 = true;
            }
        }
        if (!arg1) {
            field1728 = !field1728;
        }
        return new String(field1730, 0, var3);
    }

    @OriginalMember(owner = "client!YOLZIXCN", name = "a", descriptor = "(Ljava/lang/String;BLMNKDCXXG;)V")
    public static void method601(String arg0, byte arg1, class37 arg2) {
        if (arg0.length() > 80) {
            arg0 = arg0.substring(0, 80);
        }
        String var3 = arg0.toLowerCase();
        int var4 = -1;
        if (arg1 != -29) {
            field1728 = !field1728;
        }
        for (int var5 = 0; var5 < var3.length(); var5++) {
            char var6 = var3.charAt(var5);
            int var7 = 0;
            for (int var8 = 0; var8 < field1732.length; var8++) {
                if (field1732[var8] == var6) {
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
                    arg2.method376(var7);
                }
            } else if (var7 < 13) {
                arg2.method376((var4 << 4) + var7);
                var4 = -1;
            } else {
                arg2.method376((var4 << 4) + (var7 >> 4));
                var4 = var7 & 0xF;
            }
        }
        if (var4 != -1) {
            arg2.method376(var4 << 4);
        }
    }

    @OriginalMember(owner = "client!YOLZIXCN", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static String method602(int arg0, String arg1) {
        field1731.field1212 = 0;
        method601(arg1, (byte) -29, field1731);
        int var2 = field1731.field1212;
        if (field1729 != arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        field1731.field1212 = 0;
        return method600(var2, true, field1731);
    }
}
