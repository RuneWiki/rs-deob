import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nja")
public class class522 extends class564 {

    @OriginalMember(owner = "client!nja", name = "D", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field7193;

    @OriginalMember(owner = "client!nja", name = "<init>", descriptor = "(Lwt;Ljava/lang/Object;I)V", line = 4)
    public class522(class520 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field7193 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!nja", name = "a", descriptor = "(Z)Z", line = 13)
    public final boolean method293(boolean arg0) {
        if (!arg0) {
            this.method294((byte) 120);
        }
        return true;
    }

    @OriginalMember(owner = "client!nja", name = "b", descriptor = "(B)Ljava/lang/Object;", line = 24)
    public final Object method294(byte arg0) {
        return arg0 == 36 ? this.field7193.get() : (Object) null;
    }
}
