import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SRMWIYVM")
public class class53 extends class10 {

    @OriginalMember(owner = "client!SRMWIYVM", name = "zb", descriptor = "Z")
    private boolean field1534 = true;

    @OriginalMember(owner = "client!SRMWIYVM", name = "Bb", descriptor = "[I")
    public int[] field1536 = new int[5];

    @OriginalMember(owner = "client!SRMWIYVM", name = "Cb", descriptor = "Z")
    public boolean field1537 = false;

    @OriginalMember(owner = "client!SRMWIYVM", name = "Eb", descriptor = "J")
    public long field1539 = -1L;

    @OriginalMember(owner = "client!SRMWIYVM", name = "Fb", descriptor = "I")
    private int field1540 = 3982;

    @OriginalMember(owner = "client!SRMWIYVM", name = "Ib", descriptor = "[I")
    public int[] field1543 = new int[12];

    @OriginalMember(owner = "client!SRMWIYVM", name = "Kb", descriptor = "I")
    public int field1545 = -1;

    @OriginalMember(owner = "client!SRMWIYVM", name = "Lb", descriptor = "I")
    private int field1546 = -697;

    @OriginalMember(owner = "client!SRMWIYVM", name = "Rb", descriptor = "Z")
    private boolean field1552 = false;

    @OriginalMember(owner = "client!SRMWIYVM", name = "Sb", descriptor = "I")
    public int field1553 = -1;

    @OriginalMember(owner = "client!SRMWIYVM", name = "Ub", descriptor = "Z")
    public boolean field1555 = false;

    @OriginalMember(owner = "client!SRMWIYVM", name = "Ab", descriptor = "LNQQFCAPC;")
    public static class36 field1535 = new class36(260, 285);

    @OriginalMember(owner = "client!SRMWIYVM", name = "sb", descriptor = "I")
    public int field1527;

    @OriginalMember(owner = "client!SRMWIYVM", name = "tb", descriptor = "I")
    public int field1528;

    @OriginalMember(owner = "client!SRMWIYVM", name = "ub", descriptor = "I")
    public int field1529;

    @OriginalMember(owner = "client!SRMWIYVM", name = "vb", descriptor = "I")
    public int field1530;

    @OriginalMember(owner = "client!SRMWIYVM", name = "wb", descriptor = "I")
    public int field1531;

    @OriginalMember(owner = "client!SRMWIYVM", name = "Db", descriptor = "I")
    public int field1538;

    @OriginalMember(owner = "client!SRMWIYVM", name = "Gb", descriptor = "I")
    public int field1541;

    @OriginalMember(owner = "client!SRMWIYVM", name = "Hb", descriptor = "I")
    public int field1542;

    @OriginalMember(owner = "client!SRMWIYVM", name = "Jb", descriptor = "I")
    public int field1544;

    @OriginalMember(owner = "client!SRMWIYVM", name = "Mb", descriptor = "I")
    public int field1547;

    @OriginalMember(owner = "client!SRMWIYVM", name = "Nb", descriptor = "I")
    public int field1548;

    @OriginalMember(owner = "client!SRMWIYVM", name = "Ob", descriptor = "I")
    public int field1549;

    @OriginalMember(owner = "client!SRMWIYVM", name = "Pb", descriptor = "I")
    public int field1550;

    @OriginalMember(owner = "client!SRMWIYVM", name = "Vb", descriptor = "I")
    public int field1556;

    @OriginalMember(owner = "client!SRMWIYVM", name = "yb", descriptor = "J")
    public long field1533;

    @OriginalMember(owner = "client!SRMWIYVM", name = "Qb", descriptor = "LFCIDIKVY;")
    public class19 field1551;

    @OriginalMember(owner = "client!SRMWIYVM", name = "xb", descriptor = "LPJGEBWSY;")
    public class46 field1532;

    @OriginalMember(owner = "client!SRMWIYVM", name = "Tb", descriptor = "Ljava/lang/String;")
    public String field1554;

