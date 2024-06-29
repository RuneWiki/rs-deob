import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class136 extends class744 implements class2 {

    @OriginalMember(owner = "client!ja", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIII)V")
    public final void method875(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method903(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ja", name = "VA", descriptor = "(JI)V")
    private final native void method876(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "va", descriptor = "(JIII[I)V")
    private final native void method877(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "za", descriptor = "(JI)V")
    private final native void method878(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(J[I)V")
    private final native void method879(long arg0, int[] arg1);

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V")
    public final void method880(int arg0) {
        this.method876(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III[I)V")
    public final void method881(int arg0, int arg1, int arg2, int[] arg3) {
        this.method897(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III)V")
    public final void method882(int arg0, int arg1, int arg2) {
        this.method888(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "(JI)V")
    private final native void method883(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "(JI)V")
    private final native void method884(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "NA", descriptor = "(JI)V")
    private final native void method885(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "la", descriptor = "()V")
    private final native void method886();

    @OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class556.method3276((byte) -10, this);
        }
    }

    @OriginalMember(owner = "client!ja", name = "XA", descriptor = "(JIII[I)V")
    private final native void method887(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(Z)V")
    public final void method12(boolean arg0) {
        this.method893(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(JIII)V")
    private final native void method888(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()V")
    public final void method889() {
        this.method901(this.nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
    public final void method890(int arg0) {
        this.method884(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "FA", descriptor = "(JIII)V")
    private final native void method891(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "(JJ)V")
    private final native void method892(long arg0, long arg1);

    @OriginalMember(owner = "client!ja", name = "AA", descriptor = "(JZ)V")
    private final native void method893(long arg0, boolean arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([I)V")
    public final void method894(int[] arg0) {
        this.method879(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V")
    public final void method895(int arg0) {
        this.method883(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public final void method896(int arg0) {
        this.method885(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(JIII[I)V")
    private final native void method897(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V")
    public final void method898(int arg0) {
        this.method878(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III[I)V")
    public final void method899(int arg0, int arg1, int arg2, int[] arg3) {
        this.method877(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lih;)V")
    public final void method900(class744 arg0) {
        this.method892(this.nativeid, ((class136) arg0).nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "(J)V")
    private final native void method901(long arg0);

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "(I)V")
    public final void method902(int arg0) {
        this.method904(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "(JIIIIII)V")
    private final native void method903(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
    public class136() {
        this.method886();
    }

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "(JI)V")
    private final native void method904(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V")
    public final void method905(int arg0, int arg1, int arg2) {
        this.method891(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()Lih;")
    public final class744 method906() {
        class136 var1 = new class136();
        var1.method900(this);
        return var1;
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(III[I)V")
    public final void method907(int arg0, int arg1, int arg2, int[] arg3) {
        this.method887(this.nativeid, arg0, arg1, arg2, arg3);
    }
}
