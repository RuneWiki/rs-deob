import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class158 {

    @OriginalMember(owner = "client!re", name = "b", descriptor = "Lgg;")
    public static class63 field3269 = class116.method911(43, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!re", name = "i", descriptor = "Lgg;")
    public static class63 field3276 = class116.method911(43, "<col=ffff00>");

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field3274 = 0;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "Lgg;")
    public static class63 field3277 = class116.method911(43, "::errortest");

    @OriginalMember(owner = "client!re", name = "m", descriptor = "I")
    public static int field3280 = 0;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "J")
    public static long field3279;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "Lfd;")
    public static class52 field3275;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "[I")
    public static int[] field3271;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lff;IIII)V")
    public static final void method1091(class54 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 < 121) {
            method1093(92);
        }
        class198.method1294((byte) -30);
        field3278++;
        class178.method1187(arg1, arg2, arg0.field1302 + arg1, arg0.field1435 + arg2);
        if (class19.field442 == 2 || class19.field442 == 5) {
            class178.method1182(arg1, arg2, 0, arg0.field1413, arg0.field1310);
        } else {
            int var5 = class68.field1710 + class121.field2690 & 0x7FF;
            int var6 = class3.field72.field1141 / 32 + 48;
            int var7 = 464 - class3.field72.field1144 / 32;
            class101.field2369.method1310(arg1, arg2, arg0.field1302, arg0.field1435, var6, var7, var5, class199.field3977 + 256, arg0.field1413, arg0.field1310);
            for (int var8 = 0; var8 < class14.field320; var8++) {
                int var38 = class56.field1487[var8] * 4 + 2 - class3.field72.field1144 / 32;
                int var39 = class163.field3364[var8] * 4 + 2 - class3.field72.field1141 / 32;
                class6.method93((byte) -54, var38, arg1, arg0, var39, arg2, class166.field3406[var8]);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var34 = 0; var34 < 104; var34++) {
                    class148 var35 = class163.field3365[class112.field2528][var9][var34];
                    if (var35 != null) {
                        int var36 = var9 * 4 + 2 - class3.field72.field1141 / 32;
                        int var37 = var34 * 4 + 2 - class3.field72.field1144 / 32;
                        class6.method93((byte) -54, var37, arg1, arg0, var36, arg2, class138.field2969[0]);
                    }
                }
            }
            for (int var10 = 0; var10 < class29.field695; var10++) {
                class6 var30 = class55.field1458[class142.field3045[var10]];
                if (var30 != null && var30.method97(4365)) {
                    class28 var31 = var30.field150;
                    if (var31 != null && var31.field623 != null) {
                        var31 = var31.method281(true);
                    }
                    if (var31 != null && var31.field645 && var31.field667) {
                        int var32 = var30.field1144 / 32 - class3.field72.field1144 / 32;
                        int var33 = var30.field1141 / 32 - class3.field72.field1141 / 32;
                        class6.method93((byte) -54, var32, arg1, arg0, var33, arg2, class138.field2969[1]);
                    }
                }
            }
            for (int var11 = 0; var11 < class34.field813; var11++) {
                class62 var22 = class33.field806[class177.field3641[var11]];
                if (var22 != null && var22.method97(4365)) {
                    int var23 = var22.field1141 / 32 - class3.field72.field1141 / 32;
                    int var24 = var22.field1144 / 32 - class3.field72.field1144 / 32;
                    boolean var25 = false;
                    long var26 = var22.field1552.method590(-98);
                    for (int var28 = 0; var28 < class37.field868; var28++) {
                        if (class80.field1938[var28] == var26 && class123.field2713[var28] != 0) {
                            var25 = true;
                            break;
                        }
                    }
                    boolean var29 = false;
                    if (class3.field72.field1555 != 0 && var22.field1555 != 0 && class3.field72.field1555 == var22.field1555) {
                        var29 = true;
                    }
                    if (var25) {
                        class6.method93((byte) -54, var24, arg1, arg0, var23, arg2, class138.field2969[3]);
                    } else if (var29) {
                        class6.method93((byte) -54, var24, arg1, arg0, var23, arg2, class138.field2969[4]);
                    } else {
                        class6.method93((byte) -54, var24, arg1, arg0, var23, arg2, class138.field2969[2]);
                    }
                }
            }
            if (class109.field2464 != 0 && class173.field3571 % 20 < 10) {
                if (class109.field2464 == 1 && class187.field3772 >= 0 && class55.field1458.length > class187.field3772) {
                    class6 var12 = class55.field1458[class187.field3772];
                    if (var12 != null) {
                        int var13 = var12.field1144 / 32 - class3.field72.field1144 / 32;
                        int var14 = var12.field1141 / 32 - class3.field72.field1141 / 32;
                        class5.method87(arg2, var13, arg1, arg0, class168.field3481[1], -70, var14);
                    }
                }
                if (class109.field2464 == 2) {
                    int var15 = (class21.field492 - class38.field921) * 4 + 2 - class3.field72.field1144 / 32;
                    int var16 = (class138.field2952 - class3.field110) * 4 + 2 - class3.field72.field1141 / 32;
                    class5.method87(arg2, var15, arg1, arg0, class168.field3481[1], -100, var16);
                }
                if (class109.field2464 == 10 && class168.field3466 >= 0 && class33.field806.length > class168.field3466) {
                    class62 var17 = class33.field806[class168.field3466];
                    if (var17 != null) {
                        int var18 = var17.field1141 / 32 - class3.field72.field1141 / 32;
                        int var19 = var17.field1144 / 32 - class3.field72.field1144 / 32;
                        class5.method87(arg2, var19, arg1, arg0, class168.field3481[1], -90, var18);
                    }
                }
            }
            if (class106.field2418 != 0) {
                int var20 = class106.field2418 * 4 + 2 - class3.field72.field1141 / 32;
                int var21 = class118.field2632 * 4 + 2 - class3.field72.field1144 / 32;
                class6.method93((byte) -54, var21, arg1, arg0, var20, arg2, class168.field3481[0]);
            }
            class178.method1191(arg0.field1302 / 2 + arg1 - 1, arg0.field1435 / 2 + arg2 + -1, 3, 3, 16777215);
        }
        class60.field1523[arg3] = true;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IBII)I")
    public static final int method1092(int arg0, byte arg1, int arg2, int arg3) {
        field3272++;
        if ((class49.field1194[arg2][arg3][arg0] & 0x8) != 0) {
            return 0;
        } else if (arg2 <= 0 || (class49.field1194[1][arg3][arg0] & 0x2) == 0) {
            if (arg1 != -7) {
                method1092(10, (byte) 31, -93, -110);
            }
            return arg2;
        } else {
            return arg2 - 1;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public static void method1093(int arg0) {
        field3275 = null;
        if (arg0 != 0) {
            field3275 = null;
        }
        field3277 = null;
        field3269 = null;
        field3271 = null;
        field3276 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BLrc;)V")
    public static final void method1094(byte arg0, class156 arg1) {
        short var2 = 256;
        field3268++;
        for (int var3 = 0; var3 < class19.field452.length; var3++) {
            class19.field452[var3] = 0;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) (Math.random() * 128.0D * (double) var2);
            class19.field452[var16] = (int) (Math.random() * 256.0D);
        }
        if (arg0 < 50) {
            field3276 = null;
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var2 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class182.field3700[var15] = (class19.field452[var15 + 1] + class19.field452[var15 - 128] + class19.field452[var15 - 1] + class19.field452[var15 + 128]) / 4;
                }
            }
            int[] var13 = class19.field452;
            class19.field452 = class182.field3700;
            class182.field3700 = var13;
        }
        if (arg1 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg1.field3255; var7++) {
            for (int var8 = 0; var8 < arg1.field3254; var8++) {
                if (arg1.field3257[var6++] != 0) {
                    int var9 = var7 + arg1.field3260 + 16;
                    int var10 = var8 + arg1.field3259 + 16;
                    int var11 = (var9 << 7) + var10;
                    class19.field452[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZIIB)Lgg;")
    public static final class63 method1095(boolean arg0, int arg1, int arg2, byte arg3) {
        field3273++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        int var4 = 1;
        int var5 = arg2 / arg1;
        while (var5 != 0) {
            var5 /= arg1;
            var4++;
        }
        if (arg3 <= 62) {
            return null;
        }
        int var6 = var4;
        if (arg2 < 0 || arg0) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg2 < 0) {
            var7[0] = 45;
        } else if (arg0) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var10 = arg2 % arg1;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            arg2 /= arg1;
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class63 var9 = new class63();
        var9.field1628 = var6;
        var9.field1602 = var7;
        return var9;
    }
}
