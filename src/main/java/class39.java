import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("QIVQUKBA")
public class class39 extends class38 {

    @OriginalMember(owner = "QIVQUKBA", name = "pb", descriptor = "[I")
    public int[] field1253 = new int[5];

    @OriginalMember(owner = "QIVQUKBA", name = "Bb", descriptor = "B")
    private byte field1265 = 5;

    @OriginalMember(owner = "QIVQUKBA", name = "Eb", descriptor = "J")
    public long field1268 = -1L;

    @OriginalMember(owner = "QIVQUKBA", name = "Kb", descriptor = "[I")
    public int[] field1274 = new int[12];

    @OriginalMember(owner = "QIVQUKBA", name = "Mb", descriptor = "Z")
    public boolean field1276 = false;

    @OriginalMember(owner = "QIVQUKBA", name = "Nb", descriptor = "Z")
    public boolean field1277 = false;

    @OriginalMember(owner = "QIVQUKBA", name = "Cb", descriptor = "LISXEOURU;")
    public static class21 field1266 = new class21(-15730, 260);

    @OriginalMember(owner = "QIVQUKBA", name = "qb", descriptor = "I")
    public int field1254;

    @OriginalMember(owner = "QIVQUKBA", name = "rb", descriptor = "I")
    public int field1255;

    @OriginalMember(owner = "QIVQUKBA", name = "sb", descriptor = "I")
    public int field1256;

    @OriginalMember(owner = "QIVQUKBA", name = "tb", descriptor = "I")
    public int field1257;

    @OriginalMember(owner = "QIVQUKBA", name = "ub", descriptor = "I")
    public int field1258;

    @OriginalMember(owner = "QIVQUKBA", name = "vb", descriptor = "I")
    public int field1259;

    @OriginalMember(owner = "QIVQUKBA", name = "wb", descriptor = "I")
    public int field1260;

    @OriginalMember(owner = "QIVQUKBA", name = "xb", descriptor = "I")
    public int field1261;

    @OriginalMember(owner = "QIVQUKBA", name = "yb", descriptor = "I")
    public int field1262;

    @OriginalMember(owner = "QIVQUKBA", name = "zb", descriptor = "I")
    public int field1263;

    @OriginalMember(owner = "QIVQUKBA", name = "Db", descriptor = "I")
    public int field1267;

    @OriginalMember(owner = "QIVQUKBA", name = "Fb", descriptor = "I")
    public int field1269;

    @OriginalMember(owner = "QIVQUKBA", name = "Gb", descriptor = "I")
    public int field1270;

    @OriginalMember(owner = "QIVQUKBA", name = "Ib", descriptor = "I")
    public int field1272;

    @OriginalMember(owner = "QIVQUKBA", name = "Jb", descriptor = "I")
    public int field1273;

    @OriginalMember(owner = "QIVQUKBA", name = "Lb", descriptor = "J")
    public long field1275;

    @OriginalMember(owner = "QIVQUKBA", name = "Ab", descriptor = "LCCYECDYX;")
    public class4 field1264;

    @OriginalMember(owner = "QIVQUKBA", name = "Ob", descriptor = "LZDMOUFDZ;")
    public class68 field1278;

    @OriginalMember(owner = "QIVQUKBA", name = "Hb", descriptor = "Ljava/lang/String;")
    public String field1271;

    @OriginalMember(owner = "QIVQUKBA", name = "a", descriptor = "(Z)Z")
    public final boolean method369(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        return this.field1276;
    }

