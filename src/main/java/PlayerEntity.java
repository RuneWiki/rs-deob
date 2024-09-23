import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ab")
public class PlayerEntity extends PathingEntity {

    @OriginalMember(owner = "ab", name = "pb", descriptor = "I")
    private int field459 = -843;

    @OriginalMember(owner = "ab", name = "rb", descriptor = "Z")
    private boolean field461 = true;

    @OriginalMember(owner = "ab", name = "sb", descriptor = "I")
    private int field462 = -50;

    @OriginalMember(owner = "ab", name = "ub", descriptor = "Z")
    public boolean field464 = false;

    @OriginalMember(owner = "ab", name = "xb", descriptor = "[I")
    public int[] field467 = new int[12];

    @OriginalMember(owner = "ab", name = "yb", descriptor = "[I")
    public int[] field468 = new int[5];

    @OriginalMember(owner = "ab", name = "Nb", descriptor = "Z")
    public boolean field483 = false;

    @OriginalMember(owner = "ab", name = "Ob", descriptor = "J")
    public long field484 = -1L;

    @OriginalMember(owner = "ab", name = "Rb", descriptor = "Ls;")
    public static LruCache field487 = new LruCache(260, false);

    @OriginalMember(owner = "ab", name = "qb", descriptor = "I")
    private int field460;

    @OriginalMember(owner = "ab", name = "vb", descriptor = "I")
    public int field465;

    @OriginalMember(owner = "ab", name = "wb", descriptor = "I")
    public int field466;

    @OriginalMember(owner = "ab", name = "zb", descriptor = "I")
    public int field469;

    @OriginalMember(owner = "ab", name = "Ab", descriptor = "I")
    public int field470;

    @OriginalMember(owner = "ab", name = "Cb", descriptor = "I")
    public int field472;

    @OriginalMember(owner = "ab", name = "Db", descriptor = "I")
    public int field473;

    @OriginalMember(owner = "ab", name = "Eb", descriptor = "I")
    public int field474;

    @OriginalMember(owner = "ab", name = "Fb", descriptor = "I")
    public int field475;

    @OriginalMember(owner = "ab", name = "Gb", descriptor = "I")
    public int field476;

    @OriginalMember(owner = "ab", name = "Hb", descriptor = "I")
    public int field477;

    @OriginalMember(owner = "ab", name = "Jb", descriptor = "I")
    public int field479;

    @OriginalMember(owner = "ab", name = "Kb", descriptor = "I")
    public int field480;

    @OriginalMember(owner = "ab", name = "Lb", descriptor = "I")
    public int field481;

    @OriginalMember(owner = "ab", name = "Mb", descriptor = "I")
    public int field482;

    @OriginalMember(owner = "ab", name = "Qb", descriptor = "I")
    public int field486;

    @OriginalMember(owner = "ab", name = "Bb", descriptor = "J")
    public long field471;

    @OriginalMember(owner = "ab", name = "Ib", descriptor = "Leb;")
    public Model field478;

    @OriginalMember(owner = "ab", name = "Pb", descriptor = "Lgc;")
    public NpcType field485;

    @OriginalMember(owner = "ab", name = "tb", descriptor = "Ljava/lang/String;")
    public String field463;

