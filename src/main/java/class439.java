import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class439 extends class460 {

    @OriginalMember(owner = "client!gr", name = "x", descriptor = "I")
    private int field6062 = -1;

    @OriginalMember(owner = "client!gr", name = "C", descriptor = "I")
    private int field6067 = -1;

    @OriginalMember(owner = "client!gr", name = "D", descriptor = "I")
    public int field6068;

    @OriginalMember(owner = "client!gr", name = "u", descriptor = "I")
    public int field6059;

    @OriginalMember(owner = "client!gr", name = "B", descriptor = "I")
    public int field6066;

    @OriginalMember(owner = "client!gr", name = "y", descriptor = "[[B")
    public static byte[][] field6063 = new byte[1000][];

    @OriginalMember(owner = "client!gr", name = "E", descriptor = "F")
    public static float field6069;

    @OriginalMember(owner = "client!gr", name = "v", descriptor = "I")
    public static int field6060;

    @OriginalMember(owner = "client!gr", name = "w", descriptor = "I")
    public static int field6061;

    @OriginalMember(owner = "client!gr", name = "z", descriptor = "I")
    public static int field6064;

    @OriginalMember(owner = "client!gr", name = "A", descriptor = "I")
    public static int field6065;

    @OriginalMember(owner = "client!gr", name = "F", descriptor = "I")
    public static int field6070;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIIIIII)V", line = 3)
    public final void method2530(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field6061;
        super.field6291.method3639(-2, this);
        OpenGL.glCopyTexSubImage3D(super.field6282, 0, arg4, arg1, arg3, arg0, arg6, arg5, arg7);
        if (arg2 > -20) {
            method2531(-23, 85, -53);
        }
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lrda;IIII[BI)V", line = 18)
    public class439(class663 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg3 * arg4 * arg2, false);
        this.field6068 = arg4;
        this.field6059 = arg2;
        this.field6066 = arg3;
        super.field6291.method3639(-2, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field6282, 0, super.field6297, this.field6059, this.field6066, this.field6068, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2615(false, true);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(III)Z", line = 40)
    public static final boolean method2531(int arg0, int arg1, int arg2) {
        if (arg1 < 61) {
            method2534(88);
        }
        ++field6065;
        if (!class101.method756(arg2, arg0, -17286)) {
            return false;
        } else {
            return (arg0 & 45056) != 0 | class606.method3294(arg0, 0, arg2) | class378.method2239(arg0, 0, arg2) ? true : (class549.method3069(84, arg2, arg0) | class185.method1283(arg2, true, arg0)) & ~(arg2 & 55) == -1;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)V", line = 59)
    public final void method2032(byte arg0) {
        OpenGL.glFramebufferTexture3DEXT(this.field6062, this.field6067, super.field6282, 0, 0, 0);
        ++field6060;
        if (arg0 < 106) {
            this.field6066 = 110;
        }
        this.field6062 = -1;
        this.field6067 = -1;
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(II)V", line = 72)
    public static final void method2532(int arg0, int arg1) {
        int var2 = -75 / ((81 - arg0) / 37);
        ++field6070;
        if (arg1 != -1) {
            if (class244.field3407[arg1]) {
                class575.field7550.method2205(-100, arg1);
                class747.field10393[arg1] = null;
                class580.field7607[arg1] = null;
                class244.field3407[arg1] = false;
            }
        }
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lrda;IIII)V", line = 93)
    public class439(class663 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field6066 = arg3;
        this.field6068 = arg4;
        this.field6059 = arg2;
        super.field6291.method3639(-2, this);
        OpenGL.glTexImage3Dub(super.field6282, 0, super.field6297, this.field6059, this.field6066, this.field6068, 0, class555.method3088(super.field6297, 47), 5121, (byte[]) null, 0);
        this.method2615(false, true);
    }

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "(I)V", line = 109)
    public static void method2533(int arg0) {
        field6063 = null;
        if (arg0 != 3520) {
            field6069 = -0.8464747F;
        }
    }

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "(I)[Lle;", line = 121)
    public static final class311[] method2534(int arg0) {
        ++field6064;
        if (arg0 != -1) {
            field6063 = null;
        }
        return new class311[] { class211.field3102, class13.field201, class500.field6725 };
    }
}
