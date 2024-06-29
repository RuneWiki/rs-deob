import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class303 extends class259 {

    @OriginalMember(owner = "client!s", name = "C", descriptor = "Lvh;")
    public static class62 field4715 = new class62(500);

    @OriginalMember(owner = "client!s", name = "S", descriptor = "I")
    public static int field4731 = 99;

    @OriginalMember(owner = "client!s", name = "O", descriptor = "Z")
    public static boolean field4727 = false;

    @OriginalMember(owner = "client!s", name = "T", descriptor = "[Lad;")
    public static class147[] field4732 = new class147[8];

    @OriginalMember(owner = "client!s", name = "G", descriptor = "C")
    private char field4719;

    @OriginalMember(owner = "client!s", name = "A", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!s", name = "B", descriptor = "I")
    public int field4714;

    @OriginalMember(owner = "client!s", name = "D", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!s", name = "E", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!s", name = "F", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!s", name = "H", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!s", name = "I", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!s", name = "J", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!s", name = "K", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!s", name = "L", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!s", name = "M", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!s", name = "N", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!s", name = "R", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!s", name = "P", descriptor = "Lnk;")
    public static class16 field4728;

    @OriginalMember(owner = "client!s", name = "Q", descriptor = "Lol;")
    public static class258 field4729;

    @OriginalMember(owner = "client!s", name = "z", descriptor = "Ljava/lang/String;")
    public String field4712;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "(I)Lvj;", line = 8)
    public static final class122 method2131(int arg0) {
        field4722++;
        class356.field5656 = arg0;
        return class31.method218(0);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)V", line = 17)
    public static void method2132(boolean arg0) {
        field4728 = null;
        field4732 = null;
        field4729 = null;
        field4715 = null;
        if (!arg0) {
            method2134(47, 101, 27, 52, 20, 98);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BLlf;I)V", line = 33)
    private final void method2133(byte arg0, class143 arg1, int arg2) {
        if (arg2 == 1) {
            this.field4719 = class308.method2172(true, arg1.method1028(79030408));
        } else if (arg2 == 2) {
            this.field4714 = arg1.method1057(-111);
        } else if (arg2 == 5) {
            this.field4712 = arg1.method1040((byte) -127);
        }
        field4725++;
        if (arg0 <= 66) {
            field4729 = (class258) null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIII)V", line = 58)
    public static final void method2134(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4726++;
        for (int var6 = arg3; var6 <= arg3 + arg4; var6++) {
            for (int var7 = arg2; var7 <= (arg1 + arg2); var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class300.field4687[arg0][var7][var6] = 127;
                }
            }
        }
        if (arg5 != 1) {
            return;
        }
        for (int var8 = arg3; var8 < (arg3 + arg4); var8++) {
            for (int var9 = arg2; var9 < arg1 + arg2; var9++) {
                if (var9 >= 0 && var9 < 104 && var8 >= 0 && var8 < 104) {
                    class72.field902[arg0][var9][var8] = arg0 <= 0 ? 0 : class72.field902[arg0 - 1][var9][var8];
                }
            }
        }
        if (arg2 > 0 && arg2 < 104) {
            for (int var10 = arg3 + 1; var10 < arg3 + arg4; var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class72.field902[arg0][arg2][var10] = class72.field902[arg0][arg2 - 1][var10];
                }
            }
        }
        if (arg3 > 0 && arg3 < 104) {
            for (int var11 = arg2 + 1; var11 < arg2 + arg1; var11++) {
                if (var11 >= 0 && var11 < 104) {
                    class72.field902[arg0][var11][arg3] = class72.field902[arg0][var11][arg3 - 1];
                }
            }
        }
        if (arg2 < 0 || arg3 < 0 || arg2 >= 104 || arg3 >= 104) {
            return;
        }
        if (arg0 == 0) {
            if (arg2 > 0 && class72.field902[arg0][arg2 - 1][arg3] != 0) {
                class72.field902[arg0][arg2][arg3] = class72.field902[arg0][arg2 - 1][arg3];
            } else if (arg3 > 0 && class72.field902[arg0][arg2][arg3 - 1] != 0) {
                class72.field902[arg0][arg2][arg3] = class72.field902[arg0][arg2][arg3 - 1];
            } else if (arg2 > 0 && arg3 > 0 && class72.field902[arg0][arg2 - 1][arg3 - 1] != 0) {
                class72.field902[arg0][arg2][arg3] = class72.field902[arg0][arg2 - 1][arg3 - 1];
            }
        } else if (arg2 > 0 && class72.field902[arg0 - 1][arg2 - 1][arg3] != class72.field902[arg0][arg2 - 1][arg3]) {
            class72.field902[arg0][arg2][arg3] = class72.field902[arg0][arg2 - 1][arg3];
        } else if (arg3 > 0 && class72.field902[arg0 - 1][arg2][arg3 - 1] != class72.field902[arg0][arg2][arg3 - 1]) {
            class72.field902[arg0][arg2][arg3] = class72.field902[arg0][arg2][arg3 - 1];
        } else if (arg2 > 0 && arg3 > 0 && class72.field902[arg0 - 1][arg2 - 1][arg3 - 1] != class72.field902[arg0][arg2 - 1][arg3 - 1]) {
            class72.field902[arg0][arg2][arg3] = class72.field902[arg0][arg2 - 1][arg3 - 1];
        }
    }

    @OriginalMember(owner = "client!s", name = "f", descriptor = "(I)Z", line = 180)
    public final boolean method2135(int arg0) {
        field4718++;
        if (arg0 > -64) {
            method2139((byte) -19);
        }
        return this.field4719 == 's';
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BLlf;)V", line = 192)
    public final void method2136(byte arg0, class143 arg1) {
        if (arg0 <= 17) {
            method2140((byte) 103, 81);
        }
        field4724++;
        while (true) {
            int var3 = arg1.method1043(true);
            if (var3 == 0) {
                return;
            }
            this.method2133((byte) 100, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIB)I", line = 214)
    public static final int method2137(int arg0, int arg1, int arg2, byte arg3) {
        field4717++;
        int var4 = -19 % ((-arg3 - 61) / 41);
        int var5 = arg2 & 0x3;
        if (var5 == 0) {
            return arg1;
        } else if (var5 == 1) {
            return arg0;
        } else if (var5 == 2) {
            return 1023 - arg1;
        } else {
            return 1023 - arg0;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BI)Z", line = 238)
    public static final boolean method2138(byte arg0, int arg1) {
        byte var2 = 0;
        field4721++;
        byte var3 = 0;
        if (class11.field115 == null) {
            if (class272.field4317 || class69.field860 == null) {
                class11.field115 = new class158(512, 512);
            } else {
                class11.field115 = (class158) class69.field860;
            }
            int[] var4 = class11.field115.field2455;
            int var5 = var4.length;
            for (int var6 = 0; var6 < var5; var6++) {
                var4[var6] = 1;
            }
            for (int var7 = var3 + 1; var7 < 104 - var3 - 1; var7++) {
                int var8 = ((var3 + 103 - var7) * 4 * 512) + 24628;
                for (int var9 = var2 + 1; var9 < (104 - var2 - 1); var9++) {
                    if ((class225.field3398[arg1][var9][var7] & 0x18) == 0) {
                        class149.method1091(var4, var8, 512, arg1, var9, var7);
                    }
                    if (arg1 < 3 && (class225.field3398[arg1 + 1][var9][var7] & 0x8) != 0) {
                        class149.method1091(var4, var8, 512, arg1 + 1, var9, var7);
                    }
                    var8 += 4;
                }
            }
            class52.field604 = 0;
            for (int var10 = 0; var10 < 104; var10++) {
                for (int var11 = 0; var11 < 104; var11++) {
                    long var12 = class215.method1499(arg1, var2 + var10, var3 + var11);
                    if (var12 == 0L) {
                        var12 = class181.method1248(arg1, var2 + var10, var11 - -var3);
                    }
                    if (var12 == 0L) {
                        var12 = class113.method730(arg1, var10 + var2, var11 - -var3);
                    }
                    if (var12 == 0L) {
                        var12 = class68.method424(arg1, var2 + var10, var11 - -var3);
                    }
                    if (var12 != 0L) {
                        class234 var14 = class123.method795(0, Integer.MAX_VALUE & (int) (var12 >>> 32));
                        if (!var14.field3534 || class33.field387) {
                            int var15 = var14.field3547;
                            if (var14.field3588 != null) {
                                for (int var16 = 0; var16 < var14.field3588.length; var16++) {
                                    if (var14.field3588[var16] != -1) {
                                        class234 var17 = class123.method795(0, var14.field3588[var16]);
                                        if (var17.field3547 >= 0) {
                                            var15 = var17.field3547;
                                        }
                                    }
                                }
                            }
                            if (var15 >= 0) {
                                boolean var18 = false;
                                class103 var19 = class79.method521(var15, -102);
                                if (var19 != null && var19.field1390) {
                                    var18 = true;
                                }
                                int var20 = var2 + var10;
                                int var21 = var3 + var11;
                                if (var18) {
                                    int[][] var22 = class247.field3914[arg1].field4156;
                                    for (int var23 = 0; var23 < 10; var23++) {
                                        int var24 = (int) (Math.random() * 4.0D);
                                        if (var24 == 0 && var20 > 0 && var20 > var10 - 3 && (var22[var20 - 1][var21] & 0x2C0108) == 0) {
                                            var20--;
                                        }
                                        if (var24 == 1 && var20 < 103 && (var10 + 3) > var20 && (var22[var20 + 1][var21] & 0x2C0180) == 0) {
                                            var20++;
                                        }
                                        if (var24 == 2 && var21 > 0 && var11 - 3 < var21 && (var22[var20][var21 - 1] & 0x2C0102) == 0) {
                                            var21--;
                                        }
                                        if (var24 == 3 && var21 < 103 && var11 + 3 > var21 && (var22[var20][var21 + 1] & 0x2C0120) == 0) {
                                            var21++;
                                        }
                                    }
                                }
                                class86.field1138[class52.field604] = var14.field3594;
                                class353.field5624[class52.field604] = var20 - var2;
                                class261.field4131[class52.field604] = var21 - var3;
                                class52.field604++;
                            }
                        }
                    }
                }
            }
        }
        class11.field115.method1150();
        int var25 = (int) (Math.random() * 20.0D) + (238 - (10 - ((int) (Math.random() * 20.0D))) << 16) + (((int) (Math.random() * 20.0D) - 10) + 238 << 8) + 228;
        int var26 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var27 = 1; var27 < 103; var27++) {
            for (int var28 = 1; var28 < 103; var28++) {
                if ((class225.field3398[arg1][var2 + var28][var27 + var3] & 0x18) == 0 && !class43.method267(var27, var28, var3, var2, arg1, var26, var25, (byte) 55)) {
                    if (class272.field4317) {
                        class343.field5439 = null;
                    } else {
                        class10.field107.method59(0);
                    }
                    return false;
                }
                if (arg1 < 3 && (class225.field3398[arg1 + 1][var28 + var2][var3 + var27] & 0x8) != 0 && !class43.method267(var27, var28, var3, var2, arg1 + 1, var26, var25, (byte) 55)) {
                    if (class272.field4317) {
                        class343.field5439 = null;
                    } else {
                        class10.field107.method59(0);
                    }
                    return false;
                }
            }
        }
        int var29 = 47 / ((arg0 - 22) / 43);
        if (class272.field4317) {
            int[] var30 = class11.field115.field2455;
            int var31 = var30.length;
            for (int var32 = 0; var32 < var31; var32++) {
                if (var30[var32] == 0) {
                    var30[var32] = 1;
                }
            }
            class69.field860 = new class200(class11.field115);
        } else {
            class69.field860 = class11.field115;
        }
        if (class272.field4317) {
            class343.field5439 = null;
        } else {
            class10.field107.method59(0);
        }
        class11.field115 = null;
        return true;
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(B)[Lfe;", line = 496)
    public static final class270[] method2139(byte arg0) {
        field4723++;
        if (arg0 != 7) {
            method2131(-40);
        }
        class270[] var1 = new class270[class10.field101];
        for (int var2 = 0; var2 < class10.field101; var2++) {
            var1[var2] = new class270(class122.field1683, class253.field4004, class110.field1518[var2], class33.field392[var2], class245.field3855[var2], class259.field4093[var2], class14.field145[var2], class251.field3978);
        }
        class99.method627(3735);
        return var1;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(BI)V", line = 520)
    public static final void method2140(byte arg0, int arg1) {
        class277.field4353 = arg1;
        field4713++;
        int var2 = 118 / ((arg0 + 13) / 39);
        class75.field971 = -1;
        class294.field4634 = 3;
        class162.field2489 = 100;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IB)I", line = 533)
    public static final int method2141(int arg0, byte arg1) {
        field4720++;
        if (arg0 < 0) {
            return 0;
        }
        class64 var2 = (class64) class6.field67.method770((long) arg0, -55);
        if (var2 == null) {
            return class45.method275(arg0, 91).field1058;
        }
        int var3 = 0;
        int var4 = 18 % ((arg1 + 82) / 38);
        for (int var5 = 0; var5 < var2.field773.length; var5++) {
            if (var2.field773[var5] == -1) {
                var3++;
            }
        }
        return var3 + class45.method275(arg0, 106).field1058 - var2.field773.length;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lji;ILnk;Lnk;)V", line = 579)
    public static final void method2142(class121 arg0, int arg1, class16 arg2, class16 arg3) {
        if (arg1 != -1) {
            return;
        }
        field4716++;
        class96.field1316 = arg0;
        field4728 = arg3;
        class344.field5465 = arg2;
        if (class344.field5465 != null) {
            class293.field4613 = class344.field5465.method110(false, 1);
        }
        if (field4728 != null) {
            class309.field4844 = field4728.method110(false, 1);
        }
    }
}
