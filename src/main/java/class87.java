import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class87 extends class396 {

    @OriginalMember(owner = "client!dv", name = "v", descriptor = "I")
    private int field1194 = -1;

    @OriginalMember(owner = "client!dv", name = "I", descriptor = "I")
    private int field1205 = -1;

    @OriginalMember(owner = "client!dv", name = "y", descriptor = "I")
    public int field1197;

    @OriginalMember(owner = "client!dv", name = "x", descriptor = "I")
    public int field1196;

    @OriginalMember(owner = "client!dv", name = "H", descriptor = "I")
    public int field1204;

    @OriginalMember(owner = "client!dv", name = "z", descriptor = "Lqs;")
    public static class605 field1198 = new class605();

    @OriginalMember(owner = "client!dv", name = "G", descriptor = "[I")
    public static int[] field1203 = new int[2048];

    @OriginalMember(owner = "client!dv", name = "w", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!dv", name = "A", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!dv", name = "F", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!dv", name = "C", descriptor = "Lwu;")
    public static class557 field1200;

    @OriginalMember(owner = "client!dv", name = "D", descriptor = "[[Lul;")
    public static class364[][] field1201;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V")
    public final void method527(int arg0) {
        OpenGL.glFramebufferTexture3DEXT(this.field1194, this.field1205, super.field5510, 0, 0, 0);
        ++field1195;
        this.field1205 = -1;
        this.field1194 = -1;
        if (arg0 <= 123) {
            field1198 = null;
        }
    }

    @OriginalMember(owner = "client!dv", name = "f", descriptor = "(I)V")
    public static void method528(int arg0) {
        field1201 = null;
        field1200 = null;
        field1203 = null;
        if (arg0 != 8850) {
            method528(103);
        }
        field1198 = null;
    }

    @OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Lep;IIII[BI)V")
    public class87(class371 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field1197 = arg3;
        this.field1196 = arg4;
        this.field1204 = arg2;
        super.field5514.method2154(this, -2);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field5510, 0, super.field5509, this.field1204, this.field1197, this.field1196, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2419(true, true);
    }

    @OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Lep;IIII)V")
    public class87(class371 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg3 * arg4 * arg2, false);
        this.field1197 = arg3;
        this.field1196 = arg4;
        this.field1204 = arg2;
        super.field5514.method2154(this, -2);
        OpenGL.glTexImage3Dub(super.field5510, 0, super.field5509, this.field1204, this.field1197, this.field1196, 0, class743.method4144(super.field5509, 6410), 5121, (byte[]) null, 0);
        this.method2419(true, true);
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIIIBIII)V")
    public final void method529(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        super.field5514.method2154(this, -2);
        ++field1199;
        OpenGL.glCopyTexSubImage3D(super.field5510, 0, arg0, arg3, arg1, arg7, arg6, arg5, arg2);
        OpenGL.glFlush();
        if (arg4 > -41) {
            this.method527(-21);
        }
    }
}
