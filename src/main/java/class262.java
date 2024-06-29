import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class262 extends class16 implements class276 {

    @OriginalMember(owner = "client!ba", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ba", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() {
        class379.method2355(4650, this);
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lh;I)V", line = 7)
    public class262(class469 arg0, int arg1) {
        this.method1696(arg0, arg1);
    }

    @OriginalMember(owner = "client!ba", name = "ka", descriptor = "()V")
    public final native void method1694();

    @OriginalMember(owner = "client!ba", name = "ya", descriptor = "()V")
    public final native void method59();

    @OriginalMember(owner = "client!ba", name = "KA", descriptor = "()V")
    public final native void method1695();

    @OriginalMember(owner = "client!ba", name = "ta", descriptor = "(Lh;I)V")
    private final native void method1696(class469 arg0, int arg1);
}
