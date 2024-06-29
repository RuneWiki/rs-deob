import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class601 extends class665 implements class521 {

    @OriginalMember(owner = "client!fj", name = "K", descriptor = "I")
    private int field8351 = -1;

    @OriginalMember(owner = "client!fj", name = "L", descriptor = "I")
    private int field8352 = -1;

    @OriginalMember(owner = "client!fj", name = "E", descriptor = "I")
    public int field8346;

    @OriginalMember(owner = "client!fj", name = "G", descriptor = "Len;")
    private class289 field8347;

    @OriginalMember(owner = "client!fj", name = "H", descriptor = "I")
    public int field8348;

    @OriginalMember(owner = "client!fj", name = "w", descriptor = "I")
    private int field8339;

    @OriginalMember(owner = "client!fj", name = "z", descriptor = "I")
    private int field8342;

    @OriginalMember(owner = "client!fj", name = "D", descriptor = "I")
    private int field8345;

    @OriginalMember(owner = "client!fj", name = "v", descriptor = "[I")
    public static int[] field8338 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!fj", name = "t", descriptor = "F")
    public static float field8336;

    @OriginalMember(owner = "client!fj", name = "u", descriptor = "I")
    public static int field8337;

    @OriginalMember(owner = "client!fj", name = "x", descriptor = "I")
    public static int field8340;

    @OriginalMember(owner = "client!fj", name = "y", descriptor = "I")
    public static int field8341;

    @OriginalMember(owner = "client!fj", name = "B", descriptor = "I")
    public static int field8343;

    @OriginalMember(owner = "client!fj", name = "C", descriptor = "I")
    public static int field8344;

    @OriginalMember(owner = "client!fj", name = "I", descriptor = "I")
    public static int field8349;

    @OriginalMember(owner = "client!fj", name = "J", descriptor = "I")
    public static int field8350;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IBI)V")
    public final void method3329(int arg0, byte arg1, int arg2) {
        if (arg1 == 44) {
            OpenGL.glFramebufferRenderbufferEXT(arg2, arg0, 36161, this.field8342);
            field8337++;
            this.field8352 = arg0;
            this.field8351 = arg2;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
    public final void method1953(int arg0) {
        OpenGL.glFramebufferRenderbufferEXT(this.field8351, this.field8352, 36161, 0);
        field8341++;
        this.field8351 = -1;
        this.field8352 = arg0;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)Z")
    public static final boolean method3330(int arg0, int arg1) {
        if (arg0 > -36) {
            return false;
        } else {
            field8344++;
            return arg1 == 10 || arg1 == 11 || arg1 == 12;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lfaa;BII)V")
    public static final void method3331(class140 arg0, byte arg1, int arg2, int arg3) {
        field8350++;
        if (class612.field8489 != null || class229.field3278 || arg0 == null || class432.method2483(-12062, arg0) == null) {
            return;
        }
        class612.field8489 = arg0;
        class152.field2271 = class432.method2483(-12062, arg0);
        class507.field6935 = false;
        if (arg1 != 112) {
            field8338 = null;
        }
        class156.field2359 = arg3;
        class364.field5202 = 0;
        class534.field7276 = arg2;
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(Z)V")
    public static void method3332(boolean arg0) {
        field8338 = null;
        if (!arg0) {
            field8336 = 0.5955671F;
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(B)V")
    public final void method3333(byte arg0) {
        field8340++;
        int var2 = -79 / ((60 - arg0) / 40);
        if (this.field8342 > 0) {
            this.field8347.method1739(this.field8342, 119, this.field8345);
            this.field8342 = 0;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IBII)V")
    public static final void method3334(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 >= -85) {
            return;
        }
        field8349++;
        int var4 = class274.field3872.field906 * arg3 >> 8;
        if (arg0 == -1 && !class267.field3792) {
            class634.method3526((byte) 112);
        } else if (arg0 != -1 && (class623.field8670 != arg0 || !class218.method1411((byte) 1)) && var4 != 0 && !class267.field3792) {
            class438.method2514(class74.field1027, arg2, var4, false, 0, (byte) 25, arg0);
        }
        class623.field8670 = arg0;
    }

    @OriginalMember(owner = "client!fj", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field8343++;
        this.method3333((byte) -112);
        super.finalize();
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Len;III)V")
    public class601(class289 arg0, int arg1, int arg2, int arg3) {
        this.field8346 = arg2;
        this.field8347 = arg0;
        this.field8348 = arg3;
        this.field8339 = arg1;
        OpenGL.glGenRenderbuffersEXT(1, class194.field2877, 0);
        this.field8342 = class194.field2877[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field8342);
        OpenGL.glRenderbufferStorageEXT(36161, this.field8339, this.field8346, this.field8348);
        this.field8345 = this.field8348 * this.field8346 * this.field8347.method1754(this.field8339, 83);
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Len;IIII)V")
    public class601(class289 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field8347 = arg0;
        this.field8346 = arg2;
        this.field8348 = arg3;
        this.field8339 = arg1;
        OpenGL.glGenRenderbuffersEXT(1, class194.field2877, 0);
        this.field8342 = class194.field2877[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field8342);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field8339, this.field8346, this.field8348);
        this.field8345 = this.field8348 * this.field8346 * this.field8347.method1754(this.field8339, 81);
    }
}
