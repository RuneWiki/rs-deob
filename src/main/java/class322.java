import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class322 extends class152 implements class545 {

    @OriginalMember(owner = "client!vw", name = "v", descriptor = "I")
    private int field3989 = -1;

    @OriginalMember(owner = "client!vw", name = "F", descriptor = "I")
    private int field3999 = -1;

    @OriginalMember(owner = "client!vw", name = "I", descriptor = "Lpc;")
    private class700 field4002;

    @OriginalMember(owner = "client!vw", name = "x", descriptor = "I")
    public int field3991;

    @OriginalMember(owner = "client!vw", name = "O", descriptor = "I")
    private int field4007;

    @OriginalMember(owner = "client!vw", name = "K", descriptor = "I")
    public int field4004;

    @OriginalMember(owner = "client!vw", name = "D", descriptor = "I")
    private int field3997;

    @OriginalMember(owner = "client!vw", name = "w", descriptor = "I")
    private int field3990;

    @OriginalMember(owner = "client!vw", name = "C", descriptor = "[I")
    public static int[] field3996 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!vw", name = "H", descriptor = "Lhj;")
    public static class596 field4001 = new class596(32, -1);

    @OriginalMember(owner = "client!vw", name = "y", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!vw", name = "z", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!vw", name = "A", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!vw", name = "E", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!vw", name = "G", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!vw", name = "J", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!vw", name = "L", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!vw", name = "M", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!vw", name = "B", descriptor = "Lhj;")
    public static class596 field3995;

    @OriginalMember(owner = "client!vw", name = "d", descriptor = "(I)V")
    public static final void method1920(int arg0) {
        field4000++;
        class678.method3815(56);
        if (arg0 <= -116) {
            class769.field10572 = false;
        }
    }

    @OriginalMember(owner = "client!vw", name = "g", descriptor = "(I)V")
    public final void method1921(int arg0) {
        if (arg0 != 0) {
            this.method1921(-105);
        }
        field3994++;
        if (this.field3997 > 0) {
            this.field4002.method3907(arg0, this.field3990, this.field3997);
            this.field3997 = 0;
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(ZBZ)V")
    public static final void method1922(boolean arg0, byte arg1, boolean arg2) {
        field3993++;
        if (arg1 <= 73) {
            method1924(-54, 19, null, -29, 56, 51);
        }
        if (arg0) {
            class581.field7916++;
            class778.method4320(27737);
        }
        if (arg2) {
            class728.field10201++;
            class570.method3300(21);
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(BII)V")
    public final void method1923(byte arg0, int arg1, int arg2) {
        OpenGL.glFramebufferRenderbufferEXT(arg1, arg2, 36161, this.field3997);
        field3992++;
        this.field3999 = arg1;
        this.field3989 = arg2;
        if (arg0 != -46) {
            method1925((byte) 36);
        }
    }

    @OriginalMember(owner = "client!vw", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method1921(0);
        field4006++;
        super.finalize();
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(IILgt;III)V")
    public static final void method1924(int arg0, int arg1, class481 arg2, int arg3, int arg4, int arg5) {
        if (arg1 >= -122) {
            method1924(-23, 65, null, 79, -90, -116);
        }
        field3998++;
        if (arg5 < 1 || arg0 < 1 || arg5 > class596.field8090 - 2 || (class107.field1350 - 2) < arg0) {
            return;
        }
        if (class107.field1351 == null) {
            return;
        }
        class238 var6 = class441.field5923.method923(arg3, -1, arg5, arg4, arg0);
        if (var6 == null) {
            return;
        }
        if (var6 instanceof class132) {
            ((class132) var6).method983(-82, arg2);
            return;
        }
        if (var6 instanceof class119) {
            ((class119) var6).method933(-10283, arg2);
            return;
        }
        if (var6 instanceof class491) {
            ((class491) var6).method2899(arg2, false);
            return;
        }
        if (var6 instanceof class440) {
            ((class440) var6).method2597(arg2, -24259);
            return;
        }
    }

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "(B)V")
    public static void method1925(byte arg0) {
        field3996 = null;
        if (arg0 != 70) {
            method1925((byte) 37);
        }
        field4001 = null;
        field3995 = null;
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(I)V")
    public final void method1219(int arg0) {
        OpenGL.glFramebufferRenderbufferEXT(this.field3999, this.field3989, 36161, 0);
        field4003++;
        this.field3989 = -1;
        this.field3999 = -1;
        if (arg0 > -96) {
            method1925((byte) -48);
        }
    }

    @OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(Lpc;III)V")
    public class322(class700 arg0, int arg1, int arg2, int arg3) {
        this.field4002 = arg0;
        this.field3991 = arg2;
        this.field4007 = arg1;
        this.field4004 = arg3;
        OpenGL.glGenRenderbuffersEXT(1, class3.field40, 0);
        this.field3997 = class3.field40[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field3997);
        OpenGL.glRenderbufferStorageEXT(36161, this.field4007, this.field3991, this.field4004);
        this.field3990 = this.field3991 * this.field4004 * this.field4002.method3900((byte) 87, this.field4007);
    }

    @OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(Lpc;IIII)V")
    public class322(class700 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4004 = arg3;
        this.field3991 = arg2;
        this.field4007 = arg1;
        this.field4002 = arg0;
        OpenGL.glGenRenderbuffersEXT(1, class3.field40, 0);
        this.field3997 = class3.field40[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field3997);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field4007, this.field3991, this.field4004);
        this.field3990 = this.field4004 * this.field3991 * this.field4002.method3900((byte) 70, this.field4007);
    }
}
