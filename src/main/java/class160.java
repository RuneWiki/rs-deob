import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class160 {

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "F")
    public float field2798;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    public int field2801;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
    public int field2806;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "F")
    public float field2795;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "F")
    public float field2799;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public int field2796;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public int field2793;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public int field2802;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public int field2790;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field2789 = 0;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "Z")
    public static boolean field2791 = false;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "Lbd;")
    private static class162 field2794 = class17.method142(0, "Walk here");

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "Lbd;")
    public static class162 field2792 = field2794;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
    public static int field2803 = 128;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILbd;Z)V", line = 5)
    public static final void method1225(int arg0, class162 arg1, boolean arg2) {
        field2808++;
        class162 var3 = arg1.method1275((byte) 100).method1265((byte) 46);
        boolean var4 = false;
        int var5 = 0;
        if (!arg2) {
            return;
        }
        while (var5 < class171.field2966) {
            class39 var6 = class270.field4520[class123.field2233[var5]];
            if (var6 != null && var6.field611 != null && var6.field611.method1282(var3, 84)) {
                class163.method1292(class122.field2215.field5050[0], 2, false, 1, 0, var6.field5050[0], 0, class122.field2215.field5034[0], var6.field5034[0], 0, 1, 1);
                var4 = true;
                if (arg0 == 1) {
                    class239.field3968++;
                    class187.field3229.method338(154, (byte) 8);
                    class187.field3229.method751(class123.field2233[var5], -1044017976);
                } else if (arg0 == 4) {
                    class187.field3229.method338(215, (byte) 8);
                    class278.field4672++;
                    class187.field3229.method731(-4, class123.field2233[var5]);
                } else if (arg0 == 5) {
                    class43.field709++;
                    class187.field3229.method338(71, (byte) 8);
                    class187.field3229.method737(-120, class123.field2233[var5]);
                } else if (arg0 == 6) {
                    class275.field4567++;
                    class187.field3229.method338(199, (byte) 8);
                    class187.field3229.method751(class123.field2233[var5], -1044017976);
                } else if (arg0 == 7) {
                    class94.field1674++;
                    class187.field3229.method338(157, (byte) 8);
                    class187.field3229.method759(false, class123.field2233[var5]);
                }
                break;
            }
            var5++;
        }
        if (!var4) {
            class82.method633(0, class135.method1062(new class162[] { class259.field4319, var3 }, true), class244.field4053, -59);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IILij;III)V", line = 98)
    public static final void method1226(int arg0, int arg1, class64 arg2, int arg3, int arg4, int arg5) {
        field2804++;
        if (arg2.field992 == -1 && arg2.field1004 == null) {
            return;
        }
        int var6 = 0;
        if (arg1 > arg2.field1013) {
            var6 += arg1 - arg2.field1013;
        } else if (arg1 < arg2.field1006) {
            var6 += arg2.field1006 - arg1;
        }
        if (arg2.field1023 < arg5) {
            var6 += arg5 - arg2.field1023;
        } else if (arg5 < arg2.field1021) {
            var6 += arg2.field1021 - arg5;
        }
        if (arg2.field1002 == 0 || (var6 - 64) > arg2.field1002 || class256.field4256 == 0 || arg2.field1011 != arg3) {
            if (arg2.field1003 != null) {
                class313.field5290.method449(arg2.field1003);
                arg2.field1003 = null;
            }
            if (arg2.field1016 != null) {
                class313.field5290.method449(arg2.field1016);
                arg2.field1016 = null;
            }
            return;
        }
        var6 -= 64;
        if (~var6 > arg4) {
            var6 = 0;
        }
        int var7 = (arg2.field1002 - var6) * class256.field4256 / arg2.field1002;
        if (arg2.field1003 != null) {
            arg2.field1003.method569(var7);
        } else if (arg2.field992 >= 0) {
            class241 var8 = class241.method1712(class157.field2764, arg2.field992, 0);
            if (var8 != null) {
                class310 var9 = var8.method1711().method2094(class222.field3710);
                class76 var10 = class76.method562(var9, 100, var7);
                var10.method566(-1);
                class313.field5290.method454(var10);
                arg2.field1003 = var10;
            }
        }
        if (arg2.field1016 != null) {
            arg2.field1016.method569(var7);
            if (!arg2.field1016.method1185((byte) -38)) {
                arg2.field1016 = null;
            }
        } else if (arg2.field1004 != null && (arg2.field1009 -= arg0) <= 0) {
            int var11 = (int) ((double) arg2.field1004.length * Math.random());
            class241 var12 = class241.method1712(class157.field2764, arg2.field1004[var11], 0);
            if (var12 != null) {
                class310 var13 = var12.method1711().method2094(class222.field3710);
                class76 var14 = class76.method562(var13, 100, var7);
                var14.method566(0);
                class313.field5290.method454(var14);
                arg2.field1009 = (int) ((double) (arg2.field1024 - arg2.field997) * Math.random()) + arg2.field997;
                arg2.field1016 = var14;
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BLbd;)V", line = 222)
    public static final void method1227(byte arg0, class162 arg1) {
        field2805++;
        class35.field590 = arg1;
        if (client.field1903.field469 == null) {
            return;
        }
        int var2 = -14 % ((-arg0 - 84) / 34);
        try {
            class162 var3 = class98.field1783.method1280(client.field1903.field469, 0);
            class162 var4 = class313.field5275.method1280(client.field1903.field469, 0);
            class162 var5 = class135.method1062(new class162[] { var3, class209.field3530, arg1, class120.field2191, var4 }, true);
            class162 var6;
            if (arg1.method1249((byte) -118) == 0) {
                var6 = class135.method1062(new class162[] { var5, class30.field507 }, true);
            } else {
                var6 = class135.method1062(new class162[] { var5, class286.field4829, class182.method1381(class300.method2048((byte) 18) + 94608000000L, -22637), class307.field5160, class67.method482(-69, 94608000L) }, true);
            }
            class135.method1062(new class162[] { class119.field2172, var6, client.field1904 }, true).method1255(client.field1903.field469, (byte) 60);
        } catch (Throwable var8) {
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V", line = 276)
    public static final void method1228(int arg0) {
        field2797++;
        int var1 = (class178.field3052 >> 3) + (field2800 >> 10);
        int var2 = (class67.field1083 >> 10) + (class258.field4294 >> 3);
        byte var3 = 0;
        byte var4 = 8;
        byte var5 = 8;
        byte var6 = 18;
        class92.field1631 = new int[var6][4];
        class131.field2361 = new byte[var6][];
        class243.field4038 = new int[var6];
        class188.field3236 = new int[var6];
        class250.field4176 = new int[var6];
        class157.field2763 = new int[var6];
        class147.field2654 = new byte[var6][];
        class251.field4190 = new int[var6];
        class123.field2230 = new int[var6];
        if (arg0 <= 22) {
            field2800 = -15;
        }
        class204.field3455 = new byte[var6][];
        class280.field4730 = new byte[var6][];
        class209.field3542 = new byte[var6][];
        int var7 = 0;
        for (int var8 = (var1 - 6) / 8; var8 <= ((var1 + 6) / 8); var8++) {
            for (int var9 = (var2 - 6) / 8; var9 <= (var2 + 6) / 8; var9++) {
                int var10 = (var8 << 8) + var9;
                class123.field2230[var7] = var10;
                class250.field4176[var7] = class91.field1614.method1136(class135.method1062(new class162[] { class297.field4974, class156.method1212(10, var8), class256.field4237, class156.method1212(10, var9) }, true), 63);
                class251.field4190[var7] = class91.field1614.method1136(class135.method1062(new class162[] { class280.field4749, class156.method1212(10, var8), class256.field4237, class156.method1212(10, var9) }, true), 63);
                class243.field4038[var7] = class91.field1614.method1136(class135.method1062(new class162[] { class242.field4026, class156.method1212(10, var8), class256.field4237, class156.method1212(10, var9) }, true), 63);
                class188.field3236[var7] = class91.field1614.method1136(class135.method1062(new class162[] { class80.field1399, class156.method1212(10, var8), class256.field4237, class156.method1212(10, var9) }, true), 63);
                class157.field2763[var7] = class91.field1614.method1136(class135.method1062(new class162[] { class305.field5139, class156.method1212(10, var8), class256.field4237, class156.method1212(10, var9) }, true), 63);
                if (class243.field4038[var7] == -1) {
                    class250.field4176[var7] = -1;
                    class251.field4190[var7] = -1;
                    class188.field3236[var7] = -1;
                    class157.field2763[var7] = -1;
                }
                var7++;
            }
        }
        for (int var11 = var7; var11 < class243.field4038.length; var11++) {
            class243.field4038[var11] = -1;
            class250.field4176[var11] = -1;
            class251.field4190[var11] = -1;
            class188.field3236[var11] = -1;
            class157.field2763[var11] = -1;
        }
        class91.method692(var1, var3, var4, var2, true, true, var5);
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V", line = 363)
    public static void method1229(int arg0) {
        field2792 = null;
        if (arg0 != 0) {
            method1225(80, (class162) null, false);
        }
        field2794 = null;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V", line = 379)
    public class160() {
        this.field2798 = 1.2F;
        this.field2801 = -50;
        this.field2806 = class108.field1945;
        this.field2795 = 0.69921875F;
        this.field2799 = 1.1523438F;
        this.field2796 = 0;
        this.field2793 = -50;
        this.field2802 = class108.field1950;
        this.field2790 = -60;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lb;)V", line = 394)
    public class160(class94 arg0) {
        int var2 = arg0.method756(915905888);
        if ((var2 & 0x1) == 0) {
            this.field2802 = class108.field1950;
        } else {
            this.field2802 = arg0.method747(false);
        }
        if ((var2 & 0x2) == 0) {
            this.field2799 = 1.1523438F;
        } else {
            this.field2799 = (float) arg0.method761((byte) 108) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field2795 = 0.69921875F;
        } else {
            this.field2795 = (float) arg0.method761((byte) 108) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field2798 = 1.2F;
        } else {
            this.field2798 = (float) arg0.method761((byte) 108) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field2793 = -50;
            this.field2801 = -50;
            this.field2790 = -60;
        } else {
            this.field2801 = arg0.method750((byte) -24);
            this.field2790 = arg0.method750((byte) -24);
            this.field2793 = arg0.method750((byte) -24);
        }
        if ((var2 & 0x20) == 0) {
            this.field2806 = class108.field1945;
        } else {
            this.field2806 = arg0.method747(false);
        }
        if ((var2 & 0x40) == 0) {
            this.field2796 = 0;
        } else {
            this.field2796 = arg0.method761((byte) 108);
        }
    }
}
