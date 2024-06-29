import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class280 extends class487 implements class247 {

    @OriginalMember(owner = "client!ra", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "()Lq;")
    public final class487 method345() {
        class280 var1 = new class280();
        var1.method344(this);
        return var1;
    }

    @OriginalMember(owner = "client!ra", name = "AA", descriptor = "(I)V")
    public final native void method348(int arg0);

    @OriginalMember(owner = "client!ra", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class69.method386(-1995, this);
        }
    }

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "(I)V")
    public final native void method364(int arg0);

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "(I)V")
    public final native void method354(int arg0);

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "(III[I)V")
    private final native void method1666(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ra", name = "wa", descriptor = "(III[I)V")
    public final native void method358(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "(Lq;)V")
    public final native void method344(class487 arg0);

    @OriginalMember(owner = "client!ra", name = "NA", descriptor = "(III)V")
    public final native void method359(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ra", name = "na", descriptor = "(IIIIII)V")
    public final native void method351(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
    public class280() {
        this.method1667();
    }

    @OriginalMember(owner = "client!ra", name = "oa", descriptor = "(I)V")
    public final native void method361(int arg0);

    @OriginalMember(owner = "client!ra", name = "YA", descriptor = "([I)V")
    public final native void method365(int[] arg0);

    @OriginalMember(owner = "client!ra", name = "Y", descriptor = "()V")
    public final native void method352();

    @OriginalMember(owner = "client!ra", name = "ja", descriptor = "()V")
    private final native void method1667();

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III[I)V")
    public final void method363(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1666(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ra", name = "ZA", descriptor = "(I)V")
    public final native void method349(int arg0);

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "(III)V")
    public final native void method356(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ra", name = "UA", descriptor = "(Z)V")
    public final native void method528(boolean arg0);

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "(I)V")
    public final native void method357(int arg0);
}
