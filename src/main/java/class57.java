import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!TQRZOVPP")
public class class57 {

    @OriginalMember(owner = "client!TQRZOVPP", name = "d", descriptor = "I")
    public int field1445 = 32;

    @OriginalMember(owner = "client!TQRZOVPP", name = "e", descriptor = "I")
    private int field1446 = 128;

    @OriginalMember(owner = "client!TQRZOVPP", name = "h", descriptor = "Z")
    private boolean field1449 = false;

    @OriginalMember(owner = "client!TQRZOVPP", name = "i", descriptor = "I")
    public int field1450 = -1;

    @OriginalMember(owner = "client!TQRZOVPP", name = "j", descriptor = "I")
    public int field1451 = -1;

    @OriginalMember(owner = "client!TQRZOVPP", name = "l", descriptor = "I")
    public int field1453 = -1;

    @OriginalMember(owner = "client!TQRZOVPP", name = "o", descriptor = "Ljava/lang/String;")
    public String field1456 = "null";

    @OriginalMember(owner = "client!TQRZOVPP", name = "p", descriptor = "I")
    public int field1457 = -1;

    @OriginalMember(owner = "client!TQRZOVPP", name = "r", descriptor = "Z")
    public boolean field1459 = true;

    @OriginalMember(owner = "client!TQRZOVPP", name = "u", descriptor = "I")
    public int field1462 = -1;

    @OriginalMember(owner = "client!TQRZOVPP", name = "w", descriptor = "I")
    public int field1464 = -1;

    @OriginalMember(owner = "client!TQRZOVPP", name = "x", descriptor = "I")
    public int field1465 = -1;

    @OriginalMember(owner = "client!TQRZOVPP", name = "z", descriptor = "J")
    public long field1467 = -1L;

    @OriginalMember(owner = "client!TQRZOVPP", name = "A", descriptor = "Z")
    public boolean field1468 = false;

    @OriginalMember(owner = "client!TQRZOVPP", name = "B", descriptor = "I")
    public int field1469 = -1;

    @OriginalMember(owner = "client!TQRZOVPP", name = "C", descriptor = "I")
    public int field1470 = -1;

    @OriginalMember(owner = "client!TQRZOVPP", name = "E", descriptor = "B")
    public byte field1472 = 1;

    @OriginalMember(owner = "client!TQRZOVPP", name = "G", descriptor = "Z")
    private boolean field1474 = true;

    @OriginalMember(owner = "client!TQRZOVPP", name = "H", descriptor = "I")
    public int field1475 = -1;

    @OriginalMember(owner = "client!TQRZOVPP", name = "I", descriptor = "I")
    public int field1476 = -1;

    @OriginalMember(owner = "client!TQRZOVPP", name = "J", descriptor = "Z")
    public boolean field1477 = true;

    @OriginalMember(owner = "client!TQRZOVPP", name = "L", descriptor = "Z")
    private boolean field1479 = true;

    @OriginalMember(owner = "client!TQRZOVPP", name = "N", descriptor = "I")
    private int field1481 = 128;

    @OriginalMember(owner = "client!TQRZOVPP", name = "O", descriptor = "I")
    public int field1482 = -1;

    @OriginalMember(owner = "client!TQRZOVPP", name = "y", descriptor = "LHARAZQMH;")
    public static class22 field1466 = new class22((byte) 5, 30);

    @OriginalMember(owner = "client!TQRZOVPP", name = "D", descriptor = "I")
    private static int field1471 = 536;

    @OriginalMember(owner = "client!TQRZOVPP", name = "a", descriptor = "I")
    private int field1442;

    @OriginalMember(owner = "client!TQRZOVPP", name = "g", descriptor = "I")
    private int field1448;

    @OriginalMember(owner = "client!TQRZOVPP", name = "m", descriptor = "I")
    private static int field1454;

