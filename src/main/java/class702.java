import jaggl.OpenGL;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class702 {

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field9897 = 0;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "Lpia;")
    public static class94 field9895 = new class94(51, 4);

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field9894;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field9896;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field9898;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field9899;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V", line = 3)
    public static void method3941(int arg0) {
        if (arg0 > -39) {
            field9898 = -72;
        }
        field9895 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lai;[BII)Lkca;", line = 14)
    public static final class82 method3942(class597 arg0, byte[] arg1, int arg2, int arg3) {
        field9896++;
        if (arg1 == null) {
            return null;
        }
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg3, var4);
        OpenGL.glProgramRawARB(arg3, 34933, arg1);
        OpenGL.glGetIntegerv(34379, class708.field9981, arg2);
        if (class708.field9981[0] == -1) {
            OpenGL.glBindProgramARB(arg3, 0);
            return new class82(arg0, arg3, var4);
        } else {
            OpenGL.glBindProgramARB(arg3, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I[Ljava/awt/Rectangle;I)V", line = 43)
    public static final void method3943(int arg0, Rectangle[] arg1, int arg2) throws class266 {
        if (arg0 != 31374) {
            method3941(45);
        }
        field9894++;
        if (class3.field27 == 1) {
            class574.field8144.method344(arg1, arg2, class261.field3241, class305.field3808);
        } else {
            class574.field8144.method344(arg1, arg2, 0, 0);
        }
    }
}
