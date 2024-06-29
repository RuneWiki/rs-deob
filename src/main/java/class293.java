import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class293 extends class109 implements class558 {

    @OriginalMember(owner = "client!ja", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lal;)V", line = 6)
    public final void method816(class109 arg0) {
        this.method1882(this.nativeid, ((class293) arg0).nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V", line = 15)
    public final void method810(int arg0) {
        this.method1875(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V", line = 19)
    public final void method814(int arg0, int arg1, int arg2) {
        this.method1881(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(Z)V", line = 22)
    public final void method105(boolean arg0) {
        this.method1880(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()Lal;", line = 26)
    public final class109 method813() {
        class293 var1 = new class293();
        var1.method816(this);
        return var1;
    }

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "(I)V", line = 31)
    public final void method825(int arg0) {
        this.method1877(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V", line = 33)
    public class293() {
        this.method1884();
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III[I)V", line = 41)
    public final void method815(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1889(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V", line = 45)
    public final void method821(int arg0) {
        this.method1885(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V", line = 50)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class766.method4210((byte) -4, this);
        }
    }

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V", line = 56)
    public final void method824(int arg0) {
        this.method1874(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIII)V", line = 60)
    public final void method823(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1878(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(III[I)V", line = 63)
    public final void method820(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1886(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III[I)V", line = 66)
    public final void method812(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1887(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III)V", line = 70)
    public final void method818(int arg0, int arg1, int arg2) {
        this.method1876(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()V", line = 73)
    public final void method822() {
        this.method1888(this.nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V", line = 78)
    public final void method817(int arg0) {
        this.method1879(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([I)V", line = 82)
    public final void method809(int[] arg0) {
        this.method1883(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V", line = 85)
    public final void method811(int arg0) {
        this.method1890(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "za", descriptor = "(JI)V")
    private final native void method1874(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "(JI)V")
    private final native void method1875(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(JIII)V")
    private final native void method1876(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "VA", descriptor = "(JI)V")
    private final native void method1877(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "(JIIIIII)V")
    private final native void method1878(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "(JI)V")
    private final native void method1879(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "AA", descriptor = "(JZ)V")
    private final native void method1880(long arg0, boolean arg1);

    @OriginalMember(owner = "client!ja", name = "FA", descriptor = "(JIII)V")
    private final native void method1881(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "(JJ)V")
    private final native void method1882(long arg0, long arg1);

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(J[I)V")
    private final native void method1883(long arg0, int[] arg1);

    @OriginalMember(owner = "client!ja", name = "la", descriptor = "()V")
    private final native void method1884();

    @OriginalMember(owner = "client!ja", name = "NA", descriptor = "(JI)V")
    private final native void method1885(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(JIII[I)V")
    private final native void method1886(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "XA", descriptor = "(JIII[I)V")
    private final native void method1887(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "(J)V")
    private final native void method1888(long arg0);

    @OriginalMember(owner = "client!ja", name = "va", descriptor = "(JIII[I)V")
    private final native void method1889(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "(JI)V")
    private final native void method1890(long arg0, int arg1);
}
