import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class150 extends class287 {

    @OriginalMember(owner = "client!e", name = "u", descriptor = "[I")
    public int[] field2566 = new int[5];

    @OriginalMember(owner = "client!e", name = "I", descriptor = "I")
    public int field2580 = 0;

    @OriginalMember(owner = "client!e", name = "D", descriptor = "[Lvi;")
    public class5[] field2575 = new class5[5];

    @OriginalMember(owner = "client!e", name = "K", descriptor = "I")
    public int field2582;

    @OriginalMember(owner = "client!e", name = "w", descriptor = "I")
    public int field2568;

    @OriginalMember(owner = "client!e", name = "S", descriptor = "I")
    public int field2590;

    @OriginalMember(owner = "client!e", name = "N", descriptor = "I")
    public int field2585;

    @OriginalMember(owner = "client!e", name = "y", descriptor = "Lmh;")
    private static class128 field2570 = class22.method156(124, "skill: ");

    @OriginalMember(owner = "client!e", name = "s", descriptor = "Lmh;")
    public static class128 field2564 = field2570;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "I")
    public int field2567;

    @OriginalMember(owner = "client!e", name = "A", descriptor = "I")
    public int field2572;

    @OriginalMember(owner = "client!e", name = "E", descriptor = "I")
    public int field2576;

    @OriginalMember(owner = "client!e", name = "F", descriptor = "I")
    public int field2577;

    @OriginalMember(owner = "client!e", name = "H", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!e", name = "M", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!e", name = "Q", descriptor = "I")
    public int field2588;

    @OriginalMember(owner = "client!e", name = "R", descriptor = "Le;")
    public class150 field2589;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "Lvk;")
    public class161 field2565;

    @OriginalMember(owner = "client!e", name = "x", descriptor = "Leg;")
    public class289 field2569;

    @OriginalMember(owner = "client!e", name = "P", descriptor = "Lff;")
    public class48 field2587;

    @OriginalMember(owner = "client!e", name = "J", descriptor = "Lb;")
    public class56 field2581;

    @OriginalMember(owner = "client!e", name = "z", descriptor = "Lom;")
    public class65 field2571;

    @OriginalMember(owner = "client!e", name = "O", descriptor = "Lsl;")
    public class92 field2586;

    @OriginalMember(owner = "client!e", name = "G", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field2578;

    @OriginalMember(owner = "client!e", name = "B", descriptor = "Z")
    public boolean field2573;

    @OriginalMember(owner = "client!e", name = "C", descriptor = "Z")
    public boolean field2574;

    @OriginalMember(owner = "client!e", name = "L", descriptor = "Z")
    public boolean field2583;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)V", line = 16)
    public static final void method1002(int arg0, int arg1) {
        class47.field937.method1833(arg1, (byte) 61);
        if (arg0 != 0) {
            method1003((byte) -36);
        }
        field2584++;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(B)V", line = 34)
    public static void method1003(byte arg0) {
        if (arg0 >= 108) {
            field2564 = null;
            field2578 = null;
            field2570 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(III)V", line = 49)
    public class150(int arg0, int arg1, int arg2) {
        this.field2582 = arg2;
        this.field2568 = arg1;
        this.field2585 = this.field2590 = arg0;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BIIZ)I", line = 67)
    public static final int method1004(byte arg0, int arg1, int arg2, boolean arg3) {
        field2563++;
        if (arg0 < 112) {
            method1004((byte) -45, 1, -118, true);
        }
        class245 var4 = (class245) class151.field2591.method728(false, (long) arg2);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < var4.field4185.length; var6++) {
            if (var4.field4185[var6] >= 0 && var4.field4185[var6] < class212.field3752) {
                class200 var7 = class180.method1226(false, var4.field4185[var6]);
                if (var7.field3516 != null) {
                    class155 var8 = (class155) var7.field3516.method728(false, (long) arg1);
                    if (var8 != null) {
                        if (arg3) {
                            var5 += var4.field4184[var6] * var8.field2672;
                        } else {
                            var5 += var8.field2672;
                        }
                    }
                }
            }
        }
        return var5;
    }
}
