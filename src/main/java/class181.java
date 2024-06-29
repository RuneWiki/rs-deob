import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class181 extends class158 {

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "Ldc;")
    public static class37 field3370 = class185.method1233((byte) 86, "<br>(X");

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "Z")
    public static boolean field3371 = false;

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "Ldc;")
    public static class37 field3373 = class185.method1233((byte) 86, "blinken1:");

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "[Ljc;")
    public static class100[] field3374;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public static void method1201(int arg0) {
        field3374 = null;
        field3373 = null;
        if (arg0 != 29277) {
            method1204(null, (byte) 112);
        }
        field3370 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)V")
    public static final void method1202(boolean arg0) {
        class180.field3358 = false;
        if (arg0) {
            field3372++;
            class16.field259 = false;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIII)V")
    public static final void method1203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3368++;
        if (arg5 != 3) {
            method1202(false);
        }
        long var6 = client.method276(arg4, arg0, arg3);
        if (var6 != 0L) {
            int var8 = (int) var6 >> 20 & 0x3;
            int var9 = (int) var6 >> 14 & 0x1F;
            int var10 = arg2;
            if (var6 > 0L) {
                var10 = arg1;
            }
            int[] var11 = class48.field955;
            int var12 = Integer.MAX_VALUE & (int) (var6 >>> 32);
            int var13 = (103 - arg3) * 4 * 512 + arg0 * 4 + 24624;
            class30 var14 = class73.method519(var12, -21035);
            if (var14.field552 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var11[var13] = var10;
                        var11[var13 + 512] = var10;
                        var11[var13 + 1024] = var10;
                        var11[var13 + 1536] = var10;
                    } else if (var8 == 1) {
                        var11[var13] = var10;
                        var11[var13 + 1] = var10;
                        var11[var13 + 2] = var10;
                        var11[var13 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var13 + 3] = var10;
                        var11[var13 + 3 + 512] = var10;
                        var11[var13 + 3 + 1024] = var10;
                        var11[var13 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var11[var13 + 1536] = var10;
                        var11[var13 + 1 + 1536] = var10;
                        var11[var13 + 1536 + 2] = var10;
                        var11[var13 + 1536 + 3] = var10;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var11[var13] = var10;
                    } else if (var8 == 1) {
                        var11[var13 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var13 + 1539] = var10;
                    } else if (var8 == 3) {
                        var11[var13 + 1536] = var10;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var11[var13] = var10;
                        var11[var13 + 512] = var10;
                        var11[var13 + 1024] = var10;
                        var11[var13 + 1536] = var10;
                    } else if (var8 == 0) {
                        var11[var13] = var10;
                        var11[var13 + 1] = var10;
                        var11[var13 + 2] = var10;
                        var11[var13 + 3] = var10;
                    } else if (var8 == 1) {
                        var11[var13 + 3] = var10;
                        var11[var13 + 3 + 512] = var10;
                        var11[var13 + 3 + 1024] = var10;
                        var11[var13 + 3 + 1536] = var10;
                    } else if (var8 == 2) {
                        var11[var13 + 1536] = var10;
                        var11[var13 + 1536 + 1] = var10;
                        var11[var13 + 1536 + 2] = var10;
                        var11[var13 + 1536 + 3] = var10;
                    }
                }
            } else {
                class148 var15 = class217.field4042[var14.field552];
                if (var15 != null) {
                    int var16 = (var14.field560 * 4 - var15.field1742) / 2;
                    int var17 = (var14.field562 * 4 - var15.field1744) / 2;
                    var15.method662(arg0 * 4 + var16 + 48, (104 - (arg3 - -var14.field562)) * 4 + var17 + 48);
                }
            }
        }
        long var18 = class204.method1343(arg4, arg0, arg3);
        if (var18 != 0L) {
            int var20 = (int) var18 >> 20 & 0x3;
            int var21 = (int) (var18 >>> 32) & Integer.MAX_VALUE;
            class30 var22 = class73.method519(var21, -21035);
            int var23 = (int) var18 >> 14 & 0x1F;
            if (var22.field552 != -1) {
                class148 var24 = class217.field4042[var22.field552];
                if (var24 != null) {
                    int var25 = (var22.field560 * 4 - var24.field1742) / 2;
                    int var26 = (var22.field562 * 4 - var24.field1744) / 2;
                    var24.method662(arg0 * 4 + var25 + 48, (-arg3 + 104 + -var22.field562) * 4 + var26 + 48);
                }
            } else if (var23 == 9) {
                int var27 = 15658734;
                int[] var28 = class48.field955;
                int var29 = arg0 * 4 + (52736 - arg3 * 512) * 4 + 24624;
                if (var18 > 0L) {
                    var27 = 15597568;
                }
                if (var20 == 0 || var20 == 2) {
                    var28[var29 + 1536] = var27;
                    var28[var29 + 1025] = var27;
                    var28[var29 + 512 + 2] = var27;
                    var28[var29 + 3] = var27;
                } else {
                    var28[var29] = var27;
                    var28[var29 + 1 + 512] = var27;
                    var28[var29 + 2 + 1024] = var27;
                    var28[var29 + 1539] = var27;
                }
            }
        }
        long var30 = class244.method1592(arg4, arg0, arg3);
        if (var30 == 0L) {
            return;
        }
        int var32 = Integer.MAX_VALUE & (int) (var30 >>> 32);
        class30 var33 = class73.method519(var32, arg5 - 21038);
        if (var33.field552 == -1) {
            return;
        }
        class148 var34 = class217.field4042[var33.field552];
        if (var34 != null) {
            int var35 = (var33.field560 * 4 - var34.field1742) / 2;
            int var36 = (var33.field562 * 4 - var34.field1744) / 2;
            var34.method662(arg0 * 4 + var35 + 48, (-var33.field562 + 104 - arg3) * 4 + (48 - -var36));
            return;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lli;B)V")
    public static final void method1204(class128 arg0, byte arg1) {
        field3369++;
        if (arg1 != -21) {
            field3373 = null;
        }
        if (class97.field1698 != 1) {
            return;
        }
        short var2 = 280;
        if (var2 <= class205.field3805 && var2 + 14 >= class205.field3805 && class200.field3745 >= 4 && class200.field3745 <= 18) {
            class83.method567(0, -61, 0);
            return;
        }
        if (var2 + 15 <= class205.field3805 && class205.field3805 <= var2 + 80 && class200.field3745 >= 4 && class200.field3745 <= 18) {
            class83.method567(1, -50, 0);
            return;
        }
        short var3 = 390;
        if (var3 <= class205.field3805 && class205.field3805 <= var3 + 14 && class200.field3745 >= 4 && class200.field3745 <= 18) {
            class83.method567(0, -22, 1);
            return;
        }
        if (var3 + 15 <= class205.field3805 && class205.field3805 <= var3 + 80 && class200.field3745 >= 4 && class200.field3745 <= 18) {
            class83.method567(1, -51, 1);
            return;
        }
        short var4 = 500;
        if (class205.field3805 >= var4 && class205.field3805 <= var4 + 14 && class200.field3745 >= 4 && class200.field3745 <= 18) {
            class83.method567(0, -24, 2);
            return;
        }
        if (var4 + 15 <= class205.field3805 && var4 + 80 >= class205.field3805 && class200.field3745 >= 4 && class200.field3745 <= 18) {
            class83.method567(1, -97, 2);
            return;
        }
        short var5 = 610;
        if (class205.field3805 >= var5 && class205.field3805 <= var5 + 14 && class200.field3745 >= 4 && class200.field3745 <= 18) {
            class83.method567(0, -55, 3);
            return;
        }
        if (class205.field3805 >= var5 + 15 && class205.field3805 <= var5 + 80 && class200.field3745 >= 4 && class200.field3745 <= 18) {
            class83.method567(1, arg1 - 77, 3);
            return;
        }
        if (class205.field3805 >= 700 && class200.field3745 >= 4 && class205.field3805 <= 758 && class200.field3745 <= 20) {
            field3371 = false;
            class237.method1533(arg1 - 83);
            return;
        }
        if (class7.field78 == -1) {
            return;
        }
        class183 var6 = class6.field67[class7.field78];
        if (class168.field3203 == var6.field3386) {
            byte[] var7 = class80.method548(new class37[] { var6.field3385, class94.field1638 }, -95).method310(true);
            class227.field4180 = new String(var7, 0, var7.length);
            if (class50.field1018 != 0) {
                class161.field3036 = 43594;
                class77.field1363 = 43594;
                class73.field1298 = 443;
                class50.field1018 = 0;
            }
            class43.field918 = var6.field3387;
            field3371 = false;
            class237.method1533(arg1 ^ 0x77);
            return;
        }
        class37 var8 = class80.method548(new class37[] { class242.field4434, var6.field3385, class64.field1164, class151.method1034((byte) -9, class160.field3033), class151.field2868, class151.method1034((byte) -9, class16.field259 ? 1 : 0), class106.field1839, class151.method1034((byte) -9, class107.field1876), class44.field929, class151.method1034((byte) -9, class66.field1193) }, -58);
        try {
            arg0.getAppletContext().showDocument(var8.method316((byte) -74), "_self");
            return;
        } catch (Exception var9) {
            return;
        }
    }
}
