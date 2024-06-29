import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class570 {

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field7770 = -1;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field7769 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field7771;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public static int field7773;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "Luq;")
    public static class172 field7772;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "[Lfq;")
    public static class214[] field7774;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Luq;IZ)Lhh;")
    public static final class140 method3243(class172 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field7769 = null;
        }
        field7771++;
        class140 var3 = (class140) class738.field10011.method3109((byte) 116, (long) arg1);
        if (var3 == null) {
            if (class717.field9766) {
                var3 = class375.field5490.method466(class162.method1129(arg0, arg1), true);
            } else {
                var3 = class138.method960((byte) 78, arg0.method1176(arg1, 121));
            }
            class738.field10011.method3108((long) arg1, 16337, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
    public static void method3244(byte arg0) {
        field7774 = null;
        field7772 = null;
        if (arg0 < 14) {
            method3243(null, -75, false);
        }
        field7769 = null;
    }
}
