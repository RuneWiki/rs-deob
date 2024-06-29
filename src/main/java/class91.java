import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class91 extends class202 {

    @OriginalMember(owner = "client!rh", name = "R", descriptor = "Z")
    public boolean field1592 = false;

    @OriginalMember(owner = "client!rh", name = "Z", descriptor = "Lpa;")
    private class126 field1599;

    @OriginalMember(owner = "client!rh", name = "Y", descriptor = "Z")
    private boolean field1598;

    @OriginalMember(owner = "client!rh", name = "db", descriptor = "Z")
    private boolean field1603;

    @OriginalMember(owner = "client!rh", name = "V", descriptor = "I")
    private int field1595;

    @OriginalMember(owner = "client!rh", name = "eb", descriptor = "I")
    private int field1604;

    @OriginalMember(owner = "client!rh", name = "T", descriptor = "Z")
    public static boolean field1593 = true;

    @OriginalMember(owner = "client!rh", name = "W", descriptor = "Lsb;")
    public static class98 field1596 = class47.method368("; version=1; path=)4; domain=", 0);

    @OriginalMember(owner = "client!rh", name = "gb", descriptor = "Lgj;")
    public static class226 field1606 = new class226(64);

    @OriginalMember(owner = "client!rh", name = "jb", descriptor = "Lsb;")
    public static class98 field1609 = null;

    @OriginalMember(owner = "client!rh", name = "hb", descriptor = "F")
    private float field1607;

    @OriginalMember(owner = "client!rh", name = "N", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!rh", name = "O", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!rh", name = "P", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!rh", name = "U", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!rh", name = "X", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!rh", name = "bb", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!rh", name = "cb", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!rh", name = "fb", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!rh", name = "ab", descriptor = "[I")
    private int[] field1600;

    @OriginalMember(owner = "client!rh", name = "ib", descriptor = "[[[B")
    public static byte[][][] field1608;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZI)V")
    public final void method666(boolean arg0, int arg1) {
        field1589++;
        if (this.field1600 == null) {
            return;
        }
        if (arg0) {
            this.method667(60, (class57) null, false, (class75) null);
        }
        if (this.field1604 == 0 && this.field1595 == 0) {
            return;
        }
        int var3 = this.field1595 * arg1;
        if (class52.field840 == null || this.field1600.length > class52.field840.length) {
            class52.field840 = new int[this.field1600.length];
        }
        int var4 = this.field1600.length;
        int var5 = this.field1600.length == 4096 ? 64 : 128;
        int var6 = var5 - 1;
        int var7 = this.field1604 * var5 * arg1;
        int var8 = var4 - 1;
        for (int var9 = 0; var9 < var4; var9 += var5) {
            int var11 = var8 & var7 + var9;
            for (int var12 = 0; var12 < var5; var12++) {
                int var13 = var9 + var12;
                int var14 = (var3 + var12 & var6) + var11;
                class52.field840[var13] = this.field1600[var14];
            }
        }
        int[] var10 = this.field1600;
        this.field1600 = class52.field840;
        class52.field840 = var10;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILc;ZLtg;)[I")
    public final int[] method667(int arg0, class57 arg1, boolean arg2, class75 arg3) {
        field1605++;
        if (!this.field1599.method936(false, arg1, arg3)) {
            return null;
        }
        if (arg0 >= -116) {
            this.method667(53, (class57) null, true, (class75) null);
        }
        int var5 = arg2 ? 64 : 128;
        return this.field1599.method933(arg1, -33, false, this.field1603, var5, arg3, 1.0D, var5);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZFLtg;Lc;B)[I")
    public final int[] method668(boolean arg0, float arg1, class75 arg2, class57 arg3, byte arg4) {
        if (arg4 != -40) {
            return null;
        }
        field1602++;
        if (this.field1600 == null || this.field1607 != arg1) {
            if (!this.field1599.method936(false, arg3, arg2)) {
                return null;
            }
            int var6 = arg0 ? 64 : 128;
            this.field1600 = this.field1599.method933(arg3, -33, true, this.field1603, var6, arg2, (double) arg1, var6);
            this.field1607 = arg1;
            if (this.field1598) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6 * var6];
                int var10 = var6;
                int var11 = var6;
                int var12 = var6;
                int var13 = var6 - 1;
                int[] var15 = new int[var6];
                int var16 = var6 * var6;
                int var17 = var6 - 1;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var34 = var13; var34 >= 0; var34--) {
                        var11--;
                        int var35 = this.field1600[var11];
                        var7[var34] += class214.method1427(var35 >> 16, 255);
                        var15[var34] += class214.method1427(var35, 65481) >> 8;
                        var8[var34] += class214.method1427(255, var35);
                    }
                    if (var11 == 0) {
                        var11 = var16;
                    }
                }
                int var19 = var16;
                for (int var20 = var17; var20 >= 0; var20--) {
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int var24 = 1;
                    int var25 = 1;
                    for (int var26 = 2; var26 >= 0; var26--) {
                        var25--;
                        var21 += var15[var25];
                        var22 += var8[var25];
                        var23 += var7[var25];
                        if (var25 == 0) {
                            var25 = var10;
                        }
                    }
                    for (int var27 = var13; var27 >= 0; var27--) {
                        var25--;
                        int var31 = var21 / 9;
                        int var32 = var23 / 9;
                        var24--;
                        int var33 = var22 / 9;
                        var19--;
                        var9[var19] = class67.method471(class67.method471(var32 << 16, var31 << 8), var33);
                        var21 += var15[var25] - var15[var24];
                        var22 += var8[var25] - var8[var24];
                        var23 += var7[var25] - var7[var24];
                        if (var25 == 0) {
                            var25 = var10;
                        }
                        if (var24 == 0) {
                            var24 = var10;
                        }
                    }
                    for (int var28 = var13; var28 >= 0; var28--) {
                        var12--;
                        int var29 = this.field1600[var12];
                        var11--;
                        int var30 = this.field1600[var11];
                        var7[var28] += (class214.method1427(var30, 16726128) >> 16) - class214.method1427(var29 >> 16, 255);
                        var15[var28] += (class214.method1427(65464, var30) >> 8) - (class214.method1427(var29, 65405) >> 8);
                        var8[var28] += class214.method1427(255, var30) - class214.method1427(255, var29);
                    }
                    if (var12 == 0) {
                        var12 = var16;
                    }
                    if (var11 == 0) {
                        var11 = var16;
                    }
                }
                this.field1600 = var9;
            }
        }
        return this.field1600;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IILq;IB)V")
    public static final void method669(int arg0, int arg1, class148 arg2, int arg3, byte arg4) {
        field1590++;
        if (arg4 >= -81) {
            method672(112, -7, -102, -32);
        }
        class115.method867(47);
        class128.method964(arg0, arg3, arg2.field2694 + arg0, arg2.field2647 + arg3);
        if (class124.field2250 == 2 || class124.field2250 == 5 || class132.field2352 == null) {
            class128.method955(arg0, arg3, 0, arg2.field2638, arg2.field2713);
        } else {
            int var5 = class243.field4219 + class135.field2396 & 0x7FF;
            int var6 = 464 - (class163.field2943.field4466 / 32);
            int var7 = class163.field2943.field4492 / 32 + 48;
            ((class247) class132.field2352).method1239(arg0, arg3, arg2.field2694, arg2.field2647, var7, var6, var5, class146.field2557 + 256, arg2.field2638, arg2.field2713);
            if (class26.field510 != null) {
                for (int var8 = 0; var8 < class26.field510.field4409; var8++) {
                    if (class26.field510.method1745((byte) -96, var8)) {
                        int var9 = (class26.field510.field4412[var8] - class189.field3277) * 4 + 2 - (class163.field2943.field4492 / 32);
                        int var10 = class160.field2893[var5];
                        int var11 = var10 * 256 / (class146.field2557 + 256);
                        int var12 = class160.field2890[var5];
                        int var13 = var12 * 256 / (class146.field2557 + 256);
                        int var14 = (class26.field510.field4403[var8] - class182.field3143) * 4 + 2 - (class163.field2943.field4466 / 32);
                        int var15 = var9 * var13 + var11 * var14 >> 16;
                        int var16 = var13 * var14 - (var9 * var11) >> 16;
                        class73 var17 = class134.field2369;
                        if (class26.field510.method1743(var8, (byte) 100) == 1) {
                            var17 = class23.field471;
                        }
                        if (class26.field510.method1743(var8, (byte) 25) == 2) {
                            var17 = class90.field1581;
                        }
                        int var18 = var17.method525(class26.field510.field4413[var8], 100);
                        int var19 = var15 - var18 / 2;
                        if (-arg2.field2694 <= var19 && arg2.field2694 >= var19 && var16 >= -arg2.field2647 && arg2.field2647 >= var16) {
                            int var20 = 16777215;
                            if (class26.field510.field4405[var8] != -1) {
                                var20 = class26.field510.field4405[var8];
                            }
                            class128.method960(arg2.field2638, arg2.field2713);
                            var17.method523(class26.field510.field4413[var8], arg2.field2694 / 2 + var19 + arg0, arg2.field2647 / 2 + -var16 + arg3, var18, 50, var20, 0, 256, 1, 0, 0);
                            class128.method970();
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class151.field2781; var21++) {
                int var54 = class82.field1446[var21] * 4 + 2 - (class163.field2943.field4492 / 32);
                int var55 = class11.field228[var21] * 4 + 2 - (class163.field2943.field4466 / 32);
                class21 var56 = class125.method929(class76.field1348[var21], (byte) -72);
                if (var56.field393 != null) {
                    var56 = var56.method236(0);
                    if (var56 == null || var56.field427 == -1) {
                        continue;
                    }
                }
                class254.method1758(var54, arg0, arg3, class235.field4068[var56.field427], arg2, var55, (byte) -56);
            }
            for (int var22 = 0; var22 < 104; var22++) {
                for (int var50 = 0; var50 < 104; var50++) {
                    class48 var51 = class115.field2050[class265.field4640][var22][var50];
                    if (var51 != null) {
                        int var52 = var22 * 4 + 2 - (class163.field2943.field4492 / 32);
                        int var53 = var50 * 4 + 2 - class163.field2943.field4466 / 32;
                        class254.method1758(var52, arg0, arg3, class204.field3487[0], arg2, var53, (byte) -56);
                    }
                }
            }
            for (int var23 = 0; var23 < class222.field3837; var23++) {
                class108 var46 = class180.field3109[class87.field1546[var23]];
                if (var46 != null && var46.method823(true)) {
                    class120 var47 = var46.field1928;
                    if (var47 != null && var47.field2189 != null) {
                        var47 = var47.method895(-1);
                    }
                    if (var47 != null && var47.field2175 && var47.field2173) {
                        int var48 = var46.field4492 / 32 - (class163.field2943.field4492 / 32);
                        int var49 = var46.field4466 / 32 - class163.field2943.field4466 / 32;
                        class254.method1758(var48, arg0, arg3, class204.field3487[1], arg2, var49, (byte) -56);
                    }
                }
            }
            for (int var24 = 0; var24 < class97.field1671; var24++) {
                class192 var38 = class141.field2499[class51.field831[var24]];
                if (var38 != null && var38.method823(true)) {
                    int var39 = var38.field4492 / 32 - (class163.field2943.field4492 / 32);
                    int var40 = var38.field4466 / 32 - class163.field2943.field4466 / 32;
                    boolean var41 = false;
                    long var42 = var38.field3323.method727((byte) 36);
                    for (int var44 = 0; var44 < class99.field1751; var44++) {
                        if (class74.field1270[var44] == var42 && class158.field2875[var44] != 0) {
                            var41 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    if (class163.field2943.field3330 != 0 && var38.field3330 != 0 && class163.field2943.field3330 == var38.field3330) {
                        var45 = true;
                    }
                    if (var41) {
                        class254.method1758(var39, arg0, arg3, class204.field3487[3], arg2, var40, (byte) -56);
                    } else if (var45) {
                        class254.method1758(var39, arg0, arg3, class204.field3487[4], arg2, var40, (byte) -56);
                    } else {
                        class254.method1758(var39, arg0, arg3, class204.field3487[2], arg2, var40, (byte) -56);
                    }
                }
            }
            class88[] var25 = class262.field4597;
            for (int var26 = 0; var26 < var25.length; var26++) {
                class88 var29 = var25[var26];
                if (var29 != null && var29.field1559 != 0 && (class236.field4071 % 20) < 10) {
                    if (var29.field1559 == 1 && var29.field1561 >= 0 && var29.field1561 < class180.field3109.length) {
                        class108 var30 = class180.field3109[var29.field1561];
                        if (var30 != null) {
                            int var31 = var30.field4466 / 32 - class163.field2943.field4466 / 32;
                            int var32 = var30.field4492 / 32 - (class163.field2943.field4492 / 32);
                            class183.method1264(var29.field1558, arg3, var32, arg0, var31, arg2, 2);
                        }
                    }
                    if (var29.field1559 == 2) {
                        int var33 = (var29.field1564 - class189.field3277) * 4 + 2 - (class163.field2943.field4492 / 32);
                        int var34 = (var29.field1567 - class182.field3143) * 4 + 2 - (class163.field2943.field4466 / 32);
                        class183.method1264(var29.field1558, arg3, var33, arg0, var34, arg2, 2);
                    }
                    if (var29.field1559 == 10 && var29.field1561 >= 0 && class141.field2499.length > var29.field1561) {
                        class192 var35 = class141.field2499[var29.field1561];
                        if (var35 != null) {
                            int var36 = var35.field4466 / 32 - (class163.field2943.field4466 / 32);
                            int var37 = var35.field4492 / 32 - (class163.field2943.field4492 / 32);
                            class183.method1264(var29.field1558, arg3, var37, arg0, var36, arg2, 2);
                        }
                    }
                }
            }
            if (class250.field4387 != 0) {
                int var27 = class250.field4387 * 4 + 2 - class163.field2943.field4492 / 32;
                int var28 = class95.field1646 * 4 + 2 - class163.field2943.field4466 / 32;
                class254.method1758(var27, arg0, arg3, class262.field4599, arg2, var28, (byte) -56);
            }
            class128.method967(arg0 + (arg2.field2694 / 2) - 1, arg2.field2647 / 2 + (arg3 - 1), 3, 3, 16777215);
        }
        class69.field1105[arg1] = true;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z)V")
    public static void method670(boolean arg0) {
        field1596 = null;
        field1606 = null;
        field1609 = null;
        if (!arg0) {
            field1608 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lc;Ltg;B)Z")
    public final boolean method671(class57 arg0, class75 arg1, byte arg2) {
        if (arg2 < 78) {
            field1609 = null;
        }
        field1591++;
        return this.field1599.method936(false, arg0, arg1);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIII)I")
    public static final int method672(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 0) {
            method672(-4, 125, 21, -105);
        }
        field1601++;
        if ((class138.field2461[arg2][arg0][arg3] & 0x8) == 0) {
            return arg2 <= 0 || (class138.field2461[1][arg0][arg3] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public static final void method673(int arg0) {
        class13.field246.method1554((byte) -109);
        if (arg0 != 26108) {
            field1593 = true;
        }
        field1597++;
    }

    @OriginalMember(owner = "client!rh", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field1594++;
        super.finalize();
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Llj;)V")
    public class91(class216 arg0) {
        this.field1599 = new class126(arg0);
        this.field1598 = arg0.method1446(5350) == 1;
        this.field1603 = arg0.method1446(5350) == 1;
        arg0.method1446(5350);
        arg0.method1446(5350);
        int var2 = arg0.method1446(5350) & 0x3;
        this.field1595 = arg0.method1472(125);
        this.field1604 = arg0.method1472(85);
        arg0.method1446(5350);
        arg0.method1446(5350);
    }
}
