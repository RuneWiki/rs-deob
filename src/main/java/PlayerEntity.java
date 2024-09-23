import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ab")
public class PlayerEntity extends PathingEntity {

    @OriginalMember(owner = "ab", name = "qb", descriptor = "Z")
    private boolean field450 = false;

    @OriginalMember(owner = "ab", name = "rb", descriptor = "I")
    private int field451 = 4697;

    @OriginalMember(owner = "ab", name = "sb", descriptor = "Z")
    private boolean field452 = true;

    @OriginalMember(owner = "ab", name = "tb", descriptor = "I")
    private int field453 = 848;

    @OriginalMember(owner = "ab", name = "ub", descriptor = "Z")
    private boolean field454 = true;

    @OriginalMember(owner = "ab", name = "wb", descriptor = "Z")
    public boolean field456 = false;

    @OriginalMember(owner = "ab", name = "zb", descriptor = "[I")
    public int[] field459 = new int[12];

    @OriginalMember(owner = "ab", name = "Ab", descriptor = "[I")
    public int[] field460 = new int[5];

    @OriginalMember(owner = "ab", name = "Pb", descriptor = "Z")
    public boolean field475 = false;

    @OriginalMember(owner = "ab", name = "Qb", descriptor = "J")
    public long field476 = -1L;

    @OriginalMember(owner = "ab", name = "Sb", descriptor = "Ls;")
    public static LruCache field478 = new LruCache(260, 0);

    @OriginalMember(owner = "ab", name = "xb", descriptor = "I")
    public int field457;

    @OriginalMember(owner = "ab", name = "yb", descriptor = "I")
    public int field458;

    @OriginalMember(owner = "ab", name = "Bb", descriptor = "I")
    public int field461;

    @OriginalMember(owner = "ab", name = "Cb", descriptor = "I")
    public int field462;

    @OriginalMember(owner = "ab", name = "Eb", descriptor = "I")
    public int field464;

    @OriginalMember(owner = "ab", name = "Fb", descriptor = "I")
    public int field465;

    @OriginalMember(owner = "ab", name = "Gb", descriptor = "I")
    public int field466;

    @OriginalMember(owner = "ab", name = "Hb", descriptor = "I")
    public int field467;

    @OriginalMember(owner = "ab", name = "Ib", descriptor = "I")
    public int field468;

    @OriginalMember(owner = "ab", name = "Jb", descriptor = "I")
    public int field469;

    @OriginalMember(owner = "ab", name = "Lb", descriptor = "I")
    public int field471;

    @OriginalMember(owner = "ab", name = "Mb", descriptor = "I")
    public int field472;

    @OriginalMember(owner = "ab", name = "Nb", descriptor = "I")
    public int field473;

    @OriginalMember(owner = "ab", name = "Ob", descriptor = "I")
    public int field474;

    @OriginalMember(owner = "ab", name = "Db", descriptor = "J")
    public long field463;

    @OriginalMember(owner = "ab", name = "Kb", descriptor = "Leb;")
    public Model field470;

    @OriginalMember(owner = "ab", name = "Rb", descriptor = "Lgc;")
    public NpcType field477;

    @OriginalMember(owner = "ab", name = "vb", descriptor = "Ljava/lang/String;")
    public String field455;

