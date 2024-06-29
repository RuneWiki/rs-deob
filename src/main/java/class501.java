import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class501 extends class202 implements class242 {

    @OriginalMember(owner = "client!qa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V", line = 8)
    public class501() {
        this.method2965();
    }

    @OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V", line = 20)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class248.method1686(false, this);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(III[I)V", line = 27)
    public final void method1238(int arg0, int arg1, int arg2, int[] arg3) {
        this.method2964(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()Lc;", line = 33)
    public final class202 method1242() {
        class501 var1 = new class501();
        var1.method1241(this);
        return var1;
    }

    @OriginalMember(owner = "client!qa", name = "YA", descriptor = "(IIIIII)V")
    public final native void method1247(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "()V")
    public final native void method224();

    @OriginalMember(owner = "client!qa", name = "ca", descriptor = "(I)V")
    public final native void method1250(int arg0);

    @OriginalMember(owner = "client!qa", name = "ea", descriptor = "(I)V")
    public final native void method1243(int arg0);

    @OriginalMember(owner = "client!qa", name = "K", descriptor = "(III[I)V")
    public final native void method1249(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!qa", name = "oa", descriptor = "(III[I)V")
    private final native void method2964(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "(III)V")
    public final native void method1237(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "(I)V")
    public final native void method1248(int arg0);

    @OriginalMember(owner = "client!qa", name = "wa", descriptor = "([I)V")
    public final native void method1240(int[] arg0);

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V")
    public final native void method1239(int arg0);

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "()V")
    public final native void method1244();

    @OriginalMember(owner = "client!qa", name = "pa", descriptor = "()V")
    private final native void method2965();

    @OriginalMember(owner = "client!qa", name = "EA", descriptor = "(I)V")
    public final native void method1245(int arg0);

    @OriginalMember(owner = "client!qa", name = "ha", descriptor = "(Lc;)V")
    public final native void method1241(class202 arg0);

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "(III)V")
    public final native void method1246(int arg0, int arg1, int arg2);
}
