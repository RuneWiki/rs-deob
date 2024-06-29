import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class282 extends class491 implements class249 {

    @OriginalMember(owner = "client!ra", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III[I)V", line = 9)
    public final void method906(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1595(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "()Lq;", line = 17)
    public final class491 method907() {
        class282 var1 = new class282();
        var1.method919(this);
        return var1;
    }

    @OriginalMember(owner = "client!ra", name = "finalize", descriptor = "()V", line = 28)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class499.method2689(this, (byte) 68);
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V", line = 36)
    public class282() {
        this.method1596();
    }

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "(III[I)V")
    private final native void method1595(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ra", name = "oa", descriptor = "(I)V")
    public final native void method911(int arg0);

    @OriginalMember(owner = "client!ra", name = "ZA", descriptor = "(I)V")
    public final native void method910(int arg0);

    @OriginalMember(owner = "client!ra", name = "AA", descriptor = "(I)V")
    public final native void method924(int arg0);

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "(I)V")
    public final native void method922(int arg0);

    @OriginalMember(owner = "client!ra", name = "ja", descriptor = "()V")
    private final native void method1596();

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "(III)V")
    public final native void method903(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "(Lq;)V")
    public final native void method919(class491 arg0);

    @OriginalMember(owner = "client!ra", name = "NA", descriptor = "(III)V")
    public final native void method914(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ra", name = "YA", descriptor = "([I)V")
    public final native void method901(int[] arg0);

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "(I)V")
    public final native void method902(int arg0);

    @OriginalMember(owner = "client!ra", name = "UA", descriptor = "(Z)V")
    public final native void method548(boolean arg0);

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "(I)V")
    public final native void method908(int arg0);

    @OriginalMember(owner = "client!ra", name = "Y", descriptor = "()V")
    public final native void method918();

    @OriginalMember(owner = "client!ra", name = "wa", descriptor = "(III[I)V")
    public final native void method905(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ra", name = "na", descriptor = "(IIIIII)V")
    public final native void method920(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
