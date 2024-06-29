import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class278 extends class88 {

    @OriginalMember(owner = "client!cj", name = "P", descriptor = "[I")
    public static int[] field4421 = new int[4];

    @OriginalMember(owner = "client!cj", name = "F", descriptor = "Ljava/lang/String;")
    public static String field4411 = "Loaded interfaces";

    @OriginalMember(owner = "client!cj", name = "W", descriptor = "I")
    public static int field4428 = 0;

    @OriginalMember(owner = "client!cj", name = "X", descriptor = "I")
    public static int field4429 = 0;

    @OriginalMember(owner = "client!cj", name = "V", descriptor = "Ljava/util/Random;")
    public static Random field4427 = new Random();

    @OriginalMember(owner = "client!cj", name = "E", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!cj", name = "H", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!cj", name = "I", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!cj", name = "J", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!cj", name = "K", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!cj", name = "L", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!cj", name = "N", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!cj", name = "O", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!cj", name = "Q", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!cj", name = "R", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!cj", name = "S", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!cj", name = "U", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!cj", name = "Y", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!cj", name = "Z", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!cj", name = "G", descriptor = "Lsb;")
    private class110 field4412;

    @OriginalMember(owner = "client!cj", name = "T", descriptor = "Leh;")
    public static class137 field4425;

    @OriginalMember(owner = "client!cj", name = "M", descriptor = "[Ljava/lang/String;")
    public static String[] field4418;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIZ)Ljava/lang/String;")
    public static final String method1850(int arg0, int arg1, int arg2, boolean arg3) {
        field4414++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        } else if (arg3 && arg2 >= 0) {
            int var4 = 2;
            if (arg1 <= 107) {
                return null;
            }
            int var5 = arg2 / arg0;
            while (var5 != 0) {
                var5 /= arg0;
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg2;
                arg2 /= arg0;
                int var9 = var8 - (arg0 * arg2);
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILpd;Z)V")
    private final void method1851(int arg0, class96 arg1, boolean arg2) {
        field4417++;
        if (arg0 == 249) {
            int var4 = arg1.method584(255);
            if (this.field4412 == null) {
                int var5 = class137.method923(-121, var4);
                this.field4412 = new class110(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg1.method584(255) == 1;
                int var8 = arg1.method598(-1235752501);
                class237 var9;
                if (var7) {
                    var9 = new class207(arg1.method588(false));
                } else {
                    var9 = new class122(arg1.method597(-1197332568));
                }
                this.field4412.method707((long) var8, var9, (byte) 120);
            }
        }
        if (!arg2) {
            this.field4412 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIII)I")
    public static final int method1852(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4430++;
        int var5 = 65536 - class174.field2759[arg4 * 1024 / arg1] >> 1;
        if (arg2 <= 11) {
            field4410 = 86;
        }
        return ((65536 - var5) * arg0 >> 16) + (arg3 * var5 >> 16);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZI[[[Ltl;IIZ)Z")
    public static final boolean method1853(boolean arg0, int arg1, class246[][][] arg2, int arg3, int arg4, boolean arg5) {
        field4431++;
        byte var6 = arg5 ? 1 : (byte) (class130.field2085 & 0xFF);
        if (class18.field218[class244.field4011][arg3][arg1] == var6) {
            return false;
        } else if ((class117.field1664[class244.field4011][arg3][arg1] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class31.field422[var7] = arg3;
            int var31 = var7 + 1;
            class240.field3959[var7] = arg1;
            int var8 = 0;
            class18.field218[class244.field4011][arg3][arg1] = var6;
            while (var31 != var8) {
                int var9 = class31.field422[var8] & 0xFFFF;
                int var10 = (class31.field422[var8] & 0xFF6B53) >> 16;
                int var11 = class31.field422[var8] >> 24 & 0xFF;
                int var12 = class240.field3959[var8] >> 16 & 0xFF;
                boolean var13 = false;
                int var14 = class240.field3959[var8] & 0xFFFF;
                if ((class117.field1664[class244.field4011][var9][var14] & 0x4) == 0) {
                    var13 = true;
                }
                var8 = var8 + 1 & 0xFFF;
                boolean var15 = false;
                label229: for (int var16 = class244.field4011 + 1; var16 <= 3; var16++) {
                    if ((class117.field1664[var16][var9][var14] & 0x8) == 0) {
                        if (var13 && arg2[var16][var9][var14] != null) {
                            if (arg2[var16][var9][var14].field4046 != null) {
                                int var19 = class94.method524(false, var10);
                                if (arg2[var16][var9][var14].field4046.field2981 == var19 || arg2[var16][var9][var14].field4046.field2987 == var19) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var20 = class94.method524(false, var11);
                                    if (arg2[var16][var9][var14].field4046.field2981 == var20 || arg2[var16][var9][var14].field4046.field2987 == var20) {
                                        continue;
                                    }
                                }
                                if (var12 != 0) {
                                    int var21 = class94.method524(false, var12);
                                    if (arg2[var16][var9][var14].field4046.field2981 == var21 || arg2[var16][var9][var14].field4046.field2987 == var21) {
                                        continue;
                                    }
                                }
                            }
                            if (arg2[var16][var9][var14].field4038 != null) {
                                for (int var22 = 0; var22 < arg2[var16][var9][var14].field4044; var22++) {
                                    int var23 = (int) (arg2[var16][var9][var14].field4038[var22].field244 >> 14 & 0x3FL);
                                    if (var23 == 21) {
                                        var23 = 19;
                                    }
                                    int var24 = (int) (arg2[var16][var9][var14].field4038[var22].field244 >> 20 & 0x3L);
                                    int var25 = var24 << 6 | var23;
                                    if (var10 == var25 || var11 != 0 && var11 == var25 || var12 != 0 && var12 == var25) {
                                        continue label229;
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class246 var26 = arg2[var16][var9][var14];
                        if (var26 != null && var26.field4044 > 0) {
                            for (int var27 = 0; var27 < var26.field4044; var27++) {
                                class19 var28 = var26.field4038[var27];
                                if (var28.field240 != var28.field239 || var28.field235 != var28.field233) {
                                    for (int var29 = var28.field240; var29 <= var28.field239; var29++) {
                                        for (int var30 = var28.field235; var30 <= var28.field233; var30++) {
                                            class18.field218[var16][var29][var30] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class18.field218[var16][var9][var14] = var6;
                    }
                }
                if (var15) {
                    if (class297.field4696[arg4] < class17.field209[class244.field4011 + 1][var9][var14]) {
                        class297.field4696[arg4] = class17.field209[class244.field4011 + 1][var9][var14];
                    }
                    int var17 = var14 << 7;
                    int var18 = var9 << 7;
                    if (class71.field904[arg4] > var18) {
                        class71.field904[arg4] = var18;
                    } else if (var18 > class242.field3988[arg4]) {
                        class242.field3988[arg4] = var18;
                    }
                    if (var17 < class92.field1163[arg4]) {
                        class92.field1163[arg4] = var17;
                    } else if (var17 > class128.field2057[arg4]) {
                        class128.field2057[arg4] = var17;
                    }
                }
                if (!var13) {
                    if (var9 >= 1 && class18.field218[class244.field4011][var9 - 1][var14] != var6) {
                        class31.field422[var31] = class154.method1048(class154.method1048(1179648, var9 - 1), -754974720);
                        class240.field3959[var31] = class154.method1048(var14, 1245184);
                        var31 = var31 + 1 & 0xFFF;
                        class18.field218[class244.field4011][var9 - 1][var14] = var6;
                    }
                    var14++;
                    if (var14 < 104) {
                        if (var9 - 1 >= 0 && class18.field218[class244.field4011][var9 - 1][var14] != var6 && (class117.field1664[class244.field4011][var9][var14] & 0x4) == 0 && (class117.field1664[class244.field4011][var9 - 1][var14 - 1] & 0x4) == 0) {
                            class31.field422[var31] = class154.method1048(1375731712, class154.method1048(1179648, var9 - 1));
                            class240.field3959[var31] = class154.method1048(1245184, var14);
                            class18.field218[class244.field4011][var9 - 1][var14] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class18.field218[class244.field4011][var9][var14] != var6) {
                            class31.field422[var31] = class154.method1048(class154.method1048(var9, 5373952), 318767104);
                            class240.field3959[var31] = class154.method1048(var14, 5439488);
                            var31 = var31 + 1 & 0xFFF;
                            class18.field218[class244.field4011][var9][var14] = var6;
                        }
                        if (var9 + 1 < 104 && class18.field218[class244.field4011][var9 + 1][var14] != var6 && (class117.field1664[class244.field4011][var9][var14] & 0x4) == 0 && (class117.field1664[class244.field4011][var9 + 1][var14 - 1] & 0x4) == 0) {
                            class31.field422[var31] = class154.method1048(class154.method1048(var9 + 1, 5373952), -1845493760);
                            class240.field3959[var31] = class154.method1048(var14, 5439488);
                            var31 = var31 + 1 & 0xFFF;
                            class18.field218[class244.field4011][var9 + 1][var14] = var6;
                        }
                    }
                    var14--;
                    if (var9 + 1 < 104 && class18.field218[class244.field4011][var9 + 1][var14] != var6) {
                        class31.field422[var31] = class154.method1048(1392508928, class154.method1048(var9 + 1, 9568256));
                        class240.field3959[var31] = class154.method1048(var14, 9633792);
                        var31 = var31 + 1 & 0xFFF;
                        class18.field218[class244.field4011][var9 + 1][var14] = var6;
                    }
                    var14--;
                    if (var14 >= 0) {
                        if (var9 - 1 >= 0 && class18.field218[class244.field4011][var9 - 1][var14] != var6 && (class117.field1664[class244.field4011][var9][var14] & 0x4) == 0 && (class117.field1664[class244.field4011][var9 - 1][var14 + 1] & 0x4) == 0) {
                            class31.field422[var31] = class154.method1048(301989888, class154.method1048(var9 - 1, 13762560));
                            class240.field3959[var31] = class154.method1048(13828096, var14);
                            class18.field218[class244.field4011][var9 - 1][var14] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class18.field218[class244.field4011][var9][var14] != var6) {
                            class31.field422[var31] = class154.method1048(class154.method1048(13762560, var9), -1828716544);
                            class240.field3959[var31] = class154.method1048(var14, 13828096);
                            var31 = var31 + 1 & 0xFFF;
                            class18.field218[class244.field4011][var9][var14] = var6;
                        }
                        if (var9 + 1 < 104 && class18.field218[class244.field4011][var9 + 1][var14] != var6 && (class117.field1664[class244.field4011][var9][var14] & 0x4) == 0 && (class117.field1664[class244.field4011][var9 + 1][var14 + 1] & 0x4) == 0) {
                            class31.field422[var31] = class154.method1048(-771751936, class154.method1048(9568256, var9 + 1));
                            class240.field3959[var31] = class154.method1048(9633792, var14);
                            var31 = var31 + 1 & 0xFFF;
                            class18.field218[class244.field4011][var9 + 1][var14] = var6;
                        }
                    }
                }
            }
            if (!arg0) {
                field4411 = null;
            }
            if (class297.field4696[arg4] != -1000000) {
                class297.field4696[arg4] += 10;
                class71.field904[arg4] -= 50;
                class242.field3988[arg4] += 50;
                class128.field2057[arg4] += 50;
                class92.field1163[arg4] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)I")
    public static final int method1854(boolean arg0) {
        field4419++;
        if (arg0) {
            method1856((byte) 95);
        }
        return class116.field1648.method1698(0);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)I")
    public final int method1855(int arg0, int arg1, int arg2) {
        field4416++;
        if (this.field4412 == null) {
            return arg0;
        } else if (arg1 == 7383) {
            class122 var4 = (class122) this.field4412.method708((long) arg2, arg1 ^ 0xFFFFE32D);
            return var4 == null ? arg0 : var4.field1733;
        } else {
            return -62;
        }
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(B)V")
    public static final void method1856(byte arg0) {
        field4424++;
        if (arg0 <= 66) {
            field4410 = -91;
        }
        class274.field4382.method1701((byte) 102);
        class137.field2174.method1701((byte) 77);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1857(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4420++;
        int var8 = class256.method1750(121, arg0, class117.field1656, class132.field2105);
        int var9 = class256.method1750(40, arg6, class117.field1656, class132.field2105);
        int var10 = class256.method1750(118, arg1, class116.field1653, class114.field1634);
        int var11 = class256.method1750(arg3 + 121, arg4, class116.field1653, class114.field1634);
        int var12 = class256.method1750(arg3 + 101, arg0 + arg7, class117.field1656, class132.field2105);
        int var13 = class256.method1750(83, arg6 - arg7, class117.field1656, class132.field2105);
        if (arg3 != 2) {
            method1857(-55, 59, -117, -99, -7, -93, -74, 85);
        }
        for (int var14 = var8; var14 < var12; var14++) {
            class78.method433(var11, var10, class14.field186[var14], arg5, (byte) 123);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class78.method433(var11, var10, class14.field186[var15], arg5, (byte) 123);
        }
        int var16 = class256.method1750(111, arg1 + arg7, class116.field1653, class114.field1634);
        int var17 = class256.method1750(76, arg4 - arg7, class116.field1653, class114.field1634);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class14.field186[var18];
            class78.method433(var16, var10, var19, arg5, (byte) 123);
            class78.method433(var17, var16, var19, arg2, (byte) 123);
            class78.method433(var11, var17, var19, arg5, (byte) 123);
        }
    }

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "(I)V")
    public static final void method1858(int arg0) {
        field4413++;
        if (!class247.field4076) {
            return;
        }
        class123 var1 = class247.method1714(class236.field3913, class236.field3911, arg0 ^ arg0);
        if (var1 != null && var1.field1776 != null) {
            class156 var2 = new class156();
            var2.field2512 = var1.field1776;
            var2.field2516 = var1;
            class296.method1985(var2, arg0 ^ 0xFFFCF2BF);
        }
        class247.field4076 = false;
        class136.field2157 = -1;
        class129.method875((byte) -21, var1);
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(II)Ljava/lang/String;")
    public static final String method1859(int arg0, int arg1) {
        field4423++;
        if (arg0 == 1) {
            return arg1 < 999999999 ? Integer.toString(arg1) : "*";
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IBLjava/lang/String;)Ljava/lang/String;")
    public final String method1860(int arg0, byte arg1, String arg2) {
        field4415++;
        if (this.field4412 == null) {
            return arg2;
        } else {
            int var4 = 21 % ((-arg1 - 21) / 59);
            class207 var5 = (class207) this.field4412.method708((long) arg0, -4);
            return var5 == null ? arg2 : var5.field3312;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILpd;)V")
    public final void method1861(int arg0, class96 arg1) {
        while (true) {
            int var3 = arg1.method584(255);
            if (var3 == 0) {
                if (arg0 < 34) {
                    field4418 = null;
                }
                field4422++;
                return;
            }
            this.method1851(var3, arg1, true);
        }
    }

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "(B)V")
    public static void method1862(byte arg0) {
        field4425 = null;
        field4421 = null;
        field4411 = null;
        field4427 = null;
        if (arg0 != 9) {
            method1854(false);
        }
        field4418 = null;
    }
}
