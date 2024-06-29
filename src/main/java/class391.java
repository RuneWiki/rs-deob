import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class391 extends class184 implements class533 {

    @OriginalMember(owner = "client!ba", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Loa;)V", line = 4)
    public class391(class695 arg0) {
    }

    @OriginalMember(owner = "client!ba", name = "finalize", descriptor = "()V", line = 7)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class521.method2896(this, (byte) 113);
        }
    }

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "(Z)V")
    public final native void method116(boolean arg0);
}
