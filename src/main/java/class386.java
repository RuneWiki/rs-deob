import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class386 extends class182 implements class531 {

    @OriginalMember(owner = "client!ba", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ba", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class684.method3871(this, true);
        }
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Loa;)V", line = 9)
    public class386(class692 arg0) {
    }

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "(Z)V")
    public final native void method83(boolean arg0);
}
