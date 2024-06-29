import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class185 extends class14 implements class415 {

    @OriginalMember(owner = "client!ja", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "(III)V")
    public final native void method146(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ja", name = "ya", descriptor = "(Ln;)V")
    public final native void method151(class14 arg0);

    @OriginalMember(owner = "client!ja", name = "M", descriptor = "([I)V")
    public final native void method149(int[] arg0);

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "(I)V")
    public final native void method150(int arg0);

    @OriginalMember(owner = "client!ja", name = "ba", descriptor = "(I)V")
    public final native void method152(int arg0);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()Ln;")
    public final class14 method155() {
        class185 var1 = new class185();
        var1.method151(this);
        return var1;
    }

    @OriginalMember(owner = "client!ja", name = "C", descriptor = "(III)V")
    public final native void method141(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ja", name = "SA", descriptor = "(I)V")
    public final native void method145(int arg0);

    @OriginalMember(owner = "client!ja", name = "pa", descriptor = "()V")
    public final native void method304();

    @OriginalMember(owner = "client!ja", name = "CA", descriptor = "(I)V")
    public final native void method153(int arg0);

    @OriginalMember(owner = "client!ja", name = "IA", descriptor = "(IIIIII)V")
    public final native void method140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ja", name = "KA", descriptor = "(III[I)V")
    private final native void method1250(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class93.method626(this, 0);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III[I)V")
    public final void method142(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1250(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
    public class185() {
        this.method1251();
    }

    @OriginalMember(owner = "client!ja", name = "WA", descriptor = "(I)V")
    public final native void method154(int arg0);

    @OriginalMember(owner = "client!ja", name = "N", descriptor = "(III[I)V")
    public final native void method147(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ja", name = "Y", descriptor = "()V")
    private final native void method1251();

    @OriginalMember(owner = "client!ja", name = "K", descriptor = "()V")
    public final native void method148();
}
