import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class188 {

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "B")
    private byte field3273;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
    public int field3270;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
    public int field3272;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public int field3257;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
    public int field3274;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "I")
    public int field3275;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "Lmh;")
    private static class128 field3263 = class22.method156(122, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "[I")
    public static int[] field3253 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "Lmh;")
    private static class128 field3256 = class22.method156(123, "Connection lost)3");

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "Lmh;")
    public static class128 field3254 = field3263;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public static int field3264 = 0;

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "Lmh;")
    public static class128 field3276 = class22.method156(124, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "Lmh;")
    public static class128 field3267 = field3256;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "Lmh;")
    public static class128 field3261 = class22.method156(127, ")3");

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "[I")
    public static int[] field3266 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "Ldj;")
    public static class314 field3258;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "Lbk;")
    public static class59 field3260;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method1259(boolean arg0) {
        field3265++;
        if (!arg0) {
            field3253 = (int[]) null;
        }
        class118.field1996.method1832((byte) 77);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILcb;)[Lrf;", line = 21)
    public static final class264[] method1260(int arg0, class270 arg1) {
        field3269++;
        if (!arg1.method1899(arg0 - 100)) {
            return new class264[0];
        }
        class23 var2 = arg1.method1901((byte) -3);
        while (var2.field560 == 0) {
            class177.method1213(0, 10L);
        }
        if (var2.field560 == 2) {
            return new class264[0];
        }
        int[] var3 = (int[]) ((int[]) var2.field562);
        class264[] var4 = new class264[var3.length >> 2];
        for (int var5 = arg0; var5 < var4.length; var5++) {
            class264 var6 = new class264();
            var4[var5] = var6;
            var6.field4572 = var3[var5 << 2];
            var6.field4585 = var3[(var5 << 2) + 1];
            var6.field4576 = var3[(var5 << 2) + 2];
            var6.field4575 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "([BB)V", line = 69)
    public static final void method1261(byte[] arg0, byte arg1) {
        field3262++;
        class194 var2 = new class194(arg0);
        var2.field3380 = arg0.length - 2;
        class75.field1405 = var2.method1308(arg1 - 128);
        class157.field2690 = new byte[class75.field1405][];
        class217.field3829 = new byte[class75.field1405][];
        class266.field4603 = new int[class75.field1405];
        class151.field2607 = new int[class75.field1405];
        class125.field2106 = new int[class75.field1405];
        class139.field2383 = new boolean[class75.field1405];
        class178.field3128 = new int[class75.field1405];
        var2.field3380 = arg0.length - ((class75.field1405 * 8) + 7);
        class72.field1327 = var2.method1308(-44);
        class132.field2294 = var2.method1308(-107);
        int var3 = (var2.method1325(7627) & 0xFF) + 1;
        for (int var4 = 0; var4 < class75.field1405; var4++) {
            class151.field2607[var4] = var2.method1308(-92);
        }
        for (int var5 = 0; var5 < class75.field1405; var5++) {
            class266.field4603[var5] = var2.method1308(-36);
        }
        for (int var6 = 0; var6 < class75.field1405; var6++) {
            class125.field2106[var6] = var2.method1308(arg1 - 152);
        }
        for (int var7 = 0; var7 < class75.field1405; var7++) {
            class178.field3128[var7] = var2.method1308(-24);
        }
        var2.field3380 = arg0.length - ((var3 - 1) * 3) - (class75.field1405 * 8) - 7;
        class205.field3614 = new int[var3];
        if (arg1 != 55) {
            method1261((byte[]) null, (byte) -22);
        }
        for (int var8 = 1; var8 < var3; var8++) {
            class205.field3614[var8] = var2.method1349((byte) 91);
            if (class205.field3614[var8] == 0) {
                class205.field3614[var8] = 1;
            }
        }
        var2.field3380 = 0;
        for (int var9 = 0; var9 < class75.field1405; var9++) {
            int var10 = class125.field2106[var9];
            int var11 = class178.field3128[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            byte[] var14 = new byte[var12];
            boolean var15 = false;
            class157.field2690[var9] = var14;
            class217.field3829[var9] = var13;
            int var16 = var2.method1325(7627);
            if ((var16 & 0x1) == 0) {
                for (int var22 = 0; var22 < var12; var22++) {
                    var14[var22] = var2.method1326((byte) 90);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var23 = 0; var23 < var12; var23++) {
                        byte var24 = var13[var23] = var2.method1326((byte) 97);
                        var15 |= var24 != -1;
                    }
                }
            } else {
                int var17 = 0;
                label91: while (true) {
                    if (var10 <= var17) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var19 = 0;
                        while (true) {
                            if (var10 <= var19) {
                                break label91;
                            }
                            for (int var20 = 0; var20 < var11; var20++) {
                                byte var21 = var13[var19 + (var10 * var20)] = var2.method1326((byte) 101);
                                var15 |= var21 != -1;
                            }
                            var19++;
                        }
                    }
                    for (int var18 = 0; var18 < var11; var18++) {
                        var14[var10 * var18 + var17] = var2.method1326((byte) 114);
                    }
                    var17++;
                }
            }
            class139.field2383[var9] = var15;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)I", line = 243)
    public final int method1262(byte arg0) {
        field3277++;
        return arg0 == -106 ? this.field3273 & 0x7 : 81;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V", line = 262)
    public static void method1263(int arg0) {
        field3253 = null;
        field3263 = null;
        field3266 = null;
        field3258 = null;
        field3256 = null;
        if (arg0 != 0) {
            return;
        }
        field3254 = null;
        field3267 = null;
        field3261 = null;
        field3260 = null;
        field3276 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIIIII)V", line = 287)
    public static final void method1264(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3271++;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg7 - arg5;
        int var11 = arg1 - arg5;
        int var12 = arg7 * arg7;
        int var13 = arg1;
        int var14 = arg1 * arg1;
        int var15 = var10 * var10;
        int var16 = var11 * var11;
        int var17 = var12 << 1;
        int var18 = var14 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = var11 << 1;
        int var22 = (1 - var21) * var15 + var19;
        int var23 = arg1 << 1;
        int var24 = var14 - ((var23 - 1) * var17);
        int var25 = (1 - var23) * var12 + var18;
        int var26 = var12 << 2;
        int var27 = var16 - ((var21 - 1) * var20);
        int var28 = var15 << 2;
        int var29 = var14 << 2;
        int var30 = var16 << 2;
        int var31 = var18 * 3;
        int var32 = (var23 - 3) * var17;
        if (arg6 >= -8) {
            method1265(false, (byte) -61, 11, 66, 52, true, 93, false);
        }
        int var33 = (var21 - 3) * var20;
        int var34 = var19 * 3;
        int var35 = (arg1 - 1) * var26;
        int var36 = var29;
        int var37 = var30;
        int var38 = (var11 - 1) * var28;
        int[] var39 = class219.field3850[arg2];
        class314.method2138(arg4 - var10, true, arg3, var39, arg4 - arg7);
        class314.method2138(arg4 + var10, true, arg0, var39, arg4 - var10);
        class314.method2138(arg4 + arg7, true, arg3, var39, arg4 + var10);
        while (var13 > 0) {
            if (var25 < 0) {
                while (var25 < 0) {
                    var8++;
                    var25 += var31;
                    var24 += var36;
                    var31 += var29;
                    var36 += var29;
                }
            }
            boolean var40 = var13 <= var11;
            if (var40) {
                if (var22 < 0) {
                    while (var22 < 0) {
                        var22 += var34;
                        var27 += var37;
                        var37 += var30;
                        var9++;
                        var34 += var30;
                    }
                }
                if (var27 < 0) {
                    var27 += var37;
                    var9++;
                    var37 += var30;
                    var22 += var34;
                    var34 += var30;
                }
                var27 += -var33;
                var33 -= var28;
                var22 += -var38;
                var38 -= var28;
            }
            if (var24 < 0) {
                var8++;
                var24 += var36;
                var25 += var31;
                var31 += var29;
                var36 += var29;
            }
            int var41 = arg4 + var8;
            var24 += -var32;
            var13--;
            var32 -= var26;
            int var42 = arg4 - var8;
            int var43 = arg2 + var13;
            var25 += -var35;
            int var44 = arg2 - var13;
            if (var40) {
                int var45 = arg4 + var9;
                int var46 = arg4 - var9;
                class314.method2138(var46, true, arg3, class219.field3850[var44], var42);
                class314.method2138(var45, true, arg0, class219.field3850[var44], var46);
                class314.method2138(var41, true, arg3, class219.field3850[var44], var45);
                class314.method2138(var46, true, arg3, class219.field3850[var43], var42);
                class314.method2138(var45, true, arg0, class219.field3850[var43], var46);
                class314.method2138(var41, true, arg3, class219.field3850[var43], var45);
            } else {
                class314.method2138(var41, true, arg3, class219.field3850[var44], var42);
                class314.method2138(var41, true, arg3, class219.field3850[var43], var42);
            }
            var35 -= var26;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZBIIIZIZ)Lfb;", line = 472)
    public static final class55 method1265(boolean arg0, byte arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, boolean arg7) {
        field3255++;
        class200 var8 = class180.method1226(false, arg6);
        if (arg3 > 1 && var8.field3494 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (var8.field3493[var10] <= arg3 && var8.field3493[var10] != 0) {
                    var9 = var8.field3494[var10];
                }
            }
            if (var9 != -1) {
                var8 = class180.method1226(false, var9);
            }
        }
        class29 var11 = var8.method1392(-115);
        if (var11 == null) {
            return null;
        }
        class231 var12 = null;
        if (var8.field3537 != -1) {
            var12 = (class231) method1265(true, (byte) 82, 0, 10, 1, false, var8.field3528, true);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field3512 != -1) {
            var12 = (class231) method1265(false, (byte) -53, arg2, arg3, arg4, false, var8.field3552, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = class213.field3769;
        int var14 = class213.field3772;
        int var15 = class213.field3771;
        int[] var16 = new int[4];
        class213.method1483(var16);
        class231 var17 = new class231(36, 32);
        class213.method1460(var17.field4003, 36, 32);
        class141.method943();
        class141.method924(16, 16);
        class141.field2418 = false;
        int var18 = var8.field3554;
        if (arg0) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg4 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = 54 / ((20 - arg1) / 59);
        int var20 = class141.field2411[var8.field3519] * var18 >> 16;
        int var21 = class141.field2424[var8.field3519] * var18 >> 16;
        var11.method199(0, var8.field3530, var8.field3547, var8.field3519, var8.field3532, var21 + var8.field3503 - (var11.method204() / 2), var20 - -var8.field3503);
        if (arg4 >= 1) {
            var17.method1588(1);
            if (arg4 >= 2) {
                var17.method1588(16777215);
            }
            class213.method1460(var17.field4003, 36, 32);
        }
        if (arg2 != 0) {
            var17.method1581(arg2);
        }
        if (var8.field3537 != -1) {
            var12.method273(0, 0);
        } else if (var8.field3512 != -1) {
            class213.method1460(var12.field4003, 36, 32);
            var17.method273(0, 0);
            var17 = var12;
        }
        if (arg5 && (var8.field3497 == 1 || arg3 != 1) && arg3 != -1) {
            class303.field5135.method2067(class103.method634(arg3, (byte) 1), 0, 9, 16776960, 1);
        }
        class213.method1460(var13, var14, var15);
        class213.method1462(var16);
        class141.method943();
        class141.field2418 = true;
        return class247.field4247 && !arg7 ? new class40(var17) : var17;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)I", line = 612)
    public final int method1266(byte arg0) {
        if (arg0 < 84) {
            this.field3257 = 67;
        }
        field3259++;
        return (this.field3273 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V", line = 624)
    public class188() {
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lbg;)V", line = 626)
    public class188(class194 arg0) {
        this.field3273 = arg0.method1326((byte) 124);
        this.field3270 = arg0.method1308(-116);
        this.field3272 = arg0.method1350(false);
        this.field3257 = arg0.method1350(false);
        this.field3274 = arg0.method1350(false);
        this.field3275 = arg0.method1350(false);
    }
}
