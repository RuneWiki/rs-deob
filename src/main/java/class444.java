import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class444 extends class513 {

    @OriginalMember(owner = "client!te", name = "G", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field6228;

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 5)
    public class444(Object arg0, int arg1) {
        super(arg1);
        this.field6228 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)Ljava/lang/Object;", line = 15)
    public final Object method2510(byte arg0) {
        int var2 = -12 / ((arg0 - 13) / 36);
        return this.field6228.get();
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)Z", line = 23)
    public final boolean method2508(int arg0) {
        if (arg0 != 23800) {
            this.method2508(81);
        }
        return true;
    }
}
