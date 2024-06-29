import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fia")
public class class280 extends class331 {

    @OriginalMember(owner = "client!fia", name = "r", descriptor = "Z")
    public static boolean field3552 = false;

    @OriginalMember(owner = "client!fia", name = "n", descriptor = "Lmq;")
    public static class78 field3548 = new class78(94, 6);

    @OriginalMember(owner = "client!fia", name = "m", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!fia", name = "o", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!fia", name = "p", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!fia", name = "q", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!fia", name = "s", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!fia", name = "t", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!fia", name = "v", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!fia", name = "u", descriptor = "Ljava/lang/Object;")
    public static Object field3555;

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(Lck;[BIB)Lju;", line = 6)
    public static final class373 method1674(class221 arg0, byte[] arg1, int arg2, byte arg3) {
        ++field3551;
        if (arg1 != null && ~arg1.length != -1) {
            long var4 = OpenGL.glCreateShaderObjectARB(arg2);
            OpenGL.glShaderSourceRawARB(var4, arg1);
            OpenGL.glCompileShaderARB(var4);
            OpenGL.glGetObjectParameterivARB(var4, 35713, class43.field658, 0);
            if (class43.field658[0] == 0) {
                if (~class43.field658[0] == -1) {
                    System.out.println("Shader compile failed:");
                }
                OpenGL.glGetObjectParameterivARB(var4, 35716, class43.field658, 1);
                if (~class43.field658[1] < -2) {
                    byte[] var6 = new byte[class43.field658[1]];
                    OpenGL.glGetInfoLogARB(var4, class43.field658[1], class43.field658, 0, var6, 0);
                    System.out.println(new String(var6));
                }
                if (class43.field658[0] == 0) {
                    OpenGL.glDeleteObjectARB(var4);
                    return null;
                }
            }
            return arg3 < 23 ? null : new class373(arg0, var4, arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "(I)V", line = 52)
    public static void method1675(int arg0) {
        if (arg0 != 1) {
            method1677(92, -71);
        }
        field3555 = null;
        field3548 = null;
    }

    @OriginalMember(owner = "client!fia", name = "<init>", descriptor = "(Lts;)V", line = 67)
    public class280(class41 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fia", name = "<init>", descriptor = "(ILts;)V", line = 70)
    public class280(int arg0, class41 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "(II)I", line = 73)
    public final int method222(int arg0, int arg1) {
        ++field3554;
        if (arg1 != 1) {
            field3552 = false;
        }
        return 1;
    }

    @OriginalMember(owner = "client!fia", name = "c", descriptor = "(B)I", line = 88)
    public final int method1676(byte arg0) {
        ++field3556;
        if (arg0 >= -119) {
            this.method1676((byte) 113);
        }
        return super.field4202;
    }

    @OriginalMember(owner = "client!fia", name = "d", descriptor = "(II)I", line = 101)
    public static final int method1677(int arg0, int arg1) {
        if (arg1 != 1) {
            field3555 = null;
        }
        ++field3550;
        return 255 & arg0;
    }

    @OriginalMember(owner = "client!fia", name = "c", descriptor = "(II)V", line = 112)
    public final void method227(int arg0, int arg1) {
        ++field3549;
        super.field4202 = arg1;
        if (arg0 < 113) {
            field3555 = null;
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(I)V", line = 123)
    public final void method224(int arg0) {
        if (arg0 == -1959) {
            if (super.field4202 != 1 && super.field4202 != 0) {
                super.field4202 = this.method226((byte) 13);
            }
            ++field3547;
        }
    }

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "(B)I", line = 137)
    public final int method226(byte arg0) {
        if (arg0 != 13) {
            return -88;
        } else {
            ++field3553;
            return 1;
        }
    }
}
