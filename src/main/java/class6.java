import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class6 extends class194 {

    @OriginalMember(owner = "client!wj", name = "G", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field40;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "(B)Ljava/lang/Object;")
    public final Object method52(byte arg0) {
        int var2 = 47 / ((40 - arg0) / 40);
        return this.field40.get();
    }

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(B)Z")
    public final boolean method53(byte arg0) {
        return arg0 == 67 ? true : true;
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class6(Object arg0) {
        this.field40 = new SoftReference(arg0);
    }
}