    @OriginalMember(owner = "client!SRMWIYVM", name = "a", descriptor = "(ILWBEWPIXO;)V")
    public final void method454(int arg0, class58 arg1) {
        arg1.field1615 = 0;
        this.field1538 = arg1.method515();
        this.field1545 = arg1.method516();
        this.field1553 = arg1.method516();
        this.field1532 = null;
        this.field1556 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg1.method515();
            if (var4 == 0) {
                this.field1543[var3] = 0;
            } else {
                int var5 = arg1.method515();
                this.field1543[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field1543[0] == 65535) {
                    this.field1532 = class46.method393(arg1.method517());
                    break;
                }
                if (this.field1543[var3] >= 512 && this.field1543[var3] - 512 < class1.field18) {
                    int var12 = class1.method7(this.field1543[var3] - 512).field50;
                    if (var12 != 0) {
                        this.field1556 = var12;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var11 = arg1.method515();
            if (var11 < 0 || var11 >= client.field377[var6].length) {
                var11 = 0;
            }
            this.field1536[var6] = var11;
        }
        if (arg0 == 8) {
            super.field215 = arg1.method517();
            if (super.field215 == 65535) {
                super.field215 = -1;
            }
            super.field216 = arg1.method517();
            if (super.field216 == 65535) {
                super.field216 = -1;
            }
            super.field165 = arg1.method517();
            if (super.field165 == 65535) {
                super.field165 = -1;
            }
            super.field166 = arg1.method517();
            if (super.field166 == 65535) {
                super.field166 = -1;
            }
            super.field167 = arg1.method517();
            if (super.field167 == 65535) {
                super.field167 = -1;
            }
            super.field168 = arg1.method517();
            if (super.field168 == 65535) {
                super.field168 = -1;
            }
            super.field208 = arg1.method517();
            if (super.field208 == 65535) {
                super.field208 = -1;
            }
            this.field1554 = class69.method582(class69.method579(this.field1552, arg1.method521(0)), true);
            this.field1544 = arg1.method515();
            this.field1531 = arg1.method517();
            this.field1555 = true;
            this.field1533 = 0L;
            int var7 = this.field1543[5];
            int var8 = this.field1543[9];
            this.field1543[5] = var8;
            this.field1543[9] = var7;
            for (int var9 = 0; var9 < 12; ++var9) {
                this.field1533 <<= 4;
                if (this.field1543[var9] >= 256) {
                    this.field1533 += (long) (this.field1543[var9] - 256);
                }
            }
            if (this.field1543[0] >= 256) {
                this.field1533 += (long) (this.field1543[0] - 256 >> 4);
            }
            if (this.field1543[1] >= 256) {
                this.field1533 += (long) (this.field1543[1] - 256 >> 8);
            }
            this.field1543[5] = var7;
            this.field1543[9] = var8;
            for (int var10 = 0; var10 < 5; ++var10) {
                this.field1533 <<= 3;
                this.field1533 += (long) this.field1536[var10];
            }
            this.field1533 <<= 1;
            this.field1533 += (long) this.field1538;
        }
    }

    @OriginalMember(owner = "client!SRMWIYVM", name = "b", descriptor = "(Z)LFCIDIKVY;")
    public final class19 method455(boolean arg0) {
        if (!this.field1555) {
            return null;
        } else if (this.field1532 != null) {
            return this.field1532.method395(649);
        } else {
            boolean var2 = false;
            if (arg0) {
                this.field1540 = 13;
            }
            for (int var3 = 0; var3 < 12; ++var3) {
                int var12 = this.field1543[var3];
                if (var12 >= 256 && var12 < 512 && !class20.field839[var12 - 256].method229(-452)) {
                    var2 = true;
                }
                if (var12 >= 512 && !class1.method7(var12 - 512).method2(this.field1546, this.field1538)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                class19[] var4 = new class19[12];
                int var5 = 0;
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var9 = this.field1543[var6];
                    if (var9 >= 256 && var9 < 512) {
                        class19 var10 = class20.field839[var9 - 256].method230(3);
                        if (var10 != null) {
                            var4[var5++] = var10;
                        }
                    }
                    if (var9 >= 512) {
                        class19 var11 = class1.method7(var9 - 512).method6(this.field1538, 464);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                }
                class19 var7 = new class19(var5, -23, var4);
                for (int var8 = 0; var8 < 5; ++var8) {
                    if (this.field1536[var8] != 0) {
                        var7.method213(client.field377[var8][0], client.field377[var8][this.field1536[var8]]);
                        if (var8 == 1) {
                            var7.method213(client.field528[0], client.field528[this.field1536[var8]]);
                        }
                    }
                }
                return var7;
            }
        }
    }

    @OriginalMember(owner = "client!SRMWIYVM", name = "a", descriptor = "(I)LFCIDIKVY;")
    public final class19 method187(int arg0) {
        if (!this.field1555) {
            return null;
        } else {
            class19 var2 = this.method456((byte) 8);
            if (var2 == null) {
                return null;
            } else {
                super.field209 = var2.field735;
                if (arg0 != 0) {
                    throw new NullPointerException();
                } else {
                    var2.field800 = true;
                    if (this.field1537) {
                        return var2;
                    } else {
                        if (super.field182 != -1 && super.field183 != -1) {
                            class63 var3 = class63.field1652[super.field182];
                            class19 var4 = var3.method563();
                            if (var4 != null) {
                                class19 var5 = new class19(false, class21.method235(super.field183, 12073), true, var4, true);
                                var5.method212((byte) -36, 0, -super.field186, 0);
                                var5.method206(8);
                                var5.method207(var3.field1656.field1695[super.field183], (byte) -14);
                                var5.field799 = null;
                                var5.field798 = null;
                                if (var3.field1659 != 128 || var3.field1660 != 128) {
                                    var5.method215(var3.field1659, var3.field1659, this.field1534, var3.field1660);
                                }
                                var5.method216(var3.field1662 + 64, var3.field1663 + 850, -30, -50, -30, true);
                                class19[] var6 = new class19[] { var2, var5 };
                                var2 = new class19(true, var6, true, 2);
                            }
                        }
                        if (this.field1551 != null) {
                            if (client.field608 >= this.field1542) {
                                this.field1551 = null;
                            }
                            if (client.field608 >= this.field1541 && client.field608 < this.field1542) {
                                class19 var7 = this.field1551;
                                var7.method212((byte) -36, this.field1550 - super.field212, this.field1549 - this.field1547, this.field1548 - super.field211);
                                if (super.field214 == 512) {
                                    var7.method210(-79);
                                    var7.method210(-79);
                                    var7.method210(-79);
                                } else if (super.field214 == 1024) {
                                    var7.method210(-79);
                                    var7.method210(-79);
                                } else if (super.field214 == 1536) {
                                    var7.method210(-79);
                                }
                                class19[] var8 = new class19[] { var2, var7 };
                                var2 = new class19(true, var8, true, 2);
                                if (super.field214 == 512) {
                                    var7.method210(-79);
                                } else if (super.field214 == 1024) {
                                    var7.method210(-79);
                                    var7.method210(-79);
                                } else if (super.field214 == 1536) {
                                    var7.method210(-79);
                                    var7.method210(-79);
                                    var7.method210(-79);
                                }
                                var7.method212((byte) -36, super.field212 - this.field1550, this.field1547 - this.field1549, super.field211 - this.field1548);
                            }
                        }
                        var2.field800 = true;
                        return var2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!SRMWIYVM", name = "b", descriptor = "(I)Z")
    public final boolean method42(int arg0) {
        if (arg0 != 5) {
            throw new NullPointerException();
        } else {
            return this.field1555;
        }
    }

    @OriginalMember(owner = "client!SRMWIYVM", name = "a", descriptor = "(B)LFCIDIKVY;")
    private final class19 method456(byte arg0) {
        if (arg0 != 8) {
            throw new NullPointerException();
        } else if (this.field1532 != null) {
            int var2 = -1;
            if (super.field202 >= 0 && super.field205 == 0) {
                var2 = class66.field1693[super.field202].field1695[super.field203];
            } else if (super.field162 >= 0) {
                var2 = class66.field1693[super.field162].field1695[super.field163];
            }
            return this.field1532.method396((int[]) null, 0, var2, -1);
        } else {
            long var4 = this.field1533;
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (super.field202 >= 0 && super.field205 == 0) {
                class66 var10 = class66.field1693[super.field202];
                var6 = var10.field1695[super.field203];
                if (super.field162 >= 0 && super.field215 != super.field162) {
                    var7 = class66.field1693[super.field162].field1695[super.field163];
                }
                if (var10.field1702 >= 0) {
                    var8 = var10.field1702;
                    var4 += (long) (var8 - this.field1543[5] << 8);
                }
                if (var10.field1703 >= 0) {
                    var9 = var10.field1703;
                    var4 += (long) (var9 - this.field1543[3] << 16);
                }
            } else if (super.field162 >= 0) {
                var6 = class66.field1693[super.field162].field1695[super.field163];
            }
            class19 var11 = (class19) field1535.method334(var4);
            if (var11 == null) {
                boolean var12 = false;
                for (int var13 = 0; var13 < 12; ++var13) {
                    int var14 = this.field1543[var13];
                    if (var9 >= 0 && var13 == 3) {
                        var14 = var9;
                    }
                    if (var8 >= 0 && var13 == 5) {
                        var14 = var8;
                    }
                    if (var14 >= 256 && var14 < 512 && !class20.field839[var14 - 256].method227(this.field1540)) {
                        var12 = true;
                    }
                    if (var14 >= 512 && !class1.method7(var14 - 512).method13(108, this.field1538)) {
                        var12 = true;
                    }
                }
                if (var12) {
                    if (this.field1539 != -1L) {
                        var11 = (class19) field1535.method334(this.field1539);
                    }
                    if (var11 == null) {
                        return null;
                    }
                }
            }
            if (var11 == null) {
                class19[] var15 = new class19[12];
                int var16 = 0;
                for (int var17 = 0; var17 < 12; ++var17) {
                    int var19 = this.field1543[var17];
                    if (var9 >= 0 && var17 == 3) {
                        var19 = var9;
                    }
                    if (var8 >= 0 && var17 == 5) {
                        var19 = var8;
                    }
                    if (var19 >= 256 && var19 < 512) {
                        class19 var20 = class20.field839[var19 - 256].method228((byte) -26);
                        if (var20 != null) {
                            var15[var16++] = var20;
                        }
                    }
                    if (var19 >= 512) {
                        class19 var21 = class1.method7(var19 - 512).method3(this.field1538, 55);
                        if (var21 != null) {
                            var15[var16++] = var21;
                        }
                    }
                }
                var11 = new class19(var16, -23, var15);
                for (int var18 = 0; var18 < 5; ++var18) {
                    if (this.field1536[var18] != 0) {
                        var11.method213(client.field377[var18][0], client.field377[var18][this.field1536[var18]]);
                        if (var18 == 1) {
                            var11.method213(client.field528[0], client.field528[this.field1536[var18]]);
                        }
                    }
                }
                var11.method206(8);
                var11.method216(64, 850, -30, -50, -30, true);
                field1535.method335(97, var4, var11);
                this.field1539 = var4;
            }
            if (this.field1537) {
                return var11;
            } else {
                class19 var22 = class19.field763;
                var22.method201(class21.method235(var6, 12073) & class21.method235(var7, 12073), var11, 3);
                if (var6 != -1 && var7 != -1) {
                    var22.method208(class66.field1693[super.field202].field1699, var6, false, var7);
                } else if (var6 != -1) {
                    var22.method207(var6, (byte) -14);
                }
                var22.method203(8);
                var22.field799 = null;
                var22.field798 = null;
                return var22;
            }
        }
    }
}
