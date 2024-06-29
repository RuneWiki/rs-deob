import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class640 extends class376 implements class752 {

    @OriginalMember(owner = "client!ja", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(Z)V")
    public final void method414(boolean arg0) {
        this.method3473(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(III[I)V")
    public final void method1971(int arg0, int arg1, int arg2, int[] arg3) {
        this.method3477(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class133.method841(0, this);
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()V")
    public final void method1962() {
        this.method3470(this.nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "(JJ)V")
    private final native void method3468(long arg0, long arg1);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
    public final void method1972(int arg0) {
        this.method3481(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIII)V")
    public final void method1966(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3472(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(JIII)V")
    private final native void method3469(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "(J)V")
    private final native void method3470(long arg0);

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "(JI)V")
    private final native void method3471(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "(JIIIIII)V")
    private final native void method3472(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ja", name = "AA", descriptor = "(JZ)V")
    private final native void method3473(long arg0, boolean arg1);

    @OriginalMember(owner = "client!ja", name = "la", descriptor = "()V")
    private final native void method3474();

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(III)V")
    public final void method1973(int arg0, int arg1, int arg2) {
        this.method3469(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III[I)V")
    public final void method1977(int arg0, int arg1, int arg2, int[] arg3) {
        this.method3480(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "(JI)V")
    private final native void method3475(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "FA", descriptor = "(JIII)V")
    private final native void method3476(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()Lwc;")
    public final class376 method1965() {
        class640 var1 = new class640();
        var1.method1961(this);
        return var1;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(JIII[I)V")
    private final native void method3477(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V")
    public final void method1967(int arg0) {
        this.method3478(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([I)V")
    public final void method1968(int[] arg0) {
        this.method3482(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III[I)V")
    public final void method1974(int arg0, int arg1, int arg2, int[] arg3) {
        this.method3483(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public final void method1975(int arg0) {
        this.method3475(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V")
    public final void method1964(int arg0) {
        this.method3479(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "NA", descriptor = "(JI)V")
    private final native void method3478(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "VA", descriptor = "(JI)V")
    private final native void method3479(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "XA", descriptor = "(JIII[I)V")
    private final native void method3480(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
    public class640() {
        this.method3474();
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V")
    public final void method1963(int arg0, int arg1, int arg2) {
        this.method3476(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V")
    public final void method1976(int arg0) {
        this.method3484(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "za", descriptor = "(JI)V")
    private final native void method3481(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(J[I)V")
    private final native void method3482(long arg0, int[] arg1);

    @OriginalMember(owner = "client!ja", name = "va", descriptor = "(JIII[I)V")
    private final native void method3483(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lwc;)V")
    public final void method1961(class376 arg0) {
        this.method3468(this.nativeid, ((class640) arg0).nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "(JI)V")
    private final native void method3484(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V")
    public final void method1959(int arg0) {
        this.method3471(this.nativeid, arg0);
    }
}
