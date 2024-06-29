import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public class class529 extends class148 {

    @OriginalMember(owner = "client!kba", name = "C", descriptor = "I")
    private int field7394;

    @OriginalMember(owner = "client!kba", name = "F", descriptor = "I")
    public static int field7397 = 0;

    @OriginalMember(owner = "client!kba", name = "E", descriptor = "[I")
    public static int[] field7396 = new int[32];

    @OriginalMember(owner = "client!kba", name = "G", descriptor = "Lim;")
    public static class353 field7398;

    @OriginalMember(owner = "client!kba", name = "y", descriptor = "I")
    public static int field7391;

    @OriginalMember(owner = "client!kba", name = "z", descriptor = "I")
    public static int field7392;

    @OriginalMember(owner = "client!kba", name = "B", descriptor = "I")
    public static int field7393;

    @OriginalMember(owner = "client!kba", name = "D", descriptor = "I")
    public static int field7395;

    @OriginalMember(owner = "client!kba", name = "d", descriptor = "(I)V")
    public static final void method2951(int arg0) {
        for (int var1 = 0; var1 < 5; ++var1) {
            class126.field1570[var1] = false;
        }
        ++field7395;
        class345.field4781 = arg0;
        class30.field482 = -1;
        class520.field7247 = 0;
        class621.field8952 = 1;
        class427.field5826 = -1;
    }

    @OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(Luq;II[BI)V")
    public class529(class313 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field7394 = arg2;
        super.field1926.method1884(this, -2);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field1907, 0, super.field1916, this.field7394, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method805(true, -91);
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(B)V")
    public final void method157(byte arg0) {
        ++field7391;
        if (arg0 < 97) {
            method2952(-34, 0, 14);
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(III)Z")
    public static final boolean method2952(int arg0, int arg1, int arg2) {
        ++field7393;
        if (arg1 != -1) {
            field7398 = null;
        }
        return ~(arg2 & 2048) != -1;
    }

    @OriginalMember(owner = "client!kba", name = "d", descriptor = "(B)V")
    public static void method2953(byte arg0) {
        field7398 = null;
        field7396 = null;
        int var1 = 50 % ((31 - arg0) / 59);
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(BZ)V")
    public final void method2954(byte arg0, boolean arg1) {
        ++field7392;
        super.field1926.method1884(this, -2);
        int var3 = 10 / ((18 - arg0) / 62);
        OpenGL.glTexParameteri(super.field1907, 10242, !arg1 ? 33071 : 10497);
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field7396[var1] = var0 + -1;
            var0 += var0;
        }
        field7398 = new class353(73, -1);
    }
}
