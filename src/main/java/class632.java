import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public class class632 extends class574 {

    @OriginalMember(owner = "client!fca", name = "w", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field8929;

    @OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Lut;Ljava/lang/Object;I)V", line = 4)
    public class632(class688 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field8929 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(B)Z", line = 13)
    public final boolean method3116(byte arg0) {
        return arg0 == -5 ? true : true;
    }

    @OriginalMember(owner = "client!fca", name = "c", descriptor = "(I)Ljava/lang/Object;", line = 25)
    public final Object method3121(int arg0) {
        int var2 = 99 / ((arg0 - 3) / 58);
        return this.field8929.get();
    }
}
