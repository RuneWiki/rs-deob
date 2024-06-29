import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kja")
public class class516 extends class683 {

    @OriginalMember(owner = "client!kja", name = "w", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field7563;

    @OriginalMember(owner = "client!kja", name = "a", descriptor = "(I)Z")
    public final boolean method3373(int arg0) {
        return arg0 <= 39 ? true : true;
    }

    @OriginalMember(owner = "client!kja", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class516(Object arg0, int arg1) {
        super(arg1);
        this.field7563 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!kja", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public final Object method3374(byte arg0) {
        return arg0 == 26 ? this.field7563.get() : (Object) null;
    }
}
