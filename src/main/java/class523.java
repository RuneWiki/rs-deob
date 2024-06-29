import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class523 extends class234 {

    @OriginalMember(owner = "client!mt", name = "m", descriptor = "Ljp;")
    public static class55 field7675 = new class55(91, 12);

    @OriginalMember(owner = "client!mt", name = "p", descriptor = "Lpu;")
    public static class179 field7678 = new class179("shake:", "schütteln:", "tremblement:", "tremor:");

    @OriginalMember(owner = "client!mt", name = "n", descriptor = "I")
    public static int field7676;

    @OriginalMember(owner = "client!mt", name = "o", descriptor = "I")
    public static int field7677;

    @OriginalMember(owner = "client!mt", name = "q", descriptor = "I")
    public static int field7679;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIB)V", line = 7)
    public static final void method3117(int arg0, int arg1, byte arg2) {
        if (arg2 != -121) {
            method3119(-10);
        }
        field7677++;
        if ((class362.field5337 > class362.field5340)) {
            class362.field5340 = (float) ((double) class362.field5340 / 30.0D + (double) class362.field5340);
            if (class362.field5340 > class362.field5337) {
                class362.field5340 = class362.field5337;
            }
            class321.method2121(24659);
            class362.field5338 = (int) class362.field5340 >> 1;
            class362.field5342 = class525.method3123(11825, class362.field5338);
        } else if (class362.field5337 < class362.field5340) {
            class362.field5340 = (float) ((double) class362.field5340 - (double) class362.field5340 / 30.0D);
            if (class362.field5340 < class362.field5337) {
                class362.field5340 = class362.field5337;
            }
            class321.method2121(arg2 + 24780);
            class362.field5338 = (int) class362.field5340 >> 1;
            class362.field5342 = class525.method3123(11825, class362.field5338);
        }
        if (class357.field5290 != -1 && class240.field3593 != -1) {
            int var3 = class357.field5290 - class445.field6617;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class240.field3593 - class274.field4298;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class445.field6617 -= -var3;
            class274.field4298 += var4;
            if (var3 == 0 && var4 == 0) {
                class240.field3593 = -1;
                class357.field5290 = -1;
            }
            class321.method2121(24659);
        }
        if (class178.field2722 > 0) {
            class287.field4472--;
            if (class287.field4472 == 0) {
                class287.field4472 = 100;
                class178.field2722--;
            }
        } else {
            class237.field3569 = -1;
            class53.field810 = -1;
        }
        if (!class390.field5705 || class328.field4965 == null) {
            return;
        }
        for (class377 var5 = (class377) class328.field4965.method295((byte) 124); var5 != null; var5 = (class377) class328.field4965.method296(true)) {
            class30 var6 = class362.field5329.method2182(var5.field5558.field824, (byte) -42);
            if (var5.method2403(arg1, 16896, arg0)) {
                if (var6.field365 != null) {
                    if (var6.field365[4] != null) {
                        class423.method2637((long) var5.field5558.field824, -1, var6.field368, (byte) -113, true, 1002, var6.field365[4], -1, false, 0, var6.field341);
                    }
                    if (var6.field365[3] != null) {
                        class423.method2637((long) var5.field5558.field824, -1, var6.field368, (byte) -113, true, 1009, var6.field365[3], -1, false, 0, var6.field341);
                    }
                    if (var6.field365[2] != null) {
                        class423.method2637((long) var5.field5558.field824, -1, var6.field368, (byte) -113, true, 1001, var6.field365[2], -1, false, 0, var6.field341);
                    }
                    if (var6.field365[1] != null) {
                        class423.method2637((long) var5.field5558.field824, -1, var6.field368, (byte) -113, true, 1006, var6.field365[1], -1, false, 0, var6.field341);
                    }
                    if (var6.field365[0] != null) {
                        class423.method2637((long) var5.field5558.field824, -1, var6.field368, (byte) -113, true, 1010, var6.field365[0], -1, false, 0, var6.field341);
                    }
                }
                if (!var5.field5558.field815) {
                    var5.field5558.field815 = true;
                    class152.method1089(class159.field2414, var5.field5558.field824, var6.field368);
                }
                if (var5.field5558.field815) {
                    class152.method1089(class23.field268, var5.field5558.field824, var6.field368);
                }
            } else if (var5.field5558.field815) {
                var5.field5558.field815 = false;
                class152.method1089(class434.field6463, var5.field5558.field824, var6.field368);
            }
        }
    }

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "(B)V", line = 151)
    public static final void method3118(byte arg0) {
        if (class91.field1475 == 1 || class91.field1475 == 3 || class91.field1475 != class76.field1286 && (class91.field1475 == 0 || class76.field1286 == 0)) {
            class412.field6081 = 0;
            class231.field3482 = 0;
            class366.field5398.method360(-115);
        }
        field7676++;
        class76.field1286 = class91.field1475;
        if (arg0 != 54) {
            method3118((byte) -79);
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)V", line = 170)
    public static void method3119(int arg0) {
        field7678 = null;
        if (arg0 == 2702) {
            field7675 = null;
        }
    }
}
