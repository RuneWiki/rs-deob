import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class262 extends class16 implements class276 {

    @OriginalMember(owner = "client!ba", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ba", name = "ta", descriptor = "(Lh;I)V")
    private final native void method1740(class469 arg0, int arg1);

    @OriginalMember(owner = "client!ba", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class236.method1601(-114, this);
    }

    @OriginalMember(owner = "client!ba", name = "ka", descriptor = "()V")
    public final native void method1741();

    @OriginalMember(owner = "client!ba", name = "ya", descriptor = "()V")
    public final native void method60();

    @OriginalMember(owner = "client!ba", name = "KA", descriptor = "()V")
    public final native void method1742();

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lh;I)V")
    public class262(class469 arg0, int arg1) {
        this.method1740(arg0, arg1);
    }
}
