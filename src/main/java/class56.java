import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("UFGXOLGK")
public class class56 extends class54 {

    @OriginalMember(owner = "UFGXOLGK", name = "rb", descriptor = "[I")
    public int[] field1471 = new int[12];

    @OriginalMember(owner = "UFGXOLGK", name = "tb", descriptor = "Z")
    public boolean field1473 = false;

    @OriginalMember(owner = "UFGXOLGK", name = "vb", descriptor = "I")
    public int field1475 = -1;

    @OriginalMember(owner = "UFGXOLGK", name = "wb", descriptor = "[I")
    public int[] field1476 = new int[5];

    @OriginalMember(owner = "UFGXOLGK", name = "yb", descriptor = "I")
    public int field1478 = -1;

    @OriginalMember(owner = "UFGXOLGK", name = "zb", descriptor = "J")
    public long field1479 = -1L;

    @OriginalMember(owner = "UFGXOLGK", name = "Gb", descriptor = "Z")
    public boolean field1486 = false;

    @OriginalMember(owner = "UFGXOLGK", name = "Pb", descriptor = "I")
    private int field1495 = 33820;

    @OriginalMember(owner = "UFGXOLGK", name = "pb", descriptor = "LEOJHVRZF;")
    public static class12 field1469 = new class12(10369, 260);

    @OriginalMember(owner = "UFGXOLGK", name = "qb", descriptor = "I")
    public int field1470;

    @OriginalMember(owner = "UFGXOLGK", name = "sb", descriptor = "I")
    public int field1472;

    @OriginalMember(owner = "UFGXOLGK", name = "ub", descriptor = "I")
    public int field1474;

    @OriginalMember(owner = "UFGXOLGK", name = "xb", descriptor = "I")
    public int field1477;

    @OriginalMember(owner = "UFGXOLGK", name = "Ab", descriptor = "I")
    public int field1480;

    @OriginalMember(owner = "UFGXOLGK", name = "Cb", descriptor = "I")
    public int field1482;

    @OriginalMember(owner = "UFGXOLGK", name = "Db", descriptor = "I")
    public int field1483;

    @OriginalMember(owner = "UFGXOLGK", name = "Eb", descriptor = "I")
    public int field1484;

    @OriginalMember(owner = "UFGXOLGK", name = "Jb", descriptor = "I")
    public int field1489;

    @OriginalMember(owner = "UFGXOLGK", name = "Kb", descriptor = "I")
    public int field1490;

    @OriginalMember(owner = "UFGXOLGK", name = "Lb", descriptor = "I")
    public int field1491;

    @OriginalMember(owner = "UFGXOLGK", name = "Mb", descriptor = "I")
    public int field1492;

    @OriginalMember(owner = "UFGXOLGK", name = "Nb", descriptor = "I")
    public int field1493;

    @OriginalMember(owner = "UFGXOLGK", name = "Ob", descriptor = "I")
    public int field1494;

    @OriginalMember(owner = "UFGXOLGK", name = "Hb", descriptor = "J")
    public long field1487;

    @OriginalMember(owner = "UFGXOLGK", name = "Bb", descriptor = "LJKAPIYZO;")
    public class24 field1481;

    @OriginalMember(owner = "UFGXOLGK", name = "Fb", descriptor = "LWEVRTBOZ;")
    public class66 field1485;

    @OriginalMember(owner = "UFGXOLGK", name = "Ib", descriptor = "Ljava/lang/String;")
    public String field1488;

