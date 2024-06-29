import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class26 extends class148 {

    @OriginalMember(owner = "client!mm", name = "z", descriptor = "I")
    private int field442 = -1;

    @OriginalMember(owner = "client!mm", name = "y", descriptor = "I")
    private int field441 = -1;

    @OriginalMember(owner = "client!mm", name = "B", descriptor = "I")
    public int field444;

    @OriginalMember(owner = "client!mm", name = "D", descriptor = "I")
    public int field446;

    @OriginalMember(owner = "client!mm", name = "C", descriptor = "I")
    public int field445;

    @OriginalMember(owner = "client!mm", name = "A", descriptor = "J")
    public static volatile long field443 = 0L;

    @OriginalMember(owner = "client!mm", name = "F", descriptor = "Ljava/lang/String;")
    public static String field448 = "";

    @OriginalMember(owner = "client!mm", name = "G", descriptor = "Lwg;")
    public static class58 field449 = new class58(8);

    @OriginalMember(owner = "client!mm", name = "K", descriptor = "Lg;")
    public static class513 field453 = null;

    @OriginalMember(owner = "client!mm", name = "J", descriptor = "[[I")
    public static int[][] field452 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!mm", name = "E", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!mm", name = "H", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!mm", name = "I", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Luq;IIII)V")
    public class26(class313 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field444 = arg2;
        this.field446 = arg3;
        this.field445 = arg4;
        super.field1926.method1884(this, -2);
        OpenGL.glTexImage3Dub(super.field1907, 0, super.field1916, this.field444, this.field446, this.field445, 0, class642.method3707(19512, super.field1916), 5121, (byte[]) null, 0);
        this.method805(true, -78);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIIIIII)V")
    public final void method156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        super.field1926.method1884(this, -2);
        ++field451;
        OpenGL.glCopyTexSubImage3D(super.field1907, arg2, arg6, arg5, arg3, arg1, arg0, arg4, arg7);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Luq;IIII[BI)V")
    public class26(class313 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field446 = arg3;
        this.field444 = arg2;
        this.field445 = arg4;
        super.field1926.method1884(this, -2);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field1907, 0, super.field1916, this.field444, this.field446, this.field445, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method805(true, -109);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V")
    public final void method157(byte arg0) {
        if (arg0 > 97) {
            ++field447;
            OpenGL.glFramebufferTexture3DEXT(this.field441, this.field442, super.field1907, 0, 0, 0);
            this.field442 = -1;
            this.field441 = -1;
        }
    }

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "(I)V")
    public static void method158(int arg0) {
        field449 = null;
        field452 = null;
        field453 = null;
        if (arg0 > 68) {
            field448 = null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IZ)V")
    public static final void method159(int arg0, boolean arg1) {
        for (class108 var2 = class395.field5459.method3473(-27089); var2 != null; var2 = class395.field5459.method3478((byte) 5)) {
            if (~((long) arg0) == ~(65535L & var2.field1401 >> 48)) {
                var2.method589(-8880);
            }
        }
        ++field450;
        if (arg1) {
            field452 = null;
        }
    }
}
