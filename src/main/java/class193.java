import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class193 extends class12 {

    @OriginalMember(owner = "client!mc", name = "ob", descriptor = "Ljava/lang/String;")
    public static String field3170 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!mc", name = "mb", descriptor = "I")
    public static int field3168 = 0;

    @OriginalMember(owner = "client!mc", name = "kb", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!mc", name = "nb", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!mc", name = "pb", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!mc", name = "qb", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!mc", name = "rb", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!mc", name = "sb", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!mc", name = "tb", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!mc", name = "lb", descriptor = "Ljg;")
    public static class315 field3167;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)V", line = 10)
    public static final void method1410(int arg0, int arg1) {
        field3175++;
        class179 var2 = class319.method2220(arg1, (byte) -114, 12);
        if (arg0 < 18) {
            field3170 = (String) null;
        }
        var2.method1239(true);
    }

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "(B)V", line = 25)
    public static final void method1411(byte arg0) {
        class102.field1557 = null;
        class313.field4867 = null;
        class119.field1825 = null;
        class12.field143 = null;
        int var1 = 74 % ((34 - arg0) / 43);
        field3166++;
    }

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "(I)V", line = 36)
    public static final void method1412(int arg0) {
        field3174++;
        int var1 = class86.field1297;
        int var2 = class181.field2932;
        int var3 = class333.field5166;
        int var4 = class12.field136 - 3;
        if (arg0 != 2) {
            return;
        }
        byte var5 = 20;
        if (class151.field2318 == null || class314.field4897 == null) {
            if (class149.field2248.method246(false, class271.field4302) && class149.field2248.method246(false, class320.field5023)) {
                class151.field2318 = class310.method2168(0, (byte) 96, class271.field4302, class149.field2248);
                class314.field4897 = class310.method2168(0, (byte) 88, class320.field5023, class149.field2248);
                if (class186.field2991) {
                    if ((class151.field2318 instanceof class82)) {
                        class151.field2318 = new class311((class298) class151.field2318);
                    } else {
                        class151.field2318 = new class14((class298) class151.field2318);
                    }
                    if ((class314.field4897 instanceof class82)) {
                        class314.field4897 = new class311((class298) class314.field4897);
                    } else {
                        class314.field4897 = new class14((class298) class314.field4897);
                    }
                }
            } else if (class186.field2991) {
                class344.method2378(var1, var3, var2, var5, client.field4232, 256 - class42.field583);
            } else {
                class216.method1584(var1, var3, var2, var5, client.field4232, 256 - class42.field583);
            }
        }
        if (class151.field2318 != null && class314.field4897 != null) {
            int var6 = (var2 - (class314.field4897.field5040 * 2)) / class151.field2318.field5040;
            for (int var7 = 0; var7 < var6; var7++) {
                class151.field2318.method84(class151.field2318.field5040 * var7 + var1 + class314.field4897.field5040, var3);
            }
            class314.field4897.method84(var1, var3);
            class314.field4897.method79(var2 + var1 - class314.field4897.field5040, var3);
        }
        class55.field732.method1009(class188.field3062, var1 + 3, var3 + 14, class208.field3401, -1);
        if (class186.field2991) {
            class344.method2378(var1, var3 + var5, var2, var4 - var5, client.field4232, 256 - class42.field583);
        } else {
            class216.method1584(var1, var3 + var5, var2, var4 - var5, client.field4232, 256 - class42.field583);
        }
        int var8 = class164.field2672;
        int var9 = class4.field35;
        for (int var10 = 0; var10 < class126.field1887; var10++) {
            int var11 = var5 + var3 + ((class126.field1887 + -1 + -var10) * 15) + 13;
            if (var8 > var1 && var8 < var1 + var2 && var9 > var11 - 13 && (var11 + 3) > var9) {
                if (class186.field2991) {
                    class344.method2378(var1, var11 - 12, var2, 15, class249.field3956, 256 - class147.field2195);
                } else {
                    class216.method1584(var1, var11 - 12, var2, 15, class249.field3956, 256 - class147.field2195);
                }
            }
        }
        if ((class55.field726 == null || class253.field4006 == null || class281.field4419 == null) && class149.field2248.method246(false, class107.field1613) && class149.field2248.method246(false, class338.field5246) && class149.field2248.method246(false, class52.field706)) {
            class55.field726 = class310.method2168(0, (byte) 99, class107.field1613, class149.field2248);
            class253.field4006 = class310.method2168(0, (byte) 89, class338.field5246, class149.field2248);
            class281.field4419 = class310.method2168(0, (byte) 90, class52.field706, class149.field2248);
            if (class186.field2991) {
                if (class55.field726 instanceof class82) {
                    class55.field726 = new class311((class298) class55.field726);
                } else {
                    class55.field726 = new class14((class298) class55.field726);
                }
                if ((class253.field4006 instanceof class82)) {
                    class253.field4006 = new class311((class298) class253.field4006);
                } else {
                    class253.field4006 = new class14((class298) class253.field4006);
                }
                if (class281.field4419 instanceof class82) {
                    class281.field4419 = new class311((class298) class281.field4419);
                } else {
                    class281.field4419 = new class14((class298) class281.field4419);
                }
            }
        }
        if (class55.field726 != null && class253.field4006 != null && class281.field4419 != null) {
            int var12 = (var2 - class281.field4419.field5040 * 2) / class55.field726.field5040;
            for (int var13 = 0; var13 < var12; var13++) {
                class55.field726.method84(class55.field726.field5040 * var13 + class281.field4419.field5040 + var1, -class55.field726.field5030 + var3 + var4);
            }
            int var14 = (var4 - class281.field4419.field5030 - var5) / class253.field4006.field5030;
            for (int var15 = 0; var15 < var14; var15++) {
                class253.field4006.method84(var1, var3 + var5 + (class253.field4006.field5030 * var15));
                class253.field4006.method79(var1 + var2 - class253.field4006.field5040, class253.field4006.field5030 * var15 + var3 + var5);
            }
            class281.field4419.method84(var1, var4 + var3 - class281.field4419.field5030);
            class281.field4419.method79(var2 + var1 - class281.field4419.field5040, var3 + var4 + -class281.field4419.field5030);
        }
        for (int var16 = 0; var16 < class126.field1887; var16++) {
            int var17 = (class126.field1887 - var16 - 1) * 15 + var5 + var3 + 13;
            int var18 = class208.field3401;
            if (var1 < var8 && var8 < var1 + var2 && var17 - 13 < var9 && (var17 + 3) > var9) {
                var18 = class321.field5031;
            }
            class55.field732.method1009(class93.method675(var16, true), var1 + 3, var17, var18, 0);
        }
        class198.method1446(class86.field1297, class333.field5166, (byte) -95, class12.field136, class181.field2932);
    }

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "(B)V", line = 212)
    public static void method1413(byte arg0) {
        if (arg0 < 10) {
            field3168 = -46;
        }
        field3167 = null;
        field3170 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIII)V", line = 225)
    public static final void method1414(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class337.field5229 != 0 && arg1 != 0 && class126.field1879 < 50 && arg0 != -1) {
            class315.field4900[class126.field1879] = arg0;
            class66.field855[class126.field1879] = arg1;
            class228.field3618[class126.field1879] = arg3;
            class343.field5353[class126.field1879] = null;
            class336.field5218[class126.field1879] = 0;
            class152.field2328[class126.field1879] = arg2;
            class126.field1879++;
        }
        field3172++;
        if (arg4 <= 52) {
            field3167 = (class315) null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(II)V", line = 251)
    public static final void method1415(int arg0, int arg1) {
        field3171++;
        int var2 = class24.field350;
        if (arg0 == 0) {
            var2 = 1;
        }
        int var10002;
        for (int var3 = 0; var3 < var2; var3++) {
            class320 var4;
            if (arg0 == 0) {
                var4 = class13.field159;
            } else {
                var4 = class100.field1523[class103.field1575[var3]];
            }
            if (var4 != null && var4.method911(111)) {
                int var5 = var4.method910(-1);
                if (arg0 == 0 || arg0 == var5) {
                    if (var5 == 1) {
                        if ((var4.field1980 & 0x7F) == 64 && (var4.field1944 & 0x7F) == 64) {
                            int var6 = var4.field1944 >> 7;
                            int var7 = var4.field1980 >> 7;
                            if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                                var10002 = class132.field2000[var7][var6]++;
                            }
                        }
                    } else if (((var5 & 0x1) != 0 || (var4.field1980 & 0x7F) == 0 && (var4.field1944 & 0x7F) == 0) && ((var5 & 0x1) != 1 || (var4.field1980 & 0x7F) == 64 && (var4.field1944 & 0x7F) == 64)) {
                        int var8 = var4.field1980 - var5 * 64 >> 7;
                        int var9 = var4.field1944 - (var5 * 64) >> 7;
                        int var10 = var4.method910(-1) + var8;
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        if (var10 > 104) {
                            var10 = 104;
                        }
                        int var11 = var9 + var4.method910(-1);
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        if (var11 > 104) {
                            var11 = 104;
                        }
                        for (int var12 = var8; var12 < var10; var12++) {
                            for (int var13 = var9; var13 < var11; var13++) {
                                var10002 = class132.field2000[var12][var13]++;
                            }
                        }
                    }
                }
            }
        }
        if (arg1 > -97) {
            return;
        }
        label226: for (int var14 = 0; var14 < var2; var14++) {
            class320 var15;
            long var16;
            if (arg0 == 0) {
                var15 = class13.field159;
                var16 = 8791798054912L;
            } else {
                var15 = class100.field1523[class103.field1575[var14]];
                var16 = (long) class103.field1575[var14] << 32;
            }
            if (var15 != null && var15.method911(105)) {
                int var18 = var15.method910(-1);
                if (arg0 == 0 || arg0 == var18) {
                    var15.field5015 = false;
                    var15.field2017 = true;
                    if ((class196.field3219 && class24.field350 > 200 || class24.field350 > 50) && arg0 != 0 && var15.field1994 == var15.method899(true).field3354) {
                        var15.field5015 = true;
                    }
                    if (var18 == 1) {
                        if ((var15.field1980 & 0x7F) == 64 && (var15.field1944 & 0x7F) == 64) {
                            int var19 = var15.field1944 >> 7;
                            int var20 = var15.field1980 >> 7;
                            if (var20 < 0 || var20 >= 104 || var19 < 0 || var19 >= 104) {
                                continue;
                            }
                            if (class132.field2000[var20][var19] > 1) {
                                var10002 = class132.field2000[var20][var19]--;
                                continue;
                            }
                        }
                    } else if ((var18 & 0x1) == 0 && (var15.field1980 & 0x7F) == 0 && (var15.field1944 & 0x7F) == 0 || (var18 & 0x1) == 1 && (var15.field1980 & 0x7F) == 64 && (var15.field1944 & 0x7F) == 0) {
                        int var21 = var15.field1944 - var18 * 64 >> 7;
                        boolean var22 = true;
                        int var23 = var18 + var21;
                        if (var23 > 104) {
                            var23 = 104;
                        }
                        int var24 = var15.field1980 - var18 * 64 >> 7;
                        if (var21 < 0) {
                            var21 = 0;
                        }
                        int var25 = var18 + var24;
                        if (var24 < 0) {
                            var24 = 0;
                        }
                        if (var25 > 104) {
                            var25 = 104;
                        }
                        for (int var26 = var24; var26 < var25; var26++) {
                            for (int var27 = var21; var27 < var23; var27++) {
                                if (class132.field2000[var26][var27] <= 1) {
                                    var22 = false;
                                    break;
                                }
                            }
                        }
                        if (var22) {
                            int var28 = var24;
                            while (true) {
                                if (var28 >= var25) {
                                    continue label226;
                                }
                                for (int var29 = var21; var29 < var23; var29++) {
                                    var10002 = class132.field2000[var28][var29]--;
                                }
                                var28++;
                            }
                        }
                    }
                    if (var15.field1986 == null || var15.field1982 > class48.field648 || var15.field1999 <= class48.field648) {
                        var15.field2017 = false;
                        var15.field1943 = class227.method1653(var15.field1980, var15.field1944, -12282, class148.field2209);
                        class290.method2033(class148.field2209, var15.field1980, var15.field1944, var15.field1943, (var18 - 1) * 64 + 60, var15, var15.field2037, var16, var15.field1965);
                    } else {
                        var15.field2017 = false;
                        var15.field5015 = false;
                        var15.field1943 = class227.method1653(var15.field1980, var15.field1944, -12282, class148.field2209);
                        class105.method734(class148.field2209, var15.field1980, var15.field1944, var15.field1943, var15, var15.field2037, var16, var15.field2035, var15.field1971, var15.field1966, var15.field1963);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)[[I", line = 522)
    public final int[][] method54(int arg0, byte arg1) {
        int var3 = 52 % ((40 - arg1) / 41);
        field3173++;
        int[][] var4 = this.field197.method715(true, arg0);
        if (this.field197.field1548 && this.method72((byte) -89)) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int var7 = arg0 % this.field141 * this.field141;
            int[] var8 = var4[2];
            for (int var9 = 0; var9 < class276.field4376; var9++) {
                int var10 = this.field139[var9 % this.field145 + var7];
                var8[var9] = class200.method1465(4080, var10 << 4);
                var6[var9] = class200.method1465(var10 >> 4, 4080);
                var5[var9] = class200.method1465(16711680, var10) >> 12;
            }
        }
        return var4;
    }
}
