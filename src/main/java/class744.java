import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class744 {

    @OriginalMember(owner = "client!pca", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10824 = new String[] { method5426(method5425("sD@\u0017z+")), method5426(method5425("sD@\u0017y+")), method5426(method5425("sD@\u0017x+")) };

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "Z")
    public static boolean field10820 = false;

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "I")
    public static int field10822;

    @OriginalMember(owner = "client!pca", name = "c", descriptor = "I")
    public static int field10823;

    @OriginalMember(owner = "client!pca", name = "d", descriptor = "[Lfs;")
    public static class581[] field10821;

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(III)Z")
    public static final boolean method5422(int arg0, int arg1, int arg2) {
        try {
            if (arg0 >= -6) {
                field10821 = null;
            }
            field10822++;
            return class414.method3211(false, arg1, arg2) & class66.method529(-1, arg2, arg1);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10824[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(II)V")
    public static final void method5423(int arg0, int arg1) {
        try {
            field10823++;
            class753 var2 = (class753) class195.field2615.method977((long) arg1, 1);
            if (arg0 == 63 && var2 != null) {
                var2.field10955.method927(100);
                class387.method3086(var2.field10963, var2.field10964, -83);
                var2.method1824(1);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10824[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(I)V")
    public static void method5424(int arg0) {
        try {
            if (arg0 < 122) {
                field10820 = false;
            }
            field10821 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10824[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5425(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5426(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 3;
                    break;
                case 1:
                    var10005 = 39;
                    break;
                case 2:
                    var10005 = 33;
                    break;
                case 3:
                    var10005 = 57;
                    break;
                default:
                    var10005 = 59;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
