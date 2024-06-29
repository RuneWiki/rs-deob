import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class264 extends class287 implements class411 {

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "I")
    private int field3588 = -1;

    @OriginalMember(owner = "client!lf", name = "y", descriptor = "I")
    private int field3593 = -1;

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "I")
    public int field3602;

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "I")
    private int field3605;

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "Lep;")
    private class371 field3592;

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "I")
    public int field3598;

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "I")
    private int field3589;

    @OriginalMember(owner = "client!lf", name = "B", descriptor = "I")
    private int field3596;

    @OriginalMember(owner = "client!lf", name = "A", descriptor = "Z")
    public static boolean field3595 = false;

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "I")
    public static int field3603 = 0;

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!lf", name = "C", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "Lhk;")
    public static class534 field3604;

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "Lwu;")
    public static class557 field3590;

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "Ljava/lang/Object;")
    public static Object field3594;

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "[Lcha;")
    public static class279[] field3599;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method1628(String arg0, int arg1) {
        if (arg1 != 0) {
            method1628(null, -99);
        }
        field3607++;
        return class512.method3061(10, true, arg0, true);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V")
    public final void method1629(boolean arg0) {
        if (arg0) {
            return;
        }
        if (this.field3589 > 0) {
            this.field3592.method2145(this.field3596, (byte) -106, this.field3589);
            this.field3589 = 0;
        }
        field3608++;
    }

    @OriginalMember(owner = "client!lf", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method1629(false);
        field3597++;
        super.finalize();
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
    public final void method527(int arg0) {
        if (arg0 < 123) {
            field3590 = null;
        }
        field3601++;
        OpenGL.glFramebufferRenderbufferEXT(this.field3588, this.field3593, 36161, 0);
        this.field3593 = -1;
        this.field3588 = -1;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lhg;B)V")
    public static final void method1630(class584 arg0, byte arg1) {
        if (arg1 != -19) {
            return;
        }
        if (arg0 instanceof class55) {
            class55 var2 = (class55) arg0;
            if (var2.field771 != null) {
                class615.method3612(class473.field6483.field9501 != var2.field9501, -62, var2);
            }
        } else if (arg0 instanceof class655) {
            class655 var3 = (class655) arg0;
            class557.method3309((byte) 114, class473.field6483.field9501 != var3.field9501, var3);
        }
        field3606++;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BII)V")
    public final void method1631(byte arg0, int arg1, int arg2) {
        OpenGL.glFramebufferRenderbufferEXT(arg2, arg1, 36161, this.field3589);
        field3600++;
        this.field3593 = arg1;
        if (arg0 > -23) {
            field3603 = -113;
        }
        this.field3588 = arg2;
    }

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "(I)V")
    public static void method1632(int arg0) {
        if (arg0 != -25572) {
            method1632(54);
        }
        field3594 = null;
        field3599 = null;
        field3590 = null;
        field3604 = null;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lep;III)V")
    public class264(class371 arg0, int arg1, int arg2, int arg3) {
        this.field3602 = arg2;
        this.field3605 = arg1;
        this.field3592 = arg0;
        this.field3598 = arg3;
        OpenGL.glGenRenderbuffersEXT(1, class271.field3664, 0);
        this.field3589 = class271.field3664[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field3589);
        OpenGL.glRenderbufferStorageEXT(36161, this.field3605, this.field3602, this.field3598);
        this.field3596 = this.field3598 * this.field3602 * this.field3592.method2219(true, this.field3605);
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lep;IIII)V")
    public class264(class371 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3602 = arg2;
        this.field3605 = arg1;
        this.field3598 = arg3;
        this.field3592 = arg0;
        OpenGL.glGenRenderbuffersEXT(1, class271.field3664, 0);
        this.field3589 = class271.field3664[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field3589);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field3605, this.field3602, this.field3598);
        this.field3596 = this.field3602 * this.field3598 * this.field3592.method2219(true, this.field3605);
    }
}
