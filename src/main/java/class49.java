import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!TPTANZXN")
public class class49 extends class61 {

    @OriginalMember(owner = "client!TPTANZXN", name = "rb", descriptor = "I")
    private int field1419 = 6;

    @OriginalMember(owner = "client!TPTANZXN", name = "xb", descriptor = "[I")
    public int[] field1425 = new int[12];

    @OriginalMember(owner = "client!TPTANZXN", name = "Bb", descriptor = "Z")
    public boolean field1429 = false;

    @OriginalMember(owner = "client!TPTANZXN", name = "Cb", descriptor = "Z")
    private boolean field1430 = false;

    @OriginalMember(owner = "client!TPTANZXN", name = "Fb", descriptor = "J")
    public long field1433 = -1L;

    @OriginalMember(owner = "client!TPTANZXN", name = "Lb", descriptor = "B")
    private byte field1439 = 2;

    @OriginalMember(owner = "client!TPTANZXN", name = "Mb", descriptor = "I")
    public int field1440 = -1;

    @OriginalMember(owner = "client!TPTANZXN", name = "Ob", descriptor = "I")
    public int field1442 = -1;

    @OriginalMember(owner = "client!TPTANZXN", name = "Qb", descriptor = "B")
    private byte field1444 = -72;

    @OriginalMember(owner = "client!TPTANZXN", name = "Sb", descriptor = "Z")
    public boolean field1446 = false;

    @OriginalMember(owner = "client!TPTANZXN", name = "Ub", descriptor = "[I")
    public int[] field1448 = new int[5];

    @OriginalMember(owner = "client!TPTANZXN", name = "Nb", descriptor = "LYITKGHWB;")
    public static class67 field1441 = new class67(260, (byte) 6);

    @OriginalMember(owner = "client!TPTANZXN", name = "sb", descriptor = "I")
    public int field1420;

    @OriginalMember(owner = "client!TPTANZXN", name = "tb", descriptor = "I")
    public int field1421;

    @OriginalMember(owner = "client!TPTANZXN", name = "ub", descriptor = "I")
    public int field1422;

    @OriginalMember(owner = "client!TPTANZXN", name = "vb", descriptor = "I")
    public int field1423;

    @OriginalMember(owner = "client!TPTANZXN", name = "wb", descriptor = "I")
    private int field1424;

    @OriginalMember(owner = "client!TPTANZXN", name = "yb", descriptor = "I")
    public int field1426;

    @OriginalMember(owner = "client!TPTANZXN", name = "zb", descriptor = "I")
    public int field1427;

    @OriginalMember(owner = "client!TPTANZXN", name = "Ab", descriptor = "I")
    public int field1428;

    @OriginalMember(owner = "client!TPTANZXN", name = "Eb", descriptor = "I")
    public int field1432;

    @OriginalMember(owner = "client!TPTANZXN", name = "Gb", descriptor = "I")
    public int field1434;

    @OriginalMember(owner = "client!TPTANZXN", name = "Hb", descriptor = "I")
    public int field1435;

    @OriginalMember(owner = "client!TPTANZXN", name = "Ib", descriptor = "I")
    public int field1436;

    @OriginalMember(owner = "client!TPTANZXN", name = "Kb", descriptor = "I")
    public int field1438;

    @OriginalMember(owner = "client!TPTANZXN", name = "Rb", descriptor = "I")
    public int field1445;

    @OriginalMember(owner = "client!TPTANZXN", name = "Tb", descriptor = "I")
    public int field1447;

    @OriginalMember(owner = "client!TPTANZXN", name = "Pb", descriptor = "J")
    public long field1443;

    @OriginalMember(owner = "client!TPTANZXN", name = "Jb", descriptor = "LFLXAIVEA;")
    public class16 field1437;

    @OriginalMember(owner = "client!TPTANZXN", name = "Db", descriptor = "LJRELGTVY;")
    public class29 field1431;

    @OriginalMember(owner = "client!TPTANZXN", name = "Vb", descriptor = "Ljava/lang/String;")
    public String field1449;

