import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("QGDSNXKJ")
public class class48 extends class55 {

    @OriginalMember(owner = "QGDSNXKJ", name = "ub", descriptor = "Z")
    public boolean field1268 = false;

    @OriginalMember(owner = "QGDSNXKJ", name = "yb", descriptor = "[I")
    public int[] field1272 = new int[5];

    @OriginalMember(owner = "QGDSNXKJ", name = "zb", descriptor = "I")
    private int field1273 = -47097;

    @OriginalMember(owner = "QGDSNXKJ", name = "Ab", descriptor = "Z")
    public boolean field1274 = false;

    @OriginalMember(owner = "QGDSNXKJ", name = "Bb", descriptor = "J")
    public long field1275 = -1L;

    @OriginalMember(owner = "QGDSNXKJ", name = "Hb", descriptor = "I")
    private int field1281 = 635;

    @OriginalMember(owner = "QGDSNXKJ", name = "Ib", descriptor = "I")
    public int field1282 = -1;

    @OriginalMember(owner = "QGDSNXKJ", name = "Pb", descriptor = "I")
    public int field1289 = -1;

    @OriginalMember(owner = "QGDSNXKJ", name = "Rb", descriptor = "Z")
    private boolean field1291 = true;

    @OriginalMember(owner = "QGDSNXKJ", name = "Sb", descriptor = "[I")
    public int[] field1292 = new int[12];

    @OriginalMember(owner = "QGDSNXKJ", name = "tb", descriptor = "LWIUIWDML;")
    public static class66 field1267 = new class66(-99, 260);

    @OriginalMember(owner = "QGDSNXKJ", name = "rb", descriptor = "I")
    public int field1265;

    @OriginalMember(owner = "QGDSNXKJ", name = "sb", descriptor = "I")
    public int field1266;

    @OriginalMember(owner = "QGDSNXKJ", name = "wb", descriptor = "I")
    public int field1270;

    @OriginalMember(owner = "QGDSNXKJ", name = "Cb", descriptor = "I")
    public int field1276;

    @OriginalMember(owner = "QGDSNXKJ", name = "Db", descriptor = "I")
    public int field1277;

    @OriginalMember(owner = "QGDSNXKJ", name = "Eb", descriptor = "I")
    public int field1278;

    @OriginalMember(owner = "QGDSNXKJ", name = "Fb", descriptor = "I")
    public int field1279;

    @OriginalMember(owner = "QGDSNXKJ", name = "Gb", descriptor = "I")
    public int field1280;

    @OriginalMember(owner = "QGDSNXKJ", name = "Kb", descriptor = "I")
    public int field1284;

    @OriginalMember(owner = "QGDSNXKJ", name = "Lb", descriptor = "I")
    public int field1285;

    @OriginalMember(owner = "QGDSNXKJ", name = "Mb", descriptor = "I")
    public int field1286;

    @OriginalMember(owner = "QGDSNXKJ", name = "Ob", descriptor = "I")
    public int field1288;

    @OriginalMember(owner = "QGDSNXKJ", name = "Qb", descriptor = "I")
    public int field1290;

    @OriginalMember(owner = "QGDSNXKJ", name = "Tb", descriptor = "I")
    public int field1293;

    @OriginalMember(owner = "QGDSNXKJ", name = "xb", descriptor = "J")
    public long field1271;

    @OriginalMember(owner = "QGDSNXKJ", name = "Nb", descriptor = "LPSGMMDJS;")
    public class45 field1287;

    @OriginalMember(owner = "QGDSNXKJ", name = "Jb", descriptor = "LYIBRLAQY;")
    public class70 field1283;

    @OriginalMember(owner = "QGDSNXKJ", name = "vb", descriptor = "Ljava/lang/String;")
    public String field1269;

