import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class363 extends class165 implements class28 {

    @OriginalMember(owner = "client!q", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!q", name = "oa", descriptor = "(III)V")
    public final native void method353(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class292.method1797(64, this);
        }
    }

    @OriginalMember(owner = "client!q", name = "k", descriptor = "(I)V")
    public final native void method342(int arg0);

    @OriginalMember(owner = "client!q", name = "EA", descriptor = "(Lm;)V")
    public final native void method337(class165 arg0);

    @OriginalMember(owner = "client!q", name = "ta", descriptor = "(I)V")
    public final native void method345(int arg0);

    @OriginalMember(owner = "client!q", name = "va", descriptor = "([I)V")
    public final native void method351(int[] arg0);

    @OriginalMember(owner = "client!q", name = "I", descriptor = "(III[I)V")
    public final native void method343(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III[I)V")
    public final void method341(int arg0, int arg1, int arg2, int[] arg3) {
        this.method2178(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!q", name = "KA", descriptor = "(I)V")
    public final native void method355(int arg0);

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(III[I)V")
    private final native void method2178(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "TA", descriptor = "(III)V")
    public final native void method338(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
    public class363() {
        this.method2179();
    }

    @OriginalMember(owner = "client!q", name = "XA", descriptor = "(I)V")
    public final native void method352(int arg0);

    @OriginalMember(owner = "client!q", name = "i", descriptor = "()V")
    private final native void method2179();

    @OriginalMember(owner = "client!q", name = "NA", descriptor = "(Z)V")
    public final native void method63(boolean arg0);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "()Lm;")
    public final class165 method335() {
        class363 var1 = new class363();
        var1.method337(this);
        return var1;
    }

    @OriginalMember(owner = "client!q", name = "ha", descriptor = "()V")
    public final native void method336();

    @OriginalMember(owner = "client!q", name = "B", descriptor = "(IIIIII)V")
    public final native void method339(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!q", name = "ma", descriptor = "(I)V")
    public final native void method344(int arg0);
}
