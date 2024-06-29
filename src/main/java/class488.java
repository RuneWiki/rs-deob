import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class488 implements class203 {

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    private int field6903 = -1;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "Lfu;")
    private class42 field6898;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public int field6896;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public int field6901;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    private int field6900;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    private int field6899;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    private int field6897;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "[I")
    private static int[] field6902 = new int[1];

    @OriginalMember(owner = "client!kd", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() throws Throwable {
        this.method2871();
        super.finalize();
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "()V", line = 8)
    public final void method88() {
        this.field6898.field557.glFramebufferRenderbufferEXT(36160, this.field6903, 36161, 0);
        this.field6903 = -1;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V", line = 16)
    public final void method2870(int arg0) {
        this.field6898.field557.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.field6899);
        this.field6903 = arg0;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "()V", line = 21)
    public final void method2871() {
        if (this.field6899 > 0) {
            this.field6898.method318(this.field6899, this.field6897);
            this.field6899 = 0;
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lfu;III)V", line = 38)
    public class488(class42 arg0, int arg1, int arg2, int arg3) {
        this.field6898 = arg0;
        this.field6896 = arg2;
        this.field6901 = arg3;
        this.field6900 = arg1;
        opengl var5 = this.field6898.field557;
        var5.glGenRenderbuffersEXT(1, field6902, 0);
        this.field6899 = field6902[0];
        var5.glBindRenderbufferEXT(36161, this.field6899);
        var5.glRenderbufferStorageEXT(36161, this.field6900, this.field6896, this.field6901);
        this.field6897 = this.field6901 * this.field6896 * this.field6898.method381(this.field6900);
    }
}
