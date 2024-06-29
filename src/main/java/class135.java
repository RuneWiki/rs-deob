import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class135 extends class723 implements class2 {

    @OriginalMember(owner = "client!ja", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V")
    public final void method843(int arg0) {
        this.method854(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V")
    public final void method844(int arg0) {
        this.method855(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(JIII[I)V")
    private final native void method845(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public final void method846(int arg0) {
        this.method875(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
    public final void method847(int arg0) {
        this.method852(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V")
    public final void method848(int arg0, int arg1, int arg2) {
        this.method874(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "(JI)V")
    private final native void method849(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(Z)V")
    public final void method3(boolean arg0) {
        this.method863(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "(JIIIIII)V")
    private final native void method850(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III)V")
    public final void method851(int arg0, int arg1, int arg2) {
        this.method867(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "za", descriptor = "(JI)V")
    private final native void method852(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIII)V")
    public final void method853(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method850(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ja", name = "VA", descriptor = "(JI)V")
    private final native void method854(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "(JI)V")
    private final native void method855(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "(JJ)V")
    private final native void method856(long arg0, long arg1);

    @OriginalMember(owner = "client!ja", name = "XA", descriptor = "(JIII[I)V")
    private final native void method857(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "(J)V")
    private final native void method858(long arg0);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()Luha;")
    public final class723 method859() {
        class135 var1 = new class135();
        var1.method864(this);
        return var1;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()V")
    public final void method860() {
        this.method858(this.nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III[I)V")
    public final void method861(int arg0, int arg1, int arg2, int[] arg3) {
        this.method845(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(J[I)V")
    private final native void method862(long arg0, int[] arg1);

    @OriginalMember(owner = "client!ja", name = "AA", descriptor = "(JZ)V")
    private final native void method863(long arg0, boolean arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Luha;)V")
    public final void method864(class723 arg0) {
        this.method856(this.nativeid, ((class135) arg0).nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "(JI)V")
    private final native void method865(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V")
    public final void method866(int arg0) {
        this.method849(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(JIII)V")
    private final native void method867(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "va", descriptor = "(JIII[I)V")
    private final native void method868(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "la", descriptor = "()V")
    private final native void method869();

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([I)V")
    public final void method870(int[] arg0) {
        this.method862(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class301.method1765(this, 0);
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
    public class135() {
        this.method869();
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(III[I)V")
    public final void method871(int arg0, int arg1, int arg2, int[] arg3) {
        this.method868(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III[I)V")
    public final void method872(int arg0, int arg1, int arg2, int[] arg3) {
        this.method857(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V")
    public final void method873(int arg0) {
        this.method865(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "FA", descriptor = "(JIII)V")
    private final native void method874(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "NA", descriptor = "(JI)V")
    private final native void method875(long arg0, int arg1);
}
