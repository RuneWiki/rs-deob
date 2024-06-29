import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class162 extends class175 {

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "Lvd;")
    private static class222 field3084 = class212.method1357("Loading fonts )2 ", 10731);

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
    public static int field3086 = 0;

    @OriginalMember(owner = "client!pd", name = "D", descriptor = "Lvd;")
    public static class222 field3092 = field3084;

    @OriginalMember(owner = "client!pd", name = "B", descriptor = "Lvd;")
    public static class222 field3090 = class212.method1357("", 10731);

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
    public static int field3088 = 0;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!pd", name = "C", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)V")
    public static final void method1017(int arg0) {
        field3085++;
        if (arg0 != 7951) {
            field3092 = null;
        }
        for (class21 var1 = (class21) class208.field3863.method1517(0); var1 != null; var1 = (class21) class208.field3863.method1522(-1)) {
            int var2 = var1.field493;
            if (class27.method232(var2, -7754)) {
                boolean var3 = true;
                class13[] var4 = class220.field4066[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field323;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field2555;
                    class13 var7 = class10.method92(923, var6);
                    if (var7 != null) {
                        class80.method527(var7, 31702);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "([IIIIII)V")
    public static final void method1018(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class121 var6 = class204.field3800[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class140 var7 = var6.field2313;
        if (var7 != null) {
            int var8 = var7.field2707;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class61 var10 = var6.field2288;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field1124;
        int var12 = var10.field1141;
        int var13 = var10.field1133;
        int var14 = var10.field1127;
        int[] var15 = class146.field2789[var11];
        int[] var16 = class96.field1796[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BII)I")
    public static final int method1019(byte arg0, int arg1, int arg2) {
        field3083++;
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            arg2 *= arg2;
            arg1 >>= 0x1;
        }
        if (arg1 == 1) {
            return arg2 * var3;
        } else {
            if (arg0 > -98) {
                method1022(-44);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)V")
    public static final void method1020(int arg0) {
        class42.field895.field2053 = 0;
        class202.field3690 = 0;
        field3089++;
        class209.field3885 = 0;
        class173.field3247 = -1;
        class70.field1306 = 0;
        class21.field505.field2053 = 0;
        class131.field2537 = 0;
        class68.field1277 = 0;
        class172.field3227 = 0;
        class202.field3703 = -1;
        class13.field266 = -1;
        if (arg0 > -9) {
            field3086 = -18;
        }
        class38.field834 = false;
        class46.field937 = -1;
        for (int var1 = 0; var1 < class54.field1024.length; var1++) {
            if (class54.field1024[var1] != null) {
                class54.field1024[var1].field1330 = -1;
            }
        }
        for (int var2 = 0; var2 < class202.field3696.length; var2++) {
            if (class202.field3696[var2] != null) {
                class202.field3696[var2].field1330 = -1;
            }
        }
        class132.method825((byte) -101);
        class55.method410(30, 0);
        for (int var3 = 0; var3 < 100; var3++) {
            class93.field1746[var3] = true;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIII)V")
    public static final void method1021(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class53.method396(arg2, arg4, arg2 + arg3, arg1 + arg4);
        class199.method1264();
        class228.field4287++;
        int var5 = -78 % ((-arg0 - 17) / 57);
        field3091++;
        class129.method813(true, 0);
        class10.method93(true, (byte) 90);
        class129.method813(false, 0);
        class10.method93(false, (byte) 90);
        class68.method463((byte) -93);
        class132.method824(-5);
        if (!class44.field928) {
            int var6 = class140.field2697;
            if (var6 < class213.field3950 / 256) {
                var6 = class213.field3950 / 256;
            }
            if (class204.field3748[4] && class231.field4337[4] + 128 > var6) {
                var6 = class231.field4337[4] + 128;
            }
            int var7 = class84.field1598 + class116.field2218 & 0x7FF;
            class217.method1381(var7, class71.method482(class17.field432.field1360, class17.field432.field1353, class217.field4036, (byte) 123) - 50, class229.field4312, var6 * 3 + 600, var6, class1.field8, -76);
        }
        int var8;
        if (class44.field928) {
            var8 = class166.method1068((byte) -95);
        } else {
            var8 = method1022(-126);
        }
        int var9 = class118.field2243;
        int var10 = class211.field3923;
        int var11 = class110.field2059;
        int var12 = class54.field1021;
        int var13 = class11.field213;
        for (int var14 = 0; var14 < 5; var14++) {
            if (class204.field3748[var14]) {
                int var17 = (int) ((double) (class167.field3196[var14] * 2 + 1) * Math.random() + Math.sin((double) class84.field1601[var14] / 100.0D * (double) class92.field1731[var14]) * (double) class231.field4337[var14] - (double) class167.field3196[var14]);
                if (var14 == 1) {
                    class118.field2243 += var17;
                }
                if (var14 == 2) {
                    class110.field2059 += var17;
                }
                if (var14 == 4) {
                    class11.field213 += var17;
                    if (class11.field213 < 128) {
                        class11.field213 = 128;
                    }
                    if (class11.field213 > 383) {
                        class11.field213 = 383;
                    }
                }
                if (var14 == 0) {
                    class211.field3923 += var17;
                }
                if (var14 == 3) {
                    class54.field1021 = class54.field1021 + var17 & 0x7FF;
                }
            }
        }
        int var15 = class94.field1769;
        int var16 = class137.field2651;
        if (arg2 <= var15 && arg2 + arg3 > var15 && arg4 <= var16 && arg1 + arg4 > var16) {
            class63.field1163 = class137.field2651 - arg4;
            class209.field3883 = class94.field1769 - arg2;
            class205.field3829 = 0;
            class111.field2086 = true;
        } else {
            class111.field2086 = false;
            class205.field3829 = 0;
        }
        class153.method980((byte) 82);
        class53.method399(arg2, arg4, arg3, arg1, 0);
        class145.method915(class211.field3923, class118.field2243, class110.field2059, class11.field213, class54.field1021, var8);
        class153.method980((byte) -111);
        class9.method86();
        class70.method478(arg3, arg2, arg4, (byte) 68, arg1);
        class20.method184(arg2, arg4, true);
        ((class187) class199.field3629).method1172(class121.field2305, 121);
        class215.method1368(arg4, arg3, arg2, arg1, (byte) -90);
        class118.field2243 = var9;
        class11.field213 = var13;
        class54.field1021 = var12;
        class211.field3923 = var10;
        class110.field2059 = var11;
        if (class197.field3598 && class55.method411(false, true, 2039) == 0) {
            class197.field3598 = false;
        }
        if (class197.field3598) {
            class53.method399(arg2, arg4, arg3, arg1, 0);
            class88.method571(class29.field642, (byte) 122, false);
        }
        if (!class197.field3598 && !class38.field834 && var15 >= arg2 && var15 < arg2 + arg3 && arg4 <= var16 && arg1 + arg4 > var16) {
            class20.method191(var16, 4, arg2, arg4, var15);
        }
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)I")
    private static final int method1022(int arg0) {
        field3087++;
        int var1 = 3;
        if (arg0 > -123) {
            return -100;
        }
        if (class11.field213 < 310) {
            int var2 = class110.field2059 >> 7;
            int var3 = class211.field3923 >> 7;
            if ((class161.field3074[class217.field4036][var3][var2] & 0x4) != 0) {
                var1 = class217.field4036;
            }
            int var4 = class17.field432.field1353 >> 7;
            int var5 = class17.field432.field1360 >> 7;
            int var6;
            if (var2 >= var5) {
                var6 = var2 - var5;
            } else {
                var6 = var5 - var2;
            }
            int var7;
            if (var4 > var3) {
                var7 = var4 - var3;
            } else {
                var7 = var3 - var4;
            }
            if (var7 <= var6) {
                int var8 = var7 * 65536 / var6;
                int var9 = 32768;
                while (var2 != var5) {
                    var9 += var8;
                    if (var2 < var5) {
                        var2++;
                    } else if (var5 < var2) {
                        var2--;
                    }
                    if ((class161.field3074[class217.field4036][var3][var2] & 0x4) != 0) {
                        var1 = class217.field4036;
                    }
                    if (var9 >= 65536) {
                        if (var4 > var3) {
                            var3++;
                        } else if (var4 < var3) {
                            var3--;
                        }
                        if ((class161.field3074[class217.field4036][var3][var2] & 0x4) != 0) {
                            var1 = class217.field4036;
                        }
                        var9 -= 65536;
                    }
                }
            } else {
                int var10 = var6 * 65536 / var7;
                int var11 = 32768;
                while (var3 != var4) {
                    if (var4 > var3) {
                        var3++;
                    } else if (var3 > var4) {
                        var3--;
                    }
                    var11 += var10;
                    if ((class161.field3074[class217.field4036][var3][var2] & 0x4) != 0) {
                        var1 = class217.field4036;
                    }
                    if (var11 >= 65536) {
                        if (var5 > var2) {
                            var2++;
                        } else if (var5 < var2) {
                            var2--;
                        }
                        var11 -= 65536;
                        if ((class161.field3074[class217.field4036][var3][var2] & 0x4) != 0) {
                            var1 = class217.field4036;
                        }
                    }
                }
            }
        }
        if ((class161.field3074[class217.field4036][class17.field432.field1353 >> 7][class17.field432.field1360 >> 7] & 0x4) != 0) {
            var1 = class217.field4036;
        }
        return var1;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
    public static void method1023(byte arg0) {
        field3084 = null;
        int var1 = 72 % ((65 - arg0) / 60);
        field3090 = null;
        field3092 = null;
    }
}
