import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class345 extends class138 {

    @OriginalMember(owner = "client!uo", name = "G", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field4981;

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "(B)Ljava/lang/Object;")
    public final Object method1051(byte arg0) {
        int var2 = -74 / ((-arg0 - 17) / 45);
        return this.field4981.get();
    }

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "(B)Z")
    public final boolean method1050(byte arg0) {
        return arg0 == -40 ? true : true;
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Laa;Ljava/lang/Object;)V")
    public class345(class283 arg0, Object arg1) {
        super(arg0);
        this.field4981 = new SoftReference(arg1);
    }
}
