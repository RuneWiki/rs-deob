import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class93 extends class391 implements class198 {

    @OriginalMember(owner = "client!ra", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ra", name = "ja", descriptor = "()V")
    private final native void method773();

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "()Lq;")
    public final class391 method251() {
        class93 var1 = new class93();
        var1.method274(this);
        return var1;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III[I)V")
    public final void method239(int arg0, int arg1, int arg2, int[] arg3) {
        this.method774(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "(III[I)V")
    private final native void method774(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ra", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class509.method2924((byte) -106, this);
        }
    }

    @OriginalMember(owner = "client!ra", name = "NA", descriptor = "(III)V")
    public final native void method252(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ra", name = "oa", descriptor = "(I)V")
    public final native void method256(int arg0);

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "(Lq;)V")
    public final native void method274(class391 arg0);

    @OriginalMember(owner = "client!ra", name = "wa", descriptor = "(III[I)V")
    public final native void method238(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ra", name = "Y", descriptor = "()V")
    public final native void method271();

    @OriginalMember(owner = "client!ra", name = "AA", descriptor = "(I)V")
    public final native void method258(int arg0);

    @OriginalMember(owner = "client!ra", name = "na", descriptor = "(IIIIII)V")
    public final native void method240(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "(I)V")
    public final native void method249(int arg0);

    @OriginalMember(owner = "client!ra", name = "YA", descriptor = "([I)V")
    public final native void method236(int[] arg0);

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
    public class93() {
        this.method773();
    }

    @OriginalMember(owner = "client!ra", name = "UA", descriptor = "(Z)V")
    public final native void method131(boolean arg0);

    @OriginalMember(owner = "client!ra", name = "ZA", descriptor = "(I)V")
    public final native void method272(int arg0);

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "(I)V")
    public final native void method248(int arg0);

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "(I)V")
    public final native void method245(int arg0);

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "(III)V")
    public final native void method270(int arg0, int arg1, int arg2);
}
