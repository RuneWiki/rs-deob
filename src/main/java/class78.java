import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class78 extends class444 {

    @OriginalMember(owner = "client!fv", name = "G", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field1052;

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "(B)Ljava/lang/Object;", line = 5)
    public final Object method718(byte arg0) {
        if (arg0 < 22) {
            this.method718((byte) 93);
        }
        return this.field1052.get();
    }

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "(B)Z", line = 16)
    public final boolean method719(byte arg0) {
        return arg0 >= 81;
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lbq;Ljava/lang/Object;I)V", line = 25)
    public class78(class190 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field1052 = new SoftReference(arg1);
    }
}
