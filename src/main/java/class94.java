import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class94 extends class392 implements class200 {

    @OriginalMember(owner = "client!ra", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ra", name = "AA", descriptor = "(I)V")
    public final native void method673(int arg0);

    @OriginalMember(owner = "client!ra", name = "ZA", descriptor = "(I)V")
    public final native void method674(int arg0);

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "(Lq;)V")
    public final native void method675(class392 arg0);

    @OriginalMember(owner = "client!ra", name = "B", descriptor = "(III[I)V")
    public final native void method676(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ra", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class429.method2464(-84, this);
        }
    }

    @OriginalMember(owner = "client!ra", name = "YA", descriptor = "([I)V")
    public final native void method677(int[] arg0);

    @OriginalMember(owner = "client!ra", name = "oa", descriptor = "(I)V")
    public final native void method678(int arg0);

    @OriginalMember(owner = "client!ra", name = "Y", descriptor = "()V")
    public final native void method679();

    @OriginalMember(owner = "client!ra", name = "UA", descriptor = "(Z)V")
    public final native void method188(boolean arg0);

    @OriginalMember(owner = "client!ra", name = "na", descriptor = "(IIIIII)V")
    public final native void method680(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "()Lq;")
    public final class392 method681() {
        class94 var1 = new class94();
        var1.method675(this);
        return var1;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III[I)V")
    public final void method682(int arg0, int arg1, int arg2, int[] arg3) {
        this.method688(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ra", name = "ja", descriptor = "()V")
    private final native void method683();

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "(I)V")
    public final native void method684(int arg0);

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "(I)V")
    public final native void method685(int arg0);

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "(I)V")
    public final native void method686(int arg0);

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "(III)V")
    public final native void method687(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "(III[I)V")
    private final native void method688(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ra", name = "NA", descriptor = "(III)V")
    public final native void method689(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
    public class94() {
        this.method683();
    }

    @OriginalMember(owner = "client!ra", name = "wa", descriptor = "(III[I)V")
    public final native void method690(int arg0, int arg1, int arg2, int[] arg3);
}
