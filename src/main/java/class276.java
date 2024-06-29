import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class276 extends class165 implements class531 {

    @OriginalMember(owner = "client!ja", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(J[I)V")
    private final native void method1635(long arg0, int[] arg1);

    @OriginalMember(owner = "client!ja", name = "AA", descriptor = "(JZ)V")
    private final native void method1636(long arg0, boolean arg1);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III)V")
    public final void method1033(int arg0, int arg1, int arg2) {
        this.method1641(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "la", descriptor = "()V")
    private final native void method1637();

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
    public final void method1022(int arg0) {
        this.method1645(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III[I)V")
    public final void method1023(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1648(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "FA", descriptor = "(JIII)V")
    private final native void method1638(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public final void method1021(int arg0) {
        this.method1647(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V")
    public final void method1035(int arg0) {
        this.method1649(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "(JJ)V")
    private final native void method1639(long arg0, long arg1);

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "(J)V")
    private final native void method1640(long arg0);

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V")
    public final void method1032(int arg0) {
        this.method1650(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V")
    public final void method1019(int arg0, int arg1, int arg2) {
        this.method1638(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(JIII)V")
    private final native void method1641(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(III[I)V")
    public final void method1030(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1646(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "va", descriptor = "(JIII[I)V")
    private final native void method1642(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V")
    public final void method1036(int arg0) {
        this.method1651(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III[I)V")
    public final void method1020(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1642(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([I)V")
    public final void method1027(int[] arg0) {
        this.method1635(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "(JIIIIII)V")
    private final native void method1643(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "(JI)V")
    private final native void method1644(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V")
    public final void method1025(int arg0) {
        this.method1644(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ldfa;)V")
    public final void method1028(class165 arg0) {
        this.method1639(this.nativeid, ((class276) arg0).nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
    public class276() {
        this.method1637();
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()Ldfa;")
    public final class165 method1024() {
        class276 var1 = new class276();
        var1.method1028(this);
        return var1;
    }

    @OriginalMember(owner = "client!ja", name = "VA", descriptor = "(JI)V")
    private final native void method1645(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()V")
    public final void method1026() {
        this.method1640(this.nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class684.method3871(this, true);
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(JIII[I)V")
    private final native void method1646(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "NA", descriptor = "(JI)V")
    private final native void method1647(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIII)V")
    public final void method1018(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1643(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(Z)V")
    public final void method83(boolean arg0) {
        this.method1636(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "XA", descriptor = "(JIII[I)V")
    private final native void method1648(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "(JI)V")
    private final native void method1649(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "za", descriptor = "(JI)V")
    private final native void method1650(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "(JI)V")
    private final native void method1651(long arg0, int arg1);
}
