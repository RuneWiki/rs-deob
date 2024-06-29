import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class264 extends class27 {

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "I")
    public static int field3541 = 0;

    @OriginalMember(owner = "client!rl", name = "v", descriptor = "Z")
    public static boolean field3548 = false;

    @OriginalMember(owner = "client!rl", name = "C", descriptor = "I")
    public static int field3554 = 0;

    @OriginalMember(owner = "client!rl", name = "B", descriptor = "[[B")
    public static byte[][] field3553 = new byte[1000][];

    @OriginalMember(owner = "client!rl", name = "F", descriptor = "I")
    public static int field3557 = 0;

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!rl", name = "q", descriptor = "I")
    public int field3543;

    @OriginalMember(owner = "client!rl", name = "r", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!rl", name = "t", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!rl", name = "x", descriptor = "I")
    public int field3550;

    @OriginalMember(owner = "client!rl", name = "y", descriptor = "I")
    public int field3551;

    @OriginalMember(owner = "client!rl", name = "z", descriptor = "I")
    public int field3552;

    @OriginalMember(owner = "client!rl", name = "E", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!rl", name = "H", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!rl", name = "J", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!rl", name = "u", descriptor = "Lsb;")
    public class362 field3547;

    @OriginalMember(owner = "client!rl", name = "w", descriptor = "Llq;")
    public static class75 field3549;

    @OriginalMember(owner = "client!rl", name = "D", descriptor = "[Ljo;")
    public static class220[] field3555;

    @OriginalMember(owner = "client!rl", name = "p", descriptor = "[Luo;")
    public static class385[] field3542;

    @OriginalMember(owner = "client!rl", name = "s", descriptor = "[S")
    public static short[] field3545;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)V")
    public static final void method1697(int arg0) {
        field3558++;
        class410 var1 = class385.field5421;
        synchronized (class385.field5421) {
            class385.field5421.method2533(0);
        }
        class410 var2 = class244.field3366;
        synchronized (class244.field3366) {
            class244.field3366.method2533(0);
            if (arg0 <= 35) {
                method1704(-55, -40, 101, 52);
            }
        }
        class344 var3 = class234.field3227;
        synchronized (class234.field3227) {
            class234.field3227.method2176(-79);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lsb;I)I")
    public static final int method1698(class362 arg0, int arg1) {
        int var2 = 85 / ((arg1 - 7) / 46);
        field3546++;
        if (arg0.field4953 == 0) {
            return 0;
        }
        if (arg0.field4988 != -1 && arg0.field4988 < 32768) {
            class127 var3 = class298.field4012[arg0.field4988];
            if (var3 != null) {
                int var4 = arg0.field3176 - var3.field3176;
                int var5 = arg0.field3167 - var3.field3167;
                if (var4 != 0 || var5 != 0) {
                    arg0.method2270(6953, (int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF);
                }
            }
        }
        if (arg0.field4988 >= 32768) {
            int var6 = arg0.field4988 - 32768;
            if (class401.field5606 == var6) {
                var6 = 2047;
            }
            class338 var7 = class220.field3044[var6];
            if (var7 != null) {
                int var8 = arg0.field3176 - var7.field3176;
                int var9 = arg0.field3167 - var7.field3167;
                if (var8 != 0 || var9 != 0) {
                    arg0.method2270(6953, (int) (Math.atan2((double) var8, (double) var9) * 2607.5945876176133D) & 0x3FFF);
                }
            }
        }
        if ((arg0.field4916 != 0 || arg0.field4932 != 0) && (arg0.field5009 == 0 || arg0.field5001 > 0)) {
            int var10 = arg0.field3176 - ((arg0.field4916 - class283.field3794 - class283.field3794) * 64);
            int var11 = arg0.field3167 - (arg0.field4932 - class296.field3988 - class296.field3988) * 64;
            if (var10 != 0 || var11 != 0) {
                arg0.method2270(6953, (int) (Math.atan2((double) var10, (double) var11) * 2607.5945876176133D) & 0x3FFF);
            }
            arg0.field4916 = 0;
            arg0.field4932 = 0;
        }
        return arg0.method2281(-32203);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)V")
    public static final void method1699(int arg0, int arg1) {
        field3556++;
        class450 var2 = class59.method540(5, arg1, 1000);
        var2.method2798(-664528978);
        if (arg0 < 2) {
            field3549 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(I)V")
    public static final void method1700(int arg0) {
        class438.field6268.method2533(0);
        if (arg0 != 7) {
            method1697(93);
        }
        field3544++;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(Z)V")
    public static final void method1701(boolean arg0) {
        field3540++;
        class410 var1 = class189.field2721;
        synchronized (class189.field2721) {
            class189.field2721.method2533(0);
        }
        if (!arg0) {
            class410 var2 = class27.field469;
            synchronized (class27.field469) {
                class27.field469.method2533(0);
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BLjava/lang/String;I)V")
    public static final void method1702(byte arg0, String arg1, int arg2) {
        field3539++;
        class450 var3 = class59.method540(2, arg2, arg0 + 876);
        var3.method2800(arg0 ^ 0x17C);
        if (arg0 == 124) {
            var3.field6504 = arg1;
        }
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(I)V")
    public static void method1703(int arg0) {
        field3545 = null;
        if (arg0 > -50) {
            method1701(true);
        }
        field3542 = null;
        field3555 = null;
        field3549 = null;
        field3553 = null;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(IIII)I")
    public static final int method1704(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        if (arg0 != 7) {
            return -92;
        }
        field3559++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg2;
        }
    }
}
