import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class362 extends class128 {

    @OriginalMember(owner = "client!kq", name = "y", descriptor = "I")
    private int field4404 = -1;

    @OriginalMember(owner = "client!kq", name = "x", descriptor = "I")
    private int field4403 = -1;

    @OriginalMember(owner = "client!kq", name = "C", descriptor = "I")
    public int field4408;

    @OriginalMember(owner = "client!kq", name = "D", descriptor = "I")
    public int field4409;

    @OriginalMember(owner = "client!kq", name = "v", descriptor = "I")
    public int field4401;

    @OriginalMember(owner = "client!kq", name = "z", descriptor = "I")
    public static int field4405 = 0;

    @OriginalMember(owner = "client!kq", name = "A", descriptor = "Lbt;")
    public static class437 field4406 = new class437(10, 8);

    @OriginalMember(owner = "client!kq", name = "u", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!kq", name = "B", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!kq", name = "E", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!kq", name = "F", descriptor = "Ljava/lang/Object;")
    public static Object field4411;

    @OriginalMember(owner = "client!kq", name = "w", descriptor = "[Lpu;")
    public static class772[] field4402;

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "(B)V", line = 8)
    public static void method2083(byte arg0) {
        if (arg0 == 21) {
            field4411 = null;
            field4406 = null;
            field4402 = null;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIIIZII)V", line = 21)
    public final void method2084(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        ++field4400;
        super.field1709.method3975((byte) 116, this);
        if (arg5) {
            field4402 = null;
        }
        OpenGL.glCopyTexSubImage3D(super.field1710, 0, arg2, arg1, arg4, arg3, arg7, arg0, arg6);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lck;IIII[BI)V", line = 35)
    public class362(class733 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);
        this.field4408 = arg4;
        this.field4409 = arg2;
        this.field4401 = arg3;
        super.field1709.method3975((byte) 125, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field1710, 0, super.field1702, this.field4409, this.field4401, this.field4408, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method759(0, true);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(B)V", line = 53)
    public final void method760(byte arg0) {
        OpenGL.glFramebufferTexture3DEXT(this.field4404, this.field4403, super.field1710, 0, 0, 0);
        ++field4407;
        this.field4403 = -1;
        this.field4404 = -1;
        int var2 = -110 % ((arg0 - 65) / 52);
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lck;IIII)V", line = 69)
    public class362(class733 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field4401 = arg3;
        this.field4408 = arg4;
        this.field4409 = arg2;
        super.field1709.method3975((byte) 113, this);
        OpenGL.glTexImage3Dub(super.field1710, 0, super.field1702, this.field4409, this.field4401, this.field4408, 0, class316.method1848(super.field1702, -122), 5121, (byte[]) null, 0);
        this.method759(0, true);
    }
}
