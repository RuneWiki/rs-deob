import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FVFJZZXQ")
public class class21 extends class56 {

    @OriginalMember(owner = "FVFJZZXQ", name = "sb", descriptor = "J")
    public long field699 = -1L;

    @OriginalMember(owner = "FVFJZZXQ", name = "ub", descriptor = "Z")
    public boolean field701 = false;

    @OriginalMember(owner = "FVFJZZXQ", name = "wb", descriptor = "[I")
    public int[] field703 = new int[12];

    @OriginalMember(owner = "FVFJZZXQ", name = "xb", descriptor = "Z")
    private boolean field704 = false;

    @OriginalMember(owner = "FVFJZZXQ", name = "Ab", descriptor = "B")
    private byte field707 = 1;

    @OriginalMember(owner = "FVFJZZXQ", name = "Gb", descriptor = "B")
    private byte field713 = 18;

    @OriginalMember(owner = "FVFJZZXQ", name = "Ib", descriptor = "I")
    private int field715 = 4;

    @OriginalMember(owner = "FVFJZZXQ", name = "Jb", descriptor = "I")
    private int field716 = 693;

    @OriginalMember(owner = "FVFJZZXQ", name = "Mb", descriptor = "I")
    private int field719 = -374;

    @OriginalMember(owner = "FVFJZZXQ", name = "Tb", descriptor = "Z")
    private boolean field726 = true;

    @OriginalMember(owner = "FVFJZZXQ", name = "Ub", descriptor = "Z")
    public boolean field727 = false;

    @OriginalMember(owner = "FVFJZZXQ", name = "Vb", descriptor = "[I")
    public int[] field728 = new int[5];

    @OriginalMember(owner = "FVFJZZXQ", name = "Yb", descriptor = "I")
    private int field731 = 21057;

    @OriginalMember(owner = "FVFJZZXQ", name = "Rb", descriptor = "LOOTLZHQB;")
    public static class46 field724 = new class46(260, 9);

    @OriginalMember(owner = "FVFJZZXQ", name = "tb", descriptor = "I")
    public int field700;

    @OriginalMember(owner = "FVFJZZXQ", name = "vb", descriptor = "I")
    public int field702;

    @OriginalMember(owner = "FVFJZZXQ", name = "Bb", descriptor = "I")
    public int field708;

    @OriginalMember(owner = "FVFJZZXQ", name = "Cb", descriptor = "I")
    public int field709;

    @OriginalMember(owner = "FVFJZZXQ", name = "Db", descriptor = "I")
    public int field710;

    @OriginalMember(owner = "FVFJZZXQ", name = "Eb", descriptor = "I")
    public int field711;

    @OriginalMember(owner = "FVFJZZXQ", name = "Hb", descriptor = "I")
    public int field714;

    @OriginalMember(owner = "FVFJZZXQ", name = "Kb", descriptor = "I")
    public int field717;

    @OriginalMember(owner = "FVFJZZXQ", name = "Lb", descriptor = "I")
    public int field718;

    @OriginalMember(owner = "FVFJZZXQ", name = "Nb", descriptor = "I")
    public int field720;

    @OriginalMember(owner = "FVFJZZXQ", name = "Ob", descriptor = "I")
    public int field721;

    @OriginalMember(owner = "FVFJZZXQ", name = "Pb", descriptor = "I")
    public int field722;

    @OriginalMember(owner = "FVFJZZXQ", name = "Qb", descriptor = "I")
    public int field723;

    @OriginalMember(owner = "FVFJZZXQ", name = "Sb", descriptor = "I")
    private int field725;

    @OriginalMember(owner = "FVFJZZXQ", name = "Wb", descriptor = "I")
    public int field729;

    @OriginalMember(owner = "FVFJZZXQ", name = "Xb", descriptor = "I")
    public int field730;

    @OriginalMember(owner = "FVFJZZXQ", name = "zb", descriptor = "J")
    public long field706;

    @OriginalMember(owner = "FVFJZZXQ", name = "yb", descriptor = "LRBTWCHLG;")
    public class58 field705;

