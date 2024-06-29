import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class294 extends class303 implements class559 {

    @OriginalMember(owner = "client!ja", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III)V")
    public final void method970(int arg0, int arg1, int arg2) {
        this.method1871(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class552.method3121(this, (byte) 20);
        }
    }

    @OriginalMember(owner = "client!ja", name = "XA", descriptor = "(JIII[I)V")
    private final native void method1858(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V")
    public final void method976(int arg0) {
        this.method1866(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "(J)V")
    private final native void method1859(long arg0);

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "(JI)V")
    private final native void method1860(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(J[I)V")
    private final native void method1861(long arg0, int[] arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()Luu;")
    public final class303 method963() {
        class294 var1 = new class294();
        var1.method986(this);
        return var1;
    }

    @OriginalMember(owner = "client!ja", name = "za", descriptor = "(JI)V")
    private final native void method1862(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V")
    public final void method981(int arg0, int arg1, int arg2) {
        this.method1869(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "la", descriptor = "()V")
    private final native void method1863();

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "(JIIIIII)V")
    private final native void method1864(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ja", name = "va", descriptor = "(JIII[I)V")
    private final native void method1865(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(III[I)V")
    public final void method979(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1865(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public final void method985(int arg0) {
        this.method1874(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "(I)V")
    public final void method972(int arg0) {
        this.method1870(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "NA", descriptor = "(JI)V")
    private final native void method1866(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "AA", descriptor = "(JZ)V")
    private final native void method1867(long arg0, boolean arg1);

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "(JJ)V")
    private final native void method1868(long arg0, long arg1);

    @OriginalMember(owner = "client!ja", name = "FA", descriptor = "(JIII)V")
    private final native void method1869(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V")
    public final void method978(int arg0) {
        this.method1873(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V")
    public final void method968(int arg0) {
        this.method1862(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III[I)V")
    public final void method974(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1858(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "VA", descriptor = "(JI)V")
    private final native void method1870(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([I)V")
    public final void method982(int[] arg0) {
        this.method1861(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(JIII)V")
    private final native void method1871(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
    public class294() {
        this.method1863();
    }

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(Z)V")
    public final void method151(boolean arg0) {
        this.method1867(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIII)V")
    public final void method984(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1864(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III[I)V")
    public final void method975(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1872(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(JIII[I)V")
    private final native void method1872(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "(JI)V")
    private final native void method1873(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V")
    public final void method969(int arg0) {
        this.method1860(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()V")
    public final void method967() {
        this.method1859(this.nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Luu;)V")
    public final void method986(class303 arg0) {
        this.method1868(this.nativeid, ((class294) arg0).nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "(JI)V")
    private final native void method1874(long arg0, int arg1);
}
