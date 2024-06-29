import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class31 extends class125 implements class105 {

    @OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()Lc;", line = 4)
    public final class125 method205() {
        class31 var1 = new class31();
        var1.method214(this);
        return var1;
    }

    @OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V", line = 23)
    protected final void finalize() {
        class438.method2701(-97, this);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III[I)V", line = 32)
    public final void method220(int arg0, int arg1, int arg2, int[] arg3) {
        this.method213(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V", line = 35)
    public class31() {
        this.method212();
    }

    @OriginalMember(owner = "client!i", name = "j", descriptor = "(III)V")
    public final native void method206(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "o", descriptor = "(III)V")
    public final native void method207(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "ka", descriptor = "(I)V")
    public final native void method208(int arg0);

    @OriginalMember(owner = "client!i", name = "xa", descriptor = "()V")
    public final native void method209();

    @OriginalMember(owner = "client!i", name = "ja", descriptor = "(I)V")
    public final native void method210(int arg0);

    @OriginalMember(owner = "client!i", name = "O", descriptor = "(I)V")
    public final native void method211(int arg0);

    @OriginalMember(owner = "client!i", name = "EA", descriptor = "()V")
    public final native void method119();

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "()V")
    private final native void method212();

    @OriginalMember(owner = "client!i", name = "M", descriptor = "(III[I)V")
    private final native void method213(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!i", name = "za", descriptor = "(Lc;)V")
    public final native void method214(class125 arg0);

    @OriginalMember(owner = "client!i", name = "m", descriptor = "([I)V")
    public final native void method215(int[] arg0);

    @OriginalMember(owner = "client!i", name = "ra", descriptor = "(I)V")
    public final native void method216(int arg0);

    @OriginalMember(owner = "client!i", name = "p", descriptor = "(III[I)V")
    public final native void method217(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!i", name = "s", descriptor = "(IIIIII)V")
    public final native void method218(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!i", name = "N", descriptor = "(I)V")
    public final native void method219(int arg0);
}
