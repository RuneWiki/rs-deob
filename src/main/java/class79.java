import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class79 extends class100 {

    @OriginalMember(owner = "client!mq", name = "t", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field1063;

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lmaa;Ljava/lang/Object;I)V")
    public class79(class42 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field1063 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)Z")
    public final boolean method448(int arg0) {
        int var2 = 4 / ((arg0 + 59) / 62);
        return true;
    }

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method449(boolean arg0) {
        return arg0 ? this.field1063.get() : (Object) null;
    }
}
