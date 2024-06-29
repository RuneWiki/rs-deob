import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class98 extends class355 {

    @OriginalMember(owner = "client!wp", name = "L", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field1242;

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class98(Object arg0) {
        this.field1242 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "(B)Z")
    public final boolean method494(byte arg0) {
        int var2 = 9 % ((10 - arg0) / 47);
        return true;
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)Ljava/lang/Object;")
    public final Object method491(int arg0) {
        int var2 = -48 / ((arg0 - 80) / 40);
        return this.field1242.get();
    }
}