    @OriginalMember(owner = "ab", name = "a", descriptor = "(ILlb;)V")
    public final void method116(int arg0, Packet arg1) {
        arg1.field716 = 0;
        this.field465 = arg1.method229();
        this.field466 = arg1.method229();
        this.field485 = null;
        this.field486 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg1.method229();
            if (var4 == 0) {
                this.field467[var3] = 0;
            } else {
                int var5 = arg1.method229();
                this.field467[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field467[0] == 65535) {
                    this.field485 = NpcType.method341(arg1.method231());
                    break;
                }
                if (this.field467[var3] >= 512 && this.field467[var3] - 512 < ObjType.field1051) {
                    int var10 = ObjType.method348(this.field467[var3] - 512).field1096;
                    if (var10 != 0) {
                        this.field486 = var10;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var9 = arg1.method229();
            if (var9 < 0 || var9 >= client.field1452[var6].length) {
                var9 = 0;
            }
            this.field468[var6] = var9;
        }
        super.field406 = arg1.method231();
        if (super.field406 == 65535) {
            super.field406 = -1;
        }
        super.field407 = arg1.method231();
        if (arg0 < 0) {
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
            super.field411 = arg1.method231();
            if (super.field411 == 65535) {
                super.field411 = -1;
            }
            super.field412 = arg1.method231();
            if (super.field412 == 65535) {
                super.field412 = -1;
            }
            this.field463 = JString.method304(-257, JString.method301(arg1.method235((byte) 9), 0));
            this.field469 = arg1.method229();
            this.field470 = arg1.method231();
            this.field464 = true;
            this.field471 = 0L;
            for (int var7 = 0; var7 < 12; ++var7) {
                this.field471 <<= 4;
                if (this.field467[var7] >= 256) {
                    this.field471 += (long) (this.field467[var7] - 256);
                }
            }
            if (this.field467[0] >= 256) {
                this.field471 += (long) (this.field467[0] - 256 >> 4);
            }
            if (this.field467[1] >= 256) {
                this.field471 += (long) (this.field467[1] - 256 >> 8);
            }
            for (int var8 = 0; var8 < 5; ++var8) {
                this.field471 <<= 3;
                this.field471 += (long) this.field468[var8];
            }
            this.field471 <<= 1;
            this.field471 += (long) this.field465;
        }
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(B)Leb;")
    public final Model method109(byte arg0) {
        if (!this.field464) {
            return null;
        } else {
            Model var2 = this.method117((byte) -48);
            if (var2 == null) {
                return null;
            } else {
                super.field447 = var2.field398;
                var2.field580 = true;
                if (this.field483) {
                    return var2;
                } else {
                    if (super.field434 != -1 && super.field435 != -1) {
                        SpotAnimType var3 = SpotAnimType.field1177[super.field434];
                        Model var4 = var3.method386();
                        if (var4 != null) {
                            Model var5 = new Model(AnimFrame.method48(super.field435, 0), false, 0, true, var4);
                            var5.method139(0, -super.field438, 0, (byte) -5);
                            var5.method133(this.field460);
                            var5.method134(-37879, var3.field1181.field1157[super.field435]);
                            var5.field579 = null;
                            var5.field578 = null;
                            if (var3.field1184 != 128 || var3.field1185 != 128) {
                                var5.method142(var3.field1185, var3.field1184, false, var3.field1184);
                            }
                            var5.method143(var3.field1187 + 64, var3.field1188 + 850, -30, -50, -30, true);
                            Model[] var6 = new Model[] { var2, var5 };
                            var2 = new Model(2, (byte) 6, var6, true);
                        }
                    }
                    if (this.field478 != null) {
                        if (client.field1403 >= this.field474) {
                            this.field478 = null;
                        }
                        if (client.field1403 >= this.field473 && client.field1403 < this.field474) {
                            Model var7 = this.field478;
                            var7.method139(this.field475 - super.field401, this.field476 - this.field472, this.field477 - super.field402, (byte) -5);
                            if (super.field448 == 512) {
                                var7.method137(true);
                                var7.method137(true);
                                var7.method137(true);
                            } else if (super.field448 == 1024) {
                                var7.method137(true);
                                var7.method137(true);
                            } else if (super.field448 == 1536) {
                                var7.method137(true);
                            }
                            Model[] var8 = new Model[] { var2, var7 };
                            var2 = new Model(2, (byte) 6, var8, true);
                            if (super.field448 == 512) {
                                var7.method137(true);
                            } else if (super.field448 == 1024) {
                                var7.method137(true);
                                var7.method137(true);
                            } else if (super.field448 == 1536) {
                                var7.method137(true);
                                var7.method137(true);
                                var7.method137(true);
                            }
                            var7.method139(super.field401 - this.field475, this.field472 - this.field476, super.field402 - this.field477, (byte) -5);
                        }
                    }
                    var2.field580 = true;
                    if (arg0 != -59) {
                        this.field462 = 146;
                    }
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "ab", name = "c", descriptor = "(B)Leb;")
    private final Model method117(byte arg0) {
        if (this.field485 != null) {
            int var2 = -1;
            if (super.field429 >= 0 && super.field432 == 0) {
                var2 = SeqType.field1155[super.field429].field1157[super.field430];
            } else if (super.field426 >= 0) {
                var2 = SeqType.field1155[super.field426].field1157[super.field427];
            }
            return this.field485.method343(-1, true, (int[]) null, var2);
        } else {
            long var4 = this.field471;
            if (arg0 != -48) {
                throw new NullPointerException();
            } else {
                int var6 = -1;
                int var7 = -1;
                int var8 = -1;
                int var9 = -1;
                if (super.field429 >= 0 && super.field432 == 0) {
                    SeqType var10 = SeqType.field1155[super.field429];
                    var6 = var10.field1157[super.field430];
                    if (super.field426 >= 0 && super.field426 != super.field406) {
                        var7 = SeqType.field1155[super.field426].field1157[super.field427];
                    }
                    if (var10.field1164 >= 0) {
                        var8 = var10.field1164;
                        var4 += (long) (var8 - this.field467[5] << 8);
                    }
                    if (var10.field1165 >= 0) {
                        var9 = var10.field1165;
                        var4 += (long) (var9 - this.field467[3] << 16);
                    }
                } else if (super.field426 >= 0) {
                    var6 = SeqType.field1155[super.field426].field1157[super.field427];
                }
                Model var11 = (Model) field487.method101(var4);
                if (var11 == null) {
                    boolean var12 = false;
                    for (int var13 = 0; var13 < 12; ++var13) {
                        int var14 = this.field467[var13];
                        if (var9 >= 0 && var13 == 3) {
                            var14 = var9;
                        }
                        if (var8 >= 0 && var13 == 5) {
                            var14 = var8;
                        }
                        if (var14 >= 256 && var14 < 512 && !IdkType.field1134[var14 - 256].method377(0)) {
                            var12 = true;
                        }
                        if (var14 >= 512 && !ObjType.method348(var14 - 512).method355((byte) 6, this.field465)) {
                            var12 = true;
                        }
                    }
                    if (var12) {
                        if (this.field484 != -1L) {
                            var11 = (Model) field487.method101(this.field484);
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
                        int var19 = this.field467[var17];
                        if (var9 >= 0 && var17 == 3) {
                            var19 = var9;
                        }
                        if (var8 >= 0 && var17 == 5) {
                            var19 = var8;
                        }
                        if (var19 >= 256 && var19 < 512) {
                            Model var20 = IdkType.field1134[var19 - 256].method378((byte) 5);
                            if (var20 != null) {
                                var15[var16++] = var20;
                            }
                        }
                        if (var19 >= 512) {
                            Model var21 = ObjType.method348(var19 - 512).method356(false, this.field465);
                            if (var21 != null) {
                                var15[var16++] = var21;
                            }
                        }
                    }
                    var11 = new Model(var16, var15, (byte) 1);
                    for (int var18 = 0; var18 < 5; ++var18) {
                        if (this.field468[var18] != 0) {
                            var11.method140(client.field1452[var18][0], client.field1452[var18][this.field468[var18]]);
                            if (var18 == 1) {
                                var11.method140(client.field1622[0], client.field1622[this.field468[var18]]);
                            }
                        }
                    }
                    var11.method133(this.field460);
                    var11.method143(64, 850, -30, -50, -30, true);
                    field487.method102(var11, var4, this.field461);
                    this.field484 = var4;
                }
                if (this.field483) {
                    return var11;
                } else {
                    Model var22 = Model.field542;
                    var22.method128(this.field459, AnimFrame.method48(var6, 0) & AnimFrame.method48(var7, 0), var11);
                    if (var6 != -1 && var7 != -1) {
                        var22.method135(var7, true, SeqType.field1155[super.field429].field1161, var6);
                    } else if (var6 != -1) {
                        var22.method134(-37879, var6);
                    }
                    var22.method130(0);
                    var22.field579 = null;
                    var22.field578 = null;
                    return var22;
                }
            }
        }
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(Z)Leb;")
    public final Model method118(boolean arg0) {
        if (!this.field464) {
            return null;
        } else if (this.field485 != null) {
            return this.field485.method344((byte) -72);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var13 = this.field467[var3];
                if (var13 >= 256 && var13 < 512 && !IdkType.field1134[var13 - 256].method379(350)) {
                    var2 = true;
                }
                if (var13 >= 512 && !ObjType.method348(var13 - 512).method357(this.field465, false)) {
                    var2 = true;
                }
            }
            if (arg0) {
                for (int var4 = 1; var4 > 0; ++var4) {
                }
            }
            if (var2) {
                return null;
            } else {
                Model[] var5 = new Model[12];
                int var6 = 0;
                for (int var7 = 0; var7 < 12; ++var7) {
                    int var10 = this.field467[var7];
                    if (var10 >= 256 && var10 < 512) {
                        Model var11 = IdkType.field1134[var10 - 256].method380(4);
                        if (var11 != null) {
                            var5[var6++] = var11;
                        }
                    }
                    if (var10 >= 512) {
                        Model var12 = ObjType.method348(var10 - 512).method358((byte) 94, this.field465);
                        if (var12 != null) {
                            var5[var6++] = var12;
                        }
                    }
                }
                Model var8 = new Model(var6, var5, (byte) 1);
                for (int var9 = 0; var9 < 5; ++var9) {
                    if (this.field468[var9] != 0) {
                        var8.method140(client.field1452[var9][0], client.field1452[var9][this.field468[var9]]);
                        if (var9 == 1) {
                            var8.method140(client.field1622[0], client.field1622[this.field468[var9]]);
                        }
                    }
                }
                return var8;
            }
        }
    }

    @OriginalMember(owner = "ab", name = "b", descriptor = "(B)Z")
    public final boolean method113(byte arg0) {
        if (arg0 != -120) {
            throw new NullPointerException();
        } else {
            return this.field464;
        }
    }
}
