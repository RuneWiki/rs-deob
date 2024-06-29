import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class3 {

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "Lbd;")
    public static class162 field22 = class17.method142(0, "::tele ");

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "[Lnk;")
    public static class22[] field23;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIZ)V", line = 3)
    public static final void method13(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class32.field524 = arg1;
        class158.field2787 = arg2;
        class138.field2456 = arg3;
        class57.field896 = new class225[arg0][class32.field524][class158.field2787];
        class73.field1166 = new int[arg0][class32.field524 + 1][class158.field2787 + 1];
        if (class117.field2159) {
            class274.field4545 = new class26[4][];
        }
        if (arg4) {
            class86.field1528 = new class225[1][class32.field524][class158.field2787];
            class17.field285 = new int[class32.field524][class158.field2787];
            class31.field517 = new int[1][class32.field524 + 1][class158.field2787 + 1];
            if (class117.field2159) {
                class315.field5316 = new class26[1][];
            }
        } else {
            class86.field1528 = (class225[][][]) null;
            class17.field285 = (int[][]) null;
            class31.field517 = (int[][][]) null;
            class315.field5316 = (class26[][]) null;
        }
        class139.method1087(false);
        class129.field2335 = new class22[500];
        class127.field2314 = 0;
        field23 = new class22[500];
        class204.field3457 = 0;
        class248.field4104 = new int[arg0][class32.field524 + 1][class158.field2787 + 1];
        class98.field1785 = new class43[5000];
        class72.field1145 = 0;
        class23.field398 = new class43[100];
        class89.field1582 = new boolean[class138.field2456 + class138.field2456 + 1][class138.field2456 + class138.field2456 + 1];
        class251.field4196 = new boolean[class138.field2456 + class138.field2456 + 2][class138.field2456 + class138.field2456 + 2];
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(III[II)V", line = 51)
    public static final void method14(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        if (arg4 >= -98) {
            return;
        }
        arg1--;
        int var8 = arg2 - 1;
        int var5 = var8 - 7;
        while (var5 > arg1) {
            int var6 = arg1 + 1;
            arg3[var6] = arg0;
            int var7 = var6 + 1;
            arg3[var7] = arg0;
            int var9 = var7 + 1;
            arg3[var9] = arg0;
            int var10 = var9 + 1;
            arg3[var10] = arg0;
            int var11 = var10 + 1;
            arg3[var11] = arg0;
            int var12 = var11 + 1;
            arg3[var12] = arg0;
            int var13 = var12 + 1;
            arg3[var13] = arg0;
            arg1 = var13 + 1;
            arg3[arg1] = arg0;
        }
        while (var8 > arg1) {
            arg1++;
            arg3[arg1] = arg0;
        }
        field21++;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIZ)I", line = 95)
    public static final int method15(int arg0, int arg1, int arg2, boolean arg3) {
        field24++;
        if (class206.field3473 == null) {
            return 0;
        }
        int var4 = arg0 >> 7;
        int var5 = arg2 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg1;
        int var7 = arg2 & 0x7F;
        int var8 = arg0 & 0x7F;
        if (arg1 < 3 && (class213.field3580[1][var4][var5] & 0x2) == 2) {
            var6 = arg1 + 1;
        }
        if (arg3) {
            method15(12, 7, 108, true);
        }
        int var9 = (128 - var8) * class206.field3473[var6][var4][var5 + 1] + class206.field3473[var6][var4 + 1][var5 + 1] * var8 >> 7;
        int var10 = (128 - var8) * class206.field3473[var6][var4][var5] + (class206.field3473[var6][var4 + 1][var5] * var8) >> 7;
        return (128 - var7) * var10 + var7 * var9 >> 7;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V", line = 131)
    public static void method16(byte arg0) {
        if (arg0 >= -98) {
            method14(-113, 48, -93, (int[]) null, -48);
        }
        field22 = null;
        field23 = null;
    }
}
