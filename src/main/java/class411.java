import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class411 {

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "Lpi;")
    public static class340 field5485 = new class340(82, -1);

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "Z")
    public static boolean field5488 = false;

    @OriginalMember(owner = "client!wu", name = "g", descriptor = "I")
    public static int field5490 = -1;

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field5489 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "I")
    public static int field5486;

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!wu", name = "h", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "Lcm;")
    public class433 field5484;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIZIIIIII)Z")
    public static final boolean method2431(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5486++;
        int var9 = class37.field573.field5246[0];
        int var10 = class37.field573.field5251[0];
        if (var9 < 0 || var9 >= class200.field2594 || var10 < 0 || class118.field1647 <= var10) {
            return false;
        } else if (arg6 >= 0 && class200.field2594 > arg6 && arg5 >= 0 && arg5 < class118.field1647) {
            int var11 = class254.method1584(class37.field573.method2342(10804), class85.field1145, arg2, arg6, -50, var9, class157.field2067, class171.field2215[class37.field573.field6220], arg1, arg8, var10, arg3, arg0, arg5, arg7);
            if (var11 < 1) {
                return false;
            }
            class429.field5919 = class85.field1145[var11 - 1];
            class138.field1847 = class157.field2067[arg4 + var11];
            class403.field5425 = false;
            class167.method1119(true);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)V")
    public static void method2432(int arg0) {
        field5489 = null;
        if (arg0 < 61) {
            method2432(-11);
        }
        field5485 = null;
    }
}
