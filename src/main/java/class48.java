import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("QVUHZTUC")
public class class48 extends class40 {

    @OriginalMember(owner = "QVUHZTUC", name = "tb", descriptor = "Z")
    private boolean field1403 = false;

    @OriginalMember(owner = "QVUHZTUC", name = "vb", descriptor = "[I")
    public int[] field1405 = new int[12];

    @OriginalMember(owner = "QVUHZTUC", name = "Gb", descriptor = "Z")
    public boolean field1416 = false;

    @OriginalMember(owner = "QVUHZTUC", name = "Hb", descriptor = "[I")
    public int[] field1417 = new int[5];

    @OriginalMember(owner = "QVUHZTUC", name = "Ib", descriptor = "B")
    private byte field1418 = 8;

    @OriginalMember(owner = "QVUHZTUC", name = "Jb", descriptor = "Z")
    public boolean field1419 = false;

    @OriginalMember(owner = "QVUHZTUC", name = "Kb", descriptor = "I")
    private int field1420 = -619;

    @OriginalMember(owner = "QVUHZTUC", name = "Nb", descriptor = "I")
    private int field1423 = 5;

    @OriginalMember(owner = "QVUHZTUC", name = "Tb", descriptor = "J")
    public long field1429 = -1L;

    @OriginalMember(owner = "QVUHZTUC", name = "Ub", descriptor = "Z")
    private boolean field1430 = false;

    @OriginalMember(owner = "QVUHZTUC", name = "xb", descriptor = "LJETHVCIV;")
    public static class24 field1407 = new class24(false, 260);

    @OriginalMember(owner = "QVUHZTUC", name = "sb", descriptor = "I")
    private int field1402;

    @OriginalMember(owner = "QVUHZTUC", name = "ub", descriptor = "I")
    public int field1404;

    @OriginalMember(owner = "QVUHZTUC", name = "yb", descriptor = "I")
    public int field1408;

    @OriginalMember(owner = "QVUHZTUC", name = "zb", descriptor = "I")
    public int field1409;

    @OriginalMember(owner = "QVUHZTUC", name = "Ab", descriptor = "I")
    public int field1410;

    @OriginalMember(owner = "QVUHZTUC", name = "Cb", descriptor = "I")
    public int field1412;

    @OriginalMember(owner = "QVUHZTUC", name = "Db", descriptor = "I")
    public int field1413;

    @OriginalMember(owner = "QVUHZTUC", name = "Eb", descriptor = "I")
    public int field1414;

    @OriginalMember(owner = "QVUHZTUC", name = "Fb", descriptor = "I")
    public int field1415;

    @OriginalMember(owner = "QVUHZTUC", name = "Mb", descriptor = "I")
    public int field1422;

    @OriginalMember(owner = "QVUHZTUC", name = "Ob", descriptor = "I")
    public int field1424;

    @OriginalMember(owner = "QVUHZTUC", name = "Pb", descriptor = "I")
    public int field1425;

    @OriginalMember(owner = "QVUHZTUC", name = "Qb", descriptor = "I")
    public int field1426;

    @OriginalMember(owner = "QVUHZTUC", name = "Sb", descriptor = "I")
    public int field1428;

    @OriginalMember(owner = "QVUHZTUC", name = "Vb", descriptor = "I")
    public int field1431;

    @OriginalMember(owner = "QVUHZTUC", name = "Wb", descriptor = "I")
    public int field1432;

    @OriginalMember(owner = "QVUHZTUC", name = "Rb", descriptor = "J")
    public long field1427;

    @OriginalMember(owner = "QVUHZTUC", name = "Bb", descriptor = "LJLNSJQDR;")
    public class26 field1411;

    @OriginalMember(owner = "QVUHZTUC", name = "Lb", descriptor = "LRRZTMHXJ;")
    public class52 field1421;

    @OriginalMember(owner = "QVUHZTUC", name = "wb", descriptor = "Ljava/lang/String;")
    public String field1406;

