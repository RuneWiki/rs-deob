import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public class class51 extends class411 implements class529 {

    @OriginalMember(owner = "client!ya", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ya", name = "finalize", descriptor = "()V", line = 7)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class727.method4045(this, 13483);
        }
    }

    @OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(Loa;I)V", line = 12)
    public class51(class691 arg0, int arg1) {
        this.method459(arg0, arg1);
    }

    @OriginalMember(owner = "client!ya", name = "aa", descriptor = "(Loa;I)V")
    private final native void method459(class691 arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "ga", descriptor = "()V")
    public final native void method460();

    @OriginalMember(owner = "client!ya", name = "w", descriptor = "(Z)V")
    public final native void method107(boolean arg0);

    @OriginalMember(owner = "client!ya", name = "r", descriptor = "()V")
    public final native void method461();
}
