import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ab")
public class PlayerEntity extends PathingEntity {

    @OriginalMember(owner = "ab", name = "tb", descriptor = "I")
    private int field455 = 31696;

    @OriginalMember(owner = "ab", name = "ub", descriptor = "Z")
    private boolean field456 = true;

    @OriginalMember(owner = "ab", name = "vb", descriptor = "I")
    private int field457 = -148;

    @OriginalMember(owner = "ab", name = "xb", descriptor = "Z")
    public boolean field459 = false;

    @OriginalMember(owner = "ab", name = "Ab", descriptor = "[I")
    public int[] field462 = new int[12];

    @OriginalMember(owner = "ab", name = "Bb", descriptor = "[I")
    public int[] field463 = new int[5];

    @OriginalMember(owner = "ab", name = "Qb", descriptor = "Z")
    public boolean field478 = false;

    @OriginalMember(owner = "ab", name = "Rb", descriptor = "J")
    public long field479 = -1L;

    @OriginalMember(owner = "ab", name = "Ub", descriptor = "Ls;")
    public static LruCache field482 = new LruCache((byte) 113, 260);

    @OriginalMember(owner = "ab", name = "yb", descriptor = "I")
    public int field460;

    @OriginalMember(owner = "ab", name = "zb", descriptor = "I")
    public int field461;

    @OriginalMember(owner = "ab", name = "Cb", descriptor = "I")
    public int field464;

    @OriginalMember(owner = "ab", name = "Db", descriptor = "I")
    public int field465;

    @OriginalMember(owner = "ab", name = "Fb", descriptor = "I")
    public int field467;

    @OriginalMember(owner = "ab", name = "Gb", descriptor = "I")
    public int field468;

    @OriginalMember(owner = "ab", name = "Hb", descriptor = "I")
    public int field469;

    @OriginalMember(owner = "ab", name = "Ib", descriptor = "I")
    public int field470;

    @OriginalMember(owner = "ab", name = "Jb", descriptor = "I")
    public int field471;

    @OriginalMember(owner = "ab", name = "Kb", descriptor = "I")
    public int field472;

    @OriginalMember(owner = "ab", name = "Mb", descriptor = "I")
    public int field474;

    @OriginalMember(owner = "ab", name = "Nb", descriptor = "I")
    public int field475;

    @OriginalMember(owner = "ab", name = "Ob", descriptor = "I")
    public int field476;

    @OriginalMember(owner = "ab", name = "Pb", descriptor = "I")
    public int field477;

    @OriginalMember(owner = "ab", name = "Tb", descriptor = "I")
    public int field481;

    @OriginalMember(owner = "ab", name = "Eb", descriptor = "J")
    public long field466;

    @OriginalMember(owner = "ab", name = "Lb", descriptor = "Leb;")
    public Model field473;

    @OriginalMember(owner = "ab", name = "Sb", descriptor = "Lgc;")
    public NpcType field480;

    @OriginalMember(owner = "ab", name = "wb", descriptor = "Ljava/lang/String;")
    public String field458;

