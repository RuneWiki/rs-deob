import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("z")
public class PlayerEntity extends PathingEntity {

    @OriginalMember(owner = "z", name = "hb", descriptor = "Z")
    private boolean field361 = false;

    @OriginalMember(owner = "z", name = "jb", descriptor = "I")
    private int field363 = 33182;

    @OriginalMember(owner = "z", name = "kb", descriptor = "I")
    private int field364 = 5;

    @OriginalMember(owner = "z", name = "lb", descriptor = "Z")
    private boolean field365 = true;

    @OriginalMember(owner = "z", name = "nb", descriptor = "Z")
    public boolean field367 = false;

    @OriginalMember(owner = "z", name = "qb", descriptor = "[I")
    public int[] field370 = new int[12];

    @OriginalMember(owner = "z", name = "rb", descriptor = "[I")
    public int[] field371 = new int[5];

    @OriginalMember(owner = "z", name = "Fb", descriptor = "Z")
    public boolean field385 = false;

    @OriginalMember(owner = "z", name = "Gb", descriptor = "Ls;")
    public static LruCache field386 = new LruCache(2, 200);

    @OriginalMember(owner = "z", name = "ib", descriptor = "I")
    private int field362;

    @OriginalMember(owner = "z", name = "ob", descriptor = "I")
    public int field368;

    @OriginalMember(owner = "z", name = "pb", descriptor = "I")
    public int field369;

    @OriginalMember(owner = "z", name = "sb", descriptor = "I")
    public int field372;

    @OriginalMember(owner = "z", name = "ub", descriptor = "I")
    public int field374;

    @OriginalMember(owner = "z", name = "vb", descriptor = "I")
    public int field375;

    @OriginalMember(owner = "z", name = "wb", descriptor = "I")
    public int field376;

    @OriginalMember(owner = "z", name = "xb", descriptor = "I")
    public int field377;

    @OriginalMember(owner = "z", name = "yb", descriptor = "I")
    public int field378;

    @OriginalMember(owner = "z", name = "zb", descriptor = "I")
    public int field379;

    @OriginalMember(owner = "z", name = "Bb", descriptor = "I")
    public int field381;

    @OriginalMember(owner = "z", name = "Cb", descriptor = "I")
    public int field382;

    @OriginalMember(owner = "z", name = "Db", descriptor = "I")
    public int field383;

    @OriginalMember(owner = "z", name = "Eb", descriptor = "I")
    public int field384;

    @OriginalMember(owner = "z", name = "tb", descriptor = "J")
    public long field373;

    @OriginalMember(owner = "z", name = "Ab", descriptor = "Leb;")
    public Model field380;

    @OriginalMember(owner = "z", name = "mb", descriptor = "Ljava/lang/String;")
    public String field366;

