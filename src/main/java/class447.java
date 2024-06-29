import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class447 extends class105 implements class438 {

    @OriginalMember(owner = "client!q", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "()Lm;", line = 10)
    public final class105 method879() {
        class447 var1 = new class447();
        var1.method878(this);
        return var1;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V", line = 17)
    public class447() {
        this.method2646();
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III[I)V", line = 22)
    public final void method880(int arg0, int arg1, int arg2, int[] arg3) {
        this.method2647(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!q", name = "finalize", descriptor = "()V", line = 36)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class124.method989(-109, this);
        }
    }

    @OriginalMember(owner = "client!q", name = "ha", descriptor = "()V")
    public final native void method883();

    @OriginalMember(owner = "client!q", name = "NA", descriptor = "(Z)V")
    public final native void method810(boolean arg0);

    @OriginalMember(owner = "client!q", name = "va", descriptor = "([I)V")
    public final native void method891(int[] arg0);

    @OriginalMember(owner = "client!q", name = "B", descriptor = "(IIIIII)V")
    public final native void method888(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!q", name = "ma", descriptor = "(I)V")
    public final native void method875(int arg0);

    @OriginalMember(owner = "client!q", name = "k", descriptor = "(I)V")
    public final native void method887(int arg0);

    @OriginalMember(owner = "client!q", name = "i", descriptor = "()V")
    private final native void method2646();

    @OriginalMember(owner = "client!q", name = "oa", descriptor = "(III)V")
    public final native void method884(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "KA", descriptor = "(I)V")
    public final native void method881(int arg0);

    @OriginalMember(owner = "client!q", name = "ta", descriptor = "(I)V")
    public final native void method876(int arg0);

    @OriginalMember(owner = "client!q", name = "EA", descriptor = "(Lm;)V")
    public final native void method878(class105 arg0);

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(III[I)V")
    private final native void method2647(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "XA", descriptor = "(I)V")
    public final native void method882(int arg0);

    @OriginalMember(owner = "client!q", name = "TA", descriptor = "(III)V")
    public final native void method877(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "I", descriptor = "(III[I)V")
    public final native void method885(int arg0, int arg1, int arg2, int[] arg3);
}
