import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class200 {

    @OriginalMember(owner = "client!vp", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3125 = new String[] { method1796(method1795("XL*]C")), method1796(method1795("XL*_C")), method1796(method1795("@Ihp")), method1796(method1795("U\u0012*2\u0016")), method1796(method1795("XL*^C")), method1796(method1795("XL*XC")) };

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "I")
    public static int field3122 = 0;

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "I")
    public static int field3119 = 0;

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "Lwia;")
    public static class790 field3121 = new class790(81, 3);

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(Z)V", line = 3)
    public static final void method1791(boolean arg0) {
        try {
            field3123++;
            if (class742.field10801 != -1) {
                int var1 = class606.field8875.method401(16428);
                if (arg0) {
                    int var2 = class606.field8875.method391((byte) 94);
                    class394 var3 = (class394) class417.field6150.method3863((byte) 64);
                    if (var3 != null) {
                        var1 = var3.method2178(false);
                        var2 = var3.method2177((byte) 107);
                    }
                    int var4 = 0;
                    int var5 = 0;
                    if (class235.field3549) {
                        var4 = class398.method3141(1);
                        var5 = class779.method5635((byte) 32);
                    }
                    class561.method4192(var5, class94.field1062 + var5, var4, var2, class179.field2489 + var4, var1, var2 + var5, class742.field10801, var4, -1, var1 + var4, var5);
                    if (class67.field705 != null) {
                        class37.method247((byte) -116, var1 + var4, var2 + var5);
                    }
                }
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field3125[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Z)V", line = 46)
    public static final void method1792(boolean arg0) {
        try {
            field3124++;
            if (arg0) {
                method1792(true);
            }
            for (int var1 = 0; var1 < class86.field958; var1++) {
                class305 var2 = class534.field7826[var1];
                boolean var3 = false;
                if (var2.field4759 == null) {
                    var2.field4762--;
                    if (var2.field4762 >= (var2.method2588(27443) ? -1500 : -10)) {
                        if (var2.field4768 == 1 && var2.field4770 == null) {
                            var2.field4770 = class395.method3125(class227.field3474, var2.field4763, 0);
                            if (var2.field4770 == null) {
                                continue;
                            }
                            var2.field4762 += var2.field4770.method3124();
                        } else if (var2.method2588(27443) && (var2.field4766 == null || var2.field4764 == null)) {
                            if (var2.field4766 == null) {
                                var2.field4766 = class438.method3367(class571.field8452, var2.field4763);
                            }
                            if (var2.field4766 == null) {
                                continue;
                            }
                            if (var2.field4764 == null) {
                                var2.field4764 = var2.field4766.method3366(new int[] { 22050 });
                                if (var2.field4764 == null) {
                                    continue;
                                }
                            }
                        }
                        if (var2.field4762 < 0) {
                            int var4 = 8192;
                            int var5;
                            if (var2.field4774 == 0) {
                                var5 = var2.field4761 * (var2.field4768 == 3 ? class289.field4305.field841.method4492(false) : class289.field4305.field838.method4492(false)) >> 2;
                            } else {
                                int var6 = (var2.field4774 & 0x3A9628D) >> 24;
                                if (class225.field3446.field6200 == var6) {
                                    int var7 = (var2.field4774 & 0xFF) << 9;
                                    int var8 = class225.field3446.method2101(31463) << 8;
                                    int var9 = var2.field4774 >> 16 & 0xFF;
                                    int var10 = (var9 << 9) + var8 + 256 - class225.field3446.field6197;
                                    int var11 = (var2.field4774 & 0xFFAF) >> 8;
                                    int var12 = (var11 << 9) + var8 + 256 - class225.field3446.field6211;
                                    int var13 = Math.abs(var10) + Math.abs(var12) - 512;
                                    if (var13 > var7) {
                                        var2.field4762 = -99999;
                                        continue;
                                    }
                                    if (var13 < 0) {
                                        var13 = 0;
                                    }
                                    var5 = class289.field4305.field803.method4492(false) * (var7 - var13) * var2.field4761 / var7 >> 2;
                                    if (var2.field4765 != null && var2.field4765 instanceof class343) {
                                        class343 var14 = (class343) var2.field4765;
                                        short var15 = var14.field5329;
                                        short var16 = var14.field5330;
                                    }
                                    if (var10 != 0 || var12 != 0) {
                                        int var17 = (-((int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D)) - 4096) - class93.field1052 & 0x3FFF;
                                        if (var17 > 8192) {
                                            var17 = 16384 - var17;
                                        }
                                        int var18;
                                        if (var13 <= 0) {
                                            var18 = 8192;
                                        } else if (var13 >= 4096) {
                                            var18 = 16384;
                                        } else {
                                            var18 = ((8192 - var13) / 4096) + 8192;
                                        }
                                        var4 = (16384 - var18 >> 1) + var17 * var18 / 8192;
                                    }
                                } else {
                                    var5 = 0;
                                }
                            }
                            if (var5 > 0) {
                                class105 var19 = null;
                                if (var2.field4768 == 1) {
                                    var19 = var2.field4770.method3127().method930(class231.field3499);
                                } else if (var2.method2588(27443)) {
                                    var19 = var2.field4764;
                                }
                                class303 var20 = var2.field4759 = class303.method2578(var19, var2.field4771, var5, var4);
                                var20.method2555(var2.field4773 - 1);
                                class594.field8714.method4981(var20);
                            }
                        }
                    } else {
                        var3 = true;
                    }
                } else if (!var2.field4759.method1823(0)) {
                    var3 = true;
                }
                if (var3) {
                    class86.field958--;
                    for (int var21 = var1; var21 < class86.field958; var21++) {
                        class534.field7826[var21] = class534.field7826[var21 + 1];
                    }
                    var1--;
                }
            }
            if (class719.field10416 && !class562.method4198(0)) {
                if (class289.field4305.field837.method4492(false) != 0 && class96.field1077 != -1) {
                    if (class48.field548 == null) {
                        class638.method4683(class289.field4305.field837.method4492(arg0), class232.field3503, 0, false, 0, class96.field1077);
                    } else {
                        class717.method5227(false, class289.field4305.field837.method4492(false), 0, class48.field548, class96.field1077, class232.field3503, 122);
                    }
                }
                class719.field10416 = false;
                class48.field548 = null;
            } else if (class289.field4305.field837.method4492(false) != 0 && class96.field1077 != -1 && !class562.method4198(0)) {
                class548.field8177++;
                class280 var22 = class610.method4508(class299.field4708, class279.field4190, (byte) -84);
                var22.field4197.method1412(true, class96.field1077);
                class106.method934((byte) 53, var22);
                class96.field1077 = -1;
            }
        } catch (RuntimeException var24) {
            throw class759.method5498(var24, field3125[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;C)Ljava/lang/String;", line = 268)
    public static final String method1793(String arg0, boolean arg1, String arg2, char arg3) {
        try {
            field3120++;
            int var4 = arg0.length();
            int var5 = arg2.length();
            int var6 = var4;
            int var7 = var5 - 1;
            if (var7 != 0) {
                int var8 = 0;
                while (true) {
                    var8 = arg0.indexOf(arg3, var8);
                    if (var8 < 0) {
                        break;
                    }
                    var6 += var7;
                    var8++;
                }
            }
            StringBuffer var9 = new StringBuffer(var6);
            int var10 = 0;
            if (arg1) {
                field3121 = null;
            }
            while (true) {
                int var11 = arg0.indexOf(arg3, var10);
                if (var11 < 0) {
                    var9.append(arg0.substring(var10));
                    return var9.toString();
                }
                var9.append(arg0.substring(var10, var11));
                var10 = var11 + 1;
                var9.append(arg2);
            }
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field3125[4] + (arg0 == null ? field3125[2] : field3125[3]) + ',' + arg1 + ',' + (arg2 == null ? field3125[2] : field3125[3]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V", line = 336)
    public static void method1794(byte arg0) {
        try {
            if (arg0 != -79) {
                field3121 = null;
            }
            field3121 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3125[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vp", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1795(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vp", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1796(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 46;
                    break;
                case 1:
                    var10005 = 60;
                    break;
                case 2:
                    var10005 = 4;
                    break;
                case 3:
                    var10005 = 28;
                    break;
                default:
                    var10005 = 107;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
