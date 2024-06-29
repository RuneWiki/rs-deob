import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class253 {

    @OriginalMember(owner = "client!s", name = "n", descriptor = "I")
    private int field3552 = -32768;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "Z")
    private boolean field3553 = false;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "Z")
    private boolean field3555 = false;

    @OriginalMember(owner = "client!s", name = "v", descriptor = "I")
    private int field3560 = -1;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    private int field3544 = -1;

    @OriginalMember(owner = "client!s", name = "F", descriptor = "I")
    private int field3570 = -1;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "B")
    private byte field3542;

    @OriginalMember(owner = "client!s", name = "E", descriptor = "I")
    public int field3569;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    private int field3550;

    @OriginalMember(owner = "client!s", name = "y", descriptor = "I")
    private int field3563;

    @OriginalMember(owner = "client!s", name = "x", descriptor = "I")
    public int field3562;

    @OriginalMember(owner = "client!s", name = "s", descriptor = "B")
    private byte field3557;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public int field3548;

    @OriginalMember(owner = "client!s", name = "D", descriptor = "Z")
    private boolean field3568;

    @OriginalMember(owner = "client!s", name = "A", descriptor = "Lfc;")
    public static class235 field3565 = new class235(25, 6);

    @OriginalMember(owner = "client!s", name = "K", descriptor = "Luc;")
    public static class27 field3575 = new class27(74, 7);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    private int field3543;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    private int field3547;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!s", name = "t", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!s", name = "u", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!s", name = "w", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!s", name = "z", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!s", name = "B", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!s", name = "G", descriptor = "I")
    private int field3571;

    @OriginalMember(owner = "client!s", name = "H", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!s", name = "I", descriptor = "I")
    private int field3573;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "Lct;")
    private class131 field3554;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "Lw;")
    private class271 field3549;

    @OriginalMember(owner = "client!s", name = "L", descriptor = "Luea;")
    public static class286 field3576;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "Lba;")
    private class352 field3546;

    @OriginalMember(owner = "client!s", name = "J", descriptor = "Lio;")
    public class401 field3574;

    @OriginalMember(owner = "client!s", name = "C", descriptor = "[Z")
    private boolean[] field3567;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Loa;I)V", line = 3)
    public final void method1557(class638 arg0, int arg1) {
        field3545++;
        if (this.field3549 != null) {
            class293.method1837(this.field3549, this.field3542, this.field3550, this.field3563, this.field3567);
            this.field3549 = null;
            this.field3567 = null;
        }
        if (arg1 != 28393) {
            method1564(-65, 120, false);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V", line = 22)
    public static void method1558(byte arg0) {
        field3565 = null;
        if (arg0 >= -3) {
            method1562(-39, null, 87);
        }
        field3576 = null;
        field3575 = null;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(B)I", line = 34)
    public final int method1559(byte arg0) {
        int var2 = 53 / ((arg0 + 86) / 32);
        field3539++;
        return this.field3552;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V", line = 49)
    public final void method1560(int arg0, int arg1) {
        field3556++;
        this.field3553 = true;
        this.method1561(arg1, arg0 ^ 0x33);
        if (arg0 != -1) {
            method1564(-86, -118, false);
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(II)V", line = 63)
    private final void method1561(int arg0, int arg1) {
        field3551++;
        int var3 = arg0;
        boolean var4 = false;
        if (arg0 == -1) {
            class620 var5 = class164.field2499.method2013(this.field3569, false);
            class620 var6 = var5;
            if (var5.field8623 != null) {
                var5 = var5.method3450(-114, class195.field2888);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field8645 != null) {
                if (this.field3554 != null && var5.method3453((byte) -8, this.field3554.field1790)) {
                    return;
                }
                var3 = var5.method3449(false);
                if (this.field3560 != var5.field8621) {
                    var4 = var5.field8615;
                }
            } else if (var5.field8649 == -1) {
                if (var6 != null && var6.field8645 != null) {
                    if (this.field3554 != null && var6.method3453((byte) -8, this.field3554.field1790)) {
                        return;
                    }
                    var3 = var6.method3449(false);
                    if (this.field3560 != var6.field8621) {
                        var4 = var6.field8615;
                    }
                } else if (var6 != null && var6.field8649 != -1 && this.field3560 != var6.field8621) {
                    var3 = var6.field8649;
                    var4 = var6.field8615;
                }
            } else if (this.field3560 != var5.field8621) {
                var3 = var5.field8649;
                var4 = var5.field8615;
            }
        }
        if (var3 == -1) {
            this.field3554 = null;
            return;
        }
        this.field3546 = null;
        if (this.field3554 == null || this.field3554.field1790 != var3) {
            this.field3554 = class301.field4465.method2763(var3, 31696);
        } else if (this.field3554.field1801 == 0) {
            return;
        }
        if (this.field3554.field1806 == null) {
            this.field3554 = null;
            return;
        }
        if (var4) {
            this.field3543 = (int) ((double) this.field3554.field1806.length * Math.random());
            this.field3571 = (int) ((double) this.field3554.field1810[this.field3543] * Math.random()) + 1;
        } else {
            this.field3571 = 1;
            this.field3543 = 0;
        }
        if (arg1 >= -47) {
            return;
        }
        this.field3573 = this.field3543 + 1;
        if (this.field3573 < 0 || this.field3573 >= this.field3554.field1806.length) {
            this.field3573 = -1;
        }
        this.field3547 = class239.field3440 - this.field3571;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I[SI)[S", line = 192)
    public static final short[] method1562(int arg0, short[] arg1, int arg2) {
        field3559++;
        short[] var3 = new short[arg0];
        class282.method1709(arg1, 0, var3, 0, arg0);
        if (arg2 != 262144) {
            method1562(-123, null, -121);
        }
        return var3;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(Loa;Llt;IIIIIIZI)V", line = 563)
    public class253(class638 arg0, class620 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field3542 = (byte) arg5;
        this.field3569 = arg1.field8621;
        this.field3550 = arg6;
        this.field3563 = arg7;
        this.field3562 = arg3;
        this.field3557 = (byte) arg4;
        this.field3548 = arg2;
        this.field3555 = arg8;
        this.field3568 = arg0.method423() && arg1.field8563 && !this.field3555;
        if (arg9 != -1) {
            this.field3553 = true;
        }
        this.method1561(arg9, -52);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZLoa;IZIIZ)Lba;", line = 217)
    public final class352 method1563(boolean arg0, class638 arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        field3572++;
        class620 var8 = class164.field2499.method2013(this.field3569, false);
        if (var8.field8623 != null) {
            var8 = var8.method3450(-117, class195.field2888);
        }
        if (var8 == null) {
            this.method1557(arg1, 28393);
            this.field3560 = -1;
            this.field3544 = -1;
            this.field3570 = -1;
            return null;
        }
        if (!this.field3553 && this.field3560 != var8.field8621) {
            this.field3546 = null;
            this.method1561(-1, -72);
        }
        this.method1566(arg4, arg0, arg2);
        if (arg6) {
            boolean var9 = arg6 & this.field3568 & class274.field3872.method543(class429.field6020, (byte) 20) != 0;
            arg6 = var9 & (this.field3570 != var8.field8621 || this.field3554 != null && class274.field3872.method543(class429.field6020, (byte) 20) >= 2 && (this.field3544 != this.field3543 || (this.field3554.field1817 || class492.field6791) && this.field3573 != this.field3543));
        }
        if (arg3 && !arg6) {
            this.field3560 = var8.field8621;
            return null;
        }
        if (arg6) {
            class293.method1837(this.field3549, this.field3542, this.field3550, this.field3563, this.field3567);
            this.field3570 = -1;
            this.field3544 = -1;
        }
        class136 var10 = class144.field2149[this.field3542];
        class136 var11;
        if (this.field3555) {
            var11 = class31.field369[0];
        } else {
            var11 = this.field3542 >= 3 ? null : class144.field2149[this.field3542 + 1];
        }
        class352 var12 = null;
        if (this.field3554 != null) {
            if (arg6) {
                arg5 |= 0x40000;
            }
            var12 = var8.method3455(this.field3550, this.field3571, var11, this.field3548 == 11 ? 10 : this.field3548, var10, arg5, var10.method267(this.field3550, this.field3563), this.field3573, this.field3548 == 11 ? this.field3562 + 4 : this.field3562, this.field3563, arg1, this.field3543, 8332, this.field3554);
            if (var12 == null) {
                this.field3552 = 0;
                this.field3567 = null;
                this.field3549 = null;
            } else {
                if (arg6) {
                    if (this.field3567 == null) {
                        this.field3567 = new boolean[4];
                    }
                    this.field3549 = var12.method201(this.field3549);
                    class192.method1283(this.field3549, this.field3542, arg2, arg4, this.field3567);
                    this.field3544 = this.field3543;
                    this.field3570 = var8.field8621;
                }
                this.field3552 = var12.method220();
            }
            this.field3546 = null;
        } else if (this.field3546 != null && (arg5 & this.field3546.method189()) == arg5 && this.field3560 == var8.field8621) {
            var12 = this.field3546;
        } else {
            if (this.field3546 != null) {
                arg5 |= this.field3546.method189();
            }
            class156 var13 = var8.method3458(arg5, var11, var10.method267(this.field3550, this.field3563), this.field3548 == 11 ? 10 : this.field3548, var10, this.field3563, arg6, -121, this.field3550, this.field3548 == 11 ? this.field3562 + 4 : this.field3562, arg1);
            if (var13 == null) {
                this.field3567 = null;
                this.field3552 = 0;
                this.field3549 = null;
                this.field3546 = null;
            } else {
                var12 = var13.field2355;
                this.field3546 = var13.field2355;
                if (arg6) {
                    this.field3549 = var13.field2358;
                    this.field3567 = null;
                    class192.method1283(this.field3549, this.field3542, arg2, arg4, null);
                    this.field3544 = -1;
                    this.field3570 = var8.field8621;
                }
                this.field3552 = var12.method220();
            }
        }
        if (arg0) {
            this.field3563 = arg4;
            this.field3550 = arg2;
            this.field3560 = var8.field8621;
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIZ)Z", line = 360)
    public static final boolean method1564(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field3575 = null;
        }
        field3558++;
        return class264.method1602(arg1, 70, arg0) & class689.method3795(arg0, arg1, -86);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILq;Loa;IIIIZLba;)V", line = 372)
    public final void method1565(int arg0, class391 arg1, class638 arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class352 arg8) {
        if (arg4 != 0) {
            return;
        }
        field3566++;
        class34[] var10 = arg8.method221();
        class171[] var11 = arg8.method206();
        if ((this.field3574 == null || this.field3574.field5570) && (var10 != null || var11 != null)) {
            class620 var12 = class164.field2499.method2013(this.field3569, false);
            if (var12.field8623 != null) {
                var12 = var12.method3450(-128, class195.field2888);
            }
            if (var12 != null) {
                this.field3574 = class401.method2277(class239.field3440, true);
            }
        }
        if (this.field3574 == null) {
            return;
        }
        arg8.method211(arg1);
        if (arg7) {
            this.field3574.method2281(arg2, (long) class239.field3440, var10, var11, false);
        } else {
            this.field3574.method2280((long) class239.field3440);
        }
        this.field3574.method2278(this.field3557, arg6, arg0, arg3, arg5);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IZI)V", line = 411)
    private final void method1566(int arg0, boolean arg1, int arg2) {
        field3541++;
        if (!arg1) {
            this.method1566(33, false, -83);
        }
        label90: while (true) {
            if (this.field3554 == null) {
                if (this.field3553) {
                    return;
                }
                this.method1561(-1, -73);
                if (this.field3554 == null) {
                    return;
                }
            }
            int var4 = class239.field3440 - this.field3547;
            if (var4 > 100 && this.field3554.field1800 > 0) {
                int var5 = this.field3554.field1806.length - this.field3554.field1800;
                while (this.field3543 < var5 && this.field3554.field1810[this.field3543] < var4) {
                    var4 -= this.field3554.field1810[this.field3543];
                    this.field3543++;
                }
                if (this.field3543 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field3554.field1806.length; var7++) {
                        var6 += this.field3554.field1810[var7];
                    }
                    var4 %= var6;
                }
                this.field3573 = this.field3543 + 1;
                if (this.field3554.field1806.length <= this.field3573) {
                    this.field3573 -= this.field3554.field1800;
                    if (this.field3573 < 0 || this.field3573 >= this.field3554.field1806.length) {
                        this.field3573 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var4 <= this.field3554.field1810[this.field3543]) {
                            this.field3547 = class239.field3440 - var4;
                            this.field3571 = var4;
                            return;
                        }
                        class99.method769(false, arg2, this.field3557, this.field3554, arg0, 50, this.field3543);
                        var4 -= this.field3554.field1810[this.field3543];
                        this.field3543++;
                        if (this.field3543 >= this.field3554.field1806.length) {
                            this.field3543 -= this.field3554.field1800;
                            if (this.field3543 < 0 || this.field3543 >= this.field3554.field1806.length) {
                                this.field3554 = null;
                                continue label90;
                            }
                        }
                        this.field3573 = this.field3543 + 1;
                    } while (this.field3573 < this.field3554.field1806.length);
                    this.field3573 -= this.field3554.field1800;
                } while (this.field3573 >= 0 && this.field3573 < this.field3554.field1806.length);
                this.field3573 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(B)Z", line = 510)
    public final boolean method1567(byte arg0) {
        if (arg0 >= -36) {
            this.finalize();
        }
        field3540++;
        return this.field3568;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZLoa;)V", line = 533)
    public final void method1568(boolean arg0, class638 arg1) {
        this.method1563(arg0, arg1, this.field3550, true, this.field3563, 262144, true);
        field3564++;
    }

    @OriginalMember(owner = "client!s", name = "finalize", descriptor = "()V", line = 541)
    protected final void finalize() {
        if (this.field3574 != null) {
            this.field3574.method2291();
        }
        field3561++;
    }
}
