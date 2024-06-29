import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public class class79 extends class270 implements class2 {

    @OriginalMember(owner = "client!ya", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ya", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class18.method80(-1, this);
        }
    }

    @OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(Loa;I)V", line = 12)
    public class79(class426 arg0, int arg1) {
        this.method495(arg0, arg1);
    }

    @OriginalMember(owner = "client!ya", name = "r", descriptor = "()V")
    public final native void method493();

    @OriginalMember(owner = "client!ya", name = "ga", descriptor = "()V")
    public final native void method494();

    @OriginalMember(owner = "client!ya", name = "aa", descriptor = "(Loa;I)V")
    private final native void method495(class426 arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "w", descriptor = "(Z)V")
    public final native void method5(boolean arg0);
}
