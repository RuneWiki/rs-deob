import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class83 extends class172 {

    @OriginalMember(owner = "client!b", name = "T", descriptor = "Lig;")
    public class9 field1526;

    @OriginalMember(owner = "client!b", name = "D", descriptor = "Lid;")
    private static class149 field1511 = class60.method382("Connection lost)3", (byte) 114);

    @OriginalMember(owner = "client!b", name = "F", descriptor = "Lid;")
    public static class149 field1513 = field1511;

    @OriginalMember(owner = "client!b", name = "E", descriptor = "Z")
    public static boolean field1512 = true;

    @OriginalMember(owner = "client!b", name = "I", descriptor = "I")
    public static int field1516 = 0;

    @OriginalMember(owner = "client!b", name = "H", descriptor = "[[[Lgk;")
    public static class157[][][] field1515 = new class157[4][104][104];

    @OriginalMember(owner = "client!b", name = "M", descriptor = "Lid;")
    public static class149 field1520 = class60.method382("V-Brification des mises -9 jour )2 ", (byte) 59);

    @OriginalMember(owner = "client!b", name = "U", descriptor = "Lid;")
    public static class149 field1527 = class60.method382("welle2:", (byte) 99);

    @OriginalMember(owner = "client!b", name = "B", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!b", name = "C", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!b", name = "G", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!b", name = "J", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!b", name = "K", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!b", name = "N", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!b", name = "O", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!b", name = "P", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!b", name = "Q", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!b", name = "S", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!b", name = "L", descriptor = "Ldj;")
    public static class187 field1519;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIIIZ)V")
    public static final void method615(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field1509++;
        int var8 = arg5;
        int var9 = 0;
        int var10 = 0;
        int var11 = arg1 - arg2;
        int var12 = var11 * var11;
        int var13 = arg5 * arg5;
        int var14 = arg5 - arg2;
        int var15 = arg1 * arg1;
        int var16 = var15 << 1;
        int var17 = var12 << 1;
        int var18 = var14 * var14;
        int var19 = var18 << 1;
        int var20 = var14 << 1;
        int var21 = var13 << 1;
        int var22 = arg5 << 1;
        int var23 = (1 - var22) * var15 + var21;
        int var24 = var13 - (var22 - 1) * var16;
        int var25 = (1 - var20) * var12 + var19;
        int var26 = var18 - ((var20 - 1) * var17);
        int var27 = var15 << 2;
        int var28 = var13 << 2;
        int var29 = var12 << 2;
        int var30 = (var22 - 3) * var16;
        int var31 = var19 * 3;
        int var32 = var21 * 3;
        int var33 = var28;
        int var34 = (var20 - 3) * var17;
        int var35 = var18 << 2;
        int var36 = (arg5 - 1) * var27;
        int var37 = (var14 - 1) * var29;
        int[] var38 = class15.field220[arg6];
        if (arg7) {
            return;
        }
        int var39 = var35;
        class141.method987(2, arg0 - arg1, var38, arg0 - var11, arg3);
        class141.method987(2, arg0 - var11, var38, arg0 + var11, arg4);
        class141.method987(2, arg0 + var11, var38, arg0 + arg1, arg3);
        while (var8 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var33;
                    var33 += var28;
                    var10++;
                    var23 += var32;
                    var32 += var28;
                }
            }
            boolean var40 = var8 <= var14;
            var8--;
            int var41 = arg6 - var8;
            if (var24 < 0) {
                var24 += var33;
                var10++;
                var33 += var28;
                var23 += var32;
                var32 += var28;
            }
            int var42 = arg0 - var10;
            var24 += -var30;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var9++;
                        var25 += var31;
                        var31 += var35;
                        var26 += var39;
                        var39 += var35;
                    }
                }
                if (var26 < 0) {
                    var25 += var31;
                    var9++;
                    var26 += var39;
                    var39 += var35;
                    var31 += var35;
                }
                var25 += -var37;
                var37 -= var29;
                var26 += -var34;
                var34 -= var29;
            }
            var23 += -var36;
            int var43 = arg6 + var8;
            var30 -= var27;
            var36 -= var27;
            int var44 = arg0 + var10;
            if (var40) {
                int var45 = arg0 + var9;
                int var46 = arg0 - var9;
                class141.method987(2, var42, class15.field220[var41], var46, arg3);
                class141.method987(2, var46, class15.field220[var41], var45, arg4);
                class141.method987(2, var45, class15.field220[var41], var44, arg3);
                class141.method987(2, var42, class15.field220[var43], var46, arg3);
                class141.method987(2, var46, class15.field220[var43], var45, arg4);
                class141.method987(2, var45, class15.field220[var43], var44, arg3);
            } else {
                class141.method987(2, var42, class15.field220[var41], var44, arg3);
                class141.method987(2, var42, class15.field220[var43], var44, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IZIIIIIIII)V")
    public static final void method616(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1525++;
        class18 var10 = null;
        class18 var11 = (class18) class193.field3456.method1140(0);
        if (arg1) {
            method620((class29) null, (byte) 125);
        }
        while (var11 != null) {
            if (var11.field260 == arg6 && var11.field263 == arg3 && var11.field280 == arg5 && var11.field266 == arg7) {
                var10 = var11;
                break;
            }
            var11 = (class18) class193.field3456.method1127(0);
        }
        if (var10 == null) {
            var10 = new class18();
            var10.field280 = arg5;
            var10.field263 = arg3;
            var10.field260 = arg6;
            var10.field266 = arg7;
            class109.method771(var10, 0);
            class193.field3456.method1131(var10, arg1);
        }
        var10.field272 = arg0;
        var10.field281 = arg9;
        var10.field258 = arg4;
        var10.field269 = arg2;
        var10.field278 = arg8;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(B)V")
    public static void method617(byte arg0) {
        field1519 = null;
        field1511 = null;
        field1527 = null;
        if (arg0 != 75) {
            field1522 = -51;
        }
        field1520 = null;
        field1513 = null;
        field1515 = null;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
    public static final void method618(int arg0) {
        class168.field3117 = null;
        if (arg0 != 1) {
            return;
        }
        class182.method1260(class240.field4197, 0, 0, class218.field3851, 0, -1, 0, class11.field161, arg0 ^ 0x5823);
        field1514++;
        if (class168.field3117 != null) {
            class211.method1438(class188.field3376, class168.field3117, -1412584499, class240.field4197, 0, class102.field1801.field767, class218.field3851, class124.field2193, true, 0);
            class168.field3117 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method619(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1524++;
        int var8 = arg5;
        int var9 = 0;
        int var10 = 0;
        int var11 = arg7 - arg1;
        int var12 = arg5 - arg1;
        int var13 = arg5 * arg5;
        int var14 = var11 * var11;
        int var15 = var12 * var12;
        int var16 = arg7 * arg7;
        int var17 = var13 << 1;
        int var18 = var14 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg5 << 1;
        if (arg4 != -23880) {
            field1513 = null;
        }
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var16 + var17;
        int var24 = var13 - ((var21 - 1) * var19);
        int var25 = (1 - var22) * var14 + var20;
        int var26 = var15 - (var22 - 1) * var18;
        int var27 = var16 << 2;
        int var28 = var15 << 2;
        int var29 = var17 * 3;
        int var30 = var13 << 2;
        int var31 = var14 << 2;
        int var32 = (var21 - 3) * var19;
        int var33 = (var22 - 3) * var18;
        int var34 = var20 * 3;
        int var35 = (arg5 - 1) * var27;
        int var36 = var30;
        int var37 = var28;
        if (class224.field3940 <= arg0 && arg0 <= class94.field1655) {
            int[] var38 = class15.field220[arg0];
            int var39 = class47.method303(arg3 - arg7, class192.field3449, class257.field4496, 65535);
            int var40 = class47.method303(arg3 + arg7, class192.field3449, class257.field4496, arg4 ^ 0xFFFF5D47);
            int var41 = class47.method303(arg3 - var11, class192.field3449, class257.field4496, 65535);
            int var42 = class47.method303(arg3 + var11, class192.field3449, class257.field4496, 65535);
            class141.method987(2, var39, var38, var41, arg2);
            class141.method987(2, var41, var38, var42, arg6);
            class141.method987(2, var42, var38, var40, arg2);
        }
        int var43 = (var12 - 1) * var31;
        while (var8 > 0) {
            boolean var44 = var12 >= var8;
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var29;
                    var29 += var30;
                    var9++;
                    var24 += var36;
                    var36 += var30;
                }
            }
            if (var24 < 0) {
                var23 += var29;
                var24 += var36;
                var36 += var30;
                var9++;
                var29 += var30;
            }
            var24 += -var32;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var10++;
                        var26 += var37;
                        var37 += var28;
                        var25 += var34;
                        var34 += var28;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var10++;
                    var37 += var28;
                    var25 += var34;
                    var34 += var28;
                }
                var25 += -var43;
                var26 += -var33;
                var33 -= var31;
                var43 -= var31;
            }
            var23 += -var35;
            var32 -= var27;
            var8--;
            int var45 = arg0 + var8;
            var35 -= var27;
            int var46 = arg0 - var8;
            if (var45 >= class224.field3940 && var46 <= class94.field1655) {
                int var47 = class47.method303(arg3 + var9, class192.field3449, class257.field4496, 65535);
                int var48 = class47.method303(arg3 - var9, class192.field3449, class257.field4496, 65535);
                if (var44) {
                    int var49 = class47.method303(arg3 + var10, class192.field3449, class257.field4496, 65535);
                    int var50 = class47.method303(arg3 - var10, class192.field3449, class257.field4496, 65535);
                    if (class224.field3940 <= var46) {
                        int[] var51 = class15.field220[var46];
                        class141.method987(2, var48, var51, var50, arg2);
                        class141.method987(2, var50, var51, var49, arg6);
                        class141.method987(2, var49, var51, var47, arg2);
                    }
                    if (class94.field1655 >= var45) {
                        int[] var52 = class15.field220[var45];
                        class141.method987(2, var48, var52, var50, arg2);
                        class141.method987(2, var50, var52, var49, arg6);
                        class141.method987(2, var49, var52, var47, arg2);
                    }
                } else {
                    if (class224.field3940 <= var46) {
                        class141.method987(2, var48, class15.field220[var46], var47, arg2);
                    }
                    if (var45 <= class94.field1655) {
                        class141.method987(2, var48, class15.field220[var45], var47, arg2);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lfb;B)V")
    public static final void method620(class29 arg0, byte arg1) {
        class51 var2 = null;
        field1521++;
        try {
            if (arg1 != 88) {
                field1511 = null;
            }
            class187 var3 = arg0.method167("runescape", true);
            while (var3.field3358 == 0) {
                class151.method1074(-108, 1L);
            }
            if (var3.field3358 == 1) {
                var2 = (class51) var3.field3357;
                class74 var4 = class17.method100(-6);
                var2.method337(var4.field1340, var4.field1321, 0, (byte) 127);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method336(arg1 - 89);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BIIII)V")
    public static final void method621(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 0;
        field1523++;
        int var6 = arg2;
        int var7 = -arg2;
        if (arg0 < 58) {
            field1520 = null;
        }
        int var8 = class47.method303(arg2 + arg3, class192.field3449, class257.field4496, 65535);
        int var9 = -1;
        int var10 = class47.method303(arg3 - arg2, class192.field3449, class257.field4496, 65535);
        class141.method987(2, var10, class15.field220[arg1], var8, arg4);
        while (var6 > var5) {
            var9 += 2;
            var7 += var9;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg1 + var6;
                int var12 = arg1 - var6;
                if (var11 >= class224.field3940 && var12 <= class94.field1655) {
                    int var13 = class47.method303(arg3 + var5, class192.field3449, class257.field4496, 65535);
                    int var14 = class47.method303(arg3 - var5, class192.field3449, class257.field4496, 65535);
                    if (var11 <= class94.field1655) {
                        class141.method987(2, var14, class15.field220[var11], var13, arg4);
                    }
                    if (class224.field3940 <= var12) {
                        class141.method987(2, var14, class15.field220[var12], var13, arg4);
                    }
                }
            }
            var5++;
            int var15 = arg1 - var5;
            int var16 = arg1 + var5;
            if (class224.field3940 <= var16 && class94.field1655 >= var15) {
                int var17 = class47.method303(arg3 + var6, class192.field3449, class257.field4496, 65535);
                int var18 = class47.method303(arg3 - var6, class192.field3449, class257.field4496, 65535);
                if (class94.field1655 >= var16) {
                    class141.method987(2, var18, class15.field220[var16], var17, arg4);
                }
                if (var15 >= class224.field3940) {
                    class141.method987(2, var18, class15.field220[var15], var17, arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(I)V")
    public static final void method622(int arg0) {
        int var1 = 67 % ((33 - arg0) / 42);
        field1518++;
        class127.field2234.method1291(0);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILid;)V")
    public static final void method623(int arg0, class149 arg1) {
        field1510++;
        int var2 = class193.method1309(arg1, (byte) 119);
        if (var2 != -1) {
            class101.method721(-5402, class168.field3120.field4969[var2], class168.field3120.field4970[var2]);
            if (arg0 <= 102) {
                field1519 = null;
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lig;)V")
    public class83(class9 arg0) {
        this.field1526 = arg0;
    }
}
