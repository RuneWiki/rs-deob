import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class266 {

    @OriginalMember(owner = "client!se", name = "b", descriptor = "Lke;")
    public static class622 field3754 = new class622(103, -1);

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "Loja;")
    public static class475 field3756;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIBII)V", line = 5)
    public static final void method1749(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field3753++;
        if (arg2 != -67) {
            field3754 = null;
        }
        if (arg4 != 8 && arg4 != 16) {
            class379 var5 = class378.field5427[arg0][arg3][arg1];
            if (var5 != null) {
                if (arg4 == 1) {
                    var5.field5436 = 0;
                } else if (arg4 == 2) {
                    var5.field5445 = 0;
                }
            }
            class424.method2528(true);
            return;
        }
        for (int var6 = 0; var6 < class445.field6329; var6++) {
            class302 var7 = class359.field5221[var6];
            if (var7.field4536 == arg4 && var7.field4539 == arg3 && var7.field4534 == arg1 || var7.field4528 == arg3 && var7.field4534 == arg1) {
                if (class445.field6329 != var6) {
                    class42.method291(class359.field5221, var6 + 1, class359.field5221, var6, class359.field5221.length - var6 - 1);
                }
                class445.field6329--;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 61)
    public static final String method1750(int arg0, String arg1) {
        field3755++;
        StringBuffer var2 = new StringBuffer();
        if (arg0 != -30703) {
            field3754 = null;
        }
        int var3 = arg1.length();
        for (int var4 = 0; var4 < var3; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 == '%' && var4 + 2 < var3) {
                char var6 = arg1.charAt(var4 + 1);
                boolean var7 = false;
                int var8;
                if (var6 >= '0' && var6 <= '9') {
                    var8 = var6 - 48;
                } else if (var6 >= 'a' && var6 <= 'f') {
                    var8 = var6 + 10 - 97;
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
                    var11 = var10 + var9 + '\n' - 97;
                } else {
                    if (var10 < 'A' || var10 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var11 = var10 + var9 - 55;
                }
                if (var11 != 0 && class202.method1451((byte) var11, 108)) {
                    var2.append(class262.method1721((byte) var11, -116));
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

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V", line = 143)
    public static void method1751(boolean arg0) {
        field3756 = null;
        field3754 = null;
        if (!arg0) {
            method1751(false);
        }
    }
}
