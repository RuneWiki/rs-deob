import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class37 {

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "Lce;")
    public static class126 field543 = class206.method1445(-7923, "Attaquer");

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "Lce;")
    public static class126 field548 = class206.method1445(-7923, "mapdots");

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "Lml;")
    public static class160 field546 = new class160(4);

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "Z")
    public static boolean field550 = false;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "Lcc;")
    public static class313 field545;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "[I")
    public static int[] field549;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V", line = 7)
    public static final void method201(byte arg0) {
        field542++;
        if (arg0 > -43) {
            method202(87, -1, 120, -68, 121, -55, 122, 48, -71, -37);
        }
        if (class114.method755(2) != 2) {
            return;
        }
        byte var1 = (byte) (class167.field2970 - 4 & 0xFF);
        int var2 = class167.field2970 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                class214.field3639[var3][var2][var4] = var1;
            }
        }
        if (class131.field2250 == 3) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class174.field3073[var5] = -1000000;
            class305.field5127[var5] = 1000000;
            class253.field4253[var5] = 0;
            class22.field310[var5] = 1000000;
            class300.field4973[var5] = 0;
        }
        if (class254.field4261 != 1) {
            int var16 = class174.method1265(class223.field3755, 8100, class131.field2250, class152.field2780);
            if ((var16 - class143.field2600) < 800 && (class301.field4992[class131.field2250][class152.field2780 >> 7][class223.field3755 >> 7] & 0x4) != 0) {
                class160.method1181(class152.field2780 >> 7, class297.field4940, false, 1, 1, class223.field3755 >> 7);
            }
            return;
        }
        if ((class301.field4992[class131.field2250][class286.field4744.field2461 >> 7][class286.field4744.field2487 >> 7] & 0x4) != 0) {
            class160.method1181(class286.field4744.field2461 >> 7, class297.field4940, false, 0, 1, class286.field4744.field2487 >> 7);
        }
        if (class102.field1640 >= 310) {
            return;
        }
        int var6 = class152.field2780 >> 7;
        int var7 = class223.field3755 >> 7;
        int var8 = class286.field4744.field2487 >> 7;
        int var9 = class286.field4744.field2461 >> 7;
        int var10;
        if (var6 >= var9) {
            var10 = var6 - var9;
        } else {
            var10 = var9 - var6;
        }
        int var11;
        if (var8 > var7) {
            var11 = var8 - var7;
        } else {
            var11 = var7 - var8;
        }
        if (var11 < var10) {
            int var14 = var11 * 65536 / var10;
            int var15 = 32768;
            while (var6 != var9) {
                if (var9 > var6) {
                    var6++;
                } else if (var6 > var9) {
                    var6--;
                }
                if ((class301.field4992[class131.field2250][var6][var7] & 0x4) != 0) {
                    class160.method1181(var6, class297.field4940, false, 1, 1, var7);
                    break;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    if (var7 < var8) {
                        var7++;
                    } else if (var8 < var7) {
                        var7--;
                    }
                    var15 -= 65536;
                    if ((class301.field4992[class131.field2250][var6][var7] & 0x4) != 0) {
                        class160.method1181(var6, class297.field4940, false, 1, 1, var7);
                        break;
                    }
                }
            }
            return;
        }
        int var12 = var10 * 65536 / var11;
        int var13 = 32768;
        while (var7 != var8) {
            if (var7 < var8) {
                var7++;
            } else if (var7 > var8) {
                var7--;
            }
            if ((class301.field4992[class131.field2250][var6][var7] & 0x4) != 0) {
                class160.method1181(var6, class297.field4940, false, 1, 1, var7);
                break;
            }
            var13 += var12;
            if (var13 >= 65536) {
                var13 -= 65536;
                if (var9 > var6) {
                    var6++;
                } else if (var9 < var6) {
                    var6--;
                }
                if ((class301.field4992[class131.field2250][var6][var7] & 0x4) != 0) {
                    class160.method1181(var6, class297.field4940, false, 1, 1, var7);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIIIII)V", line = 196)
    public static final void method202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg7 != 29470) {
            return;
        }
        field541++;
        if (arg3 == arg9 && arg2 == arg4 && arg1 == arg5 && arg0 == arg6) {
            class110.method718(arg8, arg6, arg4, arg9, arg5, false);
            return;
        }
        int var10 = arg9;
        int var11 = arg4;
        int var12 = arg9 * 3;
        int var13 = arg2 * 3;
        int var14 = arg3 * 3;
        int var15 = arg1 * 3;
        int var16 = arg4 * 3;
        int var17 = arg0 * 3;
        int var18 = arg5 + var14 - arg9 - var15;
        int var19 = arg6 + var13 - arg4 - var17;
        int var20 = var12 + var15 - var14 - var14;
        int var21 = var13 - var16;
        int var22 = var17 + var16 - var13 - var13;
        int var23 = var14 - var12;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var18 * var26;
            int var28 = var19 * var26;
            int var29 = var20 * var25;
            int var30 = var23 * var24;
            int var31 = var22 * var25;
            int var32 = var21 * var24;
            int var33 = (var27 + var30 + var29 >> 12) + arg9;
            int var34 = (var31 + var32 + var28 >> 12) + arg4;
            class110.method718(arg8, var34, var11, var10, var33, false);
            var11 = var34;
            var10 = var33;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)I", line = 272)
    public static final int method203(int arg0, int arg1) {
        field547++;
        return arg1 == -7622 ? arg0 >> 11 & 0x7F : 3;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(B)Lim;", line = 287)
    public static final class245 method204(byte arg0) {
        if (arg0 <= 105) {
            method201((byte) -6);
        }
        field544++;
        class245 var1 = (class245) class32.field473.method1292(true);
        if (var1 != null) {
            var1.method499((byte) 64);
            var1.method85(57);
            return var1;
        }
        class245 var2;
        do {
            var2 = (class245) class242.field4104.method1292(true);
            if (var2 == null) {
                return null;
            }
            if (var2.method1688(true) > class261.method1765(16299)) {
                return null;
            }
            var2.method499((byte) 64);
            var2.method85(54);
        } while ((Long.MIN_VALUE & var2.field202) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(B)V", line = 349)
    public static void method205(byte arg0) {
        field549 = null;
        field548 = null;
        field543 = null;
        field545 = null;
        field546 = null;
        if (arg0 != -61) {
            method205((byte) 93);
        }
    }
}
