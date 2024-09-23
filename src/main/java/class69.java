import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YNSPIQRH")
public class class69 extends class60 {

    @OriginalMember(owner = "YNSPIQRH", name = "tb", descriptor = "J")
    public long field1647 = -1L;

    @OriginalMember(owner = "YNSPIQRH", name = "ub", descriptor = "[I")
    public int[] field1648 = new int[5];

    @OriginalMember(owner = "YNSPIQRH", name = "vb", descriptor = "Z")
    private boolean field1649 = false;

    @OriginalMember(owner = "YNSPIQRH", name = "Ab", descriptor = "Z")
    private boolean field1654 = true;

    @OriginalMember(owner = "YNSPIQRH", name = "Db", descriptor = "Z")
    private boolean field1657 = false;

    @OriginalMember(owner = "YNSPIQRH", name = "Jb", descriptor = "I")
    private int field1663 = 543;

    @OriginalMember(owner = "YNSPIQRH", name = "Kb", descriptor = "I")
    private int field1664 = 8;

    @OriginalMember(owner = "YNSPIQRH", name = "Pb", descriptor = "[I")
    public int[] field1669 = new int[12];

    @OriginalMember(owner = "YNSPIQRH", name = "Rb", descriptor = "Z")
    public boolean field1671 = false;

    @OriginalMember(owner = "YNSPIQRH", name = "Tb", descriptor = "Z")
    public boolean field1673 = false;

    @OriginalMember(owner = "YNSPIQRH", name = "Bb", descriptor = "LTUCAQTOR;")
    public static class58 field1655 = new class58(-37, 260);

    @OriginalMember(owner = "YNSPIQRH", name = "qb", descriptor = "I")
    public int field1644;

    @OriginalMember(owner = "YNSPIQRH", name = "rb", descriptor = "I")
    public int field1645;

    @OriginalMember(owner = "YNSPIQRH", name = "wb", descriptor = "I")
    public int field1650;

    @OriginalMember(owner = "YNSPIQRH", name = "xb", descriptor = "I")
    public int field1651;

    @OriginalMember(owner = "YNSPIQRH", name = "yb", descriptor = "I")
    public int field1652;

    @OriginalMember(owner = "YNSPIQRH", name = "Cb", descriptor = "I")
    public int field1656;

    @OriginalMember(owner = "YNSPIQRH", name = "Fb", descriptor = "I")
    public int field1659;

    @OriginalMember(owner = "YNSPIQRH", name = "Gb", descriptor = "I")
    public int field1660;

    @OriginalMember(owner = "YNSPIQRH", name = "Hb", descriptor = "I")
    public int field1661;

    @OriginalMember(owner = "YNSPIQRH", name = "Ib", descriptor = "I")
    public int field1662;

    @OriginalMember(owner = "YNSPIQRH", name = "Mb", descriptor = "I")
    public int field1666;

    @OriginalMember(owner = "YNSPIQRH", name = "Nb", descriptor = "I")
    public int field1667;

    @OriginalMember(owner = "YNSPIQRH", name = "Ob", descriptor = "I")
    public int field1668;

    @OriginalMember(owner = "YNSPIQRH", name = "Qb", descriptor = "I")
    public int field1670;

    @OriginalMember(owner = "YNSPIQRH", name = "Sb", descriptor = "I")
    public int field1672;

    @OriginalMember(owner = "YNSPIQRH", name = "Eb", descriptor = "J")
    public long field1658;

    @OriginalMember(owner = "YNSPIQRH", name = "zb", descriptor = "LGEUHTGZJ;")
    public class17 field1653;

    @OriginalMember(owner = "YNSPIQRH", name = "sb", descriptor = "LUGDYQAXI;")
    public class59 field1646;

    @OriginalMember(owner = "YNSPIQRH", name = "Lb", descriptor = "Ljava/lang/String;")
    public String field1665;

