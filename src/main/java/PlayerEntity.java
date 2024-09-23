import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("z")
public class PlayerEntity extends PathingEntity {

    @OriginalMember(owner = "z", name = "hb", descriptor = "I")
    private int field353 = -104;

    @OriginalMember(owner = "z", name = "ib", descriptor = "I")
    private int field354 = -3274;

    @OriginalMember(owner = "z", name = "jb", descriptor = "B")
    private byte field355 = 3;

    @OriginalMember(owner = "z", name = "lb", descriptor = "Z")
    public boolean field357 = false;

    @OriginalMember(owner = "z", name = "ob", descriptor = "[I")
    public int[] field360 = new int[12];

    @OriginalMember(owner = "z", name = "pb", descriptor = "[I")
    public int[] field361 = new int[5];

    @OriginalMember(owner = "z", name = "Db", descriptor = "Z")
    public boolean field375 = false;

    @OriginalMember(owner = "z", name = "Eb", descriptor = "Ls;")
    public static LruCache field376 = new LruCache(200, 4);

    @OriginalMember(owner = "z", name = "mb", descriptor = "I")
    public int field358;

    @OriginalMember(owner = "z", name = "nb", descriptor = "I")
    public int field359;

    @OriginalMember(owner = "z", name = "qb", descriptor = "I")
    public int field362;

    @OriginalMember(owner = "z", name = "sb", descriptor = "I")
    public int field364;

    @OriginalMember(owner = "z", name = "tb", descriptor = "I")
    public int field365;

    @OriginalMember(owner = "z", name = "ub", descriptor = "I")
    public int field366;

    @OriginalMember(owner = "z", name = "vb", descriptor = "I")
    public int field367;

    @OriginalMember(owner = "z", name = "wb", descriptor = "I")
    public int field368;

    @OriginalMember(owner = "z", name = "xb", descriptor = "I")
    public int field369;

    @OriginalMember(owner = "z", name = "zb", descriptor = "I")
    public int field371;

    @OriginalMember(owner = "z", name = "Ab", descriptor = "I")
    public int field372;

    @OriginalMember(owner = "z", name = "Bb", descriptor = "I")
    public int field373;

    @OriginalMember(owner = "z", name = "Cb", descriptor = "I")
    public int field374;

    @OriginalMember(owner = "z", name = "rb", descriptor = "J")
    public long field363;

    @OriginalMember(owner = "z", name = "yb", descriptor = "Leb;")
    public Model field370;

    @OriginalMember(owner = "z", name = "kb", descriptor = "Ljava/lang/String;")
    public String field356;

