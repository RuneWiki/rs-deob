import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class303 extends class25 {

    @OriginalMember(owner = "client!sb", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field3728;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(B)Z")
    public final boolean method175(byte arg0) {
        int var2 = 93 / ((arg0 + 70) / 55);
        return true;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public final Object method174(int arg0) {
        return arg0 == -9023 ? this.field3728.get() : (Object) null;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lgj;Ljava/lang/Object;I)V")
    public class303(class96 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field3728 = new SoftReference(arg1);
    }
}
