import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class744 extends class224 implements class356 {

    @OriginalMember(owner = "client!nh", name = "B", descriptor = "I")
    private int field10413 = -1;

    @OriginalMember(owner = "client!nh", name = "J", descriptor = "I")
    private int field10421 = -1;

    @OriginalMember(owner = "client!nh", name = "I", descriptor = "Loea;")
    private class594 field10420;

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "I")
    public int field10409;

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "I")
    public int field10411;

    @OriginalMember(owner = "client!nh", name = "H", descriptor = "I")
    private int field10419;

    @OriginalMember(owner = "client!nh", name = "y", descriptor = "I")
    private int field10410;

    @OriginalMember(owner = "client!nh", name = "E", descriptor = "I")
    private int field10416;

    @OriginalMember(owner = "client!nh", name = "K", descriptor = "Lqaa;")
    public static class27 field10422 = new class27(63, -1);

    @OriginalMember(owner = "client!nh", name = "L", descriptor = "Lnt;")
    public static class220 field10423 = new class220();

    @OriginalMember(owner = "client!nh", name = "N", descriptor = "[I")
    public static int[] field10425 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!nh", name = "O", descriptor = "I")
    public static int field10426 = 0;

    @OriginalMember(owner = "client!nh", name = "A", descriptor = "I")
    public static int field10412;

    @OriginalMember(owner = "client!nh", name = "C", descriptor = "I")
    public static int field10414;

    @OriginalMember(owner = "client!nh", name = "D", descriptor = "I")
    public static int field10415;

    @OriginalMember(owner = "client!nh", name = "F", descriptor = "I")
    public static int field10417;

    @OriginalMember(owner = "client!nh", name = "G", descriptor = "I")
    public static int field10418;

    @OriginalMember(owner = "client!nh", name = "M", descriptor = "Leq;")
    public static class209 field10424;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)V")
    public final void method4144(int arg0, int arg1, int arg2) {
        OpenGL.glFramebufferRenderbufferEXT(arg0, arg2, arg1, this.field10410);
        field10415++;
        this.field10421 = arg2;
        this.field10413 = arg0;
    }

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "(I)V")
    public final void method4145(int arg0) {
        field10418++;
        if (this.field10410 > 0) {
            this.field10420.method3460(arg0 + 512, this.field10410, this.field10416);
            this.field10410 = 0;
        }
        if (arg0 != 0) {
            this.field10410 = -116;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V")
    public static void method4146(boolean arg0) {
        field10422 = null;
        field10423 = null;
        field10425 = null;
        field10424 = null;
        if (!arg0) {
            field10424 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Loea;IIIII)Lm;")
    public static final class189 method4147(class594 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != 0) {
            method4147(null, -36, 65, -101, 45, 110);
        }
        field10417++;
        if (!arg0.field8644 && (!class278.method1826((byte) 115, arg4) || !class278.method1826((byte) 120, arg2))) {
            return arg0.field8587 ? new class189(arg0, 34037, arg3, arg1, arg4, arg2, true) : new class189(arg0, arg3, arg1, arg4, arg2, class613.method3530(false, arg4), class613.method3530(false, arg2), true);
        } else {
            return new class189(arg0, 3553, arg3, arg1, arg4, arg2, true);
        }
    }

    @OriginalMember(owner = "client!nh", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field10414++;
        this.method4145(0);
        super.finalize();
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public final void method827(int arg0) {
        OpenGL.glFramebufferRenderbufferEXT(this.field10413, this.field10421, 36161, arg0);
        field10412++;
        this.field10413 = -1;
        this.field10421 = -1;
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Loea;III)V")
    public class744(class594 arg0, int arg1, int arg2, int arg3) {
        this.field10420 = arg0;
        this.field10409 = arg3;
        this.field10411 = arg2;
        this.field10419 = arg1;
        OpenGL.glGenRenderbuffersEXT(1, class303.field4275, 0);
        this.field10410 = class303.field4275[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field10410);
        OpenGL.glRenderbufferStorageEXT(36161, this.field10419, this.field10411, this.field10409);
        this.field10416 = this.field10411 * this.field10409 * this.field10420.method3441(-118, this.field10419);
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Loea;IIII)V")
    public class744(class594 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field10411 = arg2;
        this.field10419 = arg1;
        this.field10409 = arg3;
        this.field10420 = arg0;
        OpenGL.glGenRenderbuffersEXT(1, class303.field4275, 0);
        this.field10410 = class303.field4275[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field10410);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field10419, this.field10411, this.field10409);
        this.field10416 = this.field10411 * this.field10409 * this.field10420.method3441(119, this.field10419);
    }
}
