import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class564 extends class37 implements class142 {

    @OriginalMember(owner = "client!a", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class409.method2220(this, (byte) 83);
        }
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lda;I)V", line = 12)
    public class564(class56 arg0, int arg1) {
        this.method3193(arg0, arg1);
    }

    @OriginalMember(owner = "client!a", name = "P", descriptor = "()V")
    public final native void method3191();

    @OriginalMember(owner = "client!a", name = "H", descriptor = "(Z)V")
    public final native void method59(boolean arg0);

    @OriginalMember(owner = "client!a", name = "ZA", descriptor = "()V")
    public final native void method3192();

    @OriginalMember(owner = "client!a", name = "wa", descriptor = "(Lda;I)V")
    private final native void method3193(class56 arg0, int arg1);
}
