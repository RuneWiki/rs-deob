import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class108 extends class385 implements class249 {

    @OriginalMember(owner = "client!m", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!m", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class499.method2689(this, (byte) 43);
        }
    }

    @OriginalMember(owner = "client!m", name = "Z", descriptor = "()V")
    public final native void method608();

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Ll;I)V")
    public class108(class171 arg0, int arg1) {
        this.method609(arg0, arg1);
    }

    @OriginalMember(owner = "client!m", name = "UA", descriptor = "(Z)V")
    public final native void method548(boolean arg0);

    @OriginalMember(owner = "client!m", name = "MA", descriptor = "(Ll;I)V")
    private final native void method609(class171 arg0, int arg1);

    @OriginalMember(owner = "client!m", name = "D", descriptor = "()V")
    public final native void method610();
}
