import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!VJDNWPCM")
public class class62 extends class8 {

    @OriginalMember(owner = "client!VJDNWPCM", name = "sb", descriptor = "I")
    private int field1583 = 38776;

    @OriginalMember(owner = "client!VJDNWPCM", name = "tb", descriptor = "J")
    public long field1584 = -1L;

    @OriginalMember(owner = "client!VJDNWPCM", name = "Bb", descriptor = "Z")
    public boolean field1592 = false;

    @OriginalMember(owner = "client!VJDNWPCM", name = "Cb", descriptor = "[I")
    public int[] field1593 = new int[12];

    @OriginalMember(owner = "client!VJDNWPCM", name = "Eb", descriptor = "[I")
    public int[] field1595 = new int[5];

    @OriginalMember(owner = "client!VJDNWPCM", name = "Lb", descriptor = "Z")
    public boolean field1602 = false;

    @OriginalMember(owner = "client!VJDNWPCM", name = "Mb", descriptor = "Z")
    private boolean field1603 = false;

    @OriginalMember(owner = "client!VJDNWPCM", name = "Ob", descriptor = "I")
    public int field1605 = -1;

    @OriginalMember(owner = "client!VJDNWPCM", name = "Qb", descriptor = "I")
    public int field1607 = -1;

    @OriginalMember(owner = "client!VJDNWPCM", name = "Pb", descriptor = "LQASTZCLF;")
    public static class47 field1606 = new class47(260, false);

    @OriginalMember(owner = "client!VJDNWPCM", name = "ub", descriptor = "I")
    public int field1585;

    @OriginalMember(owner = "client!VJDNWPCM", name = "vb", descriptor = "I")
    public int field1586;

    @OriginalMember(owner = "client!VJDNWPCM", name = "wb", descriptor = "I")
    public int field1587;

    @OriginalMember(owner = "client!VJDNWPCM", name = "xb", descriptor = "I")
    public int field1588;

    @OriginalMember(owner = "client!VJDNWPCM", name = "yb", descriptor = "I")
    public int field1589;

    @OriginalMember(owner = "client!VJDNWPCM", name = "zb", descriptor = "I")
    public int field1590;

    @OriginalMember(owner = "client!VJDNWPCM", name = "Fb", descriptor = "I")
    public int field1596;

    @OriginalMember(owner = "client!VJDNWPCM", name = "Gb", descriptor = "I")
    public int field1597;

    @OriginalMember(owner = "client!VJDNWPCM", name = "Hb", descriptor = "I")
    public int field1598;

    @OriginalMember(owner = "client!VJDNWPCM", name = "Jb", descriptor = "I")
    public int field1600;

    @OriginalMember(owner = "client!VJDNWPCM", name = "Kb", descriptor = "I")
    public int field1601;

    @OriginalMember(owner = "client!VJDNWPCM", name = "Nb", descriptor = "I")
    public int field1604;

    @OriginalMember(owner = "client!VJDNWPCM", name = "Rb", descriptor = "I")
    public int field1608;

    @OriginalMember(owner = "client!VJDNWPCM", name = "Sb", descriptor = "I")
    public int field1609;

    @OriginalMember(owner = "client!VJDNWPCM", name = "rb", descriptor = "J")
    public long field1582;

    @OriginalMember(owner = "client!VJDNWPCM", name = "Ib", descriptor = "LJJMVUSJJ;")
    public class29 field1599;

    @OriginalMember(owner = "client!VJDNWPCM", name = "Ab", descriptor = "LNIJEYEOX;")
    public class39 field1591;

    @OriginalMember(owner = "client!VJDNWPCM", name = "Db", descriptor = "Ljava/lang/String;")
    public String field1594;

