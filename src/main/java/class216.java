import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class216 extends class605 {

    @OriginalMember(owner = "client!dt", name = "f", descriptor = "Z")
    private boolean field3033 = false;

    @OriginalMember(owner = "client!dt", name = "e", descriptor = "Lhg;")
    private class642 field3032;

    @OriginalMember(owner = "client!dt", name = "h", descriptor = "I")
    public static int field3035 = 0;

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!dt", name = "g", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!dt", name = "i", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!dt", name = "j", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!dt", name = "k", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!dt", name = "l", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!dt", name = "m", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZI)V", line = 5)
    public final void method51(boolean arg0, int arg1) {
        if (arg1 < -127) {
            ++field3039;
            class431 var3 = super.field8542.method1579((byte) -116);
            if (this.field3032 != null && var3 != null && arg0) {
                this.field3032.method3574(58, '\u0000');
                super.field8542.method1500(33984, 1);
                super.field8542.method1505(-2, var3);
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadMatrixf(super.field8542.field3441.method3887(0), 0);
                OpenGL.glMatrixMode(5888);
                super.field8542.method1500(33984, 0);
                this.field3033 = true;
            } else {
                super.field8542.method1574(34168, (byte) -128, 770, 0);
            }
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZB)V", line = 31)
    public final void method46(boolean arg0, byte arg1) {
        super.field8542.method1527(1, 8448, 7681);
        if (arg1 < -16) {
            ++field3034;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILip;I)V", line = 42)
    public final void method43(int arg0, class657 arg1, int arg2) {
        super.field8542.method1505(-2, arg1);
        ++field3036;
        super.field8542.method1497(arg0, (byte) -29);
        if (arg2 != 0) {
            field3031 = 53;
        }
    }

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Lok;)V", line = 54)
    public class216(class228 arg0) {
        super(arg0);
        if (arg0.field3493) {
            this.field3032 = new class642(arg0, 2);
            this.field3032.method3579((byte) -84, 0);
            super.field8542.method1500(33984, 1);
            super.field8542.method1527(1, 34165, 7681);
            super.field8542.method1503(2, 34168, (byte) 2, 770);
            super.field8542.method1574(34167, (byte) -128, 770, 0);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field8542.method1500(33984, 0);
            this.field3032.method3577((byte) -47);
            this.field3032.method3579((byte) -88, 1);
            super.field8542.method1500(33984, 1);
            super.field8542.method1527(1, 8448, 8448);
            super.field8542.method1503(2, 34166, (byte) 2, 770);
            super.field8542.method1574(5890, (byte) -128, 770, 0);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field8542.method1500(33984, 0);
            this.field3032.method3577((byte) -119);
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Z)Z", line = 95)
    public final boolean method48(boolean arg0) {
        ++field3038;
        return arg0 ? true : true;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)V", line = 109)
    public final void method45(int arg0) {
        ++field3040;
        if (this.field3033) {
            this.field3032.method3574(90, '\u0001');
            super.field8542.method1500(33984, 1);
            super.field8542.method1505(-2, (class657) null);
            super.field8542.method1500(33984, 0);
        } else {
            super.field8542.method1574(5890, (byte) -128, 770, 0);
        }
        if (arg0 != 0) {
            field3035 = -86;
        }
        super.field8542.method1527(1, 8448, 8448);
        this.field3033 = false;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IZI)V", line = 131)
    public final void method47(int arg0, boolean arg1, int arg2) {
        ++field3037;
        if (arg1) {
            this.method45(113);
        }
    }
}
