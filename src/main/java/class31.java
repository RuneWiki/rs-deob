import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class31 extends class122 implements class103 {

    @OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V", line = 6)
    protected final void finalize() {
        class260.method1672((byte) 50, this);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()Lc;", line = 14)
    public final class122 method245() {
        class31 var1 = new class31();
        var1.method256(this);
        return var1;
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V", line = 21)
    public class31() {
        this.method246();
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III[I)V", line = 33)
    public final void method255(int arg0, int arg1, int arg2, int[] arg3) {
        this.method248(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!i", name = "p", descriptor = "(III[I)V")
    public final native void method241(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!i", name = "s", descriptor = "(IIIIII)V")
    public final native void method242(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!i", name = "O", descriptor = "(I)V")
    public final native void method243(int arg0);

    @OriginalMember(owner = "client!i", name = "m", descriptor = "([I)V")
    public final native void method244(int[] arg0);

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "()V")
    private final native void method246();

    @OriginalMember(owner = "client!i", name = "ja", descriptor = "(I)V")
    public final native void method247(int arg0);

    @OriginalMember(owner = "client!i", name = "M", descriptor = "(III[I)V")
    private final native void method248(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!i", name = "j", descriptor = "(III)V")
    public final native void method249(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "xa", descriptor = "()V")
    public final native void method250();

    @OriginalMember(owner = "client!i", name = "o", descriptor = "(III)V")
    public final native void method251(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "N", descriptor = "(I)V")
    public final native void method252(int arg0);

    @OriginalMember(owner = "client!i", name = "ra", descriptor = "(I)V")
    public final native void method253(int arg0);

    @OriginalMember(owner = "client!i", name = "ka", descriptor = "(I)V")
    public final native void method254(int arg0);

    @OriginalMember(owner = "client!i", name = "EA", descriptor = "()V")
    public final native void method101();

    @OriginalMember(owner = "client!i", name = "za", descriptor = "(Lc;)V")
    public final native void method256(class122 arg0);
}
