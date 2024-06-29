import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class90 extends class189 {

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field1266;

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 4)
    public class90(Object arg0, int arg1) {
        super(arg1);
        this.field1266 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)Z", line = 13)
    public final boolean method579(int arg0) {
        if (arg0 != 71) {
            this.method580((byte) 2);
        }
        return true;
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(B)Ljava/lang/Object;", line = 23)
    public final Object method580(byte arg0) {
        if (arg0 > -56) {
            this.method579(89);
        }
        return this.field1266.get();
    }
}
