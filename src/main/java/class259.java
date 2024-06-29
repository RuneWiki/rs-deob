import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class259 {

    @OriginalMember(owner = "client!dea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4003 = new String[] { method2188(method2187("\u001fU\u0010\u0007QS")), method2188(method2187("5_\u001f\tp\u000b\u0001C\u001c![S\u0019Ha\u001aS\u0005La[\u0000\t")), method2188(method2187("[@\u0003Fe\u0012T\u0014M")), method2188(method2187("\u001fU\u0010\u0007g\u0014c\u0005[z\u0015WY")), method2188(method2187("\u001fU\u0010\u0007RS")) };

    @OriginalMember(owner = "client!dea", name = "c", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!dea", name = "d", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "[I")
    public static int[] field4002;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(IB)C")
    public static final char method2185(int arg0, byte arg1) {
        try {
            field4000++;
            int var2 = arg1 & 0xFF;
            if (arg0 != -161) {
                field4002 = null;
            }
            if (var2 == 0) {
                throw new IllegalArgumentException(field4003[1] + Integer.toString(var2, 16) + field4003[2]);
            }
            if (var2 >= 128 && var2 < 160) {
                char var3 = class118.field1403[var2 - 128];
                if (var3 == '\u0000') {
                    var3 = '?';
                }
                var2 = var3;
            }
            return (char) var2;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field4003[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)V")
    public static void method2186(int arg0) {
        try {
            int var1 = -110 % ((-arg0 - 32) / 40);
            field4002 = null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4003[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dea", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        try {
            field4001++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4003[3] + ')');
        }
    }

    @OriginalMember(owner = "client!dea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2187(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x13);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2188(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 123;
                    break;
                case 1:
                    var10005 = 48;
                    break;
                case 2:
                    var10005 = 113;
                    break;
                case 3:
                    var10005 = 41;
                    break;
                default:
                    var10005 = 19;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
