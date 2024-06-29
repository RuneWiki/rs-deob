import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class268 extends class210 {

    @OriginalMember(owner = "client!kv", name = "J", descriptor = "I")
    private int field3829 = -1;

    @OriginalMember(owner = "client!kv", name = "D", descriptor = "I")
    private int field3823 = -1;

    @OriginalMember(owner = "client!kv", name = "F", descriptor = "I")
    public int field3825;

    @OriginalMember(owner = "client!kv", name = "B", descriptor = "I")
    public int field3821;

    @OriginalMember(owner = "client!kv", name = "G", descriptor = "I")
    public int field3826;

    @OriginalMember(owner = "client!kv", name = "y", descriptor = "Lqfa;")
    public static class98 field3818 = new class98(18, 7);

    @OriginalMember(owner = "client!kv", name = "z", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!kv", name = "A", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!kv", name = "H", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!kv", name = "I", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!kv", name = "K", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!kv", name = "L", descriptor = "Lha;")
    public static class58 field3831;

    @OriginalMember(owner = "client!kv", name = "E", descriptor = "Lega;")
    public static class710 field3824;

    @OriginalMember(owner = "client!kv", name = "C", descriptor = "[[I")
    public static int[][] field3822;

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(II)V")
    public static final void method1745(int arg0, int arg1) {
        class601.field8434 = 1000000000L / (long) arg1;
        ++field3820;
        int var2 = -111 % ((arg0 - -59) / 40);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1746(int arg0, byte arg1, int arg2) {
        ++field3819;
        if (arg1 > -95) {
            field3822 = null;
        }
        return ~(arg2 & 32768) != -1;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)V")
    public final void method1299(int arg0) {
        ++field3827;
        OpenGL.glFramebufferTexture3DEXT(this.field3829, this.field3823, super.field2781, 0, 0, 0);
        if (arg0 < -38) {
            this.field3823 = -1;
            this.field3829 = -1;
        }
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Leea;IIII)V")
    public class268(class131 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);
        this.field3825 = arg4;
        this.field3821 = arg3;
        this.field3826 = arg2;
        super.field2761.method926(this, 90);
        OpenGL.glTexImage3Dub(super.field2781, 0, super.field2776, this.field3826, this.field3821, this.field3825, 0, class240.method1529(true, super.field2776), 5121, (byte[]) null, 0);
        this.method1297(true, false);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIIIIII)V")
    public final void method1747(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        super.field2761.method926(this, 48);
        ++field3828;
        OpenGL.glCopyTexSubImage3D(super.field2781, 0, arg4, arg1, arg2, arg5, arg6, arg3, arg7);
        OpenGL.glFlush();
        int var9 = -38 / ((43 - arg0) / 45);
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Leea;IIII[BI)V")
    public class268(class131 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field3821 = arg3;
        this.field3825 = arg4;
        this.field3826 = arg2;
        super.field2761.method926(this, 115);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field2781, 0, super.field2776, this.field3826, this.field3821, this.field3825, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1297(true, false);
    }

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "(I)V")
    public static void method1748(int arg0) {
        field3818 = null;
        if (arg0 == -1) {
            field3831 = null;
            field3824 = null;
            field3822 = null;
        }
    }
}
