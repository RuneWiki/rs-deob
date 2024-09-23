import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bb")
public class PlayerEntity extends PathingEntity {

    @OriginalMember(owner = "bb", name = "ob", descriptor = "I")
    private int field458 = -45277;

    @OriginalMember(owner = "bb", name = "pb", descriptor = "I")
    private int field459 = -884;

    @OriginalMember(owner = "bb", name = "rb", descriptor = "Z")
    public boolean field461 = false;

    @OriginalMember(owner = "bb", name = "ub", descriptor = "[I")
    public int[] field464 = new int[12];

    @OriginalMember(owner = "bb", name = "vb", descriptor = "[I")
    public int[] field465 = new int[5];

    @OriginalMember(owner = "bb", name = "Jb", descriptor = "Z")
    public boolean field479 = false;

    @OriginalMember(owner = "bb", name = "Kb", descriptor = "J")
    public long field480 = -1L;

    @OriginalMember(owner = "bb", name = "Lb", descriptor = "Lt;")
    public static LruCache field481 = new LruCache(5, 260);

    @OriginalMember(owner = "bb", name = "nb", descriptor = "I")
    private int field457;

    @OriginalMember(owner = "bb", name = "sb", descriptor = "I")
    public int field462;

    @OriginalMember(owner = "bb", name = "tb", descriptor = "I")
    public int field463;

    @OriginalMember(owner = "bb", name = "wb", descriptor = "I")
    public int field466;

    @OriginalMember(owner = "bb", name = "yb", descriptor = "I")
    public int field468;

    @OriginalMember(owner = "bb", name = "zb", descriptor = "I")
    public int field469;

    @OriginalMember(owner = "bb", name = "Ab", descriptor = "I")
    public int field470;

    @OriginalMember(owner = "bb", name = "Bb", descriptor = "I")
    public int field471;

    @OriginalMember(owner = "bb", name = "Cb", descriptor = "I")
    public int field472;

    @OriginalMember(owner = "bb", name = "Db", descriptor = "I")
    public int field473;

    @OriginalMember(owner = "bb", name = "Fb", descriptor = "I")
    public int field475;

    @OriginalMember(owner = "bb", name = "Gb", descriptor = "I")
    public int field476;

    @OriginalMember(owner = "bb", name = "Hb", descriptor = "I")
    public int field477;

    @OriginalMember(owner = "bb", name = "Ib", descriptor = "I")
    public int field478;

    @OriginalMember(owner = "bb", name = "xb", descriptor = "J")
    public long field467;

    @OriginalMember(owner = "bb", name = "Eb", descriptor = "Lfb;")
    public Model field474;

    @OriginalMember(owner = "bb", name = "qb", descriptor = "Ljava/lang/String;")
    public String field460;

