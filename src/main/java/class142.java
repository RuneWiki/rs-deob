import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class142 {

    @OriginalMember(owner = "client!as", name = "j", descriptor = "I")
    private int field1708 = -1;

    @OriginalMember(owner = "client!as", name = "d", descriptor = "Z")
    private boolean field1702 = false;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "I")
    private int field1700 = -32768;

    @OriginalMember(owner = "client!as", name = "s", descriptor = "Z")
    private boolean field1717 = false;

    @OriginalMember(owner = "client!as", name = "m", descriptor = "I")
    private int field1711 = -1;

    @OriginalMember(owner = "client!as", name = "J", descriptor = "I")
    private int field1734 = -1;

    @OriginalMember(owner = "client!as", name = "l", descriptor = "I")
    private int field1710;

    @OriginalMember(owner = "client!as", name = "g", descriptor = "I")
    public int field1705;

    @OriginalMember(owner = "client!as", name = "L", descriptor = "B")
    private byte field1736;

    @OriginalMember(owner = "client!as", name = "n", descriptor = "B")
    private byte field1712;

    @OriginalMember(owner = "client!as", name = "y", descriptor = "I")
    private int field1723;

    @OriginalMember(owner = "client!as", name = "C", descriptor = "I")
    public int field1727;

    @OriginalMember(owner = "client!as", name = "u", descriptor = "I")
    public int field1719;

    @OriginalMember(owner = "client!as", name = "q", descriptor = "Z")
    private boolean field1715;

    @OriginalMember(owner = "client!as", name = "f", descriptor = "Lcga;")
    public static class449 field1704 = new class449(36, 2);

    @OriginalMember(owner = "client!as", name = "A", descriptor = "I")
    public static int field1725 = 0;

    @OriginalMember(owner = "client!as", name = "t", descriptor = "Ldr;")
    public static class675 field1718 = new class675(13, -1);

    @OriginalMember(owner = "client!as", name = "a", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!as", name = "c", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!as", name = "h", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!as", name = "i", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!as", name = "k", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!as", name = "o", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!as", name = "p", descriptor = "I")
    private int field1714;

    @OriginalMember(owner = "client!as", name = "r", descriptor = "I")
    private int field1716;

    @OriginalMember(owner = "client!as", name = "z", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!as", name = "B", descriptor = "I")
    private int field1726;

    @OriginalMember(owner = "client!as", name = "D", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!as", name = "E", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!as", name = "F", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!as", name = "G", descriptor = "I")
    private int field1731;

    @OriginalMember(owner = "client!as", name = "I", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!as", name = "x", descriptor = "Ll;")
    public class18 field1722;

    @OriginalMember(owner = "client!as", name = "H", descriptor = "Lcu;")
    private class207 field1732;

    @OriginalMember(owner = "client!as", name = "w", descriptor = "Lw;")
    private class279 field1721;

    @OriginalMember(owner = "client!as", name = "v", descriptor = "Lba;")
    private class359 field1720;

    @OriginalMember(owner = "client!as", name = "K", descriptor = "Lq;")
    public static class396 field1735;

    @OriginalMember(owner = "client!as", name = "e", descriptor = "[Z")
    private boolean[] field1703;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Loa;I)V")
    public final void method890(class650 arg0, int arg1) {
        field1730++;
        this.method891(262144, arg0, (byte) -86, this.field1710, true, this.field1723, true);
        int var3 = -123 / ((19 - arg1) / 35);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ILoa;BIZIZ)Lba;")
    public final class359 method891(int arg0, class650 arg1, byte arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        field1713++;
        class687 var8 = class232.field3017.method2358(0, this.field1727);
        if (var8.field9421 != null) {
            var8 = var8.method3800(class327.field4084, (byte) -124);
        }
        if (var8 == null) {
            this.method893(false, arg1);
            this.field1708 = -1;
            this.field1734 = -1;
            this.field1711 = -1;
            return null;
        }
        if (!this.field1702 && this.field1734 != var8.field9408) {
            this.field1720 = null;
            this.method892(-1, -1);
        }
        this.method894(6926, arg3, arg5);
        if (arg6) {
            boolean var9 = arg6 & this.field1715 & class611.field8310.method3598(-15929, class628.field8526) != 0;
            arg6 = var9 & (this.field1711 != var8.field9408 || this.field1732 != null && class611.field8310.method3598(-15929, class628.field8526) >= 2 && (this.field1731 != this.field1708 || (this.field1732.field2426 || class493.field6139) && this.field1731 != this.field1714));
        }
        int var10 = -82 % ((7 - arg2) / 54);
        if (arg4 && !arg6) {
            this.field1734 = var8.field9408;
            return null;
        }
        if (arg6) {
            class350.method2017(this.field1721, this.field1736, this.field1723, this.field1710, this.field1703);
            this.field1711 = -1;
            this.field1708 = -1;
        }
        class140 var11 = class299.field3801[this.field1736];
        class140 var12;
        if (this.field1717) {
            var12 = class252.field3250[0];
        } else {
            var12 = this.field1736 >= 3 ? null : class299.field3801[this.field1736 + 1];
        }
        class359 var13 = null;
        if (this.field1732 != null) {
            if (arg6) {
                arg0 |= 0x40000;
            }
            var13 = var8.method3785(this.field1723, arg1, this.field1726, var11, this.field1710, this.field1719 == 11 ? this.field1705 + 4 : this.field1705, this.field1714, var11.method194(this.field1723, this.field1710), var12, this.field1731, 10, this.field1732, this.field1719 == 11 ? 10 : this.field1719, arg0);
            if (var13 == null) {
                this.field1700 = 0;
                this.field1721 = null;
                this.field1703 = null;
            } else {
                if (arg6) {
                    if (this.field1703 == null) {
                        this.field1703 = new boolean[4];
                    }
                    this.field1721 = var13.method2055(this.field1721);
                    class157.method961(this.field1721, this.field1736, arg5, arg3, this.field1703);
                    this.field1708 = this.field1731;
                    this.field1711 = var8.field9408;
                }
                this.field1700 = var13.method2084();
            }
            this.field1720 = null;
        } else if (this.field1720 != null && arg0 == (arg0 & this.field1720.method2075()) && this.field1734 == var8.field9408) {
            var13 = this.field1720;
        } else {
            if (this.field1720 != null) {
                arg0 |= this.field1720.method2075();
            }
            class180 var14 = var8.method3786(var12, this.field1710, this.field1719 == 11 ? this.field1705 + 4 : this.field1705, true, this.field1723, arg0, var11, var11.method194(this.field1723, this.field1710), this.field1719 == 11 ? 10 : this.field1719, arg6, arg1);
            if (var14 == null) {
                this.field1721 = null;
                this.field1703 = null;
                this.field1720 = null;
                this.field1700 = 0;
            } else {
                var13 = var14.field2119;
                this.field1720 = var14.field2119;
                if (arg6) {
                    this.field1703 = null;
                    this.field1721 = var14.field2118;
                    class157.method961(this.field1721, this.field1736, arg5, arg3, null);
                    this.field1708 = -1;
                    this.field1711 = var8.field9408;
                }
                this.field1700 = var13.method2084();
            }
        }
        this.field1710 = arg3;
        this.field1723 = arg5;
        this.field1734 = var8.field9408;
        return var13;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(II)V")
    private final void method892(int arg0, int arg1) {
        field1706++;
        int var3 = arg0;
        boolean var4 = false;
        if (arg0 == -1) {
            class687 var5 = class232.field3017.method2358(0, this.field1727);
            class687 var6 = var5;
            if (var5.field9421 != null) {
                var5 = var5.method3800(class327.field4084, (byte) -112);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field9406 != null) {
                if (this.field1732 != null && var5.method3792(this.field1732.field2437, -98)) {
                    return;
                }
                var3 = var5.method3795(1068);
                if (this.field1734 != var5.field9408) {
                    var4 = var5.field9403;
                }
            } else if (var5.field9444 == -1) {
                if (var6 != null && var6.field9406 != null) {
                    if (this.field1732 != null && var6.method3792(this.field1732.field2437, -127)) {
                        return;
                    }
                    var3 = var6.method3795(1068);
                    if (this.field1734 != var6.field9408) {
                        var4 = var6.field9403;
                    }
                } else if (var6 != null && var6.field9444 != -1 && this.field1734 != var6.field9408) {
                    var3 = var6.field9444;
                    var4 = var6.field9403;
                }
            } else if (this.field1734 != var5.field9408) {
                var3 = var5.field9444;
                var4 = var5.field9403;
            }
        }
        if (arg1 == var3) {
            this.field1732 = null;
            return;
        }
        this.field1720 = null;
        if (this.field1732 == null || this.field1732.field2437 != var3) {
            this.field1732 = class11.field110.method1141(var3, (byte) 127);
        } else if (this.field1732.field2451 == 0) {
            return;
        }
        if (this.field1732.field2441 == null) {
            this.field1732 = null;
            return;
        }
        if (var4) {
            this.field1731 = (int) (Math.random() * (double) this.field1732.field2441.length);
            this.field1726 = (int) ((double) this.field1732.field2436[this.field1731] * Math.random()) + 1;
        } else {
            this.field1726 = 1;
            this.field1731 = 0;
        }
        this.field1714 = this.field1731 + 1;
        if (this.field1714 < 0 || this.field1732.field2441.length <= this.field1714) {
            this.field1714 = -1;
        }
        this.field1716 = class665.field9027 - this.field1726;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ZLoa;)V")
    public final void method893(boolean arg0, class650 arg1) {
        if (arg0) {
            this.field1723 = -10;
        }
        if (this.field1721 != null) {
            class350.method2017(this.field1721, this.field1736, this.field1723, this.field1710, this.field1703);
            this.field1721 = null;
            this.field1703 = null;
        }
        field1724++;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(III)V")
    private final void method894(int arg0, int arg1, int arg2) {
        field1701++;
        if (arg0 != 6926) {
            this.field1717 = false;
        }
        label90: while (true) {
            if (this.field1732 == null) {
                if (this.field1702) {
                    return;
                }
                this.method892(-1, arg0 ^ -6927);
                if (this.field1732 == null) {
                    return;
                }
            }
            int var4 = class665.field9027 - this.field1716;
            if (var4 > 100 && this.field1732.field2453 > 0) {
                int var5 = this.field1732.field2441.length - this.field1732.field2453;
                while (this.field1731 < var5 && this.field1732.field2436[this.field1731] < var4) {
                    var4 -= this.field1732.field2436[this.field1731];
                    this.field1731++;
                }
                if (var5 <= this.field1731) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field1732.field2441.length; var7++) {
                        var6 += this.field1732.field2436[var7];
                    }
                    var4 %= var6;
                }
                this.field1714 = this.field1731 + 1;
                if (this.field1714 >= this.field1732.field2441.length) {
                    this.field1714 -= this.field1732.field2453;
                    if (this.field1714 < 0 || this.field1714 >= this.field1732.field2441.length) {
                        this.field1714 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field1732.field2436[this.field1731] >= var4) {
                            this.field1716 = class665.field9027 - var4;
                            this.field1726 = var4;
                            return;
                        }
                        class526.method2841(-305539927, this.field1712, this.field1732, false, arg2, this.field1731, arg1);
                        var4 -= this.field1732.field2436[this.field1731];
                        this.field1731++;
                        if (this.field1731 >= this.field1732.field2441.length) {
                            this.field1731 -= this.field1732.field2453;
                            if (this.field1731 < 0 || this.field1732.field2441.length <= this.field1731) {
                                this.field1732 = null;
                                continue label90;
                            }
                        }
                        this.field1714 = this.field1731 + 1;
                    } while (this.field1732.field2441.length > this.field1714);
                    this.field1714 -= this.field1732.field2453;
                } while (this.field1714 >= 0 && this.field1732.field2441.length > this.field1714);
                this.field1714 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!as", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field1733++;
        if (this.field1722 != null) {
            this.field1722.method110();
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)I")
    public final int method895(int arg0) {
        field1729++;
        if (arg0 != 10) {
            this.method894(5, -71, -97);
        }
        return this.field1700;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Lq;ZILba;ILoa;BII)V")
    public final void method896(class396 arg0, boolean arg1, int arg2, class359 arg3, int arg4, class650 arg5, byte arg6, int arg7, int arg8) {
        field1699++;
        class556[] var10 = arg3.method2077();
        if (arg6 != -93) {
            this.field1710 = -57;
        }
        class493[] var11 = arg3.method2063();
        if ((this.field1722 == null || this.field1722.field181) && (var10 != null || var11 != null)) {
            class687 var12 = class232.field3017.method2358(arg6 ^ 0xFFFFFFA3, this.field1727);
            if (var12.field9421 != null) {
                var12 = var12.method3800(class327.field4084, (byte) -64);
            }
            if (var12 != null) {
                this.field1722 = class18.method101(class665.field9027, true);
            }
        }
        if (this.field1722 == null) {
            return;
        }
        arg3.method2067(arg0);
        if (arg1) {
            this.field1722.method111(arg5, (long) class665.field9027, var10, var11, false);
        } else {
            this.field1722.method107((long) class665.field9027);
        }
        this.field1722.method103(this.field1712, arg4, arg2, arg7, arg8);
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(II)V")
    public final void method897(int arg0, int arg1) {
        this.field1702 = true;
        if (arg1 != 5743) {
            this.field1722 = null;
        }
        field1709++;
        this.method892(arg0, -1);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)V")
    public static void method898(boolean arg0) {
        field1704 = null;
        field1718 = null;
        if (!arg0) {
            field1718 = null;
        }
        field1735 = null;
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(I)Z")
    public final boolean method899(int arg0) {
        if (arg0 != -1) {
            this.method897(111, -62);
        }
        field1707++;
        return this.field1715;
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Loa;Lpg;IIIIIIZI)V")
    public class142(class650 arg0, class687 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field1710 = arg7;
        this.field1705 = arg3;
        this.field1736 = (byte) arg5;
        this.field1712 = (byte) arg4;
        this.field1723 = arg6;
        this.field1727 = arg1.field9408;
        this.field1717 = arg8;
        this.field1719 = arg2;
        this.field1715 = arg0.method465() && arg1.field9433 && !this.field1717;
        if (arg9 != -1) {
            this.field1702 = true;
        }
        this.method892(arg9, -1);
    }
}
