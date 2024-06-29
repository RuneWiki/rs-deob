import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class308 {

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4877 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "[I")
    public static int[] field4878 = new int[50];

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "S")
    public static short field4881 = 1;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "[I")
    public static int[] field4880 = new int[14];

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "Ljava/lang/String;")
    public static String field4883 = "Loaded textures";

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "Z")
    public static boolean field4882;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V", line = 13)
    public static void method2178(int arg0) {
        field4877 = null;
        field4878 = null;
        field4883 = null;
        field4880 = null;
        if (arg0 != 50) {
            method2180((byte) -50);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V", line = 30)
    public static final void method2179(byte arg0) {
        field4874++;
        class274.field4284.method2282((byte) -121);
        if (arg0 != 60) {
            method2181(false);
        }
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(B)V", line = 57)
    public static final void method2180(byte arg0) {
        class30.field471.method2282((byte) -124);
        field4879++;
        class31.field487.method2282((byte) -123);
        int var1 = -93 % ((28 - arg0) / 36);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)V", line = 81)
    public static final void method2181(boolean arg0) {
        if (arg0) {
            method2180((byte) 14);
        }
        field4875++;
        if (class168.field2707 != -1) {
            class47.method403(class168.field2707, (byte) 61);
        }
        for (int var1 = 0; var1 < class288.field4545; var1++) {
            if (class280.field4378[var1]) {
                class282.field4415[var1] = true;
            }
            class285.field4455[var1] = class280.field4378[var1];
            class280.field4378[var1] = false;
        }
        class64.field946 = -1;
        if (class162.field2623) {
            class26.field436 = true;
        }
        class75.field1156 = class307.field4869;
        class78.field1223 = -1;
        class14.field305 = null;
        if (class168.field2707 != -1) {
            class288.field4545 = 0;
            class53.method449(-114);
        }
        if (class162.field2623) {
            class114.method892();
        } else {
            class33.method308();
        }
        class137.field2241 = 0;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIII)V", line = 131)
    public static final void method2182(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4876++;
        class170 var5 = class221.method1613(arg1, arg4, arg1 - 8414);
        var5.method1269(false);
        var5.field2730 = arg3;
        var5.field2734 = arg2;
        var5.field2737 = arg0;
    }
}
