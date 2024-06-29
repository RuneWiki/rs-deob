import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class45 extends class484 implements class529 {

    @OriginalMember(owner = "client!na", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!na", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class727.method4045(this, 13483);
        }
    }

    @OriginalMember(owner = "client!na", name = "ma", descriptor = "(Loa;Lya;II[I[I)V")
    private final native void method411(class691 arg0, class51 arg1, int arg2, int arg3, int[] arg4, int[] arg5);

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Loa;Lya;II[I[I)V")
    public class45(class691 arg0, class51 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
        this.method411(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!na", name = "w", descriptor = "(Z)V")
    public final native void method107(boolean arg0);
}
