import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OTTYZSZE")
public class class45 extends class70 {

    @OriginalMember(owner = "OTTYZSZE", name = "zb", descriptor = "J")
    public long field1184 = -1L;

    @OriginalMember(owner = "OTTYZSZE", name = "Bb", descriptor = "[I")
    public int[] field1186 = new int[12];

    @OriginalMember(owner = "OTTYZSZE", name = "Cb", descriptor = "Z")
    public boolean field1187 = false;

    @OriginalMember(owner = "OTTYZSZE", name = "Db", descriptor = "I")
    private int field1188 = -39282;

    @OriginalMember(owner = "OTTYZSZE", name = "Jb", descriptor = "Z")
    public boolean field1194 = false;

    @OriginalMember(owner = "OTTYZSZE", name = "Kb", descriptor = "[I")
    public int[] field1195 = new int[5];

    @OriginalMember(owner = "OTTYZSZE", name = "Lb", descriptor = "B")
    private byte field1196 = 87;

    @OriginalMember(owner = "OTTYZSZE", name = "Sb", descriptor = "Z")
    private boolean field1203 = false;

    @OriginalMember(owner = "OTTYZSZE", name = "Ub", descriptor = "I")
    private int field1205 = 6;

    @OriginalMember(owner = "OTTYZSZE", name = "Hb", descriptor = "LJLTMYUOM;")
    public static class24 field1192 = new class24(true, 260);

    @OriginalMember(owner = "OTTYZSZE", name = "rb", descriptor = "I")
    public int field1176;

    @OriginalMember(owner = "OTTYZSZE", name = "sb", descriptor = "I")
    public int field1177;

    @OriginalMember(owner = "OTTYZSZE", name = "tb", descriptor = "I")
    public int field1178;

    @OriginalMember(owner = "OTTYZSZE", name = "ub", descriptor = "I")
    public int field1179;

    @OriginalMember(owner = "OTTYZSZE", name = "vb", descriptor = "I")
    public int field1180;

    @OriginalMember(owner = "OTTYZSZE", name = "yb", descriptor = "I")
    public int field1183;

    @OriginalMember(owner = "OTTYZSZE", name = "Ab", descriptor = "I")
    public int field1185;

    @OriginalMember(owner = "OTTYZSZE", name = "Eb", descriptor = "I")
    private int field1189;

    @OriginalMember(owner = "OTTYZSZE", name = "Fb", descriptor = "I")
    public int field1190;

    @OriginalMember(owner = "OTTYZSZE", name = "Mb", descriptor = "I")
    public int field1197;

    @OriginalMember(owner = "OTTYZSZE", name = "Nb", descriptor = "I")
    public int field1198;

    @OriginalMember(owner = "OTTYZSZE", name = "Ob", descriptor = "I")
    public int field1199;

    @OriginalMember(owner = "OTTYZSZE", name = "Pb", descriptor = "I")
    public int field1200;

    @OriginalMember(owner = "OTTYZSZE", name = "Qb", descriptor = "I")
    public int field1201;

    @OriginalMember(owner = "OTTYZSZE", name = "Rb", descriptor = "I")
    public int field1202;

    @OriginalMember(owner = "OTTYZSZE", name = "Tb", descriptor = "I")
    public int field1204;

    @OriginalMember(owner = "OTTYZSZE", name = "Gb", descriptor = "J")
    public long field1191;

    @OriginalMember(owner = "OTTYZSZE", name = "wb", descriptor = "LFUTAQMCE;")
    public class19 field1181;

    @OriginalMember(owner = "OTTYZSZE", name = "xb", descriptor = "LNHTDEVDA;")
    public class37 field1182;

    @OriginalMember(owner = "OTTYZSZE", name = "Ib", descriptor = "Ljava/lang/String;")
    public String field1193;

    @OriginalMember(owner = "OTTYZSZE", name = "b", descriptor = "(I)Z")
    public final boolean method245(int arg0) {
        if (arg0 != 6) {
            throw new NullPointerException();
        } else {
            return this.field1194;
        }
    }

