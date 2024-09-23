import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ab")
public class PlayerEntity extends PathingEntity {

    @OriginalMember(owner = "ab", name = "qb", descriptor = "Z")
    private boolean field451 = false;

    @OriginalMember(owner = "ab", name = "rb", descriptor = "I")
    private int field452 = 77;

    @OriginalMember(owner = "ab", name = "sb", descriptor = "B")
    private byte field453 = 1;

    @OriginalMember(owner = "ab", name = "tb", descriptor = "Z")
    private boolean field454 = false;

    @OriginalMember(owner = "ab", name = "ub", descriptor = "B")
    private byte field455 = 121;

    @OriginalMember(owner = "ab", name = "wb", descriptor = "Z")
    public boolean field457 = false;

    @OriginalMember(owner = "ab", name = "zb", descriptor = "[I")
    public int[] field460 = new int[12];

    @OriginalMember(owner = "ab", name = "Ab", descriptor = "[I")
    public int[] field461 = new int[5];

    @OriginalMember(owner = "ab", name = "Pb", descriptor = "Z")
    public boolean field476 = false;

    @OriginalMember(owner = "ab", name = "Qb", descriptor = "J")
    public long field477 = -1L;

    @OriginalMember(owner = "ab", name = "Tb", descriptor = "Ls;")
    public static LruCache field480 = new LruCache(260, (byte) 1);

    @OriginalMember(owner = "ab", name = "xb", descriptor = "I")
    public int field458;

    @OriginalMember(owner = "ab", name = "yb", descriptor = "I")
    public int field459;

    @OriginalMember(owner = "ab", name = "Bb", descriptor = "I")
    public int field462;

    @OriginalMember(owner = "ab", name = "Cb", descriptor = "I")
    public int field463;

    @OriginalMember(owner = "ab", name = "Eb", descriptor = "I")
    public int field465;

    @OriginalMember(owner = "ab", name = "Fb", descriptor = "I")
    public int field466;

    @OriginalMember(owner = "ab", name = "Gb", descriptor = "I")
    public int field467;

    @OriginalMember(owner = "ab", name = "Hb", descriptor = "I")
    public int field468;

    @OriginalMember(owner = "ab", name = "Ib", descriptor = "I")
    public int field469;

    @OriginalMember(owner = "ab", name = "Jb", descriptor = "I")
    public int field470;

    @OriginalMember(owner = "ab", name = "Lb", descriptor = "I")
    public int field472;

    @OriginalMember(owner = "ab", name = "Mb", descriptor = "I")
    public int field473;

    @OriginalMember(owner = "ab", name = "Nb", descriptor = "I")
    public int field474;

    @OriginalMember(owner = "ab", name = "Ob", descriptor = "I")
    public int field475;

    @OriginalMember(owner = "ab", name = "Sb", descriptor = "I")
    public int field479;

    @OriginalMember(owner = "ab", name = "Db", descriptor = "J")
    public long field464;

    @OriginalMember(owner = "ab", name = "Kb", descriptor = "Leb;")
    public Model field471;

    @OriginalMember(owner = "ab", name = "Rb", descriptor = "Lgc;")
    public NpcType field478;

    @OriginalMember(owner = "ab", name = "vb", descriptor = "Ljava/lang/String;")
    public String field456;

