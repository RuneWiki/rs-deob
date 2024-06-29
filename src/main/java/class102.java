import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class102 extends class221 {

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field1456;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(B)Z", line = 6)
    public final boolean method709(byte arg0) {
        if (arg0 > -39) {
            this.method710((byte) -121);
        }
        return true;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 14)
    public class102(Object arg0) {
        this.field1456 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(B)Ljava/lang/Object;", line = 24)
    public final Object method710(byte arg0) {
        int var2 = -90 / ((arg0 + 20) / 52);
        return this.field1456.get();
    }
}
