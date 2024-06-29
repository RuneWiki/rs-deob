import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class185 {

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "Z")
    public static boolean field3669 = false;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field3674 = 0;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "Lea;")
    public static class38 field3681 = class9.method46((byte) 124, "Willkommen auf RuneScape");

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "Lea;")
    public static class38 field3678 = class9.method46((byte) 126, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "Lea;")
    public static class38 field3673 = class9.method46((byte) 115, "(U1");

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "Lea;")
    private static class38 field3692 = class9.method46((byte) 119, "level)2");

    @OriginalMember(owner = "client!uf", name = "C", descriptor = "I")
    public static int field3695 = 0;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "Lea;")
    public static class38 field3682 = field3692;

    @OriginalMember(owner = "client!uf", name = "B", descriptor = "Lea;")
    public static class38 field3694 = class9.method46((byte) 114, "blinken3:");

    @OriginalMember(owner = "client!uf", name = "w", descriptor = "Lef;")
    public static class43 field3689 = null;

    @OriginalMember(owner = "client!uf", name = "E", descriptor = "Lea;")
    public static class38 field3697 = class9.method46((byte) 116, ":assistreq:");

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public int field3667;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    public int field3670;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public int field3671;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public int field3672;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public int field3675;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public int field3676;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public int field3679;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    public int field3680;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "I")
    public int field3683;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
    public int field3684;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
    public int field3686;

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
    public int field3687;

    @OriginalMember(owner = "client!uf", name = "x", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!uf", name = "y", descriptor = "I")
    public int field3691;

    @OriginalMember(owner = "client!uf", name = "A", descriptor = "I")
    public int field3693;

    @OriginalMember(owner = "client!uf", name = "D", descriptor = "I")
    public int field3696;

    @OriginalMember(owner = "client!uf", name = "F", descriptor = "I")
    public int field3698;

    @OriginalMember(owner = "client!uf", name = "G", descriptor = "I")
    public int field3699;

    @OriginalMember(owner = "client!uf", name = "H", descriptor = "I")
    public int field3700;

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "Z")
    public static boolean field3688;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BI)Z")
    public static final boolean method1250(byte arg0, int arg1) {
        field3690++;
        int var2 = -31 % ((arg0 - 20) / 41);
        return (arg1 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIII)V")
    public static final void method1251(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3677++;
        int var6 = class101.field2268.method1127(arg4, arg3, arg2);
        if (var6 != 0) {
            int var7 = class101.field2268.method1136(arg4, arg3, arg2, var6);
            int var8 = arg0;
            int var9 = var7 & 0x1F;
            int var10 = arg3 * 4 + (103 - arg2) * 2048 + 24624;
            if (var6 > 0) {
                var8 = arg1;
            }
            int var11 = var7 >> 6 & 0x3;
            int[] var12 = class100.field2237.field2045;
            int var13 = var6 >> 14 & 0x7FFF;
            class106 var14 = class70.method553(var13, 28067);
            if (var14.field2368 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (var11 == 0) {
                        var12[var10] = var8;
                        var12[var10 + 512] = var8;
                        var12[var10 + 1024] = var8;
                        var12[var10 + 1536] = var8;
                    } else if (var11 == 1) {
                        var12[var10] = var8;
                        var12[var10 + 1] = var8;
                        var12[var10 + 2] = var8;
                        var12[var10 + 3] = var8;
                    } else if (var11 == 2) {
                        var12[var10 + 3] = var8;
                        var12[var10 + 515] = var8;
                        var12[var10 + 3 + 1024] = var8;
                        var12[var10 + 3 + 1536] = var8;
                    } else if (var11 == 3) {
                        var12[var10 + 1536] = var8;
                        var12[var10 + 1536 + 1] = var8;
                        var12[var10 + 2 + 1536] = var8;
                        var12[var10 + 1536 + 3] = var8;
                    }
                }
                if (var9 == 3) {
                    if (var11 == 0) {
                        var12[var10] = var8;
                    } else if (var11 == 1) {
                        var12[var10 + 3] = var8;
                    } else if (var11 == 2) {
                        var12[var10 + 1539] = var8;
                    } else if (var11 == 3) {
                        var12[var10 + 1536] = var8;
                    }
                }
                if (var9 == 2) {
                    if (var11 == 3) {
                        var12[var10] = var8;
                        var12[var10 + 512] = var8;
                        var12[var10 + 1024] = var8;
                        var12[var10 + 1536] = var8;
                    } else if (var11 == 0) {
                        var12[var10] = var8;
                        var12[var10 + 1] = var8;
                        var12[var10 + 2] = var8;
                        var12[var10 + 3] = var8;
                    } else if (var11 == 1) {
                        var12[var10 + 3] = var8;
                        var12[var10 + 3 + 512] = var8;
                        var12[var10 + 3 + 1024] = var8;
                        var12[var10 + 3 + 1536] = var8;
                    } else if (var11 == 2) {
                        var12[var10 + 1536] = var8;
                        var12[var10 + 1536 + 1] = var8;
                        var12[var10 + 1536 + 2] = var8;
                        var12[var10 + 3 + 1536] = var8;
                    }
                }
            } else {
                class47 var15 = class54.field1364[var14.field2368];
                if (var15 != null) {
                    int var16 = (var14.field2405 * 4 - var15.field1144) / 2;
                    int var17 = (var14.field2393 * 4 - var15.field1147) / 2;
                    var15.method335(arg3 * 4 + var17 + 48, (-arg2 + 104 - var14.field2405) * 4 + var16 + 48);
                }
            }
        }
        int var18 = class101.field2268.method1125(arg4, arg3, arg2);
        if (var18 != 0) {
            int var19 = class101.field2268.method1136(arg4, arg3, arg2, var18);
            int var20 = var19 >> 6 & 0x3;
            int var21 = var19 & 0x1F;
            int var22 = var18 >> 14 & 0x7FFF;
            class106 var23 = class70.method553(var22, arg5 ^ 0x4F55);
            if (var23.field2368 != -1) {
                class47 var24 = class54.field1364[var23.field2368];
                if (var24 != null) {
                    int var25 = (var23.field2393 * 4 - var24.field1147) / 2;
                    int var26 = (var23.field2405 * 4 - var24.field1144) / 2;
                    var24.method335(arg3 * 4 + var25 + 48, (104 - arg2 + -var23.field2405) * 4 + 48 - -var26);
                }
            } else if (var21 == 9) {
                int var27 = 15658734;
                if (var18 > 0) {
                    var27 = 15597568;
                }
                int[] var28 = class100.field2237.field2045;
                int var29 = arg3 * 4 + (52736 - arg2 * 512) * 4 + 24624;
                if (var20 == 0 || var20 == 2) {
                    var28[var29 + 1536] = var27;
                    var28[var29 + 1024 + 1] = var27;
                    var28[var29 + 2 + 512] = var27;
                    var28[var29 + 3] = var27;
                } else {
                    var28[var29] = var27;
                    var28[var29 + 513] = var27;
                    var28[var29 + 1024 + 2] = var27;
                    var28[var29 + 1539] = var27;
                }
            }
        }
        int var30 = class101.field2268.method1096(arg4, arg3, arg2);
        if (var30 != 0) {
            int var31 = var30 >> 14 & 0x7FFF;
            class106 var32 = class70.method553(var31, 28067);
            if (var32.field2368 != -1) {
                class47 var33 = class54.field1364[var32.field2368];
                if (var33 != null) {
                    int var34 = (var32.field2405 * 4 - var33.field1144) / 2;
                    int var35 = (var32.field2393 * 4 - var33.field1147) / 2;
                    var33.method335(arg3 * 4 + var35 + 48, (104 - (arg2 - -var32.field2405)) * 4 - -var34 + 48);
                }
            }
        }
        if (arg5 != 8950) {
            method1252((byte) -119);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V")
    public static void method1252(byte arg0) {
        field3678 = null;
        field3682 = null;
        if (arg0 != 58) {
            field3681 = null;
        }
        field3673 = null;
        field3694 = null;
        field3692 = null;
        field3681 = null;
        field3697 = null;
        field3689 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lea;ZI)V")
    public static final void method1253(class38 arg0, boolean arg1, int arg2) {
        field3685++;
        byte var3 = 4;
        if (arg2 != 1) {
            return;
        }
        int var4 = var3 + 6;
        int var5 = class41.field914.method667(arg0, 250);
        int var6 = var3 + 6;
        int var7 = class41.field914.method651(arg0, 250) * 13;
        class71.method558(var4 - var3, -var3 + var6, var5 + var3 + var3, var7 - -var3 + var3, 0);
        class71.method575(var4 - var3, -var3 + var6, var3 + var5 + var3, var7 - -var3 + var3, 16777215);
        class41.field914.method658(arg0, var4, var6, var5, var7, 16777215, -1, 1, 1, 0);
        class45.method326(var3 + var5 + var3, -var3 + var4, var6 - var3, var7 - -var3 + var3, 16711680);
        if (!arg1) {
            class87.method722((byte) -111, var7, var5, var4, var6);
            return;
        }
        try {
            Graphics var8 = class51.field1313.getGraphics();
            class57.field1443.method230(0, var8, 0, false);
        } catch (Exception var9) {
            class51.field1313.repaint();
        }
    }
}