    @OriginalMember(owner = "bb", name = "a", descriptor = "(Lmb;I)V")
    public final void method126(Packet arg0, int arg1) {
        arg0.field698 = 0;
        this.field462 = arg0.method231();
        this.field463 = arg0.method231();
        for (int var3 = 0; var3 < 12; ++var3) {
            int var8 = arg0.method231();
            if (var8 == 0) {
                this.field464[var3] = 0;
            } else {
                int var9 = arg0.method231();
                this.field464[var3] = (var8 << 8) + var9;
            }
        }
        for (int var4 = 0; var4 < 5; ++var4) {
            int var7 = arg0.method231();
            if (var7 < 0 || var7 >= client.field1259[var4].length) {
                var7 = 0;
            }
            this.field465[var4] = var7;
        }
        super.field407 = arg0.method233();
        if (super.field407 == 65535) {
            super.field407 = -1;
        }
        super.field408 = arg0.method233();
        if (super.field408 == 65535) {
            super.field408 = -1;
        }
        super.field409 = arg0.method233();
        if (super.field409 == 65535) {
            super.field409 = -1;
        }
        super.field410 = arg0.method233();
        if (super.field410 == 65535) {
            super.field410 = -1;
        }
        super.field411 = arg0.method233();
        if (super.field411 == 65535) {
            super.field411 = -1;
        }
        super.field412 = arg0.method233();
        if (super.field412 == 65535) {
            super.field412 = -1;
        }
        super.field413 = arg0.method233();
        if (super.field413 == 65535) {
            super.field413 = -1;
        }
        this.field460 = JString.method304((byte) 7, JString.method301(arg0.method237(408), -16782));
        if (arg1 < 0) {
            this.field466 = arg0.method231();
            this.field461 = true;
            this.field467 = 0L;
            for (int var5 = 0; var5 < 12; ++var5) {
                this.field467 <<= 4;
                if (this.field464[var5] >= 256) {
                    this.field467 += (long) (this.field464[var5] - 256);
                }
            }
            if (this.field464[0] >= 256) {
                this.field467 += (long) (this.field464[0] - 256 >> 4);
            }
            if (this.field464[1] >= 256) {
                this.field467 += (long) (this.field464[1] - 256 >> 8);
            }
            for (int var6 = 0; var6 < 5; ++var6) {
                this.field467 <<= 3;
                this.field467 += (long) this.field465[var6];
            }
            this.field467 <<= 1;
            this.field467 += (long) this.field462;
        }
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(Z)Lfb;")
    public final Model method121(boolean arg0) {
        if (!this.field461) {
            return null;
        } else {
            Model var2 = this.method127((byte) 7);
            if (var2 == null) {
                return null;
            } else {
                super.field447 = var2.field398;
                var2.field567 = true;
                if (arg0) {
                    for (int var3 = 1; var3 > 0; ++var3) {
                    }
                }
                if (this.field479) {
                    return var2;
                } else {
                    if (super.field434 != -1 && super.field435 != -1) {
                        SpotAnimType var4 = SpotAnimType.field1097[super.field434];
                        Model var5 = var4.method377();
                        if (var5 != null) {
                            Model var6 = new Model(-435, true, false, var5, !var4.field1102);
                            var6.method148(-super.field438, this.field458, 0, 0);
                            var6.method142(8);
                            var6.method143(true, var4.field1101.field1083[super.field435]);
                            var6.field566 = null;
                            var6.field565 = null;
                            if (var4.field1105 != 128 || var4.field1106 != 128) {
                                var6.method151(var4.field1106, var4.field1105, 0, var4.field1105);
                            }
                            var6.method152(var4.field1108 + 64, var4.field1109 + 850, -30, -50, -30, true);
                            Model[] var7 = new Model[] { var2, var6 };
                            var2 = new Model(var7, 2, true, this.field457);
                        }
                    }
                    if (this.field474 != null) {
                        if (client.field1433 >= this.field470) {
                            this.field474 = null;
                        }
                        if (client.field1433 >= this.field469 && client.field1433 < this.field470) {
                            Model var8 = this.field474;
                            var8.method148(this.field472 - this.field468, this.field458, this.field471 - super.field402, this.field473 - super.field403);
                            if (super.field448 == 512) {
                                var8.method146(0);
                                var8.method146(0);
                                var8.method146(0);
                            } else if (super.field448 == 1024) {
                                var8.method146(0);
                                var8.method146(0);
                            } else if (super.field448 == 1536) {
                                var8.method146(0);
                            }
                            Model[] var9 = new Model[] { var2, var8 };
                            var2 = new Model(var9, 2, true, this.field457);
                            if (super.field448 == 512) {
                                var8.method146(0);
                            } else if (super.field448 == 1024) {
                                var8.method146(0);
                                var8.method146(0);
                            } else if (super.field448 == 1536) {
                                var8.method146(0);
                                var8.method146(0);
                                var8.method146(0);
                            }
                            var8.method148(this.field468 - this.field472, this.field458, super.field402 - this.field471, super.field403 - this.field473);
                        }
                    }
                    var2.field567 = true;
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(B)Lfb;")
    private final Model method127(byte arg0) {
        long var2 = this.field467;
        int var4 = -1;
        int var5 = -1;
        int var6 = -1;
        int var7 = -1;
        if (arg0 != 7) {
            throw new NullPointerException();
        } else {
            if (super.field429 >= 0 && super.field432 == 0) {
                SeqType var8 = SeqType.field1081[super.field429];
                var4 = var8.field1083[super.field430];
                if (super.field426 >= 0 && super.field426 != super.field407) {
                    var5 = SeqType.field1081[super.field426].field1083[super.field427];
                }
                if (var8.field1090 >= 0) {
                    var6 = var8.field1090;
                    var2 += (long) (var6 - this.field464[5] << 8);
                }
                if (var8.field1091 >= 0) {
                    var7 = var8.field1091;
                    var2 += (long) (var7 - this.field464[3] << 16);
                }
            } else if (super.field426 >= 0) {
                var4 = SeqType.field1081[super.field426].field1083[super.field427];
            }
            Model var9 = (Model) field481.method113(var2);
            if (var9 == null) {
                boolean var10 = false;
                for (int var11 = 0; var11 < 12; ++var11) {
                    int var12 = this.field464[var11];
                    if (var7 >= 0 && var11 == 3) {
                        var12 = var7;
                    }
                    if (var6 >= 0 && var11 == 5) {
                        var12 = var6;
                    }
                    if (var12 >= 256 && var12 < 512 && !IdkType.field1062[var12 - 256].method368(false)) {
                        var10 = true;
                    }
                    if (var12 >= 512 && !ObjType.method339(var12 - 512).method346((byte) -73, this.field462)) {
                        var10 = true;
                    }
                }
                if (var10) {
                    if (this.field480 != -1L) {
                        var9 = (Model) field481.method113(this.field480);
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
                    int var17 = this.field464[var15];
                    if (var7 >= 0 && var15 == 3) {
                        var17 = var7;
                    }
                    if (var6 >= 0 && var15 == 5) {
                        var17 = var6;
                    }
                    if (var17 >= 256 && var17 < 512) {
                        Model var18 = IdkType.field1062[var17 - 256].method369(208);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                    if (var17 >= 512) {
                        Model var19 = ObjType.method339(var17 - 512).method347(false, this.field462);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                }
                var9 = new Model(var14, var13, (byte) 4);
                for (int var16 = 0; var16 < 5; ++var16) {
                    if (this.field465[var16] != 0) {
                        var9.method149(client.field1259[var16][0], client.field1259[var16][this.field465[var16]]);
                        if (var16 == 1) {
                            var9.method149(client.field1360[0], client.field1360[this.field465[var16]]);
                        }
                    }
                }
                var9.method142(8);
                var9.method152(64, 850, -30, -50, -30, true);
                field481.method114(var9, var2, 7);
                this.field480 = var2;
            }
            if (this.field479) {
                return var9;
            } else {
                Model var20 = Model.field529;
                var20.method137(var9, (byte) 6, true);
                if (var4 != -1 && var5 != -1) {
                    var20.method144(false, var5, var4, SeqType.field1081[super.field429].field1087);
                } else if (var4 != -1) {
                    var20.method143(true, var4);
                }
                var20.method139(-849);
                var20.field566 = null;
                var20.field565 = null;
                return var20;
            }
        }
    }

    @OriginalMember(owner = "bb", name = "b", descriptor = "(Z)Lfb;")
    public final Model method128(boolean arg0) {
        if (!this.field461) {
            return null;
        } else {
            boolean var2 = false;
            if (!arg0) {
                for (int var3 = 1; var3 > 0; ++var3) {
                }
            }
            for (int var4 = 0; var4 < 12; ++var4) {
                int var13 = this.field464[var4];
                if (var13 >= 256 && var13 < 512 && !IdkType.field1062[var13 - 256].method370(this.field459)) {
                    var2 = true;
                }
                if (var13 >= 512 && !ObjType.method339(var13 - 512).method348(0, this.field462)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                Model[] var5 = new Model[12];
                int var6 = 0;
                for (int var7 = 0; var7 < 12; ++var7) {
                    int var10 = this.field464[var7];
                    if (var10 >= 256 && var10 < 512) {
                        Model var11 = IdkType.field1062[var10 - 256].method371(true);
                        if (var11 != null) {
                            var5[var6++] = var11;
                        }
                    }
                    if (var10 >= 512) {
                        Model var12 = ObjType.method339(var10 - 512).method349(this.field462, (byte) -96);
                        if (var12 != null) {
                            var5[var6++] = var12;
                        }
                    }
                }
                Model var8 = new Model(var6, var5, (byte) 4);
                for (int var9 = 0; var9 < 5; ++var9) {
                    if (this.field465[var9] != 0) {
                        var8.method149(client.field1259[var9][0], client.field1259[var9][this.field465[var9]]);
                        if (var9 == 1) {
                            var8.method149(client.field1360[0], client.field1360[this.field465[var9]]);
                        }
                    }
                }
                return var8;
            }
        }
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(I)Z")
    public final boolean method124(int arg0) {
        if (arg0 != -27441) {
            throw new NullPointerException();
        } else {
            return this.field461;
        }
    }
}
