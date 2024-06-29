import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class253 extends class346 implements class240 {

    @OriginalMember(owner = "client!na", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!na", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() {
        class371.method2212((byte) -72, this);
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lqa;I)V", line = 10)
    public class253(class131 arg0, int arg1) {
        this.method1508(arg0, arg1);
    }

    @OriginalMember(owner = "client!na", name = "T", descriptor = "(Lqa;I)V")
    private final native void method1508(class131 arg0, int arg1);

    @OriginalMember(owner = "client!na", name = "EA", descriptor = "()V")
    public final native void method471();

    @OriginalMember(owner = "client!na", name = "a", descriptor = "()V")
    public final native void method1509();

    @OriginalMember(owner = "client!na", name = "H", descriptor = "()V")
    public final native void method1510();
}
