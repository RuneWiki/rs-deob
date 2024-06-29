import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class165 extends class124 implements class294 {

    @OriginalMember(owner = "client!qa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "()V")
    public final native void method615();

    @OriginalMember(owner = "client!qa", name = "ea", descriptor = "(I)V")
    public final native void method830(int arg0);

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V")
    public final native void method838(int arg0);

    @OriginalMember(owner = "client!qa", name = "K", descriptor = "(III[I)V")
    public final native void method829(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class157.method1134((byte) 68, this);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()Lc;")
    public final class124 method833() {
        class165 var1 = new class165();
        var1.method828(this);
        return var1;
    }

    @OriginalMember(owner = "client!qa", name = "ha", descriptor = "(Lc;)V")
    public final native void method828(class124 arg0);

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "()V")
    public final native void method827();

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "(III)V")
    public final native void method835(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "EA", descriptor = "(I)V")
    public final native void method826(int arg0);

    @OriginalMember(owner = "client!qa", name = "pa", descriptor = "()V")
    private final native void method1165();

    @OriginalMember(owner = "client!qa", name = "YA", descriptor = "(IIIIII)V")
    public final native void method839(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(III[I)V")
    public final void method837(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1166(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "(III)V")
    public final native void method834(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "ca", descriptor = "(I)V")
    public final native void method832(int arg0);

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V")
    public class165() {
        this.method1165();
    }

    @OriginalMember(owner = "client!qa", name = "wa", descriptor = "([I)V")
    public final native void method831(int[] arg0);

    @OriginalMember(owner = "client!qa", name = "oa", descriptor = "(III[I)V")
    private final native void method1166(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "(I)V")
    public final native void method836(int arg0);
}
