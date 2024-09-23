import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bb")
public class PlayerEntity extends PathingEntity {

    @OriginalMember(owner = "bb", name = "pb", descriptor = "Z")
    private boolean field472 = true;

    @OriginalMember(owner = "bb", name = "qb", descriptor = "B")
    private byte field473 = 86;

    @OriginalMember(owner = "bb", name = "rb", descriptor = "Z")
    private boolean field474 = true;

    @OriginalMember(owner = "bb", name = "ub", descriptor = "Z")
    public boolean field477 = false;

    @OriginalMember(owner = "bb", name = "xb", descriptor = "[I")
    public int[] field480 = new int[12];

    @OriginalMember(owner = "bb", name = "yb", descriptor = "[I")
    public int[] field481 = new int[5];

    @OriginalMember(owner = "bb", name = "Mb", descriptor = "Z")
    public boolean field495 = false;

    @OriginalMember(owner = "bb", name = "Nb", descriptor = "J")
    public long field496 = -1L;

    @OriginalMember(owner = "bb", name = "Ob", descriptor = "Lt;")
    public static LruCache field497 = new LruCache(260, (byte) 3);

    @OriginalMember(owner = "bb", name = "sb", descriptor = "I")
    private int field475;

    @OriginalMember(owner = "bb", name = "vb", descriptor = "I")
    public int field478;

    @OriginalMember(owner = "bb", name = "wb", descriptor = "I")
    public int field479;

    @OriginalMember(owner = "bb", name = "zb", descriptor = "I")
    public int field482;

    @OriginalMember(owner = "bb", name = "Bb", descriptor = "I")
    public int field484;

    @OriginalMember(owner = "bb", name = "Cb", descriptor = "I")
    public int field485;

    @OriginalMember(owner = "bb", name = "Db", descriptor = "I")
    public int field486;

    @OriginalMember(owner = "bb", name = "Eb", descriptor = "I")
    public int field487;

    @OriginalMember(owner = "bb", name = "Fb", descriptor = "I")
    public int field488;

    @OriginalMember(owner = "bb", name = "Gb", descriptor = "I")
    public int field489;

    @OriginalMember(owner = "bb", name = "Ib", descriptor = "I")
    public int field491;

    @OriginalMember(owner = "bb", name = "Jb", descriptor = "I")
    public int field492;

    @OriginalMember(owner = "bb", name = "Kb", descriptor = "I")
    public int field493;

    @OriginalMember(owner = "bb", name = "Lb", descriptor = "I")
    public int field494;

    @OriginalMember(owner = "bb", name = "Ab", descriptor = "J")
    public long field483;

    @OriginalMember(owner = "bb", name = "Hb", descriptor = "Lfb;")
    public Model field490;

    @OriginalMember(owner = "bb", name = "tb", descriptor = "Ljava/lang/String;")
    public String field476;

