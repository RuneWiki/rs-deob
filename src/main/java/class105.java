import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class105 extends class424 implements class416 {

    @OriginalMember(owner = "client!d", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!d", name = "pa", descriptor = "()V")
    public final native void method382();

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lc;)V")
    public class105(class125 arg0) {
    }

    @OriginalMember(owner = "client!d", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class493.method2895(this, false);
        }
    }
}
