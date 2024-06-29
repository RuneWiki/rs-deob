import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class79 extends class195 implements class47 {

    @OriginalMember(owner = "client!ba", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ba", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class342.method2198(this, (byte) -50);
    }

    @OriginalMember(owner = "client!ba", name = "ka", descriptor = "()V")
    public final native void method515();

    @OriginalMember(owner = "client!ba", name = "ya", descriptor = "()V")
    public final native void method218();

    @OriginalMember(owner = "client!ba", name = "KA", descriptor = "()V")
    public final native void method516();

    @OriginalMember(owner = "client!ba", name = "ta", descriptor = "(Lh;I)V")
    private final native void method517(class161 arg0, int arg1);

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lh;I)V")
    public class79(class161 arg0, int arg1) {
        this.method517(arg0, arg1);
    }
}
