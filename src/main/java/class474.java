import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class474 {

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field6484;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field6486;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field6487;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "Lwm;")
    public static class28 field6488;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "Lwu;")
    public static class557 field6485;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BIZ)I")
    public static final int method2814(byte arg0, int arg1, boolean arg2) {
        field6487++;
        if (arg2) {
            return 0;
        }
        class344 var3 = class70.method444(arg1, arg2, Integer.MIN_VALUE);
        if (var3 == null) {
            return class17.field217.method1374(arg1, 115).field6418;
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 < 45) {
            return -87;
        }
        while (var3.field4392.length > var5) {
            if (var3.field4392[var5] == -1) {
                var4++;
            }
            var5++;
        }
        return var4 + class17.field217.method1374(arg1, 61).field6418 - var3.field4392.length;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
    public static void method2815(int arg0) {
        field6485 = null;
        field6488 = null;
        if (arg0 < 0) {
            method2814((byte) -16, 121, true);
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V")
    public static final void method2816(int arg0) {
        class577.field8262 = arg0;
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)I")
    public static final int method2817(int arg0) {
        field6486++;
        if (arg0 != -1) {
            return 124;
        }
        if (class740.field10315 == null) {
            if (!class484.field6549 && class627.field8950 != null) {
                return class627.field8950.field59;
            }
            int var1 = class93.field1263.method805(arg0 + 1);
            int var2 = class93.field1263.method806(0);
            if (class229.field3185) {
                if (var1 > class463.field6345 && class463.field6345 + class248.field3438 > var1) {
                    int var3 = -1;
                    for (int var4 = 0; var4 < class367.field4714; var4++) {
                        if (class33.field496) {
                            int var8 = var4 * 16 + class140.field1930 + 33;
                            if ((var8 - 13) < var2 && var2 <= (var8 + 3)) {
                                var3 = var4;
                            }
                        } else {
                            int var9 = var4 * 16 + (class140.field1930 + 31);
                            if ((var9 - 13) < var2 && (var9 + 3) >= var2) {
                                var3 = var4;
                            }
                        }
                    }
                    if (var3 != -1) {
                        int var5 = 0;
                        class609 var6 = new class609(class314.field4033);
                        for (class480 var7 = (class480) var6.method3562((byte) 60); var7 != null; var7 = (class480) var6.method3563(arg0 ^ 0x78)) {
                            if (var3 == (var5++)) {
                                if (var7.field6524 == 1) {
                                    return ((class6) var7.field6519.field1417.field3781).field59;
                                }
                                return -1;
                            }
                        }
                    }
                } else if (class105.field1536 != null && var1 > class729.field10220 && (class729.field10220 + class660.field9314) > var1) {
                    int var10 = -1;
                    for (int var11 = 0; var11 < class105.field1536.field6524; var11++) {
                        if (class33.field496) {
                            int var16 = class495.field6946 - (-(var11 * 16) - 33);
                            if ((var16 - 13) < var2 && var16 + 3 >= var2) {
                                var10 = var11;
                            }
                        } else {
                            int var15 = class495.field6946 - (-var11 * 16 - 31);
                            if (var2 > (var15 - 13) && var2 <= var15 + 3) {
                                var10 = var11;
                            }
                        }
                    }
                    if (var10 != -1) {
                        int var12 = 0;
                        class609 var13 = new class609(class105.field1536.field6519);
                        for (class6 var14 = (class6) var13.method3562((byte) 43); var14 != null; var14 = (class6) var13.method3563(-119)) {
                            if (var10 == var12++) {
                                return var14.field59;
                            }
                        }
                    }
                }
            } else if (var1 > class463.field6345 && var1 < (class463.field6345 + class248.field3438)) {
                int var17 = -1;
                for (int var18 = 0; var18 < class605.field8642; var18++) {
                    if (class33.field496) {
                        int var22 = (class605.field8642 - var18 - 1) * 16 + class140.field1930 + 33;
                        if (var2 > var22 - 13 && (var22 + 3) >= var2) {
                            var17 = var18;
                        }
                    } else {
                        int var23 = (class605.field8642 - var18 - 1) * 16 + (class140.field1930 + 31);
                        if (var2 > (var23 - 13) && var2 <= (var23 + 3)) {
                            var17 = var18;
                        }
                    }
                }
                if (var17 != -1) {
                    int var19 = 0;
                    class46 var20 = new class46(class478.field6510);
                    for (class6 var21 = (class6) var20.method314((byte) 79); var21 != null; var21 = (class6) var20.method313(1000)) {
                        if (var17 == (var19++)) {
                            return var21.field59;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIII)V")
    public static final void method2818(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 != 23090) {
            field6485 = null;
        }
        field6484++;
        if (arg4 == arg5) {
            class452.method2724(arg0, arg4, arg1, true, arg2);
        } else if (class490.field6592 <= (arg2 - arg4) && class116.field1628 >= arg2 + arg4 && arg0 - arg5 >= class675.field9512 && (arg0 + arg5) <= class395.field5484) {
            class416.method2528(arg5, arg2, arg1, arg4, (byte) -34, arg0);
        } else {
            class242.method1539(true, arg4, arg1, arg5, arg2, arg0);
        }
    }
}
