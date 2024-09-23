import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("z")
public class PlayerEntity extends PathingEntity {

    @OriginalMember(owner = "z", name = "hb", descriptor = "I")
    private int field362 = 19303;

    @OriginalMember(owner = "z", name = "jb", descriptor = "Z")
    private boolean field364 = true;

    @OriginalMember(owner = "z", name = "lb", descriptor = "B")
    private byte field366 = 7;

    @OriginalMember(owner = "z", name = "nb", descriptor = "Z")
    public boolean field368 = false;

    @OriginalMember(owner = "z", name = "qb", descriptor = "[I")
    public int[] field371 = new int[12];

    @OriginalMember(owner = "z", name = "rb", descriptor = "[I")
    public int[] field372 = new int[5];

    @OriginalMember(owner = "z", name = "Fb", descriptor = "Z")
    public boolean field386 = false;

    @OriginalMember(owner = "z", name = "Gb", descriptor = "Ls;")
    public static LruCache field387 = new LruCache(-24, 200);

    @OriginalMember(owner = "z", name = "ib", descriptor = "I")
    private int field363;

    @OriginalMember(owner = "z", name = "kb", descriptor = "I")
    private int field365;

    @OriginalMember(owner = "z", name = "ob", descriptor = "I")
    public int field369;

    @OriginalMember(owner = "z", name = "pb", descriptor = "I")
    public int field370;

    @OriginalMember(owner = "z", name = "sb", descriptor = "I")
    public int field373;

    @OriginalMember(owner = "z", name = "ub", descriptor = "I")
    public int field375;

    @OriginalMember(owner = "z", name = "vb", descriptor = "I")
    public int field376;

    @OriginalMember(owner = "z", name = "wb", descriptor = "I")
    public int field377;

    @OriginalMember(owner = "z", name = "xb", descriptor = "I")
    public int field378;

    @OriginalMember(owner = "z", name = "yb", descriptor = "I")
    public int field379;

    @OriginalMember(owner = "z", name = "zb", descriptor = "I")
    public int field380;

    @OriginalMember(owner = "z", name = "Bb", descriptor = "I")
    public int field382;

    @OriginalMember(owner = "z", name = "Cb", descriptor = "I")
    public int field383;

    @OriginalMember(owner = "z", name = "Db", descriptor = "I")
    public int field384;

    @OriginalMember(owner = "z", name = "Eb", descriptor = "I")
    public int field385;

    @OriginalMember(owner = "z", name = "tb", descriptor = "J")
    public long field374;

    @OriginalMember(owner = "z", name = "Ab", descriptor = "Leb;")
    public Model field381;

    @OriginalMember(owner = "z", name = "mb", descriptor = "Ljava/lang/String;")
    public String field367;

