import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class216 {

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "Ljava/lang/String;")
    public String field3238;

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "Ljava/lang/String;")
    public String field3236;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "Ljava/lang/String;")
    public String field3235;

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "[I")
    public static int[] field3240 = new int[4096];

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(ILkw;ZLjava/lang/String;)Lft;", line = 5)
    public static final class695 method1530(int arg0, class346 arg1, boolean arg2, String arg3) {
        field3239++;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg0, var4);
        OpenGL.glProgramStringARB(arg0, 34933, arg3);
        OpenGL.glGetIntegerv(34379, class150.field2189, 0);
        if (class150.field2189[0] != -1) {
            OpenGL.glBindProgramARB(arg0, 0);
            return null;
        }
        if (!arg2) {
            method1532(-63, null);
        }
        OpenGL.glBindProgramARB(arg0, 0);
        return new class695(arg1, arg0, var4);
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)V", line = 34)
    public static void method1531(int arg0) {
        if (arg0 < 96) {
            field3240 = null;
        }
        field3240 = null;
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 44)
    public class216(String arg0, String arg1, String arg2) {
        this.field3238 = arg0;
        this.field3236 = arg2;
        this.field3235 = arg1;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(ILsl;)Lwr;", line = 54)
    public static final class240 method1532(int arg0, class479 arg1) {
        field3237++;
        if (arg0 != 5816) {
            method1532(-93, null);
        }
        int var2 = arg1.method2868(-91);
        return new class240(var2);
    }
}
