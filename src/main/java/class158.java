import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class158 extends class64 implements class27 {

    @OriginalMember(owner = "client!c", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!c", name = "za", descriptor = "()V")
    public final native void method1020();

    @OriginalMember(owner = "client!c", name = "NA", descriptor = "(Z)V")
    public final native void method134(boolean arg0);

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(La;I)V")
    public class158(class530 arg0, int arg1) {
        this.method1021(arg0, arg1);
    }

    @OriginalMember(owner = "client!c", name = "v", descriptor = "(La;I)V")
    private final native void method1021(class530 arg0, int arg1);

    @OriginalMember(owner = "client!c", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class138.method926(this, -1);
        }
    }

    @OriginalMember(owner = "client!c", name = "O", descriptor = "()V")
    public final native void method1022();
}