    @OriginalMember(owner = "client!TQRZOVPP", name = "t", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!TQRZOVPP", name = "c", descriptor = "LCMGGUSPR;")
    private static class10 field1444;

    @OriginalMember(owner = "client!TQRZOVPP", name = "b", descriptor = "Lclient;")
    public static client field1443;

    @OriginalMember(owner = "client!TQRZOVPP", name = "v", descriptor = "[B")
    public byte[] field1463;

    @OriginalMember(owner = "client!TQRZOVPP", name = "f", descriptor = "[I")
    public int[] field1447;

    @OriginalMember(owner = "client!TQRZOVPP", name = "k", descriptor = "[I")
    private int[] field1452;

    @OriginalMember(owner = "client!TQRZOVPP", name = "n", descriptor = "[I")
    private int[] field1455;

    @OriginalMember(owner = "client!TQRZOVPP", name = "s", descriptor = "[I")
    private int[] field1460;

    @OriginalMember(owner = "client!TQRZOVPP", name = "F", descriptor = "[I")
    private int[] field1473;

    @OriginalMember(owner = "client!TQRZOVPP", name = "M", descriptor = "[I")
    private static int[] field1480;

    @OriginalMember(owner = "client!TQRZOVPP", name = "K", descriptor = "[LTQRZOVPP;")
    private static class57[] field1478;

    @OriginalMember(owner = "client!TQRZOVPP", name = "q", descriptor = "[Ljava/lang/String;")
    public String[] field1458;

    @OriginalMember(owner = "client!TQRZOVPP", name = "a", descriptor = "(B)LTQRZOVPP;")
    public final class57 method515(byte arg0) {
        int var2 = -1;
        if (arg0 != 73) {
            field1471 = -93;
        }
        if (this.field1465 != -1) {
            class47 var3 = class47.field1241[this.field1465];
            int var4 = var3.field1243;
            int var5 = var3.field1244;
            int var6 = var3.field1245;
            int var7 = client.field408[var6 - var5];
            var2 = field1443.field269[var4] >> var5 & var7;
        } else if (this.field1475 != -1) {
            var2 = field1443.field269[this.field1475];
        }
        return var2 < 0 || var2 >= this.field1447.length || this.field1447[var2] == -1 ? null : method517(this.field1447[var2]);
    }

    @OriginalMember(owner = "client!TQRZOVPP", name = "a", descriptor = "(I)V")
    public static final void method516(int arg0) {
        field1466 = null;
        field1480 = null;
        field1478 = null;
        if (arg0 < 0) {
            field1444 = null;
        }
    }

    @OriginalMember(owner = "client!TQRZOVPP", name = "b", descriptor = "(I)LTQRZOVPP;")
    public static final class57 method517(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field1478[var1].field1467) {
                return field1478[var1];
            }
        }
        field1454 = (field1454 + 1) % 20;
        class57 var2 = field1478[field1454] = new class57();
        field1444.field646 = field1480[arg0];
        var2.field1467 = arg0;
        var2.method522(field1444, -593);
        return var2;
    }

    @OriginalMember(owner = "client!TQRZOVPP", name = "a", descriptor = "(Z)LGCSAWSJV;")
    public final class16 method518(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        } else if (this.field1447 != null) {
            class57 var2 = this.method515((byte) 73);
            return var2 == null ? null : var2.method518(false);
        } else if (this.field1455 == null) {
            return null;
        } else {
            boolean var3 = false;
            for (int var4 = 0; var4 < this.field1455.length; var4++) {
                if (!class16.method261(this.field1455[var4])) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            class16[] var5 = new class16[this.field1455.length];
            for (int var6 = 0; var6 < this.field1455.length; var6++) {
                var5[var6] = class16.method260(this.field1455[var6]);
            }
            class16 var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new class16(var5, var5.length, this.field1474);
            }
            if (this.field1460 != null) {
                for (int var8 = 0; var8 < this.field1460.length; var8++) {
                    var7.method274(this.field1460[var8], this.field1452[var8]);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!TQRZOVPP", name = "b", descriptor = "(Z)Z")
    public boolean method519(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        } else if (this.field1447 == null) {
            return true;
        } else {
            int var2 = -1;
            if (this.field1465 != -1) {
                class47 var3 = class47.field1241[this.field1465];
                int var4 = var3.field1243;
                int var5 = var3.field1244;
                int var6 = var3.field1245;
                int var7 = client.field408[var6 - var5];
                var2 = field1443.field269[var4] >> var5 & var7;
            } else if (this.field1475 != -1) {
                var2 = field1443.field269[this.field1475];
            }
            return var2 >= 0 && var2 < this.field1447.length && this.field1447[var2] != -1;
        }
    }

    @OriginalMember(owner = "client!TQRZOVPP", name = "a", descriptor = "(I[IIB)LGCSAWSJV;")
    public final class16 method520(int arg0, int[] arg1, int arg2, byte arg3) {
        if (this.field1447 != null) {
            class57 var5 = this.method515((byte) 73);
            return var5 == null ? null : var5.method520(arg0, arg1, arg2, (byte) -112);
        }
        class16 var6 = (class16) field1466.method299(this.field1467);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field1473.length; var8++) {
                if (!class16.method261(this.field1473[var8])) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class16[] var9 = new class16[this.field1473.length];
            for (int var10 = 0; var10 < this.field1473.length; var10++) {
                var9[var10] = class16.method260(this.field1473[var10]);
            }
            if (var9.length == 1) {
                var6 = var9[0];
            } else {
                var6 = new class16(var9, var9.length, this.field1474);
            }
            if (this.field1460 != null) {
                for (int var11 = 0; var11 < this.field1460.length; var11++) {
                    var6.method274(this.field1460[var11], this.field1452[var11]);
                }
            }
            var6.method267(-12404);
            var6.method277(this.field1442 + 64, this.field1448 + 850, -30, -50, -30, true);
            field1466.method300((byte) 24, this.field1467, var6);
        }
        class16 var12 = class16.field710;
        if (arg3 != -112) {
            throw new NullPointerException();
        }
        var12.method262(class48.method436(this.field1479, arg2) & class48.method436(this.field1479, arg0), var6, this.field1449);
        if (arg2 != -1 && arg0 != -1) {
            var12.method269(49910, arg2, arg1, arg0);
        } else if (arg2 != -1) {
            var12.method268((byte) 81, arg2);
        }
        if (this.field1446 != 128 || this.field1481 != 128) {
            var12.method276(this.field1446, this.field1446, this.field1481, (byte) -79);
        }
        var12.method264((byte) 6);
        var12.field746 = null;
        var12.field745 = null;
        if (this.field1472 == 1) {
            var12.field747 = true;
        }
        return var12;
    }

    @OriginalMember(owner = "client!TQRZOVPP", name = "a", descriptor = "(LUUIGNTAD;)V")
    public static final void method521(class59 arg0) {
        field1444 = new class10(arg0.method545("npc.dat", null), field1471);
        class10 var1 = new class10(arg0.method545("npc.idx", null), field1471);
        field1461 = var1.method196();
        field1480 = new int[field1461];
        int var2 = 2;
        for (int var3 = 0; var3 < field1461; var3++) {
            field1480[var3] = var2;
            var2 += var1.method196();
        }
        field1478 = new class57[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field1478[var4] = new class57();
        }
    }

    @OriginalMember(owner = "client!TQRZOVPP", name = "a", descriptor = "(LCMGGUSPR;I)V")
    private final void method522(class10 arg0, int arg1) {
        if (arg1 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg0.method194();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    int var5 = arg0.method194();
                    this.field1473 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1473[var6] = arg0.method196();
                    }
                } else if (var4 == 2) {
                    this.field1456 = arg0.method201();
                } else if (var4 == 3) {
                    this.field1463 = arg0.method202(true);
                } else if (var4 == 12) {
                    this.field1472 = arg0.method195();
                } else if (var4 == 13) {
                    this.field1482 = arg0.method196();
                } else if (var4 == 14) {
                    this.field1450 = arg0.method196();
                } else if (var4 == 17) {
                    this.field1450 = arg0.method196();
                    this.field1469 = arg0.method196();
                    this.field1451 = arg0.method196();
                    this.field1470 = arg0.method196();
                } else if (var4 >= 30 && var4 < 40) {
                    if (this.field1458 == null) {
                        this.field1458 = new String[5];
                    }
                    this.field1458[var4 - 30] = arg0.method201();
                    if (this.field1458[var4 - 30].equalsIgnoreCase("hidden")) {
                        this.field1458[var4 - 30] = null;
                    }
                } else if (var4 == 40) {
                    int var7 = arg0.method194();
                    this.field1460 = new int[var7];
                    this.field1452 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        this.field1460[var8] = arg0.method196();
                        this.field1452[var8] = arg0.method196();
                    }
                } else if (var4 == 60) {
                    int var9 = arg0.method194();
                    this.field1455 = new int[var9];
                    for (int var10 = 0; var10 < var9; var10++) {
                        this.field1455[var10] = arg0.method196();
                    }
                } else if (var4 == 90) {
                    this.field1464 = arg0.method196();
                } else if (var4 == 91) {
                    this.field1457 = arg0.method196();
                } else if (var4 == 92) {
                    this.field1462 = arg0.method196();
                } else if (var4 == 93) {
                    this.field1477 = false;
                } else if (var4 == 95) {
                    this.field1476 = arg0.method196();
                } else if (var4 == 97) {
                    this.field1446 = arg0.method196();
                } else if (var4 == 98) {
                    this.field1481 = arg0.method196();
                } else if (var4 == 99) {
                    this.field1468 = true;
                } else if (var4 == 100) {
                    this.field1442 = arg0.method195();
                } else if (var4 == 101) {
                    this.field1448 = arg0.method195() * 5;
                } else if (var4 == 102) {
                    this.field1453 = arg0.method196();
                } else if (var4 == 103) {
                    this.field1445 = arg0.method196();
                } else if (var4 == 106) {
                    this.field1465 = arg0.method196();
                    if (this.field1465 == 65535) {
                        this.field1465 = -1;
                    }
                    this.field1475 = arg0.method196();
                    if (this.field1475 == 65535) {
                        this.field1475 = -1;
                    }
                    int var11 = arg0.method194();
                    this.field1447 = new int[var11 + 1];
                    for (int var12 = 0; var12 <= var11; var12++) {
                        this.field1447[var12] = arg0.method196();
                        if (this.field1447[var12] == 65535) {
                            this.field1447[var12] = -1;
                        }
                    }
                } else if (var4 == 107) {
                    this.field1459 = false;
                }
            }
        }
    }
}
