import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public class class569 extends class599 {

    @OriginalMember(owner = "client!kga", name = "F", descriptor = "I")
    private int field8061 = -1;

    @OriginalMember(owner = "client!kga", name = "I", descriptor = "I")
    private int field8064 = -1;

    @OriginalMember(owner = "client!kga", name = "B", descriptor = "I")
    public int field8057;

    @OriginalMember(owner = "client!kga", name = "z", descriptor = "I")
    public int field8055;

    @OriginalMember(owner = "client!kga", name = "C", descriptor = "I")
    public int field8058;

    @OriginalMember(owner = "client!kga", name = "A", descriptor = "I")
    public static int field8056 = 0;

    @OriginalMember(owner = "client!kga", name = "D", descriptor = "Lft;")
    public static class4 field8059 = null;

    @OriginalMember(owner = "client!kga", name = "E", descriptor = "I")
    public static int field8060;

    @OriginalMember(owner = "client!kga", name = "H", descriptor = "I")
    public static int field8063;

    @OriginalMember(owner = "client!kga", name = "J", descriptor = "I")
    public static int field8065;

    @OriginalMember(owner = "client!kga", name = "G", descriptor = "Lqda;")
    public static class112 field8062;

    @OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(Lkv;IIII[BI)V", line = 6)
    public class569(class280 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg3 * arg4 * arg2, false);
        this.field8057 = arg2;
        this.field8055 = arg3;
        this.field8058 = arg4;
        super.field8449.method1840(this, 2205);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field8452, 0, super.field8444, this.field8057, this.field8055, this.field8058, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method3468(0, true);
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(B)V", line = 21)
    public static void method3305(byte arg0) {
        field8062 = null;
        field8059 = null;
        if (arg0 != 38) {
            field8060 = 121;
        }
    }

    @OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(Lkv;IIII)V", line = 32)
    public class569(class280 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field8058 = arg4;
        this.field8057 = arg2;
        this.field8055 = arg3;
        super.field8449.method1840(this, 2205);
        OpenGL.glTexImage3Dub(super.field8452, 0, super.field8444, this.field8057, this.field8055, this.field8058, 0, class422.method2523(super.field8444, 123), 5121, (byte[]) null, 0);
        this.method3468(0, true);
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(B)V", line = 48)
    public final void method1255(byte arg0) {
        OpenGL.glFramebufferTexture3DEXT(this.field8064, this.field8061, super.field8452, 0, 0, 0);
        ++field8063;
        this.field8061 = -1;
        int var2 = -94 % ((arg0 - -34) / 63);
        this.field8064 = -1;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIIBIIII)V", line = 76)
    public final void method3306(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        super.field8449.method1840(this, 2205);
        ++field8065;
        OpenGL.glCopyTexSubImage3D(super.field8452, 0, arg0, arg4, arg1, arg7, arg5, arg6, arg2);
        OpenGL.glFlush();
        int var9 = -18 % ((arg3 - -47) / 36);
    }
}
