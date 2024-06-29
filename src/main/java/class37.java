import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class37 extends class35 implements class123 {

    @OriginalMember(owner = "client!ch", name = "D", descriptor = "I")
    private int field372;

    @OriginalMember(owner = "client!ch", name = "y", descriptor = "I")
    private int field368;

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "I")
    private int field369;

    @OriginalMember(owner = "client!ch", name = "B", descriptor = "Ltm;")
    public static class334 field370 = new class334(32, 6);

    @OriginalMember(owner = "client!ch", name = "G", descriptor = "Lew;")
    public static class685 field375 = new class685("", 12);

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!ch", name = "C", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!ch", name = "F", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!ch", name = "H", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!ch", name = "J", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!ch", name = "E", descriptor = "Lro;")
    public static class522 field373;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IBI)Lup;", line = 5)
    public static final class238 method210(int arg0, byte arg1, int arg2) {
        ++field366;
        class238 var3 = new class238();
        var3.field3828 = -1;
        var3.field3822 = arg0 + 6;
        if (arg1 <= 63) {
            method211(-113, 47, -5);
        }
        var3.field3832 = -1;
        var3.field3824 = arg2 + 1 + 5;
        var3.field3831 = new int[var3.field3824][var3.field3822];
        var3.method1650((byte) -14);
        return var3;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)Z", line = 24)
    public static final boolean method211(int arg0, int arg1, int arg2) {
        ++field377;
        if (arg1 >= -51) {
            field370 = null;
        }
        if (arg0 >= 1000 && arg2 < 1000) {
            return true;
        } else if (arg0 < 1000 && ~arg2 > -1001) {
            if (class632.method3578(arg2, -125)) {
                return true;
            } else {
                return !class632.method3578(arg0, -126);
            }
        } else {
            return arg0 >= 1000 && arg2 >= 1000;
        }
    }

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(I)V", line = 57)
    public static void method212(int arg0) {
        if (arg0 <= -121) {
            field373 = null;
            field375 = null;
            field370 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "(I)V", line = 74)
    public static final void method213(int arg0) {
        if (arg0 < -101) {
            class292.field4496.method71((byte) 44);
            ++field371;
            class577.field8175.method71((byte) 44);
            class688.field9772.method71((byte) 44);
            class279.field4264.method71((byte) 44);
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lom;Llw;III[B)V", line = 89)
    public class37(class642 arg0, class233 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class121.field1859, arg2 * arg3 * arg4, false);
        this.field372 = arg3;
        this.field368 = arg2;
        this.field369 = arg4;
        super.field326.method215(8, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field317, 0, this.method203(122), this.field368, this.field372, this.field369, 0, class329.method2125(super.field321, 6046), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }
}
