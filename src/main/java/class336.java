import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class336 implements class398 {

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
    private int field4615 = -1;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "Ltb;")
    private class227 field4618;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "I")
    public int field4617;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    public int field4616;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
    private int field4622;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
    private int field4620;

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
    private int field4619;

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "[I")
    private static int[] field4621 = new int[1];

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V")
    public final void method2149(int arg0) {
        this.field4618.field3184.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.field4620);
        this.field4615 = arg0;
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "()V")
    public final void method2150() {
        if (this.field4620 > 0) {
            this.field4618.method1536(this.field4620, this.field4619);
            this.field4620 = 0;
        }
    }

    @OriginalMember(owner = "client!wm", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method2150();
        super.finalize();
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "()V")
    public final void method152() {
        this.field4618.field3184.glFramebufferRenderbufferEXT(36160, this.field4615, 36161, 0);
        this.field4615 = -1;
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Ltb;III)V")
    public class336(class227 arg0, int arg1, int arg2, int arg3) {
        this.field4618 = arg0;
        this.field4617 = arg2;
        this.field4616 = arg3;
        this.field4622 = arg1;
        opengl var5 = this.field4618.field3184;
        var5.glGenRenderbuffersEXT(1, field4621, 0);
        this.field4620 = field4621[0];
        var5.glBindRenderbufferEXT(36161, this.field4620);
        var5.glRenderbufferStorageEXT(36161, this.field4622, this.field4617, this.field4616);
        this.field4619 = this.field4617 * this.field4616 * this.field4618.method1518(this.field4622);
    }
}
