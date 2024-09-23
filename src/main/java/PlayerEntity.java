import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("bb")
public class PlayerEntity extends PathingEntity {

    @OriginalMember(owner = "bb", name = "mb", descriptor = "Z")
    private boolean field451 = true;

    @OriginalMember(owner = "bb", name = "nb", descriptor = "I")
    private int field452 = 487;

    @OriginalMember(owner = "bb", name = "pb", descriptor = "Z")
    public boolean field454 = false;

    @OriginalMember(owner = "bb", name = "sb", descriptor = "[I")
    public int[] field457 = new int[12];

    @OriginalMember(owner = "bb", name = "tb", descriptor = "[I")
    public int[] field458 = new int[5];

    @OriginalMember(owner = "bb", name = "Hb", descriptor = "Z")
    public boolean field472 = false;

    @OriginalMember(owner = "bb", name = "Ib", descriptor = "J")
    public long field473 = -1L;

    @OriginalMember(owner = "bb", name = "Jb", descriptor = "Lt;")
    public static LruCache field474 = new LruCache(false, 260);

    @OriginalMember(owner = "bb", name = "qb", descriptor = "I")
    public int field455;

    @OriginalMember(owner = "bb", name = "rb", descriptor = "I")
    public int field456;

    @OriginalMember(owner = "bb", name = "ub", descriptor = "I")
    public int field459;

    @OriginalMember(owner = "bb", name = "wb", descriptor = "I")
    public int field461;

    @OriginalMember(owner = "bb", name = "xb", descriptor = "I")
    public int field462;

    @OriginalMember(owner = "bb", name = "yb", descriptor = "I")
    public int field463;

    @OriginalMember(owner = "bb", name = "zb", descriptor = "I")
    public int field464;

    @OriginalMember(owner = "bb", name = "Ab", descriptor = "I")
    public int field465;

    @OriginalMember(owner = "bb", name = "Bb", descriptor = "I")
    public int field466;

    @OriginalMember(owner = "bb", name = "Db", descriptor = "I")
    public int field468;

    @OriginalMember(owner = "bb", name = "Eb", descriptor = "I")
    public int field469;

    @OriginalMember(owner = "bb", name = "Fb", descriptor = "I")
    public int field470;

    @OriginalMember(owner = "bb", name = "Gb", descriptor = "I")
    public int field471;

    @OriginalMember(owner = "bb", name = "vb", descriptor = "J")
    public long field460;

    @OriginalMember(owner = "bb", name = "Cb", descriptor = "Lfb;")
    public Model field467;

    @OriginalMember(owner = "bb", name = "ob", descriptor = "Ljava/lang/String;")
    public String field453;

    @OriginalMember(owner = "bb", name = "a", descriptor = "(ZLmb;)V")
    public final void method126(boolean arg0, Packet arg1) {
        arg1.field694 = 0;
        this.field455 = arg1.method231();
        this.field456 = arg1.method231();
        for (int var3 = 0; var3 < 12; ++var3) {
            int var9 = arg1.method231();
            if (var9 == 0) {
                this.field457[var3] = 0;
            } else {
                int var10 = arg1.method231();
                this.field457[var3] = (var9 << 8) + var10;
            }
        }
        for (int var4 = 0; var4 < 5; ++var4) {
            int var8 = arg1.method231();
            if (var8 < 0 || var8 >= client.field1182[var4].length) {
                var8 = 0;
            }
            this.field458[var4] = var8;
        }
        super.field402 = arg1.method233();
        if (super.field402 == 65535) {
            super.field402 = -1;
        }
        super.field403 = arg1.method233();
        if (super.field403 == 65535) {
            super.field403 = -1;
        }
        super.field404 = arg1.method233();
        if (super.field404 == 65535) {
            super.field404 = -1;
        }
        super.field405 = arg1.method233();
        if (super.field405 == 65535) {
            super.field405 = -1;
        }
        super.field406 = arg1.method233();
        if (super.field406 == 65535) {
            super.field406 = -1;
        }
        super.field407 = arg1.method233();
        if (super.field407 == 65535) {
            super.field407 = -1;
        }
        super.field408 = arg1.method233();
        if (super.field408 == 65535) {
            super.field408 = -1;
        }
        this.field453 = JString.method300(JString.method297(9, arg1.method237(-960)), 1);
        this.field459 = arg1.method231();
        this.field454 = true;
        this.field460 = 0L;
        for (int var5 = 0; var5 < 12; ++var5) {
            this.field460 <<= 4;
            if (this.field457[var5] >= 256) {
                this.field460 += (long) (this.field457[var5] - 256);
            }
        }
        if (arg0) {
            for (int var6 = 1; var6 > 0; ++var6) {
            }
        }
        if (this.field457[0] >= 256) {
            this.field460 += (long) (this.field457[0] - 256 >> 4);
        }
        if (this.field457[1] >= 256) {
            this.field460 += (long) (this.field457[1] - 256 >> 8);
        }
        for (int var7 = 0; var7 < 5; ++var7) {
            this.field460 <<= 3;
            this.field460 += (long) this.field458[var7];
        }
        this.field460 <<= 1;
        this.field460 += (long) this.field455;
    }

