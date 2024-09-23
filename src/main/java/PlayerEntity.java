import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("z")
public class PlayerEntity extends PathingEntity {

    @OriginalMember(owner = "z", name = "ib", descriptor = "I")
    private int field358 = 265;

    @OriginalMember(owner = "z", name = "jb", descriptor = "Z")
    private boolean field359 = true;

    @OriginalMember(owner = "z", name = "lb", descriptor = "Z")
    public boolean field361 = false;

    @OriginalMember(owner = "z", name = "ob", descriptor = "[I")
    public int[] field364 = new int[12];

    @OriginalMember(owner = "z", name = "pb", descriptor = "[I")
    public int[] field365 = new int[5];

    @OriginalMember(owner = "z", name = "Db", descriptor = "Z")
    public boolean field379 = false;

    @OriginalMember(owner = "z", name = "Eb", descriptor = "Ls;")
    public static LruCache field380 = new LruCache(17295, 200);

    @OriginalMember(owner = "z", name = "mb", descriptor = "I")
    public int field362;

    @OriginalMember(owner = "z", name = "nb", descriptor = "I")
    public int field363;

    @OriginalMember(owner = "z", name = "qb", descriptor = "I")
    public int field366;

    @OriginalMember(owner = "z", name = "sb", descriptor = "I")
    public int field368;

    @OriginalMember(owner = "z", name = "tb", descriptor = "I")
    public int field369;

    @OriginalMember(owner = "z", name = "ub", descriptor = "I")
    public int field370;

    @OriginalMember(owner = "z", name = "vb", descriptor = "I")
    public int field371;

    @OriginalMember(owner = "z", name = "wb", descriptor = "I")
    public int field372;

    @OriginalMember(owner = "z", name = "xb", descriptor = "I")
    public int field373;

    @OriginalMember(owner = "z", name = "zb", descriptor = "I")
    public int field375;

    @OriginalMember(owner = "z", name = "Ab", descriptor = "I")
    public int field376;

    @OriginalMember(owner = "z", name = "Bb", descriptor = "I")
    public int field377;

    @OriginalMember(owner = "z", name = "Cb", descriptor = "I")
    public int field378;

    @OriginalMember(owner = "z", name = "rb", descriptor = "J")
    public long field367;

    @OriginalMember(owner = "z", name = "yb", descriptor = "Leb;")
    public Model field374;

    @OriginalMember(owner = "z", name = "kb", descriptor = "Ljava/lang/String;")
    public String field360;

    @OriginalMember(owner = "z", name = "a", descriptor = "(ILkb;)V")
    public final void method112(int arg0, Packet arg1) {
        arg1.field622 = 0;
        this.field362 = arg1.method208();
        this.field363 = arg1.method208();
        for (int var3 = 0; var3 < 12; ++var3) {
            int var9 = arg1.method208();
            if (var9 == 0) {
                this.field364[var3] = 0;
            } else {
                int var10 = arg1.method208();
                this.field364[var3] = (var9 << 8) + var10;
            }
        }
        int var4 = 55 / arg0;
        for (int var5 = 0; var5 < 5; ++var5) {
            int var8 = arg1.method208();
            if (var8 < 0 || var8 >= client.field1194[var5].length) {
                var8 = 0;
            }
            this.field365[var5] = var8;
        }
        super.field309 = arg1.method210();
        if (super.field309 == 65535) {
            super.field309 = -1;
        }
        super.field310 = arg1.method210();
        if (super.field310 == 65535) {
            super.field310 = -1;
        }
        super.field311 = arg1.method210();
        if (super.field311 == 65535) {
            super.field311 = -1;
        }
        super.field312 = arg1.method210();
        if (super.field312 == 65535) {
            super.field312 = -1;
        }
        super.field313 = arg1.method210();
        if (super.field313 == 65535) {
            super.field313 = -1;
        }
        super.field314 = arg1.method210();
        if (super.field314 == 65535) {
            super.field314 = -1;
        }
        super.field315 = arg1.method210();
        if (super.field315 == 65535) {
            super.field315 = -1;
        }
        this.field360 = JString.method254((byte) -10, JString.method251(4, arg1.method214(-29068)));
        this.field366 = arg1.method208();
        this.field361 = true;
        this.field367 = 0L;
        for (int var6 = 0; var6 < 12; ++var6) {
            this.field367 <<= 4;
            if (this.field364[var6] >= 256) {
                this.field367 += (long) (this.field364[var6] - 256);
            }
        }
        if (this.field364[0] >= 256) {
            this.field367 += (long) (this.field364[0] - 256 >> 4);
        }
        if (this.field364[1] >= 256) {
            this.field367 += (long) (this.field364[1] - 256 >> 8);
        }
        for (int var7 = 0; var7 < 5; ++var7) {
            this.field367 <<= 3;
            this.field367 += (long) this.field365[var7];
        }
        this.field367 <<= 1;
        this.field367 += (long) this.field362;
    }