    @OriginalMember(owner = "QVUHZTUC", name = "a", descriptor = "(B)LJLNSJQDR;")
    private final class26 method465(byte arg0) {
        if (arg0 == 8) {
            boolean var2 = false;
        } else {
            this.field1423 = 133;
        }
        if (this.field1421 != null) {
            int var3 = -1;
            if (super.field1291 >= 0 && super.field1294 == 0) {
                var3 = class42.field1314[super.field1291].field1316[super.field1292];
            } else if (super.field1283 >= 0) {
                var3 = class42.field1314[super.field1283].field1316[super.field1284];
            }
            return this.field1421.method485((int[]) null, var3, -1, 0);
        } else {
            long var5 = this.field1427;
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            int var10 = -1;
            if (super.field1291 >= 0 && super.field1294 == 0) {
                class42 var11 = class42.field1314[super.field1291];
                var7 = var11.field1316[super.field1292];
                if (super.field1283 >= 0 && super.field1299 != super.field1283) {
                    var8 = class42.field1314[super.field1283].field1316[super.field1284];
                }
                if (var11.field1323 >= 0) {
                    var9 = var11.field1323;
                    var5 += (long) (var9 - this.field1405[5] << 8);
                }
                if (var11.field1324 >= 0) {
                    var10 = var11.field1324;
                    var5 += (long) (var10 - this.field1405[3] << 16);
                }
            } else if (super.field1283 >= 0) {
                var7 = class42.field1314[super.field1283].field1316[super.field1284];
            }
            class26 var12 = (class26) field1407.method315(var5);
            if (var12 == null) {
                boolean var13 = false;
                for (int var14 = 0; var14 < 12; ++var14) {
                    int var15 = this.field1405[var14];
                    if (var10 >= 0 && var14 == 3) {
                        var15 = var10;
                    }
                    if (var9 >= 0 && var14 == 5) {
                        var15 = var9;
                    }
                    if (var15 >= 256 && var15 < 512 && !class51.field1447[var15 - 256].method478(6)) {
                        var13 = true;
                    }
                    if (var15 >= 512 && !class33.method409(var15 - 512).method411((byte) 2, this.field1404)) {
                        var13 = true;
                    }
                }
                if (var13) {
                    if (this.field1429 != -1L) {
                        var12 = (class26) field1407.method315(this.field1429);
                    }
                    if (var12 == null) {
                        return null;
                    }
                }
            }
            if (var12 == null) {
                class26[] var16 = new class26[12];
                int var17 = 0;
                for (int var18 = 0; var18 < 12; ++var18) {
                    int var20 = this.field1405[var18];
                    if (var10 >= 0 && var18 == 3) {
                        var20 = var10;
                    }
                    if (var9 >= 0 && var18 == 5) {
                        var20 = var9;
                    }
                    if (var20 >= 256 && var20 < 512) {
                        class26 var21 = class51.field1447[var20 - 256].method479(-233);
                        if (var21 != null) {
                            var16[var17++] = var21;
                        }
                    }
                    if (var20 >= 512) {
                        class26 var22 = class33.method409(var20 - 512).method412(3, this.field1404);
                        if (var22 != null) {
                            var16[var17++] = var22;
                        }
                    }
                }
                var12 = new class26(9, var17, var16);
                for (int var19 = 0; var19 < 5; ++var19) {
                    if (this.field1417[var19] != 0) {
                        var12.method342(client.field132[var19][0], client.field132[var19][this.field1417[var19]]);
                        if (var19 == 1) {
                            var12.method342(client.field458[0], client.field458[this.field1417[var19]]);
                        }
                    }
                }
                var12.method335(19035);
                var12.method345(64, 850, -30, -50, -30, true);
                field1407.method316(-363, var12, var5);
                this.field1429 = var5;
            }
            if (this.field1419) {
                return var12;
            } else {
                class26 var23 = class26.field943;
                var23.method330(var12, class59.method524((byte) 8, var7) & class59.method524((byte) 8, var8), (byte) 0);
                if (var7 != -1 && var8 != -1) {
                    var23.method337(class42.field1314[super.field1291].field1320, 666, var7, var8);
                } else if (var7 != -1) {
                    var23.method336((byte) 46, var7);
                }
                var23.method332(true);
                var23.field980 = null;
                var23.field979 = null;
                return var23;
            }
        }
    }

