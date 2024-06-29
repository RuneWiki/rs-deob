import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class639 {

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "I")
    public static int field9315;

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "I")
    public static int field9316;

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(ILag;B[B)Loba;")
    public static final class220 method3699(int arg0, class587 arg1, byte arg2, byte[] arg3) {
        field9316++;
        if (arg3 == null) {
            return null;
        }
        int var4 = OpenGL.glGenProgramARB();
        if (arg2 < 113) {
            method3700(79, -47);
        }
        OpenGL.glBindProgramARB(arg0, var4);
        OpenGL.glProgramRawARB(arg0, 34933, arg3);
        OpenGL.glGetIntegerv(34379, class474.field6697, 0);
        if (class474.field6697[0] == -1) {
            OpenGL.glBindProgramARB(arg0, 0);
            return new class220(arg1, arg0, var4);
        } else {
            OpenGL.glBindProgramARB(arg0, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(II)I")
    public static final int method3700(int arg0, int arg1) {
        if (arg1 == 5) {
            field9315++;
            return arg0 & 0x7F;
        } else {
            return 75;
        }
    }
}
