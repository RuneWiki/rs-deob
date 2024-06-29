import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class514 implements class346 {

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "Ljava/lang/String;")
    private String field7327;

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "Lqt;")
    public static class634 field7326 = new class634();

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "I")
    public static int field7324;

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
    public static int field7328;

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "I")
    public static int field7329;

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "Z")
    private boolean field7325;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)Lqfa;", line = 4)
    public final class98 method492(int arg0) {
        field7329++;
        if (arg0 != -29480) {
            this.method492(116);
        }
        return class98.field1671;
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(I)Z", line = 15)
    public final boolean method3067(int arg0) {
        field7324++;
        if (arg0 != 0) {
            this.field7327 = null;
        }
        return this.field7325;
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(B)V", line = 29)
    public static void method3068(byte arg0) {
        field7326 = null;
        if (arg0 != -123) {
            field7326 = null;
        }
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 42)
    public class514(String arg0) {
        this.field7327 = arg0;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)I", line = 53)
    public final int method493(byte arg0) {
        field7328++;
        int var2 = class755.method4191(this.field7327, 0);
        if (var2 >= 0 && var2 <= 100) {
            return var2;
        }
        if (arg0 != 124) {
            field7326 = null;
        }
        this.field7325 = true;
        return 100;
    }
}
