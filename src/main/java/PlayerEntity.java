import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("z")
public class PlayerEntity extends PathingEntity {

    @OriginalMember(owner = "z", name = "gb", descriptor = "Z")
    private boolean field348 = false;

    @OriginalMember(owner = "z", name = "ib", descriptor = "Z")
    public boolean field350 = false;

    @OriginalMember(owner = "z", name = "lb", descriptor = "[I")
    public int[] field353 = new int[13];

    @OriginalMember(owner = "z", name = "mb", descriptor = "[I")
    public int[] field354 = new int[5];

    @OriginalMember(owner = "z", name = "Ab", descriptor = "Z")
    public boolean field368 = false;

    @OriginalMember(owner = "z", name = "Bb", descriptor = "Ls;")
    public static LruCache field369 = new LruCache(-24094, 200);

    @OriginalMember(owner = "z", name = "fb", descriptor = "I")
    private int field347;

    @OriginalMember(owner = "z", name = "jb", descriptor = "I")
    public int field351;

    @OriginalMember(owner = "z", name = "kb", descriptor = "I")
    public int field352;

    @OriginalMember(owner = "z", name = "nb", descriptor = "I")
    public int field355;

    @OriginalMember(owner = "z", name = "pb", descriptor = "I")
    public int field357;

    @OriginalMember(owner = "z", name = "qb", descriptor = "I")
    public int field358;

    @OriginalMember(owner = "z", name = "rb", descriptor = "I")
    public int field359;

    @OriginalMember(owner = "z", name = "sb", descriptor = "I")
    public int field360;

    @OriginalMember(owner = "z", name = "tb", descriptor = "I")
    public int field361;

    @OriginalMember(owner = "z", name = "ub", descriptor = "I")
    public int field362;

    @OriginalMember(owner = "z", name = "wb", descriptor = "I")
    public int field364;

    @OriginalMember(owner = "z", name = "xb", descriptor = "I")
    public int field365;

    @OriginalMember(owner = "z", name = "yb", descriptor = "I")
    public int field366;

    @OriginalMember(owner = "z", name = "zb", descriptor = "I")
    public int field367;

    @OriginalMember(owner = "z", name = "ob", descriptor = "J")
    public long field356;

    @OriginalMember(owner = "z", name = "vb", descriptor = "Leb;")
    public Model field363;

    @OriginalMember(owner = "z", name = "hb", descriptor = "Ljava/lang/String;")
    public String field349;

