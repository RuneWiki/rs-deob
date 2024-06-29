import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class496 extends class524 {

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field7005;

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lhh;Ljava/lang/Object;I)V", line = 4)
    public class496(class132 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field7005 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)Z", line = 14)
    public final boolean method682(int arg0) {
        int var2 = 50 % ((-arg0 - 33) / 37);
        return true;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 23)
    public final Object method681(int arg0) {
        int var2 = 68 % ((arg0 + 46) / 58);
        return this.field7005.get();
    }
}
