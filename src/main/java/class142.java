import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class142 extends class465 implements class2 {

    @OriginalMember(owner = "client!ja", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ja", name = "FA", descriptor = "(JIII)V")
    private final native void method805(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "(JI)V")
    private final native void method806(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class18.method80(-1, this);
        }
    }

    @OriginalMember(owner = "client!ja", name = "VA", descriptor = "(JI)V")
    private final native void method807(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III[I)V")
    public final void method446(int arg0, int arg1, int arg2, int[] arg3) {
        this.method809(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "XA", descriptor = "(JIII[I)V")
    private final native void method808(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(III[I)V")
    public final void method460(int arg0, int arg1, int arg2, int[] arg3) {
        this.method808(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V")
    public final void method463(int arg0) {
        this.method807(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([I)V")
    public final void method447(int[] arg0) {
        this.method819(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(JIII[I)V")
    private final native void method809(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "(JJ)V")
    private final native void method810(long arg0, long arg1);

    @OriginalMember(owner = "client!ja", name = "AA", descriptor = "(JZ)V")
    private final native void method811(long arg0, boolean arg1);

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "(JI)V")
    private final native void method812(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIII)V")
    public final void method465(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method821(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Loha;)V")
    public final void method468(class465 arg0) {
        this.method810(this.nativeid, ((class142) arg0).nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(JIII)V")
    private final native void method813(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V")
    public final void method467(int arg0) {
        this.method806(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "va", descriptor = "(JIII[I)V")
    private final native void method814(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
    public final void method456(int arg0) {
        this.method817(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "NA", descriptor = "(JI)V")
    private final native void method815(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public final void method454(int arg0) {
        this.method820(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V")
    public final void method448(int arg0) {
        this.method812(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "la", descriptor = "()V")
    private final native void method816();

    @OriginalMember(owner = "client!ja", name = "za", descriptor = "(JI)V")
    private final native void method817(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "(I)V")
    public final void method466(int arg0) {
        this.method815(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()Loha;")
    public final class465 method458() {
        class142 var1 = new class142();
        var1.method468(this);
        return var1;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V")
    public final void method450(int arg0, int arg1, int arg2) {
        this.method813(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III)V")
    public final void method449(int arg0, int arg1, int arg2) {
        this.method805(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III[I)V")
    public final void method457(int arg0, int arg1, int arg2, int[] arg3) {
        this.method814(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()V")
    public final void method462() {
        this.method818(this.nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
    public class142() {
        this.method816();
    }

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "(J)V")
    private final native void method818(long arg0);

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(J[I)V")
    private final native void method819(long arg0, int[] arg1);

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "(JI)V")
    private final native void method820(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(Z)V")
    public final void method5(boolean arg0) {
        this.method811(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "(JIIIIII)V")
    private final native void method821(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
