import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class187 extends class15 implements class416 {

    @OriginalMember(owner = "client!ja", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()Ln;")
    public final class15 method38() {
        class187 var1 = new class187();
        var1.method45(this);
        return var1;
    }

    @OriginalMember(owner = "client!ja", name = "KA", descriptor = "(III[I)V")
    private final native void method1285(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "(I)V")
    public final native void method41(int arg0);

    @OriginalMember(owner = "client!ja", name = "CA", descriptor = "(I)V")
    public final native void method36(int arg0);

    @OriginalMember(owner = "client!ja", name = "Y", descriptor = "()V")
    private final native void method1286();

    @OriginalMember(owner = "client!ja", name = "K", descriptor = "()V")
    public final native void method34();

    @OriginalMember(owner = "client!ja", name = "WA", descriptor = "(I)V")
    public final native void method46(int arg0);

    @OriginalMember(owner = "client!ja", name = "C", descriptor = "(III)V")
    public final native void method47(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ja", name = "SA", descriptor = "(I)V")
    public final native void method44(int arg0);

    @OriginalMember(owner = "client!ja", name = "ba", descriptor = "(I)V")
    public final native void method39(int arg0);

    @OriginalMember(owner = "client!ja", name = "ya", descriptor = "(Ln;)V")
    public final native void method45(class15 arg0);

    @OriginalMember(owner = "client!ja", name = "M", descriptor = "([I)V")
    public final native void method40(int[] arg0);

    @OriginalMember(owner = "client!ja", name = "pa", descriptor = "()V")
    public final native void method382();

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "(III)V")
    public final native void method37(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ja", name = "N", descriptor = "(III[I)V")
    public final native void method42(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class493.method2895(this, false);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III[I)V")
    public final void method43(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1285(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
    public class187() {
        this.method1286();
    }

    @OriginalMember(owner = "client!ja", name = "IA", descriptor = "(IIIIII)V")
    public final native void method35(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
