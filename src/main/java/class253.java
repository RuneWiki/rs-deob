import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class253 {

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "[Ltl;")
    public static class240[] field3656 = new class240[2048];

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public static int field3661 = 0;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)Lph;")
    public static final class203 method1622(int arg0, int arg1) {
        if (arg0 > -44) {
            field3656 = null;
        }
        field3658++;
        class203 var2 = (class203) class4.field47.method1567((long) arg1, 8);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class215.field3001.method1861(class124.method810(1, arg1), class41.method260((byte) 46, arg1), 1);
        class203 var4 = new class203();
        if (var3 != null) {
            var4.method1302((byte) 80, new class216(var3));
        }
        class4.field47.method1568((byte) -80, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIZILlc;I)V")
    public static final void method1623(int arg0, int arg1, int arg2, boolean arg3, int arg4, class290 arg5, int arg6) {
        class292.method1959(0, arg0, arg2, arg1, arg5.field4563, arg4, arg6, arg5.field4553);
        if (!arg3) {
            field3659++;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
    public static final void method1624(byte arg0) {
        class163.field2332.method586(-9);
        field3657++;
        int var1 = class163.field2332.method594((byte) 109, 1);
        if (arg0 != -96) {
            method1626(true);
        }
        if (var1 == 0) {
            return;
        }
        int var2 = class163.field2332.method594((byte) 123, 2);
        if (var2 == 0) {
            class286.field4423[class272.field3986++] = 2047;
        } else if (var2 == 1) {
            int var3 = class163.field2332.method594((byte) 112, 3);
            class177.field2507.method1946(1, -102, var3);
            int var4 = class163.field2332.method594((byte) 98, 1);
            if (var4 == 1) {
                class286.field4423[class272.field3986++] = 2047;
            }
        } else if (var2 == 2) {
            if (class163.field2332.method594((byte) 125, 1) == 1) {
                int var6 = class163.field2332.method594((byte) 110, 3);
                class177.field2507.method1946(2, -128, var6);
                int var7 = class163.field2332.method594((byte) 100, 3);
                class177.field2507.method1946(2, -121, var7);
            } else {
                int var5 = class163.field2332.method594((byte) 126, 3);
                class177.field2507.method1946(0, -104, var5);
            }
            int var8 = class163.field2332.method594((byte) 127, 1);
            if (var8 == 1) {
                class286.field4423[class272.field3986++] = 2047;
            }
        } else if (var2 == 3) {
            class199.field2833 = class163.field2332.method594((byte) 108, 2);
            int var9 = class163.field2332.method594((byte) 98, 1);
            if (var9 == 1) {
                class286.field4423[class272.field3986++] = 2047;
            }
            int var10 = class163.field2332.method594((byte) 116, 7);
            int var11 = class163.field2332.method594((byte) 112, 7);
            int var12 = class163.field2332.method594((byte) 126, 1);
            class177.field2507.method1561(var12 == 1, var10, (byte) -67, var11);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1625(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3660++;
        int var8 = 0;
        int var9 = arg0;
        int var10 = 0;
        int var11 = arg7 - arg6;
        int var12 = arg7 * arg7;
        int var13 = arg0 - arg6;
        int var14 = arg0 * arg0;
        int var15 = var13 * var13;
        int var16 = var11 * var11;
        int var17 = var14 << 1;
        int var18 = var15 << 1;
        int var19 = var12 << 1;
        int var20 = var16 << 1;
        int var21 = arg0 << 1;
        int var22 = var13 << 1;
        int var23 = var14 - ((var21 - 1) * var19);
        int var24 = (1 - var21) * var12 + var17;
        int var25 = (1 - var22) * var16 + var18;
        int var26 = var15 - ((var22 - 1) * var20);
        int var27 = var12 << 2;
        int var28 = var14 << 2;
        int var29 = var16 << 2;
        int var30 = var15 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var19;
        if (arg3 != 20433) {
            return;
        }
        int var33 = var18 * 3;
        int var34 = (arg0 - 1) * var27;
        int var35 = var30;
        int var36 = (var13 - 1) * var29;
        if (arg4 >= class286.field4431 && arg4 <= class230.field3302) {
            int[] var37 = class268.field3919[arg4];
            int var38 = class22.method134(class177.field2514, 14949, arg1 - arg7, class279.field4238);
            int var39 = class22.method134(class177.field2514, arg3 ^ 0x75B4, arg1 + arg7, class279.field4238);
            int var40 = class22.method134(class177.field2514, 14949, arg1 - var11, class279.field4238);
            int var41 = class22.method134(class177.field2514, arg3 ^ 0x75B4, arg1 + var11, class279.field4238);
            class76.method463(var38, 0, arg2, var40, var37);
            class76.method463(var40, 0, arg5, var41, var37);
            class76.method463(var41, 0, arg2, var39, var37);
        }
        int var42 = (var22 - 3) * var20;
        int var43 = var28;
        while (var9 > 0) {
            boolean var44 = var9 <= var13;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var10++;
                        var25 += var33;
                        var33 += var30;
                        var26 += var35;
                        var35 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var35;
                    var35 += var30;
                    var25 += var33;
                    var33 += var30;
                    var10++;
                }
                var26 += -var42;
                var25 += -var36;
                var42 -= var29;
                var36 -= var29;
            }
            if (var24 < 0) {
                while (var24 < 0) {
                    var8++;
                    var23 += var43;
                    var43 += var28;
                    var24 += var31;
                    var31 += var28;
                }
            }
            var9--;
            if (var23 < 0) {
                var23 += var43;
                var24 += var31;
                var8++;
                var31 += var28;
                var43 += var28;
            }
            var24 += -var34;
            var23 += -var32;
            var32 -= var27;
            var34 -= var27;
            int var45 = arg4 + var9;
            int var46 = arg4 - var9;
            if (var45 >= class286.field4431 && var46 <= class230.field3302) {
                int var47 = class22.method134(class177.field2514, 14949, arg1 + var8, class279.field4238);
                int var48 = class22.method134(class177.field2514, 14949, arg1 - var8, class279.field4238);
                if (var44) {
                    int var49 = class22.method134(class177.field2514, 14949, arg1 + var10, class279.field4238);
                    int var50 = class22.method134(class177.field2514, 14949, arg1 - var10, class279.field4238);
                    if (class286.field4431 <= var46) {
                        int[] var51 = class268.field3919[var46];
                        class76.method463(var48, arg3 ^ 0x4FD1, arg2, var50, var51);
                        class76.method463(var50, 0, arg5, var49, var51);
                        class76.method463(var49, 0, arg2, var47, var51);
                    }
                    if (var45 <= class230.field3302) {
                        int[] var52 = class268.field3919[var45];
                        class76.method463(var48, 0, arg2, var50, var52);
                        class76.method463(var50, arg3 ^ 0x4FD1, arg5, var49, var52);
                        class76.method463(var49, 0, arg2, var47, var52);
                    }
                } else {
                    if (class286.field4431 <= var46) {
                        class76.method463(var48, 0, arg2, var47, class268.field3919[var46]);
                    }
                    if (class230.field3302 >= var45) {
                        class76.method463(var48, 0, arg2, var47, class268.field3919[var45]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V")
    public static void method1626(boolean arg0) {
        field3656 = null;
        if (arg0) {
            method1626(true);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILwe;I)I")
    public static final int method1627(int arg0, class82 arg1, int arg2) {
        field3662++;
        if (arg0 != 1) {
            method1627(-72, (class82) null, -68);
        }
        if (!client.method1920(arg1).method1157(false, arg2) && arg1.field1109 == null) {
            return -1;
        } else if (arg1.field1074 == null || arg2 >= arg1.field1074.length) {
            return -1;
        } else {
            return arg1.field1074[arg2];
        }
    }
}
