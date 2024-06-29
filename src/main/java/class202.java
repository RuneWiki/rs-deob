import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class202 {

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public int field2395;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "Z")
    public static boolean field2392 = false;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "Llga;")
    public static class712 field2397 = new class712(22, 7);

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field2398 = -1;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "[F")
    public static float[] field2399 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLem;)I")
    public static final int method1117(byte arg0, class227 arg1) {
        field2394++;
        String var2 = class656.method3714((byte) -124, arg1);
        int[] var3 = null;
        if (class425.method2435(124, arg1.field2948)) {
            var3 = class761.field10628.method4169((int) arg1.field2945, (byte) -128).field9762;
        } else if (arg1.field2946 != -1) {
            var3 = class761.field10628.method4169(arg1.field2946, (byte) -125).field9762;
        } else if (class641.method3607(arg1.field2948, (byte) -70)) {
            class706 var6 = (class706) class681.field9475.method2552((long) ((int) arg1.field2945), -1);
            if (var6 != null) {
                class215 var7 = var6.field9890;
                class274 var8 = var7.field2589;
                if (var8.field3616 != null) {
                    var8 = var8.method1637(class386.field5455, (byte) 55);
                }
                if (var8 != null) {
                    var3 = var8.field3668;
                }
            }
        } else if (class422.method2408(arg1.field2948, false)) {
            Object var4 = null;
            class685 var5;
            if (arg1.field2948 == 1009) {
                var5 = class707.field9894.method4109((int) arg1.field2945, (byte) 119);
            } else {
                var5 = class707.field9894.method4109((int) (arg1.field2945 >>> 32 & 0x7FFFFFFFL), (byte) 119);
            }
            if (var5.field9528 != null) {
                var5 = var5.method3875(class386.field5455, (byte) -38);
            }
            if (var5 != null) {
                var3 = var5.field9539;
            }
        }
        int var9 = -22 / ((arg0 - 5) / 60);
        if (var3 != null) {
            var2 = var2 + class41.method247(0, var3);
        }
        int var10 = class616.field8643.method2218((byte) -126, class587.field8211, var2);
        if (arg1.field2941) {
            var10 += class15.field112.method674() + 4;
        }
        return var10;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)I")
    public static final int method1118(int arg0, int arg1) {
        field2393++;
        if (arg0 >= -31) {
            return -69;
        } else {
            int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
            int var3 = arg1 * 6 - 61440;
            int var4 = (arg1 * var3 >> 12) + 40960;
            return var2 * var4 >> 12;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Llr;Z)Z")
    public static final boolean method1119(class752 arg0, boolean arg1) {
        boolean var2 = class25.field188 == class143.field1850;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method161(-8675);
        if (arg0.field10422 < 0 || arg0.field10421 < 0 || arg0.field10426 >= class68.field743 || arg0.field10425 >= class480.field6629) {
            return false;
        }
        short var6 = 0;
        for (int var7 = arg0.field10422; var7 <= arg0.field10426; var7++) {
            for (int var11 = arg0.field10421; var11 <= arg0.field10425; var11++) {
                class624 var12 = class76.method565(arg0.field2175, var7, var11);
                if (var12 != null) {
                    class603 var13 = class425.method2433((byte) -90, arg0);
                    class603 var14 = var12.field8729;
                    if (var14 == null) {
                        var12.field8729 = var13;
                    } else {
                        while (var14.field8413 != null) {
                            var14 = var14.field8413;
                        }
                        var14.field8413 = var13;
                    }
                    if (var2 && (class574.field8077[var7][var11] & 0xFF000000) != 0) {
                        var3 = class574.field8077[var7][var11];
                        var4 = class622.field8711[var7][var11];
                        var5 = class425.field5983[var7][var11];
                    }
                    if (!arg1 && var12.field8736 != null && var12.field8736.field1827 > var6) {
                        var6 = var12.field8736.field1827;
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var8 = arg0.field10422; var8 <= arg0.field10426; var8++) {
                for (int var9 = arg0.field10421; var9 <= arg0.field10425; var9++) {
                    if ((class574.field8077[var8][var9] & 0xFF000000) == 0) {
                        class574.field8077[var8][var9] = var3;
                        class622.field8711[var8][var9] = var4;
                        class425.field5983[var8][var9] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class561.field7935[class320.field4304++] = arg0;
        } else {
            int var10 = class25.field188 == class143.field1850 ? 1 : 0;
            if (!arg0.method123(-127)) {
                arg0.field2179 = class707.field9896[var10];
                class707.field9896[var10] = arg0;
            } else if (arg0.method126(6540)) {
                arg0.field2179 = class43.field467[var10];
                class43.field467[var10] = arg0;
            } else {
                arg0.field2179 = class732.field10200[var10];
                class732.field10200[var10] = arg0;
                class315.field4252 = true;
            }
        }
        if (arg1) {
            arg0.field2178 -= var6;
        }
        return true;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public static void method1120(byte arg0) {
        if (arg0 > -7) {
            method1119(null, true);
        }
        field2397 = null;
        field2399 = null;
    }

    @OriginalMember(owner = "client!oe", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2396++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(II)V")
    public class202(int arg0, int arg1) {
        this.field2395 = arg0;
    }
}
