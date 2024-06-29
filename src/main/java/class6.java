import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!CQCDOTXO")
public class class6 extends class16 {

    @OriginalMember(owner = "client!CQCDOTXO", name = "nb", descriptor = "I")
    public int field581 = -1;

    @OriginalMember(owner = "client!CQCDOTXO", name = "ob", descriptor = "I")
    public int field582 = -1;

    @OriginalMember(owner = "client!CQCDOTXO", name = "pb", descriptor = "B")
    private byte field583 = -8;

    @OriginalMember(owner = "client!CQCDOTXO", name = "wb", descriptor = "[I")
    public int[] field590 = new int[12];

    @OriginalMember(owner = "client!CQCDOTXO", name = "xb", descriptor = "I")
    private int field591 = -549;

    @OriginalMember(owner = "client!CQCDOTXO", name = "yb", descriptor = "I")
    private int field592 = 111;

    @OriginalMember(owner = "client!CQCDOTXO", name = "zb", descriptor = "Z")
    public boolean field593 = false;

    @OriginalMember(owner = "client!CQCDOTXO", name = "Cb", descriptor = "Z")
    public boolean field596 = false;

    @OriginalMember(owner = "client!CQCDOTXO", name = "Lb", descriptor = "J")
    public long field605 = -1L;

    @OriginalMember(owner = "client!CQCDOTXO", name = "Mb", descriptor = "[I")
    public int[] field606 = new int[5];

    @OriginalMember(owner = "client!CQCDOTXO", name = "Nb", descriptor = "I")
    private int field607 = 766;

    @OriginalMember(owner = "client!CQCDOTXO", name = "vb", descriptor = "LNVDACYAH;")
    public static class40 field589 = new class40(false, 260);

    @OriginalMember(owner = "client!CQCDOTXO", name = "qb", descriptor = "I")
    public int field584;

    @OriginalMember(owner = "client!CQCDOTXO", name = "rb", descriptor = "I")
    public int field585;

    @OriginalMember(owner = "client!CQCDOTXO", name = "sb", descriptor = "I")
    public int field586;

    @OriginalMember(owner = "client!CQCDOTXO", name = "tb", descriptor = "I")
    public int field587;

    @OriginalMember(owner = "client!CQCDOTXO", name = "ub", descriptor = "I")
    public int field588;

    @OriginalMember(owner = "client!CQCDOTXO", name = "Ab", descriptor = "I")
    public int field594;

    @OriginalMember(owner = "client!CQCDOTXO", name = "Bb", descriptor = "I")
    public int field595;

    @OriginalMember(owner = "client!CQCDOTXO", name = "Db", descriptor = "I")
    public int field597;

    @OriginalMember(owner = "client!CQCDOTXO", name = "Eb", descriptor = "I")
    public int field598;

    @OriginalMember(owner = "client!CQCDOTXO", name = "Fb", descriptor = "I")
    public int field599;

    @OriginalMember(owner = "client!CQCDOTXO", name = "Gb", descriptor = "I")
    public int field600;

    @OriginalMember(owner = "client!CQCDOTXO", name = "Jb", descriptor = "I")
    public int field603;

    @OriginalMember(owner = "client!CQCDOTXO", name = "Pb", descriptor = "I")
    public int field609;

    @OriginalMember(owner = "client!CQCDOTXO", name = "Qb", descriptor = "I")
    public int field610;

    @OriginalMember(owner = "client!CQCDOTXO", name = "Ib", descriptor = "J")
    public long field602;

    @OriginalMember(owner = "client!CQCDOTXO", name = "Hb", descriptor = "LIRLTEWJP;")
    public class26 field601;

    @OriginalMember(owner = "client!CQCDOTXO", name = "Ob", descriptor = "LPFWIJTDA;")
    public class45 field608;

    @OriginalMember(owner = "client!CQCDOTXO", name = "Kb", descriptor = "Ljava/lang/String;")
    public String field604;

