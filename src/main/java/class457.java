import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class457 {

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "[I")
    public static int[] field6005 = new int[500];

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "Leba;")
    public static class550 field6004 = new class550(94, -1);

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field6006;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field6007;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field6008;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)I", line = 5)
    public static final int method2569(int arg0) {
        field6007++;
        if (arg0 != 0) {
            field6008 = 86;
        }
        return class206.field2759;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZILag;Ljava/lang/String;)Lpc;", line = 17)
    public static final class35 method2570(boolean arg0, int arg1, class469 arg2, String arg3) {
        if (arg0) {
            field6005 = null;
        }
        field6006++;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg1, var4);
        OpenGL.glProgramStringARB(arg1, 34933, arg3);
        OpenGL.glGetIntegerv(34379, class389.field5213, 0);
        if (class389.field5213[0] == -1) {
            OpenGL.glBindProgramARB(arg1, 0);
            return new class35(arg2, arg1, var4);
        } else {
            OpenGL.glBindProgramARB(arg1, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)V", line = 42)
    public static void method2571(boolean arg0) {
        field6005 = null;
        field6004 = null;
        if (arg0) {
            field6004 = null;
        }
    }
}