    @OriginalMember(owner = "QVUHZTUC", name = "a", descriptor = "(I)LJLNSJQDR;")
    public final class26 method2(int arg0) {
        if (!this.field1416) {
            return null;
        } else {
            class26 var2 = this.method465(this.field1418);
            if (arg0 < this.field1423 || arg0 > this.field1423) {
                this.field1423 = -454;
            }
            if (var2 == null) {
                return null;
            } else {
                super.field1267 = var2.field6;
                var2.field981 = true;
                if (this.field1419) {
                    return var2;
                } else {
                    if (super.field1256 != -1 && super.field1257 != -1) {
                        class35 var3 = class35.field1198[super.field1256];
                        class26 var4 = var3.method423();
                        if (var4 != null) {
                            class26 var5 = new class26(class59.method524((byte) 8, super.field1257), false, true, true, var4);
                            var5.method341(true, -super.field1260, 0, 0);
                            var5.method335(19035);
                            var5.method336((byte) 46, var3.field1202.field1316[super.field1257]);
                            var5.field980 = null;
                            var5.field979 = null;
                            if (var3.field1205 != 128 || var3.field1206 != 128) {
                                var5.method344(var3.field1205, -190, var3.field1206, var3.field1205);
                            }
                            var5.method345(var3.field1208 + 64, var3.field1209 + 850, -30, -50, -30, true);
                            class26[] var6 = new class26[] { var2, var5 };
                            var2 = new class26(true, var6, 2, false);
                        }
                    }
                    if (this.field1411 != null) {
                        if (client.field291 >= this.field1426) {
                            this.field1411 = null;
                        }
                        if (client.field291 >= this.field1425 && client.field291 < this.field1426) {
                            class26 var7 = this.field1411;
                            var7.method341(true, this.field1409 - this.field1428, this.field1410 - super.field1269, this.field1408 - super.field1268);
                            if (super.field1253 == 512) {
                                var7.method339((byte) 1);
                                var7.method339((byte) 1);
                                var7.method339((byte) 1);
                            } else if (super.field1253 == 1024) {
                                var7.method339((byte) 1);
                                var7.method339((byte) 1);
                            } else if (super.field1253 == 1536) {
                                var7.method339((byte) 1);
                            }
                            class26[] var8 = new class26[] { var2, var7 };
                            var2 = new class26(true, var8, 2, false);
                            if (super.field1253 == 512) {
                                var7.method339((byte) 1);
                            } else if (super.field1253 == 1024) {
                                var7.method339((byte) 1);
                                var7.method339((byte) 1);
                            } else if (super.field1253 == 1536) {
                                var7.method339((byte) 1);
                                var7.method339((byte) 1);
                                var7.method339((byte) 1);
                            }
                            var7.method341(true, this.field1428 - this.field1409, super.field1269 - this.field1410, super.field1268 - this.field1408);
                        }
                    }
                    var2.field981 = true;
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "QVUHZTUC", name = "b", descriptor = "(I)LJLNSJQDR;")
    public final class26 method466(int arg0) {
        if (!this.field1416) {
            return null;
        } else if (this.field1421 != null) {
            return this.field1421.method486(this.field1402);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var12 = this.field1405[var3];
                if (var12 >= 256 && var12 < 512 && !class51.field1447[var12 - 256].method480(584)) {
                    var2 = true;
                }
                if (var12 >= 512 && !class33.method409(var12 - 512).method414((byte) 4, this.field1404)) {
                    var2 = true;
                }
            }
            while (arg0 >= 0) {
                this.field1423 = -43;
            }
            if (var2) {
                return null;
            } else {
                class26[] var4 = new class26[12];
                int var5 = 0;
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var9 = this.field1405[var6];
                    if (var9 >= 256 && var9 < 512) {
                        class26 var10 = class51.field1447[var9 - 256].method481(719);
                        if (var10 != null) {
                            var4[var5++] = var10;
                        }
                    }
                    if (var9 >= 512) {
                        class26 var11 = class33.method409(var9 - 512).method410(true, this.field1404);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                }
                class26 var7 = new class26(9, var5, var4);
                for (int var8 = 0; var8 < 5; ++var8) {
                    if (this.field1417[var8] != 0) {
                        var7.method342(client.field132[var8][0], client.field132[var8][this.field1417[var8]]);
                        if (var8 == 1) {
                            var7.method342(client.field458[0], client.field458[this.field1417[var8]]);
                        }
                    }
                }
                return var7;
            }
        }
    }

    @OriginalMember(owner = "QVUHZTUC", name = "a", descriptor = "(BLBJPWOXRJ;)V")
    public final void method467(byte arg0, class3 arg1) {
        if (arg0 != 3) {
            this.field1403 = !this.field1403;
        }
        arg1.field20 = 0;
        this.field1404 = arg1.method15();
        this.field1432 = arg1.method15();
        this.field1421 = null;
        this.field1422 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg1.method15();
            if (var4 == 0) {
                this.field1405[var3] = 0;
            } else {
                int var5 = arg1.method15();
                this.field1405[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field1405[0] == 65535) {
                    this.field1421 = class52.method488(arg1.method17());
                    break;
                }
                if (this.field1405[var3] >= 512 && this.field1405[var3] - 512 < class33.field1147) {
                    int var10 = class33.method409(this.field1405[var3] - 512).field1154;
                    if (var10 != 0) {
                        this.field1422 = var10;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var9 = arg1.method15();
            if (var9 < 0 || var9 >= client.field132[var6].length) {
                var9 = 0;
            }
            this.field1417[var6] = var9;
        }
        super.field1299 = arg1.method17();
        if (super.field1299 == 65535) {
            super.field1299 = -1;
        }
        super.field1300 = arg1.method17();
        if (super.field1300 == 65535) {
            super.field1300 = -1;
        }
        super.field1287 = arg1.method17();
        if (super.field1287 == 65535) {
            super.field1287 = -1;
        }
        super.field1288 = arg1.method17();
        if (super.field1288 == 65535) {
            super.field1288 = -1;
        }
        super.field1289 = arg1.method17();
        if (super.field1289 == 65535) {
            super.field1289 = -1;
        }
        super.field1290 = arg1.method17();
        if (super.field1290 == 65535) {
            super.field1290 = -1;
        }
        super.field1261 = arg1.method17();
        if (super.field1261 == 65535) {
            super.field1261 = -1;
        }
        this.field1406 = class44.method463((byte) -2, class44.method460(arg1.method21((byte) 7), -437));
        this.field1424 = arg1.method15();
        this.field1431 = arg1.method17();
        this.field1416 = true;
        this.field1427 = 0L;
        for (int var7 = 0; var7 < 12; ++var7) {
            this.field1427 <<= 4;
            if (this.field1405[var7] >= 256) {
                this.field1427 += (long) (this.field1405[var7] - 256);
            }
        }
        if (this.field1405[0] >= 256) {
            this.field1427 += (long) (this.field1405[0] - 256 >> 4);
        }
        if (this.field1405[1] >= 256) {
            this.field1427 += (long) (this.field1405[1] - 256 >> 8);
        }
        for (int var8 = 0; var8 < 5; ++var8) {
            this.field1427 <<= 3;
            this.field1427 += (long) this.field1417[var8];
        }
        this.field1427 <<= 1;
        this.field1427 += (long) this.field1404;
    }

    @OriginalMember(owner = "QVUHZTUC", name = "a", descriptor = "(Z)Z")
    public final boolean method297(boolean arg0) {
        if (arg0) {
            this.field1403 = !this.field1403;
        }
        return this.field1416;
    }
}
