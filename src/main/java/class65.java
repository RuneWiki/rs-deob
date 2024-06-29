import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!XVMRCEYW")
public class class65 extends class64 {

    @OriginalMember(owner = "client!XVMRCEYW", name = "wb", descriptor = "Z")
    public boolean field1593 = false;

    @OriginalMember(owner = "client!XVMRCEYW", name = "Cb", descriptor = "I")
    private int field1599 = -479;

    @OriginalMember(owner = "client!XVMRCEYW", name = "Gb", descriptor = "[I")
    public int[] field1603 = new int[12];

    @OriginalMember(owner = "client!XVMRCEYW", name = "Mb", descriptor = "J")
    public long field1609 = -1L;

    @OriginalMember(owner = "client!XVMRCEYW", name = "Ob", descriptor = "I")
    public int field1611 = -1;

    @OriginalMember(owner = "client!XVMRCEYW", name = "Rb", descriptor = "[I")
    public int[] field1614 = new int[5];

    @OriginalMember(owner = "client!XVMRCEYW", name = "Sb", descriptor = "I")
    public int field1615 = -1;

    @OriginalMember(owner = "client!XVMRCEYW", name = "Ub", descriptor = "Z")
    public boolean field1617 = false;

    @OriginalMember(owner = "client!XVMRCEYW", name = "Hb", descriptor = "LULDYKUPK;")
    public static class57 field1604 = new class57(260, 0);

    @OriginalMember(owner = "client!XVMRCEYW", name = "ub", descriptor = "I")
    public int field1591;

    @OriginalMember(owner = "client!XVMRCEYW", name = "vb", descriptor = "I")
    private int field1592;

    @OriginalMember(owner = "client!XVMRCEYW", name = "xb", descriptor = "I")
    public int field1594;

    @OriginalMember(owner = "client!XVMRCEYW", name = "yb", descriptor = "I")
    public int field1595;

    @OriginalMember(owner = "client!XVMRCEYW", name = "zb", descriptor = "I")
    public int field1596;

    @OriginalMember(owner = "client!XVMRCEYW", name = "Eb", descriptor = "I")
    public int field1601;

    @OriginalMember(owner = "client!XVMRCEYW", name = "Fb", descriptor = "I")
    public int field1602;

    @OriginalMember(owner = "client!XVMRCEYW", name = "Ib", descriptor = "I")
    public int field1605;

    @OriginalMember(owner = "client!XVMRCEYW", name = "Jb", descriptor = "I")
    public int field1606;

    @OriginalMember(owner = "client!XVMRCEYW", name = "Kb", descriptor = "I")
    public int field1607;

    @OriginalMember(owner = "client!XVMRCEYW", name = "Lb", descriptor = "I")
    public int field1608;

    @OriginalMember(owner = "client!XVMRCEYW", name = "Nb", descriptor = "I")
    public int field1610;

    @OriginalMember(owner = "client!XVMRCEYW", name = "Qb", descriptor = "I")
    public int field1613;

    @OriginalMember(owner = "client!XVMRCEYW", name = "Tb", descriptor = "I")
    public int field1616;

    @OriginalMember(owner = "client!XVMRCEYW", name = "Vb", descriptor = "I")
    public int field1618;

    @OriginalMember(owner = "client!XVMRCEYW", name = "Db", descriptor = "J")
    public long field1600;

    @OriginalMember(owner = "client!XVMRCEYW", name = "Ab", descriptor = "LJUQSYEMB;")
    public class22 field1597;

    @OriginalMember(owner = "client!XVMRCEYW", name = "Bb", descriptor = "LAPPQAEOL;")
    public class2 field1598;

    @OriginalMember(owner = "client!XVMRCEYW", name = "Pb", descriptor = "Ljava/lang/String;")
    public String field1612;