    @OriginalMember(owner = "bb", name = "a", descriptor = "(I)Lfb;")
    public final Model method121(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (!this.field454) {
            return null;
        } else {
            Model var3 = this.method127(this.field452);
            if (var3 == null) {
                return null;
            } else {
                super.field442 = var3.field394;
                var3.field558 = true;
                if (this.field472) {
                    return var3;
                } else {
                    if (super.field429 != -1 && super.field430 != -1) {
                        SpotAnimType var4 = SpotAnimType.field1084[super.field429];
                        Model var5 = var4.method373();
                        if (var5 != null) {
                            Model var6 = new Model(8, true, !var4.field1089, false, var5);
                            var6.method148(false, -super.field433, 0, 0);
                            var6.method142((byte) 9);
                            var6.method143(var4.field1088.field1071[super.field430], false);
                            var6.field557 = null;
                            var6.field556 = null;
                            if (var4.field1092 != 128 || var4.field1093 != 128) {
                                var6.method151(var4.field1092, var4.field1092, var4.field1093, -797);
                            }
                            var6.method152(var4.field1095 + 64, var4.field1096 + 850, -30, -50, -30, true);
                            Model[] var7 = new Model[] { var3, var6 };
                            var3 = new Model(true, 2, var7, -591);
                        }
                    }
                    if (this.field467 != null) {
                        if (client.field1288 >= this.field463) {
                            this.field467 = null;
                        }
                        if (client.field1288 >= this.field462 && client.field1288 < this.field463) {
                            Model var8 = this.field467;
                            var8.method148(false, this.field465 - this.field461, this.field464 - super.field397, this.field466 - super.field398);
                            if (super.field443 == 512) {
                                var8.method146(35866);
                                var8.method146(35866);
                                var8.method146(35866);
                            } else if (super.field443 == 1024) {
                                var8.method146(35866);
                                var8.method146(35866);
                            } else if (super.field443 == 1536) {
                                var8.method146(35866);
                            }
                            Model[] var9 = new Model[] { var3, var8 };
                            var3 = new Model(true, 2, var9, -591);
                            if (super.field443 == 512) {
                                var8.method146(35866);
                            } else if (super.field443 == 1024) {
                                var8.method146(35866);
                                var8.method146(35866);
                            } else if (super.field443 == 1536) {
                                var8.method146(35866);
                                var8.method146(35866);
                                var8.method146(35866);
                            }
                            var8.method148(false, this.field461 - this.field465, super.field397 - this.field464, super.field398 - this.field466);
                        }
                    }
                    var3.field558 = true;
                    return var3;
                }
            }
        }
    }

