import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bb")
public class PlayerEntity extends PathingEntity {

    @OriginalMember(owner = "bb", name = "qb", descriptor = "B")
    private byte field465 = 67;

    @OriginalMember(owner = "bb", name = "rb", descriptor = "Z")
    private boolean field466 = true;

    @OriginalMember(owner = "bb", name = "sb", descriptor = "I")
    private int field467 = -838;

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

    @OriginalMember(owner = "bb", name = "Ob", descriptor = "Lt;")
    public static LruCache field489 = new LruCache(260, 0);

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

    @OriginalMember(owner = "bb", name = "tb", descriptor = "Ljava/lang/String;")
    public String field468;

    @OriginalMember(owner = "bb", name = "a", descriptor = "(BLmb;)V")
    public final void method130(byte arg0, Packet arg1) {
        arg1.field717 = 0;
        this.field470 = arg1.method239();
        this.field471 = arg1.method239();
        for (int var3 = 0; var3 < 12; ++var3) {
            int var8 = arg1.method239();
            if (var8 == 0) {
                this.field472[var3] = 0;
            } else {
                int var9 = arg1.method239();
                this.field472[var3] = (var8 << 8) + var9;
            }
        }
        for (int var4 = 0; var4 < 5; ++var4) {
            int var7 = arg1.method239();
            if (var7 < 0 || var7 >= client.field1384[var4].length) {
                var7 = 0;
            }
            this.field473[var4] = var7;
        }
        super.field414 = arg1.method241();
        if (super.field414 == 65535) {
            super.field414 = -1;
        }
        super.field415 = arg1.method241();
        if (super.field415 == 65535) {
            super.field415 = -1;
        }
        super.field416 = arg1.method241();
        if (super.field416 == 65535) {
            super.field416 = -1;
        }
        super.field417 = arg1.method241();
        if (super.field417 == 65535) {
            super.field417 = -1;
        }
        super.field418 = arg1.method241();
        if (super.field418 == 65535) {
            super.field418 = -1;
        }
        super.field419 = arg1.method241();
        if (super.field419 == 65535) {
            super.field419 = -1;
        }
        super.field420 = arg1.method241();
        if (arg0 == -76) {
            if (super.field420 == 65535) {
                super.field420 = -1;
            }
            this.field468 = JString.method314(true, JString.method311((byte) -49, arg1.method245(6)));
            this.field474 = arg1.method239();
            this.field469 = true;
            this.field475 = 0L;
            for (int var5 = 0; var5 < 12; ++var5) {
                this.field475 <<= 4;
                if (this.field472[var5] >= 256) {
                    this.field475 += (long) (this.field472[var5] - 256);
                }
            }
            if (this.field472[0] >= 256) {
                this.field475 += (long) (this.field472[0] - 256 >> 4);
            }
            if (this.field472[1] >= 256) {
                this.field475 += (long) (this.field472[1] - 256 >> 8);
            }
            for (int var6 = 0; var6 < 5; ++var6) {
                this.field475 <<= 3;
                this.field475 += (long) this.field473[var6];
            }
            this.field475 <<= 1;
            this.field475 += (long) this.field470;
        }
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(I)Lfb;")
    public final Model method123(int arg0) {
        if (!this.field469) {
            return null;
        } else {
            Model var2 = this.method131(-466);
            if (arg0 != -28205) {
                this.field467 = 257;
            }
            if (var2 == null) {
                return null;
            } else {
                super.field455 = var2.field406;
                var2.field578 = true;
                if (this.field487) {
                    return var2;
                } else {
                    if (super.field442 != -1 && super.field443 != -1) {
                        SpotAnimType var3 = SpotAnimType.field1143[super.field442];
                        Model var4 = var3.method388();
                        if (var4 != null) {
                            Model var5 = new Model(AnimFrame.method62((byte) 17, super.field443), var4, true, 0, false);
                            var5.method152(false, 0, 0, -super.field446);
                            var5.method146(0);
                            var5.method147((byte) 2, var3.field1147.field1123[super.field443]);
                            var5.field577 = null;
                            var5.field576 = null;
                            if (var3.field1150 != 128 || var3.field1151 != 128) {
                                var5.method155(var3.field1150, (byte) 9, var3.field1150, var3.field1151);
                            }
                            var5.method156(var3.field1153 + 64, var3.field1154 + 850, -30, -50, -30, true);
                            Model[] var6 = new Model[] { var2, var5 };
                            var2 = new Model(var6, 2, 294, true);
                        }
                    }
                    if (this.field482 != null) {
                        if (client.field1618 >= this.field478) {
                            this.field482 = null;
                        }
                        if (client.field1618 >= this.field477 && client.field1618 < this.field478) {
                            Model var7 = this.field482;
                            var7.method152(false, this.field479 - super.field409, this.field481 - super.field410, this.field480 - this.field476);
                            if (super.field456 == 512) {
                                var7.method150(28280);
                                var7.method150(28280);
                                var7.method150(28280);
                            } else if (super.field456 == 1024) {
                                var7.method150(28280);
                                var7.method150(28280);
                            } else if (super.field456 == 1536) {
                                var7.method150(28280);
                            }
                            Model[] var8 = new Model[] { var2, var7 };
                            var2 = new Model(var8, 2, 294, true);
                            if (super.field456 == 512) {
                                var7.method150(28280);
                            } else if (super.field456 == 1024) {
                                var7.method150(28280);
                                var7.method150(28280);
                            } else if (super.field456 == 1536) {
                                var7.method150(28280);
                                var7.method150(28280);
                                var7.method150(28280);
                            }
                            var7.method152(false, super.field409 - this.field479, super.field410 - this.field481, this.field476 - this.field480);
                        }
                    }
                    var2.field578 = true;
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "bb", name = "d", descriptor = "(I)Lfb;")
    private final Model method131(int arg0) {
        while (arg0 >= 0) {
            this.field466 = !this.field466;
        }
        long var2 = this.field475;
        int var4 = -1;
        int var5 = -1;
        int var6 = -1;
        int var7 = -1;
        if (super.field437 >= 0 && super.field440 == 0) {
            SeqType var8 = SeqType.field1121[super.field437];
            var4 = var8.field1123[super.field438];
            if (super.field434 >= 0 && super.field434 != super.field414) {
                var5 = SeqType.field1121[super.field434].field1123[super.field435];
            }
            if (var8.field1130 >= 0) {
                var6 = var8.field1130;
                var2 += (long) (var6 - this.field472[5] << 8);
            }
            if (var8.field1131 >= 0) {
                var7 = var8.field1131;
                var2 += (long) (var7 - this.field472[3] << 16);
            }
        } else if (super.field434 >= 0) {
            var4 = SeqType.field1121[super.field434].field1123[super.field435];
        }
        Model var9 = (Model) field489.method115(var2);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; ++var11) {
                int var12 = this.field472[var11];
                if (var7 >= 0 && var11 == 3) {
                    var12 = var7;
                }
                if (var6 >= 0 && var11 == 5) {
                    var12 = var6;
                }
                if (var12 >= 256 && var12 < 512 && !IdkType.field1099[var12 - 256].method379((byte) 9)) {
                    var10 = true;
                }
                if (var12 >= 512 && !ObjType.method350(var12 - 512).method357(this.field470, false)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field488 != -1L) {
                    var9 = (Model) field489.method115(this.field488);
                }
                if (var9 == null) {
                    return null;
                }
            }
        }
        if (var9 == null) {
            Model[] var13 = new Model[12];
            int var14 = 0;
            for (int var15 = 0; var15 < 12; ++var15) {
                int var17 = this.field472[var15];
                if (var7 >= 0 && var15 == 3) {
                    var17 = var7;
                }
                if (var6 >= 0 && var15 == 5) {
                    var17 = var6;
                }
                if (var17 >= 256 && var17 < 512) {
                    Model var18 = IdkType.field1099[var17 - 256].method380(-84);
                    if (var18 != null) {
                        var13[var14++] = var18;
                    }
                }
                if (var17 >= 512) {
                    Model var19 = ObjType.method350(var17 - 512).method358(this.field470, -718);
                    if (var19 != null) {
                        var13[var14++] = var19;
                    }
                }
            }
            var9 = new Model(var13, var14, (byte) 2);
            for (int var16 = 0; var16 < 5; ++var16) {
                if (this.field473[var16] != 0) {
                    var9.method153(client.field1384[var16][0], client.field1384[var16][this.field473[var16]]);
                    if (var16 == 1) {
                        var9.method153(client.field1643[0], client.field1643[this.field473[var16]]);
                    }
                }
            }
            var9.method146(0);
            var9.method156(64, 850, -30, -50, -30, true);
            field489.method116(var9, var2, this.field465);
            this.field488 = var2;
        }
        if (this.field487) {
            return var9;
        } else {
            Model var20 = Model.field540;
            var20.method141((byte) 85, AnimFrame.method62((byte) 17, var4) & AnimFrame.method62((byte) 17, var5), var9);
            if (var4 != -1 && var5 != -1) {
                var20.method148((byte) 5, var5, var4, SeqType.field1121[super.field437].field1127);
            } else if (var4 != -1) {
                var20.method147((byte) 2, var4);
            }
            var20.method143(2);
            var20.field577 = null;
            var20.field576 = null;
            return var20;
        }
    }

    @OriginalMember(owner = "bb", name = "e", descriptor = "(I)Lfb;")
    public final Model method132(int arg0) {
        if (!this.field469) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var13 = this.field472[var3];
                if (var13 >= 256 && var13 < 512 && !IdkType.field1099[var13 - 256].method381(0)) {
                    var2 = true;
                }
                if (var13 >= 512 && !ObjType.method350(var13 - 512).method359(8, this.field470)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                Model[] var4 = new Model[12];
                int var5 = 0;
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var10 = this.field472[var6];
                    if (var10 >= 256 && var10 < 512) {
                        Model var11 = IdkType.field1099[var10 - 256].method382(8);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                    if (var10 >= 512) {
                        Model var12 = ObjType.method350(var10 - 512).method360(-212, this.field470);
                        if (var12 != null) {
                            var4[var5++] = var12;
                        }
                    }
                }
                Model var7 = new Model(var4, var5, (byte) 2);
                for (int var8 = 0; var8 < 5; ++var8) {
                    if (this.field473[var8] != 0) {
                        var7.method153(client.field1384[var8][0], client.field1384[var8][this.field473[var8]]);
                        if (var8 == 1) {
                            var7.method153(client.field1643[0], client.field1643[this.field473[var8]]);
                        }
                    }
                }
                if (arg0 <= 0) {
                    for (int var9 = 1; var9 > 0; ++var9) {
                    }
                }
                return var7;
            }
        }
    }

    @OriginalMember(owner = "bb", name = "c", descriptor = "(I)Z")
    public final boolean method127(int arg0) {
        int var2 = 35 / arg0;
        return this.field469;
    }
}
