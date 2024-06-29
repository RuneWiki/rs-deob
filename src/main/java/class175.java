import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class175 extends class79 {

    @OriginalMember(owner = "client!kv", name = "H", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2579;

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 5)
    public class175(Object arg0, int arg1) {
        super(arg1);
        this.field2579 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "(B)Ljava/lang/Object;", line = 15)
    public final Object method142(byte arg0) {
        int var2 = -66 / ((arg0 + 65) / 59);
        return this.field2579.get();
    }

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "(B)Z", line = 23)
    public final boolean method141(byte arg0) {
        if (arg0 != 55) {
            this.field2579 = null;
        }
        return true;
    }
}
