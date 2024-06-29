import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class448 extends class105 implements class439 {

    @OriginalMember(owner = "client!q", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!q", name = "XA", descriptor = "(I)V")
    public final native void method616(int arg0);

    @OriginalMember(owner = "client!q", name = "ta", descriptor = "(I)V")
    public final native void method604(int arg0);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III[I)V")
    public final void method617(int arg0, int arg1, int arg2, int[] arg3) {
        this.method2715(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "()Lm;")
    public final class105 method609() {
        class448 var1 = new class448();
        var1.method618(this);
        return var1;
    }

    @OriginalMember(owner = "client!q", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class75.method437(this, -1);
        }
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(III[I)V")
    private final native void method2715(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "oa", descriptor = "(III)V")
    public final native void method613(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "ha", descriptor = "()V")
    public final native void method620();

    @OriginalMember(owner = "client!q", name = "EA", descriptor = "(Lm;)V")
    public final native void method618(class105 arg0);

    @OriginalMember(owner = "client!q", name = "KA", descriptor = "(I)V")
    public final native void method621(int arg0);

    @OriginalMember(owner = "client!q", name = "TA", descriptor = "(III)V")
    public final native void method619(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "I", descriptor = "(III[I)V")
    public final native void method612(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "k", descriptor = "(I)V")
    public final native void method611(int arg0);

    @OriginalMember(owner = "client!q", name = "i", descriptor = "()V")
    private final native void method2716();

    @OriginalMember(owner = "client!q", name = "va", descriptor = "([I)V")
    public final native void method605(int[] arg0);

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
    public class448() {
        this.method2716();
    }

    @OriginalMember(owner = "client!q", name = "ma", descriptor = "(I)V")
    public final native void method622(int arg0);

    @OriginalMember(owner = "client!q", name = "B", descriptor = "(IIIIII)V")
    public final native void method608(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!q", name = "NA", descriptor = "(Z)V")
    public final native void method530(boolean arg0);
}
