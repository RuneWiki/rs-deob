import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class483 {

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "Lfaa;")
    public static class139 field6636 = new class139(16);

    @OriginalMember(owner = "client!baa", name = "e", descriptor = "Lem;")
    public static class206 field6638 = new class206(0, -2);

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "I")
    public int field6634;

    @OriginalMember(owner = "client!baa", name = "d", descriptor = "I")
    public static int field6637;

    @OriginalMember(owner = "client!baa", name = "f", descriptor = "I")
    public int field6639;

    @OriginalMember(owner = "client!baa", name = "g", descriptor = "I")
    public int field6640;

    @OriginalMember(owner = "client!baa", name = "h", descriptor = "I")
    public static int field6641;

    @OriginalMember(owner = "client!baa", name = "i", descriptor = "I")
    public int field6642;

    @OriginalMember(owner = "client!baa", name = "j", descriptor = "I")
    public static int field6643;

    @OriginalMember(owner = "client!baa", name = "k", descriptor = "I")
    public static int field6644;

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "[I")
    public static int[] field6635;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(Lvv;Z)V", line = 4)
    public static final void method2710(class295 arg0, boolean arg1) {
        if (!class17.field174) {
            class527.method3002(arg0, class630.field8746);
        } else if (arg1) {
            class672.field9424[class672.field9424.length - 1].method1392(arg0, -2);
        } else {
            int var2 = class409.method2385(arg0.field4039);
            int var3 = class43.field510[2] * arg0.method226(6329) / arg0.field4038;
            int var4 = class409.method2385(arg0.field4039 - var3);
            int var5 = class409.method2385(arg0.field4039 + var3);
            if (var4 == var5) {
                class672.field9424[var2].method1392(arg0, -2);
            } else if (var5 - var4 == 1) {
                class672.field9424[class259.field3519 + var4].method1392(arg0, -2);
            } else {
                class672.field9424[class672.field9424.length - 1].method1392(arg0, -2);
            }
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(III)I", line = 37)
    public static final int method2711(int arg0, int arg1, int arg2) {
        field6637++;
        if (arg2 < 5) {
            field6636 = null;
        }
        int var3 = 0;
        while (arg1 > 0) {
            var3 = var3 << 1 | arg0 & 0x1;
            arg0 >>>= 0x1;
            arg1--;
        }
        return var3;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(IIII)I", line = 58)
    public static final int method2712(int arg0, int arg1, int arg2, int arg3) {
        field6643++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 4095 - arg0;
        } else {
            if (arg2 != 0) {
                method2711(7, 34, -71);
            }
            return var4 == 2 ? 4095 - arg3 : arg0;
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(II)Z", line = 82)
    public static final boolean method2713(int arg0, int arg1) {
        field6644++;
        if (arg0 == 28934) {
            return arg1 == 5 || arg1 == 45 || arg1 == 1011 || arg1 == 2 || arg1 == 20;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "(III)Z", line = 97)
    public static final boolean method2714(int arg0, int arg1, int arg2) {
        field6641++;
        if (arg2 != 32768) {
            field6638 = null;
        }
        return (arg0 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(B)V", line = 114)
    public static void method2715(byte arg0) {
        field6635 = null;
        field6636 = null;
        field6638 = null;
        if (arg0 > -21) {
            field6635 = null;
        }
    }
}
