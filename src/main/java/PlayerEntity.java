import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("y")
public class PlayerEntity extends PathingEntity {

    @OriginalMember(owner = "y", name = "eb", descriptor = "I")
    private int field332 = 1;

    @OriginalMember(owner = "y", name = "fb", descriptor = "I")
    private int field333 = -612;

    @OriginalMember(owner = "y", name = "gb", descriptor = "I")
    private int field334 = 8;

    @OriginalMember(owner = "y", name = "hb", descriptor = "B")
    private byte field335 = 2;

    @OriginalMember(owner = "y", name = "jb", descriptor = "Z")
    public boolean field337 = false;

    @OriginalMember(owner = "y", name = "mb", descriptor = "[I")
    public int[] field340 = new int[13];

    @OriginalMember(owner = "y", name = "nb", descriptor = "[I")
    public int[] field341 = new int[5];

    @OriginalMember(owner = "y", name = "Bb", descriptor = "Z")
    public boolean field355 = false;

    @OriginalMember(owner = "y", name = "Cb", descriptor = "Lr;")
    public static LruCache field356 = new LruCache(-947, 200);

    @OriginalMember(owner = "y", name = "kb", descriptor = "I")
    public int field338;

    @OriginalMember(owner = "y", name = "lb", descriptor = "I")
    public int field339;

    @OriginalMember(owner = "y", name = "ob", descriptor = "I")
    public int field342;

    @OriginalMember(owner = "y", name = "qb", descriptor = "I")
    public int field344;

    @OriginalMember(owner = "y", name = "rb", descriptor = "I")
    public int field345;

    @OriginalMember(owner = "y", name = "sb", descriptor = "I")
    public int field346;

    @OriginalMember(owner = "y", name = "tb", descriptor = "I")
    public int field347;

    @OriginalMember(owner = "y", name = "ub", descriptor = "I")
    public int field348;

    @OriginalMember(owner = "y", name = "vb", descriptor = "I")
    public int field349;

    @OriginalMember(owner = "y", name = "xb", descriptor = "I")
    public int field351;

    @OriginalMember(owner = "y", name = "yb", descriptor = "I")
    public int field352;

    @OriginalMember(owner = "y", name = "zb", descriptor = "I")
    public int field353;

    @OriginalMember(owner = "y", name = "Ab", descriptor = "I")
    public int field354;

    @OriginalMember(owner = "y", name = "pb", descriptor = "J")
    public long field343;

    @OriginalMember(owner = "y", name = "wb", descriptor = "Ldb;")
    public Model field350;

    @OriginalMember(owner = "y", name = "ib", descriptor = "Ljava/lang/String;")
    public String field336;

    @OriginalMember(owner = "y", name = "a", descriptor = "(Ljb;I)V")
    public final void method95(Packet arg0, int arg1) {
        arg0.field586 = 0;
        this.field338 = arg0.method185();
        this.field339 = arg0.method185();
        if (arg1 < 0) {
            for (int var3 = 0; var3 < 13; ++var3) {
                int var8 = arg0.method185();
                if (var8 == 0) {
                    this.field340[var3] = 0;
                } else {
                    int var9 = arg0.method185();
                    this.field340[var3] = (var8 << 8) + var9;
                }
            }
            for (int var4 = 0; var4 < 5; ++var4) {
                int var7 = arg0.method185();
                if (var7 < 0 || var7 >= client.field1201[var4].length) {
                    var7 = 0;
                }
                this.field341[var4] = var7;
            }
            super.field289 = arg0.method187();
            super.field290 = arg0.method187();
            super.field285 = arg0.method187();
            super.field286 = arg0.method187();
            super.field287 = arg0.method187();
            super.field288 = arg0.method187();
            this.field336 = JString.method230(JString.method227((byte) -89, arg0.method191(1)), -591);
            this.field342 = arg0.method185();
            this.field337 = true;
            this.field343 = 0L;
            for (int var5 = 0; var5 < 12; ++var5) {
                this.field343 <<= 4;
                if (this.field340[var5] >= 256) {
                    this.field343 += (long) (this.field340[var5] - 256);
                }
            }
            for (int var6 = 0; var6 < 5; ++var6) {
                this.field343 <<= 3;
                this.field343 += (long) this.field341[var6];
            }
            this.field343 <<= 1;
            this.field343 += (long) this.field338;
        }
    }

