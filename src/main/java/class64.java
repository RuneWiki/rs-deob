import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YGGALXYD")
public class class64 {

    @OriginalMember(owner = "client!YGGALXYD", name = "b", descriptor = "I")
    public int field1565 = -1;

    @OriginalMember(owner = "client!YGGALXYD", name = "d", descriptor = "Z")
    public boolean field1567 = false;

    @OriginalMember(owner = "client!YGGALXYD", name = "e", descriptor = "I")
    private int field1568 = 5;

    @OriginalMember(owner = "client!YGGALXYD", name = "g", descriptor = "I")
    public int field1570 = -1;

    @OriginalMember(owner = "client!YGGALXYD", name = "i", descriptor = "J")
    public long field1572 = -1L;

    @OriginalMember(owner = "client!YGGALXYD", name = "j", descriptor = "I")
    public int field1573 = -1;

    @OriginalMember(owner = "client!YGGALXYD", name = "m", descriptor = "I")
    public int field1576 = -1;

    @OriginalMember(owner = "client!YGGALXYD", name = "o", descriptor = "I")
    public int field1578 = -1;

    @OriginalMember(owner = "client!YGGALXYD", name = "p", descriptor = "Z")
    public boolean field1579 = true;

    @OriginalMember(owner = "client!YGGALXYD", name = "t", descriptor = "I")
    public int field1583 = -1;

    @OriginalMember(owner = "client!YGGALXYD", name = "u", descriptor = "I")
    private int field1584 = 128;

    @OriginalMember(owner = "client!YGGALXYD", name = "v", descriptor = "I")
    public int field1585 = -1;

    @OriginalMember(owner = "client!YGGALXYD", name = "w", descriptor = "I")
    public int field1586 = -1;

    @OriginalMember(owner = "client!YGGALXYD", name = "z", descriptor = "Z")
    public boolean field1589 = true;

    @OriginalMember(owner = "client!YGGALXYD", name = "A", descriptor = "I")
    public int field1590 = -1;

    @OriginalMember(owner = "client!YGGALXYD", name = "B", descriptor = "I")
    private int field1591 = 128;

    @OriginalMember(owner = "client!YGGALXYD", name = "G", descriptor = "I")
    public int field1596 = -1;

    @OriginalMember(owner = "client!YGGALXYD", name = "H", descriptor = "B")
    public byte field1597 = 1;

    @OriginalMember(owner = "client!YGGALXYD", name = "J", descriptor = "I")
    public int field1599 = -1;

    @OriginalMember(owner = "client!YGGALXYD", name = "K", descriptor = "I")
    public int field1600 = 32;

    @OriginalMember(owner = "client!YGGALXYD", name = "L", descriptor = "I")
    public int field1601 = -1;

    @OriginalMember(owner = "client!YGGALXYD", name = "r", descriptor = "LTHJKANXW;")
    public static class54 field1581 = new class54(30, false);

    @OriginalMember(owner = "client!YGGALXYD", name = "k", descriptor = "I")
    private int field1574;

