import jaggl.OpenGL;
import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class606 extends OutputStream {

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "I")
    public static int field8411;

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "I")
    public static int field8412;

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "I")
    public static int field8413;

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "I")
    public static int field8414;

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "Ltha;")
    public static class486 field8415;

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "[B")
    public static byte[] field8416;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V")
    public static void method3325(int arg0) {
        field8415 = null;
        field8416 = null;
        if (arg0 != 0) {
            field8416 = null;
        }
    }

    @OriginalMember(owner = "client!cs", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field8411++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3326(int arg0, byte arg1, int arg2) {
        if (arg1 == 44) {
            field8413++;
            return (arg2 & 0x800) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I[BLck;I)Lhg;")
    public static final class502 method3327(int arg0, byte[] arg1, class221 arg2, int arg3) {
        field8412++;
        if (arg1 == null) {
            return null;
        }
        if (arg3 != -12409) {
            field8415 = null;
        }
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg0, var4);
        OpenGL.glProgramRawARB(arg0, 34933, arg1);
        OpenGL.glGetIntegerv(34379, class260.field3304, 0);
        if (class260.field3304[0] == -1) {
            OpenGL.glBindProgramARB(arg0, 0);
            return new class502(arg2, arg0, var4);
        } else {
            OpenGL.glBindProgramARB(arg0, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IZ)I")
    public static final int method3328(int arg0, boolean arg1) {
        field8414++;
        if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
            return 6407;
        }
        if (arg1) {
            field8415 = null;
        }
        if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
            return 6408;
        } else if (arg0 == 6406 || arg0 == 34844) {
            return 6406;
        } else if (arg0 == 6409 || arg0 == 34846) {
            return 6409;
        } else if (arg0 == 6410 || arg0 == 34847) {
            return 6410;
        } else if (arg0 == 6402) {
            return 6402;
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
