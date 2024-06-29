import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class104 {

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "Lad;")
    public static class5 field2521 = class88.method674("Ihr Spielkonto wurde deaktiviert)3", -107);

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field2527 = -1;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "Lad;")
    public static class5 field2525 = class88.method674("", -79);

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field2524 = 0;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field2528 = 0;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "Lad;")
    public static class5 field2530 = class88.method674("", 67);

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "Lad;")
    public static class5 field2532 = class88.method674("(U1", 50);

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "Lrd;")
    public static class106 field2529;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "[I")
    public static int[] field2523;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "[I")
    public static int[] field2531;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)I", line = 3)
    public static int method832(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V", line = 16)
    public static final void method833(boolean arg0) {
        if (class120.field2979) {
            class120.field2979 = false;
            class22.method172((byte) 89);
            class102.field2497 = true;
            class43.field1086 = true;
            class99.field2384 = true;
            class50.field1280 = true;
        }
        class110.method893((byte) 122);
        if (class128.field3069 && class89.field2103 == 1) {
            class43.field1086 = true;
        }
        field2526++;
        if (class10.field333 != -1) {
            boolean var1 = class17.method132(-90, class10.field333);
            if (var1) {
                class43.field1086 = true;
            }
        }
        if (class22.field570 == 2) {
            class43.field1086 = true;
        }
        if (class13.field383 == 2) {
            class43.field1086 = true;
        }
        if (class43.field1086) {
            class43.field1086 = false;
            class60.method489(false);
        }
        if (class6.field225 == -1) {
            class102.field2479.field2547 = class106.field2683 - class25.field622 - 77;
            if (class22.field564 > 448 && class22.field564 < 560 && class91.field2131 > 332) {
                class22.method174(-1, 77, 463, class91.field2131 - 357, 0, class102.field2479, class22.field564 - 17, class106.field2683, (byte) 122);
            }
            int var2 = class106.field2683 - class102.field2479.field2547 - 77;
            if (var2 < 0) {
                var2 = 0;
            }
            if (class106.field2683 - 77 < var2) {
                var2 = class106.field2683 - 77;
            }
            if (class25.field622 != var2) {
                class99.field2384 = true;
                class25.field622 = var2;
            }
        }
        if (class6.field225 == -1 && class98.field2374 == 3) {
            class102.field2479.field2547 = class69.field1610;
            int var3 = class52.field1295 * 14 + 7;
            if (class22.field564 > 448 && class22.field564 < 560 && class91.field2131 > 332) {
                class22.method174(-1, 77, 463, class91.field2131 - 357, 0, class102.field2479, class22.field564 - 17, var3, (byte) -125);
            }
            int var4 = class102.field2479.field2547;
            if (var4 < 0) {
                var4 = 0;
            }
            if (var4 > var3 - 77) {
                var4 = var3 - 77;
            }
            if (class69.field1610 != var4) {
                class69.field1610 = var4;
                class99.field2384 = true;
            }
        }
        if (class6.field225 != -1) {
            boolean var5 = class17.method132(-80, class6.field225);
            if (var5) {
                class99.field2384 = true;
            }
        }
        if (class22.field570 == 3) {
            class99.field2384 = true;
        }
        if (class13.field383 == 3) {
            class99.field2384 = true;
        }
        if (class33.field817 != null) {
            class99.field2384 = true;
        }
        if (class128.field3069 && class89.field2103 == 2) {
            class99.field2384 = true;
        }
        if (class99.field2384) {
            class99.field2384 = false;
            class110.method892(19500);
        }
        class92.method705(146);
        if (class60.field1489 != -1) {
            class102.field2497 = true;
        }
        if (class102.field2497) {
            if (class60.field1489 != -1 && class81.field1913 == class60.field1489) {
                class34.field831++;
                class60.field1489 = -1;
                class5.field163.method209(182, 10);
                class5.field163.method307(-388270616, class81.field1913);
            }
            class102.field2497 = false;
            class83.field1953 = true;
            class75.method595(class10.field333 == -1, class81.field1913, class69.field1636 % 20 >= 10 ? class60.field1489 : -1, -102, class14.field408);
        }
        if (class50.field1280) {
            class83.field1953 = true;
            class50.field1280 = false;
            class79.method613(class61.field1509, -10205, class65.field1567, class48.field1238, class82.field1924);
        }
        if (!arg0) {
            method833(false);
        }
        class46.method407(class98.field2382, class82.field1932.field112, class54.field1344, -17572, class82.field1932.field120);
        class98.field2382 = 0;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V", line = 185)
    public static void method834(byte arg0) {
        field2530 = null;
        if (arg0 > -116) {
            method835(-56, -38, true, 92);
        }
        field2523 = null;
        field2529 = null;
        field2532 = null;
        field2525 = null;
        field2531 = null;
        field2521 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIZI)I", line = 232)
    public static final int method835(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg3 > 179) {
            arg0 /= 2;
        }
        if (arg2) {
            field2523 = null;
        }
        if (arg3 > 192) {
            arg0 /= 2;
        }
        field2522++;
        if (arg3 > 217) {
            arg0 /= 2;
        }
        if (arg3 > 243) {
            arg0 /= 2;
        }
        return (arg0 / 32 << 7) + (arg1 / 4 << 10) + arg3 / 2;
    }
}
