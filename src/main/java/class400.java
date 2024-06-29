import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class400 extends class508 implements class54 {

    @OriginalMember(owner = "client!pca", name = "w", descriptor = "I")
    private int field5013 = -1;

    @OriginalMember(owner = "client!pca", name = "z", descriptor = "I")
    private int field5016 = -1;

    @OriginalMember(owner = "client!pca", name = "E", descriptor = "I")
    private int field5021;

    @OriginalMember(owner = "client!pca", name = "y", descriptor = "I")
    public int field5015;

    @OriginalMember(owner = "client!pca", name = "G", descriptor = "Lqj;")
    private class548 field5023;

    @OriginalMember(owner = "client!pca", name = "C", descriptor = "I")
    public int field5019;

    @OriginalMember(owner = "client!pca", name = "A", descriptor = "I")
    private int field5017;

    @OriginalMember(owner = "client!pca", name = "F", descriptor = "I")
    public int field5022;

    @OriginalMember(owner = "client!pca", name = "s", descriptor = "Lfh;")
    public static class266 field5009 = new class266(0, 16);

    @OriginalMember(owner = "client!pca", name = "t", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!pca", name = "u", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!pca", name = "v", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!pca", name = "B", descriptor = "I")
    public static int field5018;

    @OriginalMember(owner = "client!pca", name = "D", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!pca", name = "H", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!pca", name = "x", descriptor = "Lhr;")
    public static class608 field5014;

    @OriginalMember(owner = "client!pca", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() throws Throwable {
        this.method2133((byte) 127);
        field5024++;
        super.finalize();
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(ILpl;)V", line = 15)
    public static final void method2132(int arg0, class612 arg1) {
        if (arg0 == 36161) {
            field5012++;
            class67.field908 = arg1;
        }
    }

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "(B)V", line = 26)
    public final void method2133(byte arg0) {
        if (this.field5017 > 0) {
            this.field5023.method3020(this.field5022, this.field5017, (byte) 119);
            this.field5017 = 0;
        }
        if (arg0 >= 124) {
            field5011++;
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(I)V", line = 53)
    public final void method216(int arg0) {
        OpenGL.glFramebufferRenderbufferEXT(this.field5013, this.field5016, 36161, 0);
        field5010++;
        this.field5013 = -1;
        this.field5016 = -1;
        if (arg0 != 29468) {
            this.method2135(75, -16, 92);
        }
    }

    @OriginalMember(owner = "client!pca", name = "i", descriptor = "(I)V", line = 66)
    public static void method2134(int arg0) {
        field5014 = null;
        field5009 = null;
        if (arg0 != 17519) {
            method2132(104, null);
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(III)V", line = 77)
    public final void method2135(int arg0, int arg1, int arg2) {
        OpenGL.glFramebufferRenderbufferEXT(arg2, arg1, 36161, this.field5017);
        field5018++;
        if (arg0 >= 117) {
            this.field5016 = arg1;
            this.field5013 = arg2;
        }
    }

    @OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(Lqj;III)V", line = 100)
    public class400(class548 arg0, int arg1, int arg2, int arg3) {
        this.field5021 = arg1;
        this.field5015 = arg3;
        this.field5023 = arg0;
        this.field5019 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, class368.field4673, 0);
        this.field5017 = class368.field4673[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field5017);
        OpenGL.glRenderbufferStorageEXT(36161, this.field5021, this.field5019, this.field5015);
        this.field5022 = this.field5015 * this.field5019 * this.field5023.method2963(-6402, this.field5021);
    }

    @OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(Lqj;IIII)V", line = 115)
    public class400(class548 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5019 = arg2;
        this.field5015 = arg3;
        this.field5021 = arg1;
        this.field5023 = arg0;
        OpenGL.glGenRenderbuffersEXT(1, class368.field4673, 0);
        this.field5017 = class368.field4673[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field5017);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field5021, this.field5019, this.field5015);
        this.field5022 = this.field5015 * this.field5019 * this.field5023.method2963(-6402, this.field5021);
    }
}
