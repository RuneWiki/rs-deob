import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ZATRZGAA")
public class class66 extends class36 {

    @OriginalMember(owner = "client!ZATRZGAA", name = "sb", descriptor = "[I")
    public int[] field1561 = new int[12];

    @OriginalMember(owner = "client!ZATRZGAA", name = "Ab", descriptor = "B")
    private byte field1569 = 0;

    @OriginalMember(owner = "client!ZATRZGAA", name = "Gb", descriptor = "J")
    public long field1575 = -1L;

    @OriginalMember(owner = "client!ZATRZGAA", name = "Lb", descriptor = "I")
    private int field1580 = 8;

    @OriginalMember(owner = "client!ZATRZGAA", name = "Mb", descriptor = "[I")
    public int[] field1581 = new int[5];

    @OriginalMember(owner = "client!ZATRZGAA", name = "Ob", descriptor = "I")
    public int field1583 = -1;

    @OriginalMember(owner = "client!ZATRZGAA", name = "Qb", descriptor = "I")
    private int field1585 = 2040;

    @OriginalMember(owner = "client!ZATRZGAA", name = "Rb", descriptor = "Z")
    public boolean field1586 = false;

    @OriginalMember(owner = "client!ZATRZGAA", name = "Tb", descriptor = "I")
    public int field1588 = -1;

    @OriginalMember(owner = "client!ZATRZGAA", name = "Ub", descriptor = "Z")
    public boolean field1589 = false;

    @OriginalMember(owner = "client!ZATRZGAA", name = "Bb", descriptor = "LBVBRKPZH;")
    public static class5 field1570 = new class5(-21657, 260);

    @OriginalMember(owner = "client!ZATRZGAA", name = "tb", descriptor = "I")
    public int field1562;

    @OriginalMember(owner = "client!ZATRZGAA", name = "ub", descriptor = "I")
    public int field1563;

    @OriginalMember(owner = "client!ZATRZGAA", name = "vb", descriptor = "I")
    public int field1564;

    @OriginalMember(owner = "client!ZATRZGAA", name = "wb", descriptor = "I")
    public int field1565;

    @OriginalMember(owner = "client!ZATRZGAA", name = "xb", descriptor = "I")
    public int field1566;

    @OriginalMember(owner = "client!ZATRZGAA", name = "yb", descriptor = "I")
    public int field1567;

    @OriginalMember(owner = "client!ZATRZGAA", name = "Cb", descriptor = "I")
    public int field1571;

    @OriginalMember(owner = "client!ZATRZGAA", name = "Db", descriptor = "I")
    public int field1572;

    @OriginalMember(owner = "client!ZATRZGAA", name = "Eb", descriptor = "I")
    public int field1573;

    @OriginalMember(owner = "client!ZATRZGAA", name = "Fb", descriptor = "I")
    public int field1574;

    @OriginalMember(owner = "client!ZATRZGAA", name = "Hb", descriptor = "I")
    public int field1576;

    @OriginalMember(owner = "client!ZATRZGAA", name = "Ib", descriptor = "I")
    public int field1577;

    @OriginalMember(owner = "client!ZATRZGAA", name = "Jb", descriptor = "I")
    public int field1578;

    @OriginalMember(owner = "client!ZATRZGAA", name = "Pb", descriptor = "I")
    public int field1584;

    @OriginalMember(owner = "client!ZATRZGAA", name = "Vb", descriptor = "I")
    private int field1590;

    @OriginalMember(owner = "client!ZATRZGAA", name = "Nb", descriptor = "J")
    public long field1582;

    @OriginalMember(owner = "client!ZATRZGAA", name = "Kb", descriptor = "LIEHKDFMR;")
    public class18 field1579;

    @OriginalMember(owner = "client!ZATRZGAA", name = "zb", descriptor = "LZLQCXMFK;")
    public class67 field1568;

    @OriginalMember(owner = "client!ZATRZGAA", name = "Sb", descriptor = "Ljava/lang/String;")
    public String field1587;