    @OriginalMember(owner = "z", name = "a", descriptor = "(I)Leb;")
    public final Model method107(int arg0) {
        if (!this.field361) {
            return null;
        } else {
            Model var2 = this.method113(this.field359);
            super.field349 = var2.field472;
            var2.field481 = true;
            if (arg0 < 7 || arg0 > 7) {
                this.field359 = !this.field359;
            }
            if (this.field379) {
                return var2;
            } else {
                if (super.field336 != -1 && super.field337 != -1) {
                    SpotAnimType var3 = SpotAnimType.field1043[super.field336];
                    Model var4 = new Model(false, (byte) 8, true, !var3.field1047, var3.method321());
                    var4.method131((byte) -81, -super.field340, 0, 0);
                    var4.method125((byte) -17);
                    var4.method126(var3.field1046.field1028[super.field337], (byte) 1);
                    var4.field480 = null;
                    var4.field479 = null;
                    if (var3.field1050 != 128 || var3.field1051 != 128) {
                        var4.method134(var3.field1051, 28022, var3.field1050, var3.field1050);
                    }
                    var4.method135(var3.field1053 + 64, var3.field1054 + 850, -30, -50, -30, true);
                    Model[] var5 = new Model[] { var2, var4 };
                    var2 = new Model(var5, 2, 0, true);
                }
                if (this.field374 != null) {
                    if (client.field1446 >= this.field370) {
                        this.field374 = null;
                    }
                    if (client.field1446 >= this.field369 && client.field1446 < this.field370) {
                        Model var6 = this.field374;
                        var6.method131((byte) -81, this.field372 - this.field368, this.field373 - super.field305, this.field371 - super.field304);
                        if (super.field350 == 512) {
                            var6.method129((byte) 4);
                            var6.method129((byte) 4);
                            var6.method129((byte) 4);
                        } else if (super.field350 == 1024) {
                            var6.method129((byte) 4);
                            var6.method129((byte) 4);
                        } else if (super.field350 == 1536) {
                            var6.method129((byte) 4);
                        }
                        Model[] var7 = new Model[] { var2, var6 };
                        var2 = new Model(var7, 2, 0, true);
                        if (super.field350 == 512) {
                            var6.method129((byte) 4);
                        } else if (super.field350 == 1024) {
                            var6.method129((byte) 4);
                            var6.method129((byte) 4);
                        } else if (super.field350 == 1536) {
                            var6.method129((byte) 4);
                            var6.method129((byte) 4);
                            var6.method129((byte) 4);
                        }
                        var6.method131((byte) -81, this.field368 - this.field372, super.field305 - this.field373, super.field304 - this.field371);
                    }
                }
                var2.field481 = true;
                return var2;
            }
        }
    }

