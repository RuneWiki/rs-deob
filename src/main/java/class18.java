import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class18 extends class188 {

    @OriginalMember(owner = "client!l", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field127;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)Ljava/lang/Object;", line = 7)
    public final Object method121(byte arg0) {
        int var2 = 121 / ((arg0 - 67) / 48);
        return this.field127.get();
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(B)Z", line = 15)
    public final boolean method122(byte arg0) {
        if (arg0 <= 38) {
            this.method122((byte) -6);
        }
        return true;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 24)
    public class18(Object arg0, int arg1) {
        super(arg1);
        this.field127 = new SoftReference(arg0);
    }
}
