import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class291 extends class486 implements class560 {

    @OriginalMember(owner = "client!ja", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(JIII)V")
    private final native void method2451(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "(JI)V")
    private final native void method2452(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "(JI)V")
    private final native void method2453(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "va", descriptor = "(JIII[I)V")
    private final native void method2454(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public final void method2455(int arg0) {
        this.method2463(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(J[I)V")
    private final native void method2456(long arg0, int[] arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III[I)V")
    public final void method2457(int arg0, int arg1, int arg2, int[] arg3) {
        this.method2482(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V")
    public final void method2458(int arg0) {
        this.method2452(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V")
    public final void method2459(int arg0) {
        this.method2469(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "la", descriptor = "()V")
    private final native void method2460();

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lsj;)V")
    public final void method2461(class486 arg0) {
        this.method2470(this.nativeid, ((class291) arg0).nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III[I)V")
    public final void method2462(int arg0, int arg1, int arg2, int[] arg3) {
        this.method2454(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "VA", descriptor = "(JI)V")
    private final native void method2463(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "(I)V")
    public final void method2464(int arg0) {
        this.method2477(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(Z)V")
    public final void method121(boolean arg0) {
        this.method2481(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V")
    public final void method2465(int arg0, int arg1, int arg2) {
        this.method2483(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(III[I)V")
    public final void method2466(int arg0, int arg1, int arg2, int[] arg3) {
        this.method2476(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V")
    public final void method2467(int arg0) {
        this.method2453(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "(J)V")
    private final native void method2468(long arg0);

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "(JI)V")
    private final native void method2469(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "(JJ)V")
    private final native void method2470(long arg0, long arg1);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()V")
    public final void method2471() {
        this.method2468(this.nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()Lsj;")
    public final class486 method2472() {
        class291 var1 = new class291();
        var1.method2461(this);
        return var1;
    }

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "(JIIIIII)V")
    private final native void method2473(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ja", name = "NA", descriptor = "(JI)V")
    private final native void method2474(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
    public final void method2475(int arg0) {
        this.method2474(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "XA", descriptor = "(JIII[I)V")
    private final native void method2476(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "za", descriptor = "(JI)V")
    private final native void method2477(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIII)V")
    public final void method2478(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2473(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([I)V")
    public final void method2479(int[] arg0) {
        this.method2456(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
    public class291() {
        this.method2460();
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III)V")
    public final void method2480(int arg0, int arg1, int arg2) {
        this.method2451(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "AA", descriptor = "(JZ)V")
    private final native void method2481(long arg0, boolean arg1);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(JIII[I)V")
    private final native void method2482(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "FA", descriptor = "(JIII)V")
    private final native void method2483(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class377.method3103(this, false);
        }
    }
}
