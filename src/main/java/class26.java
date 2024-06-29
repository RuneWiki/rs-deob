import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class26 implements class70 {

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "Lod;")
    private class88 field455 = new class88();

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
    private int field460 = 0;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    private int field458 = 128;

    @OriginalMember(owner = "client!ea", name = "D", descriptor = "D")
    private double field468 = 1.0D;

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "Lud;")
    private class118 field464;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
    private int field461;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "[Lhd;")
    private class46[] field446;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field444 = 0;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "[J")
    public static long[] field442 = new long[200];

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "Lo;")
    public static class84 field451 = class15.method124(" from your ignore list first", 255);

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "Lo;")
    public static class84 field445 = class15.method124("redstone3", 255);

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "Lo;")
    public static class84 field454 = class15.method124("@gr2@", 255);

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "Lo;")
    public static class84 field456 = class15.method124("Imported models", 255);

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "Lo;")
    public static class84 field459 = class15.method124("Import complete", 255);

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "Lo;")
    public static class84 field463 = class15.method124("This world is full)3", 255);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!ea", name = "C", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!ea", name = "E", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "Lp;")
    public static class89 field450;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "Lpc;")
    public static class92 field440;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "Ljava/awt/Font;")
    public static Font field462;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)Z", line = 5)
    public final boolean method190(int arg0, byte arg1) {
        field447++;
        if (arg1 <= 43) {
            this.field460 = 105;
        }
        return this.field458 == 64;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V", line = 16)
    public static void method191(byte arg0) {
        field462 = null;
        field454 = null;
        field445 = null;
        field440 = null;
        field456 = null;
        field450 = null;
        field459 = null;
        if (arg0 == 73) {
            field442 = null;
            field463 = null;
            field451 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(IB)[I", line = 36)
    public final int[] method192(int arg0, byte arg1) {
        field443++;
        if (arg1 > -117) {
            return null;
        }
        class46 var3 = this.field446[arg0];
        if (var3 != null) {
            if (var3.field973 != null) {
                this.field455.method700((byte) -128, var3);
                var3.field980 = true;
                return var3.field973;
            }
            boolean var4 = var3.method402(this.field468, this.field458, this.field464);
            if (var4) {
                if (this.field460 == 0) {
                    class46 var5 = (class46) this.field455.method689(false);
                    var5.method401();
                } else {
                    this.field460--;
                }
                this.field455.method700((byte) -120, var3);
                var3.field980 = true;
                return var3.field973;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 84)
    public static final void method193(int arg0) {
        class15.field274 = 0;
        field452++;
        class62.field1290 = 0;
        class120.method938(arg0 + 94);
        class55.method460(-918);
        class117.method896((byte) -106);
        class17.method134(arg0 + 4);
        for (int var1 = 0; var1 < class15.field274; var1++) {
            int var3 = class61.field1273[var1];
            if (class128.field2837 != class119.field2643[var3].field1379) {
                class119.field2643[var3] = null;
            }
        }
        if (class39.field794 != class65.field1405.field482) {
            throw new RuntimeException("gpp1 pos:" + class65.field1405.field482 + " psize:" + class39.field794);
        }
        for (int var2 = arg0; var2 < class107.field2257; var2++) {
            if (class119.field2643[class85.field1949[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class107.field2257);
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIII[Lfb;BIILsd;I[B)V", line = 134)
    public static final void method194(int arg0, int arg1, int arg2, int arg3, class33[] arg4, byte arg5, int arg6, int arg7, class108 arg8, int arg9, byte[] arg10) {
        field448++;
        class27 var11 = new class27(arg10);
        if (arg5 <= 102) {
            method193(-65);
        }
        int var12 = -1;
        while (true) {
            int var13 = var11.method221(true);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method221(true);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 6 & 0x3F;
                int var18 = var14 >> 12;
                int var19 = var11.method231(255);
                int var20 = var19 >> 2;
                int var21 = var19 & 0x3;
                if (arg1 == var18 && var17 >= arg2 && var17 < arg2 + 8 && arg7 <= var16 && arg7 + 8 > var16) {
                    class49 var22 = class110.method856((byte) -123, var12);
                    int var23 = class123.method964(var17 & 0x7, var22.field1035, var16 & 0x7, arg0, -2091, var22.field1028, var21) + arg3;
                    int var24 = class17.method140(var17 & 0x7, var22.field1028, var21, arg0, var22.field1035, (byte) 96, var16 & 0x7) + arg6;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class33 var25 = null;
                        int var26 = arg9;
                        if ((class73.field1544[1][var23][var24] & 0x2) == 2) {
                            var26 = arg9 - 1;
                        }
                        if (var26 >= 0) {
                            var25 = arg4[var26];
                        }
                        class101.method765(arg9, var12, var23, (byte) -120, var25, arg0 + var21 & 0x3, var20, arg8, var24);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)V", line = 216)
    public final void method195(boolean arg0) {
        for (int var2 = 0; var2 < this.field446.length; var2++) {
            if (this.field446[var2] != null) {
                this.field446[var2].method401();
            }
        }
        if (!arg0) {
            this.field461 = 116;
        }
        this.field455 = new class88();
        this.field460 = this.field461;
        field469++;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lo;IIIZI)V", line = 240)
    public static final void method196(class84 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (class40.field805 < 500) {
            class21.field385[class40.field805] = arg0;
            class63.field1306[class40.field805] = arg1;
            class107.field2286[class40.field805] = arg5;
            class41.field835[class40.field805] = arg3;
            class42.field864[class40.field805] = arg2;
            class40.field805++;
        }
        field467++;
        if (arg4) {
            field456 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)Z", line = 267)
    public final boolean method197(byte arg0, int arg1) {
        if (arg0 != -20) {
            method196(null, 53, -113, 36, true, 28);
        }
        field466++;
        return this.field446[arg1].field975;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIIIII)Z", line = 284)
    public static final boolean method198(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field465++;
        if (!class128.method998(arg2, -20142)) {
            return false;
        }
        class32.method291(arg6, arg0, arg7, arg5);
        boolean var9 = true;
        if (arg8 != 2) {
            return false;
        }
        class75[] var10 = class60.field1254[arg2];
        for (int var11 = 0; var11 < var10.length; var11++) {
            class75 var12 = var10[var11];
            if (var12 != null && var12.field1625 == arg1) {
                if (var12.field1624 > 0) {
                    class11.method103(false, var12);
                }
                int var13 = var12.field1589 + arg0 - arg4;
                int var14 = var12.field1579 + arg6;
                if (var12.field1627 == 0) {
                    if (var12.field1562 && !class39.method350(arg3, var11, (byte) -97)) {
                        continue;
                    }
                    if (var12.field1609 - var12.field1623 < var12.field1588) {
                        var12.field1588 = var12.field1609 - var12.field1623;
                    }
                    if (var12.field1588 < 0) {
                        var12.field1588 = 0;
                    }
                    var9 &= method198(var13, var11, arg2, arg3, var12.field1588, var12.field1623 + var13, var14, var14 + var12.field1613, arg8);
                    class32.method291(arg6, arg0, arg7, arg5);
                    if (var12.field1623 < var12.field1609) {
                        class44.method376(var12.field1623, 13379, var12.field1613 + var14, var12.field1588, var13, var12.field1609);
                    }
                }
                if (var12.field1627 != 1) {
                    if (var12.field1627 == 2) {
                        int var15 = 0;
                        for (int var16 = 0; var16 < var12.field1623; var16++) {
                            for (int var17 = 0; var17 < var12.field1613; var17++) {
                                int var18 = (var12.field1561 + 32) * var17 + var14;
                                int var19 = (var12.field1574 + 32) * var16 + var13;
                                if (var15 < 20) {
                                    var19 += var12.field1606[var15];
                                    var18 += var12.field1581[var15];
                                }
                                if (var12.field1614[var15] > 0) {
                                    int var20 = 0;
                                    int var21 = 0;
                                    int var22 = var12.field1614[var15] - 1;
                                    if (var18 > class32.field635 - 32 && var18 < class32.field634 && class32.field637 - 32 < var19 && class32.field636 > var19 || class107.field2268 != 0 && class114.field2488 == var15) {
                                        int var23 = 0;
                                        if (class93.field2048 == 1 && class36.field712 == var15 && (arg2 << 16) + var11 == class126.field2791) {
                                            var23 = 16777215;
                                        }
                                        class121 var24 = class71.method525(var23, var12.field1576[var15], var22, -27287);
                                        if (var24 == null) {
                                            var9 = false;
                                        } else {
                                            if (class107.field2268 != 0 && class114.field2488 == var15 && (arg2 << 16) + var11 == class97.field2064) {
                                                var20 = class119.field2644 - class75.field1560;
                                                if (var20 < 5 && var20 > -5) {
                                                    var20 = 0;
                                                }
                                                var21 = class38.field748 - class15.field281;
                                                if (var21 < 5 && var21 > -5) {
                                                    var21 = 0;
                                                }
                                                if (class1.field20 < 5) {
                                                    var20 = 0;
                                                    var21 = 0;
                                                }
                                                var24.method941(var18 + var21, var19 + var20, 128);
                                                if (arg1 != -1) {
                                                    class75 var25 = var10[arg1];
                                                    if (class32.field637 > var19 + var20 && var25.field1588 > 0) {
                                                        int var26 = (class32.field637 - var19 - var20) * class54.field1126 / 3;
                                                        if (var26 > class54.field1126 * 10) {
                                                            var26 = class54.field1126 * 10;
                                                        }
                                                        if (var26 > var25.field1588) {
                                                            var26 = var25.field1588;
                                                        }
                                                        class75.field1560 += var26;
                                                        var25.field1588 -= var26;
                                                    }
                                                    if (var19 + var20 + 32 > class32.field636 && var25.field1609 - var25.field1623 > var25.field1588) {
                                                        int var27 = (var19 + var20 + 32 - class32.field636) * class54.field1126 / 3;
                                                        if (var27 > class54.field1126 * 10) {
                                                            var27 = class54.field1126 * 10;
                                                        }
                                                        if (var27 > var25.field1609 - var25.field1623 - var25.field1588) {
                                                            var27 = var25.field1609 - var25.field1623 - var25.field1588;
                                                        }
                                                        var25.field1588 += var27;
                                                        class75.field1560 -= var27;
                                                    }
                                                }
                                            } else if (field444 != 0 && class100.field2127 == var15 && (arg2 << 16) + var11 == class61.field1265) {
                                                var24.method941(var18, var19, 128);
                                            } else {
                                                var24.method947(var18, var19);
                                            }
                                            if (var24.field2708 == 33 || var12.field1576[var15] != 1) {
                                                int var28 = var12.field1576[var15];
                                                class89.field2022.method320(class84.method642(var28, arg8 + 121), var18 + var21 + 1, var19 + var20 + 10, 0);
                                                class89.field2022.method320(class84.method642(var28, -77), var18 + var21, 9 - -var20 + var19, 16776960);
                                            }
                                        }
                                    }
                                } else if (var12.field1584 != null && var15 < 20) {
                                    class121 var29 = var12.method566(var15, false);
                                    if (var29 != null) {
                                        var29.method947(var18, var19);
                                    } else if (class63.field1310) {
                                        var9 = false;
                                    }
                                }
                                var15++;
                            }
                        }
                    } else if (var12.field1627 == 3) {
                        int var30;
                        if (class101.method766(var12, (byte) -58)) {
                            var30 = var12.field1590;
                            if (class39.method350(arg3, var11, (byte) -113) && var12.field1582 != 0) {
                                var30 = var12.field1582;
                            }
                        } else {
                            var30 = var12.field1583;
                            if (class39.method350(arg3, var11, (byte) -83) && var12.field1632 != 0) {
                                var30 = var12.field1632;
                            }
                        }
                        if (var12.field1612 == 0) {
                            if (var12.field1631) {
                                class32.method290(var14, var13, var12.field1613, var12.field1623, var30);
                            } else {
                                class32.method285(var14, var13, var12.field1613, var12.field1623, var30);
                            }
                        } else if (var12.field1631) {
                            class32.method293(var14, var13, var12.field1613, var12.field1623, var30, 256 - (var12.field1612 & 0xFF));
                        } else {
                            class32.method287(var14, var13, var12.field1613, var12.field1623, var30, 256 - (var12.field1612 & 0xFF));
                        }
                    } else if (var12.field1627 == 4) {
                        class34 var31 = class58.field1195[var12.field1555];
                        class84 var32 = var12.field1585;
                        int var33;
                        if (class101.method766(var12, (byte) -113)) {
                            var33 = var12.field1590;
                            if (class39.method350(arg3, var11, (byte) -37) && var12.field1582 != 0) {
                                var33 = var12.field1582;
                            }
                            if (var12.field1602.method639(arg8 + 125) > 0) {
                                var32 = var12.field1602;
                            }
                        } else {
                            var33 = var12.field1583;
                            if (class39.method350(arg3, var11, (byte) -74) && var12.field1632 != 0) {
                                var33 = var12.field1632;
                            }
                        }
                        if (var12.field1569 == 6 && class25.field438) {
                            var32 = class61.field1277;
                            var33 = var12.field1583;
                        }
                        if (class32.field638 == 479) {
                            if (var33 == 16776960) {
                                var33 = 255;
                            }
                            if (var33 == 49152) {
                                var33 = 16777215;
                            }
                        }
                        class84 var34 = class5.method32(var12, var32, 4);
                        int var35 = var31.field684 + var13;
                        while (var34.method639(-121) > 0) {
                            int var36 = var34.method670(class122.field2727, (byte) 95);
                            class84 var37;
                            if (var36 == -1) {
                                var37 = var34;
                                var34 = class73.field1524;
                            } else {
                                var37 = var34.method650(var36, -32, 0);
                                var34 = var34.method655(28418, var36 + 2);
                            }
                            if (var12.field1558) {
                                var31.method323(var37, var12.field1613 / 2 + var14, var35, var33, var12.field1567);
                            } else {
                                var31.method319(var37, var14, var35, var33, var12.field1567);
                            }
                            var35 += var31.field684;
                        }
                    } else if (var12.field1627 == 5) {
                        class121 var38 = var12.method564(class101.method766(var12, (byte) -95), -1);
                        if (var38 != null) {
                            var38.method947(var14, var13);
                        } else if (class63.field1310) {
                            var9 = false;
                        }
                    } else if (var12.field1627 == 6) {
                        class7.method53(var12.field1613 / 2 + var14, var12.field1623 / 2 + var13);
                        int var39 = class7.field128[var12.field1573] * var12.field1587 >> 16;
                        int var40 = class7.field124[var12.field1573] * var12.field1587 >> 16;
                        boolean var41 = class101.method766(var12, (byte) -34);
                        int var42;
                        if (var41) {
                            var42 = var12.field1593;
                        } else {
                            var42 = var12.field1565;
                        }
                        class83 var43;
                        if (var12.field1617 == 5) {
                            var43 = class45.field947.method530(-1, -1, (byte) 101, null, null);
                        } else if (var42 == -1) {
                            var43 = var12.method560(arg8 + 107, null, var41, class107.field2271.field1322, -1);
                            if (var43 == null && class63.field1310) {
                                var9 = false;
                            }
                        } else {
                            class31 var44 = class74.method554(var42, 4867);
                            var43 = var12.method560(127, var44, var41, class107.field2271.field1322, var12.field1556);
                            if (var43 == null && class63.field1310) {
                                var9 = false;
                            }
                        }
                        if (var43 != null) {
                            var43.method621(0, var12.field1628, 0, var12.field1573, 0, var39, var40);
                        }
                        class7.method54();
                    } else {
                        if (var12.field1627 == 7) {
                            class34 var45 = class58.field1195[var12.field1555];
                            int var46 = 0;
                            for (int var47 = 0; var47 < var12.field1623; var47++) {
                                for (int var48 = 0; var48 < var12.field1613; var48++) {
                                    if (var12.field1614[var46] > 0) {
                                        class44 var49 = class126.method970(79, var12.field1614[var46] - 1);
                                        class84 var50 = var49.field921;
                                        if (var50 == null) {
                                            var50 = class61.field1269;
                                        }
                                        if (var49.field920 || var12.field1576[var46] != 1) {
                                            var50 = class97.method746(0, new class84[] { var50, class74.field1550, class65.method505(var12.field1576[var46], (byte) -77) });
                                        }
                                        int var51 = (var12.field1561 + 115) * var48 + var14;
                                        int var52 = (var12.field1574 + 12) * var47 + var13;
                                        if (var12.field1558) {
                                            var45.method323(var50, var12.field1613 / 2 + var51, var52, var12.field1583, var12.field1567);
                                        } else {
                                            var45.method319(var50, var51, var52, var12.field1583, var12.field1567);
                                        }
                                    }
                                    var46++;
                                }
                            }
                        }
                        if (var12.field1627 == 8 && class116.method893(arg3, 67, var11) && class78.field1647 == 100) {
                            int var53 = 0;
                            int var54 = 0;
                            class34 var55 = class123.field2762;
                            class84 var56 = var12.field1585;
                            class84 var57 = class5.method32(var12, var56, 4);
                            while (var57.method639(arg8 ^ 0x7A) > 0) {
                                int var65 = var57.method670(class122.field2727, (byte) 95);
                                class84 var66;
                                if (var65 == -1) {
                                    var66 = var57;
                                    var57 = class73.field1524;
                                } else {
                                    var66 = var57.method650(var65, -32, 0);
                                    var57 = var57.method655(28418, var65 + 2);
                                }
                                int var67 = var55.method321(var66);
                                var54 += var55.field684 + 1;
                                if (var67 > var53) {
                                    var53 = var67;
                                }
                            }
                            var54 += 7;
                            var53 += 6;
                            int var58 = var12.field1623 + var13 + 5;
                            if (arg5 < var54 + var58) {
                                var58 = arg5 - var54;
                            }
                            int var59 = var12.field1613 + var14 - var53 - 5;
                            if (var59 < var14 + 5) {
                                var59 = var14 + 5;
                            }
                            if (var53 + var59 > arg7) {
                                var59 = arg7 - var53;
                            }
                            class32.method290(var59, var58, var53, var54, 16777120);
                            class32.method285(var59, var58, var53, var54, 0);
                            int var60 = var58 + var55.field684 + 2;
                            class84 var61 = var12.field1585;
                            class84 var62 = class5.method32(var12, var61, arg8 + 2);
                            while (var62.method639(121) > 0) {
                                int var63 = var62.method670(class122.field2727, (byte) 95);
                                class84 var64;
                                if (var63 == -1) {
                                    var64 = var62;
                                    var62 = class73.field1524;
                                } else {
                                    var64 = var62.method650(var63, arg8 - 34, 0);
                                    var62 = var62.method655(28418, var63 + 2);
                                }
                                var55.method319(var64, var59 + 3, var60, 0, false);
                                var60 += var55.field684 + 1;
                            }
                        }
                    }
                }
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(DI)V", line = 815)
    public final void method199(double arg0, int arg1) {
        this.field468 = arg0;
        field441++;
        if (arg1 != 2) {
            this.method202(false, 18);
        }
        this.method195(true);
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(IB)V", line = 827)
    public final void method200(int arg0, byte arg1) {
        for (int var3 = 0; var3 < this.field446.length; var3++) {
            class46 var4 = this.field446[var3];
            if (var4 != null && var4.field976 != 0 && var4.field980) {
                var4.method399(arg0);
                var4.field980 = false;
            }
        }
        if (arg1 != 28) {
            this.method195(false);
        }
        field439++;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)Lfc;", line = 856)
    public static final class34 method201(int arg0) {
        int var1 = 123 / ((arg0 + 49) / 58);
        field449++;
        class34 var2 = new class34(class116.field2543, class78.field1668, class24.field397, class25.field432, class110.field2385);
        class112.method864(-104);
        return var2;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZI)I", line = 879)
    public final int method202(boolean arg0, int arg1) {
        if (!arg0) {
            this.field461 = 1;
        }
        field453++;
        return this.field446[arg1] == null ? 0 : this.field446[arg1].field978;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lud;Lud;IDI)V", line = 935)
    public class26(class118 arg0, class118 arg1, int arg2, double arg3, int arg4) {
        this.field458 = arg4;
        this.field468 = arg3;
        this.field464 = arg1;
        this.field461 = arg2;
        this.field460 = this.field461;
        int[] var7 = arg0.method922((byte) -56, 0);
        int var8 = var7.length;
        this.field446 = new class46[arg0.method917(0, (byte) 120)];
        for (int var9 = 0; var9 < var8; var9++) {
            class27 var10 = new class27(arg0.method909((byte) -128, var7[var9], 0));
            this.field446[var7[var9]] = new class46(var10);
        }
    }
}
