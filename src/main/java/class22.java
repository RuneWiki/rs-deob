import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class22 {

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "Lkk;")
    public static class254 field296 = null;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "Lib;")
    private class162 field294;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "Ljg;")
    private class177 field280;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "Lfa;")
    public static class273 field295;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "[I")
    public static int[] field293;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "[[[B")
    public static byte[][][] field282;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)V")
    public static final void method126(int arg0, int arg1) {
        class36 var2 = class161.method1067(9, arg0, (byte) 81);
        field286++;
        if (arg1 == -765) {
            var2.method220(arg1 + 886);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZZZIIII)V")
    public static final void method127(boolean arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field290++;
        if (arg5 == 3) {
            method127(true, true, true, -1, -1, class258.field4245, arg6);
            return;
        }
        Container var7;
        if (class180.field2797 != null) {
            var7 = class180.field2797;
        } else if (class224.field3565 == null) {
            var7 = class259.field4254.field4211;
        } else {
            var7 = class224.field3565;
        }
        class143.field2233 = var7.getSize().width;
        class131.field2013 = var7.getSize().height;
        if (class224.field3565 == var7) {
            Insets var8 = class224.field3565.getInsets();
            class143.field2233 -= var8.right + var8.left;
            class131.field2013 -= var8.top + var8.bottom;
        }
        if (arg5 < 2) {
            class169.field2644 = 765;
            class187.field2896 = (class143.field2233 - 765) / 2;
            class79.field1254 = 503;
            class35.field438 = 0;
        } else {
            class35.field438 = 0;
            class187.field2896 = 0;
            class169.field2644 = class143.field2233;
            class79.field1254 = class131.field2013;
        }
        if (arg0) {
            class242.method1699(class113.field1701, -1);
            class230.method1620(class113.field1701, 0);
            if (class254.field4069 != null) {
                class254.field4069.method232(-106, class113.field1701);
            }
            class145.field2295.method619(1);
            class280.method1949(!arg2, class113.field1701);
            class98.method638(class113.field1701, -126);
            if (class254.field4069 != null) {
                class254.field4069.method227(-64, class113.field1701);
            }
        } else {
            class113.field1701.setSize(class169.field2644, class79.field1254);
            if (class224.field3565 == var7) {
                Insets var9 = class224.field3565.getInsets();
                class113.field1701.setLocation(class187.field2896 + var9.left, var9.top - -class35.field438);
            } else {
                class113.field1701.setLocation(class187.field2896, class35.field438);
            }
        }
        if (arg5 > 0) {
            method127(true, true, true, -1, -1, 0, arg6);
            return;
        }
        class90.field1386 = !class165.method1108(0);
        class77.method517(class169.field2644, class79.field1254);
        if (class160.field2523 != -1) {
            class219.method1533(true, -54);
        }
        if (class103.field1551 != null && (class115.field1733 == 30 || class115.field1733 == 25)) {
            class208.method1481(243);
        }
        for (int var10 = 0; var10 < 100; var10++) {
            class283.field4731[var10] = true;
        }
        class120.field1850 = arg2;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(III)V")
    public static final void method128(int arg0, int arg1, int arg2) {
        field292++;
        if (arg2 != 29127) {
            field293 = null;
        }
        class270 var3 = class49.method304(arg2 ^ 0x7182, arg1);
        int var4 = var3.field4425;
        int var5 = var3.field4424;
        int var6 = var3.field4427;
        int var7 = class313.field5047[var5 - var6];
        if (arg0 < 0 || arg0 > var7) {
            arg0 = 0;
        }
        int var8 = var7 << var6;
        class285.method2010(2, var4, class178.field2775[var4] & ~var8 | arg0 << var6 & var8);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
    public static void method129(int arg0) {
        field296 = null;
        field282 = null;
        if (arg0 != -1) {
            field293 = null;
        }
        field293 = null;
        field295 = null;
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)Lib;")
    public final class162 method130(int arg0) {
        field285++;
        if (arg0 != 29147) {
            method131(82L, (byte) 12);
        }
        class162 var2 = this.field280.field2759.field2551;
        if (this.field280.field2759 == var2) {
            this.field294 = null;
            return null;
        } else {
            this.field294 = var2.field2551;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(JB)V")
    public static final void method131(long arg0, byte arg1) {
        field291++;
        try {
            Thread.sleep(arg0);
            if (arg1 != 124) {
                method126(-87, -18);
            }
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILjg;)V")
    public final void method132(int arg0, class177 arg1) {
        field281++;
        int var3 = 60 % ((-arg0 - 20) / 44);
        this.field280 = arg1;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)Lib;")
    public final class162 method133(byte arg0) {
        class162 var2 = this.field294;
        field289++;
        if (this.field280.field2759 == var2) {
            this.field294 = null;
            return null;
        }
        this.field294 = var2.field2551;
        if (arg0 < 123) {
            this.field280 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IB)Z")
    public static final boolean method134(int arg0, byte arg1) {
        field288++;
        byte var2 = 0;
        byte var3 = 0;
        if (class150.field2339 == null) {
            if (class44.field608 == null) {
                class150.field2339 = new class38(512, 512);
            } else {
                class150.field2339 = (class38) class44.field608;
            }
            int[] var4 = class150.field2339.field488;
            int var5 = var4.length;
            for (int var6 = 0; var6 < var5; var6++) {
                var4[var6] = 1;
            }
            for (int var7 = var3 + 1; var7 < 104 - var3 - 1; var7++) {
                int var23 = (var3 + 103 - var7) * 4 * 512 + 24628;
                for (int var24 = var2 + 1; var24 < (103 - var2); var24++) {
                    if ((class128.field1972[arg0][var24][var7] & 0x18) == 0) {
                        class70.method440(var4, var23, 512, arg0, var24, var7);
                    }
                    if (arg0 < 3 && (class128.field1972[arg0 + 1][var24][var7] & 0x8) != 0) {
                        class70.method440(var4, var23, 512, arg0 + 1, var24, var7);
                    }
                    var23 += 4;
                }
            }
            class253.field4006 = 0;
            for (int var8 = 0; var8 < 104; var8++) {
                for (int var9 = 0; var9 < 104; var9++) {
                    long var10 = class9.method48(arg0, var2 + var8, var3 + var9);
                    if (var10 == 0L) {
                        var10 = class186.method1268(arg0, var8 + var2, var3 + var9);
                    }
                    if (var10 == 0L) {
                        var10 = class194.method1344(arg0, var8 + var2, var3 + var9);
                    }
                    if (var10 == 0L) {
                        var10 = class76.method498(arg0, var2 + var8, var3 + var9);
                    }
                    if (var10 != 0L) {
                        class74 var12 = class216.method1510(0, (int) (var10 >>> 32) & Integer.MAX_VALUE);
                        if (!var12.field1103 || class141.field2180) {
                            int var13 = var12.field1128;
                            if (var12.field1149 != null) {
                                for (int var14 = 0; var14 < var12.field1149.length; var14++) {
                                    if (var12.field1149[var14] != -1) {
                                        class74 var15 = class216.method1510(0, var12.field1149[var14]);
                                        if (var15.field1128 >= 0) {
                                            var13 = var15.field1128;
                                        }
                                    }
                                }
                            }
                            if (var13 >= 0) {
                                boolean var16 = false;
                                class195 var17 = class192.method1334(false, var13);
                                if (var17 != null && var17.field3090) {
                                    var16 = true;
                                }
                                int var18 = var2 + var8;
                                int var19 = var3 + var9;
                                if (var16) {
                                    int[][] var20 = class183.field2841[arg0].field2211;
                                    for (int var21 = 0; var21 < 10; var21++) {
                                        int var22 = (int) (Math.random() * 4.0D);
                                        if (var22 == 0 && var18 > 0 && var8 - 3 < var18 && (var20[var18 - 1][var19] & 0x2C0108) == 0) {
                                            var18--;
                                        }
                                        if (var22 == 1 && var18 < 103 && var8 + 3 > var18 && (var20[var18 + 1][var19] & 0x2C0180) == 0) {
                                            var18++;
                                        }
                                        if (var22 == 2 && var19 > 0 && var19 > (var9 - 3) && (var20[var18][var19 - 1] & 0x2C0102) == 0) {
                                            var19--;
                                        }
                                        if (var22 == 3 && var19 < 103 && var19 < var9 + 3 && (var20[var18][var19 + 1] & 0x2C0120) == 0) {
                                            var19++;
                                        }
                                    }
                                }
                                class150.field2338[class253.field4006] = var12.field1166;
                                class288.field4789[class253.field4006] = var18 - var2;
                                class146.field2300[class253.field4006] = var19 - var3;
                                class253.field4006++;
                            }
                        }
                    }
                }
            }
        }
        class150.field2339.method250();
        int var25 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (((int) (Math.random() * 20.0D)) + 238 - 10 << 16) + (int) (Math.random() * 20.0D) + 238 - 10;
        int var26 = (int) (Math.random() * 20.0D) + 228 << 16;
        for (int var27 = 1; var27 < 103; var27++) {
            for (int var29 = 1; var29 < 103; var29++) {
                if ((class128.field1972[arg0][var2 + var29][var3 + var27] & 0x18) == 0 && !class159.method1054(-4, var27, arg0, var2, var3, var29, var26, var25)) {
                    class301.field4942.method118(127);
                    return false;
                }
                if (arg0 < 3 && (class128.field1972[arg0 + 1][var2 + var29][var3 + var27] & 0x8) != 0 && !class159.method1054(-4, var27, arg0 + 1, var2, var3, var29, var26, var25)) {
                    class301.field4942.method118(127);
                    return false;
                }
            }
        }
        int var28 = 32 % ((1 - arg1) / 33);
        class44.field608 = class150.field2339;
        class301.field4942.method118(127);
        class150.field2339 = null;
        return true;
    }
}
