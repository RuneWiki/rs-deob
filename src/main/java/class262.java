import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class262 extends class16 implements class276 {

    @OriginalMember(owner = "client!ba", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ba", name = "ta", descriptor = "(Lh;I)V")
    private final native void method1668(class468 arg0, int arg1);

    @OriginalMember(owner = "client!ba", name = "ya", descriptor = "()V")
    public final native void method75();

    @OriginalMember(owner = "client!ba", name = "ka", descriptor = "()V")
    public final native void method1669();

    @OriginalMember(owner = "client!ba", name = "KA", descriptor = "()V")
    public final native void method1670();

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lh;I)V")
    public class262(class468 arg0, int arg1) {
        this.method1668(arg0, arg1);
    }

    @OriginalMember(owner = "client!ba", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class284.method1787(-24204, this);
    }
}
