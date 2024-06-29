import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class280 extends class631 implements class535 {

    @OriginalMember(owner = "client!ja", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(J[I)V")
    private final native void method1650(long arg0, int[] arg1);

    @OriginalMember(owner = "client!ja", name = "za", descriptor = "(JI)V")
    private final native void method1651(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()Lpda;")
    public final class631 method611() {
        class280 var1 = new class280();
        var1.method604(this);
        return var1;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lpda;)V")
    public final void method604(class631 arg0) {
        this.method1662(this.nativeid, ((class280) arg0).nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V")
    public final void method610(int arg0) {
        this.method1665(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([I)V")
    public final void method597(int[] arg0) {
        this.method1650(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "(JIIIIII)V")
    private final native void method1652(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIII)V")
    public final void method592(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1652(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ja", name = "la", descriptor = "()V")
    private final native void method1653();

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V")
    public final void method590(int arg0) {
        this.method1654(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "VA", descriptor = "(JI)V")
    private final native void method1654(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "XA", descriptor = "(JIII[I)V")
    private final native void method1655(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "AA", descriptor = "(JZ)V")
    private final native void method1656(long arg0, boolean arg1);

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(Z)V")
    public final void method123(boolean arg0) {
        this.method1656(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
    public final void method601(int arg0) {
        this.method1658(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V")
    public final void method598(int arg0) {
        this.method1659(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III[I)V")
    public final void method599(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1664(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(JIII[I)V")
    private final native void method1657(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "(JI)V")
    private final native void method1658(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
    public class280() {
        this.method1653();
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(III[I)V")
    public final void method593(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1655(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "(JI)V")
    private final native void method1659(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "(JI)V")
    private final native void method1660(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(JIII)V")
    private final native void method1661(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()V")
    public final void method595() {
        this.method1663(this.nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public final void method594(int arg0) {
        this.method1660(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "(I)V")
    public final void method608(int arg0) {
        this.method1651(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class166.method1167(this, -1);
        }
    }

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "(JJ)V")
    private final native void method1662(long arg0, long arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III[I)V")
    public final void method606(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1657(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "(J)V")
    private final native void method1663(long arg0);

    @OriginalMember(owner = "client!ja", name = "va", descriptor = "(JIII[I)V")
    private final native void method1664(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "NA", descriptor = "(JI)V")
    private final native void method1665(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III)V")
    public final void method600(int arg0, int arg1, int arg2) {
        this.method1661(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "FA", descriptor = "(JIII)V")
    private final native void method1666(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V")
    public final void method596(int arg0, int arg1, int arg2) {
        this.method1666(this.nativeid, arg0, arg1, arg2);
    }
}
