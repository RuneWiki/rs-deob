import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class384 extends class181 implements class529 {

    @OriginalMember(owner = "client!ba", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ba", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class727.method4045(this, 13483);
        }
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Loa;)V", line = 8)
    public class384(class691 arg0) {
    }

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "(Z)V")
    public final native void method107(boolean arg0);
}
