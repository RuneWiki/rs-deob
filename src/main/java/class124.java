import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class124 {

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "[I")
    public static int[] field1583;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "[[[B")
    public static byte[][][] field1585;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V")
    public static void method961(int arg0) {
        field1585 = null;
        field1583 = null;
        if (arg0 > -99) {
            field1585 = null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "([BILnv;I)Laja;")
    public static final class100 method962(byte[] arg0, int arg1, class439 arg2, int arg3) {
        field1581++;
        if (arg0 == null) {
            return null;
        }
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg3, var4);
        OpenGL.glProgramRawARB(arg3, 34933, arg0);
        int var5 = -86 / ((arg1 + 42) / 45);
        OpenGL.glGetIntegerv(34379, class425.field5635, 0);
        if (class425.field5635[0] == -1) {
            OpenGL.glBindProgramARB(arg3, 0);
            return new class100(arg2, arg3, var4);
        } else {
            OpenGL.glBindProgramARB(arg3, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IB)V")
    public static final void method963(int arg0, byte arg1) {
        field1582++;
        class396.field5130.method1694(arg0, arg1 ^ 0xFFFFFFD3);
        if (arg1 != 121) {
            field1585 = null;
        }
        class502.field7098.method1694(arg0, arg1 ^ 0xFFFFFFFD);
        class132.field1639.method1694(arg0, -104);
        class151.field1886.method1694(arg0, -30);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)Z")
    public static final boolean method964(byte arg0) {
        field1584++;
        int var1 = -42 / ((arg0 + 31) / 45);
        return class245.field2894 > 0;
    }
}
