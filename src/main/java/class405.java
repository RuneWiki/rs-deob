import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class405 extends class173 implements class89 {

    @OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!a", name = "ZA", descriptor = "()V")
    public final native void method2377();

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lda;I)V")
    public class405(class682 arg0, int arg1) {
        this.method2379(arg0, arg1);
    }

    @OriginalMember(owner = "client!a", name = "P", descriptor = "()V")
    public final native void method2378();

    @OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class146.method989((byte) 89, this);
        }
    }

    @OriginalMember(owner = "client!a", name = "wa", descriptor = "(Lda;I)V")
    private final native void method2379(class682 arg0, int arg1);

    @OriginalMember(owner = "client!a", name = "H", descriptor = "(Z)V")
    public final native void method80(boolean arg0);
}
