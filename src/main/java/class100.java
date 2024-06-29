import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class100 extends class262 {

    @OriginalMember(owner = "client!og", name = "v", descriptor = "I")
    private int field1199;

    @OriginalMember(owner = "client!og", name = "x", descriptor = "Lfv;")
    public static class690 field1201 = new class690();

    @OriginalMember(owner = "client!og", name = "B", descriptor = "Ltt;")
    public static class338 field1204 = new class338(23, 12);

    @OriginalMember(owner = "client!og", name = "E", descriptor = "I")
    public static int field1207 = -1;

    @OriginalMember(owner = "client!og", name = "w", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!og", name = "y", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!og", name = "z", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!og", name = "C", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!og", name = "D", descriptor = "[[Lir;")
    public static class27[][] field1206;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "(I)I")
    public static final int method564(int arg0) {
        int var1 = 90 % ((arg0 - -76) / 32);
        ++field1202;
        return class103.field1226++;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
    public final void method395(int arg0) {
        ++field1200;
        if (arg0 != 33071) {
            this.method395(-101);
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lag;II[BI)V")
    public class100(class469 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field1199 = arg2;
        super.field3422.method2627(66, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field3417, 0, super.field3413, this.field1199, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1582(123, true);
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(ZI)V")
    public final void method565(boolean arg0, int arg1) {
        super.field3422.method2627(arg1 + -10122, this);
        ++field1203;
        OpenGL.glTexParameteri(super.field3417, arg1, !arg0 ? 33071 : 10497);
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(B)V")
    public static void method566(byte arg0) {
        field1204 = null;
        field1201 = null;
        field1206 = null;
        int var1 = 72 / ((-40 - arg0) / 63);
    }
}
