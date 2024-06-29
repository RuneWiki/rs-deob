import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class62 {

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    private int field926 = -32768;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    private int field934 = -1;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    private int field930 = -1;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "Z")
    private boolean field940 = false;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "Z")
    private boolean field941 = false;

    @OriginalMember(owner = "client!wc", name = "C", descriptor = "I")
    private int field950 = -1;

    @OriginalMember(owner = "client!wc", name = "F", descriptor = "I")
    public int field953;

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "I")
    public int field952;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    private int field938;

    @OriginalMember(owner = "client!wc", name = "G", descriptor = "B")
    private byte field954;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "I")
    public int field947;

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "B")
    private byte field951;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    private int field923;

    @OriginalMember(owner = "client!wc", name = "H", descriptor = "Z")
    private boolean field955;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "Ldb;")
    public static class298 field944 = new class298(117, 20);

    @OriginalMember(owner = "client!wc", name = "J", descriptor = "Ljw;")
    public static class520 field957 = new class520(32);

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    private int field925;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
    private int field939;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
    private int field942;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!wc", name = "I", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!wc", name = "M", descriptor = "I")
    private int field959;

    @OriginalMember(owner = "client!wc", name = "O", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "Lw;")
    private class276 field935;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "Lba;")
    private class358 field937;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "Lhv;")
    public class485 field943;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "Lpga;")
    public static class500 field929;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "Ldv;")
    private class616 field931;

    @OriginalMember(owner = "client!wc", name = "N", descriptor = "Lcp;")
    public static class679 field960;

    @OriginalMember(owner = "client!wc", name = "L", descriptor = "Ljava/lang/String;")
    public static String field958;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "[Z")
    private boolean[] field933;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lq;ILoa;ZZLba;III)V", line = 8)
    public final void method495(class397 arg0, int arg1, class651 arg2, boolean arg3, boolean arg4, class358 arg5, int arg6, int arg7, int arg8) {
        field927++;
        class93[] var10 = arg5.method1920();
        class171[] var11 = arg5.method1917();
        if ((this.field943 == null || this.field943.field6558) && (var10 != null || var11 != null)) {
            class58 var12 = class470.field6288.method1258(this.field947, (byte) -91);
            if (var12.field888 != null) {
                var12 = var12.method486((byte) -113, class80.field1261);
            }
            if (var12 != null) {
                this.field943 = class485.method2713(class642.field8626, true);
            }
        }
        if (this.field943 != null) {
            arg5.method1949(arg0);
            if (arg4) {
                this.field943.method2712(arg2, (long) class642.field8626, var10, var11, false);
            } else {
                this.field943.method2718((long) class642.field8626);
            }
            this.field943.method2706(this.field951, arg8, arg6, arg1, arg7);
        }
        if (!arg3) {
            this.method499(null, 116, 10, true, false, 115, 77);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V", line = 46)
    public static void method496(int arg0) {
        field944 = null;
        field958 = null;
        field929 = null;
        if (arg0 == 11) {
            field957 = null;
            field960 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZLoa;)V", line = 63)
    public final void method497(boolean arg0, class651 arg1) {
        field932++;
        if (this.field935 != null) {
            class232.method1447(this.field935, this.field954, this.field938, this.field923, this.field933);
            this.field933 = null;
            this.field935 = null;
        }
        if (!arg0) {
            this.field935 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Loa;Lbd;IIIIIIZI)V", line = 578)
    public class62(class651 arg0, class58 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field953 = arg2;
        this.field952 = arg3;
        this.field938 = arg6;
        this.field954 = (byte) arg5;
        this.field947 = arg1.field824;
        this.field941 = arg8;
        this.field951 = (byte) arg4;
        this.field923 = arg7;
        this.field955 = arg0.method404() && arg1.field877 && !this.field941;
        if (arg9 != -1) {
            this.field940 = true;
        }
        this.method500(arg9, 4);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)V", line = 90)
    public static final void method498(int arg0, int arg1) {
        class126.field2096 = arg0;
        if (arg1 != -1) {
            return;
        }
        class173.field2675 = 2;
        field922++;
        long var2 = 0L;
        if (class592.field7831 == null) {
            class218.method1384((byte) -128, 35);
        } else {
            class335 var4 = new class335(class346.method2076(124, class174.method1176(class592.field7831, -1)));
            long var5 = var4.method2016((byte) -60);
            class605.field8023 = var4.method2016((byte) -60);
            class512.method2848(class170.method1158((byte) -20, var5), (byte) -115, true, "");
        }
    }

    @OriginalMember(owner = "client!wc", name = "finalize", descriptor = "()V", line = 140)
    protected final void finalize() {
        if (this.field943 != null) {
            this.field943.method2714();
        }
        field924++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Loa;IIZZII)Lba;", line = 151)
    public final class358 method499(class651 arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        field949++;
        class58 var8 = class470.field6288.method1258(this.field947, (byte) -100);
        if (var8.field888 != null) {
            var8 = var8.method486((byte) -113, class80.field1261);
        }
        if (var8 == null) {
            this.method497(true, arg0);
            this.field930 = -1;
            this.field934 = -1;
            this.field950 = -1;
            return null;
        }
        if (!this.field940 && this.field934 != var8.field824) {
            this.field937 = null;
            this.method500(-1, 4);
        }
        this.method501(arg5, arg1, true);
        if (arg6 != 25878) {
            return null;
        }
        if (arg4) {
            boolean var9 = arg4 & this.field955 & class344.field4718.method2329(arg6 ^ 0x657A, class571.field7587) != 0;
            arg4 = var9 & (this.field930 != var8.field824 || this.field931 != null && class344.field4718.method2329(arg6 - 25770, class571.field7587) >= 2 && (this.field959 != this.field950 || (this.field931.field8145 || class672.field9512) && this.field959 != this.field942));
        }
        if (arg3 && !arg4) {
            this.field934 = var8.field824;
            return null;
        }
        if (arg4) {
            class232.method1447(this.field935, this.field954, this.field938, this.field923, this.field933);
            this.field930 = -1;
            this.field950 = -1;
        }
        class139 var10 = class218.field3099[this.field954];
        class139 var11;
        if (this.field941) {
            var11 = class684.field9625[0];
        } else {
            var11 = this.field954 < 3 ? class218.field3099[this.field954 + 1] : null;
        }
        class358 var12 = null;
        if (this.field931 != null) {
            if (arg4) {
                arg2 |= 0x40000;
            }
            var12 = var8.method469(var11, 102, var10.method200(this.field938, this.field923), this.field925, var10, this.field938, this.field953 == 11 ? this.field952 + 4 : this.field952, this.field931, this.field942, arg0, this.field923, this.field959, arg2, this.field953 == 11 ? 10 : this.field953);
            if (var12 == null) {
                this.field926 = 0;
                this.field935 = null;
                this.field933 = null;
            } else {
                if (arg4) {
                    if (this.field933 == null) {
                        this.field933 = new boolean[4];
                    }
                    this.field935 = var12.method1930(this.field935);
                    class486.method2723(this.field935, this.field954, arg5, arg1, this.field933);
                    this.field950 = this.field959;
                    this.field930 = var8.field824;
                }
                this.field926 = var12.method1939();
            }
            this.field937 = null;
        } else if (this.field937 != null && arg2 == (arg2 & this.field937.method1945()) && this.field934 == var8.field824) {
            var12 = this.field937;
        } else {
            if (this.field937 != null) {
                arg2 |= this.field937.method1945();
            }
            class392 var13 = var8.method472(var11, this.field938, this.field923, arg2, var10.method200(this.field938, this.field923), arg0, (byte) -111, arg4, this.field953 == 11 ? 10 : this.field953, var10, this.field953 == 11 ? this.field952 + 4 : this.field952);
            if (var13 == null) {
                this.field937 = null;
                this.field926 = 0;
                this.field933 = null;
                this.field935 = null;
            } else {
                var12 = var13.field5169;
                this.field937 = var13.field5169;
                if (arg4) {
                    this.field933 = null;
                    this.field935 = var13.field5170;
                    class486.method2723(this.field935, this.field954, arg5, arg1, null);
                    this.field950 = -1;
                    this.field930 = var8.field824;
                }
                this.field926 = var12.method1939();
            }
        }
        this.field923 = arg1;
        this.field934 = var8.field824;
        this.field938 = arg5;
        return var12;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)V", line = 290)
    private final void method500(int arg0, int arg1) {
        field948++;
        int var3 = arg0;
        if (arg1 != 4) {
            return;
        }
        boolean var4 = false;
        if (arg0 == -1) {
            class58 var5 = class470.field6288.method1258(this.field947, (byte) -23);
            class58 var6 = var5;
            if (var5.field888 != null) {
                var5 = var5.method486((byte) -113, class80.field1261);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field874 != null) {
                if (this.field931 != null && var5.method474(this.field931.field8144, 0)) {
                    return;
                }
                var3 = var5.method473(116);
                if (this.field934 != var5.field824) {
                    var4 = var5.field882;
                }
            } else if (var5.field896 == -1) {
                if (var6 != null && var6.field874 != null) {
                    if (this.field931 != null && var6.method474(this.field931.field8144, arg1 ^ 0x4)) {
                        return;
                    }
                    var3 = var6.method473(arg1 - 107);
                    if (this.field934 != var6.field824) {
                        var4 = var6.field882;
                    }
                } else if (var6 != null && var6.field896 != -1 && this.field934 != var6.field824) {
                    var4 = var6.field882;
                    var3 = var6.field896;
                }
            } else if (this.field934 != var5.field824) {
                var4 = var5.field882;
                var3 = var5.field896;
            }
        }
        if (var3 == -1) {
            this.field931 = null;
            return;
        }
        this.field937 = null;
        if (this.field931 == null || this.field931.field8144 != var3) {
            this.field931 = class636.field8570.method231(var3, -11764);
        } else if (this.field931.field8162 == 0) {
            return;
        }
        if (this.field931.field8160 == null) {
            this.field931 = null;
            return;
        }
        if (var4) {
            this.field959 = (int) ((double) this.field931.field8160.length * Math.random());
            this.field925 = (int) (Math.random() * (double) this.field931.field8163[this.field959]) + 1;
        } else {
            this.field959 = 0;
            this.field925 = 1;
        }
        this.field942 = this.field959 + 1;
        if (this.field942 < 0 || this.field942 >= this.field931.field8160.length) {
            this.field942 = -1;
        }
        this.field939 = class642.field8626 - this.field925;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIZ)V", line = 415)
    private final void method501(int arg0, int arg1, boolean arg2) {
        field946++;
        if (!arg2) {
            this.method499(null, -24, -95, false, true, 8, 20);
        }
        label90: while (true) {
            if (this.field931 == null) {
                if (this.field940) {
                    return;
                }
                this.method500(-1, 4);
                if (this.field931 == null) {
                    return;
                }
            }
            int var4 = class642.field8626 - this.field939;
            if (var4 > 100 && this.field931.field8146 > 0) {
                int var5 = this.field931.field8160.length - this.field931.field8146;
                while (this.field959 < var5 && var4 > this.field931.field8163[this.field959]) {
                    var4 -= this.field931.field8163[this.field959];
                    this.field959++;
                }
                if (this.field959 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field931.field8160.length; var7++) {
                        var6 += this.field931.field8163[var7];
                    }
                    var4 %= var6;
                }
                this.field942 = this.field959 + 1;
                if (this.field931.field8160.length <= this.field942) {
                    this.field942 -= this.field931.field8146;
                    if (this.field942 < 0 || this.field931.field8160.length <= this.field942) {
                        this.field942 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var4 <= this.field931.field8163[this.field959]) {
                            this.field925 = var4;
                            this.field939 = class642.field8626 - var4;
                            return;
                        }
                        class373.method2199(this.field951, arg0, (byte) 88, arg1, this.field959, this.field931, false);
                        var4 -= this.field931.field8163[this.field959];
                        this.field959++;
                        if (this.field959 >= this.field931.field8160.length) {
                            this.field959 -= this.field931.field8146;
                            if (this.field959 < 0 || this.field959 >= this.field931.field8160.length) {
                                this.field931 = null;
                                continue label90;
                            }
                        }
                        this.field942 = this.field959 + 1;
                    } while (this.field931.field8160.length > this.field942);
                    this.field942 -= this.field931.field8146;
                } while (this.field942 >= 0 && this.field942 < this.field931.field8160.length);
                this.field942 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)Z", line = 515)
    public final boolean method502(byte arg0) {
        if (arg0 == 17) {
            field945++;
            return this.field955;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)I", line = 531)
    public final int method503(boolean arg0) {
        field956++;
        if (!arg0) {
            this.field930 = -127;
        }
        return this.field926;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IB)V", line = 550)
    public final void method504(int arg0, byte arg1) {
        field928++;
        this.field940 = true;
        if (arg1 < -106) {
            this.method500(arg0, 4);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILoa;)V", line = 563)
    public final void method505(int arg0, class651 arg1) {
        this.method499(arg1, this.field923, 262144, true, true, this.field938, 25878);
        if (arg0 != -30964) {
            this.field954 = -25;
        }
        field936++;
    }
}