    @OriginalMember(owner = "client!VJDNWPCM", name = "a", descriptor = "(B)LJJMVUSJJ;")
    public final class29 method214(byte arg0) {
        if (!this.field1592) {
            return null;
        } else {
            class29 var2 = this.method523(0);
            if (arg0 != 7) {
                for (int var3 = 1; var3 > 0; ++var3) {
                }
            }
            if (var2 == null) {
                return null;
            } else {
                super.field613 = var2.field1525;
                var2.field954 = true;
                if (this.field1602) {
                    return var2;
                } else {
                    if (super.field601 != -1 && super.field602 != -1) {
                        class12 var4 = class12.field683[super.field601];
                        class29 var5 = var4.method210();
                        if (var5 != null) {
                            class29 var6 = new class29(true, class42.method382(super.field602, 4), false, 9, var5);
                            var6.method313(0, 161, -super.field605, 0);
                            var6.method307(979);
                            var6.method308(var4.field687.field1630[super.field602], 771);
                            var6.field953 = null;
                            var6.field952 = null;
                            if (var4.field690 != 128 || var4.field691 != 128) {
                                var6.method316(var4.field691, var4.field690, var4.field690, true);
                            }
                            var6.method317(var4.field693 + 64, var4.field694 + 850, -30, -50, -30, true);
                            class29[] var7 = new class29[] { var2, var6 };
                            var2 = new class29(var7, 976, 2, true);
                        }
                    }
                    if (this.field1599 != null) {
                        if (client.field343 >= this.field1609) {
                            this.field1599 = null;
                        }
                        if (client.field343 >= this.field1608 && client.field343 < this.field1609) {
                            class29 var8 = this.field1599;
                            var8.method313(this.field1596 - super.field620, 161, this.field1597 - this.field1585, this.field1598 - super.field621);
                            if (super.field600 == 512) {
                                var8.method311((byte) 3);
                                var8.method311((byte) 3);
                                var8.method311((byte) 3);
                            } else if (super.field600 == 1024) {
                                var8.method311((byte) 3);
                                var8.method311((byte) 3);
                            } else if (super.field600 == 1536) {
                                var8.method311((byte) 3);
                            }
                            class29[] var9 = new class29[] { var2, var8 };
                            var2 = new class29(var9, 976, 2, true);
                            if (super.field600 == 512) {
                                var8.method311((byte) 3);
                            } else if (super.field600 == 1024) {
                                var8.method311((byte) 3);
                                var8.method311((byte) 3);
                            } else if (super.field600 == 1536) {
                                var8.method311((byte) 3);
                                var8.method311((byte) 3);
                                var8.method311((byte) 3);
                            }
                            var8.method313(super.field620 - this.field1596, 161, this.field1585 - this.field1597, super.field621 - this.field1598);
                        }
                    }
                    var2.field954 = true;
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!VJDNWPCM", name = "b", descriptor = "(I)LJJMVUSJJ;")
    public final class29 method522(int arg0) {
        if (!this.field1592) {
            return null;
        } else if (this.field1591 != null) {
            return this.field1591.method364(false);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var12 = this.field1593[var3];
                if (var12 >= 256 && var12 < 512 && !class63.field1613[var12 - 256].method529(364)) {
                    var2 = true;
                }
                if (var12 >= 512 && !class27.method285(var12 - 512).method294(this.field1603, this.field1601)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                class29[] var4 = new class29[12];
                int var5 = 0;
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var9 = this.field1593[var6];
                    if (var9 >= 256 && var9 < 512) {
                        class29 var10 = class63.field1613[var9 - 256].method530((byte) 67);
                        if (var10 != null) {
                            var4[var5++] = var10;
                        }
                    }
                    if (var9 >= 512) {
                        class29 var11 = class27.method285(var9 - 512).method290(this.field1601, false);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                }
                class29 var7 = new class29(var4, var5, -41715);
                if (arg0 != 7442) {
                    this.field1603 = !this.field1603;
                }
                for (int var8 = 0; var8 < 5; ++var8) {
                    if (this.field1595[var8] != 0) {
                        var7.method314(client.field188[var8][0], client.field188[var8][this.field1595[var8]]);
                        if (var8 == 1) {
                            var7.method314(client.field355[0], client.field355[this.field1595[var8]]);
                        }
                    }
                }
                return var7;
            }
        }
    }

    @OriginalMember(owner = "client!VJDNWPCM", name = "a", descriptor = "(I)Z")
    public final boolean method203(int arg0) {
        if (arg0 < 0) {
            return this.field1592;
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!VJDNWPCM", name = "c", descriptor = "(I)LJJMVUSJJ;")
    private final class29 method523(int arg0) {
        if (this.field1591 != null) {
            int var2 = -1;
            if (super.field615 >= 0 && super.field618 == 0) {
                var2 = class65.field1628[super.field615].field1630[super.field616];
            } else if (super.field634 >= 0) {
                var2 = class65.field1628[super.field634].field1630[super.field635];
            }
            return this.field1591.method368(var2, -1, -768, (int[]) null);
        } else {
            long var4 = this.field1582;
            if (arg0 != 0) {
                throw new NullPointerException();
            } else {
                int var6 = -1;
                int var7 = -1;
                int var8 = -1;
                int var9 = -1;
                if (super.field615 >= 0 && super.field618 == 0) {
                    class65 var10 = class65.field1628[super.field615];
                    var6 = var10.field1630[super.field616];
                    if (super.field634 >= 0 && super.field634 != super.field607) {
                        var7 = class65.field1628[super.field634].field1630[super.field635];
                    }
                    if (var10.field1637 >= 0) {
                        var8 = var10.field1637;
                        var4 += (long) (var8 - this.field1593[5] << 8);
                    }
                    if (var10.field1638 >= 0) {
                        var9 = var10.field1638;
                        var4 += (long) (var9 - this.field1593[3] << 16);
                    }
                } else if (super.field634 >= 0) {
                    var6 = class65.field1628[super.field634].field1630[super.field635];
                }
                class29 var11 = (class29) field1606.method438(var4);
                if (var11 == null) {
                    boolean var12 = false;
                    for (int var13 = 0; var13 < 12; ++var13) {
                        int var14 = this.field1593[var13];
                        if (var9 >= 0 && var13 == 3) {
                            var14 = var9;
                        }
                        if (var8 >= 0 && var13 == 5) {
                            var14 = var8;
                        }
                        if (var14 >= 256 && var14 < 512 && !class63.field1613[var14 - 256].method527(-331)) {
                            var12 = true;
                        }
                        if (var14 >= 512 && !class27.method285(var14 - 512).method286(this.field1601, -484)) {
                            var12 = true;
                        }
                    }
                    if (var12) {
                        if (this.field1584 != -1L) {
                            var11 = (class29) field1606.method438(this.field1584);
                        }
                        if (var11 == null) {
                            return null;
                        }
                    }
                }
                if (var11 == null) {
                    class29[] var15 = new class29[12];
                    int var16 = 0;
                    for (int var17 = 0; var17 < 12; ++var17) {
                        int var19 = this.field1593[var17];
                        if (var9 >= 0 && var17 == 3) {
                            var19 = var9;
                        }
                        if (var8 >= 0 && var17 == 5) {
                            var19 = var8;
                        }
                        if (var19 >= 256 && var19 < 512) {
                            class29 var20 = class63.field1613[var19 - 256].method528((byte) 0);
                            if (var20 != null) {
                                var15[var16++] = var20;
                            }
                        }
                        if (var19 >= 512) {
                            class29 var21 = class27.method285(var19 - 512).method289(this.field1601, 1);
                            if (var21 != null) {
                                var15[var16++] = var21;
                            }
                        }
                    }
                    var11 = new class29(var15, var16, -41715);
                    for (int var18 = 0; var18 < 5; ++var18) {
                        if (this.field1595[var18] != 0) {
                            var11.method314(client.field188[var18][0], client.field188[var18][this.field1595[var18]]);
                            if (var18 == 1) {
                                var11.method314(client.field355[0], client.field355[this.field1595[var18]]);
                            }
                        }
                    }
                    var11.method307(979);
                    var11.method317(64, 850, -30, -50, -30, true);
                    field1606.method439(var11, var4, -27210);
                    this.field1584 = var4;
                }
                if (this.field1602) {
                    return var11;
                } else {
                    class29 var22 = class29.field917;
                    var22.method302(var11, this.field1583, class42.method382(var6, 4) & class42.method382(var7, 4));
                    if (var6 != -1 && var7 != -1) {
                        var22.method309(0, var7, class65.field1628[super.field615].field1634, var6);
                    } else if (var6 != -1) {
                        var22.method308(var6, 771);
                    }
                    var22.method304(-810);
                    var22.field953 = null;
                    var22.field952 = null;
                    return var22;
                }
            }
        }
    }

    @OriginalMember(owner = "client!VJDNWPCM", name = "a", descriptor = "(ZLIUVBENCV;)V")
    public final void method524(boolean arg0, class25 arg1) {
        arg1.field837 = 0;
        this.field1601 = arg1.method245();
        this.field1605 = arg1.method246();
        this.field1607 = arg1.method246();
        this.field1591 = null;
        this.field1604 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg1.method245();
            if (var4 == 0) {
                this.field1593[var3] = 0;
            } else {
                int var5 = arg1.method245();
                this.field1593[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field1593[0] == 65535) {
                    this.field1591 = class39.method363(arg1.method247());
                    break;
                }
                if (this.field1593[var3] >= 512 && this.field1593[var3] - 512 < class27.field864) {
                    int var12 = class27.method285(this.field1593[var3] - 512).field886;
                    if (var12 != 0) {
                        this.field1604 = var12;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var11 = arg1.method245();
            if (var11 < 0 || var11 >= client.field188[var6].length) {
                var11 = 0;
            }
            this.field1595[var6] = var11;
        }
        super.field607 = arg1.method247();
        if (super.field607 == 65535) {
            super.field607 = -1;
        }
        super.field608 = arg1.method247();
        if (super.field608 == 65535) {
            super.field608 = -1;
        }
        super.field596 = arg1.method247();
        if (super.field596 == 65535) {
            super.field596 = -1;
        }
        super.field597 = arg1.method247();
        if (super.field597 == 65535) {
            super.field597 = -1;
        }
        super.field598 = arg1.method247();
        if (super.field598 == 65535) {
            super.field598 = -1;
        }
        super.field599 = arg1.method247();
        if (super.field599 == 65535) {
            super.field599 = -1;
        }
        super.field639 = arg1.method247();
        if (!arg0) {
            if (super.field639 == 65535) {
                super.field639 = -1;
            }
            this.field1594 = class50.method456(839, class50.method453((byte) 3, arg1.method251(-225)));
            this.field1600 = arg1.method245();
            this.field1590 = arg1.method247();
            this.field1592 = true;
            this.field1582 = 0L;
            int var7 = this.field1593[5];
            int var8 = this.field1593[9];
            this.field1593[5] = var8;
            this.field1593[9] = var7;
            for (int var9 = 0; var9 < 12; ++var9) {
                this.field1582 <<= 4;
                if (this.field1593[var9] >= 256) {
                    this.field1582 += (long) (this.field1593[var9] - 256);
                }
            }
            if (this.field1593[0] >= 256) {
                this.field1582 += (long) (this.field1593[0] - 256 >> 4);
            }
            if (this.field1593[1] >= 256) {
                this.field1582 += (long) (this.field1593[1] - 256 >> 8);
            }
            this.field1593[5] = var7;
            this.field1593[9] = var8;
            for (int var10 = 0; var10 < 5; ++var10) {
                this.field1582 <<= 3;
                this.field1582 += (long) this.field1595[var10];
            }
            this.field1582 <<= 1;
            this.field1582 += (long) this.field1601;
        }
    }
}