    @OriginalMember(owner = "QGDSNXKJ", name = "a", descriptor = "(BLPKHWFJLM;)V")
    public final void method447(byte arg0, class43 arg1) {
        arg1.field1105 = 0;
        this.field1276 = arg1.method330();
        this.field1289 = arg1.method331();
        if (arg0 != 5) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        this.field1282 = arg1.method331();
        this.field1283 = null;
        this.field1290 = 0;
        for (int var4 = 0; var4 < 12; ++var4) {
            int var5 = arg1.method330();
            if (var5 == 0) {
                this.field1292[var4] = 0;
            } else {
                int var6 = arg1.method330();
                this.field1292[var4] = (var5 << 8) + var6;
                if (var4 == 0 && this.field1292[0] == 65535) {
                    this.field1283 = class70.method579(arg1.method332());
                    break;
                }
                if (this.field1292[var4] >= 512 && this.field1292[var4] - 512 < class21.field834) {
                    int var11 = class21.method236(this.field1292[var4] - 512).field817;
                    if (var11 != 0) {
                        this.field1290 = var11;
                    }
                }
            }
        }
        for (int var7 = 0; var7 < 5; ++var7) {
            int var10 = arg1.method330();
            if (var10 < 0 || var10 >= client.field563[var7].length) {
                var10 = 0;
            }
            this.field1272[var7] = var10;
        }
        super.field1419 = arg1.method332();
        if (super.field1419 == 65535) {
            super.field1419 = -1;
        }
        super.field1420 = arg1.method332();
        if (super.field1420 == 65535) {
            super.field1420 = -1;
        }
        super.field1470 = arg1.method332();
        if (super.field1470 == 65535) {
            super.field1470 = -1;
        }
        super.field1471 = arg1.method332();
        if (super.field1471 == 65535) {
            super.field1471 = -1;
        }
        super.field1472 = arg1.method332();
        if (super.field1472 == 65535) {
            super.field1472 = -1;
        }
        super.field1473 = arg1.method332();
        if (super.field1473 == 65535) {
            super.field1473 = -1;
        }
        super.field1426 = arg1.method332();
        if (super.field1426 == 65535) {
            super.field1426 = -1;
        }
        this.field1269 = class36.method304(-616, class36.method301((byte) 7, arg1.method336(7)));
        this.field1270 = arg1.method330();
        this.field1293 = arg1.method332();
        this.field1268 = true;
        this.field1271 = 0L;
        for (int var8 = 0; var8 < 12; ++var8) {
            this.field1271 <<= 4;
            if (this.field1292[var8] >= 256) {
                this.field1271 += (long) (this.field1292[var8] - 256);
            }
        }
        if (this.field1292[0] >= 256) {
            this.field1271 += (long) (this.field1292[0] - 256 >> 4);
        }
        if (this.field1292[1] >= 256) {
            this.field1271 += (long) (this.field1292[1] - 256 >> 8);
        }
        for (int var9 = 0; var9 < 5; ++var9) {
            this.field1271 <<= 3;
            this.field1271 += (long) this.field1272[var9];
        }
        this.field1271 <<= 1;
        this.field1271 += (long) this.field1276;
    }

