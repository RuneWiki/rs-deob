import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class133 extends class291 {

    @OriginalMember(owner = "client!ab", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2214;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(B)Ljava/lang/Object;")
    public final Object method953(byte arg0) {
        int var2 = 102 % ((arg0 - 65) / 59);
        return this.field2214.get();
    }

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "(B)Z")
    public final boolean method954(byte arg0) {
        return arg0 >= -14 ? true : true;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class133(Object arg0) {
        this.field2214 = new SoftReference(arg0);
    }
}
