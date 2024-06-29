import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class132 extends class73 implements class2 {

    @OriginalMember(owner = "client!ja", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(J[I)V")
    private final native void method1062(long arg0, int[] arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIII)V")
    public final void method668(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1078(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V")
    public final void method671(int arg0, int arg1, int arg2) {
        this.method1069(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "(JI)V")
    private final native void method1063(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "VA", descriptor = "(JI)V")
    private final native void method1064(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()Ltc;")
    public final class73 method663() {
        class132 var1 = new class132();
        var1.method673(this);
        return var1;
    }

    @OriginalMember(owner = "client!ja", name = "FA", descriptor = "(JIII)V")
    private final native void method1065(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "XA", descriptor = "(JIII[I)V")
    private final native void method1066(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([I)V")
    public final void method666(int[] arg0) {
        this.method1062(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public final void method667(int arg0) {
        this.method1076(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "va", descriptor = "(JIII[I)V")
    private final native void method1067(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III[I)V")
    public final void method662(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1067(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "(J)V")
    private final native void method1068(long arg0);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(JIII)V")
    private final native void method1069(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(Z)V")
    public final void method5(boolean arg0) {
        this.method1077(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V")
    public final void method674(int arg0) {
        this.method1064(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V")
    public final void method672(int arg0) {
        this.method1072(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "NA", descriptor = "(JI)V")
    private final native void method1070(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "la", descriptor = "()V")
    private final native void method1071();

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
    public class132() {
        this.method1071();
    }

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "(JI)V")
    private final native void method1072(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III)V")
    public final void method675(int arg0, int arg1, int arg2) {
        this.method1065(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(JIII[I)V")
    private final native void method1073(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class389.method2431(this, -1);
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III[I)V")
    public final void method664(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1066(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V")
    public final void method670(int arg0) {
        this.method1070(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "(I)V")
    public final void method678(int arg0) {
        this.method1063(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "(JI)V")
    private final native void method1074(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "(JJ)V")
    private final native void method1075(long arg0, long arg1);

    @OriginalMember(owner = "client!ja", name = "za", descriptor = "(JI)V")
    private final native void method1076(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ltc;)V")
    public final void method673(class73 arg0) {
        this.method1075(this.nativeid, ((class132) arg0).nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(III[I)V")
    public final void method665(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1073(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()V")
    public final void method677() {
        this.method1068(this.nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "AA", descriptor = "(JZ)V")
    private final native void method1077(long arg0, boolean arg1);

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "(JIIIIII)V")
    private final native void method1078(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V")
    public final void method676(int arg0) {
        this.method1074(this.nativeid, arg0);
    }
}
