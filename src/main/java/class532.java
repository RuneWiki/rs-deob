import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class532 extends class364 implements class137 {

    @OriginalMember(owner = "client!wa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!wa", name = "la", descriptor = "(Lq;)V")
    public final native void method2004(class364 arg0);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "()Lq;")
    public final class364 method2020() {
        class532 var1 = new class532();
        var1.method2004(this);
        return var1;
    }

    @OriginalMember(owner = "client!wa", name = "pa", descriptor = "(IIIIII)V")
    public final native void method2019(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public final native void method2023(int arg0);

    @OriginalMember(owner = "client!wa", name = "Y", descriptor = "()V")
    public final native void method2021();

    @OriginalMember(owner = "client!wa", name = "S", descriptor = "(I)V")
    public final native void method2007(int arg0);

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "(III[I)V")
    private final native void method3115(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!wa", name = "P", descriptor = "(I)V")
    public final native void method2002(int arg0);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III[I)V")
    public final void method2018(int arg0, int arg1, int arg2, int[] arg3) {
        this.method3115(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!wa", name = "G", descriptor = "(III)V")
    public final native void method2006(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wa", name = "R", descriptor = "(III[I)V")
    public final native void method2003(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!wa", name = "GA", descriptor = "(III)V")
    public final native void method2014(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wa", name = "XA", descriptor = "(I)V")
    public final native void method2017(int arg0);

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "()V")
    private final native void method3116();

    @OriginalMember(owner = "client!wa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class284.method1838(this, 108);
        }
    }

    @OriginalMember(owner = "client!wa", name = "ra", descriptor = "(I)V")
    public final native void method2011(int arg0);

    @OriginalMember(owner = "client!wa", name = "O", descriptor = "([I)V")
    public final native void method2016(int[] arg0);

    @OriginalMember(owner = "client!wa", name = "H", descriptor = "(Z)V")
    public final native void method70(boolean arg0);

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V")
    public class532() {
        this.method3116();
    }
}
