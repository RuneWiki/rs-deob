import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ab")
public class PlayerEntity extends PathingEntity {

    @OriginalMember(owner = "ab", name = "rb", descriptor = "Z")
    private boolean field458 = true;

    @OriginalMember(owner = "ab", name = "sb", descriptor = "B")
    private byte field459 = -84;

    @OriginalMember(owner = "ab", name = "ub", descriptor = "Z")
    public boolean field461 = false;

    @OriginalMember(owner = "ab", name = "xb", descriptor = "[I")
    public int[] field464 = new int[12];

    @OriginalMember(owner = "ab", name = "yb", descriptor = "[I")
    public int[] field465 = new int[5];

    @OriginalMember(owner = "ab", name = "Nb", descriptor = "Z")
    public boolean field480 = false;

    @OriginalMember(owner = "ab", name = "Ob", descriptor = "J")
    public long field481 = -1L;

    @OriginalMember(owner = "ab", name = "Rb", descriptor = "Ls;")
    public static LruCache field484 = new LruCache(-739, 260);

    @OriginalMember(owner = "ab", name = "vb", descriptor = "I")
    public int field462;

    @OriginalMember(owner = "ab", name = "wb", descriptor = "I")
    public int field463;

    @OriginalMember(owner = "ab", name = "zb", descriptor = "I")
    public int field466;

    @OriginalMember(owner = "ab", name = "Ab", descriptor = "I")
    public int field467;

    @OriginalMember(owner = "ab", name = "Cb", descriptor = "I")
    public int field469;

    @OriginalMember(owner = "ab", name = "Db", descriptor = "I")
    public int field470;

    @OriginalMember(owner = "ab", name = "Eb", descriptor = "I")
    public int field471;

    @OriginalMember(owner = "ab", name = "Fb", descriptor = "I")
    public int field472;

    @OriginalMember(owner = "ab", name = "Gb", descriptor = "I")
    public int field473;

    @OriginalMember(owner = "ab", name = "Hb", descriptor = "I")
    public int field474;

    @OriginalMember(owner = "ab", name = "Jb", descriptor = "I")
    public int field476;

    @OriginalMember(owner = "ab", name = "Kb", descriptor = "I")
    public int field477;

    @OriginalMember(owner = "ab", name = "Lb", descriptor = "I")
    public int field478;

    @OriginalMember(owner = "ab", name = "Mb", descriptor = "I")
    public int field479;

    @OriginalMember(owner = "ab", name = "Qb", descriptor = "I")
    public int field483;

    @OriginalMember(owner = "ab", name = "Bb", descriptor = "J")
    public long field468;

    @OriginalMember(owner = "ab", name = "Ib", descriptor = "Leb;")
    public Model field475;

    @OriginalMember(owner = "ab", name = "Pb", descriptor = "Lgc;")
    public NpcType field482;

    @OriginalMember(owner = "ab", name = "tb", descriptor = "Ljava/lang/String;")
    public String field460;

