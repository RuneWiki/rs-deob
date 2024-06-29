import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class284 extends class490 implements class251 {

    @OriginalMember(owner = "client!ra", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ra", name = "finalize", descriptor = "()V", line = 6)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class402.method2265(-46, this);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "()Lq;", line = 15)
    public final class490 method27() {
        class284 var1 = new class284();
        var1.method15(this);
        return var1;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III[I)V", line = 28)
    public final void method19(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1654(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V", line = 35)
    public class284() {
        this.method1655();
    }

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "(I)V")
    public final native void method17(int arg0);

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "(I)V")
    public final native void method18(int arg0);

    @OriginalMember(owner = "client!ra", name = "UA", descriptor = "(Z)V")
    public final native void method484(boolean arg0);

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "(I)V")
    public final native void method16(int arg0);

    @OriginalMember(owner = "client!ra", name = "YA", descriptor = "([I)V")
    public final native void method21(int[] arg0);

    @OriginalMember(owner = "client!ra", name = "ZA", descriptor = "(I)V")
    public final native void method24(int arg0);

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "(III[I)V")
    private final native void method1654(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ra", name = "NA", descriptor = "(III)V")
    public final native void method23(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ra", name = "wa", descriptor = "(III[I)V")
    public final native void method29(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ra", name = "oa", descriptor = "(I)V")
    public final native void method20(int arg0);

    @OriginalMember(owner = "client!ra", name = "Y", descriptor = "()V")
    public final native void method22();

    @OriginalMember(owner = "client!ra", name = "AA", descriptor = "(I)V")
    public final native void method26(int arg0);

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "(Lq;)V")
    public final native void method15(class490 arg0);

    @OriginalMember(owner = "client!ra", name = "na", descriptor = "(IIIIII)V")
    public final native void method25(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ra", name = "ja", descriptor = "()V")
    private final native void method1655();

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "(III)V")
    public final native void method30(int arg0, int arg1, int arg2);
}
