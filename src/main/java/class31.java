import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class31 extends class122 implements class103 {

    @OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III[I)V")
    public final void method178(int arg0, int arg1, int arg2, int[] arg3) {
        this.method186(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!i", name = "EA", descriptor = "()V")
    public final native void method66();

    @OriginalMember(owner = "client!i", name = "xa", descriptor = "()V")
    public final native void method179();

    @OriginalMember(owner = "client!i", name = "s", descriptor = "(IIIIII)V")
    public final native void method180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!i", name = "ja", descriptor = "(I)V")
    public final native void method181(int arg0);

    @OriginalMember(owner = "client!i", name = "j", descriptor = "(III)V")
    public final native void method182(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "N", descriptor = "(I)V")
    public final native void method183(int arg0);

    @OriginalMember(owner = "client!i", name = "m", descriptor = "([I)V")
    public final native void method184(int[] arg0);

    @OriginalMember(owner = "client!i", name = "p", descriptor = "(III[I)V")
    public final native void method185(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class1.method1(this, (byte) -31);
    }

    @OriginalMember(owner = "client!i", name = "M", descriptor = "(III[I)V")
    private final native void method186(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!i", name = "ka", descriptor = "(I)V")
    public final native void method187(int arg0);

    @OriginalMember(owner = "client!i", name = "o", descriptor = "(III)V")
    public final native void method188(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()Lc;")
    public final class122 method189() {
        class31 var1 = new class31();
        var1.method192(this);
        return var1;
    }

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "()V")
    private final native void method190();

    @OriginalMember(owner = "client!i", name = "ra", descriptor = "(I)V")
    public final native void method191(int arg0);

    @OriginalMember(owner = "client!i", name = "za", descriptor = "(Lc;)V")
    public final native void method192(class122 arg0);

    @OriginalMember(owner = "client!i", name = "O", descriptor = "(I)V")
    public final native void method193(int arg0);

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
    public class31() {
        this.method190();
    }
}
