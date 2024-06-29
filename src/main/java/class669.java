import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class669 extends class765 implements class784 {

    @OriginalMember(owner = "client!ja", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public final void method1551(int arg0) {
        this.method3748(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V")
    public final void method1562(int arg0) {
        this.method3745(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V")
    public final void method1566(int arg0) {
        this.method3742(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III)V")
    public final void method1558(int arg0, int arg1, int arg2) {
        this.method3753(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()V")
    public final void method1569() {
        this.method3746(this.nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()Ldm;")
    public final class765 method1556() {
        class669 var1 = new class669();
        var1.method1552(this);
        return var1;
    }

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "(JI)V")
    private final native void method3742(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "(JI)V")
    private final native void method3743(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V")
    public final void method1560(int arg0) {
        this.method3744(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "NA", descriptor = "(JI)V")
    private final native void method3744(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class270.method1726(this, -1);
        }
    }

    @OriginalMember(owner = "client!ja", name = "VA", descriptor = "(JI)V")
    private final native void method3745(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III[I)V")
    public final void method1549(int arg0, int arg1, int arg2, int[] arg3) {
        this.method3757(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "(J)V")
    private final native void method3746(long arg0);

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "(JI)V")
    private final native void method3747(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V")
    public final void method1561(int arg0) {
        this.method3747(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III[I)V")
    public final void method1571(int arg0, int arg1, int arg2, int[] arg3) {
        this.method3750(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
    public final void method1553(int arg0) {
        this.method3743(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "za", descriptor = "(JI)V")
    private final native void method3748(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "(JJ)V")
    private final native void method3749(long arg0, long arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ldm;)V")
    public final void method1552(class765 arg0) {
        this.method3749(this.nativeid, ((class669) arg0).nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(JIII[I)V")
    private final native void method3750(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V")
    public final void method1568(int arg0, int arg1, int arg2) {
        this.method3755(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "(JIIIIII)V")
    private final native void method3751(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(Z)V")
    public final void method444(boolean arg0) {
        this.method3752(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "AA", descriptor = "(JZ)V")
    private final native void method3752(long arg0, boolean arg1);

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(III[I)V")
    public final void method1559(int arg0, int arg1, int arg2, int[] arg3) {
        this.method3758(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(JIII)V")
    private final native void method3753(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(J[I)V")
    private final native void method3754(long arg0, int[] arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIII)V")
    public final void method1567(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method3751(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ja", name = "FA", descriptor = "(JIII)V")
    private final native void method3755(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([I)V")
    public final void method1555(int[] arg0) {
        this.method3754(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "la", descriptor = "()V")
    private final native void method3756();

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
    public class669() {
        this.method3756();
    }

    @OriginalMember(owner = "client!ja", name = "XA", descriptor = "(JIII[I)V")
    private final native void method3757(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "va", descriptor = "(JIII[I)V")
    private final native void method3758(long arg0, int arg1, int arg2, int arg3, int[] arg4);
}
