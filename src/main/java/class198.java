import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class198 extends class511 implements class240 {

    @OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() {
        class371.method2212((byte) -72, this);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()Lc;", line = 14)
    public final class511 method1301() {
        class198 var1 = new class198();
        var1.method1304(this);
        return var1;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III[I)V", line = 29)
    public final void method1308(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1310(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V", line = 32)
    public class198() {
        this.method1296();
    }

    @OriginalMember(owner = "client!i", name = "EA", descriptor = "()V")
    public final native void method471();

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "()V")
    private final native void method1296();

    @OriginalMember(owner = "client!i", name = "m", descriptor = "([I)V")
    public final native void method1297(int[] arg0);

    @OriginalMember(owner = "client!i", name = "ra", descriptor = "(I)V")
    public final native void method1298(int arg0);

    @OriginalMember(owner = "client!i", name = "ja", descriptor = "(I)V")
    public final native void method1299(int arg0);

    @OriginalMember(owner = "client!i", name = "s", descriptor = "(IIIIII)V")
    public final native void method1300(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!i", name = "N", descriptor = "(I)V")
    public final native void method1302(int arg0);

    @OriginalMember(owner = "client!i", name = "ka", descriptor = "(I)V")
    public final native void method1303(int arg0);

    @OriginalMember(owner = "client!i", name = "za", descriptor = "(Lc;)V")
    public final native void method1304(class511 arg0);

    @OriginalMember(owner = "client!i", name = "O", descriptor = "(I)V")
    public final native void method1305(int arg0);

    @OriginalMember(owner = "client!i", name = "p", descriptor = "(III[I)V")
    public final native void method1306(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!i", name = "j", descriptor = "(III)V")
    public final native void method1307(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "o", descriptor = "(III)V")
    public final native void method1309(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "M", descriptor = "(III[I)V")
    private final native void method1310(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!i", name = "xa", descriptor = "()V")
    public final native void method1311();
}
