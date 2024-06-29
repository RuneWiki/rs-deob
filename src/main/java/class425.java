import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class425 implements class268 {

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
    private int field6275 = -1;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "Lsq;")
    private class96 field6268;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
    public int field6274;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public int field6270;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    private int field6273;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    private int field6269;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
    private int field6272;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "[I")
    private static int[] field6271 = new int[1];

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V", line = 4)
    public final void method2636(int arg0) {
        this.field6268.field1156.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.field6269);
        this.field6275 = arg0;
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "()V", line = 9)
    public final void method2637() {
        if (this.field6269 > 0) {
            this.field6268.method580(this.field6269, this.field6272);
            this.field6269 = 0;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "()V", line = 17)
    public final void method1824() {
        this.field6268.field1156.glFramebufferRenderbufferEXT(36160, this.field6275, 36161, 0);
        this.field6275 = -1;
    }

    @OriginalMember(owner = "client!jn", name = "finalize", descriptor = "()V", line = 31)
    protected final void finalize() throws Throwable {
        this.method2637();
        super.finalize();
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Lsq;III)V", line = 39)
    public class425(class96 arg0, int arg1, int arg2, int arg3) {
        this.field6268 = arg0;
        this.field6274 = arg2;
        this.field6270 = arg3;
        this.field6273 = arg1;
        opengl var5 = this.field6268.field1156;
        var5.glGenRenderbuffersEXT(1, field6271, 0);
        this.field6269 = field6271[0];
        var5.glBindRenderbufferEXT(36161, this.field6269);
        var5.glRenderbufferStorageEXT(36161, this.field6273, this.field6274, this.field6270);
        this.field6272 = this.field6274 * this.field6270 * this.field6268.method577(this.field6273);
    }
}
