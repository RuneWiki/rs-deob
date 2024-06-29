import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class238 {

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "Lnd;")
    public static class547 field3094;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIII)V", line = 3)
    public static final void method1488(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3093++;
        if (arg5 <= class760.field10606 && class546.field7619 <= arg3) {
            boolean var6;
            if (class667.field9373 > arg4) {
                var6 = false;
                arg4 = class667.field9373;
            } else if (arg4 <= class225.field2994) {
                var6 = true;
            } else {
                var6 = false;
                arg4 = class225.field2994;
            }
            boolean var7;
            if (class667.field9373 > arg0) {
                arg0 = class667.field9373;
                var7 = false;
            } else if (class225.field2994 < arg0) {
                arg0 = class225.field2994;
                var7 = false;
            } else {
                var7 = true;
            }
            if (class546.field7619 > arg5) {
                arg5 = class546.field7619;
            } else {
                class636.method3569(arg0, arg1, arg4, 347845800, class432.field5765[arg5++]);
            }
            if (class760.field10606 < arg3) {
                arg3 = class760.field10606;
            } else {
                class636.method3569(arg0, arg1, arg4, arg2 ^ 0xEB440FA1, class432.field5765[arg3--]);
            }
            if (var6 && var7) {
                for (int var8 = arg5; var8 <= arg3; var8++) {
                    int[] var9 = class432.field5765[var8];
                    var9[arg4] = var9[arg0] = arg1;
                }
            } else if (var6) {
                for (int var11 = arg5; var11 <= arg3; var11++) {
                    class432.field5765[var11][arg4] = arg1;
                }
            } else if (var7) {
                for (int var10 = arg5; var10 <= arg3; var10++) {
                    class432.field5765[var10][arg0] = arg1;
                }
            }
        }
        if (arg2 != -17655) {
            method1488(101, -3, 127, -94, 127, -26);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lcs;ILha;IILup;)Z", line = 107)
    public static final boolean method1489(class344 arg0, int arg1, class60 arg2, int arg3, int arg4, class278 arg5) {
        field3092++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg5.field3487 != null) {
            var9 = class73.field1044 - ((arg5.field3513 + arg0.field4347 - class73.field1033) * (class73.field1044 - class73.field1045) / (class73.field1038 - class73.field1033));
            var7 = (class73.field1048 - class73.field1052) * (arg0.field4353 + arg5.field3536 - class73.field1032) / (class73.field1049 - class73.field1032) + class73.field1052;
            var6 = (arg0.field4353 + arg5.field3494 - class73.field1032) * (class73.field1048 - class73.field1052) / (class73.field1049 - class73.field1032) + class73.field1052;
            var8 = class73.field1044 - (arg0.field4347 + arg5.field3497 - class73.field1033) * (class73.field1044 - class73.field1045) / (class73.field1038 - class73.field1033);
        }
        class481 var10 = null;
        int var11 = 0;
        if (arg4 != -5) {
            method1489(null, -62, null, 26, -24, null);
        }
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg5.field3530 != -1) {
            if (arg0.field4344 && arg5.field3531 != -1) {
                var10 = arg5.method1642(true, arg2, -11858);
            } else {
                var10 = arg5.method1642(false, arg2, -11858);
            }
            if (var10 != null) {
                var11 = arg0.field4351 - (var10.method142() + 1 >> 1);
                if (var6 > var11) {
                    var6 = var11;
                }
                var12 = arg0.field4351 + (var10.method142() + 1 >> 1);
                var13 = arg0.field4350 - (var10.method149() + 1 >> 1);
                if (var7 < var12) {
                    var7 = var12;
                }
                var14 = arg0.field4350 + (var10.method149() + 1 >> 1);
                if (var8 > var13) {
                    var8 = var13;
                }
                if (var14 > var9) {
                    var9 = var14;
                }
            }
        }
        class570 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        if (arg5.field3522 != null) {
            var15 = class70.method631((byte) 94, arg5.field3500);
            if (var15 != null) {
                var16 = class165.field2306.method1624(arg5.field3522, class689.field9587, false, null, null);
                var17 = arg0.field4351 + ((class73.field1048 - class73.field1052) * arg5.field3514 / (class73.field1049 - class73.field1032));
                int var24 = arg0.field4350 - ((class73.field1044 - class73.field1045) * arg5.field3488 / (class73.field1038 - class73.field1033));
                if (var10 == null) {
                    var18 = var24 - var15.method3268() * var16 / 2;
                } else {
                    var18 = var24 - ((var10.method149() >> 1) + (var16 * var15.method3270()));
                }
                for (int var25 = 0; var25 < var16; var25++) {
                    String var26 = class689.field9587[var25];
                    if (var25 < var16 - 1) {
                        var26 = var26.substring(0, var26.length() - 4);
                    }
                    int var27 = var15.method3269(var26);
                    if (var27 > var19) {
                        var19 = var27;
                    }
                }
                var20 = var17 + arg1 - (var19 / 2);
                if (var6 > var20) {
                    var6 = var20;
                }
                var21 = var19 / 2 + (var17 + arg1);
                var22 = arg3 + var18;
                if (var7 < var21) {
                    var7 = var21;
                }
                var23 = arg3 + var18 + (var16 * var15.method3270());
                if (var22 < var8) {
                    var8 = var22;
                }
                if (var9 < var23) {
                    var9 = var23;
                }
            }
        }
        if (class73.field1052 > var7 || class73.field1048 < var6 || class73.field1045 > var9 || class73.field1044 < var8) {
            return true;
        }
        class73.method654(arg2, arg0, arg5);
        if (var10 != null) {
            if (class35.field563 > 0 && (class136.field1950 != -1 && class136.field1950 == arg0.field4349 || class389.field4973 != -1 && class389.field4973 == arg5.field3503)) {
                int var28;
                if (class601.field8362 > 50) {
                    var28 = 200 - (class601.field8362 * 2);
                } else {
                    var28 = class601.field8362 * 2;
                }
                int var29 = var28 << 24 | 0xFFFF00;
                arg2.method445(arg0.field4350, arg0.field4351, var10.method143() / 2 + 7, var29, 12989);
                arg2.method445(arg0.field4350, arg0.field4351, var10.method143() / 2 + 5, var29, 12989);
                arg2.method445(arg0.field4350, arg0.field4351, var10.method143() / 2 + 3, var29, 12989);
                arg2.method445(arg0.field4350, arg0.field4351, var10.method143() / 2 + 1, var29, 12989);
                arg2.method445(arg0.field4350, arg0.field4351, var10.method143() / 2, var29, 12989);
            }
            var10.method2759(arg0.field4351 - (var10.method142() >> 1), arg0.field4350 + -(var10.method149() >> 1));
        }
        if (arg5.field3522 != null && var15 != null) {
            class635.method3561(arg0, var17, arg5, var15, var19, arg2, var18, var16, false);
        }
        if (arg5.field3530 != -1 || arg5.field3522 != null) {
            class586 var30 = new class586(arg0);
            var30.field8183 = var23;
            var30.field8190 = var14;
            var30.field8184 = var11;
            var30.field8191 = var12;
            var30.field8180 = var13;
            var30.field8179 = var20;
            var30.field8178 = var22;
            var30.field8182 = var21;
            class537.field7459.method3671(var30, false);
        }
        return false;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I[BZIII)Z", line = 299)
    public static final boolean method1490(int arg0, byte[] arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg2) {
            field3094 = null;
        }
        field3096++;
        boolean var6 = true;
        class461 var7 = new class461(arg1);
        int var8 = -1;
        label60: while (true) {
            int var9 = var7.method2621(127);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                while (!var11) {
                    int var13 = var7.method2594(3340);
                    if (var13 == 0) {
                        continue label60;
                    }
                    var10 += var13 - 1;
                    int var14 = var10 & 0x3F;
                    int var15 = var10 >> 6 & 0x3F;
                    int var16 = var7.method2600((byte) -127) >> 2;
                    int var17 = arg5 + var15;
                    int var18 = var14 + arg3;
                    if (var17 > 0 && var18 > 0 && var17 < arg0 - 1 && (arg4 - 1) > var18) {
                        class543 var19 = client.field3995.method3384(var8, false);
                        if (var16 != 22 || class748.field10451.field10386.method3003((byte) 54) != 0 || var19.field7550 != 0 || var19.field7580 == 1 || var19.field7502) {
                            if (!var19.method3116((byte) 98)) {
                                var6 = false;
                                class628.field8657++;
                            }
                            var11 = true;
                        }
                    }
                }
                int var12 = var7.method2594(3340);
                if (var12 == 0) {
                    break;
                }
                var7.method2600((byte) -128);
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V", line = 383)
    public static void method1491(int arg0) {
        if (arg0 == 63) {
            field3094 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILnd;II)Lef;", line = 395)
    public static final class490 method1492(int arg0, class547 arg1, int arg2, int arg3) {
        field3098++;
        class461 var4 = new class461(arg1.method3153(arg3, arg0 ^ arg0, arg2));
        class490 var5 = new class490(arg3, var4.method2574(-1), var4.method2574(arg0 ^ 0xFFFFB165), var4.method2622(-539564808), var4.method2622(-539564808), var4.method2600((byte) -124) == 1, var4.method2600((byte) -128), var4.method2600((byte) -125));
        int var6 = var4.method2600((byte) -123);
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field6960.method3671(new class372(var4.method2600((byte) -126), var4.method2566(arg0 - 20124), var4.method2566(arg0 ^ 0xFFFFB164), var4.method2566(-2), var4.method2566(-2), var4.method2566(-2), var4.method2566(-2), var4.method2566(-2), var4.method2566(-2)), false);
        }
        var5.method2897(-105);
        return var5;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZII)I", line = 419)
    public static final int method1493(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field3094 = null;
        }
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        field3095++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }
}
