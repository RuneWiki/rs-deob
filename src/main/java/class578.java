import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public abstract class class578 {

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "I")
    public int field7934;

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "I")
    public int field7936;

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "I")
    public int field7937;

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "Ljava/lang/String;")
    public static String field7935 = null;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "I")
    public static int field7933;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(III)V")
    public abstract void method399(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(III)V")
    public abstract void method402(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "(III)V")
    public abstract void method400(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)V")
    public static void method3325(int arg0) {
        if (arg0 != -14487) {
            method3326(-97, null, null, true);
        }
        field7935 = null;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(ILqo;Ljava/lang/String;Z)Lpl;")
    public static final class651 method3326(int arg0, class22 arg1, String arg2, boolean arg3) {
        field7933++;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg0, var4);
        if (arg3) {
            return null;
        }
        OpenGL.glProgramStringARB(arg0, 34933, arg2);
        OpenGL.glGetIntegerv(34379, class135.field2260, 0);
        if (class135.field2260[0] == -1) {
            OpenGL.glBindProgramARB(arg0, 0);
            return new class651(arg1, arg0, var4);
        } else {
            OpenGL.glBindProgramARB(arg0, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(III)V")
    public class578(int arg0, int arg1, int arg2) {
        this.field7934 = arg2;
        this.field7936 = arg0;
        this.field7937 = arg1;
    }
}
