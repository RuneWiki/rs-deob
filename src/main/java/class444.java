import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class444 extends class511 {

    @OriginalMember(owner = "client!un", name = "g", descriptor = "Lcw;")
    public class192 field6042;

    @OriginalMember(owner = "client!un", name = "h", descriptor = "Ljo;")
    public static class353 field6043 = new class353(16);

    @OriginalMember(owner = "client!un", name = "i", descriptor = "[I")
    public static int[] field6044 = new int[14];

    @OriginalMember(owner = "client!un", name = "j", descriptor = "[I")
    public static int[] field6045 = new int[1000];

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lqfa;II[B)V")
    public class444(class106 arg0, int arg1, int arg2, byte[] arg3) {
        this.field6042 = class243.method1618(arg1, arg0, false, arg2, arg3, 3361, 6406, 6406);
        this.field6042.method2314(false, false, 0);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(B)V")
    public static void method2644(byte arg0) {
        field6044 = null;
        if (arg0 > -26) {
            field6043 = null;
        }
        field6045 = null;
        field6043 = null;
    }
}
