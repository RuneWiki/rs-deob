import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class84 {

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public static int field1339 = 0;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public static int field1342 = 0;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public int field1335;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    private int field1337;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public int field1343;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method599(String[] arg0, byte arg1) {
        String[] var2 = new String[5];
        if (arg1 >= -102) {
            return null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        field1338++;
        return var2;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILfj;ZI)V")
    private final void method600(int arg0, class274 arg1, boolean arg2, int arg3) {
        field1336++;
        if (arg0 == 1) {
            this.field1337 = arg1.method1837(252);
        } else if (arg0 == 2) {
            this.field1335 = arg1.method1849(255);
            this.field1343 = arg1.method1849(255);
        }
        if (!arg2) {
            this.method602(90, -22, (class274) null);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lke;Z)V")
    public static final void method601(class116 arg0, boolean arg1) {
        class189.field3099.method1554(5257, arg0);
        while (true) {
            class116 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class116[][] var7;
            class116 var83;
            do {
                class116 var82;
                do {
                    class116 var81;
                    do {
                        class116 var80;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class116) class189.field3099.method1555(0);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field1767);
                                            var3 = var2.field1784;
                                            var4 = var2.field1785;
                                            var5 = var2.field1778;
                                            var6 = var2.field1777;
                                            var7 = class307.field4991[var5];
                                            if (!var2.field1786) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class116 var8 = class307.field4991[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field1767) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class270.field4351 && var3 > class21.field395) {
                                                    class116 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field1767 && (var9.field1786 || (var2.field1779 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class270.field4351 && var3 < class310.field5017 - 1) {
                                                    class116 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field1767 && (var10.field1786 || (var2.field1779 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class72.field1157 && var4 > class154.field2460) {
                                                    class116 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field1767 && (var11.field1786 || (var2.field1779 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class72.field1157 && var4 < class49.field719 - 1) {
                                                    class116 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field1767 && (var12.field1786 || (var2.field1779 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field1786 = false;
                                            if (var2.field1771 != null) {
                                                class116 var13 = var2.field1771;
                                                if (var13.field1783 == null) {
                                                    if (var13.field1772 != null) {
                                                        if (class163.method1117(0, var3, var4)) {
                                                            class115.method796(var13.field1772, class270.field4354, class281.field4575, class25.field455, class268.field4333, var3, var4, true);
                                                        } else {
                                                            class115.method796(var13.field1772, class270.field4354, class281.field4575, class25.field455, class268.field4333, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class163.method1117(0, var3, var4)) {
                                                    class249.method1694(var13.field1783, 0, class270.field4354, class281.field4575, class25.field455, class268.field4333, var3, var4, true);
                                                } else {
                                                    class249.method1694(var13.field1783, 0, class270.field4354, class281.field4575, class25.field455, class268.field4333, var3, var4, false);
                                                }
                                                class138 var14 = var13.field1775;
                                                if (var14 != null) {
                                                    var14.field2226.method27(0, class270.field4354, class281.field4575, class25.field455, class268.field4333, var14.field2225 - class35.field567, var14.field2229 - class251.field4123, var14.field2228 - class280.field4561, var14.field2230, var5, (class181) null);
                                                }
                                                for (int var15 = 0; var15 < var13.field1787; var15++) {
                                                    class90 var16 = var13.field1782[var15];
                                                    if (var16 != null) {
                                                        var16.field1416.method27(var16.field1403, class270.field4354, class281.field4575, class25.field455, class268.field4333, var16.field1411 - class35.field567, var16.field1406 - class251.field4123, var16.field1412 - class280.field4561, var16.field1402, var5, (class181) null);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field1783 == null) {
                                                if (var2.field1772 != null) {
                                                    if (class163.method1117(var6, var3, var4)) {
                                                        class115.method796(var2.field1772, class270.field4354, class281.field4575, class25.field455, class268.field4333, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class115.method796(var2.field1772, class270.field4354, class281.field4575, class25.field455, class268.field4333, var3, var4, false);
                                                    }
                                                }
                                            } else if (class163.method1117(var6, var3, var4)) {
                                                class249.method1694(var2.field1783, var6, class270.field4354, class281.field4575, class25.field455, class268.field4333, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field1783.field191 != 12345678 || class24.field449 && var5 <= class40.field616) {
                                                    class249.method1694(var2.field1783, var6, class270.field4354, class281.field4575, class25.field455, class268.field4333, var3, var4, false);
                                                }
                                            }
                                            if (var17) {
                                                class122 var18 = var2.field1765;
                                                if (var18 != null && (var18.field1933 & 0x80000000L) != 0L) {
                                                    var18.field1930.method27(0, class270.field4354, class281.field4575, class25.field455, class268.field4333, var18.field1923 - class35.field567, var18.field1941 - class251.field4123, var18.field1935 - class280.field4561, var18.field1933, var5, (class181) null);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class138 var21 = var2.field1775;
                                            class219 var22 = var2.field1780;
                                            if (var21 != null || var22 != null) {
                                                if (class270.field4351 == var3) {
                                                    var19++;
                                                } else if (class270.field4351 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class72.field1157 == var4) {
                                                    var19 += 3;
                                                } else if (class72.field1157 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class188.field3082[var19];
                                                var2.field1773 = class175.field2920[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field2221 & class124.field1970[var19]) == 0) {
                                                    var2.field1788 = 0;
                                                } else if (var21.field2221 == 16) {
                                                    var2.field1788 = 3;
                                                    var2.field1769 = class269.field4343[var19];
                                                    var2.field1766 = 3 - var2.field1769;
                                                } else if (var21.field2221 == 32) {
                                                    var2.field1788 = 6;
                                                    var2.field1769 = class98.field1546[var19];
                                                    var2.field1766 = 6 - var2.field1769;
                                                } else if (var21.field2221 == 64) {
                                                    var2.field1788 = 12;
                                                    var2.field1769 = class123.field1952[var19];
                                                    var2.field1766 = 12 - var2.field1769;
                                                } else {
                                                    var2.field1788 = 9;
                                                    var2.field1769 = class233.field3651[var19];
                                                    var2.field1766 = 9 - var2.field1769;
                                                }
                                                if ((var21.field2221 & var20) != 0 && !class244.method1661(var6, var3, var4, var21.field2221)) {
                                                    var21.field2226.method27(0, class270.field4354, class281.field4575, class25.field455, class268.field4333, var21.field2225 - class35.field567, var21.field2229 - class251.field4123, var21.field2228 - class280.field4561, var21.field2230, var5, (class181) null);
                                                }
                                                if ((var21.field2224 & var20) != 0 && !class244.method1661(var6, var3, var4, var21.field2224)) {
                                                    var21.field2227.method27(0, class270.field4354, class281.field4575, class25.field455, class268.field4333, var21.field2225 - class35.field567, var21.field2229 - class251.field4123, var21.field2228 - class280.field4561, var21.field2230, var5, (class181) null);
                                                }
                                            }
                                            if (var22 != null && !class195.method1360(var6, var3, var4, var22.field3444.method22())) {
                                                if ((var22.field3435 & var20) != 0) {
                                                    var22.field3444.method27(0, class270.field4354, class281.field4575, class25.field455, class268.field4333, var22.field3449 + var22.field3436 - class35.field567, var22.field3448 - class251.field4123, var22.field3445 + var22.field3438 - class280.field4561, var22.field3446, var5, (class181) null);
                                                } else if (var22.field3435 == 256) {
                                                    int var23 = var22.field3449 - class35.field567;
                                                    int var24 = var22.field3448 - class251.field4123;
                                                    int var25 = var22.field3445 - class280.field4561;
                                                    int var26 = var22.field3447;
                                                    int var27;
                                                    if (var26 == 1 || var26 == 2) {
                                                        var27 = -var23;
                                                    } else {
                                                        var27 = var23;
                                                    }
                                                    int var28;
                                                    if (var26 == 2 || var26 == 3) {
                                                        var28 = -var25;
                                                    } else {
                                                        var28 = var25;
                                                    }
                                                    if (var28 < var27) {
                                                        var22.field3444.method27(0, class270.field4354, class281.field4575, class25.field455, class268.field4333, var22.field3436 + var23, var24, var22.field3438 + var25, var22.field3446, var5, (class181) null);
                                                    } else if (var22.field3437 != null) {
                                                        var22.field3437.method27(0, class270.field4354, class281.field4575, class25.field455, class268.field4333, var23, var24, var25, var22.field3446, var5, (class181) null);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class122 var29 = var2.field1765;
                                                if (var29 != null && (var29.field1933 & 0x80000000L) == 0L) {
                                                    var29.field1930.method27(0, class270.field4354, class281.field4575, class25.field455, class268.field4333, var29.field1923 - class35.field567, var29.field1941 - class251.field4123, var29.field1935 - class280.field4561, var29.field1933, var5, (class181) null);
                                                }
                                                class240 var30 = var2.field1776;
                                                if (var30 != null && var30.field3762 == 0) {
                                                    if (var30.field3749 != null) {
                                                        var30.field3749.method27(0, class270.field4354, class281.field4575, class25.field455, class268.field4333, var30.field3753 - class35.field567, var30.field3751 - class251.field4123, var30.field3754 - class280.field4561, var30.field3752, var5, (class181) null);
                                                    }
                                                    if (var30.field3755 != null) {
                                                        var30.field3755.method27(0, class270.field4354, class281.field4575, class25.field455, class268.field4333, var30.field3753 - class35.field567, var30.field3751 - class251.field4123, var30.field3754 - class280.field4561, var30.field3752, var5, (class181) null);
                                                    }
                                                    if (var30.field3758 != null) {
                                                        var30.field3758.method27(0, class270.field4354, class281.field4575, class25.field455, class268.field4333, var30.field3753 - class35.field567, var30.field3751 - class251.field4123, var30.field3754 - class280.field4561, var30.field3752, var5, (class181) null);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field1779;
                                            if (var31 != 0) {
                                                if (var3 < class270.field4351 && (var31 & 0x4) != 0) {
                                                    class116 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field1767) {
                                                        class189.field3099.method1554(5257, var32);
                                                    }
                                                }
                                                if (var4 < class72.field1157 && (var31 & 0x2) != 0) {
                                                    class116 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field1767) {
                                                        class189.field3099.method1554(5257, var33);
                                                    }
                                                }
                                                if (var3 > class270.field4351 && (var31 & 0x1) != 0) {
                                                    class116 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field1767) {
                                                        class189.field3099.method1554(5257, var34);
                                                    }
                                                }
                                                if (var4 > class72.field1157 && (var31 & 0x8) != 0) {
                                                    class116 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field1767) {
                                                        class189.field3099.method1554(5257, var35);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field1788 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field1787; var37++) {
                                                if (class271.field4367 != var2.field1782[var37].field1417 && (var2.field1768[var37] & var2.field1788) == var2.field1769) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class138 var38 = var2.field1775;
                                                if (!class244.method1661(var6, var3, var4, var38.field2221)) {
                                                    var38.field2226.method27(0, class270.field4354, class281.field4575, class25.field455, class268.field4333, var38.field2225 - class35.field567, var38.field2229 - class251.field4123, var38.field2228 - class280.field4561, var38.field2230, var5, (class181) null);
                                                }
                                                var2.field1788 = 0;
                                            }
                                        }
                                        if (!var2.field1789) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field1787;
                                            var2.field1789 = false;
                                            int var40 = 0;
                                            label588: for (int var41 = 0; var41 < var39; var41++) {
                                                class90 var42 = var2.field1782[var41];
                                                if (class271.field4367 != var42.field1417) {
                                                    for (int var43 = var42.field1405; var43 <= var42.field1420; var43++) {
                                                        for (int var44 = var42.field1407; var44 <= var42.field1399; var44++) {
                                                            class116 var45 = var7[var43][var44];
                                                            if (var45.field1786) {
                                                                var2.field1789 = true;
                                                                continue label588;
                                                            }
                                                            if (var45.field1788 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field1405) {
                                                                    var46++;
                                                                }
                                                                if (var43 < var42.field1420) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field1407) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field1399) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field1788) == var2.field1766) {
                                                                    var2.field1789 = true;
                                                                    continue label588;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class119.field1872[var40++] = var42;
                                                    int var47 = class270.field4351 - var42.field1405;
                                                    int var48 = var42.field1420 - class270.field4351;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class72.field1157 - var42.field1407;
                                                    int var50 = var42.field1399 - class72.field1157;
                                                    if (var50 > var49) {
                                                        var42.field1421 = var47 + var50;
                                                    } else {
                                                        var42.field1421 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; var53++) {
                                                    class90 var54 = class119.field1872[var53];
                                                    if (class271.field4367 != var54.field1417) {
                                                        if (var54.field1421 > var51) {
                                                            var51 = var54.field1421;
                                                            var52 = var53;
                                                        } else if (var54.field1421 == var51) {
                                                            int var55 = var54.field1411 - class35.field567;
                                                            int var56 = var54.field1412 - class280.field4561;
                                                            int var57 = class119.field1872[var52].field1411 - class35.field567;
                                                            int var58 = class119.field1872[var52].field1412 - class280.field4561;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class90 var59 = class119.field1872[var52];
                                                var59.field1417 = class271.field4367;
                                                if (!class31.method235(var6, var59.field1405, var59.field1420, var59.field1407, var59.field1399, var59.field1416.method22())) {
                                                    var59.field1416.method27(var59.field1403, class270.field4354, class281.field4575, class25.field455, class268.field4333, var59.field1411 - class35.field567, var59.field1406 - class251.field4123, var59.field1412 - class280.field4561, var59.field1402, var5, (class181) null);
                                                }
                                                for (int var60 = var59.field1405; var60 <= var59.field1420; var60++) {
                                                    for (int var61 = var59.field1407; var61 <= var59.field1399; var61++) {
                                                        class116 var62 = var7[var60][var61];
                                                        if (var62.field1788 != 0) {
                                                            class189.field3099.method1554(5257, var62);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field1767) {
                                                            class189.field3099.method1554(5257, var62);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field1789) {
                                                break;
                                            }
                                        } catch (Exception var98) {
                                            var2.field1789 = false;
                                            break;
                                        }
                                    }
                                    if (var2.field1774 != null) {
                                        int var63 = class181.field2979 + class136.field2199;
                                        int var64 = class181.field2980 + class136.field2194;
                                        class255 var65 = var2.field1774.field2065;
                                        for (class255 var66 = var65.field4204; var66 != var65; var66 = var66.field4204) {
                                            class176 var67 = (class176) var66;
                                            if (var67.field2939 != null && !var67.field2939.field2096.field2992) {
                                                if ((byte) ((int) (var67.field2939.field2096.field2993 & 0xFFL)) != var2.field1770) {
                                                    var2.field1774 = null;
                                                    break;
                                                }
                                                int var68 = (var67.field2925 >> 12) - class35.field567;
                                                int var69 = (var67.field2927 >> 12) - class251.field4123;
                                                int var70 = (var67.field2926 >> 12) - class280.field4561;
                                                int var71 = class268.field4333 * var68 + class25.field455 * var70 >> 16;
                                                int var72 = class268.field4333 * var70 - class25.field455 * var68 >> 16;
                                                int var74 = class281.field4575 * var69 - class270.field4354 * var72 >> 16;
                                                int var75 = class281.field4575 * var72 + class270.field4354 * var69 >> 16;
                                                if (var75 >= 50) {
                                                    int var77 = (var71 << 9) / var75 + var63;
                                                    int var78 = (var74 << 9) / var75 + var64;
                                                    int var79 = var75 * 400;
                                                    if (var79 == 0) {
                                                        var79 = 1;
                                                    }
                                                    class94.method658(var77, var78, (var67.field2939.field2099.field1860 << 16) / var79, var67.field2928, var67.field2928 >> 24 & 0xFF);
                                                }
                                            }
                                        }
                                    }
                                } while (!var2.field1767);
                            } while (var2.field1788 != 0);
                            if (var3 > class270.field4351 || var3 <= class21.field395) {
                                break;
                            }
                            var80 = var7[var3 - 1][var4];
                        } while (var80 != null && var80.field1767);
                        if (var3 < class270.field4351 || var3 >= class310.field5017 - 1) {
                            break;
                        }
                        var81 = var7[var3 + 1][var4];
                    } while (var81 != null && var81.field1767);
                    if (var4 > class72.field1157 || var4 <= class154.field2460) {
                        break;
                    }
                    var82 = var7[var3][var4 - 1];
                } while (var82 != null && var82.field1767);
                if (var4 < class72.field1157 || var4 >= class49.field719 - 1) {
                    break;
                }
                var83 = var7[var3][var4 + 1];
            } while (var83 != null && var83.field1767);
            var2.field1767 = false;
            class292.field4791--;
            class240 var84 = var2.field1776;
            if (var84 != null && var84.field3762 != 0) {
                if (var84.field3749 != null) {
                    var84.field3749.method27(0, class270.field4354, class281.field4575, class25.field455, class268.field4333, var84.field3753 - class35.field567, var84.field3751 - class251.field4123 - var84.field3762, var84.field3754 - class280.field4561, var84.field3752, var5, (class181) null);
                }
                if (var84.field3755 != null) {
                    var84.field3755.method27(0, class270.field4354, class281.field4575, class25.field455, class268.field4333, var84.field3753 - class35.field567, var84.field3751 - class251.field4123 - var84.field3762, var84.field3754 - class280.field4561, var84.field3752, var5, (class181) null);
                }
                if (var84.field3758 != null) {
                    var84.field3758.method27(0, class270.field4354, class281.field4575, class25.field455, class268.field4333, var84.field3753 - class35.field567, var84.field3751 - class251.field4123 - var84.field3762, var84.field3754 - class280.field4561, var84.field3752, var5, (class181) null);
                }
            }
            if (var2.field1773 != 0) {
                class219 var85 = var2.field1780;
                if (var85 != null && !class195.method1360(var6, var3, var4, var85.field3444.method22())) {
                    if ((var85.field3435 & var2.field1773) != 0) {
                        var85.field3444.method27(0, class270.field4354, class281.field4575, class25.field455, class268.field4333, var85.field3449 + var85.field3436 - class35.field567, var85.field3448 - class251.field4123, var85.field3445 + var85.field3438 - class280.field4561, var85.field3446, var5, (class181) null);
                    } else if (var85.field3435 == 256) {
                        int var86 = var85.field3449 - class35.field567;
                        int var87 = var85.field3448 - class251.field4123;
                        int var88 = var85.field3445 - class280.field4561;
                        int var89 = var85.field3447;
                        int var90;
                        if (var89 == 1 || var89 == 2) {
                            var90 = -var86;
                        } else {
                            var90 = var86;
                        }
                        int var91;
                        if (var89 == 2 || var89 == 3) {
                            var91 = -var88;
                        } else {
                            var91 = var88;
                        }
                        if (var91 >= var90) {
                            var85.field3444.method27(0, class270.field4354, class281.field4575, class25.field455, class268.field4333, var85.field3436 + var86, var87, var85.field3438 + var88, var85.field3446, var5, (class181) null);
                        } else if (var85.field3437 != null) {
                            var85.field3437.method27(0, class270.field4354, class281.field4575, class25.field455, class268.field4333, var86, var87, var88, var85.field3446, var5, (class181) null);
                        }
                    }
                }
                class138 var92 = var2.field1775;
                if (var92 != null) {
                    if ((var92.field2224 & var2.field1773) != 0 && !class244.method1661(var6, var3, var4, var92.field2224)) {
                        var92.field2227.method27(0, class270.field4354, class281.field4575, class25.field455, class268.field4333, var92.field2225 - class35.field567, var92.field2229 - class251.field4123, var92.field2228 - class280.field4561, var92.field2230, var5, (class181) null);
                    }
                    if ((var92.field2221 & var2.field1773) != 0 && !class244.method1661(var6, var3, var4, var92.field2221)) {
                        var92.field2226.method27(0, class270.field4354, class281.field4575, class25.field455, class268.field4333, var92.field2225 - class35.field567, var92.field2229 - class251.field4123, var92.field2228 - class280.field4561, var92.field2230, var5, (class181) null);
                    }
                }
            }
            if (var5 < class284.field4608 - 1) {
                class116 var93 = class307.field4991[var5 + 1][var3][var4];
                if (var93 != null && var93.field1767) {
                    class189.field3099.method1554(5257, var93);
                }
            }
            if (var3 < class270.field4351) {
                class116 var94 = var7[var3 + 1][var4];
                if (var94 != null && var94.field1767) {
                    class189.field3099.method1554(5257, var94);
                }
            }
            if (var4 < class72.field1157) {
                class116 var95 = var7[var3][var4 + 1];
                if (var95 != null && var95.field1767) {
                    class189.field3099.method1554(5257, var95);
                }
            }
            if (var3 > class270.field4351) {
                class116 var96 = var7[var3 - 1][var4];
                if (var96 != null && var96.field1767) {
                    class189.field3099.method1554(5257, var96);
                }
            }
            if (var4 > class72.field1157) {
                class116 var97 = var7[var3][var4 - 1];
                if (var97 != null && var97.field1767) {
                    class189.field3099.method1554(5257, var97);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IILfj;)V")
    public final void method602(int arg0, int arg1, class274 arg2) {
        while (true) {
            int var4 = arg2.method1849(255);
            if (var4 == 0) {
                field1341++;
                if (arg0 != -1) {
                    this.method602(-9, -102, (class274) null);
                    return;
                }
                return;
            }
            this.method600(var4, arg2, true, arg1);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)Le;")
    public final class67 method603(int arg0) {
        field1340++;
        class67 var2 = (class67) class158.field2570.method1879(8887, (long) this.field1337);
        if (var2 != null) {
            return var2;
        }
        class67 var3 = class124.method854((byte) 93, this.field1337, arg0, class243.field3844);
        if (var3 != null) {
            class158.field2570.method1883((long) this.field1337, arg0 ^ 0x21, var3);
        }
        return var3;
    }
}