    @OriginalMember(owner = "client!YGGALXYD", name = "l", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!YGGALXYD", name = "D", descriptor = "I")
    private static int field1593;

    @OriginalMember(owner = "client!YGGALXYD", name = "F", descriptor = "I")
    private int field1595;

    @OriginalMember(owner = "client!YGGALXYD", name = "I", descriptor = "LLBBVYYXO;")
    private static class32 field1598;

    @OriginalMember(owner = "client!YGGALXYD", name = "y", descriptor = "Lclient;")
    public static client field1588;

    @OriginalMember(owner = "client!YGGALXYD", name = "s", descriptor = "Ljava/lang/String;")
    public String field1582;

    @OriginalMember(owner = "client!YGGALXYD", name = "C", descriptor = "[B")
    public byte[] field1592;

    @OriginalMember(owner = "client!YGGALXYD", name = "a", descriptor = "[I")
    private int[] field1564;

    @OriginalMember(owner = "client!YGGALXYD", name = "f", descriptor = "[I")
    private int[] field1569;

    @OriginalMember(owner = "client!YGGALXYD", name = "h", descriptor = "[I")
    private static int[] field1571;

    @OriginalMember(owner = "client!YGGALXYD", name = "q", descriptor = "[I")
    private int[] field1580;

    @OriginalMember(owner = "client!YGGALXYD", name = "x", descriptor = "[I")
    public int[] field1587;

    @OriginalMember(owner = "client!YGGALXYD", name = "E", descriptor = "[I")
    private int[] field1594;

    @OriginalMember(owner = "client!YGGALXYD", name = "c", descriptor = "[LYGGALXYD;")
    private static class64[] field1566;

    @OriginalMember(owner = "client!YGGALXYD", name = "n", descriptor = "[Ljava/lang/String;")
    public String[] field1577;

    @OriginalMember(owner = "client!YGGALXYD", name = "a", descriptor = "(IBI[I)LCYPZUKMB;")
    public final class8 method569(int arg0, byte arg1, int arg2, int[] arg3) {
        if (arg1 == 0) {
            boolean var5 = false;
        } else {
            this.field1568 = -361;
        }
        if (this.field1587 != null) {
            class64 var6 = this.method572(7);
            return var6 == null ? null : var6.method569(arg0, (byte) 0, arg2, arg3);
        }
        class8 var7 = (class8) field1581.method529(this.field1572);
        if (var7 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < this.field1564.length; var9++) {
                if (!class8.method197(this.field1564[var9])) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            class8[] var10 = new class8[this.field1564.length];
            for (int var11 = 0; var11 < this.field1564.length; var11++) {
                var10[var11] = class8.method196(this.field1564[var11]);
            }
            if (var10.length == 1) {
                var7 = var10[0];
            } else {
                var7 = new class8(var10, 3, var10.length);
            }
            if (this.field1594 != null) {
                for (int var12 = 0; var12 < this.field1594.length; var12++) {
                    var7.method210(this.field1594[var12], this.field1569[var12]);
                }
            }
            var7.method203(166);
            var7.method213(this.field1574 + 64, this.field1595 + 850, -30, -50, -30, true);
            field1581.method530(this.field1572, true, var7);
        }
        class8 var13 = class8.field615;
        var13.method198(940, class46.method469(arg2, true) & class46.method469(arg0, true), var7);
        if (arg2 != -1 && arg0 != -1) {
            var13.method205(arg2, arg0, -40256, arg3);
        } else if (arg2 != -1) {
            var13.method204(257, arg2);
        }
        if (this.field1584 != 128 || this.field1591 != 128) {
            var13.method212(this.field1584, -39776, this.field1591, this.field1584);
        }
        var13.method200((byte) 50);
        var13.field651 = null;
        var13.field650 = null;
        if (this.field1597 == 1) {
            var13.field652 = true;
        }
        return var13;
    }

    @OriginalMember(owner = "client!YGGALXYD", name = "a", descriptor = "(LLBBVYYXO;B)V")
    private final void method570(class32 arg0, byte arg1) {
        if (arg1 != 59) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method369();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int var4 = arg0.method369();
                    this.field1564 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1564[var5] = arg0.method371();
                    }
                } else if (var3 == 2) {
                    this.field1582 = arg0.method376();
                } else if (var3 == 3) {
                    this.field1592 = arg0.method377((byte) 0);
                } else if (var3 == 12) {
                    this.field1597 = arg0.method370();
                } else if (var3 == 13) {
                    this.field1590 = arg0.method371();
                } else if (var3 == 14) {
                    this.field1599 = arg0.method371();
                } else if (var3 == 17) {
                    this.field1599 = arg0.method371();
                    this.field1565 = arg0.method371();
                    this.field1578 = arg0.method371();
                    this.field1596 = arg0.method371();
                } else if (var3 >= 30 && var3 < 40) {
                    if (this.field1577 == null) {
                        this.field1577 = new String[5];
                    }
                    this.field1577[var3 - 30] = arg0.method376();
                    if (this.field1577[var3 - 30].equalsIgnoreCase("hidden")) {
                        this.field1577[var3 - 30] = null;
                    }
                } else if (var3 == 40) {
                    int var6 = arg0.method369();
                    this.field1594 = new int[var6];
                    this.field1569 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1594[var7] = arg0.method371();
                        this.field1569[var7] = arg0.method371();
                    }
                } else if (var3 == 60) {
                    int var8 = arg0.method369();
                    this.field1580 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field1580[var9] = arg0.method371();
                    }
                } else if (var3 == 90) {
                    this.field1601 = arg0.method371();
                } else if (var3 == 91) {
                    this.field1583 = arg0.method371();
                } else if (var3 == 92) {
                    this.field1573 = arg0.method371();
                } else if (var3 == 93) {
                    this.field1589 = false;
                } else if (var3 == 95) {
                    this.field1576 = arg0.method371();
                } else if (var3 == 97) {
                    this.field1584 = arg0.method371();
                } else if (var3 == 98) {
                    this.field1591 = arg0.method371();
                } else if (var3 == 99) {
                    this.field1567 = true;
                } else if (var3 == 100) {
                    this.field1574 = arg0.method370();
                } else if (var3 == 101) {
                    this.field1595 = arg0.method370() * 5;
                } else if (var3 == 102) {
                    this.field1570 = arg0.method371();
                } else if (var3 == 103) {
                    this.field1600 = arg0.method371();
                } else if (var3 == 106) {
                    this.field1585 = arg0.method371();
                    if (this.field1585 == 65535) {
                        this.field1585 = -1;
                    }
                    this.field1586 = arg0.method371();
                    if (this.field1586 == 65535) {
                        this.field1586 = -1;
                    }
                    int var10 = arg0.method369();
                    this.field1587 = new int[var10 + 1];
                    for (int var11 = 0; var11 <= var10; var11++) {
                        this.field1587[var11] = arg0.method371();
                        if (this.field1587[var11] == 65535) {
                            this.field1587[var11] = -1;
                        }
                    }
                } else if (var3 == 107) {
                    this.field1579 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!YGGALXYD", name = "a", descriptor = "(I)LCYPZUKMB;")
    public final class8 method571(int arg0) {
        if (this.field1587 != null) {
            class64 var2 = this.method572(7);
            return var2 == null ? null : var2.method571(-384);
        } else if (this.field1580 == null) {
            return null;
        } else {
            boolean var3 = false;
            if (arg0 >= 0) {
                throw new NullPointerException();
            }
            for (int var4 = 0; var4 < this.field1580.length; var4++) {
                if (!class8.method197(this.field1580[var4])) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            class8[] var5 = new class8[this.field1580.length];
            for (int var6 = 0; var6 < this.field1580.length; var6++) {
                var5[var6] = class8.method196(this.field1580[var6]);
            }
            class8 var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new class8(var5, 3, var5.length);
            }
            if (this.field1594 != null) {
                for (int var8 = 0; var8 < this.field1594.length; var8++) {
                    var7.method210(this.field1594[var8], this.field1569[var8]);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!YGGALXYD", name = "b", descriptor = "(I)LYGGALXYD;")
    public final class64 method572(int arg0) {
        if (arg0 < 7 || arg0 > 7) {
            throw new NullPointerException();
        }
        int var2 = -1;
        if (this.field1585 != -1) {
            class23 var3 = class23.field946[this.field1585];
            int var4 = var3.field948;
            int var5 = var3.field949;
            int var6 = var3.field950;
            int var7 = client.field544[var6 - var5];
            var2 = field1588.field350[var4] >> var5 & var7;
        } else if (this.field1586 != -1) {
            var2 = field1588.field350[this.field1586];
        }
        return var2 < 0 || var2 >= this.field1587.length || this.field1587[var2] == -1 ? null : method575(this.field1587[var2]);
    }

    @OriginalMember(owner = "client!YGGALXYD", name = "a", descriptor = "(Z)V")
    public static final void method573(boolean arg0) {
        field1581 = null;
        if (!arg0) {
            field1571 = null;
            field1566 = null;
            field1598 = null;
        }
    }

    @OriginalMember(owner = "client!YGGALXYD", name = "a", descriptor = "(B)Z")
    public boolean method574(byte arg0) {
        if (arg0 != -92) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (this.field1587 == null) {
            return true;
        }
        int var3 = -1;
        if (this.field1585 != -1) {
            class23 var4 = class23.field946[this.field1585];
            int var5 = var4.field948;
            int var6 = var4.field949;
            int var7 = var4.field950;
            int var8 = client.field544[var7 - var6];
            var3 = field1588.field350[var5] >> var6 & var8;
        } else if (this.field1586 != -1) {
            var3 = field1588.field350[this.field1586];
        }
        return var3 >= 0 && var3 < this.field1587.length && this.field1587[var3] != -1;
    }

    @OriginalMember(owner = "client!YGGALXYD", name = "c", descriptor = "(I)LYGGALXYD;")
    public static final class64 method575(int arg0) {
        for (int var1 = 0; var1 < 20; var1++) {
            if ((long) arg0 == field1566[var1].field1572) {
                return field1566[var1];
            }
        }
        field1593 = (field1593 + 1) % 20;
        class64 var2 = field1566[field1593] = new class64();
        field1598.field1032 = field1571[arg0];
        var2.field1572 = arg0;
        var2.method570(field1598, (byte) 59);
        return var2;
    }

    @OriginalMember(owner = "client!YGGALXYD", name = "a", descriptor = "(LFUZJMGZB;)V")
    public static final void method576(class19 arg0) {
        field1598 = new class32((byte) 114, arg0.method277("npc.dat", null));
        class32 var1 = new class32((byte) 114, arg0.method277("npc.idx", null));
        field1575 = var1.method371();
        field1571 = new int[field1575];
        int var2 = 2;
        for (int var3 = 0; var3 < field1575; var3++) {
            field1571[var3] = var2;
            var2 += var1.method371();
        }
        field1566 = new class64[20];
        for (int var4 = 0; var4 < 20; var4++) {
            field1566[var4] = new class64();
        }
    }
}
