import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class507 extends class205 implements class400 {

    @OriginalMember(owner = "client!qa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "()V")
    public final native void method161();

    @OriginalMember(owner = "client!qa", name = "EA", descriptor = "(I)V")
    public final native void method160(int arg0);

    @OriginalMember(owner = "client!qa", name = "wa", descriptor = "([I)V")
    public final native void method159(int[] arg0);

    @OriginalMember(owner = "client!qa", name = "ca", descriptor = "(I)V")
    public final native void method164(int arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(III[I)V")
    public final void method154(int arg0, int arg1, int arg2, int[] arg3) {
        this.method3075(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "(I)V")
    public final native void method162(int arg0);

    @OriginalMember(owner = "client!qa", name = "ha", descriptor = "(Lc;)V")
    public final native void method157(class205 arg0);

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "(III)V")
    public final native void method163(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "K", descriptor = "(III[I)V")
    public final native void method153(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "()V")
    public final native void method175();

    @OriginalMember(owner = "client!qa", name = "oa", descriptor = "(III[I)V")
    private final native void method3075(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "(III)V")
    public final native void method158(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class431.method2721(this, false);
        }
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V")
    public class507() {
        this.method3076();
    }

    @OriginalMember(owner = "client!qa", name = "pa", descriptor = "()V")
    private final native void method3076();

    @OriginalMember(owner = "client!qa", name = "ea", descriptor = "(I)V")
    public final native void method166(int arg0);

    @OriginalMember(owner = "client!qa", name = "YA", descriptor = "(IIIIII)V")
    public final native void method165(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()Lc;")
    public final class205 method156() {
        class507 var1 = new class507();
        var1.method157(this);
        return var1;
    }

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V")
    public final native void method155(int arg0);
}
