import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class436 {

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "Z")
    private boolean field6399 = false;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "Z")
    private boolean field6392 = false;

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "I")
    private int field6407 = -1;

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "I")
    private int field6403 = -1;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
    private int field6395 = -32768;

    @OriginalMember(owner = "client!ck", name = "H", descriptor = "I")
    public int field6421;

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "I")
    private int field6424;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public int field6400;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
    private int field6398;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public int field6391;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "B")
    private byte field6401;

    @OriginalMember(owner = "client!ck", name = "t", descriptor = "B")
    private byte field6409;

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "Z")
    private boolean field6415;

    @OriginalMember(owner = "client!ck", name = "D", descriptor = "Loe;")
    public static class127 field6418 = new class127(83, 8);

    @OriginalMember(owner = "client!ck", name = "J", descriptor = "Loe;")
    public static class127 field6423 = new class127(51, 0);

    @OriginalMember(owner = "client!ck", name = "M", descriptor = "Lbg;")
    public static class310 field6426;

    @OriginalMember(owner = "client!ck", name = "N", descriptor = "Lbg;")
    public static class310 field6427;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public static int field6390;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public static int field6393;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    private int field6394;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    public static int field6396;

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "I")
    public static int field6404;

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "I")
    public static int field6405;

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "I")
    public static int field6406;

    @OriginalMember(owner = "client!ck", name = "u", descriptor = "I")
    public static int field6410;

    @OriginalMember(owner = "client!ck", name = "v", descriptor = "I")
    public static int field6411;

    @OriginalMember(owner = "client!ck", name = "w", descriptor = "I")
    private int field6412;

    @OriginalMember(owner = "client!ck", name = "x", descriptor = "I")
    public static int field6413;

    @OriginalMember(owner = "client!ck", name = "y", descriptor = "I")
    private int field6414;

    @OriginalMember(owner = "client!ck", name = "A", descriptor = "I")
    public static int field6416;

    @OriginalMember(owner = "client!ck", name = "C", descriptor = "I")
    private int field6417;

    @OriginalMember(owner = "client!ck", name = "E", descriptor = "I")
    public static int field6419;

    @OriginalMember(owner = "client!ck", name = "s", descriptor = "Lcd;")
    private class198 field6408;

    @OriginalMember(owner = "client!ck", name = "I", descriptor = "Lh;")
    private class452 field6422;

    @OriginalMember(owner = "client!ck", name = "L", descriptor = "Llt;")
    public static class458 field6425;

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "Ldd;")
    public class477 field6402;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "Lfn;")
    private class87 field6397;

    @OriginalMember(owner = "client!ck", name = "F", descriptor = "[Z")
    private boolean[] field6420;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)Z")
    public final boolean method2542(int arg0) {
        field6404++;
        return arg0 == -1 ? this.field6415 : true;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)I")
    public final int method2543(int arg0) {
        if (arg0 != 4) {
            method2546(2);
        }
        field6406++;
        return this.field6395;
    }

    @OriginalMember(owner = "client!ck", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field6402 != null) {
            this.field6402.method2878();
        }
        field6405++;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(III)V")
    private final void method2544(int arg0, int arg1, int arg2) {
        field6413++;
        if (arg0 != -25456) {
            return;
        }
        label90: while (true) {
            if (this.field6397 == null) {
                if (this.field6392) {
                    return;
                }
                this.method2551(-121, -1);
                if (this.field6397 == null) {
                    return;
                }
            }
            int var4 = class369.field5424 - this.field6412;
            if (var4 > 100 && this.field6397.field1511 > 0) {
                int var5 = this.field6397.field1512.length - this.field6397.field1511;
                while (var5 > this.field6414 && this.field6397.field1526[this.field6414] < var4) {
                    var4 -= this.field6397.field1526[this.field6414];
                    this.field6414++;
                }
                if (var5 <= this.field6414) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field6397.field1512.length; var7++) {
                        var6 += this.field6397.field1526[var7];
                    }
                    var4 %= var6;
                }
                this.field6417 = this.field6414 + 1;
                if (this.field6397.field1512.length <= this.field6417) {
                    this.field6417 -= this.field6397.field1511;
                    if (this.field6417 < 0 || this.field6417 >= this.field6397.field1512.length) {
                        this.field6417 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field6397.field1526[this.field6414] >= var4) {
                            this.field6394 = var4;
                            this.field6412 = class369.field5424 - var4;
                            return;
                        }
                        class70.method516(this.field6397, this.field6409, this.field6414, false, arg2, arg1, (byte) -79);
                        var4 -= this.field6397.field1526[this.field6414];
                        this.field6414++;
                        if (this.field6397.field1512.length <= this.field6414) {
                            this.field6414 -= this.field6397.field1511;
                            if (this.field6414 < 0 || this.field6397.field1512.length <= this.field6414) {
                                this.field6397 = null;
                                continue label90;
                            }
                        }
                        this.field6417 = this.field6414 + 1;
                    } while (this.field6417 < this.field6397.field1512.length);
                    this.field6417 -= this.field6397.field1511;
                } while (this.field6417 >= 0 && this.field6397.field1512.length > this.field6417);
                this.field6417 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IB)V")
    public final void method2545(int arg0, byte arg1) {
        field6411++;
        this.field6392 = true;
        if (arg1 != -13) {
            this.method2542(6);
        }
        this.method2551(-99, arg0);
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(I)V")
    public static void method2546(int arg0) {
        field6423 = null;
        if (arg0 == 83) {
            field6426 = null;
            field6418 = null;
            field6427 = null;
            field6425 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILqq;)V")
    public final void method2547(int arg0, class318 arg1) {
        field6396++;
        if (arg0 != -12) {
            field6423 = null;
        }
        this.method2550(true, this.field6398, this.field6424, arg1, arg0 ^ 0x17, true, 262144);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIILcd;ZLqq;I)V")
    public final void method2548(int arg0, int arg1, int arg2, int arg3, class198 arg4, boolean arg5, class318 arg6, int arg7) {
        if (arg2 != -400) {
            return;
        }
        field6410++;
        class425[] var9 = arg4.method502();
        class10[] var10 = arg4.method471();
        if ((this.field6402 == null || this.field6402.field7292) && (var9 != null || var10 != null)) {
            class56 var11 = class128.field2070.method916((byte) -15, this.field6400);
            if (var11.field892 != null) {
                var11 = var11.method393(class273.field4144, (byte) -124);
            }
            if (var11 != null) {
                this.field6402 = new class477(class369.field5424);
            }
        }
        if (this.field6402 == null) {
            return;
        }
        if (arg5) {
            this.field6402.method2879(arg6, (long) class369.field5424, var9, var10, false);
        } else {
            this.field6402.method2886((long) class369.field5424);
        }
        this.field6402.method2883(this.field6409, arg1, arg3, arg0, arg7);
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(ILqq;)V")
    public final void method2549(int arg0, class318 arg1) {
        field6419++;
        if (arg0 != 10) {
            method2546(-29);
        }
        if (this.field6422 != null) {
            class90.method668(this.field6422, this.field6401, this.field6424, this.field6398, this.field6420);
            this.field6420 = null;
            this.field6422 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZIILqq;IZI)Lcd;")
    public final class198 method2550(boolean arg0, int arg1, int arg2, class318 arg3, int arg4, boolean arg5, int arg6) {
        field6393++;
        class56 var8 = class128.field2070.method916((byte) -15, this.field6400);
        if (var8.field892 != null) {
            var8 = var8.method393(class273.field4144, (byte) -126);
        }
        if (arg4 >= -2) {
            return null;
        } else if (var8 == null) {
            this.method2549(10, arg3);
            this.field6407 = this.field6414;
            this.field6403 = -1;
            return null;
        } else {
            if (!this.field6392 && this.field6403 != var8.field958) {
                this.field6408 = null;
                this.method2551(-123, -1);
            }
            this.method2544(-25456, arg1, arg2);
            boolean var9 = arg0 & class463.field7116.field2974 != 0 & this.field6415;
            boolean var10 = var9 & (this.field6403 != var8.field958 || (this.field6414 != this.field6407 || this.field6397 != null && (this.field6397.field1509 || class4.field43) && this.field6417 != this.field6414) && class463.field7116.field2974 >= 2);
            if (arg5 && !var10) {
                this.field6407 = this.field6414;
                this.field6403 = var8.field958;
                return null;
            }
            if (var10) {
                class90.method668(this.field6422, this.field6401, this.field6424, this.field6398, this.field6420);
            }
            class343 var11 = class99.field1801[this.field6401];
            class343 var12;
            if (this.field6399) {
                var12 = class201.field3195[0];
            } else {
                var12 = this.field6401 < 3 ? class99.field1801[this.field6401 + 1] : null;
            }
            class198 var13 = null;
            if (this.field6397 != null) {
                if (var10) {
                    arg6 |= 0x40000;
                }
                var13 = var8.method402(var11, arg6, var12, this.field6421 == 11 ? this.field6391 + 4 : this.field6391, this.field6421 == 11 ? 10 : this.field6421, this.field6414, this.field6417, this.field6394, var11.method314(this.field6424, this.field6398), arg3, this.field6424, this.field6397, this.field6398, 2);
                if (var13 == null) {
                    this.field6420 = null;
                    this.field6395 = 0;
                    this.field6422 = null;
                } else {
                    if (var10) {
                        if (this.field6420 == null) {
                            this.field6420 = new boolean[4];
                        }
                        this.field6422 = var13.method500(this.field6422);
                        class208.method1275(this.field6422, this.field6401, arg2, arg1, this.field6420);
                    }
                    this.field6395 = var13.method492();
                }
                this.field6408 = null;
            } else if (this.field6408 != null && arg6 == (this.field6408.method489() & arg6) && this.field6403 == var8.field958) {
                var13 = this.field6408;
            } else {
                if (this.field6408 != null) {
                    arg6 |= this.field6408.method489();
                }
                class78 var14 = var8.method391(this.field6421 == 11 ? this.field6391 + 4 : this.field6391, this.field6398, true, this.field6424, var12, var11.method314(this.field6424, this.field6398), arg6, this.field6421 == 11 ? 10 : this.field6421, arg3, var11, var10);
                if (var14 == null) {
                    this.field6395 = 0;
                    this.field6408 = null;
                    this.field6420 = null;
                    this.field6422 = null;
                } else {
                    var13 = var14.field1385;
                    this.field6408 = var14.field1385;
                    if (var10) {
                        this.field6420 = null;
                        this.field6422 = var14.field1381;
                        class208.method1275(this.field6422, this.field6401, arg2, arg1, null);
                    }
                    this.field6395 = var13.method492();
                }
            }
            this.field6424 = arg2;
            this.field6407 = this.field6414;
            this.field6403 = var8.field958;
            this.field6398 = arg1;
            return var13;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)V")
    private final void method2551(int arg0, int arg1) {
        field6416++;
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class56 var5 = class128.field2070.method916((byte) -15, this.field6400);
            class56 var6 = var5;
            if (var5.field892 != null) {
                var5 = var5.method393(class273.field4144, (byte) -127);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field944 != null) {
                if (this.field6397 != null && var5.method404(this.field6397.field1521, (byte) 7)) {
                    return;
                }
                var3 = var5.method389(-134);
                if (this.field6403 != var5.field958) {
                    var4 = var5.field935;
                }
            } else if (var5.field887 == -1) {
                if (var6 != null && var6.field944 != null) {
                    if (this.field6397 != null && var6.method404(this.field6397.field1521, (byte) 7)) {
                        return;
                    }
                    var3 = var6.method389(-134);
                    if (this.field6403 != var6.field958) {
                        var4 = var6.field935;
                    }
                } else if (var6 != null && var6.field887 != -1 && this.field6403 != var6.field958) {
                    var3 = var6.field887;
                    var4 = var6.field935;
                }
            } else if (this.field6403 != var5.field958) {
                var3 = var5.field887;
                var4 = var5.field935;
            }
        }
        if (var3 == -1) {
            this.field6397 = null;
            return;
        }
        this.field6408 = null;
        if (arg0 > -97) {
            field6425 = null;
        }
        if (this.field6397 == null || this.field6397.field1521 != var3) {
            this.field6397 = class429.field6302.method106(-96, var3);
        } else if (this.field6397.field1503 == 0) {
            return;
        }
        if (this.field6397.field1512 == null) {
            this.field6397 = null;
            return;
        }
        if (var4) {
            this.field6414 = (int) ((double) this.field6397.field1512.length * Math.random());
            this.field6394 = (int) ((double) this.field6397.field1526[this.field6414] * Math.random()) + 1;
        } else {
            this.field6414 = 0;
            this.field6394 = 1;
        }
        this.field6417 = this.field6414 + 1;
        if (this.field6417 < 0 || this.field6397.field1512.length <= this.field6417) {
            this.field6417 = -1;
        }
        this.field6412 = class369.field5424 - this.field6394;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lqq;Lin;IIIIIIZI)V")
    public class436(class318 arg0, class56 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field6421 = arg2;
        this.field6424 = arg6;
        this.field6400 = arg1.field958;
        this.field6399 = arg8;
        this.field6398 = arg7;
        this.field6391 = arg3;
        this.field6401 = (byte) arg5;
        this.field6409 = (byte) arg4;
        this.field6415 = arg0.method1934() && arg1.field921 && !this.field6399;
        if (arg9 != -1) {
            this.field6392 = true;
        }
        this.method2551(-116, arg9);
    }

    static {
        new class423("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
        field6426 = new class310(55, 3);
        field6427 = new class310(6, 4);
    }
}