    @OriginalMember(owner = "YNSPIQRH", name = "c", descriptor = "(I)LGEUHTGZJ;")
    private final class17 method592(int arg0) {
        if (this.field1646 != null) {
            int var2 = -1;
            if (super.field1552 >= 0 && super.field1555 == 0) {
                var2 = class9.field682[super.field1552].field684[super.field1553];
            } else if (super.field1567 >= 0) {
                var2 = class9.field682[super.field1567].field684[super.field1568];
            }
            return this.field1646.method575(-1, var2, (byte) -101, (int[]) null);
        } else {
            long var4 = this.field1658;
            if (arg0 != -35311) {
                this.field1654 = !this.field1654;
            }
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (super.field1552 >= 0 && super.field1555 == 0) {
                class9 var10 = class9.field682[super.field1552];
                var6 = var10.field684[super.field1553];
                if (super.field1567 >= 0 && super.field1567 != super.field1545) {
                    var7 = class9.field682[super.field1567].field684[super.field1568];
                }
                if (var10.field691 >= 0) {
                    var8 = var10.field691;
                    var4 += (long) (var8 - this.field1669[5] << 8);
                }
                if (var10.field692 >= 0) {
                    var9 = var10.field692;
                    var4 += (long) (var9 - this.field1669[3] << 16);
                }
            } else if (super.field1567 >= 0) {
                var6 = class9.field682[super.field1567].field684[super.field1568];
            }
            class17 var11 = (class17) field1655.method566(var4);
            if (var11 == null) {
                boolean var12 = false;
                for (int var13 = 0; var13 < 12; ++var13) {
                    int var14 = this.field1669[var13];
                    if (var9 >= 0 && var13 == 3) {
                        var14 = var9;
                    }
                    if (var8 >= 0 && var13 == 5) {
                        var14 = var8;
                    }
                    if (var14 >= 256 && var14 < 512 && !class43.field1243[var14 - 256].method470(0)) {
                        var12 = true;
                    }
                    if (var14 >= 512 && !class15.method278(var14 - 512).method272((byte) 9, this.field1672)) {
                        var12 = true;
                    }
                }
                if (var12) {
                    if (this.field1647 != -1L) {
                        var11 = (class17) field1655.method566(this.field1647);
                    }
                    if (var11 == null) {
                        return null;
                    }
                }
            }
            if (var11 == null) {
                class17[] var15 = new class17[12];
                int var16 = 0;
                for (int var17 = 0; var17 < 12; ++var17) {
                    int var19 = this.field1669[var17];
                    if (var9 >= 0 && var17 == 3) {
                        var19 = var9;
                    }
                    if (var8 >= 0 && var17 == 5) {
                        var19 = var8;
                    }
                    if (var19 >= 256 && var19 < 512) {
                        class17 var20 = class43.field1243[var19 - 256].method471((byte) -23);
                        if (var20 != null) {
                            var15[var16++] = var20;
                        }
                    }
                    if (var19 >= 512) {
                        class17 var21 = class15.method278(var19 - 512).method274(this.field1672, -908);
                        if (var21 != null) {
                            var15[var16++] = var21;
                        }
                    }
                }
                var11 = new class17(var15, false, var16);
                for (int var18 = 0; var18 < 5; ++var18) {
                    if (this.field1648[var18] != 0) {
                        var11.method299(client.field570[var18][0], client.field570[var18][this.field1648[var18]]);
                        if (var18 == 1) {
                            var11.method299(client.field575[0], client.field575[this.field1648[var18]]);
                        }
                    }
                }
                var11.method292(-20376);
                var11.method302(64, 850, -30, -50, -30, true);
                field1655.method567(true, var11, var4);
                this.field1647 = var4;
            }
            if (this.field1673) {
                return var11;
            } else {
                class17 var22 = class17.field807;
                var22.method287(var11, 208, class48.method504(var6, 3) & class48.method504(var7, 3));
                if (var6 != -1 && var7 != -1) {
                    var22.method294(var6, class9.field682[super.field1552].field688, -929, var7);
                } else if (var6 != -1) {
                    var22.method293((byte) 1, var6);
                }
                var22.method289(-24);
                var22.field844 = null;
                var22.field843 = null;
                return var22;
            }
        }
    }

