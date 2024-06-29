import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public class class52 extends class418 implements class533 {

    @OriginalMember(owner = "client!ya", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ya", name = "ga", descriptor = "()V")
    public final native void method362();

    @OriginalMember(owner = "client!ya", name = "r", descriptor = "()V")
    public final native void method363();

    @OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(Loa;I)V")
    public class52(class695 arg0, int arg1) {
        this.method364(arg0, arg1);
    }

    @OriginalMember(owner = "client!ya", name = "aa", descriptor = "(Loa;I)V")
    private final native void method364(class695 arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class521.method2896(this, (byte) 64);
        }
    }

    @OriginalMember(owner = "client!ya", name = "w", descriptor = "(Z)V")
    public final native void method116(boolean arg0);
}