    @OriginalMember(owner = "z", name = "a", descriptor = "(ILkb;)V")
    public final void method113(int arg0, Packet arg1) {
        arg1.field612 = 0;
        this.field358 = arg1.method209();
        this.field359 = arg1.method209();
        for (int var3 = 0; var3 < 12; ++var3) {
            int var8 = arg1.method209();
            if (var8 == 0) {
                this.field360[var3] = 0;
            } else {
                int var9 = arg1.method209();
                this.field360[var3] = (var8 << 8) + var9;
            }
        }
        for (int var4 = 0; var4 < 5; ++var4) {
            int var7 = arg1.method209();
            if (var7 < 0 || var7 >= client.field1205[var4].length) {
                var7 = 0;
            }
            this.field361[var4] = var7;
        }
        if (arg0 != 0) {
            this.field354 = 307;
        }
        super.field303 = arg1.method211();
        if (super.field303 == 65535) {
            super.field303 = -1;
        }
        super.field304 = arg1.method211();
        if (super.field304 == 65535) {
            super.field304 = -1;
        }
        super.field305 = arg1.method211();
        if (super.field305 == 65535) {
            super.field305 = -1;
        }
        super.field306 = arg1.method211();
        if (super.field306 == 65535) {
            super.field306 = -1;
        }
        super.field307 = arg1.method211();
        if (super.field307 == 65535) {
            super.field307 = -1;
        }
        super.field308 = arg1.method211();
        if (super.field308 == 65535) {
            super.field308 = -1;
        }
        super.field309 = arg1.method211();
        if (super.field309 == 65535) {
            super.field309 = -1;
        }
        this.field356 = JString.method255(false, JString.method252(false, arg1.method215(6)));
        this.field362 = arg1.method209();
        this.field357 = true;
        this.field363 = 0L;
        for (int var5 = 0; var5 < 12; ++var5) {
            this.field363 <<= 4;
            if (this.field360[var5] >= 256) {
                this.field363 += (long) (this.field360[var5] - 256);
            }
        }
        if (this.field360[0] >= 256) {
            this.field363 += (long) (this.field360[0] - 256 >> 4);
        }
        if (this.field360[1] >= 256) {
            this.field363 += (long) (this.field360[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            this.field363 <<= 3;
            this.field363 += (long) this.field361[var6];
        }
        this.field363 <<= 1;
        this.field363 += (long) this.field358;
    }

    @OriginalMember(owner = "z", name = "a", descriptor = "(Z)Leb;")
    public final Model method108(boolean arg0) {
        if (!this.field357) {
            return null;
        } else {
            Model var2 = this.method114(0);
            super.field343 = var2.field472;
            var2.field481 = true;
            if (this.field375) {
                return var2;
            } else {
                if (super.field330 != -1 && super.field331 != -1) {
                    SpotAnimType var3 = SpotAnimType.field1015[super.field330];
                    Model var4 = new Model(var3.method322(), !var3.field1019, 868, false, true);
                    var4.method132(0, 0, -super.field334, false);
                    var4.method126(true);
                    var4.method127(var3.field1018.field1001[super.field331], -227);
                    var4.field480 = null;
                    var4.field479 = null;
                    if (var3.field1022 != 128 || var3.field1023 != 128) {
                        var4.method135(var3.field1022, var3.field1022, var3.field1023, -27239);
                    }
                    var4.method136(var3.field1025 + 64, var3.field1026 + 850, -30, -50, -30, true);
                    Model[] var5 = new Model[] { var2, var4 };
                    var2 = new Model(var5, false, 2, true);
                }
                if (this.field370 != null) {
                    if (client.field1354 >= this.field366) {
                        this.field370 = null;
                    }
                    if (client.field1354 >= this.field365 && client.field1354 < this.field366) {
                        Model var6 = this.field370;
                        var6.method132(this.field369 - super.field299, this.field367 - super.field298, this.field368 - this.field364, false);
                        if (super.field344 == 512) {
                            var6.method130(7);
                            var6.method130(7);
                            var6.method130(7);
                        } else if (super.field344 == 1024) {
                            var6.method130(7);
                            var6.method130(7);
                        } else if (super.field344 == 1536) {
                            var6.method130(7);
                        }
                        Model[] var7 = new Model[] { var2, var6 };
                        var2 = new Model(var7, false, 2, true);
                        if (super.field344 == 512) {
                            var6.method130(7);
                        } else if (super.field344 == 1024) {
                            var6.method130(7);
                            var6.method130(7);
                        } else if (super.field344 == 1536) {
                            var6.method130(7);
                            var6.method130(7);
                            var6.method130(7);
                        }
                        var6.method132(super.field299 - this.field369, super.field298 - this.field367, this.field364 - this.field368, false);
                    }
                }
                var2.field481 = true;
                if (arg0) {
                    for (int var8 = 1; var8 > 0; ++var8) {
                    }
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "z", name = "b", descriptor = "(I)Leb;")
    public final Model method114(int arg0) {
        long var2 = this.field363;
        if (arg0 >= 0 && arg0 <= 0) {
            int var4 = -1;
            int var5 = -1;
            int var6 = -1;
            int var7 = -1;
            if (super.field325 >= 0 && super.field328 == 0) {
                SeqType var8 = SeqType.field999[super.field325];
                var4 = var8.field1001[super.field326];
                if (super.field322 >= 0 && super.field322 != super.field303) {
                    var5 = SeqType.field999[super.field322].field1001[super.field323];
                }
                if (var8.field1008 >= 0) {
                    var6 = var8.field1008;
                    var2 += (long) (var6 - this.field360[5] << 8);
                }
                if (var8.field1009 >= 0) {
                    var7 = var8.field1009;
                    var2 += (long) (var7 - this.field360[3] << 16);
                }
            } else if (super.field322 >= 0) {
                var4 = SeqType.field999[super.field322].field1001[super.field323];
            }
            Model var9 = (Model) field376.method102(var2);
            if (var9 == null) {
                Model[] var10 = new Model[12];
                int var11 = 0;
                for (int var12 = 0; var12 < 12; ++var12) {
                    int var14 = this.field360[var12];
                    if (var7 >= 0 && var12 == 3) {
                        var14 = var7;
                    }
                    if (var6 >= 0 && var12 == 5) {
                        var14 = var6;
                    }
                    if (var14 >= 256 && var14 < 512) {
                        var10[var11++] = IdkType.field924[var14 - 256].method312();
                    }
                    if (var14 >= 512) {
                        ObjType var15 = ObjType.method287(var14 - 512);
                        Model var16 = var15.method293(this.field358, 3);
                        if (var16 != null) {
                            var10[var11++] = var16;
                        }
                    }
                }
                var9 = new Model(0, var10, var11);
                for (int var13 = 0; var13 < 5; ++var13) {
                    if (this.field361[var13] != 0) {
                        var9.method133(client.field1205[var13][0], client.field1205[var13][this.field361[var13]]);
                        if (var13 == 1) {
                            var9.method133(client.field1145[0], client.field1145[this.field361[var13]]);
                        }
                    }
                }
                var9.method126(true);
                var9.method136(64, 850, -30, -50, -30, true);
                field376.method103(3, var9, var2);
            }
            if (this.field375) {
                return var9;
            } else {
                Model var17 = new Model(0, var9, true);
                if (var4 != -1 && var5 != -1) {
                    var17.method128(SeqType.field999[super.field325].field1005, var5, true, var4);
                } else if (var4 != -1) {
                    var17.method127(var4, -227);
                }
                var17.method123(-220);
                var17.field480 = null;
                var17.field479 = null;
                return var17;
            }
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "z", name = "c", descriptor = "(I)Leb;")
    public final Model method115(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (!this.field357) {
            return null;
        } else {
            Model[] var3 = new Model[12];
            int var4 = 0;
            for (int var5 = 0; var5 < 12; ++var5) {
                int var8 = this.field360[var5];
                if (var8 >= 256 && var8 < 512) {
                    var3[var4++] = IdkType.field924[var8 - 256].method313(0);
                }
                if (var8 >= 512) {
                    Model var9 = ObjType.method287(var8 - 512).method294(this.field355, this.field358);
                    if (var9 != null) {
                        var3[var4++] = var9;
                    }
                }
            }
            Model var6 = new Model(0, var3, var4);
            for (int var7 = 0; var7 < 5; ++var7) {
                if (this.field361[var7] != 0) {
                    var6.method133(client.field1205[var7][0], client.field1205[var7][this.field361[var7]]);
                    if (var7 == 1) {
                        var6.method133(client.field1145[0], client.field1145[this.field361[var7]]);
                    }
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "z", name = "a", descriptor = "(I)Z")
    public final boolean method111(int arg0) {
        if (arg0 != 35155) {
            this.field353 = 133;
        }
        return this.field357;
    }
}
