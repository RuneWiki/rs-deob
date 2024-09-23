import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ab")
public class PlayerEntity extends PathingEntity {

    @OriginalMember(owner = "ab", name = "sb", descriptor = "Z")
    private boolean field456 = false;

    @OriginalMember(owner = "ab", name = "ub", descriptor = "Z")
    public boolean field458 = false;

    @OriginalMember(owner = "ab", name = "xb", descriptor = "[I")
    public int[] field461 = new int[12];

    @OriginalMember(owner = "ab", name = "yb", descriptor = "[I")
    public int[] field462 = new int[5];

    @OriginalMember(owner = "ab", name = "Nb", descriptor = "Z")
    public boolean field477 = false;

    @OriginalMember(owner = "ab", name = "Ob", descriptor = "J")
    public long field478 = -1L;

    @OriginalMember(owner = "ab", name = "Rb", descriptor = "Ls;")
    public static LruCache field481 = new LruCache((byte) 7, 260);

    @OriginalMember(owner = "ab", name = "rb", descriptor = "I")
    private int field455;

    @OriginalMember(owner = "ab", name = "vb", descriptor = "I")
    public int field459;

    @OriginalMember(owner = "ab", name = "wb", descriptor = "I")
    public int field460;

    @OriginalMember(owner = "ab", name = "zb", descriptor = "I")
    public int field463;

    @OriginalMember(owner = "ab", name = "Ab", descriptor = "I")
    public int field464;

    @OriginalMember(owner = "ab", name = "Cb", descriptor = "I")
    public int field466;

    @OriginalMember(owner = "ab", name = "Db", descriptor = "I")
    public int field467;

    @OriginalMember(owner = "ab", name = "Eb", descriptor = "I")
    public int field468;

    @OriginalMember(owner = "ab", name = "Fb", descriptor = "I")
    public int field469;

    @OriginalMember(owner = "ab", name = "Gb", descriptor = "I")
    public int field470;

    @OriginalMember(owner = "ab", name = "Hb", descriptor = "I")
    public int field471;

    @OriginalMember(owner = "ab", name = "Jb", descriptor = "I")
    public int field473;

    @OriginalMember(owner = "ab", name = "Kb", descriptor = "I")
    public int field474;

    @OriginalMember(owner = "ab", name = "Lb", descriptor = "I")
    public int field475;

    @OriginalMember(owner = "ab", name = "Mb", descriptor = "I")
    public int field476;

    @OriginalMember(owner = "ab", name = "Qb", descriptor = "I")
    public int field480;

    @OriginalMember(owner = "ab", name = "Bb", descriptor = "J")
    public long field465;

    @OriginalMember(owner = "ab", name = "Ib", descriptor = "Leb;")
    public Model field472;

    @OriginalMember(owner = "ab", name = "Pb", descriptor = "Lgc;")
    public NpcType field479;

    @OriginalMember(owner = "ab", name = "tb", descriptor = "Ljava/lang/String;")
    public String field457;

