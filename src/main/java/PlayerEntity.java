import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ab")
public class PlayerEntity extends PathingEntity {

    @OriginalMember(owner = "ab", name = "rb", descriptor = "I")
    private int field455 = -12792;

    @OriginalMember(owner = "ab", name = "sb", descriptor = "I")
    private int field456 = -582;

    @OriginalMember(owner = "ab", name = "ub", descriptor = "Z")
    public boolean field458 = false;

    @OriginalMember(owner = "ab", name = "xb", descriptor = "[I")
    public int[] field461 = new int[12];

    @OriginalMember(owner = "ab", name = "yb", descriptor = "[I")
    public int[] field462 = new int[5];

    @OriginalMember(owner = "ab", name = "Nb", descriptor = "Z")
    public boolean field477 = false;

    @OriginalMember(owner = "ab", name = "Ob", descriptor = "J")
    public long field478 = -1L;

    @OriginalMember(owner = "ab", name = "Qb", descriptor = "Ls;")
    public static LruCache field480 = new LruCache(260, 0);

    @OriginalMember(owner = "ab", name = "qb", descriptor = "I")
    private int field454;

    @OriginalMember(owner = "ab", name = "vb", descriptor = "I")
    public int field459;

    @OriginalMember(owner = "ab", name = "wb", descriptor = "I")
    public int field460;

    @OriginalMember(owner = "ab", name = "zb", descriptor = "I")
    public int field463;

    @OriginalMember(owner = "ab", name = "Ab", descriptor = "I")
    public int field464;

    @OriginalMember(owner = "ab", name = "Cb", descriptor = "I")
    public int field466;

    @OriginalMember(owner = "ab", name = "Db", descriptor = "I")
    public int field467;

    @OriginalMember(owner = "ab", name = "Eb", descriptor = "I")
    public int field468;

    @OriginalMember(owner = "ab", name = "Fb", descriptor = "I")
    public int field469;

    @OriginalMember(owner = "ab", name = "Gb", descriptor = "I")
    public int field470;

    @OriginalMember(owner = "ab", name = "Hb", descriptor = "I")
    public int field471;

    @OriginalMember(owner = "ab", name = "Jb", descriptor = "I")
    public int field473;

    @OriginalMember(owner = "ab", name = "Kb", descriptor = "I")
    public int field474;

    @OriginalMember(owner = "ab", name = "Lb", descriptor = "I")
    public int field475;

    @OriginalMember(owner = "ab", name = "Mb", descriptor = "I")
    public int field476;

    @OriginalMember(owner = "ab", name = "Bb", descriptor = "J")
    public long field465;

    @OriginalMember(owner = "ab", name = "Ib", descriptor = "Leb;")
    public Model field472;

    @OriginalMember(owner = "ab", name = "Pb", descriptor = "Lgc;")
    public NpcType field479;

    @OriginalMember(owner = "ab", name = "tb", descriptor = "Ljava/lang/String;")
    public String field457;

