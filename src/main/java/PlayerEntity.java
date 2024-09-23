import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ab")
public class PlayerEntity extends PathingEntity {

    @OriginalMember(owner = "ab", name = "ub", descriptor = "Z")
    private boolean field457 = true;

    @OriginalMember(owner = "ab", name = "wb", descriptor = "Z")
    public boolean field459 = false;

    @OriginalMember(owner = "ab", name = "zb", descriptor = "[I")
    public int[] field462 = new int[12];

    @OriginalMember(owner = "ab", name = "Ab", descriptor = "[I")
    public int[] field463 = new int[5];

    @OriginalMember(owner = "ab", name = "Pb", descriptor = "Z")
    public boolean field478 = false;

    @OriginalMember(owner = "ab", name = "Qb", descriptor = "J")
    public long field479 = -1L;

    @OriginalMember(owner = "ab", name = "Tb", descriptor = "Ls;")
    public static LruCache field482 = new LruCache(false, 260);

    @OriginalMember(owner = "ab", name = "tb", descriptor = "I")
    private int field456;

    @OriginalMember(owner = "ab", name = "xb", descriptor = "I")
    public int field460;

    @OriginalMember(owner = "ab", name = "yb", descriptor = "I")
    public int field461;

    @OriginalMember(owner = "ab", name = "Bb", descriptor = "I")
    public int field464;

    @OriginalMember(owner = "ab", name = "Cb", descriptor = "I")
    public int field465;

    @OriginalMember(owner = "ab", name = "Eb", descriptor = "I")
    public int field467;

    @OriginalMember(owner = "ab", name = "Fb", descriptor = "I")
    public int field468;

    @OriginalMember(owner = "ab", name = "Gb", descriptor = "I")
    public int field469;

    @OriginalMember(owner = "ab", name = "Hb", descriptor = "I")
    public int field470;

    @OriginalMember(owner = "ab", name = "Ib", descriptor = "I")
    public int field471;

    @OriginalMember(owner = "ab", name = "Jb", descriptor = "I")
    public int field472;

    @OriginalMember(owner = "ab", name = "Lb", descriptor = "I")
    public int field474;

    @OriginalMember(owner = "ab", name = "Mb", descriptor = "I")
    public int field475;

    @OriginalMember(owner = "ab", name = "Nb", descriptor = "I")
    public int field476;

    @OriginalMember(owner = "ab", name = "Ob", descriptor = "I")
    public int field477;

    @OriginalMember(owner = "ab", name = "Sb", descriptor = "I")
    public int field481;

    @OriginalMember(owner = "ab", name = "Db", descriptor = "J")
    public long field466;

    @OriginalMember(owner = "ab", name = "Kb", descriptor = "Leb;")
    public Model field473;

    @OriginalMember(owner = "ab", name = "Rb", descriptor = "Lgc;")
    public NpcType field480;

    @OriginalMember(owner = "ab", name = "vb", descriptor = "Ljava/lang/String;")
    public String field458;

