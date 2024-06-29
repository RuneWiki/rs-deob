import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class320 {

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field4304 = 0;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "Lem;")
    public static class227 field4305;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "[I")
    public static int[] field4301;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V", line = 4)
    public static void method1911(byte arg0) {
        field4305 = null;
        field4301 = null;
        int var1 = 79 % ((29 - arg0) / 53);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)V", line = 15)
    public static final void method1912(int arg0, int arg1) {
        field4306++;
        class252 var2 = class150.method916(arg0, -70, arg1);
        var2.method1497(0);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ICB)I", line = 32)
    public static final int method1913(int arg0, char arg1, byte arg2) {
        if (arg2 > -69) {
            return -103;
        }
        field4302++;
        int var3 = arg1 << 4;
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            char var4 = Character.toLowerCase(arg1);
            var3 = (var4 << 4) + 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILac;ILjava/lang/String;)Lne;", line = 52)
    public static final class321 method1914(int arg0, class541 arg1, int arg2, String arg3) {
        field4300++;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg2, var4);
        OpenGL.glProgramStringARB(arg2, 34933, arg3);
        OpenGL.glGetIntegerv(34379, class162.field2037, 0);
        if (class162.field2037[0] == -1) {
            OpenGL.glBindProgramARB(arg2, arg0);
            return new class321(arg1, arg2, var4);
        } else {
            OpenGL.glBindProgramARB(arg2, 0);
            return null;
        }
    }
}
