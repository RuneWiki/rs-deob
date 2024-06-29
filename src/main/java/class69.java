import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class69 extends class39 {

    @OriginalMember(owner = "client!hk", name = "E", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field1132;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)Ljava/lang/Object;", line = 5)
    public final Object method325(byte arg0) {
        if (arg0 <= 70) {
            this.method325((byte) -30);
        }
        return this.field1132.get();
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(B)Z", line = 15)
    public final boolean method326(byte arg0) {
        return arg0 >= -25 ? true : true;
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 24)
    public class69(Object arg0) {
        this.field1132 = new SoftReference(arg0);
    }
}
