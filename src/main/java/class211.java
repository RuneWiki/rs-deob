import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class211 extends class128 {

    @OriginalMember(owner = "client!md", name = "z", descriptor = "I")
    private int field3010;

    @OriginalMember(owner = "client!md", name = "x", descriptor = "I")
    public static int field3008 = 0;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "Lrb;")
    public static class283 field3005 = new class283(8, 3);

    @OriginalMember(owner = "client!md", name = "A", descriptor = "Z")
    public static boolean field3011 = false;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!md", name = "w", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!md", name = "y", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!md", name = "B", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BZ)V", line = 3)
    public final void method1338(byte arg0, boolean arg1) {
        super.field1978.method1977(this, true);
        ++field3006;
        OpenGL.glTexParameteri(super.field1970, 10242, arg1 ? 10497 : 33071);
        if (arg0 <= 114) {
            field3008 = -67;
        }
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lpg;II[BI)V", line = 18)
    public class211(class333 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field3010 = arg2;
        super.field1978.method1977(this, true);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field1970, 0, super.field1972, this.field3010, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method928(124, true);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V", line = 32)
    public final void method137(boolean arg0) {
        if (arg0) {
            this.method137(false);
        }
        ++field3009;
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(I)V", line = 43)
    public static void method1339(int arg0) {
        if (arg0 == 3) {
            field3005 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(IB)V", line = 58)
    public static final void method1340(int arg0, byte arg1) {
        int var2 = -1 / ((arg1 - -28) / 51);
        ++field3007;
        class314 var3 = class177.method1213(false, 14, arg0);
        var3.method1811((byte) 86);
    }
}