    @OriginalMember(owner = "ab", name = "a", descriptor = "(Llb;I)V")
    public final void method116(Packet arg0, int arg1) {
        arg0.field709 = 0;
        this.field459 = arg0.method224();
        this.field460 = arg0.method224();
        this.field479 = null;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg0.method224();
            if (var4 == 0) {
                this.field461[var3] = 0;
            } else {
                int var5 = arg0.method224();
                this.field461[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field461[0] == 65535) {
                    this.field479 = NpcType.method335(arg0.method226());
                    break;
                }
            }
        }
        int var6 = 2 / arg1;
        for (int var7 = 0; var7 < 5; ++var7) {
            int var10 = arg0.method224();
            if (var10 < 0 || var10 >= client.field1657[var7].length) {
                var10 = 0;
            }
            this.field462[var7] = var10;
        }
        super.field402 = arg0.method226();
        if (super.field402 == 65535) {
            super.field402 = -1;
        }
        super.field403 = arg0.method226();
        if (super.field403 == 65535) {
            super.field403 = -1;
        }
        super.field404 = arg0.method226();
        if (super.field404 == 65535) {
            super.field404 = -1;
        }
        super.field405 = arg0.method226();
        if (super.field405 == 65535) {
            super.field405 = -1;
        }
        super.field406 = arg0.method226();
        if (super.field406 == 65535) {
            super.field406 = -1;
        }
        super.field407 = arg0.method226();
        if (super.field407 == 65535) {
            super.field407 = -1;
        }
        super.field408 = arg0.method226();
        if (super.field408 == 65535) {
            super.field408 = -1;
        }
        this.field457 = JString.method299(131, JString.method296(0, arg0.method230(0)));
        this.field463 = arg0.method224();
        this.field464 = arg0.method226();
        this.field458 = true;
        this.field465 = 0L;
        for (int var8 = 0; var8 < 12; ++var8) {
            this.field465 <<= 4;
            if (this.field461[var8] >= 256) {
                this.field465 += (long) (this.field461[var8] - 256);
            }
        }
        if (this.field461[0] >= 256) {
            this.field465 += (long) (this.field461[0] - 256 >> 4);
        }
        if (this.field461[1] >= 256) {
            this.field465 += (long) (this.field461[1] - 256 >> 8);
        }
        for (int var9 = 0; var9 < 5; ++var9) {
            this.field465 <<= 3;
            this.field465 += (long) this.field462[var9];
        }
        this.field465 <<= 1;
        this.field465 += (long) this.field459;
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(Z)Leb;")
    public final Model method109(boolean arg0) {
        if (!this.field458) {
            return null;
        } else {
            Model var2 = this.method117(true);
            if (var2 == null) {
                return null;
            } else {
                super.field443 = var2.field394;
                if (arg0) {
                    this.field455 = -399;
                }
                var2.field569 = true;
                if (this.field477) {
                    return var2;
                } else {
                    if (super.field430 != -1 && super.field431 != -1) {
                        SpotAnimType var3 = SpotAnimType.field1154[super.field430];
                        Model var4 = var3.method379();
                        if (var4 != null) {
                            Model var5 = new Model(true, AnimFrame.method48(super.field431, 0), var4, true, false);
                            var5.method138(0, -super.field434, (byte) 10, 0);
                            var5.method132(9);
                            var5.method133(var3.field1158.field1135[super.field431], -284);
                            var5.field568 = null;
                            var5.field567 = null;
                            if (var3.field1161 != 128 || var3.field1162 != 128) {
                                var5.method141(9, var3.field1161, var3.field1161, var3.field1162);
                            }
                            var5.method142(var3.field1164 + 64, var3.field1165 + 850, -30, -50, -30, true);
                            Model[] var6 = new Model[] { var2, var5 };
                            var2 = new Model(true, (byte) 72, var6, 2);
                        }
                    }
                    if (this.field472 != null) {
                        if (client.field1218 >= this.field468) {
                            this.field472 = null;
                        }
                        if (client.field1218 >= this.field467 && client.field1218 < this.field468) {
                            Model var7 = this.field472;
                            var7.method138(this.field469 - super.field397, this.field470 - this.field466, (byte) 10, this.field471 - super.field398);
                            if (super.field444 == 512) {
                                var7.method136((byte) 89);
                                var7.method136((byte) 89);
                                var7.method136((byte) 89);
                            } else if (super.field444 == 1024) {
                                var7.method136((byte) 89);
                                var7.method136((byte) 89);
                            } else if (super.field444 == 1536) {
                                var7.method136((byte) 89);
                            }
                            Model[] var8 = new Model[] { var2, var7 };
                            var2 = new Model(true, (byte) 72, var8, 2);
                            if (super.field444 == 512) {
                                var7.method136((byte) 89);
                            } else if (super.field444 == 1024) {
                                var7.method136((byte) 89);
                                var7.method136((byte) 89);
                            } else if (super.field444 == 1536) {
                                var7.method136((byte) 89);
                                var7.method136((byte) 89);
                                var7.method136((byte) 89);
                            }
                            var7.method138(super.field397 - this.field469, this.field466 - this.field470, (byte) 10, super.field398 - this.field471);
                        }
                    }
                    var2.field569 = true;
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "ab", name = "c", descriptor = "(Z)Leb;")
    private final Model method117(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field479 != null) {
            int var3 = -1;
            if (super.field425 >= 0 && super.field428 == 0) {
                var3 = SeqType.field1133[super.field425].field1135[super.field426];
            } else if (super.field422 >= 0) {
                var3 = SeqType.field1133[super.field422].field1135[super.field423];
            }
            return this.field479.method337(var3, -1, 811, (int[]) null);
        } else {
            long var5 = this.field465;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            int var10 = -1;
            if (super.field425 >= 0 && super.field428 == 0) {
                SeqType var11 = SeqType.field1133[super.field425];
                var7 = var11.field1135[super.field426];
                if (super.field422 >= 0 && super.field422 != super.field402) {
                    var8 = SeqType.field1133[super.field422].field1135[super.field423];
                }
                if (var11.field1142 >= 0) {
                    var9 = var11.field1142;
                    var5 += (long) (var9 - this.field461[5] << 8);
                }
                if (var11.field1143 >= 0) {
                    var10 = var11.field1143;
                    var5 += (long) (var10 - this.field461[3] << 16);
                }
            } else if (super.field422 >= 0) {
                var7 = SeqType.field1133[super.field422].field1135[super.field423];
            }
            Model var12 = (Model) field480.method101(var5);
            if (var12 == null) {
                boolean var13 = false;
                for (int var14 = 0; var14 < 12; ++var14) {
                    int var15 = this.field461[var14];
                    if (var10 >= 0 && var14 == 3) {
                        var15 = var10;
                    }
                    if (var9 >= 0 && var14 == 5) {
                        var15 = var9;
                    }
                    if (var15 >= 256 && var15 < 512 && !IdkType.field1113[var15 - 256].method370(3)) {
                        var13 = true;
                    }
                    if (var15 >= 512 && !ObjType.method341(var15 - 512).method348(this.field459, 0)) {
                        var13 = true;
                    }
                }
                if (var13) {
                    if (this.field478 != -1L) {
                        var12 = (Model) field480.method101(this.field478);
                    }
                    if (var12 == null) {
                        return null;
                    }
                }
            }
            if (var12 == null) {
                Model[] var16 = new Model[12];
                int var17 = 0;
                for (int var18 = 0; var18 < 12; ++var18) {
                    int var20 = this.field461[var18];
                    if (var10 >= 0 && var18 == 3) {
                        var20 = var10;
                    }
                    if (var9 >= 0 && var18 == 5) {
                        var20 = var9;
                    }
                    if (var20 >= 256 && var20 < 512) {
                        Model var21 = IdkType.field1113[var20 - 256].method371((byte) 0);
                        if (var21 != null) {
                            var16[var17++] = var21;
                        }
                    }
                    if (var20 >= 512) {
                        Model var22 = ObjType.method341(var20 - 512).method349(-269, this.field459);
                        if (var22 != null) {
                            var16[var17++] = var22;
                        }
                    }
                }
                var12 = new Model(var17, -643, var16);
                for (int var19 = 0; var19 < 5; ++var19) {
                    if (this.field462[var19] != 0) {
                        var12.method139(client.field1657[var19][0], client.field1657[var19][this.field462[var19]]);
                        if (var19 == 1) {
                            var12.method139(client.field1550[0], client.field1550[this.field462[var19]]);
                        }
                    }
                }
                var12.method132(9);
                var12.method142(64, 850, -30, -50, -30, true);
                field480.method102(201, var5, var12);
                this.field478 = var5;
            }
            if (this.field477) {
                return var12;
            } else {
                Model var23 = Model.field531;
                var23.method127(0, var12, AnimFrame.method48(var7, 0) & AnimFrame.method48(var8, 0));
                if (var7 != -1 && var8 != -1) {
                    var23.method134(-32031, SeqType.field1133[super.field425].field1139, var7, var8);
                } else if (var7 != -1) {
                    var23.method133(var7, -284);
                }
                var23.method129(486);
                var23.field568 = null;
                var23.field567 = null;
                return var23;
            }
        }
    }

    @OriginalMember(owner = "ab", name = "d", descriptor = "(Z)Leb;")
    public final Model method118(boolean arg0) {
        if (!this.field458) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var12 = this.field461[var3];
                if (var12 >= 256 && var12 < 512 && !IdkType.field1113[var12 - 256].method372(0)) {
                    var2 = true;
                }
                if (var12 >= 512 && !ObjType.method341(var12 - 512).method350(this.field459, (byte) 1)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                Model[] var4 = new Model[12];
                int var5 = 0;
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var9 = this.field461[var6];
                    if (var9 >= 256 && var9 < 512) {
                        Model var10 = IdkType.field1113[var9 - 256].method373((byte) 7);
                        if (var10 != null) {
                            var4[var5++] = var10;
                        }
                    }
                    if (var9 >= 512) {
                        Model var11 = ObjType.method341(var9 - 512).method351(false, this.field459);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                }
                Model var7 = new Model(var5, -643, var4);
                for (int var8 = 0; var8 < 5; ++var8) {
                    if (this.field462[var8] != 0) {
                        var7.method139(client.field1657[var8][0], client.field1657[var8][this.field462[var8]]);
                        if (var8 == 1) {
                            var7.method139(client.field1550[0], client.field1550[this.field462[var8]]);
                        }
                    }
                }
                if (!arg0) {
                    this.field456 = -127;
                }
                return var7;
            }
        }
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(I)Z")
    public final boolean method113(int arg0) {
        if (arg0 != 0) {
            this.field454 = -56;
        }
        return this.field458;
    }
}
