import jaggl.OpenGL;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class683 extends class569 implements class65 {

    @OriginalMember(owner = "client!fm", name = "P", descriptor = "I")
    private int field9637;

    @OriginalMember(owner = "client!fm", name = "N", descriptor = "I")
    private int field9635;

    @OriginalMember(owner = "client!fm", name = "I", descriptor = "I")
    public static int field9630 = 0;

    @OriginalMember(owner = "client!fm", name = "C", descriptor = "Z")
    public static boolean field9624 = false;

    @OriginalMember(owner = "client!fm", name = "A", descriptor = "I")
    public static int field9622;

    @OriginalMember(owner = "client!fm", name = "B", descriptor = "I")
    public static int field9623;

    @OriginalMember(owner = "client!fm", name = "E", descriptor = "I")
    public static int field9626;

    @OriginalMember(owner = "client!fm", name = "G", descriptor = "I")
    public static int field9628;

    @OriginalMember(owner = "client!fm", name = "H", descriptor = "I")
    public static int field9629;

    @OriginalMember(owner = "client!fm", name = "J", descriptor = "I")
    public static int field9631;

    @OriginalMember(owner = "client!fm", name = "K", descriptor = "I")
    public static int field9632;

    @OriginalMember(owner = "client!fm", name = "L", descriptor = "I")
    public static int field9633;

    @OriginalMember(owner = "client!fm", name = "O", descriptor = "I")
    public static int field9636;

    @OriginalMember(owner = "client!fm", name = "Q", descriptor = "I")
    public static int field9638;

    @OriginalMember(owner = "client!fm", name = "R", descriptor = "I")
    public static int field9639;

    @OriginalMember(owner = "client!fm", name = "S", descriptor = "I")
    public static int field9640;

    @OriginalMember(owner = "client!fm", name = "T", descriptor = "I")
    public static int field9641;

    @OriginalMember(owner = "client!fm", name = "M", descriptor = "Ljava/awt/Frame;")
    public static Frame field9634;

    @OriginalMember(owner = "client!fm", name = "F", descriptor = "Z")
    public static boolean field9627;

    @OriginalMember(owner = "client!fm", name = "D", descriptor = "[I")
    public static int[] field9625;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)Z", line = 3)
    public final boolean method662(boolean arg0) {
        ++field9636;
        if (arg0) {
            field9625 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILlca;IIIBI[FI)V", line = 16)
    public final void method3776(int arg0, class597 arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, float[] arg7, int arg8) {
        ++field9622;
        super.field8007.method2337(false, this);
        OpenGL.glPixelStorei(3314, arg0);
        int var10 = -31 % ((arg5 - -44) / 50);
        OpenGL.glTexSubImage2Df(super.field8011, 0, arg6, arg4, arg2, arg3, class351.method2159(arg1, (byte) 116), 5121, arg7, arg8);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lhp;Llca;IIZ[FII)V", line = 30)
    public class683(class296 arg0, class597 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class218.field3054, arg2 * arg3, arg4);
        this.field9637 = arg3;
        this.field9635 = arg2;
        super.field8007.method2337(false, this);
        if (!arg4 && ~arg7 == -1 && ~arg6 == -1) {
            this.method3246(arg2, arg5, (byte) -116, arg3, super.field8011);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field8011, 0, this.method3235((byte) 61), arg2, arg3, 0, class351.method2159(super.field8018, (byte) 96), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lhp;IIZ[III)V", line = 52)
    public class683(class296 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class75.field1306, class218.field3050, arg1 * arg2, arg3);
        this.field9637 = arg2;
        this.field9635 = arg1;
        super.field8007.method2337(false, this);
        if (arg3 && arg6 == 0 && arg5 == 0) {
            this.method3247(arg4, arg1, 255, arg2, super.field8011);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field8011, 0, 6408, this.field9635, this.field9637, 0, 32993, super.field8007.field4441, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lhp;Llca;IIZ[BII)V", line = 71)
    public class683(class296 arg0, class597 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class218.field3050, arg2 * arg3, arg4);
        this.field9637 = arg3;
        this.field9635 = arg2;
        super.field8007.method2337(false, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && ~arg7 == -1 && ~arg6 == -1) {
            this.method3241(super.field8011, arg3, arg5, true, arg2);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field8011, 0, this.method3235((byte) 61), arg2, arg3, 0, class351.method2159(super.field8018, (byte) 67), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(FI)F", line = 95)
    public final float method661(float arg0, int arg1) {
        int var3 = 2 % ((arg1 - -11) / 60);
        ++field9638;
        return arg0 / (float) this.field9635;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZF)F", line = 110)
    public final float method666(boolean arg0, float arg1) {
        if (!arg0) {
            return 0.6326568F;
        } else {
            ++field9640;
            return arg1 / (float) this.field9637;
        }
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(Z)I", line = 121)
    public final int method665(boolean arg0) {
        if (arg0) {
            field9627 = false;
        }
        ++field9639;
        return this.field9635;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(BZZ)V", line = 141)
    public final void method663(byte arg0, boolean arg1, boolean arg2) {
        super.field8007.method2337(false, this);
        ++field9632;
        OpenGL.glTexParameteri(super.field8011, 10242, arg1 ? 10497 : 33071);
        OpenGL.glTexParameteri(super.field8011, 10243, !arg2 ? 33071 : 10497);
        if (arg0 != -102) {
            method3778(84, -80, 76, 15, 58, 76, -10, false, 100);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Llca;IIZIIII[B)V", line = 154)
    public final void method664(class597 arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        ++field9641;
        super.field8007.method2337(false, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg1);
        OpenGL.glTexSubImage2Dub(super.field8011, 0, arg5, arg4, arg7, arg2, class351.method2159(arg0, (byte) 71), 5121, arg8, arg6);
        if (arg3) {
            OpenGL.glPixelStorei(3314, 0);
            OpenGL.glPixelStorei(3317, 4);
        }
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lhp;Llca;Lig;II)V", line = 172)
    public class683(class296 arg0, class597 arg1, class218 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field9637 = arg4;
        this.field9635 = arg3;
        super.field8007.method2337(false, this);
        OpenGL.glTexImage2Dub(super.field8011, 0, this.method3235((byte) 61), arg3, arg4, 0, class351.method2159(super.field8018, (byte) 76), class266.method1742((byte) 123, super.field8028), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "(I)V", line = 183)
    public static void method3777(int arg0) {
        field9625 = null;
        field9634 = null;
        if (arg0 != 21665) {
            field9624 = false;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIIIIZI)V", line = 195)
    public static final void method3778(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        if (!arg7) {
            field9625 = null;
        }
        class201.method1336(arg4, arg1, arg3, arg6, arg5, arg8, -513, arg0, arg2, 0);
        ++field9629;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)I", line = 206)
    public final int method668(int arg0) {
        ++field9631;
        return arg0 != 31607 ? -36 : this.field9637;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IBIII[III)V", line = 217)
    public final void method667(int arg0, byte arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7) {
        super.field8007.method2337(false, this);
        ++field9626;
        OpenGL.glPixelStorei(3314, arg4);
        if (arg1 != -64) {
            field9633 = -124;
        }
        OpenGL.glTexSubImage2Di(super.field8011, 0, arg2, arg6, arg0, arg7, 32993, super.field8007.field4441, arg5, arg3);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(III)Z", line = 231)
    public static final boolean method3779(int arg0, int arg1, int arg2) {
        if (arg1 <= 105) {
            method3779(84, -122, -116);
        }
        ++field9628;
        return ~(arg2 & 33) != -1;
    }
}
