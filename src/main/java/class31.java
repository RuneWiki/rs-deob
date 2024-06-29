import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class31 extends class123 implements class103 {

    @OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()Lc;", line = 17)
    public final class123 method230() {
        class31 var1 = new class31();
        var1.method237(this);
        return var1;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III[I)V", line = 27)
    public final void method236(int arg0, int arg1, int arg2, int[] arg3) {
        this.method235(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V", line = 30)
    protected final void finalize() {
        class132.method921(this, false);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V", line = 33)
    public class31() {
        this.method227();
    }

    @OriginalMember(owner = "client!i", name = "xa", descriptor = "()V")
    public final native void method223();

    @OriginalMember(owner = "client!i", name = "s", descriptor = "(IIIIII)V")
    public final native void method224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!i", name = "O", descriptor = "(I)V")
    public final native void method225(int arg0);

    @OriginalMember(owner = "client!i", name = "ja", descriptor = "(I)V")
    public final native void method226(int arg0);

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "()V")
    private final native void method227();

    @OriginalMember(owner = "client!i", name = "p", descriptor = "(III[I)V")
    public final native void method228(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!i", name = "j", descriptor = "(III)V")
    public final native void method229(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "o", descriptor = "(III)V")
    public final native void method231(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "N", descriptor = "(I)V")
    public final native void method232(int arg0);

    @OriginalMember(owner = "client!i", name = "ra", descriptor = "(I)V")
    public final native void method233(int arg0);

    @OriginalMember(owner = "client!i", name = "ka", descriptor = "(I)V")
    public final native void method234(int arg0);

    @OriginalMember(owner = "client!i", name = "M", descriptor = "(III[I)V")
    private final native void method235(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!i", name = "za", descriptor = "(Lc;)V")
    public final native void method237(class123 arg0);

    @OriginalMember(owner = "client!i", name = "EA", descriptor = "()V")
    public final native void method120();

    @OriginalMember(owner = "client!i", name = "m", descriptor = "([I)V")
    public final native void method238(int[] arg0);
}
