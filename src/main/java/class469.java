import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class469 {

    @OriginalMember(owner = "client!el", name = "s", descriptor = "Z")
    private boolean field6613 = false;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "Z")
    private boolean field6611 = false;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    private int field6603 = -1;

    @OriginalMember(owner = "client!el", name = "C", descriptor = "I")
    private int field6623 = -1;

    @OriginalMember(owner = "client!el", name = "J", descriptor = "I")
    private int field6630 = -32768;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "I")
    private int field6605;

    @OriginalMember(owner = "client!el", name = "H", descriptor = "I")
    public int field6628;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    private int field6596;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public int field6595;

    @OriginalMember(owner = "client!el", name = "B", descriptor = "B")
    private byte field6622;

    @OriginalMember(owner = "client!el", name = "u", descriptor = "I")
    public int field6615;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "B")
    private byte field6599;

    @OriginalMember(owner = "client!el", name = "z", descriptor = "Z")
    private boolean field6620;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "Llu;")
    public static class610 field6612 = new class610(19, 8);

    @OriginalMember(owner = "client!el", name = "D", descriptor = "Lbn;")
    public static class378 field6624 = new class378(14, 6);

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    private int field6598;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    private int field6600;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    public static int field6601;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    public static int field6602;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "I")
    public static int field6604;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "I")
    public static int field6606;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "I")
    public static int field6609;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "I")
    public static int field6610;

    @OriginalMember(owner = "client!el", name = "t", descriptor = "I")
    public static int field6614;

    @OriginalMember(owner = "client!el", name = "v", descriptor = "I")
    public static int field6616;

    @OriginalMember(owner = "client!el", name = "w", descriptor = "I")
    public static int field6617;

    @OriginalMember(owner = "client!el", name = "y", descriptor = "I")
    private int field6619;

    @OriginalMember(owner = "client!el", name = "A", descriptor = "I")
    public static int field6621;

    @OriginalMember(owner = "client!el", name = "E", descriptor = "I")
    public static int field6625;

    @OriginalMember(owner = "client!el", name = "F", descriptor = "I")
    public static int field6626;

    @OriginalMember(owner = "client!el", name = "G", descriptor = "I")
    private int field6627;

    @OriginalMember(owner = "client!el", name = "I", descriptor = "Lr;")
    private class159 field6629;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "Ldea;")
    public class206 field6607;

    @OriginalMember(owner = "client!el", name = "x", descriptor = "Lk;")
    private class485 field6618;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "Ltt;")
    private class78 field6597;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "[Z")
    private boolean[] field6608;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)I")
    public final int method2826(byte arg0) {
        field6625++;
        if (arg0 != -105) {
            this.method2827(-29, (byte) -31, 125);
        }
        return this.field6630;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IBI)V")
    private final void method2827(int arg0, byte arg1, int arg2) {
        if (arg1 < 6) {
            this.method2835(-125, 27);
        }
        field6604++;
        label92: while (true) {
            if (this.field6597 == null) {
                if (this.field6611) {
                    return;
                }
                this.method2835(-79, -1);
                if (this.field6597 == null) {
                    return;
                }
            }
            int var4 = class617.field9123 - this.field6598;
            if (var4 > 100 && this.field6597.field1046 > 0) {
                int var5 = this.field6597.field1035.length - this.field6597.field1046;
                while (var5 > this.field6627 && var4 > this.field6597.field1049[this.field6627]) {
                    var4 -= this.field6597.field1049[this.field6627];
                    this.field6627++;
                }
                if (var5 <= this.field6627) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field6597.field1035.length; var7++) {
                        var6 += this.field6597.field1049[var7];
                    }
                    var4 %= var6;
                }
                this.field6600 = this.field6627 + 1;
                if (this.field6597.field1035.length <= this.field6600) {
                    this.field6600 -= this.field6597.field1046;
                    if (this.field6600 < 0 || this.field6600 >= this.field6597.field1035.length) {
                        this.field6600 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var4 <= this.field6597.field1049[this.field6627]) {
                            this.field6619 = var4;
                            this.field6598 = class617.field9123 - var4;
                            return;
                        }
                        class163.method1179(-1721201176, arg0, this.field6597, false, this.field6599, arg2, this.field6627);
                        var4 -= this.field6597.field1049[this.field6627];
                        this.field6627++;
                        if (this.field6627 >= this.field6597.field1035.length) {
                            this.field6627 -= this.field6597.field1046;
                            if (this.field6627 < 0 || this.field6597.field1035.length <= this.field6627) {
                                this.field6597 = null;
                                continue label92;
                            }
                        }
                        this.field6600 = this.field6627 + 1;
                    } while (this.field6597.field1035.length > this.field6600);
                    this.field6600 -= this.field6597.field1046;
                } while (this.field6600 >= 0 && this.field6597.field1035.length > this.field6600);
                this.field6600 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BZIILqa;IZ)Lr;")
    public final class159 method2828(byte arg0, boolean arg1, int arg2, int arg3, class208 arg4, int arg5, boolean arg6) {
        field6621++;
        class145 var8 = class216.field3172.method1505(-24044, this.field6615);
        if (var8.field2028 != null) {
            var8 = var8.method991(class556.field8280, true);
        }
        if (var8 == null) {
            this.method2834(arg4, -21701);
            this.field6603 = this.field6627;
            this.field6623 = -1;
            return null;
        }
        if (!this.field6611 && this.field6623 != var8.field2049) {
            this.field6629 = null;
            this.method2835(-80, -1);
        }
        this.method2827(arg3, (byte) 7, arg2);
        boolean var9 = arg6 & this.field6620 & class56.field668.method2897(class526.field7533, 6373) != 0;
        boolean var10 = var9 & (this.field6623 != var8.field2049 || (this.field6627 != this.field6603 || this.field6597 != null && (this.field6597.field1045 || class638.field9309) && this.field6627 != this.field6600) && class56.field668.method2897(class526.field7533, 6373) >= 2);
        if (arg1 && !var10) {
            this.field6623 = var8.field2049;
            this.field6603 = this.field6627;
            return null;
        }
        if (var10) {
            class46.method290(this.field6618, this.field6622, this.field6605, this.field6596, this.field6608);
        }
        class176 var11 = class165.field2609[this.field6622];
        if (arg0 < 27) {
            return null;
        }
        class176 var12;
        if (this.field6613) {
            var12 = class207.field3077[0];
        } else {
            var12 = this.field6622 < 3 ? class165.field2609[this.field6622 + 1] : null;
        }
        class159 var13 = null;
        if (this.field6597 != null) {
            if (var10) {
                arg5 |= 0x40000;
            }
            var13 = var8.method995(this.field6627, var12, this.field6596, -28523, var11.method1233(this.field6605, this.field6596), this.field6605, var11, this.field6597, this.field6600, this.field6619, this.field6628 == 11 ? 10 : this.field6628, arg4, this.field6628 == 11 ? this.field6595 + 4 : this.field6595, arg5);
            if (var13 == null) {
                this.field6618 = null;
                this.field6630 = 0;
                this.field6608 = null;
            } else {
                if (var10) {
                    if (this.field6608 == null) {
                        this.field6608 = new boolean[4];
                    }
                    this.field6618 = var13.method92(this.field6618);
                    class377.method2253(this.field6618, this.field6622, arg3, arg2, this.field6608);
                }
                this.field6630 = var13.method86();
            }
            this.field6629 = null;
        } else if (this.field6629 != null && (arg5 & this.field6629.method90()) == arg5 && this.field6623 == var8.field2049) {
            var13 = this.field6629;
        } else {
            if (this.field6629 != null) {
                arg5 |= this.field6629.method90();
            }
            class429 var14 = var8.method997(this.field6605, this.field6628 == 11 ? 10 : this.field6628, -81, var10, arg5, this.field6596, var12, var11, this.field6628 == 11 ? this.field6595 + 4 : this.field6595, arg4, var11.method1233(this.field6605, this.field6596));
            if (var14 == null) {
                this.field6618 = null;
                this.field6629 = null;
                this.field6608 = null;
                this.field6630 = 0;
            } else {
                var13 = var14.field5765;
                this.field6629 = var14.field5765;
                if (var10) {
                    this.field6608 = null;
                    this.field6618 = var14.field5763;
                    class377.method2253(this.field6618, this.field6622, arg3, arg2, null);
                }
                this.field6630 = var13.method86();
            }
        }
        this.field6603 = this.field6627;
        this.field6605 = arg3;
        this.field6623 = var8.field2049;
        this.field6596 = arg2;
        return var13;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IZLqa;IBLr;II)V")
    public final void method2829(int arg0, boolean arg1, class208 arg2, int arg3, byte arg4, class159 arg5, int arg6, int arg7) {
        field6616++;
        class450[] var9 = arg5.method60();
        class506[] var10 = arg5.method57();
        if ((this.field6607 == null || this.field6607.field3059) && (var9 != null || var10 != null)) {
            class145 var11 = class216.field3172.method1505(-24044, this.field6615);
            if (var11.field2028 != null) {
                var11 = var11.method991(class556.field8280, true);
            }
            if (var11 != null) {
                this.field6607 = class206.method1358(class617.field9123);
            }
        }
        if (arg4 < 32) {
            this.field6620 = true;
        }
        if (this.field6607 == null) {
            return;
        }
        if (arg1) {
            this.field6607.method1366(arg2, (long) class617.field9123, var9, var10, false);
        } else {
            this.field6607.method1367((long) class617.field9123);
        }
        this.field6607.method1360(this.field6599, arg7, arg6, arg0, arg3);
    }

    @OriginalMember(owner = "client!el", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field6602++;
        if (this.field6607 != null) {
            this.field6607.method1368();
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
    public static void method2830(int arg0) {
        if (arg0 == 262144) {
            field6624 = null;
            field6612 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(B)Z")
    public final boolean method2831(byte arg0) {
        field6609++;
        if (arg0 <= 85) {
            this.field6596 = 99;
        }
        return this.field6620;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II)V")
    public static final void method2832(int arg0, int arg1) {
        field6610++;
        if (class378.field5211 == 1) {
            class347.field4758 = arg1;
        } else if (class378.field5211 == 2 || class378.field5211 == 3) {
            class43.field501 = arg1;
        }
        if (arg0 > -37) {
            field6624 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(II)V")
    public final void method2833(int arg0, int arg1) {
        this.field6611 = true;
        if (arg1 == -1) {
            field6601++;
            this.method2835(122, arg0);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lqa;I)V")
    public final void method2834(class208 arg0, int arg1) {
        if (this.field6618 != null) {
            class46.method290(this.field6618, this.field6622, this.field6605, this.field6596, this.field6608);
            this.field6618 = null;
            this.field6608 = null;
        }
        if (arg1 == -21701) {
            field6606++;
        }
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(II)V")
    private final void method2835(int arg0, int arg1) {
        field6614++;
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class145 var5 = class216.field3172.method1505(-24044, this.field6615);
            class145 var6 = var5;
            if (var5.field2028 != null) {
                var5 = var5.method991(class556.field8280, true);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field2104 != null) {
                if (this.field6597 != null && var5.method986(this.field6597.field1050, -80)) {
                    return;
                }
                var3 = var5.method980((byte) 118);
                if (this.field6623 != var5.field2049) {
                    var4 = var5.field2109;
                }
            } else if (var5.field2031 == -1) {
                if (var6 != null && var6.field2104 != null) {
                    if (this.field6597 != null && var6.method986(this.field6597.field1050, -97)) {
                        return;
                    }
                    var3 = var6.method980((byte) 122);
                    if (this.field6623 != var6.field2049) {
                        var4 = var6.field2109;
                    }
                } else if (var6 != null && var6.field2031 != -1 && this.field6623 != var6.field2049) {
                    var3 = var6.field2031;
                    var4 = var6.field2109;
                }
            } else if (this.field6623 != var5.field2049) {
                var4 = var5.field2109;
                var3 = var5.field2031;
            }
        }
        int var7 = -15 % ((42 - arg0) / 37);
        if (var3 == -1) {
            this.field6597 = null;
            return;
        }
        this.field6629 = null;
        if (this.field6597 == null || this.field6597.field1050 != var3) {
            this.field6597 = class463.field6521.method2983(var3, -118);
        } else if (this.field6597.field1056 == 0) {
            return;
        }
        if (this.field6597.field1035 == null) {
            this.field6597 = null;
            return;
        }
        if (var4) {
            this.field6627 = (int) (Math.random() * (double) this.field6597.field1035.length);
            this.field6619 = (int) ((double) this.field6597.field1049[this.field6627] * Math.random()) + 1;
        } else {
            this.field6627 = 0;
            this.field6619 = 1;
        }
        this.field6600 = this.field6627 + 1;
        if (this.field6600 < 0 || this.field6597.field1035.length <= this.field6600) {
            this.field6600 = -1;
        }
        this.field6598 = class617.field9123 - this.field6619;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(Lqa;I)V")
    public final void method2836(class208 arg0, int arg1) {
        this.method2828((byte) 64, true, this.field6596, this.field6605, arg0, 262144, true);
        field6626++;
        if (arg1 >= -88) {
            this.finalize();
        }
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lqa;Luh;IIIIIIZI)V")
    public class469(class208 arg0, class145 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field6605 = arg6;
        this.field6628 = arg2;
        this.field6596 = arg7;
        this.field6595 = arg3;
        this.field6622 = (byte) arg5;
        this.field6615 = arg1.field2049;
        this.field6613 = arg8;
        this.field6599 = (byte) arg4;
        this.field6620 = arg0.method457() && arg1.field2084 && !this.field6613;
        if (arg9 != -1) {
            this.field6611 = true;
        }
        this.method2835(-16, arg9);
    }
}
