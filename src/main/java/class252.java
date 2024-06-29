import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class252 extends class93 {

    @OriginalMember(owner = "client!ck", name = "P", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field4005;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(B)Z", line = 6)
    public final boolean method22(byte arg0) {
        int var2 = 104 / ((10 - arg0) / 57);
        return true;
    }

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "(B)Ljava/lang/Object;", line = 15)
    public final Object method20(byte arg0) {
        if (arg0 >= -106) {
            this.field4005 = (SoftReference) null;
        }
        return this.field4005.get();
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 23)
    public class252(Object arg0) {
        this.field4005 = new SoftReference(arg0);
    }
}
