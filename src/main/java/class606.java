import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class606 {

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "Z")
    private boolean field8925 = false;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "Z")
    private boolean field8926 = false;

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "I")
    private int field8941 = -32768;

    @OriginalMember(owner = "client!ba", name = "A", descriptor = "I")
    private int field8944 = -1;

    @OriginalMember(owner = "client!ba", name = "C", descriptor = "I")
    private int field8946 = -1;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public int field8919;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
    public int field8936;

    @OriginalMember(owner = "client!ba", name = "E", descriptor = "B")
    private byte field8948;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "B")
    private byte field8929;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
    private int field8934;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    private int field8932;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public int field8921;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "Z")
    private boolean field8924;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "Lqc;")
    public static class325 field8927 = new class325(4);

    @OriginalMember(owner = "client!ba", name = "H", descriptor = "Z")
    public static boolean field8951 = false;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field8918;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    private int field8920;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field8922;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field8923;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public static int field8928;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
    public static int field8930;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "I")
    private int field8935;

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "I")
    public static int field8938;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "I")
    public static int field8942;

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "I")
    private int field8943;

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "I")
    public static int field8945;

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "I")
    private int field8947;

    @OriginalMember(owner = "client!ba", name = "F", descriptor = "I")
    public static int field8949;

    @OriginalMember(owner = "client!ba", name = "G", descriptor = "I")
    public static int field8950;

    @OriginalMember(owner = "client!ba", name = "I", descriptor = "I")
    public static int field8952;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "Laba;")
    private class224 field8933;

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "Lr;")
    private class520 field8939;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "Lk;")
    private class88 field8937;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "Lqv;")
    public class96 field8931;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "[Z")
    private boolean[] field8940;

    static {
        new class487(null, "der Spieler ist momentan nicht verfügbar.", null, null);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lr;Lqa;IBIIIZ)V", line = 6)
    public final void method3523(class520 arg0, class167 arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (arg3 != 124) {
            return;
        }
        field8938++;
        class26[] var9 = arg0.method1964();
        class200[] var10 = arg0.method1970();
        if ((this.field8931 == null || this.field8931.field1183) && (var9 != null || var10 != null)) {
            class158 var11 = class312.field4690.method2004(false, this.field8936);
            if (var11.field2035 != null) {
                var11 = var11.method923(arg3 ^ 0xFFFFFFF5, class406.field5823);
            }
            if (var11 != null) {
                this.field8931 = class96.method552(class576.field8505);
            }
        }
        if (this.field8931 == null) {
            return;
        }
        if (arg7) {
            this.field8931.method547(arg1, (long) class576.field8505, var9, var10, false);
        } else {
            this.field8931.method553((long) class576.field8505);
        }
        this.field8931.method557(this.field8929, arg4, arg6, arg5, arg2);
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lqa;Lih;IIIIIIZI)V", line = 415)
    public class606(class167 arg0, class158 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field8919 = arg2;
        this.field8925 = arg8;
        this.field8936 = arg1.field2010;
        this.field8948 = (byte) arg5;
        this.field8929 = (byte) arg4;
        this.field8934 = arg7;
        this.field8932 = arg6;
        this.field8921 = arg3;
        this.field8924 = arg0.method1007() && arg1.field2078 && !this.field8925;
        if (arg9 != -1) {
            this.field8926 = true;
        }
        this.method3532(110, arg9);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)I", line = 60)
    public final int method3524(int arg0) {
        if (arg0 > -12) {
            this.field8939 = null;
        }
        field8949++;
        return this.field8941;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIII)Z", line = 72)
    public static final boolean method3525(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field8923++;
        if (arg2 >= -91) {
            field8951 = false;
        }
        for (int var6 = arg1; var6 <= arg3; var6++) {
            for (int var7 = arg4; var7 <= arg5; var7++) {
                if (class226.field3335[var6][var7] == arg0 && class122.field1576[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lqa;I)V", line = 103)
    public final void method3526(class167 arg0, int arg1) {
        this.method3529(arg1, (byte) -93, arg0, this.field8932, true, true, this.field8934);
        field8942++;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)Z", line = 122)
    public final boolean method3527(int arg0) {
        field8918++;
        if (arg0 != 15765) {
            method3531((byte) 75);
        }
        return this.field8924;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)V", line = 145)
    public final void method3528(int arg0, int arg1) {
        this.field8926 = true;
        field8922++;
        this.method3532(arg1 + 64, arg0);
        if (arg1 != 1) {
            this.field8941 = 116;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IBLqa;IZZI)Lr;", line = 159)
    public final class520 method3529(int arg0, byte arg1, class167 arg2, int arg3, boolean arg4, boolean arg5, int arg6) {
        field8950++;
        class158 var8 = class312.field4690.method2004(false, this.field8936);
        if (var8.field2035 != null) {
            var8 = var8.method923(-127, class406.field5823);
        }
        if (var8 == null) {
            this.method3533(arg2, -1);
            this.field8944 = -1;
            this.field8946 = this.field8943;
            return null;
        }
        if (!this.field8926 && this.field8944 != var8.field2010) {
            this.field8939 = null;
            this.method3532(arg1 ^ 0xFFFFFFE6, -1);
        }
        this.method3530(-4, arg6, arg3);
        boolean var9 = arg5 & this.field8924 & class94.field1158.method131(false, class239.field3499) != 0;
        boolean var10 = var9 & (this.field8944 != var8.field2010 || (this.field8946 != this.field8943 || this.field8933 != null && (this.field8933.field3292 || class516.field7637) && this.field8943 != this.field8920) && class94.field1158.method131(false, class239.field3499) >= 2);
        if (arg4 && !var10) {
            this.field8946 = this.field8943;
            this.field8944 = var8.field2010;
            return null;
        }
        if (var10) {
            class639.method3698(this.field8937, this.field8948, this.field8932, this.field8934, this.field8940);
        }
        class543 var11 = class235.field3455[this.field8948];
        class543 var12;
        if (this.field8925) {
            var12 = class562.field8337[0];
        } else {
            var12 = this.field8948 >= 3 ? null : class235.field3455[this.field8948 + 1];
        }
        class520 var13 = null;
        if (arg1 != -93) {
            this.field8934 = -30;
        }
        if (this.field8933 != null) {
            if (var10) {
                arg0 |= 0x40000;
            }
            var13 = var8.method926(this.field8943, this.field8919 == 11 ? this.field8921 + 4 : this.field8921, 115, this.field8947, arg2, this.field8932, this.field8920, var11, this.field8933, arg0, var12, this.field8934, this.field8919 == 11 ? 10 : this.field8919, var11.method1323(this.field8932, this.field8934));
            if (var13 == null) {
                this.field8941 = 0;
                this.field8940 = null;
                this.field8937 = null;
            } else {
                if (var10) {
                    if (this.field8940 == null) {
                        this.field8940 = new boolean[4];
                    }
                    this.field8937 = var13.method1960(this.field8937);
                    class253.method1607(this.field8937, this.field8948, arg3, arg6, this.field8940);
                }
                this.field8941 = var13.method1954();
            }
            this.field8939 = null;
        } else if (this.field8939 != null && (arg0 & this.field8939.method1950()) == arg0 && this.field8944 == var8.field2010) {
            var13 = this.field8939;
        } else {
            if (this.field8939 != null) {
                arg0 |= this.field8939.method1950();
            }
            class342 var14 = var8.method918(var11.method1323(this.field8932, this.field8934), this.field8932, var11, this.field8934, 0, this.field8919 == 11 ? 10 : this.field8919, var10, arg0, this.field8919 == 11 ? this.field8921 + 4 : this.field8921, var12, arg2);
            if (var14 == null) {
                this.field8937 = null;
                this.field8941 = 0;
                this.field8939 = null;
                this.field8940 = null;
            } else {
                var13 = var14.field4999;
                this.field8939 = var14.field4999;
                if (var10) {
                    this.field8940 = null;
                    this.field8937 = var14.field5001;
                    class253.method1607(this.field8937, this.field8948, arg3, arg6, null);
                }
                this.field8941 = var13.method1954();
            }
        }
        this.field8944 = var8.field2010;
        this.field8932 = arg3;
        this.field8934 = arg6;
        this.field8946 = this.field8943;
        return var13;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)V", line = 286)
    private final void method3530(int arg0, int arg1, int arg2) {
        field8928++;
        if (arg0 != -4) {
            this.method3524(-68);
        }
        label90: while (true) {
            if (this.field8933 == null) {
                if (this.field8926) {
                    return;
                }
                this.method3532(47, -1);
                if (this.field8933 == null) {
                    return;
                }
            }
            int var4 = class576.field8505 - this.field8935;
            if (var4 > 100 && this.field8933.field3290 > 0) {
                int var5 = this.field8933.field3296.length - this.field8933.field3290;
                while (var5 > this.field8943 && this.field8933.field3307[this.field8943] < var4) {
                    var4 -= this.field8933.field3307[this.field8943];
                    this.field8943++;
                }
                if (var5 <= this.field8943) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field8933.field3296.length; var7++) {
                        var6 += this.field8933.field3307[var7];
                    }
                    var4 %= var6;
                }
                this.field8920 = this.field8943 + 1;
                if (this.field8920 >= this.field8933.field3296.length) {
                    this.field8920 -= this.field8933.field3290;
                    if (this.field8920 < 0 || this.field8933.field3296.length <= this.field8920) {
                        this.field8920 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field8933.field3307[this.field8943] >= var4) {
                            this.field8935 = class576.field8505 - var4;
                            this.field8947 = var4;
                            return;
                        }
                        class295.method1830(this.field8943, arg1, (byte) 96, this.field8929, this.field8933, false, arg2);
                        var4 -= this.field8933.field3307[this.field8943];
                        this.field8943++;
                        if (this.field8943 >= this.field8933.field3296.length) {
                            this.field8943 -= this.field8933.field3290;
                            if (this.field8943 < 0 || this.field8933.field3296.length <= this.field8943) {
                                this.field8933 = null;
                                continue label90;
                            }
                        }
                        this.field8920 = this.field8943 + 1;
                    } while (this.field8933.field3296.length > this.field8920);
                    this.field8920 -= this.field8933.field3290;
                } while (this.field8920 >= 0 && this.field8933.field3296.length > this.field8920);
                this.field8920 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V", line = 392)
    public static void method3531(byte arg0) {
        field8927 = null;
        if (arg0 <= 12) {
            field8927 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "finalize", descriptor = "()V", line = 402)
    protected final void finalize() {
        if (this.field8931 != null) {
            this.field8931.method556();
        }
        field8930++;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(II)V", line = 437)
    private final void method3532(int arg0, int arg1) {
        field8952++;
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class158 var5 = class312.field4690.method2004(false, this.field8936);
            class158 var6 = var5;
            if (var5.field2035 != null) {
                var5 = var5.method923(-128, class406.field5823);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field2086 != null) {
                if (this.field8933 != null && var5.method917(true, this.field8933.field3312)) {
                    return;
                }
                var3 = var5.method924((byte) 30);
                if (this.field8944 != var5.field2010) {
                    var4 = var5.field2027;
                }
            } else if (var5.field2076 == -1) {
                if (var6 != null && var6.field2086 != null) {
                    if (this.field8933 != null && var6.method917(true, this.field8933.field3312)) {
                        return;
                    }
                    var3 = var6.method924((byte) 30);
                    if (this.field8944 != var6.field2010) {
                        var4 = var6.field2027;
                    }
                } else if (var6 != null && var6.field2076 != -1 && this.field8944 != var6.field2010) {
                    var3 = var6.field2076;
                    var4 = var6.field2027;
                }
            } else if (this.field8944 != var5.field2010) {
                var4 = var5.field2027;
                var3 = var5.field2076;
            }
        }
        if (var3 == -1) {
            this.field8933 = null;
            return;
        }
        this.field8939 = null;
        if (this.field8933 == null || this.field8933.field3312 != var3) {
            this.field8933 = class470.field7205.method3498(false, var3);
        } else if (this.field8933.field3301 == 0) {
            return;
        }
        if (this.field8933.field3296 == null) {
            this.field8933 = null;
            return;
        }
        if (var4) {
            this.field8943 = (int) ((double) this.field8933.field3296.length * Math.random());
            this.field8947 = (int) ((double) this.field8933.field3307[this.field8943] * Math.random()) + 1;
        } else {
            this.field8947 = 1;
            this.field8943 = 0;
        }
        this.field8920 = this.field8943 + 1;
        if (this.field8920 < 0 || this.field8920 >= this.field8933.field3296.length) {
            this.field8920 = -1;
        }
        if (arg0 >= 20) {
            this.field8935 = class576.field8505 - this.field8947;
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(Lqa;I)V", line = 562)
    public final void method3533(class167 arg0, int arg1) {
        if (this.field8937 != null) {
            class639.method3698(this.field8937, this.field8948, this.field8932, this.field8934, this.field8940);
            this.field8937 = null;
            this.field8940 = null;
        }
        field8945++;
        if (arg1 != -1) {
            this.field8924 = true;
        }
    }
}
