import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class238 {

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "I")
    private int field3441 = -1;

    @OriginalMember(owner = "client!ws", name = "n", descriptor = "Z")
    private boolean field3454 = false;

    @OriginalMember(owner = "client!ws", name = "v", descriptor = "I")
    private int field3462 = -1;

    @OriginalMember(owner = "client!ws", name = "r", descriptor = "Z")
    private boolean field3458 = false;

    @OriginalMember(owner = "client!ws", name = "B", descriptor = "I")
    private int field3468 = -32768;

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "B")
    private byte field3444;

    @OriginalMember(owner = "client!ws", name = "D", descriptor = "I")
    private int field3470;

    @OriginalMember(owner = "client!ws", name = "C", descriptor = "I")
    public int field3469;

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "I")
    private int field3442;

    @OriginalMember(owner = "client!ws", name = "I", descriptor = "B")
    private byte field3475;

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "I")
    public int field3443;

    @OriginalMember(owner = "client!ws", name = "A", descriptor = "I")
    public int field3467;

    @OriginalMember(owner = "client!ws", name = "w", descriptor = "Z")
    private boolean field3463;

    @OriginalMember(owner = "client!ws", name = "m", descriptor = "I")
    public static int field3453 = 1;

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "I")
    private int field3445;

    @OriginalMember(owner = "client!ws", name = "g", descriptor = "I")
    private int field3447;

    @OriginalMember(owner = "client!ws", name = "h", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!ws", name = "i", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!ws", name = "j", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!ws", name = "k", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!ws", name = "l", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!ws", name = "q", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!ws", name = "s", descriptor = "I")
    private int field3459;

    @OriginalMember(owner = "client!ws", name = "t", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!ws", name = "x", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!ws", name = "y", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!ws", name = "z", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!ws", name = "F", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!ws", name = "H", descriptor = "I")
    private int field3474;

    @OriginalMember(owner = "client!ws", name = "p", descriptor = "Lc;")
    private class121 field3456;

    @OriginalMember(owner = "client!ws", name = "o", descriptor = "Lrb;")
    public class234 field3455;

    @OriginalMember(owner = "client!ws", name = "u", descriptor = "Ldn;")
    private class357 field3461;

    @OriginalMember(owner = "client!ws", name = "E", descriptor = "Lj;")
    private class377 field3471;

    @OriginalMember(owner = "client!ws", name = "f", descriptor = "Lclient;")
    public static client field3446;

    @OriginalMember(owner = "client!ws", name = "G", descriptor = "[Z")
    private boolean[] field3473;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)V", line = 6)
    private final void method1541(int arg0, int arg1) {
        field3448++;
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class510 var5 = class246.field3567.method609(107, this.field3469);
            class510 var6 = var5;
            if (var5.field7497 != null) {
                var5 = var5.method3027(class526.field7733, -12889);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field7468 != null) {
                if (this.field3461 != null && var5.method3023(this.field3461.field5403, (byte) -11)) {
                    return;
                }
                var3 = var5.method3028((byte) 103);
                if (this.field3462 != var5.field7483) {
                    var4 = var5.field7479;
                }
            } else if (var5.field7505 == -1) {
                if (var6 != null && var6.field7468 != null) {
                    if (this.field3461 != null && var6.method3023(this.field3461.field5403, (byte) -13)) {
                        return;
                    }
                    var3 = var6.method3028((byte) 80);
                    if (this.field3462 != var6.field7483) {
                        var4 = var6.field7479;
                    }
                } else if (var6 != null && var6.field7505 != -1 && this.field3462 != var6.field7483) {
                    var4 = var6.field7479;
                    var3 = var6.field7505;
                }
            } else if (this.field3462 != var5.field7483) {
                var4 = var5.field7479;
                var3 = var5.field7505;
            }
        }
        if (var3 == -1) {
            this.field3461 = null;
            return;
        }
        this.field3456 = null;
        if (this.field3461 == null || this.field3461.field5403 != var3) {
            this.field3461 = class311.field4455.method1233(true, var3);
        } else if (this.field3461.field5404 == 0) {
            return;
        }
        if (arg0 < 35) {
            this.field3467 = 111;
        }
        if (this.field3461.field5395 == null) {
            this.field3461 = null;
            return;
        }
        if (var4) {
            this.field3445 = (int) (Math.random() * (double) this.field3461.field5395.length);
            this.field3474 = (int) ((double) this.field3461.field5408[this.field3445] * Math.random()) + 1;
        } else {
            this.field3445 = 0;
            this.field3474 = 1;
        }
        this.field3459 = this.field3445 + 1;
        if (this.field3459 < 0 || this.field3461.field5395.length <= this.field3459) {
            this.field3459 = -1;
        }
        this.field3447 = class180.field2734 - this.field3474;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lqa;Z)V", line = 131)
    public final void method1542(class162 arg0, boolean arg1) {
        field3449++;
        this.method1549(this.field3470, 116, this.field3442, true, arg0, 262144, arg1);
    }

    @OriginalMember(owner = "client!ws", name = "finalize", descriptor = "()V", line = 139)
    protected final void finalize() {
        if (this.field3455 != null) {
            this.field3455.method1528();
        }
        field3472++;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;", line = 150)
    public static final String method1543(byte arg0, String arg1) {
        if (arg0 != -112) {
            field3446 = null;
        }
        field3464++;
        String var2 = class223.method1471(class358.method2309(arg1, (byte) -83), (byte) -8);
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(ILqa;)V", line = 175)
    public final void method1544(int arg0, class162 arg1) {
        if (this.field3471 != null) {
            class393.method2457(this.field3471, this.field3444, this.field3442, this.field3470, this.field3473);
            this.field3473 = null;
            this.field3471 = null;
        }
        if (arg0 != 0) {
            this.field3458 = false;
        }
        field3466++;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)Z", line = 193)
    public final boolean method1545(int arg0) {
        if (arg0 == -21741) {
            field3465++;
            return this.field3463;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lqa;Lbo;IIIIIIZI)V", line = 535)
    public class238(class162 arg0, class510 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field3444 = (byte) arg5;
        this.field3458 = arg8;
        this.field3470 = arg7;
        this.field3469 = arg1.field7483;
        this.field3442 = arg6;
        this.field3475 = (byte) arg4;
        this.field3443 = arg2;
        this.field3467 = arg3;
        this.field3463 = arg0.method481() && arg1.field7489 && !this.field3458;
        if (arg9 != -1) {
            this.field3454 = true;
        }
        this.method1541(121, arg9);
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(I)I", line = 208)
    public final int method1546(int arg0) {
        field3460++;
        if (arg0 != -26616) {
            this.field3456 = null;
        }
        return this.field3468;
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(II)V", line = 237)
    public final void method1547(int arg0, int arg1) {
        field3452++;
        this.field3454 = true;
        if (arg1 < 63) {
            this.field3467 = 102;
        }
        this.method1541(117, arg0);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(III)V", line = 254)
    private final void method1548(int arg0, int arg1, int arg2) {
        field3451++;
        if (arg1 != -15520) {
            method1550((byte) -125);
        }
        label90: while (true) {
            if (this.field3461 == null) {
                if (this.field3454) {
                    return;
                }
                this.method1541(arg1 ^ 0xFFFFC30D, -1);
                if (this.field3461 == null) {
                    return;
                }
            }
            int var4 = class180.field2734 - this.field3447;
            if (var4 > 100 && this.field3461.field5402 > 0) {
                int var5 = this.field3461.field5395.length - this.field3461.field5402;
                while (var5 > this.field3445 && this.field3461.field5408[this.field3445] < var4) {
                    var4 -= this.field3461.field5408[this.field3445];
                    this.field3445++;
                }
                if (var5 <= this.field3445) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field3461.field5395.length; var7++) {
                        var6 += this.field3461.field5408[var7];
                    }
                    var4 %= var6;
                }
                this.field3459 = this.field3445 + 1;
                if (this.field3461.field5395.length <= this.field3459) {
                    this.field3459 -= this.field3461.field5402;
                    if (this.field3459 < 0 || this.field3461.field5395.length <= this.field3459) {
                        this.field3459 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var4 <= this.field3461.field5408[this.field3445]) {
                            this.field3447 = class180.field2734 - var4;
                            this.field3474 = var4;
                            return;
                        }
                        class435.method2635(this.field3475, 232, arg0, this.field3445, this.field3461, false, arg2);
                        var4 -= this.field3461.field5408[this.field3445];
                        this.field3445++;
                        if (this.field3461.field5395.length <= this.field3445) {
                            this.field3445 -= this.field3461.field5402;
                            if (this.field3445 < 0 || this.field3461.field5395.length <= this.field3445) {
                                this.field3461 = null;
                                continue label90;
                            }
                        }
                        this.field3459 = this.field3445 + 1;
                    } while (this.field3459 < this.field3461.field5395.length);
                    this.field3459 -= this.field3461.field5402;
                } while (this.field3459 >= 0 && this.field3459 < this.field3461.field5395.length);
                this.field3459 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIIZLqa;IZ)Lc;", line = 352)
    public final class121 method1549(int arg0, int arg1, int arg2, boolean arg3, class162 arg4, int arg5, boolean arg6) {
        field3457++;
        class510 var8 = class246.field3567.method609(110, this.field3469);
        if (var8.field7497 != null) {
            var8 = var8.method3027(class526.field7733, -12889);
        }
        if (var8 == null) {
            this.method1544(0, arg4);
            this.field3462 = -1;
            this.field3441 = this.field3445;
            return null;
        }
        if (!this.field3454 && this.field3462 != var8.field7483) {
            this.field3456 = null;
            this.method1541(125, -1);
        }
        this.method1548(arg0, -15520, arg2);
        boolean var9 = arg6 & this.field3463 & class397.field5830.method56((byte) 79, class399.field5865) != 0;
        boolean var10 = var9 & (this.field3462 != var8.field7483 || (this.field3445 != this.field3441 || this.field3461 != null && (this.field3461.field5405 || class66.field1151) && this.field3459 != this.field3445) && class397.field5830.method56((byte) -97, class399.field5865) >= 2);
        if (arg3 && !var10) {
            this.field3462 = var8.field7483;
            this.field3441 = this.field3445;
            return null;
        }
        if (var10) {
            class393.method2457(this.field3471, this.field3444, this.field3442, this.field3470, this.field3473);
        }
        class35 var11 = class529.field7807[this.field3444];
        class35 var12;
        if (this.field3458) {
            var12 = class145.field2135[0];
        } else {
            var12 = this.field3444 < 3 ? class529.field7807[this.field3444 + 1] : null;
        }
        if (arg1 < 107) {
            this.method1547(31, 23);
        }
        class121 var13 = null;
        if (this.field3461 != null) {
            if (var10) {
                arg5 |= 0x40000;
            }
            var13 = var8.method3018(this.field3474, arg5, var11, (byte) -62, this.field3470, this.field3461, this.field3443 == 11 ? this.field3467 + 4 : this.field3467, this.field3443 == 11 ? 10 : this.field3443, arg4, this.field3445, var11.method273(this.field3442, this.field3470), this.field3442, this.field3459, var12);
            if (var13 == null) {
                this.field3471 = null;
                this.field3468 = 0;
                this.field3473 = null;
            } else {
                if (var10) {
                    if (this.field3473 == null) {
                        this.field3473 = new boolean[4];
                    }
                    this.field3471 = var13.method885(this.field3471);
                    class434.method2623(this.field3471, this.field3444, arg2, arg0, this.field3473);
                }
                this.field3468 = var13.method918();
            }
            this.field3456 = null;
        } else if (this.field3456 != null && arg5 == (this.field3456.method915() & arg5) && this.field3462 == var8.field7483) {
            var13 = this.field3456;
        } else {
            if (this.field3456 != null) {
                arg5 |= this.field3456.method915();
            }
            class505 var14 = var8.method3016(arg4, var12, var11.method273(this.field3442, this.field3470), this.field3443 == 11 ? 10 : this.field3443, this.field3442, this.field3443 == 11 ? this.field3467 + 4 : this.field3467, var10, (byte) -121, this.field3470, arg5, var11);
            if (var14 == null) {
                this.field3456 = null;
                this.field3471 = null;
                this.field3473 = null;
                this.field3468 = 0;
            } else {
                var13 = var14.field7408;
                this.field3456 = var14.field7408;
                if (var10) {
                    this.field3471 = var14.field7405;
                    this.field3473 = null;
                    class434.method2623(this.field3471, this.field3444, arg2, arg0, null);
                }
                this.field3468 = var13.method918();
            }
        }
        this.field3470 = arg0;
        this.field3442 = arg2;
        this.field3462 = var8.field7483;
        this.field3441 = this.field3445;
        return var13;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)V", line = 487)
    public static void method1550(byte arg0) {
        if (arg0 == -86) {
            field3446 = null;
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIILc;ZILqa;B)V", line = 497)
    public final void method1551(int arg0, int arg1, int arg2, class121 arg3, boolean arg4, int arg5, class162 arg6, byte arg7) {
        field3450++;
        if (arg7 != -105) {
            this.method1541(10, -20);
        }
        class46[] var9 = arg3.method913();
        class113[] var10 = arg3.method890();
        if ((this.field3455 == null || this.field3455.field3402) && (var9 != null || var10 != null)) {
            class510 var11 = class246.field3567.method609(arg7 + 221, this.field3469);
            if (var11.field7497 != null) {
                var11 = var11.method3027(class526.field7733, -12889);
            }
            if (var11 != null) {
                this.field3455 = new class234(class180.field2734);
            }
        }
        if (this.field3455 == null) {
            return;
        }
        if (arg4) {
            this.field3455.method1518(arg6, (long) class180.field2734, var9, var10, false);
        } else {
            this.field3455.method1525((long) class180.field2734);
        }
        this.field3455.method1529(this.field3475, arg5, arg0, arg1, arg2);
    }
}
