import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class222 extends class245 {

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3931 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
    public static int field3933 = 2;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "Lpc;")
    public static class21 field3929;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "Lue;")
    public static class86 field3930;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IBII)I")
    public static final int method1509(int arg0, byte arg1, int arg2, int arg3) {
        field3932++;
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (arg1 < 65) {
            return 60;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)V")
    public static void method1510(int arg0) {
        field3930 = null;
        if (arg0 >= -43) {
            field3929 = null;
        }
        field3929 = null;
        field3931 = null;
    }
}
