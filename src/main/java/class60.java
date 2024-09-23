import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("WHKCNEXD")
public class class60 {

    @OriginalMember(owner = "WHKCNEXD", name = "b", descriptor = "Z")
    public boolean field1526 = true;

    @OriginalMember(owner = "WHKCNEXD", name = "f", descriptor = "I")
    public int field1530 = -1;

    @OriginalMember(owner = "WHKCNEXD", name = "h", descriptor = "I")
    public int field1532 = -1;

    @OriginalMember(owner = "WHKCNEXD", name = "j", descriptor = "Z")
    public boolean field1534 = false;

    @OriginalMember(owner = "WHKCNEXD", name = "k", descriptor = "I")
    public int field1535 = -1;

    @OriginalMember(owner = "WHKCNEXD", name = "l", descriptor = "I")
    public int field1536 = -1;

    @OriginalMember(owner = "WHKCNEXD", name = "n", descriptor = "I")
    public int field1538 = -1;

    @OriginalMember(owner = "WHKCNEXD", name = "o", descriptor = "I")
    public int field1539 = 32;

    @OriginalMember(owner = "WHKCNEXD", name = "r", descriptor = "Z")
    private boolean field1542 = false;

    @OriginalMember(owner = "WHKCNEXD", name = "s", descriptor = "I")
    public int field1543 = -1;

    @OriginalMember(owner = "WHKCNEXD", name = "t", descriptor = "I")
    public int field1544 = -1;

    @OriginalMember(owner = "WHKCNEXD", name = "u", descriptor = "Z")
    public boolean field1545 = true;

    @OriginalMember(owner = "WHKCNEXD", name = "v", descriptor = "J")
    public long field1546 = -1L;

    @OriginalMember(owner = "WHKCNEXD", name = "z", descriptor = "I")
    public int field1550 = -1;

    @OriginalMember(owner = "WHKCNEXD", name = "A", descriptor = "I")
    public int field1551 = -1;

    @OriginalMember(owner = "WHKCNEXD", name = "D", descriptor = "I")
    public int field1554 = -1;

    @OriginalMember(owner = "WHKCNEXD", name = "E", descriptor = "I")
    public int field1555 = -1;

    @OriginalMember(owner = "WHKCNEXD", name = "F", descriptor = "I")
    private int field1556 = 128;

    @OriginalMember(owner = "WHKCNEXD", name = "H", descriptor = "I")
    public int field1558 = -1;

    @OriginalMember(owner = "WHKCNEXD", name = "J", descriptor = "B")
    public byte field1560 = 1;

    @OriginalMember(owner = "WHKCNEXD", name = "M", descriptor = "I")
    private int field1563 = 128;

    @OriginalMember(owner = "WHKCNEXD", name = "c", descriptor = "I")
    private static int field1527 = 8;

    @OriginalMember(owner = "WHKCNEXD", name = "w", descriptor = "LWMYPWVZI;")
    public static class62 field1547 = new class62(30, 267);

    @OriginalMember(owner = "WHKCNEXD", name = "g", descriptor = "I")
    private int field1531;

    @OriginalMember(owner = "WHKCNEXD", name = "i", descriptor = "I")
    private int field1533;

    @OriginalMember(owner = "WHKCNEXD", name = "q", descriptor = "I")
    private static int field1541;

    @OriginalMember(owner = "WHKCNEXD", name = "G", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "WHKCNEXD", name = "L", descriptor = "I")
    private int field1562;

    @OriginalMember(owner = "WHKCNEXD", name = "K", descriptor = "LIMUIZRAF;")
    private static class24 field1561;

    @OriginalMember(owner = "WHKCNEXD", name = "d", descriptor = "Lclient;")
    public static client field1528;

    @OriginalMember(owner = "WHKCNEXD", name = "x", descriptor = "Ljava/lang/String;")
    public String field1548;

    @OriginalMember(owner = "WHKCNEXD", name = "p", descriptor = "[B")
    public byte[] field1540;

    @OriginalMember(owner = "WHKCNEXD", name = "a", descriptor = "[I")
    private static int[] field1525;

    @OriginalMember(owner = "WHKCNEXD", name = "e", descriptor = "[I")
    private int[] field1529;

    @OriginalMember(owner = "WHKCNEXD", name = "m", descriptor = "[I")
    private int[] field1537;

    @OriginalMember(owner = "WHKCNEXD", name = "y", descriptor = "[I")
    public int[] field1549;

    @OriginalMember(owner = "WHKCNEXD", name = "C", descriptor = "[I")
    private int[] field1553;

    @OriginalMember(owner = "WHKCNEXD", name = "I", descriptor = "[I")
    private int[] field1559;

