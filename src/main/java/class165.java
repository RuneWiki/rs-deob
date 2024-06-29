import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class165 extends class124 implements class350 {

    @OriginalMember(owner = "client!qa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V", line = 18)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class269.method1636(this, true);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(III[I)V", line = 28)
    public final void method737(int arg0, int arg1, int arg2, int[] arg3) {
        this.method965(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()Lc;", line = 32)
    public final class124 method750() {
        class165 var1 = new class165();
        var1.method753(this);
        return var1;
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V", line = 36)
    public class165() {
        this.method966();
    }

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "(III)V")
    public final native void method743(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "oa", descriptor = "(III[I)V")
    private final native void method965(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "()V")
    public final native void method426();

    @OriginalMember(owner = "client!qa", name = "EA", descriptor = "(I)V")
    public final native void method742(int arg0);

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "(I)V")
    public final native void method756(int arg0);

    @OriginalMember(owner = "client!qa", name = "ea", descriptor = "(I)V")
    public final native void method751(int arg0);

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V")
    public final native void method747(int arg0);

    @OriginalMember(owner = "client!qa", name = "ca", descriptor = "(I)V")
    public final native void method749(int arg0);

    @OriginalMember(owner = "client!qa", name = "ha", descriptor = "(Lc;)V")
    public final native void method753(class124 arg0);

    @OriginalMember(owner = "client!qa", name = "wa", descriptor = "([I)V")
    public final native void method754(int[] arg0);

    @OriginalMember(owner = "client!qa", name = "pa", descriptor = "()V")
    private final native void method966();

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "()V")
    public final native void method741();

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "(III)V")
    public final native void method757(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "YA", descriptor = "(IIIIII)V")
    public final native void method752(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "K", descriptor = "(III[I)V")
    public final native void method745(int arg0, int arg1, int arg2, int[] arg3);
}
