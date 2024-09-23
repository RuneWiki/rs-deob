import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ab")
public class PlayerEntity extends PathingEntity {

    @OriginalMember(owner = "ab", name = "pb", descriptor = "Z")
    private boolean field459 = false;

    @OriginalMember(owner = "ab", name = "rb", descriptor = "Z")
    private boolean field461 = false;

    @OriginalMember(owner = "ab", name = "tb", descriptor = "Z")
    public boolean field463 = false;

    @OriginalMember(owner = "ab", name = "wb", descriptor = "[I")
    public int[] field466 = new int[12];

    @OriginalMember(owner = "ab", name = "xb", descriptor = "[I")
    public int[] field467 = new int[5];

    @OriginalMember(owner = "ab", name = "Lb", descriptor = "Z")
    public boolean field481 = false;

    @OriginalMember(owner = "ab", name = "Mb", descriptor = "J")
    public long field482 = -1L;

    @OriginalMember(owner = "ab", name = "Ob", descriptor = "Ls;")
    public static LruCache field484 = new LruCache(260, false);

    @OriginalMember(owner = "ab", name = "qb", descriptor = "I")
    private int field460;

    @OriginalMember(owner = "ab", name = "ub", descriptor = "I")
    public int field464;

    @OriginalMember(owner = "ab", name = "vb", descriptor = "I")
    public int field465;

    @OriginalMember(owner = "ab", name = "yb", descriptor = "I")
    public int field468;

    @OriginalMember(owner = "ab", name = "Ab", descriptor = "I")
    public int field470;

    @OriginalMember(owner = "ab", name = "Bb", descriptor = "I")
    public int field471;

    @OriginalMember(owner = "ab", name = "Cb", descriptor = "I")
    public int field472;

    @OriginalMember(owner = "ab", name = "Db", descriptor = "I")
    public int field473;

    @OriginalMember(owner = "ab", name = "Eb", descriptor = "I")
    public int field474;

    @OriginalMember(owner = "ab", name = "Fb", descriptor = "I")
    public int field475;

    @OriginalMember(owner = "ab", name = "Hb", descriptor = "I")
    public int field477;

    @OriginalMember(owner = "ab", name = "Ib", descriptor = "I")
    public int field478;

    @OriginalMember(owner = "ab", name = "Jb", descriptor = "I")
    public int field479;

    @OriginalMember(owner = "ab", name = "Kb", descriptor = "I")
    public int field480;

    @OriginalMember(owner = "ab", name = "zb", descriptor = "J")
    public long field469;

    @OriginalMember(owner = "ab", name = "Gb", descriptor = "Leb;")
    public Model field476;

    @OriginalMember(owner = "ab", name = "Nb", descriptor = "Lhc;")
    public NpcType field483;

    @OriginalMember(owner = "ab", name = "sb", descriptor = "Ljava/lang/String;")
    public String field462;

