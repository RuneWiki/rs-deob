import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class629 extends class411 {

    @OriginalMember(owner = "client!saa", name = "x", descriptor = "I")
    private int field8752 = -1;

    @OriginalMember(owner = "client!saa", name = "C", descriptor = "I")
    private int field8757 = -1;

    @OriginalMember(owner = "client!saa", name = "D", descriptor = "I")
    public int field8758;

    @OriginalMember(owner = "client!saa", name = "A", descriptor = "I")
    public int field8755;

    @OriginalMember(owner = "client!saa", name = "B", descriptor = "I")
    public int field8756;

    @OriginalMember(owner = "client!saa", name = "w", descriptor = "I")
    public static int field8751;

    @OriginalMember(owner = "client!saa", name = "y", descriptor = "I")
    public static int field8753;

    @OriginalMember(owner = "client!saa", name = "z", descriptor = "I")
    public static int field8754;

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(IIIIIIII)V")
    public final void method3428(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field8753;
        super.field5807.method2120(-1, this);
        if (arg0 > -56) {
            this.method369(false);
        }
        OpenGL.glCopyTexSubImage3D(super.field5794, 0, arg1, arg6, arg4, arg2, arg3, arg5, arg7);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Leq;IIII[BI)V")
    public class629(class357 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);
        this.field8758 = arg3;
        this.field8755 = arg2;
        this.field8756 = arg4;
        super.field5807.method2120(-1, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field5794, 0, super.field5809, this.field8755, this.field8758, this.field8756, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2433(true, -87);
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(Z)V")
    public final void method369(boolean arg0) {
        ++field8754;
        OpenGL.glFramebufferTexture3DEXT(this.field8757, this.field8752, super.field5794, 0, 0, 0);
        if (!arg0) {
            this.field8756 = 20;
        }
        this.field8752 = -1;
        this.field8757 = -1;
    }

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Leq;IIII)V")
    public class629(class357 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field8755 = arg2;
        this.field8758 = arg3;
        this.field8756 = arg4;
        super.field5807.method2120(-1, this);
        OpenGL.glTexImage3Dub(super.field5794, 0, super.field5809, this.field8755, this.field8758, this.field8756, 0, class606.method3328(super.field5809, false), 5121, (byte[]) null, 0);
        this.method2433(true, -120);
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(I)Z")
    public static final boolean method3429(int arg0) {
        if (arg0 != 0) {
            return true;
        } else {
            ++field8751;
            if (class536.field7527) {
                try {
                    if ((Boolean) class193.method1213(-13481, "showingVideoAd", class745.field10393)) {
                        return false;
                    }
                    return true;
                } catch (Throwable var1) {
                }
            }
            return true;
        }
    }
}
