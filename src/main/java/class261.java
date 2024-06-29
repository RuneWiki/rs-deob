import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class261 extends class164 implements class694 {

    @OriginalMember(owner = "client!oaa", name = "A", descriptor = "I")
    private int field3589 = -1;

    @OriginalMember(owner = "client!oaa", name = "E", descriptor = "I")
    private int field3593 = -1;

    @OriginalMember(owner = "client!oaa", name = "y", descriptor = "I")
    public int field3587;

    @OriginalMember(owner = "client!oaa", name = "C", descriptor = "I")
    private int field3591;

    @OriginalMember(owner = "client!oaa", name = "H", descriptor = "I")
    public int field3596;

    @OriginalMember(owner = "client!oaa", name = "u", descriptor = "Lkga;")
    private class506 field3583;

    @OriginalMember(owner = "client!oaa", name = "B", descriptor = "I")
    private int field3590;

    @OriginalMember(owner = "client!oaa", name = "v", descriptor = "I")
    public int field3584;

    @OriginalMember(owner = "client!oaa", name = "D", descriptor = "[Leba;")
    public static class543[] field3592 = new class543[300];

    @OriginalMember(owner = "client!oaa", name = "J", descriptor = "I")
    public static int field3597 = 0;

    @OriginalMember(owner = "client!oaa", name = "t", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!oaa", name = "w", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!oaa", name = "x", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!oaa", name = "F", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!oaa", name = "G", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!oaa", name = "z", descriptor = "Lrm;")
    public static class377 field3588;

    @OriginalMember(owner = "client!oaa", name = "d", descriptor = "(B)V")
    public static void method1588(byte arg0) {
        if (arg0 >= -116) {
            method1591(48, 28, (byte) 86);
        }
        field3588 = null;
        field3592 = null;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Z)V")
    public final void method1589(boolean arg0) {
        if (arg0) {
            method1588((byte) -52);
        }
        if (this.field3590 > 0) {
            this.field3583.method2976(this.field3590, this.field3584, false);
            this.field3590 = 0;
        }
        field3585++;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(B)V")
    public final void method1160(byte arg0) {
        field3595++;
        OpenGL.glFramebufferRenderbufferEXT(this.field3593, this.field3589, 36161, 0);
        int var2 = -114 / ((arg0 + 50) / 54);
        this.field3589 = -1;
        this.field3593 = -1;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIB)V")
    public final void method1590(int arg0, int arg1, byte arg2) {
        OpenGL.glFramebufferRenderbufferEXT(arg1, arg0, 36161, this.field3590);
        field3594++;
        if (arg2 != -89) {
            method1591(-8, 124, (byte) 73);
        }
        this.field3593 = arg1;
        this.field3589 = arg0;
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(IIB)V")
    public static final void method1591(int arg0, int arg1, byte arg2) {
        if (arg2 != 50) {
            field3588 = null;
        }
        class440.field6291 = arg1 - class550.field8009;
        field3582++;
        class113.field1458 = arg0 - class550.field8007;
    }

    @OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(Lkga;III)V")
    public class261(class506 arg0, int arg1, int arg2, int arg3) {
        this.field3587 = arg2;
        this.field3591 = arg1;
        this.field3596 = arg3;
        this.field3583 = arg0;
        OpenGL.glGenRenderbuffersEXT(1, class471.field6575, 0);
        this.field3590 = class471.field6575[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field3590);
        OpenGL.glRenderbufferStorageEXT(36161, this.field3591, this.field3587, this.field3596);
        this.field3584 = this.field3587 * this.field3596 * this.field3583.method2993(this.field3591, false);
    }

    @OriginalMember(owner = "client!oaa", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field3586++;
        this.method1589(false);
        super.finalize();
    }

    @OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(Lkga;IIII)V")
    public class261(class506 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3591 = arg1;
        this.field3596 = arg3;
        this.field3583 = arg0;
        this.field3587 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, class471.field6575, 0);
        this.field3590 = class471.field6575[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field3590);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field3591, this.field3587, this.field3596);
        this.field3584 = this.field3596 * this.field3587 * this.field3583.method2993(this.field3591, false);
    }
}
