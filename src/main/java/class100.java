import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public class class100 extends class254 {

    @OriginalMember(owner = "client!ofa", name = "w", descriptor = "I")
    private int field1216;

    @OriginalMember(owner = "client!ofa", name = "v", descriptor = "Z")
    public static boolean field1215 = true;

    @OriginalMember(owner = "client!ofa", name = "x", descriptor = "Ljj;")
    public static class398 field1217 = new class398(32, 2);

    @OriginalMember(owner = "client!ofa", name = "A", descriptor = "Lnn;")
    public static class446 field1220 = new class446(13, 19);

    @OriginalMember(owner = "client!ofa", name = "C", descriptor = "Lkca;")
    public static class537 field1221 = new class537();

    @OriginalMember(owner = "client!ofa", name = "u", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!ofa", name = "y", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!ofa", name = "z", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(ILd;)V")
    public static final void method543(int arg0, class176 arg1) {
        class397.field5666[arg0] = arg1;
    }

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "(IZ)V")
    public final void method544(int arg0, boolean arg1) {
        super.field3510.method3553((byte) -97, this);
        ++field1218;
        if (arg0 != 10497) {
            this.field1216 = 22;
        }
        OpenGL.glTexParameteri(super.field3500, 10242, !arg1 ? 33071 : 10497);
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(I)V")
    public final void method545(int arg0) {
        ++field1219;
        int var2 = 94 % ((-59 - arg0) / 52);
    }

    @OriginalMember(owner = "client!ofa", name = "<init>", descriptor = "(Lpea;II[BI)V")
    public class100(class641 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field1216 = arg2;
        super.field3510.method3553((byte) 26, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field3500, 0, super.field3502, this.field1216, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1592(94, true);
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(III)Z")
    public static final boolean method546(int arg0, int arg1, int arg2) {
        ++field1214;
        if (arg1 != 33071) {
            return false;
        } else {
            return class500.method2809(arg0, (byte) 11, arg2) | (458752 & arg0) != 0 || class528.method3000(arg0, (byte) 119, arg2);
        }
    }

    @OriginalMember(owner = "client!ofa", name = "c", descriptor = "(I)V")
    public static void method547(int arg0) {
        field1220 = null;
        field1217 = null;
        field1221 = null;
        if (arg0 != 26792) {
            field1215 = false;
        }
    }
}
