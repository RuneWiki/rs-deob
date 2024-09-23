import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bb")
public class PlayerEntity extends PathingEntity {

    @OriginalMember(owner = "bb", name = "rb", descriptor = "B")
    private byte field466 = 8;

    @OriginalMember(owner = "bb", name = "sb", descriptor = "Z")
    private boolean field467 = true;

    @OriginalMember(owner = "bb", name = "ub", descriptor = "Z")
    public boolean field469 = false;

    @OriginalMember(owner = "bb", name = "xb", descriptor = "[I")
    public int[] field472 = new int[12];

    @OriginalMember(owner = "bb", name = "yb", descriptor = "[I")
    public int[] field473 = new int[5];

    @OriginalMember(owner = "bb", name = "Mb", descriptor = "Z")
    public boolean field487 = false;

    @OriginalMember(owner = "bb", name = "Nb", descriptor = "J")
    public long field488 = -1L;

    @OriginalMember(owner = "bb", name = "Pb", descriptor = "Lt;")
    public static LruCache field490 = new LruCache((byte) 3, 260);

    @OriginalMember(owner = "bb", name = "vb", descriptor = "I")
    public int field470;

    @OriginalMember(owner = "bb", name = "wb", descriptor = "I")
    public int field471;

    @OriginalMember(owner = "bb", name = "zb", descriptor = "I")
    public int field474;

    @OriginalMember(owner = "bb", name = "Bb", descriptor = "I")
    public int field476;

    @OriginalMember(owner = "bb", name = "Cb", descriptor = "I")
    public int field477;

    @OriginalMember(owner = "bb", name = "Db", descriptor = "I")
    public int field478;

    @OriginalMember(owner = "bb", name = "Eb", descriptor = "I")
    public int field479;

    @OriginalMember(owner = "bb", name = "Fb", descriptor = "I")
    public int field480;

    @OriginalMember(owner = "bb", name = "Gb", descriptor = "I")
    public int field481;

    @OriginalMember(owner = "bb", name = "Ib", descriptor = "I")
    public int field483;

    @OriginalMember(owner = "bb", name = "Jb", descriptor = "I")
    public int field484;

    @OriginalMember(owner = "bb", name = "Kb", descriptor = "I")
    public int field485;

    @OriginalMember(owner = "bb", name = "Lb", descriptor = "I")
    public int field486;

    @OriginalMember(owner = "bb", name = "Ab", descriptor = "J")
    public long field475;

    @OriginalMember(owner = "bb", name = "Hb", descriptor = "Lfb;")
    public Model field482;

    @OriginalMember(owner = "bb", name = "Ob", descriptor = "Lgc;")
    public NpcType field489;

    @OriginalMember(owner = "bb", name = "tb", descriptor = "Ljava/lang/String;")
    public String field468;

