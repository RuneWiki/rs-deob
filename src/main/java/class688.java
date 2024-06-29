import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public class class688 {

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "Lpa;")
    public static class387 field9745 = new class387(8);

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "I")
    public static int field9744;

    @OriginalMember(owner = "client!bca", name = "c", descriptor = "I")
    public static int field9746;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(B)V", line = 7)
    public static void method3879(byte arg0) {
        field9745 = null;
        if (arg0 >= -51) {
            field9745 = null;
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(Lrv;B)Lde;", line = 23)
    public static final class555 method3880(class120 arg0, byte arg1) {
        field9744++;
        int var2 = -47 % ((-arg1 - 35) / 57);
        class390 var3 = class579.method3364(arg0, -1);
        int var4 = arg0.method841(22551);
        return new class555(var3.field5545, var3.field5542, var3.field5540, var3.field5546, var3.field5544, var4);
    }
}
