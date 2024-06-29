import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class328 extends class377 implements class276 {

    @OriginalMember(owner = "client!ka", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ka", name = "ya", descriptor = "()V")
    public final native void method75();

    @OriginalMember(owner = "client!ka", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class284.method1787(-24204, this);
    }
}