    @OriginalMember(owner = "z", name = "b", descriptor = "(Z)Leb;")
    public final Model method113(boolean arg0) {
        long var2 = this.field367;
        int var4 = -1;
        int var5 = -1;
        int var6 = -1;
        int var7 = -1;
        if (super.field331 >= 0 && super.field334 == 0) {
            SeqType var8 = SeqType.field1026[super.field331];
            var4 = var8.field1028[super.field332];
            if (super.field328 >= 0 && super.field328 != super.field309) {
                var5 = SeqType.field1026[super.field328].field1028[super.field329];
            }
            if (var8.field1035 >= 0) {
                var6 = var8.field1035;
                var2 += (long) (var6 - this.field364[5] << 8);
            }
            if (var8.field1036 >= 0) {
                var7 = var8.field1036;
                var2 += (long) (var7 - this.field364[3] << 16);
            }
        } else if (super.field328 >= 0) {
            var4 = SeqType.field1026[super.field328].field1028[super.field329];
        }
        Model var9 = (Model) field380.method101(var2);
        if (var9 == null) {
            Model[] var10 = new Model[12];
            int var11 = 0;
            for (int var12 = 0; var12 < 12; ++var12) {
                int var14 = this.field364[var12];
                if (var7 >= 0 && var12 == 3) {
                    var14 = var7;
                }
                if (var6 >= 0 && var12 == 5) {
                    var14 = var6;
                }
                if (var14 >= 256 && var14 < 512) {
                    var10[var11++] = IdkType.field947[var14 - 256].method311();
                }
                if (var14 >= 512) {
                    ObjType var15 = ObjType.method286(var14 - 512);
                    Model var16 = var15.method292(this.field362, (byte) 5);
                    if (var16 != null) {
                        var10[var11++] = var16;
                    }
                }
            }
            var9 = new Model(16925, var11, var10);
            for (int var13 = 0; var13 < 5; ++var13) {
                if (this.field365[var13] != 0) {
                    var9.method132(client.field1194[var13][0], client.field1194[var13][this.field365[var13]]);
                    if (var13 == 1) {
                        var9.method132(client.field1285[0], client.field1285[this.field365[var13]]);
                    }
                }
            }
            var9.method125((byte) -17);
            var9.method135(64, 850, -30, -50, -30, true);
            field380.method102(var2, var9, (byte) 3);
        }
        if (this.field379) {
            return var9;
        } else {
            Model var17 = new Model(16925, true, var9);
            if (!arg0) {
                for (int var18 = 1; var18 > 0; ++var18) {
                }
            }
            if (var4 != -1 && var5 != -1) {
                var17.method127(2, var5, SeqType.field1026[super.field331].field1032, var4);
            } else if (var4 != -1) {
                var17.method126(var4, (byte) 1);
            }
            var17.method122(9);
            var17.field480 = null;
            var17.field479 = null;
            return var17;
        }
    }

    @OriginalMember(owner = "z", name = "b", descriptor = "(I)Leb;")
    public final Model method114(int arg0) {
        if (arg0 != -13298) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (!this.field361) {
            return null;
        } else {
            Model[] var3 = new Model[12];
            int var4 = 0;
            for (int var5 = 0; var5 < 12; ++var5) {
                int var8 = this.field364[var5];
                if (var8 >= 256 && var8 < 512) {
                    var3[var4++] = IdkType.field947[var8 - 256].method312((byte) 88);
                }
                if (var8 >= 512) {
                    Model var9 = ObjType.method286(var8 - 512).method293(this.field362, false);
                    if (var9 != null) {
                        var3[var4++] = var9;
                    }
                }
            }
            Model var6 = new Model(16925, var4, var3);
            for (int var7 = 0; var7 < 5; ++var7) {
                if (this.field365[var7] != 0) {
                    var6.method132(client.field1194[var7][0], client.field1194[var7][this.field365[var7]]);
                    if (var7 == 1) {
                        var6.method132(client.field1285[0], client.field1285[this.field365[var7]]);
                    }
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "z", name = "a", descriptor = "(Z)Z")
    public final boolean method110(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        } else {
            return this.field361;
        }
    }
}
