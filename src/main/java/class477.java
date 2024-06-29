import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class477 {

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "I")
    private int field6589 = -1;

    @OriginalMember(owner = "client!ql", name = "r", descriptor = "Z")
    private boolean field6591 = false;

    @OriginalMember(owner = "client!ql", name = "B", descriptor = "Z")
    private boolean field6601 = false;

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
    private int field6585 = -1;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
    private int field6579 = -32768;

    @OriginalMember(owner = "client!ql", name = "w", descriptor = "I")
    public int field6596;

    @OriginalMember(owner = "client!ql", name = "F", descriptor = "I")
    private int field6605;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "B")
    private byte field6578;

    @OriginalMember(owner = "client!ql", name = "E", descriptor = "B")
    private byte field6604;

    @OriginalMember(owner = "client!ql", name = "q", descriptor = "I")
    public int field6590;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "I")
    private int field6582;

    @OriginalMember(owner = "client!ql", name = "v", descriptor = "I")
    public int field6595;

    @OriginalMember(owner = "client!ql", name = "A", descriptor = "Z")
    private boolean field6600;

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field6584 = new String[5];

    @OriginalMember(owner = "client!ql", name = "t", descriptor = "[I")
    public static int[] field6593 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    public static int field6575;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
    public static int field6577;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
    private int field6583;

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "I")
    public static int field6586;

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "I")
    private int field6587;

    @OriginalMember(owner = "client!ql", name = "o", descriptor = "I")
    public static int field6588;

    @OriginalMember(owner = "client!ql", name = "s", descriptor = "I")
    public static int field6592;

    @OriginalMember(owner = "client!ql", name = "u", descriptor = "I")
    private int field6594;

    @OriginalMember(owner = "client!ql", name = "x", descriptor = "I")
    public static int field6597;

    @OriginalMember(owner = "client!ql", name = "y", descriptor = "I")
    public static int field6598;

    @OriginalMember(owner = "client!ql", name = "C", descriptor = "I")
    public static int field6602;

    @OriginalMember(owner = "client!ql", name = "D", descriptor = "I")
    public static int field6603;

    @OriginalMember(owner = "client!ql", name = "G", descriptor = "I")
    public static int field6606;

    @OriginalMember(owner = "client!ql", name = "H", descriptor = "I")
    public static int field6607;

    @OriginalMember(owner = "client!ql", name = "I", descriptor = "I")
    private int field6608;

    @OriginalMember(owner = "client!ql", name = "J", descriptor = "I")
    public static int field6609;

    @OriginalMember(owner = "client!ql", name = "M", descriptor = "I")
    public static int field6612;

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "Lui;")
    public static class138 field6580;

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "Lnb;")
    private class181 field6581;

    @OriginalMember(owner = "client!ql", name = "z", descriptor = "Lpp;")
    public static class245 field6599;

    @OriginalMember(owner = "client!ql", name = "K", descriptor = "Loh;")
    public class256 field6610;

    @OriginalMember(owner = "client!ql", name = "L", descriptor = "Lkb;")
    private class449 field6611;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "Lgn;")
    private class456 field6574;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "[Z")
    private boolean[] field6576;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(BI)I")
    public static final int method2784(byte arg0, int arg1) {
        field6586++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 0x10;
        }
        if (arg0 < 72) {
            method2784((byte) 41, -28);
        }
        if (arg1 >= 256) {
            arg1 >>>= 0x8;
            var2 += 8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg1 >= 1) {
            var2++;
            arg1 >>>= 0x1;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lwm;I)V")
    public final void method2785(class364 arg0, int arg1) {
        if (arg1 != -27576) {
            this.method2789(-77, -67);
        }
        this.method2796(true, true, arg0, 131072, this.field6605, this.field6582, (byte) -113);
        field6588++;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(III)Z")
    public static final boolean method2786(int arg0, int arg1, int arg2) {
        field6603++;
        if (arg2 == 11) {
            arg2 = 10;
        }
        class88 var3 = class1.field23.method935(arg1, (byte) -63);
        if (arg2 >= arg0 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method562(arg0 ^ 0x8C5F9246, arg2);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IB)V")
    private final void method2787(int arg0, byte arg1) {
        field6575++;
        if (arg1 <= 85) {
            return;
        }
        int var3 = arg0;
        boolean var4 = false;
        if (arg0 == -1) {
            class88 var5 = class1.field23.method935(this.field6595, (byte) 113);
            class88 var6 = var5;
            if (var5.field1269 != null) {
                var5 = var5.method574(-5, class38.field562);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field1270 != null) {
                if (this.field6581 != null && var5.method572(27, this.field6581.field2477)) {
                    return;
                }
                var3 = var5.method568((byte) -115);
                if (this.field6589 != var5.field1298) {
                    var4 = var5.field1301;
                }
            } else if (var5.field1248 == -1) {
                if (var6 != null && var6.field1270 != null) {
                    if (this.field6581 != null && var6.method572(27, this.field6581.field2477)) {
                        return;
                    }
                    var3 = var6.method568((byte) -87);
                    if (this.field6589 != var6.field1298) {
                        var4 = var6.field1301;
                    }
                } else if (var6 != null && var6.field1248 != -1 && this.field6589 != var6.field1298) {
                    var4 = var6.field1301;
                    var3 = var6.field1248;
                }
            } else if (this.field6589 != var5.field1298) {
                var3 = var5.field1248;
                var4 = var5.field1301;
            }
        }
        if (var3 == -1) {
            this.field6581 = null;
            return;
        }
        this.field6574 = null;
        if (this.field6581 == null || this.field6581.field2477 != var3) {
            this.field6581 = class395.field5477.method266(16107, var3);
        } else if (this.field6581.field2470 == 0) {
            return;
        }
        if (this.field6581.field2468 == null) {
            this.field6581 = null;
            return;
        }
        if (var4) {
            this.field6587 = (int) ((double) this.field6581.field2468.length * Math.random());
            this.field6594 = (int) ((double) this.field6581.field2466[this.field6587] * Math.random()) + 1;
        } else {
            this.field6587 = 0;
            this.field6594 = 1;
        }
        this.field6583 = this.field6587 + 1;
        if (this.field6583 < 0 || this.field6583 >= this.field6581.field2468.length) {
            this.field6583 = -1;
        }
        this.field6608 = class70.field968 - this.field6594;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIB)V")
    private final void method2788(int arg0, int arg1, byte arg2) {
        if (arg2 != 22) {
            field6599 = null;
        }
        field6597++;
        label92: while (true) {
            if (this.field6581 == null) {
                if (this.field6591) {
                    return;
                }
                this.method2787(-1, (byte) 103);
                if (this.field6581 == null) {
                    return;
                }
            }
            int var4 = class70.field968 - this.field6608;
            if (var4 > 100 && this.field6581.field2481 > 0) {
                int var5 = this.field6581.field2468.length - this.field6581.field2481;
                while (this.field6587 < var5 && this.field6581.field2466[this.field6587] < var4) {
                    var4 -= this.field6581.field2466[this.field6587];
                    this.field6587++;
                }
                if (this.field6587 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field6581.field2468.length; var7++) {
                        var6 += this.field6581.field2466[var7];
                    }
                    var4 %= var6;
                }
                this.field6583 = this.field6587 + 1;
                if (this.field6583 >= this.field6581.field2468.length) {
                    this.field6583 -= this.field6581.field2481;
                    if (this.field6583 < 0 || this.field6583 >= this.field6581.field2468.length) {
                        this.field6583 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field6581.field2466[this.field6587] >= var4) {
                            this.field6594 = var4;
                            this.field6608 = class70.field968 - var4;
                            return;
                        }
                        class402.method2437(this.field6581, false, this.field6604, arg2 - 138, arg0, arg1, this.field6587);
                        var4 -= this.field6581.field2466[this.field6587];
                        this.field6587++;
                        if (this.field6587 >= this.field6581.field2468.length) {
                            this.field6587 -= this.field6581.field2481;
                            if (this.field6587 < 0 || this.field6587 >= this.field6581.field2468.length) {
                                this.field6581 = null;
                                continue label92;
                            }
                        }
                        this.field6583 = this.field6587 + 1;
                    } while (this.field6583 < this.field6581.field2468.length);
                    this.field6583 -= this.field6581.field2481;
                } while (this.field6583 >= 0 && this.field6581.field2468.length > this.field6583);
                this.field6583 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)V")
    public final void method2789(int arg0, int arg1) {
        field6606++;
        int var3 = 93 / ((arg0 + 15) / 46);
        this.field6591 = true;
        this.method2787(arg1, (byte) 121);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lwm;ILgn;IIZBI)V")
    public final void method2790(class364 arg0, int arg1, class456 arg2, int arg3, int arg4, boolean arg5, byte arg6, int arg7) {
        field6607++;
        class130[] var9 = arg2.method1839();
        class304[] var10 = arg2.method1845();
        if ((this.field6610 == null || this.field6610.field3394) && (var9 != null || var10 != null)) {
            class88 var11 = class1.field23.method935(this.field6595, (byte) 101);
            if (var11.field1269 != null) {
                var11 = var11.method574(-123, class38.field562);
            }
            if (var11 != null) {
                this.field6610 = new class256(class70.field968);
            }
        }
        int var12 = 101 % ((-arg6 - 51) / 49);
        if (this.field6610 == null) {
            return;
        }
        if (arg5) {
            this.field6610.method1440(arg0, (long) class70.field968, var9, var10, false);
        } else {
            this.field6610.method1438((long) class70.field968);
        }
        this.field6610.method1444(this.field6604, arg3, arg7, arg1, arg4);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)I")
    public final int method2791(byte arg0) {
        if (arg0 == -38) {
            field6612++;
            return this.field6579;
        } else {
            return -65;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V")
    public static void method2792(int arg0) {
        field6593 = null;
        field6599 = null;
        field6580 = null;
        field6584 = null;
        if (arg0 != 10672) {
            method2792(28);
        }
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)Z")
    public final boolean method2793(int arg0) {
        int var2 = -50 / ((6 - arg0) / 60);
        field6609++;
        return this.field6600;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lnk;IIB)V")
    public static final void method2794(class464 arg0, int arg1, int arg2, byte arg3) {
        field6592++;
        if (arg0.field6426 == 0) {
            arg0.field6323 = arg0.field6310;
        } else if (arg0.field6426 == 1) {
            arg0.field6323 = (arg2 - arg0.field6340) / 2 + arg0.field6310;
        } else if (arg0.field6426 == 2) {
            arg0.field6323 = arg2 - arg0.field6340 - arg0.field6310;
        } else if (arg0.field6426 == 3) {
            arg0.field6323 = arg0.field6310 * arg2 >> 14;
        } else if (arg0.field6426 == 4) {
            arg0.field6323 = (arg0.field6310 * arg2 >> 14) + (arg2 - arg0.field6340) / 2;
        } else {
            arg0.field6323 = arg2 - (arg0.field6310 * arg2 >> 14) - arg0.field6340;
        }
        if (arg0.field6407 == 0) {
            arg0.field6412 = arg0.field6298;
        } else if (arg0.field6407 == 1) {
            arg0.field6412 = (arg1 - arg0.field6308) / 2 + arg0.field6298;
        } else if (arg0.field6407 == 2) {
            arg0.field6412 = arg1 - arg0.field6298 - arg0.field6308;
        } else if (arg0.field6407 == 3) {
            arg0.field6412 = arg0.field6298 * arg1 >> 14;
        } else if (arg0.field6407 == 4) {
            arg0.field6412 = (arg0.field6298 * arg1 >> 14) + (arg1 - arg0.field6308) / 2;
        } else {
            arg0.field6412 = arg1 - (arg0.field6298 * arg1 >> 14) - arg0.field6308;
        }
        if (arg3 != -100 || !class200.field2704) {
            return;
        }
        if (client.method1046(arg0).field2954 == 0 && arg0.field6358 != 0) {
            return;
        }
        if (arg0.field6323 < 0) {
            arg0.field6323 = 0;
        } else if (arg0.field6340 + arg0.field6323 > arg2) {
            arg0.field6323 = arg2 - arg0.field6340;
        }
        if (arg0.field6412 < 0) {
            arg0.field6412 = 0;
            return;
        }
        if ((arg0.field6412 + arg0.field6308) > arg1) {
            arg0.field6412 = arg1 - arg0.field6308;
            return;
        }
    }

    @OriginalMember(owner = "client!ql", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field6602++;
        if (this.field6610 != null) {
            this.field6610.method1437();
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILwm;)V")
    public final void method2795(int arg0, class364 arg1) {
        if (this.field6611 != null) {
            class318.method1742(this.field6611, this.field6578, this.field6582, this.field6605, this.field6576);
            this.field6611 = null;
            this.field6576 = null;
        }
        field6598++;
        if (arg0 < 49) {
            this.method2785((class364) null, -57);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZZLwm;IIIB)Lgn;")
    public final class456 method2796(boolean arg0, boolean arg1, class364 arg2, int arg3, int arg4, int arg5, byte arg6) {
        field6577++;
        class88 var8 = class1.field23.method935(this.field6595, (byte) 83);
        if (var8.field1269 != null) {
            var8 = var8.method574(-114, class38.field562);
        }
        if (var8 == null) {
            this.method2795(69, arg2);
            this.field6589 = -1;
            this.field6585 = this.field6587;
            return null;
        }
        if (!this.field6591 && this.field6589 != var8.field1298) {
            this.field6574 = null;
            this.method2787(-1, (byte) 112);
        }
        this.method2788(arg5, arg4, (byte) 22);
        if (arg6 > -112) {
            this.field6589 = 75;
        }
        boolean var9 = arg0 & this.field6600 & class488.field6789.field6682 != 0;
        boolean var10 = var9 & (this.field6589 != var8.field1298 || (this.field6587 != this.field6585 || this.field6581 != null && (this.field6581.field2485 || class293.field3917) && this.field6587 != this.field6583) && class488.field6789.field6682 >= 2);
        if (arg1 && !var10) {
            this.field6589 = var8.field1298;
            this.field6585 = this.field6587;
            return null;
        }
        if (var10) {
            class318.method1742(this.field6611, this.field6578, this.field6582, this.field6605, this.field6576);
        }
        class177 var11 = class221.field2945[this.field6578];
        class177 var12;
        if (this.field6601) {
            var12 = class289.field3896[0];
        } else {
            var12 = this.field6578 < 3 ? class221.field2945[this.field6578 + 1] : null;
        }
        class456 var13 = null;
        if (this.field6581 != null) {
            if (var10) {
                arg3 |= 0x20000;
            }
            var13 = var8.method559(this.field6583, this.field6594, var11, this.field6596 == 11 ? 10 : this.field6596, -102, this.field6581, this.field6596 == 11 ? this.field6590 + 4 : this.field6590, arg2, this.field6587, var12, var11.method368(this.field6582, this.field6605), this.field6582, this.field6605, arg3);
            if (var13 == null) {
                this.field6579 = 0;
                this.field6576 = null;
                this.field6611 = null;
            } else {
                if (var10) {
                    if (this.field6576 == null) {
                        this.field6576 = new boolean[4];
                    }
                    this.field6611 = var13.method1879(this.field6611);
                    class252.method1412(this.field6611, this.field6578, arg5, arg4, this.field6576);
                }
                this.field6579 = var13.method1871();
            }
            this.field6574 = null;
        } else if (this.field6574 != null && arg3 == (arg3 & this.field6574.method1863()) && this.field6589 == var8.field1298) {
            var13 = this.field6574;
        } else {
            if (this.field6574 != null) {
                arg3 |= this.field6574.method1863();
            }
            class266 var14 = var8.method560(var11.method368(this.field6582, this.field6605), var11, this.field6596 == 11 ? this.field6590 + 4 : this.field6590, this.field6605, this.field6582, false, arg3, var10, arg2, var12, this.field6596 == 11 ? 10 : this.field6596);
            if (var14 == null) {
                this.field6611 = null;
                this.field6579 = 0;
                this.field6576 = null;
                this.field6574 = null;
            } else {
                var13 = var14.field3514;
                this.field6574 = var14.field3514;
                if (var10) {
                    this.field6576 = null;
                    this.field6611 = var14.field3512;
                    class252.method1412(this.field6611, this.field6578, arg5, arg4, (boolean[]) null);
                }
                this.field6579 = var13.method1871();
            }
        }
        this.field6589 = var8.field1298;
        this.field6605 = arg4;
        this.field6585 = this.field6587;
        this.field6582 = arg5;
        return var13;
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lwm;Lct;IIIIIIZI)V")
    public class477(class364 arg0, class88 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field6596 = arg2;
        this.field6605 = arg7;
        this.field6601 = arg8;
        this.field6578 = (byte) arg5;
        this.field6604 = (byte) arg4;
        this.field6590 = arg3;
        this.field6582 = arg6;
        this.field6595 = arg1.field1298;
        this.field6600 = arg0.method2011() && arg1.field1264 && !this.field6601;
        if (arg9 != -1) {
            this.field6591 = true;
        }
        this.method2787(arg9, (byte) 95);
    }
}
