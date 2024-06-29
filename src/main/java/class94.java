import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class94 extends class396 implements class201 {

    @OriginalMember(owner = "client!ra", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "(III)V")
    public final native void method891(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ra", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class541.method3123(14336, this);
        }
    }

    @OriginalMember(owner = "client!ra", name = "ja", descriptor = "()V")
    private final native void method892();

    @OriginalMember(owner = "client!ra", name = "oa", descriptor = "(I)V")
    public final native void method893(int arg0);

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "(I)V")
    public final native void method894(int arg0);

    @OriginalMember(owner = "client!ra", name = "Y", descriptor = "()V")
    public final native void method895();

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
    public class94() {
        this.method892();
    }

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "(Lq;)V")
    public final native void method896(class396 arg0);

    @OriginalMember(owner = "client!ra", name = "AA", descriptor = "(I)V")
    public final native void method897(int arg0);

    @OriginalMember(owner = "client!ra", name = "YA", descriptor = "([I)V")
    public final native void method898(int[] arg0);

    @OriginalMember(owner = "client!ra", name = "UA", descriptor = "(Z)V")
    public final native void method420(boolean arg0);

    @OriginalMember(owner = "client!ra", name = "wa", descriptor = "(III[I)V")
    public final native void method899(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "(I)V")
    public final native void method900(int arg0);

    @OriginalMember(owner = "client!ra", name = "ZA", descriptor = "(I)V")
    public final native void method901(int arg0);

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "(III[I)V")
    private final native void method902(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "(I)V")
    public final native void method903(int arg0);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "()Lq;")
    public final class396 method904() {
        class94 var1 = new class94();
        var1.method896(this);
        return var1;
    }

    @OriginalMember(owner = "client!ra", name = "NA", descriptor = "(III)V")
    public final native void method905(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III[I)V")
    public final void method906(int arg0, int arg1, int arg2, int[] arg3) {
        this.method902(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ra", name = "na", descriptor = "(IIIIII)V")
    public final native void method907(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