    @OriginalMember(owner = "bb", name = "a", descriptor = "(Lmb;I)V")
    public final void method129(Packet arg0, int arg1) {
        arg0.field713 = 0;
        this.field478 = arg0.method238();
        this.field479 = arg0.method238();
        for (int var3 = 0; var3 < 12; ++var3) {
            int var8 = arg0.method238();
            if (var8 == 0) {
                this.field480[var3] = 0;
            } else {
                int var9 = arg0.method238();
                this.field480[var3] = (var8 << 8) + var9;
            }
        }
        for (int var4 = 0; var4 < 5; ++var4) {
            int var7 = arg0.method238();
            if (var7 < 0 || var7 >= client.field1216[var4].length) {
                var7 = 0;
            }
            this.field481[var4] = var7;
        }
        if (arg1 == 0) {
            super.field419 = arg0.method240();
            if (super.field419 == 65535) {
                super.field419 = -1;
            }
            super.field420 = arg0.method240();
            if (super.field420 == 65535) {
                super.field420 = -1;
            }
            super.field421 = arg0.method240();
            if (super.field421 == 65535) {
                super.field421 = -1;
            }
            super.field422 = arg0.method240();
            if (super.field422 == 65535) {
                super.field422 = -1;
            }
            super.field423 = arg0.method240();
            if (super.field423 == 65535) {
                super.field423 = -1;
            }
            super.field424 = arg0.method240();
            if (super.field424 == 65535) {
                super.field424 = -1;
            }
            super.field425 = arg0.method240();
            if (super.field425 == 65535) {
                super.field425 = -1;
            }
            this.field476 = JString.method313(JString.method310(arg0.method244(true), false), -19010);
            this.field482 = arg0.method238();
            this.field477 = true;
            this.field483 = 0L;
            for (int var5 = 0; var5 < 12; ++var5) {
                this.field483 <<= 4;
                if (this.field480[var5] >= 256) {
                    this.field483 += (long) (this.field480[var5] - 256);
                }
            }
            if (this.field480[0] >= 256) {
                this.field483 += (long) (this.field480[0] - 256 >> 4);
            }
            if (this.field480[1] >= 256) {
                this.field483 += (long) (this.field480[1] - 256 >> 8);
            }
            for (int var6 = 0; var6 < 5; ++var6) {
                this.field483 <<= 3;
                this.field483 += (long) this.field481[var6];
            }
            this.field483 <<= 1;
            this.field483 += (long) this.field478;
        }
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(I)Lfb;")
    public final Model method122(int arg0) {
        if (!this.field477) {
            return null;
        } else {
            Model var2 = this.method130(this.field474);
            if (var2 == null) {
                return null;
            } else {
                super.field460 = var2.field410;
                var2.field583 = true;
                if (this.field495) {
                    return var2;
                } else {
                    if (super.field447 != -1 && super.field448 != -1) {
                        SpotAnimType var3 = SpotAnimType.field1142[super.field447];
                        Model var4 = var3.method386();
                        if (var4 != null) {
                            Model var5 = new Model(true, var4, false, true, !var3.field1147);
                            var5.method151(0, (byte) 3, 0, -super.field451);
                            var5.method145(this.field473);
                            var5.method146(true, var3.field1146.field1127[super.field448]);
                            var5.field582 = null;
                            var5.field581 = null;
                            if (var3.field1150 != 128 || var3.field1151 != 128) {
                                var5.method154(var3.field1150, var3.field1150, var3.field1151, 7);
                            }
                            var5.method155(var3.field1153 + 64, var3.field1154 + 850, -30, -50, -30, true);
                            Model[] var6 = new Model[] { var2, var5 };
                            var2 = new Model((byte) 22, 2, true, var6);
                        }
                    }
                    if (this.field490 != null) {
                        if (client.field1444 >= this.field486) {
                            this.field490 = null;
                        }
                        if (client.field1444 >= this.field485 && client.field1444 < this.field486) {
                            Model var7 = this.field490;
                            var7.method151(this.field487 - super.field414, (byte) 3, this.field489 - super.field415, this.field488 - this.field484);
                            if (super.field461 == 512) {
                                var7.method149((byte) 53);
                                var7.method149((byte) 53);
                                var7.method149((byte) 53);
                            } else if (super.field461 == 1024) {
                                var7.method149((byte) 53);
                                var7.method149((byte) 53);
                            } else if (super.field461 == 1536) {
                                var7.method149((byte) 53);
                            }
                            Model[] var8 = new Model[] { var2, var7 };
                            var2 = new Model((byte) 22, 2, true, var8);
                            if (super.field461 == 512) {
                                var7.method149((byte) 53);
                            } else if (super.field461 == 1024) {
                                var7.method149((byte) 53);
                                var7.method149((byte) 53);
                            } else if (super.field461 == 1536) {
                                var7.method149((byte) 53);
                                var7.method149((byte) 53);
                                var7.method149((byte) 53);
                            }
                            var7.method151(super.field414 - this.field487, (byte) 3, super.field415 - this.field489, this.field484 - this.field488);
                        }
                    }
                    var2.field583 = true;
                    if (arg0 != -13634) {
                        throw new NullPointerException();
                    } else {
                        return var2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(Z)Lfb;")
    private final Model method130(boolean arg0) {
        long var2 = this.field483;
        int var4 = -1;
        int var5 = -1;
        int var6 = -1;
        int var7 = -1;
        if (super.field442 >= 0 && super.field445 == 0) {
            SeqType var8 = SeqType.field1125[super.field442];
            var4 = var8.field1127[super.field443];
            if (super.field439 >= 0 && super.field439 != super.field419) {
                var5 = SeqType.field1125[super.field439].field1127[super.field440];
            }
            if (var8.field1134 >= 0) {
                var6 = var8.field1134;
                var2 += (long) (var6 - this.field480[5] << 8);
            }
            if (var8.field1135 >= 0) {
                var7 = var8.field1135;
                var2 += (long) (var7 - this.field480[3] << 16);
            }
        } else if (super.field439 >= 0) {
            var4 = SeqType.field1125[super.field439].field1127[super.field440];
        }
        Model var9 = (Model) field497.method114(var2);
        if (!arg0) {
            this.field472 = !this.field472;
        }
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; ++var11) {
                int var12 = this.field480[var11];
                if (var7 >= 0 && var11 == 3) {
                    var12 = var7;
                }
                if (var6 >= 0 && var11 == 5) {
                    var12 = var6;
                }
                if (var12 >= 256 && var12 < 512 && !IdkType.field1104[var12 - 256].method377(0)) {
                    var10 = true;
                }
                if (var12 >= 512 && !ObjType.method348(var12 - 512).method355(false, this.field478)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field496 != -1L) {
                    var9 = (Model) field497.method114(this.field496);
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
                int var17 = this.field480[var15];
                if (var7 >= 0 && var15 == 3) {
                    var17 = var7;
                }
                if (var6 >= 0 && var15 == 5) {
                    var17 = var6;
                }
                if (var17 >= 256 && var17 < 512) {
                    Model var18 = IdkType.field1104[var17 - 256].method378(true);
                    if (var18 != null) {
                        var13[var14++] = var18;
                    }
                }
                if (var17 >= 512) {
                    Model var19 = ObjType.method348(var17 - 512).method356(this.field478, 0);
                    if (var19 != null) {
                        var13[var14++] = var19;
                    }
                }
            }
            var9 = new Model(false, var13, var14);
            for (int var16 = 0; var16 < 5; ++var16) {
                if (this.field481[var16] != 0) {
                    var9.method152(client.field1216[var16][0], client.field1216[var16][this.field481[var16]]);
                    if (var16 == 1) {
                        var9.method152(client.field1298[0], client.field1298[this.field481[var16]]);
                    }
                }
            }
            var9.method145(this.field473);
            var9.method155(64, 850, -30, -50, -30, true);
            field497.method115(false, var9, var2);
            this.field496 = var2;
        }
        if (this.field495) {
            return var9;
        } else {
            Model var20 = Model.field545;
            var20.method140(var9, 0, true);
            if (var4 != -1 && var5 != -1) {
                var20.method147(SeqType.field1125[super.field442].field1131, var5, var4, (byte) 9);
            } else if (var4 != -1) {
                var20.method146(true, var4);
            }
            var20.method142(true);
            var20.field582 = null;
            var20.field581 = null;
            return var20;
        }
    }

    @OriginalMember(owner = "bb", name = "b", descriptor = "(I)Lfb;")
    public final Model method131(int arg0) {
        if (!this.field477) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var13 = this.field480[var3];
                if (var13 >= 256 && var13 < 512 && !IdkType.field1104[var13 - 256].method379(8)) {
                    var2 = true;
                }
                if (var13 >= 512 && !ObjType.method348(var13 - 512).method357(this.field478, 740)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                Model[] var4 = new Model[12];
                if (arg0 != 0) {
                    for (int var5 = 1; var5 > 0; ++var5) {
                    }
                }
                int var6 = 0;
                for (int var7 = 0; var7 < 12; ++var7) {
                    int var10 = this.field480[var7];
                    if (var10 >= 256 && var10 < 512) {
                        Model var11 = IdkType.field1104[var10 - 256].method380((byte) 7);
                        if (var11 != null) {
                            var4[var6++] = var11;
                        }
                    }
                    if (var10 >= 512) {
                        Model var12 = ObjType.method348(var10 - 512).method358(this.field478, 0);
                        if (var12 != null) {
                            var4[var6++] = var12;
                        }
                    }
                }
                Model var8 = new Model(false, var4, var6);
                for (int var9 = 0; var9 < 5; ++var9) {
                    if (this.field481[var9] != 0) {
                        var8.method152(client.field1216[var9][0], client.field1216[var9][this.field481[var9]]);
                        if (var9 == 1) {
                            var8.method152(client.field1298[0], client.field1298[this.field481[var9]]);
                        }
                    }
                }
                return var8;
            }
        }
    }

    @OriginalMember(owner = "bb", name = "b", descriptor = "(B)Z")
    public final boolean method126(byte arg0) {
        if (arg0 != 5) {
            this.field475 = -252;
        }
        return this.field477;
    }
}
