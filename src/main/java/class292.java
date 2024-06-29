import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class292 extends class501 implements class558 {

    @OriginalMember(owner = "client!ja", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIII)V", line = 4)
    public final void method2365(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2388(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "(I)V", line = 7)
    public final void method2366(int arg0) {
        this.method2374(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(Z)V", line = 11)
    public final void method130(boolean arg0) {
        this.method2376(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V", line = 16)
    public final void method2369(int arg0) {
        this.method2368(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V", line = 20)
    public final void method2371(int arg0) {
        this.method2390(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V", line = 25)
    public class292() {
        this.method2394();
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V", line = 31)
    public final void method2375(int arg0, int arg1, int arg2) {
        this.method2373(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lqq;)V", line = 36)
    public final void method2377(class501 arg0) {
        this.method2385(this.nativeid, ((class292) arg0).nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()Lqq;", line = 41)
    public final class501 method2379() {
        class292 var1 = new class292();
        var1.method2377(this);
        return var1;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III[I)V", line = 47)
    public final void method2380(int arg0, int arg1, int arg2, int[] arg3) {
        this.method2384(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([I)V", line = 50)
    public final void method2381(int[] arg0) {
        this.method2382(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()V", line = 54)
    public final void method2383() {
        this.method2370(this.nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V", line = 59)
    public final void method2386(int arg0) {
        this.method2396(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V", line = 62)
    public final void method2387(int arg0) {
        this.method2395(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III)V", line = 66)
    public final void method2389(int arg0, int arg1, int arg2) {
        this.method2364(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V", line = 71)
    public final void method2391(int arg0) {
        this.method2367(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(III[I)V", line = 74)
    public final void method2392(int arg0, int arg1, int arg2, int[] arg3) {
        this.method2372(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III[I)V", line = 79)
    public final void method2393(int arg0, int arg1, int arg2, int[] arg3) {
        this.method2378(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V", line = 83)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class201.method1801((byte) -55, this);
        }
    }

    @OriginalMember(owner = "client!ja", name = "FA", descriptor = "(JIII)V")
    private final native void method2364(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "(JI)V")
    private final native void method2367(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "(JI)V")
    private final native void method2368(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "(J)V")
    private final native void method2370(long arg0);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(JIII[I)V")
    private final native void method2372(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(JIII)V")
    private final native void method2373(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "(JI)V")
    private final native void method2374(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "AA", descriptor = "(JZ)V")
    private final native void method2376(long arg0, boolean arg1);

    @OriginalMember(owner = "client!ja", name = "XA", descriptor = "(JIII[I)V")
    private final native void method2378(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(J[I)V")
    private final native void method2382(long arg0, int[] arg1);

    @OriginalMember(owner = "client!ja", name = "va", descriptor = "(JIII[I)V")
    private final native void method2384(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "(JJ)V")
    private final native void method2385(long arg0, long arg1);

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "(JIIIIII)V")
    private final native void method2388(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ja", name = "NA", descriptor = "(JI)V")
    private final native void method2390(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "la", descriptor = "()V")
    private final native void method2394();

    @OriginalMember(owner = "client!ja", name = "VA", descriptor = "(JI)V")
    private final native void method2395(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "za", descriptor = "(JI)V")
    private final native void method2396(long arg0, int arg1);
}
