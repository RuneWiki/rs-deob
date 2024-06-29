import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class253 extends class235 {

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "Lsb;")
    public static class98 field4431 = class47.method368("<br>(X100(U(Y", 0);

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "I")
    public static int field4430 = 0;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "[I")
    public static int[] field4433 = new int[2000];

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "Lsb;")
    private static class98 field4421 = class47.method368("Connecting to update server", 0);

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "Lsb;")
    public static class98 field4436 = field4421;

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "Lsb;")
    public static class98 field4437 = class47.method368("scrollen:", 0);

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "I")
    public int field4428;

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
    public int field4429;

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "I")
    public int field4435;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "[I")
    public static int[] field4422;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILtg;ZLtg;Lfa;)V")
    public static final void method1746(int arg0, class75 arg1, boolean arg2, class75 arg3, class77 arg4) {
        if (arg0 != 0) {
            method1753(56, (class71[][][]) null, (byte) 25, 74, 90, true);
        }
        class228.field3922 = arg2;
        class243.field4222 = arg3;
        field4420++;
        class171.field3021 = arg1;
        int var5 = class243.field4222.method579(arg0 ^ 0xFFFFFF81) - 1;
        class142.field2517 = var5 * 256 + class243.field4222.method550(arg0 - 1757152080, var5);
        class71.field1162 = arg4;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
    public static void method1747(int arg0) {
        field4433 = null;
        if (arg0 != 65535) {
            return;
        }
        field4421 = null;
        field4422 = null;
        field4431 = null;
        field4437 = null;
        field4436 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method1748(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        class142.method1063((byte) -124, arg6);
        field4439++;
        int var7 = arg6;
        int var8 = arg6 - arg0;
        int var9 = 0;
        int var10 = 42 % ((14 - arg5) / 55);
        int var11 = -arg6;
        if (var8 < 0) {
            var8 = 0;
        }
        int var12 = var8;
        int var13 = -var8;
        int var14 = -1;
        int var15 = -1;
        int[] var16 = class43.field721[arg1];
        int var17 = arg4 + var8;
        int var18 = arg4 - var8;
        class37.method305(-7, var16, var18, arg3, arg4 - arg6);
        class37.method305(-7, var16, var17, arg2, var18);
        class37.method305(-7, var16, arg4 + arg6, arg3, var17);
        while (var7 > var9) {
            var15 += 2;
            var14 += 2;
            var11 += var15;
            var13 += var14;
            if (var13 >= 0 && var12 >= 1) {
                class256.field4534[var12] = var9;
                var12--;
                var13 -= var12 << 1;
            }
            var9++;
            if (var11 >= 0) {
                var7--;
                var11 -= var7 << 1;
                if (var7 >= var8) {
                    int[] var19 = class43.field721[arg1 + var7];
                    int[] var20 = class43.field721[arg1 - var7];
                    int var21 = arg4 + var9;
                    int var22 = arg4 - var9;
                    class37.method305(-7, var19, var21, arg3, var22);
                    class37.method305(-7, var20, var21, arg3, var22);
                } else {
                    int[] var23 = class43.field721[arg1 + var7];
                    int[] var24 = class43.field721[arg1 - var7];
                    int var25 = class256.field4534[var7];
                    int var26 = arg4 + var9;
                    int var27 = arg4 + var25;
                    int var28 = arg4 - var9;
                    int var29 = arg4 - var25;
                    class37.method305(-7, var23, var29, arg3, var28);
                    class37.method305(-7, var23, var27, arg2, var29);
                    class37.method305(-7, var23, var26, arg3, var27);
                    class37.method305(-7, var24, var29, arg3, var28);
                    class37.method305(-7, var24, var27, arg2, var29);
                    class37.method305(-7, var24, var26, arg3, var27);
                }
            }
            int[] var30 = class43.field721[arg1 + var9];
            int[] var31 = class43.field721[arg1 - var9];
            int var32 = arg4 + var7;
            int var33 = arg4 - var7;
            if (var8 > var9) {
                int var34 = var9 <= var12 ? var12 : class256.field4534[var9];
                int var35 = arg4 - var34;
                class37.method305(-7, var30, var35, arg3, var33);
                int var36 = arg4 + var34;
                class37.method305(-7, var30, var36, arg2, var35);
                class37.method305(-7, var30, var32, arg3, var36);
                class37.method305(-7, var31, var35, arg3, var33);
                class37.method305(-7, var31, var36, arg2, var35);
                class37.method305(-7, var31, var32, arg3, var36);
            } else {
                class37.method305(-7, var30, var32, arg3, var33);
                class37.method305(-7, var31, var32, arg3, var33);
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(IIIII)V")
    public static final void method1749(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4434++;
        if (arg3 >= -33) {
            method1753(113, (class71[][][]) null, (byte) -17, -15, 61, true);
        }
        if (arg0 <= arg1) {
            class37.method305(-7, class43.field721[arg4], arg1, arg2, arg0);
        } else {
            class37.method305(-7, class43.field721[arg4], arg0, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZILsb;)V")
    public static final void method1750(boolean arg0, int arg1, class98 arg2) {
        short[] var3 = new short[16];
        class98 var4 = arg2.method703((byte) -74);
        int var5 = 0;
        field4426++;
        for (int var6 = 0; var6 < class142.field2517; var6++) {
            class245 var9 = class235.method1605(-64, var6);
            if ((!arg0 || var9.field4273) && var9.field4275 == -1 && var9.field4250 == -1 && var9.field4287 == 0 && var9.field4255.method703((byte) 102).method710(-113, var4) != -1) {
                if (var5 >= 250) {
                    class131.field2331 = null;
                    class196.field3381 = -1;
                    return;
                }
                if (var5 >= var3.length) {
                    short[] var10 = new short[var3.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var3[var11];
                    }
                    var3 = var10;
                }
                var3[var5++] = (short) var6;
            }
        }
        if (arg1 >= -4) {
            field4432 = 87;
        }
        class196.field3381 = var5;
        class56.field895 = 0;
        class98[] var7 = new class98[class196.field3381];
        class131.field2331 = var3;
        for (int var8 = 0; var8 < class196.field3381; var8++) {
            var7[var8] = class235.method1605(-52, var3[var8]).field4255;
        }
        class151.method1115(class131.field2331, var7, (byte) 52);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIB)I")
    public static final int method1751(int arg0, int arg1, byte arg2) {
        if (arg2 != 106) {
            method1749(11, 123, 5, -72, 100);
        }
        int var3 = arg1 >>> 31;
        field4424++;
        return (arg1 + var3) / arg0 - var3;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ltg;III)Lnj;")
    public static final class82 method1752(class75 arg0, int arg1, int arg2, int arg3) {
        int var4 = 30 % ((-arg3 - 75) / 32);
        field4425++;
        return class43.method341(arg0, -1, arg1, arg2) ? class64.method458(true) : null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I[[[Lp;BIIZ)Z")
    public static final boolean method1753(int arg0, class71[][][] arg1, byte arg2, int arg3, int arg4, boolean arg5) {
        byte var6 = arg5 ? 1 : (byte) (class202.field3444 & 0xFF);
        field4423++;
        if (class205.field3493[class265.field4640][arg4][arg3] == var6) {
            return false;
        }
        int var7 = 93 % ((arg2 + 37) / 48);
        if ((class138.field2461[class265.field4640][arg4][arg3] & 0x4) == 0) {
            return false;
        }
        byte var8 = 0;
        int var9 = 0;
        class205.field3508[var8] = arg4;
        int var32 = var8 + 1;
        class138.field2462[var8] = arg3;
        class205.field3493[class265.field4640][arg4][arg3] = var6;
        while (var32 != var9) {
            int var10 = class205.field3508[var9] & 0xFFFF;
            int var11 = (class205.field3508[var9] & 0xFF1D16) >> 16;
            int var12 = class138.field2462[var9] & 0xFFFF;
            int var13 = class205.field3508[var9] >> 24 & 0xFF;
            int var14 = (class138.field2462[var9] & 0xFF309E) >> 16;
            boolean var15 = false;
            boolean var16 = false;
            if ((class138.field2461[class265.field4640][var10][var12] & 0x4) == 0) {
                var16 = true;
            }
            var9 = var9 + 1 & 0xFFF;
            label225: for (int var17 = class265.field4640 + 1; var17 <= 3; var17++) {
                if ((class138.field2461[var17][var10][var12] & 0x8) == 0) {
                    if (var16 && arg1[var17][var10][var12] != null) {
                        if (arg1[var17][var10][var12].field1141 != null) {
                            int var20 = class74.method547(var11, (byte) 93);
                            if (arg1[var17][var10][var12].field1141.field3882 == var20 || arg1[var17][var10][var12].field1141.field3884 == var20) {
                                continue;
                            }
                            if (var13 != 0) {
                                int var21 = class74.method547(var13, (byte) 93);
                                if (arg1[var17][var10][var12].field1141.field3882 == var21 || arg1[var17][var10][var12].field1141.field3884 == var21) {
                                    continue;
                                }
                            }
                            if (var14 != 0) {
                                int var22 = class74.method547(var14, (byte) 93);
                                if (arg1[var17][var10][var12].field1141.field3882 == var22 || arg1[var17][var10][var12].field1141.field3884 == var22) {
                                    continue;
                                }
                            }
                        }
                        if (arg1[var17][var10][var12].field1140 != null) {
                            for (int var23 = 0; var23 < arg1[var17][var10][var12].field1149; var23++) {
                                int var24 = (int) (arg1[var17][var10][var12].field1140[var23].field260 >> 14 & 0x3FL);
                                int var25 = (int) (arg1[var17][var10][var12].field1140[var23].field260 >> 20 & 0x3L);
                                if (var24 == 21) {
                                    var24 = 19;
                                }
                                int var26 = var25 << 6 | var24;
                                if (var11 == var26 || var13 != 0 && var13 == var26 || var14 != 0 && var14 == var26) {
                                    continue label225;
                                }
                            }
                        }
                    }
                    var15 = true;
                    class71 var27 = arg1[var17][var10][var12];
                    if (var27 != null && var27.field1149 > 0) {
                        for (int var28 = 0; var28 < var27.field1149; var28++) {
                            class14 var29 = var27.field1140[var28];
                            if (var29.field268 != var29.field255 || var29.field277 != var29.field256) {
                                for (int var30 = var29.field268; var30 <= var29.field255; var30++) {
                                    for (int var31 = var29.field256; var31 <= var29.field277; var31++) {
                                        class205.field3493[var17][var30][var31] = var6;
                                    }
                                }
                            }
                        }
                    }
                    class205.field3493[var17][var10][var12] = var6;
                }
            }
            if (var15) {
                int var18 = var10 << 7;
                if (class78.field1393[class265.field4640 + 1][var10][var12] > class237.field4092[arg0]) {
                    class237.field4092[arg0] = class78.field1393[class265.field4640 + 1][var10][var12];
                }
                if (var18 < class23.field472[arg0]) {
                    class23.field472[arg0] = var18;
                } else if (var18 > class194.field3371[arg0]) {
                    class194.field3371[arg0] = var18;
                }
                int var19 = var12 << 7;
                if (var19 < class103.field1824[arg0]) {
                    class103.field1824[arg0] = var19;
                } else if (var19 > class166.field2967[arg0]) {
                    class166.field2967[arg0] = var19;
                }
            }
            if (!var16) {
                if (var10 >= 1 && class205.field3493[class265.field4640][var10 - 1][var12] != var6) {
                    class205.field3508[var32] = class67.method471(class67.method471(var10 - 1, 1179648), -754974720);
                    class138.field2462[var32] = class67.method471(var12, 1245184);
                    class205.field3493[class265.field4640][var10 - 1][var12] = var6;
                    var32 = var32 + 1 & 0xFFF;
                }
                var12++;
                if (var12 < 104) {
                    if (var10 - 1 >= 0 && class205.field3493[class265.field4640][var10 - 1][var12] != var6 && (class138.field2461[class265.field4640][var10][var12] & 0x4) == 0 && (class138.field2461[class265.field4640][var10 - 1][var12 - 1] & 0x4) == 0) {
                        class205.field3508[var32] = class67.method471(1375731712, class67.method471(var10 - 1, 1179648));
                        class138.field2462[var32] = class67.method471(var12, 1245184);
                        var32 = var32 + 1 & 0xFFF;
                        class205.field3493[class265.field4640][var10 - 1][var12] = var6;
                    }
                    if (class205.field3493[class265.field4640][var10][var12] != var6) {
                        class205.field3508[var32] = class67.method471(class67.method471(var10, 5373952), 318767104);
                        class138.field2462[var32] = class67.method471(var12, 5439488);
                        var32 = var32 + 1 & 0xFFF;
                        class205.field3493[class265.field4640][var10][var12] = var6;
                    }
                    if ((var10 + 1) < 104 && class205.field3493[class265.field4640][var10 + 1][var12] != var6 && (class138.field2461[class265.field4640][var10][var12] & 0x4) == 0 && (class138.field2461[class265.field4640][var10 + 1][var12 - 1] & 0x4) == 0) {
                        class205.field3508[var32] = class67.method471(-1845493760, class67.method471(5373952, var10 + 1));
                        class138.field2462[var32] = class67.method471(var12, 5439488);
                        var32 = var32 + 1 & 0xFFF;
                        class205.field3493[class265.field4640][var10 + 1][var12] = var6;
                    }
                }
                var12--;
                if (var10 + 1 < 104 && class205.field3493[class265.field4640][var10 + 1][var12] != var6) {
                    class205.field3508[var32] = class67.method471(1392508928, class67.method471(var10 + 1, 9568256));
                    class138.field2462[var32] = class67.method471(var12, 9633792);
                    var32 = var32 + 1 & 0xFFF;
                    class205.field3493[class265.field4640][var10 + 1][var12] = var6;
                }
                var12--;
                if (var12 >= 0) {
                    if ((var10 - 1) >= 0 && class205.field3493[class265.field4640][var10 - 1][var12] != var6 && (class138.field2461[class265.field4640][var10][var12] & 0x4) == 0 && (class138.field2461[class265.field4640][var10 - 1][var12 + 1] & 0x4) == 0) {
                        class205.field3508[var32] = class67.method471(301989888, class67.method471(13762560, var10 - 1));
                        class138.field2462[var32] = class67.method471(var12, 13828096);
                        class205.field3493[class265.field4640][var10 - 1][var12] = var6;
                        var32 = var32 + 1 & 0xFFF;
                    }
                    if (class205.field3493[class265.field4640][var10][var12] != var6) {
                        class205.field3508[var32] = class67.method471(class67.method471(13762560, var10), -1828716544);
                        class138.field2462[var32] = class67.method471(var12, 13828096);
                        class205.field3493[class265.field4640][var10][var12] = var6;
                        var32 = var32 + 1 & 0xFFF;
                    }
                    if (var10 + 1 < 104 && class205.field3493[class265.field4640][var10 + 1][var12] != var6 && (class138.field2461[class265.field4640][var10][var12] & 0x4) == 0 && (class138.field2461[class265.field4640][var10 + 1][var12 + 1] & 0x4) == 0) {
                        class205.field3508[var32] = class67.method471(-771751936, class67.method471(9568256, var10 + 1));
                        class138.field2462[var32] = class67.method471(9633792, var12);
                        class205.field3493[class265.field4640][var10 + 1][var12] = var6;
                        var32 = var32 + 1 & 0xFFF;
                    }
                }
            }
        }
        if (class237.field4092[arg0] != -1000000) {
            class237.field4092[arg0] += 10;
            class23.field472[arg0] -= 50;
            class194.field3371[arg0] += 50;
            class166.field2967[arg0] += 50;
            class103.field1824[arg0] -= 50;
        }
        return true;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILsb;Llj;)I")
    public static final int method1754(int arg0, class98 arg1, class216 arg2) {
        int var3 = arg2.field3728;
        arg2.method1461(arg1.field1694, (byte) -117);
        field4438++;
        if (arg0 == 4095) {
            arg2.field3728 += class144.field2535.method1234(arg1.field1733, 0, arg1.field1694, arg2.field3706, 10558, arg2.field3728);
            return arg2.field3728 - var3;
        } else {
            return -38;
        }
    }
}
