import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class134 extends class121 implements class2 {

    @OriginalMember(owner = "client!ja", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([I)V", line = 4)
    public final void method846(int[] arg0) {
        this.method957(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()Lsk;", line = 9)
    public final class121 method853() {
        class134 var1 = new class134();
        var1.method841(this);
        return var1;
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(III[I)V", line = 14)
    public final void method859(int arg0, int arg1, int arg2, int[] arg3) {
        this.method950(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V", line = 17)
    public final void method857(int arg0) {
        this.method958(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(Z)V", line = 21)
    public final void method9(boolean arg0) {
        this.method945(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V", line = 24)
    public final void method858(int arg0) {
        this.method956(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V", line = 28)
    public final void method844(int arg0) {
        this.method942(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V", line = 33)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class260.method1726(this, false);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIII)V", line = 42)
    public final void method854(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method947(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III)V", line = 48)
    public final void method849(int arg0, int arg1, int arg2) {
        this.method951(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III[I)V", line = 54)
    public final void method848(int arg0, int arg1, int arg2, int[] arg3) {
        this.method952(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "(I)V", line = 57)
    public final void method860(int arg0) {
        this.method943(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III[I)V", line = 61)
    public final void method855(int arg0, int arg1, int arg2, int[] arg3) {
        this.method944(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()V", line = 68)
    public final void method851() {
        this.method949(this.nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lsk;)V", line = 71)
    public final void method841(class121 arg0) {
        this.method948(this.nativeid, ((class134) arg0).nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V", line = 74)
    public final void method842(int arg0) {
        this.method954(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V", line = 77)
    public class134() {
        this.method946();
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V", line = 81)
    public final void method852(int arg0) {
        this.method955(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V", line = 84)
    public final void method845(int arg0, int arg1, int arg2) {
        this.method953(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "(JI)V")
    private final native void method942(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "(JI)V")
    private final native void method943(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "va", descriptor = "(JIII[I)V")
    private final native void method944(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "AA", descriptor = "(JZ)V")
    private final native void method945(long arg0, boolean arg1);

    @OriginalMember(owner = "client!ja", name = "la", descriptor = "()V")
    private final native void method946();

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "(JIIIIII)V")
    private final native void method947(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "(JJ)V")
    private final native void method948(long arg0, long arg1);

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "(J)V")
    private final native void method949(long arg0);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(JIII[I)V")
    private final native void method950(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(JIII)V")
    private final native void method951(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "XA", descriptor = "(JIII[I)V")
    private final native void method952(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "FA", descriptor = "(JIII)V")
    private final native void method953(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "VA", descriptor = "(JI)V")
    private final native void method954(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "(JI)V")
    private final native void method955(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "NA", descriptor = "(JI)V")
    private final native void method956(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(J[I)V")
    private final native void method957(long arg0, int[] arg1);

    @OriginalMember(owner = "client!ja", name = "za", descriptor = "(JI)V")
    private final native void method958(long arg0, int arg1);
}
