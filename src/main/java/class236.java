import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class236 extends class200 {

    @OriginalMember(owner = "client!jp", name = "y", descriptor = "Lgo;")
    public class441 field3424;

    @OriginalMember(owner = "client!jp", name = "v", descriptor = "Liv;")
    public static class64 field3421 = new class64(73, 12);

    @OriginalMember(owner = "client!jp", name = "z", descriptor = "Lmr;")
    public static class95 field3425 = new class95();

    @OriginalMember(owner = "client!jp", name = "u", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!jp", name = "w", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!jp", name = "x", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "(I)V", line = 4)
    public static void method1553(int arg0) {
        field3425 = null;
        field3421 = null;
        if (arg0 != 78643200) {
            field3423 = -99;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ZII)V", line = 17)
    public static final void method1554(boolean arg0, int arg1, int arg2) {
        field3420++;
        if (arg1 == 0) {
            class4.field109 = class162.method1199(class443.field6623.field610 * 2, arg1, 1, class455.field6791, class368.field5553, class370.field5611);
        } else {
            if (arg0) {
                class4.field109 = class162.method1199(0, 0, 1, class455.field6791, class368.field5553, class370.field5611);
                class4.field109.method241(0);
                class332 var3 = class436.method2598((byte) 124, class76.field1270, 0, class228.field3246);
                class489 var4 = class4.field109.method260(var3, class279.method1779(class151.field2407, class228.field3246, 0), true);
                client.method1351((byte) 123, true, class516.field7590.method2180(client.field2870, 29491), var4);
                class4.field109.method203();
                class79.method633((byte) -110);
                class4.field109.method1203(arg2 + 84);
            }
            try {
                class4.field109 = class162.method1199(class443.field6623.field610 * 2, arg1, 1, class455.field6791, class368.field5553, class370.field5611);
                if (class4.field109.method208()) {
                    class16 var5 = class4.field109.method238(78643200);
                    class4.field109.method301(var5);
                }
            } catch (Throwable var6) {
                arg1 = 0;
                class4.field109 = class162.method1199(0, 0, 1, class455.field6791, class368.field5553, class370.field5611);
            }
        }
        class169.field2624 = arg1;
        class130.method974(64);
        if (!class4.field109.method299()) {
            class406.field6097 = 1;
        }
        class4.field109.method256(class406.field6097);
        class4.field109.method277(0);
        class4.field109.method307(8);
        class513.field7546 = class4.field109.method231();
        class170.field2632 = class4.field109.method231();
        class87.method686(true);
        class4.field109.method210(!class443.field6623.field618);
        if (class4.field109.method219()) {
            class298.method1887((byte) 127, class443.field6623.field623);
        }
        class520.method3106(class4.field109, class121.field1966 >> 3, 0, class33.field662 >> 3);
        if (arg2 != 2) {
            method1553(83);
        }
        class418.method2527((byte) -96);
        class72.field1247 = false;
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lgo;)V", line = 89)
    public class236(class441 arg0) {
        this.field3424 = arg0;
    }
}
