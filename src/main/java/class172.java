import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public class class172 extends class673 implements Runnable {

    @OriginalMember(owner = "client!qga", name = "q", descriptor = "I")
    public int field2655 = -1;

    @OriginalMember(owner = "client!qga", name = "x", descriptor = "Z")
    private boolean field2662 = true;

    @OriginalMember(owner = "client!qga", name = "s", descriptor = "Ldt;")
    private class224 field2657;

    @OriginalMember(owner = "client!qga", name = "w", descriptor = "I")
    public static int field2661 = 0;

    @OriginalMember(owner = "client!qga", name = "r", descriptor = "F")
    public static float field2656;

    @OriginalMember(owner = "client!qga", name = "k", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!qga", name = "m", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!qga", name = "o", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!qga", name = "p", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!qga", name = "t", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!qga", name = "u", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!qga", name = "v", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!qga", name = "n", descriptor = "Lbi;")
    public static class449 field2652;

    @OriginalMember(owner = "client!qga", name = "l", descriptor = "Ljava/lang/Object;")
    public static Object field2650;

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(I)V", line = 4)
    public final void method1165(int arg0) {
        if (arg0 > -22) {
            field2658 = -32;
        }
        this.field2662 = false;
        field2649++;
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(BLjava/lang/String;ZLoa;Lta;Lkga;)V", line = 15)
    public static final void method1166(byte arg0, String arg1, boolean arg2, class651 arg3, class200 arg4, class511 arg5) {
        field2660++;
        if (arg0 > -2) {
            return;
        }
        if (class314.field4319 && class18.method186(-2)) {
            class511 var11 = class301.field4201;
            class200 var12 = arg3.method389(var11, class273.field3799, true);
            int var13 = var11.method2841(arg1, (byte) 105, null, 250);
            int var14 = var11.method2840(-124, var11.field6820, null, arg1, 250);
            int var15 = class642.field8625.field6698;
            int var16 = var15 + 4;
            int var17 = var16 * 2 + var14;
            int var18 = var16 * 2 + var13;
            if (var17 < class699.field9822) {
                var17 = class699.field9822;
            }
            if (class164.field2573 > var18) {
                var18 = class164.field2573;
            }
            int var19 = class32.field523.method1358(0, var18, class641.field8619) + class253.field3472;
            int var20 = class62.field960.method3790(var17, 103, class305.field4229) + class199.field2899;
            arg3.method440(class62.field929, false).method2643(class24.field418.field6698 + var19, class24.field418.field6700 + var20, var18 - class24.field418.field6698 * 2, -(class24.field418.field6700 * 2) + var17);
            arg3.method440(class24.field418, true).method2637(var19, var20);
            class24.field418.method2775();
            arg3.method440(class24.field418, true).method2637(var19 - (var15 - var18), var20);
            class24.field418.method2778();
            arg3.method440(class24.field418, true).method2637(var18 + var19 - var15, var17 + var20 - var15);
            class24.field418.method2775();
            arg3.method440(class24.field418, true).method2637(var19, var20 + var17 - var15);
            class24.field418.method2778();
            arg3.method440(class642.field8625, true).method2643(var19, class24.field418.field6700 + var20, var15, var17 - class24.field418.field6700 * 2);
            class642.field8625.method2774();
            arg3.method440(class642.field8625, true).method2643(var19 + class24.field418.field6698, var20, var18 - (class24.field418.field6698 * 2), var15);
            class642.field8625.method2774();
            arg3.method440(class642.field8625, true).method2643(var18 + var19 - var15, class24.field418.field6700 + var20, var15, var17 - (class24.field418.field6700 * 2));
            class642.field8625.method2774();
            arg3.method440(class642.field8625, true).method2643(var19 + class24.field418.field6698, var17 + var20 + -var15, var18 - (class24.field418.field6698 * 2), var15);
            class642.field8625.method2774();
            var12.method1301(-1, 1, var16 + var20, (byte) 127, var17 - (var16 * 2), 0, var16 + var19, arg1, 0, null, null, 0, var18 - var16 * 2, class232.field3255 | 0xFF000000, 1, null);
            class221.method1395(var19, var18, var17, var20, false);
        } else {
            int var6 = arg5.method2841(arg1, (byte) -66, null, 250);
            int var7 = arg5.method2843(117, arg1, 250, null) * 13;
            byte var8 = 4;
            int var9 = var8 + 6;
            int var10 = var8 + 6;
            arg3.method415(var9 - var8, -var8 + var10, var6 + var8 + var8, var7 + var8 + var8, -16777216, 0);
            arg3.method423(var9 - var8, -var8 + var10, var6 + var8 + var8, var7 + var8 + var8, -1, 0);
            arg4.method1301(-1, 1, var10, (byte) 127, var7, 0, var9, arg1, 0, null, null, 0, var6, -1, 1, null);
            class221.method1395(var9 - var8, var6 + var8 + var8, var7 + var8 + var8, var10 - var8, false);
        }
        if (arg2) {
            try {
                arg3.method97();
            } catch (class26 var21) {
            }
        }
    }

    @OriginalMember(owner = "client!qga", name = "run", descriptor = "()V", line = 97)
    public final void run() {
        field2651++;
        while (this.field2662) {
            this.field2657.method1399(5000, this);
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(Z)V", line = 113)
    public static void method1167(boolean arg0) {
        field2652 = null;
        field2650 = null;
        if (arg0) {
            field2661 = -67;
        }
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(B)V", line = 124)
    public final void method1168(byte arg0) {
        field2653++;
        if (arg0 > 84) {
            (new Thread(this, "a")).start();
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(Loa;I)V", line = 141)
    public static final void method1169(class651 arg0, int arg1) {
        field2654++;
        arg0.method421(0, 0, class627.field8461, 350);
        arg0.method415(0, 0, class627.field8461, 350, class147.field2352 << 24 | 0x332277, 1);
        if (arg1 <= 14) {
            method1167(true);
        }
        int var2 = 350 / class271.field3781;
        if (class586.field7776 > 0) {
            int var3 = 346 - class271.field3781 - 4;
            int var4 = var2 * var3 / (class586.field7776 + var2 - 1);
            int var5 = 4;
            if (class586.field7776 > 1) {
                var5 += (class586.field7776 - class711.field9945 - 1) * (var3 - var4) / (class586.field7776 - 1);
            }
            arg0.method415(class627.field8461 - 16, var5, 12, var4, class147.field2352 << 24 | 0x332277, 2);
            for (int var6 = class711.field9945; class711.field9945 + var2 > var6 && class586.field7776 > var6; var6++) {
                String[] var7 = class572.method3141(class287.field4063[var6], '\b', (byte) 12);
                int var8 = (class627.field8461 - 16 - 8) / var7.length;
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var8 * var9 + 8;
                    arg0.method421(var10, 0, var8 + var10 - 8, 350);
                    class188.field2788.method1288((byte) 83, var10, -1, -16777216, var7[var9], 348 - class665.field9437.field6833 - class199.field2892 - ((-class711.field9945 + var6) * class271.field3781));
                }
            }
        }
        arg0.method421(0, 0, class627.field8461, 350);
        arg0.method3570(0, 1, -1, 350 - class199.field2892, class627.field8461);
        class450.field6177.method1288((byte) 83, 10, -1, -16777216, "--> " + class656.field8914, 350 - class193.field2823.field6833 - 1);
        if (!class277.field3867) {
            return;
        }
        int var11 = -1;
        if (class642.field8626 % 30 > 15) {
            var11 = 16777215;
        }
        arg0.method3566(var11, class193.field2823.method2847("--> " + class656.field8914.substring(0, class157.field2484), (byte) -126) + 10, 127, 12, 350 - class193.field2823.field6833 - 11);
    }

    @OriginalMember(owner = "client!qga", name = "<init>", descriptor = "(Ldt;)V", line = 232)
    public class172(class224 arg0) {
        this.field2657 = arg0;
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(IIIII)V", line = 215)
    public static final void method1170(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class46.field664 != null) {
            class46.field664[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class128.field2144 != null) {
            class128.field2144[arg0][arg1] = (short) arg3;
        }
        if (class600.field7970 != null) {
            class600.field7970[arg0][arg1] = (byte) arg4;
        }
    }
}