    @OriginalMember(owner = "bb", name = "a", descriptor = "(Lmb;Z)V")
    public final void method130(Packet arg0, boolean arg1) {
        arg0.field711 = 0;
        this.field470 = arg0.method239();
        this.field471 = arg0.method239();
        this.field489 = null;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg0.method239();
            if (var4 == 0) {
                this.field472[var3] = 0;
            } else {
                int var5 = arg0.method239();
                this.field472[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field472[0] == 65535) {
                    this.field489 = NpcType.method344(arg0.method241());
                    break;
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var10 = arg0.method239();
            if (var10 < 0 || var10 >= client.field1538[var6].length) {
                var10 = 0;
            }
            this.field473[var6] = var10;
        }
        super.field415 = arg0.method241();
        if (!arg1) {
            for (int var7 = 1; var7 > 0; ++var7) {
            }
        }
        if (super.field415 == 65535) {
            super.field415 = -1;
        }
        super.field416 = arg0.method241();
        if (super.field416 == 65535) {
            super.field416 = -1;
        }
        super.field417 = arg0.method241();
        if (super.field417 == 65535) {
            super.field417 = -1;
        }
        super.field418 = arg0.method241();
        if (super.field418 == 65535) {
            super.field418 = -1;
        }
        super.field419 = arg0.method241();
        if (super.field419 == 65535) {
            super.field419 = -1;
        }
        super.field420 = arg0.method241();
        if (super.field420 == 65535) {
            super.field420 = -1;
        }
        super.field421 = arg0.method241();
        if (super.field421 == 65535) {
            super.field421 = -1;
        }
        this.field468 = JString.method314(true, JString.method311(arg0.method245(0), true));
        this.field474 = arg0.method239();
        this.field469 = true;
        this.field475 = 0L;
        for (int var8 = 0; var8 < 12; ++var8) {
            this.field475 <<= 4;
            if (this.field472[var8] >= 256) {
                this.field475 += (long) (this.field472[var8] - 256);
            }
        }
        if (this.field472[0] >= 256) {
            this.field475 += (long) (this.field472[0] - 256 >> 4);
        }
        if (this.field472[1] >= 256) {
            this.field475 += (long) (this.field472[1] - 256 >> 8);
        }
        for (int var9 = 0; var9 < 5; ++var9) {
            this.field475 <<= 3;
            this.field475 += (long) this.field473[var9];
        }
        this.field475 <<= 1;
        this.field475 += (long) this.field470;
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(I)Lfb;")
    public final Model method123(int arg0) {
        if (!this.field469) {
            return null;
        } else {
            Model var2 = this.method131(0);
            if (var2 == null) {
                return null;
            } else {
                super.field456 = var2.field406;
                if (arg0 != 45160) {
                    throw new NullPointerException();
                } else {
                    var2.field572 = true;
                    if (this.field487) {
                        return var2;
                    } else {
                        if (super.field443 != -1 && super.field444 != -1) {
                            SpotAnimType var3 = SpotAnimType.field1132[super.field443];
                            Model var4 = var3.method388();
                            if (var4 != null) {
                                Model var5 = new Model(AnimFrame.method62((byte) 8, super.field444), 992, false, true, var4);
                                var5.method152((byte) -32, 0, 0, -super.field447);
                                var5.method146((byte) 112);
                                var5.method147(true, var3.field1136.field1114[super.field444]);
                                var5.field571 = null;
                                var5.field570 = null;
                                if (var3.field1139 != 128 || var3.field1140 != 128) {
                                    var5.method155(792, var3.field1139, var3.field1139, var3.field1140);
                                }
                                var5.method156(var3.field1142 + 64, var3.field1143 + 850, -30, -50, -30, true);
                                Model[] var6 = new Model[] { var2, var5 };
                                var2 = new Model((byte) 9, 2, var6, true);
                            }
                        }
                        if (this.field482 != null) {
                            if (client.field1591 >= this.field478) {
                                this.field482 = null;
                            }
                            if (client.field1591 >= this.field477 && client.field1591 < this.field478) {
                                Model var7 = this.field482;
                                var7.method152((byte) -32, this.field479 - super.field410, this.field481 - super.field411, this.field480 - this.field476);
                                if (super.field457 == 512) {
                                    var7.method150(this.field466);
                                    var7.method150(this.field466);
                                    var7.method150(this.field466);
                                } else if (super.field457 == 1024) {
                                    var7.method150(this.field466);
                                    var7.method150(this.field466);
                                } else if (super.field457 == 1536) {
                                    var7.method150(this.field466);
                                }
                                Model[] var8 = new Model[] { var2, var7 };
                                var2 = new Model((byte) 9, 2, var8, true);
                                if (super.field457 == 512) {
                                    var7.method150(this.field466);
                                } else if (super.field457 == 1024) {
                                    var7.method150(this.field466);
                                    var7.method150(this.field466);
                                } else if (super.field457 == 1536) {
                                    var7.method150(this.field466);
                                    var7.method150(this.field466);
                                    var7.method150(this.field466);
                                }
                                var7.method152((byte) -32, super.field410 - this.field479, super.field411 - this.field481, this.field476 - this.field480);
                            }
                        }
                        var2.field572 = true;
                        return var2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "bb", name = "c", descriptor = "(I)Lfb;")
    private final Model method131(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        } else if (this.field489 != null) {
            int var2 = -1;
            if (super.field438 >= 0 && super.field441 == 0) {
                var2 = SeqType.field1112[super.field438].field1114[super.field439];
            } else if (super.field435 >= 0) {
                var2 = SeqType.field1112[super.field435].field1114[super.field436];
            }
            return this.field489.method346(0, var2, (int[]) null, -1);
        } else {
            long var4 = this.field475;
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (super.field438 >= 0 && super.field441 == 0) {
                SeqType var10 = SeqType.field1112[super.field438];
                var6 = var10.field1114[super.field439];
                if (super.field435 >= 0 && super.field435 != super.field415) {
                    var7 = SeqType.field1112[super.field435].field1114[super.field436];
                }
                if (var10.field1121 >= 0) {
                    var8 = var10.field1121;
                    var4 += (long) (var8 - this.field472[5] << 8);
                }
                if (var10.field1122 >= 0) {
                    var9 = var10.field1122;
                    var4 += (long) (var9 - this.field472[3] << 16);
                }
            } else if (super.field435 >= 0) {
                var6 = SeqType.field1112[super.field435].field1114[super.field436];
            }
            Model var11 = (Model) field490.method115(var4);
            if (var11 == null) {
                boolean var12 = false;
                for (int var13 = 0; var13 < 12; ++var13) {
                    int var14 = this.field472[var13];
                    if (var9 >= 0 && var13 == 3) {
                        var14 = var9;
                    }
                    if (var8 >= 0 && var13 == 5) {
                        var14 = var8;
                    }
                    if (var14 >= 256 && var14 < 512 && !IdkType.field1091[var14 - 256].method379(false)) {
                        var12 = true;
                    }
                    if (var14 >= 512 && !ObjType.method350(var14 - 512).method357((byte) 3, this.field470)) {
                        var12 = true;
                    }
                }
                if (var12) {
                    if (this.field488 != -1L) {
                        var11 = (Model) field490.method115(this.field488);
                    }
                    if (var11 == null) {
                        return null;
                    }
                }
            }
            if (var11 == null) {
                Model[] var15 = new Model[12];
                int var16 = 0;
                for (int var17 = 0; var17 < 12; ++var17) {
                    int var19 = this.field472[var17];
                    if (var9 >= 0 && var17 == 3) {
                        var19 = var9;
                    }
                    if (var8 >= 0 && var17 == 5) {
                        var19 = var8;
                    }
                    if (var19 >= 256 && var19 < 512) {
                        Model var20 = IdkType.field1091[var19 - 256].method380(true);
                        if (var20 != null) {
                            var15[var16++] = var20;
                        }
                    }
                    if (var19 >= 512) {
                        Model var21 = ObjType.method350(var19 - 512).method358(135, this.field470);
                        if (var21 != null) {
                            var15[var16++] = var21;
                        }
                    }
                }
                var11 = new Model(var15, var16, -928);
                for (int var18 = 0; var18 < 5; ++var18) {
                    if (this.field473[var18] != 0) {
                        var11.method153(client.field1538[var18][0], client.field1538[var18][this.field473[var18]]);
                        if (var18 == 1) {
                            var11.method153(client.field1271[0], client.field1271[this.field473[var18]]);
                        }
                    }
                }
                var11.method146((byte) 112);
                var11.method156(64, 850, -30, -50, -30, true);
                field490.method116(var11, false, var4);
                this.field488 = var4;
            }
            if (this.field487) {
                return var11;
            } else {
                Model var22 = Model.field534;
                var22.method141(AnimFrame.method62((byte) 8, var6) & AnimFrame.method62((byte) 8, var7), 764, var11);
                if (var6 != -1 && var7 != -1) {
                    var22.method148(SeqType.field1112[super.field438].field1118, -620, var6, var7);
                } else if (var6 != -1) {
                    var22.method147(true, var6);
                }
                var22.method143(-15382);
                var22.field571 = null;
                var22.field570 = null;
                return var22;
            }
        }
    }

    @OriginalMember(owner = "bb", name = "b", descriptor = "(Z)Lfb;")
    public final Model method132(boolean arg0) {
        if (!this.field469) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var12 = this.field472[var3];
                if (var12 >= 256 && var12 < 512 && !IdkType.field1091[var12 - 256].method381(0)) {
                    var2 = true;
                }
                if (var12 >= 512 && !ObjType.method350(var12 - 512).method359(false, this.field470)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                Model[] var4 = new Model[12];
                int var5 = 0;
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var9 = this.field472[var6];
                    if (var9 >= 256 && var9 < 512) {
                        Model var10 = IdkType.field1091[var9 - 256].method382((byte) 9);
                        if (var10 != null) {
                            var4[var5++] = var10;
                        }
                    }
                    if (var9 >= 512) {
                        Model var11 = ObjType.method350(var9 - 512).method360(true, this.field470);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                }
                Model var7 = new Model(var4, var5, -928);
                for (int var8 = 0; var8 < 5; ++var8) {
                    if (this.field473[var8] != 0) {
                        var7.method153(client.field1538[var8][0], client.field1538[var8][this.field473[var8]]);
                        if (var8 == 1) {
                            var7.method153(client.field1271[0], client.field1271[this.field473[var8]]);
                        }
                    }
                }
                if (arg0) {
                    throw new NullPointerException();
                } else {
                    return var7;
                }
            }
        }
    }

    @OriginalMember(owner = "bb", name = "b", descriptor = "(I)Z")
    public final boolean method127(int arg0) {
        if (arg0 >= 0) {
            this.field467 = !this.field467;
        }
        return this.field469;
    }
}
