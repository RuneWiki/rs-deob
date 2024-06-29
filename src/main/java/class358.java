import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class358 extends class366 {

    @OriginalMember(owner = "client!qj", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field5507;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "(I)Z")
    public final boolean method657(int arg0) {
        return arg0 == 16 ? true : true;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lsv;Ljava/lang/Object;I)V")
    public class358(class477 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field5507 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public final Object method656(int arg0) {
        int var2 = 77 % ((25 - arg0) / 62);
        return this.field5507.get();
    }
}
