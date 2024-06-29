import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class382 extends Exception {

    @OriginalMember(owner = "client!uv", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5795 = new String[] { method3065(method3064("`\u0001P Z")), method3065(method3064("`\u0001P#Z")) };

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "Lcn;")
    public static class541 field5790 = null;

    @OriginalMember(owner = "client!uv", name = "f", descriptor = "[I")
    public static int[] field5789 = new int[1000];

    @OriginalMember(owner = "client!uv", name = "g", descriptor = "I")
    public static int field5791 = 0;

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "Z")
    public static boolean field5794 = false;

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "D")
    public static double field5793;

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "I")
    public static int field5788;

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "I")
    public static int field5792;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Z)V")
    public static final void method3062(boolean arg0) {
        try {
            class582.method4355(22050, 2, class289.field4305.field846.method4660(false) == 1, 1358790352);
            field5792++;
            class646.field9353 = class219.method1915(22050, 0, class580.field8601, arg0, class502.field7252);
            class617.method4596(class40.method268(4096, null), true, (byte) -105);
            class417.field6140 = class219.method1915(2048, 1, class580.field8601, arg0, class502.field7252);
            class594.field8714 = new class679();
            class417.field6140.method4052((byte) 31, class594.field8714);
            class231.field3499 = new class391(22050, class598.field8803);
            class297.method2506(255);
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5795[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)V")
    public static void method3063(int arg0) {
        try {
            if (arg0 != 25632) {
                method3062(false);
            }
            field5790 = null;
            field5789 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5795[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3064(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x72);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3065(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 21;
                    break;
                case 1:
                    var10005 = 119;
                    break;
                case 2:
                    var10005 = 126;
                    break;
                case 3:
                    var10005 = 97;
                    break;
                default:
                    var10005 = 114;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
