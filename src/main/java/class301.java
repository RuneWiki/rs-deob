import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class301 {

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
    public int field5178 = 0;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "Lcd;")
    private static class64 field5165 = class44.method335((byte) 71, "Discard");

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "[I")
    public static int[] field5171 = new int[128];

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    public static int field5174 = 0;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "Lcd;")
    public static class64 field5166 = field5165;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "Lcd;")
    public static class64 field5170 = class44.method335((byte) 71, "Fps:");

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "[S")
    public static short[] field5177 = new short[256];

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "Lig;")
    public static class168 field5173 = new class168(50);

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "Z")
    public static boolean field5180 = false;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIII)I", line = 10)
    public static final int method2095(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field5168++;
        if (arg0 >= -60) {
            field5165 = (class64) null;
        }
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 1023 - arg3;
        } else if (var4 == 2) {
            return 1023 - arg1;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V", line = 32)
    public static void method2096(byte arg0) {
        if (arg0 > -81) {
            method2097(70, 75);
        }
        field5177 = null;
        field5173 = null;
        field5170 = null;
        field5171 = null;
        field5166 = null;
        field5165 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)V", line = 50)
    public static final void method2097(int arg0, int arg1) {
        class115 var2 = (class115) class17.field351.method1151((long) arg0, 0);
        field5176++;
        if (var2 == null) {
            return;
        }
        if (arg1 < 21) {
            method2100(-92, (byte) -25);
        }
        for (int var3 = 0; var3 < var2.field2109.length; var3++) {
            var2.field2109[var3] = -1;
            var2.field2112[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lkh;II)V", line = 75)
    private final void method2098(class13 arg0, int arg1, int arg2) {
        field5169++;
        if (arg1 != 20196) {
            field5173 = (class168) null;
        }
        if (arg2 == 5) {
            this.field5178 = arg0.method112((byte) 92);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lkh;I)V", line = 91)
    public final void method2099(class13 arg0, int arg1) {
        if (arg1 != -1) {
            method2102(-79, (class246) null, 119, 116, -2, -58);
        }
        field5172++;
        while (true) {
            int var3 = arg0.method152((byte) -84);
            if (var3 == 0) {
                return;
            }
            this.method2098(arg0, 20196, var3);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IB)I", line = 113)
    public static final int method2100(int arg0, byte arg1) {
        field5175++;
        if (arg1 != 41) {
            field5171 = (int[]) null;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V", line = 126)
    public static final void method2101(int arg0) {
        field5167++;
        class212.method1495();
        class62.field1210 = new class73[7];
        class62.field1210[1] = new class192();
        class62.field1210[2] = new class291();
        class62.field1210[3] = new class68();
        if (arg0 > -110) {
            method2102(-41, (class246) null, -10, 86, -6, 3);
        }
        class62.field1210[4] = new class152();
        class62.field1210[5] = new class194();
        class62.field1210[6] = new class148();
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILmm;IIII)V", line = 149)
    public static final void method2102(int arg0, class246 arg1, int arg2, int arg3, int arg4, int arg5) {
        field5179++;
        if (arg3 != 2) {
            method2100(-75, (byte) 7);
        }
        if (arg1.field4294 == -1 && arg1.field4292 == null) {
            return;
        }
        int var6 = 0;
        if (arg1.field4268 < arg4) {
            var6 += arg4 - arg1.field4268;
        } else if (arg1.field4285 > arg4) {
            var6 += arg1.field4285 - arg4;
        }
        if (arg1.field4267 < arg2) {
            var6 += arg2 - arg1.field4267;
        } else if (arg2 < arg1.field4266) {
            var6 += arg1.field4266 - arg2;
        }
        if (arg1.field4265 == 0 || arg1.field4265 < var6 - 64 || class106.field1960 == 0 || arg1.field4271 != arg5) {
            if (arg1.field4283 != null) {
                class250.field4341.method1419(arg1.field4283);
                arg1.field4283 = null;
            }
            if (arg1.field4270 != null) {
                class250.field4341.method1419(arg1.field4270);
                arg1.field4270 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg1.field4265 - var6) * class106.field1960 / arg1.field4265;
        if (arg1.field4283 != null) {
            arg1.field4283.method2030(var7);
        } else if (arg1.field4294 >= 0) {
            class239 var8 = class239.method1740(class299.field5161, arg1.field4294, 0);
            if (var8 != null) {
                class286 var9 = var8.method1741().method1981(class131.field2324);
                class294 var10 = class294.method2022(var9, 100, var7);
                var10.method2023(-1);
                class250.field4341.method1420(var10);
                arg1.field4283 = var10;
            }
        }
        if (arg1.field4270 != null) {
            arg1.field4270.method2030(var7);
            if (!arg1.field4270.method228(99999999)) {
                arg1.field4270 = null;
            }
        } else if (arg1.field4292 != null && (arg1.field4276 -= arg0) <= 0) {
            int var11 = (int) ((double) arg1.field4292.length * Math.random());
            class239 var12 = class239.method1740(class299.field5161, arg1.field4292[var11], 0);
            if (var12 != null) {
                class286 var13 = var12.method1741().method1981(class131.field2324);
                class294 var14 = class294.method2022(var13, 100, var7);
                var14.method2023(0);
                class250.field4341.method1420(var14);
                arg1.field4276 = arg1.field4279 + (int) ((double) (arg1.field4269 - arg1.field4279) * Math.random());
                arg1.field4270 = var14;
            }
        }
    }
}
