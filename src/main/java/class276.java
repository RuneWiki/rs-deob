import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class276 extends class280 implements class529 {

    @OriginalMember(owner = "client!ja", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([I)V", line = 5)
    public final void method187(int[] arg0) {
        this.method1821(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()Lkd;", line = 11)
    public final class280 method174() {
        class276 var1 = new class276();
        var1.method160(this);
        return var1;
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V", line = 16)
    public final void method172(int arg0) {
        this.method1818(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V", line = 20)
    public final void method150(int arg0) {
        this.method1813(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "(I)V", line = 23)
    public final void method156(int arg0) {
        this.method1814(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(Z)V", line = 31)
    public final void method107(boolean arg0) {
        this.method1809(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIII)V", line = 34)
    public final void method168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1816(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V", line = 38)
    public final void method190(int arg0) {
        this.method1819(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()V", line = 46)
    public final void method181() {
        this.method1807(this.nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(III[I)V", line = 49)
    public final void method151(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1820(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III[I)V", line = 54)
    public final void method155(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1811(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V", line = 57)
    public final void method182(int arg0) {
        this.method1815(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V", line = 61)
    public final void method149(int arg0, int arg1, int arg2) {
        this.method1810(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V", line = 65)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class727.method4045(this, 13483);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lkd;)V", line = 70)
    public final void method160(class280 arg0) {
        this.method1805(this.nativeid, ((class276) arg0).nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V", line = 75)
    public class276() {
        this.method1812();
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III)V", line = 79)
    public final void method157(int arg0, int arg1, int arg2) {
        this.method1817(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V", line = 84)
    public final void method188(int arg0) {
        this.method1806(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III[I)V", line = 87)
    public final void method162(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1808(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "(JJ)V")
    private final native void method1805(long arg0, long arg1);

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "(JI)V")
    private final native void method1806(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "(J)V")
    private final native void method1807(long arg0);

    @OriginalMember(owner = "client!ja", name = "XA", descriptor = "(JIII[I)V")
    private final native void method1808(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "AA", descriptor = "(JZ)V")
    private final native void method1809(long arg0, boolean arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(JIII)V")
    private final native void method1810(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(JIII[I)V")
    private final native void method1811(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "la", descriptor = "()V")
    private final native void method1812();

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "(JI)V")
    private final native void method1813(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "za", descriptor = "(JI)V")
    private final native void method1814(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "(JI)V")
    private final native void method1815(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "(JIIIIII)V")
    private final native void method1816(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ja", name = "FA", descriptor = "(JIII)V")
    private final native void method1817(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "VA", descriptor = "(JI)V")
    private final native void method1818(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "NA", descriptor = "(JI)V")
    private final native void method1819(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "va", descriptor = "(JIII[I)V")
    private final native void method1820(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(J[I)V")
    private final native void method1821(long arg0, int[] arg1);
}
