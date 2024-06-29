import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class279 extends class10 implements class533 {

    @OriginalMember(owner = "client!ja", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III[I)V", line = 3)
    public final void method32(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1663(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V", line = 8)
    public final void method33(int arg0, int arg1, int arg2) {
        this.method1665(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V", line = 13)
    public final void method40(int arg0) {
        this.method1668(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V", line = 16)
    public final void method23(int arg0) {
        this.method1675(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIII)V", line = 22)
    public final void method26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1674(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V", line = 28)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class280.method1680(false, this);
        }
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(III[I)V", line = 33)
    public final void method36(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1664(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lhba;)V", line = 36)
    public final void method25(class10 arg0) {
        this.method1661(this.nativeid, ((class279) arg0).nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V", line = 39)
    public final void method34(int arg0) {
        this.method1670(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V", line = 43)
    public final void method30(int arg0) {
        this.method1666(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([I)V", line = 48)
    public final void method41(int[] arg0) {
        this.method1677(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V", line = 53)
    public final void method37(int arg0) {
        this.method1671(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(Z)V", line = 56)
    public final void method73(boolean arg0) {
        this.method1667(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III)V", line = 64)
    public final void method39(int arg0, int arg1, int arg2) {
        this.method1662(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()Lhba;", line = 68)
    public final class10 method35() {
        class279 var1 = new class279();
        var1.method25(this);
        return var1;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()V", line = 74)
    public final void method24() {
        this.method1676(this.nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V", line = 77)
    public final void method38(int arg0) {
        this.method1672(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III[I)V", line = 84)
    public final void method29(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1669(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V", line = 87)
    public class279() {
        this.method1673();
    }

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "(JJ)V")
    private final native void method1661(long arg0, long arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(JIII)V")
    private final native void method1662(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "XA", descriptor = "(JIII[I)V")
    private final native void method1663(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(JIII[I)V")
    private final native void method1664(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "FA", descriptor = "(JIII)V")
    private final native void method1665(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "(JI)V")
    private final native void method1666(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "AA", descriptor = "(JZ)V")
    private final native void method1667(long arg0, boolean arg1);

    @OriginalMember(owner = "client!ja", name = "VA", descriptor = "(JI)V")
    private final native void method1668(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "va", descriptor = "(JIII[I)V")
    private final native void method1669(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "(JI)V")
    private final native void method1670(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "NA", descriptor = "(JI)V")
    private final native void method1671(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "(JI)V")
    private final native void method1672(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "la", descriptor = "()V")
    private final native void method1673();

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "(JIIIIII)V")
    private final native void method1674(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ja", name = "za", descriptor = "(JI)V")
    private final native void method1675(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "(J)V")
    private final native void method1676(long arg0);

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(J[I)V")
    private final native void method1677(long arg0, int[] arg1);
}
