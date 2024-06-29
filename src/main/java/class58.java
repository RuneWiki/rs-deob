import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!TINBLEHZ")
public class class58 extends class3 {

    @OriginalMember(owner = "client!TINBLEHZ", name = "tb", descriptor = "J")
    public long field1550 = -1L;

    @OriginalMember(owner = "client!TINBLEHZ", name = "Bb", descriptor = "[I")
    public int[] field1558 = new int[5];

    @OriginalMember(owner = "client!TINBLEHZ", name = "Cb", descriptor = "Z")
    public boolean field1559 = false;

    @OriginalMember(owner = "client!TINBLEHZ", name = "Eb", descriptor = "Z")
    private boolean field1561 = false;

    @OriginalMember(owner = "client!TINBLEHZ", name = "Fb", descriptor = "[I")
    public int[] field1562 = new int[12];

    @OriginalMember(owner = "client!TINBLEHZ", name = "Mb", descriptor = "I")
    public int field1569 = -1;

    @OriginalMember(owner = "client!TINBLEHZ", name = "Ob", descriptor = "I")
    public int field1571 = -1;

    @OriginalMember(owner = "client!TINBLEHZ", name = "Pb", descriptor = "Z")
    public boolean field1572 = false;

    @OriginalMember(owner = "client!TINBLEHZ", name = "zb", descriptor = "LLXKBDSHJ;")
    public static class41 field1556 = new class41((byte) 0, 260);

    @OriginalMember(owner = "client!TINBLEHZ", name = "pb", descriptor = "I")
    public int field1546;

    @OriginalMember(owner = "client!TINBLEHZ", name = "qb", descriptor = "I")
    public int field1547;

    @OriginalMember(owner = "client!TINBLEHZ", name = "rb", descriptor = "I")
    public int field1548;

    @OriginalMember(owner = "client!TINBLEHZ", name = "sb", descriptor = "I")
    public int field1549;

    @OriginalMember(owner = "client!TINBLEHZ", name = "ub", descriptor = "I")
    public int field1551;

    @OriginalMember(owner = "client!TINBLEHZ", name = "vb", descriptor = "I")
    public int field1552;

    @OriginalMember(owner = "client!TINBLEHZ", name = "wb", descriptor = "I")
    public int field1553;

    @OriginalMember(owner = "client!TINBLEHZ", name = "xb", descriptor = "I")
    public int field1554;

    @OriginalMember(owner = "client!TINBLEHZ", name = "Ab", descriptor = "I")
    private int field1557;

    @OriginalMember(owner = "client!TINBLEHZ", name = "Db", descriptor = "I")
    public int field1560;

    @OriginalMember(owner = "client!TINBLEHZ", name = "Gb", descriptor = "I")
    public int field1563;

    @OriginalMember(owner = "client!TINBLEHZ", name = "Hb", descriptor = "I")
    public int field1564;

    @OriginalMember(owner = "client!TINBLEHZ", name = "Ib", descriptor = "I")
    public int field1565;

    @OriginalMember(owner = "client!TINBLEHZ", name = "Kb", descriptor = "I")
    public int field1567;

    @OriginalMember(owner = "client!TINBLEHZ", name = "Nb", descriptor = "I")
    public int field1570;

    @OriginalMember(owner = "client!TINBLEHZ", name = "yb", descriptor = "J")
    public long field1555;

    @OriginalMember(owner = "client!TINBLEHZ", name = "Jb", descriptor = "LOGORHYVW;")
    public class45 field1566;

    @OriginalMember(owner = "client!TINBLEHZ", name = "Lb", descriptor = "LYXSRFNQD;")
    public class69 field1568;

    @OriginalMember(owner = "client!TINBLEHZ", name = "Qb", descriptor = "Ljava/lang/String;")
    public String field1573;