    @OriginalMember(owner = "client!CQCDOTXO", name = "b", descriptor = "(I)Z")
    public final boolean method166(int arg0) {
        if (arg0 < 5 || arg0 > 5) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        return this.field593;
    }

    @OriginalMember(owner = "client!CQCDOTXO", name = "c", descriptor = "(I)LIRLTEWJP;")
    private final class26 method167(int arg0) {
        if (this.field608 != null) {
            int var2 = -1;
            if (super.field693 >= 0 && super.field696 == 0) {
                var2 = class47.field1336[super.field693].field1338[super.field694];
            } else if (super.field668 >= 0) {
                var2 = class47.field1336[super.field668].field1338[super.field669];
            }
            return this.field608.method440((int[]) null, -1, var2, 670);
        } else {
            long var4 = this.field602;
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (super.field693 >= 0 && super.field696 == 0) {
                class47 var10 = class47.field1336[super.field693];
                var6 = var10.field1338[super.field694];
                if (super.field668 >= 0 && super.field716 != super.field668) {
                    var7 = class47.field1336[super.field668].field1338[super.field669];
                }
                if (var10.field1345 >= 0) {
                    var8 = var10.field1345;
                    var4 += (long) (var8 - this.field590[5] << 8);
                }
                if (var10.field1346 >= 0) {
                    var9 = var10.field1346;
                    var4 += (long) (var9 - this.field590[3] << 16);
                }
            } else if (super.field668 >= 0) {
                var6 = class47.field1336[super.field668].field1338[super.field669];
            }
            class26 var11 = (class26) field589.method427(var4);
            if (arg0 >= 0) {
                throw new NullPointerException();
            } else {
                if (var11 == null) {
                    boolean var12 = false;
                    for (int var13 = 0; var13 < 12; ++var13) {
                        int var14 = this.field590[var13];
                        if (var9 >= 0 && var13 == 3) {
                            var14 = var9;
                        }
                        if (var8 >= 0 && var13 == 5) {
                            var14 = var8;
                        }
                        if (var14 >= 256 && var14 < 512 && !class46.field1326[var14 - 256].method446(0)) {
                            var12 = true;
                        }
                        if (var14 >= 512 && !class50.method475(var14 - 512).method467((byte) 2, this.field594)) {
                            var12 = true;
                        }
                    }
                    if (var12) {
                        if (this.field605 != -1L) {
                            var11 = (class26) field589.method427(this.field605);
                        }
                        if (var11 == null) {
                            return null;
                        }
                    }
                }
                if (var11 == null) {
                    class26[] var15 = new class26[12];
                    int var16 = 0;
                    for (int var17 = 0; var17 < 12; ++var17) {
                        int var19 = this.field590[var17];
                        if (var9 >= 0 && var17 == 3) {
                            var19 = var9;
                        }
                        if (var8 >= 0 && var17 == 5) {
                            var19 = var8;
                        }
                        if (var19 >= 256 && var19 < 512) {
                            class26 var20 = class46.field1326[var19 - 256].method447(0);
                            if (var20 != null) {
                                var15[var16++] = var20;
                            }
                        }
                        if (var19 >= 512) {
                            class26 var21 = class50.method475(var19 - 512).method470(-766, this.field594);
                            if (var21 != null) {
                                var15[var16++] = var21;
                            }
                        }
                    }
                    var11 = new class26(var16, 473, var15);
                    for (int var18 = 0; var18 < 5; ++var18) {
                        if (this.field606[var18] != 0) {
                            var11.method295(client.field356[var18][0], client.field356[var18][this.field606[var18]]);
                            if (var18 == 1) {
                                var11.method295(client.field211[0], client.field211[this.field606[var18]]);
                            }
                        }
                    }
                    var11.method288(49427);
                    var11.method298(64, 850, -30, -50, -30, true);
                    field589.method428(var4, (byte) 81, var11);
                    this.field605 = var4;
                }
                if (this.field596) {
                    return var11;
                } else {
                    class26 var22 = class26.field987;
                    var22.method283(this.field607, var11, class17.method211(var6, 47525) & class17.method211(var7, 47525));
                    if (var6 != -1 && var7 != -1) {
                        var22.method290(true, var6, class47.field1336[super.field693].field1342, var7);
                    } else if (var6 != -1) {
                        var22.method289(var6, true);
                    }
                    var22.method285(true);
                    var22.field1023 = null;
                    var22.field1022 = null;
                    return var22;
                }
            }
        }
    }

