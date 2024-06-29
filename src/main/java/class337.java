import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class337 extends class234 {

    @OriginalMember(owner = "client!cc", name = "C", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field4818;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "(B)Ljava/lang/Object;")
    public final Object method1723(byte arg0) {
        if (arg0 > -55) {
            this.method1722((byte) -25);
        }
        return this.field4818.get();
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(B)Z")
    public final boolean method1722(byte arg0) {
        return arg0 > -35 ? true : true;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lmc;Ljava/lang/Object;)V")
    public class337(class316 arg0, Object arg1) {
        super(arg0);
        this.field4818 = new SoftReference(arg1);
    }
}
