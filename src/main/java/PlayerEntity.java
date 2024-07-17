import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("z")
public class PlayerEntity extends PathingEntity {

    @OriginalMember(owner = "z", name = "hb", descriptor = "Z")
    private boolean field356 = false;

    @OriginalMember(owner = "z", name = "jb", descriptor = "Z")
    public boolean field358 = false;

    @OriginalMember(owner = "z", name = "mb", descriptor = "[I")
    public int[] field361 = new int[12];

    @OriginalMember(owner = "z", name = "nb", descriptor = "[I")
    public int[] field362 = new int[5];

    @OriginalMember(owner = "z", name = "Bb", descriptor = "Z")
    public boolean field376 = false;

    @OriginalMember(owner = "z", name = "Cb", descriptor = "Ls;")
    public static LruCache field377 = new LruCache((byte) 0, 200);

    @OriginalMember(owner = "z", name = "gb", descriptor = "I")
    private int field355;

    @OriginalMember(owner = "z", name = "kb", descriptor = "I")
    public int field359;

    @OriginalMember(owner = "z", name = "lb", descriptor = "I")
    public int field360;

    @OriginalMember(owner = "z", name = "ob", descriptor = "I")
    public int field363;

    @OriginalMember(owner = "z", name = "qb", descriptor = "I")
    public int field365;

    @OriginalMember(owner = "z", name = "rb", descriptor = "I")
    public int field366;

    @OriginalMember(owner = "z", name = "sb", descriptor = "I")
    public int field367;

    @OriginalMember(owner = "z", name = "tb", descriptor = "I")
    public int field368;

    @OriginalMember(owner = "z", name = "ub", descriptor = "I")
    public int field369;

    @OriginalMember(owner = "z", name = "vb", descriptor = "I")
    public int field370;

    @OriginalMember(owner = "z", name = "xb", descriptor = "I")
    public int field372;

    @OriginalMember(owner = "z", name = "yb", descriptor = "I")
    public int field373;

    @OriginalMember(owner = "z", name = "zb", descriptor = "I")
    public int field374;

    @OriginalMember(owner = "z", name = "Ab", descriptor = "I")
    public int field375;

    @OriginalMember(owner = "z", name = "pb", descriptor = "J")
    public long field364;

    @OriginalMember(owner = "z", name = "wb", descriptor = "Leb;")
    public Model field371;

    @OriginalMember(owner = "z", name = "ib", descriptor = "Ljava/lang/String;")
    public String field357;

    @OriginalMember(owner = "z", name = "a", descriptor = "(ZLkb;)V")
    public final void method114(boolean arg0, Packet arg1) {
        arg1.field622 = 0;
        this.field359 = arg1.method216();
        this.field360 = arg1.method216();
        for (int var3 = 0; var3 < 12; ++var3) {
            int var8 = arg1.method216();
            if (var8 == 0) {
                this.field361[var3] = 0;
            } else {
                int var9 = arg1.method216();
                this.field361[var3] = (var8 << 8) + var9;
            }
        }
        for (int var4 = 0; var4 < 5; ++var4) {
            int var7 = arg1.method216();
            if (var7 < 0 || var7 >= client.field1307[var4].length) {
                var7 = 0;
            }
            this.field362[var4] = var7;
        }
        if (!arg0) {
            super.field305 = arg1.method218();
            if (super.field305 == 65535) {
                super.field305 = -1;
            }
            super.field306 = arg1.method218();
            if (super.field306 == 65535) {
                super.field306 = -1;
            }
            super.field307 = arg1.method218();
            if (super.field307 == 65535) {
                super.field307 = -1;
            }
            super.field308 = arg1.method218();
            if (super.field308 == 65535) {
                super.field308 = -1;
            }
            super.field309 = arg1.method218();
            if (super.field309 == 65535) {
                super.field309 = -1;
            }
            super.field310 = arg1.method218();
            if (super.field310 == 65535) {
                super.field310 = -1;
            }
            super.field311 = arg1.method218();
            if (super.field311 == 65535) {
                super.field311 = -1;
            }
            this.field357 = JString.method262(0, JString.method259(arg1.method222(603), false));
            this.field363 = arg1.method216();
            this.field358 = true;
            this.field364 = 0L;
            for (int var5 = 0; var5 < 12; ++var5) {
                this.field364 <<= 4;
                if (this.field361[var5] >= 256) {
                    this.field364 += (long) (this.field361[var5] - 256);
                }
            }
            if (this.field361[0] >= 256) {
                this.field364 += (long) (this.field361[0] - 256 >> 4);
            }
            if (this.field361[1] >= 256) {
                this.field364 += (long) (this.field361[1] - 256 >> 8);
            }
            for (int var6 = 0; var6 < 5; ++var6) {
                this.field364 <<= 3;
                this.field364 += (long) this.field362[var6];
            }
            this.field364 <<= 1;
            this.field364 += (long) this.field359;
        }
    }

