import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class512 extends class487 {

    @OriginalMember(owner = "client!tq", name = "F", descriptor = "I")
    private int field7442 = -1;

    @OriginalMember(owner = "client!tq", name = "B", descriptor = "I")
    private int field7439 = -1;

    @OriginalMember(owner = "client!tq", name = "D", descriptor = "I")
    public int field7440;

    @OriginalMember(owner = "client!tq", name = "L", descriptor = "I")
    public int field7448;

    @OriginalMember(owner = "client!tq", name = "O", descriptor = "I")
    public int field7451;

    @OriginalMember(owner = "client!tq", name = "I", descriptor = "[I")
    public static int[] field7445 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!tq", name = "E", descriptor = "[F")
    public static float[] field7441 = new float[4];

    @OriginalMember(owner = "client!tq", name = "G", descriptor = "[Lan;")
    public static class134[] field7443 = new class134[100];

    @OriginalMember(owner = "client!tq", name = "H", descriptor = "I")
    public static int field7444;

    @OriginalMember(owner = "client!tq", name = "J", descriptor = "I")
    public static int field7446;

    @OriginalMember(owner = "client!tq", name = "K", descriptor = "I")
    public static int field7447;

    @OriginalMember(owner = "client!tq", name = "M", descriptor = "I")
    public static int field7449;

    @OriginalMember(owner = "client!tq", name = "N", descriptor = "Lfe;")
    public static class636 field7450;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V")
    public final void method2069(byte arg0) {
        ++field7449;
        if (arg0 != -31) {
            this.field7451 = 45;
        }
        OpenGL.glFramebufferTexture3DEXT(this.field7442, this.field7439, super.field7045, 0, 0, 0);
        this.field7439 = -1;
        this.field7442 = -1;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ljava/lang/Object;IZ)[B")
    public static final byte[] method3076(Object arg0, int arg1, boolean arg2) {
        ++field7447;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return !arg2 ? var3 : class604.method3462(-21039, var3);
        } else {
            if (arg1 != 10583) {
                field7445 = null;
            }
            if (arg0 instanceof class691) {
                class691 var4 = (class691) arg0;
                return var4.method1920(123);
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(III)Z")
    public static final boolean method3077(int arg0, int arg1, int arg2) {
        int var3 = 92 % ((-64 - arg2) / 36);
        ++field7446;
        return (arg1 & 2048) != 0;
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lrs;IIII)V")
    public class512(class166 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);
        this.field7440 = arg4;
        this.field7448 = arg3;
        this.field7451 = arg2;
        super.field7044.method1306(this, 55);
        OpenGL.glTexImage3Dub(super.field7045, 0, super.field7033, this.field7451, this.field7448, this.field7440, 0, class468.method2868((byte) -2, super.field7033), 5121, (byte[]) null, 0);
        this.method2967(true, true);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIIIIII)V")
    public final void method3078(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        super.field7044.method1306(this, 88);
        ++field7444;
        OpenGL.glCopyTexSubImage3D(super.field7045, 0, arg4, arg7, arg6, arg1, arg3, arg2, arg5);
        OpenGL.glFlush();
        if (arg0 >= -49) {
            method3076((Object) null, 24, true);
        }
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(I)V")
    public static void method3079(int arg0) {
        field7450 = null;
        field7443 = null;
        field7445 = null;
        if (arg0 == 29000) {
            field7441 = null;
        }
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lrs;IIII[BI)V")
    public class512(class166 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);
        this.field7448 = arg3;
        this.field7451 = arg2;
        this.field7440 = arg4;
        super.field7044.method1306(this, 51);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field7045, 0, super.field7033, this.field7451, this.field7448, this.field7440, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2967(true, true);
    }
}
