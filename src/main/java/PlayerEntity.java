import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ab")
public class PlayerEntity extends PathingEntity {

    @OriginalMember(owner = "ab", name = "qb", descriptor = "I")
    private int field456 = 4;

    @OriginalMember(owner = "ab", name = "rb", descriptor = "I")
    private int field457 = 6;

    @OriginalMember(owner = "ab", name = "sb", descriptor = "I")
    private int field458 = -262;

    @OriginalMember(owner = "ab", name = "tb", descriptor = "I")
    private int field459 = 7;

    @OriginalMember(owner = "ab", name = "vb", descriptor = "Z")
    public boolean field461 = false;

    @OriginalMember(owner = "ab", name = "yb", descriptor = "[I")
    public int[] field464 = new int[12];

    @OriginalMember(owner = "ab", name = "zb", descriptor = "[I")
    public int[] field465 = new int[5];

    @OriginalMember(owner = "ab", name = "Ob", descriptor = "Z")
    public boolean field480 = false;

    @OriginalMember(owner = "ab", name = "Pb", descriptor = "J")
    public long field481 = -1L;

    @OriginalMember(owner = "ab", name = "Sb", descriptor = "Ls;")
    public static LruCache field484 = new LruCache((byte) 8, 260);

    @OriginalMember(owner = "ab", name = "wb", descriptor = "I")
    public int field462;

    @OriginalMember(owner = "ab", name = "xb", descriptor = "I")
    public int field463;

    @OriginalMember(owner = "ab", name = "Ab", descriptor = "I")
    public int field466;

    @OriginalMember(owner = "ab", name = "Bb", descriptor = "I")
    public int field467;

    @OriginalMember(owner = "ab", name = "Db", descriptor = "I")
    public int field469;

    @OriginalMember(owner = "ab", name = "Eb", descriptor = "I")
    public int field470;

    @OriginalMember(owner = "ab", name = "Fb", descriptor = "I")
    public int field471;

    @OriginalMember(owner = "ab", name = "Gb", descriptor = "I")
    public int field472;

    @OriginalMember(owner = "ab", name = "Hb", descriptor = "I")
    public int field473;

    @OriginalMember(owner = "ab", name = "Ib", descriptor = "I")
    public int field474;

    @OriginalMember(owner = "ab", name = "Kb", descriptor = "I")
    public int field476;

    @OriginalMember(owner = "ab", name = "Lb", descriptor = "I")
    public int field477;

    @OriginalMember(owner = "ab", name = "Mb", descriptor = "I")
    public int field478;

    @OriginalMember(owner = "ab", name = "Nb", descriptor = "I")
    public int field479;

    @OriginalMember(owner = "ab", name = "Rb", descriptor = "I")
    public int field483;

    @OriginalMember(owner = "ab", name = "Cb", descriptor = "J")
    public long field468;

    @OriginalMember(owner = "ab", name = "Jb", descriptor = "Leb;")
    public Model field475;

    @OriginalMember(owner = "ab", name = "Qb", descriptor = "Lgc;")
    public NpcType field482;

    @OriginalMember(owner = "ab", name = "ub", descriptor = "Ljava/lang/String;")
    public String field460;

