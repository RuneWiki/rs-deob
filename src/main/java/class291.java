import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class291 extends class81 implements class752 {

    @OriginalMember(owner = "client!na", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Loa;Lya;II[I[I)V", line = 3)
    public class291(class50 arg0, class305 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
        this.method1750(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!na", name = "finalize", descriptor = "()V", line = 7)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class133.method841(0, this);
        }
    }

    @OriginalMember(owner = "client!na", name = "ma", descriptor = "(Loa;Lya;II[I[I)V")
    private final native void method1750(class50 arg0, class305 arg1, int arg2, int arg3, int[] arg4, int[] arg5);

    @OriginalMember(owner = "client!na", name = "w", descriptor = "(Z)V")
    public final native void method414(boolean arg0);
}
