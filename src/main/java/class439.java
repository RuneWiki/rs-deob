import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class439 extends class538 {

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "I")
    private int field6618 = -1;

    @OriginalMember(owner = "client!lj", name = "G", descriptor = "I")
    private int field6625 = -1;

    @OriginalMember(owner = "client!lj", name = "D", descriptor = "I")
    public int field6622;

    @OriginalMember(owner = "client!lj", name = "A", descriptor = "I")
    public int field6619;

    @OriginalMember(owner = "client!lj", name = "y", descriptor = "I")
    public int field6617;

    @OriginalMember(owner = "client!lj", name = "E", descriptor = "[F")
    public static float[] field6623 = new float[4];

    @OriginalMember(owner = "client!lj", name = "J", descriptor = "J")
    public static long field6627 = -1L;

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "I")
    public static int field6616 = -1;

    @OriginalMember(owner = "client!lj", name = "B", descriptor = "I")
    public static int field6620 = 0;

    @OriginalMember(owner = "client!lj", name = "L", descriptor = "Z")
    public static boolean field6629 = true;

    @OriginalMember(owner = "client!lj", name = "C", descriptor = "I")
    public static int field6621;

    @OriginalMember(owner = "client!lj", name = "F", descriptor = "I")
    public static int field6624;

    @OriginalMember(owner = "client!lj", name = "H", descriptor = "I")
    public static int field6626;

    @OriginalMember(owner = "client!lj", name = "K", descriptor = "I")
    public static int field6628;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)V")
    public final void method2(boolean arg0) {
        if (!arg0) {
            ++field6621;
            OpenGL.glFramebufferTexture3DEXT(this.field6625, this.field6618, super.field7881, 0, 0, 0);
            this.field6618 = -1;
            this.field6625 = -1;
        }
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Lnq;IIII[BI)V")
    public class439(class325 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg3 * arg4 * arg2, false);
        this.field6622 = arg3;
        this.field6619 = arg2;
        this.field6617 = arg4;
        super.field7884.method2075(this, 0);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field7881, 0, super.field7878, this.field6619, this.field6622, this.field6617, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method3176(false, true);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIIIII)V")
    public final void method2658(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field6628;
        super.field7884.method2075(this, 0);
        OpenGL.glCopyTexSubImage3D(super.field7881, 0, arg2, arg1, arg5, arg3, arg4, arg0, arg7);
        if (arg6 > 31) {
            OpenGL.glFlush();
        }
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Lnq;IIII)V")
    public class439(class325 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);
        this.field6619 = arg2;
        this.field6617 = arg4;
        this.field6622 = arg3;
        super.field7884.method2075(this, 0);
        OpenGL.glTexImage3Dub(super.field7881, 0, super.field7878, this.field6619, this.field6622, this.field6617, 0, class259.method1676(super.field7878, 128), 5121, (byte[]) null, 0);
        this.method3176(false, true);
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(B)V")
    public static void method2659(byte arg0) {
        if (arg0 <= 60) {
            method2661(-98);
        }
        field6623 = null;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(II)V")
    public static final void method2660(int arg0, int arg1) {
        class513.field7540 = arg1 / arg0;
        ++field6626;
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(I)V")
    public static final void method2661(int arg0) {
        ++field6624;
        class229.method1543(false, 64);
        if (~class282.field4148 <= -1 && ~class282.field4148 != -1) {
            class170.method1152(-50, class282.field4148);
            class282.field4148 = -1;
        }
        int var1 = 117 / ((49 - arg0) / 49);
    }
}
