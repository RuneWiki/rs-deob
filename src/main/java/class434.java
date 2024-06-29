import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class434 extends class381 {

    @OriginalMember(owner = "client!iq", name = "C", descriptor = "I")
    private int field6462 = -1;

    @OriginalMember(owner = "client!iq", name = "v", descriptor = "I")
    private int field6456 = -1;

    @OriginalMember(owner = "client!iq", name = "y", descriptor = "I")
    public int field6459;

    @OriginalMember(owner = "client!iq", name = "z", descriptor = "I")
    public int field6460;

    @OriginalMember(owner = "client!iq", name = "B", descriptor = "I")
    public int field6461;

    @OriginalMember(owner = "client!iq", name = "w", descriptor = "I")
    public static int field6457 = 0;

    @OriginalMember(owner = "client!iq", name = "F", descriptor = "Ls;")
    public static class186 field6465 = new class186(92, 5);

    @OriginalMember(owner = "client!iq", name = "G", descriptor = "Ls;")
    public static class186 field6466 = new class186(5, 12);

    @OriginalMember(owner = "client!iq", name = "H", descriptor = "Lbj;")
    public static class162 field6467 = new class162(31, -1);

    @OriginalMember(owner = "client!iq", name = "J", descriptor = "S")
    public static short field6469 = 256;

    @OriginalMember(owner = "client!iq", name = "x", descriptor = "I")
    public static int field6458;

    @OriginalMember(owner = "client!iq", name = "D", descriptor = "I")
    public static int field6463;

    @OriginalMember(owner = "client!iq", name = "E", descriptor = "I")
    public static int field6464;

    @OriginalMember(owner = "client!iq", name = "I", descriptor = "Lao;")
    public static class191 field6468;

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lda;IIII)V")
    public class434(class44 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field6459 = arg3;
        this.field6460 = arg4;
        this.field6461 = arg2;
        super.field5575.method381((byte) 28, this);
        OpenGL.glTexImage3Dub(super.field5578, 0, super.field5568, this.field6461, this.field6459, this.field6460, 0, class174.method1201((byte) -57, super.field5568), 5121, (byte[]) null, 0);
        this.method2346(3, true);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lph;Lza;I)V")
    public static final void method2604(class459 arg0, class288 arg1, int arg2) {
        ++field6463;
        if (!class142.field2356) {
            arg1.method294(arg2);
            class229.field3552 = arg1.method374(class340.method2137(arg0, class237.field3656), true);
            class229.field3552.method159((class71.field1415 - class229.field3552.method147()) / 2, (class65.field1330 + -class229.field3552.method165()) / 2);
            class396.field6025 = arg1.method374(class340.method2137(arg0, class524.field7616), true);
            class396.field6025.method159((class71.field1415 + -class396.field6025.method147()) / 2, 18);
            class142.field2356 = true;
        }
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(Z)V")
    public static void method2605(boolean arg0) {
        field6467 = null;
        field6468 = null;
        if (!arg0) {
            field6468 = null;
        }
        field6466 = null;
        field6465 = null;
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lda;IIII[BI)V")
    public class434(class44 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field6461 = arg2;
        this.field6459 = arg3;
        this.field6460 = arg4;
        super.field5575.method381((byte) 28, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field5578, 0, super.field5568, this.field6461, this.field6459, this.field6460, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2346(3, true);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIIIIII)V")
    public final void method2606(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        super.field5575.method381((byte) 28, this);
        ++field6458;
        OpenGL.glCopyTexSubImage3D(super.field5578, arg1, arg7, arg5, arg4, arg6, arg3, arg0, arg2);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V")
    public final void method458(int arg0) {
        ++field6464;
        OpenGL.glFramebufferTexture3DEXT(this.field6456, this.field6462, super.field5578, 0, 0, 0);
        if (arg0 != 1) {
            this.method2606(54, -60, 110, -39, -20, 32, 77, -83);
        }
        this.field6462 = -1;
        this.field6456 = -1;
    }
}
