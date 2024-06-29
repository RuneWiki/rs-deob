import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public class class74 extends class254 implements class2 {

    @OriginalMember(owner = "client!ya", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ya", name = "w", descriptor = "(Z)V")
    public final native void method9(boolean arg0);

    @OriginalMember(owner = "client!ya", name = "r", descriptor = "()V")
    public final native void method632();

    @OriginalMember(owner = "client!ya", name = "aa", descriptor = "(Loa;I)V")
    private final native void method633(class406 arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "ga", descriptor = "()V")
    public final native void method634();

    @OriginalMember(owner = "client!ya", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class260.method1726(this, false);
        }
    }

    @OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(Loa;I)V")
    public class74(class406 arg0, int arg1) {
        this.method633(arg0, arg1);
    }
}
