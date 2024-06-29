import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class540 extends class678 implements class670 {

    @OriginalMember(owner = "client!ht", name = "K", descriptor = "I")
    private int field7558 = -1;

    @OriginalMember(owner = "client!ht", name = "t", descriptor = "I")
    private int field7541 = -1;

    @OriginalMember(owner = "client!ht", name = "x", descriptor = "Lus;")
    private class1 field7545;

    @OriginalMember(owner = "client!ht", name = "I", descriptor = "I")
    private int field7556;

    @OriginalMember(owner = "client!ht", name = "E", descriptor = "I")
    public int field7552;

    @OriginalMember(owner = "client!ht", name = "A", descriptor = "I")
    public int field7548;

    @OriginalMember(owner = "client!ht", name = "w", descriptor = "I")
    private int field7544;

    @OriginalMember(owner = "client!ht", name = "J", descriptor = "I")
    public int field7557;

    @OriginalMember(owner = "client!ht", name = "D", descriptor = "I")
    public static int field7551 = 16777215;

    @OriginalMember(owner = "client!ht", name = "u", descriptor = "Lgw;")
    public static class155 field7542 = new class155();

    @OriginalMember(owner = "client!ht", name = "L", descriptor = "J")
    public static volatile long field7559 = 0L;

    @OriginalMember(owner = "client!ht", name = "s", descriptor = "I")
    public static int field7540;

    @OriginalMember(owner = "client!ht", name = "v", descriptor = "I")
    public static int field7543;

    @OriginalMember(owner = "client!ht", name = "y", descriptor = "I")
    public static int field7546;

    @OriginalMember(owner = "client!ht", name = "z", descriptor = "I")
    public static int field7547;

    @OriginalMember(owner = "client!ht", name = "B", descriptor = "I")
    public static int field7549;

    @OriginalMember(owner = "client!ht", name = "F", descriptor = "I")
    public static int field7553;

    @OriginalMember(owner = "client!ht", name = "G", descriptor = "I")
    public static int field7554;

    @OriginalMember(owner = "client!ht", name = "H", descriptor = "I")
    public static int field7555;

    @OriginalMember(owner = "client!ht", name = "C", descriptor = "J")
    public static long field7550;

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(Z)V")
    public final void method3115(boolean arg0) {
        if (this.field7544 > 0) {
            this.field7545.method118((byte) -36, this.field7557, this.field7544);
            this.field7544 = 0;
        }
        if (arg0) {
            this.method1612(-30);
        }
        field7543++;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(III)V")
    public final void method3116(int arg0, int arg1, int arg2) {
        OpenGL.glFramebufferRenderbufferEXT(arg1, arg0, arg2, this.field7544);
        field7547++;
        this.field7558 = arg0;
        this.field7541 = arg1;
    }

    @OriginalMember(owner = "client!ht", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method3115(false);
        field7549++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ht", name = "g", descriptor = "(I)V")
    public static void method3117(int arg0) {
        field7542 = null;
        if (arg0 != 0) {
            method3118(98, 25);
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(II)V")
    public static final void method3118(int arg0, int arg1) {
        field7546++;
        if (class50.field1186 == arg0) {
            return;
        }
        class675.field9604 = class218.field3316 = class498.field7098[arg0];
        class89.method875(arg1 + 20351);
        class198.field3080 = new int[class675.field9604][class218.field3316];
        class388.field5670 = new int[class675.field9604][class218.field3316];
        if (arg1 != -20476) {
            field7550 = -84L;
        }
        class674.field9598 = new int[4][class675.field9604 >> 3][class218.field3316 >> 3];
        for (int var2 = 0; var2 < 4; var2++) {
            class223.field3352[var2] = class633.method3611(class675.field9604, -18, class218.field3316);
        }
        class483.field6917 = new byte[4][class675.field9604][class218.field3316];
        class694.method3887(class675.field9604, class218.field3316, arg1 ^ 0x4F9F, 4);
        class597.method3400(class218.field3316 >> 3, class623.field9017, class675.field9604 >> 3, arg1 + 20481);
        class50.field1186 = arg0;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)V")
    public final void method1612(int arg0) {
        if (arg0 < 114) {
            this.method1612(-30);
        }
        OpenGL.glFramebufferRenderbufferEXT(this.field7541, this.field7558, 36161, 0);
        field7554++;
        this.field7558 = -1;
        this.field7541 = -1;
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Lus;III)V")
    public class540(class1 arg0, int arg1, int arg2, int arg3) {
        this.field7545 = arg0;
        this.field7556 = arg1;
        this.field7552 = arg2;
        this.field7548 = arg3;
        OpenGL.glGenRenderbuffersEXT(1, class398.field5795, 0);
        this.field7544 = class398.field5795[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field7544);
        OpenGL.glRenderbufferStorageEXT(36161, this.field7556, this.field7552, this.field7548);
        this.field7557 = this.field7548 * this.field7552 * this.field7545.method124(true, this.field7556);
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Lus;IIII)V")
    public class540(class1 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7548 = arg3;
        this.field7545 = arg0;
        this.field7556 = arg1;
        this.field7552 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, class398.field5795, 0);
        this.field7544 = class398.field5795[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field7544);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field7556, this.field7552, this.field7548);
        this.field7557 = this.field7548 * this.field7552 * this.field7545.method124(true, this.field7556);
    }
}