    @OriginalMember(owner = "QIVQUKBA", name = "a", descriptor = "(ZLZOMNSJJM;)V")
    public final void method374(boolean arg0, class69 arg1) {
        arg1.field1700 = 0;
        this.field1267 = arg1.method547();
        this.field1255 = arg1.method547();
        this.field1278 = null;
        this.field1254 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg1.method547();
            if (var4 == 0) {
                this.field1274[var3] = 0;
            } else {
                int var5 = arg1.method547();
                this.field1274[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field1274[0] == 65535) {
                    this.field1278 = class68.method529(arg1.method549());
                    break;
                }
                if (this.field1274[var3] >= 512 && this.field1274[var3] - 512 < class46.field1376) {
                    int var10 = class46.method416(this.field1274[var3] - 512).field1426;
                    if (var10 != 0) {
                        this.field1254 = var10;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var9 = arg1.method547();
            if (var9 < 0 || var9 >= client.field230[var6].length) {
                var9 = 0;
            }
            this.field1253[var6] = var9;
        }
        super.field1210 = arg1.method549();
        if (super.field1210 == 65535) {
            super.field1210 = -1;
        }
        super.field1211 = arg1.method549();
        if (super.field1211 == 65535) {
            super.field1211 = -1;
        }
        super.field1205 = arg1.method549();
        if (super.field1205 == 65535) {
            super.field1205 = -1;
        }
        super.field1206 = arg1.method549();
        if (super.field1206 == 65535) {
            super.field1206 = -1;
        }
        super.field1207 = arg1.method549();
        if (super.field1207 == 65535) {
            super.field1207 = -1;
        }
        super.field1208 = arg1.method549();
        if (super.field1208 == 65535) {
            super.field1208 = -1;
        }
        super.field1223 = arg1.method549();
        if (super.field1223 == 65535) {
            super.field1223 = -1;
        }
        this.field1271 = class26.method257(0, class26.method254(0, arg1.method553(false)));
        this.field1269 = arg1.method547();
        this.field1260 = arg1.method549();
        this.field1276 = true;
        if (!arg0) {
            this.field1275 = 0L;
            for (int var7 = 0; var7 < 12; ++var7) {
                this.field1275 <<= 4;
                if (this.field1274[var7] >= 256) {
                    this.field1275 += (long) (this.field1274[var7] - 256);
                }
            }
            if (this.field1274[0] >= 256) {
                this.field1275 += (long) (this.field1274[0] - 256 >> 4);
            }
            if (this.field1274[1] >= 256) {
                this.field1275 += (long) (this.field1274[1] - 256 >> 8);
            }
            for (int var8 = 0; var8 < 5; ++var8) {
                this.field1275 <<= 3;
                this.field1275 += (long) this.field1253[var8];
            }
            this.field1275 <<= 1;
            this.field1275 += (long) this.field1267;
        }
    }

    @OriginalMember(owner = "QIVQUKBA", name = "c", descriptor = "(Z)LCCYECDYX;")
    private final class4 method375(boolean arg0) {
        if (this.field1278 != null) {
            int var2 = -1;
            if (super.field1245 >= 0 && super.field1248 == 0) {
                var2 = class20.field875[super.field1245].field877[super.field1246];
            } else if (super.field1197 >= 0) {
                var2 = class20.field875[super.field1197].field877[super.field1198];
            }
            return this.field1278.method530(-1, var2, (int[]) null, 7);
        } else {
            long var4 = this.field1275;
            int var6 = -1;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            if (super.field1245 >= 0 && super.field1248 == 0) {
                class20 var10 = class20.field875[super.field1245];
                var6 = var10.field877[super.field1246];
                if (super.field1197 >= 0 && super.field1210 != super.field1197) {
                    var7 = class20.field875[super.field1197].field877[super.field1198];
                }
                if (var10.field884 >= 0) {
                    var8 = var10.field884;
                    var4 += (long) (var8 - this.field1274[5] << 8);
                }
                if (var10.field885 >= 0) {
                    var9 = var10.field885;
                    var4 += (long) (var9 - this.field1274[3] << 16);
                }
            } else if (super.field1197 >= 0) {
                var6 = class20.field875[super.field1197].field877[super.field1198];
            }
            class4 var11 = (class4) field1266.method228(var4);
            if (var11 == null) {
                boolean var12 = false;
                for (int var13 = 0; var13 < 12; ++var13) {
                    int var14 = this.field1274[var13];
                    if (var9 >= 0 && var13 == 3) {
                        var14 = var9;
                    }
                    if (var8 >= 0 && var13 == 5) {
                        var14 = var8;
                    }
                    if (var14 >= 256 && var14 < 512 && !class17.field844[var14 - 256].method217((byte) 6)) {
                        var12 = true;
                    }
                    if (var14 >= 512 && !class46.method416(var14 - 512).method414(this.field1267, (byte) 23)) {
                        var12 = true;
                    }
                }
                if (var12) {
                    if (this.field1268 != -1L) {
                        var11 = (class4) field1266.method228(this.field1268);
                    }
                    if (var11 == null) {
                        return null;
                    }
                }
            }
            if (var11 == null) {
                class4[] var15 = new class4[12];
                int var16 = 0;
                for (int var17 = 0; var17 < 12; ++var17) {
                    int var19 = this.field1274[var17];
                    if (var9 >= 0 && var17 == 3) {
                        var19 = var9;
                    }
                    if (var8 >= 0 && var17 == 5) {
                        var19 = var8;
                    }
                    if (var19 >= 256 && var19 < 512) {
                        class4 var20 = class17.field844[var19 - 256].method218(0);
                        if (var20 != null) {
                            var15[var16++] = var20;
                        }
                    }
                    if (var19 >= 512) {
                        class4 var21 = class46.method416(var19 - 512).method417(682, this.field1267);
                        if (var21 != null) {
                            var15[var16++] = var21;
                        }
                    }
                }
                var11 = new class4(var15, 990, var16);
                for (int var18 = 0; var18 < 5; ++var18) {
                    if (this.field1253[var18] != 0) {
                        var11.method25(client.field230[var18][0], client.field230[var18][this.field1253[var18]]);
                        if (var18 == 1) {
                            var11.method25(client.field527[0], client.field527[this.field1253[var18]]);
                        }
                    }
                }
                var11.method18(true);
                var11.method28(64, 850, -30, -50, -30, true);
                field1266.method229(15631, var4, var11);
                this.field1268 = var4;
            }
            if (this.field1277) {
                return var11;
            } else {
                class4 var22 = class4.field28;
                if (arg0) {
                    for (int var23 = 1; var23 > 0; ++var23) {
                    }
                }
                var22.method13((byte) 7, class41.method383(var6, (byte) 8) & class41.method383(var7, (byte) 8), var11);
                if (var6 != -1 && var7 != -1) {
                    var22.method20(false, class20.field875[super.field1245].field881, var6, var7);
                } else if (var6 != -1) {
                    var22.method19(var6, (byte) 106);
                }
                var22.method15(false);
                var22.field65 = null;
                var22.field64 = null;
                return var22;
            }
        }
    }

    @OriginalMember(owner = "QIVQUKBA", name = "a", descriptor = "(B)LCCYECDYX;")
    public final class4 method181(byte arg0) {
        if (!this.field1276) {
            return null;
        } else {
            class4 var2 = this.method375(false);
            if (var2 == null) {
                return null;
            } else {
                super.field1212 = var2.field1482;
                if (arg0 == 1) {
                    boolean var3 = false;
                } else {
                    for (int var4 = 1; var4 > 0; ++var4) {
                    }
                }
                var2.field66 = true;
                if (this.field1277) {
                    return var2;
                } else {
                    if (super.field1200 != -1 && super.field1201 != -1) {
                        class71 var5 = class71.field1721[super.field1200];
                        class4 var6 = var5.method590();
                        if (var6 != null) {
                            class4 var7 = new class4(class41.method383(super.field1201, (byte) 8), -784, var6, false, true);
                            var7.method24(0, 0, 0, -super.field1204);
                            var7.method18(true);
                            var7.method19(var5.field1725.field877[super.field1201], (byte) 106);
                            var7.field65 = null;
                            var7.field64 = null;
                            if (var5.field1728 != 128 || var5.field1729 != 128) {
                                var7.method27(var5.field1728, var5.field1729, var5.field1728, (byte) 6);
                            }
                            var7.method28(var5.field1731 + 64, var5.field1732 + 850, -30, -50, -30, true);
                            class4[] var8 = new class4[] { var2, var7 };
                            var2 = new class4(true, var8, 2, 865);
                        }
                    }
                    if (this.field1264 != null) {
                        if (client.field441 >= this.field1273) {
                            this.field1264 = null;
                        }
                        if (client.field441 >= this.field1272 && client.field441 < this.field1273) {
                            class4 var9 = this.field1264;
                            var9.method24(this.field1261 - super.field1233, this.field1263 - super.field1234, 0, this.field1262 - this.field1270);
                            if (super.field1228 == 512) {
                                var9.method22((byte) 5);
                                var9.method22((byte) 5);
                                var9.method22((byte) 5);
                            } else if (super.field1228 == 1024) {
                                var9.method22((byte) 5);
                                var9.method22((byte) 5);
                            } else if (super.field1228 == 1536) {
                                var9.method22((byte) 5);
                            }
                            class4[] var10 = new class4[] { var2, var9 };
                            var2 = new class4(true, var10, 2, 865);
                            if (super.field1228 == 512) {
                                var9.method22((byte) 5);
                            } else if (super.field1228 == 1024) {
                                var9.method22((byte) 5);
                                var9.method22((byte) 5);
                            } else if (super.field1228 == 1536) {
                                var9.method22((byte) 5);
                                var9.method22((byte) 5);
                                var9.method22((byte) 5);
                            }
                            var9.method24(super.field1233 - this.field1261, super.field1234 - this.field1263, 0, this.field1270 - this.field1262);
                        }
                    }
                    var2.field66 = true;
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "QIVQUKBA", name = "b", descriptor = "(B)LCCYECDYX;")
    public final class4 method376(byte arg0) {
        if (!this.field1276) {
            return null;
        } else if (this.field1278 != null) {
            return this.field1278.method533(516);
        } else {
            boolean var2 = false;
            if (arg0 != 76) {
                throw new NullPointerException();
            } else {
                for (int var3 = 0; var3 < 12; ++var3) {
                    int var12 = this.field1274[var3];
                    if (var12 >= 256 && var12 < 512 && !class17.field844[var12 - 256].method219(0)) {
                        var2 = true;
                    }
                    if (var12 >= 512 && !class46.method416(var12 - 512).method411(this.field1267, 134)) {
                        var2 = true;
                    }
                }
                if (var2) {
                    return null;
                } else {
                    class4[] var4 = new class4[12];
                    int var5 = 0;
                    for (int var6 = 0; var6 < 12; ++var6) {
                        int var9 = this.field1274[var6];
                        if (var9 >= 256 && var9 < 512) {
                            class4 var10 = class17.field844[var9 - 256].method220(this.field1265);
                            if (var10 != null) {
                                var4[var5++] = var10;
                            }
                        }
                        if (var9 >= 512) {
                            class4 var11 = class46.method416(var9 - 512).method415(6, this.field1267);
                            if (var11 != null) {
                                var4[var5++] = var11;
                            }
                        }
                    }
                    class4 var7 = new class4(var4, 990, var5);
                    for (int var8 = 0; var8 < 5; ++var8) {
                        if (this.field1253[var8] != 0) {
                            var7.method25(client.field230[var8][0], client.field230[var8][this.field1253[var8]]);
                            if (var8 == 1) {
                                var7.method25(client.field527[0], client.field527[this.field1253[var8]]);
                            }
                        }
                    }
                    return var7;
                }
            }
        }
    }
}