    @OriginalMember(owner = "ab", name = "a", descriptor = "(BLlb;)V")
    public final void method116(byte arg0, Packet arg1) {
        arg1.field702 = 0;
        this.field457 = arg1.method224();
        this.field458 = arg1.method224();
        this.field477 = null;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg1.method224();
            if (var4 == 0) {
                this.field459[var3] = 0;
            } else {
                int var5 = arg1.method224();
                this.field459[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field459[0] == 65535) {
                    this.field477 = NpcType.method335(arg1.method226());
                    break;
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var10 = arg1.method224();
            if (var10 < 0 || var10 >= client.field1538[var6].length) {
                var10 = 0;
            }
            this.field460[var6] = var10;
        }
        super.field398 = arg1.method226();
        if (super.field398 == 65535) {
            super.field398 = -1;
        }
        super.field399 = arg1.method226();
        if (super.field399 == 65535) {
            super.field399 = -1;
        }
        super.field400 = arg1.method226();
        if (super.field400 == 65535) {
            super.field400 = -1;
        }
        super.field401 = arg1.method226();
        if (super.field401 == 65535) {
            super.field401 = -1;
        }
        super.field402 = arg1.method226();
        if (super.field402 == 65535) {
            super.field402 = -1;
        }
        super.field403 = arg1.method226();
        if (arg0 == 1) {
            boolean var7 = false;
        } else {
            this.field454 = !this.field454;
        }
        if (super.field403 == 65535) {
            super.field403 = -1;
        }
        super.field404 = arg1.method226();
        if (super.field404 == 65535) {
            super.field404 = -1;
        }
        this.field455 = JString.method299(584, JString.method296(-206, arg1.method230(203)));
        this.field461 = arg1.method224();
        this.field462 = arg1.method226();
        this.field456 = true;
        this.field463 = 0L;
        for (int var8 = 0; var8 < 12; ++var8) {
            this.field463 <<= 4;
            if (this.field459[var8] >= 256) {
                this.field463 += (long) (this.field459[var8] - 256);
            }
        }
        if (this.field459[0] >= 256) {
            this.field463 += (long) (this.field459[0] - 256 >> 4);
        }
        if (this.field459[1] >= 256) {
            this.field463 += (long) (this.field459[1] - 256 >> 8);
        }
        for (int var9 = 0; var9 < 5; ++var9) {
            this.field463 <<= 3;
            this.field463 += (long) this.field460[var9];
        }
        this.field463 <<= 1;
        this.field463 += (long) this.field457;
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(I)Leb;")
    public final Model method109(int arg0) {
        if (!this.field456) {
            return null;
        } else {
            Model var2 = this.method117((byte) 40);
            if (var2 == null) {
                return null;
            } else {
                super.field439 = var2.field389;
                if (arg0 != 0) {
                    this.field450 = !this.field450;
                }
                var2.field565 = true;
                if (this.field475) {
                    return var2;
                } else {
                    if (super.field426 != -1 && super.field427 != -1) {
                        SpotAnimType var3 = SpotAnimType.field1153[super.field426];
                        Model var4 = var3.method379();
                        if (var4 != null) {
                            Model var5 = new Model(false, true, var4, AnimFrame.method48(super.field427, 681), 9);
                            var5.method138(0, -super.field430, 0, -97);
                            var5.method132(1);
                            var5.method133(var3.field1157.field1133[super.field427], false);
                            var5.field564 = null;
                            var5.field563 = null;
                            if (var3.field1160 != 128 || var3.field1161 != 128) {
                                var5.method141(var3.field1160, var3.field1161, 9, var3.field1160);
                            }
                            var5.method142(var3.field1163 + 64, var3.field1164 + 850, -30, -50, -30, true);
                            Model[] var6 = new Model[] { var2, var5 };
                            var2 = new Model(-638, true, var6, 2);
                        }
                    }
                    if (this.field470 != null) {
                        if (client.field1610 >= this.field466) {
                            this.field470 = null;
                        }
                        if (client.field1610 >= this.field465 && client.field1610 < this.field466) {
                            Model var7 = this.field470;
                            var7.method138(this.field467 - super.field393, this.field468 - this.field464, this.field469 - super.field394, -97);
                            if (super.field440 == 512) {
                                var7.method136((byte) 4);
                                var7.method136((byte) 4);
                                var7.method136((byte) 4);
                            } else if (super.field440 == 1024) {
                                var7.method136((byte) 4);
                                var7.method136((byte) 4);
                            } else if (super.field440 == 1536) {
                                var7.method136((byte) 4);
                            }
                            Model[] var8 = new Model[] { var2, var7 };
                            var2 = new Model(-638, true, var8, 2);
                            if (super.field440 == 512) {
                                var7.method136((byte) 4);
                            } else if (super.field440 == 1024) {
                                var7.method136((byte) 4);
                                var7.method136((byte) 4);
                            } else if (super.field440 == 1536) {
                                var7.method136((byte) 4);
                                var7.method136((byte) 4);
                                var7.method136((byte) 4);
                            }
                            var7.method138(super.field393 - this.field467, this.field464 - this.field468, super.field394 - this.field469, -97);
                        }
                    }
                    var2.field565 = true;
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(B)Leb;")
    private final Model method117(byte arg0) {
        if (arg0 != 40) {
            throw new NullPointerException();
        } else if (this.field477 != null) {
            int var2 = -1;
            if (super.field421 >= 0 && super.field424 == 0) {
                var2 = SeqType.field1131[super.field421].field1133[super.field422];
            } else if (super.field418 >= 0) {
                var2 = SeqType.field1131[super.field418].field1133[super.field419];
            }
            return this.field477.method337(var2, (int[]) null, 0, -1);
        } else {
            long var4 = this.field463;
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (super.field421 >= 0 && super.field424 == 0) {
                SeqType var10 = SeqType.field1131[super.field421];
                var6 = var10.field1133[super.field422];
                if (super.field418 >= 0 && super.field418 != super.field398) {
                    var7 = SeqType.field1131[super.field418].field1133[super.field419];
                }
                if (var10.field1140 >= 0) {
                    var8 = var10.field1140;
                    var4 += (long) (var8 - this.field459[5] << 8);
                }
                if (var10.field1141 >= 0) {
                    var9 = var10.field1141;
                    var4 += (long) (var9 - this.field459[3] << 16);
                }
            } else if (super.field418 >= 0) {
                var6 = SeqType.field1131[super.field418].field1133[super.field419];
            }
            Model var11 = (Model) field478.method101(var4);
            if (var11 == null) {
                boolean var12 = false;
                for (int var13 = 0; var13 < 12; ++var13) {
                    int var14 = this.field459[var13];
                    if (var9 >= 0 && var13 == 3) {
                        var14 = var9;
                    }
                    if (var8 >= 0 && var13 == 5) {
                        var14 = var8;
                    }
                    if (var14 >= 256 && var14 < 512 && !IdkType.field1110[var14 - 256].method370(0)) {
                        var12 = true;
                    }
                    if (var14 >= 512 && !ObjType.method341(var14 - 512).method348(this.field457, -344)) {
                        var12 = true;
                    }
                }
                if (var12) {
                    if (this.field476 != -1L) {
                        var11 = (Model) field478.method101(this.field476);
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
                    int var19 = this.field459[var17];
                    if (var9 >= 0 && var17 == 3) {
                        var19 = var9;
                    }
                    if (var8 >= 0 && var17 == 5) {
                        var19 = var8;
                    }
                    if (var19 >= 256 && var19 < 512) {
                        Model var20 = IdkType.field1110[var19 - 256].method371((byte) 68);
                        if (var20 != null) {
                            var15[var16++] = var20;
                        }
                    }
                    if (var19 >= 512) {
                        Model var21 = ObjType.method341(var19 - 512).method349(this.field457, (byte) 7);
                        if (var21 != null) {
                            var15[var16++] = var21;
                        }
                    }
                }
                var11 = new Model(var16, var15, this.field451);
                for (int var18 = 0; var18 < 5; ++var18) {
                    if (this.field460[var18] != 0) {
                        var11.method139(client.field1538[var18][0], client.field1538[var18][this.field460[var18]]);
                        if (var18 == 1) {
                            var11.method139(client.field1216[0], client.field1216[this.field460[var18]]);
                        }
                    }
                }
                var11.method132(1);
                var11.method142(64, 850, -30, -50, -30, true);
                field478.method102(var4, var11, this.field453);
                this.field476 = var4;
            }
            if (this.field475) {
                return var11;
            } else {
                Model var22 = Model.field527;
                var22.method127(AnimFrame.method48(var6, 681) & AnimFrame.method48(var7, 681), var11, 8);
                if (var6 != -1 && var7 != -1) {
                    var22.method134(var7, SeqType.field1131[super.field421].field1137, var6, true);
                } else if (var6 != -1) {
                    var22.method133(var6, false);
                }
                var22.method129(this.field452);
                var22.field564 = null;
                var22.field563 = null;
                return var22;
            }
        }
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(Z)Leb;")
    public final Model method118(boolean arg0) {
        if (!this.field456) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var13 = this.field459[var3];
                if (var13 >= 256 && var13 < 512 && !IdkType.field1110[var13 - 256].method372((byte) 3)) {
                    var2 = true;
                }
                if (var13 >= 512 && !ObjType.method341(var13 - 512).method350(this.field457, -46)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                Model[] var4 = new Model[12];
                int var5 = 0;
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var10 = this.field459[var6];
                    if (var10 >= 256 && var10 < 512) {
                        Model var11 = IdkType.field1110[var10 - 256].method373(0);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                    if (var10 >= 512) {
                        Model var12 = ObjType.method341(var10 - 512).method351(this.field457, 3216);
                        if (var12 != null) {
                            var4[var5++] = var12;
                        }
                    }
                }
                if (arg0) {
                    for (int var7 = 1; var7 > 0; ++var7) {
                    }
                }
                Model var8 = new Model(var5, var4, this.field451);
                for (int var9 = 0; var9 < 5; ++var9) {
                    if (this.field460[var9] != 0) {
                        var8.method139(client.field1538[var9][0], client.field1538[var9][this.field460[var9]]);
                        if (var9 == 1) {
                            var8.method139(client.field1216[0], client.field1216[this.field460[var9]]);
                        }
                    }
                }
                return var8;
            }
        }
    }

    @OriginalMember(owner = "ab", name = "c", descriptor = "(I)Z")
    public final boolean method113(int arg0) {
        if (arg0 >= 0) {
            this.field453 = -161;
        }
        return this.field456;
    }
}