    @OriginalMember(owner = "bb", name = "c", descriptor = "(I)Lfb;")
    private final Model method127(int arg0) {
        long var2 = this.field460;
        int var4 = -1;
        int var5 = -1;
        int var6 = -1;
        int var7 = -1;
        int var8 = 63 / arg0;
        if (super.field424 >= 0 && super.field427 == 0) {
            SeqType var9 = SeqType.field1069[super.field424];
            var4 = var9.field1071[super.field425];
            if (super.field421 >= 0 && super.field421 != super.field402) {
                var5 = SeqType.field1069[super.field421].field1071[super.field422];
            }
            if (var9.field1078 >= 0) {
                var6 = var9.field1078;
                var2 += (long) (var6 - this.field457[5] << 8);
            }
            if (var9.field1079 >= 0) {
                var7 = var9.field1079;
                var2 += (long) (var7 - this.field457[3] << 16);
            }
        } else if (super.field421 >= 0) {
            var4 = SeqType.field1069[super.field421].field1071[super.field422];
        }
        Model var10 = (Model) field474.method113(var2);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; ++var12) {
                int var13 = this.field457[var12];
                if (var7 >= 0 && var12 == 3) {
                    var13 = var7;
                }
                if (var6 >= 0 && var12 == 5) {
                    var13 = var6;
                }
                if (var13 >= 256 && var13 < 512 && !IdkType.field1051[var13 - 256].method364(0)) {
                    var11 = true;
                }
                if (var13 >= 512 && !ObjType.method335(var13 - 512).method342(this.field455, 461)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field473 != -1L) {
                    var10 = (Model) field474.method113(this.field473);
                }
                if (var10 == null) {
                    return null;
                }
            }
        }
        if (var10 == null) {
            Model[] var14 = new Model[12];
            int var15 = 0;
            for (int var16 = 0; var16 < 12; ++var16) {
                int var18 = this.field457[var16];
                if (var7 >= 0 && var16 == 3) {
                    var18 = var7;
                }
                if (var6 >= 0 && var16 == 5) {
                    var18 = var6;
                }
                if (var18 >= 256 && var18 < 512) {
                    Model var19 = IdkType.field1051[var18 - 256].method365(0);
                    if (var19 != null) {
                        var14[var15++] = var19;
                    }
                }
                if (var18 >= 512) {
                    Model var20 = ObjType.method335(var18 - 512).method343(this.field455, 3);
                    if (var20 != null) {
                        var14[var15++] = var20;
                    }
                }
            }
            var10 = new Model(var15, false, var14);
            for (int var17 = 0; var17 < 5; ++var17) {
                if (this.field458[var17] != 0) {
                    var10.method149(client.field1182[var17][0], client.field1182[var17][this.field458[var17]]);
                    if (var17 == 1) {
                        var10.method149(client.field1271[0], client.field1271[this.field458[var17]]);
                    }
                }
            }
            var10.method142((byte) 9);
            var10.method152(64, 850, -30, -50, -30, true);
            field474.method114(var2, true, var10);
            this.field473 = var2;
        }
        if (this.field472) {
            return var10;
        } else {
            Model var21 = Model.field520;
            var21.method137(true, var10, -67);
            if (var4 != -1 && var5 != -1) {
                var21.method144(365, var5, var4, SeqType.field1069[super.field424].field1075);
            } else if (var4 != -1) {
                var21.method143(var4, false);
            }
            var21.method139((byte) 3);
            var21.field557 = null;
            var21.field556 = null;
            return var21;
        }
    }

    @OriginalMember(owner = "bb", name = "d", descriptor = "(I)Lfb;")
    public final Model method128(int arg0) {
        if (!this.field454) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var12 = this.field457[var3];
                if (var12 >= 256 && var12 < 512 && !IdkType.field1051[var12 - 256].method366(0)) {
                    var2 = true;
                }
                if (var12 >= 512 && !ObjType.method335(var12 - 512).method344(-39442, this.field455)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                Model[] var4 = new Model[12];
                if (arg0 <= 0) {
                    this.field452 = -133;
                }
                int var5 = 0;
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var9 = this.field457[var6];
                    if (var9 >= 256 && var9 < 512) {
                        Model var10 = IdkType.field1051[var9 - 256].method367((byte) 9);
                        if (var10 != null) {
                            var4[var5++] = var10;
                        }
                    }
                    if (var9 >= 512) {
                        Model var11 = ObjType.method335(var9 - 512).method345(this.field455, -14561);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                }
                Model var7 = new Model(var5, false, var4);
                for (int var8 = 0; var8 < 5; ++var8) {
                    if (this.field458[var8] != 0) {
                        var7.method149(client.field1182[var8][0], client.field1182[var8][this.field458[var8]]);
                        if (var8 == 1) {
                            var7.method149(client.field1271[0], client.field1271[this.field458[var8]]);
                        }
                    }
                }
                return var7;
            }
        }
    }

    @OriginalMember(owner = "bb", name = "b", descriptor = "(I)Z")
    public final boolean method124(int arg0) {
        if (arg0 != 0) {
            this.field451 = !this.field451;
        }
        return this.field454;
    }
}