    @OriginalMember(owner = "ab", name = "a", descriptor = "(ILlb;)V")
    public final void method116(int arg0, Packet arg1) {
        arg1.field713 = 0;
        this.field458 = arg1.method229();
        this.field459 = arg1.method229();
        this.field478 = null;
        this.field479 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg1.method229();
            if (var4 == 0) {
                this.field460[var3] = 0;
            } else {
                int var5 = arg1.method229();
                this.field460[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field460[0] == 65535) {
                    this.field478 = NpcType.method341(arg1.method231());
                    break;
                }
                if (this.field460[var3] >= 512 && this.field460[var3] - 512 < ObjType.field1044) {
                    int var10 = ObjType.method348(this.field460[var3] - 512).field1089;
                    if (var10 != 0) {
                        this.field479 = var10;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var9 = arg1.method229();
            if (var9 < 0 || var9 >= client.field1223[var6].length) {
                var9 = 0;
            }
            this.field461[var6] = var9;
        }
        super.field399 = arg1.method231();
        if (super.field399 == 65535) {
            super.field399 = -1;
        }
        super.field400 = arg1.method231();
        if (super.field400 == 65535) {
            super.field400 = -1;
        }
        super.field401 = arg1.method231();
        if (super.field401 == 65535) {
            super.field401 = -1;
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
        this.field456 = JString.method304((byte) 78, JString.method301(arg1.method235((byte) 5), (byte) -48));
        this.field462 = arg1.method229();
        this.field463 = arg1.method231();
        this.field457 = true;
        this.field464 = 0L;
        for (int var7 = 0; var7 < 12; ++var7) {
            this.field464 <<= 4;
            if (this.field460[var7] >= 256) {
                this.field464 += (long) (this.field460[var7] - 256);
            }
        }
        if (this.field460[0] >= 256) {
            this.field464 += (long) (this.field460[0] - 256 >> 4);
        }
        if (this.field460[1] >= 256) {
            this.field464 += (long) (this.field460[1] - 256 >> 8);
        }
        for (int var8 = 0; var8 < 5; ++var8) {
            this.field464 <<= 3;
            this.field464 += (long) this.field461[var8];
        }
        if (arg0 == 0) {
            this.field464 <<= 1;
            this.field464 += (long) this.field458;
        }
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(Z)Leb;")
    public final Model method109(boolean arg0) {
        if (!this.field457) {
            return null;
        } else {
            Model var2 = this.method117(-314);
            if (var2 == null) {
                return null;
            } else {
                super.field440 = var2.field390;
                var2.field570 = true;
                if (this.field476) {
                    return var2;
                } else {
                    if (super.field427 != -1 && super.field428 != -1) {
                        SpotAnimType var3 = SpotAnimType.field1165[super.field427];
                        Model var4 = var3.method386();
                        if (var4 != null) {
                            Model var5 = new Model(false, 201, var4, AnimFrame.method48(577, super.field428), true);
                            var5.method139(-9236, 0, -super.field431, 0);
                            var5.method133(5);
                            var5.method134(0, var3.field1169.field1145[super.field428]);
                            var5.field569 = null;
                            var5.field568 = null;
                            if (var3.field1172 != 128 || var3.field1173 != 128) {
                                var5.method142(var3.field1172, var3.field1173, var3.field1172, (byte) -119);
                            }
                            var5.method143(var3.field1175 + 64, var3.field1176 + 850, -30, -50, -30, true);
                            Model[] var6 = new Model[] { var2, var5 };
                            var2 = new Model((byte) 60, var6, true, 2);
                        }
                    }
                    if (this.field471 != null) {
                        if (client.field1314 >= this.field467) {
                            this.field471 = null;
                        }
                        if (client.field1314 >= this.field466 && client.field1314 < this.field467) {
                            Model var7 = this.field471;
                            var7.method139(-9236, this.field470 - super.field395, this.field469 - this.field465, this.field468 - super.field394);
                            if (super.field441 == 512) {
                                var7.method137((byte) -57);
                                var7.method137((byte) -57);
                                var7.method137((byte) -57);
                            } else if (super.field441 == 1024) {
                                var7.method137((byte) -57);
                                var7.method137((byte) -57);
                            } else if (super.field441 == 1536) {
                                var7.method137((byte) -57);
                            }
                            Model[] var8 = new Model[] { var2, var7 };
                            var2 = new Model((byte) 60, var8, true, 2);
                            if (super.field441 == 512) {
                                var7.method137((byte) -57);
                            } else if (super.field441 == 1024) {
                                var7.method137((byte) -57);
                                var7.method137((byte) -57);
                            } else if (super.field441 == 1536) {
                                var7.method137((byte) -57);
                                var7.method137((byte) -57);
                                var7.method137((byte) -57);
                            }
                            var7.method139(-9236, super.field395 - this.field470, this.field465 - this.field469, super.field394 - this.field468);
                        }
                    }
                    var2.field570 = true;
                    if (!arg0) {
                        throw new NullPointerException();
                    } else {
                        return var2;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "ab", name = "c", descriptor = "(I)Leb;")
    private final Model method117(int arg0) {
        if (this.field478 != null) {
            int var2 = -1;
            if (super.field422 >= 0 && super.field425 == 0) {
                var2 = SeqType.field1143[super.field422].field1145[super.field423];
            } else if (super.field419 >= 0) {
                var2 = SeqType.field1143[super.field419].field1145[super.field420];
            }
            return this.field478.method343(-1, var2, (int[]) null, 0);
        } else {
            long var4 = this.field464;
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (arg0 >= 0) {
                throw new NullPointerException();
            } else {
                if (super.field422 >= 0 && super.field425 == 0) {
                    SeqType var10 = SeqType.field1143[super.field422];
                    var6 = var10.field1145[super.field423];
                    if (super.field419 >= 0 && super.field419 != super.field399) {
                        var7 = SeqType.field1143[super.field419].field1145[super.field420];
                    }
                    if (var10.field1152 >= 0) {
                        var8 = var10.field1152;
                        var4 += (long) (var8 - this.field460[5] << 8);
                    }
                    if (var10.field1153 >= 0) {
                        var9 = var10.field1153;
                        var4 += (long) (var9 - this.field460[3] << 16);
                    }
                } else if (super.field419 >= 0) {
                    var6 = SeqType.field1143[super.field419].field1145[super.field420];
                }
                Model var11 = (Model) field480.method101(var4);
                if (var11 == null) {
                    boolean var12 = false;
                    for (int var13 = 0; var13 < 12; ++var13) {
                        int var14 = this.field460[var13];
                        if (var9 >= 0 && var13 == 3) {
                            var14 = var9;
                        }
                        if (var8 >= 0 && var13 == 5) {
                            var14 = var8;
                        }
                        if (var14 >= 256 && var14 < 512 && !IdkType.field1123[var14 - 256].method377(this.field452)) {
                            var12 = true;
                        }
                        if (var14 >= 512 && !ObjType.method348(var14 - 512).method355(this.field458, this.field454)) {
                            var12 = true;
                        }
                    }
                    if (var12) {
                        if (this.field477 != -1L) {
                            var11 = (Model) field480.method101(this.field477);
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
                        int var19 = this.field460[var17];
                        if (var9 >= 0 && var17 == 3) {
                            var19 = var9;
                        }
                        if (var8 >= 0 && var17 == 5) {
                            var19 = var8;
                        }
                        if (var19 >= 256 && var19 < 512) {
                            Model var20 = IdkType.field1123[var19 - 256].method378(this.field453);
                            if (var20 != null) {
                                var15[var16++] = var20;
                            }
                        }
                        if (var19 >= 512) {
                            Model var21 = ObjType.method348(var19 - 512).method356(this.field458, (byte) 7);
                            if (var21 != null) {
                                var15[var16++] = var21;
                            }
                        }
                    }
                    var11 = new Model(var15, var16, false);
                    for (int var18 = 0; var18 < 5; ++var18) {
                        if (this.field461[var18] != 0) {
                            var11.method140(client.field1223[var18][0], client.field1223[var18][this.field461[var18]]);
                            if (var18 == 1) {
                                var11.method140(client.field1509[0], client.field1509[this.field461[var18]]);
                            }
                        }
                    }
                    var11.method133(5);
                    var11.method143(64, 850, -30, -50, -30, true);
                    field480.method102(var11, 0, var4);
                    this.field477 = var4;
                }
                if (this.field476) {
                    return var11;
                } else {
                    Model var22 = Model.field532;
                    var22.method128((byte) 9, var11, AnimFrame.method48(577, var6) & AnimFrame.method48(577, var7));
                    if (var6 != -1 && var7 != -1) {
                        var22.method135(SeqType.field1143[super.field422].field1149, var7, var6, this.field451);
                    } else if (var6 != -1) {
                        var22.method134(0, var6);
                    }
                    var22.method130(-29805);
                    var22.field569 = null;
                    var22.field568 = null;
                    return var22;
                }
            }
        }
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(B)Leb;")
    public final Model method118(byte arg0) {
        if (!this.field457) {
            return null;
        } else if (this.field478 != null) {
            return this.field478.method344(8);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var12 = this.field460[var3];
                if (var12 >= 256 && var12 < 512 && !IdkType.field1123[var12 - 256].method379(3)) {
                    var2 = true;
                }
                if (var12 >= 512 && !ObjType.method348(var12 - 512).method357(this.field458, false)) {
                    var2 = true;
                }
            }
            if (arg0 != -92) {
                throw new NullPointerException();
            } else if (var2) {
                return null;
            } else {
                Model[] var4 = new Model[12];
                int var5 = 0;
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var9 = this.field460[var6];
                    if (var9 >= 256 && var9 < 512) {
                        Model var10 = IdkType.field1123[var9 - 256].method380(9);
                        if (var10 != null) {
                            var4[var5++] = var10;
                        }
                    }
                    if (var9 >= 512) {
                        Model var11 = ObjType.method348(var9 - 512).method358(this.field455, this.field458);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                }
                Model var7 = new Model(var4, var5, false);
                for (int var8 = 0; var8 < 5; ++var8) {
                    if (this.field461[var8] != 0) {
                        var7.method140(client.field1223[var8][0], client.field1223[var8][this.field461[var8]]);
                        if (var8 == 1) {
                            var7.method140(client.field1509[0], client.field1509[this.field461[var8]]);
                        }
                    }
                }
                return var7;
            }
        }
    }

    @OriginalMember(owner = "ab", name = "b", descriptor = "(I)Z")
    public final boolean method113(int arg0) {
        if (arg0 != 8) {
            throw new NullPointerException();
        } else {
            return this.field457;
        }
    }
}
