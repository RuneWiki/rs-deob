import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class231 {

    @OriginalMember(owner = "client!df", name = "a", descriptor = "Lwf;")
    public static class16 field4012 = new class16(64);

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public static void method1566(int arg0) {
        if (arg0 >= -9) {
            field4015 = -85;
        }
        field4012 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILvd;)V")
    public static final void method1567(int arg0, class141 arg1) {
        field4013++;
        arg1.field2520 = false;
        if (arg1.field2537 != -1) {
            class170 var2 = class119.method951(0, arg1.field2537);
            if (var2 == null || var2.field3020 == null) {
                arg1.field2537 = -1;
            } else {
                arg1.field2539++;
                if (var2.field3020.length > arg1.field2584 && arg1.field2539 > var2.field3040[arg1.field2584]) {
                    arg1.field2539 = 1;
                    arg1.field2584++;
                    class146.method1084(arg1.field2546, var2, 117, arg1.field2585, class277.field4824 == arg1, arg1.field2584);
                }
                if (var2.field3020.length <= arg1.field2584) {
                    arg1.field2539 = 0;
                    arg1.field2584 = 0;
                    class146.method1084(arg1.field2546, var2, 85, arg1.field2585, class277.field4824 == arg1, arg1.field2584);
                }
            }
        }
        if (arg0 > -16) {
            field4012 = null;
        }
        if (arg1.field2543 != -1 && class157.field2803 >= arg1.field2532) {
            int var3 = class138.method1054(-22225, arg1.field2543).field4745;
            if (var3 == -1) {
                arg1.field2543 = -1;
            } else {
                class170 var4 = class119.method951(0, var3);
                if (var4 == null || var4.field3020 == null) {
                    arg1.field2543 = -1;
                } else {
                    if (arg1.field2544 < 0) {
                        arg1.field2544 = 0;
                        class146.method1084(arg1.field2546, var4, 107, arg1.field2585, class277.field4824 == arg1, 0);
                    }
                    arg1.field2551++;
                    if (var4.field3020.length > arg1.field2544 && arg1.field2551 > var4.field3040[arg1.field2544]) {
                        arg1.field2544++;
                        arg1.field2551 = 1;
                        class146.method1084(arg1.field2546, var4, 91, arg1.field2585, class277.field4824 == arg1, arg1.field2544);
                    }
                    if (arg1.field2544 >= var4.field3020.length) {
                        arg1.field2543 = -1;
                    }
                }
            }
        }
        if (arg1.field2575 != -1 && arg1.field2533 <= 1) {
            class170 var5 = class119.method951(0, arg1.field2575);
            if (var5.field3025 == 1 && arg1.field2549 > 0 && class157.field2803 >= arg1.field2576 && arg1.field2587 < class157.field2803) {
                arg1.field2533 = 1;
                return;
            }
        }
        if (arg1.field2575 != -1 && arg1.field2533 == 0) {
            class170 var6 = class119.method951(0, arg1.field2575);
            if (var6 == null || var6.field3020 == null) {
                arg1.field2575 = -1;
            } else {
                arg1.field2570++;
                if (var6.field3020.length > arg1.field2579 && var6.field3040[arg1.field2579] < arg1.field2570) {
                    arg1.field2570 = 1;
                    arg1.field2579++;
                    class146.method1084(arg1.field2546, var6, 93, arg1.field2585, class277.field4824 == arg1, arg1.field2579);
                }
                if (var6.field3020.length <= arg1.field2579) {
                    arg1.field2579 -= var6.field3047;
                    arg1.field2528++;
                    if (arg1.field2528 >= var6.field3019) {
                        arg1.field2575 = -1;
                    } else if (arg1.field2579 >= 0 && var6.field3020.length > arg1.field2579) {
                        class146.method1084(arg1.field2546, var6, 72, arg1.field2585, class277.field4824 == arg1, arg1.field2579);
                    } else {
                        arg1.field2575 = -1;
                    }
                }
                arg1.field2520 = var6.field3036;
            }
        }
        if (arg1.field2533 > 0) {
            arg1.field2533--;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lhi;B)V")
    public static final void method1568(class24 arg0, byte arg1) {
        if (arg1 != -17) {
            field4015 = -108;
        }
        class24 var2 = class100.method766(-98, arg0);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class50.field876;
            var4 = class163.field2895;
        } else {
            var4 = var2.field341;
            var3 = var2.field468;
        }
        class160.method1170((byte) 101, var4, false, var3, arg0);
        class268.method1794(arg0, var4, (byte) 25, var3);
        field4014++;
    }
}
