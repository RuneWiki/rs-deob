import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!WQWDCUWR")
public class class65 extends class48 {

    @OriginalMember(owner = "client!WQWDCUWR", name = "rb", descriptor = "I")
    public int field1614 = -1;

    @OriginalMember(owner = "client!WQWDCUWR", name = "xb", descriptor = "I")
    private int field1620 = 45895;

    @OriginalMember(owner = "client!WQWDCUWR", name = "Cb", descriptor = "Z")
    private boolean field1625 = true;

    @OriginalMember(owner = "client!WQWDCUWR", name = "Db", descriptor = "I")
    public int field1626 = -1;

    @OriginalMember(owner = "client!WQWDCUWR", name = "Gb", descriptor = "[I")
    public int[] field1629 = new int[12];

    @OriginalMember(owner = "client!WQWDCUWR", name = "Ib", descriptor = "Z")
    public boolean field1631 = false;

    @OriginalMember(owner = "client!WQWDCUWR", name = "Kb", descriptor = "Z")
    public boolean field1633 = false;

    @OriginalMember(owner = "client!WQWDCUWR", name = "Lb", descriptor = "[I")
    public int[] field1634 = new int[5];

    @OriginalMember(owner = "client!WQWDCUWR", name = "Mb", descriptor = "J")
    public long field1635 = -1L;

    @OriginalMember(owner = "client!WQWDCUWR", name = "Nb", descriptor = "I")
    private int field1636 = 932;

    @OriginalMember(owner = "client!WQWDCUWR", name = "nb", descriptor = "LDSCQIAPU;")
    public static class8 field1610 = new class8(401, 260);

    @OriginalMember(owner = "client!WQWDCUWR", name = "ob", descriptor = "I")
    public int field1611;

    @OriginalMember(owner = "client!WQWDCUWR", name = "pb", descriptor = "I")
    public int field1612;

    @OriginalMember(owner = "client!WQWDCUWR", name = "qb", descriptor = "I")
    public int field1613;

    @OriginalMember(owner = "client!WQWDCUWR", name = "sb", descriptor = "I")
    public int field1615;

    @OriginalMember(owner = "client!WQWDCUWR", name = "tb", descriptor = "I")
    public int field1616;

    @OriginalMember(owner = "client!WQWDCUWR", name = "ub", descriptor = "I")
    public int field1617;

    @OriginalMember(owner = "client!WQWDCUWR", name = "wb", descriptor = "I")
    public int field1619;

    @OriginalMember(owner = "client!WQWDCUWR", name = "yb", descriptor = "I")
    public int field1621;

    @OriginalMember(owner = "client!WQWDCUWR", name = "zb", descriptor = "I")
    public int field1622;

    @OriginalMember(owner = "client!WQWDCUWR", name = "Ab", descriptor = "I")
    public int field1623;

    @OriginalMember(owner = "client!WQWDCUWR", name = "Bb", descriptor = "I")
    public int field1624;

    @OriginalMember(owner = "client!WQWDCUWR", name = "Eb", descriptor = "I")
    public int field1627;

    @OriginalMember(owner = "client!WQWDCUWR", name = "Hb", descriptor = "I")
    public int field1630;

    @OriginalMember(owner = "client!WQWDCUWR", name = "Ob", descriptor = "I")
    public int field1637;

    @OriginalMember(owner = "client!WQWDCUWR", name = "Jb", descriptor = "J")
    public long field1632;

    @OriginalMember(owner = "client!WQWDCUWR", name = "Pb", descriptor = "LBJGOYLYN;")
    public class2 field1638;

    @OriginalMember(owner = "client!WQWDCUWR", name = "vb", descriptor = "LUNLYQRUD;")
    public class56 field1618;

    @OriginalMember(owner = "client!WQWDCUWR", name = "Fb", descriptor = "Ljava/lang/String;")
    public String field1628;

