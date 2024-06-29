import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YFPQHQAV")
public class class66 extends class45 {

    @OriginalMember(owner = "client!YFPQHQAV", name = "rb", descriptor = "Z")
    public boolean field1613 = false;

    @OriginalMember(owner = "client!YFPQHQAV", name = "tb", descriptor = "[I")
    public int[] field1615 = new int[5];

    @OriginalMember(owner = "client!YFPQHQAV", name = "vb", descriptor = "I")
    public int field1617 = -1;

    @OriginalMember(owner = "client!YFPQHQAV", name = "wb", descriptor = "Z")
    private boolean field1618 = false;

    @OriginalMember(owner = "client!YFPQHQAV", name = "xb", descriptor = "Z")
    private boolean field1619 = true;

    @OriginalMember(owner = "client!YFPQHQAV", name = "Db", descriptor = "I")
    public int field1625 = -1;

    @OriginalMember(owner = "client!YFPQHQAV", name = "Eb", descriptor = "Z")
    private boolean field1626 = false;

    @OriginalMember(owner = "client!YFPQHQAV", name = "Fb", descriptor = "[I")
    public int[] field1627 = new int[12];

    @OriginalMember(owner = "client!YFPQHQAV", name = "Gb", descriptor = "Z")
    public boolean field1628 = false;

    @OriginalMember(owner = "client!YFPQHQAV", name = "Hb", descriptor = "I")
    private int field1629 = 25957;

    @OriginalMember(owner = "client!YFPQHQAV", name = "Kb", descriptor = "J")
    public long field1632 = -1L;

    @OriginalMember(owner = "client!YFPQHQAV", name = "Lb", descriptor = "I")
    private int field1633 = 9;

    @OriginalMember(owner = "client!YFPQHQAV", name = "Vb", descriptor = "Z")
    private boolean field1643 = false;

    @OriginalMember(owner = "client!YFPQHQAV", name = "sb", descriptor = "LFFRFJBIR;")
    public static class12 field1614 = new class12(260, -2745);

    @OriginalMember(owner = "client!YFPQHQAV", name = "ub", descriptor = "I")
    public int field1616;

    @OriginalMember(owner = "client!YFPQHQAV", name = "yb", descriptor = "I")
    public int field1620;

    @OriginalMember(owner = "client!YFPQHQAV", name = "zb", descriptor = "I")
    public int field1621;

    @OriginalMember(owner = "client!YFPQHQAV", name = "Ab", descriptor = "I")
    public int field1622;

    @OriginalMember(owner = "client!YFPQHQAV", name = "Cb", descriptor = "I")
    public int field1624;

    @OriginalMember(owner = "client!YFPQHQAV", name = "Ib", descriptor = "I")
    public int field1630;

    @OriginalMember(owner = "client!YFPQHQAV", name = "Mb", descriptor = "I")
    public int field1634;

    @OriginalMember(owner = "client!YFPQHQAV", name = "Nb", descriptor = "I")
    public int field1635;

    @OriginalMember(owner = "client!YFPQHQAV", name = "Ob", descriptor = "I")
    public int field1636;

    @OriginalMember(owner = "client!YFPQHQAV", name = "Pb", descriptor = "I")
    public int field1637;

    @OriginalMember(owner = "client!YFPQHQAV", name = "Qb", descriptor = "I")
    public int field1638;

    @OriginalMember(owner = "client!YFPQHQAV", name = "Rb", descriptor = "I")
    public int field1639;

    @OriginalMember(owner = "client!YFPQHQAV", name = "Sb", descriptor = "I")
    public int field1640;

    @OriginalMember(owner = "client!YFPQHQAV", name = "Tb", descriptor = "I")
    public int field1641;

    @OriginalMember(owner = "client!YFPQHQAV", name = "Jb", descriptor = "J")
    public long field1631;

    @OriginalMember(owner = "client!YFPQHQAV", name = "Bb", descriptor = "LKUGNQTGL;")
    public class28 field1623;

    @OriginalMember(owner = "client!YFPQHQAV", name = "qb", descriptor = "LRDFTXEYV;")
    public class48 field1612;

