import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class155 {

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public int field2157;

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2159 = new String[] { method1405(method1404("93a\u001d<")), method1405(method1404("93a({\u001d/=5z)s")), method1405(method1404("93a`} 2;b<")) };

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "[J")
    public static long[] field2158 = new long[10];

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "Lko;")
    public static class532 field2156 = new class532("", 16);

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
    public static void method1403(byte arg0) {
        try {
            if (arg0 > -85) {
                field2158 = null;
            }
            field2156 = null;
            field2158 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2159[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wh", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        try {
            field2155++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2159[1] + ')');
        }
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(II)V")
    public class155(int arg0, int arg1) {
        try {
            this.field2157 = arg1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2159[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1404(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x14);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1405(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 78;
                    break;
                case 1:
                    var10005 = 91;
                    break;
                case 2:
                    var10005 = 79;
                    break;
                case 3:
                    var10005 = 92;
                    break;
                default:
                    var10005 = 20;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
