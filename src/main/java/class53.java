import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("QAJCAYDZ")
public class class53 extends class71 {

    @OriginalMember(owner = "QAJCAYDZ", name = "wb", descriptor = "B")
    private byte field1444 = 5;

    @OriginalMember(owner = "QAJCAYDZ", name = "xb", descriptor = "I")
    private int field1445 = 5131;

    @OriginalMember(owner = "QAJCAYDZ", name = "yb", descriptor = "J")
    public long field1446 = -1L;

    @OriginalMember(owner = "QAJCAYDZ", name = "zb", descriptor = "I")
    public int field1447 = -1;

    @OriginalMember(owner = "QAJCAYDZ", name = "Ab", descriptor = "I")
    public int field1448 = -1;

    @OriginalMember(owner = "QAJCAYDZ", name = "Cb", descriptor = "Z")
    private boolean field1450 = true;

    @OriginalMember(owner = "QAJCAYDZ", name = "Fb", descriptor = "Z")
    public boolean field1453 = false;

    @OriginalMember(owner = "QAJCAYDZ", name = "Lb", descriptor = "[I")
    public int[] field1459 = new int[12];

    @OriginalMember(owner = "QAJCAYDZ", name = "Pb", descriptor = "[I")
    public int[] field1463 = new int[5];

    @OriginalMember(owner = "QAJCAYDZ", name = "Qb", descriptor = "Z")
    public boolean field1464 = false;

    @OriginalMember(owner = "QAJCAYDZ", name = "Gb", descriptor = "LAKUDQPZE;")
    public static class1 field1454 = new class1((byte) 8, 260);

    @OriginalMember(owner = "QAJCAYDZ", name = "sb", descriptor = "I")
    public int field1440;

    @OriginalMember(owner = "QAJCAYDZ", name = "tb", descriptor = "I")
    public int field1441;

    @OriginalMember(owner = "QAJCAYDZ", name = "ub", descriptor = "I")
    public int field1442;

    @OriginalMember(owner = "QAJCAYDZ", name = "vb", descriptor = "I")
    public int field1443;

    @OriginalMember(owner = "QAJCAYDZ", name = "Db", descriptor = "I")
    public int field1451;

    @OriginalMember(owner = "QAJCAYDZ", name = "Eb", descriptor = "I")
    public int field1452;

    @OriginalMember(owner = "QAJCAYDZ", name = "Hb", descriptor = "I")
    public int field1455;

    @OriginalMember(owner = "QAJCAYDZ", name = "Ib", descriptor = "I")
    public int field1456;

    @OriginalMember(owner = "QAJCAYDZ", name = "Jb", descriptor = "I")
    public int field1457;

    @OriginalMember(owner = "QAJCAYDZ", name = "Mb", descriptor = "I")
    public int field1460;

    @OriginalMember(owner = "QAJCAYDZ", name = "Nb", descriptor = "I")
    public int field1461;

    @OriginalMember(owner = "QAJCAYDZ", name = "Sb", descriptor = "I")
    public int field1466;

    @OriginalMember(owner = "QAJCAYDZ", name = "Tb", descriptor = "I")
    public int field1467;

    @OriginalMember(owner = "QAJCAYDZ", name = "Ub", descriptor = "I")
    public int field1468;

    @OriginalMember(owner = "QAJCAYDZ", name = "Bb", descriptor = "J")
    public long field1449;

    @OriginalMember(owner = "QAJCAYDZ", name = "Rb", descriptor = "LAUWOQLEO;")
    public class2 field1465;

    @OriginalMember(owner = "QAJCAYDZ", name = "Kb", descriptor = "LIGXVZOHI;")
    public class32 field1458;

    @OriginalMember(owner = "QAJCAYDZ", name = "Ob", descriptor = "Ljava/lang/String;")
    public String field1462;

