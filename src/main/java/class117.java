import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class117 extends class81 {

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field1896;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "(I)Ljava/lang/Object;", line = 5)
    public final Object method589(int arg0) {
        if (arg0 > -100) {
            this.method585((byte) 1);
        }
        return this.field1896.get();
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 14)
    public class117(Object arg0) {
        this.field1896 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)Z", line = 23)
    public final boolean method585(byte arg0) {
        return arg0 == 78 ? true : true;
    }
}
