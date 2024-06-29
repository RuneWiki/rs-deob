import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class276 extends class513 implements class532 {

    @OriginalMember(owner = "client!ja", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ja", name = "XA", descriptor = "(JIII[I)V")
    private final native void method1788(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()V")
    public final void method351() {
        this.method1790(this.nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "va", descriptor = "(JIII[I)V")
    private final native void method1789(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III[I)V")
    public final void method353(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1789(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "(J)V")
    private final native void method1790(long arg0);

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "(JJ)V")
    private final native void method1791(long arg0, long arg1);

    @OriginalMember(owner = "client!ja", name = "za", descriptor = "(JI)V")
    private final native void method1792(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(Z)V")
    public final void method106(boolean arg0) {
        this.method1794(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "NA", descriptor = "(JI)V")
    private final native void method1793(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([I)V")
    public final void method348(int[] arg0) {
        this.method1795(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "AA", descriptor = "(JZ)V")
    private final native void method1794(long arg0, boolean arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lnga;)V")
    public final void method344(class513 arg0) {
        this.method1791(this.nativeid, ((class276) arg0).nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()Lnga;")
    public final class513 method349() {
        class276 var1 = new class276();
        var1.method344(this);
        return var1;
    }

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(J[I)V")
    private final native void method1795(long arg0, int[] arg1);

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V")
    public final void method363(int arg0) {
        this.method1796(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III)V")
    public final void method339(int arg0, int arg1, int arg2) {
        this.method1798(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(III[I)V")
    public final void method357(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1799(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V")
    public final void method360(int arg0, int arg1, int arg2) {
        this.method1803(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "(JI)V")
    private final native void method1796(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class198.method1216((byte) 123, this);
        }
    }

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "(I)V")
    public final void method350(int arg0) {
        this.method1802(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "VA", descriptor = "(JI)V")
    private final native void method1797(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public final void method362(int arg0) {
        this.method1797(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III[I)V")
    public final void method338(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1788(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "FA", descriptor = "(JIII)V")
    private final native void method1798(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(JIII[I)V")
    private final native void method1799(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "la", descriptor = "()V")
    private final native void method1800();

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIII)V")
    public final void method340(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1801(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V")
    public final void method347(int arg0) {
        this.method1804(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "(JIIIIII)V")
    private final native void method1801(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "(JI)V")
    private final native void method1802(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(JIII)V")
    private final native void method1803(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "(JI)V")
    private final native void method1804(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
    public class276() {
        this.method1800();
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
    public final void method342(int arg0) {
        this.method1793(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V")
    public final void method356(int arg0) {
        this.method1792(this.nativeid, arg0);
    }
}
