import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class328 extends class297 {

    @OriginalMember(owner = "client!ak", name = "R", descriptor = "I")
    private int field5134 = 0;

    @OriginalMember(owner = "client!ak", name = "Q", descriptor = "I")
    private int field5133 = 4096;

    @OriginalMember(owner = "client!ak", name = "I", descriptor = "Ljava/lang/String;")
    public static String field5125 = "Started 3d Library";

    @OriginalMember(owner = "client!ak", name = "K", descriptor = "J")
    public static long field5127 = 0L;

    @OriginalMember(owner = "client!ak", name = "P", descriptor = "Ljava/lang/String;")
    public static String field5132 = "Loading interfaces - ";

    @OriginalMember(owner = "client!ak", name = "T", descriptor = "Ljn;")
    public static class133 field5136 = new class133(0, 0);

    @OriginalMember(owner = "client!ak", name = "U", descriptor = "I")
    public static int field5137 = 0;

    @OriginalMember(owner = "client!ak", name = "J", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!ak", name = "L", descriptor = "I")
    public static int field5128;

    @OriginalMember(owner = "client!ak", name = "M", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!ak", name = "N", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!ak", name = "O", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!ak", name = "S", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZ)[I", line = 5)
    public final int[] method173(int arg0, boolean arg1) {
        int[] var3 = this.field4760.method215(arg0, 19142);
        if (!arg1) {
            field5125 = (String) null;
        }
        field5129++;
        if (this.field4760.field388) {
            int[] var4 = this.method2109(arg0, (byte) 66, 0);
            for (int var5 = 0; var5 < class31.field491; var5++) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field5134 && var6 <= this.field5133 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IILaj;)V", line = 39)
    public final void method169(int arg0, int arg1, class1 arg2) {
        field5135++;
        if (arg0 == 0) {
            this.field5134 = arg2.method56(19612);
        } else if (arg0 == 1) {
            this.field5133 = arg2.method56(arg1 + 19357);
        }
        if (arg1 != 255) {
            this.field5134 = -75;
        }
    }

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "(I)V", line = 74)
    public static void method2303(int arg0) {
        field5125 = null;
        field5136 = null;
        field5132 = null;
        if (arg0 != 4096) {
            field5137 = -1;
        }
    }

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "(I)[Lme;", line = 89)
    public static final class200[] method2304(int arg0) {
        field5128++;
        class200[] var1 = new class200[class89.field1426];
        for (int var2 = arg0; var2 < class89.field1426; var2++) {
            if (class162.field2623) {
                var1[var2] = new class125(class185.field2926, class112.field1821, class61.field892[var2], class183.field2902[var2], class309.field4887[var2], class83.field1288[var2], class207.field3277[var2], class260.field3873);
            } else {
                var1[var2] = new class186(class185.field2926, class112.field1821, class61.field892[var2], class183.field2902[var2], class309.field4887[var2], class83.field1288[var2], class207.field3277[var2], class260.field3873);
            }
        }
        class260.method1796(1952227009);
        return var1;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIB)V", line = 117)
    public static final void method2305(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (class344.field5333 < 100) {
            class264.method1826(127);
        }
        if (arg4 != -38) {
            field5127 = 125L;
        }
        field5131++;
        if (class162.field2623) {
            class114.method886(arg3, arg0, arg1 + arg3, arg0 + arg2);
        } else {
            class33.method304(arg3, arg0, arg3 + arg1, arg0 + arg2);
        }
        if (class344.field5333 < 100) {
            int var14 = arg1 / 2 + arg3;
            byte var15 = 20;
            int var16 = arg2 / 2 + arg0 - var15 - 18;
            if (class162.field2623) {
                class114.method887(arg3, arg0, arg1, arg2, 0);
                class114.method897(var14 - 152, var16, 304, 34, 9179409);
                class114.method897(var14 - 151, var16 + 1, 302, 32, 0);
                class114.method887(var14 - 150, var16 + 2, class344.field5333 * 3, 30, 9179409);
                class114.method887(class344.field5333 * 3 + var14 - 150, var16 + 2, 300 - (class344.field5333 * 3), 30, 0);
            } else {
                class33.method288(arg3, arg0, arg1, arg2, 0);
                class33.method293(var14 - 152, var16, 304, 34, 9179409);
                class33.method293(var14 - 151, var16 + 1, 302, 32, 0);
                class33.method288(var14 - 150, var16 + 2, class344.field5333 * 3, 30, 9179409);
                class33.method288(var14 + (class344.field5333 * 3) - 150, var16 + 2, 300 - (class344.field5333 * 3), 30, 0);
            }
            class146.field2392.method1492(class340.field5249, var14, var15 + var16, 16777215, -1);
            return;
        }
        class155.field2553 = class180.field2863 - ((int) ((float) arg1 / class342.field5298));
        class84.field1303 = (int) ((float) (arg2 * 2) / class342.field5298);
        class259.field3842 = class67.field1013 - ((int) ((float) arg2 / class342.field5298));
        class245.field3662 = (int) ((float) (arg1 * 2) / class342.field5298);
        int var5 = class180.field2863 - ((int) ((float) arg1 / class342.field5298));
        int var6 = class67.field1013 - ((int) ((float) arg2 / class342.field5298));
        int var7 = (int) ((float) arg1 / class342.field5298) + class180.field2863;
        int var8 = (int) ((float) arg2 / class342.field5298) + class67.field1013;
        if (class162.field2623) {
            if (class145.field2347 == null || class145.field2347.field1412 != arg1 || class145.field2347.field1413 != arg2) {
                class145.field2347 = null;
                class145.field2347 = new class317(arg1, arg2);
            }
            class33.method299(class145.field2347.field4988, arg1, arg2);
            class343.method2378(arg1, 0, (byte) 49, 0, var5, var7, arg2, var8, var6);
            class260.method1807(class179.field2854, 0, var5, 0, var7, var6, var8, arg2, arg1, false);
            class130.method1008(var5, var7, var8, 0, arg1, arg2, 93, var6, 0);
            class145.field2347.method2238();
            class114.method891(class145.field2347.field4988, arg3, arg0, arg1, arg2);
            class33.field503 = null;
        } else {
            class343.method2378(arg1 + arg3, arg3, (byte) -127, arg0, var5, var7, arg0 + arg2, var8, var6);
            class260.method1807(class179.field2854, arg3, var5, arg0, var7, var6, var8, arg0 + arg2, arg3 - -arg1, false);
            class130.method1008(var5, var7, var8, arg0, arg3 + arg1, arg0 - -arg2, 116, var6, arg3);
        }
        if (class160.field2603 > 0) {
            class157.field2569--;
            if (class157.field2569 == 0) {
                class160.field2603--;
                class157.field2569 = 20;
            }
        }
        if (!class318.field4993) {
            return;
        }
        int var9 = arg1 + arg3 - 5;
        int var10 = arg0 + arg2 - 8;
        class107.field1756.method1467("Fps:" + class337.field5211, var9, var10, 16776960, -1);
        int var11 = 16776960;
        int var17 = var10 - 15;
        Runtime var12 = Runtime.getRuntime();
        int var13 = (int) ((var12.totalMemory() - var12.freeMemory()) / 1024L);
        if (var13 > 65536) {
            var11 = 16711680;
        }
        class107.field1756.method1467("Mem:" + var13 + "k", var9, var17, var11, -1);
        var10 = var17 - 15;
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V", line = 275)
    public class328() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "(I)V", line = 260)
    public static final void method2306(int arg0) {
        class110.field1789 = new class266[class251.field3702.method966((byte) 14)][];
        if (arg0 == 151) {
            field5126++;
            class135.field2158 = new boolean[class251.field3702.method966((byte) 14)];
        }
    }
}
