import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class98 {

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "[I")
    public static int[] field1333 = new int[25];

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "[I")
    public static int[] field1334 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILen;ILjava/lang/String;)Lafa;", line = 6)
    public static final class314 method763(int arg0, class289 arg1, int arg2, String arg3) {
        field1335++;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg0, var4);
        OpenGL.glProgramStringARB(arg0, 34933, arg3);
        OpenGL.glGetIntegerv(34379, class283.field3932, 0);
        if (class283.field3932[0] == -1) {
            OpenGL.glBindProgramARB(arg0, arg2);
            return new class314(arg1, arg0, var4);
        } else {
            OpenGL.glBindProgramARB(arg0, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V", line = 28)
    public static void method764(int arg0) {
        field1334 = null;
        int var1 = -2 / ((6 - arg0) / 50);
        field1333 = null;
    }
}
