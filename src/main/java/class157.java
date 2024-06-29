import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class157 extends class279 {

    @OriginalMember(owner = "client!bl", name = "J", descriptor = "Z")
    private boolean field2564 = true;

    @OriginalMember(owner = "client!bl", name = "Q", descriptor = "I")
    private int field2571 = 4096;

    @OriginalMember(owner = "client!bl", name = "K", descriptor = "Lgb;")
    public static class212 field2565 = new class212(50);

    @OriginalMember(owner = "client!bl", name = "V", descriptor = "Ltl;")
    private static class59 field2576 = class85.method639("Mar", 9588);

    @OriginalMember(owner = "client!bl", name = "X", descriptor = "Ltl;")
    private static class59 field2578 = class85.method639("Jan", 9588);

    @OriginalMember(owner = "client!bl", name = "R", descriptor = "Ltl;")
    private static class59 field2572 = class85.method639("Aug", 9588);

    @OriginalMember(owner = "client!bl", name = "Y", descriptor = "Ltl;")
    private static class59 field2579 = class85.method639("Nov", 9588);

    @OriginalMember(owner = "client!bl", name = "ab", descriptor = "Ltl;")
    private static class59 field2581 = class85.method639("Jun", 9588);

    @OriginalMember(owner = "client!bl", name = "cb", descriptor = "Ltl;")
    private static class59 field2583 = class85.method639("May", 9588);

    @OriginalMember(owner = "client!bl", name = "T", descriptor = "Ltl;")
    private static class59 field2574 = class85.method639("Oct", 9588);

    @OriginalMember(owner = "client!bl", name = "S", descriptor = "Ltl;")
    private static class59 field2573 = class85.method639("Feb", 9588);

    @OriginalMember(owner = "client!bl", name = "W", descriptor = "Ltl;")
    private static class59 field2577 = class85.method639("Apr", 9588);

    @OriginalMember(owner = "client!bl", name = "db", descriptor = "Ltl;")
    private static class59 field2584 = class85.method639("Dec", 9588);

    @OriginalMember(owner = "client!bl", name = "bb", descriptor = "Ltl;")
    private static class59 field2582 = class85.method639("Sep", 9588);

    @OriginalMember(owner = "client!bl", name = "fb", descriptor = "Ltl;")
    private static class59 field2586 = class85.method639("Jul", 9588);

    @OriginalMember(owner = "client!bl", name = "eb", descriptor = "[Ltl;")
    public static class59[] field2585 = new class59[] { field2578, field2573, field2576, field2577, field2583, field2581, field2586, field2572, field2582, field2574, field2579, field2584 };

    @OriginalMember(owner = "client!bl", name = "U", descriptor = "F")
    public static float field2575;

    @OriginalMember(owner = "client!bl", name = "G", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!bl", name = "H", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!bl", name = "I", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!bl", name = "L", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!bl", name = "M", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!bl", name = "N", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!bl", name = "O", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!bl", name = "P", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!bl", name = "Z", descriptor = "[Llj;")
    public static class5[] field2580;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIII)V", line = 6)
    public static final void method1114(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2569++;
        class22 var5 = (class22) class238.field3969.method685((long) arg3, 128);
        if (var5 == null) {
            var5 = new class22();
            class238.field3969.method694(var5, (byte) -90, (long) arg3);
        }
        if (arg1 != 0) {
            field2574 = (class59) null;
        }
        if (arg0 >= var5.field297.length) {
            int[] var6 = new int[arg0 + 1];
            int[] var7 = new int[arg0 + 1];
            for (int var8 = 0; var8 < var5.field297.length; var8++) {
                var7[var8] = var5.field297[var8];
                var6[var8] = var5.field294[var8];
            }
            for (int var9 = var5.field297.length; var9 < arg0; var9++) {
                var7[var9] = -1;
                var6[var9] = 0;
            }
            var5.field294 = var6;
            var5.field297 = var7;
        }
        var5.field297[arg0] = arg2;
        var5.field294[arg0] = arg4;
    }

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "(II)V", line = 56)
    public static final void method1115(int arg0, int arg1) {
        field2567++;
        class186 var2 = class67.method561(32, arg0, 1);
        if (arg1 != -17690) {
            field2580 = (class5[]) null;
        }
        var2.method1381(true);
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "()V", line = 75)
    public class157() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(II)[[I", line = 79)
    public final int[][] method87(int arg0, int arg1) {
        field2566++;
        int[][] var3 = this.field4786.method1427(arg0 ^ arg0, arg1);
        if (this.field4786.field3297) {
            int[] var4 = this.method1960(-126, class132.field2197 & arg1 - 1, 0);
            int[] var5 = this.method1960(-126, arg1, 0);
            int[] var6 = this.method1960(-123, class132.field2197 & arg1 + 1, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class56.field835; var10++) {
                int var11 = (var6[var10] - var4[var10]) * this.field2571;
                int var12 = (var5[var10 + 1 & class310.field5270] - var5[class310.field5270 & var10 - 1]) * this.field2571;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var19 = var11 / var17;
                    var20 = var12 / var17;
                    var18 = 16777216 / var17;
                }
                if (this.field2564) {
                    var19 = (var19 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                }
                var7[var10] = var20;
                var8[var10] = var19;
                var9[var10] = var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(B)V", line = 157)
    public static void method1116(byte arg0) {
        field2565 = null;
        field2584 = null;
        field2576 = null;
        field2583 = null;
        field2574 = null;
        field2580 = null;
        field2572 = null;
        field2573 = null;
        field2586 = null;
        field2582 = null;
        int var1 = -65 / ((arg0 + 82) / 44);
        field2577 = null;
        field2579 = null;
        field2578 = null;
        field2585 = null;
        field2581 = null;
    }

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "(II)Z", line = 188)
    public static final boolean method1117(int arg0, int arg1) {
        field2561++;
        if (arg0 < 0) {
            return false;
        }
        int var2 = class27.field363[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return (short) arg1 == var2;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZII)I", line = 210)
    public static final int method1118(boolean arg0, int arg1, int arg2) {
        field2562++;
        if (!arg0) {
            method1118(true, -93, 44);
        }
        int var3 = class312.method2155(81, arg1 - 1, arg2 + -1) + class312.method2155(85, arg1 - 1, arg2 + 1) + class312.method2155(99, arg1 + 1, arg2 + -1) + class312.method2155(89, arg1 + 1, arg2 + 1);
        int var4 = class312.method2155(100, arg1, arg2 - 1) + (class312.method2155(96, arg1, arg2 + 1) + class312.method2155(103, arg1 - 1, arg2)) + class312.method2155(119, arg1 + 1, arg2);
        int var5 = class312.method2155(79, arg1, arg2);
        return var5 / 4 + (var3 / 16 + (var4 / 8));
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IILs;)V", line = 234)
    public final void method51(int arg0, int arg1, class170 arg2) {
        if (arg0 > -125) {
            return;
        }
        if (arg1 == 0) {
            this.field2571 = arg2.method1214(-18254);
        } else if (arg1 == 1) {
            this.field2564 = arg2.method1221(73) == 1;
        }
        field2563++;
    }
}
