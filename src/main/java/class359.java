import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class359 extends class151 implements class52 {

    @OriginalMember(owner = "client!ra", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ra", name = "UA", descriptor = "(Z)V")
    public final native void method306(boolean arg0);

    @OriginalMember(owner = "client!ra", name = "ja", descriptor = "()V")
    private final native void method2212();

    @OriginalMember(owner = "client!ra", name = "A", descriptor = "(III[I)V")
    public final native void method885(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ra", name = "wa", descriptor = "(III[I)V")
    public final native void method880(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ra", name = "oa", descriptor = "(I)V")
    public final native void method886(int arg0);

    @OriginalMember(owner = "client!ra", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class493.method2818(false, this);
        }
    }

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "(I)V")
    public final native void method884(int arg0);

    @OriginalMember(owner = "client!ra", name = "ZA", descriptor = "(I)V")
    public final native void method881(int arg0);

    @OriginalMember(owner = "client!ra", name = "NA", descriptor = "(III)V")
    public final native void method883(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "(III[I)V")
    private final native void method2213(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
    public class359() {
        this.method2212();
    }

    @OriginalMember(owner = "client!ra", name = "AA", descriptor = "(I)V")
    public final native void method879(int arg0);

    @OriginalMember(owner = "client!ra", name = "YA", descriptor = "([I)V")
    public final native void method882(int[] arg0);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III[I)V")
    public final void method892(int arg0, int arg1, int arg2, int[] arg3) {
        this.method2213(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "(I)V")
    public final native void method891(int arg0);

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "(III)V")
    public final native void method893(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ra", name = "na", descriptor = "(IIIIII)V")
    public final native void method878(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "(I)V")
    public final native void method889(int arg0);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "()Lq;")
    public final class151 method888() {
        class359 var1 = new class359();
        var1.method887(this);
        return var1;
    }

    @OriginalMember(owner = "client!ra", name = "Y", descriptor = "()V")
    public final native void method890();

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "(Lq;)V")
    public final native void method887(class151 arg0);
}
