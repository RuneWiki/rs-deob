import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class90 extends class247 {

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field1259;

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 4)
    public class90(Object arg0) {
        this.field1259 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(B)Z", line = 13)
    public final boolean method715(byte arg0) {
        return arg0 == -29 ? true : true;
    }

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "(I)Ljava/lang/Object;", line = 23)
    public final Object method716(int arg0) {
        return arg0 == -25180 ? this.field1259.get() : (Object) null;
    }
}
