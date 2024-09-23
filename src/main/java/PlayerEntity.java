import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ab")
public class PlayerEntity extends PathingEntity {

    @OriginalMember(owner = "ab", name = "qb", descriptor = "I")
    private int field459 = 16935;

    @OriginalMember(owner = "ab", name = "rb", descriptor = "Z")
    private boolean field460 = true;

    @OriginalMember(owner = "ab", name = "sb", descriptor = "Z")
    private boolean field461 = false;

    @OriginalMember(owner = "ab", name = "ub", descriptor = "Z")
    public boolean field463 = false;

    @OriginalMember(owner = "ab", name = "xb", descriptor = "[I")
    public int[] field466 = new int[12];

    @OriginalMember(owner = "ab", name = "yb", descriptor = "[I")
    public int[] field467 = new int[5];

    @OriginalMember(owner = "ab", name = "Nb", descriptor = "Z")
    public boolean field482 = false;

    @OriginalMember(owner = "ab", name = "Ob", descriptor = "J")
    public long field483 = -1L;

    @OriginalMember(owner = "ab", name = "Rb", descriptor = "Ls;")
    public static LruCache field486 = new LruCache(260, true);

    @OriginalMember(owner = "ab", name = "vb", descriptor = "I")
    public int field464;

    @OriginalMember(owner = "ab", name = "wb", descriptor = "I")
    public int field465;

    @OriginalMember(owner = "ab", name = "zb", descriptor = "I")
    public int field468;

    @OriginalMember(owner = "ab", name = "Ab", descriptor = "I")
    public int field469;

    @OriginalMember(owner = "ab", name = "Cb", descriptor = "I")
    public int field471;

    @OriginalMember(owner = "ab", name = "Db", descriptor = "I")
    public int field472;

    @OriginalMember(owner = "ab", name = "Eb", descriptor = "I")
    public int field473;

    @OriginalMember(owner = "ab", name = "Fb", descriptor = "I")
    public int field474;

    @OriginalMember(owner = "ab", name = "Gb", descriptor = "I")
    public int field475;

    @OriginalMember(owner = "ab", name = "Hb", descriptor = "I")
    public int field476;

    @OriginalMember(owner = "ab", name = "Jb", descriptor = "I")
    public int field478;

    @OriginalMember(owner = "ab", name = "Kb", descriptor = "I")
    public int field479;

    @OriginalMember(owner = "ab", name = "Lb", descriptor = "I")
    public int field480;

    @OriginalMember(owner = "ab", name = "Mb", descriptor = "I")
    public int field481;

    @OriginalMember(owner = "ab", name = "Qb", descriptor = "I")
    public int field485;

    @OriginalMember(owner = "ab", name = "Bb", descriptor = "J")
    public long field470;

    @OriginalMember(owner = "ab", name = "Ib", descriptor = "Leb;")
    public Model field477;

    @OriginalMember(owner = "ab", name = "Pb", descriptor = "Lgc;")
    public NpcType field484;

    @OriginalMember(owner = "ab", name = "tb", descriptor = "Ljava/lang/String;")
    public String field462;

