import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class361 extends class163 implements class27 {

    @OriginalMember(owner = "client!q", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!q", name = "oa", descriptor = "(III)V")
    public final native void method1054(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "XA", descriptor = "(I)V")
    public final native void method1048(int arg0);

    @OriginalMember(owner = "client!q", name = "TA", descriptor = "(III)V")
    public final native void method1051(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "NA", descriptor = "(Z)V")
    public final native void method134(boolean arg0);

    @OriginalMember(owner = "client!q", name = "KA", descriptor = "(I)V")
    public final native void method1053(int arg0);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III[I)V")
    public final void method1044(int arg0, int arg1, int arg2, int[] arg3) {
        this.method2163(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!q", name = "B", descriptor = "(IIIIII)V")
    public final native void method1040(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!q", name = "ma", descriptor = "(I)V")
    public final native void method1047(int arg0);

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
    public class361() {
        this.method2164();
    }

    @OriginalMember(owner = "client!q", name = "I", descriptor = "(III[I)V")
    public final native void method1041(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "va", descriptor = "([I)V")
    public final native void method1042(int[] arg0);

    @OriginalMember(owner = "client!q", name = "ta", descriptor = "(I)V")
    public final native void method1046(int arg0);

    @OriginalMember(owner = "client!q", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class138.method926(this, -1);
        }
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(III[I)V")
    private final native void method2163(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "EA", descriptor = "(Lm;)V")
    public final native void method1049(class163 arg0);

    @OriginalMember(owner = "client!q", name = "k", descriptor = "(I)V")
    public final native void method1043(int arg0);

    @OriginalMember(owner = "client!q", name = "ha", descriptor = "()V")
    public final native void method1045();

    @OriginalMember(owner = "client!q", name = "i", descriptor = "()V")
    private final native void method2164();

    @OriginalMember(owner = "client!q", name = "a", descriptor = "()Lm;")
    public final class163 method1050() {
        class361 var1 = new class361();
        var1.method1049(this);
        return var1;
    }
}