    @OriginalMember(owner = "QAJCAYDZ", name = "c", descriptor = "(I)LIGXVZOHI;")
    public final class32 method519(int arg0) {
        if (!this.field1453) {
            return null;
        } else if (this.field1465 != null) {
            return this.field1465.method11((byte) 5);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var12 = this.field1459[var3];
                if (var12 >= 256 && var12 < 512 && !class72.field1755[var12 - 256].method599(true)) {
                    var2 = true;
                }
                if (var12 >= 512 && !class65.method560(var12 - 512).method564(this.field1466, -910)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                class32[] var4 = new class32[12];
                int var5 = 0;
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var9 = this.field1459[var6];
                    if (var9 >= 256 && var9 < 512) {
                        class32 var10 = class72.field1755[var9 - 256].method600(true);
                        if (var10 != null) {
                            var4[var5++] = var10;
                        }
                    }
                    if (var9 >= 512) {
                        class32 var11 = class65.method560(var9 - 512).method562(this.field1466, -2608);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                }
                class32 var7 = new class32(true, var5, var4);
                if (arg0 != 130) {
                    throw new NullPointerException();
                } else {
                    for (int var8 = 0; var8 < 5; ++var8) {
                        if (this.field1463[var8] != 0) {
                            var7.method368(client.field444[var8][0], client.field444[var8][this.field1463[var8]]);
                            if (var8 == 1) {
                                var7.method368(client.field526[0], client.field526[this.field1463[var8]]);
                            }
                        }
                    }
                    return var7;
                }
            }
        }
    }

