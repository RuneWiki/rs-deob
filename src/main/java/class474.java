import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class474 {

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field7038;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field7040;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field7042;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "Lvf;")
    public class105 field7043;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "Luu;")
    public static class191 field7041;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "[[Z")
    public static boolean[][] field7039;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZI)I", line = 4)
    public static final int method2826(boolean arg0, int arg1) {
        field7038++;
        if (arg0) {
            field7041 = null;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILnq;ILjava/lang/String;)Lsh;", line = 20)
    public static final class49 method2827(int arg0, class325 arg1, int arg2, String arg3) {
        field7040++;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg0, var4);
        OpenGL.glProgramStringARB(arg0, arg2, arg3);
        OpenGL.glGetIntegerv(34379, class539.field7907, 0);
        if (class539.field7907[0] == -1) {
            OpenGL.glBindProgramARB(arg0, 0);
            return new class49(arg1, arg0, var4);
        } else {
            OpenGL.glBindProgramARB(arg0, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V", line = 43)
    public static void method2828(int arg0) {
        field7041 = null;
        if (arg0 >= 86) {
            field7039 = null;
        }
    }
}
