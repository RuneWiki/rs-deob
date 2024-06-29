import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class279 extends class661 implements class532 {

    @OriginalMember(owner = "client!ja", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V", line = 10)
    public final void method752(int arg0, int arg1, int arg2) {
        this.method1846(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()V", line = 14)
    public final void method745() {
        this.method1839(this.nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(Z)V", line = 17)
    public final void method129(boolean arg0) {
        this.method1832(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(III[I)V", line = 20)
    public final void method771(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1837(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([I)V", line = 23)
    public final void method769(int[] arg0) {
        this.method1836(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "(I)V", line = 27)
    public final void method768(int arg0) {
        this.method1831(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIII)V", line = 31)
    public final void method747(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1845(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V", line = 35)
    public final void method756(int arg0) {
        this.method1843(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III[I)V", line = 40)
    public final void method770(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1844(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V", line = 45)
    public final void method742(int arg0) {
        this.method1834(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lbca;)V", line = 51)
    public final void method778(class661 arg0) {
        this.method1835(this.nativeid, ((class279) arg0).nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III[I)V", line = 55)
    public final void method750(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1842(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V", line = 62)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class305.method1997(0, this);
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V", line = 70)
    public final void method774(int arg0) {
        this.method1840(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()Lbca;", line = 74)
    public final class661 method763() {
        class279 var1 = new class279();
        var1.method778(this);
        return var1;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V", line = 79)
    public final void method748(int arg0) {
        this.method1838(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V", line = 81)
    public class279() {
        this.method1830();
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III)V", line = 85)
    public final void method744(int arg0, int arg1, int arg2) {
        this.method1841(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V", line = 88)
    public final void method749(int arg0) {
        this.method1833(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "la", descriptor = "()V")
    private final native void method1830();

    @OriginalMember(owner = "client!ja", name = "za", descriptor = "(JI)V")
    private final native void method1831(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "AA", descriptor = "(JZ)V")
    private final native void method1832(long arg0, boolean arg1);

    @OriginalMember(owner = "client!ja", name = "VA", descriptor = "(JI)V")
    private final native void method1833(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "NA", descriptor = "(JI)V")
    private final native void method1834(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "(JJ)V")
    private final native void method1835(long arg0, long arg1);

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(J[I)V")
    private final native void method1836(long arg0, int[] arg1);

    @OriginalMember(owner = "client!ja", name = "XA", descriptor = "(JIII[I)V")
    private final native void method1837(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "(JI)V")
    private final native void method1838(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "(J)V")
    private final native void method1839(long arg0);

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "(JI)V")
    private final native void method1840(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "FA", descriptor = "(JIII)V")
    private final native void method1841(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "va", descriptor = "(JIII[I)V")
    private final native void method1842(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "(JI)V")
    private final native void method1843(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(JIII[I)V")
    private final native void method1844(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "(JIIIIII)V")
    private final native void method1845(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(JIII)V")
    private final native void method1846(long arg0, int arg1, int arg2, int arg3);
}