    @OriginalMember(owner = "z", name = "a", descriptor = "(Lkb;B)V")
    public final void method114(Packet arg0, byte arg1) {
        arg0.field624 = 0;
        this.field369 = arg0.method216();
        this.field370 = arg0.method216();
        for (int var3 = 0; var3 < 12; ++var3) {
            int var9 = arg0.method216();
            if (var9 == 0) {
                this.field371[var3] = 0;
            } else {
                int var10 = arg0.method216();
                this.field371[var3] = (var9 << 8) + var10;
            }
        }
        for (int var4 = 0; var4 < 5; ++var4) {
            int var8 = arg0.method216();
            if (var8 < 0 || var8 >= client.field1184[var4].length) {
                var8 = 0;
            }
            this.field372[var4] = var8;
        }
        super.field313 = arg0.method218();
        if (super.field313 == 65535) {
            super.field313 = -1;
        }
        super.field314 = arg0.method218();
        if (super.field314 == 65535) {
            super.field314 = -1;
        }
        super.field315 = arg0.method218();
        if (super.field315 == 65535) {
            super.field315 = -1;
        }
        super.field316 = arg0.method218();
        if (super.field316 == 65535) {
            super.field316 = -1;
        }
        super.field317 = arg0.method218();
        if (super.field317 == 65535) {
            super.field317 = -1;
        }
        super.field318 = arg0.method218();
        if (super.field318 == 65535) {
            super.field318 = -1;
        }
        super.field319 = arg0.method218();
        if (super.field319 == 65535) {
            super.field319 = -1;
        }
        this.field367 = JString.method262(0, JString.method259(arg0.method222((byte) 2), true));
        this.field373 = arg0.method216();
        this.field368 = true;
        this.field374 = 0L;
        for (int var5 = 0; var5 < 12; ++var5) {
            this.field374 <<= 4;
            if (this.field371[var5] >= 256) {
                this.field374 += (long) (this.field371[var5] - 256);
            }
        }
        if (this.field371[0] >= 256) {
            this.field374 += (long) (this.field371[0] - 256 >> 4);
        }
        if (this.field371[1] >= 256) {
            this.field374 += (long) (this.field371[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            this.field374 <<= 3;
            this.field374 += (long) this.field372[var6];
        }
        this.field374 <<= 1;
        this.field374 += (long) this.field369;
        if (arg1 == 4) {
            boolean var7 = false;
        }
    }

    @OriginalMember(owner = "z", name = "a", descriptor = "(I)Leb;")
    public final Model method109(int arg0) {
        if (arg0 < this.field363 || arg0 > this.field363) {
            this.field364 = !this.field364;
        }
        if (!this.field368) {
            return null;
        } else {
            Model var2 = this.method115(-300);
            super.field353 = var2.field481;
            var2.field490 = true;
            if (this.field386) {
                return var2;
            } else {
                if (super.field340 != -1 && super.field341 != -1) {
                    SpotAnimType var3 = SpotAnimType.field1033[super.field340];
                    Model var4 = new Model(!var3.field1038, (byte) 70, true, var3.method330(), false);
                    var4.method133(0, -super.field344, (byte) 1, 0);
                    var4.method127(false);
                    var4.method128(var3.field1037.field1020[super.field341], 5565);
                    var4.field489 = null;
                    var4.field488 = null;
                    if (var3.field1041 != 128 || var3.field1042 != 128) {
                        var4.method136(var3.field1042, var3.field1041, false, var3.field1041);
                    }
                    var4.method137(var3.field1044 + 64, var3.field1045 + 850, -30, -50, -30, true);
                    Model[] var5 = new Model[] { var2, var4 };
                    var2 = new Model((byte) -80, true, var5, 2);
                }
                if (this.field381 != null) {
                    if (client.field1356 >= this.field377) {
                        this.field381 = null;
                    }
                    if (client.field1356 >= this.field376 && client.field1356 < this.field377) {
                        Model var6 = this.field381;
                        var6.method133(this.field380 - super.field309, this.field379 - this.field375, (byte) 1, this.field378 - super.field308);
                        if (super.field354 == 512) {
                            var6.method131(this.field362);
                            var6.method131(this.field362);
                            var6.method131(this.field362);
                        } else if (super.field354 == 1024) {
                            var6.method131(this.field362);
                            var6.method131(this.field362);
                        } else if (super.field354 == 1536) {
                            var6.method131(this.field362);
                        }
                        Model[] var7 = new Model[] { var2, var6 };
                        var2 = new Model((byte) -80, true, var7, 2);
                        if (super.field354 == 512) {
                            var6.method131(this.field362);
                        } else if (super.field354 == 1024) {
                            var6.method131(this.field362);
                            var6.method131(this.field362);
                        } else if (super.field354 == 1536) {
                            var6.method131(this.field362);
                            var6.method131(this.field362);
                            var6.method131(this.field362);
                        }
                        var6.method133(super.field309 - this.field380, this.field375 - this.field379, (byte) 1, super.field308 - this.field378);
                    }
                }
                var2.field490 = true;
                return var2;
            }
        }
    }

    @OriginalMember(owner = "z", name = "c", descriptor = "(I)Leb;")
    public final Model method115(int arg0) {
        long var2 = this.field374;
        int var4 = -1;
        int var5 = -1;
        int var6 = -1;
        int var7 = -1;
        if (super.field335 >= 0 && super.field338 == 0) {
            SeqType var8 = SeqType.field1018[super.field335];
            var4 = var8.field1020[super.field336];
            if (super.field332 >= 0 && super.field332 != super.field313) {
                var5 = SeqType.field1018[super.field332].field1020[super.field333];
            }
            if (var8.field1027 >= 0) {
                var6 = var8.field1027;
                var2 += (long) (var6 - this.field371[5] << 8);
            }
            if (var8.field1028 >= 0) {
                var7 = var8.field1028;
                var2 += (long) (var7 - this.field371[3] << 16);
            }
        } else if (super.field332 >= 0) {
            var4 = SeqType.field1018[super.field332].field1020[super.field333];
        }
        Model var9 = (Model) field387.method103(var2);
        if (var9 == null) {
            Model[] var10 = new Model[12];
            int var11 = 0;
            for (int var12 = 0; var12 < 12; ++var12) {
                int var14 = this.field371[var12];
                if (var7 >= 0 && var12 == 3) {
                    var14 = var7;
                }
                if (var6 >= 0 && var12 == 5) {
                    var14 = var6;
                }
                if (var14 >= 256 && var14 < 512) {
                    var10[var11++] = IdkType.field943[var14 - 256].method320();
                }
                if (var14 >= 512) {
                    ObjType var15 = ObjType.method294(var14 - 512);
                    Model var16 = var15.method300(this.field369, this.field365);
                    if (var16 != null) {
                        var10[var11++] = var16;
                    }
                }
            }
            var9 = new Model(-406, var10, var11);
            for (int var13 = 0; var13 < 5; ++var13) {
                if (this.field372[var13] != 0) {
                    var9.method134(client.field1184[var13][0], client.field1184[var13][this.field372[var13]]);
                    if (var13 == 1) {
                        var9.method134(client.field1482[0], client.field1482[this.field372[var13]]);
                    }
                }
            }
            var9.method127(false);
            var9.method137(64, 850, -30, -50, -30, true);
            field387.method104(var9, var2, false);
        }
        if (this.field386) {
            return var9;
        } else {
            Model var17 = new Model(-406, var9, true);
            if (var4 != -1 && var5 != -1) {
                var17.method129(var4, var5, SeqType.field1018[super.field335].field1024, 584);
            } else if (var4 != -1) {
                var17.method128(var4, 5565);
            }
            var17.method124(6);
            var17.field489 = null;
            while (arg0 >= 0) {
                for (int var18 = 1; var18 > 0; ++var18) {
                }
            }
            var17.field488 = null;
            return var17;
        }
    }

    @OriginalMember(owner = "z", name = "a", descriptor = "(B)Leb;")
    public final Model method116(byte arg0) {
        if (!this.field368) {
            return null;
        } else {
            Model[] var2 = new Model[12];
            int var3 = 0;
            for (int var4 = 0; var4 < 12; ++var4) {
                int var9 = this.field371[var4];
                if (var9 >= 256 && var9 < 512) {
                    var2[var3++] = IdkType.field943[var9 - 256].method321(-284);
                }
                if (var9 >= 512) {
                    Model var10 = ObjType.method294(var9 - 512).method301(199, this.field369);
                    if (var10 != null) {
                        var2[var3++] = var10;
                    }
                }
            }
            Model var5 = new Model(-406, var2, var3);
            if (this.field366 == arg0) {
                boolean var6 = false;
            } else {
                for (int var7 = 1; var7 > 0; ++var7) {
                }
            }
            for (int var8 = 0; var8 < 5; ++var8) {
                if (this.field372[var8] != 0) {
                    var5.method134(client.field1184[var8][0], client.field1184[var8][this.field372[var8]]);
                    if (var8 == 1) {
                        var5.method134(client.field1482[0], client.field1482[this.field372[var8]]);
                    }
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "z", name = "b", descriptor = "(I)Z")
    public final boolean method112(int arg0) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        } else {
            return this.field368;
        }
    }
}