    @OriginalMember(owner = "client!TINBLEHZ", name = "a", descriptor = "(B)LOGORHYVW;")
    private final class45 method514(byte arg0) {
        if (arg0 != -94) {
            this.field1561 = !this.field1561;
        }
        if (this.field1568 != null) {
            int var2 = -1;
            if (super.field47 >= 0 && super.field50 == 0) {
                var2 = class34.field1140[super.field47].field1142[super.field48];
            } else if (super.field53 >= 0) {
                var2 = class34.field1140[super.field53].field1142[super.field54];
            }
            return this.field1568.method595((int[]) null, -1, var2, 866);
        } else {
            long var4 = this.field1555;
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (super.field47 >= 0 && super.field50 == 0) {
                class34 var10 = class34.field1140[super.field47];
                var6 = var10.field1142[super.field48];
                if (super.field53 >= 0 && super.field65 != super.field53) {
                    var7 = class34.field1140[super.field53].field1142[super.field54];
                }
                if (var10.field1149 >= 0) {
                    var8 = var10.field1149;
                    var4 += (long) (var8 - this.field1562[5] << 8);
                }
                if (var10.field1150 >= 0) {
                    var9 = var10.field1150;
                    var4 += (long) (var9 - this.field1562[3] << 16);
                }
            } else if (super.field53 >= 0) {
                var6 = class34.field1140[super.field53].field1142[super.field54];
            }
            class45 var11 = (class45) field1556.method413(var4);
            if (var11 == null) {
                boolean var12 = false;
                for (int var13 = 0; var13 < 12; ++var13) {
                    int var14 = this.field1562[var13];
                    if (var9 >= 0 && var13 == 3) {
                        var14 = var9;
                    }
                    if (var8 >= 0 && var13 == 5) {
                        var14 = var8;
                    }
                    if (var14 >= 256 && var14 < 512 && !class44.field1258[var14 - 256].method425((byte) -32)) {
                        var12 = true;
                    }
                    if (var14 >= 512 && !class54.method482(var14 - 512).method488(0, this.field1553)) {
                        var12 = true;
                    }
                }
                if (var12) {
                    if (this.field1550 != -1L) {
                        var11 = (class45) field1556.method413(this.field1550);
                    }
                    if (var11 == null) {
                        return null;
                    }
                }
            }
            if (var11 == null) {
                class45[] var15 = new class45[12];
                int var16 = 0;
                for (int var17 = 0; var17 < 12; ++var17) {
                    int var19 = this.field1562[var17];
                    if (var9 >= 0 && var17 == 3) {
                        var19 = var9;
                    }
                    if (var8 >= 0 && var17 == 5) {
                        var19 = var8;
                    }
                    if (var19 >= 256 && var19 < 512) {
                        class45 var20 = class44.field1258[var19 - 256].method426(937);
                        if (var20 != null) {
                            var15[var16++] = var20;
                        }
                    }
                    if (var19 >= 512) {
                        class45 var21 = class54.method482(var19 - 512).method489(121, this.field1553);
                        if (var21 != null) {
                            var15[var16++] = var21;
                        }
                    }
                }
                var11 = new class45(var16, (byte) -112, var15);
                for (int var18 = 0; var18 < 5; ++var18) {
                    if (this.field1558[var18] != 0) {
                        var11.method447(client.field356[var18][0], client.field356[var18][this.field1558[var18]]);
                        if (var18 == 1) {
                            var11.method447(client.field306[0], client.field306[this.field1558[var18]]);
                        }
                    }
                }
                var11.method440(474);
                var11.method450(64, 850, -30, -50, -30, true);
                field1556.method414(-681, var11, var4);
                this.field1550 = var4;
            }
            if (this.field1572) {
                return var11;
            } else {
                class45 var22 = class45.field1272;
                var22.method435(9, var11, class47.method467((byte) -39, var6) & class47.method467((byte) -39, var7));
                if (var6 != -1 && var7 != -1) {
                    var22.method442(class34.field1140[super.field47].field1146, var6, (byte) 1, var7);
                } else if (var6 != -1) {
                    var22.method441((byte) 9, var6);
                }
                var22.method437(true);
                var22.field1308 = null;
                var22.field1307 = null;
                return var22;
            }
        }
    }

