import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bb")
public class PlayerEntity extends PathingEntity {

    @OriginalMember(owner = "bb", name = "rb", descriptor = "B")
    private byte field485 = 0;

    @OriginalMember(owner = "bb", name = "sb", descriptor = "Z")
    private boolean field486 = true;

    @OriginalMember(owner = "bb", name = "tb", descriptor = "I")
    private int field487 = 6;

    @OriginalMember(owner = "bb", name = "vb", descriptor = "Z")
    public boolean field489 = false;

    @OriginalMember(owner = "bb", name = "yb", descriptor = "[I")
    public int[] field492 = new int[12];

    @OriginalMember(owner = "bb", name = "zb", descriptor = "[I")
    public int[] field493 = new int[5];

    @OriginalMember(owner = "bb", name = "Nb", descriptor = "Z")
    public boolean field507 = false;

    @OriginalMember(owner = "bb", name = "Ob", descriptor = "J")
    public long field508 = -1L;

    @OriginalMember(owner = "bb", name = "Pb", descriptor = "Lt;")
    public static LruCache field509 = new LruCache(0, 260);

    @OriginalMember(owner = "bb", name = "wb", descriptor = "I")
    public int field490;

    @OriginalMember(owner = "bb", name = "xb", descriptor = "I")
    public int field491;

    @OriginalMember(owner = "bb", name = "Ab", descriptor = "I")
    public int field494;

    @OriginalMember(owner = "bb", name = "Cb", descriptor = "I")
    public int field496;

    @OriginalMember(owner = "bb", name = "Db", descriptor = "I")
    public int field497;

    @OriginalMember(owner = "bb", name = "Eb", descriptor = "I")
    public int field498;

    @OriginalMember(owner = "bb", name = "Fb", descriptor = "I")
    public int field499;

    @OriginalMember(owner = "bb", name = "Gb", descriptor = "I")
    public int field500;

    @OriginalMember(owner = "bb", name = "Hb", descriptor = "I")
    public int field501;

    @OriginalMember(owner = "bb", name = "Jb", descriptor = "I")
    public int field503;

    @OriginalMember(owner = "bb", name = "Kb", descriptor = "I")
    public int field504;

    @OriginalMember(owner = "bb", name = "Lb", descriptor = "I")
    public int field505;

    @OriginalMember(owner = "bb", name = "Mb", descriptor = "I")
    public int field506;

    @OriginalMember(owner = "bb", name = "Bb", descriptor = "J")
    public long field495;

    @OriginalMember(owner = "bb", name = "Ib", descriptor = "Lfb;")
    public Model field502;

    @OriginalMember(owner = "bb", name = "ub", descriptor = "Ljava/lang/String;")
    public String field488;