    @OriginalMember(owner = "QAJCAYDZ", name = "a", descriptor = "(I)LIGXVZOHI;")
    public final class32 method25(int arg0) {
        if (!this.field1453) {
            return null;
        } else {
            class32 var2 = this.method520((byte) 5);
            if (var2 == null) {
                return null;
            } else {
                super.field1715 = var2.field63;
                if (arg0 != 47492) {
                    throw new NullPointerException();
                } else {
                    var2.field971 = true;
                    if (this.field1464) {
                        return var2;
                    } else {
                        if (super.field1747 != -1 && super.field1748 != -1) {
                            class62 var3 = class62.field1570[super.field1747];
                            class32 var4 = var3.method555();
                            if (var4 != null) {
                                class32 var5 = new class32(true, var4, false, class31.method349(super.field1748, this.field1445), (byte) 1);
                                var5.method367((byte) 10, 0, 0, -super.field1751);
                                var5.method361(6);
                                var5.method362(33114, var3.field1574.field69[super.field1748]);
                                var5.field970 = null;
                                var5.field969 = null;
                                if (var3.field1577 != 128 || var3.field1578 != 128) {
                                    var5.method370(var3.field1577, var3.field1578, false, var3.field1577);
                                }
                                var5.method371(var3.field1580 + 64, var3.field1581 + 850, -30, -50, -30, true);
                                class32[] var6 = new class32[] { var2, var5 };
                                var2 = new class32(2, var6, true, (byte) 63);
                            }
                        }
                        if (this.field1458 != null) {
                            if (client.field147 >= this.field1452) {
                                this.field1458 = null;
                            }
                            if (client.field147 >= this.field1451 && client.field147 < this.field1452) {
                                class32 var7 = this.field1458;
                                var7.method367((byte) 10, this.field1455 - super.field1721, this.field1457 - super.field1722, this.field1456 - this.field1461);
                                if (super.field1720 == 512) {
                                    var7.method365(262);
                                    var7.method365(262);
                                    var7.method365(262);
                                } else if (super.field1720 == 1024) {
                                    var7.method365(262);
                                    var7.method365(262);
                                } else if (super.field1720 == 1536) {
                                    var7.method365(262);
                                }
                                class32[] var8 = new class32[] { var2, var7 };
                                var2 = new class32(2, var8, true, (byte) 63);
                                if (super.field1720 == 512) {
                                    var7.method365(262);
                                } else if (super.field1720 == 1024) {
                                    var7.method365(262);
                                    var7.method365(262);
                                } else if (super.field1720 == 1536) {
                                    var7.method365(262);
                                    var7.method365(262);
                                    var7.method365(262);
                                }
                                var7.method367((byte) 10, super.field1721 - this.field1455, super.field1722 - this.field1457, this.field1461 - this.field1456);
                            }
                        }
                        var2.field971 = true;
                        return var2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "QAJCAYDZ", name = "a", descriptor = "(B)LIGXVZOHI;")
    private final class32 method520(byte arg0) {
        if (this.field1465 != null) {
            int var2 = -1;
            if (super.field1694 >= 0 && super.field1697 == 0) {
                var2 = class5.field67[super.field1694].field69[super.field1695];
            } else if (super.field1741 >= 0) {
                var2 = class5.field67[super.field1741].field69[super.field1742];
            }
            return this.field1465.method7((byte) 15, -1, var2, (int[]) null);
        } else {
            long var4 = this.field1449;
            if (arg0 != 5) {
                throw new NullPointerException();
            } else {
                boolean var6 = false;
                int var7 = -1;
                int var8 = -1;
                int var9 = -1;
                int var10 = -1;
                if (super.field1694 >= 0 && super.field1697 == 0) {
                    class5 var11 = class5.field67[super.field1694];
                    var7 = var11.field69[super.field1695];
                    if (super.field1741 >= 0 && super.field1741 != super.field1718) {
                        var8 = class5.field67[super.field1741].field69[super.field1742];
                    }
                    if (var11.field76 >= 0) {
                        var9 = var11.field76;
                        var4 += (long) (var9 - this.field1459[5] << 8);
                    }
                    if (var11.field77 >= 0) {
                        var10 = var11.field77;
                        var4 += (long) (var10 - this.field1459[3] << 16);
                    }
                } else if (super.field1741 >= 0) {
                    var7 = class5.field67[super.field1741].field69[super.field1742];
                }
                class32 var12 = (class32) field1454.method1(var4);
                if (var12 == null) {
                    boolean var13 = false;
                    for (int var14 = 0; var14 < 12; ++var14) {
                        int var15 = this.field1459[var14];
                        if (var10 >= 0 && var14 == 3) {
                            var15 = var10;
                        }
                        if (var9 >= 0 && var14 == 5) {
                            var15 = var9;
                        }
                        if (var15 >= 256 && var15 < 512 && !class72.field1755[var15 - 256].method597((byte) 108)) {
                            var13 = true;
                        }
                        if (var15 >= 512 && !class65.method560(var15 - 512).method559(this.field1466, true)) {
                            var13 = true;
                        }
                    }
                    if (var13) {
                        if (this.field1446 != -1L) {
                            var12 = (class32) field1454.method1(this.field1446);
                        }
                        if (var12 == null) {
                            return null;
                        }
                    }
                }
                if (var12 == null) {
                    class32[] var16 = new class32[12];
                    int var17 = 0;
                    for (int var18 = 0; var18 < 12; ++var18) {
                        int var20 = this.field1459[var18];
                        if (var10 >= 0 && var18 == 3) {
                            var20 = var10;
                        }
                        if (var9 >= 0 && var18 == 5) {
                            var20 = var9;
                        }
                        if (var20 >= 256 && var20 < 512) {
                            class32 var21 = class72.field1755[var20 - 256].method598(this.field1444);
                            if (var21 != null) {
                                var16[var17++] = var21;
                            }
                        }
                        if (var20 >= 512) {
                            class32 var22 = class65.method560(var20 - 512).method569(this.field1466, 5);
                            if (var22 != null) {
                                var16[var17++] = var22;
                            }
                        }
                    }
                    var12 = new class32(true, var17, var16);
                    for (int var19 = 0; var19 < 5; ++var19) {
                        if (this.field1463[var19] != 0) {
                            var12.method368(client.field444[var19][0], client.field444[var19][this.field1463[var19]]);
                            if (var19 == 1) {
                                var12.method368(client.field526[0], client.field526[this.field1463[var19]]);
                            }
                        }
                    }
                    var12.method361(6);
                    var12.method371(64, 850, -30, -50, -30, true);
                    field1454.method2(var12, false, var4);
                    this.field1446 = var4;
                }
                if (this.field1464) {
                    return var12;
                } else {
                    class32 var23 = class32.field933;
                    var23.method356(false, var12, class31.method349(var7, this.field1445) & class31.method349(var8, this.field1445));
                    if (var7 != -1 && var8 != -1) {
                        var23.method363(class5.field67[super.field1694].field73, var8, var7, true);
                    } else if (var7 != -1) {
                        var23.method362(33114, var7);
                    }
                    var23.method358(856);
                    var23.field970 = null;
                    var23.field969 = null;
                    return var23;
                }
            }
        }
    }

    @OriginalMember(owner = "QAJCAYDZ", name = "a", descriptor = "(Z)Z")
    public final boolean method29(boolean arg0) {
        if (!arg0) {
            this.field1445 = -317;
        }
        return this.field1453;
    }

    @OriginalMember(owner = "QAJCAYDZ", name = "a", descriptor = "(LEGCCHUZS;I)V")
    public final void method521(class15 arg0, int arg1) {
        arg0.field709 = 0;
        this.field1466 = arg0.method261();
        this.field1447 = arg0.method262();
        this.field1448 = arg0.method262();
        this.field1465 = null;
        this.field1468 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg0.method261();
            if (var4 == 0) {
                this.field1459[var3] = 0;
            } else {
                int var5 = arg0.method261();
                this.field1459[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field1459[0] == 65535) {
                    this.field1465 = class2.method9(arg0.method263());
                    break;
                }
                if (this.field1459[var3] >= 512 && this.field1459[var3] - 512 < class65.field1621) {
                    int var11 = class65.method560(this.field1459[var3] - 512).field1619;
                    if (var11 != 0) {
                        this.field1468 = var11;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var10 = arg0.method261();
            if (var10 < 0 || var10 >= client.field444[var6].length) {
                var10 = 0;
            }
            this.field1463[var6] = var10;
        }
        super.field1718 = arg0.method263();
        if (super.field1718 == 65535) {
            super.field1718 = -1;
        }
        super.field1719 = arg0.method263();
        if (super.field1719 == 65535) {
            super.field1719 = -1;
        }
        super.field1702 = arg0.method263();
        if (super.field1702 == 65535) {
            super.field1702 = -1;
        }
        super.field1703 = arg0.method263();
        if (super.field1703 == 65535) {
            super.field1703 = -1;
        }
        super.field1704 = arg0.method263();
        if (super.field1704 == 65535) {
            super.field1704 = -1;
        }
        super.field1705 = arg0.method263();
        int var7 = 4 / arg1;
        if (super.field1705 == 65535) {
            super.field1705 = -1;
        }
        super.field1736 = arg0.method263();
        if (super.field1736 == 65535) {
            super.field1736 = -1;
        }
        this.field1462 = class67.method578(class67.method575(false, arg0.method267(false)), (byte) -85);
        this.field1467 = arg0.method261();
        this.field1460 = arg0.method263();
        this.field1453 = true;
        this.field1449 = 0L;
        for (int var8 = 0; var8 < 12; ++var8) {
            this.field1449 <<= 4;
            if (this.field1459[var8] >= 256) {
                this.field1449 += (long) (this.field1459[var8] - 256);
            }
        }
        if (this.field1459[0] >= 256) {
            this.field1449 += (long) (this.field1459[0] - 256 >> 4);
        }
        if (this.field1459[1] >= 256) {
            this.field1449 += (long) (this.field1459[1] - 256 >> 8);
        }
        for (int var9 = 0; var9 < 5; ++var9) {
            this.field1449 <<= 3;
            this.field1449 += (long) this.field1463[var9];
        }
        this.field1449 <<= 1;
        this.field1449 += (long) this.field1466;
    }
}