    @OriginalMember(owner = "OTTYZSZE", name = "d", descriptor = "(I)LFUTAQMCE;")
    private final class19 method389(int arg0) {
        if (this.field1182 != null) {
            int var2 = -1;
            if (super.field1698 >= 0 && super.field1701 == 0) {
                var2 = class21.field817[super.field1698].field819[super.field1699];
            } else if (super.field1692 >= 0) {
                var2 = class21.field817[super.field1692].field819[super.field1693];
            }
            return this.field1182.method367((int[]) null, -1, var2, 4);
        } else {
            long var4 = this.field1191;
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (super.field1698 >= 0 && super.field1701 == 0) {
                class21 var10 = class21.field817[super.field1698];
                var6 = var10.field819[super.field1699];
                if (super.field1692 >= 0 && super.field1692 != super.field1678) {
                    var7 = class21.field817[super.field1692].field819[super.field1693];
                }
                if (var10.field826 >= 0) {
                    var8 = var10.field826;
                    var4 += (long) (var8 - this.field1186[5] << 8);
                }
                if (var10.field827 >= 0) {
                    var9 = var10.field827;
                    var4 += (long) (var9 - this.field1186[3] << 16);
                }
            } else if (super.field1692 >= 0) {
                var6 = class21.field817[super.field1692].field819[super.field1693];
            }
            class19 var11 = (class19) field1192.method297(var4);
            if (var11 == null) {
                boolean var12 = false;
                for (int var13 = 0; var13 < 12; ++var13) {
                    int var14 = this.field1186[var13];
                    if (var9 >= 0 && var13 == 3) {
                        var14 = var9;
                    }
                    if (var8 >= 0 && var13 == 5) {
                        var14 = var8;
                    }
                    if (var14 >= 256 && var14 < 512 && !class44.field1169[var14 - 256].method385((byte) 8)) {
                        var12 = true;
                    }
                    if (var14 >= 512 && !class5.method13(var14 - 512).method9((byte) 4, this.field1190)) {
                        var12 = true;
                    }
                }
                if (var12) {
                    if (this.field1184 != -1L) {
                        var11 = (class19) field1192.method297(this.field1184);
                    }
                    if (var11 == null) {
                        return null;
                    }
                }
            }
            if (var11 == null) {
                class19[] var15 = new class19[12];
                int var16 = 0;
                for (int var17 = 0; var17 < 12; ++var17) {
                    int var19 = this.field1186[var17];
                    if (var9 >= 0 && var17 == 3) {
                        var19 = var9;
                    }
                    if (var8 >= 0 && var17 == 5) {
                        var19 = var8;
                    }
                    if (var19 >= 256 && var19 < 512) {
                        class19 var20 = class44.field1169[var19 - 256].method386(893);
                        if (var20 != null) {
                            var15[var16++] = var20;
                        }
                    }
                    if (var19 >= 512) {
                        class19 var21 = class5.method13(var19 - 512).method7(false, this.field1190);
                        if (var21 != null) {
                            var15[var16++] = var21;
                        }
                    }
                }
                var11 = new class19(var16, 221, var15);
                for (int var18 = 0; var18 < 5; ++var18) {
                    if (this.field1195[var18] != 0) {
                        var11.method264(client.field559[var18][0], client.field559[var18][this.field1195[var18]]);
                        if (var18 == 1) {
                            var11.method264(client.field446[0], client.field446[this.field1195[var18]]);
                        }
                    }
                }
                var11.method257(284);
                var11.method267(64, 850, -30, -50, -30, true);
                field1192.method298(-561, var4, var11);
                this.field1184 = var4;
            }
            if (this.field1187) {
                return var11;
            } else {
                class19 var22 = class19.field728;
                int var23 = 28 / arg0;
                var22.method252(class55.method428(4, var6) & class55.method428(4, var7), this.field1189, var11);
                if (var6 != -1 && var7 != -1) {
                    var22.method259(class21.field817[super.field1698].field823, var6, (byte) 116, var7);
                } else if (var6 != -1) {
                    var22.method258(var6, 4);
                }
                var22.method254(238);
                var22.field765 = null;
                var22.field764 = null;
                return var22;
            }
        }
    }

