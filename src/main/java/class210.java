import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class210 extends class237 {

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "[I")
    public static int[] field3280 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "Z")
    public static boolean field3279 = true;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "I")
    public static int field3275 = 0;

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "I")
    public int field3273;

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "Ljava/lang/String;")
    public String field3272;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "Ljava/lang/String;")
    public String field3274;

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "[I")
    public static int[] field3281;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)Ldm;")
    public final class271 method1456(boolean arg0) {
        if (arg0) {
            method1457((byte) -2, true);
        }
        ++field3277;
        return class238.field3822[super.field3809];
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(BZ)V")
    public static final void method1457(byte arg0, boolean arg1) {
        if (arg0 != 98) {
            field3282 = 75;
        }
        if (arg1) {
            if (class238.field3824 != -1) {
                class4.method25(class238.field3824, (byte) -99);
            }
            for (class104 var2 = (class104) class115.field1674.method1065((byte) -59); var2 != null; var2 = (class104) class115.field1674.method1066(-125)) {
                class74.method514(true, (byte) 105, var2);
            }
            class238.field3824 = -1;
            class115.field1674 = new class153(8);
            class188.method1319((byte) -30);
            class238.field3824 = class49.field621;
            class287.method1960(false, (byte) 45);
            class92.method626((byte) -72);
            class303.method2033(arg0 + -101, class238.field3824);
        }
        ++field3276;
        class288.field4653 = -1;
        class32.method164(88, class119.field1713);
        class214.field3347 = new class1();
        class214.field3347.field3915 = 3000;
        class214.field3347.field3920 = 3000;
        if (~class257.field4188 == -1) {
            class114.method758(class295.field4726, true);
            class95.method651(10, (byte) 100);
        } else {
            if (~class158.field2370 != -3) {
                class186.method1313(arg0 + -97);
            } else {
                class99.field1474 = class13.field187 << 7;
                class255.field4159 = class248.field4033 << 7;
            }
            class122.method792(-73);
            class95.method651(28, (byte) 75);
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)V")
    public static void method1458(byte arg0) {
        field3280 = null;
        field3281 = null;
        int var1 = -60 / ((21 - arg0) / 54);
    }
}
