import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class667 extends class12 implements class784 {

    @OriginalMember(owner = "client!ja", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ja", name = "NA", descriptor = "(JI)V")
    private final native void method3798(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()V")
    public final void method42() {
        this.method3813(this.nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "(JI)V")
    private final native void method3799(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public final void method38(int arg0) {
        this.method3801(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "FA", descriptor = "(JIII)V")
    private final native void method3800(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class398.method2447(true, this);
        }
    }

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "(JI)V")
    private final native void method3801(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "(JJ)V")
    private final native void method3802(long arg0, long arg1);

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "(JI)V")
    private final native void method3803(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "la", descriptor = "()V")
    private final native void method3804();

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V")
    public final void method52(int arg0) {
        this.method3799(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "VA", descriptor = "(JI)V")
    private final native void method3805(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III[I)V")
    public final void method33(int arg0, int arg1, int arg2, int[] arg3) {
        this.method3814(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(III[I)V")
    public final void method48(int arg0, int arg1, int arg2, int[] arg3) {
        this.method3808(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "AA", descriptor = "(JZ)V")
    private final native void method3806(long arg0, boolean arg1);

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V")
    public final void method51(int arg0) {
        this.method3803(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
    public final void method40(int arg0) {
        this.method3805(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(JIII)V")
    private final native void method3807(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III)V")
    public final void method50(int arg0, int arg1, int arg2) {
        this.method3800(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III[I)V")
    public final void method43(int arg0, int arg1, int arg2, int[] arg3) {
        this.method3812(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "va", descriptor = "(JIII[I)V")
    private final native void method3808(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(J[I)V")
    private final native void method3809(long arg0, int[] arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIII)V")
    public final void method39(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3811(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V")
    public final void method45(int arg0) {
        this.method3810(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "za", descriptor = "(JI)V")
    private final native void method3810(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "(JIIIIII)V")
    private final native void method3811(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Loo;)V")
    public final void method49(class12 arg0) {
        this.method3802(this.nativeid, ((class667) arg0).nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "XA", descriptor = "(JIII[I)V")
    private final native void method3812(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([I)V")
    public final void method34(int[] arg0) {
        this.method3809(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V")
    public final void method47(int arg0, int arg1, int arg2) {
        this.method3807(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V")
    public final void method46(int arg0) {
        this.method3798(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(Z)V")
    public final void method450(boolean arg0) {
        this.method3806(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()Loo;")
    public final class12 method37() {
        class667 var1 = new class667();
        var1.method49(this);
        return var1;
    }

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "(J)V")
    private final native void method3813(long arg0);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(JIII[I)V")
    private final native void method3814(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
    public class667() {
        this.method3804();
    }
}
