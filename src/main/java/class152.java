import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class152 implements class22 {

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    private int field1924 = -1;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "Lql;")
    private class346 field1923;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public int field1926;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public int field1925;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    private int field1922;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    private int field1921;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    private int field1927;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "[I")
    private static int[] field1920 = new int[1];

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "()V", line = 8)
    public final void method809() {
        if (this.field1921 > 0) {
            this.field1923.method2058(this.field1921, this.field1927);
            this.field1921 = 0;
        }
    }

    @OriginalMember(owner = "client!vf", name = "finalize", descriptor = "()V", line = 17)
    protected final void finalize() throws Throwable {
        this.method809();
        super.finalize();
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V", line = 22)
    public final void method810(int arg0) {
        this.field1923.field4697.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.field1921);
        this.field1924 = arg0;
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lql;III)V", line = 39)
    public class152(class346 arg0, int arg1, int arg2, int arg3) {
        this.field1923 = arg0;
        this.field1926 = arg2;
        this.field1925 = arg3;
        this.field1922 = arg1;
        opengl var5 = this.field1923.field4697;
        var5.glGenRenderbuffersEXT(1, field1920, 0);
        this.field1921 = field1920[0];
        var5.glBindRenderbufferEXT(36161, this.field1921);
        var5.glRenderbufferStorageEXT(36161, this.field1922, this.field1926, this.field1925);
        this.field1927 = this.field1926 * this.field1925 * this.field1923.method2079(this.field1922);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "()V", line = 32)
    public final void method119() {
        this.field1923.field4697.glFramebufferRenderbufferEXT(36160, this.field1924, 36161, 0);
        this.field1924 = -1;
    }
}
