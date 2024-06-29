import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class126 extends class1 {

    @OriginalMember(owner = "client!gf", name = "M", descriptor = "I")
    public int field1907 = 0;

    @OriginalMember(owner = "client!gf", name = "J", descriptor = "Ljava/lang/String;")
    public static String field1904 = "Loading - please wait.";

    @OriginalMember(owner = "client!gf", name = "O", descriptor = "[Z")
    public static boolean[] field1909 = new boolean[100];

    @OriginalMember(owner = "client!gf", name = "H", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!gf", name = "I", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!gf", name = "K", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!gf", name = "L", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!gf", name = "N", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!gf", name = "G", descriptor = "Lpf;")
    public static class294 field1901;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V")
    public static final void method791(int arg0, int arg1) {
        if (arg1 != 0) {
            method795(-51, 55);
        }
        class75 var2 = (class75) class166.field2549.method1666((long) arg0, (byte) 65);
        field1905++;
        if (var2 != null) {
            var2.method538(71);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILfl;)Lj;")
    public static final class167 method792(int arg0, class248 arg1) {
        if (arg0 != 64) {
            method796((byte) -125);
        }
        field1902++;
        return new class167(arg1.method1606((byte) 77), arg1.method1606((byte) 77), arg1.method1606((byte) 77), arg1.method1606((byte) 77), arg1.method1587(-126), arg1.method1587(-123), arg1.method1593((byte) 27));
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILfl;I)V")
    private final void method793(int arg0, class248 arg1, int arg2) {
        field1906++;
        if (arg0 == 2) {
            this.field1907 = arg1.method1575(false);
        }
        if (arg2 != -2094660761) {
            field1904 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lud;)V")
    public static final void method794(class2 arg0) {
        for (int var1 = arg0.field26; var1 <= arg0.field25; var1++) {
            for (int var2 = arg0.field23; var2 <= arg0.field34; var2++) {
                class270 var3 = class33.field487[arg0.field35][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field4071; var4++) {
                        if (var3.field4069[var4] == arg0) {
                            var3.field4071--;
                            for (int var5 = var4; var5 < var3.field4071; var5++) {
                                var3.field4069[var5] = var3.field4069[var5 + 1];
                                var3.field4076[var5] = var3.field4076[var5 + 1];
                            }
                            var3.field4069[var3.field4071] = null;
                            break;
                        }
                    }
                    var3.field4065 = 0;
                    for (int var6 = 0; var6 < var3.field4071; var6++) {
                        var3.field4065 |= var3.field4076[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)V")
    public static final void method795(int arg0, int arg1) {
        field1908++;
        if (arg0 != 1) {
            method792(107, (class248) null);
        }
        int var2 = class141.field2069;
        if (arg1 == 0) {
            var2 = 1;
        }
        int var10002;
        for (int var3 = 0; var3 < var2; var3++) {
            class107 var20;
            if (arg1 == 0) {
                var20 = class165.field2537;
            } else {
                var20 = class96.field1521[class58.field918[var3]];
            }
            if (var20 != null && var20.method414(1000)) {
                int var21 = var20.method676(arg0 - 30218);
                if (arg1 == 0 || arg1 == var21) {
                    if (var21 == 1) {
                        if ((var20.field2251 & 0x7F) == 64 && (var20.field2234 & 0x7F) == 64) {
                            int var28 = var20.field2251 >> 7;
                            int var29 = var20.field2234 >> 7;
                            if (var28 >= 0 && var28 < 104 && var29 >= 0 && var29 < 104) {
                                var10002 = class187.field2828[var28][var29]++;
                            }
                        }
                    } else if (((var21 & 0x1) != 0 || (var20.field2251 & 0x7F) == 0 && (var20.field2234 & 0x7F) == 0) && ((var21 & 0x1) != 1 || (var20.field2251 & 0x7F) == 64 && (var20.field2234 & 0x7F) == 64)) {
                        int var22 = var20.field2251 - var21 * 64 >> 7;
                        int var23 = var20.field2234 - (var21 * 64) >> 7;
                        int var24 = var22 + var20.method676(-30217);
                        if (var24 > 104) {
                            var24 = 104;
                        }
                        int var25 = var20.method676(-30217) + var23;
                        if (var22 < 0) {
                            var22 = 0;
                        }
                        if (var23 < 0) {
                            var23 = 0;
                        }
                        if (var25 > 104) {
                            var25 = 104;
                        }
                        for (int var26 = var22; var26 < var24; var26++) {
                            for (int var27 = var23; var27 < var25; var27++) {
                                var10002 = class187.field2828[var26][var27]++;
                            }
                        }
                    }
                }
            }
        }
        label216: for (int var4 = 0; var4 < var2; var4++) {
            long var5;
            class107 var7;
            if (arg1 == 0) {
                var5 = 8791798054912L;
                var7 = class165.field2537;
            } else {
                var7 = class96.field1521[class58.field918[var4]];
                var5 = (long) class58.field918[var4] << 32;
            }
            if (var7 != null && var7.method414(1000)) {
                int var8 = var7.method676(-30217);
                if (arg1 == 0 || arg1 == var8) {
                    var7.field2263 = true;
                    var7.field1659 = false;
                    if ((class102.field1602 && class141.field2069 > 200 || class141.field2069 > 50) && arg1 != 0 && var7.field2303 == var7.method928(24840).field2414) {
                        var7.field1659 = true;
                    }
                    if (var8 == 1) {
                        if ((var7.field2251 & 0x7F) == 64 && (var7.field2234 & 0x7F) == 64) {
                            int var18 = var7.field2251 >> 7;
                            int var19 = var7.field2234 >> 7;
                            if (var18 < 0 || var18 >= 104 || var19 < 0 || var19 >= 104) {
                                continue;
                            }
                            if (class187.field2828[var18][var19] > 1) {
                                var10002 = class187.field2828[var18][var19]--;
                                continue;
                            }
                        }
                    } else if ((var8 & 0x1) == 0 && (var7.field2251 & 0x7F) == 0 && (var7.field2234 & 0x7F) == 0 || (var8 & 0x1) == 1 && (var7.field2251 & 0x7F) == 64 && (var7.field2234 & 0x7F) == 0) {
                        int var9 = var7.field2251 - (var8 * 64) >> 7;
                        int var10 = var7.field2234 - (var8 * 64) >> 7;
                        int var11 = var8 + var10;
                        boolean var12 = true;
                        if (var11 > 104) {
                            var11 = 104;
                        }
                        int var13 = var8 + var9;
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        if (var13 > 104) {
                            var13 = 104;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        for (int var14 = var9; var14 < var13; var14++) {
                            for (int var17 = var10; var17 < var11; var17++) {
                                if (class187.field2828[var14][var17] <= 1) {
                                    var12 = false;
                                    break;
                                }
                            }
                        }
                        if (var12) {
                            int var15 = var9;
                            while (true) {
                                if (var15 >= var13) {
                                    continue label216;
                                }
                                for (int var16 = var10; var16 < var11; var16++) {
                                    var10002 = class187.field2828[var15][var16]--;
                                }
                                var15++;
                            }
                        }
                    }
                    if (var7.field2267 == null || class270.field4058 < var7.field2240 || class270.field4058 >= var7.field2203) {
                        var7.field2263 = false;
                        var7.field2271 = class183.method1139(class99.field1557, var7.field2234, var7.field2251, (byte) 117);
                        class101.method653(class99.field1557, var7.field2251, var7.field2234, var7.field2271, var8 * 64 - 4, var7, var7.field2273, var5, var7.field2298);
                    } else {
                        var7.field1659 = false;
                        var7.field2263 = false;
                        var7.field2271 = class183.method1139(class99.field1557, var7.field2234, var7.field2251, (byte) 117);
                        class284.method1868(class99.field1557, var7.field2251, var7.field2234, var7.field2271, var7, var7.field2273, var5, var7.field2288, var7.field2243, var7.field2245, var7.field2223);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "(B)V")
    public static void method796(byte arg0) {
        field1901 = null;
        field1904 = null;
        if (arg0 == -23) {
            field1909 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(ILfl;)V")
    public final void method797(int arg0, class248 arg1) {
        field1903++;
        while (true) {
            int var3 = arg1.method1593((byte) 27);
            if (var3 == 0) {
                if (arg0 == -1) {
                    return;
                } else {
                    method792(50, (class248) null);
                    return;
                }
            }
            this.method793(var3, arg1, arg0 ^ 0x7CD9FC98);
        }
    }
}
