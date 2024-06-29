import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class72 extends class339 implements class412 {

    @OriginalMember(owner = "client!mea", name = "B", descriptor = "I")
    private int field851 = -1;

    @OriginalMember(owner = "client!mea", name = "I", descriptor = "I")
    private int field858 = -1;

    @OriginalMember(owner = "client!mea", name = "H", descriptor = "I")
    public int field857;

    @OriginalMember(owner = "client!mea", name = "v", descriptor = "I")
    private int field845;

    @OriginalMember(owner = "client!mea", name = "u", descriptor = "I")
    public int field844;

    @OriginalMember(owner = "client!mea", name = "w", descriptor = "Lag;")
    private class469 field846;

    @OriginalMember(owner = "client!mea", name = "G", descriptor = "I")
    private int field856;

    @OriginalMember(owner = "client!mea", name = "A", descriptor = "I")
    public int field850;

    @OriginalMember(owner = "client!mea", name = "C", descriptor = "[S")
    private static short[] field852 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!mea", name = "y", descriptor = "[S")
    private static short[] field848 = new short[] { -10304, 9104, 25485, 4620, 4540 };

    @OriginalMember(owner = "client!mea", name = "F", descriptor = "[S")
    private static short[] field855 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!mea", name = "K", descriptor = "[[S")
    public static short[][] field860 = new short[][] { field855, field848, field852 };

    @OriginalMember(owner = "client!mea", name = "L", descriptor = "I")
    public static int field861 = 0;

    @OriginalMember(owner = "client!mea", name = "x", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!mea", name = "z", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!mea", name = "D", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!mea", name = "E", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!mea", name = "J", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!mea", name = "d", descriptor = "(I)V", line = 11)
    public final void method394(int arg0) {
        if (arg0 >= -30) {
            return;
        }
        field849++;
        if (this.field856 > 0) {
            this.field846.method2622((byte) -78, this.field856, this.field850);
            this.field856 = 0;
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(I)V", line = 29)
    public final void method395(int arg0) {
        OpenGL.glFramebufferRenderbufferEXT(this.field858, this.field851, 36161, 0);
        field853++;
        this.field858 = -1;
        this.field851 = -1;
        if (arg0 != 33071) {
            field848 = null;
        }
    }

    @OriginalMember(owner = "client!mea", name = "finalize", descriptor = "()V", line = 52)
    protected final void finalize() throws Throwable {
        field847++;
        this.method394(-82);
        super.finalize();
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(III)V", line = 61)
    public final void method396(int arg0, int arg1, int arg2) {
        field854++;
        OpenGL.glFramebufferRenderbufferEXT(arg0, arg2, 36161, this.field856);
        this.field858 = arg0;
        if (arg1 != 23295) {
            method397(false);
        }
        this.field851 = arg2;
    }

    @OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Lag;III)V", line = 118)
    public class72(class469 arg0, int arg1, int arg2, int arg3) {
        this.field857 = arg3;
        this.field845 = arg1;
        this.field844 = arg2;
        this.field846 = arg0;
        OpenGL.glGenRenderbuffersEXT(1, class196.field2682, 0);
        this.field856 = class196.field2682[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field856);
        OpenGL.glRenderbufferStorageEXT(36161, this.field845, this.field844, this.field857);
        this.field850 = this.field844 * this.field857 * this.field846.method2626(this.field845, 6120);
    }

    @OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Lag;IIII)V", line = 144)
    public class72(class469 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field844 = arg2;
        this.field857 = arg3;
        this.field846 = arg0;
        this.field845 = arg1;
        OpenGL.glGenRenderbuffersEXT(1, class196.field2682, 0);
        this.field856 = class196.field2682[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field856);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field845, this.field844, this.field857);
        this.field850 = this.field857 * this.field844 * this.field846.method2626(this.field845, 6120);
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Z)V", line = 77)
    public static void method397(boolean arg0) {
        field852 = null;
        field855 = null;
        field848 = null;
        if (arg0) {
            field860 = null;
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Luq;Luq;I)V", line = 91)
    public static final void method398(class339 arg0, class339 arg1, int arg2) {
        field859++;
        if (arg1.field4562 != null) {
            arg1.method1982((byte) -24);
        }
        arg1.field4567 = arg0.field4567;
        if (arg2 == 36161) {
            arg1.field4562 = arg0;
            arg1.field4562.field4567 = arg1;
            arg1.field4567.field4562 = arg1;
        }
    }
}
