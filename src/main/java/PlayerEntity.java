import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bb")
public class PlayerEntity extends PathingEntity {

    @OriginalMember(owner = "bb", name = "qb", descriptor = "I")
    private int field465 = 650;

    @OriginalMember(owner = "bb", name = "rb", descriptor = "I")
    private int field466 = 48629;

    @OriginalMember(owner = "bb", name = "tb", descriptor = "Z")
    public boolean field468 = false;

    @OriginalMember(owner = "bb", name = "wb", descriptor = "[I")
    public int[] field471 = new int[12];

    @OriginalMember(owner = "bb", name = "xb", descriptor = "[I")
    public int[] field472 = new int[5];

    @OriginalMember(owner = "bb", name = "Lb", descriptor = "Z")
    public boolean field486 = false;

    @OriginalMember(owner = "bb", name = "Mb", descriptor = "J")
    public long field487 = -1L;

    @OriginalMember(owner = "bb", name = "Nb", descriptor = "Lt;")
    public static LruCache field488 = new LruCache(0, 260);

    @OriginalMember(owner = "bb", name = "ub", descriptor = "I")
    public int field469;

    @OriginalMember(owner = "bb", name = "vb", descriptor = "I")
    public int field470;

    @OriginalMember(owner = "bb", name = "yb", descriptor = "I")
    public int field473;

    @OriginalMember(owner = "bb", name = "Ab", descriptor = "I")
    public int field475;

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

    @OriginalMember(owner = "bb", name = "Hb", descriptor = "I")
    public int field482;

    @OriginalMember(owner = "bb", name = "Ib", descriptor = "I")
    public int field483;

    @OriginalMember(owner = "bb", name = "Jb", descriptor = "I")
    public int field484;

    @OriginalMember(owner = "bb", name = "Kb", descriptor = "I")
    public int field485;

    @OriginalMember(owner = "bb", name = "zb", descriptor = "J")
    public long field474;

    @OriginalMember(owner = "bb", name = "Gb", descriptor = "Lfb;")
    public Model field481;

    @OriginalMember(owner = "bb", name = "sb", descriptor = "Ljava/lang/String;")
    public String field467;

