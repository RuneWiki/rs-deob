import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class719 extends class416 implements class605 {

    @OriginalMember(owner = "client!dw", name = "B", descriptor = "I")
    private int field10006 = -1;

    @OriginalMember(owner = "client!dw", name = "G", descriptor = "I")
    private int field10011 = -1;

    @OriginalMember(owner = "client!dw", name = "y", descriptor = "I")
    private int field10003;

    @OriginalMember(owner = "client!dw", name = "I", descriptor = "Lrda;")
    private class663 field10013;

    @OriginalMember(owner = "client!dw", name = "P", descriptor = "I")
    public int field10019;

    @OriginalMember(owner = "client!dw", name = "O", descriptor = "I")
    public int field10018;

    @OriginalMember(owner = "client!dw", name = "A", descriptor = "I")
    private int field10005;

    @OriginalMember(owner = "client!dw", name = "K", descriptor = "I")
    private int field10014;

    @OriginalMember(owner = "client!dw", name = "z", descriptor = "I")
    public static int field10004 = 104;

    @OriginalMember(owner = "client!dw", name = "M", descriptor = "I")
    public static int field10016 = 0;

    @OriginalMember(owner = "client!dw", name = "D", descriptor = "Ljava/lang/String;")
    public static String field10008 = null;

    @OriginalMember(owner = "client!dw", name = "L", descriptor = "Lht;")
    public static class582 field10015 = new class582(1, -1);

    @OriginalMember(owner = "client!dw", name = "R", descriptor = "I")
    public static int field10021 = 0;

    @OriginalMember(owner = "client!dw", name = "Q", descriptor = "Lkaa;")
    public static class47 field10020 = new class47(51, 4);

    @OriginalMember(owner = "client!dw", name = "S", descriptor = "F")
    public static float field10022;

    @OriginalMember(owner = "client!dw", name = "x", descriptor = "I")
    public static int field10002;

    @OriginalMember(owner = "client!dw", name = "C", descriptor = "I")
    public static int field10007;

    @OriginalMember(owner = "client!dw", name = "E", descriptor = "I")
    public static int field10009;

    @OriginalMember(owner = "client!dw", name = "F", descriptor = "I")
    public static int field10010;

    @OriginalMember(owner = "client!dw", name = "H", descriptor = "I")
    public static int field10012;

    @OriginalMember(owner = "client!dw", name = "N", descriptor = "I")
    public static int field10017;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIIII)V")
    public static final void method4029(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field10009++;
        class127 var5 = class760.method4231(arg0, -874792672, 8);
        var5.method1010(614);
        var5.field2092 = arg2;
        int var6 = 88 / ((arg1 + 28) / 43);
        var5.field2097 = arg3;
        var5.field2099 = arg4;
    }

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "(Z)V")
    public static void method4030(boolean arg0) {
        field10008 = null;
        field10020 = null;
        if (arg0) {
            field10004 = -90;
        }
        field10015 = null;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)V")
    public final void method4031(int arg0) {
        if (this.field10005 > 0) {
            this.field10013.method3591(-24474, this.field10014, this.field10005);
            this.field10005 = 0;
        }
        int var2 = -72 / ((arg0 + 5) / 58);
        field10002++;
    }

    @OriginalMember(owner = "client!dw", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method4031(78);
        field10010++;
        super.finalize();
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)V")
    public final void method2032(byte arg0) {
        OpenGL.glFramebufferRenderbufferEXT(this.field10011, this.field10006, 36161, 0);
        field10017++;
        if (arg0 <= 106) {
            this.method4031(-128);
        }
        this.field10011 = -1;
        this.field10006 = -1;
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Lrda;III)V")
    public class719(class663 arg0, int arg1, int arg2, int arg3) {
        this.field10003 = arg1;
        this.field10013 = arg0;
        this.field10019 = arg3;
        this.field10018 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, class302.field4292, 0);
        this.field10005 = class302.field4292[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field10005);
        OpenGL.glRenderbufferStorageEXT(36161, this.field10003, this.field10018, this.field10019);
        this.field10014 = this.field10019 * this.field10018 * this.field10013.method3648(this.field10003, 6407);
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Lrda;IIII)V")
    public class719(class663 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field10019 = arg3;
        this.field10003 = arg1;
        this.field10013 = arg0;
        this.field10018 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, class302.field4292, 0);
        this.field10005 = class302.field4292[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field10005);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field10003, this.field10018, this.field10019);
        this.field10014 = this.field10019 * this.field10018 * this.field10013.method3648(this.field10003, 6407);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(III)V")
    public final void method4032(int arg0, int arg1, int arg2) {
        field10007++;
        if (arg2 == -17846) {
            OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.field10005);
            this.field10011 = arg0;
            this.field10006 = arg1;
        }
    }
}
