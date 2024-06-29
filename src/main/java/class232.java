import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public abstract class class232 {

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "Lsb;")
    public static class214 field4005 = new class214(64);

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "I")
    public static int field4008 = -1;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "Ljd;")
    private static class85 field4011 = class221.method1499("red:", (byte) -70);

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
    public static int field4007 = 0;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "[I")
    public static int[] field4010 = new int[5];

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "Ljd;")
    public static class85 field4015 = field4011;

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "I")
    public static int field4017 = 0;

    @OriginalMember(owner = "client!qf", name = "y", descriptor = "Ljd;")
    private static class85 field4018 = class221.method1499("http:)4)4advert)3runescape)3com)4banner)3ws?size=729", (byte) -43);

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "Ljd;")
    public static class85 field4019 = field4018;

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "Ljd;")
    public static class85 field4016 = field4011;

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "Ljd;")
    private static class85 field4014 = class221.method1499("Unable to find ", (byte) 105);

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "Ljd;")
    public static class85 field4009 = field4014;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public int field3994;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    public int field4001;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public int field4003;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
    public int field4004;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "I")
    public int field4012;

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!qf", name = "A", descriptor = "I")
    public int field4020;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V")
    public static final void method1549(byte arg0) {
        class207.field3618.method483(-24260, 98);
        for (class129 var1 = (class129) class121.field2126.method1392((byte) -120); var1 != null; var1 = (class129) class121.field2126.method1399(-123)) {
            if (var1.field2263 == 0) {
                class244.method1654((byte) 64, true, var1);
            }
        }
        class186.field3194++;
        field4002++;
        if (arg0 < 3) {
            field4019 = null;
        }
        if (class47.field836 != null) {
            class16.method120((byte) -127, class47.field836);
            class47.field836 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)[Lfg;")
    public static final class12[] method1550(boolean arg0) {
        field4006++;
        class12[] var1 = new class12[class95.field1741];
        if (arg0) {
            return null;
        }
        for (int var2 = 0; var2 < class95.field1741; var2++) {
            int var3 = class30.field443[var2] * class244.field4165[var2];
            byte[] var4 = class178.field3060[var2];
            if (class37.field577[var2]) {
                int[] var7 = new int[var3];
                byte[] var8 = class122.field2139[var2];
                for (int var9 = 0; var9 < var3; var9++) {
                    var7[var9] = class75.method528(class2.field20[class135.method899(255, var4[var9])], class135.method899(255, var8[var9]) << 24);
                }
                var1[var2] = new class9(class251.field4331, class229.field3961, class246.field4200[var2], class121.field2134[var2], class30.field443[var2], class244.field4165[var2], var7);
            } else {
                int[] var5 = new int[var3];
                for (int var6 = 0; var6 < var3; var6++) {
                    var5[var6] = class2.field20[class135.method899(255, var4[var6])];
                }
                var1[var2] = new class266(class251.field4331, class229.field3961, class246.field4200[var2], class121.field2134[var2], class30.field443[var2], class244.field4165[var2], var5);
            }
        }
        class47.method322(-29493);
        return var1;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIBI)V")
    public static final void method1551(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3999++;
        class179.method1216(arg0, arg4, arg0 + arg1, arg4 - -arg2);
        class179.method1222(arg0, arg4, arg1, arg2, 0);
        if (class56.field976 < 100) {
            return;
        }
        if (class30.field449 == null || class30.field449.field184 != arg1 || class30.field449.field183 != arg2) {
            class266 var5 = new class266(arg1, arg2);
            class179.method1227(var5.field4745, arg1, arg2);
            class240.method1631(0, 0, class79.field1458, 0, class100.field1793, 0, arg2, arg1, -116);
            class30.field449 = var5;
            class230.field3972.method1511((byte) 34);
        }
        class30.field449.method50(arg0, arg4);
        int var6 = class18.field264 * arg2 / class79.field1458 + arg4;
        int var7 = class208.field3632 * arg1 / class100.field1793 + arg0;
        int var8 = class37.field571 * arg1 / class100.field1793;
        int var9 = class228.field3960 * arg2 / class79.field1458;
        if (arg3 != -111) {
            method1557(74);
        }
        class179.method1210(var7, var6, var8, var9, 16711680, 128);
        class179.method1217(var7, var6, var8, var9, 16711680);
        if (class268.field4776 <= 0 || (class268.field4776 % 10) >= 5) {
            return;
        }
        for (class125 var10 = (class125) class151.field2549.method110(64); var10 != null; var10 = (class125) class151.field2549.method117((byte) 60)) {
            if (class61.field1115 == var10.field2203) {
                int var11 = var10.field2202 * arg2 / class79.field1458 + arg4;
                int var12 = var10.field2206 * arg1 / class100.field1793 + arg0;
                class179.method1222(var12 - 2, var11 - 2, 4, 4, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)V")
    public abstract void method710(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)V")
    public abstract void method713(int arg0, int arg1);

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)[Lee;")
    public static final class266[] method1552(int arg0) {
        field3998++;
        class266[] var1 = new class266[class95.field1741];
        if (arg0 != 2) {
            field4015 = null;
        }
        for (int var2 = 0; var2 < class95.field1741; var2++) {
            int var3 = class30.field443[var2] * class244.field4165[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class178.field3060[var2];
            for (int var6 = 0; var6 < var3; var6++) {
                var4[var6] = class2.field20[class135.method899(var5[var6], 255)];
            }
            var1[var2] = new class266(class251.field4331, class229.field3961, class246.field4200[var2], class121.field2134[var2], class30.field443[var2], class244.field4165[var2], var4);
        }
        class47.method322(-29493);
        return var1;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lbc;IIIIIIZ)V")
    public static final void method1553(class170 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field2932.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field2932[var9] - class221.field3877;
            int var23 = arg0.field2922[var9] - class34.field528;
            int var24 = arg0.field2929[var9] - class237.field4097;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field2930 != null) {
                class170.field2939[var9] = var25;
                class170.field2937[var9] = var28;
                class170.field2938[var9] = var29;
            }
            class170.field2925[var9] = (var25 << 9) / var29 + class173.field2996;
            class170.field2942[var9] = (var28 << 9) / var29 + class173.field3001;
        }
        class173.field2993 = 0;
        int var10 = arg0.field2921.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field2921[var11];
            int var13 = arg0.field2927[var11];
            int var14 = arg0.field2935[var11];
            int var15 = class170.field2925[var12];
            int var16 = class170.field2925[var13];
            int var17 = class170.field2925[var14];
            int var18 = class170.field2942[var12];
            int var19 = class170.field2942[var13];
            int var20 = class170.field2942[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class28.field436 && method1559(class261.field4620 + class173.field2996, class173.field3001 + class163.field2814, var18, var19, var20, var15, var16, var17)) {
                    class247.field4227 = arg5;
                    class49.field859 = arg6;
                }
                if (!arg7) {
                    class173.field2994 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class173.field2985 || var16 > class173.field2985 || var17 > class173.field2985) {
                        class173.field2994 = true;
                    }
                    if (arg0.field2930 == null || arg0.field2930[var11] == -1) {
                        if (arg0.field2934[var11] != 12345678) {
                            class173.method1160(var18, var19, var20, var15, var16, var17, arg0.field2934[var11], arg0.field2933[var11], arg0.field2940[var11]);
                        }
                    } else if (!class180.field3093) {
                        int var21 = class173.field2987.method681((byte) 78, arg0.field2930[var11]);
                        class173.method1160(var18, var19, var20, var15, var16, var17, class187.method1287(var21, arg0.field2934[var11]), class187.method1287(var21, arg0.field2933[var11]), class187.method1287(var21, arg0.field2940[var11]));
                    } else if (arg0.field2926) {
                        class173.method1156(var18, var19, var20, var15, var16, var17, arg0.field2934[var11], arg0.field2933[var11], arg0.field2940[var11], class170.field2939[0], class170.field2939[1], class170.field2939[3], class170.field2937[0], class170.field2937[1], class170.field2937[3], class170.field2938[0], class170.field2938[1], class170.field2938[3], arg0.field2930[var11]);
                    } else {
                        class173.method1156(var18, var19, var20, var15, var16, var17, arg0.field2934[var11], arg0.field2933[var11], arg0.field2940[var11], class170.field2939[var12], class170.field2939[var13], class170.field2939[var14], class170.field2937[var12], class170.field2937[var13], class170.field2937[var14], class170.field2938[var12], class170.field2938[var13], class170.field2938[var14], arg0.field2930[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIILqb;JZ)V")
    public static final void method1554(int arg0, int arg1, int arg2, int arg3, class56 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class93 var8 = new class93();
        var8.field1700 = arg4;
        var8.field1701 = arg1 * 128 + 64;
        var8.field1704 = arg2 * 128 + 64;
        var8.field1698 = arg3;
        var8.field1708 = arg5;
        if (class99.field1780[arg0][arg1][arg2] == null) {
            class99.field1780[arg0][arg1][arg2] = new class208(arg0, arg1, arg2);
        }
        class99.field1780[arg0][arg1][arg2].field3653 = var8;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIILah;I)V")
    public static final void method1555(int arg0, int arg1, int arg2, class263 arg3, int arg4) {
        field3996++;
        if (class115.field2058 >= 400) {
            return;
        }
        if (arg3.field4695 != null) {
            arg3 = arg3.method1794((byte) 87);
        }
        if (arg3 == null) {
            return;
        }
        if (arg2 != 16426) {
            field4005 = null;
        }
        if (!arg3.field4696) {
            return;
        }
        class85 var5 = arg3.field4689;
        if (arg3.field4655 != 0) {
            var5 = class172.method1150(new class85[] { var5, class273.method1862(class22.field308.field760, 55, arg3.field4655), class220.field3867, class272.field4818, class68.method451(arg3.field4655, -12572), class222.field3892 }, 0);
        }
        if (class70.field1303 == 1) {
            class108.method747((long) arg1, (byte) -99, (short) 28, arg0, arg4, class172.method1150(new class85[] { class144.field2472, class34.field509, var5 }, 0), class77.field1425);
            class273.field4822++;
        } else if (!class12.field193) {
            class105.field1839++;
            class85[] var6 = arg3.field4701;
            if (class254.field4388) {
                var6 = class256.method1775(arg2 - 16421, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && (class18.field267 != 0 || !var6[var7].method582(class213.field3749, -84))) {
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 30;
                        }
                        class16.field237++;
                        if (var7 == 1) {
                            var8 = 3;
                        }
                        if (var7 == 2) {
                            var8 = 29;
                        }
                        if (var7 == 3) {
                            var8 = 24;
                        }
                        if (var7 == 4) {
                            var8 = 14;
                        }
                        class108.method747((long) arg1, (byte) -96, var8, arg0, arg4, class172.method1150(new class85[] { class208.field3639, var5 }, 0), var6[var7]);
                    }
                }
            }
            if (class18.field267 == 0 && var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method582(class213.field3749, -70)) {
                        class127.field2232++;
                        short var10 = 0;
                        short var11 = 0;
                        if (var9 == 0) {
                            var10 = 30;
                        }
                        if (arg3.field4655 > class22.field308.field760) {
                            var11 = 2000;
                        }
                        if (var9 == 1) {
                            var10 = 3;
                        }
                        if (var9 == 2) {
                            var10 = 29;
                        }
                        if (var9 == 3) {
                            var10 = 24;
                        }
                        if (var9 == 4) {
                            var10 = 14;
                        }
                        if (var10 != 0) {
                            var10 += var11;
                        }
                        class108.method747((long) arg1, (byte) -97, var10, arg0, arg4, class172.method1150(new class85[] { class208.field3639, var5 }, 0), var6[var9]);
                    }
                }
            }
            class108.method747((long) arg1, (byte) -88, (short) 1002, arg0, arg4, class172.method1150(new class85[] { class208.field3639, var5 }, arg2 ^ 0x402A), class219.field3859);
        } else if ((class227.field3946 & 0x2) == 2) {
            class108.method747((long) arg1, (byte) -108, (short) 47, arg0, arg4, class172.method1150(new class85[] { class30.field452, class34.field509, var5 }, 0), class150.field2542);
            class180.field3073++;
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(B)V")
    public static final void method1556(byte arg0) {
        if (arg0 > -23) {
            method1557(58);
        }
        class18.field255.method1262(17244);
        class132.field2303.method1262(17244);
        field4013++;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V")
    public static void method1557(int arg0) {
        field4010 = null;
        field4019 = null;
        field4009 = null;
        field4016 = null;
        field4014 = null;
        field4005 = null;
        field4015 = null;
        field4018 = null;
        if (arg0 <= 103) {
            field4007 = 15;
        }
        field4011 = null;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(II)I")
    public static final int method1558(int arg0, int arg1) {
        int var2 = -70 / ((-arg1 - 40) / 53);
        field4000++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1559(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IZ)I")
    public static final int method1560(int arg0, boolean arg1) {
        int var2 = ((arg0 & 0xAAAAAAAA) >>> 1) + (arg0 & 0x55555555);
        field3997++;
        int var3 = (var2 & 0x33333333) + (var2 >>> 2 & 0xF3333333);
        if (arg1) {
            field4007 = 61;
        }
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }
}
