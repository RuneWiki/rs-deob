import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class111 extends class217 {

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
    public static int field1754 = 0;

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "I")
    public static int field1758 = 0;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
    public static volatile int field1752 = 0;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "I")
    public int field1750;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "I")
    public int field1751;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "[I")
    public static int[] field1756;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(B)V", line = 11)
    public static final void method879(byte arg0) {
        field1755++;
        while (class88.field1293.method65(class79.field1112, true) >= 27) {
            int var1 = class88.field1293.method63(arg0 + 101, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class161.field2394[var1] == null) {
                var2 = true;
                class161.field2394[var1] = new class45();
            }
            class45 var3 = class161.field2394[var1];
            class126.field1995[class122.field1923++] = var1;
            var3.field4481 = class312.field4852;
            if (var3.field698 != null && var3.field698.method1331(true)) {
                class246.method1701(var3, -18005);
            }
            int var4 = class88.field1293.method63(arg0 ^ 0x61, 1);
            int var5 = class88.field1293.method63(arg0 ^ 0x6C, 5);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var6 = class88.field1293.method63(120, 1);
            if (var6 == 1) {
                class227.field3515[class122.field1922++] = var1;
            }
            int var7 = class88.field1293.method63(123, 5);
            var3.method412(class10.method78(class88.field1293.method63(113, 14), 2), true);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = class160.field2387[class88.field1293.method63(arg0 ^ 0x6A, 3)];
            if (var2) {
                var3.field4497 = var3.field4438 = var8;
            }
            var3.method2031(false, var3.field698.field2750);
            var3.field4478 = var3.field698.field2794;
            var3.field4443 = var3.field698.field2743;
            if (var3.field4443 == 0) {
                var3.field4438 = 0;
            }
            var3.method2028(127, var4 == 1, class235.field3602.field4470[0] + var7, var3.method929(12), class235.field3602.field4477[0] + var5);
            if (var3.field698.method1331(true)) {
                class51.method468(0, (class121) null, class50.field775, (class101) null, var3.field4470[0], 128, var3.field4477[0], var3);
            }
        }
        class88.field1293.method64(-127);
        if (arg0 != 22) {
            field1756 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)V", line = 92)
    public static final void method880(int arg0, int arg1) {
        field1757++;
        if (arg1 != -2) {
            method880(-89, -115);
        }
        if (arg0 >= 0 && arg0 < class322.field4997.length) {
            class322.field4997[arg0] = !class322.field4997[arg0];
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZIIIIII)I", line = 111)
    public static final int method881(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg4 & 0x1) == 1) {
            int var7 = arg3;
            arg3 = arg2;
            arg2 = var7;
        }
        int var8 = arg1 & 0x3;
        field1753++;
        if (var8 == 0) {
            return arg6;
        } else if (var8 == 1) {
            return 1 + 7 - arg5 - arg3;
        } else {
            if (arg0) {
                method879((byte) 89);
            }
            return var8 == 2 ? 7 + 1 - arg6 - arg2 : arg5;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V", line = 142)
    public static void method882(int arg0) {
        field1756 = null;
        if (arg0 <= 8) {
            field1758 = 102;
        }
    }
}
