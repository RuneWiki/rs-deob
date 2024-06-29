import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class474 {

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field6926 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "Z")
    public static boolean field6930 = false;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "Lqp;")
    public static class466 field6929 = new class466(" more options", " weitere Optionen", " autres options", " mais opções");

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field6925;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field6927;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "[Ll;")
    public static class16[] field6928;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V", line = 8)
    public static void method2786(byte arg0) {
        field6929 = null;
        field6926 = null;
        field6928 = null;
        if (arg0 < 98) {
            field6929 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IBIZIII)V", line = 24)
    public static final void method2787(int arg0, byte arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class59.field715 = arg6;
        field6927++;
        if (arg1 != 123) {
            method2788((byte) 34);
        }
        class14.field208 = arg4;
        class501.field7377 = arg5;
        class70.field975 = arg0;
        class309.field4203 = arg2;
        if (arg3 && class14.field208 >= 100) {
            class373.field5478 = class501.field7377 * 128 + 64;
            class329.field4493 = class309.field4203 * 128 + 64;
            class62.field766 = class242.method1465(127, class436.field6379, class373.field5478, class329.field4493) - class59.field715;
        }
        class491.field7168 = 2;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V", line = 54)
    public static final void method2788(byte arg0) {
        int var1 = -80 / ((arg0 - 40) / 41);
        class242.field3385 = -1;
        class18.field238 = 0;
        field6925++;
        class285.field3961 = -1;
        class228.field3244 = -1;
    }
}
