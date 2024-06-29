import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class419 {

    @OriginalMember(owner = "client!mt", name = "f", descriptor = "I")
    public int field6017;

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "I")
    public int field6015;

    @OriginalMember(owner = "client!mt", name = "e", descriptor = "I")
    public int field6016;

    @OriginalMember(owner = "client!mt", name = "o", descriptor = "I")
    public int field6026;

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "Ltja;")
    public static class288 field6013 = new class288(10, -1);

    @OriginalMember(owner = "client!mt", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field6020 = new String[100];

    @OriginalMember(owner = "client!mt", name = "l", descriptor = "J")
    public static volatile long field6023 = 0L;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "I")
    public static int field6012;

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "I")
    public static int field6014;

    @OriginalMember(owner = "client!mt", name = "g", descriptor = "I")
    public static int field6018;

    @OriginalMember(owner = "client!mt", name = "h", descriptor = "I")
    public static int field6019;

    @OriginalMember(owner = "client!mt", name = "k", descriptor = "I")
    public static int field6022;

    @OriginalMember(owner = "client!mt", name = "m", descriptor = "I")
    public static int field6024;

    @OriginalMember(owner = "client!mt", name = "n", descriptor = "I")
    public static int field6025;

    @OriginalMember(owner = "client!mt", name = "j", descriptor = "Loja;")
    public static class480 field6021;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lka;Lel;IIII)V")
    public static final void method2584(class500 arg0, class574 arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != 1) {
            method2587((byte) -98);
        }
        field6022++;
        if (arg0 != null) {
            arg1.method3211(arg0.method335(), arg2, arg5 ^ 0x4E07, arg0.method316(), arg0.method338(), arg0.method294(), arg0.method315(), arg0.method327(), arg4, arg3, arg0.method330());
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)V")
    public static final void method2585(int arg0) {
        class733.field10174 = 0;
        class499.field6889++;
        class667.field9214 = arg0;
        field6019++;
        class440.method2641(87);
        class423.method2597((byte) 107);
        class237.method1537((byte) 124);
        boolean var1 = false;
        for (int var2 = 0; var2 < class733.field10174; var2++) {
            int var5 = class734.field10177[var2];
            class174 var6 = (class174) class234.field3169.method3953((long) var5, 14);
            class192 var7 = var6.field2336;
            if (class526.field7216 && class158.method1157(var5, -127)) {
                class539.method3078(0);
            }
            if (class499.field6889 != var7.field1844) {
                if (var7.field2577.method1459(true)) {
                    class417.method2574(var7, (byte) 111);
                }
                var7.method1328(null, false);
                var1 = true;
                var6.method792((byte) -103);
            }
        }
        if (var1) {
            class184.field2457 = class234.field3169.method3963((byte) 116);
            class234.field3169.method3952(arg0, class495.field6850);
        }
        if (class206.field2700 != class89.field1233.field5459) {
            throw new RuntimeException("gnp1 pos:" + class89.field1233.field5459 + " psize:" + class206.field2700);
        }
        for (int var3 = 0; var3 < class688.field9678; var3++) {
            if (class234.field3169.method3953((long) class382.field5588[var3], arg0 ^ 0xE) == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class688.field9678);
            }
        }
        if (class184.field2457 - class688.field9678 != 0) {
            throw new RuntimeException("gnp3 mis:" + (class184.field2457 - class688.field9678));
        }
        for (int var4 = 0; var4 < class184.field2457; var4++) {
            if (class499.field6889 != class495.field6850[var4].field2336.field1844) {
                throw new RuntimeException("gnp4 uk:" + class495.field6850[var4].field2336.field1812);
            }
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIIII)V")
    public static final void method2586(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6025++;
        class383.field5608 = arg2;
        class777.field10681 = arg4;
        if (arg5 != -28384) {
            method2585(92);
        }
        class596.field8129 = arg1;
        class230.field3142 = arg0;
        class394.field5811 = arg3;
        if (class230.field3142 >= 100) {
            int var6 = class596.field8129 * 512 + 256;
            int var7 = class383.field5608 * 512 + 256;
            int var8 = class783.method4338(class610.field8296, var6, -12040, var7) - class777.field10681;
            int var9 = var6 - class634.field8856;
            int var10 = var8 - class405.field5867;
            int var11 = var7 - class350.field5138;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class253.field3733 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class718.field10019 = (int) (Math.atan2((double) var9, (double) var11) * -2607.5945876176133D) & 0x3FFF;
            if (class253.field3733 < 1024) {
                class253.field3733 = 1024;
            }
            class162.field2209 = 0;
            if (class253.field3733 > 3072) {
                class253.field3733 = 3072;
            }
        }
        class704.field9868 = -1;
        class518.field7072 = -1;
        class502.field6938 = 2;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)V")
    public static void method2587(byte arg0) {
        field6020 = null;
        field6013 = null;
        field6021 = null;
        if (arg0 > -62) {
            method2588(-85, 34, -109, 57, -82, null);
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIII[B)V")
    public static final void method2588(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field6014++;
        if (arg0 <= 63 || arg1 >= arg2) {
            return;
        }
        int var6 = arg1 + arg4;
        int var7 = arg2 - arg1 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg2 - arg1 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg5[var6++] = 1;
                }
            }
            arg5[var6++] = 1;
            arg5[var6++] = 1;
            arg5[var6++] = 1;
            arg5[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!mt", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6018++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIIIIIIII)Z")
    public static final boolean method2589(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field6012++;
        if (arg7 > 2000 || arg8 > 2000 || arg6 > 2000 || arg0 > 2000 || arg2 > 2000 || arg1 > 2000) {
            return false;
        } else if (arg7 >= -2000 && arg8 >= -2000 && arg6 >= -2000 && arg0 >= -2000 && arg2 >= -2000 && arg1 >= -2000) {
            if (class626.field8524 == 2) {
                int var10 = class492.field6819 * arg7 + arg0;
                if (var10 >= 0 && class280.field4140.length > var10 && (arg9 << 8) - 38400 < class280.field4140[var10]) {
                    return false;
                }
                int var11 = arg2 + (class492.field6819 * arg8);
                if (var11 >= 0 && var11 < class280.field4140.length && class280.field4140[var11] > (arg3 << 8) - 38400) {
                    return false;
                }
                int var12 = arg1 + (class492.field6819 * arg6);
                if (var12 >= 0 && class280.field4140.length > var12 && ((arg5 << 8) - 38400) < class280.field4140[var12]) {
                    return false;
                }
            }
            int var13 = arg2 - arg0;
            int var14 = arg8 - arg7;
            int var15 = arg1 - arg0;
            int var16 = arg6 - arg7;
            int var17 = arg3 - arg9;
            if (arg7 < arg8 && arg6 > arg6) {
                if (arg6 >= arg8) {
                    arg6++;
                } else {
                    arg8++;
                }
                arg7--;
            } else if (arg6 > arg8) {
                arg8--;
                if (arg6 >= arg7) {
                    arg6++;
                } else {
                    arg7++;
                }
            } else {
                arg6--;
                if (arg8 < arg7) {
                    arg7++;
                } else {
                    arg8++;
                }
            }
            int var18 = arg5 - arg9;
            int var19 = 0;
            if (arg7 != arg8) {
                var19 = (arg2 - arg0 << 12) / (arg8 - arg7);
            }
            int var20 = 0;
            if (arg6 != arg8) {
                var20 = (arg1 - arg2 << 12) / (arg6 - arg8);
            }
            int var21 = arg4;
            if (arg6 != arg7) {
                var21 = (arg0 - arg1 << 12) / (arg7 - arg6);
            }
            int var22 = var13 * var16 - (var14 * var15);
            if (var22 == 0) {
                return false;
            }
            int var23 = (var16 * var17 - (var14 * var18) << 8) / var22;
            int var24 = (var13 * var18 - var15 * var17 << 8) / var22;
            if (arg8 >= arg7 && arg6 >= arg7) {
                if (arg7 >= class598.field8138) {
                    return true;
                }
                int var25 = (arg9 << 8) + var23 - (arg0 * var23);
                if (arg8 > class598.field8138) {
                    arg8 = class598.field8138;
                }
                if (arg6 > class598.field8138) {
                    arg6 = class598.field8138;
                }
                if (arg6 <= arg8) {
                    int var26;
                    int var27 = var26 = arg0 << 12;
                    if (arg7 < 0) {
                        var25 -= arg7 * var24;
                        var27 -= arg7 * var21;
                        var26 -= arg7 * var19;
                        arg7 = 0;
                    }
                    int var28 = arg1 << 12;
                    if (arg6 < 0) {
                        var28 -= arg6 * var20;
                        arg6 = 0;
                    }
                    if (arg6 != arg7 && var19 > var21 || arg6 == arg7 && var19 < var20) {
                        int var29 = arg8 - arg6;
                        int var30 = arg6 - arg7;
                        int var31 = class492.field6819 * arg7;
                        while (true) {
                            var30--;
                            if (var30 < 0) {
                                while (true) {
                                    var29--;
                                    if (var29 < 0) {
                                        return true;
                                    }
                                    if (!class742.method4106(var23, class280.field4140, var31, var25, 1874069218, (var28 >> 12) - 1, (var26 >> 12) + 1, 0)) {
                                        return false;
                                    }
                                    var25 += var24;
                                    var28 += var20;
                                    var31 += class492.field6819;
                                    var26 += var19;
                                }
                            }
                            if (!class742.method4106(var23, class280.field4140, var31, var25, arg4 + 1874069218, (var27 >> 12) - 1, (var26 >> 12) + 1, 0)) {
                                return false;
                            }
                            var27 += var21;
                            var26 += var19;
                            var25 += var24;
                            var31 += class492.field6819;
                        }
                    } else {
                        int var32 = arg8 - arg6;
                        int var33 = arg6 - arg7;
                        int var34 = class492.field6819 * arg7;
                        while (true) {
                            var33--;
                            if (var33 < 0) {
                                while (true) {
                                    var32--;
                                    if (var32 < 0) {
                                        return true;
                                    }
                                    if (!class742.method4106(var23, class280.field4140, var34, var25, 1874069218, (var26 >> 12) - 1, (var28 >> 12) - -1, 0)) {
                                        return false;
                                    }
                                    var28 += var20;
                                    var25 += var24;
                                    var26 += var19;
                                    var34 += class492.field6819;
                                }
                            }
                            if (!class742.method4106(var23, class280.field4140, var34, var25, 1874069218, (var26 >> 12) - 1, (var27 >> 12) + 1, 0)) {
                                return false;
                            }
                            var25 += var24;
                            var27 += var21;
                            var26 += var19;
                            var34 += class492.field6819;
                        }
                    }
                } else {
                    int var35;
                    int var36 = var35 = arg0 << 12;
                    int var37 = arg2 << 12;
                    if (arg7 < 0) {
                        var35 -= arg7 * var19;
                        var36 -= arg7 * var21;
                        var25 -= arg7 * var24;
                        arg7 = 0;
                    }
                    if (arg8 < 0) {
                        var37 -= arg8 * var20;
                        arg8 = 0;
                    }
                    if ((arg7 == arg8 || var19 <= var21) && (arg7 != arg8 || var20 >= var21)) {
                        int var41 = arg6 - arg8;
                        int var42 = arg8 - arg7;
                        int var43 = class492.field6819 * arg7;
                        while (true) {
                            var42--;
                            if (var42 < 0) {
                                while (true) {
                                    var41--;
                                    if (var41 < 0) {
                                        return true;
                                    }
                                    if (!class742.method4106(var23, class280.field4140, var43, var25, arg4 ^ 0x6FB406E2, (var37 >> 12) - 1, (var36 >> 12) + 1, 0)) {
                                        return false;
                                    }
                                    var36 += var21;
                                    var25 += var24;
                                    var43 += class492.field6819;
                                    var37 += var20;
                                }
                            }
                            if (!class742.method4106(var23, class280.field4140, var43, var25, 1874069218, (var35 >> 12) - 1, (var36 >> 12) + 1, 0)) {
                                return false;
                            }
                            var43 += class492.field6819;
                            var35 += var19;
                            var36 += var21;
                            var25 += var24;
                        }
                    } else {
                        int var38 = arg6 - arg8;
                        int var39 = arg8 - arg7;
                        int var40 = class492.field6819 * arg7;
                        while (true) {
                            var39--;
                            if (var39 < 0) {
                                while (true) {
                                    var38--;
                                    if (var38 < 0) {
                                        return true;
                                    }
                                    if (!class742.method4106(var23, class280.field4140, var40, var25, 1874069218, (var36 >> 12) - 1, (var37 >> 12) - -1, 0)) {
                                        return false;
                                    }
                                    var40 += class492.field6819;
                                    var36 += var21;
                                    var37 += var20;
                                    var25 += var24;
                                }
                            }
                            if (!class742.method4106(var23, class280.field4140, var40, var25, 1874069218, (var36 >> 12) - 1, (var35 >> 12) - -1, 0)) {
                                return false;
                            }
                            var40 += class492.field6819;
                            var25 += var24;
                            var36 += var21;
                            var35 += var19;
                        }
                    }
                }
            } else if (arg6 < arg8) {
                if (class598.field8138 <= arg6) {
                    return true;
                }
                if (arg8 > class598.field8138) {
                    arg8 = class598.field8138;
                }
                if (class598.field8138 < arg7) {
                    arg7 = class598.field8138;
                }
                int var44 = (arg5 << 8) + var23 - (arg1 * var23);
                if (arg8 <= arg7) {
                    int var45;
                    int var46 = var45 = arg1 << 12;
                    if (arg6 < 0) {
                        var46 -= arg6 * var20;
                        var44 -= arg6 * var24;
                        var45 -= arg6 * var21;
                        arg6 = 0;
                    }
                    int var47 = arg2 << 12;
                    if (arg8 < 0) {
                        var47 -= arg8 * var19;
                        arg8 = 0;
                    }
                    if (var20 < var21) {
                        int var48 = arg7 - arg8;
                        int var49 = arg8 - arg6;
                        int var50 = class492.field6819 * arg6;
                        while (true) {
                            var49--;
                            if (var49 < 0) {
                                while (true) {
                                    var48--;
                                    if (var48 < 0) {
                                        return true;
                                    }
                                    if (!class742.method4106(var23, class280.field4140, var50, var44, arg4 ^ 0x6FB406E2, (var47 >> 12) - 1, (var45 >> 12) - -1, 0)) {
                                        return false;
                                    }
                                    var45 += var21;
                                    var44 += var24;
                                    var47 += var19;
                                    var50 += class492.field6819;
                                }
                            }
                            if (!class742.method4106(var23, class280.field4140, var50, var44, 1874069218, (var46 >> 12) - 1, (var45 >> 12) + 1, 0)) {
                                return false;
                            }
                            var46 += var20;
                            var50 += class492.field6819;
                            var44 += var24;
                            var45 += var21;
                        }
                    } else {
                        int var51 = arg7 - arg8;
                        int var52 = arg8 - arg6;
                        int var53 = class492.field6819 * arg6;
                        while (true) {
                            var52--;
                            if (var52 < 0) {
                                while (true) {
                                    var51--;
                                    if (var51 < 0) {
                                        return true;
                                    }
                                    if (!class742.method4106(var23, class280.field4140, var53, var44, arg4 + 1874069218, (var45 >> 12) + -1, (var47 >> 12) + 1, 0)) {
                                        return false;
                                    }
                                    var53 += class492.field6819;
                                    var47 += var19;
                                    var45 += var21;
                                    var44 += var24;
                                }
                            }
                            if (!class742.method4106(var23, class280.field4140, var53, var44, 1874069218, (var45 >> 12) - 1, (var46 >> 12) + 1, 0)) {
                                return false;
                            }
                            var53 += class492.field6819;
                            var46 += var20;
                            var45 += var21;
                            var44 += var24;
                        }
                    }
                } else {
                    int var54;
                    int var55 = var54 = arg1 << 12;
                    int var56 = arg0 << 12;
                    if (arg6 < 0) {
                        var44 -= arg6 * var24;
                        var54 -= arg6 * var21;
                        var55 -= arg6 * var20;
                        arg6 = 0;
                    }
                    if (arg7 < 0) {
                        var56 -= arg7 * var19;
                        arg7 = 0;
                    }
                    if (var20 < var21) {
                        int var57 = arg8 - arg7;
                        int var58 = arg7 - arg6;
                        int var59 = class492.field6819 * arg6;
                        while (true) {
                            var58--;
                            if (var58 < 0) {
                                while (true) {
                                    var57--;
                                    if (var57 < 0) {
                                        return true;
                                    }
                                    if (!class742.method4106(var23, class280.field4140, var59, var44, arg4 ^ 0x6FB406E2, (var55 >> 12) - 1, (var56 >> 12) - -1, 0)) {
                                        return false;
                                    }
                                    var59 += class492.field6819;
                                    var55 += var20;
                                    var56 += var19;
                                    var44 += var24;
                                }
                            }
                            if (!class742.method4106(var23, class280.field4140, var59, var44, 1874069218, (var55 >> 12) - 1, (var54 >> 12) - -1, 0)) {
                                return false;
                            }
                            var59 += class492.field6819;
                            var55 += var20;
                            var54 += var21;
                            var44 += var24;
                        }
                    } else {
                        int var60 = arg8 - arg7;
                        int var61 = arg7 - arg6;
                        int var62 = class492.field6819 * arg6;
                        while (true) {
                            var61--;
                            if (var61 < 0) {
                                while (true) {
                                    var60--;
                                    if (var60 < 0) {
                                        return true;
                                    }
                                    if (!class742.method4106(var23, class280.field4140, var62, var44, 1874069218, (var56 >> 12) - 1, (var55 >> 12) + 1, 0)) {
                                        return false;
                                    }
                                    var55 += var20;
                                    var44 += var24;
                                    var56 += var19;
                                    var62 += class492.field6819;
                                }
                            }
                            if (!class742.method4106(var23, class280.field4140, var62, var44, 1874069218, (var54 >> 12) - 1, (var55 >> 12) + 1, 0)) {
                                return false;
                            }
                            var55 += var20;
                            var44 += var24;
                            var62 += class492.field6819;
                            var54 += var21;
                        }
                    }
                }
            } else if (arg8 >= class598.field8138) {
                return true;
            } else {
                if (class598.field8138 < arg7) {
                    arg7 = class598.field8138;
                }
                int var63 = (arg3 << 8) + var23 - (arg2 * var23);
                if (class598.field8138 < arg6) {
                    arg6 = class598.field8138;
                }
                if (arg6 >= arg7) {
                    int var64;
                    int var65 = var64 = arg2 << 12;
                    if (arg8 < 0) {
                        var64 -= arg8 * var20;
                        var65 -= arg8 * var19;
                        var63 -= arg8 * var24;
                        arg8 = 0;
                    }
                    int var66 = arg0 << 12;
                    if (arg7 < 0) {
                        var66 -= arg7 * var21;
                        arg7 = 0;
                    }
                    if (var20 <= var19) {
                        int var67 = arg6 - arg7;
                        int var68 = arg7 - arg8;
                        int var69 = class492.field6819 * arg8;
                        while (true) {
                            var68--;
                            if (var68 < 0) {
                                while (true) {
                                    var67--;
                                    if (var67 < 0) {
                                        return true;
                                    }
                                    if (!class742.method4106(var23, class280.field4140, var69, var63, arg4 + 1874069218, (var64 >> 12) + -1, (var66 >> 12) + 1, 0)) {
                                        return false;
                                    }
                                    var64 += var20;
                                    var69 += class492.field6819;
                                    var63 += var24;
                                    var66 += var21;
                                }
                            }
                            if (!class742.method4106(var23, class280.field4140, var69, var63, 1874069218, (var64 >> 12) - 1, (var65 >> 12) + 1, 0)) {
                                return false;
                            }
                            var65 += var19;
                            var69 += class492.field6819;
                            var64 += var20;
                            var63 += var24;
                        }
                    } else {
                        int var70 = arg6 - arg7;
                        int var71 = arg7 - arg8;
                        int var72 = class492.field6819 * arg8;
                        while (true) {
                            var71--;
                            if (var71 < 0) {
                                while (true) {
                                    var70--;
                                    if (var70 < 0) {
                                        return true;
                                    }
                                    if (!class742.method4106(var23, class280.field4140, var72, var63, 1874069218, (var66 >> 12) - 1, (var64 >> 12) + 1, 0)) {
                                        return false;
                                    }
                                    var64 += var20;
                                    var66 += var21;
                                    var72 += class492.field6819;
                                    var63 += var24;
                                }
                            }
                            if (!class742.method4106(var23, class280.field4140, var72, var63, arg4 + 1874069218, (var65 >> 12) + -1, (var64 >> 12) + 1, 0)) {
                                return false;
                            }
                            var65 += var19;
                            var72 += class492.field6819;
                            var63 += var24;
                            var64 += var20;
                        }
                    }
                } else {
                    int var73;
                    int var74 = var73 = arg2 << 12;
                    int var75 = arg1 << 12;
                    if (arg8 < 0) {
                        var63 -= arg8 * var24;
                        var73 -= arg8 * var20;
                        var74 -= arg8 * var19;
                        arg8 = 0;
                    }
                    if (arg6 < 0) {
                        var75 -= arg6 * var21;
                        arg6 = 0;
                    }
                    if ((arg6 == arg8 || var19 >= var20) && (arg6 != arg8 || var21 >= var19)) {
                        int var79 = arg7 - arg6;
                        int var80 = arg6 - arg8;
                        int var81 = class492.field6819 * arg8;
                        while (true) {
                            var80--;
                            if (var80 < 0) {
                                while (true) {
                                    var79--;
                                    if (var79 < 0) {
                                        return true;
                                    }
                                    if (!class742.method4106(var23, class280.field4140, var81, var63, arg4 + 1874069218, (var75 >> 12) + -1, (var74 >> 12) + 1, 0)) {
                                        return false;
                                    }
                                    var63 += var24;
                                    var75 += var21;
                                    var81 += class492.field6819;
                                    var74 += var19;
                                }
                            }
                            if (!class742.method4106(var23, class280.field4140, var81, var63, 1874069218, (var73 >> 12) - 1, (var74 >> 12) + 1, 0)) {
                                return false;
                            }
                            var81 += class492.field6819;
                            var73 += var20;
                            var63 += var24;
                            var74 += var19;
                        }
                    } else {
                        int var76 = arg7 - arg6;
                        int var77 = arg6 - arg8;
                        int var78 = class492.field6819 * arg8;
                        while (true) {
                            var77--;
                            if (var77 < 0) {
                                while (true) {
                                    var76--;
                                    if (var76 < 0) {
                                        return true;
                                    }
                                    if (!class742.method4106(var23, class280.field4140, var78, var63, 1874069218, (var74 >> 12) - 1, (var75 >> 12) - -1, 0)) {
                                        return false;
                                    }
                                    var78 += class492.field6819;
                                    var75 += var21;
                                    var63 += var24;
                                    var74 += var19;
                                }
                            }
                            if (!class742.method4106(var23, class280.field4140, var78, var63, 1874069218, (var74 >> 12) - 1, (var73 >> 12) - -1, 0)) {
                                return false;
                            }
                            var73 += var20;
                            var78 += class492.field6819;
                            var63 += var24;
                            var74 += var19;
                        }
                    }
                }
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(IIII)V")
    public class419(int arg0, int arg1, int arg2, int arg3) {
        this.field6017 = arg1;
        this.field6015 = arg0;
        this.field6016 = arg3;
        this.field6026 = arg2;
    }
}
