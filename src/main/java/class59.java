import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("UGDYQAXI")
public class class59 {

    @OriginalMember(owner = "UGDYQAXI", name = "a", descriptor = "I")
    public int field1497 = -1;

    @OriginalMember(owner = "UGDYQAXI", name = "b", descriptor = "Z")
    public boolean field1498 = true;

    @OriginalMember(owner = "UGDYQAXI", name = "f", descriptor = "I")
    public int field1502 = -1;

    @OriginalMember(owner = "UGDYQAXI", name = "h", descriptor = "I")
    public int field1504 = -1;

    @OriginalMember(owner = "UGDYQAXI", name = "i", descriptor = "I")
    public int field1505 = -1;

    @OriginalMember(owner = "UGDYQAXI", name = "j", descriptor = "I")
    public int field1506 = -1;

    @OriginalMember(owner = "UGDYQAXI", name = "l", descriptor = "B")
    public byte field1508 = 1;

    @OriginalMember(owner = "UGDYQAXI", name = "m", descriptor = "I")
    public int field1509 = -1;

    @OriginalMember(owner = "UGDYQAXI", name = "p", descriptor = "Z")
    public boolean field1512 = true;

    @OriginalMember(owner = "UGDYQAXI", name = "q", descriptor = "I")
    public int field1513 = -1;

    @OriginalMember(owner = "UGDYQAXI", name = "r", descriptor = "I")
    private int field1514 = 128;

    @OriginalMember(owner = "UGDYQAXI", name = "s", descriptor = "I")
    public int field1515 = -1;

    @OriginalMember(owner = "UGDYQAXI", name = "t", descriptor = "I")
    private int field1516 = 543;

    @OriginalMember(owner = "UGDYQAXI", name = "u", descriptor = "I")
    public int field1517 = -1;

    @OriginalMember(owner = "UGDYQAXI", name = "A", descriptor = "I")
    public int field1523 = -1;

    @OriginalMember(owner = "UGDYQAXI", name = "B", descriptor = "Z")
    public boolean field1524 = false;

    @OriginalMember(owner = "UGDYQAXI", name = "D", descriptor = "I")
    public int field1526 = -1;

    @OriginalMember(owner = "UGDYQAXI", name = "E", descriptor = "I")
    private int field1527 = 128;

    @OriginalMember(owner = "UGDYQAXI", name = "F", descriptor = "I")
    public int field1528 = -1;

    @OriginalMember(owner = "UGDYQAXI", name = "G", descriptor = "I")
    public int field1529 = 32;

    @OriginalMember(owner = "UGDYQAXI", name = "J", descriptor = "J")
    public long field1532 = -1L;

    @OriginalMember(owner = "UGDYQAXI", name = "L", descriptor = "Z")
    private boolean field1534 = false;

    @OriginalMember(owner = "UGDYQAXI", name = "I", descriptor = "LTUCAQTOR;")
    public static class58 field1531 = new class58(-37, 30);

    @OriginalMember(owner = "UGDYQAXI", name = "c", descriptor = "I")
    private int field1499;

    @OriginalMember(owner = "UGDYQAXI", name = "k", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "UGDYQAXI", name = "o", descriptor = "I")
    private static int field1511;

    @OriginalMember(owner = "UGDYQAXI", name = "v", descriptor = "I")
    private int field1518;

    @OriginalMember(owner = "UGDYQAXI", name = "H", descriptor = "I")
    private int field1530;

    @OriginalMember(owner = "UGDYQAXI", name = "K", descriptor = "LKHOMSBHW;")
    private static class30 field1533;

    @OriginalMember(owner = "UGDYQAXI", name = "z", descriptor = "Lclient;")
    public static client field1522;

    @OriginalMember(owner = "UGDYQAXI", name = "d", descriptor = "Ljava/lang/String;")
    public String field1500;

    @OriginalMember(owner = "UGDYQAXI", name = "C", descriptor = "[B")
    public byte[] field1525;

    @OriginalMember(owner = "UGDYQAXI", name = "e", descriptor = "[I")
    private int[] field1501;

    @OriginalMember(owner = "UGDYQAXI", name = "g", descriptor = "[I")
    private int[] field1503;

    @OriginalMember(owner = "UGDYQAXI", name = "n", descriptor = "[I")
    public int[] field1510;

    @OriginalMember(owner = "UGDYQAXI", name = "w", descriptor = "[I")
    private int[] field1519;

