import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class358 {

    @OriginalMember(owner = "client!kda", name = "c", descriptor = "Z")
    public static boolean field5341 = false;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!kda", name = "d", descriptor = "I")
    public static int field5342;

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "Lmba;")
    public static class388 field5340;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)V")
    public static final void method2292(int arg0) {
        if (arg0 >= -98) {
            method2294((byte) 117, null);
        }
        field5342++;
        class473.field6710 = 0;
        class103.field1836 = 0;
        class195.field3062 = 0;
        class372.field5521 = 0;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(B)V")
    public static void method2293(byte arg0) {
        if (arg0 <= 98) {
            field5340 = null;
        }
        field5340 = null;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method2294(byte arg0, String arg1) {
        field5339++;
        StringBuffer var2 = new StringBuffer();
        if (arg0 > -106) {
            method2294((byte) -38, null);
        }
        int var3 = arg1.length();
        for (int var4 = 0; var4 < var3; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 == '%' && var3 > (var4 + 2)) {
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
                    var8 = var6 + '\n' - 65;
                }
                char var9 = arg1.charAt(var4 + 2);
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
                    var11 = var10 + 10 - (65 - var9);
                }
                if (var11 != 0 && class305.method1998(-14094, (byte) var11)) {
                    var2.append(class370.method2344(-7588, (byte) var11));
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
}