    @OriginalMember(owner = "ab", name = "a", descriptor = "(ZLlb;)V")
    public final void method116(boolean arg0, Packet arg1) {
        arg1.field708 = 0;
        this.field460 = arg1.method225();
        this.field461 = arg1.method225();
        if (arg0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        this.field480 = null;
        this.field481 = 0;
        for (int var4 = 0; var4 < 12; ++var4) {
            int var5 = arg1.method225();
            if (var5 == 0) {
                this.field462[var4] = 0;
            } else {
                int var6 = arg1.method225();
                this.field462[var4] = (var5 << 8) + var6;
                if (var4 == 0 && this.field462[0] == 65535) {
                    this.field480 = NpcType.method336(arg1.method227());
                    break;
                }
                if (this.field462[var4] >= 512 && this.field462[var4] - 512 < ObjType.field1026) {
                    int var11 = ObjType.method342(this.field462[var4] - 512).field1071;
                    if (var11 != 0) {
                        this.field481 = var11;
                    }
                }
            }
        }
        for (int var7 = 0; var7 < 5; ++var7) {
            int var10 = arg1.method225();
            if (var10 < 0 || var10 >= client.field1400[var7].length) {
                var10 = 0;
            }
            this.field463[var7] = var10;
        }
        super.field402 = arg1.method227();
        if (super.field402 == 65535) {
            super.field402 = -1;
        }
        super.field403 = arg1.method227();
        if (super.field403 == 65535) {
            super.field403 = -1;
        }
        super.field404 = arg1.method227();
        if (super.field404 == 65535) {
            super.field404 = -1;
        }
        super.field405 = arg1.method227();
        if (super.field405 == 65535) {
            super.field405 = -1;
        }
        super.field406 = arg1.method227();
        if (super.field406 == 65535) {
            super.field406 = -1;
        }
        super.field407 = arg1.method227();
        if (super.field407 == 65535) {
            super.field407 = -1;
        }
        super.field408 = arg1.method227();
        if (super.field408 == 65535) {
            super.field408 = -1;
        }
        this.field458 = JString.method300((byte) 81, JString.method297((byte) 3, arg1.method231(false)));
        this.field464 = arg1.method225();
        this.field465 = arg1.method227();
        this.field459 = true;
        this.field466 = 0L;
        for (int var8 = 0; var8 < 12; ++var8) {
            this.field466 <<= 4;
            if (this.field462[var8] >= 256) {
                this.field466 += (long) (this.field462[var8] - 256);
            }
        }
        if (this.field462[0] >= 256) {
            this.field466 += (long) (this.field462[0] - 256 >> 4);
        }
        if (this.field462[1] >= 256) {
            this.field466 += (long) (this.field462[1] - 256 >> 8);
        }
        for (int var9 = 0; var9 < 5; ++var9) {
            this.field466 <<= 3;
            this.field466 += (long) this.field463[var9];
        }
        this.field466 <<= 1;
        this.field466 += (long) this.field460;
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(Z)Leb;")
    public final Model method109(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (!this.field459) {
            return null;
        } else {
            Model var3 = this.method117(2);
            if (var3 == null) {
                return null;
            } else {
                super.field443 = var3.field393;
                var3.field571 = true;
                if (this.field478) {
                    return var3;
                } else {
                    if (super.field430 != -1 && super.field431 != -1) {
                        SpotAnimType var4 = SpotAnimType.field1148[super.field430];
                        Model var5 = var4.method380();
                        if (var5 != null) {
                            Model var6 = new Model(9, false, AnimFrame.method48(this.field456, super.field431), true, var5);
                            var6.method138(0, -super.field434, (byte) 25, 0);
                            var6.method132(45941);
                            var6.method133(3, var4.field1152.field1128[super.field431]);
                            var6.field570 = null;
                            var6.field569 = null;
                            if (var4.field1155 != 128 || var4.field1156 != 128) {
                                var6.method141(var4.field1155, var4.field1155, (byte) 62, var4.field1156);
                            }
                            var6.method142(var4.field1158 + 64, var4.field1159 + 850, -30, -50, -30, true);
                            Model[] var7 = new Model[] { var3, var6 };
                            var3 = new Model(true, var7, true, 2);
                        }
                    }
                    if (this.field473 != null) {
                        if (client.field1330 >= this.field469) {
                            this.field473 = null;
                        }
                        if (client.field1330 >= this.field468 && client.field1330 < this.field469) {
                            Model var8 = this.field473;
                            var8.method138(this.field470 - super.field397, this.field471 - this.field467, (byte) 25, this.field472 - super.field398);
                            if (super.field444 == 512) {
                                var8.method136(false);
                                var8.method136(false);
                                var8.method136(false);
                            } else if (super.field444 == 1024) {
                                var8.method136(false);
                                var8.method136(false);
                            } else if (super.field444 == 1536) {
                                var8.method136(false);
                            }
                            Model[] var9 = new Model[] { var3, var8 };
                            var3 = new Model(true, var9, true, 2);
                            if (super.field444 == 512) {
                                var8.method136(false);
                            } else if (super.field444 == 1024) {
                                var8.method136(false);
                                var8.method136(false);
                            } else if (super.field444 == 1536) {
                                var8.method136(false);
                                var8.method136(false);
                                var8.method136(false);
                            }
                            var8.method138(super.field397 - this.field470, this.field467 - this.field471, (byte) 25, super.field398 - this.field472);
                        }
                    }
                    var3.field571 = true;
                    return var3;
                }
            }
        }
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(I)Leb;")
    private final Model method117(int arg0) {
        if (this.field480 != null) {
            int var2 = -1;
            if (super.field425 >= 0 && super.field428 == 0) {
                var2 = SeqType.field1126[super.field425].field1128[super.field426];
            } else if (super.field422 >= 0) {
                var2 = SeqType.field1126[super.field422].field1128[super.field423];
            }
            return this.field480.method338(0, var2, -1, (int[]) null);
        } else {
            long var4 = this.field466;
            if (arg0 != 2) {
                throw new NullPointerException();
            } else {
                int var6 = -1;
                int var7 = -1;
                int var8 = -1;
                int var9 = -1;
                if (super.field425 >= 0 && super.field428 == 0) {
                    SeqType var10 = SeqType.field1126[super.field425];
                    var6 = var10.field1128[super.field426];
                    if (super.field422 >= 0 && super.field422 != super.field402) {
                        var7 = SeqType.field1126[super.field422].field1128[super.field423];
                    }
                    if (var10.field1135 >= 0) {
                        var8 = var10.field1135;
                        var4 += (long) (var8 - this.field462[5] << 8);
                    }
                    if (var10.field1136 >= 0) {
                        var9 = var10.field1136;
                        var4 += (long) (var9 - this.field462[3] << 16);
                    }
                } else if (super.field422 >= 0) {
                    var6 = SeqType.field1126[super.field422].field1128[super.field423];
                }
                Model var11 = (Model) field482.method101(var4);
                if (var11 == null) {
                    boolean var12 = false;
                    for (int var13 = 0; var13 < 12; ++var13) {
                        int var14 = this.field462[var13];
                        if (var9 >= 0 && var13 == 3) {
                            var14 = var9;
                        }
                        if (var8 >= 0 && var13 == 5) {
                            var14 = var8;
                        }
                        if (var14 >= 256 && var14 < 512 && !IdkType.field1103[var14 - 256].method371((byte) 0)) {
                            var12 = true;
                        }
                        if (var14 >= 512 && !ObjType.method342(var14 - 512).method349(0, this.field460)) {
                            var12 = true;
                        }
                    }
                    if (var12) {
                        if (this.field479 != -1L) {
                            var11 = (Model) field482.method101(this.field479);
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
                        int var19 = this.field462[var17];
                        if (var9 >= 0 && var17 == 3) {
                            var19 = var9;
                        }
                        if (var8 >= 0 && var17 == 5) {
                            var19 = var8;
                        }
                        if (var19 >= 256 && var19 < 512) {
                            Model var20 = IdkType.field1103[var19 - 256].method372(true);
                            if (var20 != null) {
                                var15[var16++] = var20;
                            }
                        }
                        if (var19 >= 512) {
                            Model var21 = ObjType.method342(var19 - 512).method350(false, this.field460);
                            if (var21 != null) {
                                var15[var16++] = var21;
                            }
                        }
                    }
                    var11 = new Model((byte) 3, var16, var15);
                    for (int var18 = 0; var18 < 5; ++var18) {
                        if (this.field463[var18] != 0) {
                            var11.method139(client.field1400[var18][0], client.field1400[var18][this.field463[var18]]);
                            if (var18 == 1) {
                                var11.method139(client.field1423[0], client.field1423[this.field463[var18]]);
                            }
                        }
                    }
                    var11.method132(45941);
                    var11.method142(64, 850, -30, -50, -30, true);
                    field482.method102(400, var11, var4);
                    this.field479 = var4;
                }
                if (this.field478) {
                    return var11;
                } else {
                    Model var22 = Model.field533;
                    var22.method127(var11, (byte) 104, AnimFrame.method48(this.field456, var6) & AnimFrame.method48(this.field456, var7));
                    if (var6 != -1 && var7 != -1) {
                        var22.method134(SeqType.field1126[super.field425].field1132, var7, var6, (byte) -116);
                    } else if (var6 != -1) {
                        var22.method133(3, var6);
                    }
                    var22.method129(364);
                    var22.field570 = null;
                    var22.field569 = null;
                    return var22;
                }
            }
        }
    }

    @OriginalMember(owner = "ab", name = "b", descriptor = "(I)Leb;")
    public final Model method118(int arg0) {
        if (!this.field459) {
            return null;
        } else if (this.field480 != null) {
            return this.field480.method339(0);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var12 = this.field462[var3];
                if (var12 >= 256 && var12 < 512 && !IdkType.field1103[var12 - 256].method373(364)) {
                    var2 = true;
                }
                if (var12 >= 512 && !ObjType.method342(var12 - 512).method351(true, this.field460)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                Model[] var4 = new Model[12];
                int var5 = 0;
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var9 = this.field462[var6];
                    if (var9 >= 256 && var9 < 512) {
                        Model var10 = IdkType.field1103[var9 - 256].method374((byte) -57);
                        if (var10 != null) {
                            var4[var5++] = var10;
                        }
                    }
                    if (var9 >= 512) {
                        Model var11 = ObjType.method342(var9 - 512).method352(this.field460, true);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                }
                Model var7 = new Model((byte) 3, var5, var4);
                for (int var8 = 0; var8 < 5; ++var8) {
                    if (this.field463[var8] != 0) {
                        var7.method139(client.field1400[var8][0], client.field1400[var8][this.field463[var8]]);
                        if (var8 == 1) {
                            var7.method139(client.field1423[0], client.field1423[this.field463[var8]]);
                        }
                    }
                }
                if (arg0 != -11764) {
                    throw new NullPointerException();
                } else {
                    return var7;
                }
            }
        }
    }

    @OriginalMember(owner = "ab", name = "b", descriptor = "(B)Z")
    public final boolean method113(byte arg0) {
        if (arg0 != 121) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        return this.field459;
    }
}