    @OriginalMember(owner = "z", name = "a", descriptor = "(Lkb;Z)V")
    public final void method110(Packet arg0, boolean arg1) {
        arg0.field606 = 0;
        this.field351 = arg0.method201();
        this.field352 = arg0.method201();
        for (int var3 = 0; var3 < 13; ++var3) {
            int var8 = arg0.method201();
            if (var8 == 0) {
                this.field353[var3] = 0;
            } else {
                int var9 = arg0.method201();
                this.field353[var3] = (var8 << 8) + var9;
            }
        }
        for (int var4 = 0; var4 < 5; ++var4) {
            int var7 = arg0.method201();
            if (var7 < 0 || var7 >= client.field1293[var4].length) {
                var7 = 0;
            }
            this.field354[var4] = var7;
        }
        super.field297 = arg0.method203();
        if (super.field297 == 65535) {
            super.field297 = -1;
        }
        super.field298 = arg0.method203();
        if (super.field298 == 65535) {
            super.field298 = -1;
        }
        super.field299 = arg0.method203();
        if (super.field299 == 65535) {
            super.field299 = -1;
        }
        super.field300 = arg0.method203();
        if (!arg1) {
            this.field347 = -214;
        }
        if (super.field300 == 65535) {
            super.field300 = -1;
        }
        super.field301 = arg0.method203();
        if (super.field301 == 65535) {
            super.field301 = -1;
        }
        super.field302 = arg0.method203();
        if (super.field302 == 65535) {
            super.field302 = -1;
        }
        super.field303 = arg0.method203();
        if (super.field303 == 65535) {
            super.field303 = -1;
        }
        this.field349 = JString.method246(-580, JString.method244(true, arg0.method207(720)));
        this.field355 = arg0.method201();
        this.field350 = true;
        this.field356 = 0L;
        for (int var5 = 0; var5 < 12; ++var5) {
            this.field356 <<= 4;
            if (this.field353[var5] >= 256) {
                this.field356 += (long) (this.field353[var5] - 256);
            }
        }
        if (this.field353[0] >= 256) {
            this.field356 += (long) (this.field353[0] - 256 >> 4);
        }
        if (this.field353[1] >= 256) {
            this.field356 += (long) (this.field353[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            this.field356 <<= 3;
            this.field356 += (long) this.field354[var6];
        }
        this.field356 <<= 1;
        this.field356 += (long) this.field351;
    }

    @OriginalMember(owner = "z", name = "a", descriptor = "(I)Leb;")
    public final Model method105(int arg0) {
        if (!this.field350) {
            return null;
        } else {
            Model var2 = this.method111(0);
            super.field337 = var2.field461;
            if (arg0 != 0) {
                this.field348 = !this.field348;
            }
            var2.field470 = true;
            if (this.field368) {
                return var2;
            } else {
                if (super.field324 != -1 && super.field325 != -1) {
                    SpotAnimType var3 = SpotAnimType.field952[super.field324];
                    Model var4 = new Model(-428, true, var3.method299(), true, false, !var3.field956);
                    var4.method128(0, 0, 0, -super.field328);
                    var4.method122((byte) 3);
                    var4.method123(7, var3.field955.field940[super.field325]);
                    var4.field469 = null;
                    var4.field468 = null;
                    var4.method132(64, 850, -30, -50, -30, true);
                    Model[] var5 = new Model[] { var2, var4 };
                    var2 = new Model(true, true, var5, 2);
                }
                if (this.field363 != null) {
                    if (client.field1114 >= this.field359) {
                        this.field363 = null;
                    }
                    if (client.field1114 >= this.field358 && client.field1114 < this.field359) {
                        Model var6 = this.field363;
                        var6.method128(this.field362 - super.field293, 0, this.field360 - super.field292, this.field361 - this.field357);
                        if (super.field338 == 512) {
                            var6.method126((byte) 0);
                            var6.method126((byte) 0);
                            var6.method126((byte) 0);
                        } else if (super.field338 == 1024) {
                            var6.method126((byte) 0);
                            var6.method126((byte) 0);
                        } else if (super.field338 == 1536) {
                            var6.method126((byte) 0);
                        }
                        Model[] var7 = new Model[] { var2, var6 };
                        var2 = new Model(true, true, var7, 2);
                        if (super.field338 == 512) {
                            var6.method126((byte) 0);
                        } else if (super.field338 == 1024) {
                            var6.method126((byte) 0);
                            var6.method126((byte) 0);
                        } else if (super.field338 == 1536) {
                            var6.method126((byte) 0);
                            var6.method126((byte) 0);
                            var6.method126((byte) 0);
                        }
                        var6.method128(super.field293 - this.field362, 0, super.field292 - this.field360, this.field357 - this.field361);
                    }
                }
                var2.field470 = true;
                return var2;
            }
        }
    }

    @OriginalMember(owner = "z", name = "c", descriptor = "(I)Leb;")
    public final Model method111(int arg0) {
        long var2 = this.field356;
        int var4 = -1;
        int var5 = -1;
        int var6 = -1;
        int var7 = -1;
        if (arg0 != 0) {
            this.field348 = !this.field348;
        }
        if (super.field319 >= 0 && super.field322 == 0) {
            SeqType var8 = SeqType.field938[super.field319];
            var4 = var8.field940[super.field320];
            if (super.field316 >= 0 && super.field316 != super.field297) {
                var5 = SeqType.field938[super.field316].field940[super.field317];
            }
            if (var8.field947 >= 0) {
                var6 = var8.field947;
                var2 += (long) (var6 - this.field353[5] << 8);
            }
            if (var8.field948 >= 0) {
                var7 = var8.field948;
                var2 += (long) (var7 - this.field353[3] << 16);
            }
        } else if (super.field316 >= 0) {
            var4 = SeqType.field938[super.field316].field940[super.field317];
        }
        Model var9 = (Model) field369.method99(var2);
        if (var9 == null) {
            Model[] var10 = new Model[13];
            int var11 = 0;
            for (int var12 = 0; var12 < 13; ++var12) {
                int var14 = this.field353[var12];
                if (var7 >= 0 && var12 == 3) {
                    var14 = var7;
                }
                if (var6 >= 0 && var12 == 5) {
                    var14 = var6;
                }
                if (var14 >= 256 && var14 < 512) {
                    var10[var11++] = IdkType.field863[var14 - 256].method289();
                }
                if (var14 >= 512) {
                    ObjType var15 = ObjType.method265(var14 - 512);
                    Model var16 = var15.method270(92, this.field351);
                    if (var16 != null) {
                        var10[var11++] = var16;
                    }
                }
            }
            var9 = new Model(false, var11, var10);
            for (int var13 = 0; var13 < 5; ++var13) {
                if (this.field354[var13] != 0) {
                    var9.method129(client.field1293[var13][0], client.field1293[var13][this.field354[var13]]);
                    if (var13 == 1) {
                        var9.method129(client.field1019[0], client.field1019[this.field354[var13]]);
                    }
                }
            }
            var9.method122((byte) 3);
            var9.method132(64, 850, -30, -50, -30, true);
            field369.method100(var2, 7, var9);
        }
        if (this.field368) {
            return var9;
        } else {
            Model var17 = new Model(false, true, var9);
            if (var4 != -1 && var5 != -1) {
                var17.method124(var4, 2, SeqType.field938[super.field319].field944, var5);
            } else if (var4 != -1) {
                var17.method123(7, var4);
            }
            var17.method120(569);
            var17.field469 = null;
            var17.field468 = null;
            return var17;
        }
    }

    @OriginalMember(owner = "z", name = "a", descriptor = "(Z)Leb;")
    public final Model method112(boolean arg0) {
        if (!this.field350) {
            return null;
        } else {
            Model[] var2 = new Model[13];
            int var3 = 0;
            if (!arg0) {
                throw new NullPointerException();
            } else {
                for (int var4 = 0; var4 < 13; ++var4) {
                    int var7 = this.field353[var4];
                    if (var7 >= 256 && var7 < 512) {
                        var2[var3++] = IdkType.field863[var7 - 256].method290(0);
                    }
                    if (var7 >= 512) {
                        Model var8 = ObjType.method265(var7 - 512).method271((byte) 107, this.field351);
                        if (var8 != null) {
                            var2[var3++] = var8;
                        }
                    }
                }
                Model var5 = new Model(false, var3, var2);
                for (int var6 = 0; var6 < 5; ++var6) {
                    if (this.field354[var6] != 0) {
                        var5.method129(client.field1293[var6][0], client.field1293[var6][this.field354[var6]]);
                        if (var6 == 1) {
                            var5.method129(client.field1019[0], client.field1019[this.field354[var6]]);
                        }
                    }
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "z", name = "b", descriptor = "(I)Z")
    public final boolean method108(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        } else {
            return this.field350;
        }
    }
}
