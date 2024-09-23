import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("z")
public class PlayerEntity extends PathingEntity {

    @OriginalMember(owner = "z", name = "gb", descriptor = "Z")
    private boolean field360 = true;

    @OriginalMember(owner = "z", name = "ib", descriptor = "Z")
    public boolean field362 = false;

    @OriginalMember(owner = "z", name = "lb", descriptor = "[I")
    public int[] field365 = new int[12];

    @OriginalMember(owner = "z", name = "mb", descriptor = "[I")
    public int[] field366 = new int[5];

    @OriginalMember(owner = "z", name = "Ab", descriptor = "Z")
    public boolean field380 = false;

    @OriginalMember(owner = "z", name = "Bb", descriptor = "Ls;")
    public static LruCache field381 = new LruCache(200, (byte) 4);

    @OriginalMember(owner = "z", name = "fb", descriptor = "I")
    private int field359;

    @OriginalMember(owner = "z", name = "jb", descriptor = "I")
    public int field363;

    @OriginalMember(owner = "z", name = "kb", descriptor = "I")
    public int field364;

    @OriginalMember(owner = "z", name = "nb", descriptor = "I")
    public int field367;

    @OriginalMember(owner = "z", name = "pb", descriptor = "I")
    public int field369;

    @OriginalMember(owner = "z", name = "qb", descriptor = "I")
    public int field370;

    @OriginalMember(owner = "z", name = "rb", descriptor = "I")
    public int field371;

    @OriginalMember(owner = "z", name = "sb", descriptor = "I")
    public int field372;

    @OriginalMember(owner = "z", name = "tb", descriptor = "I")
    public int field373;

    @OriginalMember(owner = "z", name = "ub", descriptor = "I")
    public int field374;

    @OriginalMember(owner = "z", name = "wb", descriptor = "I")
    public int field376;

    @OriginalMember(owner = "z", name = "xb", descriptor = "I")
    public int field377;

    @OriginalMember(owner = "z", name = "yb", descriptor = "I")
    public int field378;

    @OriginalMember(owner = "z", name = "zb", descriptor = "I")
    public int field379;

    @OriginalMember(owner = "z", name = "ob", descriptor = "J")
    public long field368;

    @OriginalMember(owner = "z", name = "vb", descriptor = "Leb;")
    public Model field375;

    @OriginalMember(owner = "z", name = "hb", descriptor = "Ljava/lang/String;")
    public String field361;

    @OriginalMember(owner = "z", name = "a", descriptor = "(BLkb;)V")
    public final void method113(byte arg0, Packet arg1) {
        arg1.field621 = 0;
        this.field363 = arg1.method209();
        this.field364 = arg1.method209();
        for (int var3 = 0; var3 < 12; ++var3) {
            int var9 = arg1.method209();
            if (var9 == 0) {
                this.field365[var3] = 0;
            } else {
                int var10 = arg1.method209();
                this.field365[var3] = (var9 << 8) + var10;
            }
        }
        for (int var4 = 0; var4 < 5; ++var4) {
            int var8 = arg1.method209();
            if (var8 < 0 || var8 >= client.field1510[var4].length) {
                var8 = 0;
            }
            this.field366[var4] = var8;
        }
        super.field310 = arg1.method211();
        if (super.field310 == 65535) {
            super.field310 = -1;
        }
        super.field311 = arg1.method211();
        if (super.field311 == 65535) {
            super.field311 = -1;
        }
        super.field312 = arg1.method211();
        if (arg0 == 4) {
            boolean var5 = false;
        } else {
            this.field359 = -5;
        }
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
        this.field361 = JString.method255(-148, JString.method252(arg1.method215((byte) -79), -38644));
        this.field367 = arg1.method209();
        this.field362 = true;
        this.field368 = 0L;
        for (int var6 = 0; var6 < 12; ++var6) {
            this.field368 <<= 4;
            if (this.field365[var6] >= 256) {
                this.field368 += (long) (this.field365[var6] - 256);
            }
        }
        if (this.field365[0] >= 256) {
            this.field368 += (long) (this.field365[0] - 256 >> 4);
        }
        if (this.field365[1] >= 256) {
            this.field368 += (long) (this.field365[1] - 256 >> 8);
        }
        for (int var7 = 0; var7 < 5; ++var7) {
            this.field368 <<= 3;
            this.field368 += (long) this.field366[var7];
        }
        this.field368 <<= 1;
        this.field368 += (long) this.field363;
    }

