import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class650 extends class7 {

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "I")
    private int field9014 = -1;

    @OriginalMember(owner = "client!sk", name = "A", descriptor = "I")
    private int field9019 = -1;

    @OriginalMember(owner = "client!sk", name = "w", descriptor = "I")
    public int field9015;

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "I")
    public int field9013;

    @OriginalMember(owner = "client!sk", name = "E", descriptor = "I")
    public int field9023;

    @OriginalMember(owner = "client!sk", name = "y", descriptor = "Z")
    public static boolean field9017 = false;

    @OriginalMember(owner = "client!sk", name = "C", descriptor = "I")
    public static int field9021 = 0;

    @OriginalMember(owner = "client!sk", name = "x", descriptor = "I")
    public static int field9016;

    @OriginalMember(owner = "client!sk", name = "z", descriptor = "I")
    public static int field9018;

    @OriginalMember(owner = "client!sk", name = "B", descriptor = "I")
    public static int field9020;

    @OriginalMember(owner = "client!sk", name = "D", descriptor = "I")
    public static int field9022;

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Ldia;IIII[BI)V", line = 60)
    public class650(class246 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field9015 = arg3;
        this.field9013 = arg2;
        this.field9023 = arg4;
        super.field81.method1653((byte) 80, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field68, 0, super.field67, this.field9013, this.field9015, this.field9023, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method52(false, true);
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Ldia;IIII)V", line = 76)
    public class650(class246 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);
        this.field9023 = arg4;
        this.field9013 = arg2;
        this.field9015 = arg3;
        super.field81.method1653((byte) 121, this);
        OpenGL.glTexImage3Dub(super.field68, 0, super.field67, this.field9013, this.field9015, this.field9023, 0, class544.method3097(super.field67, 37), 5121, (byte[]) null, 0);
        this.method52(false, true);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZIIIIIII)V", line = 16)
    public final void method3623(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        super.field81.method1653((byte) 126, this);
        ++field9020;
        if (arg0) {
            OpenGL.glCopyTexSubImage3D(super.field68, 0, arg7, arg2, arg1, arg6, arg4, arg3, arg5);
            OpenGL.glFlush();
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V", line = 31)
    public final void method58(int arg0) {
        OpenGL.glFramebufferTexture3DEXT(this.field9019, this.field9014, super.field68, 0, 0, 0);
        ++field9022;
        this.field9019 = -1;
        this.field9014 = arg0;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(II)Z", line = 49)
    public static final boolean method3624(int arg0, int arg1) {
        if (arg1 != -1) {
            field9017 = false;
        }
        ++field9018;
        return arg0 == 0 || arg0 == 2;
    }
}
