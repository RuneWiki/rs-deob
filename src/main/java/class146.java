import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class146 extends class264 implements class103 {

    @OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() {
        class132.method921(this, false);
    }

    @OriginalMember(owner = "client!p", name = "EA", descriptor = "()V")
    public final native void method120();
}
