import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class361 extends class152 implements class52 {

    @OriginalMember(owner = "client!ra", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "()Lq;", line = 5)
    public final class152 method180() {
        class361 var1 = new class361();
        var1.method163(this);
        return var1;
    }

    @OriginalMember(owner = "client!ra", name = "finalize", descriptor = "()V", line = 15)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class388.method2372(this, 0);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III[I)V", line = 29)
    public final void method169(int arg0, int arg1, int arg2, int[] arg3) {
        this.method2163(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V", line = 38)
    public class361() {
        this.method2162();
    }

    @OriginalMember(owner = "client!ra", name = "ZA", descriptor = "(I)V")
    public final native void method170(int arg0);

    @OriginalMember(owner = "client!ra", name = "Y", descriptor = "()V")
    public final native void method167();

    @OriginalMember(owner = "client!ra", name = "ja", descriptor = "()V")
    private final native void method2162();

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "(I)V")
    public final native void method176(int arg0);

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "(III[I)V")
    private final native void method2163(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ra", name = "NA", descriptor = "(III)V")
    public final native void method166(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "(Lq;)V")
    public final native void method163(class152 arg0);

    @OriginalMember(owner = "client!ra", name = "AA", descriptor = "(I)V")
    public final native void method171(int arg0);

    @OriginalMember(owner = "client!ra", name = "na", descriptor = "(IIIIII)V")
    public final native void method153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "(I)V")
    public final native void method152(int arg0);

    @OriginalMember(owner = "client!ra", name = "YA", descriptor = "([I)V")
    public final native void method156(int[] arg0);

    @OriginalMember(owner = "client!ra", name = "wa", descriptor = "(III[I)V")
    public final native void method183(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ra", name = "BA", descriptor = "(III[I)V")
    public final native void method178(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ra", name = "UA", descriptor = "(Z)V")
    public final native void method411(boolean arg0);

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "(I)V")
    public final native void method164(int arg0);

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "(III)V")
    public final native void method158(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ra", name = "oa", descriptor = "(I)V")
    public final native void method165(int arg0);
}