    @OriginalMember(owner = "client!WQWDCUWR", name = "a", descriptor = "(B)LUNLYQRUD;")
    public final class56 method10(byte arg0) {
        if (!this.field1631) {
            return null;
        } else {
            class56 var2 = this.method543((byte) 103);
            if (var2 == null) {
                return null;
            } else {
                super.field1300 = var2.field55;
                if (arg0 != 93) {
                    for (int var3 = 1; var3 > 0; ++var3) {
                    }
                }
                var2.field1467 = true;
                if (this.field1633) {
                    return var2;
                } else {
                    if (super.field1319 != -1 && super.field1320 != -1) {
                        class54 var4 = class54.field1407[super.field1319];
                        class56 var5 = var4.method436();
                        if (var5 != null) {
                            class56 var6 = new class56(true, var5, false, 8, class6.method178(super.field1320, 688));
                            var6.method455(-super.field1323, (byte) 4, 0, 0);
                            var6.method449(956);
                            var6.method450(936, var4.field1411.field1149[super.field1320]);
                            var6.field1466 = null;
                            var6.field1465 = null;
                            if (var4.field1414 != 128 || var4.field1415 != 128) {
                                var6.method458(var4.field1414, var4.field1415, false, var4.field1414);
                            }
                            var6.method459(var4.field1417 + 64, var4.field1418 + 850, -30, -50, -30, true);
                            class56[] var7 = new class56[] { var2, var6 };
                            var2 = new class56(2, this.field1636, var7, true);
                        }
                    }
                    if (this.field1618 != null) {
                        if (client.field261 >= this.field1613) {
                            this.field1618 = null;
                        }
                        if (client.field261 >= this.field1612 && client.field261 < this.field1613) {
                            class56 var8 = this.field1618;
                            var8.method455(this.field1616 - this.field1611, (byte) 4, this.field1617 - super.field1345, this.field1615 - super.field1344);
                            if (super.field1347 == 512) {
                                var8.method453(0);
                                var8.method453(0);
                                var8.method453(0);
                            } else if (super.field1347 == 1024) {
                                var8.method453(0);
                                var8.method453(0);
                            } else if (super.field1347 == 1536) {
                                var8.method453(0);
                            }
                            class56[] var9 = new class56[] { var2, var8 };
                            var2 = new class56(2, this.field1636, var9, true);
                            if (super.field1347 == 512) {
                                var8.method453(0);
                            } else if (super.field1347 == 1024) {
                                var8.method453(0);
                                var8.method453(0);
                            } else if (super.field1347 == 1536) {
                                var8.method453(0);
                                var8.method453(0);
                                var8.method453(0);
                            }
                            var8.method455(this.field1611 - this.field1616, (byte) 4, super.field1345 - this.field1617, super.field1344 - this.field1615);
                        }
                    }
                    var2.field1467 = true;
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!WQWDCUWR", name = "b", descriptor = "(I)LUNLYQRUD;")
    public final class56 method542(int arg0) {
        if (!this.field1631) {
            return null;
        } else if (this.field1638 != null) {
            return this.field1638.method7(-748);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var12 = this.field1629[var3];
                if (var12 >= 256 && var12 < 512 && !class50.field1363[var12 - 256].method419(false)) {
                    var2 = true;
                }
                if (var12 >= 512 && !class12.method218(var12 - 512).method225(0, this.field1619)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                class56[] var4 = new class56[12];
                int var5 = 0;
                while (arg0 >= 0) {
                    this.field1625 = !this.field1625;
                }
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var9 = this.field1629[var6];
                    if (var9 >= 256 && var9 < 512) {
                        class56 var10 = class50.field1363[var9 - 256].method420(0);
                        if (var10 != null) {
                            var4[var5++] = var10;
                        }
                    }
                    if (var9 >= 512) {
                        class56 var11 = class12.method218(var9 - 512).method219(this.field1619, 372);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                }
                class56 var7 = new class56(var5, var4, 0);
                for (int var8 = 0; var8 < 5; ++var8) {
                    if (this.field1634[var8] != 0) {
                        var7.method456(client.field277[var8][0], client.field277[var8][this.field1634[var8]]);
                        if (var8 == 1) {
                            var7.method456(client.field490[0], client.field490[this.field1634[var8]]);
                        }
                    }
                }
                return var7;
            }
        }
    }

    @OriginalMember(owner = "client!WQWDCUWR", name = "b", descriptor = "(B)Z")
    public final boolean method408(byte arg0) {
        if (arg0 != 8) {
            this.field1636 = 182;
        }
        return this.field1631;
    }

    @OriginalMember(owner = "client!WQWDCUWR", name = "c", descriptor = "(B)LUNLYQRUD;")
    private final class56 method543(byte arg0) {
        if (arg0 != 103) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field1638 != null) {
            int var3 = -1;
            if (super.field1311 >= 0 && super.field1314 == 0) {
                var3 = class41.field1147[super.field1311].field1149[super.field1312];
            } else if (super.field1348 >= 0) {
                var3 = class41.field1147[super.field1348].field1149[super.field1349];
            }
            return this.field1638.method2(-1, (int[]) null, var3, false);
        } else {
            long var5 = this.field1632;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            int var10 = -1;
            if (super.field1311 >= 0 && super.field1314 == 0) {
                class41 var11 = class41.field1147[super.field1311];
                var7 = var11.field1149[super.field1312];
                if (super.field1348 >= 0 && super.field1348 != super.field1298) {
                    var8 = class41.field1147[super.field1348].field1149[super.field1349];
                }
                if (var11.field1156 >= 0) {
                    var9 = var11.field1156;
                    var5 += (long) (var9 - this.field1629[5] << 8);
                }
                if (var11.field1157 >= 0) {
                    var10 = var11.field1157;
                    var5 += (long) (var10 - this.field1629[3] << 16);
                }
            } else if (super.field1348 >= 0) {
                var7 = class41.field1147[super.field1348].field1149[super.field1349];
            }
            class56 var12 = (class56) field1610.method179(var5);
            if (var12 == null) {
                boolean var13 = false;
                for (int var14 = 0; var14 < 12; ++var14) {
                    int var15 = this.field1629[var14];
                    if (var10 >= 0 && var14 == 3) {
                        var15 = var10;
                    }
                    if (var9 >= 0 && var14 == 5) {
                        var15 = var9;
                    }
                    if (var15 >= 256 && var15 < 512 && !class50.field1363[var15 - 256].method417(false)) {
                        var13 = true;
                    }
                    if (var15 >= 512 && !class12.method218(var15 - 512).method227((byte) 75, this.field1619)) {
                        var13 = true;
                    }
                }
                if (var13) {
                    if (this.field1635 != -1L) {
                        var12 = (class56) field1610.method179(this.field1635);
                    }
                    if (var12 == null) {
                        return null;
                    }
                }
            }
            if (var12 == null) {
                class56[] var16 = new class56[12];
                int var17 = 0;
                for (int var18 = 0; var18 < 12; ++var18) {
                    int var20 = this.field1629[var18];
                    if (var10 >= 0 && var18 == 3) {
                        var20 = var10;
                    }
                    if (var9 >= 0 && var18 == 5) {
                        var20 = var9;
                    }
                    if (var20 >= 256 && var20 < 512) {
                        class56 var21 = class50.field1363[var20 - 256].method418(691);
                        if (var21 != null) {
                            var16[var17++] = var21;
                        }
                    }
                    if (var20 >= 512) {
                        class56 var22 = class12.method218(var20 - 512).method221(3, this.field1619);
                        if (var22 != null) {
                            var16[var17++] = var22;
                        }
                    }
                }
                var12 = new class56(var17, var16, 0);
                for (int var19 = 0; var19 < 5; ++var19) {
                    if (this.field1634[var19] != 0) {
                        var12.method456(client.field277[var19][0], client.field277[var19][this.field1634[var19]]);
                        if (var19 == 1) {
                            var12.method456(client.field490[0], client.field490[this.field1634[var19]]);
                        }
                    }
                }
                var12.method449(956);
                var12.method459(64, 850, -30, -50, -30, true);
                field1610.method180(true, var12, var5);
                this.field1635 = var5;
            }
            if (this.field1633) {
                return var12;
            } else {
                class56 var23 = class56.field1430;
                var23.method444(class6.method178(var7, 688) & class6.method178(var8, 688), this.field1620, var12);
                if (var7 != -1 && var8 != -1) {
                    var23.method451(var8, -164, var7, class41.field1147[super.field1311].field1153);
                } else if (var7 != -1) {
                    var23.method450(936, var7);
                }
                var23.method446(19419);
                var23.field1466 = null;
                var23.field1465 = null;
                return var23;
            }
        }
    }

    @OriginalMember(owner = "client!WQWDCUWR", name = "a", descriptor = "(LWNCFPLWV;I)V")
    public final void method544(class63 arg0, int arg1) {
        arg0.field1571 = 0;
        this.field1619 = arg0.method502();
        this.field1614 = arg0.method503();
        this.field1626 = arg0.method503();
        this.field1638 = null;
        this.field1627 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg0.method502();
            if (var4 == 0) {
                this.field1629[var3] = 0;
            } else {
                int var5 = arg0.method502();
                this.field1629[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field1629[0] == 65535) {
                    this.field1638 = class2.method4(arg0.method504());
                    break;
                }
                if (this.field1629[var3] >= 512 && this.field1629[var3] - 512 < class12.field703) {
                    int var13 = class12.method218(this.field1629[var3] - 512).field740;
                    if (var13 != 0) {
                        this.field1627 = var13;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var12 = arg0.method502();
            if (var12 < 0 || var12 >= client.field277[var6].length) {
                var12 = 0;
            }
            this.field1634[var6] = var12;
        }
        super.field1298 = arg0.method504();
        if (super.field1298 == 65535) {
            super.field1298 = -1;
        }
        super.field1299 = arg0.method504();
        if (super.field1299 == 65535) {
            super.field1299 = -1;
        }
        super.field1334 = arg0.method504();
        if (super.field1334 == 65535) {
            super.field1334 = -1;
        }
        super.field1335 = arg0.method504();
        if (super.field1335 == 65535) {
            super.field1335 = -1;
        }
        super.field1336 = arg0.method504();
        if (super.field1336 == 65535) {
            super.field1336 = -1;
        }
        super.field1337 = arg0.method504();
        if (super.field1337 == 65535) {
            super.field1337 = -1;
        }
        super.field1303 = arg0.method504();
        if (super.field1303 == 65535) {
            super.field1303 = -1;
        }
        this.field1628 = class19.method290(true, class19.method287(false, arg0.method508((byte) 0)));
        if (arg1 != 0) {
            for (int var7 = 1; var7 > 0; ++var7) {
            }
        }
        this.field1637 = arg0.method502();
        this.field1630 = arg0.method504();
        this.field1631 = true;
        this.field1632 = 0L;
        int var8 = this.field1629[5];
        int var9 = this.field1629[9];
        this.field1629[5] = var9;
        this.field1629[9] = var8;
        for (int var10 = 0; var10 < 12; ++var10) {
            this.field1632 <<= 4;
            if (this.field1629[var10] >= 256) {
                this.field1632 += (long) (this.field1629[var10] - 256);
            }
        }
        if (this.field1629[0] >= 256) {
            this.field1632 += (long) (this.field1629[0] - 256 >> 4);
        }
        if (this.field1629[1] >= 256) {
            this.field1632 += (long) (this.field1629[1] - 256 >> 8);
        }
        this.field1629[5] = var8;
        this.field1629[9] = var9;
        for (int var11 = 0; var11 < 5; ++var11) {
            this.field1632 <<= 3;
            this.field1632 += (long) this.field1634[var11];
        }
        this.field1632 <<= 1;
        this.field1632 += (long) this.field1619;
    }
}
