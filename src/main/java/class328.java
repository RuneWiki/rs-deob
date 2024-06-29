import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class328 extends class736 implements class2 {

    @OriginalMember(owner = "client!ba", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Loa;)V", line = 4)
    public class328(class426 arg0) {
    }

    @OriginalMember(owner = "client!ba", name = "finalize", descriptor = "()V", line = 7)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class18.method80(-1, this);
        }
    }

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "(Z)V")
    public final native void method5(boolean arg0);
}
