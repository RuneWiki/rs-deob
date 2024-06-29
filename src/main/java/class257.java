import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tga")
public class class257 {

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!tga", name = "c", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!tga", name = "d", descriptor = "I")
    public int field3517;

    @OriginalMember(owner = "client!tga", name = "e", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!tga", name = "f", descriptor = "I")
    public int field3519;

    @OriginalMember(owner = "client!tga", name = "g", descriptor = "I")
    public int field3520;

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "Z")
    public boolean field3515;

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1601(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class38.method262(arg6, (byte) -54);
        field3514++;
        int var7 = 0;
        int var8 = arg6 - arg2;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg6;
        int var10 = -arg6;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        if (arg1 >= class675.field9512 && arg1 <= class395.field5484) {
            int[] var14 = class591.field8480[arg1];
            int var15 = class325.method1901(arg3 - arg6, class490.field6592, class116.field1628, true);
            int var16 = class325.method1901(arg3 + arg6, class490.field6592, class116.field1628, true);
            int var17 = class325.method1901(arg3 - var8, class490.field6592, class116.field1628, true);
            int var18 = class325.method1901(arg3 + var8, class490.field6592, class116.field1628, true);
            class721.method4044(var14, var15, (byte) -127, var17, arg5);
            class721.method4044(var14, var17, (byte) -125, var18, arg4);
            class721.method4044(var14, var18, (byte) -121, var16, arg5);
        }
        int var19 = arg0;
        while (var9 > var7) {
            var19 += 2;
            var13 += 2;
            var10 += var13;
            var12 += var19;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                var12 -= var11 << 1;
                class278.field3722[var11] = var7;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg1 - var9;
                int var21 = arg1 + var9;
                if (var21 >= class675.field9512 && class395.field5484 >= var20) {
                    if (var8 <= var9) {
                        int var22 = class325.method1901(arg3 + var7, class490.field6592, class116.field1628, true);
                        int var23 = class325.method1901(arg3 - var7, class490.field6592, class116.field1628, true);
                        if (var21 <= class395.field5484) {
                            class721.method4044(class591.field8480[var21], var23, (byte) -120, var22, arg5);
                        }
                        if (class675.field9512 <= var20) {
                            class721.method4044(class591.field8480[var20], var23, (byte) -128, var22, arg5);
                        }
                    } else {
                        int var24 = class278.field3722[var9];
                        int var25 = class325.method1901(arg3 + var7, class490.field6592, class116.field1628, true);
                        int var26 = class325.method1901(arg3 - var7, class490.field6592, class116.field1628, true);
                        int var27 = class325.method1901(arg3 + var24, class490.field6592, class116.field1628, true);
                        int var28 = class325.method1901(arg3 - var24, class490.field6592, class116.field1628, true);
                        if (var21 <= class395.field5484) {
                            int[] var29 = class591.field8480[var21];
                            class721.method4044(var29, var26, (byte) -128, var28, arg5);
                            class721.method4044(var29, var28, (byte) -122, var27, arg4);
                            class721.method4044(var29, var27, (byte) -119, var25, arg5);
                        }
                        if (var20 >= class675.field9512) {
                            int[] var30 = class591.field8480[var20];
                            class721.method4044(var30, var26, (byte) -124, var28, arg5);
                            class721.method4044(var30, var28, (byte) -120, var27, arg4);
                            class721.method4044(var30, var27, (byte) -120, var25, arg5);
                        }
                    }
                }
            }
            int var31 = arg1 - var7;
            int var32 = arg1 + var7;
            if (class675.field9512 <= var32 && var31 <= class395.field5484) {
                int var33 = arg3 + var9;
                int var34 = arg3 - var9;
                if (class490.field6592 <= var33 && var34 <= class116.field1628) {
                    int var35 = class325.method1901(var33, class490.field6592, class116.field1628, true);
                    int var36 = class325.method1901(var34, class490.field6592, class116.field1628, true);
                    if (var8 > var7) {
                        int var37 = var11 >= var7 ? var11 : class278.field3722[var7];
                        int var38 = class325.method1901(arg3 + var37, class490.field6592, class116.field1628, true);
                        int var39 = class325.method1901(arg3 - var37, class490.field6592, class116.field1628, true);
                        if (class395.field5484 >= var32) {
                            int[] var40 = class591.field8480[var32];
                            class721.method4044(var40, var36, (byte) -126, var39, arg5);
                            class721.method4044(var40, var39, (byte) -123, var38, arg4);
                            class721.method4044(var40, var38, (byte) -121, var35, arg5);
                        }
                        if (class675.field9512 <= var31) {
                            int[] var41 = class591.field8480[var31];
                            class721.method4044(var41, var36, (byte) -121, var39, arg5);
                            class721.method4044(var41, var39, (byte) -119, var38, arg4);
                            class721.method4044(var41, var38, (byte) -124, var35, arg5);
                        }
                    } else {
                        if (class395.field5484 >= var32) {
                            class721.method4044(class591.field8480[var32], var36, (byte) -124, var35, arg5);
                        }
                        if (var31 >= class675.field9512) {
                            class721.method4044(class591.field8480[var31], var36, (byte) -127, var35, arg5);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(IIIBILaa;Ljava/lang/String;Lda;Loq;Lpaa;II)V")
    public static final void method1602(int arg0, int arg1, int arg2, byte arg3, int arg4, class571 arg5, String arg6, class400 arg7, class742 arg8, class712 arg9, int arg10, int arg11) {
        field3516++;
        int var12;
        if (class665.field9377 == 4) {
            var12 = (int) class403.field5597 & 0x3FFF;
        } else {
            var12 = (int) class403.field5597 + class732.field10234 & 0x3FFF;
        }
        int var13 = Math.max(arg9.field9966 / 2, arg9.field10011 / 2) + 10;
        int var14 = arg10 * arg10 + arg11 * arg11;
        int var15 = 0 % ((arg3 + 30) / 50);
        if ((var13 * var13) < var14) {
            return;
        }
        int var16 = class231.field3217[var12];
        int var17 = class231.field3218[var12];
        if (class665.field9377 != 4) {
            var17 = var17 * 256 / (class592.field8541 + 256);
            var16 = var16 * 256 / (class592.field8541 + 256);
        }
        int var18 = arg11 * var16 + (arg10 * var17) >> 14;
        int var19 = arg11 * var17 - (arg10 * var16) >> 14;
        int var20 = arg8.method4133(100, arg6, -69, null);
        int var21 = var18 - var20 / 2;
        int var22 = arg8.method4136(0, 100, (byte) -48, arg6, null);
        if (var21 >= (-arg9.field9966) && var21 <= arg9.field9966 && (-arg9.field10011) <= var19 && var19 <= arg9.field10011) {
            arg7.method2423(null, 1, (byte) 17, var21 - (-(arg9.field9966 / 2) - arg1), 0, arg4, arg1, 0, null, arg2, arg6, arg2 + (arg9.field10011 / 2) - arg0 - var19 - var22, 0, arg5, var20, 50);
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lgs;Z)Z")
    public static final boolean method1603(class743 arg0, boolean arg1) {
        boolean var2 = class52.field741 == class435.field5969;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method3480(false);
        if (arg0.field10352 < 0 || arg0.field10357 < 0 || arg0.field10365 >= class485.field6556 || arg0.field10353 >= class314.field4059) {
            return false;
        }
        short var6 = 0;
        for (int var7 = arg0.field10352; var7 <= arg0.field10365; var7++) {
            for (int var11 = arg0.field10357; var11 <= arg0.field10353; var11++) {
                class38 var12 = class617.method3623(arg0.field9501, var7, var11);
                if (var12 != null) {
                    class590 var13 = class182.method1212(arg0, (byte) 24);
                    class590 var14 = var12.field538;
                    if (var14 == null) {
                        var12.field538 = var13;
                    } else {
                        while (var14.field8467 != null) {
                            var14 = var14.field8467;
                        }
                        var14.field8467 = var13;
                    }
                    if (var2 && (class589.field8454[var7][var11] & 0xFF000000) != 0) {
                        var3 = class589.field8454[var7][var11];
                        var4 = class326.field4198[var7][var11];
                        var5 = class111.field1590[var7][var11];
                    }
                    if (!arg1 && var12.field532 != null && var12.field532.field734 > var6) {
                        var6 = var12.field532.field734;
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var8 = arg0.field10352; var8 <= arg0.field10365; var8++) {
                for (int var9 = arg0.field10357; var9 <= arg0.field10353; var9++) {
                    if ((class589.field8454[var8][var9] & 0xFF000000) == 0) {
                        class589.field8454[var8][var9] = var3;
                        class326.field4198[var8][var9] = var4;
                        class111.field1590[var8][var9] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class707.field9873[class354.field4557++] = arg0;
        } else {
            int var10 = class52.field741 == class435.field5969 ? 1 : 0;
            if (!arg0.method277(3)) {
                class140.field1931[var10][class609.field8671[var10]++] = arg0;
            } else if (arg0.method283((byte) -50)) {
                class160.field2206[var10][class352.field4548[var10]++] = arg0;
            } else {
                class261.field3566[var10][class269.field3635[var10]++] = arg0;
                class380.field5357 = true;
            }
        }
        if (arg1) {
            arg0.field9502 -= var6;
        }
        return true;
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(IIIZI)V")
    public static final void method1604(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field3518++;
        if (~class674.field9500.field5158.method1006(0) == arg4) {
            class4.method12(false, true);
        } else {
            class42.field607 = class674.field9500.field5158.method1006(~arg4);
            class736.method4088((byte) 122, true, 0);
        }
        class282.field3746 = arg1;
        class471.field6465 = arg2;
        class670.field9423 = arg3;
        class531.method3175(arg0);
    }
}
