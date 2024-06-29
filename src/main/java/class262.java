import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class262 extends class696 implements class550 {

    @OriginalMember(owner = "client!oca", name = "A", descriptor = "I")
    private int field3828;

    @OriginalMember(owner = "client!oca", name = "z", descriptor = "I")
    private int field3827;

    @OriginalMember(owner = "client!oca", name = "F", descriptor = "I")
    private int field3831;

    @OriginalMember(owner = "client!oca", name = "D", descriptor = "I")
    public static int field3830 = 0;

    @OriginalMember(owner = "client!oca", name = "w", descriptor = "[S")
    public static short[] field3824 = new short[256];

    @OriginalMember(owner = "client!oca", name = "y", descriptor = "J")
    public static volatile long field3826 = 0L;

    @OriginalMember(owner = "client!oca", name = "x", descriptor = "Z")
    public static volatile boolean field3825 = true;

    @OriginalMember(owner = "client!oca", name = "J", descriptor = "[I")
    public static int[] field3834 = new int[1000];

    @OriginalMember(owner = "client!oca", name = "G", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!oca", name = "I", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!oca", name = "C", descriptor = "Ltl;")
    public static class617 field3829;

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "(B)Ljj;")
    public static final class118 method1774(byte arg0) {
        if (arg0 < 49) {
            return null;
        } else {
            ++field3833;
            try {
                return (class118) Class.forName("pha").newInstance();
            } catch (Throwable var1) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Leea;Lkca;III[B)V")
    public class262(class132 arg0, class82 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class438.field6117, arg2 * arg3 * arg4, false);
        this.field3828 = arg3;
        this.field3827 = arg2;
        this.field3831 = arg4;
        super.field9790.method2732(-60, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field9787, 0, this.method3910(0), this.field3827, this.field3828, this.field3831, 0, class491.method2955(super.field9780, false), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "(I)V")
    public static void method1775(int arg0) {
        field3834 = null;
        if (arg0 > -47) {
            field3834 = null;
        }
        field3824 = null;
        field3829 = null;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(ILdm;)V")
    public static final void method1776(int arg0, class50 arg1) {
        if (~class214.field3063 == ~arg1.field787) {
            class329.field4646[arg1.field794] = true;
        }
        if (arg0 == 0) {
            ++field3832;
        }
    }
}
