import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class204 {

    @OriginalMember(owner = "client!po", name = "h", descriptor = "Lfi;")
    private class166 field2866;

    @OriginalMember(owner = "client!po", name = "g", descriptor = "Laj;")
    public static class71 field2865 = new class71(8);

    @OriginalMember(owner = "client!po", name = "n", descriptor = "I")
    public static int field2872 = -1;

    @OriginalMember(owner = "client!po", name = "k", descriptor = "Lfi;")
    public static class166 field2869 = new class166();

    @OriginalMember(owner = "client!po", name = "p", descriptor = "Laj;")
    public static class71 field2874 = new class71(512);

    @OriginalMember(owner = "client!po", name = "r", descriptor = "[I")
    public static int[] field2876 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!po", name = "a", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!po", name = "e", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!po", name = "f", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!po", name = "i", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!po", name = "j", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!po", name = "l", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!po", name = "m", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!po", name = "o", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!po", name = "c", descriptor = "Ls;")
    private class381 field2861;

    @OriginalMember(owner = "client!po", name = "q", descriptor = "Lrk;")
    public static class427 field2875;

    @OriginalMember(owner = "client!po", name = "s", descriptor = "Lrk;")
    public static class427 field2877;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(ZLfi;)V", line = 3)
    public final void method1416(boolean arg0, class166 arg1) {
        this.field2866 = arg1;
        field2870++;
        if (!arg0) {
            this.method1418((byte) 20);
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V", line = 17)
    public static void method1417(int arg0) {
        field2869 = null;
        field2865 = null;
        field2874 = null;
        if (arg0 != -1) {
            method1417(127);
        }
        field2877 = null;
        field2875 = null;
        field2876 = null;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(B)Ls;", line = 38)
    public final class381 method1418(byte arg0) {
        field2859++;
        class381 var2 = this.field2866.field2454.field5346;
        if (this.field2866.field2454 == var2) {
            this.field2861 = null;
            return null;
        } else {
            this.field2861 = var2.field5346;
            return arg0 <= 45 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lbd;I)V", line = 58)
    public static final void method1419(class304 arg0, int arg1) {
        class73.field1095 = 3;
        field2871++;
        class95.method814(true, false);
        class40.field626 = 127;
        class162.field2401 = true;
        class31.field514 = 0;
        class223.field3086 = true;
        class441.field6352 = true;
        class179.field2633 = 2;
        class385.field5429 = true;
        class331.field4504 = 127;
        class130.field1846 = true;
        class173.field2554 = true;
        class275.field3703 = 1;
        class32.field527 = 0;
        class148.field2284 = 255;
        class61.field952 = true;
        class422.field5903 = 0;
        class109.field1580 = true;
        class177.field2610 = true;
        class416.field5823 = true;
        class42.field638 = 0;
        if (class297.field4005 >= 96) {
            class161.method1208(2, 0);
        } else {
            class161.method1208(0, 0);
        }
        class264.field3557 = 0;
        class102.field1513 = 2;
        class27.field476 = false;
        class100.field1443 = false;
        class318.field4308 = false;
        class338.field4590 = true;
        class26.field467 = true;
        class41.field630 = 0;
        class447.field6440 = 2;
        class56 var2 = null;
        if (arg1 <= 96) {
            return;
        }
        try {
            class242 var3 = arg0.method1961(12);
            while (var3.field3345 == 0) {
                class229.method1541(121, 1L);
            }
            if (var3.field3345 == 1) {
                var2 = (class56) var3.field3341;
                byte[] var4 = new byte[(int) var2.method522(-1)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method523(var4, var4.length - var5, (byte) 118, var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class174.method1298(0, new class289(var4));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method526(-19635);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(II)V", line = 142)
    public static final void method1420(int arg0, int arg1) {
        field2868++;
        class138.field1947 = arg1;
        class13.field98.method2533(0);
        if (arg0 >= -21) {
            method1422(-28, (class151) null, 100, -23, 115, 71, 40, -92, 48, 78, 113, 111);
        }
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "()V", line = 159)
    public class204() {
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(B)Ls;", line = 162)
    public final class381 method1421(byte arg0) {
        field2862++;
        class381 var2 = this.field2861;
        if (arg0 != 74) {
            return null;
        } else if (this.field2866.field2454 == var2) {
            this.field2861 = null;
            return null;
        } else {
            this.field2861 = var2.field5346;
            return var2;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(ILoa;IIIIIIIIII)Z", line = 182)
    public static final boolean method1422(int arg0, class151 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field2863++;
        int var12 = arg9;
        int var13 = arg0;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg9 - var14;
        class161.field2398[var14][var15] = 99;
        int var17 = arg0 - var15;
        class416.field5822[var14][var15] = 0;
        byte var18 = 0;
        int var19 = 0;
        class358.field4854[var18] = arg9;
        int var35 = var18 + 1;
        class52.field847[var18] = arg0;
        if (arg10 != -1) {
            return false;
        }
        int[][] var20 = arg1.field2303;
        while (true) {
            label286: while (true) {
                int var21;
                int var22;
                int var23;
                int var24;
                int var26;
                do {
                    do {
                        do {
                            label263: do {
                                if (var35 == var19) {
                                    class286.field3826 = var12;
                                    class268.field3612 = var13;
                                    return false;
                                }
                                var12 = class358.field4854[var19];
                                var13 = class52.field847[var19];
                                var21 = var13 - var17;
                                var22 = var12 - var16;
                                var19 = var19 + 1 & 0xFFF;
                                var23 = var12 - arg1.field2320;
                                var24 = var13 - arg1.field2316;
                                if (arg2 == -4) {
                                    if (arg4 == var12 && arg5 == var13) {
                                        class286.field3826 = var12;
                                        class268.field3612 = var13;
                                        return true;
                                    }
                                } else if (arg2 == -3) {
                                    if (class448.method2791(arg11, var12, arg4, (byte) 114, arg8, var13, arg7, arg5, arg8)) {
                                        class268.field3612 = var13;
                                        class286.field3826 = var12;
                                        return true;
                                    }
                                } else if (arg2 == -2) {
                                    if (arg1.method1161(arg8, arg5, var13, (byte) -51, var12, arg4, arg7, arg3, arg11, arg8)) {
                                        class286.field3826 = var12;
                                        class268.field3612 = var13;
                                        return true;
                                    }
                                } else if (arg2 == -1) {
                                    if (arg1.method1156(arg3, 1, arg5, arg4, var12, arg8, var13, arg11, arg7)) {
                                        class286.field3826 = var12;
                                        class268.field3612 = var13;
                                        return true;
                                    }
                                } else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
                                    if (arg1.method1155((byte) 36, arg8, arg4, arg2, arg5, var12, var13, arg6)) {
                                        class268.field3612 = var13;
                                        class286.field3826 = var12;
                                        return true;
                                    }
                                } else if (arg1.method1165(arg2, arg6, arg8, -15410, arg5, var12, var13, arg4)) {
                                    class286.field3826 = var12;
                                    class268.field3612 = var13;
                                    return true;
                                }
                                var26 = class416.field5822[var22][var21] + 1;
                                if (var22 > 0 && class161.field2398[var22 - 1][var21] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][arg8 + var24 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (var27 >= arg8 - 1) {
                                            class358.field4854[var35] = var12 - 1;
                                            class52.field847[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class161.field2398[var22 - 1][var21] = 2;
                                            class416.field5822[var22 - 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (128 - arg8 > var22 && class161.field2398[var22 + 1][var21] == 0 && (var20[arg8 + var23][var24] & 0x60E40000) == 0 && (var20[var23 + arg8][var24 + arg8 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (var28 >= arg8 - 1) {
                                            class358.field4854[var35] = var12 + 1;
                                            class52.field847[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class161.field2398[var22 + 1][var21] = 8;
                                            class416.field5822[var22 + 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[arg8 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var21 > 0 && class161.field2398[var22][var21 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[var23 + arg8 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (arg8 - 1 <= var29) {
                                            class358.field4854[var35] = var12;
                                            class52.field847[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class161.field2398[var22][var21 - 1] = 1;
                                            class416.field5822[var22][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var21 < (128 - arg8) && class161.field2398[var22][var21 + 1] == 0 && (var20[var23][arg8 + var24] & 0x4E240000) == 0 && (var20[var23 - (1 - arg8)][arg8 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= (arg8 - 1)) {
                                            class358.field4854[var35] = var12;
                                            class52.field847[var35] = var13 + 1;
                                            class161.field2398[var22][var21 + 1] = 4;
                                            var35 = var35 + 1 & 0xFFF;
                                            class416.field5822[var22][var21 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][var24 + arg8] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var22 > 0 && var21 > 0 && class161.field2398[var22 - 1][var21 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (var31 >= arg8) {
                                            class358.field4854[var35] = var12 - 1;
                                            class52.field847[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class161.field2398[var22 - 1][var21 - 1] = 3;
                                            class416.field5822[var22 - 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if ((128 - arg8) > var22 && var21 > 0 && class161.field2398[var22 + 1][var21 - 1] == 0 && (var20[var23 + arg8][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (arg8 <= var32) {
                                            class358.field4854[var35] = var12 + 1;
                                            class52.field847[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class161.field2398[var22 + 1][var21 - 1] = 9;
                                            class416.field5822[var22 + 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg8 + var23][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var22 > 0 && var21 < 128 - arg8 && class161.field2398[var22 - 1][var21 + 1] == 0 && (var20[var23 - 1][arg8 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg8; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][arg8 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class358.field4854[var35] = var12 - 1;
                                    class52.field847[var35] = var13 + 1;
                                    var35 = var35 + 1 & 0xFFF;
                                    class161.field2398[var22 - 1][var21 + 1] = 6;
                                    class416.field5822[var22 - 1][var21 + 1] = var26;
                                }
                            } while (128 - arg8 <= var22);
                        } while ((128 - arg8) <= var21);
                    } while (class161.field2398[var22 + 1][var21 + 1] != 0);
                } while ((var20[arg8 + var23][arg8 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg8; var34++) {
                    if ((var20[var23 + var34][arg8 + var24] & 0x7E240000) != 0 || (var20[var23 + arg8][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class358.field4854[var35] = var12 + 1;
                class52.field847[var35] = var13 + 1;
                class161.field2398[var22 + 1][var21 + 1] = 12;
                var35 = var35 + 1 & 0xFFF;
                class416.field5822[var22 + 1][var21 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(B)V", line = 622)
    public static final void method1423(byte arg0) {
        field2864++;
        int var1 = 0;
        if (arg0 <= 114) {
            return;
        }
        for (int var2 = 0; var2 < class116.field1621; var2++) {
            for (int var3 = 0; var3 < class385.field5425; var3++) {
                if (class24.method295(var3, var1, var2, class118.field1653, (byte) 9, true)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lfi;)V", line = 656)
    public class204(class166 arg0) {
        this.field2866 = arg0;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IBI)I", line = 665)
    public static final int method1424(int arg0, byte arg1, int arg2) {
        int var3 = -117 / ((arg1 + 21) / 54);
        field2860++;
        int var4 = arg2 >>> 31;
        return (arg2 + var4) / arg0 - var4;
    }
}
