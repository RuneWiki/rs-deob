import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class479 extends class396 {

    @OriginalMember(owner = "client!ar", name = "C", descriptor = "I")
    private int field7050;

    @OriginalMember(owner = "client!ar", name = "x", descriptor = "I")
    public static int field7045;

    @OriginalMember(owner = "client!ar", name = "z", descriptor = "I")
    public static int field7047;

    @OriginalMember(owner = "client!ar", name = "B", descriptor = "I")
    public static int field7049;

    @OriginalMember(owner = "client!ar", name = "D", descriptor = "I")
    public static int field7051;

    @OriginalMember(owner = "client!ar", name = "E", descriptor = "I")
    public static int field7052;

    @OriginalMember(owner = "client!ar", name = "y", descriptor = "Lfs;")
    public static class387 field7046;

    @OriginalMember(owner = "client!ar", name = "A", descriptor = "Z")
    public static boolean field7048;

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "(I)V", line = 4)
    public static final void method2891(int arg0) {
        class303.field4325 = class307.field4366.field4493 + class307.field4366.field4488 - -2;
        ++field7052;
        class319.field4518 = class387.field5731.field4493 + class387.field5731.field4488 + 2;
        class474.field6989 = new String[500];
        for (int var1 = 0; var1 < class474.field6989.length; ++var1) {
            class474.field6989[var1] = "";
        }
        int var2 = -108 / ((-22 - arg0) / 49);
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(BZ)V", line = 23)
    public final void method2892(byte arg0, boolean arg1) {
        super.field5800.method2188((byte) 78, this);
        if (arg0 != 35) {
            this.method2892((byte) -40, false);
        }
        ++field7051;
        OpenGL.glTexParameteri(super.field5801, 10242, arg1 ? 10497 : 33071);
    }

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "(I)V", line = 35)
    public static void method2893(int arg0) {
        if (arg0 <= -15) {
            field7046 = null;
        }
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lfd;II[BI)V", line = 52)
    public class479(class365 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field7050 = arg2;
        super.field5800.method2188((byte) 78, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field5801, 0, super.field5804, this.field7050, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2421(117, true);
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V", line = 67)
    public final void method1628(int arg0) {
        ++field7047;
        if (arg0 < 121) {
            field7048 = true;
        }
    }
}
