import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class174 {

    @OriginalMember(owner = "client!c", name = "d", descriptor = "Lln;")
    public class351 field2679 = new class351();

    @OriginalMember(owner = "client!c", name = "h", descriptor = "Z")
    public boolean field2683 = false;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "[I")
    public static int[] field2678 = new int[4];

    @OriginalMember(owner = "client!c", name = "e", descriptor = "Lmga;")
    public static class666 field2680 = new class666(5);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public int field2682;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public int field2684;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V", line = 3)
    public static void method1175(int arg0) {
        if (arg0 >= 121) {
            field2678 = null;
            field2680 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 14)
    public static final String method1176(String arg0, int arg1) {
        field2676++;
        StringBuffer var2 = new StringBuffer();
        int var3 = arg0.length();
        if (arg1 != -1) {
            method1176(null, -81);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 == '%' && var3 > (var4 + 2)) {
                char var6 = arg0.charAt(var4 + 1);
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
                    var8 = var6 + '\n' - 65;
                }
                char var9 = arg0.charAt(var4 + 2);
                int var10 = var8 * 16;
                int var11;
                if (var9 >= '0' && var9 <= '9') {
                    var11 = var9 + var10 - 48;
                } else if (var9 >= 'a' && var9 <= 'f') {
                    var11 = var9 + var10 + '\n' - 97;
                } else {
                    if (var9 < 'A' || var9 > 'F') {
                        var2.append('%');
                        continue;
                    }
                    var11 = var9 + var10 - 55;
                }
                if (var11 != 0 && class200.method1299((byte) var11, arg1 ^ 0x80)) {
                    var2.append(class697.method3859((byte) var11, false));
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

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V", line = 93)
    public static final void method1177(int arg0) {
        field2677++;
        class382 var1 = class396.method2276(arg0 ^ 0xFFFFFFA0, 15, 0);
        var1.method2228((byte) -55);
        if (arg0 != 10) {
            field2678 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IBI)V", line = 109)
    public static final void method1178(int arg0, byte arg1, int arg2) {
        field2681++;
        class382 var3 = class396.method2276(-69, 14, arg2);
        var3.method2232(arg1 ^ 0x6D);
        if (arg1 == -108) {
            var3.field5099 = arg0;
        }
    }
}
