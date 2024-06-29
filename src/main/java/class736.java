import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class736 {

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "I")
    private int field10285 = -1;

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "I")
    private int field10286 = -1;

    @OriginalMember(owner = "client!vt", name = "i", descriptor = "I")
    private int field10291 = 0;

    @OriginalMember(owner = "client!vt", name = "m", descriptor = "Z")
    private boolean field10295 = false;

    @OriginalMember(owner = "client!vt", name = "z", descriptor = "Z")
    private boolean field10308 = false;

    @OriginalMember(owner = "client!vt", name = "J", descriptor = "I")
    private int field10316 = -1;

    @OriginalMember(owner = "client!vt", name = "M", descriptor = "I")
    private int field10319 = 0;

    @OriginalMember(owner = "client!vt", name = "k", descriptor = "B")
    private byte field10293;

    @OriginalMember(owner = "client!vt", name = "n", descriptor = "I")
    public int field10296;

    @OriginalMember(owner = "client!vt", name = "L", descriptor = "I")
    public int field10318;

    @OriginalMember(owner = "client!vt", name = "l", descriptor = "B")
    private byte field10294;

    @OriginalMember(owner = "client!vt", name = "I", descriptor = "Lmb;")
    private class410 field10315;

    @OriginalMember(owner = "client!vt", name = "o", descriptor = "I")
    public int field10297;

    @OriginalMember(owner = "client!vt", name = "w", descriptor = "Z")
    private boolean field10305;

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "Lus;")
    public static class328 field10288 = new class328(36, 16);

    @OriginalMember(owner = "client!vt", name = "K", descriptor = "[Ljava/lang/String;")
    public static String[] field10317 = new String[100];

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "I")
    public static int field10283;

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "I")
    public static int field10287;

    @OriginalMember(owner = "client!vt", name = "h", descriptor = "I")
    public static int field10290;

    @OriginalMember(owner = "client!vt", name = "j", descriptor = "I")
    public static int field10292;

    @OriginalMember(owner = "client!vt", name = "p", descriptor = "I")
    private int field10298;

    @OriginalMember(owner = "client!vt", name = "s", descriptor = "I")
    private int field10301;

    @OriginalMember(owner = "client!vt", name = "t", descriptor = "I")
    public static int field10302;

    @OriginalMember(owner = "client!vt", name = "u", descriptor = "I")
    public static int field10303;

    @OriginalMember(owner = "client!vt", name = "v", descriptor = "I")
    public static int field10304;

    @OriginalMember(owner = "client!vt", name = "x", descriptor = "I")
    private int field10306;

    @OriginalMember(owner = "client!vt", name = "y", descriptor = "I")
    public static int field10307;

    @OriginalMember(owner = "client!vt", name = "A", descriptor = "I")
    public static int field10309;

    @OriginalMember(owner = "client!vt", name = "C", descriptor = "I")
    public static int field10311;

    @OriginalMember(owner = "client!vt", name = "D", descriptor = "I")
    private int field10312;

    @OriginalMember(owner = "client!vt", name = "F", descriptor = "I")
    public static int field10313;

    @OriginalMember(owner = "client!vt", name = "H", descriptor = "I")
    public static int field10314;

    @OriginalMember(owner = "client!vt", name = "r", descriptor = "Lr;")
    private class108 field10300;

    @OriginalMember(owner = "client!vt", name = "B", descriptor = "Lka;")
    private class219 field10310;

    @OriginalMember(owner = "client!vt", name = "g", descriptor = "Laj;")
    public class428 field10289;

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "Lrj;")
    private class747 field10284;

    @OriginalMember(owner = "client!vt", name = "q", descriptor = "[Z")
    private boolean[] field10299;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(III)V", line = 4)
    public static final void method4118(int arg0, int arg1, int arg2) {
        class73 var3 = class495.field7002[arg0][arg1][arg2];
        if (var3 != null) {
            class142.method877(var3.field966);
            if (var3.field966 != null) {
                var3.field966 = null;
            }
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IB)V", line = 14)
    public final void method4119(int arg0, byte arg1) {
        this.field10295 = true;
        field10292++;
        if (arg1 <= 0) {
            this.field10295 = true;
        }
        this.method4120(23980, arg0);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(II)V", line = 28)
    private final void method4120(int arg0, int arg1) {
        field10313++;
        if (arg0 != 23980) {
            this.field10286 = 82;
        }
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class290 var5 = class358.field5112.method890(this.field10297, false);
            class290 var6 = var5;
            if (var5.field3685 != null) {
                var5 = var5.method1739((byte) -120, class461.field6637);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field3770 != null) {
                if (this.field10284 != null && var5.method1737(this.field10284.field10444, 0)) {
                    return;
                }
                var3 = var5.method1747((byte) -64);
                if (this.field10316 != var5.field3771) {
                    var4 = var5.field3766;
                }
            } else if (var5.field3744 == -1) {
                if (var6 != null && var6.field3770 != null) {
                    if (this.field10284 != null && var6.method1737(this.field10284.field10444, 0)) {
                        return;
                    }
                    var3 = var6.method1747((byte) -85);
                    if (this.field10316 != var6.field3771) {
                        var4 = var6.field3766;
                    }
                } else if (var6 != null && var6.field3744 != -1 && this.field10316 != var6.field3771) {
                    var4 = var6.field3766;
                    var3 = var6.field3744;
                }
            } else if (this.field10316 != var5.field3771) {
                var3 = var5.field3744;
                var4 = var5.field3766;
            }
        }
        if (var3 == -1) {
            this.field10284 = null;
            return;
        }
        this.field10310 = null;
        if (this.field10284 == null || this.field10284.field10444 != var3) {
            this.field10284 = class646.field8903.method643(var3, -96);
        } else if (this.field10284.field10437 == 0) {
            return;
        }
        if (this.field10284.field10458 == null) {
            this.field10284 = null;
            return;
        }
        if (var4) {
            this.field10312 = (int) (Math.random() * (double) this.field10284.field10458.length);
            this.field10298 = ((int) (Math.random() * (double) this.field10284.field10453[this.field10312])) + 1;
        } else {
            this.field10298 = 1;
            this.field10312 = 0;
        }
        this.field10306 = this.field10312 + 1;
        if (this.field10306 < 0 || this.field10306 >= this.field10284.field10458.length) {
            this.field10306 = -1;
        }
        this.field10301 = class266.field3368 - this.field10298;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V", line = 151)
    public static void method4121(int arg0) {
        field10288 = null;
        field10317 = null;
        if (arg0 != 100) {
            field10288 = null;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lha;IIIZLka;Lwc;IZ)V", line = 163)
    public final void method4122(class454 arg0, int arg1, int arg2, int arg3, boolean arg4, class219 arg5, class376 arg6, int arg7, boolean arg8) {
        field10307++;
        class183[] var10 = arg5.method1332();
        if (arg8) {
            return;
        }
        class27[] var11 = arg5.method1335();
        if ((this.field10289 == null || this.field10289.field6072) && (var10 != null || var11 != null)) {
            class290 var12 = class358.field5112.method890(this.field10297, false);
            if (var12.field3685 != null) {
                var12 = var12.method1739((byte) -120, class461.field6637);
            }
            if (var12 != null) {
                this.field10289 = class428.method2544(class266.field3368, true);
            }
        }
        if (this.field10289 == null) {
            return;
        }
        arg5.method1366(arg6);
        if (arg4) {
            this.field10289.method2541(arg0, (long) class266.field3368, var10, var11, false);
        } else {
            this.field10289.method2546((long) class266.field3368);
        }
        this.field10289.method2551(this.field10294, arg7, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)Z", line = 203)
    public final boolean method4123(byte arg0) {
        if (arg0 != -38) {
            this.method4126(true, null, -54, false, (byte) 49);
        }
        field10309++;
        return this.field10305;
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lha;Lqg;IIIILmb;ZI)V", line = 586)
    public class736(class454 arg0, class290 arg1, int arg2, int arg3, int arg4, int arg5, class410 arg6, boolean arg7, int arg8) {
        this.field10308 = arg7;
        this.field10293 = (byte) arg5;
        this.field10296 = arg3;
        this.field10318 = arg2;
        this.field10294 = (byte) arg4;
        this.field10315 = arg6;
        this.field10297 = arg1.field3771;
        this.field10305 = arg0.method88() && arg1.field3739 && !this.field10308;
        if (arg8 != -1) {
            this.field10295 = true;
        }
        this.method4120(23980, arg8);
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(B)I", line = 223)
    public final int method4124(byte arg0) {
        if (arg0 != 103) {
            this.field10308 = false;
        }
        field10302++;
        return this.field10291;
    }

    @OriginalMember(owner = "client!vt", name = "finalize", descriptor = "()V", line = 235)
    protected final void finalize() {
        if (this.field10289 != null) {
            this.field10289.method2550();
        }
        field10287++;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILha;)V", line = 246)
    public final void method4125(int arg0, class454 arg1) {
        field10314++;
        this.method4126(true, arg1, arg0, true, (byte) -121);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(ZLha;IZB)Lka;", line = 259)
    public final class219 method4126(boolean arg0, class454 arg1, int arg2, boolean arg3, byte arg4) {
        field10311++;
        if (arg4 > -111) {
            this.method4120(34, 65);
        }
        class290 var6 = class358.field5112.method890(this.field10297, false);
        if (var6.field3685 != null) {
            var6 = var6.method1739((byte) -120, class461.field6637);
        }
        if (var6 == null) {
            this.method4128(18119, arg1);
            this.field10316 = -1;
            this.field10286 = -1;
            this.field10285 = -1;
            return null;
        }
        if (!this.field10295 && this.field10316 != var6.field3771) {
            this.field10310 = null;
            this.method4120(23980, -1);
        }
        this.method4129((byte) 58, this.field10315);
        if (arg0) {
            boolean var7 = arg0 & this.field10305 & class223.field2944.field628.method1256((byte) -121) != 0;
            arg0 = var7 & (this.field10285 != var6.field3771 || this.field10284 != null && class223.field2944.field628.method1256((byte) -128) >= 2 && (this.field10312 != this.field10286 || (this.field10284.field10448 || class322.field4112) && this.field10312 != this.field10306));
        }
        if (arg3 && !arg0) {
            this.field10316 = var6.field3771;
            return null;
        }
        if (arg0) {
            class566.method3194(this.field10300, this.field10293, this.field10315.field5790, this.field10315.field5784, this.field10299);
            this.field10285 = -1;
            this.field10286 = -1;
        }
        class402 var8 = class517.field7282[this.field10293];
        class402 var9;
        if (this.field10308) {
            var9 = class716.field10106[0];
        } else {
            var9 = this.field10293 < 3 ? class517.field7282[this.field10293 + 1] : null;
        }
        class219 var10 = null;
        if (this.field10284 != null) {
            if (arg0) {
                arg2 |= 0x40000;
            }
            var10 = var6.method1746(this.field10306, this.field10318 == 11 ? this.field10296 + 4 : this.field10296, this.field10312, this.field10318 == 11 ? 10 : this.field10318, this.field10315.field5790, this.field10315.field5784, var8.method2382((byte) 19, this.field10315.field5784, this.field10315.field5790), this.field10284, arg2, var9, var8, arg1, -52, this.field10298);
            if (var10 == null) {
                this.field10291 = 0;
                this.field10300 = null;
                this.field10299 = null;
                this.field10319 = 0;
            } else {
                if (arg0) {
                    if (this.field10299 == null) {
                        this.field10299 = new boolean[4];
                    }
                    this.field10300 = var10.method1334(this.field10300);
                    class586.method3264(this.field10300, this.field10293, this.field10315.field5790, this.field10315.field5784, this.field10299);
                    this.field10285 = var6.field3771;
                    this.field10286 = this.field10312;
                }
                this.field10319 = var10.method1353();
                this.field10291 = var10.method1333();
            }
            this.field10310 = null;
        } else if (this.field10310 != null && arg2 == (this.field10310.method1340() & arg2) && this.field10316 == var6.field3771) {
            var10 = this.field10310;
        } else {
            if (this.field10310 != null) {
                arg2 |= this.field10310.method1340();
            }
            class239 var11 = var6.method1734(593, arg0, this.field10315.field5790, this.field10318 == 11 ? 10 : this.field10318, arg1, arg2, var9, var8.method2382((byte) 19, this.field10315.field5784, this.field10315.field5790), this.field10318 == 11 ? this.field10296 + 4 : this.field10296, var8, this.field10315.field5784);
            if (var11 == null) {
                this.field10300 = null;
                this.field10299 = null;
                this.field10291 = 0;
                this.field10310 = null;
                this.field10319 = 0;
            } else {
                var10 = var11.field3079;
                this.field10310 = var11.field3079;
                if (arg0) {
                    this.field10299 = null;
                    this.field10300 = var11.field3082;
                    class586.method3264(this.field10300, this.field10293, this.field10315.field5790, this.field10315.field5784, null);
                    this.field10286 = -1;
                    this.field10285 = var6.field3771;
                }
                this.field10319 = var10.method1353();
                this.field10291 = var10.method1333();
            }
        }
        this.field10316 = var6.field3771;
        return var10;
    }

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "(B)I", line = 397)
    public final int method4127(byte arg0) {
        if (arg0 >= -119) {
            this.field10300 = null;
        }
        field10283++;
        return this.field10319;
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(ILha;)V", line = 412)
    public final void method4128(int arg0, class454 arg1) {
        if (arg0 != 18119) {
            this.field10289 = null;
        }
        if (this.field10300 != null) {
            class566.method3194(this.field10300, this.field10293, this.field10315.field5790, this.field10315.field5784, this.field10299);
            this.field10300 = null;
            this.field10299 = null;
        }
        field10303++;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(BLmb;)V", line = 450)
    private final void method4129(byte arg0, class410 arg1) {
        field10304++;
        if (arg0 <= 57) {
            return;
        }
        label90: while (true) {
            if (this.field10284 == null) {
                if (this.field10295) {
                    return;
                }
                this.method4120(23980, -1);
                if (this.field10284 == null) {
                    return;
                }
            }
            int var3 = class266.field3368 - this.field10301;
            if (var3 > 100 && this.field10284.field10441 > 0) {
                int var4 = this.field10284.field10458.length - this.field10284.field10441;
                while (var4 > this.field10312 && this.field10284.field10453[this.field10312] < var3) {
                    var3 -= this.field10284.field10453[this.field10312];
                    this.field10312++;
                }
                if (var4 <= this.field10312) {
                    int var5 = 0;
                    for (int var6 = var4; var6 < this.field10284.field10458.length; var6++) {
                        var5 += this.field10284.field10453[var6];
                    }
                    var3 %= var5;
                }
                this.field10306 = this.field10312 + 1;
                if (this.field10306 >= this.field10284.field10458.length) {
                    this.field10306 -= this.field10284.field10441;
                    if (this.field10306 < 0 || this.field10284.field10458.length <= this.field10306) {
                        this.field10306 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field10284.field10453[this.field10312] >= var3) {
                            this.field10301 = class266.field3368 - var3;
                            this.field10298 = var3;
                            return;
                        }
                        class107.method729(this.field10312, this.field10284, arg1, -4855);
                        var3 -= this.field10284.field10453[this.field10312];
                        this.field10312++;
                        if (this.field10284.field10458.length <= this.field10312) {
                            this.field10312 -= this.field10284.field10441;
                            if (this.field10312 < 0 || this.field10284.field10458.length <= this.field10312) {
                                this.field10284 = null;
                                continue label90;
                            }
                        }
                        this.field10306 = this.field10312 + 1;
                    } while (this.field10306 < this.field10284.field10458.length);
                    this.field10306 -= this.field10284.field10441;
                } while (this.field10306 >= 0 && this.field10284.field10458.length > this.field10306);
                this.field10306 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lab;ILab;)V", line = 552)
    public static final void method4130(class623 arg0, int arg1, class623 arg2) {
        field10290++;
        if (arg0.field8708 != null) {
            arg0.method3409(-127);
        }
        arg0.field8708 = arg2.field8708;
        arg0.field8705 = arg2;
        if (arg1 != 11) {
            method4118(-106, -61, -69);
        }
        arg0.field8708.field8705 = arg0;
        arg0.field8705.field8708 = arg0;
    }
}
