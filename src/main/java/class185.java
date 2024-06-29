import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cka")
public class class185 {

    @OriginalMember(owner = "client!cka", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2560 = new String[] { method1618(method1617("q.8m\u001d:")), method1618(method1617("q.8m\u001e:")) };

    @OriginalMember(owner = "client!cka", name = "c", descriptor = "Lrt;")
    public static class239 field2557 = new class239();

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "[I")
    public static int[] field2558 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!cka", name = "d", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!cka", name = "e", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!cka", name = "b", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!cka", name = "b", descriptor = "(I)V")
    public static void method1615(int arg0) {
        try {
            field2558 = null;
            int var1 = -123 % ((arg0 - 75) / 38);
            field2557 = null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2560[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(I)I")
    public static final int method1616(int arg0) {
        try {
            int var1 = 107 / ((13 - arg0) / 38);
            field2556++;
            return class166.field2283 == 1 ? class69.field742 : class3.field31;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2560[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cka", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1617(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cka", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1618(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 18;
                    break;
                case 1:
                    var10005 = 69;
                    break;
                case 2:
                    var10005 = 89;
                    break;
                case 3:
                    var10005 = 67;
                    break;
                default:
                    var10005 = 95;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
