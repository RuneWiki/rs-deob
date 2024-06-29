import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class108 extends class223 {

    @OriginalMember(owner = "client!pk", name = "O", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field1743;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "(I)Z", line = 6)
    public final boolean method721(int arg0) {
        int var2 = 68 % ((-arg0 - 62) / 62);
        return true;
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 13)
    public class108(Object arg0) {
        this.field1743 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "(B)Ljava/lang/Object;", line = 22)
    public final Object method722(byte arg0) {
        if (arg0 != 116) {
            this.method722((byte) 67);
        }
        return this.field1743.get();
    }
}
