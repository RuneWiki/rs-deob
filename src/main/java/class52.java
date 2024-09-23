import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RRZTMHXJ")
public class class52 {

    @OriginalMember(owner = "RRZTMHXJ", name = "d", descriptor = "Z")
    public boolean field1457 = false;

    @OriginalMember(owner = "RRZTMHXJ", name = "f", descriptor = "I")
    public int field1459 = -1;

    @OriginalMember(owner = "RRZTMHXJ", name = "h", descriptor = "I")
    private int field1461 = 111;

    @OriginalMember(owner = "RRZTMHXJ", name = "j", descriptor = "I")
    public int field1463 = 32;

    @OriginalMember(owner = "RRZTMHXJ", name = "m", descriptor = "I")
    public int field1466 = -1;

    @OriginalMember(owner = "RRZTMHXJ", name = "o", descriptor = "I")
    public int field1468 = -1;

    @OriginalMember(owner = "RRZTMHXJ", name = "p", descriptor = "I")
    public int field1469 = -1;

    @OriginalMember(owner = "RRZTMHXJ", name = "r", descriptor = "B")
    public byte field1471 = 1;

    @OriginalMember(owner = "RRZTMHXJ", name = "s", descriptor = "I")
    public int field1472 = -1;

    @OriginalMember(owner = "RRZTMHXJ", name = "t", descriptor = "I")
    public int field1473 = -1;

    @OriginalMember(owner = "RRZTMHXJ", name = "v", descriptor = "I")
    private int field1475 = 128;

    @OriginalMember(owner = "RRZTMHXJ", name = "w", descriptor = "J")
    public long field1476 = -1L;

    @OriginalMember(owner = "RRZTMHXJ", name = "x", descriptor = "I")
    public int field1477 = -1;

    @OriginalMember(owner = "RRZTMHXJ", name = "y", descriptor = "I")
    private int field1478 = 128;

    @OriginalMember(owner = "RRZTMHXJ", name = "A", descriptor = "I")
    public int field1480 = -1;

    @OriginalMember(owner = "RRZTMHXJ", name = "B", descriptor = "I")
    private int field1481 = -31473;

    @OriginalMember(owner = "RRZTMHXJ", name = "E", descriptor = "Z")
    public boolean field1484 = true;

    @OriginalMember(owner = "RRZTMHXJ", name = "G", descriptor = "I")
    public int field1486 = -1;

    @OriginalMember(owner = "RRZTMHXJ", name = "H", descriptor = "I")
    public int field1487 = -1;

    @OriginalMember(owner = "RRZTMHXJ", name = "J", descriptor = "I")
    public int field1489 = -1;

    @OriginalMember(owner = "RRZTMHXJ", name = "M", descriptor = "I")
    public int field1492 = -1;

    @OriginalMember(owner = "RRZTMHXJ", name = "b", descriptor = "LJETHVCIV;")
    public static class24 field1455 = new class24(false, 30);

    @OriginalMember(owner = "RRZTMHXJ", name = "a", descriptor = "I")
    private static int field1454;

    @OriginalMember(owner = "RRZTMHXJ", name = "u", descriptor = "I")
    private int field1474;

    @OriginalMember(owner = "RRZTMHXJ", name = "z", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "RRZTMHXJ", name = "I", descriptor = "I")
    private int field1488;

    @OriginalMember(owner = "RRZTMHXJ", name = "L", descriptor = "I")
    private int field1491;

    @OriginalMember(owner = "RRZTMHXJ", name = "g", descriptor = "LBJPWOXRJ;")
    private static class3 field1460;

    @OriginalMember(owner = "RRZTMHXJ", name = "q", descriptor = "Lclient;")
    public static client field1470;

    @OriginalMember(owner = "RRZTMHXJ", name = "n", descriptor = "Ljava/lang/String;")
    public String field1467;

    @OriginalMember(owner = "RRZTMHXJ", name = "i", descriptor = "Z")
    private static boolean field1462;

    @OriginalMember(owner = "RRZTMHXJ", name = "K", descriptor = "[B")
    public byte[] field1490;

    @OriginalMember(owner = "RRZTMHXJ", name = "c", descriptor = "[I")
    private int[] field1456;

    @OriginalMember(owner = "RRZTMHXJ", name = "e", descriptor = "[I")
    private int[] field1458;

    @OriginalMember(owner = "RRZTMHXJ", name = "k", descriptor = "[I")
    public int[] field1464;