    @OriginalMember(owner = "client!TPTANZXN", name = "a", descriptor = "(LPQBRPYKE;I)V")
    public final void method456(class41 arg0, int arg1) {
        arg0.field1241 = 0;
        this.field1432 = arg0.method340();
        this.field1440 = arg0.method341();
        this.field1442 = arg0.method341();
        this.field1431 = null;
        this.field1445 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg0.method340();
            if (var4 == 0) {
                this.field1425[var3] = 0;
            } else {
                int var5 = arg0.method340();
                this.field1425[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field1425[0] == 65535) {
                    this.field1431 = class29.method269(arg0.method342());
                    break;
                }
                if (this.field1425[var3] >= 512 && this.field1425[var3] - 512 < class48.field1395) {
                    int var12 = class48.method453(this.field1425[var3] - 512).field1416;
                    if (var12 != 0) {
                        this.field1445 = var12;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var11 = arg0.method340();
            if (var11 < 0 || var11 >= client.field517[var6].length) {
                var11 = 0;
            }
            this.field1448[var6] = var11;
        }
        super.field1641 = arg0.method342();
        if (super.field1641 == 65535) {
            super.field1641 = -1;
        }
        super.field1642 = arg0.method342();
        if (super.field1642 == 65535) {
            super.field1642 = -1;
        }
        super.field1615 = arg0.method342();
        if (super.field1615 == 65535) {
            super.field1615 = -1;
        }
        super.field1616 = arg0.method342();
        if (super.field1616 == 65535) {
            super.field1616 = -1;
        }
        super.field1617 = arg0.method342();
        if (super.field1617 == 65535) {
            super.field1617 = -1;
        }
        super.field1618 = arg0.method342();
        if (super.field1618 == 65535) {
            super.field1618 = -1;
        }
        super.field1659 = arg0.method342();
        if (super.field1659 == 65535) {
            super.field1659 = -1;
        }
        this.field1449 = class57.method541(0, class57.method538(arg0.method346(false), (byte) 7));
        this.field1438 = arg0.method340();
        this.field1428 = arg0.method342();
        this.field1429 = true;
        this.field1443 = 0L;
        int var7 = this.field1425[5];
        int var8 = this.field1425[9];
        if (arg1 == 0) {
            this.field1425[5] = var8;
            this.field1425[9] = var7;
            for (int var9 = 0; var9 < 12; ++var9) {
                this.field1443 <<= 4;
                if (this.field1425[var9] >= 256) {
                    this.field1443 += (long) (this.field1425[var9] - 256);
                }
            }
            if (this.field1425[0] >= 256) {
                this.field1443 += (long) (this.field1425[0] - 256 >> 4);
            }
            if (this.field1425[1] >= 256) {
                this.field1443 += (long) (this.field1425[1] - 256 >> 8);
            }
            this.field1425[5] = var7;
            this.field1425[9] = var8;
            for (int var10 = 0; var10 < 5; ++var10) {
                this.field1443 <<= 3;
                this.field1443 += (long) this.field1448[var10];
            }
            this.field1443 <<= 1;
            this.field1443 += (long) this.field1432;
        }
    }

    @OriginalMember(owner = "client!TPTANZXN", name = "b", descriptor = "(I)Z")
    public final boolean method442(int arg0) {
        if (arg0 != -40574) {
            this.field1424 = -190;
        }
        return this.field1429;
    }

    @OriginalMember(owner = "client!TPTANZXN", name = "c", descriptor = "(I)LFLXAIVEA;")
    private final class16 method457(int arg0) {
        if (this.field1431 != null) {
            int var2 = -1;
            if (super.field1653 >= 0 && super.field1656 == 0) {
                var2 = class2.field77[super.field1653].field79[super.field1654];
            } else if (super.field1627 >= 0) {
                var2 = class2.field77[super.field1627].field79[super.field1628];
            }
            return this.field1431.method270((int[]) null, -1, var2, (byte) -77);
        } else {
            long var4 = this.field1443;
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (super.field1653 >= 0 && super.field1656 == 0) {
                class2 var10 = class2.field77[super.field1653];
                var6 = var10.field79[super.field1654];
                if (super.field1627 >= 0 && super.field1641 != super.field1627) {
                    var7 = class2.field77[super.field1627].field79[super.field1628];
                }
                if (var10.field86 >= 0) {
                    var8 = var10.field86;
                    var4 += (long) (var8 - this.field1425[5] << 8);
                }
                if (var10.field87 >= 0) {
                    var9 = var10.field87;
                    var4 += (long) (var9 - this.field1425[3] << 16);
                }
            } else if (super.field1627 >= 0) {
                var6 = class2.field77[super.field1627].field79[super.field1628];
            }
            class16 var11 = (class16) field1441.method572(var4);
            if (arg0 <= 0) {
                throw new NullPointerException();
            } else {
                if (var11 == null) {
                    boolean var12 = false;
                    for (int var13 = 0; var13 < 12; ++var13) {
                        int var14 = this.field1425[var13];
                        if (var9 >= 0 && var13 == 3) {
                            var14 = var9;
                        }
                        if (var8 >= 0 && var13 == 5) {
                            var14 = var8;
                        }
                        if (var14 >= 256 && var14 < 512 && !class69.field1726[var14 - 256].method581(-33860)) {
                            var12 = true;
                        }
                        if (var14 >= 512 && !class48.method453(var14 - 512).method452(8, this.field1432)) {
                            var12 = true;
                        }
                    }
                    if (var12) {
                        if (this.field1433 != -1L) {
                            var11 = (class16) field1441.method572(this.field1433);
                        }
                        if (var11 == null) {
                            return null;
                        }
                    }
                }
                if (var11 == null) {
                    class16[] var15 = new class16[12];
                    int var16 = 0;
                    for (int var17 = 0; var17 < 12; ++var17) {
                        int var19 = this.field1425[var17];
                        if (var9 >= 0 && var17 == 3) {
                            var19 = var9;
                        }
                        if (var8 >= 0 && var17 == 5) {
                            var19 = var8;
                        }
                        if (var19 >= 256 && var19 < 512) {
                            class16 var20 = class69.field1726[var19 - 256].method582(this.field1419);
                            if (var20 != null) {
                                var15[var16++] = var20;
                            }
                        }
                        if (var19 >= 512) {
                            class16 var21 = class48.method453(var19 - 512).method447(-40848, this.field1432);
                            if (var21 != null) {
                                var15[var16++] = var21;
                            }
                        }
                    }
                    var11 = new class16(var16, var15, this.field1444);
                    for (int var18 = 0; var18 < 5; ++var18) {
                        if (this.field1448[var18] != 0) {
                            var11.method232(client.field517[var18][0], client.field517[var18][this.field1448[var18]]);
                            if (var18 == 1) {
                                var11.method232(client.field580[0], client.field580[this.field1448[var18]]);
                            }
                        }
                    }
                    var11.method225((byte) -116);
                    var11.method235(64, 850, -30, -50, -30, true);
                    field1441.method573(false, var11, var4);
                    this.field1433 = var4;
                }
                if (this.field1446) {
                    return var11;
                } else {
                    class16 var22 = class16.field771;
                    var22.method220(68, class37.method302(true, var6) & class37.method302(true, var7), var11);
                    if (var6 != -1 && var7 != -1) {
                        var22.method227(var7, var6, class2.field77[super.field1653].field83, 955);
                    } else if (var6 != -1) {
                        var22.method226((byte) 8, var6);
                    }
                    var22.method222((byte) -42);
                    var22.field807 = null;
                    var22.field806 = null;
                    return var22;
                }
            }
        }
    }

    @OriginalMember(owner = "client!TPTANZXN", name = "d", descriptor = "(I)LFLXAIVEA;")
    public final class16 method458(int arg0) {
        if (!this.field1429) {
            return null;
        } else if (this.field1431 != null) {
            return this.field1431.method271(-727);
        } else {
            boolean var2 = false;
            if (arg0 != 0) {
                throw new NullPointerException();
            } else {
                for (int var3 = 0; var3 < 12; ++var3) {
                    int var12 = this.field1425[var3];
                    if (var12 >= 256 && var12 < 512 && !class69.field1726[var12 - 256].method583((byte) 62)) {
                        var2 = true;
                    }
                    if (var12 >= 512 && !class48.method453(var12 - 512).method450(this.field1432, false)) {
                        var2 = true;
                    }
                }
                if (var2) {
                    return null;
                } else {
                    class16[] var4 = new class16[12];
                    int var5 = 0;
                    for (int var6 = 0; var6 < 12; ++var6) {
                        int var9 = this.field1425[var6];
                        if (var9 >= 256 && var9 < 512) {
                            class16 var10 = class69.field1726[var9 - 256].method584(true);
                            if (var10 != null) {
                                var4[var5++] = var10;
                            }
                        }
                        if (var9 >= 512) {
                            class16 var11 = class48.method453(var9 - 512).method444(this.field1432, 400);
                            if (var11 != null) {
                                var4[var5++] = var11;
                            }
                        }
                    }
                    class16 var7 = new class16(var5, var4, this.field1444);
                    for (int var8 = 0; var8 < 5; ++var8) {
                        if (this.field1448[var8] != 0) {
                            var7.method232(client.field517[var8][0], client.field517[var8][this.field1448[var8]]);
                            if (var8 == 1) {
                                var7.method232(client.field580[0], client.field580[this.field1448[var8]]);
                            }
                        }
                    }
                    return var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!TPTANZXN", name = "a", descriptor = "(B)LFLXAIVEA;")
    public final class16 method190(byte arg0) {
        if (!this.field1429) {
            return null;
        } else {
            class16 var2 = this.method457(507);
            if (var2 == null) {
                return null;
            } else {
                super.field1648 = var2.field865;
                var2.field808 = true;
                if (this.field1446) {
                    return var2;
                } else {
                    if (super.field1634 != -1 && super.field1635 != -1) {
                        class38 var3 = class38.field1171[super.field1634];
                        class16 var4 = var3.method305();
                        if (var4 != null) {
                            class16 var5 = new class16(var4, class37.method302(true, super.field1635), true, (byte) 8, false);
                            var5.method231(0, -super.field1638, true, 0);
                            var5.method225((byte) -116);
                            var5.method226((byte) 8, var3.field1175.field79[super.field1635]);
                            var5.field807 = null;
                            var5.field806 = null;
                            if (var3.field1178 != 128 || var3.field1179 != 128) {
                                var5.method234(var3.field1178, var3.field1178, (byte) 73, var3.field1179);
                            }
                            var5.method235(var3.field1181 + 64, var3.field1182 + 850, -30, -50, -30, true);
                            class16[] var6 = new class16[] { var2, var5 };
                            var2 = new class16(2, 0, true, var6);
                        }
                    }
                    if (this.field1437 != null) {
                        if (client.field581 >= this.field1427) {
                            this.field1437 = null;
                        }
                        if (client.field581 >= this.field1426 && client.field581 < this.field1427) {
                            class16 var7 = this.field1437;
                            var7.method231(this.field1436 - super.field1624, this.field1435 - this.field1447, true, this.field1434 - super.field1623);
                            if (super.field1614 == 512) {
                                var7.method229((byte) 0);
                                var7.method229((byte) 0);
                                var7.method229((byte) 0);
                            } else if (super.field1614 == 1024) {
                                var7.method229((byte) 0);
                                var7.method229((byte) 0);
                            } else if (super.field1614 == 1536) {
                                var7.method229((byte) 0);
                            }
                            class16[] var8 = new class16[] { var2, var7 };
                            var2 = new class16(2, 0, true, var8);
                            if (super.field1614 == 512) {
                                var7.method229((byte) 0);
                            } else if (super.field1614 == 1024) {
                                var7.method229((byte) 0);
                                var7.method229((byte) 0);
                            } else if (super.field1614 == 1536) {
                                var7.method229((byte) 0);
                                var7.method229((byte) 0);
                                var7.method229((byte) 0);
                            }
                            var7.method231(super.field1624 - this.field1436, this.field1447 - this.field1435, true, super.field1623 - this.field1434);
                        }
                    }
                    var2.field808 = true;
                    if (this.field1439 == arg0) {
                        boolean var9 = false;
                    } else {
                        this.field1430 = !this.field1430;
                    }
                    return var2;
                }
            }
        }
    }
}
