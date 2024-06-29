import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class142 implements Runnable {

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "Lrb;")
    public static class254 field2441 = new class254(64);

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "Lub;")
    private static class227 field2447 = class257.method1749("glow2:", 17263);

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "Lub;")
    public static class227 field2450 = class257.method1749("<col=ff7000>", 17263);

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "Lub;")
    public static class227 field2451 = field2447;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "Lub;")
    public static class227 field2444 = field2447;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "Ln;")
    public static class138 field2446;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "[I")
    public static int[] field2448;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)Lai;")
    public static final class14 method898(int arg0, int arg1) {
        class14 var2 = (class14) class211.field3567.method1037(37, (long) arg1);
        field2443++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = field2446.method884(class146.method918((byte) 34, arg1), 115, class63.method397(arg1, -90));
        class14 var4 = new class14();
        int var5 = 58 / ((arg0 - 74) / 47);
        if (var3 != null) {
            var4.method71(new class226(var3), -118);
        }
        class211.field3567.method1032(-810, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!nb", name = "run", descriptor = "()V")
    public final void run() {
        field2440++;
        try {
            while (true) {
                class198 var1 = class192.field3256;
                class41 var2;
                synchronized (class192.field3256) {
                    var2 = (class41) class192.field3256.method1277(101);
                }
                if (var2 == null) {
                    class171.method1088(85, 100L);
                    Object var3 = class223.field3777;
                    synchronized (class223.field3777) {
                        if (class245.field4290 <= 1) {
                            class245.field4290 = 0;
                            class223.field3777.notifyAll();
                            return;
                        }
                        class245.field4290--;
                    }
                } else {
                    if (var2.field671 == 0) {
                        var2.field678.method1222(var2.field680.length, (int) var2.field1113, (byte) -104, var2.field680);
                        class198 var4 = class192.field3256;
                        synchronized (class192.field3256) {
                            var2.method369(126);
                        }
                    } else if (var2.field671 == 1) {
                        var2.field680 = var2.field678.method1221((int) var2.field1113, 94);
                        class198 var5 = class192.field3256;
                        synchronized (class192.field3256) {
                            class51.field907.method1272(5664, var2);
                        }
                    }
                    Object var6 = class223.field3777;
                    synchronized (class223.field3777) {
                        if (class245.field4290 <= 1) {
                            class245.field4290 = 0;
                            class223.field3777.notifyAll();
                            return;
                        }
                        class245.field4290 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class149.method949((String) null, var17, -125);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIZIIZIILqe;IILbf;II)Lbf;")
    public static final class48 method899(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, class51 arg8, int arg9, int arg10, class48 arg11, int arg12, int arg13) {
        field2445++;
        long var14 = (long) ((arg0 << 24) + (arg6 << 16) + arg3) - (-((long) arg1 << 32) - ((long) arg13 << 48));
        class48 var16 = (class48) class213.field3591.method1735(var14, (byte) -69);
        if (var16 == null) {
            byte var17;
            if (arg3 == 1) {
                var17 = 9;
            } else if (arg3 == 2) {
                var17 = 12;
            } else if (arg3 == 3) {
                var17 = 15;
            } else if (arg3 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            byte var18 = 3;
            int[] var19 = new int[] { 64, 96, 128 };
            int[][] var20 = new int[var18][var17];
            class93 var21 = new class93(var17 * var18 + 1, var17 * var18 * 2 + -var17, 0);
            int var22 = var21.method554(0, 0, 0);
            for (int var23 = 0; var23 < var18; var23++) {
                int var30 = var19[var23];
                int var31 = var19[var23];
                for (int var32 = 0; var32 < var17; var32++) {
                    int var33 = (var32 << 11) / var17;
                    int var34 = class62.field1136[var33] * var30 + arg10 >> 16;
                    int var35 = arg4 + (class62.field1143[var33] * var31) >> 16;
                    var20[var23][var32] = var21.method554(var34, 0, var35);
                }
            }
            for (int var24 = 0; var24 < var18; var24++) {
                int var25 = (var24 * 256 + 128) / var18;
                int var26 = 256 - var25;
                short var27 = (short) (((arg1 & 0xFC00) * var26 + (arg13 & 0xFC00) * var25 & 0xFC0000) + ((arg1 & 0x7F) * var26 + (arg13 & 0x7F) * var25 & 0x7F00) + ((arg1 & 0x380) * var26 + (arg13 & 0x380) * var25 & 0x38000) >> 8);
                byte var28 = (byte) (arg0 * var25 + arg6 * var26 >> 8);
                for (int var29 = 0; var29 < var17; var29++) {
                    if (var24 == 0) {
                        var21.method552(var22, var20[0][(var29 + 1) % var17], var20[0][var29], (byte) 1, var27, var28);
                    } else {
                        var21.method552(var20[var24 - 1][var29], var20[var24 - 1][(var29 + 1) % var17], var20[var24][(var29 + 1) % var17], (byte) 1, var27, var28);
                        var21.method552(var20[var24 - 1][var29], var20[var24][(var29 + 1) % var17], var20[var24][var29], (byte) 1, var27, var28);
                    }
                }
            }
            var16 = var21.method560(64, 768, -50, -10, -50);
            class213.field3591.method1730(var16, var14, (byte) 65);
        }
        int var36 = arg3 * 64 - 1;
        int var37 = -var36;
        int var38 = var36;
        int var39 = -var36;
        int var40 = var36;
        int var41 = arg11.method270();
        if (arg2) {
            if (arg12 > 640 && arg12 < 1408) {
                var40 = var36 + 128;
            }
            if (arg12 > 128 && arg12 < 896) {
                var37 -= 128;
            }
            if (arg12 > 1664 || arg12 < 384) {
                var39 -= 128;
            }
            if (arg12 > 1152 && arg12 < 1920) {
                var38 = var36 + 128;
            }
        }
        int var42 = arg11.method275();
        if (var37 > var41) {
            var41 = var37;
        }
        if (var42 > var38) {
            var42 = var38;
        }
        int var43 = arg11.method284();
        int var44 = arg11.method282();
        if (arg5) {
            field2447 = null;
        }
        if (var44 > var40) {
            var44 = var40;
        }
        if (var39 > var43) {
            var43 = var39;
        }
        class241 var45 = null;
        if (arg8 != null) {
            int var46 = arg8.field910[arg7];
            var45 = class118.method742(37, var46 >> 16);
            arg7 = var46 & 0xFFFF;
        }
        class48 var47;
        if (var45 == null) {
            var47 = var16.method273(true, true);
            var47.method286((var42 - var41) / 2, 128, (var44 - var43) / 2);
            var47.method277((var41 + var42) / 2, 0, (var43 + var44) / 2);
        } else {
            var47 = var16.method273(!var45.method1605(arg7, 125), true);
            var47.method286((var42 - var41) / 2, 128, (var44 - var43) / 2);
            var47.method277((var41 + var42) / 2, 0, (var43 + var44) / 2);
            var47.method283(var45, arg7);
        }
        if (arg12 != 0) {
            var47.method274(arg12);
        }
        class55 var48 = (class55) var47;
        if (class193.method1227(arg10 + var41, true, class64.field1171, arg4 + var43) != arg9 || arg9 != class193.method1227(arg10 + var42, true, class64.field1171, arg4 + var44)) {
            for (int var49 = 0; var49 < var48.field962; var49++) {
                var48.field961[var49] += class193.method1227(var48.field977[var49] + arg10, !arg5, class64.field1171, var48.field976[var49] + arg4) - arg9;
            }
            var48.field952 = false;
        }
        return var47;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
    public static final void method900(byte arg0) {
        field2442++;
        if (!class57.field1050) {
            return;
        }
        class105 var1 = class255.method1738(class143.field2452, (byte) -63, class147.field2558);
        if (arg0 > -15) {
            return;
        }
        if (var1 != null && var1.field1934 != null) {
            class34 var2 = new class34();
            var2.field568 = var1.field1934;
            var2.field583 = var1;
            class218.method1377(var2, false);
        }
        class57.field1050 = false;
        class198.method1268(78, var1);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public static void method901(int arg0) {
        field2447 = null;
        field2451 = null;
        field2448 = null;
        field2450 = null;
        field2444 = null;
        if (arg0 != 4271) {
            field2451 = null;
        }
        field2446 = null;
        field2441 = null;
    }
}
