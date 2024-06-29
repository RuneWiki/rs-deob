import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class179 implements class262 {

    @OriginalMember(owner = "client!di", name = "c", descriptor = "[[I")
    public static int[][] field2782 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!di", name = "k", descriptor = "Z")
    public static boolean field2790 = true;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "Z")
    public static boolean field2794 = false;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!di", name = "q", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "Lvl;")
    public static class242 field2784;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "Lna;")
    public static class32 field2788;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I[B)V")
    public static final void method1210(int arg0, byte[] arg1) {
        field2795++;
        class88 var2 = new class88(arg1);
        var2.field1535 = arg1.length - 2;
        class293.field4626 = var2.method645(11596);
        class193.field3066 = new int[class293.field4626];
        class108.field1779 = new int[class293.field4626];
        class95.field1609 = new byte[class293.field4626][];
        class198.field3123 = new byte[class293.field4626][];
        class33.field501 = new boolean[class293.field4626];
        class171.field2679 = new int[class293.field4626];
        class28.field390 = new int[class293.field4626];
        var2.field1535 = arg1.length - (class293.field4626 * 8) - 7;
        class213.field3317 = var2.method645(11596);
        class130.field2056 = var2.method645(11596);
        int var3 = arg0 + (var2.method633(62) & 0xFF);
        for (int var4 = 0; var4 < class293.field4626; var4++) {
            class193.field3066[var4] = var2.method645(11596);
        }
        for (int var5 = 0; var5 < class293.field4626; var5++) {
            class108.field1779[var5] = var2.method645(11596);
        }
        for (int var6 = 0; var6 < class293.field4626; var6++) {
            class28.field390[var6] = var2.method645(11596);
        }
        for (int var7 = 0; var7 < class293.field4626; var7++) {
            class171.field2679[var7] = var2.method645(11596);
        }
        var2.field1535 = arg1.length - ((var3 - 1) * 3) - (class293.field4626 * 8) - 7;
        class94.field1601 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class94.field1601[var8] = var2.method671(112);
            if (class94.field1601[var8] == 0) {
                class94.field1601[var8] = 1;
            }
        }
        var2.field1535 = 0;
        for (int var9 = 0; var9 < class293.field4626; var9++) {
            int var10 = class171.field2679[var9];
            int var11 = class28.field390[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            boolean var14 = false;
            byte[] var15 = new byte[var12];
            class198.field3123[var9] = var15;
            class95.field1609[var9] = var13;
            int var16 = var2.method633(48);
            if ((var16 & 0x1) == 0) {
                for (int var22 = 0; var22 < var12; var22++) {
                    var15[var22] = var2.method656(-252);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var23 = 0; var23 < var12; var23++) {
                        byte var24 = var13[var23] = var2.method656(arg0 - 253);
                        var14 |= var24 != -1;
                    }
                }
            } else {
                int var17 = 0;
                label88: while (true) {
                    if (var11 <= var17) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var18 = 0;
                        while (true) {
                            if (var11 <= var18) {
                                break label88;
                            }
                            for (int var19 = 0; var19 < var10; var19++) {
                                byte var20 = var13[var11 * var19 + var18] = var2.method656(arg0 - 253);
                                var14 |= var20 != -1;
                            }
                            var18++;
                        }
                    }
                    for (int var21 = 0; var21 < var10; var21++) {
                        var15[var17 + (var11 * var21)] = var2.method656(-252);
                    }
                    var17++;
                }
            }
            class33.field501[var9] = var14;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIII)I")
    public static final int method1211(int arg0, int arg1, int arg2, int arg3) {
        field2785++;
        int var4 = arg0 / arg2;
        int var5 = arg2 - 1 & arg0;
        int var6 = arg2 + arg3 & arg1;
        int var7 = arg1 / arg2;
        int var8 = class258.method1750(var4, 1, var7);
        int var9 = class258.method1750(var4 + 1, 1, var7);
        int var10 = class258.method1750(var4, 1, var7 + 1);
        int var11 = class258.method1750(var4 + 1, 1, var7 + 1);
        int var12 = class33.method263(var5, arg2, arg3 ^ 0xFFFEFFFF, var9, var8);
        int var13 = class33.method263(var5, arg2, 65536, var11, var10);
        return class33.method263(var6, arg2, arg3 ^ 0xFFFEFFFF, var13, var12);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)V")
    public static final void method1212(int arg0, int arg1) {
        field2781++;
        class41 var2 = class221.method1492((byte) -42, arg1, arg0);
        var2.method303(arg0 ^ 0x5DA9);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIZIII)V")
    public static final void method1213(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (!arg2) {
            method1212(36, -34);
        }
        for (int var6 = arg4; var6 <= arg0 + arg4; var6++) {
            for (int var11 = arg5; var11 <= arg1 + arg5; var11++) {
                if (var11 >= 0 && var11 < 104 && var6 >= 0 && var6 < 104) {
                    class86.field1435[arg3][var11][var6] = 127;
                }
            }
        }
        for (int var7 = arg4; var7 < arg0 + arg4; var7++) {
            for (int var10 = arg5; var10 < (arg1 + arg5); var10++) {
                if (var10 >= 0 && var10 < 104 && var7 >= 0 && var7 < 104) {
                    class66.field1107[arg3][var10][var7] = arg3 > 0 ? class66.field1107[arg3 - 1][var10][var7] : 0;
                }
            }
        }
        if (arg5 > 0 && arg5 < 104) {
            for (int var8 = arg4 + 1; var8 < arg0 + arg4; var8++) {
                if (var8 >= 0 && var8 < 104) {
                    class66.field1107[arg3][arg5][var8] = class66.field1107[arg3][arg5 - 1][var8];
                }
            }
        }
        if (arg4 > 0 && arg4 < 104) {
            for (int var9 = arg5 + 1; var9 < (arg1 + arg5); var9++) {
                if (var9 >= 0 && var9 < 104) {
                    class66.field1107[arg3][var9][arg4] = class66.field1107[arg3][var9][arg4 - 1];
                }
            }
        }
        if (arg5 >= 0 && arg4 >= 0 && arg5 < 104 && arg4 < 104) {
            if (arg3 == 0) {
                if (arg5 > 0 && class66.field1107[arg3][arg5 - 1][arg4] != 0) {
                    class66.field1107[arg3][arg5][arg4] = class66.field1107[arg3][arg5 - 1][arg4];
                } else if (arg4 > 0 && class66.field1107[arg3][arg5][arg4 - 1] != 0) {
                    class66.field1107[arg3][arg5][arg4] = class66.field1107[arg3][arg5][arg4 - 1];
                } else if (arg5 > 0 && arg4 > 0 && class66.field1107[arg3][arg5 - 1][arg4 - 1] != 0) {
                    class66.field1107[arg3][arg5][arg4] = class66.field1107[arg3][arg5 - 1][arg4 - 1];
                }
            } else if (arg5 > 0 && class66.field1107[arg3 - 1][arg5 - 1][arg4] != class66.field1107[arg3][arg5 - 1][arg4]) {
                class66.field1107[arg3][arg5][arg4] = class66.field1107[arg3][arg5 - 1][arg4];
            } else if (arg4 > 0 && class66.field1107[arg3 - 1][arg5][arg4 - 1] != class66.field1107[arg3][arg5][arg4 - 1]) {
                class66.field1107[arg3][arg5][arg4] = class66.field1107[arg3][arg5][arg4 - 1];
            } else if (arg5 > 0 && arg4 > 0 && class66.field1107[arg3][arg5 - 1][arg4 - 1] != class66.field1107[arg3 - 1][arg5 - 1][arg4 - 1]) {
                class66.field1107[arg3][arg5][arg4] = class66.field1107[arg3][arg5 - 1][arg4 - 1];
            }
        }
        field2789++;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(II)Ljava/lang/String;")
    public static final String method1214(int arg0, int arg1) {
        field2793++;
        return arg1 > ~class256.field4099[arg0].length() ? class88.field1492[arg0] + class57.field945 + class256.field4099[arg0] : class88.field1492[arg0];
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(JII[I)Ljava/lang/String;")
    public final String method1215(long arg0, int arg1, int arg2, int[] arg3) {
        int var6 = 107 / ((-arg2 - 48) / 63);
        field2791++;
        if (arg1 == 0) {
            class173 var7 = class42.method312(arg3[0], -123);
            return var7.method1173(6146, (int) arg0);
        } else if (arg1 == 1 || arg1 == 10) {
            class72 var8 = class85.method602(false, (int) arg0);
            return var8.field1176;
        } else if (arg1 == 6 || arg1 == 7 || arg1 == 11) {
            return class42.method312(arg3[0], -123).method1173(6146, (int) arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(II)V")
    public static final void method1216(int arg0, int arg1) {
        if (arg1 != -23975) {
            field2794 = false;
        }
        field2780++;
        if (arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            class102.method741(-7351);
        } else if (arg0 == 2) {
            class29.method227(6080);
        } else if (arg0 == 3) {
            class206.method1385(250);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
    public static final void method1217(int arg0) {
        field2787++;
        if (class271.method1830(10272) != 2) {
            return;
        }
        byte var1 = (byte) (class121.field1938 - 4 & 0xFF);
        int var2 = class121.field1938 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < 104; var16++) {
                class30.field441[var3][var2][var16] = var1;
            }
        }
        if (arg0 < 69) {
            field2790 = false;
        }
        if (class240.field3892 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class206.field3227[var4] = -1000000;
            class190.field2949[var4] = 1000000;
            class161.field2531[var4] = 0;
            class240.field3894[var4] = 1000000;
            class27.field363[var4] = 0;
        }
        if (class259.field4130 != 1) {
            int var15 = class34.method269(class240.field3892, class293.field4624, class219.field3375, 103);
            if ((var15 - class170.field2653) >= 800 || (class181.field2827[class240.field3892][class219.field3375 >> 7][class293.field4624 >> 7] & 0x4) == 0) {
                return;
            }
            class139.method936(class219.field3375 >> 7, class293.field4624 >> 7, 1, 80, class269.field4298, false);
            return;
        }
        if ((class181.field2827[class240.field3892][class283.field4473.field2240 >> 7][class283.field4473.field2278 >> 7] & 0x4) != 0) {
            class139.method936(class283.field4473.field2240 >> 7, class283.field4473.field2278 >> 7, 0, 111, class269.field4298, false);
        }
        if (class62.field1066 >= 310) {
            return;
        }
        int var5 = class219.field3375 >> 7;
        int var6 = class293.field4624 >> 7;
        int var7 = class283.field4473.field2240 >> 7;
        int var8 = class283.field4473.field2278 >> 7;
        int var9;
        if (var7 <= var5) {
            var9 = var5 - var7;
        } else {
            var9 = var7 - var5;
        }
        int var10;
        if (var6 >= var8) {
            var10 = var6 - var8;
        } else {
            var10 = var8 - var6;
        }
        if (var9 <= var10) {
            int var11 = var9 * 65536 / var10;
            int var12 = 32768;
            while (var6 != var8) {
                if (var6 < var8) {
                    var6++;
                } else if (var8 < var6) {
                    var6--;
                }
                if ((class181.field2827[class240.field3892][var5][var6] & 0x4) != 0) {
                    class139.method936(var5, var6, 1, 47, class269.field4298, false);
                    return;
                }
                var12 += var11;
                if (var12 >= 65536) {
                    var12 -= 65536;
                    if (var5 < var7) {
                        var5++;
                    } else if (var7 < var5) {
                        var5--;
                    }
                    if ((class181.field2827[class240.field3892][var5][var6] & 0x4) != 0) {
                        class139.method936(var5, var6, 1, 47, class269.field4298, false);
                        return;
                    }
                }
            }
            return;
        }
        int var13 = var10 * 65536 / var9;
        int var14 = 32768;
        while (var5 != var7) {
            if (var5 < var7) {
                var5++;
            } else if (var7 < var5) {
                var5--;
            }
            if ((class181.field2827[class240.field3892][var5][var6] & 0x4) != 0) {
                class139.method936(var5, var6, 1, 50, class269.field4298, false);
                return;
            }
            var14 += var13;
            if (var14 >= 65536) {
                if (var6 < var8) {
                    var6++;
                } else if (var6 > var8) {
                    var6--;
                }
                var14 -= 65536;
                if ((class181.field2827[class240.field3892][var5][var6] & 0x4) != 0) {
                    class139.method936(var5, var6, 1, 36, class269.field4298, false);
                    return;
                }
            }
        }
        return;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)V")
    public static void method1218(boolean arg0) {
        field2782 = null;
        field2788 = null;
        if (!arg0) {
            field2790 = true;
        }
        field2784 = null;
    }
}
