import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class181 extends RuntimeException {

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2821;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "Ljava/lang/String;")
    public String field2823;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "Loh;")
    public static class281 field2824 = new class281(4);

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2825 = "Close";

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "I")
    public static volatile int field2828 = 0;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
    public static int field2829 = 0;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "Lhc;")
    public static class235 field2826;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "[[[B")
    public static byte[][][] field2827;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method1232(int arg0, String arg1) {
        field2831++;
        String var2 = class28.method222(-256, class148.method1000(arg1, 934));
        if (var2 == null) {
            var2 = "";
        }
        return arg0 <= 48 ? null : var2;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method1233(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class22 var20 = new class22(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class269.field4298[var21][arg1][arg2] == null) {
                    class269.field4298[var21][arg1][arg2] = new class6(var21, arg1, arg2);
                }
            }
            class269.field4298[arg0][arg1][arg2].field129 = var20;
        } else if (arg3 == 1) {
            class22 var22 = new class22(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class269.field4298[var23][arg1][arg2] == null) {
                    class269.field4298[var23][arg1][arg2] = new class6(var23, arg1, arg2);
                }
            }
            class269.field4298[arg0][arg1][arg2].field129 = var22;
        } else {
            class225 var24 = new class225(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class269.field4298[var25][arg1][arg2] == null) {
                    class269.field4298[var25][arg1][arg2] = new class6(var25, arg1, arg2);
                }
            }
            class269.field4298[arg0][arg1][arg2].field148 = var24;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BI)V")
    public static final void method1234(byte arg0, int arg1) {
        if (arg0 > 64) {
            field2822++;
            class41 var2 = class221.method1492((byte) -42, arg1, 6);
            var2.method303(23981);
        }
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class181(Throwable arg0, String arg1) {
        this.field2821 = arg0;
        this.field2823 = arg1;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V")
    public static void method1235(byte arg0) {
        if (arg0 == -90) {
            field2826 = null;
            field2827 = null;
            field2824 = null;
            field2825 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)Lwh;")
    public static final class198 method1236(int arg0) {
        field2820++;
        try {
            if (arg0 != 0) {
                field2829 = -117;
            }
            return (class198) Class.forName("td").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }
}