    @OriginalMember(owner = "RRZTMHXJ", name = "D", descriptor = "[I")
    private static int[] field1483;

    @OriginalMember(owner = "RRZTMHXJ", name = "F", descriptor = "[I")
    private int[] field1485;

    @OriginalMember(owner = "RRZTMHXJ", name = "N", descriptor = "[I")
    private int[] field1493;

    @OriginalMember(owner = "RRZTMHXJ", name = "C", descriptor = "[LRRZTMHXJ;")
    private static class52[] field1482;

    @OriginalMember(owner = "RRZTMHXJ", name = "l", descriptor = "[Ljava/lang/String;")
    public String[] field1465;

    @OriginalMember(owner = "RRZTMHXJ", name = "a", descriptor = "(ILBJPWOXRJ;)V")
    private final void method482(int arg0, class3 arg1) {
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg1.method15();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    int var5 = arg1.method15();
                    this.field1485 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1485[var6] = arg1.method17();
                    }
                } else if (var4 == 2) {
                    this.field1467 = arg1.method22();
                } else if (var4 == 3) {
                    this.field1490 = arg1.method23(this.field1461);
                } else if (var4 == 12) {
                    this.field1471 = arg1.method16();
                } else if (var4 == 13) {
                    this.field1468 = arg1.method17();
                } else if (var4 == 14) {
                    this.field1480 = arg1.method17();
                } else if (var4 == 17) {
                    this.field1480 = arg1.method17();
                    this.field1486 = arg1.method17();
                    this.field1492 = arg1.method17();
                    this.field1469 = arg1.method17();
                } else if (var4 >= 30 && var4 < 40) {
                    if (this.field1465 == null) {
                        this.field1465 = new String[5];
                    }
                    this.field1465[var4 - 30] = arg1.method22();
                    if (this.field1465[var4 - 30].equalsIgnoreCase("hidden")) {
                        this.field1465[var4 - 30] = null;
                    }
                } else if (var4 == 40) {
                    int var7 = arg1.method15();
                    this.field1493 = new int[var7];
                    this.field1456 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        this.field1493[var8] = arg1.method17();
                        this.field1456[var8] = arg1.method17();
                    }
                } else if (var4 == 60) {
                    int var9 = arg1.method15();
                    this.field1458 = new int[var9];
                    for (int var10 = 0; var10 < var9; var10++) {
                        this.field1458[var10] = arg1.method17();
                    }
                } else if (var4 == 90) {
                    this.field1487 = arg1.method17();
                } else if (var4 == 91) {
                    this.field1472 = arg1.method17();
                } else if (var4 == 92) {
                    this.field1489 = arg1.method17();
                } else if (var4 == 93) {
                    this.field1484 = false;
                } else if (var4 == 95) {
                    this.field1473 = arg1.method17();
                } else if (var4 == 97) {
                    this.field1475 = arg1.method17();
                } else if (var4 == 98) {
                    this.field1478 = arg1.method17();
                } else if (var4 == 99) {
                    this.field1457 = true;
                } else if (var4 == 100) {
                    this.field1491 = arg1.method16();
                } else if (var4 == 101) {
                    this.field1488 = arg1.method16() * 5;
                } else if (var4 == 102) {
                    this.field1459 = arg1.method17();
                } else if (var4 == 103) {
                    this.field1463 = arg1.method17();
                } else if (var4 == 106) {
                    this.field1466 = arg1.method17();
                    if (this.field1466 == 65535) {
                        this.field1466 = -1;
                    }
                    this.field1477 = arg1.method17();
                    if (this.field1477 == 65535) {
                        this.field1477 = -1;
                    }
                    int var11 = arg1.method15();
                    this.field1464 = new int[var11 + 1];
                    for (int var12 = 0; var12 <= var11; var12++) {
                        this.field1464[var12] = arg1.method17();
                        if (this.field1464[var12] == 65535) {
                            this.field1464[var12] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "RRZTMHXJ", name = "a", descriptor = "(LMNPBQFWE;)V")
    public static final void method483(class37 arg0) {
        field1460 = new class3(false, arg0.method429("npc.dat", null));
        class3 var1 = new class3(false, arg0.method429("npc.idx", null));
        field1479 = var1.method17();
        field1483 = new int[field1479];
        int var2 = 2;
        for (int var3 = 0; var3 < field1479; var3++) {
            field1483[var3] = var2;
            var2 += var1.method17();
        }
        field1482 = new class52[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field1482[var4] = new class52();
        }
    }

    @OriginalMember(owner = "RRZTMHXJ", name = "a", descriptor = "(B)V")
    public static final void method484(byte arg0) {
        if (arg0 != 113) {
            field1462 = !field1462;
        }
        field1455 = null;
        field1483 = null;
        field1482 = null;
        field1460 = null;
    }

    @OriginalMember(owner = "RRZTMHXJ", name = "a", descriptor = "([IIII)LJLNSJQDR;")
    public final class26 method485(int[] arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (this.field1464 != null) {
            class52 var6 = this.method487(this.field1481);
            return var6 == null ? null : var6.method485(arg0, arg1, arg2, 0);
        }
        class26 var7 = (class26) field1455.method315(this.field1476);
        if (var7 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < this.field1485.length; var9++) {
                if (!class26.method329(this.field1485[var9])) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            class26[] var10 = new class26[this.field1485.length];
            for (int var11 = 0; var11 < this.field1485.length; var11++) {
                var10[var11] = class26.method328(1, this.field1485[var11]);
            }
            if (var10.length == 1) {
                var7 = var10[0];
            } else {
                var7 = new class26(9, var10.length, var10);
            }
            if (this.field1493 != null) {
                for (int var12 = 0; var12 < this.field1493.length; var12++) {
                    var7.method342(this.field1493[var12], this.field1456[var12]);
                }
            }
            var7.method335(19035);
            var7.method345(this.field1491 + 64, this.field1488 + 850, -30, -50, -30, true);
            field1455.method316(-363, var7, this.field1476);
        }
        class26 var13 = class26.field943;
        var13.method330(var7, class59.method524((byte) 8, arg1) & class59.method524((byte) 8, arg2), (byte) 0);
        if (arg1 != -1 && arg2 != -1) {
            var13.method337(arg0, 666, arg1, arg2);
        } else if (arg1 != -1) {
            var13.method336((byte) 46, arg1);
        }
        if (this.field1475 != 128 || this.field1478 != 128) {
            var13.method344(this.field1475, -190, this.field1478, this.field1475);
        }
        var13.method332(true);
        var13.field980 = null;
        var13.field979 = null;
        if (this.field1471 == 1) {
            var13.field981 = true;
        }
        return var13;
    }

    @OriginalMember(owner = "RRZTMHXJ", name = "a", descriptor = "(I)LJLNSJQDR;")
    public final class26 method486(int arg0) {
        if (this.field1464 != null) {
            class52 var2 = this.method487(this.field1481);
            return var2 == null ? null : var2.method486(this.field1474);
        } else if (this.field1458 == null) {
            return null;
        } else {
            boolean var3 = false;
            if (arg0 != 0) {
                field1462 = !field1462;
            }
            for (int var4 = 0; var4 < this.field1458.length; var4++) {
                if (!class26.method329(this.field1458[var4])) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            class26[] var5 = new class26[this.field1458.length];
            for (int var6 = 0; var6 < this.field1458.length; var6++) {
                var5[var6] = class26.method328(1, this.field1458[var6]);
            }
            class26 var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new class26(9, var5.length, var5);
            }
            if (this.field1493 != null) {
                for (int var8 = 0; var8 < this.field1493.length; var8++) {
                    var7.method342(this.field1493[var8], this.field1456[var8]);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "RRZTMHXJ", name = "b", descriptor = "(I)LRRZTMHXJ;")
    public final class52 method487(int arg0) {
        int var2 = -1;
        if (arg0 != -31473) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field1466 != -1) {
            class5 var4 = class5.field36[this.field1466];
            int var5 = var4.field38;
            int var6 = var4.field39;
            int var7 = var4.field40;
            int var8 = client.field156[var7 - var6];
            var2 = field1470.field59[var5] >> var6 & var8;
        } else if (this.field1477 != -1) {
            var2 = field1470.field59[this.field1477];
        }
        return var2 < 0 || var2 >= this.field1464.length || this.field1464[var2] == -1 ? null : method488(this.field1464[var2]);
    }

    @OriginalMember(owner = "RRZTMHXJ", name = "c", descriptor = "(I)LRRZTMHXJ;")
    public static final class52 method488(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field1482[var1].field1476) {
                return field1482[var1];
            }
        }
        field1454 = (field1454 + 1) % 20;
        class52 var2 = field1482[field1454] = new class52();
        field1460.field20 = field1483[arg0];
        var2.field1476 = arg0;
        var2.method482(674, field1460);
        return var2;
    }
}
