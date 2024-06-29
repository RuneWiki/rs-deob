import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class275 extends class317 {

    @OriginalMember(owner = "client!se", name = "L", descriptor = "I")
    private int field4121 = 4;

    @OriginalMember(owner = "client!se", name = "P", descriptor = "I")
    private int field4125 = 4;

    @OriginalMember(owner = "client!se", name = "S", descriptor = "I")
    public static int field4128 = 0;

    @OriginalMember(owner = "client!se", name = "M", descriptor = "Ljava/lang/String;")
    public static String field4122 = "Loaded wordpack";

    @OriginalMember(owner = "client!se", name = "O", descriptor = "F")
    public static float field4124;

    @OriginalMember(owner = "client!se", name = "J", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!se", name = "K", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!se", name = "N", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!se", name = "Q", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!se", name = "R", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!se", name = "T", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!se", name = "V", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!se", name = "U", descriptor = "Z")
    public static boolean field4130;

    @OriginalMember(owner = "client!se", name = "W", descriptor = "Z")
    public static boolean field4132;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "(B)V", line = 8)
    public static void method1891(byte arg0) {
        if (arg0 < 105) {
            method1894((byte) 108, (class80) null);
        }
        field4122 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lcg;II)V", line = 28)
    public final void method60(class316 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field4121 = arg0.method2219(16448);
        } else if (arg2 == 1) {
            this.field4125 = arg0.method2219(16448);
        }
        field4119++;
        int var5 = 79 % ((arg1 + 17) / 40);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II[[[Lpi;IZI)Z", line = 56)
    public static final boolean method1892(int arg0, int arg1, class202[][][] arg2, int arg3, boolean arg4, int arg5) {
        byte var6 = arg4 ? 1 : (byte) (class8.field83 & 0xFF);
        field4131++;
        if (class136.field1887[class251.field3603][arg1][arg3] == var6) {
            return false;
        } else if ((class240.field3406[class251.field3603][arg1][arg3] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class224.field3225[var7] = arg1;
            int var31 = var7 + 1;
            class197.field2755[var7] = arg3;
            class136.field1887[class251.field3603][arg1][arg3] = var6;
            int var8 = 0;
            while (var31 != var8) {
                int var9 = class224.field3225[var8] >> 24 & 0xFF;
                int var10 = class224.field3225[var8] & 0xFFFF;
                int var11 = (class224.field3225[var8] & 0xFF9E75) >> 16;
                int var12 = class197.field2755[var8] & 0xFFFF;
                boolean var13 = false;
                int var14 = (class197.field2755[var8] & 0xFF7016) >> 16;
                boolean var15 = false;
                var8 = var8 + 1 & 0xFFF;
                if ((class240.field3406[class251.field3603][var10][var12] & 0x4) == 0) {
                    var15 = true;
                }
                label246: for (int var16 = class251.field3603 + 1; var16 <= 3; var16++) {
                    if ((class240.field3406[var16][var10][var12] & 0x8) == 0) {
                        if (var15 && arg2[var16][var10][var12] != null) {
                            if (arg2[var16][var10][var12].field2873 != null) {
                                int var17 = class106.method781(true, var11);
                                if (arg2[var16][var10][var12].field2873.field56 == var17 || arg2[var16][var10][var12].field2873.field71 == var17) {
                                    continue;
                                }
                                if (var9 != 0) {
                                    int var18 = class106.method781(true, var9);
                                    if (arg2[var16][var10][var12].field2873.field56 == var18 || arg2[var16][var10][var12].field2873.field71 == var18) {
                                        continue;
                                    }
                                }
                                if (var14 != 0) {
                                    int var19 = class106.method781(true, var14);
                                    if (arg2[var16][var10][var12].field2873.field56 == var19 || arg2[var16][var10][var12].field2873.field71 == var19) {
                                        continue;
                                    }
                                }
                            }
                            if (arg2[var16][var10][var12].field2896 != null) {
                                for (int var20 = 0; var20 < arg2[var16][var10][var12].field2875; var20++) {
                                    int var21 = (int) (arg2[var16][var10][var12].field2896[var20].field4203 >> 14 & 0x3FL);
                                    if (var21 == 21) {
                                        var21 = 19;
                                    }
                                    int var22 = (int) (arg2[var16][var10][var12].field2896[var20].field4203 >> 20 & 0x3L);
                                    int var23 = var21 | var22 << 6;
                                    if (var11 == var23 || var9 != 0 && var9 == var23 || var14 != 0 && var14 == var23) {
                                        continue label246;
                                    }
                                }
                            }
                        }
                        var13 = true;
                        class202 var24 = arg2[var16][var10][var12];
                        if (var24 != null && var24.field2875 > 0) {
                            for (int var25 = 0; var25 < var24.field2875; var25++) {
                                class280 var26 = var24.field2896[var25];
                                if (var26.field4205 != var26.field4204 || var26.field4200 != var26.field4198) {
                                    for (int var27 = var26.field4204; var27 <= var26.field4205; var27++) {
                                        for (int var28 = var26.field4200; var28 <= var26.field4198; var28++) {
                                            class136.field1887[var16][var27][var28] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class136.field1887[var16][var10][var12] = var6;
                    }
                }
                if (var13) {
                    if (class124.field1672[arg0] < class333.field5020[class251.field3603 + 1][var10][var12]) {
                        class124.field1672[arg0] = class333.field5020[class251.field3603 + 1][var10][var12];
                    }
                    int var29 = var12 << 7;
                    int var30 = var10 << 7;
                    if (class289.field4306[arg0] > var30) {
                        class289.field4306[arg0] = var30;
                    } else if (var30 > class21.field277[arg0]) {
                        class21.field277[arg0] = var30;
                    }
                    if (var29 < class100.field1372[arg0]) {
                        class100.field1372[arg0] = var29;
                    } else if (var29 > class254.field3632[arg0]) {
                        class254.field3632[arg0] = var29;
                    }
                }
                if (!var15) {
                    if (var10 >= 1 && class136.field1887[class251.field3603][var10 - 1][var12] != var6) {
                        class224.field3225[var31] = class190.method1334(class190.method1334(1179648, var10 - 1), -754974720);
                        class197.field2755[var31] = class190.method1334(var12, 1245184);
                        class136.field1887[class251.field3603][var10 - 1][var12] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var12++;
                    if (var12 < 104) {
                        if (var10 - 1 >= 0 && class136.field1887[class251.field3603][var10 - 1][var12] != var6 && (class240.field3406[class251.field3603][var10][var12] & 0x4) == 0 && (class240.field3406[class251.field3603][var10 - 1][var12 - 1] & 0x4) == 0) {
                            class224.field3225[var31] = class190.method1334(1375731712, class190.method1334(1179648, var10 - 1));
                            class197.field2755[var31] = class190.method1334(1245184, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class136.field1887[class251.field3603][var10 - 1][var12] = var6;
                        }
                        if (class136.field1887[class251.field3603][var10][var12] != var6) {
                            class224.field3225[var31] = class190.method1334(class190.method1334(5373952, var10), 318767104);
                            class197.field2755[var31] = class190.method1334(5439488, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class136.field1887[class251.field3603][var10][var12] = var6;
                        }
                        if ((var10 + 1) < 104 && class136.field1887[class251.field3603][var10 + 1][var12] != var6 && (class240.field3406[class251.field3603][var10][var12] & 0x4) == 0 && (class240.field3406[class251.field3603][var10 + 1][var12 - 1] & 0x4) == 0) {
                            class224.field3225[var31] = class190.method1334(class190.method1334(var10 + 1, 5373952), -1845493760);
                            class197.field2755[var31] = class190.method1334(var12, 5439488);
                            var31 = var31 + 1 & 0xFFF;
                            class136.field1887[class251.field3603][var10 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if ((var10 + 1) < 104 && class136.field1887[class251.field3603][var10 + 1][var12] != var6) {
                        class224.field3225[var31] = class190.method1334(1392508928, class190.method1334(var10 + 1, 9568256));
                        class197.field2755[var31] = class190.method1334(9633792, var12);
                        class136.field1887[class251.field3603][var10 + 1][var12] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var10 - 1 >= 0 && class136.field1887[class251.field3603][var10 - 1][var12] != var6 && (class240.field3406[class251.field3603][var10][var12] & 0x4) == 0 && (class240.field3406[class251.field3603][var10 - 1][var12 + 1] & 0x4) == 0) {
                            class224.field3225[var31] = class190.method1334(301989888, class190.method1334(var10 - 1, 13762560));
                            class197.field2755[var31] = class190.method1334(13828096, var12);
                            class136.field1887[class251.field3603][var10 - 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class136.field1887[class251.field3603][var10][var12] != var6) {
                            class224.field3225[var31] = class190.method1334(-1828716544, class190.method1334(13762560, var10));
                            class197.field2755[var31] = class190.method1334(13828096, var12);
                            class136.field1887[class251.field3603][var10][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var10 + 1) < 104 && class136.field1887[class251.field3603][var10 + 1][var12] != var6 && (class240.field3406[class251.field3603][var10][var12] & 0x4) == 0 && (class240.field3406[class251.field3603][var10 + 1][var12 + 1] & 0x4) == 0) {
                            class224.field3225[var31] = class190.method1334(class190.method1334(var10 + 1, 9568256), -771751936);
                            class197.field2755[var31] = class190.method1334(var12, 9633792);
                            var31 = var31 + 1 & 0xFFF;
                            class136.field1887[class251.field3603][var10 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (arg5 != 50) {
                method1891((byte) -18);
            }
            if (class124.field1672[arg0] != -1000000) {
                class124.field1672[arg0] += 10;
                class289.field4306[arg0] -= 50;
                class21.field277[arg0] += 50;
                class254.field3632[arg0] += 50;
                class100.field1372[arg0] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IZLin;)V", line = 364)
    public static final void method1893(int arg0, boolean arg1, class344 arg2) {
        int var3 = arg2.field5200 == 0 ? arg2.field5293 : arg2.field5200;
        if (arg0 != -24740) {
            method1892(33, -10, (class202[][][]) ((class202[][][]) null), 45, false, 24);
        }
        int var4 = arg2.field5197 == 0 ? arg2.field5334 : arg2.field5197;
        class63.method424(var3, class241.field3419[arg2.field5206 >> 16], arg2.field5206, var4, (byte) 59, arg1);
        field4127++;
        if (arg2.field5248 != null) {
            class63.method424(var3, arg2.field5248, arg2.field5206, var4, (byte) 108, arg1);
        }
        class48 var5 = (class48) class211.field3056.method111(66, (long) arg2.field5206);
        if (var5 != null) {
            class61.method412(var3, arg1, var4, (byte) 23, var5.field595);
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V", line = 462)
    public class275() {
        super(1, false);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)[[I", line = 394)
    public final int[][] method53(int arg0, int arg1) {
        int var3 = 86 / ((arg0 + 31) / 37);
        field4120++;
        int[][] var4 = this.field4840.method1625(arg1, -13241);
        if (this.field4840.field3352) {
            int var5 = class326.field4933 / this.field4121;
            int var6 = class340.field5109 / this.field4125;
            int[][] var8;
            if (var6 > 0) {
                int var7 = arg1 % var6;
                var8 = this.method2227(0, 80, class340.field5109 * var7 / var6);
            } else {
                var8 = this.method2227(0, 61, 0);
            }
            int[] var9 = var8[0];
            int[] var10 = var8[1];
            int[] var11 = var4[1];
            int[] var12 = var8[2];
            int[] var13 = var4[2];
            int[] var14 = var4[0];
            for (int var15 = 0; var15 < class326.field4933; var15++) {
                int var17;
                if (var5 > 0) {
                    int var16 = var15 % var5;
                    var17 = class326.field4933 * var16 / var5;
                } else {
                    var17 = 0;
                }
                var14[var15] = var9[var17];
                var11[var15] = var10[var17];
                var13[var15] = var12[var17];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BLwa;)V", line = 471)
    public static final void method1894(byte arg0, class80 arg1) {
        class120 var2 = null;
        try {
            class285 var3 = arg1.method630(-120, "runescape");
            while (var3.field4241 == 0) {
                class186.method1304(10, 1L);
            }
            if (var3.field4241 == 1) {
                var2 = (class120) var3.field4244;
                class316 var4 = class216.method1494((byte) -126);
                var2.method871((byte) -69, 0, var4.field4777, var4.field4798);
            }
            int var5 = -128 / ((arg0 - 42) / 58);
        } catch (Exception var9) {
        }
        field4129++;
        try {
            if (var2 != null) {
                var2.method870(0);
            }
        } catch (Exception var8) {
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(II)[I", line = 508)
    public final int[] method140(int arg0, int arg1) {
        if (arg0 != 542) {
            return (int[]) null;
        }
        field4126++;
        int[] var3 = this.field4847.method1387(arg1, (byte) -42);
        if (this.field4847.field2751) {
            int var4 = class326.field4933 / this.field4121;
            int var5 = class340.field5109 / this.field4125;
            int[] var6;
            if (var5 <= 0) {
                var6 = this.method2225((byte) 66, 0, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method2225((byte) 66, 0, class340.field5109 * var7 / var5);
            }
            for (int var8 = 0; var8 < class326.field4933; var8++) {
                if (var4 <= 0) {
                    var3[var8] = var6[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class326.field4933 * var9 / var4];
                }
            }
        }
        return var3;
    }
}
