import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class262 extends class16 implements class276 {

    @OriginalMember(owner = "client!ba", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ba", name = "ta", descriptor = "(Lh;I)V")
    private final native void method1582(class469 arg0, int arg1);

    @OriginalMember(owner = "client!ba", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class475.method2732(false, this);
    }

    @OriginalMember(owner = "client!ba", name = "ya", descriptor = "()V")
    public final native void method109();

    @OriginalMember(owner = "client!ba", name = "KA", descriptor = "()V")
    public final native void method1583();

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lh;I)V")
    public class262(class469 arg0, int arg1) {
        this.method1582(arg0, arg1);
    }

    @OriginalMember(owner = "client!ba", name = "ka", descriptor = "()V")
    public final native void method1584();
}
