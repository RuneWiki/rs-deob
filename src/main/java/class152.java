import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class152 extends class33 {

    @OriginalMember(owner = "client!hg", name = "G", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2111;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(B)Ljava/lang/Object;", line = 6)
    public final Object method190(byte arg0) {
        if (arg0 != 80) {
            this.method184(71);
        }
        return this.field2111.get();
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(I)Z", line = 17)
    public final boolean method184(int arg0) {
        int var2 = 17 % ((27 - arg0) / 45);
        return true;
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 23)
    public class152(Object arg0) {
        this.field2111 = new SoftReference(arg0);
    }
}
