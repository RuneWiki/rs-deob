import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class239 extends class374 {

    @OriginalMember(owner = "client!pa", name = "A", descriptor = "B")
    public byte field3605 = 5;

    @OriginalMember(owner = "client!pa", name = "D", descriptor = "Lbg;")
    public static class310 field3608 = new class310(12, 8);

    @OriginalMember(owner = "client!pa", name = "G", descriptor = "Z")
    public static boolean field3611 = false;

    @OriginalMember(owner = "client!pa", name = "F", descriptor = "Lsk;")
    public static class423 field3610 = new class423("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "I")
    public int field3596;

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "I")
    public int field3598;

    @OriginalMember(owner = "client!pa", name = "u", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!pa", name = "w", descriptor = "I")
    public int field3601;

    @OriginalMember(owner = "client!pa", name = "x", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!pa", name = "y", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!pa", name = "z", descriptor = "I")
    public int field3604;

    @OriginalMember(owner = "client!pa", name = "B", descriptor = "I")
    public int field3606;

    @OriginalMember(owner = "client!pa", name = "C", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!pa", name = "E", descriptor = "I")
    public int field3609;

    @OriginalMember(owner = "client!pa", name = "v", descriptor = "Z")
    public boolean field3600;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)V", line = 4)
    public static final void method1430(int arg0) {
        field3603++;
        if (arg0 <= -97) {
            class206.field3237.method2412(110);
        }
    }

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "(I)V", line = 18)
    public static void method1431(int arg0) {
        field3608 = null;
        int var1 = -84 / ((-arg0 - 53) / 54);
        field3610 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILlt;Lls;Llt;Llt;)Z", line = 32)
    public static final boolean method1432(int arg0, class458 arg1, class88 arg2, class458 arg3, class458 arg4) {
        class254.field3878 = arg1;
        class348.field5137 = arg4;
        if (arg0 >= -70) {
            return false;
        } else {
            class194.field3056 = arg2;
            class324.field4868 = arg3;
            field3597++;
            return true;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZZ)V", line = 51)
    public static final void method1433(int arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            class395.field5762++;
            class39.method219(65536);
        }
        int var3 = -21 / ((arg0 + 28) / 38);
        field3607++;
        if (arg1) {
            class360.field5330++;
            class200.method1242(127);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZI)V", line = 73)
    public static final void method1434(int arg0, boolean arg1, int arg2) {
        if (arg2 == 0) {
            class345.field5116 = class318.method1989(1, class463.field7116.field2970 * 2, arg2, class218.field3349, class7.field86, class257.field3919);
        } else {
            if (arg1) {
                class345.field5116 = class318.method1989(1, 0, 0, class218.field3349, class7.field86, class257.field3919);
                class345.field5116.method1965(0);
                class396 var3 = class206.method1265(class123.field2027, class85.field1432, 0, 112);
                class488 var4 = class345.field5116.method1888(var3, class351.method2137(class472.field7225, class85.field1432, 0), true);
                class277.method1681(true, var4, class494.field7520.method2473(class406.field5898, -100), (byte) 113);
                class345.field5116.method1915();
                class365.method2208((byte) -64);
                class345.field5116.method1974(-25261);
            }
            try {
                class345.field5116 = class318.method1989(1, class463.field7116.field2970 * 2, arg2, class218.field3349, class7.field86, class257.field3919);
                if (class345.field5116.method1953()) {
                    class353 var5 = class345.field5116.method1928(78643200);
                    class345.field5116.method1961(var5);
                }
            } catch (Throwable var6) {
                class345.field5116 = class318.method1989(1, 0, 0, class218.field3349, class7.field86, class257.field3919);
                arg2 = 0;
            }
        }
        field3599++;
        class30.field395 = arg2;
        class22.method113(false);
        if (!class345.field5116.method1905()) {
            class314.field4743 = 1;
        }
        class345.field5116.method1979(class314.field4743);
        class345.field5116.method1902(0);
        class345.field5116.method1907(8);
        class378.field5533 = class345.field5116.method1925();
        class51.field775 = class345.field5116.method1925();
        class483.method2915(128);
        class345.field5116.method1892(!class463.field7116.field2962);
        if (arg0 < 21) {
            method1432(36, null, null, null, null);
        }
        if (class345.field5116.method1949()) {
            class328.method2040(class463.field7116.field2955, -1);
        }
        class382.method2292(true, class150.field2422 >> 3, class21.field272 >> 3, class345.field5116);
        class216.method1330(true);
        class388.field5623 = false;
    }
}
