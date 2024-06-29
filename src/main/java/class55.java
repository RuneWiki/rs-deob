import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class55 extends class151 {

    @OriginalMember(owner = "client!mh", name = "N", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field931;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public final Object method67(int arg0) {
        int var2 = 118 / ((arg0 + 15) / 61);
        return this.field931.get();
    }

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "(I)Z")
    public final boolean method68(int arg0) {
        int var2 = 26 % ((arg0 - 61) / 46);
        return true;
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class55(Object arg0) {
        this.field931 = new SoftReference(arg0);
    }
}
