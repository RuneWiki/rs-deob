import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class203 implements class330 {

    @OriginalMember(owner = "client!rr", name = "h", descriptor = "I")
    private int field2870 = -1;

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "Lig;")
    private class132 field2867;

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "I")
    public int field2866;

    @OriginalMember(owner = "client!rr", name = "g", descriptor = "I")
    public int field2869;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "I")
    private int field2863;

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "I")
    private int field2865;

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "I")
    private int field2864;

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "[I")
    private static int[] field2868 = new int[1];

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V", line = 3)
    public final void method1418(int arg0) {
        this.field2867.field1918.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.field2865);
        this.field2870 = arg0;
    }

    @OriginalMember(owner = "client!rr", name = "finalize", descriptor = "()V", line = 10)
    protected final void finalize() throws Throwable {
        this.method1419();
        super.finalize();
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "()V", line = 16)
    public final void method434() {
        this.field2867.field1918.glFramebufferRenderbufferEXT(36160, this.field2870, 36161, 0);
        this.field2870 = -1;
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "()V", line = 29)
    public final void method1419() {
        if (this.field2865 > 0) {
            this.field2867.method975(this.field2865, this.field2864);
            this.field2865 = 0;
        }
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lig;III)V", line = 39)
    public class203(class132 arg0, int arg1, int arg2, int arg3) {
        this.field2867 = arg0;
        this.field2866 = arg2;
        this.field2869 = arg3;
        this.field2863 = arg1;
        opengl var5 = this.field2867.field1918;
        var5.glGenRenderbuffersEXT(1, field2868, 0);
        this.field2865 = field2868[0];
        var5.glBindRenderbufferEXT(36161, this.field2865);
        var5.glRenderbufferStorageEXT(36161, this.field2863, this.field2866, this.field2869);
        this.field2864 = this.field2869 * this.field2866 * this.field2867.method912(this.field2863);
    }
}