    @OriginalMember(owner = "YNSPIQRH", name = "a", descriptor = "(LKHOMSBHW;Z)V")
    public final void method593(class30 arg0, boolean arg1) {
        arg0.field1065 = 0;
        this.field1672 = arg0.method349();
        this.field1644 = arg0.method349();
        this.field1646 = null;
        this.field1666 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg0.method349();
            if (var4 == 0) {
                this.field1669[var3] = 0;
            } else {
                int var5 = arg0.method349();
                this.field1669[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field1669[0] == 65535) {
                    this.field1646 = class59.method570(arg0.method351());
                    break;
                }
                if (this.field1669[var3] >= 512 && this.field1669[var3] - 512 < class15.field746) {
                    int var10 = class15.method278(this.field1669[var3] - 512).field765;
                    if (var10 != 0) {
                        this.field1666 = var10;
                    }
                }
            }
        }
        if (!arg1) {
            this.field1654 = !this.field1654;
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var9 = arg0.method349();
            if (var9 < 0 || var9 >= client.field570[var6].length) {
                var9 = 0;
            }
            this.field1648[var6] = var9;
        }
        super.field1545 = arg0.method351();
        if (super.field1545 == 65535) {
            super.field1545 = -1;
        }
        super.field1546 = arg0.method351();
        if (super.field1546 == 65535) {
            super.field1546 = -1;
        }
        super.field1560 = arg0.method351();
        if (super.field1560 == 65535) {
            super.field1560 = -1;
        }
        super.field1561 = arg0.method351();
        if (super.field1561 == 65535) {
            super.field1561 = -1;
        }
        super.field1562 = arg0.method351();
        if (super.field1562 == 65535) {
            super.field1562 = -1;
        }
        super.field1563 = arg0.method351();
        if (super.field1563 == 65535) {
            super.field1563 = -1;
        }
        super.field1583 = arg0.method351();
        if (super.field1583 == 65535) {
            super.field1583 = -1;
        }
        this.field1665 = class61.method584(true, class61.method581(arg0.method355(true), 581));
        this.field1645 = arg0.method349();
        this.field1670 = arg0.method351();
        this.field1671 = true;
        this.field1658 = 0L;
        for (int var7 = 0; var7 < 12; ++var7) {
            this.field1658 <<= 4;
            if (this.field1669[var7] >= 256) {
                this.field1658 += (long) (this.field1669[var7] - 256);
            }
        }
        if (this.field1669[0] >= 256) {
            this.field1658 += (long) (this.field1669[0] - 256 >> 4);
        }
        if (this.field1669[1] >= 256) {
            this.field1658 += (long) (this.field1669[1] - 256 >> 8);
        }
        for (int var8 = 0; var8 < 5; ++var8) {
            this.field1658 <<= 3;
            this.field1658 += (long) this.field1648[var8];
        }
        this.field1658 <<= 1;
        this.field1658 += (long) this.field1672;
    }

    @OriginalMember(owner = "YNSPIQRH", name = "b", descriptor = "(I)Z")
    public final boolean method263(int arg0) {
        if (arg0 != 6) {
            this.field1663 = -93;
        }
        return this.field1671;
    }

    @OriginalMember(owner = "YNSPIQRH", name = "a", descriptor = "(B)LGEUHTGZJ;")
    public final class17 method221(byte arg0) {
        if (!this.field1671) {
            return null;
        } else {
            class17 var2 = this.method592(-35311);
            if (arg0 != -43) {
                for (int var3 = 1; var3 > 0; ++var3) {
                }
            }
            if (var2 == null) {
                return null;
            } else {
                super.field1566 = var2.field639;
                var2.field845 = true;
                if (this.field1673) {
                    return var2;
                } else {
                    if (super.field1584 != -1 && super.field1585 != -1) {
                        class22 var4 = class22.field913[super.field1584];
                        class17 var5 = var4.method323();
                        if (var5 != null) {
                            class17 var6 = new class17((byte) -59, class48.method504(super.field1585, 3), var5, false, true);
                            var6.method298(0, 0, -super.field1588, 0);
                            var6.method292(-20376);
                            var6.method293((byte) 1, var4.field917.field684[super.field1585]);
                            var6.field844 = null;
                            var6.field843 = null;
                            if (var4.field920 != 128 || var4.field921 != 128) {
                                var6.method301(var4.field921, var4.field920, (byte) 9, var4.field920);
                            }
                            var6.method302(var4.field923 + 64, var4.field924 + 850, -30, -50, -30, true);
                            class17[] var7 = new class17[] { var2, var6 };
                            var2 = new class17(var7, 2, true, 37504);
                        }
                    }
                    if (this.field1653 != null) {
                        if (client.field464 >= this.field1668) {
                            this.field1653 = null;
                        }
                        if (client.field464 >= this.field1667 && client.field464 < this.field1668) {
                            class17 var8 = this.field1653;
                            var8.method298(0, this.field1650 - super.field1539, this.field1651 - this.field1656, this.field1652 - super.field1540);
                            if (super.field1557 == 512) {
                                var8.method296(this.field1664);
                                var8.method296(this.field1664);
                                var8.method296(this.field1664);
                            } else if (super.field1557 == 1024) {
                                var8.method296(this.field1664);
                                var8.method296(this.field1664);
                            } else if (super.field1557 == 1536) {
                                var8.method296(this.field1664);
                            }
                            class17[] var9 = new class17[] { var2, var8 };
                            var2 = new class17(var9, 2, true, 37504);
                            if (super.field1557 == 512) {
                                var8.method296(this.field1664);
                            } else if (super.field1557 == 1024) {
                                var8.method296(this.field1664);
                                var8.method296(this.field1664);
                            } else if (super.field1557 == 1536) {
                                var8.method296(this.field1664);
                                var8.method296(this.field1664);
                                var8.method296(this.field1664);
                            }
                            var8.method298(0, super.field1539 - this.field1650, this.field1656 - this.field1651, super.field1540 - this.field1652);
                        }
                    }
                    var2.field845 = true;
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "YNSPIQRH", name = "d", descriptor = "(I)LGEUHTGZJ;")
    public final class17 method594(int arg0) {
        if (!this.field1671) {
            return null;
        } else if (this.field1646 != null) {
            return this.field1646.method571(this.field1663);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var12 = this.field1669[var3];
                if (var12 >= 256 && var12 < 512 && !class43.field1243[var12 - 256].method472(this.field1649)) {
                    var2 = true;
                }
                if (var12 >= 512 && !class15.method278(var12 - 512).method268(this.field1672, true)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                class17[] var4 = new class17[12];
                int var5 = 0;
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var9 = this.field1669[var6];
                    if (var9 >= 256 && var9 < 512) {
                        class17 var10 = class43.field1243[var9 - 256].method473(this.field1657);
                        if (var10 != null) {
                            var4[var5++] = var10;
                        }
                    }
                    if (var9 >= 512) {
                        class17 var11 = class15.method278(var9 - 512).method270(false, this.field1672);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                }
                if (arg0 != 6) {
                    this.field1663 = 337;
                }
                class17 var7 = new class17(var4, false, var5);
                for (int var8 = 0; var8 < 5; ++var8) {
                    if (this.field1648[var8] != 0) {
                        var7.method299(client.field570[var8][0], client.field570[var8][this.field1648[var8]]);
                        if (var8 == 1) {
                            var7.method299(client.field575[0], client.field575[this.field1648[var8]]);
                        }
                    }
                }
                return var7;
            }
        }
    }
}
