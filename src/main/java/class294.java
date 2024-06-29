import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class294 extends class650 implements class560 {

    @OriginalMember(owner = "client!ja", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V", line = 3)
    public final void method1860(int arg0, int arg1, int arg2) {
        this.method1887(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()V", line = 8)
    public final void method1862() {
        this.method1881(this.nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()Lsk;", line = 18)
    public final class650 method1867() {
        class294 var1 = new class294();
        var1.method1874(this);
        return var1;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III)V", line = 23)
    public final void method1868(int arg0, int arg1, int arg2) {
        this.method1864(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V", line = 26)
    public final void method1869(int arg0) {
        this.method1863(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III[I)V", line = 29)
    public final void method1870(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1866(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lsk;)V", line = 35)
    public final void method1874(class650 arg0) {
        this.method1889(this.nativeid, ((class294) arg0).nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V", line = 38)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class86.method690(this, (byte) 35);
        }
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V", line = 43)
    public final void method1875(int arg0) {
        this.method1871(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(III[I)V", line = 46)
    public final void method1876(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1880(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V", line = 49)
    public final void method1877(int arg0) {
        this.method1883(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III[I)V", line = 53)
    public final void method1878(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1891(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V", line = 56)
    public final void method1879(int arg0) {
        this.method1872(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIII)V", line = 62)
    public final void method1882(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1861(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V", line = 67)
    public final void method1884(int arg0) {
        this.method1873(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([I)V", line = 70)
    public final void method1885(int[] arg0) {
        this.method1886(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(Z)V", line = 74)
    public final void method131(boolean arg0) {
        this.method1892(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V", line = 80)
    public final void method1890(int arg0) {
        this.method1865(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V", line = 87)
    public class294() {
        this.method1888();
    }

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "(JIIIIII)V")
    private final native void method1861(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ja", name = "za", descriptor = "(JI)V")
    private final native void method1863(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "FA", descriptor = "(JIII)V")
    private final native void method1864(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "NA", descriptor = "(JI)V")
    private final native void method1865(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "va", descriptor = "(JIII[I)V")
    private final native void method1866(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "(JI)V")
    private final native void method1871(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "(JI)V")
    private final native void method1872(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "VA", descriptor = "(JI)V")
    private final native void method1873(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "XA", descriptor = "(JIII[I)V")
    private final native void method1880(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "(J)V")
    private final native void method1881(long arg0);

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "(JI)V")
    private final native void method1883(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(J[I)V")
    private final native void method1886(long arg0, int[] arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(JIII)V")
    private final native void method1887(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "la", descriptor = "()V")
    private final native void method1888();

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "(JJ)V")
    private final native void method1889(long arg0, long arg1);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(JIII[I)V")
    private final native void method1891(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "AA", descriptor = "(JZ)V")
    private final native void method1892(long arg0, boolean arg1);
}