    @OriginalMember(owner = "ab", name = "a", descriptor = "(ILlb;)V")
    public final void method116(int arg0, Packet arg1) {
        arg1.field717 = 0;
        this.field462 = arg1.method229();
        this.field463 = arg1.method229();
        this.field482 = null;
        this.field483 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg1.method229();
            if (var4 == 0) {
                this.field464[var3] = 0;
            } else {
                int var5 = arg1.method229();
                this.field464[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field464[0] == 65535) {
                    this.field482 = NpcType.method341(arg1.method231());
                    break;
                }
                if (this.field464[var3] >= 512 && this.field464[var3] - 512 < ObjType.field1050) {
                    int var10 = ObjType.method348(this.field464[var3] - 512).field1095;
                    if (var10 != 0) {
                        this.field483 = var10;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var9 = arg1.method229();
            if (var9 < 0 || var9 >= client.field1341[var6].length) {
                var9 = 0;
            }
            this.field465[var6] = var9;
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
        super.field409 = arg1.method231();
        if (super.field409 == 65535) {
            super.field409 = -1;
        }
        super.field410 = arg1.method231();
        if (super.field410 == 65535) {
            super.field410 = -1;
        }
        this.field460 = JString.method304(943, JString.method301(0, arg1.method235(0)));
        this.field466 = arg1.method229();
        this.field467 = arg1.method231();
        this.field461 = true;
        this.field468 = 0L;
        for (int var7 = 0; var7 < 12; ++var7) {
            this.field468 <<= 4;
            if (this.field464[var7] >= 256) {
                this.field468 += (long) (this.field464[var7] - 256);
            }
        }
        if (this.field464[0] >= 256) {
            this.field468 += (long) (this.field464[0] - 256 >> 4);
        }
        if (this.field464[1] >= 256) {
            this.field468 += (long) (this.field464[1] - 256 >> 8);
        }
        for (int var8 = 0; var8 < 5; ++var8) {
            this.field468 <<= 3;
            this.field468 += (long) this.field465[var8];
        }
        this.field468 <<= 1;
        this.field468 += (long) this.field462;
        if (arg0 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(I)Leb;")
    public final Model method109(int arg0) {
        if (!this.field461) {
            return null;
        } else {
            Model var2 = this.method117(false);
            if (var2 == null) {
                return null;
            } else {
                super.field445 = var2.field394;
                var2.field573 = true;
                if (arg0 < 0) {
                    if (this.field480) {
                        return var2;
                    } else {
                        if (super.field432 != -1 && super.field433 != -1) {
                            SpotAnimType var3 = SpotAnimType.field1172[super.field432];
                            Model var4 = var3.method386();
                            if (var4 != null) {
                                Model var5 = new Model(AnimFrame.method48(super.field433, 45733), false, true, var4, 0);
                                var5.method139(-super.field436, false, 0, 0);
                                var5.method133(true);
                                var5.method134(true, var3.field1176.field1151[super.field433]);
                                var5.field572 = null;
                                var5.field571 = null;
                                if (var3.field1179 != 128 || var3.field1180 != 128) {
                                    var5.method142(var3.field1179, var3.field1179, -34245, var3.field1180);
                                }
                                var5.method143(var3.field1182 + 64, var3.field1183 + 850, -30, -50, -30, true);
                                Model[] var6 = new Model[] { var2, var5 };
                                var2 = new Model(2, var6, (byte) 80, true);
                            }
                        }
                        if (this.field475 != null) {
                            if (client.field1401 >= this.field471) {
                                this.field475 = null;
                            }
                            if (client.field1401 >= this.field470 && client.field1401 < this.field471) {
                                Model var7 = this.field475;
                                var7.method139(this.field473 - this.field469, false, this.field474 - super.field400, this.field472 - super.field399);
                                if (super.field446 == 512) {
                                    var7.method137((byte) -125);
                                    var7.method137((byte) -125);
                                    var7.method137((byte) -125);
                                } else if (super.field446 == 1024) {
                                    var7.method137((byte) -125);
                                    var7.method137((byte) -125);
                                } else if (super.field446 == 1536) {
                                    var7.method137((byte) -125);
                                }
                                Model[] var8 = new Model[] { var2, var7 };
                                var2 = new Model(2, var8, (byte) 80, true);
                                if (super.field446 == 512) {
                                    var7.method137((byte) -125);
                                } else if (super.field446 == 1024) {
                                    var7.method137((byte) -125);
                                    var7.method137((byte) -125);
                                } else if (super.field446 == 1536) {
                                    var7.method137((byte) -125);
                                    var7.method137((byte) -125);
                                    var7.method137((byte) -125);
                                }
                                var7.method139(this.field469 - this.field473, false, super.field400 - this.field474, super.field399 - this.field472);
                            }
                        }
                        var2.field573 = true;
                        return var2;
                    }
                } else {
                    throw new NullPointerException();
                }
            }
        }
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(Z)Leb;")
    private final Model method117(boolean arg0) {
        if (this.field482 != null) {
            int var2 = -1;
            if (super.field427 >= 0 && super.field430 == 0) {
                var2 = SeqType.field1149[super.field427].field1151[super.field428];
            } else if (super.field424 >= 0) {
                var2 = SeqType.field1149[super.field424].field1151[super.field425];
            }
            return this.field482.method343(-1, (int[]) null, var2, false);
        } else {
            long var4 = this.field468;
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (arg0) {
                for (int var10 = 1; var10 > 0; ++var10) {
                }
            }
            if (super.field427 >= 0 && super.field430 == 0) {
                SeqType var11 = SeqType.field1149[super.field427];
                var6 = var11.field1151[super.field428];
                if (super.field424 >= 0 && super.field424 != super.field404) {
                    var7 = SeqType.field1149[super.field424].field1151[super.field425];
                }
                if (var11.field1158 >= 0) {
                    var8 = var11.field1158;
                    var4 += (long) (var8 - this.field464[5] << 8);
                }
                if (var11.field1159 >= 0) {
                    var9 = var11.field1159;
                    var4 += (long) (var9 - this.field464[3] << 16);
                }
            } else if (super.field424 >= 0) {
                var6 = SeqType.field1149[super.field424].field1151[super.field425];
            }
            Model var12 = (Model) field484.method101(var4);
            if (var12 == null) {
                boolean var13 = false;
                for (int var14 = 0; var14 < 12; ++var14) {
                    int var15 = this.field464[var14];
                    if (var9 >= 0 && var14 == 3) {
                        var15 = var9;
                    }
                    if (var8 >= 0 && var14 == 5) {
                        var15 = var8;
                    }
                    if (var15 >= 256 && var15 < 512 && !IdkType.field1129[var15 - 256].method377((byte) -41)) {
                        var13 = true;
                    }
                    if (var15 >= 512 && !ObjType.method348(var15 - 512).method355(this.field462, (byte) -59)) {
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
                    if (var9 >= 0 && var18 == 3) {
                        var20 = var9;
                    }
                    if (var8 >= 0 && var18 == 5) {
                        var20 = var8;
                    }
                    if (var20 >= 256 && var20 < 512) {
                        Model var21 = IdkType.field1129[var20 - 256].method378(-514);
                        if (var21 != null) {
                            var16[var17++] = var21;
                        }
                    }
                    if (var20 >= 512) {
                        Model var22 = ObjType.method348(var20 - 512).method356(false, this.field462);
                        if (var22 != null) {
                            var16[var17++] = var22;
                        }
                    }
                }
                var12 = new Model(var17, -314, var16);
                for (int var19 = 0; var19 < 5; ++var19) {
                    if (this.field465[var19] != 0) {
                        var12.method140(client.field1341[var19][0], client.field1341[var19][this.field465[var19]]);
                        if (var19 == 1) {
                            var12.method140(client.field1426[0], client.field1426[this.field465[var19]]);
                        }
                    }
                }
                var12.method133(true);
                var12.method143(64, 850, -30, -50, -30, true);
                field484.method102(var4, var12, 10514);
                this.field481 = var4;
            }
            if (this.field480) {
                return var12;
            } else {
                Model var23 = Model.field535;
                var23.method128(var12, false, AnimFrame.method48(var6, 45733) & AnimFrame.method48(var7, 45733));
                if (var6 != -1 && var7 != -1) {
                    var23.method135(-13288, var7, var6, SeqType.field1149[super.field427].field1155);
                } else if (var6 != -1) {
                    var23.method134(true, var6);
                }
                var23.method130(-246);
                var23.field572 = null;
                var23.field571 = null;
                return var23;
            }
        }
    }

    @OriginalMember(owner = "ab", name = "c", descriptor = "(I)Leb;")
    public final Model method118(int arg0) {
        if (!this.field461) {
            return null;
        } else if (this.field482 != null) {
            return this.field482.method344(-205);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var12 = this.field464[var3];
                if (var12 >= 256 && var12 < 512 && !IdkType.field1129[var12 - 256].method379(875)) {
                    var2 = true;
                }
                if (var12 >= 512 && !ObjType.method348(var12 - 512).method357((byte) -50, this.field462)) {
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
                        Model var10 = IdkType.field1129[var9 - 256].method380(9);
                        if (var10 != null) {
                            var4[var5++] = var10;
                        }
                    }
                    if (var9 >= 512) {
                        Model var11 = ObjType.method348(var9 - 512).method358(this.field462, false);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                }
                Model var7 = new Model(var5, -314, var4);
                for (int var8 = 0; var8 < 5; ++var8) {
                    if (this.field465[var8] != 0) {
                        var7.method140(client.field1341[var8][0], client.field1341[var8][this.field465[var8]]);
                        if (var8 == 1) {
                            var7.method140(client.field1426[0], client.field1426[this.field465[var8]]);
                        }
                    }
                }
                if (arg0 != 0) {
                    this.field458 = !this.field458;
                }
                return var7;
            }
        }
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(B)Z")
    public final boolean method113(byte arg0) {
        if (this.field459 != arg0) {
            this.field458 = !this.field458;
        }
        return this.field461;
    }
}
