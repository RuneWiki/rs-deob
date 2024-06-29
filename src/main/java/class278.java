import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class278 extends class738 implements class534 {

    @OriginalMember(owner = "client!ja", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V", line = 5)
    public final void method760(int arg0) {
        this.method1774(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIII)V", line = 8)
    public final void method775(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1763(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()Lql;", line = 15)
    public final class738 method759() {
        class278 var1 = new class278();
        var1.method772(this);
        return var1;
    }

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(Z)V", line = 21)
    public final void method105(boolean arg0) {
        this.method1777(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V", line = 24)
    public final void method763(int arg0) {
        this.method1767(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III[I)V", line = 29)
    public final void method776(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1773(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V", line = 32)
    public final void method777(int arg0) {
        this.method1771(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V", line = 39)
    public final void method765(int arg0) {
        this.method1779(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([I)V", line = 42)
    public final void method771(int[] arg0) {
        this.method1765(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(III[I)V", line = 45)
    public final void method767(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1764(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V", line = 50)
    public final void method768(int arg0) {
        this.method1778(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III)V", line = 61)
    public final void method758(int arg0, int arg1, int arg2) {
        this.method1770(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V", line = 66)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class161.method1176(this, 0);
        }
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V", line = 71)
    public final void method764(int arg0) {
        this.method1775(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III[I)V", line = 74)
    public final void method766(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1766(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()V", line = 77)
    public final void method769() {
        this.method1772(this.nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V", line = 80)
    public class278() {
        this.method1769();
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lql;)V", line = 85)
    public final void method772(class738 arg0) {
        this.method1776(this.nativeid, ((class278) arg0).nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V", line = 88)
    public final void method774(int arg0, int arg1, int arg2) {
        this.method1768(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "(JIIIIII)V")
    private final native void method1763(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(JIII[I)V")
    private final native void method1764(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(J[I)V")
    private final native void method1765(long arg0, int[] arg1);

    @OriginalMember(owner = "client!ja", name = "va", descriptor = "(JIII[I)V")
    private final native void method1766(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "(JI)V")
    private final native void method1767(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "FA", descriptor = "(JIII)V")
    private final native void method1768(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "la", descriptor = "()V")
    private final native void method1769();

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(JIII)V")
    private final native void method1770(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "NA", descriptor = "(JI)V")
    private final native void method1771(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "(J)V")
    private final native void method1772(long arg0);

    @OriginalMember(owner = "client!ja", name = "XA", descriptor = "(JIII[I)V")
    private final native void method1773(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "za", descriptor = "(JI)V")
    private final native void method1774(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "(JI)V")
    private final native void method1775(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "(JJ)V")
    private final native void method1776(long arg0, long arg1);

    @OriginalMember(owner = "client!ja", name = "AA", descriptor = "(JZ)V")
    private final native void method1777(long arg0, boolean arg1);

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "(JI)V")
    private final native void method1778(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "VA", descriptor = "(JI)V")
    private final native void method1779(long arg0, int arg1);
}
