import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class235 extends class481 {

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2996;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)Z")
    public final boolean method910(byte arg0) {
        if (arg0 != 71) {
            this.method909(-93);
        }
        return true;
    }

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public final Object method909(int arg0) {
        if (arg0 != 0) {
            this.method910((byte) 7);
        }
        return this.field2996.get();
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lhf;Ljava/lang/Object;I)V")
    public class235(class272 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field2996 = new SoftReference(arg1);
    }
}
