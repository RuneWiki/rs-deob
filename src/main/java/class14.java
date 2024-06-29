import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class14 extends class623 implements class419 {

    @OriginalMember(owner = "client!ds", name = "y", descriptor = "I")
    private int field113 = -1;

    @OriginalMember(owner = "client!ds", name = "I", descriptor = "I")
    private int field122 = -1;

    @OriginalMember(owner = "client!ds", name = "E", descriptor = "I")
    private int field119;

    @OriginalMember(owner = "client!ds", name = "B", descriptor = "I")
    public int field116;

    @OriginalMember(owner = "client!ds", name = "z", descriptor = "Lnv;")
    private class417 field114;

    @OriginalMember(owner = "client!ds", name = "H", descriptor = "I")
    public int field121;

    @OriginalMember(owner = "client!ds", name = "A", descriptor = "I")
    private int field115;

    @OriginalMember(owner = "client!ds", name = "x", descriptor = "I")
    private int field112;

    @OriginalMember(owner = "client!ds", name = "M", descriptor = "I")
    public static int field126 = 0;

    @OriginalMember(owner = "client!ds", name = "K", descriptor = "Z")
    public static boolean field124 = false;

    @OriginalMember(owner = "client!ds", name = "L", descriptor = "Lpia;")
    public static class94 field125 = new class94(68, 2);

    @OriginalMember(owner = "client!ds", name = "v", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!ds", name = "w", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!ds", name = "C", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!ds", name = "D", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!ds", name = "F", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!ds", name = "J", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!ds", name = "N", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(B)V", line = 7)
    public final void method65(byte arg0) {
        if (this.field115 > 0) {
            this.field114.method2585((byte) -117, this.field115, this.field112);
            this.field115 = 0;
        }
        field120++;
        int var2 = 51 % ((arg0 + 16) / 52);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V", line = 28)
    public final void method66(int arg0) {
        field118++;
        OpenGL.glFramebufferRenderbufferEXT(this.field113, this.field122, 36161, 0);
        int var2 = 105 % ((arg0 - 80) / 44);
        this.field113 = -1;
        this.field122 = -1;
    }

    @OriginalMember(owner = "client!ds", name = "finalize", descriptor = "()V", line = 43)
    protected final void finalize() throws Throwable {
        this.method65((byte) -120);
        field117++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "(B)V", line = 52)
    public static void method67(byte arg0) {
        if (arg0 == 100) {
            field125 = null;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(III)Z", line = 64)
    public static final boolean method68(int arg0, int arg1, int arg2) {
        if (arg2 != 36161) {
            method68(47, -110, 120);
        }
        field110++;
        return class484.method2925(-12944, arg1, arg0) & class691.method3898(arg1, arg0, (byte) -83);
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(III)V", line = 76)
    public final void method69(int arg0, int arg1, int arg2) {
        field111++;
        OpenGL.glFramebufferRenderbufferEXT(arg2, arg0, arg1, this.field115);
        this.field122 = arg0;
        this.field113 = arg2;
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lnv;III)V", line = 108)
    public class14(class417 arg0, int arg1, int arg2, int arg3) {
        this.field119 = arg1;
        this.field116 = arg3;
        this.field114 = arg0;
        this.field121 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, class672.field9543, 0);
        this.field115 = class672.field9543[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field115);
        OpenGL.glRenderbufferStorageEXT(36161, this.field119, this.field121, this.field116);
        this.field112 = this.field121 * this.field116 * this.field114.method2548(-109, this.field119);
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lnv;IIII)V", line = 134)
    public class14(class417 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field119 = arg1;
        this.field121 = arg2;
        this.field114 = arg0;
        this.field116 = arg3;
        OpenGL.glGenRenderbuffersEXT(1, class672.field9543, 0);
        this.field115 = class672.field9543[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field115);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field119, this.field121, this.field116);
        this.field112 = this.field121 * this.field116 * this.field114.method2548(-42, this.field119);
    }

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "(B)V", line = 90)
    public static final void method70(byte arg0) {
        field123++;
        class542.method3190((byte) -122);
        class149.field1652 = false;
        class119.method771(class542.field7804, (byte) 12, class236.field2806, class655.field9351, class183.field2187);
        if (arg0 < 95) {
            field124 = false;
        }
    }
}
