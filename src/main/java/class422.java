import jaggl.OpenGL;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cia")
public class class422 {

    @OriginalMember(owner = "client!cia", name = "d", descriptor = "F")
    public static float field6001;

    @OriginalMember(owner = "client!cia", name = "b", descriptor = "I")
    public static int field5999;

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "Lha;")
    public static class454 field5998;

    @OriginalMember(owner = "client!cia", name = "c", descriptor = "Ljava/io/FileOutputStream;")
    public static FileOutputStream field6000;

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(B)V")
    public static void method2502(byte arg0) {
        field5998 = null;
        if (arg0 == 49) {
            field6000 = null;
        }
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(IBLjava/lang/String;Leq;)Lkn;")
    public static final class327 method2503(int arg0, byte arg1, String arg2, class357 arg3) {
        field5999++;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg0, var4);
        if (arg1 < 75) {
            field6000 = null;
        }
        OpenGL.glProgramStringARB(arg0, 34933, arg2);
        OpenGL.glGetIntegerv(34379, class438.field6163, 0);
        if (class438.field6163[0] == -1) {
            OpenGL.glBindProgramARB(arg0, 0);
            return new class327(arg3, arg0, var4);
        } else {
            OpenGL.glBindProgramARB(arg0, 0);
            return null;
        }
    }
}
