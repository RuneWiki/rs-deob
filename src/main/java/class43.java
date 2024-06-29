import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class43 extends class440 {

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
    private int field651 = -1;

    @OriginalMember(owner = "client!bd", name = "B", descriptor = "I")
    private int field657 = -1;

    @OriginalMember(owner = "client!bd", name = "D", descriptor = "I")
    public int field659;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
    public int field652;

    @OriginalMember(owner = "client!bd", name = "E", descriptor = "I")
    public int field660;

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "I")
    public static int field655 = 0;

    @OriginalMember(owner = "client!bd", name = "A", descriptor = "Lao;")
    public static class188 field656 = new class188(23, -1);

    @OriginalMember(owner = "client!bd", name = "G", descriptor = "I")
    public static int field662 = 0;

    @OriginalMember(owner = "client!bd", name = "F", descriptor = "I")
    public static int field661 = 0;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!bd", name = "C", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(Z)V")
    public static void method327(boolean arg0) {
        if (arg0) {
            field662 = -44;
        }
        field656 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIIIIB)V")
    public final void method328(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        if (arg7 < 0) {
            method327(false);
        }
        super.field6421.method2042(this, 0);
        ++field658;
        OpenGL.glCopyTexSubImage3D(super.field6424, 0, arg5, arg4, arg1, arg3, arg0, arg6, arg2);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lqg;IIII[BI)V")
    public class43(class321 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);
        this.field659 = arg2;
        this.field652 = arg3;
        this.field660 = arg4;
        super.field6421.method2042(this, 0);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field6424, 0, super.field6412, this.field659, this.field652, this.field660, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2673(-96, true);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V")
    public final void method329(boolean arg0) {
        ++field653;
        if (!arg0) {
            method330((byte) -73, (class162) null);
        }
        OpenGL.glFramebufferTexture3DEXT(this.field651, this.field657, super.field6424, 0, 0, 0);
        this.field657 = -1;
        this.field651 = -1;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lqg;IIII)V")
    public class43(class321 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field659 = arg2;
        this.field652 = arg3;
        this.field660 = arg4;
        super.field6421.method2042(this, 0);
        OpenGL.glTexImage3Dub(super.field6424, 0, super.field6412, this.field659, this.field652, this.field660, 0, class347.method2251(-49, super.field6412), 5121, (byte[]) null, 0);
        this.method2673(90, true);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLqa;)V")
    public static final void method330(byte arg0, class162 arg1) {
        if (arg0 != -21) {
            field655 = -25;
        }
        ++field654;
        if (class56.field818 != class95.field1558.field5538) {
            if (class36.field545 != null) {
                if (class175.method1259(class95.field1558.field5538, arg1, 2)) {
                    class56.field818 = class95.field1558.field5538;
                }
            }
        }
    }
}
