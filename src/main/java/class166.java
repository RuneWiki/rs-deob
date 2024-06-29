import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class166 extends class125 implements class130 {

    @OriginalMember(owner = "client!qa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "(III)V")
    public final native void method825(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "(III)V")
    public final native void method824(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "YA", descriptor = "(IIIIII)V")
    public final native void method822(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "(I)V")
    public final native void method821(int arg0);

    @OriginalMember(owner = "client!qa", name = "ha", descriptor = "(Lc;)V")
    public final native void method828(class125 arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(III[I)V")
    public final void method819(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1049(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!qa", name = "wa", descriptor = "([I)V")
    public final native void method820(int[] arg0);

    @OriginalMember(owner = "client!qa", name = "ea", descriptor = "(I)V")
    public final native void method832(int arg0);

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "()V")
    public final native void method826();

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "()V")
    public final native void method540();

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V")
    public class166() {
        this.method1048();
    }

    @OriginalMember(owner = "client!qa", name = "K", descriptor = "(III[I)V")
    public final native void method818(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class512.method3054(-117, this);
        }
    }

    @OriginalMember(owner = "client!qa", name = "EA", descriptor = "(I)V")
    public final native void method823(int arg0);

    @OriginalMember(owner = "client!qa", name = "pa", descriptor = "()V")
    private final native void method1048();

    @OriginalMember(owner = "client!qa", name = "ca", descriptor = "(I)V")
    public final native void method830(int arg0);

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V")
    public final native void method831(int arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()Lc;")
    public final class125 method827() {
        class166 var1 = new class166();
        var1.method828(this);
        return var1;
    }

    @OriginalMember(owner = "client!qa", name = "oa", descriptor = "(III[I)V")
    private final native void method1049(int arg0, int arg1, int arg2, int[] arg3);
}
