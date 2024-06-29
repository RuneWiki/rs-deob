import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class328 extends class377 implements class276 {

    @OriginalMember(owner = "client!ka", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ka", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() {
        class475.method2732(false, this);
    }

    @OriginalMember(owner = "client!ka", name = "ya", descriptor = "()V")
    public final native void method109();
}
