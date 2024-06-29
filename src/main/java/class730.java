import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class730 extends class568 {

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "[Ljava/lang/String;")
    private static final String[] field10699 = new String[] { method5293(method5292("X>91_")), method5293(method5292("X>92_")) };

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "[J")
    public static long[] field10698 = new long[100];

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "F")
    public static float field10691;

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "I")
    public int field10685;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
    public int field10686;

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
    public int field10689;

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "I")
    public int field10694;

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "I")
    public int field10695;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "I")
    public int field10696;

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "I")
    public static int field10697;

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "Lmj;")
    public class683 field10690;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "Lmj;")
    public class683 field10693;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "Ljava/lang/String;")
    public String field10688;

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "Z")
    public boolean field10684;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "[I")
    public static int[] field10687;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "[Ljava/lang/Object;")
    public Object[] field10692;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V", line = 8)
    public static void method5290(boolean arg0) {
        try {
            if (!arg0) {
                field10698 = null;
            }
            field10698 = null;
            field10687 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field10699[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZFFF)F", line = 24)
    public static final float method5291(boolean arg0, float arg1, float arg2, float arg3) {
        try {
            if (arg0) {
                field10687 = null;
            }
            field10697++;
            return (arg3 - arg1) * arg2 + arg1;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field10699[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5292(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x77);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5293(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 49;
                    break;
                case 1:
                    var10005 = 93;
                    break;
                case 2:
                    var10005 = 23;
                    break;
                case 3:
                    var10005 = 115;
                    break;
                default:
                    var10005 = 119;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
