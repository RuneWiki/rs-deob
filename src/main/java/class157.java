import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class157 {

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field2559 = 1;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "Lbf;")
    public static class102 field2558;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "[Z")
    public static boolean[] field2555;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method1130(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class139.field2326++;
        class233.field3682 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class288.field4610; var12 < class102.field1557; var12++) {
            class129[][] var38 = class26.field455[var12];
            for (int var39 = class16.field243; var39 < class100.field1528; var39++) {
                for (int var40 = class37.field629; var40 < class127.field2102; var40++) {
                    class129 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class21.field324[var39 + class194.field3178 - class263.field4171][var40 + class194.field3178 - class239.field3766] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field2123 = true;
                            var41.field2149 = true;
                            if (var41.field2142 > 0) {
                                var41.field2140 = true;
                            } else {
                                var41.field2140 = false;
                            }
                            class233.field3682++;
                        } else {
                            var41.field2123 = false;
                            var41.field2149 = false;
                            var41.field2150 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field2144 != null) {
                                    class128 var42 = var41.field2144;
                                    var42.field2117.method100(0, var12, var42.field2113, var42.field2116, var42.field2115);
                                    if (var42.field2105 != null) {
                                        var42.field2105.method100(0, var12, var42.field2113, var42.field2116, var42.field2115);
                                    }
                                }
                                if (var41.field2143 != null) {
                                    class195 var43 = var41.field2143;
                                    var43.field3187.method100(var43.field3197, var12, var43.field3186, var43.field3192, var43.field3195);
                                    if (var43.field3185 != null) {
                                        var43.field3185.method100(var43.field3197, var12, var43.field3186, var43.field3192, var43.field3195);
                                    }
                                }
                                if (var41.field2133 != null) {
                                    class249 var44 = var41.field2133;
                                    var44.field3973.method100(0, var12, var44.field3978, var44.field3975, var44.field3977);
                                }
                                if (var41.field2131 != null) {
                                    for (int var45 = 0; var45 < var41.field2142; var45++) {
                                        class190 var46 = var41.field2131[var45];
                                        var46.field3119.method100(var46.field3105, var12, var46.field3120, var46.field3107, var46.field3109);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class266.field4251 == class21.field327;
        for (int var14 = class288.field4610; var14 < class102.field1557; var14++) {
            class129[][] var27 = class26.field455[var14];
            for (int var28 = -class194.field3178; var28 <= 0; var28++) {
                int var29 = class263.field4171 + var28;
                int var30 = class263.field4171 - var28;
                if (var29 >= class16.field243 || var30 < class100.field1528) {
                    for (int var31 = -class194.field3178; var31 <= 0; var31++) {
                        int var32 = class239.field3766 + var31;
                        int var33 = class239.field3766 - var31;
                        if (var29 >= class16.field243) {
                            if (var32 >= class37.field629) {
                                class129 var34 = var27[var29][var32];
                                if (var34 != null && var34.field2123) {
                                    class38.method320(var34, true);
                                }
                            }
                            if (var33 < class127.field2102) {
                                class129 var35 = var27[var29][var33];
                                if (var35 != null && var35.field2123) {
                                    class38.method320(var35, true);
                                }
                            }
                        }
                        if (var30 < class100.field1528) {
                            if (var32 >= class37.field629) {
                                class129 var36 = var27[var30][var32];
                                if (var36 != null && var36.field2123) {
                                    class38.method320(var36, true);
                                }
                            }
                            if (var33 < class127.field2102) {
                                class129 var37 = var27[var30][var33];
                                if (var37 != null && var37.field2123) {
                                    class38.method320(var37, true);
                                }
                            }
                        }
                        if (class233.field3682 == 0) {
                            if (!var13) {
                                class285.field4537 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class288.field4610; var15 < class102.field1557; var15++) {
            class129[][] var16 = class26.field455[var15];
            for (int var17 = -class194.field3178; var17 <= 0; var17++) {
                int var18 = class263.field4171 + var17;
                int var19 = class263.field4171 - var17;
                if (var18 >= class16.field243 || var19 < class100.field1528) {
                    for (int var20 = -class194.field3178; var20 <= 0; var20++) {
                        int var21 = class239.field3766 + var20;
                        int var22 = class239.field3766 - var20;
                        if (var18 >= class16.field243) {
                            if (var21 >= class37.field629) {
                                class129 var23 = var16[var18][var21];
                                if (var23 != null && var23.field2123) {
                                    class38.method320(var23, false);
                                }
                            }
                            if (var22 < class127.field2102) {
                                class129 var24 = var16[var18][var22];
                                if (var24 != null && var24.field2123) {
                                    class38.method320(var24, false);
                                }
                            }
                        }
                        if (var19 < class100.field1528) {
                            if (var21 >= class37.field629) {
                                class129 var25 = var16[var19][var21];
                                if (var25 != null && var25.field2123) {
                                    class38.method320(var25, false);
                                }
                            }
                            if (var22 < class127.field2102) {
                                class129 var26 = var16[var19][var22];
                                if (var26 != null && var26.field2123) {
                                    class38.method320(var26, false);
                                }
                            }
                        }
                        if (class233.field3682 == 0) {
                            if (!var13) {
                                class285.field4537 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class285.field4537 = false;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/lang/String;BZ)V")
    public static final void method1131(String arg0, byte arg1, boolean arg2) {
        field2556++;
        short[] var3 = new short[16];
        int var4 = 0;
        int var5 = arg2 ? 32768 : 0;
        String var6 = arg0.toLowerCase();
        int var7 = (arg2 ? class290.field4622 : class105.field1600) + var5;
        for (int var8 = var5; var8 < var7; var8++) {
            class18 var11 = class84.method672(var8, arg1 + 8);
            if (var11.field264 && var11.method140(-1).toLowerCase().indexOf(var6) != -1) {
                if (var4 >= 50) {
                    class208.field3346 = null;
                    class1.field3 = -1;
                    return;
                }
                if (var3.length <= var4) {
                    short[] var12 = new short[var3.length * 2];
                    for (int var13 = 0; var13 < var4; var13++) {
                        var12[var13] = var3[var13];
                    }
                    var3 = var12;
                }
                var3[var4++] = (short) var8;
            }
        }
        class1.field3 = var4;
        class208.field3346 = var3;
        class274.field4387 = 0;
        String[] var9 = new String[class1.field3];
        for (int var10 = 0; var10 < class1.field3; var10++) {
            var9[var10] = class84.method672(var3[var10], -2).method140(-1);
        }
        if (arg1 != -10) {
            field2554 = 85;
        }
        class276.method1862(var9, true, class208.field3346);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public static final void method1132(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field2553++;
        class187 var13 = new class187();
        var13.field3064 = arg10;
        var13.field3055 = arg11;
        var13.field3056 = arg4;
        var13.field3063 = arg6;
        var13.field3054 = arg1;
        var13.field3066 = arg7;
        var13.field3067 = arg3;
        var13.field3065 = arg5;
        if (arg9 != 0) {
            return;
        }
        var13.field3062 = arg12;
        var13.field3070 = arg2;
        var13.field3058 = arg0;
        var13.field3061 = arg8;
        class248.field3895.method1809(arg9 + 5, var13);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIII)I")
    public static final int method1133(int arg0, int arg1, int arg2, int arg3) {
        field2551++;
        if ((class43.field790[arg0][arg2][arg1] & 0x8) != 0) {
            return 0;
        } else if (arg0 <= 0 || (class43.field790[1][arg2][arg1] & 0x2) == 0) {
            int var4 = 121 / ((19 - arg3) / 44);
            return arg0;
        } else {
            return arg0 - 1;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BII)I")
    public static final int method1134(byte arg0, int arg1, int arg2) {
        class194 var3 = (class194) class139.field2322.method1063((byte) -9, (long) arg2);
        field2552++;
        if (var3 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var4 = 0;
            if (arg0 != 79) {
                return 72;
            }
            for (int var5 = 0; var5 < var3.field3173.length; var5++) {
                if (var3.field3179[var5] == arg1) {
                    var4 += var3.field3173[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public static void method1135(int arg0) {
        field2555 = null;
        field2558 = null;
        if (arg0 != 13423) {
            field2555 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
    public static final void method1136(int arg0) {
        field2557++;
        int[] var1 = new int[class240.field3780];
        int var2 = 0;
        for (int var3 = 0; var3 < class240.field3780; var3++) {
            class67 var5 = class190.method1314(var3, (byte) 68);
            if (var5.field1100 >= 0 || var5.field1135 >= 0) {
                var1[var2++] = var3;
            }
        }
        class183.field3013 = new int[var2];
        if (arg0 == 16) {
            for (int var4 = 0; var4 < var2; var4++) {
                class183.field3013[var4] = var1[var4];
            }
        }
    }
}
