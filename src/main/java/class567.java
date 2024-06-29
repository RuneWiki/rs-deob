import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class567 extends class158 {

    @OriginalMember(owner = "client!lda", name = "u", descriptor = "I")
    private int field8199;

    @OriginalMember(owner = "client!lda", name = "v", descriptor = "[Z")
    public static boolean[] field8200 = new boolean[100];

    @OriginalMember(owner = "client!lda", name = "x", descriptor = "[Lhl;")
    public static class396[] field8202 = new class396[16];

    @OriginalMember(owner = "client!lda", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field8201 = new String[100];

    @OriginalMember(owner = "client!lda", name = "t", descriptor = "Lwk;")
    public static class431 field8198 = new class431();

    @OriginalMember(owner = "client!lda", name = "A", descriptor = "Z")
    public static boolean field8205 = false;

    @OriginalMember(owner = "client!lda", name = "y", descriptor = "I")
    public static int field8203;

    @OriginalMember(owner = "client!lda", name = "z", descriptor = "I")
    public static int field8204;

    @OriginalMember(owner = "client!lda", name = "s", descriptor = "Lal;")
    public static class123 field8197;

    @OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(Lkw;II[BI)V")
    public class567(class346 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field8199 = arg2;
        super.field2275.method2164(6, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field2261, 0, super.field2272, this.field8199, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1131((byte) 42, true);
    }

    @OriginalMember(owner = "client!lda", name = "d", descriptor = "(B)V")
    public static void method3384(byte arg0) {
        field8200 = null;
        field8197 = null;
        field8201 = null;
        if (arg0 < 93) {
            method3384((byte) -82);
        }
        field8202 = null;
        field8198 = null;
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(B)V")
    public final void method463(byte arg0) {
        if (arg0 > -96) {
            field8205 = false;
        }
        ++field8204;
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(ZI)V")
    public final void method3385(boolean arg0, int arg1) {
        ++field8203;
        super.field2275.method2164(6, this);
        int var3 = -8 % ((-32 - arg1) / 55);
        OpenGL.glTexParameteri(super.field2261, 10242, !arg0 ? 33071 : 10497);
    }
}
