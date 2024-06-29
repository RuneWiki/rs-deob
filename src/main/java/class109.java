import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class109 extends class15 implements class294 {

    @OriginalMember(owner = "client!g", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lw;I)V")
    public class109(class197 arg0, int arg1) {
        this.method924(arg0, arg1);
    }

    @OriginalMember(owner = "client!g", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class157.method1134((byte) 119, this);
        }
    }

    @OriginalMember(owner = "client!g", name = "T", descriptor = "()V")
    public final native void method923();

    @OriginalMember(owner = "client!g", name = "TA", descriptor = "(Lw;I)V")
    private final native void method924(class197 arg0, int arg1);

    @OriginalMember(owner = "client!g", name = "IA", descriptor = "()V")
    public final native void method925();

    @OriginalMember(owner = "client!g", name = "p", descriptor = "()V")
    public final native void method615();
}
