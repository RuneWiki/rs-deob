import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class174 extends class493 implements class199 {

    @OriginalMember(owner = "client!m", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!m", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class542.method3175(this, 0);
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Ll;I)V", line = 12)
    public class174(class18 arg0, int arg1) {
        this.method1098(arg0, arg1);
    }

    @OriginalMember(owner = "client!m", name = "MA", descriptor = "(Ll;I)V")
    private final native void method1098(class18 arg0, int arg1);

    @OriginalMember(owner = "client!m", name = "D", descriptor = "()V")
    public final native void method1099();

    @OriginalMember(owner = "client!m", name = "UA", descriptor = "(Z)V")
    public final native void method221(boolean arg0);

    @OriginalMember(owner = "client!m", name = "Z", descriptor = "()V")
    public final native void method1100();
}
