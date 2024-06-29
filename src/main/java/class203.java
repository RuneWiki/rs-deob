import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class203 implements class105 {

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
    public int field3188;

    @OriginalMember(owner = "client!pq", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3193 = new String[] { method1839(method1838(":\u000b\u0014\u0010\u0019$\u0013N\u0012X")), method1839(method1838(":\u000b\u0014mX")), method1839(method1838("1T\u0014\u0002\r")), method1839(method1838("$\u000fV@")), method1839(method1838(":\u000b\u0014oX")), method1839(method1838(":\u000b\u0014nX")) };

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "Lhl;")
    public static class556 field3187 = new class556(87, 6);

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "[Loia;")
    public static class94[] field3191 = new class94[2048];

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "I")
    public static int field3192 = 0;

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZLgda;)V", line = 6)
    public static final void method1836(boolean arg0, class58 arg1) {
        try {
            class124.field1807 = arg1;
            field3190++;
            if (arg0) {
                method1837(-76);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3193[4] + arg0 + ',' + (arg1 == null ? field3193[3] : field3193[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z)Lwh;", line = 19)
    public final class155 method989(boolean arg0) {
        try {
            field3189++;
            return arg0 ? null : class265.field4302;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3193[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(I)V", line = 34)
    public class203(int arg0) {
        try {
            this.field3188 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3193[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)V", line = 42)
    public static void method1837(int arg0) {
        try {
            field3191 = null;
            field3187 = null;
            if (arg0 <= 43) {
                method1836(false, null);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3193[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1838(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x70);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1839(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 74;
                    break;
                case 1:
                    var10005 = 122;
                    break;
                case 2:
                    var10005 = 58;
                    break;
                case 3:
                    var10005 = 44;
                    break;
                default:
                    var10005 = 112;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
