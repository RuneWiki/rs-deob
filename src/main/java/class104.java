import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class104 extends class206 {

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
    public static int field1802 = 0;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
    public static int field1801 = 0;

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "Lcf;")
    private static class93 field1809 = class147.method1066("Please wait )2 attempting to reestablish)3", -48);

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "Lcf;")
    public static class93 field1800 = field1809;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "Z")
    public static boolean field1805 = false;

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "Lcf;")
    public static class93 field1810 = class147.method1066("(R", -48);

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "[[I")
    public static int[][] field1804 = new int[104][104];

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "Lcf;")
    private static class93 field1808 = class147.method1066("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3", -48);

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "Lcf;")
    public static class93 field1807 = field1808;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)V")
    public static void method756(boolean arg0) {
        field1808 = null;
        field1809 = null;
        field1804 = null;
        field1810 = null;
        field1807 = null;
        if (!arg0) {
            field1800 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/Class;")
    public static final Class method757(boolean arg0, String arg1) throws ClassNotFoundException {
        field1806++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg0) {
            return null;
        } else if (arg1.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method758(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class208.field3732[arg0][var8][var14] == -class150.field2639) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class233.field4151[arg0][arg1][arg3] + arg5;
            if (!class268.method1792(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class268.method1792(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class268.method1792(var9, var11, var13)) {
                return false;
            } else if (class268.method1792(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class160.method1162(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class268.method1792(var6 + 1, class233.field4151[arg0][arg1][arg3] + arg5, var7 + 1) && class268.method1792(var6 + 128 - 1, class233.field4151[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class268.method1792(var6 + 128 - 1, class233.field4151[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class268.method1792(var6 + 1, class233.field4151[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }
}