    @OriginalMember(owner = "ab", name = "a", descriptor = "(ZLlb;)V")
    public final void method116(boolean arg0, Packet arg1) {
        if (arg0) {
            this.field456 = !this.field456;
        }
        arg1.field710 = 0;
        this.field459 = arg1.method227();
        this.field460 = arg1.method227();
        this.field479 = null;
        this.field480 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg1.method227();
            if (var4 == 0) {
                this.field461[var3] = 0;
            } else {
                int var5 = arg1.method227();
                this.field461[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field461[0] == 65535) {
                    this.field479 = NpcType.method338(arg1.method229());
                    break;
                }
                if (this.field461[var3] >= 512 && this.field461[var3] - 512 < ObjType.field1044) {
                    int var10 = ObjType.method344(this.field461[var3] - 512).field1089;
                    if (var10 != 0) {
                        this.field480 = var10;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var9 = arg1.method227();
            if (var9 < 0 || var9 >= client.field1494[var6].length) {
                var9 = 0;
            }
            this.field462[var6] = var9;
        }
        super.field401 = arg1.method229();
        if (super.field401 == 65535) {
            super.field401 = -1;
        }
        super.field402 = arg1.method229();
        if (super.field402 == 65535) {
            super.field402 = -1;
        }
        super.field403 = arg1.method229();
        if (super.field403 == 65535) {
            super.field403 = -1;
        }
        super.field404 = arg1.method229();
        if (super.field404 == 65535) {
            super.field404 = -1;
        }
        super.field405 = arg1.method229();
        if (super.field405 == 65535) {
            super.field405 = -1;
        }
        super.field406 = arg1.method229();
        if (super.field406 == 65535) {
            super.field406 = -1;
        }
        super.field407 = arg1.method229();
        if (super.field407 == 65535) {
            super.field407 = -1;
        }
        this.field457 = JString.method302(JString.method299(arg1.method233(true), true), true);
        this.field463 = arg1.method227();
        this.field464 = arg1.method229();
        this.field458 = true;
        this.field465 = 0L;
        for (int var7 = 0; var7 < 12; ++var7) {
            this.field465 <<= 4;
            if (this.field461[var7] >= 256) {
                this.field465 += (long) (this.field461[var7] - 256);
            }
        }
        if (this.field461[0] >= 256) {
            this.field465 += (long) (this.field461[0] - 256 >> 4);
        }
        if (this.field461[1] >= 256) {
            this.field465 += (long) (this.field461[1] - 256 >> 8);
        }
        for (int var8 = 0; var8 < 5; ++var8) {
            this.field465 <<= 3;
            this.field465 += (long) this.field462[var8];
        }
        this.field465 <<= 1;
        this.field465 += (long) this.field459;
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(I)Leb;")
    public final Model method109(int arg0) {
        if (!this.field458) {
            return null;
        } else {
            Model var2 = this.method117(false);
            if (arg0 != -37770) {
                throw new NullPointerException();
            } else if (var2 == null) {
                return null;
            } else {
                super.field442 = var2.field392;
                var2.field569 = true;
                if (this.field477) {
                    return var2;
                } else {
                    if (super.field429 != -1 && super.field430 != -1) {
                        SpotAnimType var3 = SpotAnimType.field1173[super.field429];
                        Model var4 = var3.method382();
                        if (var4 != null) {
                            Model var5 = new Model(var4, AnimFrame.method48(super.field430, 0), false, this.field455, true);
                            var5.method138(-super.field433, 0, (byte) 2, 0);
                            var5.method132((byte) 3);
                            var5.method133(var3.field1177.field1152[super.field430], 188);
                            var5.field568 = null;
                            var5.field567 = null;
                            if (var3.field1180 != 128 || var3.field1181 != 128) {
                                var5.method141(var3.field1180, var3.field1180, var3.field1181, (byte) 31);
                            }
                            var5.method142(var3.field1183 + 64, var3.field1184 + 850, -30, -50, -30, true);
                            Model[] var6 = new Model[] { var2, var5 };
                            var2 = new Model(true, 0, var6, 2);
                        }
                    }
                    if (this.field472 != null) {
                        if (client.field1661 >= this.field468) {
                            this.field472 = null;
                        }
                        if (client.field1661 >= this.field467 && client.field1661 < this.field468) {
                            Model var7 = this.field472;
                            var7.method138(this.field470 - this.field466, this.field469 - super.field396, (byte) 2, this.field471 - super.field397);
                            if (super.field443 == 512) {
                                var7.method136(0);
                                var7.method136(0);
                                var7.method136(0);
                            } else if (super.field443 == 1024) {
                                var7.method136(0);
                                var7.method136(0);
                            } else if (super.field443 == 1536) {
                                var7.method136(0);
                            }
                            Model[] var8 = new Model[] { var2, var7 };
                            var2 = new Model(true, 0, var8, 2);
                            if (super.field443 == 512) {
                                var7.method136(0);
                            } else if (super.field443 == 1024) {
                                var7.method136(0);
                                var7.method136(0);
                            } else if (super.field443 == 1536) {
                                var7.method136(0);
                                var7.method136(0);
                                var7.method136(0);
                            }
                            var7.method138(this.field466 - this.field470, super.field396 - this.field469, (byte) 2, super.field397 - this.field471);
                        }
                    }
                    var2.field569 = true;
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "ab", name = "c", descriptor = "(Z)Leb;")
    private final Model method117(boolean arg0) {
        if (this.field479 != null) {
            int var2 = -1;
            if (super.field424 >= 0 && super.field427 == 0) {
                var2 = SeqType.field1150[super.field424].field1152[super.field425];
            } else if (super.field421 >= 0) {
                var2 = SeqType.field1150[super.field421].field1152[super.field422];
            }
            return this.field479.method340(0, -1, var2, (int[]) null);
        } else {
            long var4 = this.field465;
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (super.field424 >= 0 && super.field427 == 0) {
                SeqType var10 = SeqType.field1150[super.field424];
                var6 = var10.field1152[super.field425];
                if (super.field421 >= 0 && super.field421 != super.field401) {
                    var7 = SeqType.field1150[super.field421].field1152[super.field422];
                }
                if (var10.field1159 >= 0) {
                    var8 = var10.field1159;
                    var4 += (long) (var8 - this.field461[5] << 8);
                }
                if (var10.field1160 >= 0) {
                    var9 = var10.field1160;
                    var4 += (long) (var9 - this.field461[3] << 16);
                }
            } else if (super.field421 >= 0) {
                var6 = SeqType.field1150[super.field421].field1152[super.field422];
            }
            Model var11 = (Model) field481.method101(var4);
            if (arg0) {
                this.field456 = !this.field456;
            }
            if (var11 == null) {
                boolean var12 = false;
                for (int var13 = 0; var13 < 12; ++var13) {
                    int var14 = this.field461[var13];
                    if (var9 >= 0 && var13 == 3) {
                        var14 = var9;
                    }
                    if (var8 >= 0 && var13 == 5) {
                        var14 = var8;
                    }
                    if (var14 >= 256 && var14 < 512 && !IdkType.field1128[var14 - 256].method373(9)) {
                        var12 = true;
                    }
                    if (var14 >= 512 && !ObjType.method344(var14 - 512).method351(false, this.field459)) {
                        var12 = true;
                    }
                }
                if (var12) {
                    if (this.field478 != -1L) {
                        var11 = (Model) field481.method101(this.field478);
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
                    int var19 = this.field461[var17];
                    if (var9 >= 0 && var17 == 3) {
                        var19 = var9;
                    }
                    if (var8 >= 0 && var17 == 5) {
                        var19 = var8;
                    }
                    if (var19 >= 256 && var19 < 512) {
                        Model var20 = IdkType.field1128[var19 - 256].method374(0);
                        if (var20 != null) {
                            var15[var16++] = var20;
                        }
                    }
                    if (var19 >= 512) {
                        Model var21 = ObjType.method344(var19 - 512).method352(this.field459, 0);
                        if (var21 != null) {
                            var15[var16++] = var21;
                        }
                    }
                }
                var11 = new Model(var15, var16, -33019);
                for (int var18 = 0; var18 < 5; ++var18) {
                    if (this.field462[var18] != 0) {
                        var11.method139(client.field1494[var18][0], client.field1494[var18][this.field462[var18]]);
                        if (var18 == 1) {
                            var11.method139(client.field1464[0], client.field1464[this.field462[var18]]);
                        }
                    }
                }
                var11.method132((byte) 3);
                var11.method142(64, 850, -30, -50, -30, true);
                field481.method102(var4, (byte) 76, var11);
                this.field478 = var4;
            }
            if (this.field477) {
                return var11;
            } else {
                Model var22 = Model.field531;
                var22.method127(AnimFrame.method48(var6, 0) & AnimFrame.method48(var7, 0), var11, 0);
                if (var6 != -1 && var7 != -1) {
                    var22.method134(var6, true, var7, SeqType.field1150[super.field424].field1156);
                } else if (var6 != -1) {
                    var22.method133(var6, 188);
                }
                var22.method129(-18258);
                var22.field568 = null;
                var22.field567 = null;
                return var22;
            }
        }
    }

    @OriginalMember(owner = "ab", name = "d", descriptor = "(Z)Leb;")
    public final Model method118(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (!this.field458) {
            return null;
        } else if (this.field479 != null) {
            return this.field479.method341((byte) 105);
        } else {
            boolean var3 = false;
            for (int var4 = 0; var4 < 12; ++var4) {
                int var13 = this.field461[var4];
                if (var13 >= 256 && var13 < 512 && !IdkType.field1128[var13 - 256].method375((byte) 0)) {
                    var3 = true;
                }
                if (var13 >= 512 && !ObjType.method344(var13 - 512).method353(true, this.field459)) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            } else {
                Model[] var5 = new Model[12];
                int var6 = 0;
                for (int var7 = 0; var7 < 12; ++var7) {
                    int var10 = this.field461[var7];
                    if (var10 >= 256 && var10 < 512) {
                        Model var11 = IdkType.field1128[var10 - 256].method376((byte) -45);
                        if (var11 != null) {
                            var5[var6++] = var11;
                        }
                    }
                    if (var10 >= 512) {
                        Model var12 = ObjType.method344(var10 - 512).method354(481, this.field459);
                        if (var12 != null) {
                            var5[var6++] = var12;
                        }
                    }
                }
                Model var8 = new Model(var5, var6, -33019);
                for (int var9 = 0; var9 < 5; ++var9) {
                    if (this.field462[var9] != 0) {
                        var8.method139(client.field1494[var9][0], client.field1494[var9][this.field462[var9]]);
                        if (var9 == 1) {
                            var8.method139(client.field1464[0], client.field1464[this.field462[var9]]);
                        }
                    }
                }
                return var8;
            }
        }
    }

    @OriginalMember(owner = "ab", name = "b", descriptor = "(Z)Z")
    public final boolean method113(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        } else {
            return this.field458;
        }
    }
}
