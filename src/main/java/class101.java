import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class101 extends class496 {

    @OriginalMember(owner = "client!uaa", name = "l", descriptor = "I")
    private int field1575 = 0;

    @OriginalMember(owner = "client!uaa", name = "d", descriptor = "Lkea;")
    private class213 field1567 = new class213(16);

    @OriginalMember(owner = "client!uaa", name = "J", descriptor = "I")
    private int field1599 = 0;

    @OriginalMember(owner = "client!uaa", name = "H", descriptor = "Lwba;")
    private class46 field1597 = new class46();

    @OriginalMember(owner = "client!uaa", name = "M", descriptor = "J")
    private long field1602 = 0L;

    @OriginalMember(owner = "client!uaa", name = "p", descriptor = "I")
    private int field1579;

    @OriginalMember(owner = "client!uaa", name = "q", descriptor = "Lwo;")
    private class691 field1580;

    @OriginalMember(owner = "client!uaa", name = "I", descriptor = "Z")
    private boolean field1598;

    @OriginalMember(owner = "client!uaa", name = "K", descriptor = "Lwba;")
    private class46 field1600;

    @OriginalMember(owner = "client!uaa", name = "r", descriptor = "Lwo;")
    private class691 field1581;

    @OriginalMember(owner = "client!uaa", name = "B", descriptor = "I")
    private int field1591;

    @OriginalMember(owner = "client!uaa", name = "g", descriptor = "I")
    private int field1570;

    @OriginalMember(owner = "client!uaa", name = "D", descriptor = "[B")
    private byte[] field1593;

    @OriginalMember(owner = "client!uaa", name = "k", descriptor = "Laga;")
    private class618 field1574;

    @OriginalMember(owner = "client!uaa", name = "L", descriptor = "Z")
    private boolean field1601;

    @OriginalMember(owner = "client!uaa", name = "F", descriptor = "Ln;")
    private class17 field1595;

    @OriginalMember(owner = "client!uaa", name = "C", descriptor = "Ldga;")
    private class189 field1592;

    @OriginalMember(owner = "client!uaa", name = "e", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!uaa", name = "f", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!uaa", name = "h", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!uaa", name = "j", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!uaa", name = "m", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!uaa", name = "o", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!uaa", name = "s", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!uaa", name = "t", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!uaa", name = "u", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!uaa", name = "v", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!uaa", name = "w", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!uaa", name = "y", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!uaa", name = "z", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!uaa", name = "A", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!uaa", name = "i", descriptor = "Leu;")
    public static class442 field1572;

    @OriginalMember(owner = "client!uaa", name = "x", descriptor = "Lar;")
    private class634 field1587;

    @OriginalMember(owner = "client!uaa", name = "G", descriptor = "Z")
    private boolean field1596;

    @OriginalMember(owner = "client!uaa", name = "E", descriptor = "[B")
    private byte[] field1594;

    @OriginalMember(owner = "client!uaa", name = "n", descriptor = "[[[B")
    public static byte[][][] field1577;

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(IB)I")
    public final int method815(int arg0, byte arg1) {
        field1578++;
        class189 var3 = (class189) this.field1567.method1405((long) arg0, (byte) -65);
        if (var3 == null) {
            return arg1 == -9 ? 0 : 97;
        } else {
            return var3.method831(63);
        }
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(I)I")
    public final int method816(int arg0) {
        field1569++;
        if (this.method825((byte) 0) == null) {
            return this.field1592 == null ? 0 : this.field1592.method831(123);
        } else if (arg0 == 255) {
            return 100;
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "(I)I")
    public final int method817(int arg0) {
        if (arg0 != 0) {
            this.method819((byte) -58);
        }
        field1590++;
        return this.field1587 == null ? 0 : this.field1587.field8970;
    }

    @OriginalMember(owner = "client!uaa", name = "d", descriptor = "(I)I")
    public final int method818(int arg0) {
        field1588++;
        if (this.field1587 == null) {
            return 0;
        } else if (!this.field1598) {
            return this.field1587.field8970;
        } else if (arg0 > -86) {
            return 63;
        } else {
            class665 var2 = this.field1600.method472((byte) -33);
            return var2 == null ? 0 : (int) var2.field9386;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "(B)V")
    public final void method819(byte arg0) {
        field1589++;
        if (arg0 != 0) {
            return;
        }
        if (this.field1600 != null) {
            if (this.method825((byte) 0) == null) {
                return;
            }
            if (this.field1598) {
                boolean var6 = true;
                for (class665 var7 = this.field1600.method472((byte) -101); var7 != null; var7 = this.field1600.method482(-17)) {
                    int var9 = (int) var7.field9386;
                    if (this.field1594[var9] == 0) {
                        this.method822((byte) -119, var9, 1);
                    }
                    if (this.field1594[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method3678(-1);
                    }
                }
                while (this.field1587.field8963.length > this.field1599) {
                    if (this.field1587.field8963[this.field1599] == 0) {
                        this.field1599++;
                    } else {
                        if (this.field1595.field185 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field1594[this.field1599] == 0) {
                            this.method822((byte) -125, this.field1599, 1);
                        }
                        if (this.field1594[this.field1599] == 0) {
                            class665 var8 = new class665();
                            var8.field9386 = this.field1599;
                            this.field1600.method474(var8, 6);
                            var6 = false;
                        }
                        this.field1599++;
                    }
                }
                if (var6) {
                    this.field1598 = false;
                    this.field1599 = 0;
                }
            } else if (this.field1596) {
                boolean var2 = true;
                for (class665 var3 = this.field1600.method472((byte) -55); var3 != null; var3 = this.field1600.method482(126)) {
                    int var5 = (int) var3.field9386;
                    if (this.field1594[var5] != 1) {
                        this.method822((byte) -101, var5, 2);
                    }
                    if (this.field1594[var5] == 1) {
                        var3.method3678(~arg0);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field1587.field8963.length > this.field1599) {
                    if (this.field1587.field8963[this.field1599] == 0) {
                        this.field1599++;
                    } else {
                        if (this.field1574.method3442(false)) {
                            var2 = false;
                            break;
                        }
                        if (this.field1594[this.field1599] != 1) {
                            this.method822((byte) -115, this.field1599, 2);
                        }
                        if (this.field1594[this.field1599] != 1) {
                            class665 var4 = new class665();
                            var4.field9386 = this.field1599;
                            var2 = false;
                            this.field1600.method474(var4, 6);
                        }
                        this.field1599++;
                    }
                }
                if (var2) {
                    this.field1596 = false;
                    this.field1599 = 0;
                }
            } else {
                this.field1600 = null;
            }
        }
        if (!this.field1601 || class490.method2840(true) < this.field1602) {
            return;
        }
        for (class189 var10 = (class189) this.field1567.method1407(-97); var10 != null; var10 = (class189) this.field1567.method1413(true)) {
            if (!var10.field2717) {
                if (var10.field2722) {
                    if (!var10.field2718) {
                        throw new RuntimeException();
                    }
                    var10.method3678(-1);
                } else {
                    var10.field2722 = true;
                }
            }
        }
        this.field1602 = class490.method2840(true) + 1000L;
    }

    @OriginalMember(owner = "client!uaa", name = "e", descriptor = "(I)I")
    public final int method820(int arg0) {
        if (arg0 != 250) {
            this.field1594 = null;
        }
        field1585++;
        return this.field1575;
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Z)V")
    public final void method821(boolean arg0) {
        field1586++;
        if (this.field1580 != null) {
            this.field1596 = arg0;
            if (this.field1600 == null) {
                this.field1600 = new class46();
            }
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(BII)Ldga;")
    private final class189 method822(byte arg0, int arg1, int arg2) {
        field1582++;
        class189 var4 = (class189) this.field1567.method1405((long) arg1, (byte) -19);
        if (var4 != null && arg2 == 0 && !var4.field2718 && var4.field2717) {
            var4.method3678(-1);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field1580 == null || this.field1594[arg1] == -1) {
                    if (this.field1574.method3435((byte) 113)) {
                        return null;
                    }
                    var4 = this.field1574.method3439(this.field1579, arg1, (byte) -63, (byte) 2, true);
                } else {
                    var4 = this.field1595.method96((byte) 127, arg1, this.field1580);
                }
            } else if (arg2 == 1) {
                if (this.field1580 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field1595.method97(arg1, -10598, this.field1580);
            } else if (arg2 == 2) {
                if (this.field1580 == null) {
                    throw new RuntimeException();
                }
                if (this.field1594[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field1574.method3442(false)) {
                    return null;
                }
                var4 = this.field1574.method3439(this.field1579, arg1, (byte) -122, (byte) 2, false);
            } else {
                throw new RuntimeException();
            }
            this.field1567.method1403((byte) -18, var4, (long) arg1);
        }
        if (var4.field2717) {
            return null;
        }
        byte[] var5 = var4.method833(0);
        if (arg0 >= -96) {
            this.method826(83);
        }
        if (!var4 instanceof class103) {
            try {
                label159: {
                    if (var5 != null && var5.length > 2) {
                        class115.field1764.reset();
                        class115.field1764.update(var5, 0, var5.length - 2);
                        int var12 = (int) class115.field1764.getValue();
                        if (this.field1587.field8961[arg1] != var12) {
                            throw new RuntimeException();
                        }
                        if (this.field1587.field8968 == null || this.field1587.field8968[arg1] == null) {
                            break label159;
                        }
                        byte[] var13 = this.field1587.field8968[arg1];
                        byte[] var14 = class234.method1604(var5.length - 2, var5, 0, 128);
                        int var15 = 0;
                        while (true) {
                            if (var15 >= 64) {
                                break label159;
                            }
                            if (var13[var15] != var14[var15]) {
                                throw new RuntimeException();
                            }
                            var15++;
                        }
                    }
                    throw new RuntimeException();
                }
                this.field1574.field8623 = 0;
                this.field1574.field8625 = 0;
            } catch (RuntimeException var18) {
                this.field1574.method3437(1);
                var4.method3678(-1);
                if (var4.field2718 && !this.field1574.method3435((byte) 115)) {
                    class150 var16 = this.field1574.method3439(this.field1579, arg1, (byte) -126, (byte) 2, true);
                    this.field1567.method1403((byte) -18, var16, (long) arg1);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field1587.field8978[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field1587.field8978[arg1];
            if (this.field1580 != null) {
                this.field1595.method99(arg1, -23907, var5, this.field1580);
                if (this.field1594[arg1] != 1) {
                    this.field1575++;
                    this.field1594[arg1] = 1;
                }
            }
            if (!var4.field2718) {
                var4.method3678(-1);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class115.field1764.reset();
            class115.field1764.update(var5, 0, var5.length - 2);
            int var6 = (int) class115.field1764.getValue();
            if (this.field1587.field8961[arg1] != var6) {
                throw new RuntimeException();
            }
            if (this.field1587.field8968 != null && this.field1587.field8968[arg1] != null) {
                byte[] var7 = this.field1587.field8968[arg1];
                byte[] var8 = class234.method1604(var5.length - 2, var5, 0, 128);
                for (int var9 = 0; var9 < 64; var9++) {
                    if (var7[var9] != var8[var9]) {
                        throw new RuntimeException();
                    }
                }
            }
            int var10 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field1587.field8978[arg1] & 0xFFFF) != var10) {
                throw new RuntimeException();
            }
            if (this.field1594[arg1] != 1) {
                this.field1575++;
                this.field1594[arg1] = 1;
            }
            if (!var4.field2718) {
                var4.method3678(-1);
            }
            return var4;
        } catch (Exception var17) {
            this.field1594[arg1] = -1;
            var4.method3678(-1);
            if (var4.field2718 && !this.field1574.method3435((byte) 111)) {
                class150 var11 = this.field1574.method3439(this.field1579, arg1, (byte) -67, (byte) 2, true);
                this.field1567.method1403((byte) -18, var11, (long) arg1);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "f", descriptor = "(I)V")
    public static void method823(int arg0) {
        field1572 = null;
        if (arg0 == 2) {
            field1577 = null;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(BI)V")
    public final void method824(byte arg0, int arg1) {
        field1571++;
        if (this.field1580 == null) {
            return;
        }
        for (class665 var3 = this.field1597.method472((byte) -77); var3 != null; var3 = this.field1597.method482(23)) {
            if (((long) arg1) == var3.field9386) {
                return;
            }
        }
        class665 var4 = new class665();
        if (arg0 <= 0) {
            this.field1580 = null;
        }
        var4.field9386 = arg1;
        this.field1597.method474(var4, 6);
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(B)Lar;")
    public final class634 method825(byte arg0) {
        field1568++;
        if (this.field1587 != null) {
            return this.field1587;
        }
        if (this.field1592 == null) {
            if (this.field1574.method3435((byte) 114)) {
                return null;
            }
            this.field1592 = this.field1574.method3439(255, this.field1579, (byte) -125, (byte) 0, true);
        }
        if (this.field1592.field2717) {
            return null;
        }
        byte[] var2 = this.field1592.method833(0);
        if (this.field1592 instanceof class103) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field1587 = new class634(var2, this.field1570, this.field1593);
                if (this.field1587.field8962 != this.field1591) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field1587 = null;
                if (this.field1574.method3435((byte) 122)) {
                    this.field1592 = null;
                } else {
                    this.field1592 = this.field1574.method3439(255, this.field1579, (byte) -111, (byte) 0, true);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field1587 = new class634(var2, this.field1570, this.field1593);
            } catch (RuntimeException var4) {
                this.field1574.method3437(arg0 + 1);
                this.field1587 = null;
                if (this.field1574.method3435((byte) 123)) {
                    this.field1592 = null;
                } else {
                    this.field1592 = this.field1574.method3439(255, this.field1579, (byte) -118, (byte) 0, true);
                }
                return null;
            }
            if (this.field1581 != null) {
                this.field1595.method99(this.field1579, -23907, var2, this.field1581);
            }
        }
        if (arg0 != 0) {
            this.method826(45);
        }
        if (this.field1580 != null) {
            this.field1575 = 0;
            this.field1594 = new byte[this.field1587.field8973];
        }
        this.field1592 = null;
        return this.field1587;
    }

    @OriginalMember(owner = "client!uaa", name = "g", descriptor = "(I)V")
    public final void method826(int arg0) {
        field1584++;
        if (this.field1600 == null || this.method825((byte) 0) == null || arg0 != -1) {
            return;
        }
        for (class665 var2 = this.field1597.method472((byte) -95); var2 != null; var2 = this.field1597.method482(-121)) {
            int var3 = (int) var2.field9386;
            if (var3 < 0 || var3 >= this.field1587.field8973 || this.field1587.field8963[var3] == 0) {
                var2.method3678(-1);
            } else {
                if (this.field1594[var3] == 0) {
                    this.method822((byte) -100, var3, 1);
                }
                if (this.field1594[var3] == -1) {
                    this.method822((byte) -101, var3, 2);
                }
                if (this.field1594[var3] == 1) {
                    var2.method3678(-1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(II)[B")
    public final byte[] method827(int arg0, int arg1) {
        field1576++;
        class189 var3 = this.method822((byte) -110, arg0, 0);
        if (var3 == null) {
            return null;
        }
        if (arg1 != -27961) {
            this.method816(32);
        }
        byte[] var4 = var3.method833(arg1 + 27961);
        var3.method3678(-1);
        return var4;
    }

    @OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(ILwo;Lwo;Laga;Ln;I[BIZ)V")
    public class101(int arg0, class691 arg1, class691 arg2, class618 arg3, class17 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field1579 = arg0;
        this.field1580 = arg1;
        if (this.field1580 == null) {
            this.field1598 = false;
        } else {
            this.field1598 = true;
            this.field1600 = new class46();
        }
        this.field1581 = arg2;
        this.field1591 = arg7;
        this.field1570 = arg5;
        this.field1593 = arg6;
        this.field1574 = arg3;
        this.field1601 = arg8;
        this.field1595 = arg4;
        if (this.field1581 != null) {
            this.field1592 = this.field1595.method96((byte) 125, this.field1579, this.field1581);
        }
    }
}
