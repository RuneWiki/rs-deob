import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class35 extends class53 implements class103 {

    @OriginalMember(owner = "client!na", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!na", name = "finalize", descriptor = "()V", line = 6)
    protected final void finalize() {
        class260.method1672((byte) 50, this);
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lqa;I)V", line = 8)
    public class35(class163 arg0, int arg1) {
        this.method276(arg0, arg1);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "()V")
    public final native void method274();

    @OriginalMember(owner = "client!na", name = "H", descriptor = "()V")
    public final native void method275();

    @OriginalMember(owner = "client!na", name = "EA", descriptor = "()V")
    public final native void method101();

    @OriginalMember(owner = "client!na", name = "T", descriptor = "(Lqa;I)V")
    private final native void method276(class163 arg0, int arg1);
}
