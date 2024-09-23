import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YSXYGZOK")
public class class71 {

    @OriginalMember(owner = "YSXYGZOK", name = "a", descriptor = "LWQTILRQB;")
    private static class68 field1736 = new class68();

    @OriginalMember(owner = "YSXYGZOK", name = "a", descriptor = "([BI[BII)I")
    public static int method553(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        class68 var5 = field1736;
        synchronized (field1736) {
            field1736.field1588 = arg2;
            field1736.field1589 = arg4;
            field1736.field1593 = arg0;
            field1736.field1594 = 0;
            field1736.field1590 = arg3;
            field1736.field1595 = arg1;
            field1736.field1602 = 0;
            field1736.field1601 = 0;
            field1736.field1591 = 0;
            field1736.field1592 = 0;
            field1736.field1596 = 0;
            field1736.field1597 = 0;
            field1736.field1604 = 0;
            method555(field1736);
            int var6 = arg1 - field1736.field1595;
            if (class54.field1301) {
            }
            return var6;
        }
    }

    @OriginalMember(owner = "YSXYGZOK", name = "a", descriptor = "(LWQTILRQB;)V")
    private static void method554(class68 arg0) {
        byte var1 = arg0.field1598;
        int var2 = arg0.field1599;
        int var3 = arg0.field1609;
        int var4 = arg0.field1607;
        int[] var5 = class68.field1612;
        int var6 = arg0.field1606;
        byte[] var7 = arg0.field1593;
        int var8 = arg0.field1594;
        int var9 = arg0.field1595;
        int var10 = var9;
        int var11 = arg0.field1626 + 1;
        label67: while (true) {
            if (var2 > 0) {
                while (true) {
                    if (var9 == 0) {
                        break label67;
                    }
                    if (var2 == 1) {
                        if (var9 == 0) {
                            var2 = 1;
                            break label67;
                        }
                        var7[var8] = var1;
                        var8++;
                        var9--;
                        break;
                    }
                    var7[var8] = var1;
                    var2--;
                    var8++;
                    var9--;
                }
            }
            boolean var12 = true;
            while (var12) {
                var12 = false;
                if (var3 == var11) {
                    var2 = 0;
                    break label67;
                }
                var1 = (byte) var4;
                int var21 = var5[var6];
                byte var22 = (byte) (var21 & 0xFF);
                var6 = var21 >> 8;
                var3++;
                if (var4 != var22) {
                    var4 = var22;
                    if (var9 == 0) {
                        var2 = 1;
                        break label67;
                    }
                    var7[var8] = var1;
                    var8++;
                    var9--;
                    var12 = true;
                } else if (var3 == var11) {
                    if (var9 == 0) {
                        var2 = 1;
                        break label67;
                    }
                    var7[var8] = var1;
                    var8++;
                    var9--;
                    var12 = true;
                }
            }
            var2 = 2;
            int var13 = var5[var6];
            byte var14 = (byte) (var13 & 0xFF);
            var6 = var13 >> 8;
            var3++;
            if (var3 != var11) {
                if (var4 == var14) {
                    var2 = 3;
                    int var15 = var5[var6];
                    byte var16 = (byte) (var15 & 0xFF);
                    var6 = var15 >> 8;
                    var3++;
                    if (var3 != var11) {
                        if (var4 == var16) {
                            int var17 = var5[var6];
                            byte var18 = (byte) (var17 & 0xFF);
                            int var19 = var17 >> 8;
                            var3++;
                            var2 = (var18 & 0xFF) + 4;
                            int var20 = var5[var19];
                            var4 = (byte) (var20 & 0xFF);
                            var6 = var20 >> 8;
                            var3++;
                        } else {
                            var4 = var16;
                        }
                    }
                } else {
                    var4 = var14;
                }
            }
        }
        int var23 = arg0.field1596;
        arg0.field1596 += var10 - var9;
        if (arg0.field1596 < var23) {
            arg0.field1597++;
        }
        arg0.field1598 = var1;
        arg0.field1599 = var2;
        arg0.field1609 = var3;
        arg0.field1607 = var4;
        class68.field1612 = var5;
        arg0.field1606 = var6;
        arg0.field1593 = var7;
        arg0.field1594 = var8;
        arg0.field1595 = var9;
    }

