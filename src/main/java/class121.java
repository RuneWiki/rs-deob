import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class121 {

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "Z")
    public static boolean field2781 = false;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "Lic;")
    public static class59 field2784 = class59.method433(0, "Unerwartete Antwort vom Anmelde)2Server");

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "[[[B")
    public static byte[][][] field2785 = new byte[4][104][104];

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "Ldd;")
    public static class26 field2780;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "Ldd;")
    public static class26 field2783;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)V")
    public static final void method941(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            field2789 = -54;
        }
        field2786++;
        if (class19.field403 != 0 && class19.field403 != 3 || class41.field1065 != 1) {
            return;
        }
        int var3 = class3.field68 - arg0 - 25;
        int var4 = class81.field2005 - arg2 - 5;
        if (var3 < 0 || var4 < 0 || var3 >= 146 || var4 >= 151) {
            return;
        }
        var4 -= 75;
        var3 -= 73;
        int var5 = class79.field1941 + class130.field2927 & 0x7FF;
        int var6 = class11.field244[var5];
        int var7 = (class49.field1226 + 256) * var6 >> 8;
        int var8 = class11.field249[var5];
        int var9 = (class49.field1226 + 256) * var8 >> 8;
        int var10 = var4 * var7 + var3 * var9 >> 11;
        int var11 = class159.field3650.field1730 + var10 >> 7;
        int var12 = var4 * var9 - var3 * var7 >> 11;
        int var13 = class159.field3650.field1751 - var12 >> 7;
        boolean var14 = method945(0, 0, class159.field3650.field1719[0], 1, class159.field3650.field1704[0], 0, 0, arg1 - 25170, var11, var13, 0, true);
        if (!var14) {
            return;
        }
        class125.field2842.method1205(var3, 8584);
        class125.field2842.method1205(var4, 8584);
        class125.field2842.method1206(class79.field1941, true);
        class125.field2842.method1205(57, 8584);
        class125.field2842.method1205(class130.field2927, arg1 + 8585);
        class125.field2842.method1205(class49.field1226, 8584);
        class125.field2842.method1205(89, 8584);
        class125.field2842.method1206(class159.field3650.field1730, true);
        class125.field2842.method1206(class159.field3650.field1751, true);
        class125.field2842.method1205(class24.field575, 8584);
        class125.field2842.method1205(63, 8584);
        return;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lic;ZB)V")
    public static final void method942(class59 arg0, boolean arg1, byte arg2) {
        field2787++;
        int var3 = class88.field2222.method1156(arg0, 250);
        byte var4 = 4;
        int var5 = class88.field2222.method1152(arg0, 250) * 13;
        int var6 = var4 + 6;
        int var7 = var4 + 6;
        class129.method988(var6 - var4, -var4 + var7, var3 + var4 + var4, var4 + var5 - -var4, 0);
        class129.method997(var6 - var4, -var4 + var7, var3 + var4 + var4, var5 - -var4 + var4, 16777215);
        class88.field2222.method1155(arg0, var6, var7, var3, var5, 16777215, -1, 1, 1, 0);
        class149.method1106(-15412, var5 + var4 + var4, var4 + var4 + var3, var7 - var4, var6 - var4);
        if (arg1) {
            try {
                Graphics var8 = class142.field3115.getGraphics();
                class33.field891.method857(0, 0, var8, 0);
            } catch (Exception var9) {
                class142.field3115.repaint();
            }
        } else {
            class26.method197(var7, var5, var3, var6, 0);
        }
        if (arg2 <= 56) {
            method944(30, -101, 35, 37);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
    public static void method943(byte arg0) {
        field2784 = null;
        field2780 = null;
        field2783 = null;
        field2785 = null;
        if (arg0 <= 69) {
            field2782 = 107;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIII)I")
    public static final int method944(int arg0, int arg1, int arg2, int arg3) {
        field2788++;
        if ((field2785[arg3][arg2][arg0] & 0x8) == 0) {
            return arg1 <= ~arg3 || (field2785[1][arg2][arg0] & 0x2) == 0 ? arg3 : arg3 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIIIIIIIZ)Z")
    public static final boolean method945(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        field2779++;
        if (arg7 != -25171) {
            method943((byte) 31);
        }
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class102.field2490[var12][var36] = 0;
                class63.field1626[var12][var36] = 99999999;
            }
        }
        int var13 = arg2;
        class102.field2490[arg2][arg4] = 99;
        class63.field1626[arg2][arg4] = 0;
        int var14 = arg4;
        boolean var15 = false;
        byte var16 = 0;
        int var17 = 0;
        class81.field2019[var16] = arg2;
        int var37 = var16 + 1;
        class26.field680[var16] = arg4;
        int[][] var18 = class108.field2616[class44.field1127].field1829;
        int var19 = class81.field2019.length;
        while (var37 != var17) {
            var14 = class26.field680[var17];
            var13 = class81.field2019[var17];
            var17 = (var17 + 1) % var19;
            if (arg8 == var13 && arg9 == var14) {
                var15 = true;
                break;
            }
            if (arg0 != 0) {
                if ((arg0 < 5 || arg0 == 10) && class108.field2616[class44.field1127].method614(arg0 - 1, var14, arg9, arg8, var13, arg1, (byte) 87)) {
                    var15 = true;
                    break;
                }
                if (arg0 < 10 && class108.field2616[class44.field1127].method604(arg9, arg0 - 1, var13, -1, var14, arg1, arg8)) {
                    var15 = true;
                    break;
                }
            }
            if (arg6 != 0 && arg10 != 0 && class108.field2616[class44.field1127].method613(arg6, var13, arg10, arg8, arg5, var14, arg9, -26273)) {
                var15 = true;
                break;
            }
            int var35 = class63.field1626[var13][var14] + 1;
            if (var13 > 0 && class102.field2490[var13 - 1][var14] == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0) {
                class81.field2019[var37] = var13 - 1;
                class26.field680[var37] = var14;
                class102.field2490[var13 - 1][var14] = 2;
                class63.field1626[var13 - 1][var14] = var35;
                var37 = (var37 + 1) % var19;
            }
            if (var13 < 103 && class102.field2490[var13 + 1][var14] == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0) {
                class81.field2019[var37] = var13 + 1;
                class26.field680[var37] = var14;
                class102.field2490[var13 + 1][var14] = 8;
                class63.field1626[var13 + 1][var14] = var35;
                var37 = (var37 + 1) % var19;
            }
            if (var14 > 0 && class102.field2490[var13][var14 - 1] == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                class81.field2019[var37] = var13;
                class26.field680[var37] = var14 - 1;
                var37 = (var37 + 1) % var19;
                class102.field2490[var13][var14 - 1] = 1;
                class63.field1626[var13][var14 - 1] = var35;
            }
            if (var14 < 103 && class102.field2490[var13][var14 + 1] == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                class81.field2019[var37] = var13;
                class26.field680[var37] = var14 + 1;
                class102.field2490[var13][var14 + 1] = 4;
                var37 = (var37 + 1) % var19;
                class63.field1626[var13][var14 + 1] = var35;
            }
            if (var13 > 0 && var14 > 0 && class102.field2490[var13 - 1][var14 - 1] == 0 && (var18[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                class81.field2019[var37] = var13 - 1;
                class26.field680[var37] = var14 - 1;
                var37 = (var37 + 1) % var19;
                class102.field2490[var13 - 1][var14 - 1] = 3;
                class63.field1626[var13 - 1][var14 - 1] = var35;
            }
            if (var13 < 103 && var14 > 0 && class102.field2490[var13 + 1][var14 - 1] == 0 && (var18[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                class81.field2019[var37] = var13 + 1;
                class26.field680[var37] = var14 - 1;
                var37 = (var37 + 1) % var19;
                class102.field2490[var13 + 1][var14 - 1] = 9;
                class63.field1626[var13 + 1][var14 - 1] = var35;
            }
            if (var13 > 0 && var14 < 103 && class102.field2490[var13 - 1][var14 + 1] == 0 && (var18[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                class81.field2019[var37] = var13 - 1;
                class26.field680[var37] = var14 + 1;
                class102.field2490[var13 - 1][var14 + 1] = 6;
                var37 = (var37 + 1) % var19;
                class63.field1626[var13 - 1][var14 + 1] = var35;
            }
            if (var13 < 103 && var14 < 103 && class102.field2490[var13 + 1][var14 + 1] == 0 && (var18[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                class81.field2019[var37] = var13 + 1;
                class26.field680[var37] = var14 + 1;
                var37 = (var37 + 1) % var19;
                class102.field2490[var13 + 1][var14 + 1] = 12;
                class63.field1626[var13 + 1][var14 + 1] = var35;
            }
        }
        class24.field575 = 0;
        if (!var15) {
            if (!arg11) {
                return false;
            }
            byte var20 = 10;
            int var21 = 1000;
            int var22 = 100;
            for (int var23 = arg8 - var20; var23 <= arg8 + var20; var23++) {
                for (int var24 = arg9 - var20; var24 <= arg9 + var20; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class63.field1626[var23][var24] < 100) {
                        int var25 = 0;
                        if (arg9 > var24) {
                            var25 = arg9 - var24;
                        } else if (var24 > arg9 + arg10 - 1) {
                            var25 = var24 + 1 - arg9 - arg10;
                        }
                        int var26 = 0;
                        if (var23 < arg8) {
                            var26 = arg8 - var23;
                        } else if (var23 > arg6 + arg8 - 1) {
                            var26 = var23 + 1 - arg8 - arg6;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var21 > var27 || var21 == var27 && var22 > class63.field1626[var23][var24]) {
                            var13 = var23;
                            var21 = var27;
                            var14 = var24;
                            var22 = class63.field1626[var23][var24];
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg2 == var13 && arg4 == var14) {
                return false;
            }
            class24.field575 = 1;
        }
        byte var28 = 0;
        class81.field2019[var28] = var13;
        int var38 = var28 + 1;
        class26.field680[var28] = var14;
        int var29;
        int var30 = var29 = class102.field2490[var13][var14];
        while (arg2 != var13 || arg4 != var14) {
            if (var29 != var30) {
                var29 = var30;
                class81.field2019[var38] = var13;
                class26.field680[var38++] = var14;
            }
            if ((var30 & 0x2) != 0) {
                var13++;
            } else if ((var30 & 0x8) != 0) {
                var13--;
            }
            if ((var30 & 0x1) != 0) {
                var14++;
            } else if ((var30 & 0x4) != 0) {
                var14--;
            }
            var30 = class102.field2490[var13][var14];
        }
        if (var38 > 0) {
            int var31 = var38--;
            int var32 = class81.field2019[var38];
            if (var31 > 25) {
                var31 = 25;
            }
            int var33 = class26.field680[var38];
            if (arg3 == 0) {
                class5.field108++;
                class125.field2842.method1072(165, -1);
                class125.field2842.method1205(var31 + var31 + 3, 8584);
            }
            if (arg3 == 1) {
                class126.field2861++;
                class125.field2842.method1072(245, -1);
                class125.field2842.method1205(var31 + var31 + 3 + 14, 8584);
            }
            if (arg3 == 2) {
                class125.field2842.method1072(141, -1);
                class125.field2842.method1205(var31 + var31 + 3, 8584);
                class9.field188++;
            }
            class125.field2842.method1206(var33 + class68.field1756, true);
            class125.field2842.method1165(99, var32 + class89.field2229);
            class125.field2842.method1188(arg7 + 25171, class95.field2423[82] ? 1 : 0);
            class88.field2213 = class81.field2019[0];
            class53.field1315 = class26.field680[0];
            for (int var34 = 1; var34 < var31; var34++) {
                var38--;
                class125.field2842.method1208(arg7 + 12173, class81.field2019[var38] + -var32);
                class125.field2842.method1208(-12998, class26.field680[var38] - var33);
            }
            return true;
        } else if (arg3 == 1) {
            return false;
        } else {
            return true;
        }
    }
}