    @OriginalMember(owner = "ab", name = "a", descriptor = "(Lmb;I)V")
    public final void method116(Packet arg0, int arg1) {
        arg0.field714 = 0;
        this.field464 = arg0.method228();
        this.field465 = arg0.method228();
        this.field483 = null;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg0.method228();
            if (var4 == 0) {
                this.field466[var3] = 0;
            } else {
                int var5 = arg0.method228();
                this.field466[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field466[0] == 65535) {
                    this.field483 = NpcType.method339(arg0.method230());
                    break;
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var9 = arg0.method228();
            if (var9 < 0 || var9 >= client.field1228[var6].length) {
                var9 = 0;
            }
            this.field467[var6] = var9;
        }
        super.field405 = arg0.method230();
        if (super.field405 == 65535) {
            super.field405 = -1;
        }
        super.field406 = arg0.method230();
        if (super.field406 == 65535) {
            super.field406 = -1;
        }
        super.field407 = arg0.method230();
        if (super.field407 == 65535) {
            super.field407 = -1;
        }
        super.field408 = arg0.method230();
        if (super.field408 == 65535) {
            super.field408 = -1;
        }
        super.field409 = arg0.method230();
        if (super.field409 == 65535) {
            super.field409 = -1;
        }
        super.field410 = arg0.method230();
        if (super.field410 == 65535) {
            super.field410 = -1;
        }
        super.field411 = arg0.method230();
        if (super.field411 == 65535) {
            super.field411 = -1;
        }
        this.field462 = JString.method303(JString.method300(586, arg0.method234(0)), 8);
        if (arg1 == -25120) {
            this.field468 = arg0.method228();
            this.field463 = true;
            this.field469 = 0L;
            for (int var7 = 0; var7 < 12; ++var7) {
                this.field469 <<= 4;
                if (this.field466[var7] >= 256) {
                    this.field469 += (long) (this.field466[var7] - 256);
                }
            }
            if (this.field466[0] >= 256) {
                this.field469 += (long) (this.field466[0] - 256 >> 4);
            }
            if (this.field466[1] >= 256) {
                this.field469 += (long) (this.field466[1] - 256 >> 8);
            }
            for (int var8 = 0; var8 < 5; ++var8) {
                this.field469 <<= 3;
                this.field469 += (long) this.field467[var8];
            }
            this.field469 <<= 1;
            this.field469 += (long) this.field464;
        }
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(I)Leb;")
    public final Model method109(int arg0) {
        if (!this.field463) {
            return null;
        } else {
            Model var2 = this.method117(true);
            if (arg0 != -21173) {
                this.field459 = !this.field459;
            }
            if (var2 == null) {
                return null;
            } else {
                super.field446 = var2.field397;
                var2.field573 = true;
                if (this.field481) {
                    return var2;
                } else {
                    if (super.field433 != -1 && super.field434 != -1) {
                        SpotAnimType var3 = SpotAnimType.field1158[super.field433];
                        Model var4 = var3.method383();
                        if (var4 != null) {
                            Model var5 = new Model(false, -164, var4, true, AnimFrame.method48(super.field434, 62));
                            var5.method138(-super.field437, -34664, 0, 0);
                            var5.method132(this.field460);
                            var5.method133(-278, var3.field1162.field1138[super.field434]);
                            var5.field572 = null;
                            var5.field571 = null;
                            if (var3.field1165 != 128 || var3.field1166 != 128) {
                                var5.method141(var3.field1165, false, var3.field1165, var3.field1166);
                            }
                            var5.method142(var3.field1168 + 64, var3.field1169 + 850, -30, -50, -30, true);
                            Model[] var6 = new Model[] { var2, var5 };
                            var2 = new Model(2, true, var6, 144);
                        }
                    }
                    if (this.field476 != null) {
                        if (client.field1223 >= this.field472) {
                            this.field476 = null;
                        }
                        if (client.field1223 >= this.field471 && client.field1223 < this.field472) {
                            Model var7 = this.field476;
                            var7.method138(this.field474 - this.field470, -34664, this.field473 - super.field400, this.field475 - super.field401);
                            if (super.field447 == 512) {
                                var7.method136(-66);
                                var7.method136(-66);
                                var7.method136(-66);
                            } else if (super.field447 == 1024) {
                                var7.method136(-66);
                                var7.method136(-66);
                            } else if (super.field447 == 1536) {
                                var7.method136(-66);
                            }
                            Model[] var8 = new Model[] { var2, var7 };
                            var2 = new Model(2, true, var8, 144);
                            if (super.field447 == 512) {
                                var7.method136(-66);
                            } else if (super.field447 == 1024) {
                                var7.method136(-66);
                                var7.method136(-66);
                            } else if (super.field447 == 1536) {
                                var7.method136(-66);
                                var7.method136(-66);
                                var7.method136(-66);
                            }
                            var7.method138(this.field470 - this.field474, -34664, super.field400 - this.field473, super.field401 - this.field475);
                        }
                    }
                    var2.field573 = true;
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "ab", name = "b", descriptor = "(Z)Leb;")
    private final Model method117(boolean arg0) {
        if (this.field483 != null) {
            int var2 = -1;
            if (super.field428 >= 0 && super.field431 == 0) {
                var2 = SeqType.field1136[super.field428].field1138[super.field429];
            } else if (super.field425 >= 0) {
                var2 = SeqType.field1136[super.field425].field1138[super.field426];
            }
            return this.field483.method341(this.field461, -1, var2, (int[]) null);
        } else {
            long var4 = this.field469;
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (super.field428 >= 0 && super.field431 == 0) {
                SeqType var10 = SeqType.field1136[super.field428];
                var6 = var10.field1138[super.field429];
                if (super.field425 >= 0 && super.field425 != super.field405) {
                    var7 = SeqType.field1136[super.field425].field1138[super.field426];
                }
                if (var10.field1145 >= 0) {
                    var8 = var10.field1145;
                    var4 += (long) (var8 - this.field466[5] << 8);
                }
                if (var10.field1146 >= 0) {
                    var9 = var10.field1146;
                    var4 += (long) (var9 - this.field466[3] << 16);
                }
            } else if (super.field425 >= 0) {
                var6 = SeqType.field1136[super.field425].field1138[super.field426];
            }
            Model var11 = (Model) field484.method101(var4);
            if (!arg0) {
                throw new NullPointerException();
            } else {
                if (var11 == null) {
                    boolean var12 = false;
                    for (int var13 = 0; var13 < 12; ++var13) {
                        int var14 = this.field466[var13];
                        if (var9 >= 0 && var13 == 3) {
                            var14 = var9;
                        }
                        if (var8 >= 0 && var13 == 5) {
                            var14 = var8;
                        }
                        if (var14 >= 256 && var14 < 512 && !IdkType.field1113[var14 - 256].method374(5)) {
                            var12 = true;
                        }
                        if (var14 >= 512 && !ObjType.method345(var14 - 512).method352(2, this.field464)) {
                            var12 = true;
                        }
                    }
                    if (var12) {
                        if (this.field482 != -1L) {
                            var11 = (Model) field484.method101(this.field482);
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
                        int var19 = this.field466[var17];
                        if (var9 >= 0 && var17 == 3) {
                            var19 = var9;
                        }
                        if (var8 >= 0 && var17 == 5) {
                            var19 = var8;
                        }
                        if (var19 >= 256 && var19 < 512) {
                            Model var20 = IdkType.field1113[var19 - 256].method375(2);
                            if (var20 != null) {
                                var15[var16++] = var20;
                            }
                        }
                        if (var19 >= 512) {
                            Model var21 = ObjType.method345(var19 - 512).method353(this.field464, 0);
                            if (var21 != null) {
                                var15[var16++] = var21;
                            }
                        }
                    }
                    var11 = new Model(172, var15, var16);
                    for (int var18 = 0; var18 < 5; ++var18) {
                        if (this.field467[var18] != 0) {
                            var11.method139(client.field1228[var18][0], client.field1228[var18][this.field467[var18]]);
                            if (var18 == 1) {
                                var11.method139(client.field1484[0], client.field1484[this.field467[var18]]);
                            }
                        }
                    }
                    var11.method132(this.field460);
                    var11.method142(64, 850, -30, -50, -30, true);
                    field484.method102(var11, var4, true);
                    this.field482 = var4;
                }
                if (this.field481) {
                    return var11;
                } else {
                    Model var22 = Model.field535;
                    var22.method127((byte) 6, var11, AnimFrame.method48(var6, 62) & AnimFrame.method48(var7, 62));
                    if (var6 != -1 && var7 != -1) {
                        var22.method134(306, var6, SeqType.field1136[super.field428].field1142, var7);
                    } else if (var6 != -1) {
                        var22.method133(-278, var6);
                    }
                    var22.method129((byte) -17);
                    var22.field572 = null;
                    var22.field571 = null;
                    return var22;
                }
            }
        }
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(B)Leb;")
    public final Model method118(byte arg0) {
        if (!this.field463) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var12 = this.field466[var3];
                if (var12 >= 256 && var12 < 512 && !IdkType.field1113[var12 - 256].method376((byte) 26)) {
                    var2 = true;
                }
                if (var12 >= 512 && !ObjType.method345(var12 - 512).method354(this.field464, 1)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                Model[] var4 = new Model[12];
                int var5 = 0;
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var9 = this.field466[var6];
                    if (var9 >= 256 && var9 < 512) {
                        Model var10 = IdkType.field1113[var9 - 256].method377(true);
                        if (var10 != null) {
                            var4[var5++] = var10;
                        }
                    }
                    if (var9 >= 512) {
                        Model var11 = ObjType.method345(var9 - 512).method355(0, this.field464);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                }
                if (arg0 != 9) {
                    this.field460 = 361;
                }
                Model var7 = new Model(172, var4, var5);
                for (int var8 = 0; var8 < 5; ++var8) {
                    if (this.field467[var8] != 0) {
                        var7.method139(client.field1228[var8][0], client.field1228[var8][this.field467[var8]]);
                        if (var8 == 1) {
                            var7.method139(client.field1484[0], client.field1484[this.field467[var8]]);
                        }
                    }
                }
                return var7;
            }
        }
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(Z)Z")
    public final boolean method113(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        } else {
            return this.field463;
        }
    }
}
