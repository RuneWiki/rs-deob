import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class361 extends class163 implements class28 {

    @OriginalMember(owner = "client!q", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "(I)V")
    public final native void method671(int arg0);

    @OriginalMember(owner = "client!q", name = "EA", descriptor = "(Lm;)V")
    public final native void method676(class163 arg0);

    @OriginalMember(owner = "client!q", name = "I", descriptor = "(III[I)V")
    public final native void method662(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "NA", descriptor = "(Z)V")
    public final native void method61(boolean arg0);

    @OriginalMember(owner = "client!q", name = "oa", descriptor = "(III)V")
    public final native void method661(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class49.method261(0, this);
        }
    }

    @OriginalMember(owner = "client!q", name = "B", descriptor = "(IIIIII)V")
    public final native void method669(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!q", name = "TA", descriptor = "(III)V")
    public final native void method655(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "XA", descriptor = "(I)V")
    public final native void method672(int arg0);

    @OriginalMember(owner = "client!q", name = "KA", descriptor = "(I)V")
    public final native void method659(int arg0);

    @OriginalMember(owner = "client!q", name = "va", descriptor = "([I)V")
    public final native void method660(int[] arg0);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III[I)V")
    public final void method657(int arg0, int arg1, int arg2, int[] arg3) {
        this.method2031(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "()Lm;")
    public final class163 method675() {
        class361 var1 = new class361();
        var1.method676(this);
        return var1;
    }

    @OriginalMember(owner = "client!q", name = "i", descriptor = "()V")
    private final native void method2030();

    @OriginalMember(owner = "client!q", name = "ta", descriptor = "(I)V")
    public final native void method666(int arg0);

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(III[I)V")
    private final native void method2031(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "ha", descriptor = "()V")
    public final native void method656();

    @OriginalMember(owner = "client!q", name = "ma", descriptor = "(I)V")
    public final native void method664(int arg0);

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
    public class361() {
        this.method2030();
    }
}
