import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class97 extends class517 implements class400 {

    @OriginalMember(owner = "client!g", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!g", name = "T", descriptor = "()V")
    public final native void method655();

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lw;I)V")
    public class97(class459 arg0, int arg1) {
        this.method657(arg0, arg1);
    }

    @OriginalMember(owner = "client!g", name = "p", descriptor = "()V")
    public final native void method175();

    @OriginalMember(owner = "client!g", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class431.method2721(this, false);
        }
    }

    @OriginalMember(owner = "client!g", name = "IA", descriptor = "()V")
    public final native void method656();

    @OriginalMember(owner = "client!g", name = "TA", descriptor = "(Lw;I)V")
    private final native void method657(class459 arg0, int arg1);
}
