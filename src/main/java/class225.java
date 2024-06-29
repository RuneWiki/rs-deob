import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class225 {

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public int field3431 = -1;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "[I")
    public static int[] field3427;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "Ljp;")
    public static class55 field3430;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "Lpn;")
    public static class49 field3432;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "Ltr;")
    public class247 field3425;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "[I")
    public int[] field3426;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "[Ljava/lang/String;")
    public String[] field3424;

    static {
        new class179("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
        field3427 = new int[1];
        new class179("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
        field3430 = new class55(92, 7);
        field3432 = new class49(66, 3);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/lang/String;BILtt;)Lds;", line = 3)
    public static final class279 method1547(String arg0, byte arg1, int arg2, class249 arg3) {
        field3429++;
        if (arg1 > -10) {
            return null;
        }
        long var4 = OpenGL.glCreateShaderObjectARB(arg2);
        OpenGL.glShaderSourceARB(var4, arg0);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class503.field7311, 0);
        if (class503.field7311[0] == 0) {
            if (class503.field7311[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class503.field7311, 1);
            if (class503.field7311[1] > 1) {
                byte[] var6 = new byte[class503.field7311[1]];
                OpenGL.glGetInfoLogARB(var4, class503.field7311[1], class503.field7311, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class503.field7311[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class279(arg3, var4, arg2);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)I", line = 50)
    public static final int method1548(int arg0, int arg1) {
        field3428++;
        if (arg0 >= -119) {
            method1548(1, -117);
        }
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V", line = 64)
    public static void method1549(boolean arg0) {
        field3432 = null;
        if (arg0) {
            method1549(true);
        }
        field3430 = null;
        field3427 = null;
    }
}