    @OriginalMember(owner = "ab", name = "a", descriptor = "(Llb;Z)V")
    public final void method116(Packet arg0, boolean arg1) {
        arg0.field711 = 0;
        this.field462 = arg0.method229();
        this.field463 = arg0.method229();
        this.field482 = null;
        this.field483 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg0.method229();
            if (var4 == 0) {
                this.field464[var3] = 0;
            } else {
                int var5 = arg0.method229();
                this.field464[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field464[0] == 65535) {
                    this.field482 = NpcType.method341(arg0.method231());
                    break;
                }
                if (this.field464[var3] >= 512 && this.field464[var3] - 512 < ObjType.field1039) {
                    int var11 = ObjType.method348(this.field464[var3] - 512).field1084;
                    if (var11 != 0) {
                        this.field483 = var11;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var10 = arg0.method229();
            if (var10 < 0 || var10 >= client.field1591[var6].length) {
                var10 = 0;
            }
            this.field465[var6] = var10;
        }
        super.field402 = arg0.method231();
        if (super.field402 == 65535) {
            super.field402 = -1;
        }
        super.field403 = arg0.method231();
        if (super.field403 == 65535) {
            super.field403 = -1;
        }
        super.field404 = arg0.method231();
        if (super.field404 == 65535) {
            super.field404 = -1;
        }
        super.field405 = arg0.method231();
        if (super.field405 == 65535) {
            super.field405 = -1;
        }
        super.field406 = arg0.method231();
        if (!arg1) {
            for (int var7 = 1; var7 > 0; ++var7) {
            }
        }
        if (super.field406 == 65535) {
            super.field406 = -1;
        }
        super.field407 = arg0.method231();
        if (super.field407 == 65535) {
            super.field407 = -1;
        }
        super.field408 = arg0.method231();
        if (super.field408 == 65535) {
            super.field408 = -1;
        }
        this.field460 = JString.method304(JString.method301(arg0.method235(this.field456), false), 789);
        this.field466 = arg0.method229();
        this.field467 = arg0.method231();
        this.field461 = true;
        this.field468 = 0L;
        for (int var8 = 0; var8 < 12; ++var8) {
            this.field468 <<= 4;
            if (this.field464[var8] >= 256) {
                this.field468 += (long) (this.field464[var8] - 256);
            }
        }
        if (this.field464[0] >= 256) {
            this.field468 += (long) (this.field464[0] - 256 >> 4);
        }
        if (this.field464[1] >= 256) {
            this.field468 += (long) (this.field464[1] - 256 >> 8);
        }
        for (int var9 = 0; var9 < 5; ++var9) {
            this.field468 <<= 3;
            this.field468 += (long) this.field465[var9];
        }
        this.field468 <<= 1;
        this.field468 += (long) this.field462;
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(B)Leb;")
    public final Model method109(byte arg0) {
        if (!this.field461) {
            return null;
        } else {
            Model var2 = this.method117(this.field458);
            if (var2 == null) {
                return null;
            } else {
                super.field443 = var2.field394;
                var2.field574 = true;
                if (this.field480) {
                    return var2;
                } else {
                    if (super.field430 != -1 && super.field431 != -1) {
                        SpotAnimType var3 = SpotAnimType.field1157[super.field430];
                        Model var4 = var3.method386();
                        if (var4 != null) {
                            Model var5 = new Model(false, true, AnimFrame.method48(4, super.field431), var4, 396);
                            var5.method139(this.field457, 0, -super.field434, 0);
                            var5.method133(false);
                            var5.method134(2, var3.field1161.field1137[super.field431]);
                            var5.field573 = null;
                            var5.field572 = null;
                            if (var3.field1164 != 128 || var3.field1165 != 128) {
                                var5.method142(var3.field1164, var3.field1164, var3.field1165, 0);
                            }
                            var5.method143(var3.field1167 + 64, var3.field1168 + 850, -30, -50, -30, true);
                            Model[] var6 = new Model[] { var2, var5 };
                            var2 = new Model(2, false, var6, true);
                        }
                    }
                    if (this.field475 != null) {
                        if (client.field1275 >= this.field471) {
                            this.field475 = null;
                        }
                        if (client.field1275 >= this.field470 && client.field1275 < this.field471) {
                            Model var7 = this.field475;
                            var7.method139(this.field457, this.field474 - super.field398, this.field473 - this.field469, this.field472 - super.field397);
                            if (super.field444 == 512) {
                                var7.method137((byte) -37);
                                var7.method137((byte) -37);
                                var7.method137((byte) -37);
                            } else if (super.field444 == 1024) {
                                var7.method137((byte) -37);
                                var7.method137((byte) -37);
                            } else if (super.field444 == 1536) {
                                var7.method137((byte) -37);
                            }
                            Model[] var8 = new Model[] { var2, var7 };
                            var2 = new Model(2, false, var8, true);
                            if (super.field444 == 512) {
                                var7.method137((byte) -37);
                            } else if (super.field444 == 1024) {
                                var7.method137((byte) -37);
                                var7.method137((byte) -37);
                            } else if (super.field444 == 1536) {
                                var7.method137((byte) -37);
                                var7.method137((byte) -37);
                                var7.method137((byte) -37);
                            }
                            var7.method139(this.field457, super.field398 - this.field474, this.field469 - this.field473, super.field397 - this.field472);
                        }
                    }
                    var2.field574 = true;
                    if (arg0 != -67) {
                        throw new NullPointerException();
                    } else {
                        return var2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "ab", name = "b", descriptor = "(I)Leb;")
    private final Model method117(int arg0) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field482 != null) {
            int var3 = -1;
            if (super.field425 >= 0 && super.field428 == 0) {
                var3 = SeqType.field1135[super.field425].field1137[super.field426];
            } else if (super.field422 >= 0) {
                var3 = SeqType.field1135[super.field422].field1137[super.field423];
            }
            return this.field482.method343(var3, (int[]) null, true, -1);
        } else {
            long var5 = this.field468;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            int var10 = -1;
            if (super.field425 >= 0 && super.field428 == 0) {
                SeqType var11 = SeqType.field1135[super.field425];
                var7 = var11.field1137[super.field426];
                if (super.field422 >= 0 && super.field422 != super.field402) {
                    var8 = SeqType.field1135[super.field422].field1137[super.field423];
                }
                if (var11.field1144 >= 0) {
                    var9 = var11.field1144;
                    var5 += (long) (var9 - this.field464[5] << 8);
                }
                if (var11.field1145 >= 0) {
                    var10 = var11.field1145;
                    var5 += (long) (var10 - this.field464[3] << 16);
                }
            } else if (super.field422 >= 0) {
                var7 = SeqType.field1135[super.field422].field1137[super.field423];
            }
            Model var12 = (Model) field484.method101(var5);
            if (var12 == null) {
                boolean var13 = false;
                for (int var14 = 0; var14 < 12; ++var14) {
                    int var15 = this.field464[var14];
                    if (var10 >= 0 && var14 == 3) {
                        var15 = var10;
                    }
                    if (var9 >= 0 && var14 == 5) {
                        var15 = var9;
                    }
                    if (var15 >= 256 && var15 < 512 && !IdkType.field1116[var15 - 256].method377(false)) {
                        var13 = true;
                    }
                    if (var15 >= 512 && !ObjType.method348(var15 - 512).method355(3099, this.field462)) {
                        var13 = true;
                    }
                }
                if (var13) {
                    if (this.field481 != -1L) {
                        var12 = (Model) field484.method101(this.field481);
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
                    int var20 = this.field464[var18];
                    if (var10 >= 0 && var18 == 3) {
                        var20 = var10;
                    }
                    if (var9 >= 0 && var18 == 5) {
                        var20 = var9;
                    }
                    if (var20 >= 256 && var20 < 512) {
                        Model var21 = IdkType.field1116[var20 - 256].method378(false);
                        if (var21 != null) {
                            var16[var17++] = var21;
                        }
                    }
                    if (var20 >= 512) {
                        Model var22 = ObjType.method348(var20 - 512).method356(this.field462, -7087);
                        if (var22 != null) {
                            var16[var17++] = var22;
                        }
                    }
                }
                var12 = new Model((byte) 2, var16, var17);
                for (int var19 = 0; var19 < 5; ++var19) {
                    if (this.field465[var19] != 0) {
                        var12.method140(client.field1591[var19][0], client.field1591[var19][this.field465[var19]]);
                        if (var19 == 1) {
                            var12.method140(client.field1669[0], client.field1669[this.field465[var19]]);
                        }
                    }
                }
                var12.method133(false);
                var12.method143(64, 850, -30, -50, -30, true);
                field484.method102(var5, 0, var12);
                this.field481 = var5;
            }
            if (this.field480) {
                return var12;
            } else {
                Model var23 = Model.field536;
                var23.method128(9, AnimFrame.method48(4, var7) & AnimFrame.method48(4, var8), var12);
                if (var7 != -1 && var8 != -1) {
                    var23.method135((byte) -104, SeqType.field1135[super.field425].field1141, var8, var7);
                } else if (var7 != -1) {
                    var23.method134(2, var7);
                }
                var23.method130(793);
                var23.field573 = null;
                var23.field572 = null;
                return var23;
            }
        }
    }

    @OriginalMember(owner = "ab", name = "c", descriptor = "(I)Leb;")
    public final Model method118(int arg0) {
        if (!this.field461) {
            return null;
        } else if (this.field482 != null) {
            return this.field482.method344(-23484);
        } else {
            boolean var2 = false;
            if (this.field459 != arg0) {
                throw new NullPointerException();
            } else {
                for (int var3 = 0; var3 < 12; ++var3) {
                    int var12 = this.field464[var3];
                    if (var12 >= 256 && var12 < 512 && !IdkType.field1116[var12 - 256].method379((byte) 7)) {
                        var2 = true;
                    }
                    if (var12 >= 512 && !ObjType.method348(var12 - 512).method357(6, this.field462)) {
                        var2 = true;
                    }
                }
                if (var2) {
                    return null;
                } else {
                    Model[] var4 = new Model[12];
                    int var5 = 0;
                    for (int var6 = 0; var6 < 12; ++var6) {
                        int var9 = this.field464[var6];
                        if (var9 >= 256 && var9 < 512) {
                            Model var10 = IdkType.field1116[var9 - 256].method380(0);
                            if (var10 != null) {
                                var4[var5++] = var10;
                            }
                        }
                        if (var9 >= 512) {
                            Model var11 = ObjType.method348(var9 - 512).method358(this.field462, -815);
                            if (var11 != null) {
                                var4[var5++] = var11;
                            }
                        }
                    }
                    Model var7 = new Model((byte) 2, var4, var5);
                    for (int var8 = 0; var8 < 5; ++var8) {
                        if (this.field465[var8] != 0) {
                            var7.method140(client.field1591[var8][0], client.field1591[var8][this.field465[var8]]);
                            if (var8 == 1) {
                                var7.method140(client.field1669[0], client.field1669[this.field465[var8]]);
                            }
                        }
                    }
                    return var7;
                }
            }
        }
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(Z)Z")
    public final boolean method113(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        } else {
            return this.field461;
        }
    }
}
