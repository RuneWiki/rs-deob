import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class131 extends class517 implements class28 {

    @OriginalMember(owner = "client!qa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()Lc;")
    public final class517 method950() {
        class131 var1 = new class131();
        var1.method962(this);
        return var1;
    }

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "(III)V")
    public final native void method951(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "EA", descriptor = "(I)V")
    public final native void method952(int arg0);

    @OriginalMember(owner = "client!qa", name = "pa", descriptor = "()V")
    private final native void method953();

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "(I)V")
    public final native void method954(int arg0);

    @OriginalMember(owner = "client!qa", name = "YA", descriptor = "(IIIIII)V")
    public final native void method955(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "()V")
    public final native void method164();

    @OriginalMember(owner = "client!qa", name = "oa", descriptor = "(III[I)V")
    private final native void method956(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "(III)V")
    public final native void method957(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "wa", descriptor = "([I)V")
    public final native void method958(int[] arg0);

    @OriginalMember(owner = "client!qa", name = "ea", descriptor = "(I)V")
    public final native void method959(int arg0);

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V")
    public class131() {
        this.method953();
    }

    @OriginalMember(owner = "client!qa", name = "ca", descriptor = "(I)V")
    public final native void method960(int arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(III[I)V")
    public final void method961(int arg0, int arg1, int arg2, int[] arg3) {
        this.method956(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!qa", name = "ha", descriptor = "(Lc;)V")
    public final native void method962(class517 arg0);

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V")
    public final native void method963(int arg0);

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "()V")
    public final native void method964();

    @OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class45.method300(this, 0);
        }
    }

    @OriginalMember(owner = "client!qa", name = "K", descriptor = "(III[I)V")
    public final native void method965(int arg0, int arg1, int arg2, int[] arg3);
}