    @OriginalMember(owner = "WHKCNEXD", name = "B", descriptor = "[LWHKCNEXD;")
    private static class60[] field1552;

    @OriginalMember(owner = "WHKCNEXD", name = "N", descriptor = "[Ljava/lang/String;")
    public String[] field1564;

    @OriginalMember(owner = "WHKCNEXD", name = "a", descriptor = "(I)V")
    public static final void method516(int arg0) {
        field1547 = null;
        int var1 = 19 / arg0;
        field1525 = null;
        field1552 = null;
        field1561 = null;
    }

    @OriginalMember(owner = "WHKCNEXD", name = "a", descriptor = "(LBYZSQZUF;)V")
    public static final void method517(class7 arg0) {
        field1561 = new class24(0, arg0.method29("npc.dat", null));
        class24 var1 = new class24(0, arg0.method29("npc.idx", null));
        field1557 = var1.method240();
        field1525 = new int[field1557];
        int var2 = 2;
        for (int var3 = 0; var3 < field1557; var3++) {
            field1525[var3] = var2;
            var2 += var1.method240();
        }
        field1552 = new class60[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field1552[var4] = new class60();
        }
    }

    @OriginalMember(owner = "WHKCNEXD", name = "b", descriptor = "(I)LWHKCNEXD;")
    public final class60 method518(int arg0) {
        int var2 = -1;
        if (arg0 != -13525) {
            this.field1533 = -7;
        }
        if (this.field1554 != -1) {
            class2 var3 = class2.field12[this.field1554];
            int var4 = var3.field14;
            int var5 = var3.field15;
            int var6 = var3.field16;
            int var7 = client.field299[var6 - var5];
            var2 = field1528.field216[var4] >> var5 & var7;
        } else if (this.field1551 != -1) {
            var2 = field1528.field216[this.field1551];
        }
        return var2 < 0 || var2 >= this.field1549.length || this.field1549[var2] == -1 ? null : method521(this.field1549[var2]);
    }

    @OriginalMember(owner = "WHKCNEXD", name = "c", descriptor = "(I)Z")
    public boolean method519(int arg0) {
        if (this.field1549 == null) {
            return true;
        }
        int var2 = -1;
        int var3 = 13 / arg0;
        if (this.field1554 != -1) {
            class2 var4 = class2.field12[this.field1554];
            int var5 = var4.field14;
            int var6 = var4.field15;
            int var7 = var4.field16;
            int var8 = client.field299[var7 - var6];
            var2 = field1528.field216[var5] >> var6 & var8;
        } else if (this.field1551 != -1) {
            var2 = field1528.field216[this.field1551];
        }
        return var2 >= 0 && var2 < this.field1549.length && this.field1549[var2] != -1;
    }

