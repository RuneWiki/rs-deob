import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class148 extends class265 implements class105 {

    @OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() {
        class438.method2701(-74, this);
    }

    @OriginalMember(owner = "client!p", name = "EA", descriptor = "()V")
    public final native void method119();
}