    @OriginalMember(owner = "ab", name = "a", descriptor = "(ILlb;)V")
    public final void method116(int arg0, Packet arg1) {
        arg1.field703 = 0;
        this.field460 = arg1.method229();
        this.field461 = arg1.method229();
        this.field480 = null;
        this.field481 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg1.method229();
            if (var4 == 0) {
                this.field462[var3] = 0;
            } else {
                int var5 = arg1.method229();
                this.field462[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field462[0] == 65535) {
                    this.field480 = NpcType.method341(arg1.method231());
                    break;
                }
                if (this.field462[var3] >= 512 && this.field462[var3] - 512 < ObjType.field1033) {
                    int var10 = ObjType.method348(this.field462[var3] - 512).field1078;
                    if (var10 != 0) {
                        this.field481 = var10;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var9 = arg1.method229();
            if (var9 < 0 || var9 >= client.field1457[var6].length) {
                var9 = 0;
            }
            this.field463[var6] = var9;
        }
        super.field402 = arg1.method231();
        if (super.field402 == 65535) {
            super.field402 = -1;
        }
        super.field403 = arg1.method231();
        if (super.field403 == 65535) {
            super.field403 = -1;
        }
        super.field404 = arg1.method231();
        if (super.field404 == 65535) {
            super.field404 = -1;
        }
        super.field405 = arg1.method231();
        if (super.field405 == 65535) {
            super.field405 = -1;
        }
        super.field406 = arg1.method231();
        if (super.field406 == 65535) {
            super.field406 = -1;
        }
        super.field407 = arg1.method231();
        if (super.field407 == 65535) {
            super.field407 = -1;
        }
        super.field408 = arg1.method231();
        if (super.field408 == 65535) {
            super.field408 = -1;
        }
        this.field458 = JString.method304((byte) 8, JString.method301(this.field455, arg1.method235(true)));
        this.field464 = arg1.method229();
        if (arg0 == 0) {
            this.field465 = arg1.method231();
            this.field459 = true;
            this.field466 = 0L;
            for (int var7 = 0; var7 < 12; ++var7) {
                this.field466 <<= 4;
                if (this.field462[var7] >= 256) {
                    this.field466 += (long) (this.field462[var7] - 256);
                }
            }
            if (this.field462[0] >= 256) {
                this.field466 += (long) (this.field462[0] - 256 >> 4);
            }
            if (this.field462[1] >= 256) {
                this.field466 += (long) (this.field462[1] - 256 >> 8);
            }
            for (int var8 = 0; var8 < 5; ++var8) {
                this.field466 <<= 3;
                this.field466 += (long) this.field463[var8];
            }
            this.field466 <<= 1;
            this.field466 += (long) this.field460;
        }
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(I)Leb;")
    public final Model method109(int arg0) {
        if (!this.field459) {
            return null;
        } else {
            Model var2 = this.method117(this.field457);
            if (var2 == null) {
                return null;
            } else {
                super.field443 = var2.field393;
                if (arg0 != 0) {
                    throw new NullPointerException();
                } else {
                    var2.field571 = true;
                    if (this.field478) {
                        return var2;
                    } else {
                        if (super.field430 != -1 && super.field431 != -1) {
                            SpotAnimType var3 = SpotAnimType.field1157[super.field430];
                            Model var4 = var3.method386();
                            if (var4 != null) {
                                Model var5 = new Model(var4, true, false, AnimFrame.method48(super.field431, -47594), 0);
                                var5.method139(-super.field434, 0, 0, 216);
                                var5.method133(0);
                                var5.method134(428, var3.field1161.field1136[super.field431]);
                                var5.field570 = null;
                                var5.field569 = null;
                                if (var3.field1164 != 128 || var3.field1165 != 128) {
                                    var5.method142((byte) 4, var3.field1165, var3.field1164, var3.field1164);
                                }
                                var5.method143(var3.field1167 + 64, var3.field1168 + 850, -30, -50, -30, true);
                                Model[] var6 = new Model[] { var2, var5 };
                                var2 = new Model(true, var6, (byte) 4, 2);
                            }
                        }
                        if (this.field473 != null) {
                            if (client.field1279 >= this.field469) {
                                this.field473 = null;
                            }
                            if (client.field1279 >= this.field468 && client.field1279 < this.field469) {
                                Model var7 = this.field473;
                                var7.method139(this.field471 - this.field467, this.field472 - super.field398, this.field470 - super.field397, 216);
                                if (super.field444 == 512) {
                                    var7.method137(0);
                                    var7.method137(0);
                                    var7.method137(0);
                                } else if (super.field444 == 1024) {
                                    var7.method137(0);
                                    var7.method137(0);
                                } else if (super.field444 == 1536) {
                                    var7.method137(0);
                                }
                                Model[] var8 = new Model[] { var2, var7 };
                                var2 = new Model(true, var8, (byte) 4, 2);
                                if (super.field444 == 512) {
                                    var7.method137(0);
                                } else if (super.field444 == 1024) {
                                    var7.method137(0);
                                    var7.method137(0);
                                } else if (super.field444 == 1536) {
                                    var7.method137(0);
                                    var7.method137(0);
                                    var7.method137(0);
                                }
                                var7.method139(this.field467 - this.field471, super.field398 - this.field472, super.field397 - this.field470, 216);
                            }
                        }
                        var2.field571 = true;
                        return var2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "ab", name = "c", descriptor = "(I)Leb;")
    private final Model method117(int arg0) {
        if (this.field480 != null) {
            int var2 = -1;
            if (super.field425 >= 0 && super.field428 == 0) {
                var2 = SeqType.field1134[super.field425].field1136[super.field426];
            } else if (super.field422 >= 0) {
                var2 = SeqType.field1134[super.field422].field1136[super.field423];
            }
            return this.field480.method343(var2, 175, -1, (int[]) null);
        } else {
            long var4 = this.field466;
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (arg0 >= 0) {
                for (int var10 = 1; var10 > 0; ++var10) {
                }
            }
            if (super.field425 >= 0 && super.field428 == 0) {
                SeqType var11 = SeqType.field1134[super.field425];
                var6 = var11.field1136[super.field426];
                if (super.field422 >= 0 && super.field422 != super.field402) {
                    var7 = SeqType.field1134[super.field422].field1136[super.field423];
                }
                if (var11.field1143 >= 0) {
                    var8 = var11.field1143;
                    var4 += (long) (var8 - this.field462[5] << 8);
                }
                if (var11.field1144 >= 0) {
                    var9 = var11.field1144;
                    var4 += (long) (var9 - this.field462[3] << 16);
                }
            } else if (super.field422 >= 0) {
                var6 = SeqType.field1134[super.field422].field1136[super.field423];
            }
            Model var12 = (Model) field482.method101(var4);
            if (var12 == null) {
                boolean var13 = false;
                for (int var14 = 0; var14 < 12; ++var14) {
                    int var15 = this.field462[var14];
                    if (var9 >= 0 && var14 == 3) {
                        var15 = var9;
                    }
                    if (var8 >= 0 && var14 == 5) {
                        var15 = var8;
                    }
                    if (var15 >= 256 && var15 < 512 && !IdkType.field1111[var15 - 256].method377(8)) {
                        var13 = true;
                    }
                    if (var15 >= 512 && !ObjType.method348(var15 - 512).method355(-979, this.field460)) {
                        var13 = true;
                    }
                }
                if (var13) {
                    if (this.field479 != -1L) {
                        var12 = (Model) field482.method101(this.field479);
                    }
                    if (var12 == null) {
                        return null;
                    }
                }
            }
            if (var12 == null) {
                Model[] var16 = new Model[12];
                int var17 = 0;
                for (int var18 = 0; var18 < 12; ++var18) {
                    int var20 = this.field462[var18];
                    if (var9 >= 0 && var18 == 3) {
                        var20 = var9;
                    }
                    if (var8 >= 0 && var18 == 5) {
                        var20 = var8;
                    }
                    if (var20 >= 256 && var20 < 512) {
                        Model var21 = IdkType.field1111[var20 - 256].method378(false);
                        if (var21 != null) {
                            var16[var17++] = var21;
                        }
                    }
                    if (var20 >= 512) {
                        Model var22 = ObjType.method348(var20 - 512).method356(this.field460, 6);
                        if (var22 != null) {
                            var16[var17++] = var22;
                        }
                    }
                }
                var12 = new Model(var17, -550, var16);
                for (int var19 = 0; var19 < 5; ++var19) {
                    if (this.field463[var19] != 0) {
                        var12.method140(client.field1457[var19][0], client.field1457[var19][this.field463[var19]]);
                        if (var19 == 1) {
                            var12.method140(client.field1316[0], client.field1316[this.field463[var19]]);
                        }
                    }
                }
                var12.method133(0);
                var12.method143(64, 850, -30, -50, -30, true);
                field482.method102(var4, true, var12);
                this.field479 = var4;
            }
            if (this.field478) {
                return var12;
            } else {
                Model var23 = Model.field533;
                var23.method128(AnimFrame.method48(var6, -47594) & AnimFrame.method48(var7, -47594), var12, 471);
                if (var6 != -1 && var7 != -1) {
                    var23.method135(var7, SeqType.field1134[super.field425].field1140, var6, false);
                } else if (var6 != -1) {
                    var23.method134(428, var6);
                }
                var23.method130(0);
                var23.field570 = null;
                var23.field569 = null;
                return var23;
            }
        }
    }

    @OriginalMember(owner = "ab", name = "b", descriptor = "(Z)Leb;")
    public final Model method118(boolean arg0) {
        if (!this.field459) {
            return null;
        } else if (this.field480 != null) {
            return this.field480.method344(-41730);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var12 = this.field462[var3];
                if (var12 >= 256 && var12 < 512 && !IdkType.field1111[var12 - 256].method379(0)) {
                    var2 = true;
                }
                if (var12 >= 512 && !ObjType.method348(var12 - 512).method357(16981, this.field460)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                Model[] var4 = new Model[12];
                int var5 = 0;
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var9 = this.field462[var6];
                    if (var9 >= 256 && var9 < 512) {
                        Model var10 = IdkType.field1111[var9 - 256].method380(true);
                        if (var10 != null) {
                            var4[var5++] = var10;
                        }
                    }
                    if (var9 >= 512) {
                        Model var11 = ObjType.method348(var9 - 512).method358(2913, this.field460);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                }
                Model var7 = new Model(var5, -550, var4);
                for (int var8 = 0; var8 < 5; ++var8) {
                    if (this.field463[var8] != 0) {
                        var7.method140(client.field1457[var8][0], client.field1457[var8][this.field463[var8]]);
                        if (var8 == 1) {
                            var7.method140(client.field1316[0], client.field1316[this.field463[var8]]);
                        }
                    }
                }
                if (!arg0) {
                    this.field456 = !this.field456;
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
            return this.field459;
        }
    }
}