    @OriginalMember(owner = "WHKCNEXD", name = "a", descriptor = "([IZII)LYABPKWWG;")
    public final class67 method520(int[] arg0, boolean arg1, int arg2, int arg3) {
        if (this.field1549 != null) {
            class60 var5 = this.method518(-13525);
            return var5 == null ? null : var5.method520(arg0, false, arg2, arg3);
        }
        class67 var6 = (class67) field1547.method525(this.field1546);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field1553.length; var8++) {
                if (!class67.method549(this.field1553[var8])) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class67[] var9 = new class67[this.field1553.length];
            for (int var10 = 0; var10 < this.field1553.length; var10++) {
                var9[var10] = class67.method548(this.field1553[var10], (byte) -27);
            }
            if (var9.length == 1) {
                var6 = var9[0];
            } else {
                var6 = new class67(var9, true, var9.length);
            }
            if (this.field1559 != null) {
                for (int var11 = 0; var11 < this.field1559.length; var11++) {
                    var6.method562(this.field1559[var11], this.field1529[var11]);
                }
            }
            var6.method555((byte) 45);
            var6.method565(this.field1531 + 64, this.field1562 + 850, -30, -50, -30, true);
            field1547.method526(this.field1546, 5, var6);
        }
        class67 var12 = class67.field1610;
        if (arg1) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        var12.method550(var6, -509, class22.method219(arg2, true) & class22.method219(arg3, true));
        if (arg2 != -1 && arg3 != -1) {
            var12.method557(arg0, arg3, true, arg2);
        } else if (arg2 != -1) {
            var12.method556(598, arg2);
        }
        if (this.field1556 != 128 || this.field1563 != 128) {
            var12.method564(this.field1563, this.field1556, (byte) -46, this.field1556);
        }
        var12.method552(0);
        var12.field1647 = null;
        var12.field1646 = null;
        if (this.field1560 == 1) {
            var12.field1648 = true;
        }
        return var12;
    }

    @OriginalMember(owner = "WHKCNEXD", name = "d", descriptor = "(I)LWHKCNEXD;")
    public static final class60 method521(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field1552[var1].field1546) {
                return field1552[var1];
            }
        }
        field1541 = (field1541 + 1) % 20;
        class60 var2 = field1552[field1541] = new class60();
        field1561.field832 = field1525[arg0];
        var2.field1546 = arg0;
        var2.method523(field1527, field1561);
        return var2;
    }

    @OriginalMember(owner = "WHKCNEXD", name = "a", descriptor = "(B)LYABPKWWG;")
    public final class67 method522(byte arg0) {
        if (arg0 != -127) {
            throw new NullPointerException();
        } else if (this.field1549 != null) {
            class60 var2 = this.method518(-13525);
            return var2 == null ? null : var2.method522((byte) -127);
        } else if (this.field1537 == null) {
            return null;
        } else {
            boolean var3 = false;
            for (int var4 = 0; var4 < this.field1537.length; var4++) {
                if (!class67.method549(this.field1537[var4])) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            class67[] var5 = new class67[this.field1537.length];
            for (int var6 = 0; var6 < this.field1537.length; var6++) {
                var5[var6] = class67.method548(this.field1537[var6], (byte) -27);
            }
            class67 var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new class67(var5, true, var5.length);
            }
            if (this.field1559 != null) {
                for (int var8 = 0; var8 < this.field1559.length; var8++) {
                    var7.method562(this.field1559[var8], this.field1529[var8]);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "WHKCNEXD", name = "a", descriptor = "(ILIMUIZRAF;)V")
    private final void method523(int arg0, class24 arg1) {
        if (arg0 != 8) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method238();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int var4 = arg1.method238();
                    this.field1553 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1553[var5] = arg1.method240();
                    }
                } else if (var3 == 2) {
                    this.field1548 = arg1.method245();
                } else if (var3 == 3) {
                    this.field1540 = arg1.method246(7);
                } else if (var3 == 12) {
                    this.field1560 = arg1.method239();
                } else if (var3 == 13) {
                    this.field1532 = arg1.method240();
                } else if (var3 == 14) {
                    this.field1530 = arg1.method240();
                } else if (var3 == 17) {
                    this.field1530 = arg1.method240();
                    this.field1544 = arg1.method240();
                    this.field1550 = arg1.method240();
                    this.field1535 = arg1.method240();
                } else if (var3 >= 30 && var3 < 40) {
                    if (this.field1564 == null) {
                        this.field1564 = new String[5];
                    }
                    this.field1564[var3 - 30] = arg1.method245();
                    if (this.field1564[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field1564[var3 - 30] = null;
                    }
                } else if (var3 == 40) {
                    int var6 = arg1.method238();
                    this.field1559 = new int[var6];
                    this.field1529 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1559[var7] = arg1.method240();
                        this.field1529[var7] = arg1.method240();
                    }
                } else if (var3 == 60) {
                    int var8 = arg1.method238();
                    this.field1537 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field1537[var9] = arg1.method240();
                    }
                } else if (var3 == 90) {
                    this.field1558 = arg1.method240();
                } else if (var3 == 91) {
                    this.field1536 = arg1.method240();
                } else if (var3 == 92) {
                    this.field1543 = arg1.method240();
                } else if (var3 == 93) {
                    this.field1526 = false;
                } else if (var3 == 95) {
                    this.field1538 = arg1.method240();
                } else if (var3 == 97) {
                    this.field1556 = arg1.method240();
                } else if (var3 == 98) {
                    this.field1563 = arg1.method240();
                } else if (var3 == 99) {
                    this.field1534 = true;
                } else if (var3 == 100) {
                    this.field1531 = arg1.method239();
                } else if (var3 == 101) {
                    this.field1562 = arg1.method239() * 5;
                } else if (var3 == 102) {
                    this.field1555 = arg1.method240();
                } else if (var3 == 103) {
                    this.field1539 = arg1.method240();
                } else if (var3 == 106) {
                    this.field1554 = arg1.method240();
                    if (this.field1554 == 65535) {
                        this.field1554 = -1;
                    }
                    this.field1551 = arg1.method240();
                    if (this.field1551 == 65535) {
                        this.field1551 = -1;
                    }
                    int var10 = arg1.method238();
                    this.field1549 = new int[var10 + 1];
                    for (int var11 = 0; var11 <= var10; var11++) {
                        this.field1549[var11] = arg1.method240();
                        if (this.field1549[var11] == 65535) {
                            this.field1549[var11] = -1;
                        }
                    }
                } else if (var3 == 107) {
                    this.field1545 = false;
                }
            }
        }
    }
}
