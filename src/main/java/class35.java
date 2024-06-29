import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class35 extends class54 implements class105 {

    @OriginalMember(owner = "client!na", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!na", name = "T", descriptor = "(Lqa;I)V")
    private final native void method236(class166 arg0, int arg1);

    @OriginalMember(owner = "client!na", name = "H", descriptor = "()V")
    public final native void method237();

    @OriginalMember(owner = "client!na", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class438.method2701(-106, this);
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lqa;I)V")
    public class35(class166 arg0, int arg1) {
        this.method236(arg0, arg1);
    }

    @OriginalMember(owner = "client!na", name = "EA", descriptor = "()V")
    public final native void method119();

    @OriginalMember(owner = "client!na", name = "a", descriptor = "()V")
    public final native void method238();
}
