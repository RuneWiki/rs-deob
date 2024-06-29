import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class206 extends class273 {

    @OriginalMember(owner = "client!bh", name = "N", descriptor = "I")
    private int field3116 = 4;

    @OriginalMember(owner = "client!bh", name = "P", descriptor = "I")
    private int field3118 = 4;

    @OriginalMember(owner = "client!bh", name = "K", descriptor = "[I")
    public static int[] field3113 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!bh", name = "J", descriptor = "I")
    public static volatile int field3112 = 0;

    @OriginalMember(owner = "client!bh", name = "L", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!bh", name = "M", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!bh", name = "O", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!bh", name = "Q", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!bh", name = "R", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!bh", name = "S", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V", line = 13)
    public class206() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)[I", line = 25)
    public final int[] method331(int arg0, int arg1) {
        field3117++;
        int[] var3 = this.field4204.method365(arg0, 0);
        if (this.field4204.field792) {
            int var4 = class27.field346 / this.field3118;
            int var5 = class99.field1533 / this.field3116;
            int[] var6;
            if (var5 <= 0) {
                var6 = this.method1790(0, 0, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method1790(0, class99.field1533 * var7 / var5, 0);
            }
            for (int var8 = 0; var8 < class27.field346; var8++) {
                if (var4 <= 0) {
                    var3[var8] = var6[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class27.field346 * var9 / var4];
                }
            }
        }
        if (arg1 != -14650) {
            this.field3116 = 13;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IB)[[I", line = 89)
    public final int[][] method170(int arg0, byte arg1) {
        if (arg1 != 68) {
            return (int[][]) ((int[][]) null);
        }
        field3120++;
        int[][] var3 = this.field4200.method539(arg1 + 84, arg0);
        if (this.field4200.field1147) {
            int var4 = class27.field346 / this.field3118;
            int var5 = class99.field1533 / this.field3116;
            int[][] var7;
            if (var5 > 0) {
                int var6 = arg0 % var5;
                var7 = this.method1795(class99.field1533 * var6 / var5, -127, 0);
            } else {
                var7 = this.method1795(0, -126, 0);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[2];
            int[] var12 = var3[1];
            int[] var13 = var3[0];
            for (int var14 = 0; var14 < class27.field346; var14++) {
                int var16;
                if (var4 > 0) {
                    int var15 = var14 % var4;
                    var16 = class27.field346 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var13[var14] = var8[var16];
                var12[var14] = var9[var16];
                var11[var14] = var10[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljh;IIII)V", line = 157)
    public static final void method1379(class207 arg0, int arg1, int arg2, int arg3, int arg4) {
        field3121++;
        if (arg3 != 32) {
            field3113 = (int[]) null;
        }
        class233.method1592(true);
        if (class333.field5166) {
            class238.method1633(arg4, arg1, arg0.field3169 + arg4, arg0.field3239 + arg1);
        } else {
            class57.method395(arg4, arg1, arg0.field3169 + arg4, arg1 - -arg0.field3239);
        }
        if (class278.field4288 != 2 && class278.field4288 != 5 && class230.field3714 != null) {
            int var5 = (int) class123.field1922 + class138.field2133 & 0x7FF;
            int var6 = 464 - (class79.field1173.field519 / 32);
            int var7 = class79.field1173.field537 / 32 + 48;
            if (class333.field5166) {
                ((class186) class230.field3714).method1273(arg4, arg1, arg0.field3169, arg0.field3239, var7, var6, var5, class14.field148 + 256, (class186) arg0.method1396(60, false));
            } else {
                ((class178) class230.field3714).method915(arg4, arg1, arg0.field3169, arg0.field3239, var7, var6, var5, class14.field148 + 256, arg0.field3160, arg0.field3281);
            }
            if (class210.field3333 != null) {
                for (int var8 = 0; var8 < class210.field3333.field1862; var8++) {
                    if (class210.field3333.method823(-126, var8)) {
                        int var9 = class12.field121[var5];
                        int var10 = ((class210.field3333.field1874[var8] & 0x3FFF) - class294.field4535) * 4 + 2 - (class79.field1173.field519 / 32);
                        int var11 = class12.field127[var5];
                        int var12 = ((class210.field3333.field1874[var8] >> 14 & 0x3FFF) - class30.field374) * 4 + 2 - (class79.field1173.field537 / 32);
                        int var13 = var9 * 256 / (class14.field148 + 256);
                        class180 var14 = class342.field5329;
                        int var15 = var11 * 256 / (class14.field148 + 256);
                        int var16 = var10 * var13 + (var12 * var15) >> 16;
                        int var17 = var10 * var15 - (var12 * var13) >> 16;
                        if (class210.field3333.method825(var8, 125) == 1) {
                            var14 = class179.field2736;
                        }
                        if (class210.field3333.method825(var8, 125) == 2) {
                            var14 = class286.field4380;
                        }
                        int var18 = var14.method1249(class210.field3333.field1857[var8], 100);
                        int var19 = var16 - var18 / 2;
                        if (-arg0.field3169 <= var19 && var19 <= arg0.field3169 && (-arg0.field3239) <= var17 && arg0.field3239 >= var17) {
                            int var20 = 16777215;
                            if (class210.field3333.field1868[var8] != -1) {
                                var20 = class210.field3333.field1868[var8];
                            }
                            if (class333.field5166) {
                                class238.method1625((class186) arg0.method1396(116, false));
                            } else {
                                class57.method393(arg0.field3160, arg0.field3281);
                            }
                            var14.method1230(class210.field3333.field1857[var8], arg0.field3169 / 2 + arg4 + var19, arg0.field3239 / 2 + -var17 + arg1, var18, 50, var20, 0, 256, 1, 0, 0);
                            if (class333.field5166) {
                                class238.method1631();
                            } else {
                                class57.method374();
                            }
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class136.field2114; var21++) {
                int var22 = class306.field4812[var21] * 4 + 2 - class79.field1173.field537 / 32;
                int var23 = class17.field171[var21] * 4 + 2 - (class79.field1173.field519 / 32);
                class17 var24 = class277.method1819((byte) -44, class99.field1545[var21]);
                if (var24.field195 != null) {
                    var24 = var24.method139(-1);
                    if (var24 == null || var24.field205 == -1) {
                        continue;
                    }
                }
                class173.method1171(arg0, arg4, var22, -30, class83.field1252[var24.field205], var23, arg1);
            }
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class2 var27 = class274.field4221[class77.field1154][var25][var26];
                    if (var27 != null) {
                        int var28 = var25 * 4 + 2 - (class79.field1173.field537 / 32);
                        int var29 = var26 * 4 + 2 - (class79.field1173.field519 / 32);
                        class173.method1171(arg0, arg4, var28, arg3 - 64, class26.field342[0], var29, arg1);
                    }
                }
            }
            for (int var30 = 0; var30 < class155.field2439; var30++) {
                class80 var31 = class208.field3313[class144.field2286[var30]];
                if (var31 != null && var31.method281(arg3 ^ 0x20)) {
                    class298 var32 = var31.field1178;
                    if (var32 != null && var32.field4588 != null) {
                        var32 = var32.method1956(111);
                    }
                    if (var32 != null && var32.field4615 && var32.field4583) {
                        int var33 = var31.field519 / 32 - (class79.field1173.field519 / 32);
                        int var34 = var31.field537 / 32 - (class79.field1173.field537 / 32);
                        if (var32.field4575 == -1) {
                            class173.method1171(arg0, arg4, var34, -117, class26.field342[1], var33, arg1);
                        } else {
                            class173.method1171(arg0, arg4, var34, -59, class83.field1252[var32.field4575], var33, arg1);
                        }
                    }
                }
            }
            for (int var35 = 0; var35 < class175.field2678; var35++) {
                class82 var36 = class64.field966[class174.field2645[var35]];
                if (var36 != null && var36.method281(0)) {
                    int var37 = var36.field519 / 32 - (class79.field1173.field519 / 32);
                    int var38 = var36.field537 / 32 - (class79.field1173.field537 / 32);
                    boolean var39 = false;
                    long var40 = class108.method723(var36.field1218, -80);
                    for (int var42 = 0; var42 < class116.field1795; var42++) {
                        if (class81.field1205[var42] == var40 && class95.field1455[var42] != 0) {
                            var39 = true;
                            break;
                        }
                    }
                    boolean var43 = false;
                    for (int var44 = 0; var44 < class172.field2628; var44++) {
                        if (class146.field2297[var44].field2852 == var40) {
                            var43 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    if (class79.field1173.field1223 != 0 && var36.field1223 != 0 && class79.field1173.field1223 == var36.field1223) {
                        var45 = true;
                    }
                    if (var39) {
                        class173.method1171(arg0, arg4, var38, -87, class26.field342[3], var37, arg1);
                    } else if (var43) {
                        class173.method1171(arg0, arg4, var38, -96, class26.field342[5], var37, arg1);
                    } else if (var45) {
                        class173.method1171(arg0, arg4, var38, arg3 ^ 0xFFFFFFB2, class26.field342[4], var37, arg1);
                    } else {
                        class173.method1171(arg0, arg4, var38, -54, class26.field342[2], var37, arg1);
                    }
                }
            }
            class68[] var46 = class81.field1204;
            for (int var47 = 0; var47 < var46.length; var47++) {
                class68 var48 = var46[var47];
                if (var48 != null && var48.field1013 != 0 && class343.field5341 % 20 < 10) {
                    if (var48.field1013 == 1 && var48.field1022 >= 0 && var48.field1022 < class208.field3313.length) {
                        class80 var49 = class208.field3313[var48.field1022];
                        if (var49 != null) {
                            int var50 = var49.field537 / 32 - (class79.field1173.field537 / 32);
                            int var51 = var49.field519 / 32 - (class79.field1173.field519 / 32);
                            class218.method1458(360000, arg0, var48.field1021, arg1, arg4, var51, 15, var50);
                        }
                    }
                    if (var48.field1013 == 2) {
                        int var52 = (var48.field1008 - class294.field4535) * 4 + 2 - (class79.field1173.field519 / 32);
                        int var53 = (var48.field1007 - class30.field374) * 4 + 2 - (class79.field1173.field537 / 32);
                        int var54 = var48.field1025 * 4;
                        int var55 = var54 * var54;
                        class218.method1458(var55, arg0, var48.field1021, arg1, arg4, var52, 15, var53);
                    }
                    if (var48.field1013 == 10 && var48.field1022 >= 0 && var48.field1022 < class64.field966.length) {
                        class82 var56 = class64.field966[var48.field1022];
                        if (var56 != null) {
                            int var57 = var56.field537 / 32 - (class79.field1173.field537 / 32);
                            int var58 = var56.field519 / 32 - (class79.field1173.field519 / 32);
                            class218.method1458(360000, arg0, var48.field1021, arg1, arg4, var58, 15, var57);
                        }
                    }
                }
            }
            if (class133.field2099 != 0) {
                int var59 = class133.field2099 * 4 + (class79.field1173.method271((byte) 86) + -1) * 2 - (class79.field1173.field537 / 32 - 2);
                int var60 = class228.field3660 * 4 - (-((class79.field1173.method271((byte) 54) * 2) - (class79.field1173.field519 / 32) - 2) - 2);
                class173.method1171(arg0, arg4, var59, -46, class169.field2576, var60, arg1);
            }
            if (class333.field5166) {
                class238.method1636(arg0.field3169 / 2 + arg4 - 1, arg1 - -(arg0.field3239 / 2) + -1, 3, 3, 16777215);
            } else {
                class57.method375(arg4 - (1 - (arg0.field3169 / 2)), arg0.field3239 / 2 + arg1 - 1, 3, 3, 16777215);
            }
        } else if (class333.field5166) {
            class245 var61 = arg0.method1396(46, false);
            if (var61 != null) {
                var61.method921(arg4, arg1);
            }
        } else {
            class57.method378(arg4, arg1, 0, arg0.field3160, arg0.field3281);
        }
        class19.field267[arg2] = true;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BILgn;)V", line = 519)
    public final void method167(byte arg0, int arg1, class303 arg2) {
        if (arg1 == 0) {
            this.field3118 = arg2.method2043((byte) -125);
        } else if (arg1 == 1) {
            this.field3116 = arg2.method2043((byte) -106);
        }
        if (arg0 >= 27) {
            field3115++;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BI)Lue;", line = 548)
    public static final class90 method1380(byte arg0, int arg1) {
        field3119++;
        class90 var2 = (class90) class336.field5221.method1294((long) arg1, 127);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class82.field1227.method2103(0, 33, arg1);
        class90 var4 = new class90();
        if (var3 != null) {
            var4.method621(arg1, new class303(var3), 17445);
        }
        if (arg0 == -14) {
            class336.field5221.method1292((long) arg1, arg0 ^ 0xFFFFFFA4, var4);
            return var4;
        } else {
            return (class90) null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "(I)V", line = 572)
    public static void method1381(int arg0) {
        field3113 = null;
        if (arg0 != 0) {
            method1381(89);
        }
    }
}