    @OriginalMember(owner = "client!YFPQHQAV", name = "Ub", descriptor = "Ljava/lang/String;")
    public String field1642;

    @OriginalMember(owner = "client!YFPQHQAV", name = "a", descriptor = "(Z)LKUGNQTGL;")
    public final class28 method547(boolean arg0) {
        if (!this.field1628) {
            return null;
        } else if (this.field1612 != null) {
            return this.field1612.method437(true);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var12 = this.field1627[var3];
                if (var12 >= 256 && var12 < 512 && !class64.field1598[var12 - 256].method542(-516)) {
                    var2 = true;
                }
                if (var12 >= 512 && !class34.method390(var12 - 512).method383(398, this.field1640)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                class28[] var4 = new class28[12];
                if (arg0) {
                    throw new NullPointerException();
                } else {
                    int var5 = 0;
                    for (int var6 = 0; var6 < 12; ++var6) {
                        int var9 = this.field1627[var6];
                        if (var9 >= 256 && var9 < 512) {
                            class28 var10 = class64.field1598[var9 - 256].method543(this.field1643);
                            if (var10 != null) {
                                var4[var5++] = var10;
                            }
                        }
                        if (var9 >= 512) {
                            class28 var11 = class34.method390(var9 - 512).method384(this.field1640, false);
                            if (var11 != null) {
                                var4[var5++] = var11;
                            }
                        }
                    }
                    class28 var7 = new class28(var5, var4, 127);
                    for (int var8 = 0; var8 < 5; ++var8) {
                        if (this.field1615[var8] != 0) {
                            var7.method344(client.field478[var8][0], client.field478[var8][this.field1615[var8]]);
                            if (var8 == 1) {
                                var7.method344(client.field215[0], client.field215[this.field1615[var8]]);
                            }
                        }
                    }
                    return var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!YFPQHQAV", name = "b", descriptor = "(I)Z")
    public final boolean method433(int arg0) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        } else {
            return this.field1628;
        }
    }

    @OriginalMember(owner = "client!YFPQHQAV", name = "a", descriptor = "(ILFTMSICIZ;)V")
    public final void method548(int arg0, class13 arg1) {
        arg1.field643 = 0;
        this.field1640 = arg1.method213();
        this.field1625 = arg1.method214();
        this.field1617 = arg1.method214();
        this.field1612 = null;
        this.field1624 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg1.method213();
            if (var4 == 0) {
                this.field1627[var3] = 0;
            } else {
                int var5 = arg1.method213();
                this.field1627[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field1627[0] == 65535) {
                    this.field1612 = class48.method439(arg1.method215());
                    break;
                }
                if (this.field1627[var3] >= 512 && this.field1627[var3] - 512 < class34.field992) {
                    int var12 = class34.method390(this.field1627[var3] - 512).field1020;
                    if (var12 != 0) {
                        this.field1624 = var12;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var11 = arg1.method213();
            if (var11 < 0 || var11 >= client.field478[var6].length) {
                var11 = 0;
            }
            this.field1615[var6] = var11;
        }
        super.field1288 = arg1.method215();
        if (super.field1288 == 65535) {
            super.field1288 = -1;
        }
        super.field1289 = arg1.method215();
        if (super.field1289 == 65535) {
            super.field1289 = -1;
        }
        super.field1270 = arg1.method215();
        if (super.field1270 == 65535) {
            super.field1270 = -1;
        }
        super.field1271 = arg1.method215();
        if (super.field1271 == 65535) {
            super.field1271 = -1;
        }
        super.field1272 = arg1.method215();
        if (super.field1272 == 65535) {
            super.field1272 = -1;
        }
        super.field1273 = arg1.method215();
        if (super.field1273 == 65535) {
            super.field1273 = -1;
        }
        super.field1291 = arg1.method215();
        if (super.field1291 == 65535) {
            super.field1291 = -1;
        }
        this.field1642 = class51.method449(class51.method446(arg1.method219(false), (byte) 5), 78);
        this.field1641 = arg1.method213();
        this.field1630 = arg1.method215();
        this.field1628 = true;
        if (arg0 < 2 || arg0 > 2) {
            this.field1629 = -472;
        }
        this.field1631 = 0L;
        int var7 = this.field1627[5];
        int var8 = this.field1627[9];
        this.field1627[5] = var8;
        this.field1627[9] = var7;
        for (int var9 = 0; var9 < 12; ++var9) {
            this.field1631 <<= 4;
            if (this.field1627[var9] >= 256) {
                this.field1631 += (long) (this.field1627[var9] - 256);
            }
        }
        if (this.field1627[0] >= 256) {
            this.field1631 += (long) (this.field1627[0] - 256 >> 4);
        }
        if (this.field1627[1] >= 256) {
            this.field1631 += (long) (this.field1627[1] - 256 >> 8);
        }
        this.field1627[5] = var7;
        this.field1627[9] = var8;
        for (int var10 = 0; var10 < 5; ++var10) {
            this.field1631 <<= 3;
            this.field1631 += (long) this.field1615[var10];
        }
        this.field1631 <<= 1;
        this.field1631 += (long) this.field1640;
    }

    @OriginalMember(owner = "client!YFPQHQAV", name = "a", descriptor = "(B)LKUGNQTGL;")
    public final class28 method40(byte arg0) {
        if (!this.field1628) {
            return null;
        } else {
            class28 var2 = this.method549(this.field1626);
            if (var2 == null) {
                return null;
            } else {
                super.field1297 = var2.field1679;
                var2.field850 = true;
                if (this.field1613) {
                    return var2;
                } else {
                    if (super.field1250 != -1 && super.field1251 != -1) {
                        class24 var3 = class24.field759[super.field1250];
                        class28 var4 = var3.method308();
                        if (var4 != null) {
                            class28 var5 = new class28(var4, false, true, class53.method455(true, super.field1251), 584);
                            var5.method343(0, 0, -super.field1254, (byte) 8);
                            var5.method337(4);
                            var5.method338(false, var3.field763.field1115[super.field1251]);
                            var5.field849 = null;
                            var5.field848 = null;
                            if (var3.field766 != 128 || var3.field767 != 128) {
                                var5.method346(var3.field766, var3.field766, -480, var3.field767);
                            }
                            var5.method347(var3.field769 + 64, var3.field770 + 850, -30, -50, -30, true);
                            class28[] var6 = new class28[] { var2, var5 };
                            var2 = new class28(false, var6, true, 2);
                        }
                    }
                    if (this.field1623 != null) {
                        if (client.field282 >= this.field1639) {
                            this.field1623 = null;
                        }
                        if (client.field282 >= this.field1638 && client.field282 < this.field1639) {
                            class28 var7 = this.field1623;
                            var7.method343(this.field1620 - super.field1255, this.field1622 - super.field1256, this.field1621 - this.field1616, (byte) 8);
                            if (super.field1302 == 512) {
                                var7.method341(-186);
                                var7.method341(-186);
                                var7.method341(-186);
                            } else if (super.field1302 == 1024) {
                                var7.method341(-186);
                                var7.method341(-186);
                            } else if (super.field1302 == 1536) {
                                var7.method341(-186);
                            }
                            class28[] var8 = new class28[] { var2, var7 };
                            var2 = new class28(false, var8, true, 2);
                            if (super.field1302 == 512) {
                                var7.method341(-186);
                            } else if (super.field1302 == 1024) {
                                var7.method341(-186);
                                var7.method341(-186);
                            } else if (super.field1302 == 1536) {
                                var7.method341(-186);
                                var7.method341(-186);
                                var7.method341(-186);
                            }
                            var7.method343(super.field1255 - this.field1620, super.field1256 - this.field1622, this.field1616 - this.field1621, (byte) 8);
                        }
                    }
                    var2.field850 = true;
                    if (arg0 == 0) {
                        boolean var9 = false;
                    } else {
                        for (int var10 = 1; var10 > 0; ++var10) {
                        }
                    }
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!YFPQHQAV", name = "b", descriptor = "(Z)LKUGNQTGL;")
    private final class28 method549(boolean arg0) {
        if (this.field1612 != null) {
            int var2 = -1;
            if (super.field1279 >= 0 && super.field1282 == 0) {
                var2 = class37.field1113[super.field1279].field1115[super.field1280];
            } else if (super.field1276 >= 0) {
                var2 = class37.field1113[super.field1276].field1115[super.field1277];
            }
            return this.field1612.method435(9, var2, -1, (int[]) null);
        } else {
            long var4 = this.field1631;
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (arg0) {
                throw new NullPointerException();
            } else {
                if (super.field1279 >= 0 && super.field1282 == 0) {
                    class37 var10 = class37.field1113[super.field1279];
                    var6 = var10.field1115[super.field1280];
                    if (super.field1276 >= 0 && super.field1288 != super.field1276) {
                        var7 = class37.field1113[super.field1276].field1115[super.field1277];
                    }
                    if (var10.field1122 >= 0) {
                        var8 = var10.field1122;
                        var4 += (long) (var8 - this.field1627[5] << 8);
                    }
                    if (var10.field1123 >= 0) {
                        var9 = var10.field1123;
                        var4 += (long) (var9 - this.field1627[3] << 16);
                    }
                } else if (super.field1276 >= 0) {
                    var6 = class37.field1113[super.field1276].field1115[super.field1277];
                }
                class28 var11 = (class28) field1614.method198(var4);
                if (var11 == null) {
                    boolean var12 = false;
                    for (int var13 = 0; var13 < 12; ++var13) {
                        int var14 = this.field1627[var13];
                        if (var9 >= 0 && var13 == 3) {
                            var14 = var9;
                        }
                        if (var8 >= 0 && var13 == 5) {
                            var14 = var8;
                        }
                        if (var14 >= 256 && var14 < 512 && !class64.field1598[var14 - 256].method540(true)) {
                            var12 = true;
                        }
                        if (var14 >= 512 && !class34.method390(var14 - 512).method387(this.field1640, (byte) 9)) {
                            var12 = true;
                        }
                    }
                    if (var12) {
                        if (this.field1632 != -1L) {
                            var11 = (class28) field1614.method198(this.field1632);
                        }
                        if (var11 == null) {
                            return null;
                        }
                    }
                }
                if (var11 == null) {
                    class28[] var15 = new class28[12];
                    int var16 = 0;
                    for (int var17 = 0; var17 < 12; ++var17) {
                        int var19 = this.field1627[var17];
                        if (var9 >= 0 && var17 == 3) {
                            var19 = var9;
                        }
                        if (var8 >= 0 && var17 == 5) {
                            var19 = var8;
                        }
                        if (var19 >= 256 && var19 < 512) {
                            class28 var20 = class64.field1598[var19 - 256].method541(0);
                            if (var20 != null) {
                                var15[var16++] = var20;
                            }
                        }
                        if (var19 >= 512) {
                            class28 var21 = class34.method390(var19 - 512).method379(this.field1619, this.field1640);
                            if (var21 != null) {
                                var15[var16++] = var21;
                            }
                        }
                    }
                    var11 = new class28(var16, var15, 127);
                    for (int var18 = 0; var18 < 5; ++var18) {
                        if (this.field1615[var18] != 0) {
                            var11.method344(client.field478[var18][0], client.field478[var18][this.field1615[var18]]);
                            if (var18 == 1) {
                                var11.method344(client.field215[0], client.field215[this.field1615[var18]]);
                            }
                        }
                    }
                    var11.method337(4);
                    var11.method347(64, 850, -30, -50, -30, true);
                    field1614.method199(var4, var11, this.field1618);
                    this.field1632 = var4;
                }
                if (this.field1613) {
                    return var11;
                } else {
                    class28 var22 = class28.field813;
                    var22.method332(class53.method455(true, var6) & class53.method455(true, var7), this.field1633, var11);
                    if (var6 != -1 && var7 != -1) {
                        var22.method339(var6, var7, class37.field1113[super.field1279].field1119, (byte) 7);
                    } else if (var6 != -1) {
                        var22.method338(false, var6);
                    }
                    var22.method334(555);
                    var22.field849 = null;
                    var22.field848 = null;
                    return var22;
                }
            }
        }
    }
}