    @OriginalMember(owner = "UGDYQAXI", name = "y", descriptor = "[I")
    private static int[] field1521;

    @OriginalMember(owner = "UGDYQAXI", name = "M", descriptor = "[I")
    private int[] field1535;

    @OriginalMember(owner = "UGDYQAXI", name = "x", descriptor = "[LUGDYQAXI;")
    private static class59[] field1520;

    @OriginalMember(owner = "UGDYQAXI", name = "N", descriptor = "[Ljava/lang/String;")
    public String[] field1536;

    @OriginalMember(owner = "UGDYQAXI", name = "a", descriptor = "(LSYUGXMZF;)V")
    public static final void method569(class55 arg0) {
        field1533 = new class30(arg0.method551("npc.dat", null), -982);
        class30 var1 = new class30(arg0.method551("npc.idx", null), -982);
        field1507 = var1.method351();
        field1521 = new int[field1507];
        int var2 = 2;
        for (int var3 = 0; var3 < field1507; var3++) {
            field1521[var3] = var2;
            var2 += var1.method351();
        }
        field1520 = new class59[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field1520[var4] = new class59();
        }
    }

    @OriginalMember(owner = "UGDYQAXI", name = "a", descriptor = "(I)LUGDYQAXI;")
    public static final class59 method570(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field1520[var1].field1532) {
                return field1520[var1];
            }
        }
        field1511 = (field1511 + 1) % 20;
        class59 var2 = field1520[field1511] = new class59();
        field1533.field1065 = field1521[arg0];
        var2.field1532 = arg0;
        var2.method572(field1533, 1);
        return var2;
    }

    @OriginalMember(owner = "UGDYQAXI", name = "b", descriptor = "(I)LGEUHTGZJ;")
    public final class17 method571(int arg0) {
        if (this.field1510 != null) {
            class59 var2 = this.method574((byte) 8);
            return var2 == null ? null : var2.method571(this.field1516);
        } else if (this.field1501 == null) {
            return null;
        } else {
            boolean var3 = false;
            if (arg0 <= 0) {
                this.field1516 = 42;
            }
            for (int var4 = 0; var4 < this.field1501.length; var4++) {
                if (!class17.method286(this.field1501[var4])) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            class17[] var5 = new class17[this.field1501.length];
            for (int var6 = 0; var6 < this.field1501.length; var6++) {
                var5[var6] = class17.method285(this.field1501[var6], 8);
            }
            class17 var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new class17(var5, false, var5.length);
            }
            if (this.field1519 != null) {
                for (int var8 = 0; var8 < this.field1519.length; var8++) {
                    var7.method299(this.field1519[var8], this.field1503[var8]);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "UGDYQAXI", name = "a", descriptor = "(LKHOMSBHW;I)V")
    private final void method572(class30 arg0, int arg1) {
        if (arg1 != 1) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method349();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int var4 = arg0.method349();
                    this.field1535 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1535[var5] = arg0.method351();
                    }
                } else if (var3 == 2) {
                    this.field1500 = arg0.method356();
                } else if (var3 == 3) {
                    this.field1525 = arg0.method357(-922);
                } else if (var3 == 12) {
                    this.field1508 = arg0.method350();
                } else if (var3 == 13) {
                    this.field1504 = arg0.method351();
                } else if (var3 == 14) {
                    this.field1515 = arg0.method351();
                } else if (var3 == 17) {
                    this.field1515 = arg0.method351();
                    this.field1517 = arg0.method351();
                    this.field1526 = arg0.method351();
                    this.field1506 = arg0.method351();
                } else if (var3 >= 30 && var3 < 40) {
                    if (this.field1536 == null) {
                        this.field1536 = new String[5];
                    }
                    this.field1536[var3 - 30] = arg0.method356();
                    if (this.field1536[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field1536[var3 - 30] = null;
                    }
                } else if (var3 == 40) {
                    int var6 = arg0.method349();
                    this.field1519 = new int[var6];
                    this.field1503 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1519[var7] = arg0.method351();
                        this.field1503[var7] = arg0.method351();
                    }
                } else if (var3 == 60) {
                    int var8 = arg0.method349();
                    this.field1501 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field1501[var9] = arg0.method351();
                    }
                } else if (var3 == 90) {
                    this.field1497 = arg0.method351();
                } else if (var3 == 91) {
                    this.field1528 = arg0.method351();
                } else if (var3 == 92) {
                    this.field1509 = arg0.method351();
                } else if (var3 == 93) {
                    this.field1498 = false;
                } else if (var3 == 95) {
                    this.field1502 = arg0.method351();
                } else if (var3 == 97) {
                    this.field1527 = arg0.method351();
                } else if (var3 == 98) {
                    this.field1514 = arg0.method351();
                } else if (var3 == 99) {
                    this.field1524 = true;
                } else if (var3 == 100) {
                    this.field1530 = arg0.method350();
                } else if (var3 == 101) {
                    this.field1499 = arg0.method350() * 5;
                } else if (var3 == 102) {
                    this.field1513 = arg0.method351();
                } else if (var3 == 103) {
                    this.field1529 = arg0.method351();
                } else if (var3 == 106) {
                    this.field1523 = arg0.method351();
                    if (this.field1523 == 65535) {
                        this.field1523 = -1;
                    }
                    this.field1505 = arg0.method351();
                    if (this.field1505 == 65535) {
                        this.field1505 = -1;
                    }
                    int var10 = arg0.method349();
                    this.field1510 = new int[var10 + 1];
                    for (int var11 = 0; var11 <= var10; var11++) {
                        this.field1510[var11] = arg0.method351();
                        if (this.field1510[var11] == 65535) {
                            this.field1510[var11] = -1;
                        }
                    }
                } else if (var3 == 107) {
                    this.field1512 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "UGDYQAXI", name = "c", descriptor = "(I)V")
    public static final void method573(int arg0) {
        if (arg0 >= 6 && arg0 <= 6) {
            field1531 = null;
            field1521 = null;
            field1520 = null;
            field1533 = null;
        }
    }

    @OriginalMember(owner = "UGDYQAXI", name = "a", descriptor = "(B)LUGDYQAXI;")
    public final class59 method574(byte arg0) {
        int var2 = -1;
        if (arg0 == 8) {
            boolean var3 = false;
        } else {
            this.field1534 = !this.field1534;
        }
        if (this.field1523 != -1) {
            class16 var4 = class16.field792[this.field1523];
            int var5 = var4.field794;
            int var6 = var4.field795;
            int var7 = var4.field796;
            int var8 = client.field528[var7 - var6];
            var2 = field1522.field286[var5] >> var6 & var8;
        } else if (this.field1505 != -1) {
            var2 = field1522.field286[this.field1505];
        }
        return var2 < 0 || var2 >= this.field1510.length || this.field1510[var2] == -1 ? null : method570(this.field1510[var2]);
    }

    @OriginalMember(owner = "UGDYQAXI", name = "a", descriptor = "(IIB[I)LGEUHTGZJ;")
    public final class17 method575(int arg0, int arg1, byte arg2, int[] arg3) {
        if (this.field1510 != null) {
            class59 var5 = this.method574((byte) 8);
            return var5 == null ? null : var5.method575(arg0, arg1, (byte) -101, arg3);
        }
        class17 var6 = (class17) field1531.method566(this.field1532);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field1535.length; var8++) {
                if (!class17.method286(this.field1535[var8])) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class17[] var9 = new class17[this.field1535.length];
            for (int var10 = 0; var10 < this.field1535.length; var10++) {
                var9[var10] = class17.method285(this.field1535[var10], 8);
            }
            if (var9.length == 1) {
                var6 = var9[0];
            } else {
                var6 = new class17(var9, false, var9.length);
            }
            if (this.field1519 != null) {
                for (int var11 = 0; var11 < this.field1519.length; var11++) {
                    var6.method299(this.field1519[var11], this.field1503[var11]);
                }
            }
            var6.method292(-20376);
            var6.method302(this.field1530 + 64, this.field1499 + 850, -30, -50, -30, true);
            field1531.method567(true, var6, this.field1532);
        }
        class17 var12 = class17.field807;
        if (arg2 != -101) {
            this.field1518 = 360;
        }
        var12.method287(var6, 208, class48.method504(arg1, 3) & class48.method504(arg0, 3));
        if (arg1 != -1 && arg0 != -1) {
            var12.method294(arg1, arg3, -929, arg0);
        } else if (arg1 != -1) {
            var12.method293((byte) 1, arg1);
        }
        if (this.field1527 != 128 || this.field1514 != 128) {
            var12.method301(this.field1514, this.field1527, (byte) 9, this.field1527);
        }
        var12.method289(-24);
        var12.field844 = null;
        var12.field843 = null;
        if (this.field1508 == 1) {
            var12.field845 = true;
        }
        return var12;
    }
}