    @OriginalMember(owner = "ab", name = "a", descriptor = "(Llb;Z)V")
    public final void method116(Packet arg0, boolean arg1) {
        arg0.field712 = 0;
        this.field464 = arg0.method229();
        this.field465 = arg0.method229();
        this.field484 = null;
        this.field485 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg0.method229();
            if (var4 == 0) {
                this.field466[var3] = 0;
            } else {
                int var5 = arg0.method229();
                this.field466[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field466[0] == 65535) {
                    this.field484 = NpcType.method341(arg0.method231());
                    break;
                }
                if (this.field466[var3] >= 512 && this.field466[var3] - 512 < ObjType.field1047) {
                    int var10 = ObjType.method348(this.field466[var3] - 512).field1092;
                    if (var10 != 0) {
                        this.field485 = var10;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var9 = arg0.method229();
            if (var9 < 0 || var9 >= client.field1471[var6].length) {
                var9 = 0;
            }
            this.field467[var6] = var9;
        }
        super.field407 = arg0.method231();
        if (super.field407 == 65535) {
            super.field407 = -1;
        }
        super.field408 = arg0.method231();
        if (super.field408 == 65535) {
            super.field408 = -1;
        }
        super.field409 = arg0.method231();
        if (super.field409 == 65535) {
            super.field409 = -1;
        }
        super.field410 = arg0.method231();
        if (super.field410 == 65535) {
            super.field410 = -1;
        }
        super.field411 = arg0.method231();
        if (super.field411 == 65535) {
            super.field411 = -1;
        }
        super.field412 = arg0.method231();
        if (super.field412 == 65535) {
            super.field412 = -1;
        }
        super.field413 = arg0.method231();
        if (super.field413 == 65535) {
            super.field413 = -1;
        }
        this.field462 = JString.method304(false, JString.method301(false, arg0.method235((byte) -39)));
        if (arg1) {
            this.field468 = arg0.method229();
            this.field469 = arg0.method231();
            this.field463 = true;
            this.field470 = 0L;
            for (int var7 = 0; var7 < 12; ++var7) {
                this.field470 <<= 4;
                if (this.field466[var7] >= 256) {
                    this.field470 += (long) (this.field466[var7] - 256);
                }
            }
            if (this.field466[0] >= 256) {
                this.field470 += (long) (this.field466[0] - 256 >> 4);
            }
            if (this.field466[1] >= 256) {
                this.field470 += (long) (this.field466[1] - 256 >> 8);
            }
            for (int var8 = 0; var8 < 5; ++var8) {
                this.field470 <<= 3;
                this.field470 += (long) this.field467[var8];
            }
            this.field470 <<= 1;
            this.field470 += (long) this.field464;
        }
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(Z)Leb;")
    public final Model method109(boolean arg0) {
        if (!this.field463) {
            return null;
        } else {
            Model var2 = this.method117(10728);
            if (!arg0) {
                for (int var3 = 1; var3 > 0; ++var3) {
                }
            }
            if (var2 == null) {
                return null;
            } else {
                super.field448 = var2.field398;
                var2.field579 = true;
                if (this.field482) {
                    return var2;
                } else {
                    if (super.field435 != -1 && super.field436 != -1) {
                        SpotAnimType var4 = SpotAnimType.field1166[super.field435];
                        Model var5 = var4.method386();
                        if (var5 != null) {
                            Model var6 = new Model(false, var5, true, (byte) 119, AnimFrame.method48(super.field436, (byte) 7));
                            var6.method139(0, 0, false, -super.field439);
                            var6.method133(861);
                            var6.method134((byte) -54, var4.field1170.field1146[super.field436]);
                            var6.field578 = null;
                            var6.field577 = null;
                            if (var4.field1173 != 128 || var4.field1174 != 128) {
                                var6.method142(var4.field1173, true, var4.field1173, var4.field1174);
                            }
                            var6.method143(var4.field1176 + 64, var4.field1177 + 850, -30, -50, -30, true);
                            Model[] var7 = new Model[] { var2, var6 };
                            var2 = new Model(var7, true, 2, true);
                        }
                    }
                    if (this.field477 != null) {
                        if (client.field1300 >= this.field473) {
                            this.field477 = null;
                        }
                        if (client.field1300 >= this.field472 && client.field1300 < this.field473) {
                            Model var8 = this.field477;
                            var8.method139(this.field474 - super.field402, this.field476 - super.field403, false, this.field475 - this.field471);
                            if (super.field449 == 512) {
                                var8.method137(-126);
                                var8.method137(-126);
                                var8.method137(-126);
                            } else if (super.field449 == 1024) {
                                var8.method137(-126);
                                var8.method137(-126);
                            } else if (super.field449 == 1536) {
                                var8.method137(-126);
                            }
                            Model[] var9 = new Model[] { var2, var8 };
                            var2 = new Model(var9, true, 2, true);
                            if (super.field449 == 512) {
                                var8.method137(-126);
                            } else if (super.field449 == 1024) {
                                var8.method137(-126);
                                var8.method137(-126);
                            } else if (super.field449 == 1536) {
                                var8.method137(-126);
                                var8.method137(-126);
                                var8.method137(-126);
                            }
                            var8.method139(super.field402 - this.field474, super.field403 - this.field476, false, this.field471 - this.field475);
                        }
                    }
                    var2.field579 = true;
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "ab", name = "b", descriptor = "(I)Leb;")
    private final Model method117(int arg0) {
        if (this.field484 != null) {
            int var2 = -1;
            if (super.field430 >= 0 && super.field433 == 0) {
                var2 = SeqType.field1144[super.field430].field1146[super.field431];
            } else if (super.field427 >= 0) {
                var2 = SeqType.field1144[super.field427].field1146[super.field428];
            }
            return this.field484.method343((byte) 3, -1, var2, (int[]) null);
        } else {
            long var4 = this.field470;
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (super.field430 >= 0 && super.field433 == 0) {
                SeqType var10 = SeqType.field1144[super.field430];
                var6 = var10.field1146[super.field431];
                if (super.field427 >= 0 && super.field427 != super.field407) {
                    var7 = SeqType.field1144[super.field427].field1146[super.field428];
                }
                if (var10.field1153 >= 0) {
                    var8 = var10.field1153;
                    var4 += (long) (var8 - this.field466[5] << 8);
                }
                if (var10.field1154 >= 0) {
                    var9 = var10.field1154;
                    var4 += (long) (var9 - this.field466[3] << 16);
                }
            } else if (super.field427 >= 0) {
                var6 = SeqType.field1144[super.field427].field1146[super.field428];
            }
            Model var11 = (Model) field486.method101(var4);
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
                    if (var14 >= 256 && var14 < 512 && !IdkType.field1124[var14 - 256].method377(0)) {
                        var12 = true;
                    }
                    if (var14 >= 512 && !ObjType.method348(var14 - 512).method355(-418, this.field464)) {
                        var12 = true;
                    }
                }
                if (var12) {
                    if (this.field483 != -1L) {
                        var11 = (Model) field486.method101(this.field483);
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
                        Model var20 = IdkType.field1124[var19 - 256].method378((byte) 3);
                        if (var20 != null) {
                            var15[var16++] = var20;
                        }
                    }
                    if (var19 >= 512) {
                        Model var21 = ObjType.method348(var19 - 512).method356(0, this.field464);
                        if (var21 != null) {
                            var15[var16++] = var21;
                        }
                    }
                }
                var11 = new Model(var15, this.field459, var16);
                for (int var18 = 0; var18 < 5; ++var18) {
                    if (this.field467[var18] != 0) {
                        var11.method140(client.field1471[var18][0], client.field1471[var18][this.field467[var18]]);
                        if (var18 == 1) {
                            var11.method140(client.field1450[0], client.field1450[this.field467[var18]]);
                        }
                    }
                }
                var11.method133(861);
                var11.method143(64, 850, -30, -50, -30, true);
                field486.method102(var4, -533, var11);
                this.field483 = var4;
            }
            if (this.field482) {
                return var11;
            } else {
                Model var22 = Model.field541;
                if (arg0 != 10728) {
                    this.field461 = !this.field461;
                }
                var22.method128(var11, 0, AnimFrame.method48(var6, (byte) 7) & AnimFrame.method48(var7, (byte) 7));
                if (var6 != -1 && var7 != -1) {
                    var22.method135(-76, var6, var7, SeqType.field1144[super.field430].field1150);
                } else if (var6 != -1) {
                    var22.method134((byte) -54, var6);
                }
                var22.method130(3);
                var22.field578 = null;
                var22.field577 = null;
                return var22;
            }
        }
    }

    @OriginalMember(owner = "ab", name = "c", descriptor = "(I)Leb;")
    public final Model method118(int arg0) {
        if (!this.field463) {
            return null;
        } else if (this.field484 != null) {
            return this.field484.method344((byte) 7);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var13 = this.field466[var3];
                if (var13 >= 256 && var13 < 512 && !IdkType.field1124[var13 - 256].method379((byte) 0)) {
                    var2 = true;
                }
                if (var13 >= 512 && !ObjType.method348(var13 - 512).method357(this.field461, this.field464)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                Model[] var4 = new Model[12];
                int var5 = 0;
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var10 = this.field466[var6];
                    if (var10 >= 256 && var10 < 512) {
                        Model var11 = IdkType.field1124[var10 - 256].method380(35721);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                    if (var10 >= 512) {
                        Model var12 = ObjType.method348(var10 - 512).method358(this.field464, false);
                        if (var12 != null) {
                            var4[var5++] = var12;
                        }
                    }
                }
                if (arg0 != -32683) {
                    for (int var7 = 1; var7 > 0; ++var7) {
                    }
                }
                Model var8 = new Model(var4, this.field459, var5);
                for (int var9 = 0; var9 < 5; ++var9) {
                    if (this.field467[var9] != 0) {
                        var8.method140(client.field1471[var9][0], client.field1471[var9][this.field467[var9]]);
                        if (var9 == 1) {
                            var8.method140(client.field1450[0], client.field1450[this.field467[var9]]);
                        }
                    }
                }
                return var8;
            }
        }
    }

    @OriginalMember(owner = "ab", name = "b", descriptor = "(Z)Z")
    public final boolean method113(boolean arg0) {
        if (arg0) {
            this.field459 = -492;
        }
        return this.field463;
    }
}
