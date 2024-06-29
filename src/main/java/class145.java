import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class145 extends class69 {

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "Lha;")
    public class46 field2624;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    public static int field2627 = -1;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
    public static final void method1079(int arg0) {
        field2625++;
        class215.field3809 = new class24[class168.field2972.method1301(true)][];
        class139.field2492 = new boolean[class168.field2972.method1301(true)];
        if (arg0 < 35) {
            field2627 = -110;
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
    public class145() {
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLvd;)V")
    public static final void method1080(byte arg0, class141 arg1) {
        field2626++;
        if (arg1.field2568 == 0) {
            return;
        }
        if (arg1.field2555 != -1 && arg1.field2555 < 32768) {
            class26 var2 = class2.field29[arg1.field2555];
            if (var2 != null) {
                int var3 = arg1.field2585 - var2.field2585;
                int var4 = arg1.field2546 - var2.field2546;
                if (var3 != 0 || var4 != 0) {
                    arg1.field2526 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field2555 >= 32768) {
            int var5 = arg1.field2555 - 32768;
            if (class114.field2158 == var5) {
                var5 = 2047;
            }
            class81 var6 = class1.field6[var5];
            if (var6 != null) {
                int var7 = arg1.field2546 - var6.field2546;
                int var8 = arg1.field2585 - var6.field2585;
                if (var8 != 0 || var7 != 0) {
                    arg1.field2526 = (int) (Math.atan2((double) var8, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field2565 != 0 || arg1.field2560 != 0) && (arg1.field2547 == 0 || arg1.field2552 > 0)) {
            int var9 = arg1.field2585 + ((arg1.method642(49) - 1) * 64) - ((-class29.field567 + arg1.field2565 + -class29.field567) * 64);
            int var10 = arg1.field2546 - ((-class77.field1432 + -class77.field1432 + arg1.field2560) * 64 + 64 - (arg1.method642(37) * 64));
            if (var9 != 0 || var10 != 0) {
                arg1.field2526 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field2560 = 0;
            arg1.field2565 = 0;
        }
        if (arg0 <= 116) {
            method1079(111);
        }
        int var11 = arg1.field2526 - arg1.field2535 & 0x7FF;
        if (var11 == 0) {
            arg1.field2571 = 0;
            return;
        }
        arg1.field2571++;
        if (var11 > 1024) {
            arg1.field2535 -= arg1.field2568;
            boolean var12 = true;
            if (arg1.field2568 > var11 || (2048 - arg1.field2568) < var11) {
                var12 = false;
                arg1.field2535 = arg1.field2526;
            }
            if (arg1.field2553 == arg1.field2537 && (arg1.field2571 > 25 || var12)) {
                if (arg1.field2531 == -1) {
                    arg1.field2537 = arg1.field2561;
                } else {
                    arg1.field2537 = arg1.field2531;
                }
            }
        } else {
            arg1.field2535 += arg1.field2568;
            boolean var13 = true;
            if (var11 < arg1.field2568 || 2048 - arg1.field2568 < var11) {
                var13 = false;
                arg1.field2535 = arg1.field2526;
            }
            if (arg1.field2553 == arg1.field2537 && (arg1.field2571 > 25 || var13)) {
                if (arg1.field2559 == -1) {
                    arg1.field2537 = arg1.field2561;
                } else {
                    arg1.field2537 = arg1.field2559;
                }
            }
        }
        arg1.field2535 &= 0x7FF;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lha;I)V")
    public class145(class46 arg0, int arg1) {
        this.field2624 = arg0;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)Lu;")
    public static final class182 method1081(int arg0, int arg1, int arg2) {
        class201 var3 = class111.field2080[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class182 var4 = var3.field3607;
            var3.field3607 = null;
            return var4;
        }
    }
}
