import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class43 {

    @OriginalMember(owner = "client!eaa", name = "g", descriptor = "I")
    private int field424;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!eaa", name = "d", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!eaa", name = "e", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!eaa", name = "f", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(II)V")
    public final void method219(int arg0, int arg1) {
        field420++;
        if (arg0 == 24427) {
            OpenGL.glNewList(this.field424 + arg1, 4864);
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IIIIII)V")
    public static final void method220(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field419++;
        int var6 = -52 % ((arg5 - 9) / 46);
        int var9 = arg0 + 1;
        class315.method1809(class557.field7954[arg0], arg4, -128, arg2, arg3);
        int var10 = arg1 - 1;
        class315.method1809(class557.field7954[arg1], arg4, -128, arg2, arg3);
        for (int var7 = var9; var7 <= var10; var7++) {
            int[] var8 = class557.field7954[var7];
            var8[arg2] = var8[arg3] = arg4;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lmr;I[BI)Lsi;")
    public static final class141 method221(class221 arg0, int arg1, byte[] arg2, int arg3) {
        field421++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg1);
        OpenGL.glShaderSourceRawARB(var4, arg2);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class637.field8966, 0);
        if (class637.field8966[0] == arg3) {
            if (class637.field8966[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class637.field8966, 1);
            if (class637.field8966[1] > 1) {
                byte[] var6 = new byte[class637.field8966[1]];
                OpenGL.glGetInfoLogARB(var4, class637.field8966[1], class637.field8966, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class637.field8966[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class141(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(CB)V")
    public final void method222(char arg0, byte arg1) {
        OpenGL.glCallList(this.field424 + arg0);
        if (arg1 >= -9) {
            this.field424 = -128;
        }
        field422++;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)V")
    public final void method223(int arg0) {
        if (arg0 != 1) {
            this.field424 = -98;
        }
        field423++;
        OpenGL.glEndList();
    }

    @OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Lvj;I)V")
    public class43(class422 arg0, int arg1) {
        this.field424 = OpenGL.glGenLists(arg1);
    }
}
