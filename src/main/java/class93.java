import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class93 extends class507 {

    @OriginalMember(owner = "client!rv", name = "E", descriptor = "I")
    private int field1091 = -1;

    @OriginalMember(owner = "client!rv", name = "F", descriptor = "I")
    private int field1092 = -1;

    @OriginalMember(owner = "client!rv", name = "G", descriptor = "I")
    public int field1093;

    @OriginalMember(owner = "client!rv", name = "B", descriptor = "I")
    public int field1088;

    @OriginalMember(owner = "client!rv", name = "L", descriptor = "I")
    public int field1098;

    @OriginalMember(owner = "client!rv", name = "I", descriptor = "Z")
    public static boolean field1095 = false;

    @OriginalMember(owner = "client!rv", name = "J", descriptor = "Lhb;")
    public static class629 field1096 = new class629(15, -1);

    @OriginalMember(owner = "client!rv", name = "A", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!rv", name = "C", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!rv", name = "D", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!rv", name = "H", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!rv", name = "K", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!rv", name = "M", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIIIBII)V", line = 9)
    public final void method588(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        super.field7377.method2295(-70, this);
        if (arg5 < 68) {
            this.field1091 = -26;
        }
        ++field1089;
        OpenGL.glCopyTexSubImage3D(super.field7373, 0, arg7, arg6, arg2, arg4, arg1, arg0, arg3);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IBILqf;)V", line = 23)
    public static final void method589(int arg0, byte arg1, int arg2, class593 arg3) {
        ++field1099;
        if (arg3 != null) {
            if (arg3.field8616 != null) {
                class86 var4 = new class86();
                var4.field976 = arg3;
                var4.field985 = arg3.field8616;
                class604.method3516(var4);
            }
            class595.field8697 = arg3.field8508;
            class192.field2529 = arg3.field8601;
            class259.field3692 = arg3.field8568;
            class17.field174 = arg2;
            class580.field8354 = arg0;
            class238.field3397 = arg3.field8593;
            class405.field6120 = arg3.field8579;
            if (arg1 != -27) {
                field1095 = true;
            }
            class169.field2063 = true;
            class33.method187(arg3, (byte) 124);
        }
    }

    @OriginalMember(owner = "client!rv", name = "g", descriptor = "(I)V", line = 55)
    public static void method590(int arg0) {
        if (arg0 != -1) {
            field1096 = null;
        }
        field1096 = null;
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lad;IIII)V", line = 130)
    public class93(class362 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field1093 = arg3;
        this.field1088 = arg2;
        this.field1098 = arg4;
        super.field7377.method2295(-56, this);
        OpenGL.glTexImage3Dub(super.field7373, 0, super.field7379, this.field1088, this.field1093, this.field1098, 0, class562.method3251(super.field7379, (byte) -121), 5121, (byte[]) null, 0);
        this.method3020(true, 0);
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lad;IIII[BI)V", line = 144)
    public class93(class362 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field1093 = arg3;
        this.field1098 = arg4;
        this.field1088 = arg2;
        super.field7377.method2295(-59, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field7373, 0, super.field7379, this.field1088, this.field1093, this.field1098, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method3020(true, 0);
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IZI)V", line = 73)
    public static final void method591(int arg0, boolean arg1, int arg2) {
        ++field1087;
        if (arg1) {
            field1096 = null;
        }
        class467 var3 = class541.method3144(arg2, (byte) -97, 12);
        var3.method2851(!arg1);
        var3.field6926 = arg0;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)V", line = 91)
    public final void method592(int arg0) {
        ++field1094;
        OpenGL.glFramebufferTexture3DEXT(this.field1092, this.field1091, super.field7373, 0, 0, arg0);
        this.field1092 = -1;
        this.field1091 = -1;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIZ)V", line = 102)
    public static final void method593(int arg0, int arg1, boolean arg2) {
        if (~class313.field4572 == -2) {
            class440.method2742(arg1, arg0, (byte) 110, class637.field9160);
        } else if (class313.field4572 == 2) {
            class311.method2060(-108, arg1, arg0);
        }
        ++field1090;
        class313.field4572 = 0;
        if (arg2) {
            method593(-113, -93, true);
        }
        class637.field9160 = null;
    }
}