    @OriginalMember(owner = "bb", name = "a", descriptor = "(Lmb;Z)V")
    public final void method130(Packet arg0, boolean arg1) {
        arg0.field710 = 0;
        this.field469 = arg0.method239();
        this.field470 = arg0.method239();
        for (int var3 = 0; var3 < 12; ++var3) {
            int var8 = arg0.method239();
            if (var8 == 0) {
                this.field471[var3] = 0;
            } else {
                int var9 = arg0.method239();
                this.field471[var3] = (var8 << 8) + var9;
            }
        }
        for (int var4 = 0; var4 < 5; ++var4) {
            int var7 = arg0.method239();
            if (var7 < 0 || var7 >= client.field1429[var4].length) {
                var7 = 0;
            }
            this.field472[var4] = var7;
        }
        super.field414 = arg0.method241();
        if (super.field414 == 65535) {
            super.field414 = -1;
        }
        super.field415 = arg0.method241();
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
        this.field467 = JString.method314(JString.method311((byte) 4, arg0.method245((byte) -25)), (byte) 9);
        this.field473 = arg0.method239();
        if (arg1) {
            this.field468 = true;
            this.field474 = 0L;
            for (int var5 = 0; var5 < 12; ++var5) {
                this.field474 <<= 4;
                if (this.field471[var5] >= 256) {
                    this.field474 += (long) (this.field471[var5] - 256);
                }
            }
            if (this.field471[0] >= 256) {
                this.field474 += (long) (this.field471[0] - 256 >> 4);
            }
            if (this.field471[1] >= 256) {
                this.field474 += (long) (this.field471[1] - 256 >> 8);
            }
            for (int var6 = 0; var6 < 5; ++var6) {
                this.field474 <<= 3;
                this.field474 += (long) this.field472[var6];
            }
            this.field474 <<= 1;
            this.field474 += (long) this.field469;
        }
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(I)Lfb;")
    public final Model method123(int arg0) {
        if (!this.field468) {
            return null;
        } else {
            Model var2 = this.method131(0);
            int var3 = 21 / arg0;
            if (var2 == null) {
                return null;
            } else {
                super.field455 = var2.field404;
                var2.field577 = true;
                if (this.field486) {
                    return var2;
                } else {
                    if (super.field442 != -1 && super.field443 != -1) {
                        SpotAnimType var4 = SpotAnimType.field1130[super.field442];
                        Model var5 = var4.method388();
                        if (var5 != null) {
                            Model var6 = new Model(23727, AnimFrame.method62(0, super.field443), true, var5, false);
                            var6.method152(0, (byte) 119, -super.field446, 0);
                            var6.method146(true);
                            var6.method147(var4.field1134.field1112[super.field443], false);
                            var6.field576 = null;
                            var6.field575 = null;
                            if (var4.field1137 != 128 || var4.field1138 != 128) {
                                var6.method155(var4.field1137, (byte) 2, var4.field1138, var4.field1137);
                            }
                            var6.method156(var4.field1140 + 64, var4.field1141 + 850, -30, -50, -30, true);
                            Model[] var7 = new Model[] { var2, var6 };
                            var2 = new Model(2, 962, var7, true);
                        }
                    }
                    if (this.field481 != null) {
                        if (client.field1633 >= this.field477) {
                            this.field481 = null;
                        }
                        if (client.field1633 >= this.field476 && client.field1633 < this.field477) {
                            Model var8 = this.field481;
                            var8.method152(this.field478 - super.field409, (byte) 119, this.field479 - this.field475, this.field480 - super.field410);
                            if (super.field456 == 512) {
                                var8.method150((byte) 4);
                                var8.method150((byte) 4);
                                var8.method150((byte) 4);
                            } else if (super.field456 == 1024) {
                                var8.method150((byte) 4);
                                var8.method150((byte) 4);
                            } else if (super.field456 == 1536) {
                                var8.method150((byte) 4);
                            }
                            Model[] var9 = new Model[] { var2, var8 };
                            var2 = new Model(2, 962, var9, true);
                            if (super.field456 == 512) {
                                var8.method150((byte) 4);
                            } else if (super.field456 == 1024) {
                                var8.method150((byte) 4);
                                var8.method150((byte) 4);
                            } else if (super.field456 == 1536) {
                                var8.method150((byte) 4);
                                var8.method150((byte) 4);
                                var8.method150((byte) 4);
                            }
                            var8.method152(super.field409 - this.field478, (byte) 119, this.field475 - this.field479, super.field410 - this.field480);
                        }
                    }
                    var2.field577 = true;
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "bb", name = "c", descriptor = "(I)Lfb;")
    private final Model method131(int arg0) {
        long var2 = this.field474;
        int var4 = -1;
        int var5 = -1;
        int var6 = -1;
        int var7 = -1;
        if (arg0 != 0) {
            for (int var8 = 1; var8 > 0; ++var8) {
            }
        }
        if (super.field437 >= 0 && super.field440 == 0) {
            SeqType var9 = SeqType.field1110[super.field437];
            var4 = var9.field1112[super.field438];
            if (super.field434 >= 0 && super.field434 != super.field414) {
                var5 = SeqType.field1110[super.field434].field1112[super.field435];
            }
            if (var9.field1119 >= 0) {
                var6 = var9.field1119;
                var2 += (long) (var6 - this.field471[5] << 8);
            }
            if (var9.field1120 >= 0) {
                var7 = var9.field1120;
                var2 += (long) (var7 - this.field471[3] << 16);
            }
        } else if (super.field434 >= 0) {
            var4 = SeqType.field1110[super.field434].field1112[super.field435];
        }
        Model var10 = (Model) field488.method115(var2);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; ++var12) {
                int var13 = this.field471[var12];
                if (var7 >= 0 && var12 == 3) {
                    var13 = var7;
                }
                if (var6 >= 0 && var12 == 5) {
                    var13 = var6;
                }
                if (var13 >= 256 && var13 < 512 && !IdkType.field1087[var13 - 256].method379(-417)) {
                    var11 = true;
                }
                if (var13 >= 512 && !ObjType.method350(var13 - 512).method357(0, this.field469)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field487 != -1L) {
                    var10 = (Model) field488.method115(this.field487);
                }
                if (var10 == null) {
                    return null;
                }
            }
        }
        if (var10 == null) {
            Model[] var14 = new Model[12];
            int var15 = 0;
            for (int var16 = 0; var16 < 12; ++var16) {
                int var18 = this.field471[var16];
                if (var7 >= 0 && var16 == 3) {
                    var18 = var7;
                }
                if (var6 >= 0 && var16 == 5) {
                    var18 = var6;
                }
                if (var18 >= 256 && var18 < 512) {
                    Model var19 = IdkType.field1087[var18 - 256].method380((byte) 5);
                    if (var19 != null) {
                        var14[var15++] = var19;
                    }
                }
                if (var18 >= 512) {
                    Model var20 = ObjType.method350(var18 - 512).method358(this.field469, 0);
                    if (var20 != null) {
                        var14[var15++] = var20;
                    }
                }
            }
            var10 = new Model((byte) 1, var15, var14);
            for (int var17 = 0; var17 < 5; ++var17) {
                if (this.field472[var17] != 0) {
                    var10.method153(client.field1429[var17][0], client.field1429[var17][this.field472[var17]]);
                    if (var17 == 1) {
                        var10.method153(client.field1551[0], client.field1551[this.field472[var17]]);
                    }
                }
            }
            var10.method146(true);
            var10.method156(64, 850, -30, -50, -30, true);
            field488.method116(-630, var2, var10);
            this.field487 = var2;
        }
        if (this.field486) {
            return var10;
        } else {
            Model var21 = Model.field539;
            var21.method141(var10, AnimFrame.method62(0, var4) & AnimFrame.method62(0, var5), 0);
            if (var4 != -1 && var5 != -1) {
                var21.method148(SeqType.field1110[super.field437].field1116, var5, (byte) 2, var4);
            } else if (var4 != -1) {
                var21.method147(var4, false);
            }
            var21.method143((byte) 63);
            var21.field576 = null;
            var21.field575 = null;
            return var21;
        }
    }

    @OriginalMember(owner = "bb", name = "d", descriptor = "(I)Lfb;")
    public final Model method132(int arg0) {
        if (!this.field468) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var12 = this.field471[var3];
                if (var12 >= 256 && var12 < 512 && !IdkType.field1087[var12 - 256].method381(423)) {
                    var2 = true;
                }
                if (var12 >= 512 && !ObjType.method350(var12 - 512).method359(this.field469, (byte) 4)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                Model[] var4 = new Model[12];
                if (this.field466 != arg0) {
                    this.field465 = 156;
                }
                int var5 = 0;
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var9 = this.field471[var6];
                    if (var9 >= 256 && var9 < 512) {
                        Model var10 = IdkType.field1087[var9 - 256].method382(-221);
                        if (var10 != null) {
                            var4[var5++] = var10;
                        }
                    }
                    if (var9 >= 512) {
                        Model var11 = ObjType.method350(var9 - 512).method360(-40349, this.field469);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                }
                Model var7 = new Model((byte) 1, var5, var4);
                for (int var8 = 0; var8 < 5; ++var8) {
                    if (this.field472[var8] != 0) {
                        var7.method153(client.field1429[var8][0], client.field1429[var8][this.field472[var8]]);
                        if (var8 == 1) {
                            var7.method153(client.field1551[0], client.field1551[this.field472[var8]]);
                        }
                    }
                }
                return var7;
            }
        }
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(Z)Z")
    public final boolean method127(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        return this.field468;
    }
}
