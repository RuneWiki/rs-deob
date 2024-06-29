import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class448 extends class105 implements class439 {

    @OriginalMember(owner = "client!q", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!q", name = "ta", descriptor = "(I)V")
    public final native void method355(int arg0);

    @OriginalMember(owner = "client!q", name = "I", descriptor = "(III[I)V")
    public final native void method367(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "KA", descriptor = "(I)V")
    public final native void method366(int arg0);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "()Lm;")
    public final class105 method357() {
        class448 var1 = new class448();
        var1.method362(this);
        return var1;
    }

    @OriginalMember(owner = "client!q", name = "EA", descriptor = "(Lm;)V")
    public final native void method362(class105 arg0);

    @OriginalMember(owner = "client!q", name = "ma", descriptor = "(I)V")
    public final native void method359(int arg0);

    @OriginalMember(owner = "client!q", name = "TA", descriptor = "(III)V")
    public final native void method365(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "i", descriptor = "()V")
    private final native void method2615();

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III[I)V")
    public final void method363(int arg0, int arg1, int arg2, int[] arg3) {
        this.method2616(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!q", name = "B", descriptor = "(IIIIII)V")
    public final native void method360(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!q", name = "NA", descriptor = "(Z)V")
    public final native void method503(boolean arg0);

    @OriginalMember(owner = "client!q", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class243.method1506(this, 0);
        }
    }

    @OriginalMember(owner = "client!q", name = "oa", descriptor = "(III)V")
    public final native void method361(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "k", descriptor = "(I)V")
    public final native void method358(int arg0);

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(III[I)V")
    private final native void method2616(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "XA", descriptor = "(I)V")
    public final native void method356(int arg0);

    @OriginalMember(owner = "client!q", name = "ha", descriptor = "()V")
    public final native void method354();

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
    public class448() {
        this.method2615();
    }

    @OriginalMember(owner = "client!q", name = "va", descriptor = "([I)V")
    public final native void method364(int[] arg0);
}
