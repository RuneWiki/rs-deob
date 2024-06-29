import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class521 extends class23 implements class47 {

    @OriginalMember(owner = "client!sa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V")
    public final native void method181(int arg0);

    @OriginalMember(owner = "client!sa", name = "ea", descriptor = "(III[I)V")
    private final native void method3097(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "()V")
    private final native void method3098();

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "(I)V")
    public final native void method175(int arg0);

    @OriginalMember(owner = "client!sa", name = "ya", descriptor = "()V")
    public final native void method218();

    @OriginalMember(owner = "client!sa", name = "ZA", descriptor = "(III)V")
    public final native void method177(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class342.method2198(this, (byte) -50);
    }

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "(IIIIII)V")
    public final native void method184(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!sa", name = "YA", descriptor = "(I)V")
    public final native void method182(int arg0);

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "(III[I)V")
    public final native void method188(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!sa", name = "HA", descriptor = "()V")
    public final native void method189();

    @OriginalMember(owner = "client!sa", name = "ba", descriptor = "(Lia;)V")
    public final native void method179(class23 arg0);

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "([I)V")
    public final native void method176(int[] arg0);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III[I)V")
    public final void method174(int arg0, int arg1, int arg2, int[] arg3) {
        this.method3097(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!sa", name = "ma", descriptor = "(I)V")
    public final native void method178(int arg0);

    @OriginalMember(owner = "client!sa", name = "na", descriptor = "(I)V")
    public final native void method186(int arg0);

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "(III)V")
    public final native void method185(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
    public class521() {
        this.method3098();
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "()Lia;")
    public final class23 method183() {
        class521 var1 = new class521();
        var1.method179(this);
        return var1;
    }
}