    @OriginalMember(owner = "client!ZATRZGAA", name = "a", descriptor = "(I)LIEHKDFMR;")
    public final class18 method24(int arg0) {
        if (!this.field1589) {
            return null;
        } else {
            class18 var2 = this.method506(0);
            if (var2 == null) {
                return null;
            } else {
                super.field1033 = var2.field680;
                var2.field799 = true;
                if (arg0 != 0) {
                    throw new NullPointerException();
                } else if (this.field1586) {
                    return var2;
                } else {
                    if (super.field1042 != -1 && super.field1043 != -1) {
                        class47 var3 = class47.field1276[super.field1042];
                        class18 var4 = var3.method396();
                        if (var4 != null) {
                            class18 var5 = new class18(false, (byte) 1, class33.method337(this.field1569, super.field1043), var4, true);
                            var5.method280(0, 0, -super.field1046, -530);
                            var5.method274(false);
                            var5.method275((byte) 9, var3.field1280.field1446[super.field1043]);
                            var5.field798 = null;
                            var5.field797 = null;
                            if (var3.field1283 != 128 || var3.field1284 != 128) {
                                var5.method283(var3.field1283, var3.field1284, 42667, var3.field1283);
                            }
                            var5.method284(var3.field1286 + 64, var3.field1287 + 850, -30, -50, -30, true);
                            class18[] var6 = new class18[] { var2, var5 };
                            var2 = new class18((byte) -29, true, 2, var6);
                        }
                    }
                    if (this.field1579 != null) {
                        if (client.field257 >= this.field1572) {
                            this.field1579 = null;
                        }
                        if (client.field257 >= this.field1571 && client.field257 < this.field1572) {
                            class18 var7 = this.field1579;
                            var7.method280(this.field1576 - super.field1059, this.field1578 - super.field1060, this.field1577 - this.field1573, -530);
                            if (super.field1055 == 512) {
                                var7.method278(297);
                                var7.method278(297);
                                var7.method278(297);
                            } else if (super.field1055 == 1024) {
                                var7.method278(297);
                                var7.method278(297);
                            } else if (super.field1055 == 1536) {
                                var7.method278(297);
                            }
                            class18[] var8 = new class18[] { var2, var7 };
                            var2 = new class18((byte) -29, true, 2, var8);
                            if (super.field1055 == 512) {
                                var7.method278(297);
                            } else if (super.field1055 == 1024) {
                                var7.method278(297);
                                var7.method278(297);
                            } else if (super.field1055 == 1536) {
                                var7.method278(297);
                                var7.method278(297);
                                var7.method278(297);
                            }
                            var7.method280(super.field1059 - this.field1576, super.field1060 - this.field1578, this.field1573 - this.field1577, -530);
                        }
                    }
                    var2.field799 = true;
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ZATRZGAA", name = "c", descriptor = "(I)LIEHKDFMR;")
    public final class18 method504(int arg0) {
        if (!this.field1589) {
            return null;
        } else if (this.field1568 != null) {
            return this.field1568.method507(-43505);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var12 = this.field1561[var3];
                if (var12 >= 256 && var12 < 512 && !class43.field1172[var12 - 256].method377(155)) {
                    var2 = true;
                }
                if (var12 >= 512 && !class54.method447(var12 - 512).method449(this.field1584, (byte) 4)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                class18[] var4 = new class18[12];
                int var5 = 0;
                if (arg0 >= 0) {
                    throw new NullPointerException();
                } else {
                    for (int var6 = 0; var6 < 12; ++var6) {
                        int var9 = this.field1561[var6];
                        if (var9 >= 256 && var9 < 512) {
                            class18 var10 = class43.field1172[var9 - 256].method378(37587);
                            if (var10 != null) {
                                var4[var5++] = var10;
                            }
                        }
                        if (var9 >= 512) {
                            class18 var11 = class54.method447(var9 - 512).method452(this.field1584, 4);
                            if (var11 != null) {
                                var4[var5++] = var11;
                            }
                        }
                    }
                    class18 var7 = new class18(var4, this.field1580, var5);
                    for (int var8 = 0; var8 < 5; ++var8) {
                        if (this.field1581[var8] != 0) {
                            var7.method281(client.field245[var8][0], client.field245[var8][this.field1581[var8]]);
                            if (var8 == 1) {
                                var7.method281(client.field454[0], client.field454[this.field1581[var8]]);
                            }
                        }
                    }
                    return var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ZATRZGAA", name = "a", descriptor = "(LEMWAMCXW;I)V")
    public final void method505(class14 arg0, int arg1) {
        arg0.field707 = 0;
        this.field1584 = arg0.method217();
        this.field1588 = arg0.method218();
        this.field1583 = arg0.method218();
        this.field1568 = null;
        this.field1567 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg0.method217();
            if (var4 == 0) {
                this.field1561[var3] = 0;
            } else {
                int var5 = arg0.method217();
                this.field1561[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field1561[0] == 65535) {
                    this.field1568 = class67.method509(arg0.method219());
                    break;
                }
                if (this.field1561[var3] >= 512 && this.field1561[var3] - 512 < class54.field1439) {
                    int var12 = class54.method447(this.field1561[var3] - 512).field1441;
                    if (var12 != 0) {
                        this.field1567 = var12;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var11 = arg0.method217();
            if (var11 < 0 || var11 >= client.field245[var6].length) {
                var11 = 0;
            }
            this.field1581[var6] = var11;
        }
        super.field1040 = arg0.method219();
        if (super.field1040 == 65535) {
            super.field1040 = -1;
        }
        super.field1041 = arg0.method219();
        if (arg1 == 5696) {
            if (super.field1041 == 65535) {
                super.field1041 = -1;
            }
            super.field1036 = arg0.method219();
            if (super.field1036 == 65535) {
                super.field1036 = -1;
            }
            super.field1037 = arg0.method219();
            if (super.field1037 == 65535) {
                super.field1037 = -1;
            }
            super.field1038 = arg0.method219();
            if (super.field1038 == 65535) {
                super.field1038 = -1;
            }
            super.field1039 = arg0.method219();
            if (super.field1039 == 65535) {
                super.field1039 = -1;
            }
            super.field1057 = arg0.method219();
            if (super.field1057 == 65535) {
                super.field1057 = -1;
            }
            this.field1587 = class56.method465(-74, class56.method462(false, arg0.method223(3)));
            this.field1574 = arg0.method217();
            this.field1566 = arg0.method219();
            this.field1589 = true;
            this.field1582 = 0L;
            int var7 = this.field1561[5];
            int var8 = this.field1561[9];
            this.field1561[5] = var8;
            this.field1561[9] = var7;
            for (int var9 = 0; var9 < 12; ++var9) {
                this.field1582 <<= 4;
                if (this.field1561[var9] >= 256) {
                    this.field1582 += (long) (this.field1561[var9] - 256);
                }
            }
            if (this.field1561[0] >= 256) {
                this.field1582 += (long) (this.field1561[0] - 256 >> 4);
            }
            if (this.field1561[1] >= 256) {
                this.field1582 += (long) (this.field1561[1] - 256 >> 8);
            }
            this.field1561[5] = var7;
            this.field1561[9] = var8;
            for (int var10 = 0; var10 < 5; ++var10) {
                this.field1582 <<= 3;
                this.field1582 += (long) this.field1581[var10];
            }
            this.field1582 <<= 1;
            this.field1582 += (long) this.field1584;
        }
    }

    @OriginalMember(owner = "client!ZATRZGAA", name = "d", descriptor = "(I)LIEHKDFMR;")
    private final class18 method506(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        } else if (this.field1568 != null) {
            int var2 = -1;
            if (super.field1064 >= 0 && super.field1067 == 0) {
                var2 = class55.field1444[super.field1064].field1446[super.field1065];
            } else if (super.field1078 >= 0) {
                var2 = class55.field1444[super.field1078].field1446[super.field1079];
            }
            return this.field1568.method512(-1, (int[]) null, var2, (byte) -26);
        } else {
            long var4 = this.field1582;
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (super.field1064 >= 0 && super.field1067 == 0) {
                class55 var10 = class55.field1444[super.field1064];
                var6 = var10.field1446[super.field1065];
                if (super.field1078 >= 0 && super.field1078 != super.field1040) {
                    var7 = class55.field1444[super.field1078].field1446[super.field1079];
                }
                if (var10.field1453 >= 0) {
                    var8 = var10.field1453;
                    var4 += (long) (var8 - this.field1561[5] << 8);
                }
                if (var10.field1454 >= 0) {
                    var9 = var10.field1454;
                    var4 += (long) (var9 - this.field1561[3] << 16);
                }
            } else if (super.field1078 >= 0) {
                var6 = class55.field1444[super.field1078].field1446[super.field1079];
            }
            class18 var11 = (class18) field1570.method25(var4);
            if (var11 == null) {
                boolean var12 = false;
                for (int var13 = 0; var13 < 12; ++var13) {
                    int var14 = this.field1561[var13];
                    if (var9 >= 0 && var13 == 3) {
                        var14 = var9;
                    }
                    if (var8 >= 0 && var13 == 5) {
                        var14 = var8;
                    }
                    if (var14 >= 256 && var14 < 512 && !class43.field1172[var14 - 256].method375(7)) {
                        var12 = true;
                    }
                    if (var14 >= 512 && !class54.method447(var14 - 512).method445(this.field1584, -665)) {
                        var12 = true;
                    }
                }
                if (var12) {
                    if (this.field1575 != -1L) {
                        var11 = (class18) field1570.method25(this.field1575);
                    }
                    if (var11 == null) {
                        return null;
                    }
                }
            }
            if (var11 == null) {
                class18[] var15 = new class18[12];
                int var16 = 0;
                for (int var17 = 0; var17 < 12; ++var17) {
                    int var19 = this.field1561[var17];
                    if (var9 >= 0 && var17 == 3) {
                        var19 = var9;
                    }
                    if (var8 >= 0 && var17 == 5) {
                        var19 = var8;
                    }
                    if (var19 >= 256 && var19 < 512) {
                        class18 var20 = class43.field1172[var19 - 256].method376(9);
                        if (var20 != null) {
                            var15[var16++] = var20;
                        }
                    }
                    if (var19 >= 512) {
                        class18 var21 = class54.method447(var19 - 512).method450(this.field1584, this.field1590);
                        if (var21 != null) {
                            var15[var16++] = var21;
                        }
                    }
                }
                var11 = new class18(var15, this.field1580, var16);
                for (int var18 = 0; var18 < 5; ++var18) {
                    if (this.field1581[var18] != 0) {
                        var11.method281(client.field245[var18][0], client.field245[var18][this.field1581[var18]]);
                        if (var18 == 1) {
                            var11.method281(client.field454[0], client.field454[this.field1581[var18]]);
                        }
                    }
                }
                var11.method274(false);
                var11.method284(64, 850, -30, -50, -30, true);
                field1570.method26((byte) 0, var4, var11);
                this.field1575 = var4;
            }
            if (this.field1586) {
                return var11;
            } else {
                class18 var22 = class18.field762;
                var22.method269(false, class33.method337(this.field1569, var6) & class33.method337(this.field1569, var7), var11);
                if (var6 != -1 && var7 != -1) {
                    var22.method276(var6, var7, false, class55.field1444[super.field1064].field1450);
                } else if (var6 != -1) {
                    var22.method275((byte) 9, var6);
                }
                var22.method271(this.field1585);
                var22.field798 = null;
                var22.field797 = null;
                return var22;
            }
        }
    }

    @OriginalMember(owner = "client!ZATRZGAA", name = "a", descriptor = "(Z)Z")
    public final boolean method342(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        } else {
            return this.field1589;
        }
    }
}
