import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class520 extends class619 {

    @OriginalMember(owner = "client!po", name = "g", descriptor = "Lhi;")
    public class190 field7368;

    @OriginalMember(owner = "client!po", name = "f", descriptor = "I")
    public static int field7367;

    @OriginalMember(owner = "client!po", name = "h", descriptor = "I")
    public static int field7369;

    @OriginalMember(owner = "client!po", name = "e", descriptor = "[[B")
    public static byte[][] field7366;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(I)V")
    public static void method3062(int arg0) {
        field7366 = null;
        if (arg0 != 34379) {
            field7366 = null;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Ljava/lang/String;Lus;II)Lkk;")
    public static final class175 method3063(String arg0, class1 arg1, int arg2, int arg3) {
        field7367++;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg3, var4);
        OpenGL.glProgramStringARB(arg3, 34933, arg0);
        OpenGL.glGetIntegerv(arg2, class475.field6807, 0);
        if (class475.field6807[0] == -1) {
            OpenGL.glBindProgramARB(arg3, 0);
            return new class175(arg1, arg3, var4);
        } else {
            OpenGL.glBindProgramARB(arg3, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lcf;II[B)V")
    public class520(class562 arg0, int arg1, int arg2, byte[] arg3) {
        this.field7368 = arg0.method3259(arg1, arg3, arg2, false, class410.field5938, 0);
        this.field7368.method465(false, 13321, false);
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lcf;II[I)V")
    public class520(class562 arg0, int arg1, int arg2, int[] arg3) {
        this.field7368 = arg0.method3270(arg2, arg3, (byte) 50, false, arg1);
        this.field7368.method465(false, 13321, false);
    }
}
