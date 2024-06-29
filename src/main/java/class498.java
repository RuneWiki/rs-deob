import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class498 extends class125 implements class241 {

    @OriginalMember(owner = "client!ba", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ba", name = "ya", descriptor = "()V")
    public final native void method373();

    @OriginalMember(owner = "client!ba", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class313.method1863(this, -82);
    }

    @OriginalMember(owner = "client!ba", name = "KA", descriptor = "()V")
    public final native void method2982();

    @OriginalMember(owner = "client!ba", name = "ta", descriptor = "(Lh;I)V")
    private final native void method2983(class373 arg0, int arg1);

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lh;I)V")
    public class498(class373 arg0, int arg1) {
        this.method2983(arg0, arg1);
    }

    @OriginalMember(owner = "client!ba", name = "ka", descriptor = "()V")
    public final native void method2984();
}