    @OriginalMember(owner = "OTTYZSZE", name = "a", descriptor = "(ZLXJCNBMKS;)V")
    public final void method390(boolean arg0, class68 arg1) {
        arg1.field1643 = 0;
        this.field1190 = arg1.method534();
        this.field1204 = arg1.method534();
        this.field1182 = null;
        this.field1185 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg1.method534();
            if (var4 == 0) {
                this.field1186[var3] = 0;
            } else {
                int var5 = arg1.method534();
                this.field1186[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field1186[0] == 65535) {
                    this.field1182 = class37.method368(arg1.method536());
                    break;
                }
                if (this.field1186[var3] >= 512 && this.field1186[var3] - 512 < class5.field52) {
                    int var10 = class5.method13(this.field1186[var3] - 512).field81;
                    if (var10 != 0) {
                        this.field1185 = var10;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var9 = arg1.method534();
            if (var9 < 0 || var9 >= client.field559[var6].length) {
                var9 = 0;
            }
            this.field1195[var6] = var9;
        }
        super.field1678 = arg1.method536();
        if (super.field1678 == 65535) {
            super.field1678 = -1;
        }
        super.field1679 = arg1.method536();
        if (super.field1679 == 65535) {
            super.field1679 = -1;
        }
        super.field1713 = arg1.method536();
        if (super.field1713 == 65535) {
            super.field1713 = -1;
        }
        super.field1714 = arg1.method536();
        if (super.field1714 == 65535) {
            super.field1714 = -1;
        }
        super.field1715 = arg1.method536();
        if (super.field1715 == 65535) {
            super.field1715 = -1;
        }
        super.field1716 = arg1.method536();
        if (super.field1716 == 65535) {
            super.field1716 = -1;
        }
        super.field1672 = arg1.method536();
        if (super.field1672 == 65535) {
            super.field1672 = -1;
        }
        this.field1193 = class62.method490(false, class62.method487(arg1.method540(true), (byte) 7));
        this.field1183 = arg1.method534();
        this.field1201 = arg1.method536();
        this.field1194 = true;
        this.field1191 = 0L;
        if (!arg0) {
            this.field1203 = !this.field1203;
        }
        for (int var7 = 0; var7 < 12; ++var7) {
            this.field1191 <<= 4;
            if (this.field1186[var7] >= 256) {
                this.field1191 += (long) (this.field1186[var7] - 256);
            }
        }
        if (this.field1186[0] >= 256) {
            this.field1191 += (long) (this.field1186[0] - 256 >> 4);
        }
        if (this.field1186[1] >= 256) {
            this.field1191 += (long) (this.field1186[1] - 256 >> 8);
        }
        for (int var8 = 0; var8 < 5; ++var8) {
            this.field1191 <<= 3;
            this.field1191 += (long) this.field1195[var8];
        }
        this.field1191 <<= 1;
        this.field1191 += (long) this.field1190;
    }

    @OriginalMember(owner = "OTTYZSZE", name = "a", descriptor = "(Z)LFUTAQMCE;")
    public final class19 method391(boolean arg0) {
        if (!this.field1194) {
            return null;
        } else if (this.field1182 != null) {
            return this.field1182.method366((byte) -44);
        } else {
            boolean var2 = false;
            if (!arg0) {
                throw new NullPointerException();
            } else {
                for (int var3 = 0; var3 < 12; ++var3) {
                    int var12 = this.field1186[var3];
                    if (var12 >= 256 && var12 < 512 && !class44.field1169[var12 - 256].method387(true)) {
                        var2 = true;
                    }
                    if (var12 >= 512 && !class5.method13(var12 - 512).method16(this.field1190, 190)) {
                        var2 = true;
                    }
                }
                if (var2) {
                    return null;
                } else {
                    class19[] var4 = new class19[12];
                    int var5 = 0;
                    for (int var6 = 0; var6 < 12; ++var6) {
                        int var9 = this.field1186[var6];
                        if (var9 >= 256 && var9 < 512) {
                            class19 var10 = class44.field1169[var9 - 256].method388(this.field1196);
                            if (var10 != null) {
                                var4[var5++] = var10;
                            }
                        }
                        if (var9 >= 512) {
                            class19 var11 = class5.method13(var9 - 512).method11(this.field1190, this.field1205);
                            if (var11 != null) {
                                var4[var5++] = var11;
                            }
                        }
                    }
                    class19 var7 = new class19(var5, 221, var4);
                    for (int var8 = 0; var8 < 5; ++var8) {
                        if (this.field1195[var8] != 0) {
                            var7.method264(client.field559[var8][0], client.field559[var8][this.field1195[var8]]);
                            if (var8 == 1) {
                                var7.method264(client.field446[0], client.field446[this.field1195[var8]]);
                            }
                        }
                    }
                    return var7;
                }
            }
        }
    }

    @OriginalMember(owner = "OTTYZSZE", name = "a", descriptor = "(I)LFUTAQMCE;")
    public final class19 method2(int arg0) {
        if (!this.field1194) {
            return null;
        } else {
            class19 var2 = this.method389(291);
            if (var2 == null) {
                return null;
            } else {
                super.field1707 = var2.field1116;
                var2.field766 = true;
                if (this.field1187) {
                    return var2;
                } else {
                    if (super.field1673 != -1 && super.field1674 != -1) {
                        class66 var3 = class66.field1605[super.field1673];
                        class19 var4 = var3.method519();
                        if (var4 != null) {
                            class19 var5 = new class19(var4, false, (byte) 2, true, class55.method428(4, super.field1674));
                            var5.method263(0, -super.field1677, 292, 0);
                            var5.method257(284);
                            var5.method258(var3.field1609.field819[super.field1674], 4);
                            var5.field765 = null;
                            var5.field764 = null;
                            if (var3.field1612 != 128 || var3.field1613 != 128) {
                                var5.method266(var3.field1612, var3.field1613, var3.field1612, -9317);
                            }
                            var5.method267(var3.field1615 + 64, var3.field1616 + 850, -30, -50, -30, true);
                            class19[] var6 = new class19[] { var2, var5 };
                            var2 = new class19(2, false, var6, true);
                        }
                    }
                    if (this.field1181 != null) {
                        if (client.field421 >= this.field1177) {
                            this.field1181 = null;
                        }
                        if (client.field421 >= this.field1176 && client.field421 < this.field1177) {
                            class19 var7 = this.field1181;
                            var7.method263(this.field1180 - super.field1722, this.field1179 - this.field1202, 292, this.field1178 - super.field1721);
                            if (super.field1695 == 512) {
                                var7.method261(false);
                                var7.method261(false);
                                var7.method261(false);
                            } else if (super.field1695 == 1024) {
                                var7.method261(false);
                                var7.method261(false);
                            } else if (super.field1695 == 1536) {
                                var7.method261(false);
                            }
                            class19[] var8 = new class19[] { var2, var7 };
                            var2 = new class19(2, false, var8, true);
                            if (super.field1695 == 512) {
                                var7.method261(false);
                            } else if (super.field1695 == 1024) {
                                var7.method261(false);
                                var7.method261(false);
                            } else if (super.field1695 == 1536) {
                                var7.method261(false);
                                var7.method261(false);
                                var7.method261(false);
                            }
                            var7.method263(super.field1722 - this.field1180, this.field1202 - this.field1179, 292, super.field1721 - this.field1178);
                        }
                    }
                    var2.field766 = true;
                    if (this.field1188 != arg0) {
                        for (int var9 = 1; var9 > 0; ++var9) {
                        }
                    }
                    return var2;
                }
            }
        }
    }
}
