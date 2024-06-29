import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class94 extends class393 implements class201 {

    @OriginalMember(owner = "client!ra", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ra", name = "Y", descriptor = "()V")
    public final native void method504();

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "(III[I)V")
    private final native void method904(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "(Lq;)V")
    public final native void method512(class393 arg0);

    @OriginalMember(owner = "client!ra", name = "wa", descriptor = "(III[I)V")
    public final native void method514(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "(I)V")
    public final native void method508(int arg0);

    @OriginalMember(owner = "client!ra", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class222.method1638(-1, this);
        }
    }

    @OriginalMember(owner = "client!ra", name = "YA", descriptor = "([I)V")
    public final native void method500(int[] arg0);

    @OriginalMember(owner = "client!ra", name = "NA", descriptor = "(III)V")
    public final native void method503(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ra", name = "na", descriptor = "(IIIIII)V")
    public final native void method497(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ra", name = "ZA", descriptor = "(I)V")
    public final native void method511(int arg0);

    @OriginalMember(owner = "client!ra", name = "oa", descriptor = "(I)V")
    public final native void method521(int arg0);

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "(III)V")
    public final native void method505(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ra", name = "ja", descriptor = "()V")
    private final native void method905();

    @OriginalMember(owner = "client!ra", name = "I", descriptor = "(III[I)V")
    public final native void method509(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "(I)V")
    public final native void method517(int arg0);

    @OriginalMember(owner = "client!ra", name = "UA", descriptor = "(Z)V")
    public final native void method312(boolean arg0);

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "(I)V")
    public final native void method506(int arg0);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "()Lq;")
    public final class393 method519() {
        class94 var1 = new class94();
        var1.method512(this);
        return var1;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
    public class94() {
        this.method905();
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III[I)V")
    public final void method502(int arg0, int arg1, int arg2, int[] arg3) {
        this.method904(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ra", name = "AA", descriptor = "(I)V")
    public final native void method515(int arg0);
}
