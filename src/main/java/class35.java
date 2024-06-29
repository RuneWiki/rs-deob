import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class35 extends class53 implements class103 {

    @OriginalMember(owner = "client!na", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!na", name = "T", descriptor = "(Lqa;I)V")
    private final native void method207(class163 arg0, int arg1);

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lqa;I)V")
    public class35(class163 arg0, int arg1) {
        this.method207(arg0, arg1);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "()V")
    public final native void method208();

    @OriginalMember(owner = "client!na", name = "H", descriptor = "()V")
    public final native void method209();

    @OriginalMember(owner = "client!na", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class1.method1(this, (byte) -31);
    }

    @OriginalMember(owner = "client!na", name = "EA", descriptor = "()V")
    public final native void method66();
}