    @OriginalMember(owner = "z", name = "a", descriptor = "(I)Leb;")
    public final Model method108(int arg0) {
        if (!this.field362) {
            return null;
        } else {
            Model var2 = this.method114(false);
            super.field350 = var2.field471;
            var2.field480 = true;
            if (this.field380) {
                return var2;
            } else {
                if (super.field337 != -1 && super.field338 != -1) {
                    SpotAnimType var3 = SpotAnimType.field1039[super.field337];
                    Model var4 = new Model(!var3.field1043, false, false, var3.method322(), true);
                    var4.method132(3, 0, -super.field341, 0);
                    var4.method126(-36895);
                    var4.method127(1, var3.field1042.field1025[super.field338]);
                    var4.field479 = null;
                    var4.field478 = null;
                    if (var3.field1046 != 128 || var3.field1047 != 128) {
                        var4.method135(var3.field1046, var3.field1046, true, var3.field1047);
                    }
                    var4.method136(var3.field1049 + 64, var3.field1050 + 850, -30, -50, -30, true);
                    Model[] var5 = new Model[] { var2, var4 };
                    var2 = new Model(982, 2, true, var5);
                }
                if (this.field375 != null) {
                    if (client.field1311 >= this.field371) {
                        this.field375 = null;
                    }
                    if (client.field1311 >= this.field370 && client.field1311 < this.field371) {
                        Model var6 = this.field375;
                        var6.method132(3, this.field372 - super.field305, this.field373 - this.field369, this.field374 - super.field306);
                        if (super.field351 == 512) {
                            var6.method130(855);
                            var6.method130(855);
                            var6.method130(855);
                        } else if (super.field351 == 1024) {
                            var6.method130(855);
                            var6.method130(855);
                        } else if (super.field351 == 1536) {
                            var6.method130(855);
                        }
                        Model[] var7 = new Model[] { var2, var6 };
                        var2 = new Model(982, 2, true, var7);
                        if (super.field351 == 512) {
                            var6.method130(855);
                        } else if (super.field351 == 1024) {
                            var6.method130(855);
                            var6.method130(855);
                        } else if (super.field351 == 1536) {
                            var6.method130(855);
                            var6.method130(855);
                            var6.method130(855);
                        }
                        var6.method132(3, super.field305 - this.field372, this.field369 - this.field373, super.field306 - this.field374);
                    }
                }
                var2.field480 = true;
                if (arg0 != 1) {
                    for (int var8 = 1; var8 > 0; ++var8) {
                    }
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "z", name = "b", descriptor = "(Z)Leb;")
    public final Model method114(boolean arg0) {
        long var2 = this.field368;
        int var4 = -1;
        int var5 = -1;
        int var6 = -1;
        int var7 = -1;
        if (super.field332 >= 0 && super.field335 == 0) {
            SeqType var8 = SeqType.field1023[super.field332];
            var4 = var8.field1025[super.field333];
            if (super.field329 >= 0 && super.field329 != super.field310) {
                var5 = SeqType.field1023[super.field329].field1025[super.field330];
            }
            if (var8.field1032 >= 0) {
                var6 = var8.field1032;
                var2 += (long) (var6 - this.field365[5] << 8);
            }
            if (var8.field1033 >= 0) {
                var7 = var8.field1033;
                var2 += (long) (var7 - this.field365[3] << 16);
            }
        } else if (super.field329 >= 0) {
            var4 = SeqType.field1023[super.field329].field1025[super.field330];
        }
        Model var9 = (Model) field381.method102(var2);
        if (var9 == null) {
            Model[] var10 = new Model[12];
            int var11 = 0;
            for (int var12 = 0; var12 < 12; ++var12) {
                int var14 = this.field365[var12];
                if (var7 >= 0 && var12 == 3) {
                    var14 = var7;
                }
                if (var6 >= 0 && var12 == 5) {
                    var14 = var6;
                }
                if (var14 >= 256 && var14 < 512) {
                    var10[var11++] = IdkType.field945[var14 - 256].method312();
                }
                if (var14 >= 512) {
                    ObjType var15 = ObjType.method287(var14 - 512);
                    Model var16 = var15.method293(this.field363, (byte) 3);
                    if (var16 != null) {
                        var10[var11++] = var16;
                    }
                }
            }
            var9 = new Model(6, var11, var10);
            for (int var13 = 0; var13 < 5; ++var13) {
                if (this.field366[var13] != 0) {
                    var9.method133(client.field1510[var13][0], client.field1510[var13][this.field366[var13]]);
                    if (var13 == 1) {
                        var9.method133(client.field1236[0], client.field1236[this.field366[var13]]);
                    }
                }
            }
            var9.method126(-36895);
            var9.method136(64, 850, -30, -50, -30, true);
            field381.method103(var2, 1567, var9);
        }
        if (this.field380) {
            return var9;
        } else {
            Model var17 = new Model(6, true, var9);
            if (var4 != -1 && var5 != -1) {
                var17.method128(6, SeqType.field1023[super.field332].field1029, var5, var4);
            } else if (var4 != -1) {
                var17.method127(1, var4);
            }
            var17.method123(983);
            if (arg0) {
                for (int var18 = 1; var18 > 0; ++var18) {
                }
            }
            var17.field479 = null;
            var17.field478 = null;
            return var17;
        }
    }

    @OriginalMember(owner = "z", name = "b", descriptor = "(I)Leb;")
    public final Model method115(int arg0) {
        if (!this.field362) {
            return null;
        } else {
            Model[] var2 = new Model[12];
            int var3 = 0;
            for (int var4 = 0; var4 < 12; ++var4) {
                int var8 = this.field365[var4];
                if (var8 >= 256 && var8 < 512) {
                    var2[var3++] = IdkType.field945[var8 - 256].method313(2);
                }
                if (var8 >= 512) {
                    Model var9 = ObjType.method287(var8 - 512).method294(this.field363, 264);
                    if (var9 != null) {
                        var2[var3++] = var9;
                    }
                }
            }
            if (arg0 != 2) {
                for (int var5 = 1; var5 > 0; ++var5) {
                }
            }
            Model var6 = new Model(6, var3, var2);
            for (int var7 = 0; var7 < 5; ++var7) {
                if (this.field366[var7] != 0) {
                    var6.method133(client.field1510[var7][0], client.field1510[var7][this.field366[var7]]);
                    if (var7 == 1) {
                        var6.method133(client.field1236[0], client.field1236[this.field366[var7]]);
                    }
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "z", name = "a", descriptor = "(Z)Z")
    public final boolean method111(boolean arg0) {
        if (!arg0) {
            this.field360 = !this.field360;
        }
        return this.field362;
    }
}
