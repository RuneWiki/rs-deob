import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class615 extends class134 {

    @OriginalMember(owner = "client!aw", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field8713;

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lvp;Ljava/lang/Object;I)V", line = 5)
    public class615(class110 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field8713 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(B)Z", line = 14)
    public final boolean method1031(byte arg0) {
        return arg0 == -99 ? true : true;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 24)
    public final Object method1029(int arg0) {
        if (arg0 != 10) {
            this.field8713 = null;
        }
        return this.field8713.get();
    }
}
