import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class294 extends class778 implements class559 {

    @OriginalMember(owner = "client!ja", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(Z)V", line = 5)
    public final void method229(boolean arg0) {
        this.method1715(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()V", line = 10)
    public final void method128() {
        this.method1717(this.nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()Lnh;", line = 15)
    public final class778 method136() {
        class294 var1 = new class294();
        var1.method141(this);
        return var1;
    }

    @OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V", line = 20)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class405.method2430((byte) -104, this);
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V", line = 25)
    public final void method139(int arg0) {
        this.method1716(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III[I)V", line = 28)
    public final void method135(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1723(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIII)V", line = 31)
    public final void method133(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1710(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V", line = 42)
    public final void method126(int arg0) {
        this.method1718(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(III[I)V", line = 45)
    public final void method134(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1713(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V", line = 51)
    public final void method138(int arg0) {
        this.method1714(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V", line = 54)
    public final void method125(int arg0) {
        this.method1712(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III)V", line = 59)
    public final void method130(int arg0, int arg1, int arg2) {
        this.method1721(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "(I)V", line = 62)
    public final void method123(int arg0) {
        this.method1719(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lnh;)V", line = 65)
    public final void method141(class778 arg0) {
        this.method1711(this.nativeid, ((class294) arg0).nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V", line = 68)
    public final void method131(int arg0, int arg1, int arg2) {
        this.method1724(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V", line = 70)
    public class294() {
        this.method1720();
    }

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "(I)V", line = 77)
    public final void method122(int arg0) {
        this.method1725(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([I)V", line = 84)
    public final void method124(int[] arg0) {
        this.method1709(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III[I)V", line = 87)
    public final void method132(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1722(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(J[I)V")
    private final native void method1709(long arg0, int[] arg1);

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "(JIIIIII)V")
    private final native void method1710(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "(JJ)V")
    private final native void method1711(long arg0, long arg1);

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "(JI)V")
    private final native void method1712(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "va", descriptor = "(JIII[I)V")
    private final native void method1713(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "VA", descriptor = "(JI)V")
    private final native void method1714(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "AA", descriptor = "(JZ)V")
    private final native void method1715(long arg0, boolean arg1);

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "(JI)V")
    private final native void method1716(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "(J)V")
    private final native void method1717(long arg0);

    @OriginalMember(owner = "client!ja", name = "za", descriptor = "(JI)V")
    private final native void method1718(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "(JI)V")
    private final native void method1719(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "la", descriptor = "()V")
    private final native void method1720();

    @OriginalMember(owner = "client!ja", name = "FA", descriptor = "(JIII)V")
    private final native void method1721(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(JIII[I)V")
    private final native void method1722(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "XA", descriptor = "(JIII[I)V")
    private final native void method1723(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(JIII)V")
    private final native void method1724(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "NA", descriptor = "(JI)V")
    private final native void method1725(long arg0, int arg1);
}
