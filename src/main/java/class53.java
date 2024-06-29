import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class53 extends class128 {

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "I")
    private int field755 = -1;

    @OriginalMember(owner = "client!cl", name = "w", descriptor = "I")
    private int field757 = -1;

    @OriginalMember(owner = "client!cl", name = "A", descriptor = "I")
    public int field761;

    @OriginalMember(owner = "client!cl", name = "B", descriptor = "I")
    public int field762;

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "I")
    public int field760;

    @OriginalMember(owner = "client!cl", name = "y", descriptor = "Ltl;")
    public static class432 field759 = new class432(8);

    @OriginalMember(owner = "client!cl", name = "C", descriptor = "Lrb;")
    public static class283 field763 = new class283(77, 9);

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!cl", name = "x", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lpg;IIII[BI)V")
    public class53(class333 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field761 = arg3;
        this.field762 = arg4;
        this.field760 = arg2;
        super.field1978.method1977(this, true);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field1970, 0, super.field1972, this.field760, this.field761, this.field762, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method928(110, true);
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lpg;IIII)V")
    public class53(class333 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field761 = arg3;
        this.field760 = arg2;
        this.field762 = arg4;
        super.field1978.method1977(this, true);
        OpenGL.glTexImage3Dub(super.field1970, 0, super.field1972, this.field760, this.field761, this.field762, 0, class332.method1958(super.field1972, (byte) 116), 5121, (byte[]) null, 0);
        this.method928(96, true);
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "(B)V")
    public static void method345(byte arg0) {
        field763 = null;
        field759 = null;
        if (arg0 >= -126) {
            field763 = null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IBIIIIII)V")
    public final void method346(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        super.field1978.method1977(this, true);
        ++field758;
        OpenGL.glCopyTexSubImage3D(super.field1970, 0, arg0, arg5, arg2, arg4, arg3, arg7, arg6);
        if (arg1 == 120) {
            OpenGL.glFlush();
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)V")
    public final void method137(boolean arg0) {
        OpenGL.glFramebufferTexture3DEXT(this.field755, this.field757, super.field1970, 0, 0, 0);
        ++field756;
        this.field755 = -1;
        this.field757 = -1;
        if (arg0) {
            this.method346(-84, (byte) -68, 121, 80, -114, -50, -75, -75);
        }
    }
}
