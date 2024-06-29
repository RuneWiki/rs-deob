import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class175 extends class492 implements class198 {

    @OriginalMember(owner = "client!m", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!m", name = "UA", descriptor = "(Z)V")
    public final native void method131(boolean arg0);

    @OriginalMember(owner = "client!m", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class509.method2924((byte) -106, this);
        }
    }

    @OriginalMember(owner = "client!m", name = "MA", descriptor = "(Ll;I)V")
    private final native void method1192(class18 arg0, int arg1);

    @OriginalMember(owner = "client!m", name = "D", descriptor = "()V")
    public final native void method1193();

    @OriginalMember(owner = "client!m", name = "Z", descriptor = "()V")
    public final native void method1194();

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Ll;I)V")
    public class175(class18 arg0, int arg1) {
        this.method1192(arg0, arg1);
    }
}