    @OriginalMember(owner = "z", name = "a", descriptor = "(ILkb;)V")
    public final void method113(int arg0, Packet arg1) {
        while (arg0 >= 0) {
            this.field364 = 221;
        }
        arg1.field623 = 0;
        this.field368 = arg1.method209();
        this.field369 = arg1.method209();
        for (int var3 = 0; var3 < 12; ++var3) {
            int var8 = arg1.method209();
            if (var8 == 0) {
                this.field370[var3] = 0;
            } else {
                int var9 = arg1.method209();
                this.field370[var3] = (var8 << 8) + var9;
            }
        }
        for (int var4 = 0; var4 < 5; ++var4) {
            int var7 = arg1.method209();
            if (var7 < 0 || var7 >= client.field1217[var4].length) {
                var7 = 0;
            }
            this.field371[var4] = var7;
        }
        super.field311 = arg1.method211();
        if (super.field311 == 65535) {
            super.field311 = -1;
        }
        super.field312 = arg1.method211();
        if (super.field312 == 65535) {
            super.field312 = -1;
        }
        super.field313 = arg1.method211();
        if (super.field313 == 65535) {
            super.field313 = -1;
        }
        super.field314 = arg1.method211();
        if (super.field314 == 65535) {
            super.field314 = -1;
        }
        super.field315 = arg1.method211();
        if (super.field315 == 65535) {
            super.field315 = -1;
        }
        super.field316 = arg1.method211();
        if (super.field316 == 65535) {
            super.field316 = -1;
        }
        super.field317 = arg1.method211();
        if (super.field317 == 65535) {
            super.field317 = -1;
        }
        this.field366 = JString.method255(JString.method252(arg1.method215((byte) 2), (byte) -74), true);
        this.field372 = arg1.method209();
        this.field367 = true;
        this.field373 = 0L;
        for (int var5 = 0; var5 < 12; ++var5) {
            this.field373 <<= 4;
            if (this.field370[var5] >= 256) {
                this.field373 += (long) (this.field370[var5] - 256);
            }
        }
        if (this.field370[0] >= 256) {
            this.field373 += (long) (this.field370[0] - 256 >> 4);
        }
        if (this.field370[1] >= 256) {
            this.field373 += (long) (this.field370[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            this.field373 <<= 3;
            this.field373 += (long) this.field371[var6];
        }
        this.field373 <<= 1;
        this.field373 += (long) this.field368;
    }

    @OriginalMember(owner = "z", name = "a", descriptor = "(I)Leb;")
    public final Model method108(int arg0) {
        if (!this.field367) {
            return null;
        } else {
            Model var2 = this.method114(this.field365);
            super.field351 = var2.field478;
            if (arg0 <= 0) {
                for (int var3 = 1; var3 > 0; ++var3) {
                }
            }
            var2.field487 = true;
            if (this.field385) {
                return var2;
            } else {
                if (super.field338 != -1 && super.field339 != -1) {
                    SpotAnimType var4 = SpotAnimType.field1061[super.field338];
                    Model var5 = new Model(364, var4.method322(), !var4.field1065, false, true);
                    var5.method132(0, this.field362, 0, -super.field342);
                    var5.method126(797);
                    var5.method127(var4.field1064.field1045[super.field339], (byte) -89);
                    var5.field486 = null;
                    var5.field485 = null;
                    if (var4.field1068 != 128 || var4.field1069 != 128) {
                        var5.method135(var4.field1069, -221, var4.field1068, var4.field1068);
                    }
                    var5.method136(var4.field1071 + 64, var4.field1072 + 850, -30, -50, -30, true);
                    Model[] var6 = new Model[] { var2, var5 };
                    var2 = new Model(2, var6, false, true);
                }
                if (this.field380 != null) {
                    if (client.field1529 >= this.field376) {
                        this.field380 = null;
                    }
                    if (client.field1529 >= this.field375 && client.field1529 < this.field376) {
                        Model var7 = this.field380;
                        var7.method132(this.field379 - super.field307, this.field362, this.field377 - super.field306, this.field378 - this.field374);
                        if (super.field352 == 512) {
                            var7.method130(-5944);
                            var7.method130(-5944);
                            var7.method130(-5944);
                        } else if (super.field352 == 1024) {
                            var7.method130(-5944);
                            var7.method130(-5944);
                        } else if (super.field352 == 1536) {
                            var7.method130(-5944);
                        }
                        Model[] var8 = new Model[] { var2, var7 };
                        var2 = new Model(2, var8, false, true);
                        if (super.field352 == 512) {
                            var7.method130(-5944);
                        } else if (super.field352 == 1024) {
                            var7.method130(-5944);
                            var7.method130(-5944);
                        } else if (super.field352 == 1536) {
                            var7.method130(-5944);
                            var7.method130(-5944);
                            var7.method130(-5944);
                        }
                        var7.method132(super.field307 - this.field379, this.field362, super.field306 - this.field377, this.field374 - this.field378);
                    }
                }
                var2.field487 = true;
                return var2;
            }
        }
    }

    @OriginalMember(owner = "z", name = "a", descriptor = "(Z)Leb;")
    public final Model method114(boolean arg0) {
        long var2 = this.field373;
        int var4 = -1;
        int var5 = -1;
        int var6 = -1;
        int var7 = -1;
        if (super.field333 >= 0 && super.field336 == 0) {
            SeqType var8 = SeqType.field1043[super.field333];
            var4 = var8.field1045[super.field334];
            if (super.field330 >= 0 && super.field330 != super.field311) {
                var5 = SeqType.field1043[super.field330].field1045[super.field331];
            }
            if (var8.field1052 >= 0) {
                var6 = var8.field1052;
                var2 += (long) (var6 - this.field370[5] << 8);
            }
            if (var8.field1053 >= 0) {
                var7 = var8.field1053;
                var2 += (long) (var7 - this.field370[3] << 16);
            }
        } else if (super.field330 >= 0) {
            var4 = SeqType.field1043[super.field330].field1045[super.field331];
        }
        Model var9 = (Model) field386.method102(var2);
        if (var9 == null) {
            Model[] var10 = new Model[12];
            int var11 = 0;
            for (int var12 = 0; var12 < 12; ++var12) {
                int var14 = this.field370[var12];
                if (var7 >= 0 && var12 == 3) {
                    var14 = var7;
                }
                if (var6 >= 0 && var12 == 5) {
                    var14 = var6;
                }
                if (var14 >= 256 && var14 < 512) {
                    var10[var11++] = IdkType.field963[var14 - 256].method312();
                }
                if (var14 >= 512) {
                    ObjType var15 = ObjType.method287(var14 - 512);
                    Model var16 = var15.method293(124, this.field368);
                    if (var16 != null) {
                        var10[var11++] = var16;
                    }
                }
            }
            var9 = new Model(20363, var10, var11);
            for (int var13 = 0; var13 < 5; ++var13) {
                if (this.field371[var13] != 0) {
                    var9.method133(client.field1217[var13][0], client.field1217[var13][this.field371[var13]]);
                    if (var13 == 1) {
                        var9.method133(client.field1296[0], client.field1296[this.field371[var13]]);
                    }
                }
            }
            var9.method126(797);
            var9.method136(64, 850, -30, -50, -30, true);
            field386.method103(var9, var2, -21658);
        }
        if (this.field385) {
            return var9;
        } else {
            Model var17 = new Model(20363, var9, true);
            if (!arg0) {
                for (int var18 = 1; var18 > 0; ++var18) {
                }
            }
            if (var4 != -1 && var5 != -1) {
                var17.method128(var5, var4, (byte) 7, SeqType.field1043[super.field333].field1049);
            } else if (var4 != -1) {
                var17.method127(var4, (byte) -89);
            }
            var17.method123(this.field361);
            var17.field486 = null;
            var17.field485 = null;
            return var17;
        }
    }

    @OriginalMember(owner = "z", name = "b", descriptor = "(Z)Leb;")
    public final Model method115(boolean arg0) {
        if (!arg0) {
            this.field365 = !this.field365;
        }
        if (!this.field367) {
            return null;
        } else {
            Model[] var2 = new Model[12];
            int var3 = 0;
            for (int var4 = 0; var4 < 12; ++var4) {
                int var7 = this.field370[var4];
                if (var7 >= 256 && var7 < 512) {
                    var2[var3++] = IdkType.field963[var7 - 256].method313(509);
                }
                if (var7 >= 512) {
                    Model var8 = ObjType.method287(var7 - 512).method294(this.field363, this.field368);
                    if (var8 != null) {
                        var2[var3++] = var8;
                    }
                }
            }
            Model var5 = new Model(20363, var2, var3);
            for (int var6 = 0; var6 < 5; ++var6) {
                if (this.field371[var6] != 0) {
                    var5.method133(client.field1217[var6][0], client.field1217[var6][this.field371[var6]]);
                    if (var6 == 1) {
                        var5.method133(client.field1296[0], client.field1296[this.field371[var6]]);
                    }
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "z", name = "b", descriptor = "(I)Z")
    public final boolean method111(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        } else {
            return this.field367;
        }
    }
}
