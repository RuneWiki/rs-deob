import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class523 extends class26 {

    @OriginalMember(owner = "client!pn", name = "D", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field7704;

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "(B)Z", line = 5)
    public final boolean method188(byte arg0) {
        if (arg0 != 48) {
            this.method189(-38);
        }
        return true;
    }

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "(I)Ljava/lang/Object;", line = 16)
    public final Object method189(int arg0) {
        return arg0 == 2048 ? this.field7704.get() : (Object) null;
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lcg;Ljava/lang/Object;I)V", line = 25)
    public class523(class90 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field7704 = new SoftReference(arg1);
    }
}