    @OriginalMember(owner = "bb", name = "a", descriptor = "(Lmb;I)V")
    public final void method130(Packet arg0, int arg1) {
        arg0.field736 = 0;
        this.field490 = arg0.method239();
        this.field491 = arg0.method239();
        for (int var3 = 0; var3 < 12; ++var3) {
            int var8 = arg0.method239();
            if (var8 == 0) {
                this.field492[var3] = 0;
            } else {
                int var9 = arg0.method239();
                this.field492[var3] = (var8 << 8) + var9;
            }
        }
        for (int var4 = 0; var4 < 5; ++var4) {
            int var7 = arg0.method239();
            if (var7 < 0 || var7 >= client.field1490[var4].length) {
                var7 = 0;
            }
            this.field493[var4] = var7;
        }
        super.field433 = arg0.method241();
        if (super.field433 == 65535) {
            super.field433 = -1;
        }
        super.field434 = arg0.method241();
        if (super.field434 == 65535) {
            super.field434 = -1;
        }
        super.field435 = arg0.method241();
        if (super.field435 == 65535) {
            super.field435 = -1;
        }
        super.field436 = arg0.method241();
        if (super.field436 == 65535) {
            super.field436 = -1;
        }
        super.field437 = arg0.method241();
        if (super.field437 == 65535) {
            super.field437 = -1;
        }
        super.field438 = arg0.method241();
        if (super.field438 == 65535) {
            super.field438 = -1;
        }
        super.field439 = arg0.method241();
        if (super.field439 == 65535) {
            super.field439 = -1;
        }
        this.field488 = JString.method314(false, JString.method311(-8191, arg0.method245(0)));
        this.field494 = arg0.method239();
        this.field489 = true;
        this.field495 = 0L;
        if (arg1 == 0) {
            for (int var5 = 0; var5 < 12; ++var5) {
                this.field495 <<= 4;
                if (this.field492[var5] >= 256) {
                    this.field495 += (long) (this.field492[var5] - 256);
                }
            }
            if (this.field492[0] >= 256) {
                this.field495 += (long) (this.field492[0] - 256 >> 4);
            }
            if (this.field492[1] >= 256) {
                this.field495 += (long) (this.field492[1] - 256 >> 8);
            }
            for (int var6 = 0; var6 < 5; ++var6) {
                this.field495 <<= 3;
                this.field495 += (long) this.field493[var6];
            }
            this.field495 <<= 1;
            this.field495 += (long) this.field490;
        }
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(B)Lfb;")
    public final Model method123(byte arg0) {
        if (!this.field489) {
            return null;
        } else {
            Model var2 = this.method131(372);
            if (var2 == null) {
                return null;
            } else {
                super.field474 = var2.field422;
                var2.field596 = true;
                if (arg0 != 8) {
                    throw new NullPointerException();
                } else if (this.field507) {
                    return var2;
                } else {
                    if (super.field461 != -1 && super.field462 != -1) {
                        SpotAnimType var3 = SpotAnimType.field1169[super.field461];
                        Model var4 = var3.method388();
                        if (var4 != null) {
                            Model var5 = new Model(AnimFrame.method62((byte) 7, super.field462), false, true, true, var4);
                            var5.method152(0, 0, -super.field465, (byte) -20);
                            var5.method146((byte) 107);
                            var5.method147(this.field485, var3.field1173.field1151[super.field462]);
                            var5.field595 = null;
                            var5.field594 = null;
                            if (var3.field1176 != 128 || var3.field1177 != 128) {
                                var5.method155(var3.field1176, var3.field1177, (byte) -121, var3.field1176);
                            }
                            var5.method156(var3.field1179 + 64, var3.field1180 + 850, -30, -50, -30, true);
                            Model[] var6 = new Model[] { var2, var5 };
                            var2 = new Model(var6, true, 2, 0);
                        }
                    }
                    if (this.field502 != null) {
                        if (client.field1247 >= this.field498) {
                            this.field502 = null;
                        }
                        if (client.field1247 >= this.field497 && client.field1247 < this.field498) {
                            Model var7 = this.field502;
                            var7.method152(this.field501 - super.field429, this.field499 - super.field428, this.field500 - this.field496, (byte) -20);
                            if (super.field475 == 512) {
                                var7.method150(880);
                                var7.method150(880);
                                var7.method150(880);
                            } else if (super.field475 == 1024) {
                                var7.method150(880);
                                var7.method150(880);
                            } else if (super.field475 == 1536) {
                                var7.method150(880);
                            }
                            Model[] var8 = new Model[] { var2, var7 };
                            var2 = new Model(var8, true, 2, 0);
                            if (super.field475 == 512) {
                                var7.method150(880);
                            } else if (super.field475 == 1024) {
                                var7.method150(880);
                                var7.method150(880);
                            } else if (super.field475 == 1536) {
                                var7.method150(880);
                                var7.method150(880);
                                var7.method150(880);
                            }
                            var7.method152(super.field429 - this.field501, super.field428 - this.field499, this.field496 - this.field500, (byte) -20);
                        }
                    }
                    var2.field596 = true;
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "bb", name = "c", descriptor = "(I)Lfb;")
    private final Model method131(int arg0) {
        long var2 = this.field495;
        int var4 = -1;
        int var5 = -1;
        int var6 = -1;
        int var7 = -1;
        if (super.field456 >= 0 && super.field459 == 0) {
            SeqType var8 = SeqType.field1149[super.field456];
            var4 = var8.field1151[super.field457];
            if (super.field453 >= 0 && super.field453 != super.field433) {
                var5 = SeqType.field1149[super.field453].field1151[super.field454];
            }
            if (var8.field1158 >= 0) {
                var6 = var8.field1158;
                var2 += (long) (var6 - this.field492[5] << 8);
            }
            if (var8.field1159 >= 0) {
                var7 = var8.field1159;
                var2 += (long) (var7 - this.field492[3] << 16);
            }
        } else if (super.field453 >= 0) {
            var4 = SeqType.field1149[super.field453].field1151[super.field454];
        }
        Model var9 = (Model) field509.method115(var2);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; ++var11) {
                int var12 = this.field492[var11];
                if (var7 >= 0 && var11 == 3) {
                    var12 = var7;
                }
                if (var6 >= 0 && var11 == 5) {
                    var12 = var6;
                }
                if (var12 >= 256 && var12 < 512 && !IdkType.field1128[var12 - 256].method379((byte) 7)) {
                    var10 = true;
                }
                if (var12 >= 512 && !ObjType.method350(var12 - 512).method357(false, this.field490)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field508 != -1L) {
                    var9 = (Model) field509.method115(this.field508);
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
                int var17 = this.field492[var15];
                if (var7 >= 0 && var15 == 3) {
                    var17 = var7;
                }
                if (var6 >= 0 && var15 == 5) {
                    var17 = var6;
                }
                if (var17 >= 256 && var17 < 512) {
                    Model var18 = IdkType.field1128[var17 - 256].method380(0);
                    if (var18 != null) {
                        var13[var14++] = var18;
                    }
                }
                if (var17 >= 512) {
                    Model var19 = ObjType.method350(var17 - 512).method358(this.field487, this.field490);
                    if (var19 != null) {
                        var13[var14++] = var19;
                    }
                }
            }
            var9 = new Model(var14, var13, -38792);
            for (int var16 = 0; var16 < 5; ++var16) {
                if (this.field493[var16] != 0) {
                    var9.method153(client.field1490[var16][0], client.field1490[var16][this.field493[var16]]);
                    if (var16 == 1) {
                        var9.method153(client.field1266[0], client.field1266[this.field493[var16]]);
                    }
                }
            }
            var9.method146((byte) 107);
            var9.method156(64, 850, -30, -50, -30, true);
            field509.method116(true, var2, var9);
            this.field508 = var2;
        }
        if (this.field507) {
            return var9;
        } else {
            Model var20 = Model.field558;
            if (arg0 <= 0) {
                this.field487 = 457;
            }
            var20.method141(0, AnimFrame.method62((byte) 7, var4) & AnimFrame.method62((byte) 7, var5), var9);
            if (var4 != -1 && var5 != -1) {
                var20.method148(0, var5, SeqType.field1149[super.field456].field1155, var4);
            } else if (var4 != -1) {
                var20.method147(this.field485, var4);
            }
            var20.method143(0);
            var20.field595 = null;
            var20.field594 = null;
            return var20;
        }
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(Z)Lfb;")
    public final Model method132(boolean arg0) {
        if (!arg0) {
            this.field486 = !this.field486;
        }
        if (!this.field489) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var12 = this.field492[var3];
                if (var12 >= 256 && var12 < 512 && !IdkType.field1128[var12 - 256].method381(0)) {
                    var2 = true;
                }
                if (var12 >= 512 && !ObjType.method350(var12 - 512).method359(this.field490, 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                Model[] var4 = new Model[12];
                int var5 = 0;
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var9 = this.field492[var6];
                    if (var9 >= 256 && var9 < 512) {
                        Model var10 = IdkType.field1128[var9 - 256].method382(false);
                        if (var10 != null) {
                            var4[var5++] = var10;
                        }
                    }
                    if (var9 >= 512) {
                        Model var11 = ObjType.method350(var9 - 512).method360(this.field490, -241);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                }
                Model var7 = new Model(var5, var4, -38792);
                for (int var8 = 0; var8 < 5; ++var8) {
                    if (this.field493[var8] != 0) {
                        var7.method153(client.field1490[var8][0], client.field1490[var8][this.field493[var8]]);
                        if (var8 == 1) {
                            var7.method153(client.field1266[0], client.field1266[this.field493[var8]]);
                        }
                    }
                }
                return var7;
            }
        }
    }

    @OriginalMember(owner = "bb", name = "b", descriptor = "(I)Z")
    public final boolean method127(int arg0) {
        if (arg0 != -42790) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        return this.field489;
    }
}