    @OriginalMember(owner = "client!XVMRCEYW", name = "a", descriptor = "(LNQUAUMDT;Z)V")
    public final void method558(class36 arg0, boolean arg1) {
        arg0.field1072 = 0;
        this.field1616 = arg0.method339();
        this.field1615 = arg0.method340();
        if (!arg1) {
            this.field1592 = -334;
        }
        this.field1611 = arg0.method340();
        this.field1598 = null;
        this.field1618 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg0.method339();
            if (var4 == 0) {
                this.field1603[var3] = 0;
            } else {
                int var5 = arg0.method339();
                this.field1603[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field1603[0] == 65535) {
                    this.field1598 = class2.method10(arg0.method341());
                    break;
                }
                if (this.field1603[var3] >= 512 && this.field1603[var3] - 512 < class58.field1354) {
                    int var12 = class58.method520(this.field1603[var3] - 512).field1368;
                    if (var12 != 0) {
                        this.field1618 = var12;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var11 = arg0.method339();
            if (var11 < 0 || var11 >= client.field160[var6].length) {
                var11 = 0;
            }
            this.field1614[var6] = var11;
        }
        super.field1579 = arg0.method341();
        if (super.field1579 == 65535) {
            super.field1579 = -1;
        }
        super.field1580 = arg0.method341();
        if (super.field1580 == 65535) {
            super.field1580 = -1;
        }
        super.field1550 = arg0.method341();
        if (super.field1550 == 65535) {
            super.field1550 = -1;
        }
        super.field1551 = arg0.method341();
        if (super.field1551 == 65535) {
            super.field1551 = -1;
        }
        super.field1552 = arg0.method341();
        if (super.field1552 == 65535) {
            super.field1552 = -1;
        }
        super.field1553 = arg0.method341();
        if (super.field1553 == 65535) {
            super.field1553 = -1;
        }
        super.field1572 = arg0.method341();
        if (super.field1572 == 65535) {
            super.field1572 = -1;
        }
        this.field1612 = class52.method432(4, class52.method429((byte) -53, arg0.method345(false)));
        this.field1613 = arg0.method339();
        this.field1610 = arg0.method341();
        this.field1593 = true;
        this.field1600 = 0L;
        int var7 = this.field1603[5];
        int var8 = this.field1603[9];
        this.field1603[5] = var8;
        this.field1603[9] = var7;
        for (int var9 = 0; var9 < 12; ++var9) {
            this.field1600 <<= 4;
            if (this.field1603[var9] >= 256) {
                this.field1600 += (long) (this.field1603[var9] - 256);
            }
        }
        if (this.field1603[0] >= 256) {
            this.field1600 += (long) (this.field1603[0] - 256 >> 4);
        }
        if (this.field1603[1] >= 256) {
            this.field1600 += (long) (this.field1603[1] - 256 >> 8);
        }
        this.field1603[5] = var7;
        this.field1603[9] = var8;
        for (int var10 = 0; var10 < 5; ++var10) {
            this.field1600 <<= 3;
            this.field1600 += (long) this.field1614[var10];
        }
        this.field1600 <<= 1;
        this.field1600 += (long) this.field1616;
    }

    @OriginalMember(owner = "client!XVMRCEYW", name = "c", descriptor = "(I)LJUQSYEMB;")
    public final class22 method559(int arg0) {
        if (!this.field1593) {
            return null;
        } else if (this.field1598 != null) {
            return this.field1598.method12(1);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var12 = this.field1603[var3];
                if (var12 >= 256 && var12 < 512 && !class54.field1252[var12 - 256].method454(887)) {
                    var2 = true;
                }
                if (var12 >= 512 && !class58.method520(var12 - 512).method516(true, this.field1616)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                class22[] var4 = new class22[12];
                int var5 = 0;
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var9 = this.field1603[var6];
                    if (var9 >= 256 && var9 < 512) {
                        class22 var10 = class54.field1252[var9 - 256].method455((byte) 1);
                        if (var10 != null) {
                            var4[var5++] = var10;
                        }
                    }
                    if (var9 >= 512) {
                        class22 var11 = class58.method520(var9 - 512).method513(0, this.field1616);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                }
                class22 var7 = new class22(var5, 6, var4);
                if (arg0 != 31580) {
                    this.field1592 = -33;
                }
                for (int var8 = 0; var8 < 5; ++var8) {
                    if (this.field1614[var8] != 0) {
                        var7.method226(client.field160[var8][0], client.field160[var8][this.field1614[var8]]);
                        if (var8 == 1) {
                            var7.method226(client.field458[0], client.field458[this.field1614[var8]]);
                        }
                    }
                }
                return var7;
            }
        }
    }

    @OriginalMember(owner = "client!XVMRCEYW", name = "b", descriptor = "(I)Z")
    public final boolean method166(int arg0) {
        if (arg0 != 9382) {
            throw new NullPointerException();
        } else {
            return this.field1593;
        }
    }

    @OriginalMember(owner = "client!XVMRCEYW", name = "a", descriptor = "(I)LJUQSYEMB;")
    public final class22 method167(int arg0) {
        if (!this.field1593) {
            return null;
        } else {
            class22 var2 = this.method560(484);
            if (var2 == null) {
                return null;
            } else {
                super.field1555 = var2.field1212;
                int var3 = 1 / arg0;
                var2.field801 = true;
                if (this.field1617) {
                    return var2;
                } else {
                    if (super.field1545 != -1 && super.field1546 != -1) {
                        class41 var4 = class41.field1131[super.field1545];
                        class22 var5 = var4.method414();
                        if (var5 != null) {
                            class22 var6 = new class22(false, true, (byte) 119, var5, class69.method579(true, super.field1546));
                            var6.method225(0, true, 0, -super.field1549);
                            var6.method219(301);
                            var6.method220(true, var4.field1135.field925[super.field1546]);
                            var6.field800 = null;
                            var6.field799 = null;
                            if (var4.field1138 != 128 || var4.field1139 != 128) {
                                var6.method228(var4.field1138, var4.field1139, var4.field1138, this.field1599);
                            }
                            var6.method229(var4.field1141 + 64, var4.field1142 + 850, -30, -50, -30, true);
                            class22[] var7 = new class22[] { var2, var6 };
                            var2 = new class22(true, var7, -889, 2);
                        }
                    }
                    if (this.field1597 != null) {
                        if (client.field567 >= this.field1602) {
                            this.field1597 = null;
                        }
                        if (client.field567 >= this.field1601 && client.field567 < this.field1602) {
                            class22 var8 = this.field1597;
                            var8.method225(this.field1596 - super.field1560, true, this.field1594 - super.field1559, this.field1595 - this.field1591);
                            if (super.field1557 == 512) {
                                var8.method223(-21890);
                                var8.method223(-21890);
                                var8.method223(-21890);
                            } else if (super.field1557 == 1024) {
                                var8.method223(-21890);
                                var8.method223(-21890);
                            } else if (super.field1557 == 1536) {
                                var8.method223(-21890);
                            }
                            class22[] var9 = new class22[] { var2, var8 };
                            var2 = new class22(true, var9, -889, 2);
                            if (super.field1557 == 512) {
                                var8.method223(-21890);
                            } else if (super.field1557 == 1024) {
                                var8.method223(-21890);
                                var8.method223(-21890);
                            } else if (super.field1557 == 1536) {
                                var8.method223(-21890);
                                var8.method223(-21890);
                                var8.method223(-21890);
                            }
                            var8.method225(super.field1560 - this.field1596, true, super.field1559 - this.field1594, this.field1591 - this.field1595);
                        }
                    }
                    var2.field801 = true;
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!XVMRCEYW", name = "d", descriptor = "(I)LJUQSYEMB;")
    private final class22 method560(int arg0) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        } else if (this.field1598 != null) {
            int var2 = -1;
            if (super.field1563 >= 0 && super.field1566 == 0) {
                var2 = class27.field923[super.field1563].field925[super.field1564];
            } else if (super.field1540 >= 0) {
                var2 = class27.field923[super.field1540].field925[super.field1541];
            }
            return this.field1598.method7(-1, (byte) -48, (int[]) null, var2);
        } else {
            long var4 = this.field1600;
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (super.field1563 >= 0 && super.field1566 == 0) {
                class27 var10 = class27.field923[super.field1563];
                var6 = var10.field925[super.field1564];
                if (super.field1540 >= 0 && super.field1579 != super.field1540) {
                    var7 = class27.field923[super.field1540].field925[super.field1541];
                }
                if (var10.field932 >= 0) {
                    var8 = var10.field932;
                    var4 += (long) (var8 - this.field1603[5] << 8);
                }
                if (var10.field933 >= 0) {
                    var9 = var10.field933;
                    var4 += (long) (var9 - this.field1603[3] << 16);
                }
            } else if (super.field1540 >= 0) {
                var6 = class27.field923[super.field1540].field925[super.field1541];
            }
            class22 var11 = (class22) field1604.method509(var4);
            if (var11 == null) {
                boolean var12 = false;
                for (int var13 = 0; var13 < 12; ++var13) {
                    int var14 = this.field1603[var13];
                    if (var9 >= 0 && var13 == 3) {
                        var14 = var9;
                    }
                    if (var8 >= 0 && var13 == 5) {
                        var14 = var8;
                    }
                    if (var14 >= 256 && var14 < 512 && !class54.field1252[var14 - 256].method452((byte) -64)) {
                        var12 = true;
                    }
                    if (var14 >= 512 && !class58.method520(var14 - 512).method522((byte) 3, this.field1616)) {
                        var12 = true;
                    }
                }
                if (var12) {
                    if (this.field1609 != -1L) {
                        var11 = (class22) field1604.method509(this.field1609);
                    }
                    if (var11 == null) {
                        return null;
                    }
                }
            }
            if (var11 == null) {
                class22[] var15 = new class22[12];
                int var16 = 0;
                for (int var17 = 0; var17 < 12; ++var17) {
                    int var19 = this.field1603[var17];
                    if (var9 >= 0 && var17 == 3) {
                        var19 = var9;
                    }
                    if (var8 >= 0 && var17 == 5) {
                        var19 = var8;
                    }
                    if (var19 >= 256 && var19 < 512) {
                        class22 var20 = class54.field1252[var19 - 256].method453(false);
                        if (var20 != null) {
                            var15[var16++] = var20;
                        }
                    }
                    if (var19 >= 512) {
                        class22 var21 = class58.method520(var19 - 512).method517(0, this.field1616);
                        if (var21 != null) {
                            var15[var16++] = var21;
                        }
                    }
                }
                var11 = new class22(var16, 6, var15);
                for (int var18 = 0; var18 < 5; ++var18) {
                    if (this.field1614[var18] != 0) {
                        var11.method226(client.field160[var18][0], client.field160[var18][this.field1614[var18]]);
                        if (var18 == 1) {
                            var11.method226(client.field458[0], client.field458[this.field1614[var18]]);
                        }
                    }
                }
                var11.method219(301);
                var11.method229(64, 850, -30, -50, -30, true);
                field1604.method510(var4, 0, var11);
                this.field1609 = var4;
            }
            if (this.field1617) {
                return var11;
            } else {
                class22 var22 = class22.field764;
                var22.method214(-810, class69.method579(true, var6) & class69.method579(true, var7), var11);
                if (var6 != -1 && var7 != -1) {
                    var22.method221(var6, var7, class27.field923[super.field1563].field929, false);
                } else if (var6 != -1) {
                    var22.method220(true, var6);
                }
                var22.method216(12953);
                var22.field800 = null;
                var22.field799 = null;
                return var22;
            }
        }
    }
}
