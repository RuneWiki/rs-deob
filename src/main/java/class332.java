import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class332 extends class276 {

    @OriginalMember(owner = "client!rr", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field4519;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)Ljava/lang/Object;", line = 5)
    public final Object method2253(byte arg0) {
        if (arg0 != -71) {
            this.method2254((byte) 96);
        }
        return this.field4519.get();
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(B)Z", line = 16)
    public final boolean method2254(byte arg0) {
        int var2 = 48 % ((arg0 - 13) / 62);
        return true;
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lrc;Ljava/lang/Object;I)V", line = 24)
    public class332(class131 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field4519 = new SoftReference(arg1);
    }
}
