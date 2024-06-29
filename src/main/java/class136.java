import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class136 extends class415 implements class276 {

    @OriginalMember(owner = "client!sa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III[I)V")
    public final void method332(int arg0, int arg1, int arg2, int[] arg3) {
        this.method887(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!sa", name = "HA", descriptor = "()V")
    public final native void method328();

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V")
    public final native void method336(int arg0);

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "(III[I)V")
    public final native void method330(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!sa", name = "ZA", descriptor = "(III)V")
    public final native void method335(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sa", name = "na", descriptor = "(I)V")
    public final native void method345(int arg0);

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
    public class136() {
        this.method886();
    }

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "([I)V")
    public final native void method327(int[] arg0);

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "()V")
    private final native void method886();

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "(I)V")
    public final native void method343(int arg0);

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "(III)V")
    public final native void method340(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class390.method2237(true, this);
    }

    @OriginalMember(owner = "client!sa", name = "ba", descriptor = "(Lia;)V")
    public final native void method342(class415 arg0);

    @OriginalMember(owner = "client!sa", name = "ya", descriptor = "()V")
    public final native void method79();

    @OriginalMember(owner = "client!sa", name = "ma", descriptor = "(I)V")
    public final native void method347(int arg0);

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "(IIIIII)V")
    public final native void method341(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!sa", name = "YA", descriptor = "(I)V")
    public final native void method325(int arg0);

    @OriginalMember(owner = "client!sa", name = "ea", descriptor = "(III[I)V")
    private final native void method887(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "()Lia;")
    public final class415 method346() {
        class136 var1 = new class136();
        var1.method342(this);
        return var1;
    }
}
