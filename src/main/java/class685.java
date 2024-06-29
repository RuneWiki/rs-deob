import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class685 {

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "Z")
    public static boolean field9630 = true;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
    public static int field9629;

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "I")
    public static int field9631;

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "I")
    public static int field9632;

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "Laj;")
    public static class333 field9633;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V", line = 3)
    public static void method3805(int arg0) {
        field9633 = null;
        if (arg0 != 0) {
            field9633 = null;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIIZZ)V", line = 13)
    public static final void method3806(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        if (class712.field9959.field1270.method4293(40) == 0) {
            class103.method796(false, (byte) -95);
        } else {
            class417.field5982 = class712.field9959.field1270.method4293(6);
            class793.method4365((byte) -41, true, 0);
        }
        field9632++;
        class180.field2388 = arg2;
        class104.field1437 = arg3;
        class777.field10680 = arg1;
        if (arg4) {
            field9630 = true;
        }
        class375.method2336(arg0);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(B[BILpa;)Lru;", line = 42)
    public static final class205 method3807(byte arg0, byte[] arg1, int arg2, class391 arg3) {
        field9631++;
        if (arg1 == null) {
            return null;
        }
        int var4 = OpenGL.glGenProgramARB();
        if (arg0 != -63) {
            field9629 = 110;
        }
        OpenGL.glBindProgramARB(arg2, var4);
        OpenGL.glProgramRawARB(arg2, 34933, arg1);
        OpenGL.glGetIntegerv(34379, class668.field9360, 0);
        if (class668.field9360[0] == -1) {
            OpenGL.glBindProgramARB(arg2, 0);
            return new class205(arg3, arg2, var4);
        } else {
            OpenGL.glBindProgramARB(arg2, 0);
            return null;
        }
    }
}
