import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class23 extends class292 {

    @OriginalMember(owner = "client!an", name = "u", descriptor = "I")
    private int field207;

    @OriginalMember(owner = "client!an", name = "w", descriptor = "Lwd;")
    public static class272 field209 = new class272(1);

    @OriginalMember(owner = "client!an", name = "v", descriptor = "B")
    public static byte field208;

    @OriginalMember(owner = "client!an", name = "t", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!an", name = "x", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!an", name = "y", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!an", name = "z", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(ZI)V")
    public final void method102(boolean arg0, int arg1) {
        super.field3603.method2621(-2, this);
        ++field206;
        OpenGL.glTexParameteri(super.field3591, 10242, arg0 ? 10497 : 33071);
        int var3 = -72 % ((77 - arg1) / 47);
    }

    @OriginalMember(owner = "client!an", name = "e", descriptor = "(I)V")
    public static void method103(int arg0) {
        if (arg0 > -26) {
            method104(115, 3L);
        }
        field209 = null;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V")
    public final void method66(int arg0) {
        int var2 = 3 % ((arg0 - 80) / 44);
        ++field212;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IJ)V")
    public static final void method104(int arg0, long arg1) {
        ++field211;
        try {
            Thread.sleep(arg1);
            int var3 = -23 % ((48 - arg0) / 41);
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lnv;II[BI)V")
    public class23(class417 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field207 = arg2;
        super.field3603.method2621(-2, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field3591, 0, super.field3593, this.field207, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1742(true, 29646);
    }
}
