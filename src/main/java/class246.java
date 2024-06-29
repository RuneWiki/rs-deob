import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public abstract class class246 {

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public int field3825;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public int field3826;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public int field3827;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public int field3828;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public int field3831;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public int field3832;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1851(int arg0) {
        field3829++;
        class121.field1882++;
        class99.field1491.method1628((byte) -124, 255);
        if (arg0 != 20) {
            method1852(87, false);
        }
        class99.field1491.method273(0, 0);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZ)V", line = 23)
    public static final void method1852(int arg0, boolean arg1) {
        field3834++;
        class102.method886(true);
        if (class295.field4578 != 30 && class295.field4578 != 25) {
            return;
        }
        class172.field2733++;
        if (arg0 != 3) {
            field3833 = 24;
        }
        if (class172.field2733 < 50 && !arg1) {
            return;
        }
        class172.field2733 = 0;
        if (!class287.field4452 && class188.field2950 != null) {
            class187.field2938++;
            class99.field1491.method1628((byte) -54, 5);
            try {
                class188.field2950.method2426(0, arg0 ^ 0xFFFF9157, class99.field1491.field448, class99.field1491.field397);
                class99.field1491.field397 = 0;
            } catch (IOException var3) {
                class287.field4452 = true;
            }
        }
        class102.method886(true);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZI)Z", line = 74)
    public static final boolean method1853(boolean arg0, int arg1) {
        byte var2 = 0;
        byte var3 = 0;
        field3824++;
        if (class217.field3388 == null) {
            if (class240.field3737 || class248.field3851 == null) {
                class217.field3388 = new class361(512, 512);
            } else {
                class217.field3388 = (class361) class248.field3851;
            }
            int[] var4 = class217.field3388.field5720;
            int var5 = var4.length;
            for (int var6 = 0; var6 < var5; var6++) {
                var4[var6] = 1;
            }
            for (int var7 = var2 + 1; var7 < 103 - var2; var7++) {
                int var8 = ((var2 + 103 - var7) * 4 * 512) + 24628;
                for (int var9 = var3 + 1; var9 < (104 - var3 - 1); var9++) {
                    if ((class146.field2386[arg1][var9][var7] & 0x18) == 0) {
                        class217.method1623(var4, var8, 512, arg1, var9, var7);
                    }
                    if (arg1 < 3 && (class146.field2386[arg1 + 1][var9][var7] & 0x8) != 0) {
                        class217.method1623(var4, var8, 512, arg1 + 1, var9, var7);
                    }
                    var8 += 4;
                }
            }
            class254.field3913 = 0;
            for (int var10 = 0; var10 < 104; var10++) {
                for (int var11 = 0; var11 < 104; var11++) {
                    long var12 = class41.method427(arg1, var3 + var10, var2 + var11);
                    if (var12 == 0L) {
                        var12 = class209.method1553(arg1, var3 + var10, var2 + var11);
                    }
                    if (var12 == 0L) {
                        var12 = class280.method2045(arg1, var3 + var10, var11 - -var2);
                    }
                    if (var12 == 0L) {
                        var12 = class252.method1873(arg1, var3 + var10, var2 + var11);
                    }
                    if (var12 != 0L) {
                        class212 var14 = class43.method437(81, (int) (var12 >>> 32) & Integer.MAX_VALUE);
                        if (!var14.field3269 || class42.field668) {
                            int var15 = var14.field3336;
                            if (var14.field3289 != null) {
                                for (int var16 = 0; var16 < var14.field3289.length; var16++) {
                                    if (var14.field3289[var16] != -1) {
                                        class212 var17 = class43.method437(26, var14.field3289[var16]);
                                        if (var17.field3336 >= 0) {
                                            var15 = var17.field3336;
                                        }
                                    }
                                }
                            }
                            if (var15 >= 0) {
                                class181 var18 = class334.method2351(var15, (byte) -74);
                                boolean var19 = false;
                                int var20 = var2 + var11;
                                if (var18 != null && var18.field2859) {
                                    var19 = true;
                                }
                                int var21 = var3 + var10;
                                if (var19) {
                                    int[][] var22 = class57.field905[arg1].field4520;
                                    for (int var23 = 0; var23 < 10; var23++) {
                                        int var24 = (int) (Math.random() * 4.0D);
                                        if (var24 == 0 && var21 > 0 && var21 > (var10 - 3) && (var22[var21 - 1][var20] & 0x2C0108) == 0) {
                                            var21--;
                                        }
                                        if (var24 == 1 && var21 < 103 && var10 + 3 > var21 && (var22[var21 + 1][var20] & 0x2C0180) == 0) {
                                            var21++;
                                        }
                                        if (var24 == 2 && var20 > 0 && var20 > var11 - 3 && (var22[var21][var20 - 1] & 0x2C0102) == 0) {
                                            var20--;
                                        }
                                        if (var24 == 3 && var20 < 103 && var11 + 3 > var20 && (var22[var21][var20 + 1] & 0x2C0120) == 0) {
                                            var20++;
                                        }
                                    }
                                }
                                class324.field4989[class254.field3913] = var14.field3334;
                                class283.field4378[class254.field3913] = var21 - var3;
                                class339.field5218[class254.field3913] = var20 - var2;
                                class254.field3913++;
                            }
                        }
                    }
                }
            }
        }
        class217.field3388.method2532();
        if (!arg0) {
            return false;
        }
        int var25 = (int) (Math.random() * 20.0D) + 228 << 16;
        int var26 = (238 - (10 - ((int) (Math.random() * 20.0D))) << 8) + (((int) (Math.random() * 20.0D) + 228 << 16) + (int) (Math.random() * 20.0D) + 238 - 10);
        for (int var27 = 1; var27 < 103; var27++) {
            for (int var28 = 1; var28 < 103; var28++) {
                if ((class146.field2386[arg1][var3 + var28][var27 + var2] & 0x18) == 0 && !class166.method1326(var25, var26, var2, var27, var3, var28, -21957, arg1)) {
                    if (class240.field3737) {
                        class60.field928 = null;
                    } else {
                        class42.field665.method2190(1);
                    }
                    return false;
                }
                if (arg1 < 3 && (class146.field2386[arg1 + 1][var3 + var28][var2 + var27] & 0x8) != 0 && !class166.method1326(var25, var26, var2, var27, var3, var28, -21957, arg1 + 1)) {
                    if (class240.field3737) {
                        class60.field928 = null;
                    } else {
                        class42.field665.method2190(1);
                    }
                    return false;
                }
            }
        }
        if (class240.field3737) {
            int[] var29 = class217.field3388.field5720;
            int var30 = var29.length;
            for (int var31 = 0; var31 < var30; var31++) {
                if (var29[var31] == 0) {
                    var29[var31] = 1;
                }
            }
            class248.field3851 = new class2(class217.field3388);
        } else {
            class248.field3851 = class217.field3388;
        }
        if (class240.field3737) {
            class60.field928 = null;
        } else {
            class42.field665.method2190(1);
        }
        class217.field3388 = null;
        return true;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)V")
    public abstract void method714(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)V")
    public abstract void method711(int arg0, int arg1);
}
