import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public abstract class class331 {

    @OriginalMember(owner = "client!rw", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field4518 = method2608(method2607("d'G\u001a\u0001"));

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "Lmv;")
    public static class125 field4517 = new class125(72, -1);

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "[Lcu;")
    public static class66[] field4516;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(B)V", line = 11)
    public static void method2606(byte arg0) {
        try {
            field4517 = null;
            field4516 = null;
            int var1 = -120 / ((arg0 - 23) / 40);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4518 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(Z)V")
    public abstract void method2602(boolean arg0);

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "(B)V")
    public abstract void method2603(byte arg0);

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(IZ)Z")
    public abstract boolean method2604(int arg0, boolean arg1);

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)Lm;")
    public abstract class781 method2605(int arg0);

    @OriginalMember(owner = "client!rw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2607(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x29);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2608(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 22;
                    break;
                case 1:
                    var10005 = 80;
                    break;
                case 2:
                    var10005 = 105;
                    break;
                case 3:
                    var10005 = 85;
                    break;
                default:
                    var10005 = 41;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