    @OriginalMember(owner = "UFGXOLGK", name = "a", descriptor = "(I)LWEVRTBOZ;")
    public final class66 method495(int arg0) {
        if (!this.field1473) {
            return null;
        } else if (this.field1481 != null) {
            return this.field1481.method281(7);
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < 12; ++var3) {
                int var12 = this.field1471[var3];
                if (var12 >= 256 && var12 < 512 && !class36.field1099[var12 - 256].method337(false)) {
                    var2 = true;
                }
                if (var12 >= 512 && !class31.method322(var12 - 512).method315(this.field1470, (byte) 1)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            } else {
                class66[] var4 = new class66[12];
                int var5 = 0;
                for (int var6 = 0; var6 < 12; ++var6) {
                    int var9 = this.field1471[var6];
                    if (var9 >= 256 && var9 < 512) {
                        class66 var10 = class36.field1099[var9 - 256].method338(2);
                        if (var10 != null) {
                            var4[var5++] = var10;
                        }
                    }
                    if (var9 >= 512) {
                        class66 var11 = class31.method322(var9 - 512).method321(this.field1470, false);
                        if (var11 != null) {
                            var4[var5++] = var11;
                        }
                    }
                }
                class66 var7 = new class66(true, var5, var4);
                if (arg0 != 0) {
                    throw new NullPointerException();
                } else {
                    for (int var8 = 0; var8 < 5; ++var8) {
                        if (this.field1476[var8] != 0) {
                            var7.method539(client.field303[var8][0], client.field303[var8][this.field1476[var8]]);
                            if (var8 == 1) {
                                var7.method539(client.field118[0], client.field118[this.field1476[var8]]);
                            }
                        }
                    }
                    return var7;
                }
            }
        }
    }

    @OriginalMember(owner = "UFGXOLGK", name = "a", descriptor = "(Z)LWEVRTBOZ;")
    public final class66 method225(boolean arg0) {
        if (!this.field1473) {
            return null;
        } else {
            class66 var2 = this.method497((byte) 6);
            if (var2 == null) {
                return null;
            } else {
                super.field1433 = var2.field1085;
                var2.field1619 = true;
                if (!arg0) {
                    throw new NullPointerException();
                } else if (this.field1486) {
                    return var2;
                } else {
                    if (super.field1396 != -1 && super.field1397 != -1) {
                        class43 var3 = class43.field1253[super.field1396];
                        class66 var4 = var3.method404();
                        if (var4 != null) {
                            class66 var5 = new class66(107, var4, class15.method218(super.field1397, true), false, true);
                            var5.method538(-super.field1400, 0, 0, -225);
                            var5.method532((byte) 2);
                            var5.method533(var3.field1257.field1282[super.field1397], 803);
                            var5.field1618 = null;
                            var5.field1617 = null;
                            if (var3.field1260 != 128 || var3.field1261 != 128) {
                                var5.method541(var3.field1260, var3.field1260, var3.field1261, 49106);
                            }
                            var5.method542(var3.field1263 + 64, var3.field1264 + 850, -30, -50, -30, true);
                            class66[] var6 = new class66[] { var2, var5 };
                            var2 = new class66(var6, true, true, 2);
                        }
                    }
                    if (this.field1485 != null) {
                        if (client.field347 >= this.field1490) {
                            this.field1485 = null;
                        }
                        if (client.field347 >= this.field1489 && client.field347 < this.field1490) {
                            class66 var7 = this.field1485;
                            var7.method538(this.field1483 - this.field1472, this.field1484 - super.field1423, this.field1482 - super.field1422, -225);
                            if (super.field1434 == 512) {
                                var7.method536(644);
                                var7.method536(644);
                                var7.method536(644);
                            } else if (super.field1434 == 1024) {
                                var7.method536(644);
                                var7.method536(644);
                            } else if (super.field1434 == 1536) {
                                var7.method536(644);
                            }
                            class66[] var8 = new class66[] { var2, var7 };
                            var2 = new class66(var8, true, true, 2);
                            if (super.field1434 == 512) {
                                var7.method536(644);
                            } else if (super.field1434 == 1024) {
                                var7.method536(644);
                                var7.method536(644);
                            } else if (super.field1434 == 1536) {
                                var7.method536(644);
                                var7.method536(644);
                                var7.method536(644);
                            }
                            var7.method538(this.field1472 - this.field1483, super.field1423 - this.field1484, super.field1422 - this.field1482, -225);
                        }
                    }
                    var2.field1619 = true;
                    return var2;
                }
            }
        }
    }

