import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class284 implements class233 {

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public int field3578;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field3581 = new String[8];

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)Z")
    public static final boolean method1696(int arg0, int arg1, int arg2) {
        field3579++;
        if (arg1 == 0) {
            return (arg2 & 0x70000) != 0 | class545.method3144(arg2, arg0, (byte) -124) || class589.method3348(arg0, arg1 + 124, arg2);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
    public static void method1697(int arg0) {
        if (arg0 > -82) {
            field3581 = null;
        }
        field3581 = null;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(I)V")
    public class284(int arg0) {
        this.field3578 = arg0;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)Lhm;")
    public final class223 method29(int arg0) {
        field3580++;
        if (arg0 != -200) {
            this.method29(25);
        }
        return class721.field10033;
    }
}
