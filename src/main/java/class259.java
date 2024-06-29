import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class259 {

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "Lew;")
    public static class685 field4050 = new class685("", 17);

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "Lul;")
    public static class363 field4052;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILrs;ILjava/lang/String;)Lica;")
    public static final class391 method1736(int arg0, class166 arg1, int arg2, String arg3) {
        field4053++;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg2, var4);
        OpenGL.glProgramStringARB(arg2, 34933, arg3);
        OpenGL.glGetIntegerv(34379, class426.field6263, arg0);
        if (class426.field6263[0] == -1) {
            OpenGL.glBindProgramARB(arg2, 0);
            return new class391(arg1, arg2, var4);
        } else {
            OpenGL.glBindProgramARB(arg2, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIILpe;III)V")
    public static final void method1737(int arg0, int arg1, int arg2, class109 arg3, int arg4, int arg5, int arg6) {
        field4051++;
        class217.method1556(arg1, arg3.field9475, arg0, arg3.field9477, arg4, arg6, arg2, 0, arg5 ^ 0xFFFFCA85, arg3.field9470);
        if (arg5 != 24906) {
            method1738((byte) -101);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
    public static void method1738(byte arg0) {
        field4052 = null;
        field4050 = null;
        if (arg0 != -1) {
            field4054 = 71;
        }
    }
}
