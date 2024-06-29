import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class438 {

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "I")
    public static int field6018 = 2;

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "Lhd;")
    public static class595 field6017 = new class595();

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "I")
    public static int field6014;

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "I")
    public static int field6015;

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "I")
    public static int field6019;

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field6016;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 3)
    public static final String method2626(int arg0, String arg1) {
        field6014++;
        StringBuffer var2 = new StringBuffer();
        int var3 = arg1.length();
        if (arg0 != -58) {
            field6016 = null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 == '%' && (var4 + 2) < var3) {
                char var6 = arg1.charAt(var4 + 1);
                boolean var7 = false;
                int var8;
                if (var6 >= '0' && var6 <= '9') {
                    var8 = var6 - 48;
                } else if (var6 >= 'a' && var6 <= 'f') {
                    var8 = var6 - 87;
                } else {
                    if (var6 < 'A' || var6 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var8 = var6 + 10 - 65;
                }
                int var9 = var8 * 16;
                char var10 = arg1.charAt(var4 + 2);
                int var11;
                if (var10 >= '0' && var10 <= '9') {
                    var11 = var10 + var9 - 48;
                } else if (var10 >= 'a' && var10 <= 'f') {
                    var11 = var10 + var9 - 87;
                } else {
                    if (var10 < 'A' || var10 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var11 = var10 + var9 + 10 - 65;
                }
                if (var11 != 0 && class193.method1278(-1, (byte) var11)) {
                    var2.append(class503.method3005(true, (byte) var11));
                }
                var4 += 2;
            } else if (var5 == '+') {
                var2.append(' ');
            } else {
                var2.append(var5);
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)V", line = 79)
    public static void method2627(int arg0) {
        field6016 = null;
        field6017 = null;
        if (arg0 >= -100) {
            field6017 = null;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIB)I", line = 103)
    public static final int method2628(int arg0, int arg1, int arg2, byte arg3) {
        field6015++;
        if (class52.field741 == null) {
            return 0;
        }
        int var4 = arg0 >> 9;
        int var5 = arg2 >> 9;
        if (var4 < 0 || var5 < 0 || var4 > (class514.field7179 - 1) || var5 > class456.field6281 - 1) {
            return 0;
        }
        int var6 = arg1;
        if (arg1 < 3 && (class429.field5916[1][var4][var5] & 0x2) != 0) {
            var6 = arg1 + 1;
        }
        int var7 = 119 % ((30 - arg3) / 55);
        return class52.field741[var6].method1960(arg0, arg2, 119);
    }
}
