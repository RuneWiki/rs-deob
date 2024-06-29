import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class280 extends class333 implements class533 {

    @OriginalMember(owner = "client!ja", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "(JI)V")
    private final native void method1698(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "(J)V")
    private final native void method1699(long arg0);

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V")
    public final void method1700(int arg0) {
        this.method1701(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "NA", descriptor = "(JI)V")
    private final native void method1701(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "va", descriptor = "(JIII[I)V")
    private final native void method1702(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()Lofa;")
    public final class333 method1703() {
        class280 var1 = new class280();
        var1.method1712(this);
        return var1;
    }

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "(JJ)V")
    private final native void method1704(long arg0, long arg1);

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V")
    public final void method1705(int arg0) {
        this.method1706(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "VA", descriptor = "(JI)V")
    private final native void method1706(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "XA", descriptor = "(JIII[I)V")
    private final native void method1707(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III[I)V")
    public final void method1708(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1717(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([I)V")
    public final void method1709(int[] arg0) {
        this.method1719(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
    public final void method1710(int arg0) {
        this.method1698(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "(JIIIIII)V")
    private final native void method1711(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lofa;)V")
    public final void method1712(class333 arg0) {
        this.method1704(this.nativeid, ((class280) arg0).nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public final void method1713(int arg0) {
        this.method1722(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "FA", descriptor = "(JIII)V")
    private final native void method1714(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(Z)V")
    public final void method116(boolean arg0) {
        this.method1729(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIII)V")
    public final void method1715(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1711(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V")
    public final void method1716(int arg0) {
        this.method1726(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(JIII[I)V")
    private final native void method1717(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "(I)V")
    public final void method1718(int arg0) {
        this.method1720(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(J[I)V")
    private final native void method1719(long arg0, int[] arg1);

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "(JI)V")
    private final native void method1720(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(JIII)V")
    private final native void method1721(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "(JI)V")
    private final native void method1722(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(III[I)V")
    public final void method1723(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1702(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "la", descriptor = "()V")
    private final native void method1724();

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
    public class280() {
        this.method1724();
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()V")
    public final void method1725() {
        this.method1699(this.nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class521.method2896(this, (byte) -97);
        }
    }

    @OriginalMember(owner = "client!ja", name = "za", descriptor = "(JI)V")
    private final native void method1726(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V")
    public final void method1727(int arg0, int arg1, int arg2) {
        this.method1714(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III[I)V")
    public final void method1728(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1707(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "AA", descriptor = "(JZ)V")
    private final native void method1729(long arg0, boolean arg1);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III)V")
    public final void method1730(int arg0, int arg1, int arg2) {
        this.method1721(this.nativeid, arg0, arg1, arg2);
    }
}