    @OriginalMember(owner = "UFGXOLGK", name = "a", descriptor = "(BLUAWAYCTK;)V")
    public final void method496(byte arg0, class55 arg1) {
        arg1.field1456 = 0;
        this.field1470 = arg1.method455();
        this.field1475 = arg1.method456();
        this.field1478 = arg1.method456();
        this.field1481 = null;
        this.field1474 = 0;
        for (int var3 = 0; var3 < 12; ++var3) {
            int var4 = arg1.method455();
            if (var4 == 0) {
                this.field1471[var3] = 0;
            } else {
                int var5 = arg1.method455();
                this.field1471[var3] = (var4 << 8) + var5;
                if (var3 == 0 && this.field1471[0] == 65535) {
                    this.field1481 = class24.method284(arg1.method457());
                    break;
                }
                if (this.field1471[var3] >= 512 && this.field1471[var3] - 512 < class31.field1054) {
                    int var11 = class31.method322(this.field1471[var3] - 512).field1059;
                    if (var11 != 0) {
                        this.field1474 = var11;
                    }
                }
            }
        }
        for (int var6 = 0; var6 < 5; ++var6) {
            int var10 = arg1.method455();
            if (var10 < 0 || var10 >= client.field303[var6].length) {
                var10 = 0;
            }
            this.field1476[var6] = var10;
        }
        super.field1407 = arg1.method457();
        if (super.field1407 == 65535) {
            super.field1407 = -1;
        }
        super.field1408 = arg1.method457();
        if (super.field1408 == 65535) {
            super.field1408 = -1;
        }
        super.field1410 = arg1.method457();
        if (super.field1410 == 65535) {
            super.field1410 = -1;
        }
        super.field1411 = arg1.method457();
        if (super.field1411 == 65535) {
            super.field1411 = -1;
        }
        super.field1412 = arg1.method457();
        if (super.field1412 == 65535) {
            super.field1412 = -1;
        }
        super.field1413 = arg1.method457();
        if (arg0 != 2) {
            for (int var7 = 1; var7 > 0; ++var7) {
            }
        }
        if (super.field1413 == 65535) {
            super.field1413 = -1;
        }
        super.field1414 = arg1.method457();
        if (super.field1414 == 65535) {
            super.field1414 = -1;
        }
        this.field1488 = class61.method512(false, class61.method509(this.field1495, arg1.method461((byte) -26)));
        this.field1480 = arg1.method455();
        this.field1477 = arg1.method457();
        this.field1473 = true;
        this.field1487 = 0L;
        for (int var8 = 0; var8 < 12; ++var8) {
            this.field1487 <<= 4;
            if (this.field1471[var8] >= 256) {
                this.field1487 += (long) (this.field1471[var8] - 256);
            }
        }
        if (this.field1471[0] >= 256) {
            this.field1487 += (long) (this.field1471[0] - 256 >> 4);
        }
        if (this.field1471[1] >= 256) {
            this.field1487 += (long) (this.field1471[1] - 256 >> 8);
        }
        for (int var9 = 0; var9 < 5; ++var9) {
            this.field1487 <<= 3;
            this.field1487 += (long) this.field1476[var9];
        }
        this.field1487 <<= 1;
        this.field1487 += (long) this.field1470;
    }

