import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class57 extends class102 {

    @OriginalMember(owner = "client!kj", name = "U", descriptor = "Lr;")
    public static class66 field978 = class93.method641(43, ")3runescape)3com");

    @OriginalMember(owner = "client!kj", name = "K", descriptor = "Lr;")
    public static class66 field968 = class93.method641(43, ":duelstake:");

    @OriginalMember(owner = "client!kj", name = "V", descriptor = "Lr;")
    public static class66 field979 = class93.method641(43, "<col=ff7000>");

    @OriginalMember(owner = "client!kj", name = "S", descriptor = "Lr;")
    public static class66 field976 = class93.method641(43, "::qa_op_test");

    @OriginalMember(owner = "client!kj", name = "I", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!kj", name = "J", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!kj", name = "L", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!kj", name = "M", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!kj", name = "P", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!kj", name = "Q", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!kj", name = "R", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!kj", name = "X", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!kj", name = "Y", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!kj", name = "ab", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!kj", name = "bb", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!kj", name = "cb", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!kj", name = "db", descriptor = "Lr;")
    public class66 field987;

    @OriginalMember(owner = "client!kj", name = "N", descriptor = "[I")
    public int[] field971;

    @OriginalMember(owner = "client!kj", name = "O", descriptor = "[I")
    public int[] field972;

    @OriginalMember(owner = "client!kj", name = "W", descriptor = "[I")
    public int[] field980;

    @OriginalMember(owner = "client!kj", name = "Z", descriptor = "[I")
    public int[] field983;

    @OriginalMember(owner = "client!kj", name = "T", descriptor = "[[B")
    public static byte[][] field977;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(II)I")
    public final int method376(int arg0, int arg1) {
        field966++;
        if (this.field972 == null) {
            return -1;
        }
        int var3 = 0;
        if (arg1 != -1) {
            this.field971 = null;
        }
        while (var3 < this.field972.length) {
            if (this.field980[var3] == arg0) {
                return this.field972[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(I)V")
    public static final void method377(int arg0) {
        field974++;
        Object var1 = class251.field4416;
        synchronized (class251.field4416) {
            if (class1.field4 == 0) {
                class95.field1835.method770((byte) -58, 5, new class211());
            }
            class1.field4 = arg0;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIIIIBIIIIZ)Z")
    public static final boolean method378(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        int var12 = -107 / ((arg6 + 27) / 58);
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var32 = 0; var32 < 104; var32++) {
                class132.field2463[var13][var32] = 0;
                class231.field4049[var13][var32] = 99999999;
            }
        }
        class132.field2463[arg9][arg4] = 99;
        int var14 = arg9;
        field985++;
        byte var15 = 0;
        class231.field4049[arg9][arg4] = 0;
        int var16 = arg4;
        int var17 = 0;
        class188.field3263[var15] = arg9;
        boolean var18 = false;
        int var33 = var15 + 1;
        class176.field3099[var15] = arg4;
        int[][] var19 = class193.field3346[class196.field3401].field2976;
        while (var33 != var17) {
            var16 = class176.field3099[var17];
            var14 = class188.field3263[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg5 == var14 && arg0 == var16) {
                var18 = true;
                break;
            }
            if (arg2 != 0) {
                if ((arg2 < 5 || arg2 == 10) && class193.field3346[class196.field3401].method1125(arg8, arg5, (byte) 108, var14, 1, arg0, var16, arg2 - 1)) {
                    var18 = true;
                    break;
                }
                if (arg2 < 10 && class193.field3346[class196.field3401].method1128(arg5, var14, arg8, (byte) -37, 1, arg0, var16, arg2 - 1)) {
                    var18 = true;
                    break;
                }
            }
            if (arg1 != 0 && arg3 != 0 && class193.field3346[class196.field3401].method1114(15856, arg0, 1, var16, arg3, var14, arg10, arg1, arg5)) {
                var18 = true;
                break;
            }
            int var31 = class231.field4049[var14][var16] + 1;
            if (var14 > 0 && class132.field2463[var14 - 1][var16] == 0 && (var19[var14 - 1][var16] & 0x12C0108) == 0) {
                class188.field3263[var33] = var14 - 1;
                class176.field3099[var33] = var16;
                var33 = var33 + 1 & 0xFFF;
                class132.field2463[var14 - 1][var16] = 2;
                class231.field4049[var14 - 1][var16] = var31;
            }
            if (var14 < 103 && class132.field2463[var14 + 1][var16] == 0 && (var19[var14 + 1][var16] & 0x12C0180) == 0) {
                class188.field3263[var33] = var14 + 1;
                class176.field3099[var33] = var16;
                var33 = var33 + 1 & 0xFFF;
                class132.field2463[var14 + 1][var16] = 8;
                class231.field4049[var14 + 1][var16] = var31;
            }
            if (var16 > 0 && class132.field2463[var14][var16 - 1] == 0 && (var19[var14][var16 - 1] & 0x12C0102) == 0) {
                class188.field3263[var33] = var14;
                class176.field3099[var33] = var16 - 1;
                class132.field2463[var14][var16 - 1] = 1;
                var33 = var33 + 1 & 0xFFF;
                class231.field4049[var14][var16 - 1] = var31;
            }
            if (var16 < 103 && class132.field2463[var14][var16 + 1] == 0 && (var19[var14][var16 + 1] & 0x12C0120) == 0) {
                class188.field3263[var33] = var14;
                class176.field3099[var33] = var16 + 1;
                class132.field2463[var14][var16 + 1] = 4;
                class231.field4049[var14][var16 + 1] = var31;
                var33 = var33 + 1 & 0xFFF;
            }
            if (var14 > 0 && var16 > 0 && class132.field2463[var14 - 1][var16 - 1] == 0 && (var19[var14 - 1][var16 - 1] & 0x12C010E) == 0 && (var19[var14 - 1][var16] & 0x12C0108) == 0 && (var19[var14][var16 - 1] & 0x12C0102) == 0) {
                class188.field3263[var33] = var14 - 1;
                class176.field3099[var33] = var16 - 1;
                var33 = var33 + 1 & 0xFFF;
                class132.field2463[var14 - 1][var16 - 1] = 3;
                class231.field4049[var14 - 1][var16 - 1] = var31;
            }
            if (var14 < 103 && var16 > 0 && class132.field2463[var14 + 1][var16 - 1] == 0 && (var19[var14 + 1][var16 - 1] & 0x12C0183) == 0 && (var19[var14 + 1][var16] & 0x12C0180) == 0 && (var19[var14][var16 - 1] & 0x12C0102) == 0) {
                class188.field3263[var33] = var14 + 1;
                class176.field3099[var33] = var16 - 1;
                var33 = var33 + 1 & 0xFFF;
                class132.field2463[var14 + 1][var16 - 1] = 9;
                class231.field4049[var14 + 1][var16 - 1] = var31;
            }
            if (var14 > 0 && var16 < 103 && class132.field2463[var14 - 1][var16 + 1] == 0 && (var19[var14 - 1][var16 + 1] & 0x12C0138) == 0 && (var19[var14 - 1][var16] & 0x12C0108) == 0 && (var19[var14][var16 + 1] & 0x12C0120) == 0) {
                class188.field3263[var33] = var14 - 1;
                class176.field3099[var33] = var16 + 1;
                var33 = var33 + 1 & 0xFFF;
                class132.field2463[var14 - 1][var16 + 1] = 6;
                class231.field4049[var14 - 1][var16 + 1] = var31;
            }
            if (var14 < 103 && var16 < 103 && class132.field2463[var14 + 1][var16 + 1] == 0 && (var19[var14 + 1][var16 + 1] & 0x12C01E0) == 0 && (var19[var14 + 1][var16] & 0x12C0180) == 0 && (var19[var14][var16 + 1] & 0x12C0120) == 0) {
                class188.field3263[var33] = var14 + 1;
                class176.field3099[var33] = var16 + 1;
                class132.field2463[var14 + 1][var16 + 1] = 12;
                class231.field4049[var14 + 1][var16 + 1] = var31;
                var33 = var33 + 1 & 0xFFF;
            }
        }
        class173.field3050 = 0;
        if (!var18) {
            if (!arg11) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg5 - var22; var23 <= arg5 + var22; var23++) {
                for (int var24 = arg0 - var22; var24 <= arg0 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class231.field4049[var23][var24] < 100) {
                        int var25 = 0;
                        if (var23 < arg5) {
                            var25 = arg5 - var23;
                        } else if (var23 > (arg5 + arg1 - 1)) {
                            var25 = -arg1 - arg5 - (-1 - var23);
                        }
                        int var26 = 0;
                        if (arg0 > var24) {
                            var26 = arg0 - var24;
                        } else if ((arg3 + arg0 - 1) < var24) {
                            var26 = var24 + 1 - arg3 - arg0;
                        }
                        int var27 = var25 * var25 + (var26 * var26);
                        if (var20 > var27 || var20 == var27 && class231.field4049[var23][var24] < var21) {
                            var14 = var23;
                            var20 = var27;
                            var21 = class231.field4049[var23][var24];
                            var16 = var24;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg9 == var14 && arg4 == var16) {
                return false;
            }
            class173.field3050 = 1;
        }
        byte var28 = 0;
        class188.field3263[var28] = var14;
        int var34 = var28 + 1;
        class176.field3099[var28] = var16;
        int var29;
        int var30 = var29 = class132.field2463[var14][var16];
        while (arg9 != var14 || arg4 != var16) {
            if (var29 != var30) {
                class188.field3263[var34] = var14;
                var29 = var30;
                class176.field3099[var34++] = var16;
            }
            if ((var30 & 0x1) != 0) {
                var16++;
            } else if ((var30 & 0x4) != 0) {
                var16--;
            }
            if ((var30 & 0x2) != 0) {
                var14++;
            } else if ((var30 & 0x8) != 0) {
                var14--;
            }
            var30 = class132.field2463[var14][var16];
        }
        if (var34 > 0) {
            class183.method1219(var34, arg7, (byte) 127);
            return true;
        } else if (arg7 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZLlh;I)V")
    private final void method379(boolean arg0, class249 arg1, int arg2) {
        field970++;
        if (arg0) {
            method383(102);
        }
        if (arg2 == 1) {
            this.field987 = arg1.method1637(127);
        } else if (arg2 == 2) {
            int var4 = arg1.method1677(-6677);
            this.field983 = new int[var4];
            this.field971 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field983[var5] = arg1.method1674(1355769544);
                int var6 = arg1.method1677(-6677);
                if (var6 == 0) {
                    this.field971[var5] = -1;
                } else {
                    this.field971[var5] = var6;
                }
            }
            return;
        } else if (arg2 == 3) {
            int var7 = arg1.method1677(-6677);
            this.field972 = new int[var7];
            this.field980 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field972[var8] = arg1.method1674(1355769544);
                int var9 = arg1.method1677(-6677);
                if (var9 == 0) {
                    this.field980[var8] = -1;
                } else {
                    this.field980[var8] = var9;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Llh;Z)V")
    public final void method380(class249 arg0, boolean arg1) {
        field986++;
        if (!arg1) {
            field979 = null;
        }
        while (true) {
            int var3 = arg0.method1677(-6677);
            if (var3 == 0) {
                return;
            }
            this.method379(false, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(II)I")
    public final int method381(int arg0, int arg1) {
        field984++;
        if (this.field983 == null) {
            return -1;
        }
        if (arg1 < 113) {
            method385(74, -95, 56);
        }
        for (int var3 = 0; var3 < this.field983.length; var3++) {
            if (this.field971[var3] == arg0) {
                return this.field983[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(B)V")
    public final void method382(byte arg0) {
        if (arg0 > -40) {
            method386(-35, (class63) null, -90, -21);
        }
        field967++;
        if (this.field972 != null) {
            for (int var2 = 0; var2 < this.field972.length; var2++) {
                this.field972[var2] = class73.method521(this.field972[var2], 32768);
            }
        }
        if (this.field983 != null) {
            for (int var3 = 0; var3 < this.field983.length; var3++) {
                this.field983[var3] = class73.method521(this.field983[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "(I)V")
    public static void method383(int arg0) {
        field979 = null;
        field978 = null;
        field976 = null;
        field968 = null;
        if (arg0 != 0) {
            method383(-25);
        }
        field977 = null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILha;IIIIII)V")
    public static final void method384(int arg0, class63 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 != 25504) {
            field977 = null;
        }
        field975++;
        if (class98.field1924) {
            class151.field2706 = 32;
        } else {
            class151.field2706 = 0;
        }
        class98.field1924 = false;
        if (class30.field452 != 0) {
            if (arg7 >= arg5 && arg7 < (arg5 + 16) && arg6 >= arg0 && arg0 + 16 > arg6) {
                arg1.field1141 -= 4;
                class215.method1385(arg1, arg4 ^ 0xFFFF9C2F);
            } else if (arg7 >= arg5 && arg7 < arg5 + 16 && arg6 >= arg0 + arg2 - 16 && arg6 < arg0 + arg2) {
                arg1.field1141 += 4;
                class215.method1385(arg1, -122);
            } else if ((arg5 - class151.field2706) <= arg7 && arg7 < (arg5 + class151.field2706 + 16) && arg6 >= arg0 + 16 && (arg0 + arg2 - 16) > arg6) {
                int var8 = (arg2 - 32) * arg2 / arg3;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg2 - var8 - 32;
                int var10 = arg6 - arg0 - (16 - -(var8 / 2));
                arg1.field1141 = (arg3 - arg2) * var10 / var9;
                class215.method1385(arg1, -114);
                class98.field1924 = true;
            }
        }
        if (class161.field2887 == 0) {
            return;
        }
        int var11 = arg1.field1215;
        if (arg7 >= (arg5 - var11) && arg6 >= arg0 && arg5 + 16 > arg7 && arg6 <= arg0 + arg2) {
            arg1.field1141 += class161.field2887 * 45;
            class215.method1385(arg1, -120);
            return;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(III)I")
    public static final int method385(int arg0, int arg1, int arg2) {
        field969++;
        class15 var3 = (class15) class84.field1631.method1381((long) arg2, -125);
        if (var3 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var4 = arg0;
            for (int var5 = 0; var5 < var3.field192.length; var5++) {
                if (var3.field195[var5] == arg1) {
                    var4 += var3.field192[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILha;II)V")
    public static final void method386(int arg0, class63 arg1, int arg2, int arg3) {
        field982++;
        if (class35.field517 != 0 && class35.field517 != 3 || !arg1.method419(2663)) {
            return;
        }
        int var4 = arg1.field1177[arg2];
        if (arg3 < var4 || arg3 > arg1.field1106[arg2] + var4) {
            return;
        }
        int var5 = arg3 - arg1.field1215 / 2;
        int var6 = arg2 - arg1.field1196 / 2;
        int var7 = class259.field4562 + class124.field2341 & 0x7FF;
        int var8 = class123.field2326[var7];
        int var9 = (class240.field4172 + 256) * var8 >> 8;
        int var10 = 53 % ((4 - arg0) / 50);
        int var11 = class123.field2314[var7];
        int var12 = (class240.field4172 + 256) * var11 >> 8;
        int var13 = var6 * var9 - (var5 * var12) >> 11;
        int var14 = var5 * var9 + var6 * var12 >> 11;
        int var15 = class207.field3595.field2053 - var13 >> 7;
        int var16 = class207.field3595.field2077 + var14 >> 7;
        if (class130.field2430 > 0 && class167.field3009[82] && class167.field3009[81]) {
            class222.method1416(class3.field39 + var16, class196.field3401, class34.field512 + var15, 24867);
            return;
        }
        boolean var17 = class10.method44(0, 0, class207.field3595.field2039[0], class207.field3595.field2086[0], 0, 0, var15, true, 0, -3, 1, var16);
        if (!var17) {
            return;
        }
        class28.field412.method1638(32, var5);
        class28.field412.method1638(32, var6);
        class28.field412.method1650(false, class259.field4562);
        class28.field412.method1638(32, 57);
        class28.field412.method1638(32, class124.field2341);
        class28.field412.method1638(32, class240.field4172);
        class28.field412.method1638(32, 89);
        class28.field412.method1650(false, class207.field3595.field2077);
        class28.field412.method1650(false, class207.field3595.field2053);
        class28.field412.method1638(32, class173.field3050);
        class28.field412.method1638(32, 63);
    }
}