    @OriginalMember(owner = "z", name = "a", descriptor = "(Z)Leb;")
    public final Model method109(boolean arg0) {
        if (!this.field358) {
            return null;
        } else {
            Model var2 = this.method115(false);
            super.field345 = var2.field472;
            var2.field481 = true;
            if (this.field376) {
                return var2;
            } else {
                if (super.field332 != -1 && super.field333 != -1) {
                    SpotAnimType var3 = SpotAnimType.field1043[super.field332];
                    Model var4 = new Model(var3.method330(), true, !var3.field1048, this.field355, false);
                    var4.method133(-super.field336, 0, -122, 0);
                    var4.method127(4);
                    var4.method128(-16599, var3.field1047.field1030[super.field333]);
                    var4.field480 = null;
                    var4.field479 = null;
                    if (var3.field1051 != 128 || var3.field1052 != 128) {
                        var4.method136(var3.field1051, 2, var3.field1052, var3.field1051);
                    }
                    var4.method137(var3.field1054 + 64, var3.field1055 + 850, -30, -50, -30, true);
                    Model[] var5 = new Model[] { var2, var4 };
                    var2 = new Model(var5, (byte) -31, 2, true);
                }
                if (this.field371 != null) {
                    if (client.field1320 >= this.field367) {
                        this.field371 = null;
                    }
                    if (client.field1320 >= this.field366 && client.field1320 < this.field367) {
                        Model var6 = this.field371;
                        var6.method133(this.field369 - this.field365, this.field368 - super.field300, -122, this.field370 - super.field301);
                        if (super.field346 == 512) {
                            var6.method131(0);
                            var6.method131(0);
                            var6.method131(0);
                        } else if (super.field346 == 1024) {
                            var6.method131(0);
                            var6.method131(0);
                        } else if (super.field346 == 1536) {
                            var6.method131(0);
                        }
                        Model[] var7 = new Model[] { var2, var6 };
                        var2 = new Model(var7, (byte) -31, 2, true);
                        if (super.field346 == 512) {
                            var6.method131(0);
                        } else if (super.field346 == 1024) {
                            var6.method131(0);
                            var6.method131(0);
                        } else if (super.field346 == 1536) {
                            var6.method131(0);
                            var6.method131(0);
                            var6.method131(0);
                        }
                        var6.method133(this.field365 - this.field369, super.field300 - this.field368, -122, super.field301 - this.field370);
                    }
                }
                var2.field481 = true;
                if (!arg0) {
                    for (int var8 = 1; var8 > 0; ++var8) {
                    }
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "z", name = "c", descriptor = "(Z)Leb;")
    public final Model method115(boolean arg0) {
        long var2 = this.field364;
        int var4 = -1;
        int var5 = -1;
        int var6 = -1;
        int var7 = -1;
        if (super.field327 >= 0 && super.field330 == 0) {
            SeqType var8 = SeqType.field1028[super.field327];
            var4 = var8.field1030[super.field328];
            if (super.field324 >= 0 && super.field324 != super.field305) {
                var5 = SeqType.field1028[super.field324].field1030[super.field325];
            }
            if (var8.field1037 >= 0) {
                var6 = var8.field1037;
                var2 += (long) (var6 - this.field361[5] << 8);
            }
            if (var8.field1038 >= 0) {
                var7 = var8.field1038;
                var2 += (long) (var7 - this.field361[3] << 16);
            }
        } else if (super.field324 >= 0) {
            var4 = SeqType.field1028[super.field324].field1030[super.field325];
        }
        Model var9 = (Model) field377.method103(var2);
        if (var9 == null) {
            Model[] var10 = new Model[12];
            int var11 = 0;
            for (int var12 = 0; var12 < 12; ++var12) {
                int var14 = this.field361[var12];
                if (var7 >= 0 && var12 == 3) {
                    var14 = var7;
                }
                if (var6 >= 0 && var12 == 5) {
                    var14 = var6;
                }
                if (var14 >= 256 && var14 < 512) {
                    var10[var11++] = IdkType.field950[var14 - 256].method320();
                }
                if (var14 >= 512) {
                    ObjType var15 = ObjType.method294(var14 - 512);
                    Model var16 = var15.method300((byte) 6, this.field359);
                    if (var16 != null) {
                        var10[var11++] = var16;
                    }
                }
            }
            var9 = new Model(0, var10, var11);
            for (int var13 = 0; var13 < 5; ++var13) {
                if (this.field362[var13] != 0) {
                    var9.method134(client.field1307[var13][0], client.field1307[var13][this.field362[var13]]);
                    if (var13 == 1) {
                        var9.method134(client.field1438[0], client.field1438[this.field362[var13]]);
                    }
                }
            }
            var9.method127(4);
            var9.method137(64, 850, -30, -50, -30, true);
            field377.method104(6, var2, var9);
        }
        if (this.field376) {
            return var9;
        } else {
            Model var17 = new Model(0, var9, true);
            if (arg0) {
                this.field356 = !this.field356;
            }
            if (var4 != -1 && var5 != -1) {
                var17.method129(var5, 3, var4, SeqType.field1028[super.field327].field1034);
            } else if (var4 != -1) {
                var17.method128(-16599, var4);
            }
            var17.method124(2992);
            var17.field480 = null;
            var17.field479 = null;
            return var17;
        }
    }

    @OriginalMember(owner = "z", name = "a", descriptor = "(I)Leb;")
    public final Model method116(int arg0) {
        if (!this.field358) {
            return null;
        } else {
            Model[] var2 = new Model[12];
            int var3 = 0;
            for (int var4 = 0; var4 < 12; ++var4) {
                int var7 = this.field361[var4];
                if (var7 >= 256 && var7 < 512) {
                    var2[var3++] = IdkType.field950[var7 - 256].method321(false);
                }
                if (var7 >= 512) {
                    Model var8 = ObjType.method294(var7 - 512).method301(-22246, this.field359);
                    if (var8 != null) {
                        var2[var3++] = var8;
                    }
                }
            }
            Model var5 = new Model(0, var2, var3);
            for (int var6 = 0; var6 < 5; ++var6) {
                if (this.field362[var6] != 0) {
                    var5.method134(client.field1307[var6][0], client.field1307[var6][this.field362[var6]]);
                    if (var6 == 1) {
                        var5.method134(client.field1438[0], client.field1438[this.field362[var6]]);
                    }
                }
            }
            if (arg0 < 0) {
                return var5;
            } else {
                throw new NullPointerException();
            }
        }
    }

    @OriginalMember(owner = "z", name = "b", descriptor = "(Z)Z")
    public final boolean method112(boolean arg0) {
        if (arg0) {
            this.field356 = !this.field356;
        }
        return this.field358;
    }
}
