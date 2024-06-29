import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class199 extends class280 {

    @OriginalMember(owner = "client!di", name = "J", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field3477;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "(B)Ljava/lang/Object;", line = 6)
    public final Object method958(byte arg0) {
        int var2 = -23 % ((arg0 - 28) / 63);
        return this.field3477.get();
    }

    @OriginalMember(owner = "client!di", name = "g", descriptor = "(B)Z", line = 14)
    public final boolean method960(byte arg0) {
        if (arg0 < 75) {
            this.method958((byte) 88);
        }
        return true;
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 23)
    public class199(Object arg0) {
        this.field3477 = new SoftReference(arg0);
    }
}
