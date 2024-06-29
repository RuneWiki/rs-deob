import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class195 implements class107 {

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    private int field2953 = -1;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "Lnm;")
    private class254 field2955;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public int field2948;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public int field2949;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    private int field2951;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    private int field2950;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    private int field2952;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "[I")
    private static int[] field2954 = new int[1];

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "()V", line = 4)
    public final void method309() {
        this.field2955.field3648.glFramebufferRenderbufferEXT(36160, this.field2953, 36161, 0);
        this.field2953 = -1;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V", line = 12)
    public final void method1336(int arg0) {
        this.field2955.field3648.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.field2950);
        this.field2953 = arg0;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "()V", line = 16)
    public final void method1337() {
        if (this.field2950 > 0) {
            this.field2955.method1610(this.field2950, this.field2952);
            this.field2950 = 0;
        }
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lnm;III)V", line = 35)
    public class195(class254 arg0, int arg1, int arg2, int arg3) {
        this.field2955 = arg0;
        this.field2948 = arg2;
        this.field2949 = arg3;
        this.field2951 = arg1;
        opengl var5 = this.field2955.field3648;
        var5.glGenRenderbuffersEXT(1, field2954, 0);
        this.field2950 = field2954[0];
        var5.glBindRenderbufferEXT(36161, this.field2950);
        var5.glRenderbufferStorageEXT(36161, this.field2951, this.field2948, this.field2949);
        this.field2952 = this.field2949 * this.field2948 * this.field2955.method1625(this.field2951);
    }

    @OriginalMember(owner = "client!kf", name = "finalize", descriptor = "()V", line = 30)
    protected final void finalize() throws Throwable {
        this.method1337();
        super.finalize();
    }
}