    @OriginalMember(owner = "YSXYGZOK", name = "b", descriptor = "(LWQTILRQB;)V")
    private static void method555(class68 arg0) {
        boolean var1 = false;
        boolean var2 = false;
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        boolean var13 = false;
        boolean var14 = false;
        boolean var15 = false;
        boolean var16 = false;
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        int var20 = 0;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        arg0.field1603 = 1;
        if (class68.field1612 == null) {
            class68.field1612 = new int[arg0.field1603 * 100000];
        }
        boolean var24 = true;
        while (true) {
            while (var24) {
                byte var25 = method556(arg0);
                if (var25 == 23) {
                    return;
                }
                byte var26 = method556(arg0);
                byte var27 = method556(arg0);
                byte var28 = method556(arg0);
                byte var29 = method556(arg0);
                byte var30 = method556(arg0);
                arg0.field1604++;
                byte var31 = method556(arg0);
                byte var32 = method556(arg0);
                byte var33 = method556(arg0);
                byte var34 = method556(arg0);
                byte var35 = method557(arg0);
                if (var35 == 0) {
                    arg0.field1600 = false;
                } else {
                    arg0.field1600 = true;
                }
                if (arg0.field1600) {
                    System.out.println("PANIC! RANDOMISED BLOCK!");
                }
                arg0.field1605 = 0;
                byte var36 = method556(arg0);
                arg0.field1605 = arg0.field1605 << 8 | var36 & 0xFF;
                byte var37 = method556(arg0);
                arg0.field1605 = arg0.field1605 << 8 | var37 & 0xFF;
                byte var38 = method556(arg0);
                arg0.field1605 = arg0.field1605 << 8 | var38 & 0xFF;
                for (int var39 = 0; var39 < 16; var39++) {
                    byte var103 = method557(arg0);
                    if (var103 == 1) {
                        arg0.field1615[var39] = true;
                    } else {
                        arg0.field1615[var39] = false;
                    }
                }
                for (int var40 = 0; var40 < 256; var40++) {
                    arg0.field1614[var40] = false;
                }
                for (int var41 = 0; var41 < 16; var41++) {
                    if (arg0.field1615[var41]) {
                        for (int var101 = 0; var101 < 16; var101++) {
                            byte var102 = method557(arg0);
                            if (var102 == 1) {
                                arg0.field1614[var41 * 16 + var101] = true;
                            }
                        }
                    }
                }
                method559(arg0);
                int var42 = arg0.field1613 + 2;
                int var43 = method558(3, arg0);
                int var44 = method558(15, arg0);
                for (int var45 = 0; var45 < var44; var45++) {
                    int var99 = 0;
                    while (true) {
                        byte var100 = method557(arg0);
                        if (var100 == 0) {
                            arg0.field1620[var45] = (byte) var99;
                            break;
                        }
                        var99++;
                    }
                }
                byte[] var46 = new byte[6];
                byte var47 = 0;
                while (var47 < var43) {
                    var46[var47] = var47++;
                }
                for (int var48 = 0; var48 < var44; var48++) {
                    byte var97 = arg0.field1620[var48];
                    byte var98 = var46[var97];
                    while (var97 > 0) {
                        var46[var97] = var46[var97 - 1];
                        var97--;
                    }
                    var46[0] = var98;
                    arg0.field1619[var48] = var98;
                }
                for (int var49 = 0; var49 < var43; var49++) {
                    int var93 = method558(5, arg0);
                    for (int var94 = 0; var94 < var42; var94++) {
                        while (true) {
                            byte var95 = method557(arg0);
                            if (var95 == 0) {
                                arg0.field1621[var49][var94] = (byte) var93;
                                break;
                            }
                            byte var96 = method557(arg0);
                            if (var96 == 0) {
                                var93++;
                            } else {
                                var93--;
                            }
                        }
                    }
                }
                for (int var50 = 0; var50 < var43; var50++) {
                    byte var90 = 32;
                    byte var91 = 0;
                    for (int var92 = 0; var92 < var42; var92++) {
                        if (arg0.field1621[var50][var92] > var91) {
                            var91 = arg0.field1621[var50][var92];
                        }
                        if (arg0.field1621[var50][var92] < var90) {
                            var90 = arg0.field1621[var50][var92];
                        }
                    }
                    method560(arg0.field1622[var50], arg0.field1623[var50], arg0.field1624[var50], arg0.field1621[var50], var90, var91, var42);
                    arg0.field1625[var50] = var90;
                }
                int var51 = arg0.field1613 + 1;
                int var52 = arg0.field1603 * 100000;
                int var53 = -1;
                byte var54 = 0;
                for (int var55 = 0; var55 <= 255; var55++) {
                    arg0.field1608[var55] = 0;
                }
                int var56 = 4095;
                for (int var57 = 15; var57 >= 0; var57--) {
                    for (int var89 = 15; var89 >= 0; var89--) {
                        arg0.field1617[var56] = (byte) (var57 * 16 + var89);
                        var56--;
                    }
                    arg0.field1618[var57] = var56 + 1;
                }
                int var58 = 0;
                if (var54 == 0) {
                    var53++;
                    var54 = 50;
                    byte var59 = arg0.field1619[var53];
                    var20 = arg0.field1625[var59];
                    var21 = arg0.field1622[var59];
                    var23 = arg0.field1624[var59];
                    var22 = arg0.field1623[var59];
                }
                int var104 = var54 - 1;
                int var60 = var20;
                int var61;
                byte var62;
                for (var61 = method558(var20, arg0); var61 > var21[var60]; var61 = var61 << 1 | var62) {
                    var60++;
                    var62 = method557(arg0);
                }
                int var63 = var23[var61 - var22[var60]];
                while (true) {
                    while (var51 != var63) {
                        if (var63 == 0 || var63 == 1) {
                            int var78 = -1;
                            int var79 = 1;
                            do {
                                if (var63 == 0) {
                                    var78 += var79;
                                } else if (var63 == 1) {
                                    var78 += var79 * 2;
                                }
                                var79 *= 2;
                                if (var104 == 0) {
                                    var53++;
                                    var104 = 50;
                                    byte var80 = arg0.field1619[var53];
                                    var20 = arg0.field1625[var80];
                                    var21 = arg0.field1622[var80];
                                    var23 = arg0.field1624[var80];
                                    var22 = arg0.field1623[var80];
                                }
                                var104--;
                                int var81 = var20;
                                int var82;
                                byte var83;
                                for (var82 = method558(var20, arg0); var82 > var21[var81]; var82 = var82 << 1 | var83) {
                                    var81++;
                                    var83 = method557(arg0);
                                }
                                var63 = var23[var82 - var22[var81]];
                            } while (var63 == 0 || var63 == 1);
                            var78++;
                            byte var84 = arg0.field1616[arg0.field1617[arg0.field1618[0]] & 0xFF];
                            arg0.field1608[var84 & 0xFF] += var78;
                            while (var78 > 0) {
                                class68.field1612[var58] = var84 & 0xFF;
                                var58++;
                                var78--;
                            }
                        } else {
                            int var64 = var63 - 1;
                            byte var66;
                            if (var64 < 16) {
                                int var65 = arg0.field1618[0];
                                var66 = arg0.field1617[var64 + var65];
                                while (var64 > 3) {
                                    int var67 = var64 + var65;
                                    arg0.field1617[var67] = arg0.field1617[var67 - 1];
                                    arg0.field1617[var67 - 1] = arg0.field1617[var67 - 2];
                                    arg0.field1617[var67 - 2] = arg0.field1617[var67 - 3];
                                    arg0.field1617[var67 - 3] = arg0.field1617[var67 - 4];
                                    var64 -= 4;
                                }
                                while (var64 > 0) {
                                    arg0.field1617[var64 + var65] = arg0.field1617[var64 + var65 - 1];
                                    var64--;
                                }
                                arg0.field1617[var65] = var66;
                            } else {
                                int var68 = var64 / 16;
                                int var69 = var64 % 16;
                                int var70 = arg0.field1618[var68] + var69;
                                var66 = arg0.field1617[var70];
                                while (var70 > arg0.field1618[var68]) {
                                    arg0.field1617[var70] = arg0.field1617[var70 - 1];
                                    var70--;
                                }
                                int var10002 = arg0.field1618[var68]++;
                                while (var68 > 0) {
                                    var10002 = arg0.field1618[var68]--;
                                    arg0.field1617[arg0.field1618[var68]] = arg0.field1617[arg0.field1618[var68 - 1] + 16 - 1];
                                    var68--;
                                }
                                var10002 = arg0.field1618[0]--;
                                arg0.field1617[arg0.field1618[0]] = var66;
                                if (arg0.field1618[0] == 0) {
                                    int var71 = 4095;
                                    for (int var72 = 15; var72 >= 0; var72--) {
                                        for (int var73 = 15; var73 >= 0; var73--) {
                                            arg0.field1617[var71] = arg0.field1617[arg0.field1618[var72] + var73];
                                            var71--;
                                        }
                                        arg0.field1618[var72] = var71 + 1;
                                    }
                                }
                            }
                            arg0.field1608[arg0.field1616[var66 & 0xFF] & 0xFF]++;
                            class68.field1612[var58] = arg0.field1616[var66 & 0xFF] & 0xFF;
                            var58++;
                            if (var104 == 0) {
                                var53++;
                                var104 = 50;
                                byte var74 = arg0.field1619[var53];
                                var20 = arg0.field1625[var74];
                                var21 = arg0.field1622[var74];
                                var23 = arg0.field1624[var74];
                                var22 = arg0.field1623[var74];
                            }
                            var104--;
                            int var75 = var20;
                            int var76;
                            byte var77;
                            for (var76 = method558(var20, arg0); var76 > var21[var75]; var76 = var76 << 1 | var77) {
                                var75++;
                                var77 = method557(arg0);
                            }
                            var63 = var23[var76 - var22[var75]];
                        }
                    }
                    arg0.field1599 = 0;
                    arg0.field1598 = 0;
                    arg0.field1610[0] = 0;
                    for (int var85 = 1; var85 <= 256; var85++) {
                        arg0.field1610[var85] = arg0.field1608[var85 - 1];
                    }
                    for (int var86 = 1; var86 <= 256; var86++) {
                        arg0.field1610[var86] += arg0.field1610[var86 - 1];
                    }
                    for (int var87 = 0; var87 < var58; var87++) {
                        byte var88 = (byte) (class68.field1612[var87] & 0xFF);
                        class68.field1612[arg0.field1610[var88 & 0xFF]] |= var87 << 8;
                        arg0.field1610[var88 & 0xFF]++;
                    }
                    arg0.field1606 = class68.field1612[arg0.field1605] >> 8;
                    arg0.field1609 = 0;
                    arg0.field1606 = class68.field1612[arg0.field1606];
                    arg0.field1607 = (byte) (arg0.field1606 & 0xFF);
                    arg0.field1606 >>= 0x8;
                    arg0.field1609++;
                    arg0.field1626 = var58;
                    method554(arg0);
                    if (arg0.field1626 + 1 == arg0.field1609 && arg0.field1599 == 0) {
                        var24 = true;
                        break;
                    }
                    var24 = false;
                    break;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "YSXYGZOK", name = "c", descriptor = "(LWQTILRQB;)B")
    private static byte method556(class68 arg0) {
        return (byte) method558(8, arg0);
    }

    @OriginalMember(owner = "YSXYGZOK", name = "d", descriptor = "(LWQTILRQB;)B")
    private static byte method557(class68 arg0) {
        return (byte) method558(1, arg0);
    }

    @OriginalMember(owner = "YSXYGZOK", name = "a", descriptor = "(ILWQTILRQB;)I")
    private static int method558(int arg0, class68 arg1) {
        while (arg1.field1602 < arg0) {
            arg1.field1601 = arg1.field1601 << 8 | arg1.field1588[arg1.field1589] & 0xFF;
            arg1.field1602 += 8;
            arg1.field1589++;
            arg1.field1590--;
            arg1.field1591++;
            if (arg1.field1591 == 0) {
                arg1.field1592++;
            }
        }
        int var2 = arg1.field1601 >> arg1.field1602 - arg0 & (0x1 << arg0) - 1;
        arg1.field1602 -= arg0;
        return var2;
    }

    @OriginalMember(owner = "YSXYGZOK", name = "e", descriptor = "(LWQTILRQB;)V")
    private static void method559(class68 arg0) {
        arg0.field1613 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            if (arg0.field1614[var1]) {
                arg0.field1616[arg0.field1613] = (byte) var1;
                arg0.field1613++;
            }
        }
    }

    @OriginalMember(owner = "YSXYGZOK", name = "a", descriptor = "([I[I[I[BIII)V")
    private static void method560(int[] arg0, int[] arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        int var7 = 0;
        for (int var8 = arg4; var8 <= arg5; var8++) {
            for (int var17 = 0; var17 < arg6; var17++) {
                if (arg3[var17] == var8) {
                    arg2[var7] = var17;
                    var7++;
                }
            }
        }
        for (int var9 = 0; var9 < 23; var9++) {
            arg1[var9] = 0;
        }
        for (int var10 = 0; var10 < arg6; var10++) {
            arg1[arg3[var10] + 1]++;
        }
        for (int var11 = 1; var11 < 23; var11++) {
            arg1[var11] += arg1[var11 - 1];
        }
        for (int var12 = 0; var12 < 23; var12++) {
            arg0[var12] = 0;
        }
        int var13 = 0;
        for (int var14 = arg4; var14 <= arg5; var14++) {
            int var16 = arg1[var14 + 1] + var13 - arg1[var14];
            arg0[var14] = var16 - 1;
            var13 = var16 << 1;
        }
        for (int var15 = arg4 + 1; var15 <= arg5; var15++) {
            arg1[var15] = (arg0[var15 - 1] + 1 << 1) - arg1[var15];
        }
    }
}
