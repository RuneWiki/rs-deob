import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class109 extends class15 implements class130 {

    @OriginalMember(owner = "client!g", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lw;I)V", line = 7)
    public class109(class199 arg0, int arg1) {
        this.method750(arg0, arg1);
    }

    @OriginalMember(owner = "client!g", name = "finalize", descriptor = "()V", line = 11)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class512.method3054(-118, this);
        }
    }

    @OriginalMember(owner = "client!g", name = "IA", descriptor = "()V")
    public final native void method749();

    @OriginalMember(owner = "client!g", name = "TA", descriptor = "(Lw;I)V")
    private final native void method750(class199 arg0, int arg1);

    @OriginalMember(owner = "client!g", name = "T", descriptor = "()V")
    public final native void method751();

    @OriginalMember(owner = "client!g", name = "p", descriptor = "()V")
    public final native void method540();
}
