import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class218 {

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "Z")
    public static boolean field3365 = true;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "F")
    public static float field3370;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "Lhc;")
    public static class235 field3371;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "Lhc;")
    public static class235 field3372;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "[Lrl;")
    public static class163[] field3366;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIIZIIZIII)V")
    public static final void method1462(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        field3363++;
        int var12 = arg11 - arg4;
        int var13 = arg6 - arg2;
        int var14 = -1;
        if (arg8) {
            return;
        }
        if (class71.field1140 > 0) {
            if (class6.field135 <= 10) {
                var14 = class6.field135 * 5;
            } else {
                var14 = 100 - (class6.field135 * 5);
            }
        }
        int var15 = 983040 / arg7;
        int var16 = 983040 / arg3;
        for (int var17 = -var16; var17 < var13 + var16; var17++) {
            int var19 = arg3 * var17 + arg1 >> 16;
            int var20 = (var17 + 1) * arg3 + arg1 >> 16;
            int var21 = var20 - var19;
            if (var21 > 0) {
                int var10000 = arg0 + var20;
                int var23 = var17 + arg2 >> 6;
                int var24 = arg0 + var19;
                if (var23 >= 0 && var23 <= (class187.field2899.length - 1)) {
                    int[][] var25 = class187.field2899[var23];
                    for (int var26 = -var15; var26 < var12 + var15; var26++) {
                        int var27 = arg7 * var26 + arg9 >> 16;
                        int var28 = (var26 + 1) * arg7 + arg9 >> 16;
                        int var29 = var28 - var27;
                        if (var29 > 0) {
                            int var30 = arg10 + var27;
                            int var31 = arg4 + var26 >> 6;
                            var10000 = arg10 + var28;
                            if (var31 >= 0 && var31 <= (var25.length - 1) && var25[var31] != null) {
                                int var33 = (arg4 + var26 & 0x3F << 6) + (arg2 + var17 & 0x3F);
                                int var34 = var25[var31][var33];
                                if (var34 != 0) {
                                    class193 var35 = class69.method501(0, var34 - 1);
                                    if (!class152.field2378[var35.field3040]) {
                                        if (var14 != -1 && class19.field280 == var35.field3040) {
                                            class297 var36 = new class297();
                                            var36.field4698 = var35.field3040;
                                            var36.field4694 = var24;
                                            var36.field4696 = var30;
                                            class13.field213.method1219(arg8, var36);
                                        } else {
                                            class251.field4047[var35.field3040].method856(var24 - 7, var30 + -7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class297 var18 = (class297) class13.field213.method1221(116); var18 != null; var18 = (class297) class13.field213.method1227(-10626)) {
            class211.method1422(var18.field4694, var18.field4696, 15, 16776960, var14);
            class211.method1422(var18.field4694, var18.field4696, 13, 16776960, var14);
            class211.method1422(var18.field4694, var18.field4696, 11, 16776960, var14);
            class211.method1422(var18.field4694, var18.field4696, 9, 16776960, var14);
            class251.field4047[var18.field4698].method856(var18.field4694 - 7, var18.field4696 + -7);
        }
        class13.field213.method1226(1);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIII)V")
    public static final void method1463(int arg0, int arg1, int arg2, int arg3) {
        field3364++;
        if (arg0 != 1469421928) {
            method1466(18, true);
        }
        int var4 = class294.field4633 * arg1 >> 8;
        if (var4 != 0 && arg2 != -1) {
            class132.method916(-6178, class240.field3901, arg2, 0, false, var4);
            class148.field2341 = true;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
    public static final void method1464(int arg0) {
        field3368++;
        while (class236.field3814.method539((byte) 79, class53.field804) >= 27) {
            int var1 = class236.field3814.method535(15, 104);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class255.field4082[var1] == null) {
                class255.field4082[var1] = new class45();
                var2 = true;
            }
            class45 var3 = class255.field4082[var1];
            class284.field4506[class70.field1119++] = var1;
            var3.field2279 = class192.field2978;
            if (var3.field645 != null && var3.field645.method458(-12)) {
                class161.method1098(12537, var3);
            }
            var3.method327(-84, class62.method469(class236.field3814.method535(14, 104), 85));
            int var4 = class236.field3814.method535(5, 104);
            int var5 = class236.field3814.method535(1, 104);
            if (var5 == 1) {
                class244.field3972[class141.field2155++] = var1;
            }
            int var6 = class236.field3814.method535(1, 104);
            int var7 = class236.field3814.method535(5, 104);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = class148.field2335[class236.field3814.method535(3, 104)];
            if (var2) {
                var3.field2257 = var3.field2275 = var8;
            }
            if (var4 > 15) {
                var4 -= 32;
            }
            var3.method967(var3.field645.field977, (byte) -30);
            var3.field2260 = var3.field645.field1036;
            var3.field2270 = var3.field645.field1012;
            if (var3.field2260 == 0) {
                var3.field2275 = 0;
            }
            var3.method978(var3.method971(65535), class283.field4473.field2268[0] + var7, class283.field4473.field2271[0] + var4, 2, var6 == 1);
            if (var3.field645.method458(78)) {
                class3.method13(var3.field2271[0], class240.field3892, 0, var3, (class193) null, var3.field2268[0], (class236) null, 120);
            }
        }
        int var9 = 115 / ((arg0 + 16) / 46);
        class236.field3814.method538(9721);
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V")
    public static void method1465(int arg0) {
        field3366 = null;
        field3372 = null;
        field3371 = null;
        if (arg0 != 24365) {
            method1465(51);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IZ)Lnc;")
    public static final class87 method1466(int arg0, boolean arg1) {
        field3369++;
        class87 var2 = (class87) class258.field4122.method1887(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1) {
            field3366 = null;
        }
        byte[] var3 = class138.field2118.method1590(arg0, (byte) -25, 4);
        class87 var4 = new class87();
        if (var3 != null) {
            var4.method621(arg1, arg0, new class88(var3));
        }
        class258.field4122.method1886(-92, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZC)C")
    public static final char method1467(boolean arg0, char arg1) {
        if (!arg0) {
            field3370 = -0.9229729F;
        }
        field3367++;
        return arg1 == 'µ' || arg1 == 'ƒ' ? arg1 : Character.toTitleCase(arg1);
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)Lg;")
    public static final class284 method1468(int arg0) {
        if (arg0 == 0) {
            field3373++;
            return class185.field2865.length > class52.field750 ? class185.field2865[class52.field750++] : null;
        } else {
            return null;
        }
    }
}
