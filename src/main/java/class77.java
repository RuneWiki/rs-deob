import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public abstract class class77 {

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "Lob;")
    public static class141 field1565 = class175.method1195(40, "leuchten3:");

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "Lob;")
    public static class141 field1570 = class175.method1195(40, "<col=ffff00>");

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "Lob;")
    public static class141 field1571 = class175.method1195(40, "<col=00ffff>");

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "Lpe;")
    public static class154 field1566;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "Lca;")
    public static class22 field1564;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)I")
    public abstract int method413(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method535(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1569++;
        int var8 = 0;
        int var9 = arg1;
        int var10 = arg3 - arg5;
        int var11 = arg1 - arg5;
        int var12 = var10 * var10;
        if (arg2 != -97) {
            return;
        }
        int var13 = arg3 * arg3;
        int var14 = 0;
        int var15 = var11 * var11;
        int var16 = var13 << 1;
        int var17 = arg1 * arg1;
        int var18 = var17 << 1;
        int var19 = arg1 << 1;
        int var20 = var17 - (var19 - 1) * var16;
        int var21 = var15 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var19) * var13 + var18;
        int var24 = var11 << 1;
        int var25 = var15 - (var24 - 1) * var22;
        int var26 = var13 << 2;
        int var27 = var17 << 2;
        int var28 = var12 << 2;
        int var29 = (1 - var24) * var12 + var21;
        int var30 = var15 << 2;
        int var31 = var18 * 3;
        int var32 = (var24 - 3) * var22;
        int var33 = var21 * 3;
        int var34 = (var19 - 3) * var16;
        int var35 = (arg1 - 1) * var26;
        int var36 = var30;
        int var37 = var27;
        if (class35.field698 <= arg6 && arg6 <= class130.field2470) {
            int[] var38 = class41.field805[arg6];
            int var39 = class106.method703(class68.field1323, class136.field2590, true, arg4 - arg3);
            int var40 = class106.method703(class68.field1323, class136.field2590, true, arg3 + arg4);
            int var41 = class106.method703(class68.field1323, class136.field2590, true, arg4 - var10);
            int var42 = class106.method703(class68.field1323, class136.field2590, true, arg4 + var10);
            class180.method1217(var41, (byte) 52, var39, arg7, var38);
            class180.method1217(var42, (byte) 52, var41, arg0, var38);
            class180.method1217(var40, (byte) 52, var42, arg7, var38);
        }
        int var43 = (var11 - 1) * var28;
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var8++;
                    var23 += var31;
                    var31 += var27;
                    var20 += var37;
                    var37 += var27;
                }
            }
            if (var20 < 0) {
                var23 += var31;
                var20 += var37;
                var37 += var27;
                var8++;
                var31 += var27;
            }
            var23 += -var35;
            boolean var44 = var9 <= var11;
            var35 -= var26;
            var9--;
            int var45 = arg6 + var9;
            if (var44) {
                if (var29 < 0) {
                    while (var29 < 0) {
                        var14++;
                        var29 += var33;
                        var25 += var36;
                        var33 += var30;
                        var36 += var30;
                    }
                }
                if (var25 < 0) {
                    var14++;
                    var25 += var36;
                    var36 += var30;
                    var29 += var33;
                    var33 += var30;
                }
                var25 += -var32;
                var32 -= var28;
                var29 += -var43;
                var43 -= var28;
            }
            var20 += -var34;
            var34 -= var26;
            int var46 = arg6 - var9;
            if (class35.field698 <= var45 && var46 <= class130.field2470) {
                int var47 = class106.method703(class68.field1323, class136.field2590, true, arg4 + var8);
                int var48 = class106.method703(class68.field1323, class136.field2590, true, arg4 - var8);
                if (var44) {
                    int var49 = class106.method703(class68.field1323, class136.field2590, true, arg4 + var14);
                    int var50 = class106.method703(class68.field1323, class136.field2590, true, arg4 - var14);
                    if (class35.field698 <= var46) {
                        int[] var51 = class41.field805[var46];
                        class180.method1217(var50, (byte) 52, var48, arg7, var51);
                        class180.method1217(var49, (byte) 52, var50, arg0, var51);
                        class180.method1217(var47, (byte) 52, var49, arg7, var51);
                    }
                    if (class130.field2470 >= var45) {
                        int[] var52 = class41.field805[var45];
                        class180.method1217(var50, (byte) 52, var48, arg7, var52);
                        class180.method1217(var49, (byte) 52, var50, arg0, var52);
                        class180.method1217(var47, (byte) 52, var49, arg7, var52);
                    }
                } else {
                    if (class35.field698 <= var46) {
                        class180.method1217(var47, (byte) 52, var48, arg7, class41.field805[var46]);
                    }
                    if (var45 <= class130.field2470) {
                        class180.method1217(var47, (byte) 52, var48, arg7, class41.field805[var45]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V")
    public abstract void method415(byte arg0);

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)V")
    public static final void method536(byte arg0) {
        field1568++;
        class156.field3014.method35((byte) -107);
        int var1 = class156.field3014.method34(1, 11339);
        if (var1 == 0) {
            return;
        }
        int var2 = class156.field3014.method34(2, 11339);
        if (var2 == 0) {
            class125.field2416[class165.field3199++] = 2047;
        } else if (arg0 >= 97) {
            if (var2 == 1) {
                int var3 = class156.field3014.method34(3, 11339);
                class114.field2176.method1348(true, var3, false);
                int var4 = class156.field3014.method34(1, 11339);
                if (var4 == 1) {
                    class125.field2416[class165.field3199++] = 2047;
                }
            } else if (var2 == 2) {
                int var5 = class156.field3014.method34(3, 11339);
                class114.field2176.method1348(true, var5, true);
                int var6 = class156.field3014.method34(3, 11339);
                class114.field2176.method1348(true, var6, true);
                int var7 = class156.field3014.method34(1, 11339);
                if (var7 == 1) {
                    class125.field2416[class165.field3199++] = 2047;
                }
            } else if (var2 == 3) {
                int var8 = class156.field3014.method34(1, 11339);
                class66.field1287 = class156.field3014.method34(2, 11339);
                int var9 = class156.field3014.method34(7, 11339);
                int var10 = class156.field3014.method34(1, 11339);
                if (var10 == 1) {
                    class125.field2416[class165.field3199++] = 2047;
                }
                int var11 = class156.field3014.method34(7, 11339);
                class114.field2176.method1344(var11, var9, -1, ~var8 == -2);
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(B)V")
    public static void method537(byte arg0) {
        field1565 = null;
        field1570 = null;
        field1566 = null;
        if (arg0 <= 93) {
            field1564 = null;
        }
        field1571 = null;
        field1564 = null;
    }
}
