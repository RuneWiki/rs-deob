import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class145 extends class263 implements class103 {

    @OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() {
        class1.method1(this, (byte) -31);
    }

    @OriginalMember(owner = "client!p", name = "EA", descriptor = "()V")
    public final native void method66();
}