    @OriginalMember(owner = "QGDSNXKJ", name = "a", descriptor = "(I)LPSGMMDJS;")
    public final class45 method196(int arg0) {
        if (!this.field1268) {
            return null;
        } else {
            class45 var2 = this.method448(-3861);
            if (arg0 != 27243) {
                this.field1291 = !this.field1291;
            }
            if (var2 == null) {
                return null;
            } else {
                super.field1448 = var2.field1520;
                var2.field1183 = true;
                if (this.field1274) {
                    return var2;
                } else {
                    if (super.field1464 != -1 && super.field1465 != -1) {
                        class23 var3 = class23.field866[super.field1464];
                        class45 var4 = var3.method251();
                        if (var4 != null) {
                            class45 var5 = new class45(var4, -42752, class3.method5((byte) 2, super.field1465), true, false);
                            var5.method423(-super.field1468, 0, 0, -20378);
                            var5.method417(true);
                            var5.method418(0, var3.field870.field658[super.field1465]);
                            var5.field1182 = null;
                            var5.field1181 = null;
                            if (var3.field873 != 128 || var3.field874 != 128) {
                                var5.method426(var3.field874, var3.field873, var3.field873, 34836);
                            }
                            var5.method427(var3.field876 + 64, var3.field877 + 850, -30, -50, -30, true);
                            class45[] var6 = new class45[] { var2, var5 };
                            var2 = new class45(2, var6, true, true);
                        }
                    }
                    if (this.field1287 != null) {
                        if (client.field525 >= this.field1266) {
                            this.field1287 = null;
                        }
                        if (client.field525 >= this.field1265 && client.field525 < this.field1266) {
                            class45 var7 = this.field1287;
                            var7.method423(this.field1285 - this.field1288, this.field1286 - super.field1454, this.field1284 - super.field1453, -20378);
                            if (super.field1463 == 512) {
                                var7.method421(6);
                                var7.method421(6);
                                var7.method421(6);
                            } else if (super.field1463 == 1024) {
                                var7.method421(6);
                                var7.method421(6);
                            } else if (super.field1463 == 1536) {
                                var7.method421(6);
                            }
                            class45[] var8 = new class45[] { var2, var7 };
                            var2 = new class45(2, var8, true, true);
                            if (super.field1463 == 512) {
                                var7.method421(6);
                            } else if (super.field1463 == 1024) {
                                var7.method421(6);
                                var7.method421(6);
                            } else if (super.field1463 == 1536) {
                                var7.method421(6);
                                var7.method421(6);
                                var7.method421(6);
                            }
                            var7.method423(this.field1288 - this.field1285, super.field1454 - this.field1286, super.field1453 - this.field1284, -20378);
                        }
                    }
                    var2.field1183 = true;
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "QGDSNXKJ", name = "b", descriptor = "(I)LPSGMMDJS;")
    private final class45 method448(int arg0) {
        if (this.field1283 != null) {
            int var2 = -1;
            if (super.field1427 >= 0 && super.field1430 == 0) {
                var2 = class14.field656[super.field1427].field658[super.field1428];
            } else if (super.field1456 >= 0) {
                var2 = class14.field656[super.field1456].field658[super.field1457];
            }
            return this.field1283.method581(var2, -1, (int[]) null, this.field1273);
        } else {
            long var4 = this.field1271;
            if (arg0 != -3861) {
                for (int var6 = 1; var6 > 0; ++var6) {
                }
            }
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            int var10 = -1;
            if (super.field1427 >= 0 && super.field1430 == 0) {
                class14 var11 = class14.field656[super.field1427];
                var7 = var11.field658[super.field1428];
                if (super.field1456 >= 0 && super.field1456 != super.field1419) {
                    var8 = class14.field656[super.field1456].field658[super.field1457];
                }
                if (var11.field665 >= 0) {
                    var9 = var11.field665;
                    var4 += (long) (var9 - this.field1292[5] << 8);
                }
                if (var11.field666 >= 0) {
                    var10 = var11.field666;
                    var4 += (long) (var10 - this.field1292[3] << 16);
                }
            } else if (super.field1456 >= 0) {
                var7 = class14.field656[super.field1456].field658[super.field1457];
            }
            class45 var12 = (class45) field1267.method519(var4);
            if (var12 == null) {
                boolean var13 = false;
                for (int var14 = 0; var14 < 12; ++var14) {
                    int var15 = this.field1292[var14];
                    if (var10 >= 0 && var14 == 3) {
                        var15 = var10;
                    }
                    if (var9 >= 0 && var14 == 5) {
                        var15 = var9;
                    }
                    if (var15 >= 256 && var15 < 512 && !class46.field1223[var15 - 256].method438((byte) -91)) {
                        var13 = true;
                    }
                    if (var15 >= 512 && !class21.method236(var15 - 512).method235(false, this.field1276)) {
                        var13 = true;
                    }
                }
                if (var13) {
                    if (this.field1275 != -1L) {
                        var12 = (class45) field1267.method519(this.field1275);
                    }
                    if (var12 == null) {
                        return null;
                    }
                }
            }
            if (var12 == null) {
                class45[] var16 = new class45[12];
                int var17 = 0;
                for (int var18 = 0; var18 < 12; ++var18) {
                    int var20 = this.field1292[var18];
                    if (var10 >= 0 && var18 == 3) {
                        var20 = var10;
                    }
                    if (var9 >= 0 && var18 == 5) {
                        var20 = var9;
                    }
                    if (var20 >= 256 && var20 < 512) {
                        class45 var21 = class46.field1223[var20 - 256].method439(8);
                        if (var21 != null) {
                            var16[var17++] = var21;
                        }
                    }
                    if (var20 >= 512) {
                        class45 var22 = class21.method236(var20 - 512).method238(this.field1276, 9671);
                        if (var22 != null) {
                            var16[var17++] = var22;
                        }
                    }
                }
                var12 = new class45(8111, var17, var16);
                for (int var19 = 0; var19 < 5; ++var19) {
                    if (this.field1272[var19] != 0) {
                        var12.method424(client.field563[var19][0], client.field563[var19][this.field1272[var19]]);
                        if (var19 == 1) {
                            var12.method424(client.field533[0], client.field533[this.field1272[var19]]);
                        }
                    }
                }
                var12.method417(true);
                var12.method427(64, 850, -30, -50, -30, true);
                field1267.method520(this.field1281, var4, var12);
                this.field1275 = var4;
            }
            if (this.field1274) {
                return var12;
            } else {
                class45 var23 = class45.field1145;
                var23.method412(2, var12, class3.method5((byte) 2, var7) & class3.method5((byte) 2, var8));
                if (var7 != -1 && var8 != -1) {
                    var23.method419(class14.field656[super.field1427].field662, true, var8, var7);
                } else if (var7 != -1) {
                    var23.method418(0, var7);
                }
                var23.method414((byte) 7);
                var23.field1182 = null;
                var23.field1181 = null;
                return var23;
            }
        }
    }

    @OriginalMember(owner = "QGDSNXKJ", name = "c", descriptor = "(B)LPSGMMDJS;")
    public final class45 method449(byte arg0) {
        if (!this.field1268) {
            return null;
        } else if (this.field1283 != null) {
            return this.field1283.method582(-23891);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var12 = this.field1292[var3];
                if (var12 >= 256 && var12 < 512 && !class46.field1223[var12 - 256].method440(-44)) {
                    var2 = true;
                }
                if (var12 >= 512 && !class21.method236(var12 - 512).method231(this.field1276, false)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                class45[] var4 = new class45[12];
                int var5 = 0;
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var9 = this.field1292[var6];
                    if (var9 >= 256 && var9 < 512) {
                        class45 var10 = class46.field1223[var9 - 256].method441((byte) 96);
                        if (var10 != null) {
                            var4[var5++] = var10;
                        }
                    }
                    if (var9 >= 512) {
                        class45 var11 = class21.method236(var9 - 512).method242(false, this.field1276);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                }
                class45 var7 = new class45(8111, var5, var4);
                for (int var8 = 0; var8 < 5; ++var8) {
                    if (this.field1272[var8] != 0) {
                        var7.method424(client.field563[var8][0], client.field563[var8][this.field1272[var8]]);
                        if (var8 == 1) {
                            var7.method424(client.field533[0], client.field533[this.field1272[var8]]);
                        }
                    }
                }
                if (arg0 != 71) {
                    throw new NullPointerException();
                } else {
                    return var7;
                }
            }
        }
    }

    @OriginalMember(owner = "QGDSNXKJ", name = "a", descriptor = "(B)Z")
    public final boolean method316(byte arg0) {
        if (arg0 != 127) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        return this.field1268;
    }
}
