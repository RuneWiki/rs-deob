import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class178 extends class394 {

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2705;

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lue;Ljava/lang/Object;I)V")
    public class178(class154 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field2705 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)Z")
    public final boolean method1266(byte arg0) {
        return arg0 >= 90;
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public final Object method1267(byte arg0) {
        return arg0 == -94 ? this.field2705.get() : (Object) null;
    }
}
