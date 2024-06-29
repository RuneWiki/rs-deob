import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class96 extends class465 {

    @OriginalMember(owner = "client!qm", name = "J", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field1408;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(B)Z", line = 5)
    public final boolean method554(byte arg0) {
        if (arg0 != 68) {
            this.method554((byte) 68);
        }
        return true;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 17)
    public final Object method555(int arg0) {
        int var2 = 125 % ((70 - arg0) / 52);
        return this.field1408.get();
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lvs;Ljava/lang/Object;I)V", line = 24)
    public class96(class416 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field1408 = new SoftReference(arg1);
    }
}
