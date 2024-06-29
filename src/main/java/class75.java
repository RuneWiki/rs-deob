import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class75 extends class294 {

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "I")
    private int field945 = 0;

    @OriginalMember(owner = "client!bn", name = "n", descriptor = "I")
    private int field948 = 0;

    @OriginalMember(owner = "client!bn", name = "l", descriptor = "I")
    private int field946 = -1;

    @OriginalMember(owner = "client!bn", name = "E", descriptor = "Z")
    private boolean field965 = true;

    @OriginalMember(owner = "client!bn", name = "O", descriptor = "I")
    private int field975 = -1;

    @OriginalMember(owner = "client!bn", name = "s", descriptor = "Lfe;")
    private class270 field953 = null;

    @OriginalMember(owner = "client!bn", name = "m", descriptor = "I")
    private int field947 = -32768;

    @OriginalMember(owner = "client!bn", name = "R", descriptor = "Z")
    private boolean field978 = false;

    @OriginalMember(owner = "client!bn", name = "L", descriptor = "I")
    private int field972 = 0;

    @OriginalMember(owner = "client!bn", name = "C", descriptor = "Z")
    private boolean field963 = false;

    @OriginalMember(owner = "client!bn", name = "X", descriptor = "I")
    private int field984;

    @OriginalMember(owner = "client!bn", name = "Q", descriptor = "I")
    private int field977;

    @OriginalMember(owner = "client!bn", name = "T", descriptor = "I")
    private int field980;

    @OriginalMember(owner = "client!bn", name = "D", descriptor = "I")
    private int field964;

    @OriginalMember(owner = "client!bn", name = "x", descriptor = "I")
    private int field958;

    @OriginalMember(owner = "client!bn", name = "I", descriptor = "I")
    private int field969;

    @OriginalMember(owner = "client!bn", name = "u", descriptor = "I")
    private int field955;

    @OriginalMember(owner = "client!bn", name = "w", descriptor = "Lro;")
    private class111 field957;

    @OriginalMember(owner = "client!bn", name = "V", descriptor = "I")
    private int field982;

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "I")
    private int field944;

    @OriginalMember(owner = "client!bn", name = "y", descriptor = "I")
    private int field959;

    @OriginalMember(owner = "client!bn", name = "o", descriptor = "Ljava/lang/String;")
    public static String field949 = "white:";

    @OriginalMember(owner = "client!bn", name = "F", descriptor = "I")
    public static int field966 = 0;

    @OriginalMember(owner = "client!bn", name = "K", descriptor = "I")
    public static int field971 = -1;

    @OriginalMember(owner = "client!bn", name = "p", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!bn", name = "q", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!bn", name = "r", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!bn", name = "v", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!bn", name = "z", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!bn", name = "A", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!bn", name = "B", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!bn", name = "G", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!bn", name = "H", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!bn", name = "J", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!bn", name = "M", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!bn", name = "N", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!bn", name = "P", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!bn", name = "S", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!bn", name = "U", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!bn", name = "W", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!bn", name = "t", descriptor = "Llg;")
    private class141 field954;

    @OriginalMember(owner = "client!bn", name = "finalize", descriptor = "()V", line = 7)
    protected final void finalize() {
        if (this.field954 != null) {
            this.field954.method987();
        }
        field983++;
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)V", line = 18)
    public static final void method468(int arg0) {
        field961++;
        if (arg0 != -1) {
            field971 = 114;
        }
        class222.field3353 = null;
        class99.field1336 = null;
        class18.field208 = null;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "()I", line = 33)
    public final int method417() {
        field981++;
        return this.field947;
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)Lio;", line = 44)
    public final class294 method469(int arg0) {
        if (arg0 <= 79) {
            return (class294) null;
        } else {
            field970++;
            return this.method479(false, (byte) 0);
        }
    }

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "(I)V", line = 61)
    public static final void method470(int arg0) {
        class197.field3006.method378(arg0 + 1);
        class188.field2830.method378(0);
        field973++;
        if (arg0 != -1) {
            method477((byte) 89, -14);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(II)V", line = 74)
    private final void method471(int arg0, int arg1) {
        field976++;
        int var3 = arg0;
        boolean var4 = false;
        if (arg1 != -1535621759) {
            this.field969 = 93;
        }
        if (arg0 == -1) {
            class234 var5 = class123.method795(0, this.field958);
            class234 var6 = var5;
            if (var5.field3588 != null) {
                var5 = var5.method1624(true);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field3566 != null) {
                if (this.field957 != null && var5.method1612(false, this.field957.field1540)) {
                    return;
                }
                var3 = var5.method1620((byte) 115);
                if (this.field975 != var5.field3594) {
                    var4 = var5.field3603;
                }
            } else if (var5.field3570 == -1) {
                if (var6 != null && var6.field3566 != null) {
                    if (this.field957 != null && var6.method1612(false, this.field957.field1540)) {
                        return;
                    }
                    var3 = var6.method1620((byte) 113);
                    if (this.field975 != var6.field3594) {
                        var4 = var6.field3603;
                    }
                } else if (var6 != null && var6.field3570 != -1 && this.field975 != var6.field3594) {
                    var3 = var6.field3570;
                    var4 = var6.field3603;
                }
            } else if (this.field975 != var5.field3594) {
                var3 = var5.field3570;
                var4 = var5.field3603;
            }
        }
        if (var3 == -1) {
            this.field957 = null;
            return;
        }
        if (this.field957 == null || this.field957.field1540 != var3) {
            this.field957 = class289.method2067((byte) -76, var3);
        } else if (this.field957.field1542 == 0) {
            return;
        }
        if (var4) {
            this.field944 = (int) ((double) this.field957.field1533.length * Math.random());
            this.field982 = (int) ((double) this.field957.field1524[this.field944] * Math.random()) + 1;
        } else {
            this.field944 = 0;
            this.field982 = 1;
        }
        this.field955 = this.field944 + 1;
        if (this.field955 < 0 || this.field955 >= this.field957.field1533.length) {
            this.field955 = -1;
        }
        this.field959 = class102.field1381 - this.field982;
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(IIIIIIIZLio;)V", line = 711)
    public class75(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class294 arg8) {
        this.field984 = arg4;
        this.field977 = arg1;
        this.field980 = arg5;
        this.field964 = arg2;
        this.field958 = arg0;
        this.field969 = arg3;
        if (arg8 != null) {
            this.field963 = true;
            if ((arg8 instanceof class75)) {
                class75 var11 = (class75) arg8;
                if (class272.field4317) {
                    var11.method473((byte) -25);
                }
                this.field955 = var11.field955;
                this.field957 = var11.field957;
                this.field982 = var11.field982;
                this.field944 = var11.field944;
                this.field959 = var11.field959;
            } else if (class272.field4317) {
                class234 var10 = class123.method795(0, this.field958);
                if (var10.field3588 != null) {
                    var10 = var10.method1624(true);
                }
                if (var10 != null) {
                    class116.method754(var10, this.field984, 0, 0, this.field980, this.field969, this.field964, -115, this.field977);
                }
            }
        }
        if (this.field963) {
            this.method471(arg6, -1535621759);
        }
        if (class272.field4317 && arg8 != null) {
            this.method479(true, (byte) 0);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lio;Z)V", line = 204)
    private final void method472(class294 arg0, boolean arg1) {
        if (class272.field4317) {
            class124 var3 = (class124) arg0;
            if ((this.field954 == null || this.field954.field2175) && (var3.field1711 != null || var3.field1752 != null)) {
                class234 var4 = class123.method795(0, this.field958);
                if (var4.field3588 != null) {
                    var4 = var4.method1624(true);
                }
                if (var4 != null) {
                    this.field954 = new class141(class102.field1381, var4.field3577, var4.field3590);
                }
            }
            if (this.field954 != null) {
                this.field954.method983(var3.field1711, var3.field1752, false, var3.field1741, var3.field1723, var3.field1708);
            }
        } else {
            class133 var5 = (class133) arg0;
            if ((this.field954 == null || this.field954.field2175) && (var5.field1934 != null || var5.field1931 != null)) {
                class234 var6 = class123.method795(0, this.field958);
                if (var6.field3588 != null) {
                    var6 = var6.method1624(!arg1);
                }
                if (var6 != null) {
                    this.field954 = new class141(class102.field1381, var6.field3577, var6.field3590);
                }
            }
            if (this.field954 != null) {
                this.field954.method983(var5.field1934, var5.field1931, false, var5.field1924, var5.field1923, var5.field1928);
            }
        }
        if (!arg1) {
            this.field978 = true;
            field979++;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V", line = 258)
    public final void method473(byte arg0) {
        field962++;
        if (arg0 != -25) {
            this.field955 = -54;
        }
        if (this.field953 != null) {
            class358.method2463(this.field953, this.field948, this.field972, this.field945);
            this.field953 = null;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IBI)V", line = 278)
    public static final void method474(int arg0, byte arg1, int arg2) {
        field974++;
        class323.field5113[arg2] = arg0;
        if (arg1 > 0) {
            field949 = (String) null;
        }
        class161 var3 = (class161) class181.field2727.method770((long) arg2, -58);
        if (var3 == null) {
            class161 var4 = new class161(4611686018427387905L);
            class181.field2727.method764(24369, var4, (long) arg2);
        } else if (var3.field2485 != 4611686018427387905L) {
            var3.field2485 = class9.method57(-14133) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIIIIIJILlg;)V", line = 315)
    public final void method410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class141 arg10) {
        field950++;
        class294 var13 = this.method469(109);
        if (var13 != null) {
            this.method472(var13, false);
            var13.method410(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field954);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILo;)V", line = 333)
    public static final void method475(int arg0, class231 arg1) {
        field952++;
        if (arg0 != 2045418567) {
            method477((byte) -17, 45);
        }
        for (class337 var2 = (class337) class257.field4069.method1812(arg0 ^ 0x79EA9C46); var2 != null; var2 = (class337) class257.field4069.method1809(128)) {
            if (var2.field5393 == arg1) {
                if (var2.field5386 != null) {
                    class20.field239.method2339(var2.field5386);
                    var2.field5386 = null;
                }
                var2.method1290(94);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z)V", line = 366)
    public static void method476(boolean arg0) {
        field949 = null;
        if (!arg0) {
            method476(true);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(BI)I", line = 378)
    public static final int method477(byte arg0, int arg1) {
        field968++;
        int var2 = 46 / ((arg0 + 17) / 48);
        int var3 = arg1 >>> 1;
        int var4 = var3 | var3 >>> 1;
        int var5 = var4 | var4 >>> 2;
        int var6 = var5 | var5 >>> 4;
        int var7 = var6 | var6 >>> 8;
        int var8 = var7 | var7 >>> 16;
        return arg1 & ~var8;
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(III)V", line = 396)
    private final void method478(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            this.field948 = -19;
        }
        field951++;
        label95: while (true) {
            if (this.field957 == null) {
                if (this.field963) {
                    return;
                }
                this.method471(-1, -1535621759);
                if (this.field957 == null) {
                    return;
                }
            }
            int var4 = class102.field1381 - this.field959;
            if (var4 > 100 && this.field957.field1552 > 0) {
                int var5 = this.field957.field1533.length - this.field957.field1552;
                while (var5 > this.field944 && var4 > this.field957.field1524[this.field944]) {
                    var4 -= this.field957.field1524[this.field944];
                    this.field944++;
                }
                if (this.field944 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field957.field1533.length; var7++) {
                        var6 += this.field957.field1524[var7];
                    }
                    var4 %= var6;
                }
                this.field955 = this.field944 + 1;
                if (this.field957.field1533.length <= this.field955) {
                    this.field955 -= this.field957.field1552;
                    if (this.field955 < 0 || this.field955 >= this.field957.field1533.length) {
                        this.field955 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var4 <= this.field957.field1524[this.field944]) {
                            this.field982 = var4;
                            this.field959 = class102.field1381 - var4;
                            return;
                        }
                        class313.method2210(this.field957, this.field944, 50, arg2, false, arg0);
                        var4 -= this.field957.field1524[this.field944];
                        this.field944++;
                        if (this.field957.field1533.length <= this.field944) {
                            this.field944 -= this.field957.field1552;
                            if (this.field944 < 0 || this.field944 >= this.field957.field1533.length) {
                                this.field957 = null;
                                continue label95;
                            }
                        }
                        this.field955 = this.field944 + 1;
                    } while (this.field955 < this.field957.field1533.length);
                    this.field955 -= this.field957.field1552;
                } while (this.field955 >= 0 && this.field955 < this.field957.field1533.length);
                this.field955 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZB)Lio;", line = 518)
    private final class294 method479(boolean arg0, byte arg1) {
        field960++;
        boolean var3 = class72.field902 != class214.field3247;
        class234 var4 = class123.method795(0, this.field958);
        if (var4.field3588 != null) {
            var4 = var4.method1624(true);
        }
        if (var4 == null) {
            if (class272.field4317 && !var3) {
                this.method473((byte) -25);
            }
            this.field975 = -1;
            this.field946 = this.field944;
            return null;
        }
        if (!this.field963 && this.field975 != var4.field3594) {
            this.method471(-1, arg1 ^ -1535621759);
        }
        int var5 = this.field964 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var6 = var4.field3577;
            var7 = var4.field3590;
        } else {
            var6 = var4.field3590;
            var7 = var4.field3577;
        }
        int var8 = (var7 >> 1) + this.field984;
        int var9 = this.field980 + (var6 + 1 >> 1);
        int var10 = (var6 >> 1) + this.field980;
        int var11 = (var7 + 1 >> 1) + this.field984;
        this.method478(var8 * 128, -1, var10 * 128);
        boolean var12 = !var3 && var4.field3601 && (this.field975 != var4.field3594 || (this.field946 != this.field944 || this.field957 != null && (this.field957.field1543 || class325.field5215) && this.field955 != this.field944) && class16.field164 >= 2);
        if (arg0 && !var12) {
            this.field946 = this.field944;
            this.field975 = var4.field3594;
            return null;
        }
        int var13 = (this.field984 << 7) + (var7 << 6);
        int[][] var14 = (int[][]) null;
        if (var3) {
            var14 = class214.field3247[0];
        } else if (this.field969 < 3) {
            var14 = class72.field902[this.field969 + 1];
        }
        if (arg1 != 0) {
            return (class294) null;
        }
        int[][] var15 = class72.field902[this.field969];
        int var16 = (this.field980 << 7) + (var6 << 6);
        int var17 = var15[var8][var9] + var15[var8][var10] + var15[var11][var10] + var15[var11][var9] >> 2;
        if (class272.field4317 && var12) {
            class358.method2463(this.field953, this.field948, this.field972, this.field945);
        }
        boolean var18 = this.field953 == null;
        class19 var19;
        if (this.field957 == null) {
            var19 = var4.method1622((byte) -108, false, this.field977, this.field964, var18 ? class347.field5502 : this.field953, var12, var16, var15, var17, var13, var14);
        } else {
            var19 = var4.method1623(var16, this.field957, var13, var15, this.field982, var17, var18 ? class347.field5502 : this.field953, var14, var12, this.field955, (byte) 103, this.field977, this.field964, this.field944);
        }
        if (var19 == null) {
            this.field946 = this.field944;
            this.field975 = var4.field3594;
            return null;
        }
        if (class272.field4317 && var12) {
            int var20 = 0;
            if (var18) {
                class347.field5502 = var19.field227;
            }
            if (this.field969 != 0) {
                int[][] var21 = class72.field902[0];
                var20 = var17 - (var21[var8][var10] + var21[var11][var10] + var21[var8][var9] + var21[var11][var9] >> 2);
            }
            class270 var22 = var19.field227;
            if (this.field965 && class358.method2469(var22, var13, var20, var16)) {
                this.field965 = false;
            }
            if (!this.field965) {
                class358.method2465(var22, var13, var20, var16);
                if (var18) {
                    class347.field5502 = null;
                }
                this.field945 = var16;
                this.field972 = var20;
                this.field948 = var13;
                this.field953 = var22;
            }
        }
        this.field946 = this.field944;
        this.field975 = var4.field3594;
        return var19.field230;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIII)V", line = 664)
    public final void method408(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field956++;
        class294 var6 = null;
        if (class272.field4317) {
            var6 = this.method479(true, (byte) 0);
        } else {
            this.method478(arg3, -1, arg4);
        }
        if (!this.field978) {
            if (var6 == null) {
                var6 = this.method469(122);
            }
            if (var6 == null) {
                return;
            }
            this.method472(var6, false);
        }
        if (this.field954 != null) {
            this.field954.method984(arg0, arg1, arg3, arg2, arg4);
        }
    }
}