    @OriginalMember(owner = "client!CQCDOTXO", name = "a", descriptor = "(I)LIRLTEWJP;")
    public final class26 method168(int arg0) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (!this.field593) {
            return null;
        } else {
            class26 var3 = this.method167(-390);
            if (var3 == null) {
                return null;
            } else {
                super.field680 = var3.field794;
                var3.field1024 = true;
                if (this.field596) {
                    return var3;
                } else {
                    if (super.field710 != -1 && super.field711 != -1) {
                        class44 var4 = class44.field1269[super.field710];
                        class26 var5 = var4.method435();
                        if (var5 != null) {
                            class26 var6 = new class26(var5, false, 0, class17.method211(super.field711, 47525), true);
                            var6.method294(0, 0, (byte) 96, -super.field714);
                            var6.method288(49427);
                            var6.method289(var4.field1273.field1338[super.field711], true);
                            var6.field1023 = null;
                            var6.field1022 = null;
                            if (var4.field1276 != 128 || var4.field1277 != 128) {
                                var6.method297(var4.field1276, this.field583, var4.field1277, var4.field1276);
                            }
                            var6.method298(var4.field1279 + 64, var4.field1280 + 850, -30, -50, -30, true);
                            class26[] var7 = new class26[] { var3, var6 };
                            var3 = new class26(true, 2, 163, var7);
                        }
                    }
                    if (this.field601 != null) {
                        if (client.field542 >= this.field610) {
                            this.field601 = null;
                        }
                        if (client.field542 >= this.field609 && client.field542 < this.field610) {
                            class26 var8 = this.field601;
                            var8.method294(this.field598 - super.field706, this.field600 - super.field707, (byte) 96, this.field599 - this.field597);
                            if (super.field709 == 512) {
                                var8.method292((byte) 4);
                                var8.method292((byte) 4);
                                var8.method292((byte) 4);
                            } else if (super.field709 == 1024) {
                                var8.method292((byte) 4);
                                var8.method292((byte) 4);
                            } else if (super.field709 == 1536) {
                                var8.method292((byte) 4);
                            }
                            class26[] var9 = new class26[] { var3, var8 };
                            var3 = new class26(true, 2, 163, var9);
                            if (super.field709 == 512) {
                                var8.method292((byte) 4);
                            } else if (super.field709 == 1024) {
                                var8.method292((byte) 4);
                                var8.method292((byte) 4);
                            } else if (super.field709 == 1536) {
                                var8.method292((byte) 4);
                                var8.method292((byte) 4);
                                var8.method292((byte) 4);
                            }
                            var8.method294(super.field706 - this.field598, super.field707 - this.field600, (byte) 96, this.field597 - this.field599);
                        }
                    }
                    var3.field1024 = true;
                    return var3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!CQCDOTXO", name = "b", descriptor = "(B)LIRLTEWJP;")
    public final class26 method169(byte arg0) {
        if (!this.field593) {
            return null;
        } else if (this.field608 != null) {
            return this.field608.method436(-38435);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var12 = this.field590[var3];
                if (var12 >= 256 && var12 < 512 && !class46.field1326[var12 - 256].method448(3)) {
                    var2 = true;
                }
                if (var12 >= 512 && !class50.method475(var12 - 512).method472(this.field594, 33736)) {
                    var2 = true;
                }
            }
            if (arg0 != -106) {
                this.field591 = -296;
            }
            if (var2) {
                return null;
            } else {
                class26[] var4 = new class26[12];
                int var5 = 0;
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var9 = this.field590[var6];
                    if (var9 >= 256 && var9 < 512) {
                        class26 var10 = class46.field1326[var9 - 256].method449(758);
                        if (var10 != null) {
                            var4[var5++] = var10;
                        }
                    }
                    if (var9 >= 512) {
                        class26 var11 = class50.method475(var9 - 512).method471(this.field594, 0);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                }
                class26 var7 = new class26(var5, 473, var4);
                for (int var8 = 0; var8 < 5; ++var8) {
                    if (this.field606[var8] != 0) {
                        var7.method295(client.field356[var8][0], client.field356[var8][this.field606[var8]]);
                        if (var8 == 1) {
                            var7.method295(client.field211[0], client.field211[this.field606[var8]]);
                        }
                    }
                }
                return var7;
            }
        }
    }

    @OriginalMember(owner = "client!CQCDOTXO", name = "a", descriptor = "(ILMNKDCXXG;)V")
    public final void method170(int arg0, class37 arg1) {
        arg1.field1212 = 0;
        this.field594 = arg1.method386();
        this.field581 = arg1.method387();
        this.field582 = arg1.method387();
        this.field608 = null;
        this.field588 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg1.method386();
            if (var4 == 0) {
                this.field590[var3] = 0;
            } else {
                int var5 = arg1.method386();
                this.field590[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field590[0] == 65535) {
                    this.field608 = class45.method442(arg1.method388());
                    break;
                }
                if (this.field590[var3] >= 512 && this.field590[var3] - 512 < class50.field1375) {
                    int var12 = class50.method475(this.field590[var3] - 512).field1390;
                    if (var12 != 0) {
                        this.field588 = var12;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var11 = arg1.method386();
            if (var11 < 0 || var11 >= client.field356[var6].length) {
                var11 = 0;
            }
            this.field606[var6] = var11;
        }
        super.field716 = arg1.method388();
        if (super.field716 == 65535) {
            super.field716 = -1;
        }
        super.field717 = arg1.method388();
        if (super.field717 == 65535) {
            super.field717 = -1;
        }
        super.field684 = arg1.method388();
        if (super.field684 == 65535) {
            super.field684 = -1;
        }
        super.field685 = arg1.method388();
        if (super.field685 == 65535) {
            super.field685 = -1;
        }
        super.field686 = arg1.method388();
        if (super.field686 == 65535) {
            super.field686 = -1;
        }
        super.field687 = arg1.method388();
        if (super.field687 == 65535) {
            super.field687 = -1;
        }
        super.field683 = arg1.method388();
        while (arg0 >= 0) {
            this.field592 = -261;
        }
        if (super.field683 == 65535) {
            super.field683 = -1;
        }
        this.field604 = class53.method495(true, class53.method492(42220, arg1.method392((byte) -100)));
        this.field595 = arg1.method386();
        this.field603 = arg1.method388();
        this.field593 = true;
        this.field602 = 0L;
        int var7 = this.field590[5];
        int var8 = this.field590[9];
        this.field590[5] = var8;
        this.field590[9] = var7;
        for (int var9 = 0; var9 < 12; ++var9) {
            this.field602 <<= 4;
            if (this.field590[var9] >= 256) {
                this.field602 += (long) (this.field590[var9] - 256);
            }
        }
        if (this.field590[0] >= 256) {
            this.field602 += (long) (this.field590[0] - 256 >> 4);
        }
        if (this.field590[1] >= 256) {
            this.field602 += (long) (this.field590[1] - 256 >> 8);
        }
        this.field590[5] = var7;
        this.field590[9] = var8;
        for (int var10 = 0; var10 < 5; ++var10) {
            this.field602 <<= 3;
            this.field602 += (long) this.field606[var10];
        }
        this.field602 <<= 1;
        this.field602 += (long) this.field594;
    }
}
