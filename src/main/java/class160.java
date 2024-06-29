import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class160 extends class65 implements class28 {

    @OriginalMember(owner = "client!c", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!c", name = "finalize", descriptor = "()V", line = 6)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class292.method1797(-94, this);
        }
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(La;I)V", line = 12)
    public class160(class530 arg0, int arg1) {
        this.method1149(arg0, arg1);
    }

    @OriginalMember(owner = "client!c", name = "za", descriptor = "()V")
    public final native void method1148();

    @OriginalMember(owner = "client!c", name = "NA", descriptor = "(Z)V")
    public final native void method63(boolean arg0);

    @OriginalMember(owner = "client!c", name = "v", descriptor = "(La;I)V")
    private final native void method1149(class530 arg0, int arg1);

    @OriginalMember(owner = "client!c", name = "O", descriptor = "()V")
    public final native void method1150();
}
