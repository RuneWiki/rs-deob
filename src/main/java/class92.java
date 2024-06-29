import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class92 extends class394 implements class199 {

    @OriginalMember(owner = "client!ra", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "()Lq;", line = 5)
    public final class394 method708() {
        class92 var1 = new class92();
        var1.method711(this);
        return var1;
    }

    @OriginalMember(owner = "client!ra", name = "finalize", descriptor = "()V", line = 10)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class542.method3175(this, 0);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III[I)V", line = 30)
    public final void method720(int arg0, int arg1, int arg2, int[] arg3) {
        this.method719(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V", line = 37)
    public class92() {
        this.method716();
    }

    @OriginalMember(owner = "client!ra", name = "YA", descriptor = "([I)V")
    public final native void method709(int[] arg0);

    @OriginalMember(owner = "client!ra", name = "Y", descriptor = "()V")
    public final native void method710();

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "(Lq;)V")
    public final native void method711(class394 arg0);

    @OriginalMember(owner = "client!ra", name = "NA", descriptor = "(III)V")
    public final native void method712(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "(I)V")
    public final native void method713(int arg0);

    @OriginalMember(owner = "client!ra", name = "ZA", descriptor = "(I)V")
    public final native void method714(int arg0);

    @OriginalMember(owner = "client!ra", name = "UA", descriptor = "(Z)V")
    public final native void method221(boolean arg0);

    @OriginalMember(owner = "client!ra", name = "na", descriptor = "(IIIIII)V")
    public final native void method715(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ra", name = "ja", descriptor = "()V")
    private final native void method716();

    @OriginalMember(owner = "client!ra", name = "wa", descriptor = "(III[I)V")
    public final native void method717(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ra", name = "AA", descriptor = "(I)V")
    public final native void method718(int arg0);

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "(III[I)V")
    private final native void method719(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ra", name = "oa", descriptor = "(I)V")
    public final native void method721(int arg0);

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "(I)V")
    public final native void method722(int arg0);

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "(III)V")
    public final native void method723(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "(I)V")
    public final native void method724(int arg0);

    @OriginalMember(owner = "client!ra", name = "DA", descriptor = "(III[I)V")
    public final native void method725(int arg0, int arg1, int arg2, int[] arg3);
}
