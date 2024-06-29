import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class354 extends class673 {

    @OriginalMember(owner = "client!ada", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field5162;

    @OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(Lrl;Ljava/lang/Object;I)V")
    public class354(class153 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field5162 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!ada", name = "g", descriptor = "(I)Z")
    public final boolean method2206(int arg0) {
        return arg0 == -1842 ? true : true;
    }

    @OriginalMember(owner = "client!ada", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public final Object method2207(byte arg0) {
        int var2 = 77 % ((1 - arg0) / 54);
        return this.field5162.get();
    }
}
