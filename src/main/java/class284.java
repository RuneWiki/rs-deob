import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wha")
public class class284 extends class36 {

    @OriginalMember(owner = "client!wha", name = "v", descriptor = "I")
    private int field3967;

    @OriginalMember(owner = "client!wha", name = "w", descriptor = "[I")
    public static int[] field3968 = new int[500];

    @OriginalMember(owner = "client!wha", name = "x", descriptor = "Z")
    public static boolean field3969 = false;

    @OriginalMember(owner = "client!wha", name = "s", descriptor = "Loaa;")
    public static class290 field3964 = new class290(9, 0, 4, 1);

    @OriginalMember(owner = "client!wha", name = "z", descriptor = "F")
    public static float field3971;

    @OriginalMember(owner = "client!wha", name = "t", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!wha", name = "u", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!wha", name = "y", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!wha", name = "r", descriptor = "Lg;")
    public static class157 field3963;

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(I)V", line = 3)
    public final void method457(int arg0) {
        if (arg0 == -3022) {
            ++field3965;
        }
    }

    @OriginalMember(owner = "client!wha", name = "<init>", descriptor = "(Lqo;II[BI)V", line = 16)
    public class284(class22 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field3967 = arg2;
        super.field870.method256((byte) -94, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field868, 0, super.field877, this.field3967, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method456(9728, true);
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(BZ)V", line = 34)
    public final void method1861(byte arg0, boolean arg1) {
        super.field870.method256((byte) -114, this);
        int var3 = 59 / ((-49 - arg0) / 40);
        ++field3966;
        OpenGL.glTexParameteri(super.field868, 10242, !arg1 ? 33071 : 10497);
    }

    @OriginalMember(owner = "client!wha", name = "f", descriptor = "(I)V", line = 46)
    public static void method1862(int arg0) {
        field3964 = null;
        field3963 = null;
        if (arg0 == 24885) {
            field3968 = null;
        }
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(BIZ)Lie;", line = 63)
    public static final class6 method1863(byte arg0, int arg1, boolean arg2) {
        ++field3970;
        int var3 = -43 / ((-65 - arg0) / 55);
        long var4 = (long) (arg1 | (arg2 ? Integer.MIN_VALUE : 0));
        return (class6) class297.field4174.method1465(var4, -6008);
    }
}
