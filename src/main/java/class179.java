import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class179 extends class1 {

    @OriginalMember(owner = "client!ra", name = "lb", descriptor = "I")
    private int field3231 = 3216;

    @OriginalMember(owner = "client!ra", name = "mb", descriptor = "I")
    private int field3232 = 4096;

    @OriginalMember(owner = "client!ra", name = "ib", descriptor = "[I")
    private int[] field3228 = new int[3];

    @OriginalMember(owner = "client!ra", name = "wb", descriptor = "I")
    private int field3242 = 3216;

    @OriginalMember(owner = "client!ra", name = "gb", descriptor = "Loc;")
    public static class151 field3226 = class137.method873(2, "null");

    @OriginalMember(owner = "client!ra", name = "jb", descriptor = "[Lbh;")
    public static class20[] field3229 = new class20[2048];

    @OriginalMember(owner = "client!ra", name = "kb", descriptor = "I")
    public static int field3230 = 0;

    @OriginalMember(owner = "client!ra", name = "xb", descriptor = "Loc;")
    private static class151 field3243 = class137.method873(2, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!ra", name = "tb", descriptor = "Loc;")
    public static class151 field3239 = field3243;

    @OriginalMember(owner = "client!ra", name = "Bb", descriptor = "[J")
    public static long[] field3247 = new long[500];

    @OriginalMember(owner = "client!ra", name = "vb", descriptor = "Lv;")
    public static class218 field3241 = new class218();

    @OriginalMember(owner = "client!ra", name = "Cb", descriptor = "Loc;")
    public static class151 field3248 = class137.method873(2, " ");

    @OriginalMember(owner = "client!ra", name = "Eb", descriptor = "Loc;")
    public static class151 field3250 = class137.method873(2, "Regeln versto-8en hat)3");

    @OriginalMember(owner = "client!ra", name = "Db", descriptor = "Loc;")
    private static class151 field3249 = class137.method873(2, "Loading fonts )2 ");

    @OriginalMember(owner = "client!ra", name = "Fb", descriptor = "Loc;")
    public static class151 field3251 = field3249;

    @OriginalMember(owner = "client!ra", name = "hb", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!ra", name = "nb", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!ra", name = "ob", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!ra", name = "pb", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!ra", name = "qb", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!ra", name = "rb", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!ra", name = "ub", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!ra", name = "yb", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!ra", name = "zb", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!ra", name = "Ab", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!ra", name = "sb", descriptor = "Lsd;")
    public static class192 field3238;

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
    public class179() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILwa;)V")
    public final void method13(int arg0, int arg1, class229 arg2) {
        if (arg0 != 0) {
            this.field3228 = null;
        }
        ++field3245;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field3242 = arg2.method1490((byte) 73);
                }
            } else {
                this.field3231 = arg2.method1490((byte) 73);
            }
        } else {
            this.field3232 = arg2.method1490((byte) 73);
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
    public final void method2(int arg0) {
        ++field3236;
        if (arg0 == 3) {
            this.method1133((byte) -78);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lwd;I)Lwd;")
    public static final class232 method1132(class232 arg0, int arg1) {
        class232 var2 = class36.method267(7, arg0);
        if (var2 == null) {
            var2 = arg0.field4276;
        }
        int var3 = -68 % ((arg1 - -66) / 36);
        ++field3237;
        return var2;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BI)[I")
    public final int[] method11(byte arg0, int arg1) {
        ++field3234;
        if (arg0 != 107) {
            this.field3231 = -118;
        }
        int[] var3 = super.field21.method1182(arg1, arg0 ^ -31672);
        if (super.field21.field3388) {
            int var4 = class205.field3633 * this.field3232 >> 12;
            int[] var5 = this.method4(arg1 + -1 & class155.field2804, -101, 0);
            int[] var6 = this.method4(arg1, -109, 0);
            int[] var7 = this.method4(class155.field2804 & arg1 - -1, arg0 + -222, 0);
            for (int var8 = 0; var8 < class202.field3603; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[class78.field1510 & var8 + -1] + -var6[var8 + 1 & class78.field1510]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                int var13 = 255 & class202.field3595[((var12 + 1) * var12 >> 1) + var11];
                int var14 = var13 * 4096 >> 8;
                int var15 = var9 * var13 >> 8;
                int var16 = var10 * var13 >> 8;
                int var17 = this.field3228[1] * var15 >> 12;
                int var18 = this.field3228[2] * var14 >> 12;
                int var19 = this.field3228[0] * var16 >> 12;
                var3[var8] = var19 - -var17 + var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "(B)V")
    private final void method1133(byte arg0) {
        if (arg0 == -78) {
            ++field3246;
            double var2 = Math.cos((double) ((float) this.field3242 / 4096.0F));
            this.field3228[0] = (int) (4096.0D * Math.sin((double) ((float) this.field3231 / 4096.0F)) * var2);
            this.field3228[1] = (int) (var2 * Math.cos((double) ((float) this.field3231 / 4096.0F)) * 4096.0D);
            this.field3228[2] = (int) (4096.0D * Math.sin((double) ((float) this.field3242 / 4096.0F)));
            int var4 = this.field3228[0] * this.field3228[0] >> 12;
            int var5 = this.field3228[2] * this.field3228[2] >> 12;
            int var6 = this.field3228[1] * this.field3228[1] >> 12;
            int var7 = (int) (Math.sqrt((double) (var4 + var5 + var6 >> 12)) * 4096.0D);
            if (var7 != 0) {
                this.field3228[2] = (this.field3228[2] << 12) / var7;
                this.field3228[0] = (this.field3228[0] << 12) / var7;
                this.field3228[1] = (this.field3228[1] << 12) / var7;
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILwd;II)V")
    public static final void method1134(int arg0, class232 arg1, int arg2, int arg3) {
        ++field3233;
        if (arg1.field4133 == 1) {
            ++class38.field783;
            class142.method908(0, class134.field2441, (short) 4, 0L, arg1.field4224, -32, arg1.field4261);
        }
        if (arg1.field4133 == 2 && !class159.field2859) {
            class151 var4 = class90.method577(arg1, -123);
            if (var4 != null) {
                class142.method908(-1, class126.method761(new class151[] { class220.field3820, arg1.field4168 }, 10260), (short) 17, 0L, var4, -123, arg1.field4261);
                ++class234.field4300;
            }
        }
        if (arg1.field4133 == 3) {
            ++class109.field1924;
            class142.method908(0, class134.field2441, (short) 49, 0L, class50.field1016, -25, arg1.field4261);
        }
        if (arg1.field4133 == 4) {
            ++class116.field2090;
            class142.method908(0, class134.field2441, (short) 9, 0L, arg1.field4224, -90, arg1.field4261);
        }
        if (~arg1.field4133 == -6) {
            class142.method908(0, class134.field2441, (short) 23, 0L, arg1.field4224, -50, arg1.field4261);
            ++class189.field3357;
        }
        if (~arg1.field4133 == -7 && class7.field113 == null) {
            class142.method908(-1, class134.field2441, (short) 21, 0L, arg1.field4224, -103, arg1.field4261);
            ++class63.field1219;
        }
        if (~arg1.field4173 == -3) {
            int var5 = 0;
            for (int var6 = 0; ~arg1.field4205 < ~var6; ++var6) {
                for (int var7 = 0; arg1.field4252 > var7; ++var7) {
                    int var8 = (32 - -arg1.field4219) * var7;
                    int var9 = (32 - -arg1.field4233) * var6;
                    if (~var5 > -21) {
                        var8 += arg1.field4274[var5];
                        var9 += arg1.field4155[var5];
                    }
                    if (var8 <= arg0 && var9 <= arg3 && arg0 < var8 - -32 && arg3 < var9 + 32) {
                        class194.field3464 = arg1;
                        class182.field3287 = var5;
                        if (arg1.field4248[var5] > 0) {
                            class12 var10 = class43.method311(arg1.field4248[var5] + -1, 0);
                            if (class166.field3017 == 1 && class190.method1181(class174.method1110(true, arg1), (byte) -116)) {
                                if (~class178.field3209 != ~arg1.field4261 || ~class4.field78 != ~var5) {
                                    class142.method908(var5, class126.method761(new class151[] { class29.field613, class168.field3074, var10.field241 }, 10260), (short) 8, (long) var10.field216, class14.field318, -47, arg1.field4261);
                                    ++class133.field2432;
                                }
                            } else if (class159.field2859 && class190.method1181(class174.method1110(true, arg1), (byte) -122)) {
                                if ((16 & class54.field1103) == 16) {
                                    class142.method908(var5, class126.method761(new class151[] { class20.field447, class168.field3074, var10.field241 }, 10260), (short) 41, (long) var10.field216, class95.field1770, -100, arg1.field4261);
                                    ++class205.field3644;
                                }
                            } else {
                                class151[] var11 = var10.field243;
                                ++class21.field473;
                                if (class52.field1046) {
                                    var11 = class38.method282(var11, (byte) 34);
                                }
                                if (class190.method1181(class174.method1110(true, arg1), (byte) -113)) {
                                    for (int var12 = 4; ~var12 <= -4; --var12) {
                                        if (var11 != null && var11[var12] != null) {
                                            byte var13;
                                            if (~var12 != -4) {
                                                var13 = 22;
                                            } else {
                                                var13 = 33;
                                            }
                                            ++class2.field66;
                                            class142.method908(var5, class126.method761(new class151[] { class52.field1053, var10.field241 }, 10260), var13, (long) var10.field216, var11[var12], -37, arg1.field4261);
                                        } else if (var12 == 4) {
                                            ++class1.field30;
                                            class142.method908(var5, class126.method761(new class151[] { class52.field1053, var10.field241 }, 10260), (short) 22, (long) var10.field216, class126.field2249, -59, arg1.field4261);
                                        }
                                    }
                                }
                                if (class13.method107(class174.method1110(true, arg1), -1266182753)) {
                                    ++class3.field77;
                                    class142.method908(var5, class126.method761(new class151[] { class52.field1053, var10.field241 }, 10260), (short) 25, (long) var10.field216, class14.field318, -78, arg1.field4261);
                                }
                                if (class190.method1181(class174.method1110(true, arg1), (byte) -128) && var11 != null) {
                                    for (int var14 = 2; ~var14 <= -1; --var14) {
                                        if (var11[var14] != null) {
                                            ++class206.field3646;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 44;
                                            }
                                            if (var14 == 1) {
                                                var15 = 57;
                                            }
                                            if (var14 == 2) {
                                                var15 = 47;
                                            }
                                            class142.method908(var5, class126.method761(new class151[] { class52.field1053, var10.field241 }, 10260), var15, (long) var10.field216, var11[var14], -103, arg1.field4261);
                                        }
                                    }
                                }
                                class151[] var16 = arg1.field4203;
                                if (class52.field1046) {
                                    var16 = class38.method282(var16, (byte) 34);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; ~var17 <= -1; --var17) {
                                        if (var16[var17] != null) {
                                            ++class171.field3111;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 40;
                                            }
                                            if (~var17 == -2) {
                                                var18 = 18;
                                            }
                                            if (~var17 == -3) {
                                                var18 = 24;
                                            }
                                            if (var17 == 3) {
                                                var18 = 7;
                                            }
                                            if (~var17 == -5) {
                                                var18 = 10;
                                            }
                                            class142.method908(var5, class126.method761(new class151[] { class52.field1053, var10.field241 }, 10260), var18, (long) var10.field216, var16[var17], -34, arg1.field4261);
                                        }
                                    }
                                }
                                class142.method908(var5, class126.method761(new class151[] { class52.field1053, var10.field241 }, 10260), (short) 1004, (long) var10.field216, class232.field4262, -67, arg1.field4261);
                            }
                        }
                    }
                    ++var5;
                }
            }
        }
        if (arg2 >= -55) {
            field3230 = -5;
        }
        if (arg1.field4237) {
            if (class159.field2859) {
                if (class45.method324(class174.method1110(true, arg1), 2833) && (class54.field1103 & 32) == 32) {
                    class142.method908(arg1.field4174, class126.method761(new class151[] { class20.field447, class161.field2911, arg1.field4181 }, 10260), (short) 13, 0L, class95.field1770, -84, arg1.field4261);
                    ++class182.field3294;
                    return;
                }
            } else {
                for (int var19 = 9; ~var19 <= -6; --var19) {
                    class151 var23 = class151.method957(var19, arg1, (byte) -114);
                    if (var23 != null) {
                        ++class16.field364;
                        class142.method908(arg1.field4174, arg1.field4181, (short) 1003, (long) (var19 + 1), var23, -48, arg1.field4261);
                    }
                }
                class151 var20 = class90.method577(arg1, -115);
                if (var20 != null) {
                    class142.method908(arg1.field4174, arg1.field4181, (short) 17, 0L, var20, -44, arg1.field4261);
                    ++class234.field4300;
                }
                for (int var21 = 4; ~var21 <= -1; --var21) {
                    class151 var22 = class151.method957(var21, arg1, (byte) -114);
                    if (var22 != null) {
                        class142.method908(arg1.field4174, arg1.field4181, (short) 20, (long) (var21 + 1), var22, -117, arg1.field4261);
                        ++class16.field364;
                    }
                }
                if (!class11.method83(72, class174.method1110(true, arg1))) {
                    return;
                }
                ++class63.field1219;
                class142.method908(arg1.field4174, class134.field2441, (short) 21, 0L, class131.field2406, -72, arg1.field4261);
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "(I)V")
    public static final void method1135(int arg0) {
        if (!class231.field4125[96]) {
            if (!class231.field4125[97]) {
                class216.field3772 /= 2;
            } else {
                class216.field3772 += (-class216.field3772 + 24) / 2;
            }
        } else {
            class216.field3772 += (-class216.field3772 + -24) / 2;
        }
        ++field3240;
        class94.field1761 += class216.field3772 / 2;
        int var1 = 9 % ((-56 - arg0) / 47);
        int var2 = class212.field3731 + class228.field3975.field4029;
        if (!class231.field4125[98]) {
            if (class231.field4125[99]) {
                class153.field2767 += (-12 - class153.field2767) / 2;
            } else {
                class153.field2767 /= 2;
            }
        } else {
            class153.field2767 += (-class153.field2767 + 12) / 2;
        }
        int var3 = class228.field3975.field3976 - -class8.field120;
        if (~(-var3 + class15.field344) > 499 || -var3 + class15.field344 > 500 || -var2 + class22.field492 < -500 || class22.field492 - var2 > 500) {
            class22.field492 = var2;
            class15.field344 = var3;
        }
        if (class22.field492 != var2) {
            class22.field492 += (-class22.field492 + var2) / 16;
        }
        class58.field1157 += class153.field2767 / 2;
        if (~class15.field344 != ~var3) {
            class15.field344 += (-class15.field344 + var3) / 16;
        }
        class2.method21(true);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3244;
        if (arg6 < 114) {
            field3226 = null;
        }
        if (class197.method1234(arg4, 123)) {
            class101.method618(class115.field2067[arg4], arg0, arg1, -1, 1741621446, arg7, arg5, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "(I)V")
    public static void method1137(int arg0) {
        field3243 = null;
        field3251 = null;
        field3226 = null;
        field3241 = null;
        field3247 = null;
        field3239 = null;
        field3238 = null;
        field3249 = null;
        field3250 = null;
        if (arg0 != -13392024) {
            field3226 = null;
        }
        field3248 = null;
        field3229 = null;
    }
}
