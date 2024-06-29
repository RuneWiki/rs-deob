import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class150 {

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field2678 = 1;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "Lej;")
    public static class188 field2677 = new class188(64);

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "Lha;")
    public static class46 field2685 = class271.method1828("::gc", -46);

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "Lwf;")
    public static class16 field2684 = new class16(64);

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
    public static void method1103(byte arg0) {
        int var1 = 14 / ((arg0 + 54) / 62);
        field2685 = null;
        field2684 = null;
        field2677 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public static final void method1104(int arg0) {
        field2682++;
        int var1 = class190.field3384.method153(class196.field3506);
        for (int var2 = 0; var2 < class242.field4290; var2++) {
            int var6 = class190.field3384.method153(class155.method1147((byte) -55, var2));
            if (var1 < var6) {
                var1 = var6;
            }
        }
        var1 += 8;
        int var3 = class242.field4290 * 15 + 21;
        int var4 = class197.field3517 - var1 / arg0;
        if (var1 + var4 > class50.field876) {
            var4 = class50.field876 - var1;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        int var5 = class250.field4420;
        if (var3 + var5 > class163.field2895) {
            var5 = class163.field2895 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class20.field267 != 1) {
            if (class197.field3517 == class100.field1850 && class250.field4420 == class143.field2607) {
                class109.field2062 = var5;
                class270.field4707 = class242.field4290 * 15 + 22;
                class20.field267 = 0;
                class187.field3345 = var4;
                class248.field4378 = var1;
                class222.field3910 = true;
                return;
            }
            class20.field267 = 1;
            class124.field2291 = class100.field1850;
            class53.field916 = class143.field2607;
        } else if (class197.field3517 == class124.field2291 && class53.field916 == class250.field4420) {
            class109.field2062 = var5;
            class187.field3345 = var4;
            class20.field267 = 0;
            class222.field3910 = true;
            class248.field4378 = var1;
            class270.field4707 = class242.field4290 * 15 + 22;
            return;
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)Loc;")
    public static final class220 method1105(byte arg0) {
        int var1 = 94 % ((-arg0 - 46) / 35);
        field2683++;
        try {
            return (class220) Class.forName("mj").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZZ)V")
    public static final void method1106(boolean arg0, boolean arg1) {
        field2680++;
        if ((class277.field4824.field2585 >> 7) == class48.field832 && class277.field4824.field2546 >> 7 == class124.field2288) {
            class48.field832 = 0;
        }
        int var2 = class156.field2783;
        if (arg1) {
            var2 = 1;
        }
        int var3 = 0;
        if (arg0) {
            method1105((byte) 78);
        }
        while (var3 < var2) {
            class81 var4;
            long var5;
            if (arg1) {
                var5 = 8791798054912L;
                var4 = class277.field4824;
            } else {
                var4 = class1.field6[class129.field2373[var3]];
                var5 = (long) class129.field2373[var3] << 32;
            }
            if (var4 != null && var4.method190(0)) {
                var4.field1543 = false;
                if ((class264.field4596 && class156.field2783 > 200 || class156.field2783 > 50) && !arg1 && var4.field2553 == var4.field2537) {
                    var4.field1543 = true;
                }
                int var7 = var4.field2585 >> 7;
                int var8 = var4.field2546 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var4.field1569 == null || var4.field1539 > class157.field2803 || class157.field2803 >= var4.field1559) {
                        label94: {
                            if (var4.method642(111) == 1 && (var4.field2585 & 0x7F) == 64 && (var4.field2546 & 0x7F) == 64) {
                                if (class66.field1125[var7][var8] == class252.field4443) {
                                    break label94;
                                }
                                class66.field1125[var7][var8] = class252.field4443;
                            }
                            var4.field2572 = class206.method1461(var4.field2546, class135.field2450, var4.field2585, 4);
                            class24.method166(class135.field2450, var4.field2585, var4.field2546, var4.field2572, var4.method642(26) * 64 + 60 - 64, var4, var4.field2535, var5, var4.field2520);
                        }
                    } else {
                        var4.field1543 = false;
                        var4.field2572 = class206.method1461(var4.field2546, class135.field2450, var4.field2585, 4);
                        class137.method1049(class135.field2450, var4.field2585, var4.field2546, var4.field2572, var4, var4.field2535, var5, var4.field1545, var4.field1549, var4.field1529, var4.field1555);
                    }
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
    public static final void method1107(int arg0) {
        field2675++;
        if (class33.field616 == arg0) {
            class33.field616 = 6;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILpi;Lpi;Lpi;Lkj;)Z")
    public static final boolean method1108(int arg0, class181 arg1, class181 arg2, class181 arg3, class106 arg4) {
        field2681++;
        class135.field2457 = arg2;
        class23.field340 = arg4;
        class272.field4760 = arg3;
        if (arg0 != 4) {
            method1103((byte) -59);
        }
        class263.field4573 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lj;IIIII)V")
    public static final void method1109(class139 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class198.field3545 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class173.field3076) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class128.field2359 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class201 var14 = class111.field2080[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class119.field2228[var11][var12 + 1][var13] + class119.field2228[var11][var12][var13] + class119.field2228[var11][var12][var13 + 1] + class119.field2228[var11][var12 + 1][var13 + 1]) / 4 - (class119.field2228[arg1][arg2 + 1][arg3] + class119.field2228[arg1][arg2][arg3] + class119.field2228[arg1][arg2][arg3 + 1] + class119.field2228[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class255 var16 = var14.field3589;
                                    if (var16 != null) {
                                        if (var16.field4466.method486()) {
                                            arg0.method467(var16.field4466, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field4463 != null && var16.field4463.method486()) {
                                            arg0.method467(var16.field4463, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field3585; var17++) {
                                        class197 var18 = var14.field3600[var17];
                                        if (var18 != null && var18.field3532.method486() && (var18.field3541 == var12 || var7 == var12) && (var18.field3533 == var13 || var9 == var13)) {
                                            int var19 = var18.field3540 + 1 - var18.field3541;
                                            int var20 = var18.field3530 + 1 - var18.field3533;
                                            arg0.method467(var18.field3532, (var18.field3541 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field3533 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }
}
