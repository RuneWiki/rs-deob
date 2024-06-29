import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class328 extends class378 implements class276 {

    @OriginalMember(owner = "client!ka", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ka", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() {
        class390.method2237(true, this);
    }

    @OriginalMember(owner = "client!ka", name = "ya", descriptor = "()V")
    public final native void method79();
}
