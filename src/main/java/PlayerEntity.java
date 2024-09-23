import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ab")
public class PlayerEntity extends PathingEntity {

    @OriginalMember(owner = "ab", name = "ub", descriptor = "I")
    private int field465 = 3;

    @OriginalMember(owner = "ab", name = "vb", descriptor = "Z")
    private boolean field466 = true;

    @OriginalMember(owner = "ab", name = "wb", descriptor = "B")
    private byte field467 = -41;

    @OriginalMember(owner = "ab", name = "xb", descriptor = "I")
    private int field468 = -47208;

    @OriginalMember(owner = "ab", name = "yb", descriptor = "Z")
    private boolean field469 = true;

    @OriginalMember(owner = "ab", name = "zb", descriptor = "Z")
    private boolean field470 = false;

    @OriginalMember(owner = "ab", name = "Bb", descriptor = "Z")
    public boolean field472 = false;

    @OriginalMember(owner = "ab", name = "Eb", descriptor = "[I")
    public int[] field475 = new int[12];

    @OriginalMember(owner = "ab", name = "Fb", descriptor = "[I")
    public int[] field476 = new int[5];

    @OriginalMember(owner = "ab", name = "Ub", descriptor = "Z")
    public boolean field491 = false;

    @OriginalMember(owner = "ab", name = "Vb", descriptor = "J")
    public long field492 = -1L;

    @OriginalMember(owner = "ab", name = "Yb", descriptor = "Ls;")
    public static LruCache field495 = new LruCache(false, 260);

    @OriginalMember(owner = "ab", name = "Cb", descriptor = "I")
    public int field473;

    @OriginalMember(owner = "ab", name = "Db", descriptor = "I")
    public int field474;

    @OriginalMember(owner = "ab", name = "Gb", descriptor = "I")
    public int field477;

    @OriginalMember(owner = "ab", name = "Hb", descriptor = "I")
    public int field478;

    @OriginalMember(owner = "ab", name = "Jb", descriptor = "I")
    public int field480;

    @OriginalMember(owner = "ab", name = "Kb", descriptor = "I")
    public int field481;

    @OriginalMember(owner = "ab", name = "Lb", descriptor = "I")
    public int field482;

    @OriginalMember(owner = "ab", name = "Mb", descriptor = "I")
    public int field483;

    @OriginalMember(owner = "ab", name = "Nb", descriptor = "I")
    public int field484;

    @OriginalMember(owner = "ab", name = "Ob", descriptor = "I")
    public int field485;

    @OriginalMember(owner = "ab", name = "Qb", descriptor = "I")
    public int field487;

    @OriginalMember(owner = "ab", name = "Rb", descriptor = "I")
    public int field488;

    @OriginalMember(owner = "ab", name = "Sb", descriptor = "I")
    public int field489;

    @OriginalMember(owner = "ab", name = "Tb", descriptor = "I")
    public int field490;

    @OriginalMember(owner = "ab", name = "Xb", descriptor = "I")
    public int field494;

    @OriginalMember(owner = "ab", name = "Ib", descriptor = "J")
    public long field479;

    @OriginalMember(owner = "ab", name = "Pb", descriptor = "Leb;")
    public Model field486;

    @OriginalMember(owner = "ab", name = "Wb", descriptor = "Lgc;")
    public NpcType field493;

    @OriginalMember(owner = "ab", name = "Ab", descriptor = "Ljava/lang/String;")
    public String field471;

