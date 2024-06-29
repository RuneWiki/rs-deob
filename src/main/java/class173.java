import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class173 {

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    public static int field2634 = 1;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public static int field2637 = -1;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public int field2623;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public int field2630;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public int field2639;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    public int field2640;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    public int field2641;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "I")
    public int field2642;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
    public int field2643;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "Lja;")
    public static class60 field2638;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "[B")
    public byte[] field2629;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "[B")
    public byte[] field2636;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "[I")
    public static int[] field2635;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "[Lud;")
    public static class2[] field2627;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZI)V")
    public static final void method1064(boolean arg0, int arg1) {
        field2631++;
        int[] var2 = null;
        byte[][] var3 = class160.field2471;
        byte var4 = 4;
        int var5 = 8 % ((arg1 + 60) / 32);
        for (int var6 = 0; var6 < var4; var6++) {
            class39.method231(false);
            for (int var7 = 0; var7 < 13; var7++) {
                for (int var8 = 0; var8 < 13; var8++) {
                    boolean var9 = false;
                    int var10 = class229.field3461[var6][var7][var8];
                    if (var10 != -1) {
                        int var11 = var10 >> 24 & 0x3;
                        if (!arg0 || var11 == 0) {
                            int var12 = var10 >> 14 & 0x3FF;
                            int var13 = var10 >> 1 & 0x3;
                            int var14 = (var10 & 0x3FF8) >> 3;
                            int var15 = (var12 / 8 << 8) + var14 / 8;
                            for (int var16 = 0; var16 < class48.field767.length; var16++) {
                                if (class48.field767[var16] == var15 && var3[var16] != null) {
                                    int[] var17 = class252.method1653(var11, var6, var3[var16], 7, var7 * 8, class202.field3052, arg0, var14, var12, var13, var8 * 8);
                                    if (var2 == null && var17 != null) {
                                        var2 = var17;
                                    }
                                    var9 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var9) {
                        class177.method1104(var8 * 8, 8, 8, var7 * 8, var6, 3548);
                    }
                }
            }
        }
        if (var2 == null) {
            class276.field4156 = -1;
            return;
        }
        class276.field4156 = var2[0];
        class89.field1401 = var2[1];
        class1.field8 = var2[3];
        class195.field2968 = var2[2];
        class127.field1912 = var2[4];
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)Z")
    public static final boolean method1065(int arg0) {
        field2632++;
        try {
            if (arg0 != 0) {
                method1065(-34);
            }
            if (class282.field4211 == 2) {
                if (class259.field3943 == null) {
                    class259.field3943 = class170.method1055(class110.field1705, class272.field4095, class236.field3565);
                    if (class259.field3943 == null) {
                        return false;
                    }
                }
                if (class141.field2074 == null) {
                    class141.field2074 = new class274(class289.field4404, class198.field3009);
                }
                if (class86.field1383.method247(22050, class259.field3943, -1, class141.field2074, class226.field3395)) {
                    class86.field1383.method256((byte) 93);
                    class86.field1383.method263(class45.field708, (byte) 123);
                    class86.field1383.method243(arg0 + 102, class152.field2199, class259.field3943);
                    class141.field2074 = null;
                    class259.field3943 = null;
                    class282.field4211 = 0;
                    class110.field1705 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class86.field1383.method264((byte) 123);
            class282.field4211 = 0;
            class259.field3943 = null;
            class110.field1705 = null;
            class141.field2074 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIZII)V")
    public static final void method1066(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        if (!arg5) {
            return;
        }
        field2624++;
        int var8 = 0;
        int var9 = arg4;
        int var10 = 0;
        int var11 = arg0 * arg0;
        int var12 = arg0 - arg7;
        int var13 = arg4 * arg4;
        int var14 = arg4 - arg7;
        int var15 = var12 * var12;
        int var16 = var13 << 1;
        int var17 = var11 << 1;
        int var18 = var14 * var14;
        int var19 = var18 << 1;
        int var20 = arg4 << 1;
        int var21 = var15 << 1;
        int var22 = var14 << 1;
        int var23 = (1 - var20) * var11 + var16;
        int var24 = var13 - (var20 - 1) * var17;
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var18 - ((var22 - 1) * var21);
        int var27 = var11 << 2;
        int var28 = var13 << 2;
        int var29 = var16 * 3;
        int var30 = var15 << 2;
        int var31 = var18 << 2;
        int var32 = var19 * 3;
        int var33 = (var20 - 3) * var17;
        int var34 = var28;
        int var35 = (var22 - 3) * var21;
        int var36 = (arg4 - 1) * var27;
        int var37 = var31;
        int var38 = (var14 - 1) * var30;
        if (arg2 >= class243.field3635 && class118.field1782 >= arg2) {
            int[] var39 = class23.field284[arg2];
            int var40 = class86.method565(class248.field3765, arg6 - arg0, class163.field2505, 8142);
            int var41 = class86.method565(class248.field3765, arg6 + arg0, class163.field2505, 8142);
            int var42 = class86.method565(class248.field3765, arg6 - var12, class163.field2505, 8142);
            int var43 = class86.method565(class248.field3765, arg6 + var12, class163.field2505, 8142);
            class64.method429(var39, var40, (byte) 106, arg3, var42);
            class64.method429(var39, var42, (byte) 87, arg1, var43);
            class64.method429(var39, var43, (byte) 122, arg3, var41);
        }
        while (var9 > 0) {
            boolean var44 = var14 >= var9;
            var9--;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var32;
                        var32 += var31;
                        var8++;
                        var26 += var37;
                        var37 += var31;
                    }
                }
                if (var26 < 0) {
                    var8++;
                    var26 += var37;
                    var25 += var32;
                    var37 += var31;
                    var32 += var31;
                }
                var25 += -var38;
                var38 -= var30;
                var26 += -var35;
                var35 -= var30;
            }
            int var45 = arg2 + var9;
            int var46 = arg2 - var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var34;
                    var34 += var28;
                    var10++;
                    var23 += var29;
                    var29 += var28;
                }
            }
            if (var24 < 0) {
                var23 += var29;
                var29 += var28;
                var10++;
                var24 += var34;
                var34 += var28;
            }
            if (class243.field3635 <= var45 && class118.field1782 >= var46) {
                int var47 = class86.method565(class248.field3765, arg6 + var10, class163.field2505, 8142);
                int var48 = class86.method565(class248.field3765, arg6 - var10, class163.field2505, 8142);
                if (var44) {
                    int var49 = class86.method565(class248.field3765, arg6 + var8, class163.field2505, 8142);
                    int var50 = class86.method565(class248.field3765, arg6 - var8, class163.field2505, 8142);
                    if (class243.field3635 <= var46) {
                        int[] var51 = class23.field284[var46];
                        class64.method429(var51, var48, (byte) 97, arg3, var50);
                        class64.method429(var51, var50, (byte) 96, arg1, var49);
                        class64.method429(var51, var49, (byte) 126, arg3, var47);
                    }
                    if (class118.field1782 >= var45) {
                        int[] var52 = class23.field284[var45];
                        class64.method429(var52, var48, (byte) 94, arg3, var50);
                        class64.method429(var52, var50, (byte) 103, arg1, var49);
                        class64.method429(var52, var49, (byte) 105, arg3, var47);
                    }
                } else {
                    if (class243.field3635 <= var46) {
                        class64.method429(class23.field284[var46], var48, (byte) 83, arg3, var47);
                    }
                    if (var45 <= class118.field1782) {
                        class64.method429(class23.field284[var45], var48, (byte) 121, arg3, var47);
                    }
                }
            }
            var23 += -var36;
            var36 -= var27;
            var24 += -var33;
            var33 -= var27;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(JB)Ljava/lang/String;")
    public static final String method1067(long arg0, byte arg1) {
        field2628++;
        class64.field1005.setTime(new Date(arg0));
        int var3 = class64.field1005.get(7);
        int var4 = class64.field1005.get(5);
        int var5 = class64.field1005.get(2);
        int var6 = class64.field1005.get(1);
        int var7 = class64.field1005.get(11);
        if (arg1 != 70) {
            method1067(69L, (byte) 23);
        }
        int var8 = class64.field1005.get(12);
        int var9 = class64.field1005.get(13);
        return client.field2384[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class247.field3688[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1068(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class265.method1762(arg1, -1);
        int var7 = arg1 - arg6;
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = 0;
        field2626++;
        int var9 = -arg1;
        int var10 = arg1;
        int var11 = var7;
        int var12 = -var7;
        int var13 = 63 / ((52 - arg3) / 47);
        int var14 = -1;
        int var15 = -1;
        int[] var16 = class23.field284[arg2];
        int var17 = arg0 - var7;
        class64.method429(var16, arg0 - arg1, (byte) 96, arg4, var17);
        int var18 = arg0 + var7;
        class64.method429(var16, var17, (byte) 116, arg5, var18);
        class64.method429(var16, var18, (byte) 113, arg4, arg0 + arg1);
        while (var8 < var10) {
            var15 += 2;
            var12 += var15;
            if (var12 >= 0 && var11 >= 1) {
                class13.field172[var11] = var8;
                var11--;
                var12 -= var11 << 1;
            }
            var14 += 2;
            var8++;
            var9 += var14;
            if (var9 >= 0) {
                var10--;
                if (var7 <= var10) {
                    int[] var19 = class23.field284[arg2 + var10];
                    int[] var20 = class23.field284[arg2 - var10];
                    int var21 = arg0 + var8;
                    int var22 = arg0 - var8;
                    class64.method429(var19, var22, (byte) 122, arg4, var21);
                    class64.method429(var20, var22, (byte) 88, arg4, var21);
                } else {
                    int[] var23 = class23.field284[arg2 + var10];
                    int var24 = class13.field172[var10];
                    int[] var25 = class23.field284[arg2 - var10];
                    int var26 = arg0 - var24;
                    int var27 = arg0 + var24;
                    int var28 = arg0 + var8;
                    int var29 = arg0 - var8;
                    class64.method429(var23, var29, (byte) 94, arg4, var26);
                    class64.method429(var23, var26, (byte) 97, arg5, var27);
                    class64.method429(var23, var27, (byte) 90, arg4, var28);
                    class64.method429(var25, var29, (byte) 107, arg4, var26);
                    class64.method429(var25, var26, (byte) 94, arg5, var27);
                    class64.method429(var25, var27, (byte) 98, arg4, var28);
                }
                var9 -= var10 << 1;
            }
            int[] var30 = class23.field284[arg2 - var8];
            int[] var31 = class23.field284[arg2 + var8];
            int var32 = arg0 + var10;
            int var33 = arg0 - var10;
            if (var7 <= var8) {
                class64.method429(var31, var33, (byte) 123, arg4, var32);
                class64.method429(var30, var33, (byte) 83, arg4, var32);
            } else {
                int var34 = var11 >= var8 ? var11 : class13.field172[var8];
                int var35 = arg0 + var34;
                int var36 = arg0 - var34;
                class64.method429(var31, var33, (byte) 92, arg4, var36);
                class64.method429(var31, var36, (byte) 114, arg5, var35);
                class64.method429(var31, var35, (byte) 113, arg4, var32);
                class64.method429(var30, var33, (byte) 91, arg4, var36);
                class64.method429(var30, var36, (byte) 99, arg5, var35);
                class64.method429(var30, var35, (byte) 118, arg4, var32);
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)Z")
    public static final boolean method1069(int arg0) {
        field2633++;
        if (class142.field2080) {
            try {
                if ((Boolean) class73.method498(class209.field3147.field150, "showingVideoAd", (byte) 123)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 < 51) {
            field2634 = 44;
        }
        return true;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V")
    public static void method1070(boolean arg0) {
        field2638 = null;
        field2635 = null;
        field2627 = null;
        if (arg0) {
            field2627 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)V")
    public static final void method1071(int arg0, int arg1) {
        class270 var2 = class33.field487[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class270 var4 = class33.field487[var3][arg0][arg1] = class33.field487[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field4077--;
                for (int var5 = 0; var5 < var4.field4071; var5++) {
                    class2 var6 = var4.field4069[var5];
                    if ((var6.field28 >> 29 & 0x3L) == 2L && var6.field26 == arg0 && var6.field23 == arg1) {
                        var6.field35--;
                    }
                }
            }
        }
        if (class33.field487[0][arg0][arg1] == null) {
            class33.field487[0][arg0][arg1] = new class270(0, arg0, arg1);
        }
        class33.field487[0][arg0][arg1].field4072 = var2;
        class33.field487[3][arg0][arg1] = null;
    }
}
