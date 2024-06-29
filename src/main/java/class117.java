import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class117 extends class326 {

    @OriginalMember(owner = "client!kg", name = "U", descriptor = "I")
    private int field1631 = -1;

    @OriginalMember(owner = "client!kg", name = "W", descriptor = "I")
    public static int field1633 = 0;

    @OriginalMember(owner = "client!kg", name = "V", descriptor = "I")
    public static int field1632 = 5063219;

    @OriginalMember(owner = "client!kg", name = "S", descriptor = "F")
    public static float field1629;

    @OriginalMember(owner = "client!kg", name = "L", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!kg", name = "M", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!kg", name = "N", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!kg", name = "O", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!kg", name = "P", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!kg", name = "Q", descriptor = "I")
    public int field1627;

    @OriginalMember(owner = "client!kg", name = "R", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!kg", name = "T", descriptor = "I")
    public int field1630;

    @OriginalMember(owner = "client!kg", name = "X", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!kg", name = "Y", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!kg", name = "Z", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!kg", name = "bb", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!kg", name = "ab", descriptor = "Luj;")
    public static class169 field1637;

    @OriginalMember(owner = "client!kg", name = "I", descriptor = "[I")
    public static int[] field1620;

    @OriginalMember(owner = "client!kg", name = "J", descriptor = "[I")
    public int[] field1621;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)I", line = 4)
    public final int method825(byte arg0) {
        field1623++;
        if (arg0 < 56) {
            this.method834(-85);
        }
        return this.field1631;
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(III)Lv;", line = 16)
    public static final class263 method826(int arg0, int arg1, int arg2) {
        class124 var3 = class83.field1138[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field1798; var4++) {
            class263 var5 = var3.field1783[var4];
            if ((var5.field4122 >> 29 & 0x3L) == 2L && var5.field4124 == arg1 && var5.field4127 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V", line = 39)
    public class117() {
        super(0, false);
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(B)V", line = 45)
    public final void method350(byte arg0) {
        super.method350(arg0);
        field1634++;
        this.field1621 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lsm;Z)V", line = 54)
    public static final void method827(class124 arg0, boolean arg1) {
        class98.field1286.method19(arg0, -1058);
        while (true) {
            class124 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class124[][] var7;
            class124 var78;
            do {
                class124 var77;
                do {
                    class124 var76;
                    do {
                        class124 var75;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class124) class98.field1286.method24(0);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field1792);
                                            var3 = var2.field1776;
                                            var4 = var2.field1793;
                                            var5 = var2.field1777;
                                            var6 = var2.field1796;
                                            var7 = class83.field1138[var5];
                                            float var8 = 0.0F;
                                            if (class109.field1458) {
                                                if (class187.field3013 == class172.field2843) {
                                                    int var9 = class193.field3070[var3][var4];
                                                    int var10 = var9 & 0xFFFFFF;
                                                    if (class52.field659 != var10) {
                                                        class52.field659 = var10;
                                                        class174.method1286(var10, (byte) -104);
                                                        class115.method815(class25.method241(22985));
                                                    }
                                                    int var11 = var9 >>> 24 << 3;
                                                    if (class284.field4401 != var11) {
                                                        class284.field4401 = var11;
                                                        class197.method1460(-90, var11);
                                                    }
                                                    int var12 = class18.field294[0][var3 + 1][var4] + class18.field294[0][var3][var4] + class18.field294[0][var3][var4 + 1] + class18.field294[0][var3 + 1][var4 + 1] >> 2;
                                                    class256.method1855(3, 103, -var12);
                                                    var8 = 201.5F;
                                                    class109.method745(var8);
                                                } else {
                                                    var8 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                    class109.method745(var8);
                                                }
                                            }
                                            if (!var2.field1785) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class124 var13 = class83.field1138[var5 - 1][var3][var4];
                                                    if (var13 != null && var13.field1792) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class147.field2318 && var3 > class48.field632) {
                                                    class124 var14 = var7[var3 - 1][var4];
                                                    if (var14 != null && var14.field1792 && (var14.field1785 || (var2.field1791 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class147.field2318 && var3 < class52.field661 - 1) {
                                                    class124 var15 = var7[var3 + 1][var4];
                                                    if (var15 != null && var15.field1792 && (var15.field1785 || (var2.field1791 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class238.field3730 && var4 > class206.field3272) {
                                                    class124 var16 = var7[var3][var4 - 1];
                                                    if (var16 != null && var16.field1792 && (var16.field1785 || (var2.field1791 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class238.field3730 && var4 < class294.field4563 - 1) {
                                                    class124 var17 = var7[var3][var4 + 1];
                                                    if (var17 != null && var17.field1792 && (var17.field1785 || (var2.field1791 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field1785 = false;
                                            if (var2.field1782 != null) {
                                                class124 var18 = var2.field1782;
                                                if (class109.field1458) {
                                                    class109.method745(201.5F - (float) (var18.field1796 + 1) * 50.0F);
                                                }
                                                if (var18.field1774 == null) {
                                                    if (var18.field1787 != null) {
                                                        if (class307.method2124(0, var3, var4)) {
                                                            class11.method133(var18.field1787, class102.field1360, class199.field3176, class60.field888, class57.field798, var3, var4, true);
                                                        } else {
                                                            class11.method133(var18.field1787, class102.field1360, class199.field3176, class60.field888, class57.field798, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class307.method2124(0, var3, var4)) {
                                                    class278.method1956(var18.field1774, 0, class102.field1360, class199.field3176, class60.field888, class57.field798, var3, var4, true);
                                                } else {
                                                    class278.method1956(var18.field1774, 0, class102.field1360, class199.field3176, class60.field888, class57.field798, var3, var4, false);
                                                }
                                                class102 var19 = var18.field1775;
                                                if (var19 != null) {
                                                    if (class109.field1458) {
                                                        if ((var19.field1366 & var2.field1780) == 0) {
                                                            class176.method1311(class261.field4103, class311.field4849, class206.field3276, var5, var3, var4);
                                                        } else {
                                                            class176.method1303(var19.field1366, class261.field4103, class311.field4849, class206.field3276, var6, var3, var4);
                                                        }
                                                    }
                                                    var19.field1362.method410(0, class102.field1360, class199.field3176, class60.field888, class57.field798, var19.field1363 - class261.field4103, var19.field1359 - class311.field4849, var19.field1356 - class206.field3276, var19.field1364, var5, (class151) null);
                                                }
                                                for (int var20 = 0; var20 < var18.field1798; var20++) {
                                                    class263 var21 = var18.field1783[var20];
                                                    if (var21 != null) {
                                                        if (class109.field1458) {
                                                            class176.method1311(class261.field4103, class311.field4849, class206.field3276, var5, var3, var4);
                                                        }
                                                        var21.field4118.method410(var21.field4123, class102.field1360, class199.field3176, class60.field888, class57.field798, var21.field4130 - class261.field4103, var21.field4116 - class311.field4849, var21.field4125 - class206.field3276, var21.field4122, var5, (class151) null);
                                                    }
                                                }
                                                if (class109.field1458) {
                                                    class109.method745(var8);
                                                }
                                            }
                                            boolean var22 = false;
                                            if (var2.field1774 == null) {
                                                if (var2.field1787 != null) {
                                                    if (class307.method2124(var6, var3, var4)) {
                                                        class11.method133(var2.field1787, class102.field1360, class199.field3176, class60.field888, class57.field798, var3, var4, true);
                                                    } else {
                                                        var22 = true;
                                                        class11.method133(var2.field1787, class102.field1360, class199.field3176, class60.field888, class57.field798, var3, var4, false);
                                                    }
                                                }
                                            } else if (class307.method2124(var6, var3, var4)) {
                                                class278.method1956(var2.field1774, var6, class102.field1360, class199.field3176, class60.field888, class57.field798, var3, var4, true);
                                            } else {
                                                var22 = true;
                                                if (var2.field1774.field2368 != 12345678 || class181.field2938 && var5 <= class270.field4192) {
                                                    class278.method1956(var2.field1774, var6, class102.field1360, class199.field3176, class60.field888, class57.field798, var3, var4, false);
                                                }
                                            }
                                            if (var22) {
                                                class138 var23 = var2.field1788;
                                                if (var23 != null && (var23.field2200 & 0x80000000L) != 0L) {
                                                    if (class109.field1458 && var23.field2198) {
                                                        class109.method745(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class109.field1458) {
                                                        class176.method1311(class261.field4103, class311.field4849, class206.field3276, var5, var3, var4);
                                                    }
                                                    var23.field2205.method410(0, class102.field1360, class199.field3176, class60.field888, class57.field798, var23.field2202 - class261.field4103, var23.field2207 - class311.field4849, var23.field2201 - class206.field3276, var23.field2200, var5, (class151) null);
                                                    if (class109.field1458 && var23.field2198) {
                                                        class109.method745(var8);
                                                    }
                                                }
                                            }
                                            int var24 = 0;
                                            int var25 = 0;
                                            class102 var26 = var2.field1775;
                                            class283 var27 = var2.field1779;
                                            if (var26 != null || var27 != null) {
                                                if (class147.field2318 == var3) {
                                                    var24++;
                                                } else if (class147.field2318 < var3) {
                                                    var24 += 2;
                                                }
                                                if (class238.field3730 == var4) {
                                                    var24 += 3;
                                                } else if (class238.field3730 > var4) {
                                                    var24 += 6;
                                                }
                                                var25 = class281.field4347[var24];
                                                var2.field1780 = class254.field4015[var24];
                                            }
                                            if (var26 != null) {
                                                if ((var26.field1366 & class259.field4080[var24]) == 0) {
                                                    var2.field1781 = 0;
                                                } else if (var26.field1366 == 16) {
                                                    var2.field1781 = 3;
                                                    var2.field1795 = class259.field4075[var24];
                                                    var2.field1794 = 3 - var2.field1795;
                                                } else if (var26.field1366 == 32) {
                                                    var2.field1781 = 6;
                                                    var2.field1795 = class216.field3401[var24];
                                                    var2.field1794 = 6 - var2.field1795;
                                                } else if (var26.field1366 == 64) {
                                                    var2.field1781 = 12;
                                                    var2.field1795 = class25.field380[var24];
                                                    var2.field1794 = 12 - var2.field1795;
                                                } else {
                                                    var2.field1781 = 9;
                                                    var2.field1795 = class136.field2055[var24];
                                                    var2.field1794 = 9 - var2.field1795;
                                                }
                                                if ((var26.field1366 & var25) != 0 && !class291.method2033(var6, var3, var4, var26.field1366)) {
                                                    if (class109.field1458) {
                                                        class176.method1311(class261.field4103, class311.field4849, class206.field3276, var5, var3, var4);
                                                    }
                                                    var26.field1362.method410(0, class102.field1360, class199.field3176, class60.field888, class57.field798, var26.field1363 - class261.field4103, var26.field1359 - class311.field4849, var26.field1356 - class206.field3276, var26.field1364, var5, (class151) null);
                                                }
                                                if ((var26.field1358 & var25) != 0 && !class291.method2033(var6, var3, var4, var26.field1358)) {
                                                    if (class109.field1458) {
                                                        class176.method1311(class261.field4103, class311.field4849, class206.field3276, var5, var3, var4);
                                                    }
                                                    var26.field1365.method410(0, class102.field1360, class199.field3176, class60.field888, class57.field798, var26.field1363 - class261.field4103, var26.field1359 - class311.field4849, var26.field1356 - class206.field3276, var26.field1364, var5, (class151) null);
                                                }
                                            }
                                            if (var27 != null && !class271.method1914(var6, var3, var4, var27.field4382.method397())) {
                                                if (class109.field1458) {
                                                    class109.method745(var8 - 0.5F);
                                                }
                                                if ((var27.field4377 & var25) != 0) {
                                                    if (class109.field1458) {
                                                        class176.method1311(class261.field4103, class311.field4849, class206.field3276, var5, var3, var4);
                                                    }
                                                    var27.field4382.method410(0, class102.field1360, class199.field3176, class60.field888, class57.field798, var27.field4375 + var27.field4370 - class261.field4103, var27.field4374 - class311.field4849, var27.field4371 + var27.field4378 - class206.field3276, var27.field4373, var5, (class151) null);
                                                } else if (var27.field4377 == 256) {
                                                    int var28 = var27.field4375 - class261.field4103;
                                                    int var29 = var27.field4374 - class311.field4849;
                                                    int var30 = var27.field4371 - class206.field3276;
                                                    int var31 = var27.field4381;
                                                    int var32;
                                                    if (var31 == 1 || var31 == 2) {
                                                        var32 = -var28;
                                                    } else {
                                                        var32 = var28;
                                                    }
                                                    int var33;
                                                    if (var31 == 2 || var31 == 3) {
                                                        var33 = -var30;
                                                    } else {
                                                        var33 = var30;
                                                    }
                                                    if (var33 < var32) {
                                                        if (class109.field1458) {
                                                            class176.method1311(class261.field4103, class311.field4849, class206.field3276, var5, var3, var4);
                                                        }
                                                        var27.field4382.method410(0, class102.field1360, class199.field3176, class60.field888, class57.field798, var27.field4370 + var28, var29, var27.field4378 + var30, var27.field4373, var5, (class151) null);
                                                    } else if (var27.field4384 != null) {
                                                        if (class109.field1458) {
                                                            class176.method1311(class261.field4103, class311.field4849, class206.field3276, var5, var3, var4);
                                                        }
                                                        var27.field4384.method410(0, class102.field1360, class199.field3176, class60.field888, class57.field798, var28, var29, var30, var27.field4373, var5, (class151) null);
                                                    }
                                                }
                                                if (class109.field1458) {
                                                    class109.method745(var8);
                                                }
                                            }
                                            if (var22) {
                                                class138 var34 = var2.field1788;
                                                if (var34 != null && (var34.field2200 & 0x80000000L) == 0L) {
                                                    if (class109.field1458 && var34.field2198) {
                                                        class109.method745(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class109.field1458) {
                                                        class176.method1311(class261.field4103, class311.field4849, class206.field3276, var5, var3, var4);
                                                    }
                                                    var34.field2205.method410(0, class102.field1360, class199.field3176, class60.field888, class57.field798, var34.field2202 - class261.field4103, var34.field2207 - class311.field4849, var34.field2201 - class206.field3276, var34.field2200, var5, (class151) null);
                                                    if (class109.field1458 && var34.field2198) {
                                                        class109.method745(var8);
                                                    }
                                                }
                                                class154 var35 = var2.field1789;
                                                if (var35 != null && var35.field2379 == 0) {
                                                    if (class109.field1458) {
                                                        class176.method1311(class261.field4103, class311.field4849, class206.field3276, var5, var3, var4);
                                                    }
                                                    if (var35.field2385 != null) {
                                                        var35.field2385.method410(0, class102.field1360, class199.field3176, class60.field888, class57.field798, var35.field2383 - class261.field4103, var35.field2391 - class311.field4849, var35.field2393 - class206.field3276, var35.field2381, var5, (class151) null);
                                                    }
                                                    if (var35.field2389 != null) {
                                                        var35.field2389.method410(0, class102.field1360, class199.field3176, class60.field888, class57.field798, var35.field2383 - class261.field4103, var35.field2391 - class311.field4849, var35.field2393 - class206.field3276, var35.field2381, var5, (class151) null);
                                                    }
                                                    if (var35.field2386 != null) {
                                                        var35.field2386.method410(0, class102.field1360, class199.field3176, class60.field888, class57.field798, var35.field2383 - class261.field4103, var35.field2391 - class311.field4849, var35.field2393 - class206.field3276, var35.field2381, var5, (class151) null);
                                                    }
                                                }
                                            }
                                            int var36 = var2.field1791;
                                            if (var36 != 0) {
                                                if (var3 < class147.field2318 && (var36 & 0x4) != 0) {
                                                    class124 var37 = var7[var3 + 1][var4];
                                                    if (var37 != null && var37.field1792) {
                                                        class98.field1286.method19(var37, -1058);
                                                    }
                                                }
                                                if (var4 < class238.field3730 && (var36 & 0x2) != 0) {
                                                    class124 var38 = var7[var3][var4 + 1];
                                                    if (var38 != null && var38.field1792) {
                                                        class98.field1286.method19(var38, -1058);
                                                    }
                                                }
                                                if (var3 > class147.field2318 && (var36 & 0x1) != 0) {
                                                    class124 var39 = var7[var3 - 1][var4];
                                                    if (var39 != null && var39.field1792) {
                                                        class98.field1286.method19(var39, -1058);
                                                    }
                                                }
                                                if (var4 > class238.field3730 && (var36 & 0x8) != 0) {
                                                    class124 var40 = var7[var3][var4 - 1];
                                                    if (var40 != null && var40.field1792) {
                                                        class98.field1286.method19(var40, -1058);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field1781 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var2.field1798; var42++) {
                                                if (class234.field3643 != var2.field1783[var42].field4119 && (var2.field1784[var42] & var2.field1781) == var2.field1795) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                class102 var43 = var2.field1775;
                                                if (!class291.method2033(var6, var3, var4, var43.field1366)) {
                                                    if (class109.field1458) {
                                                        label882: {
                                                            if ((var43.field1364 & 0xFC000L) == 16384L) {
                                                                int var44 = var43.field1363 - class261.field4103;
                                                                int var45 = var43.field1356 - class206.field3276;
                                                                int var46 = (int) (var43.field1364 >> 20 & 0x3L);
                                                                if (var46 == 0) {
                                                                    var44 -= 64;
                                                                    var45 += 64;
                                                                    if (var45 < var44 && var3 > 0 && var4 < class308.field4794 - 1) {
                                                                        class176.method1311(class261.field4103, class311.field4849, class206.field3276, var5, var3 - 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 1) {
                                                                    var44 += 64;
                                                                    var45 += 64;
                                                                    if (var45 < -var44 && var3 < class131.field1938 - 1 && var4 < class308.field4794 - 1) {
                                                                        class176.method1311(class261.field4103, class311.field4849, class206.field3276, var5, var3 + 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 2) {
                                                                    var44 += 64;
                                                                    var45 -= 64;
                                                                    if (var45 > var44 && var3 < class131.field1938 - 1 && var4 > 0) {
                                                                        class176.method1311(class261.field4103, class311.field4849, class206.field3276, var5, var3 + 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 3) {
                                                                    var44 -= 64;
                                                                    var45 -= 64;
                                                                    if (var45 > -var44 && var3 > 0 && var4 > 0) {
                                                                        class176.method1311(class261.field4103, class311.field4849, class206.field3276, var5, var3 - 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                }
                                                            }
                                                            class176.method1311(class261.field4103, class311.field4849, class206.field3276, var5, var3, var4);
                                                        }
                                                    }
                                                    var43.field1362.method410(0, class102.field1360, class199.field3176, class60.field888, class57.field798, var43.field1363 - class261.field4103, var43.field1359 - class311.field4849, var43.field1356 - class206.field3276, var43.field1364, var5, (class151) null);
                                                }
                                                var2.field1781 = 0;
                                            }
                                        }
                                        if (!var2.field1778) {
                                            break;
                                        }
                                        try {
                                            int var47 = var2.field1798;
                                            var2.field1778 = false;
                                            int var48 = 0;
                                            label767: for (int var49 = 0; var49 < var47; var49++) {
                                                class263 var50 = var2.field1783[var49];
                                                if (class234.field3643 != var50.field4119) {
                                                    for (int var51 = var50.field4124; var51 <= var50.field4115; var51++) {
                                                        for (int var52 = var50.field4127; var52 <= var50.field4126; var52++) {
                                                            class124 var53 = var7[var51][var52];
                                                            if (var53.field1785) {
                                                                var2.field1778 = true;
                                                                continue label767;
                                                            }
                                                            if (var53.field1781 != 0) {
                                                                int var54 = 0;
                                                                if (var51 > var50.field4124) {
                                                                    var54++;
                                                                }
                                                                if (var51 < var50.field4115) {
                                                                    var54 += 4;
                                                                }
                                                                if (var52 > var50.field4127) {
                                                                    var54 += 8;
                                                                }
                                                                if (var52 < var50.field4126) {
                                                                    var54 += 2;
                                                                }
                                                                if ((var54 & var53.field1781) == var2.field1794) {
                                                                    var2.field1778 = true;
                                                                    continue label767;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class65.field936[var48++] = var50;
                                                    int var55 = class147.field2318 - var50.field4124;
                                                    int var56 = var50.field4115 - class147.field2318;
                                                    if (var56 > var55) {
                                                        var55 = var56;
                                                    }
                                                    int var57 = class238.field3730 - var50.field4127;
                                                    int var58 = var50.field4126 - class238.field3730;
                                                    if (var58 > var57) {
                                                        var50.field4129 = var55 + var58;
                                                    } else {
                                                        var50.field4129 = var55 + var57;
                                                    }
                                                }
                                            }
                                            while (var48 > 0) {
                                                int var59 = -50;
                                                int var60 = -1;
                                                for (int var61 = 0; var61 < var48; var61++) {
                                                    class263 var62 = class65.field936[var61];
                                                    if (class234.field3643 != var62.field4119) {
                                                        if (var62.field4129 > var59) {
                                                            var59 = var62.field4129;
                                                            var60 = var61;
                                                        } else if (var62.field4129 == var59) {
                                                            int var63 = var62.field4130 - class261.field4103;
                                                            int var64 = var62.field4125 - class206.field3276;
                                                            int var65 = class65.field936[var60].field4130 - class261.field4103;
                                                            int var66 = class65.field936[var60].field4125 - class206.field3276;
                                                            if (var63 * var63 + var64 * var64 > var65 * var65 + var66 * var66) {
                                                                var60 = var61;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var60 == -1) {
                                                    break;
                                                }
                                                class263 var67 = class65.field936[var60];
                                                var67.field4119 = class234.field3643;
                                                if (!class119.method853(var6, var67.field4124, var67.field4115, var67.field4127, var67.field4126, var67.field4118.method397())) {
                                                    if (class109.field1458) {
                                                        if ((var67.field4122 & 0xFC000L) == 147456L) {
                                                            class176.method1311(class261.field4103, class311.field4849, class206.field3276, var5, var3, var4);
                                                            int var68 = var67.field4130 - class261.field4103;
                                                            int var69 = var67.field4125 - class206.field3276;
                                                            int var70 = (int) (var67.field4122 >> 20 & 0x3L);
                                                            if (var70 == 1 || var70 == 3) {
                                                                if (var69 > -var68) {
                                                                    class176.method1300(var5, var3, var4 - 1, var3 - 1, var4);
                                                                } else {
                                                                    class176.method1300(var5, var3, var4 + 1, var3 + 1, var4);
                                                                }
                                                            } else if (var69 > var68) {
                                                                class176.method1300(var5, var3, var4 - 1, var3 + 1, var4);
                                                            } else {
                                                                class176.method1300(var5, var3, var4 + 1, var3 - 1, var4);
                                                            }
                                                        } else {
                                                            class176.method1301(class261.field4103, class311.field4849, class206.field3276, var5, var67.field4124, var67.field4127, var67.field4115, var67.field4126);
                                                        }
                                                    }
                                                    var67.field4118.method410(var67.field4123, class102.field1360, class199.field3176, class60.field888, class57.field798, var67.field4130 - class261.field4103, var67.field4116 - class311.field4849, var67.field4125 - class206.field3276, var67.field4122, var5, (class151) null);
                                                }
                                                for (int var71 = var67.field4124; var71 <= var67.field4115; var71++) {
                                                    for (int var72 = var67.field4127; var72 <= var67.field4126; var72++) {
                                                        class124 var73 = var7[var71][var72];
                                                        if (var73.field1781 != 0) {
                                                            class98.field1286.method19(var73, -1058);
                                                        } else if ((var3 != var71 || var4 != var72) && var73.field1792) {
                                                            class98.field1286.method19(var73, -1058);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field1778) {
                                                break;
                                            }
                                        } catch (Exception var93) {
                                            var2.field1778 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field1792);
                            } while (var2.field1781 != 0);
                            if (var3 > class147.field2318 || var3 <= class48.field632) {
                                break;
                            }
                            var75 = var7[var3 - 1][var4];
                        } while (var75 != null && var75.field1792);
                        if (var3 < class147.field2318 || var3 >= class52.field661 - 1) {
                            break;
                        }
                        var76 = var7[var3 + 1][var4];
                    } while (var76 != null && var76.field1792);
                    if (var4 > class238.field3730 || var4 <= class206.field3272) {
                        break;
                    }
                    var77 = var7[var3][var4 - 1];
                } while (var77 != null && var77.field1792);
                if (var4 < class238.field3730 || var4 >= class294.field4563 - 1) {
                    break;
                }
                var78 = var7[var3][var4 + 1];
            } while (var78 != null && var78.field1792);
            var2.field1792 = false;
            class58.field830--;
            class154 var79 = var2.field1789;
            if (var79 != null && var79.field2379 != 0) {
                if (class109.field1458) {
                    class176.method1311(class261.field4103, class311.field4849, class206.field3276, var5, var3, var4);
                }
                if (var79.field2385 != null) {
                    var79.field2385.method410(0, class102.field1360, class199.field3176, class60.field888, class57.field798, var79.field2383 - class261.field4103, var79.field2391 - class311.field4849 - var79.field2379, var79.field2393 - class206.field3276, var79.field2381, var5, (class151) null);
                }
                if (var79.field2389 != null) {
                    var79.field2389.method410(0, class102.field1360, class199.field3176, class60.field888, class57.field798, var79.field2383 - class261.field4103, var79.field2391 - class311.field4849 - var79.field2379, var79.field2393 - class206.field3276, var79.field2381, var5, (class151) null);
                }
                if (var79.field2386 != null) {
                    var79.field2386.method410(0, class102.field1360, class199.field3176, class60.field888, class57.field798, var79.field2383 - class261.field4103, var79.field2391 - class311.field4849 - var79.field2379, var79.field2393 - class206.field3276, var79.field2381, var5, (class151) null);
                }
            }
            if (var2.field1780 != 0) {
                class283 var80 = var2.field1779;
                if (var80 != null && !class271.method1914(var6, var3, var4, var80.field4382.method397())) {
                    if ((var80.field4377 & var2.field1780) != 0) {
                        if (class109.field1458) {
                            class176.method1311(class261.field4103, class311.field4849, class206.field3276, var5, var3, var4);
                        }
                        var80.field4382.method410(0, class102.field1360, class199.field3176, class60.field888, class57.field798, var80.field4375 + var80.field4370 - class261.field4103, var80.field4374 - class311.field4849, var80.field4371 + var80.field4378 - class206.field3276, var80.field4373, var5, (class151) null);
                    } else if (var80.field4377 == 256) {
                        int var81 = var80.field4375 - class261.field4103;
                        int var82 = var80.field4374 - class311.field4849;
                        int var83 = var80.field4371 - class206.field3276;
                        int var84 = var80.field4381;
                        int var85;
                        if (var84 == 1 || var84 == 2) {
                            var85 = -var81;
                        } else {
                            var85 = var81;
                        }
                        int var86;
                        if (var84 == 2 || var84 == 3) {
                            var86 = -var83;
                        } else {
                            var86 = var83;
                        }
                        if (var86 >= var85) {
                            if (class109.field1458) {
                                class176.method1311(class261.field4103, class311.field4849, class206.field3276, var5, var3, var4);
                            }
                            var80.field4382.method410(0, class102.field1360, class199.field3176, class60.field888, class57.field798, var80.field4370 + var81, var82, var80.field4378 + var83, var80.field4373, var5, (class151) null);
                        } else if (var80.field4384 != null) {
                            if (class109.field1458) {
                                class176.method1311(class261.field4103, class311.field4849, class206.field3276, var5, var3, var4);
                            }
                            var80.field4384.method410(0, class102.field1360, class199.field3176, class60.field888, class57.field798, var81, var82, var83, var80.field4373, var5, (class151) null);
                        }
                    }
                }
                class102 var87 = var2.field1775;
                if (var87 != null) {
                    if ((var87.field1358 & var2.field1780) != 0 && !class291.method2033(var6, var3, var4, var87.field1358)) {
                        if (class109.field1458) {
                            class176.method1303(var87.field1358, class261.field4103, class311.field4849, class206.field3276, var6, var3, var4);
                        }
                        var87.field1365.method410(0, class102.field1360, class199.field3176, class60.field888, class57.field798, var87.field1363 - class261.field4103, var87.field1359 - class311.field4849, var87.field1356 - class206.field3276, var87.field1364, var5, (class151) null);
                    }
                    if ((var87.field1366 & var2.field1780) != 0 && !class291.method2033(var6, var3, var4, var87.field1366)) {
                        if (class109.field1458) {
                            class176.method1303(var87.field1366, class261.field4103, class311.field4849, class206.field3276, var6, var3, var4);
                        }
                        var87.field1362.method410(0, class102.field1360, class199.field3176, class60.field888, class57.field798, var87.field1363 - class261.field4103, var87.field1359 - class311.field4849, var87.field1356 - class206.field3276, var87.field1364, var5, (class151) null);
                    }
                }
            }
            if (var5 < class314.field4916 - 1) {
                class124 var88 = class83.field1138[var5 + 1][var3][var4];
                if (var88 != null && var88.field1792) {
                    class98.field1286.method19(var88, -1058);
                }
            }
            if (var3 < class147.field2318) {
                class124 var89 = var7[var3 + 1][var4];
                if (var89 != null && var89.field1792) {
                    class98.field1286.method19(var89, -1058);
                }
            }
            if (var4 < class238.field3730) {
                class124 var90 = var7[var3][var4 + 1];
                if (var90 != null && var90.field1792) {
                    class98.field1286.method19(var90, -1058);
                }
            }
            if (var3 > class147.field2318) {
                class124 var91 = var7[var3 - 1][var4];
                if (var91 != null && var91.field1792) {
                    class98.field1286.method19(var91, -1058);
                }
            }
            if (var4 > class238.field3730) {
                class124 var92 = var7[var3][var4 - 1];
                if (var92 != null && var92.field1792) {
                    class98.field1286.method19(var92, -1058);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IB)[[I", line = 1044)
    public int[][] method253(int arg0, byte arg1) {
        field1638++;
        int var3 = 44 / ((60 - arg1) / 51);
        int[][] var4 = this.field5104.method2365((byte) 107, arg0);
        if (this.field5104.field5325 && this.method834(-4275)) {
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int var7 = this.field1630 * (class302.field4637 == this.field1627 ? arg0 : this.field1627 * arg0 / class302.field4637);
            int[] var8 = var4[2];
            if (class166.field2731 == this.field1630) {
                for (int var12 = 0; var12 < class166.field2731; var12++) {
                    int var13 = this.field1621[var7++];
                    var8[var12] = class333.method2319(var13, 255) << 4;
                    var5[var12] = class333.method2319(var13, 65280) >> 4;
                    var6[var12] = class333.method2319(var13, 16711680) >> 12;
                }
            } else {
                for (int var9 = 0; var9 < class166.field2731; var9++) {
                    int var10 = this.field1630 * var9 / class166.field2731;
                    int var11 = this.field1621[var7 + var10];
                    var8[var9] = class333.method2319(var11, 255) << 4;
                    var5[var9] = class333.method2319(var11, 65280) >> 4;
                    var6[var9] = class333.method2319(var11 >> 12, 4080);
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IZLvl;)V", line = 1111)
    public final void method98(int arg0, boolean arg1, class6 arg2) {
        if (!arg1) {
            if (arg0 == 0) {
                this.field1631 = arg2.method39((byte) 40);
            }
            field1624++;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIBIIIII)V", line = 1127)
    public static final void method828(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1636++;
        if (arg5 >= 1 && arg0 >= 1 && arg5 <= 102 && arg0 <= 102) {
            if (!class154.method1119((byte) 16) && (class134.field1969[0][arg5][arg0] & 0x2) == 0) {
                int var8 = arg6;
                if ((class134.field1969[arg6][arg5][arg0] & 0x8) != 0) {
                    var8 = 0;
                }
                if (class130.field1925 != var8) {
                    return;
                }
            }
            int var9 = arg6;
            if (arg6 < 3 && (class134.field1969[1][arg5][arg0] & 0x2) == 2) {
                var9 = arg6 + 1;
            }
            class161.method1201(class134.field1970[arg6], arg4, var9, 3, arg0, arg6, arg5);
            if (arg3 >= 0) {
                boolean var10 = class99.field1334;
                class99.field1334 = true;
                class305.method2116(arg0, arg7, var9, false, 10768, false, class134.field1970[arg6], arg1, arg5, arg3, arg6);
                class99.field1334 = var10;
            }
        }
        if (arg2 > -105) {
            method831((byte) 2, (class6) null);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lug;I)V", line = 1182)
    public static final void method829(class253 arg0, int arg1) {
        field1622++;
        if (arg1 >= -61) {
            field1633 = -14;
        }
        class126.field1826 = arg0;
    }

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "(III)Z", line = 1194)
    public static final boolean method830(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class157.field2443; var3++) {
            class290 var4 = class286.field4423[var3];
            if (var4.field4483 == 1) {
                int var5 = var4.field4475 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field4463 * var5 >> 8) + var4.field4479;
                    int var7 = (var4.field4464 * var5 >> 8) + var4.field4471;
                    int var8 = (var4.field4462 * var5 >> 8) + var4.field4468;
                    int var9 = (var4.field4480 * var5 >> 8) + var4.field4474;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field4483 == 2) {
                int var10 = arg0 - var4.field4475;
                if (var10 > 0) {
                    int var11 = (var4.field4463 * var10 >> 8) + var4.field4479;
                    int var12 = (var4.field4464 * var10 >> 8) + var4.field4471;
                    int var13 = (var4.field4462 * var10 >> 8) + var4.field4468;
                    int var14 = (var4.field4480 * var10 >> 8) + var4.field4474;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field4483 == 3) {
                int var15 = var4.field4479 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field4470 * var15 >> 8) + var4.field4475;
                    int var17 = (var4.field4473 * var15 >> 8) + var4.field4472;
                    int var18 = (var4.field4462 * var15 >> 8) + var4.field4468;
                    int var19 = (var4.field4480 * var15 >> 8) + var4.field4474;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field4483 == 4) {
                int var20 = arg2 - var4.field4479;
                if (var20 > 0) {
                    int var21 = (var4.field4470 * var20 >> 8) + var4.field4475;
                    int var22 = (var4.field4473 * var20 >> 8) + var4.field4472;
                    int var23 = (var4.field4462 * var20 >> 8) + var4.field4468;
                    int var24 = (var4.field4480 * var20 >> 8) + var4.field4474;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field4483 == 5) {
                int var25 = arg1 - var4.field4468;
                if (var25 > 0) {
                    int var26 = (var4.field4470 * var25 >> 8) + var4.field4475;
                    int var27 = (var4.field4473 * var25 >> 8) + var4.field4472;
                    int var28 = (var4.field4463 * var25 >> 8) + var4.field4479;
                    int var29 = (var4.field4464 * var25 >> 8) + var4.field4471;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BLvl;)V", line = 1325)
    public static final void method831(byte arg0, class6 arg1) {
        field1635++;
        if (arg0 > -114) {
            field1637 = (class169) null;
        }
        while (true) {
            while (arg1.field115.length > arg1.field111) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method58(-288140008) == 1) {
                    var3 = arg1.method58(-288140008);
                    var4 = arg1.method58(-288140008);
                    var2 = true;
                }
                int var5 = arg1.method58(-288140008);
                int var6 = arg1.method58(-288140008);
                int var7 = var5 * 64 - class60.field885;
                int var8 = class4.field42 + class340.field5301 - (var6 * 64) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && (var7 + 63) < class251.field3959 && var8 < class340.field5301) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= (var3 * 8) && var3 * 8 + 8 > var11 && var12 >= var4 * 8 && var4 * 8 + 8 > var12) {
                                byte var13 = arg1.method83((byte) -77);
                                if (var13 != 0) {
                                    if (class193.field3075[var9][var10] == null) {
                                        class193.field3075[var9][var10] = new byte[4096];
                                    }
                                    class193.field3075[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method83((byte) -108);
                                    if (class56.field776[var9][var10] == null) {
                                        class56.field776[var9][var10] = new byte[4096];
                                    }
                                    class56.field776[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method83((byte) -121);
                        if (var16 != 0) {
                            arg1.field111++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIBI)V", line = 1423)
    public static final void method832(int arg0, int arg1, byte arg2, int arg3) {
        field1626++;
        if (arg2 <= 93) {
            field1633 = 97;
        }
        class34 var4 = class91.method656(arg1, -2, 11);
        var4.method307(-19063);
        var4.field497 = arg3;
        var4.field500 = arg0;
    }

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "(I)V", line = 1438)
    public static void method833(int arg0) {
        field1620 = null;
        field1637 = null;
        if (arg0 <= 34) {
            field1632 = 4;
        }
    }

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "(I)Z", line = 1450)
    public final boolean method834(int arg0) {
        field1628++;
        if (arg0 != -4275) {
            method830(-105, 86, 37);
        }
        if (this.field1621 != null) {
            return true;
        } else if (this.field1631 < 0) {
            return false;
        } else {
            class190 var2 = class256.field4039 >= 0 ? class302.method2088(class150.field2347, (byte) -128, this.field1631, class256.field4039) : class310.method2141(class150.field2347, (byte) -61, this.field1631);
            var2.method1399();
            this.field1621 = var2.field3038;
            this.field1630 = var2.field2788;
            this.field1627 = var2.field2791;
            return true;
        }
    }
}