    @OriginalMember(owner = "client!TINBLEHZ", name = "b", descriptor = "(B)LOGORHYVW;")
    public final class45 method515(byte arg0) {
        if (!this.field1559) {
            return null;
        } else if (this.field1568 != null) {
            return this.field1568.method596(9);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var12 = this.field1562[var3];
                if (var12 >= 256 && var12 < 512 && !class44.field1258[var12 - 256].method427((byte) -94)) {
                    var2 = true;
                }
                if (var12 >= 512 && !class54.method482(var12 - 512).method484(this.field1553, 23478)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                class45[] var4 = new class45[12];
                int var5 = 0;
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var9 = this.field1562[var6];
                    if (var9 >= 256 && var9 < 512) {
                        class45 var10 = class44.field1258[var9 - 256].method428(false);
                        if (var10 != null) {
                            var4[var5++] = var10;
                        }
                    }
                    if (var9 >= 512) {
                        class45 var11 = class54.method482(var9 - 512).method491(7, this.field1553);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                }
                class45 var7 = new class45(var5, (byte) -112, var4);
                for (int var8 = 0; var8 < 5; ++var8) {
                    if (this.field1558[var8] != 0) {
                        var7.method447(client.field356[var8][0], client.field356[var8][this.field1558[var8]]);
                        if (var8 == 1) {
                            var7.method447(client.field306[0], client.field306[this.field1558[var8]]);
                        }
                    }
                }
                if (arg0 != 71) {
                    throw new NullPointerException();
                } else {
                    return var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!TINBLEHZ", name = "a", descriptor = "(I)LOGORHYVW;")
    public final class45 method5(int arg0) {
        if (!this.field1559) {
            return null;
        } else {
            class45 var2 = this.method514((byte) -94);
            if (var2 == null) {
                return null;
            } else {
                super.field56 = var2.field695;
                var2.field1309 = true;
                if (this.field1572) {
                    return var2;
                } else {
                    if (super.field20 != -1 && super.field21 != -1) {
                        class24 var3 = class24.field864[super.field20];
                        class45 var4 = var3.method245();
                        if (var4 != null) {
                            class45 var5 = new class45(-18434, true, var4, class47.method467((byte) -39, super.field21), false);
                            var5.method446(-super.field24, this.field1557, 0, 0);
                            var5.method440(474);
                            var5.method441((byte) 9, var3.field868.field1142[super.field21]);
                            var5.field1308 = null;
                            var5.field1307 = null;
                            if (var3.field871 != 128 || var3.field872 != 128) {
                                var5.method449(var3.field871, 23590, var3.field871, var3.field872);
                            }
                            var5.method450(var3.field874 + 64, var3.field875 + 850, -30, -50, -30, true);
                            class45[] var6 = new class45[] { var2, var5 };
                            var2 = new class45(2, true, 0, var6);
                        }
                    }
                    if (this.field1566 != null) {
                        if (client.field493 >= this.field1552) {
                            this.field1566 = null;
                        }
                        if (client.field493 >= this.field1551 && client.field493 < this.field1552) {
                            class45 var7 = this.field1566;
                            var7.method446(this.field1564 - this.field1570, this.field1557, this.field1563 - super.field30, this.field1565 - super.field31);
                            if (super.field75 == 512) {
                                var7.method444(6);
                                var7.method444(6);
                                var7.method444(6);
                            } else if (super.field75 == 1024) {
                                var7.method444(6);
                                var7.method444(6);
                            } else if (super.field75 == 1536) {
                                var7.method444(6);
                            }
                            class45[] var8 = new class45[] { var2, var7 };
                            var2 = new class45(2, true, 0, var8);
                            if (super.field75 == 512) {
                                var7.method444(6);
                            } else if (super.field75 == 1024) {
                                var7.method444(6);
                                var7.method444(6);
                            } else if (super.field75 == 1536) {
                                var7.method444(6);
                                var7.method444(6);
                                var7.method444(6);
                            }
                            var7.method446(this.field1570 - this.field1564, this.field1557, super.field30 - this.field1563, super.field31 - this.field1565);
                        }
                    }
                    var2.field1309 = true;
                    if (arg0 != 0) {
                        throw new NullPointerException();
                    } else {
                        return var2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!TINBLEHZ", name = "c", descriptor = "(I)Z")
    public final boolean method8(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        } else {
            return this.field1559;
        }
    }

    @OriginalMember(owner = "client!TINBLEHZ", name = "a", descriptor = "(LTKPFKOXP;I)V")
    public final void method516(class59 arg0, int arg1) {
        arg0.field1589 = 0;
        this.field1553 = arg0.method529();
        this.field1571 = arg0.method530();
        this.field1569 = arg0.method530();
        this.field1568 = null;
        this.field1554 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg0.method529();
            if (var4 == 0) {
                this.field1562[var3] = 0;
            } else {
                int var5 = arg0.method529();
                this.field1562[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field1562[0] == 65535) {
                    this.field1568 = class69.method598(arg0.method531());
                    break;
                }
                if (this.field1562[var3] >= 512 && this.field1562[var3] - 512 < class54.field1427) {
                    int var12 = class54.method482(this.field1562[var3] - 512).field1444;
                    if (var12 != 0) {
                        this.field1554 = var12;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var11 = arg0.method529();
            if (var11 < 0 || var11 >= client.field356[var6].length) {
                var11 = 0;
            }
            this.field1558[var6] = var11;
        }
        super.field65 = arg0.method531();
        if (super.field65 == 65535) {
            super.field65 = -1;
        }
        super.field66 = arg0.method531();
        if (super.field66 == 65535) {
            super.field66 = -1;
        }
        super.field25 = arg0.method531();
        if (super.field25 == 65535) {
            super.field25 = -1;
        }
        super.field26 = arg0.method531();
        if (arg1 != -43453) {
            this.field1561 = !this.field1561;
        }
        if (super.field26 == 65535) {
            super.field26 = -1;
        }
        super.field27 = arg0.method531();
        if (super.field27 == 65535) {
            super.field27 = -1;
        }
        super.field28 = arg0.method531();
        if (super.field28 == 65535) {
            super.field28 = -1;
        }
        super.field64 = arg0.method531();
        if (super.field64 == 65535) {
            super.field64 = -1;
        }
        this.field1573 = class12.method186(class12.method183(39082, arg0.method535((byte) 37)), 7139);
        this.field1567 = arg0.method529();
        this.field1560 = arg0.method531();
        this.field1559 = true;
        this.field1555 = 0L;
        int var7 = this.field1562[5];
        int var8 = this.field1562[9];
        this.field1562[5] = var8;
        this.field1562[9] = var7;
        for (int var9 = 0; var9 < 12; ++var9) {
            this.field1555 <<= 4;
            if (this.field1562[var9] >= 256) {
                this.field1555 += (long) (this.field1562[var9] - 256);
            }
        }
        if (this.field1562[0] >= 256) {
            this.field1555 += (long) (this.field1562[0] - 256 >> 4);
        }
        if (this.field1562[1] >= 256) {
            this.field1555 += (long) (this.field1562[1] - 256 >> 8);
        }
        this.field1562[5] = var7;
        this.field1562[9] = var8;
        for (int var10 = 0; var10 < 5; ++var10) {
            this.field1555 <<= 3;
            this.field1555 += (long) this.field1558[var10];
        }
        this.field1555 <<= 1;
        this.field1555 += (long) this.field1553;
    }
}
