import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public abstract class class715 {

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "I")
    public static int field9964;

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "I")
    public static int field9965;

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(IJ)I", line = 8)
    public final int method3998(int arg0, long arg1) {
        field9964++;
        long var4 = this.method68((byte) -93);
        if (var4 > (long) arg0) {
            class267.method1599(0, var4);
        }
        return this.method69(123, arg1);
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "([BLhl;II)Lqv;", line = 22)
    public static final class447 method3999(byte[] arg0, class529 arg1, int arg2, int arg3) {
        field9965++;
        if (arg0 == null) {
            return null;
        }
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg2, var4);
        OpenGL.glProgramRawARB(arg2, 34933, arg0);
        OpenGL.glGetIntegerv(34379, class51.field538, 0);
        if (class51.field538[0] == -1) {
            OpenGL.glBindProgramARB(arg2, 0);
            return arg3 == 25246 ? new class447(arg1, arg2, var4) : null;
        } else {
            OpenGL.glBindProgramARB(arg2, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(B)J")
    public abstract long method68(byte arg0);

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(Z)V")
    public abstract void method67(boolean arg0);

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "(B)J")
    public abstract long method70(byte arg0);

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "(IJ)I")
    public abstract int method69(int arg0, long arg1);
}
