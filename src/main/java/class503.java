import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class503 extends class188 {

    @OriginalMember(owner = "client!dw", name = "w", descriptor = "I")
    private int field7384 = -1;

    @OriginalMember(owner = "client!dw", name = "A", descriptor = "I")
    private int field7388 = -1;

    @OriginalMember(owner = "client!dw", name = "E", descriptor = "I")
    public int field7391;

    @OriginalMember(owner = "client!dw", name = "z", descriptor = "I")
    public int field7387;

    @OriginalMember(owner = "client!dw", name = "D", descriptor = "I")
    public int field7390;

    @OriginalMember(owner = "client!dw", name = "x", descriptor = "I")
    public static int field7385;

    @OriginalMember(owner = "client!dw", name = "y", descriptor = "I")
    public static int field7386;

    @OriginalMember(owner = "client!dw", name = "C", descriptor = "I")
    public static int field7389;

    @OriginalMember(owner = "client!dw", name = "F", descriptor = "I")
    public static int field7392;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(III)Lfk;")
    public static final class463 method2956(int arg0, int arg1, int arg2) {
        class61 var3 = class385.field5410[arg0][arg1][arg2];
        return var3 == null ? null : var3.field825;
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Lht;IIII[BI)V")
    public class503(class410 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field7391 = arg4;
        this.field7387 = arg2;
        this.field7390 = arg3;
        super.field2615.method2412((byte) 4, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field2613, 0, super.field2601, this.field7387, this.field7390, this.field7391, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1132(true, (byte) 62);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIIIIIII)V")
    public final void method2957(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = -48 / ((-48 - arg3) / 54);
        super.field2615.method2412((byte) 4, this);
        ++field7385;
        OpenGL.glCopyTexSubImage3D(super.field2613, 0, arg1, arg4, arg6, arg7, arg0, arg2, arg5);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)V")
    public final void method43(int arg0) {
        OpenGL.glFramebufferTexture3DEXT(this.field7384, this.field7388, super.field2613, 0, 0, 0);
        int var2 = 126 / ((-72 - arg0) / 38);
        ++field7392;
        this.field7388 = -1;
        this.field7384 = -1;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIBII)V")
    public static final void method2958(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        ++field7386;
        if (~class271.field3700 == -2) {
            class3.field26[class214.field3049 / 100].method3111(class81.field1148 - 8, class169.field2400 - 8);
        }
        if (~class271.field3700 == -3) {
            class3.field26[class214.field3049 / 100 + 4].method3111(class81.field1148 + -8, class169.field2400 + -8);
        }
        class232.method1354(-9536);
        if (arg2 != -32) {
            method2959(true);
        }
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Lht;IIII)V")
    public class503(class410 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);
        this.field7390 = arg3;
        this.field7387 = arg2;
        this.field7391 = arg4;
        super.field2615.method2412((byte) 4, this);
        OpenGL.glTexImage3Dub(super.field2613, 0, super.field2601, this.field7387, this.field7390, this.field7391, 0, class162.method1005(super.field2601, -55), 5121, (byte[]) null, 0);
        this.method1132(true, (byte) 62);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Z)V")
    public static final void method2959(boolean arg0) {
        ++field7389;
        if (class476.field6960 != null) {
            class476.field6960.method1986(true);
        }
        if (!arg0) {
            if (class254.field3531 != null) {
                class254.field3531.method1986(true);
            }
        }
    }
}
