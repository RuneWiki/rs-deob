import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class694 extends class386 {

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "I")
    private int field9720 = -1;

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "I")
    private int field9723 = -1;

    @OriginalMember(owner = "client!nh", name = "C", descriptor = "I")
    public int field9726;

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "I")
    public int field9719;

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "I")
    public int field9718;

    @OriginalMember(owner = "client!nh", name = "A", descriptor = "Lvg;")
    public static class49 field9724 = new class49(64);

    @OriginalMember(owner = "client!nh", name = "G", descriptor = "[Ljava/lang/String;")
    public static String[] field9730 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!nh", name = "E", descriptor = "Lwr;")
    public static class423 field9728 = new class423();

    @OriginalMember(owner = "client!nh", name = "H", descriptor = "[[I")
    public static int[][] field9731 = new int[6][];

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "I")
    public static int field9721;

    @OriginalMember(owner = "client!nh", name = "y", descriptor = "I")
    public static int field9722;

    @OriginalMember(owner = "client!nh", name = "B", descriptor = "I")
    public static int field9725;

    @OriginalMember(owner = "client!nh", name = "D", descriptor = "Lq;")
    public static class393 field9727;

    @OriginalMember(owner = "client!nh", name = "F", descriptor = "Lcm;")
    public static class678 field9729;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIIZII)V", line = 5)
    public final void method3921(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        ++field9722;
        if (!arg5) {
            field9728 = null;
        }
        super.field6003.method856(false, this);
        OpenGL.glCopyTexSubImage3D(super.field5990, 0, arg4, arg7, arg2, arg3, arg1, arg6, arg0);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILjava/lang/String;)V", line = 19)
    public static final void method3922(int arg0, int arg1, String arg2) {
        ++class286.field4542;
        ++field9721;
        class165 var3 = class271.method1917(class420.field6424, (byte) -109, class373.field5830);
        if (arg0 == 2447) {
            var3.field2776.method65(class516.method3125(108, arg2) + 1, -77);
            var3.field2776.method28(arg2, 0);
            var3.field2776.method65(arg1, -77);
            class642.method3726(arg0 + -684098732, var3);
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Ler;IIII[BI)V", line = 36)
    public class694(class92 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);
        this.field9726 = arg3;
        this.field9719 = arg4;
        this.field9718 = arg2;
        super.field6003.method856(false, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field5990, 0, super.field5988, this.field9718, this.field9726, this.field9719, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2509(true, -105);
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Ler;IIII)V", line = 54)
    public class694(class92 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field9719 = arg4;
        this.field9718 = arg2;
        this.field9726 = arg3;
        super.field6003.method856(false, this);
        OpenGL.glTexImage3Dub(super.field5990, 0, super.field5988, this.field9718, this.field9726, this.field9719, 0, class329.method2212(super.field5988, -112), 5121, (byte[]) null, 0);
        this.method2509(true, -46);
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(Z)V", line = 72)
    public static void method3923(boolean arg0) {
        field9727 = null;
        field9731 = null;
        field9730 = null;
        field9729 = null;
        field9724 = null;
        if (arg0) {
            field9730 = null;
        }
        field9728 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V", line = 89)
    public final void method667(int arg0) {
        if (arg0 != 13035) {
            field9730 = null;
        }
        OpenGL.glFramebufferTexture3DEXT(this.field9720, this.field9723, super.field5990, 0, 0, 0);
        ++field9725;
        this.field9720 = -1;
        this.field9723 = -1;
    }
}