    @OriginalMember(owner = "ab", name = "a", descriptor = "(Llb;B)V")
    public final void method116(Packet arg0, byte arg1) {
        arg0.field722 = 0;
        this.field473 = arg0.method229();
        this.field474 = arg0.method229();
        this.field493 = null;
        this.field494 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg0.method229();
            if (var4 == 0) {
                this.field475[var3] = 0;
            } else {
                int var5 = arg0.method229();
                this.field475[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field475[0] == 65535) {
                    this.field493 = NpcType.method341(arg0.method231());
                    break;
                }
                if (this.field475[var3] >= 512 && this.field475[var3] - 512 < ObjType.field1048) {
                    int var10 = ObjType.method348(this.field475[var3] - 512).field1093;
                    if (var10 != 0) {
                        this.field494 = var10;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var9 = arg0.method229();
            if (var9 < 0 || var9 >= client.field1549[var6].length) {
                var9 = 0;
            }
            this.field476[var6] = var9;
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
        super.field414 = arg0.method231();
        if (super.field414 == 65535) {
            super.field414 = -1;
        }
        super.field415 = arg0.method231();
        if (super.field415 == 65535) {
            super.field415 = -1;
        }
        super.field416 = arg0.method231();
        if (super.field416 == 65535) {
            super.field416 = -1;
        }
        super.field417 = arg0.method231();
        if (arg1 != 50) {
            this.field469 = !this.field469;
        }
        if (super.field417 == 65535) {
            super.field417 = -1;
        }
        this.field471 = JString.method304(JString.method301(arg0.method235(false), this.field465), -4015);
        this.field477 = arg0.method229();
        this.field478 = arg0.method231();
        this.field472 = true;
        this.field479 = 0L;
        for (int var7 = 0; var7 < 12; ++var7) {
            this.field479 <<= 4;
            if (this.field475[var7] >= 256) {
                this.field479 += (long) (this.field475[var7] - 256);
            }
        }
        if (this.field475[0] >= 256) {
            this.field479 += (long) (this.field475[0] - 256 >> 4);
        }
        if (this.field475[1] >= 256) {
            this.field479 += (long) (this.field475[1] - 256 >> 8);
        }
        for (int var8 = 0; var8 < 5; ++var8) {
            this.field479 <<= 3;
            this.field479 += (long) this.field476[var8];
        }
        this.field479 <<= 1;
        this.field479 += (long) this.field473;
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(I)Leb;")
    public final Model method109(int arg0) {
        if (!this.field472) {
            return null;
        } else {
            Model var2 = this.method117(true);
            if (var2 == null) {
                return null;
            } else {
                super.field452 = var2.field399;
                var2.field586 = true;
                if (arg0 != -47094) {
                    for (int var3 = 1; var3 > 0; ++var3) {
                    }
                }
                if (this.field491) {
                    return var2;
                } else {
                    if (super.field439 != -1 && super.field440 != -1) {
                        SpotAnimType var4 = SpotAnimType.field1166[super.field439];
                        Model var5 = var4.method386();
                        if (var5 != null) {
                            Model var6 = new Model(false, -16051, var5, AnimFrame.method48(super.field440, this.field466), true);
                            var6.method139(-super.field443, 0, 0, 0);
                            var6.method133(true);
                            var6.method134(true, var4.field1170.field1147[super.field440]);
                            var6.field585 = null;
                            var6.field584 = null;
                            if (var4.field1173 != 128 || var4.field1174 != 128) {
                                var6.method142(19411, var4.field1173, var4.field1173, var4.field1174);
                            }
                            var6.method143(var4.field1176 + 64, var4.field1177 + 850, -30, -50, -30, true);
                            Model[] var7 = new Model[] { var2, var6 };
                            var2 = new Model(3, var7, true, 2);
                        }
                    }
                    if (this.field486 != null) {
                        if (client.field1311 >= this.field482) {
                            this.field486 = null;
                        }
                        if (client.field1311 >= this.field481 && client.field1311 < this.field482) {
                            Model var8 = this.field486;
                            var8.method139(this.field484 - this.field480, this.field485 - super.field407, 0, this.field483 - super.field406);
                            if (super.field453 == 512) {
                                var8.method137(34109);
                                var8.method137(34109);
                                var8.method137(34109);
                            } else if (super.field453 == 1024) {
                                var8.method137(34109);
                                var8.method137(34109);
                            } else if (super.field453 == 1536) {
                                var8.method137(34109);
                            }
                            Model[] var9 = new Model[] { var2, var8 };
                            var2 = new Model(3, var9, true, 2);
                            if (super.field453 == 512) {
                                var8.method137(34109);
                            } else if (super.field453 == 1024) {
                                var8.method137(34109);
                                var8.method137(34109);
                            } else if (super.field453 == 1536) {
                                var8.method137(34109);
                                var8.method137(34109);
                                var8.method137(34109);
                            }
                            var8.method139(this.field480 - this.field484, super.field407 - this.field485, 0, super.field406 - this.field483);
                        }
                    }
                    var2.field586 = true;
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "ab", name = "b", descriptor = "(Z)Leb;")
    private final Model method117(boolean arg0) {
        if (this.field493 != null) {
            int var2 = -1;
            if (super.field434 >= 0 && super.field437 == 0) {
                var2 = SeqType.field1145[super.field434].field1147[super.field435];
            } else if (super.field431 >= 0) {
                var2 = SeqType.field1145[super.field431].field1147[super.field432];
            }
            return this.field493.method343(var2, -1, false, (int[]) null);
        } else {
            long var4 = this.field479;
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (!arg0) {
                this.field466 = !this.field466;
            }
            if (super.field434 >= 0 && super.field437 == 0) {
                SeqType var10 = SeqType.field1145[super.field434];
                var6 = var10.field1147[super.field435];
                if (super.field431 >= 0 && super.field431 != super.field411) {
                    var7 = SeqType.field1145[super.field431].field1147[super.field432];
                }
                if (var10.field1154 >= 0) {
                    var8 = var10.field1154;
                    var4 += (long) (var8 - this.field475[5] << 8);
                }
                if (var10.field1155 >= 0) {
                    var9 = var10.field1155;
                    var4 += (long) (var9 - this.field475[3] << 16);
                }
            } else if (super.field431 >= 0) {
                var6 = SeqType.field1145[super.field431].field1147[super.field432];
            }
            Model var11 = (Model) field495.method101(var4);
            if (var11 == null) {
                boolean var12 = false;
                for (int var13 = 0; var13 < 12; ++var13) {
                    int var14 = this.field475[var13];
                    if (var9 >= 0 && var13 == 3) {
                        var14 = var9;
                    }
                    if (var8 >= 0 && var13 == 5) {
                        var14 = var8;
                    }
                    if (var14 >= 256 && var14 < 512 && !IdkType.field1127[var14 - 256].method377(0)) {
                        var12 = true;
                    }
                    if (var14 >= 512 && !ObjType.method348(var14 - 512).method355(this.field473, 4)) {
                        var12 = true;
                    }
                }
                if (var12) {
                    if (this.field492 != -1L) {
                        var11 = (Model) field495.method101(this.field492);
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
                    int var19 = this.field475[var17];
                    if (var9 >= 0 && var17 == 3) {
                        var19 = var9;
                    }
                    if (var8 >= 0 && var17 == 5) {
                        var19 = var8;
                    }
                    if (var19 >= 256 && var19 < 512) {
                        Model var20 = IdkType.field1127[var19 - 256].method378((byte) 5);
                        if (var20 != null) {
                            var15[var16++] = var20;
                        }
                    }
                    if (var19 >= 512) {
                        Model var21 = ObjType.method348(var19 - 512).method356(78, this.field473);
                        if (var21 != null) {
                            var15[var16++] = var21;
                        }
                    }
                }
                var11 = new Model(var15, this.field467, var16);
                for (int var18 = 0; var18 < 5; ++var18) {
                    if (this.field476[var18] != 0) {
                        var11.method140(client.field1549[var18][0], client.field1549[var18][this.field476[var18]]);
                        if (var18 == 1) {
                            var11.method140(client.field1547[0], client.field1547[this.field476[var18]]);
                        }
                    }
                }
                var11.method133(true);
                var11.method143(64, 850, -30, -50, -30, true);
                field495.method102(true, var4, var11);
                this.field492 = var4;
            }
            if (this.field491) {
                return var11;
            } else {
                Model var22 = Model.field548;
                var22.method128(true, var11, AnimFrame.method48(var6, this.field466) & AnimFrame.method48(var7, this.field466));
                if (var6 != -1 && var7 != -1) {
                    var22.method135(0, var6, SeqType.field1145[super.field434].field1151, var7);
                } else if (var6 != -1) {
                    var22.method134(true, var6);
                }
                var22.method130(4);
                var22.field585 = null;
                var22.field584 = null;
                return var22;
            }
        }
    }

    @OriginalMember(owner = "ab", name = "c", descriptor = "(Z)Leb;")
    public final Model method118(boolean arg0) {
        if (!this.field472) {
            return null;
        } else if (this.field493 != null) {
            return this.field493.method344(-869);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var12 = this.field475[var3];
                if (var12 >= 256 && var12 < 512 && !IdkType.field1127[var12 - 256].method379(false)) {
                    var2 = true;
                }
                if (var12 >= 512 && !ObjType.method348(var12 - 512).method357(this.field473, 0)) {
                    var2 = true;
                }
            }
            if (arg0) {
                this.field468 = 404;
            }
            if (var2) {
                return null;
            } else {
                Model[] var4 = new Model[12];
                int var5 = 0;
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var9 = this.field475[var6];
                    if (var9 >= 256 && var9 < 512) {
                        Model var10 = IdkType.field1127[var9 - 256].method380(true);
                        if (var10 != null) {
                            var4[var5++] = var10;
                        }
                    }
                    if (var9 >= 512) {
                        Model var11 = ObjType.method348(var9 - 512).method358(this.field473, (byte) 42);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                }
                Model var7 = new Model(var4, this.field467, var5);
                for (int var8 = 0; var8 < 5; ++var8) {
                    if (this.field476[var8] != 0) {
                        var7.method140(client.field1549[var8][0], client.field1549[var8][this.field476[var8]]);
                        if (var8 == 1) {
                            var7.method140(client.field1547[0], client.field1547[this.field476[var8]]);
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
            return this.field472;
        }
    }
}