    @OriginalMember(owner = "UFGXOLGK", name = "b", descriptor = "(B)LWEVRTBOZ;")
    private final class66 method497(byte arg0) {
        if (this.field1481 != null) {
            int var2 = -1;
            if (super.field1382 >= 0 && super.field1385 == 0) {
                var2 = class47.field1280[super.field1382].field1282[super.field1383];
            } else if (super.field1425 >= 0) {
                var2 = class47.field1280[super.field1425].field1282[super.field1426];
            }
            return this.field1481.method278(false, var2, (int[]) null, -1);
        } else {
            long var4 = this.field1487;
            if (arg0 == 6) {
                boolean var6 = false;
            } else {
                this.field1495 = -278;
            }
            int var7 = -1;
            int var8 = -1;
            int var9 = -1;
            int var10 = -1;
            if (super.field1382 >= 0 && super.field1385 == 0) {
                class47 var11 = class47.field1280[super.field1382];
                var7 = var11.field1282[super.field1383];
                if (super.field1425 >= 0 && super.field1425 != super.field1407) {
                    var8 = class47.field1280[super.field1425].field1282[super.field1426];
                }
                if (var11.field1289 >= 0) {
                    var9 = var11.field1289;
                    var4 += (long) (var9 - this.field1471[5] << 8);
                }
                if (var11.field1290 >= 0) {
                    var10 = var11.field1290;
                    var4 += (long) (var10 - this.field1471[3] << 16);
                }
            } else if (super.field1425 >= 0) {
                var7 = class47.field1280[super.field1425].field1282[super.field1426];
            }
            class66 var12 = (class66) field1469.method206(var4);
            if (var12 == null) {
                boolean var13 = false;
                for (int var14 = 0; var14 < 12; ++var14) {
                    int var15 = this.field1471[var14];
                    if (var10 >= 0 && var14 == 3) {
                        var15 = var10;
                    }
                    if (var9 >= 0 && var14 == 5) {
                        var15 = var9;
                    }
                    if (var15 >= 256 && var15 < 512 && !class36.field1099[var15 - 256].method335(4)) {
                        var13 = true;
                    }
                    if (var15 >= 512 && !class31.method322(var15 - 512).method318(this.field1470, (byte) 7)) {
                        var13 = true;
                    }
                }
                if (var13) {
                    if (this.field1479 != -1L) {
                        var12 = (class66) field1469.method206(this.field1479);
                    }
                    if (var12 == null) {
                        return null;
                    }
                }
            }
            if (var12 == null) {
                class66[] var16 = new class66[12];
                int var17 = 0;
                for (int var18 = 0; var18 < 12; ++var18) {
                    int var20 = this.field1471[var18];
                    if (var10 >= 0 && var18 == 3) {
                        var20 = var10;
                    }
                    if (var9 >= 0 && var18 == 5) {
                        var20 = var9;
                    }
                    if (var20 >= 256 && var20 < 512) {
                        class66 var21 = class36.field1099[var20 - 256].method336((byte) 4);
                        if (var21 != null) {
                            var16[var17++] = var21;
                        }
                    }
                    if (var20 >= 512) {
                        class66 var22 = class31.method322(var20 - 512).method311(0, this.field1470);
                        if (var22 != null) {
                            var16[var17++] = var22;
                        }
                    }
                }
                var12 = new class66(true, var17, var16);
                for (int var19 = 0; var19 < 5; ++var19) {
                    if (this.field1476[var19] != 0) {
                        var12.method539(client.field303[var19][0], client.field303[var19][this.field1476[var19]]);
                        if (var19 == 1) {
                            var12.method539(client.field118[0], client.field118[this.field1476[var19]]);
                        }
                    }
                }
                var12.method532((byte) 2);
                var12.method542(64, 850, -30, -50, -30, true);
                field1469.method207(var4, 77, var12);
                this.field1479 = var4;
            }
            if (this.field1486) {
                return var12;
            } else {
                class66 var23 = class66.field1581;
                var23.method527(var12, 496, class15.method218(var7, true) & class15.method218(var8, true));
                if (var7 != -1 && var8 != -1) {
                    var23.method534(var8, var7, class47.field1280[super.field1382].field1286, 9);
                } else if (var7 != -1) {
                    var23.method533(var7, 803);
                }
                var23.method529(0);
                var23.field1618 = null;
                var23.field1617 = null;
                return var23;
            }
        }
    }

    @OriginalMember(owner = "UFGXOLGK", name = "b", descriptor = "(Z)Z")
    public final boolean method287(boolean arg0) {
        if (arg0) {
            this.field1495 = 373;
        }
        return this.field1473;
    }
}
