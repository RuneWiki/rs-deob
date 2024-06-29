import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class185 {

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field3106 = -1;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field3107 = 0;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3105 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "Lma;")
    public static class263 field3110 = null;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(SI)Z", line = 18)
    public static final boolean method1373(short arg0, int arg1) {
        field3108++;
        if (arg1 != 18979) {
            return true;
        } else if (arg0 == 50 || arg0 == 34 || arg0 == 4 || arg0 == 15 || arg0 == 12 || arg0 == 21 || arg0 == 51 || arg0 == 33) {
            return true;
        } else if (arg0 == 49 || arg0 == 45 || arg0 == 1006 || arg0 == 1007) {
            return true;
        } else if (arg0 == 25 || arg0 == 20 || arg0 == 11 || arg0 == 47 || arg0 == 22) {
            return true;
        } else {
            return arg0 == 32 || arg0 == 30 || arg0 == 58 || arg0 == 35 || arg0 == 46 || arg0 == 16;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V", line = 53)
    public static void method1374(int arg0) {
        field3110 = null;
        field3105 = null;
        if (arg0 != -35) {
            field3110 = (class263) null;
        }
    }
}
