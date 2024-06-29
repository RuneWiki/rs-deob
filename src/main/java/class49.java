import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class49 {

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "Laf;")
    public static class68 field867 = new class68(64);

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "Ljava/lang/String;")
    public static String field869 = "Started 3d Library";

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
    public static int field875 = 0;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIII)V")
    public static final void method383(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class97 var5 = (class97) class247.field3937.method843(-36); var5 != null; var5 = (class97) class247.field3937.method852((byte) 123)) {
            class170.method1172(arg3, arg4, arg0, var5, -68, arg2);
        }
        field868++;
        for (class97 var6 = (class97) class263.field4188.method843(-71); var6 != null; var6 = (class97) class263.field4188.method852((byte) 123)) {
            byte var11 = 1;
            class252 var12 = var6.field1591.method1435(0);
            if (var6.field1591.field3338 == var12.field3988) {
                var11 = 0;
            } else if (var6.field1591.field3338 == var12.field4021 || var6.field1591.field3338 == var12.field4016 || var6.field1591.field3338 == var12.field3996 || var6.field1591.field3338 == var12.field3998) {
                var11 = 2;
            } else if (var6.field1591.field3338 == var12.field4001 || var6.field1591.field3338 == var12.field4023 || var6.field1591.field3338 == var12.field4000 || var6.field1591.field3338 == var12.field3992) {
                var11 = 3;
            }
            if (var6.field1583 != var11) {
                int var13 = class281.method1896(var6.field1591, (byte) -91);
                if (var6.field1584 != var13) {
                    if (var6.field1596 != null) {
                        class195.field3123.method1707(var6.field1596);
                        var6.field1596 = null;
                    }
                    var6.field1584 = var13;
                }
                var6.field1583 = var11;
            }
            var6.field1579 = var6.field1591.field3389;
            var6.field1578 = var6.field1591.field3389 + (var6.field1591.method278(0) * 64);
            var6.field1586 = var6.field1591.field3341;
            var6.field1592 = var6.field1591.field3341 + var6.field1591.method278(0) * 64;
            class170.method1172(arg3, arg4, arg0, var6, -93, arg2);
        }
        if (arg1 < 83) {
            method383(-42, -6, -68, -89, 36);
        }
        for (class97 var7 = (class97) class220.field3593.method1404(-6); var7 != null; var7 = (class97) class220.field3593.method1412(-103)) {
            class252 var8 = var7.field1599.method1435(0);
            byte var9 = 1;
            if (var7.field1599.field3338 == var8.field3988) {
                var9 = 0;
            } else if (var7.field1599.field3338 == var8.field4021 || var7.field1599.field3338 == var8.field4016 || var7.field1599.field3338 == var8.field3996 || var7.field1599.field3338 == var8.field3998) {
                var9 = 2;
            } else if (var7.field1599.field3338 == var8.field4001 || var7.field1599.field3338 == var8.field4023 || var7.field1599.field3338 == var8.field4000 || var7.field1599.field3338 == var8.field3992) {
                var9 = 3;
            }
            if (var7.field1583 != var9) {
                int var10 = class64.method452((byte) 88, var7.field1599);
                if (var7.field1584 != var10) {
                    if (var7.field1596 != null) {
                        class195.field3123.method1707(var7.field1596);
                        var7.field1596 = null;
                    }
                    var7.field1584 = var10;
                }
                var7.field1583 = var9;
            }
            var7.field1579 = var7.field1599.field3389;
            var7.field1578 = var7.field1599.field3389 + var7.field1599.method278(0) * 64;
            var7.field1586 = var7.field1599.field3341;
            var7.field1592 = var7.field1599.field3341 + (var7.field1599.method278(0) * 64);
            class170.method1172(arg3, arg4, arg0, var7, 49, arg2);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)Ltg;")
    public static final class181 method384(int arg0, int arg1) {
        field870++;
        int var2 = 53 / ((-arg1 - 43) / 46);
        class181 var3 = (class181) class222.field3685.method480((long) arg0, 97);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class284.field4485.method1357(class224.method1575((byte) -113, arg0), class50.method392((byte) -59, arg0), -1);
        class181 var5 = new class181();
        var5.field2854 = arg0;
        if (var4 != null) {
            var5.method1230(83, new class221(var4));
        }
        var5.method1226(2);
        class222.field3685.method474((long) arg0, (byte) 47, var5);
        return var5;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V")
    public static void method385(byte arg0) {
        field867 = null;
        field869 = null;
        if (arg0 != 65) {
            method386(-81, 47, 45, -110, -116, -59, -26, 27);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method386(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field872++;
        int var8 = 0;
        int var9 = arg2;
        int var10 = arg6 - arg1;
        int var11 = 0;
        int var12 = arg6 * arg6;
        int var13 = arg2 - arg1;
        int var14 = var13 * var13;
        int var15 = var10 * var10;
        int var16 = arg2 * arg2;
        int var17 = var16 << 1;
        int var18 = var12 << 1;
        int var19 = var14 << 1;
        int var20 = var15 << 1;
        int var21 = arg2 << 1;
        int var22 = (1 - var21) * var12 + var17;
        int var23 = var13 << 1;
        int var24 = var16 - ((var21 - 1) * var18);
        int var25 = (1 - var23) * var15 + var19;
        int var26 = var14 - (var23 - 1) * var20;
        int var27 = var16 << 2;
        int var28 = var12 << 2;
        if (arg3 != -21756) {
            method389(-106);
        }
        int var29 = var14 << 2;
        int var30 = var15 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var23 - 3) * var20;
        int var35 = var27;
        int var36 = (arg2 - 1) * var28;
        int var37 = (var13 - 1) * var30;
        int var38 = var29;
        if (class161.field2561 <= arg7 && class51.field896 >= arg7) {
            int[] var39 = class29.field452[arg7];
            int var40 = class51.method393(arg0 - arg6, arg3 + 21756, class255.field4055, class9.field128);
            int var41 = class51.method393(arg0 + arg6, 0, class255.field4055, class9.field128);
            int var42 = class51.method393(arg0 - var10, 0, class255.field4055, class9.field128);
            int var43 = class51.method393(arg0 + var10, arg3 ^ 0xFFFFAB04, class255.field4055, class9.field128);
            class56.method420(var39, arg5, -7, var40, var42);
            class56.method420(var39, arg4, -7, var42, var43);
            class56.method420(var39, arg5, arg3 + 21749, var43, var41);
        }
        while (var9 > 0) {
            boolean var44 = var13 >= var9;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var38;
                        var25 += var33;
                        var11++;
                        var33 += var29;
                        var38 += var29;
                    }
                }
                if (var26 < 0) {
                    var11++;
                    var26 += var38;
                    var25 += var33;
                    var33 += var29;
                    var38 += var29;
                }
                var25 += -var37;
                var26 += -var34;
                var34 -= var30;
                var37 -= var30;
            }
            var9--;
            int var45 = arg7 + var9;
            int var46 = arg7 - var9;
            if (var22 < 0) {
                while (var22 < 0) {
                    var24 += var35;
                    var8++;
                    var35 += var27;
                    var22 += var31;
                    var31 += var27;
                }
            }
            if (var24 < 0) {
                var22 += var31;
                var24 += var35;
                var35 += var27;
                var8++;
                var31 += var27;
            }
            var22 += -var36;
            var36 -= var28;
            var24 += -var32;
            var32 -= var28;
            if (var45 >= class161.field2561 && class51.field896 >= var46) {
                int var47 = class51.method393(arg0 + var8, 0, class255.field4055, class9.field128);
                int var48 = class51.method393(arg0 - var8, arg3 ^ 0xFFFFAB04, class255.field4055, class9.field128);
                if (var44) {
                    int var49 = class51.method393(arg0 + var11, 0, class255.field4055, class9.field128);
                    int var50 = class51.method393(arg0 - var11, arg3 + 21756, class255.field4055, class9.field128);
                    if (var46 >= class161.field2561) {
                        int[] var51 = class29.field452[var46];
                        class56.method420(var51, arg5, -7, var48, var50);
                        class56.method420(var51, arg4, -7, var50, var49);
                        class56.method420(var51, arg5, -7, var49, var47);
                    }
                    if (var45 <= class51.field896) {
                        int[] var52 = class29.field452[var45];
                        class56.method420(var52, arg5, -7, var48, var50);
                        class56.method420(var52, arg4, -7, var50, var49);
                        class56.method420(var52, arg5, -7, var49, var47);
                    }
                } else {
                    if (var46 >= class161.field2561) {
                        class56.method420(class29.field452[var46], arg5, -7, var48, var47);
                    }
                    if (class51.field896 >= var45) {
                        class56.method420(class29.field452[var45], arg5, -7, var48, var47);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BIIIIII)V")
    public static final void method387(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field873++;
        int var7 = arg4 - arg5;
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = arg4;
        int var9 = 0;
        class258.method1759(arg0 ^ 0xFFFFFFBC, arg4);
        int var10 = var7;
        int var11 = -arg4;
        int var12 = -var7;
        int var13 = -1;
        int[] var14 = class29.field452[arg2];
        int var15 = -1;
        if (arg0 != 47) {
            return;
        }
        int var16 = arg3 + var7;
        int var17 = arg3 - var7;
        class56.method420(var14, arg1, -7, arg3 - arg4, var17);
        class56.method420(var14, arg6, -7, var17, var16);
        class56.method420(var14, arg1, -7, var16, arg3 + arg4);
        while (var9 < var8) {
            var15 += 2;
            var11 += var15;
            var13 += 2;
            var12 += var13;
            if (var12 >= 0 && var10 >= 1) {
                class84.field1324[var10] = var9;
                var10--;
                var12 -= var10 << 1;
            }
            var9++;
            if (var11 >= 0) {
                var8--;
                if (var8 < var7) {
                    int[] var18 = class29.field452[arg2 + var8];
                    int var19 = class84.field1324[var8];
                    int[] var20 = class29.field452[arg2 - var8];
                    int var21 = arg3 + var9;
                    int var22 = arg3 - var9;
                    int var23 = arg3 + var19;
                    int var24 = arg3 - var19;
                    class56.method420(var18, arg1, -7, var22, var24);
                    class56.method420(var18, arg6, arg0 - 54, var24, var23);
                    class56.method420(var18, arg1, -7, var23, var21);
                    class56.method420(var20, arg1, -7, var22, var24);
                    class56.method420(var20, arg6, -7, var24, var23);
                    class56.method420(var20, arg1, -7, var23, var21);
                } else {
                    int[] var25 = class29.field452[arg2 + var8];
                    int[] var26 = class29.field452[arg2 - var8];
                    int var27 = arg3 - var9;
                    int var28 = arg3 + var9;
                    class56.method420(var25, arg1, arg0 ^ 0xFFFFFFD6, var27, var28);
                    class56.method420(var26, arg1, arg0 ^ 0xFFFFFFD6, var27, var28);
                }
                var11 -= var8 << 1;
            }
            int[] var29 = class29.field452[arg2 + var9];
            int[] var30 = class29.field452[arg2 - var9];
            int var31 = arg3 - var8;
            int var32 = arg3 + var8;
            if (var9 >= var7) {
                class56.method420(var29, arg1, -7, var31, var32);
                class56.method420(var30, arg1, -7, var31, var32);
            } else {
                int var33 = var9 > var10 ? class84.field1324[var9] : var10;
                int var34 = arg3 + var33;
                int var35 = arg3 - var33;
                class56.method420(var29, arg1, -7, var31, var35);
                class56.method420(var29, arg6, -7, var35, var34);
                class56.method420(var29, arg1, -7, var34, var32);
                class56.method420(var30, arg1, -7, var31, var35);
                class56.method420(var30, arg6, -7, var35, var34);
                class56.method420(var30, arg1, -7, var34, var32);
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(II)V")
    public static final void method388(int arg0, int arg1) {
        field874++;
        if (arg0 == 64) {
            class259 var2 = class213.method1464((byte) -102, arg1, 6);
            var2.method1772((byte) -32);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
    public static final void method389(int arg0) {
        class198.field3161.method472((byte) -63);
        field871++;
        if (arg0 != 12099) {
            method386(32, 7, -50, 76, -29, -48, -109, -112);
        }
    }
}
