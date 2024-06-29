import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class13 {

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "Lla;")
    public class418 field195 = null;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "Lufa;")
    public class632 field196 = null;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IBI)Z", line = 3)
    public static final boolean method200(int arg0, byte arg1, int arg2) {
        field194++;
        if (arg1 == -34) {
            boolean var3 = (arg2 & 0x37) == 0 ? class653.method3762(arg0, 115, arg2) : class666.method3826(arg2, -107, arg0);
            return var3 | class71.method727(arg2, arg0, false) | (arg0 & 0x10000) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lla;)V", line = 25)
    public class13(class418 arg0) {
        this.field195 = arg0;
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lla;Lufa;)V", line = 32)
    public class13(class418 arg0, class632 arg1) {
        this.field195 = arg0;
        this.field196 = arg1;
    }
}
