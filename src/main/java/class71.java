import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public class class71 extends class254 implements class2 {

    @OriginalMember(owner = "client!ya", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ya", name = "w", descriptor = "(Z)V")
    public final native void method5(boolean arg0);

    @OriginalMember(owner = "client!ya", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class389.method2431(this, -95);
        }
    }

    @OriginalMember(owner = "client!ya", name = "r", descriptor = "()V")
    public final native void method655();

    @OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(Loa;I)V")
    public class71(class406 arg0, int arg1) {
        this.method656(arg0, arg1);
    }

    @OriginalMember(owner = "client!ya", name = "aa", descriptor = "(Loa;I)V")
    private final native void method656(class406 arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "ga", descriptor = "()V")
    public final native void method657();
}
