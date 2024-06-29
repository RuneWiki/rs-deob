import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class161 {

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
    private int field2410 = -1;

    @OriginalMember(owner = "client!jh", name = "t", descriptor = "I")
    private int field2420 = 0;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
    private int field2412 = -1;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "Z")
    private boolean field2409 = false;

    @OriginalMember(owner = "client!jh", name = "J", descriptor = "I")
    private int field2435 = -1;

    @OriginalMember(owner = "client!jh", name = "B", descriptor = "I")
    private int field2428 = 0;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "Z")
    private boolean field2406 = false;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "B")
    private byte field2413;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "B")
    private byte field2402;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public int field2405;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public int field2404;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "Lkf;")
    private class256 field2417;

    @OriginalMember(owner = "client!jh", name = "L", descriptor = "I")
    public int field2437;

    @OriginalMember(owner = "client!jh", name = "K", descriptor = "Z")
    private boolean field2436;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "[I")
    public static int[] field2408 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
    private int field2411;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "I")
    private int field2419;

    @OriginalMember(owner = "client!jh", name = "v", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!jh", name = "x", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!jh", name = "y", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!jh", name = "A", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!jh", name = "C", descriptor = "I")
    private int field2429;

    @OriginalMember(owner = "client!jh", name = "D", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!jh", name = "E", descriptor = "I")
    private int field2431;

    @OriginalMember(owner = "client!jh", name = "G", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!jh", name = "H", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!jh", name = "I", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!jh", name = "M", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!jh", name = "w", descriptor = "Ll;")
    public class17 field2423;

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "Lr;")
    private class184 field2418;

    @OriginalMember(owner = "client!jh", name = "O", descriptor = "Lbk;")
    private class379 field2440;

    @OriginalMember(owner = "client!jh", name = "u", descriptor = "Lla;")
    private class456 field2421;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "Lka;")
    private class475 field2403;

    @OriginalMember(owner = "client!jh", name = "N", descriptor = "[Z")
    private boolean[] field2439;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lha;I)V")
    public final void method1148(class59 arg0, int arg1) {
        field2426++;
        if (this.field2418 != null) {
            class562.method3115(this.field2418, this.field2413, this.field2417.field3505, this.field2417.field3502, this.field2439);
            this.field2439 = null;
            this.field2418 = null;
        }
        if (arg1 != 20087) {
            this.field2410 = -26;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
    public static void method1149(int arg0) {
        field2408 = null;
        if (arg0 > -25) {
            method1158(65, null);
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)I")
    public final int method1150(int arg0) {
        if (arg0 != -1) {
            this.method1150(126);
        }
        field2434++;
        return this.field2428;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)Z")
    public final boolean method1151(byte arg0) {
        field2427++;
        return arg0 > -126 ? true : this.field2436;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lha;ZIIZ)Lka;")
    public final class475 method1152(class59 arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        field2432++;
        class100 var6 = class462.field6333.method2008((byte) -66, this.field2404);
        if (var6.field1307 != null) {
            var6 = var6.method748(class74.field901, 124);
        }
        if (var6 == null) {
            this.method1148(arg0, arg3 ^ 0xFFFFE200);
            this.field2412 = -1;
            this.field2410 = -1;
            this.field2435 = -1;
            return null;
        }
        if (!this.field2406 && this.field2412 != var6.field1301) {
            this.field2403 = null;
            this.method1156((byte) -46, -1);
        }
        this.method1161((byte) 110, this.field2417);
        if (arg1) {
            boolean var7 = arg1 & this.field2436 & class411.field5711.field3897.method1057(true) != 0;
            arg1 = var7 & (this.field2435 != var6.field1301 || this.field2421 != null && class411.field5711.field3897.method1057(true) >= 2 && (this.field2429 != this.field2410 || (this.field2421.field6239 || class37.field529) && this.field2429 != this.field2419));
        }
        if (arg4 && !arg1) {
            this.field2412 = var6.field1301;
            return null;
        }
        if (arg1) {
            class562.method3115(this.field2418, this.field2413, this.field2417.field3505, this.field2417.field3502, this.field2439);
            this.field2435 = -1;
            this.field2410 = -1;
        }
        class282 var8 = class507.field6771[this.field2413];
        if (arg3 != -21385) {
            this.field2411 = -90;
        }
        class282 var9;
        if (this.field2409) {
            var9 = class113.field1866[0];
        } else {
            var9 = this.field2413 < 3 ? class507.field6771[this.field2413 + 1] : null;
        }
        class475 var10 = null;
        if (this.field2421 != null) {
            if (arg1) {
                arg2 |= 0x40000;
            }
            var10 = var6.method737(this.field2405 == 11 ? this.field2437 + 4 : this.field2437, this.field2429, this.field2440, this.field2417.field3505, this.field2405 == 11 ? 10 : this.field2405, this.field2431, var9, var8.method1750((byte) 109, this.field2417.field3505, this.field2417.field3502), this.field2417.field3502, -1, this.field2421, var8, this.field2419, arg0, arg2);
            if (var10 == null) {
                this.field2418 = null;
                this.field2420 = 0;
                this.field2428 = 0;
                this.field2439 = null;
            } else {
                if (arg1) {
                    if (this.field2439 == null) {
                        this.field2439 = new boolean[4];
                    }
                    this.field2418 = var10.method154(this.field2418);
                    class265.method1601(this.field2418, this.field2413, this.field2417.field3505, this.field2417.field3502, this.field2439);
                    this.field2435 = var6.field1301;
                    this.field2410 = this.field2429;
                }
                this.field2420 = var10.method180();
                this.field2428 = var10.method167();
            }
            this.field2403 = null;
        } else if (this.field2403 != null && arg2 == (arg2 & this.field2403.method214()) && this.field2412 == var6.field1301) {
            var10 = this.field2403;
        } else {
            if (this.field2403 != null) {
                arg2 |= this.field2403.method214();
            }
            class407 var11 = var6.method736(this.field2405 == 11 ? this.field2437 + 4 : this.field2437, arg1, this.field2440, arg2, var8.method1750((byte) 123, this.field2417.field3505, this.field2417.field3502), arg0, (byte) -128, this.field2417.field3502, this.field2405 == 11 ? 10 : this.field2405, this.field2417.field3505, var8, var9);
            if (var11 == null) {
                this.field2403 = null;
                this.field2428 = 0;
                this.field2420 = 0;
                this.field2439 = null;
                this.field2418 = null;
            } else {
                var10 = var11.field5651;
                this.field2403 = var11.field5651;
                if (arg1) {
                    this.field2418 = var11.field5657;
                    this.field2439 = null;
                    class265.method1601(this.field2418, this.field2413, this.field2417.field3505, this.field2417.field3502, null);
                    this.field2435 = var6.field1301;
                    this.field2410 = -1;
                }
                this.field2420 = var10.method180();
                this.field2428 = var10.method167();
            }
        }
        this.field2412 = var6.field1301;
        return var10;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZI)Ljava/lang/String;")
    public static final String method1153(int arg0, boolean arg1, int arg2) {
        field2425++;
        if (arg1) {
            return null;
        }
        int var3 = arg0 - arg2;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)I")
    public final int method1154(int arg0) {
        field2414++;
        return arg0 == 1 ? this.field2420 : 6;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BI)V")
    public final void method1155(byte arg0, int arg1) {
        this.field2406 = true;
        int var3 = 48 % ((32 - arg0) / 38);
        field2433++;
        this.method1156((byte) -46, arg1);
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(BI)V")
    private final void method1156(byte arg0, int arg1) {
        field2424++;
        if (arg0 != -46) {
            this.field2420 = -16;
        }
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class100 var5 = class462.field6333.method2008((byte) -39, this.field2404);
            class100 var6 = var5;
            if (var5.field1307 != null) {
                var5 = var5.method748(class74.field901, arg0 + 169);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field1354 != null) {
                if (this.field2421 != null && var5.method751(this.field2421.field6232, (byte) 28)) {
                    return;
                }
                var3 = var5.method749(false);
                if (this.field2412 != var5.field1301) {
                    var4 = var5.field1297;
                }
            } else if (var5.field1281 == -1) {
                if (var6 != null && var6.field1354 != null) {
                    if (this.field2421 != null && var6.method751(this.field2421.field6232, (byte) 28)) {
                        return;
                    }
                    var3 = var6.method749(false);
                    if (this.field2412 != var6.field1301) {
                        var4 = var6.field1297;
                    }
                } else if (var6 != null && var6.field1281 != -1 && this.field2412 != var6.field1301) {
                    var4 = var6.field1297;
                    var3 = var6.field1281;
                }
            } else if (this.field2412 != var5.field1301) {
                var4 = var5.field1297;
                var3 = var5.field1281;
            }
        }
        if (var3 == -1) {
            this.field2421 = null;
            return;
        }
        this.field2403 = null;
        if (this.field2421 == null || this.field2421.field6232 != var3) {
            this.field2421 = class509.field6780.method663((byte) -90, var3);
        } else if (this.field2421.field6214 == 0) {
            return;
        }
        if (this.field2421.field6229 == null) {
            this.field2421 = null;
            return;
        }
        if (var4) {
            this.field2429 = (int) (Math.random() * (double) this.field2421.field6229.length);
            this.field2431 = (int) (Math.random() * (double) this.field2421.field6225[this.field2429]) + 1;
        } else {
            this.field2431 = 1;
            this.field2429 = 0;
        }
        this.field2419 = this.field2429 + 1;
        if (this.field2419 < 0 || this.field2421.field6229.length <= this.field2419) {
            this.field2419 = -1;
        }
        this.field2411 = class29.field474 - this.field2431;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lbk;I)V")
    public final void method1157(class379 arg0, int arg1) {
        field2415++;
        this.field2440 = arg0;
        if (arg1 != 0) {
            this.method1154(102);
        }
        this.field2403 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILfha;)V")
    public static final void method1158(int arg0, class383 arg1) {
        field2407++;
        if (arg0 != 1073741823) {
            field2401 = 13;
        }
        class461 var2 = (class461) class592.field7700.method2135((long) arg1.field10297, (byte) 31);
        if (var2 == null) {
            return;
        }
        if (var2.field6305 != null) {
            class603.field7927.method1612(var2.field6305);
            var2.field6305 = null;
        }
        var2.method3564(true);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLha;)V")
    public final void method1159(byte arg0, class59 arg1) {
        if (arg0 != 39) {
            this.field2413 = 2;
        }
        this.method1152(arg1, true, 262144, arg0 ^ 0xFFFFAC50, true);
        field2416++;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZILofa;ILka;Lha;IIZ)V")
    public final void method1160(boolean arg0, int arg1, class333 arg2, int arg3, class475 arg4, class59 arg5, int arg6, int arg7, boolean arg8) {
        field2422++;
        if (arg0) {
            return;
        }
        class730[] var10 = arg4.method150();
        class207[] var11 = arg4.method195();
        if ((this.field2423 == null || this.field2423.field220) && (var10 != null || var11 != null)) {
            class100 var12 = class462.field6333.method2008((byte) -92, this.field2404);
            if (var12.field1307 != null) {
                var12 = var12.method748(class74.field901, 125);
            }
            if (var12 != null) {
                this.field2423 = class17.method133(class29.field474, true);
            }
        }
        if (this.field2423 == null) {
            return;
        }
        arg4.method200(arg2);
        if (arg8) {
            this.field2423.method129(arg5, (long) class29.field474, var10, var11, false);
        } else {
            this.field2423.method134((long) class29.field474);
        }
        this.field2423.method120(this.field2402, arg3, arg6, arg7, arg1);
    }

    @OriginalMember(owner = "client!jh", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field2438++;
        if (this.field2423 != null) {
            this.field2423.method123();
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLkf;)V")
    private final void method1161(byte arg0, class256 arg1) {
        if (arg0 != 110) {
            return;
        }
        field2430++;
        label92: while (true) {
            if (this.field2421 == null) {
                if (this.field2406) {
                    return;
                }
                this.method1156((byte) -46, -1);
                if (this.field2421 == null) {
                    return;
                }
            }
            int var3 = class29.field474 - this.field2411;
            if (var3 > 100 && this.field2421.field6242 > 0) {
                int var4 = this.field2421.field6229.length - this.field2421.field6242;
                while (this.field2429 < var4 && this.field2421.field6225[this.field2429] < var3) {
                    var3 -= this.field2421.field6225[this.field2429];
                    this.field2429++;
                }
                if (var4 <= this.field2429) {
                    int var5 = 0;
                    for (int var6 = var4; var6 < this.field2421.field6229.length; var6++) {
                        var5 += this.field2421.field6225[var6];
                    }
                    var3 %= var5;
                }
                this.field2419 = this.field2429 + 1;
                if (this.field2419 >= this.field2421.field6229.length) {
                    this.field2419 -= this.field2421.field6242;
                    if (this.field2419 < 0 || this.field2419 >= this.field2421.field6229.length) {
                        this.field2419 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field2421.field6225[this.field2429] >= var3) {
                            this.field2431 = var3;
                            this.field2411 = class29.field474 - var3;
                            return;
                        }
                        class514.method2871(this.field2421, this.field2429, arg1, true);
                        var3 -= this.field2421.field6225[this.field2429];
                        this.field2429++;
                        if (this.field2421.field6229.length <= this.field2429) {
                            this.field2429 -= this.field2421.field6242;
                            if (this.field2429 < 0 || this.field2421.field6229.length <= this.field2429) {
                                this.field2421 = null;
                                continue label92;
                            }
                        }
                        this.field2419 = this.field2429 + 1;
                    } while (this.field2419 < this.field2421.field6229.length);
                    this.field2419 -= this.field2421.field6242;
                } while (this.field2419 >= 0 && this.field2419 < this.field2421.field6229.length);
                this.field2419 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lha;Lqfa;IIIILkf;ZI)V")
    public class161(class59 arg0, class100 arg1, int arg2, int arg3, int arg4, int arg5, class256 arg6, boolean arg7, int arg8) {
        this.field2413 = (byte) arg5;
        this.field2402 = (byte) arg4;
        this.field2405 = arg2;
        this.field2404 = arg1.field1301;
        this.field2409 = arg7;
        this.field2417 = arg6;
        this.field2437 = arg3;
        this.field2436 = arg0.method468() && arg1.field1343 && !this.field2409;
        if (arg8 != -1) {
            this.field2406 = true;
        }
        this.method1156((byte) -46, arg8);
    }
}
