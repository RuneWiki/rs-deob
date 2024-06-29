import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class393 {

    @OriginalMember(owner = "client!aaa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5722 = new String[] { method3080(method3079("\u0001^\u0010JIH")), method3080(method3079("\u0001^\u0010JJH")) };

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "[[I")
    public static int[][] field5717 = new int[128][128];

    @OriginalMember(owner = "client!aaa", name = "c", descriptor = "I")
    public static int field5721 = 0;

    @OriginalMember(owner = "client!aaa", name = "e", descriptor = "I")
    public static int field5720;

    @OriginalMember(owner = "client!aaa", name = "d", descriptor = "[I")
    public static int[] field5718;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "[I")
    public static int[] field5719;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(B)V", line = 28)
    public static void method3077(byte arg0) {
        try {
            field5718 = null;
            int var1 = 57 / ((arg0 - 7) / 46);
            field5719 = null;
            field5717 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5722[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(II)I", line = 43)
    public static final int method3078(int arg0, int arg1) {
        try {
            field5720++;
            if (arg1 == 6407 || arg1 == 34843 || arg1 == 34837) {
                return 6407;
            } else if (arg1 == 6408 || arg1 == 34842 || arg1 == 34836) {
                return 6408;
            } else if (arg1 == 6406 || arg1 == 34844) {
                return 6406;
            } else {
                int var2 = 23 % ((67 - arg0) / 33);
                if (arg1 == 6409 || arg1 == 34846) {
                    return 6409;
                } else if (arg1 == 6410 || arg1 == 34847) {
                    return 6410;
                } else if (arg1 == 6402) {
                    return 6402;
                } else {
                    throw new IllegalArgumentException("");
                }
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5722[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!aaa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3079(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x8);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!aaa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3080(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 96;
                    break;
                case 1:
                    var10005 = 63;
                    break;
                case 2:
                    var10005 = 113;
                    break;
                case 3:
                    var10005 = 100;
                    break;
                default:
                    var10005 = 8;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
