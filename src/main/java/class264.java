import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public class class264 {

    @OriginalMember(owner = "client!bfa", name = "e", descriptor = "I")
    private int field3728;

    @OriginalMember(owner = "client!bfa", name = "d", descriptor = "Lin;")
    public static class380 field3727 = new class380(109, 7);

    @OriginalMember(owner = "client!bfa", name = "g", descriptor = "Lgca;")
    public static class705 field3730 = new class705();

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!bfa", name = "c", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!bfa", name = "f", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(CI)V", line = 3)
    public final void method1700(char arg0, int arg1) {
        field3724++;
        if (arg1 == 3711) {
            OpenGL.glCallList(this.field3728 + arg0);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(B)V", line = 14)
    public final void method1701(byte arg0) {
        field3726++;
        OpenGL.glEndList();
        if (arg0 <= 66) {
            this.method1704(34, 119);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I)V", line = 25)
    public static void method1702(int arg0) {
        if (arg0 != 13706) {
            method1702(-24);
        }
        field3730 = null;
        field3727 = null;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IIIIIII)V", line = 42)
    public static final void method1703(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3729++;
        if (arg5 != -2) {
            field3730 = null;
        }
        if (class742.field10301 <= arg6 && arg4 <= class435.field6058 && class515.field7102 <= arg3 && class698.field9801 >= arg1) {
            if (arg2 == 1) {
                class110.method878(arg0, arg4, arg3, true, arg6, arg1);
            } else {
                class177.method1294(arg1, arg4, arg0, arg3, (byte) -30, arg6, arg2);
            }
        } else if (arg2 == 1) {
            class326.method1983(arg3, arg4, arg6, arg0, arg1, -74);
        } else {
            class539.method3127(arg1, arg2, arg4, arg3, arg0, arg6, 1);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(II)V", line = 73)
    public final void method1704(int arg0, int arg1) {
        field3725++;
        OpenGL.glNewList(this.field3728 + arg0, 4864);
        if (arg1 >= -105) {
            this.method1700((char) 65496, 94);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(Llea;I)V", line = 87)
    public class264(class573 arg0, int arg1) {
        this.field3728 = OpenGL.glGenLists(arg1);
    }
}
