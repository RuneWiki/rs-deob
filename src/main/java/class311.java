import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class311 {

    @OriginalMember(owner = "client!de", name = "f", descriptor = "Z")
    public static boolean field4905 = true;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field4904 = 0;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "Lmo;")
    public static class447 field4900;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BI)Lqb;", line = 7)
    public static final class121 method2079(byte arg0, int arg1) {
        if (arg0 != -12) {
            field4900 = null;
        }
        field4901++;
        class121 var2 = (class121) class180.field2947.method331((byte) 69, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class256.field4151.method2771(0, arg1, 3);
        class121 var4 = new class121();
        if (var3 != null) {
            var4.method872(arg0 + 11, new class186(var3));
        }
        var4.method868(20942);
        class180.field2947.method341(arg0 ^ 0xFFFFFFA4, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IILne;B)V", line = 36)
    public static final void method2080(int arg0, int arg1, class172 arg2, byte arg3) {
        if (arg2.field2764 == 1) {
            class211.field3378++;
            class413.method2587(0L, arg2.field2759, 0, -1, 22, arg2.field2865, "", -233);
        }
        if (arg3 >= -126) {
            field4900 = null;
        }
        field4902++;
        if (arg2.field2764 == 2 && !class449.field6546) {
            String var4 = class376.method2400((byte) 79, arg2);
            if (var4 != null) {
                class413.method2587(0L, var4, -1, -1, 46, arg2.field2865, "<col=00ff00>" + arg2.field2715, -233);
                class145.field2279++;
            }
        }
        if (arg2.field2764 == 3) {
            class413.method2587(0L, class351.field5418, 0, -1, 10, arg2.field2865, "", -233);
            class321.field5005++;
        }
        if (arg2.field2764 == 4) {
            class106.field1489++;
            class413.method2587(0L, arg2.field2759, 0, -1, 20, arg2.field2865, "", -233);
        }
        if (arg2.field2764 == 5) {
            class413.method2587(0L, arg2.field2759, 0, -1, 24, arg2.field2865, "", -233);
            class107.field1498++;
        }
        if (arg2.field2764 == 6 && class143.field2262 == null) {
            class378.field5715++;
            class413.method2587(0L, arg2.field2759, -1, -1, 25, arg2.field2865, "", -233);
        }
        if (arg2.field2707 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg2.field2697; var6++) {
                for (int var7 = 0; var7 < arg2.field2692; var7++) {
                    int var8 = (arg2.field2783 + 32) * var7;
                    int var9 = (arg2.field2862 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg2.field2729[var5];
                        var8 += arg2.field2846[var5];
                    }
                    if (var8 <= arg0 && var9 <= arg1 && var8 + 32 > arg0 && arg1 < (var9 + 32)) {
                        class128.field2029 = var5;
                        class369.field5614 = arg2;
                        if (arg2.field2858[var5] > 0) {
                            class53 var10 = client.method1149(arg2);
                            class97 var11 = class155.method1092(true, arg2.field2858[var5] - 1);
                            if (class374.field5639 == 1 && var10.method346((byte) -1)) {
                                if (class288.field4622 != arg2.field2865 || class386.field5838 != var5) {
                                    class433.field6398++;
                                    class413.method2587((long) var11.field1325, class318.field4986, var5, class71.field878, 43, arg2.field2865, class287.field4606 + " -> <col=ff9040>" + var11.field1370, -233);
                                }
                            } else if (class449.field6546 && var10.method346((byte) -1)) {
                                class309 var12 = class264.field4251 == -1 ? null : class255.method1760(class264.field4251, 63);
                                if ((class379.field5737 & 0x10) != 0 && (var12 == null || var11.method726(var12.field4893, (byte) -105, class264.field4251) != var12.field4893)) {
                                    class413.method2587((long) var11.field1325, class306.field4854, var5, class248.field4058, 23, arg2.field2865, class213.field3414 + " -> <col=ff9040>" + var11.field1370, -233);
                                    class97.field1323++;
                                }
                            } else {
                                String[] var13 = var11.field1330;
                                if (var10.method346((byte) -1)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 12;
                                            } else {
                                                var15 = 8;
                                            }
                                            int var16 = -1;
                                            if (var11.field1353 == var14) {
                                                var16 = var11.field1290;
                                            }
                                            if (var11.field1334 == var14) {
                                                var16 = var11.field1358;
                                            }
                                            class413.method2587((long) var11.field1325, var13[var14], var5, var16, var15, arg2.field2865, "<col=ff9040>" + var11.field1370, -233);
                                            class187.field3083++;
                                        }
                                    }
                                }
                                if (var10.method347((byte) 67)) {
                                    class348.field5354++;
                                    class413.method2587((long) var11.field1325, class318.field4986, var5, class71.field878, 7, arg2.field2865, "<col=ff9040>" + var11.field1370, -233);
                                }
                                if (var10.method346((byte) -1) && var13 != null) {
                                    for (int var17 = 2; var17 >= 0; var17--) {
                                        if (var13[var17] != null) {
                                            byte var18 = 0;
                                            int var19 = -1;
                                            if (var17 == 0) {
                                                var18 = 45;
                                            }
                                            if (var17 == 1) {
                                                var18 = 28;
                                            }
                                            if (var17 == 2) {
                                                var18 = 58;
                                            }
                                            if (var11.field1353 == var17) {
                                                var19 = var11.field1290;
                                            }
                                            if (var11.field1334 == var17) {
                                                var19 = var11.field1358;
                                            }
                                            class413.method2587((long) var11.field1325, var13[var17], var5, var19, var18, arg2.field2865, "<col=ff9040>" + var11.field1370, -233);
                                            class54.field678++;
                                        }
                                    }
                                }
                                String[] var20 = arg2.field2867;
                                if (var20 != null) {
                                    for (int var21 = 4; var21 >= 0; var21--) {
                                        if (var20[var21] != null) {
                                            byte var22 = 0;
                                            if (var21 == 0) {
                                                var22 = 17;
                                            }
                                            int var23 = -1;
                                            if (var21 == 1) {
                                                var22 = 51;
                                            }
                                            if (var21 == 2) {
                                                var22 = 31;
                                            }
                                            if (var21 == 3) {
                                                var22 = 35;
                                            }
                                            if (var21 == 4) {
                                                var22 = 15;
                                            }
                                            if (var11.field1353 == var21) {
                                                var23 = var11.field1290;
                                            }
                                            if (var11.field1334 == var21) {
                                                var23 = var11.field1358;
                                            }
                                            class145.field2285++;
                                            class413.method2587((long) var11.field1325, var20[var21], var5, var23, var22, arg2.field2865, "<col=ff9040>" + var11.field1370, -233);
                                        }
                                    }
                                }
                                class413.method2587((long) var11.field1325, class252.field4102, var5, class216.field3522, 1003, arg2.field2865, "<col=ff9040>" + var11.field1370, -233);
                                class380.field5753++;
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg2.field2712) {
            return;
        }
        if (!class449.field6546) {
            for (int var24 = 9; var24 >= 5; var24--) {
                String var28 = class211.method1487(12809, var24, arg2);
                if (var28 != null) {
                    class413.method2587((long) (var24 + 1), var28, arg2.field2693, class390.method2463(var24, arg2, (byte) -85), 1004, arg2.field2865, arg2.field2801, -233);
                    class414.field6121++;
                }
            }
            String var25 = class376.method2400((byte) 79, arg2);
            if (var25 != null) {
                class413.method2587(0L, var25, arg2.field2693, -1, 46, arg2.field2865, arg2.field2801, -233);
                class145.field2279++;
            }
            for (int var26 = 4; var26 >= 0; var26--) {
                String var27 = class211.method1487(12809, var26, arg2);
                if (var27 != null) {
                    class414.field6121++;
                    class413.method2587((long) (var26 + 1), var27, arg2.field2693, class390.method2463(var26, arg2, (byte) 82), 37, arg2.field2865, arg2.field2801, -233);
                }
            }
            if (!client.method1149(arg2).method348(0)) {
                return;
            }
            class378.field5715++;
            if (arg2.field2784 == null) {
                class413.method2587(0L, class193.field3138, arg2.field2693, -1, 25, arg2.field2865, "", -233);
                return;
            }
            class413.method2587(0L, arg2.field2784, arg2.field2693, -1, 25, arg2.field2865, "", -233);
        } else if (client.method1149(arg2).method345((byte) 114) && (class379.field5737 & 0x20) != 0) {
            class234.field3920++;
            class413.method2587(0L, class306.field4854, arg2.field2693, class248.field4058, 29, arg2.field2865, class213.field3414 + " -> " + arg2.field2801, -233);
            return;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V", line = 369)
    public static void method2081(int arg0) {
        if (arg0 <= 50) {
            field4904 = -106;
        }
        field4900 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I[IIB[Ljava/lang/Object;)V", line = 379)
    public static final void method2082(int arg0, int[] arg1, int arg2, byte arg3, Object[] arg4) {
        if (arg0 < arg2) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg0;
            int var7 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var7;
            Object var8 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var8;
            for (int var9 = arg0; var9 < arg2; var9++) {
                if (arg1[var9] < (var9 & 0x1) + var7) {
                    int var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    Object var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg1[arg2] = arg1[var6];
            arg1[var6] = var7;
            arg4[arg2] = arg4[var6];
            arg4[var6] = var8;
            method2082(arg0, arg1, var6 - 1, (byte) 127, arg4);
            method2082(var6 + 1, arg1, arg2, (byte) -108, arg4);
        }
        int var12 = 4 % ((9 - arg3) / 56);
        field4903++;
    }
}