    @OriginalMember(owner = "y", name = "a", descriptor = "(I)Ldb;")
    public final Model method90(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        } else if (!this.field337) {
            return null;
        } else {
            Model var2 = this.method96(39767);
            super.field324 = var2.field447;
            if (this.field355) {
                return var2;
            } else {
                if (super.field311 != -1 && super.field312 != -1) {
                    SpotAnimType var3 = SpotAnimType.field944[super.field311];
                    Model var4 = new Model(true, !var3.field948, var3.method283(), 440, true, false);
                    var4.method114(this.field334, 0, 0, -super.field315);
                    var4.method108(0);
                    var4.method109(false, var3.field947.field929[super.field312]);
                    var4.field455 = null;
                    var4.field454 = null;
                    var4.method118(64, 850, -30, -50, -30, true);
                    Model[] var5 = new Model[] { var2, var4 };
                    var2 = new Model(true, var5, 20525, 2);
                }
                if (this.field350 != null) {
                    if (client.field994 >= this.field346) {
                        this.field350 = null;
                    }
                    if (client.field994 >= this.field345 && client.field994 < this.field346) {
                        Model var6 = this.field350;
                        var6.method114(this.field334, this.field349 - super.field281, this.field347 - super.field280, this.field348 - this.field344);
                        if (super.field325 == 512) {
                            var6.method112(0);
                            var6.method112(0);
                            var6.method112(0);
                        } else if (super.field325 == 1024) {
                            var6.method112(0);
                            var6.method112(0);
                        } else if (super.field325 == 1536) {
                            var6.method112(0);
                        }
                        Model[] var7 = new Model[] { var2, var6 };
                        var2 = new Model(true, var7, 20525, 2);
                        if (super.field325 == 512) {
                            var6.method112(0);
                        } else if (super.field325 == 1024) {
                            var6.method112(0);
                            var6.method112(0);
                        } else if (super.field325 == 1536) {
                            var6.method112(0);
                            var6.method112(0);
                            var6.method112(0);
                        }
                        var6.method114(this.field334, super.field281 - this.field349, super.field280 - this.field347, this.field344 - this.field348);
                    }
                }
                return var2;
            }
        }
    }

    @OriginalMember(owner = "y", name = "b", descriptor = "(I)Ldb;")
    public final Model method96(int arg0) {
        long var2 = this.field343;
        int var4 = -1;
        int var5 = -1;
        int var6 = -1;
        int var7 = -1;
        if (super.field306 >= 0 && super.field309 == 0) {
            SeqType var8 = SeqType.field927[super.field306];
            var4 = var8.field929[super.field307];
            if (super.field303 >= 0 && super.field303 != super.field289) {
                var5 = SeqType.field927[super.field303].field929[super.field304];
            }
            if (var8.field936 >= 0) {
                var6 = var8.field936;
                var2 += (long) (var6 - this.field340[5] << 8);
            }
            if (var8.field937 >= 0) {
                var7 = var8.field937;
                var2 += (long) (var6 - this.field340[3] << 16);
            }
        } else if (super.field303 >= 0) {
            var4 = SeqType.field927[super.field303].field929[super.field304];
        }
        Model var9 = (Model) field356.method84(var2);
        if (var9 == null) {
            Model[] var10 = new Model[13];
            int var11 = 0;
            for (int var12 = 0; var12 < 13; ++var12) {
                int var14 = this.field340[var12];
                if (var7 >= 0 && var12 == 3) {
                    var14 = var7;
                }
                if (var6 >= 0 && var12 == 5) {
                    var14 = var6;
                }
                if (var14 >= 256 && var14 < 512) {
                    var10[var11++] = IdkType.field852[var14 - 256].method273();
                }
                if (var14 >= 512) {
                    ObjType var15 = ObjType.method249(var14 - 512);
                    Model var16 = var15.method254(this.field338, (byte) 1);
                    if (var16 != null) {
                        var10[var11++] = var16;
                    }
                }
            }
            var9 = new Model(var11, false, var10);
            for (int var13 = 0; var13 < 5; ++var13) {
                if (this.field341[var13] != 0) {
                    var9.method115(client.field1201[var13][0], client.field1201[var13][this.field341[var13]]);
                    if (var13 == 1) {
                        var9.method115(client.field988[0], client.field988[this.field341[var13]]);
                    }
                }
            }
            var9.method108(0);
            var9.method118(64, 850, -30, -50, -30, true);
            field356.method85(var9, var2, this.field335);
        }
        if (this.field355) {
            return var9;
        } else {
            Model var17 = new Model(true, false, var9);
            if (var4 != -1 && var5 != -1) {
                var17.method110(var4, var5, SeqType.field927[super.field306].field933, this.field333);
            } else if (var4 != -1) {
                var17.method109(false, var4);
            }
            var17.method106(false);
            var17.field455 = null;
            if (arg0 != 39767) {
                for (int var18 = 1; var18 > 0; ++var18) {
                }
            }
            var17.field454 = null;
            return var17;
        }
    }

    @OriginalMember(owner = "y", name = "c", descriptor = "(I)Ldb;")
    public final Model method97(int arg0) {
        if (!this.field337) {
            return null;
        } else {
            Model[] var2 = new Model[13];
            int var3 = 0;
            for (int var4 = 0; var4 < 13; ++var4) {
                int var7 = this.field340[var4];
                if (var7 >= 256 && var7 < 512) {
                    var2[var3++] = IdkType.field852[var7 - 256].method274(-502);
                }
                if (var7 >= 512) {
                    Model var8 = ObjType.method249(var7 - 512).method255(this.field338, -39571);
                    if (var8 != null) {
                        var2[var3++] = var8;
                    }
                }
            }
            if (this.field332 != arg0) {
                throw new NullPointerException();
            } else {
                Model var5 = new Model(var3, false, var2);
                for (int var6 = 0; var6 < 5; ++var6) {
                    if (this.field341[var6] != 0) {
                        var5.method115(client.field1201[var6][0], client.field1201[var6][this.field341[var6]]);
                        if (var6 == 1) {
                            var5.method115(client.field988[0], client.field988[this.field341[var6]]);
                        }
                    }
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "y", name = "d", descriptor = "(I)Z")
    public final boolean method98(int arg0) {
        if (arg0 != -29424) {
            throw new NullPointerException();
        } else {
            return this.field337;
        }
    }
}