    @OriginalMember(owner = "FVFJZZXQ", name = "Fb", descriptor = "LRTQSBWRH;")
    public class59 field712;

    @OriginalMember(owner = "FVFJZZXQ", name = "rb", descriptor = "Ljava/lang/String;")
    public String field698;

    @OriginalMember(owner = "FVFJZZXQ", name = "a", descriptor = "(LJHKSAGUC;I)V")
    public final void method243(class31 arg0, int arg1) {
        arg0.field901 = 0;
        this.field729 = arg0.method306();
        this.field702 = arg0.method306();
        if (arg1 <= 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        this.field705 = null;
        this.field714 = 0;
        for (int var4 = 0; var4 < 12; ++var4) {
            int var5 = arg0.method306();
            if (var5 == 0) {
                this.field703[var4] = 0;
            } else {
                int var6 = arg0.method306();
                this.field703[var4] = (var5 << 8) + var6;
                if (var4 == 0 && this.field703[0] == 65535) {
                    this.field705 = class58.method449(arg0.method308());
                    break;
                }
                if (this.field703[var4] >= 512 && this.field703[var4] - 512 < class41.field1026) {
                    int var11 = class41.method374(this.field703[var4] - 512).field1035;
                    if (var11 != 0) {
                        this.field714 = var11;
                    }
                }
            }
        }
        for (int var7 = 0; var7 < 5; ++var7) {
            int var10 = arg0.method306();
            if (var10 < 0 || var10 >= client.field316[var7].length) {
                var10 = 0;
            }
            this.field728[var7] = var10;
        }
        super.field1202 = arg0.method308();
        if (super.field1202 == 65535) {
            super.field1202 = -1;
        }
        super.field1203 = arg0.method308();
        if (super.field1203 == 65535) {
            super.field1203 = -1;
        }
        super.field1237 = arg0.method308();
        if (super.field1237 == 65535) {
            super.field1237 = -1;
        }
        super.field1238 = arg0.method308();
        if (super.field1238 == 65535) {
            super.field1238 = -1;
        }
        super.field1239 = arg0.method308();
        if (super.field1239 == 65535) {
            super.field1239 = -1;
        }
        super.field1240 = arg0.method308();
        if (super.field1240 == 65535) {
            super.field1240 = -1;
        }
        super.field1224 = arg0.method308();
        if (super.field1224 == 65535) {
            super.field1224 = -1;
        }
        this.field698 = class70.method580((byte) 86, class70.method577(arg0.method312(217), -642));
        this.field730 = arg0.method306();
        this.field700 = arg0.method308();
        this.field701 = true;
        this.field706 = 0L;
        for (int var8 = 0; var8 < 12; ++var8) {
            this.field706 <<= 4;
            if (this.field703[var8] >= 256) {
                this.field706 += (long) (this.field703[var8] - 256);
            }
        }
        if (this.field703[0] >= 256) {
            this.field706 += (long) (this.field703[0] - 256 >> 4);
        }
        if (this.field703[1] >= 256) {
            this.field706 += (long) (this.field703[1] - 256 >> 8);
        }
        for (int var9 = 0; var9 < 5; ++var9) {
            this.field706 <<= 3;
            this.field706 += (long) this.field728[var9];
        }
        this.field706 <<= 1;
        this.field706 += (long) this.field729;
    }

    @OriginalMember(owner = "FVFJZZXQ", name = "a", descriptor = "(Z)Z")
    public final boolean method244(boolean arg0) {
        if (!arg0) {
            this.field726 = !this.field726;
        }
        return this.field701;
    }

    @OriginalMember(owner = "FVFJZZXQ", name = "a", descriptor = "(I)LRTQSBWRH;")
    public final class59 method199(int arg0) {
        while (arg0 >= 0) {
            this.field704 = !this.field704;
        }
        if (!this.field701) {
            return null;
        } else {
            class59 var2 = this.method246(-4952);
            if (var2 == null) {
                return null;
            } else {
                super.field1220 = var2.field696;
                var2.field1337 = true;
                if (this.field727) {
                    return var2;
                } else {
                    if (super.field1184 != -1 && super.field1185 != -1) {
                        class64 var3 = class64.field1557[super.field1184];
                        class59 var4 = var3.method502();
                        if (var4 != null) {
                            class59 var5 = new class59(true, -28456, class18.method229(super.field1185, 8), var4, false);
                            var5.method467(0, -super.field1188, 0, 0);
                            var5.method461(this.field719);
                            var5.method462(var3.field1561.field955[super.field1185], this.field707);
                            var5.field1336 = null;
                            var5.field1335 = null;
                            if (var3.field1564 != 128 || var3.field1565 != 128) {
                                var5.method470(var3.field1565, var3.field1564, var3.field1564, true);
                            }
                            var5.method471(var3.field1567 + 64, var3.field1568 + 850, -30, -50, -30, true);
                            class59[] var6 = new class59[] { var2, var5 };
                            var2 = new class59((byte) 1, var6, true, 2);
                        }
                    }
                    if (this.field712 != null) {
                        if (client.field271 >= this.field718) {
                            this.field712 = null;
                        }
                        if (client.field271 >= this.field717 && client.field271 < this.field718) {
                            class59 var7 = this.field712;
                            var7.method467(0, this.field710 - this.field708, this.field709 - super.field1214, this.field711 - super.field1215);
                            if (super.field1190 == 512) {
                                var7.method465((byte) 8);
                                var7.method465((byte) 8);
                                var7.method465((byte) 8);
                            } else if (super.field1190 == 1024) {
                                var7.method465((byte) 8);
                                var7.method465((byte) 8);
                            } else if (super.field1190 == 1536) {
                                var7.method465((byte) 8);
                            }
                            class59[] var8 = new class59[] { var2, var7 };
                            var2 = new class59((byte) 1, var8, true, 2);
                            if (super.field1190 == 512) {
                                var7.method465((byte) 8);
                            } else if (super.field1190 == 1024) {
                                var7.method465((byte) 8);
                                var7.method465((byte) 8);
                            } else if (super.field1190 == 1536) {
                                var7.method465((byte) 8);
                                var7.method465((byte) 8);
                                var7.method465((byte) 8);
                            }
                            var7.method467(0, this.field708 - this.field710, super.field1214 - this.field709, super.field1215 - this.field711);
                        }
                    }
                    var2.field1337 = true;
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "FVFJZZXQ", name = "c", descriptor = "(I)LRTQSBWRH;")
    public final class59 method245(int arg0) {
        int var2 = 52 / arg0;
        if (!this.field701) {
            return null;
        } else if (this.field705 != null) {
            return this.field705.method447((byte) -27);
        } else {
            boolean var3 = false;
            for (int var4 = 0; var4 < 12; ++var4) {
                int var13 = this.field703[var4];
                if (var13 >= 256 && var13 < 512 && !class13.field632[var13 - 256].method217(-884)) {
                    var3 = true;
                }
                if (var13 >= 512 && !class41.method374(var13 - 512).method372(this.field729, this.field715)) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            } else {
                class59[] var5 = new class59[12];
                int var6 = 0;
                for (int var7 = 0; var7 < 12; ++var7) {
                    int var10 = this.field703[var7];
                    if (var10 >= 256 && var10 < 512) {
                        class59 var11 = class13.field632[var10 - 256].method218(true);
                        if (var11 != null) {
                            var5[var6++] = var11;
                        }
                    }
                    if (var10 >= 512) {
                        class59 var12 = class41.method374(var10 - 512).method377(6, this.field729);
                        if (var12 != null) {
                            var5[var6++] = var12;
                        }
                    }
                }
                class59 var8 = new class59(var6, var5, this.field725);
                for (int var9 = 0; var9 < 5; ++var9) {
                    if (this.field728[var9] != 0) {
                        var8.method468(client.field316[var9][0], client.field316[var9][this.field728[var9]]);
                        if (var9 == 1) {
                            var8.method468(client.field464[0], client.field464[this.field728[var9]]);
                        }
                    }
                }
                return var8;
            }
        }
    }

    @OriginalMember(owner = "FVFJZZXQ", name = "d", descriptor = "(I)LRTQSBWRH;")
    private final class59 method246(int arg0) {
        if (this.field705 != null) {
            int var2 = -1;
            if (super.field1231 >= 0 && super.field1234 == 0) {
                var2 = class36.field953[super.field1231].field955[super.field1232];
            } else if (super.field1207 >= 0) {
                var2 = class36.field953[super.field1207].field955[super.field1208];
            }
            return this.field705.method443((int[]) null, -1, 856, var2);
        } else {
            long var4 = this.field706;
            if (arg0 != -4952) {
                this.field731 = 187;
            }
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (super.field1231 >= 0 && super.field1234 == 0) {
                class36 var10 = class36.field953[super.field1231];
                var6 = var10.field955[super.field1232];
                if (super.field1207 >= 0 && super.field1207 != super.field1202) {
                    var7 = class36.field953[super.field1207].field955[super.field1208];
                }
                if (var10.field962 >= 0) {
                    var8 = var10.field962;
                    var4 += (long) (var8 - this.field703[5] << 8);
                }
                if (var10.field963 >= 0) {
                    var9 = var10.field963;
                    var4 += (long) (var9 - this.field703[3] << 16);
                }
            } else if (super.field1207 >= 0) {
                var6 = class36.field953[super.field1207].field955[super.field1208];
            }
            class59 var11 = (class59) field724.method386(var4);
            if (var11 == null) {
                boolean var12 = false;
                for (int var13 = 0; var13 < 12; ++var13) {
                    int var14 = this.field703[var13];
                    if (var9 >= 0 && var13 == 3) {
                        var14 = var9;
                    }
                    if (var8 >= 0 && var13 == 5) {
                        var14 = var8;
                    }
                    if (var14 >= 256 && var14 < 512 && !class13.field632[var14 - 256].method215(false)) {
                        var12 = true;
                    }
                    if (var14 >= 512 && !class41.method374(var14 - 512).method378(16952, this.field729)) {
                        var12 = true;
                    }
                }
                if (var12) {
                    if (this.field699 != -1L) {
                        var11 = (class59) field724.method386(this.field699);
                    }
                    if (var11 == null) {
                        return null;
                    }
                }
            }
            if (var11 == null) {
                class59[] var15 = new class59[12];
                int var16 = 0;
                for (int var17 = 0; var17 < 12; ++var17) {
                    int var19 = this.field703[var17];
                    if (var9 >= 0 && var17 == 3) {
                        var19 = var9;
                    }
                    if (var8 >= 0 && var17 == 5) {
                        var19 = var8;
                    }
                    if (var19 >= 256 && var19 < 512) {
                        class59 var20 = class13.field632[var19 - 256].method216(23345);
                        if (var20 != null) {
                            var15[var16++] = var20;
                        }
                    }
                    if (var19 >= 512) {
                        class59 var21 = class41.method374(var19 - 512).method370(true, this.field729);
                        if (var21 != null) {
                            var15[var16++] = var21;
                        }
                    }
                }
                var11 = new class59(var16, var15, this.field725);
                for (int var18 = 0; var18 < 5; ++var18) {
                    if (this.field728[var18] != 0) {
                        var11.method468(client.field316[var18][0], client.field316[var18][this.field728[var18]]);
                        if (var18 == 1) {
                            var11.method468(client.field464[0], client.field464[this.field728[var18]]);
                        }
                    }
                }
                var11.method461(this.field719);
                var11.method471(64, 850, -30, -50, -30, true);
                field724.method387(var4, var11, (byte) 8);
                this.field699 = var4;
            }
            if (this.field727) {
                return var11;
            } else {
                class59 var22 = class59.field1299;
                var22.method456(class18.method229(var6, 8) & class18.method229(var7, 8), this.field716, var11);
                if (var6 != -1 && var7 != -1) {
                    var22.method463(class36.field953[super.field1231].field959, var7, this.field713, var6);
                } else if (var6 != -1) {
                    var22.method462(var6, this.field707);
                }
                var22.method458(-8326);
                var22.field1336 = null;
                var22.field1335 = null;
                return var22;
            }
        }
    }
}
