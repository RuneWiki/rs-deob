import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class275 extends IOException {

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "J")
    public static long field3910 = 0L;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILud;)Lgm;", line = 7)
    public static final class123 method1804(int arg0, class35 arg1) {
        field3911++;
        if (arg0 > -52) {
            field3910 = -56L;
        }
        class123 var2 = new class123();
        var2.field1901 = arg1.method253(-13900);
        var2.field1902 = class643.field9141.method3679(var2.field1901, 64);
        return var2;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 22)
    public class275(String arg0) {
        super(arg0);
    }
}
