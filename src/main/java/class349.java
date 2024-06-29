import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class349 extends class454 {

    @OriginalMember(owner = "client!is", name = "y", descriptor = "I")
    private int field5159 = -1;

    @OriginalMember(owner = "client!is", name = "B", descriptor = "I")
    private int field5162 = -1;

    @OriginalMember(owner = "client!is", name = "v", descriptor = "I")
    public int field5156;

    @OriginalMember(owner = "client!is", name = "u", descriptor = "I")
    public int field5155;

    @OriginalMember(owner = "client!is", name = "x", descriptor = "I")
    public int field5158;

    @OriginalMember(owner = "client!is", name = "A", descriptor = "Lak;")
    public static class234 field5161 = new class234("Take", "Nehmen", "Prendre", "Pegar");

    @OriginalMember(owner = "client!is", name = "D", descriptor = "[I")
    public static int[] field5164 = new int[4096];

    @OriginalMember(owner = "client!is", name = "w", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!is", name = "z", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!is", name = "C", descriptor = "[[B")
    public static byte[][] field5163;

    @OriginalMember(owner = "client!is", name = "f", descriptor = "(I)V")
    public static void method2175(int arg0) {
        field5163 = null;
        field5161 = null;
        if (arg0 >= -110) {
            method2175(25);
        }
        field5164 = null;
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Lkd;IIII[BI)V")
    public class349(class188 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);
        this.field5156 = arg2;
        this.field5155 = arg3;
        this.field5158 = arg4;
        super.field6619.method1289(-19391, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field6610, 0, super.field6616, this.field5156, this.field5155, this.field5158, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2757(true, -112);
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Lkd;IIII)V")
    public class349(class188 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field5155 = arg3;
        this.field5158 = arg4;
        this.field5156 = arg2;
        super.field6619.method1289(-19391, this);
        OpenGL.glTexImage3Dub(super.field6610, 0, super.field6616, this.field5156, this.field5155, this.field5158, 0, class491.method2920((byte) -114, super.field6616), 5121, (byte[]) null, 0);
        this.method2757(true, -78);
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V")
    public final void method1031(int arg0) {
        ++field5160;
        OpenGL.glFramebufferTexture3DEXT(this.field5162, this.field5159, super.field6610, 0, 0, 0);
        this.field5162 = -1;
        if (arg0 < 98) {
            this.method2176(-83, 7, -58, -57, 53, 72, -29, 47);
        }
        this.field5159 = -1;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIIIIII)V")
    public final void method2176(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        super.field6619.method1289(arg5 ^ -22244, this);
        if (arg5 == 7517) {
            ++field5157;
            OpenGL.glCopyTexSubImage3D(super.field6610, 0, arg6, arg1, arg0, arg4, arg3, arg7, arg2);
            OpenGL.glFlush();
        }
    }
}
