import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class211 implements class351 {

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    private int field2968 = -1;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "Lks;")
    private class173 field2975;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "I")
    public int field2974;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public int field2969;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    private int field2970;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    private int field2971;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    private int field2973;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "[I")
    private static int[] field2972 = new int[1];

    @OriginalMember(owner = "client!q", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() throws Throwable {
        this.method1448();
        super.finalize();
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lks;III)V", line = 35)
    public class211(class173 arg0, int arg1, int arg2, int arg3) {
        this.field2975 = arg0;
        this.field2974 = arg2;
        this.field2969 = arg3;
        this.field2970 = arg1;
        opengl var5 = this.field2975.field2253;
        var5.glGenRenderbuffersEXT(1, field2972, 0);
        this.field2971 = field2972[0];
        var5.glBindRenderbufferEXT(36161, this.field2971);
        var5.glRenderbufferStorageEXT(36161, this.field2970, this.field2974, this.field2969);
        this.field2973 = this.field2974 * this.field2969 * this.field2975.method1201(this.field2970);
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "()V", line = 14)
    public final void method1448() {
        if (this.field2971 > 0) {
            this.field2975.method1144(this.field2971, this.field2973);
            this.field2971 = 0;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "()V", line = 30)
    public final void method419() {
        this.field2975.field2253.glFramebufferRenderbufferEXT(36160, this.field2968, 36161, 0);
        this.field2968 = -1;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V", line = 49)
    public final void method1449(int arg0) {
        this.field2975.field2253.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.field2971);
        this.field2968 = arg0;
    }
}
