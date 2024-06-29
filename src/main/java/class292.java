import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class292 extends class326 implements class557 {

    @OriginalMember(owner = "client!ja", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public final void method1868(int arg0) {
        this.method1880(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III)V")
    public final void method1869(int arg0, int arg1, int arg2) {
        this.method1894(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIII)V")
    public final void method1870(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1874(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V")
    public final void method1871(int arg0) {
        this.method1891(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()Lqja;")
    public final class326 method1872() {
        class292 var1 = new class292();
        var1.method1884(this);
        return var1;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()V")
    public final void method1873() {
        this.method1883(this.nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "(JIIIIII)V")
    private final native void method1874(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ja", name = "AA", descriptor = "(JZ)V")
    private final native void method1875(long arg0, boolean arg1);

    @OriginalMember(owner = "client!ja", name = "za", descriptor = "(JI)V")
    private final native void method1876(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V")
    public final void method1877(int arg0) {
        this.method1893(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V")
    public final void method1878(int arg0, int arg1, int arg2) {
        this.method1886(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class196.method1359(this, (byte) 90);
        }
    }

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(Z)V")
    public final void method211(boolean arg0) {
        this.method1875(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "(JJ)V")
    private final native void method1879(long arg0, long arg1);

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "(JI)V")
    private final native void method1880(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "VA", descriptor = "(JI)V")
    private final native void method1881(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V")
    public final void method1882(int arg0) {
        this.method1897(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
    public class292() {
        this.method1892();
    }

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "(J)V")
    private final native void method1883(long arg0);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lqja;)V")
    public final void method1884(class326 arg0) {
        this.method1879(this.nativeid, ((class292) arg0).nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(III[I)V")
    public final void method1885(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1889(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(JIII)V")
    private final native void method1886(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "va", descriptor = "(JIII[I)V")
    private final native void method1887(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V")
    public final void method1888(int arg0) {
        this.method1881(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(JIII[I)V")
    private final native void method1889(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III[I)V")
    public final void method1890(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1887(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "(JI)V")
    private final native void method1891(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "la", descriptor = "()V")
    private final native void method1892();

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "(JI)V")
    private final native void method1893(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "FA", descriptor = "(JIII)V")
    private final native void method1894(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
    public final void method1895(int arg0) {
        this.method1876(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([I)V")
    public final void method1896(int[] arg0) {
        this.method1898(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "NA", descriptor = "(JI)V")
    private final native void method1897(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(J[I)V")
    private final native void method1898(long arg0, int[] arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III[I)V")
    public final void method1899(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1900(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "XA", descriptor = "(JIII[I)V")
    private final native void method1900(long arg0, int arg1, int arg2, int arg3, int[] arg4);
}
