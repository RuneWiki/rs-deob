import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class695 extends class136 {

    @OriginalMember(owner = "client!hda", name = "z", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field9859;

    @OriginalMember(owner = "client!hda", name = "d", descriptor = "(B)Z", line = 5)
    public final boolean method904(byte arg0) {
        if (arg0 >= -21) {
            this.field9859 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(Lbe;Ljava/lang/Object;I)V", line = 14)
    public class695(class35 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field9859 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!hda", name = "e", descriptor = "(I)Ljava/lang/Object;", line = 25)
    public final Object method906(int arg0) {
        int var2 = -58 / ((-arg0 - 32) / 45);
        return this.field9859.get();
    }
}
